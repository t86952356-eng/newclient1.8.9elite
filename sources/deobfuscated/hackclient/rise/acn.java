/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.ScriptManager;
import java.io.File;
import lombok.Generated;
import rise.config.ConfigManager;

public final class acn
extends Enum<acn> {
    public static final /* enum */ acn aAQ = new acn("https://199.247.6.233/getconfig?id=", String.valueOf(ConfigManager.aIw) + File.separator, ".json");
    public static final /* enum */ acn aAR = new acn("https://199.247.6.233/getscript?id=", String.valueOf(ScriptManager.SCRIPT_DIRECTORY) + File.separator, ".js");
    private final String aAS;
    private final String aAT;
    private final String type;
    private static final /* synthetic */ acn[] aAV;

    public static acn[] values() {
        return (acn[])aAV.clone();
    }

    public static acn valueOf(String string) {
        return Enum.valueOf(acn.class, string);
    }

    @Generated
    private acn(String string2, String string3, String string4) {
        this.aAS = string2;
        this.aAT = string3;
        this.type = string4;
    }

    @Generated
    public String np() {
        return this.aAS;
    }

    @Generated
    public String qW() {
        return this.aAT;
    }

    @Generated
    public String getType() {
        return this.type;
    }

    private static /* synthetic */ acn[] qX() {
        return new acn[]{aAQ, aAR};
    }

    static {
        aAV = acn.qX();
    }
}

