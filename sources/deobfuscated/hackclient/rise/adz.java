/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import java.awt.Color;
import lombok.Generated;

public final class adz
extends Enum<adz> {
    public static final /* enum */ adz aEF = new adz(new Color(255, 50, 50));
    public static final /* enum */ adz aEG = new adz(new Color(255, 128, 50));
    public static final /* enum */ adz aEH = new adz(new Color(255, 255, 50));
    public static final /* enum */ adz aEI = new adz(new Color(128, 255, 50));
    public static final /* enum */ adz aEJ = new adz(new Color(50, 128, 50));
    public static final /* enum */ adz aEK = new adz(new Color(50, 200, 255));
    public static final /* enum */ adz aEL = new adz(new Color(50, 100, 200));
    public static final /* enum */ adz aEM = new adz(new Color(128, 50, 255));
    public static final /* enum */ adz aEN = new adz(new Color(255, 128, 255));
    public static final /* enum */ adz aEO = new adz(new Color(100, 100, 110));
    private final Color aEP;
    private static final /* synthetic */ adz[] aEQ;

    public static adz[] values() {
        return (adz[])aEQ.clone();
    }

    public static adz valueOf(String string) {
        return Enum.valueOf(adz.class, string);
    }

    @Generated
    public Color nM() {
        return this.aEP;
    }

    @Generated
    private adz(Color color) {
        this.aEP = color;
    }

    private static /* synthetic */ adz[] sc() {
        return new adz[]{aEF, aEG, aEH, aEI, aEJ, aEK, aEL, aEM, aEN, aEO};
    }

    static {
        aEQ = adz.sc();
    }
}

