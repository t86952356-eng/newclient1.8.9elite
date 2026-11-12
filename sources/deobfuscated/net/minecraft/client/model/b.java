/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.model;

import net.minecraft.client.model.f;
import net.minecraft.entity.c;
import net.minecraft.entity.item.a;

public class b
extends f {
    public b() {
        this(0.0f);
    }

    public b(float f2) {
        this(f2, 64, 32);
    }

    protected b(float f2, int n2, int n3) {
        super(f2, 0.0f, n2, n3);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
        if (c2 instanceof a) {
            a a2 = (a)c2;
            this.byA.bBF = (float)Math.PI / 180 * a2.XU().getX();
            this.byA.bBG = (float)Math.PI / 180 * a2.XU().getY();
            this.byA.bBH = (float)Math.PI / 180 * a2.XU().getZ();
            this.byA.g(0.0f, 1.0f, 0.0f);
            this.byC.bBF = (float)Math.PI / 180 * a2.XV().getX();
            this.byC.bBG = (float)Math.PI / 180 * a2.XV().getY();
            this.byC.bBH = (float)Math.PI / 180 * a2.XV().getZ();
            this.byE.bBF = (float)Math.PI / 180 * a2.XW().getX();
            this.byE.bBG = (float)Math.PI / 180 * a2.XW().getY();
            this.byE.bBH = (float)Math.PI / 180 * a2.XW().getZ();
            this.byD.bBF = (float)Math.PI / 180 * a2.XX().getX();
            this.byD.bBG = (float)Math.PI / 180 * a2.XX().getY();
            this.byD.bBH = (float)Math.PI / 180 * a2.XX().getZ();
            this.byG.bBF = (float)Math.PI / 180 * a2.XY().getX();
            this.byG.bBG = (float)Math.PI / 180 * a2.XY().getY();
            this.byG.bBH = (float)Math.PI / 180 * a2.XY().getZ();
            this.byG.g(1.9f, 11.0f, 0.0f);
            this.byF.bBF = (float)Math.PI / 180 * a2.XZ().getX();
            this.byF.bBG = (float)Math.PI / 180 * a2.XZ().getY();
            this.byF.bBH = (float)Math.PI / 180 * a2.XZ().getZ();
            this.byF.g(-1.9f, 11.0f, 0.0f);
            b.a(this.byA, this.byB);
        }
    }
}

