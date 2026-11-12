/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.util;

import java.util.HashMap;
import lombok.Generated;

public final class Language
extends Enum<Language> {
    public static final /* enum */ Language aND = new Language("en_US");
    public static final /* enum */ Language aNE = new Language("fr_FR");
    public static final /* enum */ Language aNF = new Language("es_ES");
    public static final /* enum */ Language aNG = new Language("sv_SE");
    public static final /* enum */ Language aNH = new Language("pl_PL");
    public static final /* enum */ Language aNI = new Language("ru_RU");
    public static final /* enum */ Language aNJ = new Language("zh_ZH");
    private final String aNK;
    private final HashMap<String, String> aNL = new HashMap();
    private static final /* synthetic */ Language[] aNM;

    public static Language[] values() {
        return (Language[])aNM.clone();
    }

    public static Language valueOf(String string) {
        return Enum.valueOf(Language.class, string);
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
    private Language(String string2) {
        this.aNK = string2;
    }

    private static /* synthetic */ Language[] uV() {
        return new Language[]{aND, aNE, aNF, aNG, aNH, aNI, aNJ};
    }

    static {
        aNM = Language.uV();
    }
}

