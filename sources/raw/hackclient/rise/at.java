/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public final class at
extends Enum<at> {
    public static final /* enum */ at cd = new at();
    public static final /* enum */ at ce = new at();
    private static final /* synthetic */ at[] cf;

    public static at[] values() {
        return (at[])cf.clone();
    }

    public static at valueOf(String string) {
        return Enum.valueOf(at.class, string);
    }

    private static /* synthetic */ at[] aU() {
        return new at[]{cd, ce};
    }

    static {
        cf = at.aU();
    }
}

