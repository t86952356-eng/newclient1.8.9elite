/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.crash.a;
import net.minecraft.crash.i;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;
import net.minecraft.util.cl;
import net.minecraft.world.b;
import net.minecraft.world.chunk.f;
import net.minecraft.world.gen.m;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.gen.structure.p;
import net.minecraft.world.gen.structure.q;
import net.minecraft.world.gen.structure.r;
import net.minecraft.world.gen.structure.s;
import net.minecraft.world.gen.structure.t;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public abstract class o
extends m {
    private s dQj;
    protected Map<Long, cb> dQk = Maps.newHashMap();

    public abstract String ayE();

    @Override
    protected final void a(net.minecraft.world.w w2, int n2, int n3, int n4, int n5, f f2) {
        this.q(w2);
        if (!this.dQk.containsKey(b.aK(n2, n3))) {
            this.ta.nextInt();
            try {
                if (this.bk(n2, n3)) {
                    cb cb2 = this.bl(n2, n3);
                    this.dQk.put(b.aK(n2, n3), cb2);
                    this.a(n2, n3, cb2);
                }
            }
            catch (Throwable throwable) {
                a a2 = a.a(throwable, "Exception preparing structure feature");
                i i2 = a2.dY("Feature being prepared");
                i2.a("Is feature chunk", new p(this, n2, n3));
                i2.b("Chunk location", String.format("%d,%d", n2, n3));
                i2.a("Chunk pos hash", new q(this, n2, n3));
                i2.a("Structure type", new r(this));
                throw new cl(a2);
            }
        }
    }

    public boolean a(net.minecraft.world.w w2, Random random, b b2) {
        this.q(w2);
        int n2 = (b2.dBK << 4) + 8;
        int n3 = (b2.dBL << 4) + 8;
        boolean bl2 = false;
        for (cb cb2 : this.dQk.values()) {
            if (!cb2.ayI() || !cb2.b(b2) || !cb2.ayR().G(n2, n3, n2 + 15, n3 + 15)) continue;
            cb2.b(w2, random, new w(n2, n3, n2 + 15, n3 + 15));
            cb2.c(b2);
            bl2 = true;
            this.a(cb2.azd(), cb2.aze(), cb2);
        }
        return bl2;
    }

    public boolean bv(net.minecraft.util.b b2) {
        this.q(this.baU);
        return this.bw(b2) != null;
    }

    protected cb bw(net.minecraft.util.b b2) {
        for (cb cb2 : this.dQk.values()) {
            if (!cb2.ayI() || !cb2.ayR().k(b2)) continue;
            for (y y2 : cb2.azc()) {
                if (!y2.ayR().k(b2)) continue;
                return cb2;
            }
        }
        return null;
    }

    public boolean al(net.minecraft.world.w w2, net.minecraft.util.b b2) {
        this.q(w2);
        for (cb cb2 : this.dQk.values()) {
            if (!cb2.ayI() || !cb2.ayR().k(b2)) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public net.minecraft.util.b am(net.minecraft.world.w w2, net.minecraft.util.b b2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    protected List<net.minecraft.util.b> ayH() {
        return null;
    }

    private void q(net.minecraft.world.w w2) {
        if (this.dQj == null) {
            this.dQj = (s)w2.b(s.class, this.ayE());
            if (this.dQj == null) {
                this.dQj = new s(this.ayE());
                w2.a(this.ayE(), this.dQj);
            } else {
                n n2 = this.dQj.aek();
                for (String string : n2.aeQ()) {
                    n n3;
                    g g2 = n2.eB(string);
                    if (g2.aeF() != 10 || !(n3 = (n)g2).eD("ChunkX") || !n3.eD("ChunkZ")) continue;
                    int n4 = n3.eG("ChunkX");
                    int n5 = n3.eG("ChunkZ");
                    cb cb2 = t.b(n3, w2);
                    if (cb2 == null) continue;
                    this.dQk.put(b.aK(n4, n5), cb2);
                }
            }
        }
    }

    private void a(int n2, int n3, cb cb2) {
        this.dQj.a(cb2.bp(n2, n3), n2, n3);
        this.dQj.Lw();
    }

    protected abstract boolean bk(int var1, int var2);

    protected abstract cb bl(int var1, int var2);
}

