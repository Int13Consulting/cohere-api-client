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

/**
 *
 * @author mgamble
 */
public class CohereResponse {
    private String text;
    @SerializedName("generation_id")
    private String generationId;
    private ArrayList<CohereCitation> citations;
    private ArrayList<CohereDocument> documents;
    @SerializedName("is_search_required")
    private boolean searchRequired;
    @SerializedName("search_queries")
    private ArrayList<CohereSearchQuery> searchQueries;
    @SerializedName("search_results")
    private ArrayList<CohereSearchResult> searchResults;
    @SerializedName("finish_reason")
    private String finishFeason;
    @SerializedName("tool_calls")
    private ArrayList<CohereToolCall> toolCalls;
    @SerializedName("chat_history")
    private ArrayList<CohereMessage> chatHistory;
    private CohereMetadata meta;    

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the generationId
     */
    public String getGenerationId() {
        return generationId;
    }

    /**
     * @param generationId the generationId to set
     */
    public void setGenerationId(String generationId) {
        this.generationId = generationId;
    }

    /**
     * @return the citations
     */
    public ArrayList<CohereCitation> getCitations() {
        return citations;
    }

    /**
     * @param citations the citations to set
     */
    public void setCitations(ArrayList<CohereCitation> citations) {
        this.citations = citations;
    }

    /**
     * @return the documents
     */
    public ArrayList<CohereDocument> getDocuments() {
        return documents;
    }

    /**
     * @param documents the documents to set
     */
    public void setDocuments(ArrayList<CohereDocument> documents) {
        this.documents = documents;
    }

    /**
     * @return the searchRequired
     */
    public boolean isSearchRequired() {
        return searchRequired;
    }

    /**
     * @param searchRequired the searchRequired to set
     */
    public void setSearchRequired(boolean searchRequired) {
        this.searchRequired = searchRequired;
    }

    /**
     * @return the searchQueries
     */
    public ArrayList<CohereSearchQuery> getSearchQueries() {
        return searchQueries;
    }

    /**
     * @param searchQueries the searchQueries to set
     */
    public void setSearchQueries(ArrayList<CohereSearchQuery> searchQueries) {
        this.searchQueries = searchQueries;
    }

    /**
     * @return the searchResults
     */
    public ArrayList<CohereSearchResult> getSearchResults() {
        return searchResults;
    }

    /**
     * @param searchResults the searchResults to set
     */
    public void setSearchResults(ArrayList<CohereSearchResult> searchResults) {
        this.searchResults = searchResults;
    }

    /**
     * @return the finishFeason
     */
    public String getFinishFeason() {
        return finishFeason;
    }

    /**
     * @param finishFeason the finishFeason to set
     */
    public void setFinishFeason(String finishFeason) {
        this.finishFeason = finishFeason;
    }

    /**
     * @return the toolCalls
     */
    public ArrayList<CohereToolCall> getToolCalls() {
        return toolCalls;
    }

    /**
     * @param toolCalls the toolCalls to set
     */
    public void setToolCalls(ArrayList<CohereToolCall> toolCalls) {
        this.toolCalls = toolCalls;
    }

    /**
     * @return the chatHistory
     */
    public ArrayList<CohereMessage> getChatHistory() {
        return chatHistory;
    }

    /**
     * @param chatHistory the chatHistory to set
     */
    public void setChatHistory(ArrayList<CohereMessage> chatHistory) {
        this.chatHistory = chatHistory;
    }

    /**
     * @return the meta
     */
    public CohereMetadata getMeta() {
        return meta;
    }

    /**
     * @param meta the meta to set
     */
    public void setMeta(CohereMetadata meta) {
        this.meta = meta;
    }
}
