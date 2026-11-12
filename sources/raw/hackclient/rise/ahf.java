/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import java.util.HashMap;
import lombok.Generated;

public final class ahf
extends Enum<ahf> {
    public static final /* enum */ ahf aND = new ahf("en_US");
    public static final /* enum */ ahf aNE = new ahf("fr_FR");
    public static final /* enum */ ahf aNF = new ahf("es_ES");
    public static final /* enum */ ahf aNG = new ahf("sv_SE");
    public static final /* enum */ ahf aNH = new ahf("pl_PL");
    public static final /* enum */ ahf aNI = new ahf("ru_RU");
    public static final /* enum */ ahf aNJ = new ahf("zh_ZH");
    private final String aNK;
    private final HashMap<String, String> aNL = new HashMap();
    private static final /* synthetic */ ahf[] aNM;

    public static ahf[] values() {
        return (ahf[])aNM.clone();
    }

    public static ahf valueOf(String string) {
        return Enum.valueOf(ahf.class, string);
    }

    @Generated
    public String uT() {
        return this.aNK;
    }

    @Generated
    public HashMap<String, String> uU() {
        return this.aNL;
    }

    @Generated
    private ahf(String string2) {
        this.aNK = string2;
    }

    private static /* synthetic */ ahf[] uV() {
        return new ahf[]{aND, aNE, aNF, aNG, aNH, aNI, aNJ};
    }

    static {
        aNM = ahf.uV();
    }
}

