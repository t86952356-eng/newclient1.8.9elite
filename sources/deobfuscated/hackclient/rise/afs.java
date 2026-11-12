/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package hackclient.rise;

import com.google.gson.annotations.SerializedName;

public class afs {
    @SerializedName(value="id")
    private final String aId;
    @SerializedName(value="state")
    private final String aIe;
    @SerializedName(value="url")
    private final String aIf;
    @SerializedName(value="variant")
    private final String aIg;

    public afs(String string, String string2, String string3, String string4) {
        this.aId = string;
        this.aIe = string2;
        this.aIf = string3;
        this.aIg = string4;
    }

    public String tn() {
        return this.aId;
    }

    public String to() {
        return this.aIe;
    }

    public String np() {
        return this.aIf;
    }

    public String ts() {
        return this.aIg;
    }

    public String toString() {
        return "DynamicSkin{id='" + this.aId + "', state='" + this.aIe + "', url='" + this.aIf + "', variant='" + this.aIg + "'}";
    }
}

