/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package hackclient.rise;

import com.google.gson.annotations.SerializedName;
import hackclient.rise.afq;
import hackclient.rise.afs;
import java.util.Arrays;

public class afr {
    @SerializedName(value="id")
    private final int id;
    @SerializedName(value="name")
    private final String name;
    @SerializedName(value="uuid")
    private final String aIa;
    @SerializedName(value="skins")
    private final afs[] aIb;
    @SerializedName(value="capes")
    private final afq[] aIc;

    public afr(int n2, String string, String string2, afs[] afsArray, afq[] afqArray) {
        this.id = n2;
        this.name = string;
        this.aIa = string2;
        this.aIb = afsArray;
        this.aIc = afqArray;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String sx() {
        return this.aIa;
    }

    public afs[] tq() {
        return this.aIb;
    }

    public afq[] tr() {
        return this.aIc;
    }

    public String toString() {
        return "DynamicAccountResult{id=" + this.id + ", name='" + this.name + "', uuid='" + this.aIa + "', skins=" + Arrays.toString(this.aIb) + ", capes=" + Arrays.toString(this.aIc) + "}";
    }
}

