/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.d;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class ad
extends d {
    public byte dtn;
    public boolean dto;

    @Override
    public void b(n n2) {
        super.b(n2);
        n2.a("note", this.dtn);
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        this.dtn = n2.eE("note");
        this.dtn = (byte)bt.F(this.dtn, 0, 24);
    }

    public void aqJ() {
        this.dtn = (byte)((this.dtn + 1) % 25);
        this.Lw();
    }

    public void ae(w w2, b b2) {
        if (w2.L(b2.aqX()).df().xb() == Material.beo) {
            Material material = w2.L(b2.aqY()).df().xb();
            int n2 = 0;
            if (material == Material.bes) {
                n2 = 1;
            }
            if (material == Material.beD) {
                n2 = 2;
            }
            if (material == Material.beG) {
                n2 = 3;
            }
            if (material == Material.ber) {
                n2 = 4;
            }
            w2.c(b2, Blocks.cLD, n2, this.dtn);
        }
    }
}

