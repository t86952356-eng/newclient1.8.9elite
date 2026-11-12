/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.player;

import net.minecraft.util.ba;
import net.minecraft.util.t;

public final class f
extends Enum<f> {
    public static final /* enum */ f cJq = new f(0, "cape");
    public static final /* enum */ f cJr = new f(1, "jacket");
    public static final /* enum */ f cJs = new f(2, "left_sleeve");
    public static final /* enum */ f cJt = new f(3, "right_sleeve");
    public static final /* enum */ f cJu = new f(4, "left_pants_leg");
    public static final /* enum */ f cJv = new f(5, "right_pants_leg");
    public static final /* enum */ f cJw = new f(6, "hat");
    private final int cJx;
    private final int cJy;
    private final String cJz;
    private final ba cJA;
    private static final /* synthetic */ f[] cJB;

    public static f[] values() {
        return (f[])cJB.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    private f(int n3, String string2) {
        this.cJx = n3;
        this.cJy = 1 << n3;
        this.cJz = string2;
        this.cJA = new t("options.modelPart." + string2, new Object[0]);
    }

    public int acz() {
        return this.cJy;
    }

    public int acA() {
        return this.cJx;
    }

    public String acB() {
        return this.cJz;
    }

    public ba acC() {
        return this.cJA;
    }

    private static /* synthetic */ f[] acD() {
        return new f[]{cJq, cJr, cJs, cJt, cJu, cJv, cJw};
    }

    static {
        cJB = f.acD();
    }
}

