/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public final class ajc
extends Enum<ajc> {
    public static final /* enum */ ajc aQE = new ajc();
    public static final /* enum */ ajc aQF = new ajc();
    private static final /* synthetic */ ajc[] aQG;

    public static ajc[] values() {
        return (ajc[])aQG.clone();
    }

    public static ajc valueOf(String string) {
        return Enum.valueOf(ajc.class, string);
    }

    private static /* synthetic */ ajc[] we() {
        return new ajc[]{aQE, aQF};
    }

    static {
        aQG = ajc.we();
    }
}

