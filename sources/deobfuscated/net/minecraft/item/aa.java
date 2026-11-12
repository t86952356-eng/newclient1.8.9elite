/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.item.y;

public final class aa
extends Enum<aa> {
    public static final /* enum */ aa cVL = new aa("leather", 5, new int[]{1, 3, 2, 1}, 15);
    public static final /* enum */ aa cVM = new aa("chainmail", 15, new int[]{2, 5, 4, 1}, 12);
    public static final /* enum */ aa cVN = new aa("iron", 15, new int[]{2, 6, 5, 2}, 9);
    public static final /* enum */ aa cVO = new aa("gold", 7, new int[]{2, 5, 3, 1}, 25);
    public static final /* enum */ aa cVP = new aa("diamond", 33, new int[]{3, 8, 6, 3}, 10);
    private final String name;
    private final int cVR;
    private final int[] cVS;
    private final int cVT;
    private static final /* synthetic */ aa[] cVU;

    public static aa[] values() {
        return (aa[])cVU.clone();
    }

    public static aa valueOf(String string) {
        return Enum.valueOf(aa.class, string);
    }

    private aa(String string2, int n3, int[] nArray, int n4) {
        this.name = string2;
        this.cVR = n3;
        this.cVS = nArray;
        this.cVT = n4;
    }

    public int fX(int n2) {
        return y.cVE[n2] * this.cVR;
    }

    public int fY(int n2) {
        return this.cVS[n2];
    }

    public int adK() {
        return this.cVT;
    }

    public d adL() {
        return this == cVL ? Items.cQJ : (this == cVM ? Items.cPn : (this == cVO ? Items.cPo : (this == cVN ? Items.cPn : (this == cVP ? Items.cPm : null))));
    }

    public String getName() {
        return this.name;
    }

    private static /* synthetic */ aa[] adO() {
        return new aa[]{cVL, cVM, cVN, cVO, cVP};
    }

    static {
        cVU = aa.adO();
    }
}

