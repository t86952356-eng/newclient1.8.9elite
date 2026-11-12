/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import lombok.Generated;

public final class gd
extends Enum<gd> {
    public static final /* enum */ gd kD = new gd(0, "");
    public static final /* enum */ gd kE = new gd(1, "Light", "light", "LIGHT");
    public static final /* enum */ gd kF = new gd(2, "Medium", "medium", "MEDIUM");
    public static final /* enum */ gd kG = new gd(3, "Regular", "regular", "REGULAR");
    public static final /* enum */ gd kH = new gd(4, "Bold", "bold", "BOLD");
    private final int kI;
    private final String[] aliases;
    private static final /* synthetic */ gd[] kJ;

    public static gd[] values() {
        return (gd[])kJ.clone();
    }

    public static gd valueOf(String string) {
        return Enum.valueOf(gd.class, string);
    }

    private gd(int n3, String ... stringArray) {
        this.kI = n3;
        this.aliases = stringArray;
    }

    @Generated
    public int dR() {
        return this.kI;
    }

    @Generated
    public String[] getAliases() {
        return this.aliases;
    }

    private static /* synthetic */ gd[] dS() {
        return new gd[]{kD, kE, kF, kG, kH};
    }

    static {
        kJ = gd.dS();
    }
}

