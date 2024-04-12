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

/**
 *
 * @author mgamble
 */
public class CohereMessage {

   
    private CohereAIRole role;
    private String  message;

    
    public CohereMessage() {
    
    }
    
    public CohereMessage(CohereAIRole role, String content) {
        this.role = role;
        this.message = content;
    }
    /**
     * @return the author
     */
    public CohereAIRole getRole() {
        return role;
    }

    /**
     * @param role the author to set
     */
    public void setRole(CohereAIRole role) {
        this.role = role;
    }

    /**
     * @return the content
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param content the content to set
     */
    public void setMessage(String content) {
        this.message = content;
    }
    
}
