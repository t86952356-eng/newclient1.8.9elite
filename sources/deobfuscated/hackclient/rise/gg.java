/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.gh;
import lombok.Generated;

public final class gg
extends Enum<gg> {
    public static final /* enum */ gg kT = new gg(gh.kZ);
    public static final /* enum */ gg kU = new gg(gh.la);
    public static final /* enum */ gg kV = new gg(gh.kY);
    final gh kW;
    private static final /* synthetic */ gg[] kX;

    public static gg[] values() {
        return (gg[])kX.clone();
    }

    public static gg valueOf(String string) {
        return Enum.valueOf(gg.class, string);
    }

    @Generated
    public gh dW() {
        return this.kW;
    }

    @Generated
    private gg(gh gh2) {
        this.kW = gh2;
    }

    private static /* synthetic */ gg[] dX() {
        return new gg[]{kT, kU, kV};
    }

    static {
        kX = gg.dX();
    }
}

