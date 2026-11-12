/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.world.storage;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import net.minecraft.entity.item.j;
import net.minecraft.entity.player.a;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.network.aj;
import net.minecraft.util.bt;
import net.minecraft.util.db;
import net.minecraft.util.dc;
import net.minecraft.world.ah;
import net.minecraft.world.storage.g;
import net.minecraft.world.w;

public class f
extends ah {
    public int dTh;
    public int dTi;
    public byte dTj;
    public byte dTk;
    public byte[] dTl = new byte[16384];
    public List<g> dTm = Lists.newArrayList();
    private final Map<a, g> dTn = Maps.newHashMap();
    public Map<String, dc> dTo = Maps.newLinkedHashMap();

    public f(String string) {
        super(string);
    }

    public void a(double d2, double d3, int n2) {
        int n3 = 128 * (1 << n2);
        int n4 = bt.aF((d2 + 64.0) / (double)n3);
        int n5 = bt.aF((d3 + 64.0) / (double)n3);
        this.dTh = n4 * n3 + n3 / 2 - 64;
        this.dTi = n5 * n3 + n3 / 2 - 64;
    }

    @Override
    public void a(n n2) {
        this.dTj = n2.eE("dimension");
        this.dTh = n2.eG("xCenter");
        this.dTi = n2.eG("zCenter");
        this.dTk = n2.eE("scale");
        this.dTk = (byte)bt.F(this.dTk, 0, 4);
        int n3 = n2.eF("width");
        int n4 = n2.eF("height");
        if (n3 == 128 && n4 == 128) {
            this.dTl = n2.eL("colors");
        } else {
            byte[] byArray = n2.eL("colors");
            this.dTl = new byte[16384];
            int n5 = (128 - n3) / 2;
            int n6 = (128 - n4) / 2;
            for (int i2 = 0; i2 < n4; ++i2) {
                int n7 = i2 + n6;
                if (n7 < 0 && n7 >= 128) continue;
                for (int i3 = 0; i3 < n3; ++i3) {
                    int n8 = i3 + n5;
                    if (n8 < 0 && n8 >= 128) continue;
                    this.dTl[n8 + n7 * 128] = byArray[i3 + i2 * n3];
                }
            }
        }
    }

    @Override
    public void b(n n2) {
        n2.a("dimension", this.dTj);
        n2.B("xCenter", this.dTh);
        n2.B("zCenter", this.dTi);
        n2.a("scale", this.dTk);
        n2.a("width", (short)128);
        n2.a("height", (short)128);
        n2.a("colors", this.dTl);
    }

    public void c(a a2, co co2) {
        Object object;
        if (!this.dTn.containsKey(a2)) {
            g g2 = new g(this, a2);
            this.dTn.put(a2, g2);
            this.dTm.add(g2);
        }
        if (!a2.cHV.ai(co2)) {
            this.dTo.remove(a2.xU());
        }
        for (int i2 = 0; i2 < this.dTm.size(); ++i2) {
            object = this.dTm.get(i2);
            if (!((g)object).dTp.csb && (((g)object).dTp.cHV.ai(co2) || co2.aet())) {
                if (co2.aet() || ((g)object).dTp.csP != this.dTj) continue;
                this.a(0, ((g)object).dTp.baU, ((g)object).dTp.xU(), ((g)object).dTp.gW, ((g)object).dTp.gY, ((g)object).dTp.pl);
                continue;
            }
            this.dTn.remove(((g)object).dTp);
            this.dTm.remove(object);
        }
        if (co2.aet()) {
            j j2 = co2.aeu();
            object = j2.UN();
            this.a(1, a2.baU, "frame-" + j2.getEntityId(), ((db)object).wt(), ((db)object).wx(), j2.cty.asA() * 90);
        }
        if (co2.aej() && co2.aek().C("Decorations", 9)) {
            v v2 = co2.aek().D("Decorations", 10);
            for (int i3 = 0; i3 < v2.aeS(); ++i3) {
                n n2 = v2.gi(i3);
                if (this.dTo.containsKey(n2.eK("id"))) continue;
                this.a(n2.eE("type"), a2.baU, n2.eK("id"), n2.eJ("x"), n2.eJ("z"), n2.eJ("rot"));
            }
        }
    }

    private void a(int n2, w w2, String string, double d2, double d3, double d4) {
        byte by2;
        int n3 = 1 << this.dTk;
        float f2 = (float)(d2 - (double)this.dTh) / (float)n3;
        float f3 = (float)(d3 - (double)this.dTi) / (float)n3;
        byte by3 = (byte)((double)(f2 * 2.0f) + 0.5);
        byte by4 = (byte)((double)(f3 * 2.0f) + 0.5);
        int n4 = 63;
        if (f2 >= -63.0f && f3 >= -63.0f && f2 <= 63.0f && f3 <= 63.0f) {
            by2 = (byte)((d4 += d4 < 0.0 ? -8.0 : 8.0) * 16.0 / 360.0);
            if (this.dTj < 0) {
                int n5 = (int)(w2.avH().getWorldTime() / 10L);
                by2 = (byte)(n5 * n5 * 34187121 + n5 * 121 >> 15 & 0xF);
            }
        } else {
            if (Math.abs(f2) >= 320.0f || Math.abs(f3) >= 320.0f) {
                this.dTo.remove(string);
                return;
            }
            n2 = 6;
            by2 = 0;
            if (f2 <= -63.0f) {
                by3 = -128;
            }
            if (f3 <= -63.0f) {
                by4 = -128;
            }
            if (f2 >= 63.0f) {
                by3 = 127;
            }
            if (f3 >= 63.0f) {
                by4 = 127;
            }
        }
        this.dTo.put(string, new dc((byte)n2, by3, by4, by2));
    }

    public aj f(co co2, w w2, a a2) {
        g g2 = this.dTn.get(a2);
        return g2 == null ? null : g2.aY(co2);
    }

    public void br(int n2, int n3) {
        super.Lw();
        for (g g2 : this.dTm) {
            g2.bs(n2, n3);
        }
    }

    public g Q(a a2) {
        g g2 = this.dTn.get(a2);
        if (g2 == null) {
            g2 = new g(this, a2);
            this.dTn.put(a2, g2);
            this.dTm.add(g2);
        }
        return g2;
    }
}

