/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.aw;
import net.minecraft.entity.passive.a;
import net.minecraft.entity.passive.ah;
import net.minecraft.entity.passive.ak;
import net.minecraft.entity.passive.b;

public final class aa
extends Enum<aa> {
    public static final /* enum */ aa cvX = new aa(aw.class, 70, Material.beo, false, false);
    public static final /* enum */ aa cvY = new aa(b.class, 10, Material.beo, true, true);
    public static final /* enum */ aa cvZ = new aa(a.class, 15, Material.beo, true, false);
    public static final /* enum */ aa cwa = new aa(ah.class, 5, Material.bev, true, false);
    private final Class<? extends ak> cwb;
    private final int cwc;
    private final Material cwd;
    private final boolean cwe;
    private final boolean cwf;
    private static final /* synthetic */ aa[] cwg;

    public static aa[] values() {
        return (aa[])cwg.clone();
    }

    public static aa valueOf(String string) {
        return Enum.valueOf(aa.class, string);
    }

    private aa(Class<? extends ak> clazz, int n3, Material material, boolean bl2, boolean bl3) {
        this.cwb = clazz;
        this.cwc = n3;
        this.cwd = material;
        this.cwe = bl2;
        this.cwf = bl3;
    }

    public Class<? extends ak> Wu() {
        return this.cwb;
    }

    public int Wv() {
        return this.cwc;
    }

    public boolean Ww() {
        return this.cwe;
    }

    public boolean Wx() {
        return this.cwf;
    }

    private static /* synthetic */ aa[] Wy() {
        return new aa[]{cvX, cvY, cvZ, cwa};
    }

    static {
        cwg = aa.Wy();
    }
}

