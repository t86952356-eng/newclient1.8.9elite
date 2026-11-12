/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public final class aan
extends Enum<aan> {
    public static final /* enum */ aan axy = new aan();
    public static final /* enum */ aan axz = new aan();
    public static final /* enum */ aan axA = new aan();
    public static final /* enum */ aan axB = new aan();
    private static final /* synthetic */ aan[] axC;

    public static aan[] values() {
        return (aan[])axC.clone();
    }

    public static aan valueOf(String string) {
        return Enum.valueOf(aan.class, string);
    }

    private static /* synthetic */ aan[] oq() {
        return new aan[]{axy, axz, axA, axB};
    }

    static {
        axC = aan.oq();
    }
}

