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
public class CohereRequest {

    private String message;
    private String model;
    private boolean stream;
    private String preamble;
    @SerializedName("chat_history")
    private ArrayList<CohereMessage> chatHistory;
    @SerializedName("conversation_id")
    private String conversationId;
    @SerializedName("prompt_truncation")
    private String promptTruncation;
    private ArrayList<CohereConnector> connectors;
    @SerializedName("search_queries_only")
    private boolean searchQueriesOnly;
    private ArrayList<CohereDocument> documents;
    private Double temperature;
    @SerializedName("max_tokens")
    private int maxTokens;
    @SerializedName("max_input_tokens")
    private int maxTokensInput;
    @SerializedName("k")
    private Integer topK;
    @SerializedName("p")
    private Integer topP;
    private Integer seed;
    @SerializedName("stop_sequences")
    private ArrayList<String> stopSequences;
    @SerializedName("frequency_penalty")
    private Double frequencyPenalty;
    @SerializedName("presence_penalty")
    private Double presencePenalty;
    private ArrayList<CohereTool> tools;
    @SerializedName("tool_results")
    private ArrayList<CohereToolResult> toolResult;

    public CohereRequest() {
        this.maxTokensInput = 1024; // Set a sane default so it isn't 0;
    }
    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the stream
     */
    public boolean isStream() {
        return stream;
    }

    /**
     * @param stream the stream to set
     */
    public void setStream(boolean stream) {
        this.stream = stream;
    }

    /**
     * @return the preamble
     */
    public String getPreamble() {
        return preamble;
    }

    /**
     * @param preamble the preamble to set
     */
    public void setPreamble(String preamble) {
        this.preamble = preamble;
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

    public void addChatHistory(CohereMessage history) {
        if (this.chatHistory == null) {
            this.chatHistory = new ArrayList<>();
        }
        this.chatHistory.add(history);
    }
    /**
     * @return the conversationId
     */
    public String getConversationId() {
        return conversationId;
    }

    /**
     * @param conversationId the conversationId to set
     */
    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * @return the promptTruncation
     */
    public String getPromptTruncation() {
        return promptTruncation;
    }

    /**
     * @param promptTruncation the promptTruncation to set
     */
    public void setPromptTruncation(String promptTruncation) {
        this.promptTruncation = promptTruncation;
    }

    /**
     * @return the connectors
     */
    public ArrayList<CohereConnector> getConnectors() {
        return connectors;
    }

    /**
     * @param connectors the connectors to set
     */
    public void setConnectors(ArrayList<CohereConnector> connectors) {
        this.connectors = connectors;
    }

    /**
     * @return the searchQueriesOnly
     */
    public boolean isSearchQueriesOnly() {
        return searchQueriesOnly;
    }

    /**
     * @param searchQueriesOnly the searchQueriesOnly to set
     */
    public void setSearchQueriesOnly(boolean searchQueriesOnly) {
        this.searchQueriesOnly = searchQueriesOnly;
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
     * @return the temperature
     */
    public Double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the maxTokens
     */
    public int getMaxTokens() {
        return maxTokens;
    }

    /**
     * @param maxTokens the maxTokens to set
     */
    public void setMaxTokens(int maxTokens) {
        this.maxTokens = maxTokens;
    }

    /**
     * @return the maxTokensInput
     */
    public int getMaxTokensInput() {
        return maxTokensInput;
    }

    /**
     * @param maxTokensInput the maxTokensInput to set
     */
    public void setMaxTokensInput(int maxTokensInput) {
        this.maxTokensInput = maxTokensInput;
    }

    /**
     * @return the topK
     */
    public Integer getTopK() {
        return topK;
    }

    /**
     * @param topK the topK to set
     */
    public void setTopK(Integer topK) {
        this.topK = topK;
    }

    /**
     * @return the topP
     */
    public Integer getTopP() {
        return topP;
    }

    /**
     * @param topP the topP to set
     */
    public void setTopP(Integer topP) {
        this.topP = topP;
    }

    /**
     * @return the seed
     */
    public Integer getSeed() {
        return seed;
    }

    /**
     * @param seed the seed to set
     */
    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    /**
     * @return the stopSequences
     */
    public ArrayList<String> getStopSequences() {
        return stopSequences;
    }

    /**
     * @param stopSequences the stopSequences to set
     */
    public void setStopSequences(ArrayList<String> stopSequences) {
        this.stopSequences = stopSequences;
    }

    /**
     * @return the frequencyPenalty
     */
    public Double getFrequencyPenalty() {
        return frequencyPenalty;
    }

    /**
     * @param frequencyPenalty the frequencyPenalty to set
     */
    public void setFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    /**
     * @return the presencePenalty
     */
    public Double getPresencePenalty() {
        return presencePenalty;
    }

    /**
     * @param presencePenalty the presencePenalty to set
     */
    public void setPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
    }

    /**
     * @return the tools
     */
    public ArrayList<CohereTool> getTools() {
        return tools;
    }

    /**
     * @param tools the tools to set
     */
    public void setTools(ArrayList<CohereTool> tools) {
        this.tools = tools;
    }

    /**
     * @return the toolResult
     */
    public ArrayList<CohereToolResult> getToolResult() {
        return toolResult;
    }

    /**
     * @param toolResult the toolResult to set
     */
    public void setToolResult(ArrayList<CohereToolResult> toolResult) {
        this.toolResult = toolResult;
    }

}
