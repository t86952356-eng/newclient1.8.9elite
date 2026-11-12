/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public final class ajz
extends Enum<ajz> {
    public static final /* enum */ ajz aRm = new ajz("Windows");
    public static final /* enum */ ajz aRn = new ajz("MacOS");
    public static final /* enum */ ajz aRo = new ajz("Linux");
    private final String aRp;
    private static final /* synthetic */ ajz[] aRq;

    public static ajz[] values() {
        return (ajz[])aRq.clone();
    }

    public static ajz valueOf(String string) {
        return Enum.valueOf(ajz.class, string);
    }

    private ajz(String string2) {
        this.aRp = string2;
    }

    public String wr() {
        return this.aRp;
    }

    private static /* synthetic */ ajz[] ws() {
        return new ajz[]{aRm, aRn, aRo};
    }

    static {
        aRq = ajz.ws();
    }
}

