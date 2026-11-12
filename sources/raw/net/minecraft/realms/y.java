/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.realms;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.realms.e;
import net.minecraft.realms.w;

public class y {
    public static Tessellator djm = Tessellator.Li();
    public static final y djn = new y();

    public void vX() {
        djm.pZ();
    }

    public y aa(double d2, double d3, double d4) {
        djm.Lj().F(d2, d3, d4);
        return this;
    }

    public void e(float f2, float f3, float f4, float f5) {
        djm.Lj().g(f2, f3, f4, f5);
    }

    public void a(short s2, short s3) {
        djm.Lj().aa(s2, s3);
    }

    public void E(float f2, float f3, float f4) {
        djm.Lj().n(f2, f3, f4);
    }

    public void a(int n2, w w2) {
        djm.Lj().a(n2, w2.LB());
    }

    public void Lx() {
        djm.Lj().Lx();
    }

    public void W(double d2, double d3, double d4) {
        djm.Lj().G(d2, d3, d4);
    }

    public e v(int n2, int n3, int n4, int n5) {
        return new e(djm.Lj().s(n2, n3, n4, n5));
    }

    public y w(double d2, double d3) {
        djm.Lj().r(d2, d3);
        return this;
    }
}

