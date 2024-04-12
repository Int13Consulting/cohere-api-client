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

/**
 *
 * @author mgamble
 */
public class CohereBilledUnits {

    @SerializedName("input_tokens")
    private int inputTokens;
    @SerializedName("output_tokens")
    private int outputTokens;
    @SerializedName("search_units")
    private int searchUnits;
    private int classifications;

    /**
     * @return the input_tokens
     */
    public int getInputTokens() {
        return inputTokens;
    }

    /**
     * @param input_tokens the input_tokens to set
     */
    public void setInputTokens(int input_tokens) {
        this.inputTokens = input_tokens;
    }

    /**
     * @return the output_tokens
     */
    public int getOutputTokens() {
        return outputTokens;
    }

    /**
     * @param output_tokens the output_tokens to set
     */
    public void setOutputTokens(int output_tokens) {
        this.outputTokens = output_tokens;
    }

    /**
     * @return the search_units
     */
    public int getSearchUnits() {
        return searchUnits;
    }

    /**
     * @param search_units the search_units to set
     */
    public void setSearchUnits(int search_units) {
        this.searchUnits = search_units;
    }

    /**
     * @return the classifications
     */
    public int getClassifications() {
        return classifications;
    }

    /**
     * @param classifications the classifications to set
     */
    public void setClassifications(int classifications) {
        this.classifications = classifications;
    }
}
