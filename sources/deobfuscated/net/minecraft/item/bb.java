/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import java.util.List;
import net.minecraft.entity.player.a;
import net.minecraft.item.ar;
import net.minecraft.item.b;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;
import net.minecraft.nbt.u;
import net.minecraft.util.cr;

public class bb
extends d {
    @Override
    public int e(co co2, int n2) {
        if (n2 != 1) {
            return super.e(co2, n2);
        }
        g g2 = bb.a(co2, "Colors");
        if (!(g2 instanceof u)) {
            return 0x8A8A8A;
        }
        u u2 = (u)g2;
        int[] nArray = u2.aeR();
        if (nArray.length == 1) {
            return nArray[0];
        }
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for (int n6 : nArray) {
            n3 += (n6 & 0xFF0000) >> 16;
            n4 += (n6 & 0xFF00) >> 8;
            n5 += (n6 & 0xFF) >> 0;
        }
        return (n3 /= nArray.length) << 16 | (n4 /= nArray.length) << 8 | (n5 /= nArray.length);
    }

    public static g a(co co2, String string) {
        n n2;
        if (co2.aej() && (n2 = co2.aek().eN("Explosion")) != null) {
            return n2.eB(string);
        }
        return null;
    }

    @Override
    public void a(co co2, a a2, List<String> list, boolean bl2) {
        n n2;
        if (co2.aej() && (n2 = co2.aek().eN("Explosion")) != null) {
            bb.a(n2, list);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(n n2, List<String> list) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }
}

