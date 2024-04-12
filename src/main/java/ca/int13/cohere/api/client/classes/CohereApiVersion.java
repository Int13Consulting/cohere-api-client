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
public class CohereApiVersion {
    private String version;
    @SerializedName("is_deprecated")
    private boolean isDeprecated;
    @SerializedName("is_experimental")
    private boolean isExperimental;    

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the isDeprecated
     */
    public boolean isDeprecated() {
        return isDeprecated;
    }

    /**
     * @param isDeprecated the isDeprecated to set
     */
    public void setDeprecated(boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    /**
     * @return the isExperimental
     */
    public boolean isExperimental() {
        return isExperimental;
    }

    /**
     * @param isExperimental the isExperimental to set
     */
    public void setExperimental(boolean isExperimental) {
        this.isExperimental = isExperimental;
    }
}
