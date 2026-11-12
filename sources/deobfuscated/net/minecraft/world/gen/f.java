/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.crash.a;
import net.minecraft.crash.i;
import net.minecraft.entity.aa;
import net.minecraft.util.be;
import net.minecraft.util.bq;
import net.minecraft.util.cl;
import net.minecraft.world.ai;
import net.minecraft.world.b;
import net.minecraft.world.biome.m;
import net.minecraft.world.chunk.g;
import net.minecraft.world.chunk.storage.h;
import net.minecraft.world.r;
import net.minecraft.world.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class f
implements net.minecraft.world.chunk.h {
    private static final Logger dLE = LogManager.getLogger();
    private final Set<Long> dLF = Collections.newSetFromMap(new ConcurrentHashMap());
    private final net.minecraft.world.chunk.a dLG;
    private final net.minecraft.world.chunk.h dLH;
    private final h dLI;
    public boolean dLJ = true;
    private final bq<net.minecraft.world.chunk.a> dLK = new bq();
    private final List<net.minecraft.world.chunk.a> dLL = Lists.newArrayList();
    private final ai dLM;

    public f(ai ai2, h h2, net.minecraft.world.chunk.h h3) {
        this.dLG = new g(ai2, 0, 0);
        this.dLM = ai2;
        this.dLI = h2;
        this.dLH = h3;
    }

    @Override
    public boolean E(int n2, int n3) {
        return this.dLK.C(b.aK(n2, n3));
    }

    public List<net.minecraft.world.chunk.a> ayf() {
        return this.dLL;
    }

    public void bf(int n2, int n3) {
        if (this.dLM.dDl.avX()) {
            if (!this.dLM.aN(n2, n3)) {
                this.dLF.add(b.aK(n2, n3));
            }
        } else {
            this.dLF.add(b.aK(n2, n3));
        }
    }

    public void ayg() {
        for (net.minecraft.world.chunk.a a2 : this.dLL) {
            this.bf(a2.dIK, a2.dIL);
        }
    }

    public net.minecraft.world.chunk.a G(int n2, int n3) {
        long l2 = b.aK(n2, n3);
        this.dLF.remove(l2);
        net.minecraft.world.chunk.a a2 = this.dLK.B(l2);
        if (a2 == null) {
            a2 = this.bg(n2, n3);
            if (a2 == null) {
                if (this.dLH == null) {
                    a2 = this.dLG;
                } else {
                    try {
                        a2 = this.dLH.H(n2, n3);
                    }
                    catch (Throwable throwable) {
                        a a3 = a.a(throwable, "Exception generating new chunk");
                        i i2 = a3.dY("Chunk to be generated");
                        i2.b("Location", String.format("%d,%d", n2, n3));
                        i2.b("Position hash", l2);
                        i2.b("Generator", this.dLH.Hm());
                        throw new cl(a3);
                    }
                }
            }
            this.dLK.a(l2, a2);
            this.dLL.add(a2);
            a2.TR();
            a2.a(this, this, n2, n3);
        }
        return a2;
    }

    @Override
    public net.minecraft.world.chunk.a H(int n2, int n3) {
        net.minecraft.world.chunk.a a2 = this.dLK.B(b.aK(n2, n3));
        return a2 == null ? (!this.dLM.avR() && !this.dLJ ? this.dLG : this.G(n2, n3)) : a2;
    }

    private net.minecraft.world.chunk.a bg(int n2, int n3) {
        if (this.dLI == null) {
            return null;
        }
        try {
            net.minecraft.world.chunk.a a2 = this.dLI.b(this.dLM, n2, n3);
            if (a2 != null) {
                a2.M(this.dLM.getTotalWorldTime());
                if (this.dLH != null) {
                    this.dLH.a(a2, n2, n3);
                }
            }
            return a2;
        }
        catch (Exception exception) {
            dLE.error("Couldn't load chunk", (Throwable)exception);
            return null;
        }
    }

    private void b(net.minecraft.world.chunk.a a2) {
        if (this.dLI != null) {
            try {
                this.dLI.b(this.dLM, a2);
            }
            catch (Exception exception) {
                dLE.error("Couldn't save entities", (Throwable)exception);
            }
        }
    }

    private void c(net.minecraft.world.chunk.a a2) {
        if (this.dLI != null) {
            try {
                a2.M(this.dLM.getTotalWorldTime());
                this.dLI.a(this.dLM, a2);
            }
            catch (IOException iOException) {
                dLE.error("Couldn't save chunk", (Throwable)iOException);
            }
            catch (r r2) {
                dLE.error("Couldn't save chunk; already in use by another instance of Minecraft?", (Throwable)r2);
            }
        }
    }

    @Override
    public void a(net.minecraft.world.chunk.h h2, int n2, int n3) {
        net.minecraft.world.chunk.a a2 = this.H(n2, n3);
        if (!a2.axL()) {
            a2.axG();
            if (this.dLH != null) {
                this.dLH.a(h2, n2, n3);
                a2.axA();
            }
        }
    }

    @Override
    public boolean a(net.minecraft.world.chunk.h h2, net.minecraft.world.chunk.a a2, int n2, int n3) {
        if (this.dLH != null && this.dLH.a(h2, a2, n2, n3)) {
            net.minecraft.world.chunk.a a3 = this.H(n2, n3);
            a3.axA();
            return true;
        }
        return false;
    }

    @Override
    public boolean a(boolean bl2, be be2) {
        int n2 = 0;
        ArrayList arrayList = Lists.newArrayList(this.dLL);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            net.minecraft.world.chunk.a a2 = (net.minecraft.world.chunk.a)arrayList.get(i2);
            if (bl2) {
                this.b(a2);
            }
            if (!a2.cx(bl2)) continue;
            this.c(a2);
            a2.cC(false);
            if (++n2 != 24 || bl2) continue;
            return false;
        }
        return true;
    }

    @Override
    public void Hj() {
        if (this.dLI != null) {
            this.dLI.Hj();
        }
    }

    @Override
    public boolean Hk() {
        if (!this.dLM.dEc) {
            for (int i2 = 0; i2 < 100; ++i2) {
                if (this.dLF.isEmpty()) continue;
                Long l2 = this.dLF.iterator().next();
                net.minecraft.world.chunk.a a2 = this.dLK.B(l2);
                if (a2 != null) {
                    a2.axz();
                    this.c(a2);
                    this.b(a2);
                    this.dLK.E(l2);
                    this.dLL.remove(a2);
                }
                this.dLF.remove(l2);
            }
            if (this.dLI != null) {
                this.dLI.axS();
            }
        }
        return this.dLH.Hk();
    }

    @Override
    public boolean Hl() {
        return !this.dLM.dEc;
    }

    @Override
    public String Hm() {
        return "ServerChunkCache: " + this.dLK.atn() + " Drop: " + this.dLF.size();
    }

    @Override
    public List<m> a(aa aa2, net.minecraft.util.b b2) {
        return this.dLH.a(aa2, b2);
    }

    @Override
    public net.minecraft.util.b a(w w2, String string, net.minecraft.util.b b2) {
        return this.dLH.a(w2, string, b2);
    }

    @Override
    public int Hn() {
        return this.dLK.atn();
    }

    @Override
    public void a(net.minecraft.world.chunk.a a2, int n2, int n3) {
    }

    @Override
    public net.minecraft.world.chunk.a H(net.minecraft.util.b b2) {
        return this.H(b2.wt() >> 4, b2.wx() >> 4);
    }
}

