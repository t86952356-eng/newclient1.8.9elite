/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.enchantment;

import net.minecraft.item.ai;
import net.minecraft.item.be;
import net.minecraft.item.cp;
import net.minecraft.item.cq;
import net.minecraft.item.d;
import net.minecraft.item.y;

public final class z
extends Enum<z> {
    public static final /* enum */ z cqW = new z();
    public static final /* enum */ z cqX = new z();
    public static final /* enum */ z cqY = new z();
    public static final /* enum */ z cqZ = new z();
    public static final /* enum */ z cra = new z();
    public static final /* enum */ z crb = new z();
    public static final /* enum */ z crc = new z();
    public static final /* enum */ z crd = new z();
    public static final /* enum */ z cre = new z();
    public static final /* enum */ z crf = new z();
    public static final /* enum */ z crg = new z();
    private static final /* synthetic */ z[] crh;

    public static z[] values() {
        return (z[])crh.clone();
    }

    public static z valueOf(String string) {
        return Enum.valueOf(z.class, string);
    }

    public boolean i(d d2) {
        if (this == cqW) {
            return true;
        }
        if (this == crf && d2.adu()) {
            return true;
        }
        if (d2 instanceof y) {
            if (this == cqX) {
                return true;
            }
            y y2 = (y)d2;
            return y2.cVH == 0 ? this == crb : (y2.cVH == 2 ? this == cqZ : (y2.cVH == 1 ? this == cra : y2.cVH == 3 && this == cqY));
        }
        return d2 instanceof cp ? this == crc : (d2 instanceof cq ? this == crd : (d2 instanceof ai ? this == crg : d2 instanceof be && this == cre));
    }

    private static /* synthetic */ z[] Tf() {
        return new z[]{cqW, cqX, cqY, cqZ, cra, crb, crc, crd, cre, crf, crg};
    }

    static {
        crh = z.Tf();
    }
}

