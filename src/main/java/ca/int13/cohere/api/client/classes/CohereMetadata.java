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
import java.util.List;

/**
 *
 * @author mgamble
 */
public class CohereMetadata {
    @SerializedName("api_version")
    private CohereApiVersion apiVersion;
    @SerializedName("billed_units")
    private CohereBilledUnits billedUnits;
    private CohereTokens tokens;
    private List<String> warnings;   

    /**
     * @return the apiVersion
     */
    public CohereApiVersion getApiVersion() {
        return apiVersion;
    }

    /**
     * @param apiVersion the apiVersion to set
     */
    public void setApiVersion(CohereApiVersion apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * @return the billedUnits
     */
    public CohereBilledUnits getBilledUnits() {
        return billedUnits;
    }

    /**
     * @param billedUnits the billedUnits to set
     */
    public void setBilledUnits(CohereBilledUnits billedUnits) {
        this.billedUnits = billedUnits;
    }

    /**
     * @return the tokens
     */
    public CohereTokens getTokens() {
        return tokens;
    }

    /**
     * @param tokens the tokens to set
     */
    public void setTokens(CohereTokens tokens) {
        this.tokens = tokens;
    }

    /**
     * @return the warnings
     */
    public List<String> getWarnings() {
        return warnings;
    }

    /**
     * @param warnings the warnings to set
     */
    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }
}
