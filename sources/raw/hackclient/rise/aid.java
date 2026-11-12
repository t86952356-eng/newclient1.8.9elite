/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public final class aid
extends Enum<aid> {
    public static final /* enum */ aid aOI = new aid();
    public static final /* enum */ aid aOJ = new aid();
    private static final /* synthetic */ aid[] aOK;

    public static aid[] values() {
        return (aid[])aOK.clone();
    }

    public static aid valueOf(String string) {
        return Enum.valueOf(aid.class, string);
    }

    private static /* synthetic */ aid[] vo() {
        return new aid[]{aOI, aOJ};
    }

    static {
        aOK = aid.vo();
    }
}

