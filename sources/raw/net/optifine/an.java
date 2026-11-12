/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.HashSet;
import java.util.Set;
import net.minecraft.client.multiplayer.j;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.src.a;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.g;
import net.optifine.ao;

public class an {
    private c jM = null;
    private double ebZ = 0.0;
    private double OZ = -2.147483648E9;
    private double cZh = -2.147483648E9;
    private double Pa = -2.147483648E9;
    private int eca = 0;
    private boolean ecb = false;
    private long ecc = 0L;
    private Set<b> ecd = new HashSet<b>();
    private final g ece = new g();

    public an(c c2) {
        this.jM = c2;
        this.ebZ = c2.getEyeHeight();
    }

    public void a(RenderGlobal renderGlobal) {
        if (a.apb()) {
            long l2 = System.currentTimeMillis();
            if (l2 < this.ecc + 500L) {
                return;
            }
            this.ecc = l2;
        }
        double d2 = this.jM.gW - 0.5;
        double d3 = this.jM.gX - 0.5 + this.ebZ;
        double d4 = this.jM.gY - 0.5;
        int n2 = ao.aG(this.jM);
        double d5 = d2 - this.OZ;
        double d6 = d3 - this.cZh;
        double d7 = d4 - this.Pa;
        double d8 = 0.1;
        if (Math.abs(d5) > 0.1 || Math.abs(d6) > 0.1 || Math.abs(d7) > 0.1 || this.eca != n2) {
            Object object;
            Object object2;
            this.OZ = d2;
            this.cZh = d3;
            this.Pa = d4;
            this.eca = n2;
            this.ecb = false;
            j j2 = renderGlobal.La();
            if (j2 != null) {
                this.ece.E(bt.aF(d2), bt.aF(d3), bt.aF(d4));
                object2 = j2.L(this.ece);
                object = object2.df();
                this.ecb = object == Blocks.cLl;
            }
            object2 = new HashSet<b>();
            if (n2 > 0) {
                object = (bt.aF(d2) & 0xF) >= 8 ? net.minecraft.util.ao.dwv : net.minecraft.util.ao.dwu;
                net.minecraft.util.ao ao2 = (bt.aF(d3) & 0xF) >= 8 ? net.minecraft.util.ao.dwr : net.minecraft.util.ao.dwq;
                net.minecraft.util.ao ao3 = (bt.aF(d4) & 0xF) >= 8 ? net.minecraft.util.ao.dwt : net.minecraft.util.ao.dws;
                b b2 = new b(d2, d3, d4);
                RenderChunk renderChunk = renderGlobal.R(b2);
                b b3 = this.a(renderChunk, b2, (net.minecraft.util.ao)object);
                RenderChunk renderChunk2 = renderGlobal.R(b3);
                b b4 = this.a(renderChunk, b2, ao3);
                RenderChunk renderChunk3 = renderGlobal.R(b4);
                b b5 = this.a(renderChunk2, b3, ao3);
                RenderChunk renderChunk4 = renderGlobal.R(b5);
                b b6 = this.a(renderChunk, b2, ao2);
                RenderChunk renderChunk5 = renderGlobal.R(b6);
                b b7 = this.a(renderChunk5, b6, (net.minecraft.util.ao)object);
                RenderChunk renderChunk6 = renderGlobal.R(b7);
                b b8 = this.a(renderChunk5, b6, ao3);
                RenderChunk renderChunk7 = renderGlobal.R(b8);
                b b9 = this.a(renderChunk6, b7, ao3);
                RenderChunk renderChunk8 = renderGlobal.R(b9);
                this.a(renderChunk, this.ecd, (Set<b>)object2);
                this.a(renderChunk2, this.ecd, (Set<b>)object2);
                this.a(renderChunk3, this.ecd, (Set<b>)object2);
                this.a(renderChunk4, this.ecd, (Set<b>)object2);
                this.a(renderChunk5, this.ecd, (Set<b>)object2);
                this.a(renderChunk6, this.ecd, (Set<b>)object2);
                this.a(renderChunk7, this.ecd, (Set<b>)object2);
                this.a(renderChunk8, this.ecd, (Set<b>)object2);
            }
            this.b(renderGlobal);
            this.ecd = object2;
        }
    }

    private b a(RenderChunk renderChunk, b b2, net.minecraft.util.ao ao2) {
        return renderChunk != null ? renderChunk.m(ao2) : b2.d(ao2, 16);
    }

    private void a(RenderChunk renderChunk, Set<b> set, Set<b> set2) {
        if (renderChunk != null) {
            CompiledChunk compiledChunk = renderChunk.MF();
            if (compiledChunk != null && !compiledChunk.isEmpty()) {
                renderChunk.ap(true);
            }
            b b2 = renderChunk.yl();
            if (set != null) {
                set.remove(b2);
            }
            if (set2 != null) {
                set2.add(b2);
            }
        }
    }

    public void b(RenderGlobal renderGlobal) {
        for (b b2 : this.ecd) {
            RenderChunk renderChunk = renderGlobal.R(b2);
            this.a(renderChunk, (Set<b>)null, (Set<b>)null);
        }
    }

    public c dk() {
        return this.jM;
    }

    public double aBd() {
        return this.OZ;
    }

    public double aBe() {
        return this.cZh;
    }

    public double aBf() {
        return this.Pa;
    }

    public int aBg() {
        return this.eca;
    }

    public boolean aBh() {
        return this.ecb;
    }

    public double aBi() {
        return this.ebZ;
    }

    public String toString() {
        return "Entity: " + String.valueOf(this.jM) + ", offsetY: " + this.ebZ;
    }
}

