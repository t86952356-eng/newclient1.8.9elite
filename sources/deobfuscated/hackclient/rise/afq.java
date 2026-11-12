/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package hackclient.rise;

import com.google.gson.annotations.SerializedName;

public class afq {
    @SerializedName(value="id")
    private final String aHU;
    @SerializedName(value="state")
    private final String aHV;
    @SerializedName(value="url")
    private final String aHW;
    @SerializedName(value="alias")
    private final String aHX;

    public afq(String string, String string2, String string3, String string4) {
        this.aHU = string;
        this.aHV = string2;
        this.aHW = string3;
        this.aHX = string4;
    }

    public String tn() {
        return this.aHU;
    }

    public String to() {
        return this.aHV;
    }

    public String np() {
        return this.aHW;
    }

    public String tp() {
        return this.aHX;
    }
}

