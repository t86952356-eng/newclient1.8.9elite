/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.realms;

import java.nio.ByteBuffer;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.WorldRenderer$State;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.realms.w;

public class e {
    private WorldRenderer diu;

    public e(WorldRenderer worldRenderer) {
        this.diu = worldRenderer;
    }

    public e c(WorldRenderer worldRenderer) {
        this.diu = worldRenderer;
        return this;
    }

    public void z(float f2, float f3, float f4) {
        this.diu.l(f2, f3, f4);
    }

    public void gM(int n2) {
        this.diu.dm(n2);
    }

    public ByteBuffer ajN() {
        return this.diu.LA();
    }

    public void A(float f2, float f3, float f4) {
        this.diu.m(f2, f3, f4);
    }

    public int LD() {
        return this.diu.LD();
    }

    public void W(double d2, double d3, double d4) {
        this.diu.G(d2, d3, d4);
    }

    public void c(WorldRenderer$State worldRenderer$State) {
        this.diu.a(worldRenderer$State);
    }

    public void Lx() {
        this.diu.Lx();
    }

    public e B(float f2, float f3, float f4) {
        return this.c(this.diu.n(f2, f3, f4));
    }

    public void vX() {
        this.diu.Lz();
    }

    public void a(int n2, VertexFormat vertexFormat) {
        this.diu.a(n2, vertexFormat);
    }

    public e v(int n2, int n3, int n4, int n5) {
        return this.c(this.diu.s(n2, n3, n4, n5));
    }

    public void w(int n2, int n3, int n4, int n5) {
        this.diu.q(n2, n3, n4, n5);
    }

    public void X(double d2, double d3, double d4) {
        this.diu.E(d2, d3, d4);
    }

    public void c(float f2, float f3, float f4, int n2) {
        this.diu.b(f2, f3, f4, n2);
    }

    public e m(float f2, float f3, float f4, float f5) {
        return this.c(this.diu.g(f2, f3, f4, f5));
    }

    public w ajO() {
        return new w(this.diu.LB());
    }

    public void d(float f2, float f3, float f4, int n2) {
        this.diu.a(f2, f3, f4, n2);
    }

    public e ay(int n2, int n3) {
        return this.c(this.diu.aa(n2, n3));
    }

    public void j(int[] nArray) {
        this.diu.c(nArray);
    }

    public e u(double d2, double d3) {
        return this.c(this.diu.r(d2, d3));
    }

    public int LC() {
        return this.diu.LC();
    }

    public void clear() {
        this.diu.aX();
    }

    public e Y(double d2, double d3, double d4) {
        return this.c(this.diu.F(d2, d3, d4));
    }

    public void C(float f2, float f3, float f4) {
        this.diu.o(f2, f3, f4);
    }

    public void ajP() {
        this.diu.Lw();
    }
}

