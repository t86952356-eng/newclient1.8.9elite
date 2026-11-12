/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.ajg;
import hackclient.rise.aji;
import lombok.Generated;

public final class gh
extends Enum<gh> {
    public static final /* enum */ gh kY = new gh(null);
    public static final /* enum */ gh kZ = new gh(ajg.class);
    public static final /* enum */ gh la = new gh(aji.class);
    private final Class<?> lb;
    private static final /* synthetic */ gh[] lc;

    public static gh[] values() {
        return (gh[])lc.clone();
    }

    public static gh valueOf(String string) {
        return Enum.valueOf(gh.class, string);
    }

    @Generated
    private gh(Class<?> clazz) {
        this.lb = clazz;
    }

    @Generated
    public Class<?> dY() {
        return this.lb;
    }

    private static /* synthetic */ gh[] dZ() {
        return new gh[]{kY, kZ, la};
    }

    static {
        lc = gh.dZ();
    }
}

