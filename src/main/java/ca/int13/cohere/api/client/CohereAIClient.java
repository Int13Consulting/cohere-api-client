/*
Copyright (c) 2024 Int13 Consulting Inc.

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/
package ca.int13.cohere.api.client;

 
import ca.int13.cohere.api.client.classes.CohereRequest;
import ca.int13.cohere.api.client.classes.CohereResponse;

import com.google.gson.Gson;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Future;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.Request;
import org.asynchttpclient.RequestBuilder;
import org.asynchttpclient.Response;

/**
 *
 * @author mgamble
 */
public class CohereAIClient implements Closeable {

    private static final String JSON = "application/json; charset=UTF-8";
    private final boolean closeClient;
    private final AsyncHttpClient client;
    private static final Version version = new Version();
    private String apiUser;
    private String authToken;
    private final String url;
    private boolean closed = false;
    Gson gson = new Gson();

    public CohereAIClient(String apiEndpoint, String authToken, String apiUser) throws Exception {
        this.client = new DefaultAsyncHttpClient();

        this.url = apiEndpoint;
        this.apiUser = apiUser;
        this.authToken = authToken;
        closeClient = true;
    }

 
    //////////////////////////////////////////////////////////////////////
    // Closeable interface methods
    //////////////////////////////////////////////////////////////////////
    public boolean isClosed() {
        return closed || client.isClosed();
    }

    public void close() {
        if (closeClient && !client.isClosed()) {
            try {
                client.close();
            } catch (IOException ex) {

            }
        }
        closed = true;
    }

    public String getVersion() {
        return version.getBuildNumber();
    }

    public String getBuildName() {
        return version.getBuildName();
    }

    public CohereResponse submitChatRequest(CohereRequest chatRequest) throws Exception {
        //chat/completions
        Future<Response> f = client.executeRequest(buildRequest("POST", "/v1/chat", gson.toJson(chatRequest)));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            System.out.println(gson.toJson(chatRequest));
            throw new Exception("Could not get chat result - HTTP Status was: " + r.getStatusCode() + " - body was: " + r.getResponseBody());
        } else {
            //    System.out.println(gson.toJson(r.getResponseBody()));
            // Clean up any whitespace from the reponse to make things cleaner for clients
            //System.out.println(r.getResponseBody());
            CohereResponse response = gson.fromJson(r.getResponseBody(), CohereResponse.class);
            
            return response;
        }

    }

    private Request buildRequest(String type, String subUrl) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                .addHeader("Authorization", "bearer " + this.authToken)
                .addHeader("X-Client-Name", this.apiUser)
                .build();
        return request;
    }

    private Request buildRequest(String type, String subUrl, String requestBody) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                .addHeader("Authorization", "bearer " + this.authToken)
                .addHeader("X-Client-Name", this.apiUser)
                .setBody(requestBody)
                .build();
        return request;
    }

}
