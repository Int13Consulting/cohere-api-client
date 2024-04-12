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

package ca.int13.cohere.api.client.classes;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mgamble
 */
public class CohereSearchResult {
    @SerializedName("search_query")
   private CohereSearchQuery searchQuery;
    private CohereConnector connector;
    @SerializedName("document_ids")
    private ArrayList<String> documentIds;
    @SerializedName("error_message")
    private String errorMessage;
    @SerializedName("continue_on_failure")
    private boolean continueOnFailure;

    // Constructors, getters, and setters

    /**
     * @return the searchQuery
     */
    public CohereSearchQuery getSearchQuery() {
        return searchQuery;
    }

    /**
     * @param searchQuery the searchQuery to set
     */
    public void setSearchQuery(CohereSearchQuery searchQuery) {
        this.searchQuery = searchQuery;
    }

    /**
     * @return the connector
     */
    public CohereConnector getConnector() {
        return connector;
    }

    /**
     * @param connector the connector to set
     */
    public void setConnector(CohereConnector connector) {
        this.connector = connector;
    }

    /**
     * @return the documentIds
     */
    public ArrayList<String> getDocumentIds() {
        return documentIds;
    }

    /**
     * @param documentIds the documentIds to set
     */
    public void setDocumentIds(ArrayList<String> documentIds) {
        this.documentIds = documentIds;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return the continueOnFailure
     */
    public boolean isContinueOnFailure() {
        return continueOnFailure;
    }

    /**
     * @param continueOnFailure the continueOnFailure to set
     */
    public void setContinueOnFailure(boolean continueOnFailure) {
        this.continueOnFailure = continueOnFailure;
    }
}
