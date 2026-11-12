/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.multiplayer;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.entity.aa;
import net.minecraft.util.be;
import net.minecraft.util.bq;
import net.minecraft.world.b;
import net.minecraft.world.biome.m;
import net.minecraft.world.chunk.g;
import net.minecraft.world.chunk.h;
import net.minecraft.world.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a
implements h {
    private static final Logger bDg = LogManager.getLogger();
    private final net.minecraft.world.chunk.a bDh;
    private final bq<net.minecraft.world.chunk.a> bDi = new bq();
    private final List<net.minecraft.world.chunk.a> bDj = Lists.newArrayList();
    private final w bDk;

    public a(w w2) {
        this.bDh = new g(w2, 0, 0);
        this.bDk = w2;
    }

    @Override
    public boolean E(int n2, int n3) {
        return true;
    }

    public void F(int n2, int n3) {
        net.minecraft.world.chunk.a a2 = this.H(n2, n3);
        if (!a2.isEmpty()) {
            a2.axz();
        }
        this.bDi.E(b.aK(n2, n3));
        this.bDj.remove(a2);
    }

    public net.minecraft.world.chunk.a G(int n2, int n3) {
        net.minecraft.world.chunk.a a2 = new net.minecraft.world.chunk.a(this.bDk, n2, n3);
        this.bDi.a(b.aK(n2, n3), a2);
        this.bDj.add(a2);
        a2.cz(true);
        return a2;
    }

    @Override
    public net.minecraft.world.chunk.a H(int n2, int n3) {
        net.minecraft.world.chunk.a a2 = this.bDi.B(b.aK(n2, n3));
        return a2 == null ? this.bDh : a2;
    }

    @Override
    public boolean a(boolean bl2, be be2) {
        return true;
    }

    @Override
    public void Hj() {
    }

    @Override
    public boolean Hk() {
        long l2 = System.currentTimeMillis();
        for (net.minecraft.world.chunk.a a2 : this.bDj) {
            a2.cy(System.currentTimeMillis() - l2 > 5L);
        }
        if (System.currentTimeMillis() - l2 > 100L) {
            bDg.info("Warning: Clientside chunk ticking took {} ms", new Object[]{System.currentTimeMillis() - l2});
        }
        return false;
    }

    @Override
    public boolean Hl() {
        return false;
    }

    @Override
    public void a(h h2, int n2, int n3) {
    }

    @Override
    public boolean a(h h2, net.minecraft.world.chunk.a a2, int n2, int n3) {
        return false;
    }

    @Override
    public String Hm() {
        return "MultiplayerChunkCache: " + this.bDi.atn() + ", " + this.bDj.size();
    }

    @Override
    public List<m> a(aa aa2, net.minecraft.util.b b2) {
        return null;
    }

    @Override
    public net.minecraft.util.b a(w w2, String string, net.minecraft.util.b b2) {
        return null;
    }

    @Override
    public int Hn() {
        return this.bDj.size();
    }

    @Override
    public void a(net.minecraft.world.chunk.a a2, int n2, int n3) {
    }

    @Override
    public net.minecraft.world.chunk.a H(net.minecraft.util.b b2) {
        return this.H(b2.wt() >> 4, b2.wx() >> 4);
    }
}

