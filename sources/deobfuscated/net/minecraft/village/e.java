/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.village;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.village.c;
import net.minecraft.village.f;
import net.minecraft.world.ac;
import net.minecraft.world.ah;
import net.minecraft.world.w;

public class e
extends ah {
    private w baU;
    private final List<b> dBq = Lists.newArrayList();
    private final List<f> dBr = Lists.newArrayList();
    private final List<c> dBs = Lists.newArrayList();
    private int qH;

    public e(String string) {
        super(string);
    }

    public e(w w2) {
        super(e.a(w2.dDl));
        this.baU = w2;
        this.Lw();
    }

    public void o(w w2) {
        this.baU = w2;
        for (c c2 : this.dBs) {
            c2.b(w2);
        }
    }

    public void aw(b b2) {
        if (this.dBq.size() <= 64 && !this.aA(b2)) {
            this.dBq.add(b2);
        }
    }

    public void tick() {
        ++this.qH;
        for (c c2 : this.dBs) {
            c2.hX(this.qH);
        }
        this.auy();
        this.auA();
        this.auB();
        if (this.qH % 400 == 0) {
            this.Lw();
        }
    }

    private void auy() {
        Iterator<c> iterator = this.dBs.iterator();
        while (iterator.hasNext()) {
            c c2 = iterator.next();
            if (!c2.aus()) continue;
            iterator.remove();
            this.Lw();
        }
    }

    public List<c> auz() {
        return this.dBs;
    }

    public c e(b b2, int n2) {
        c c2 = null;
        double d2 = 3.4028234663852886E38;
        for (c c3 : this.dBs) {
            float f2;
            double d3 = c3.aum().i(b2);
            if (!(d3 < d2) || !(d3 <= (double)((f2 = (float)(n2 + c3.aun())) * f2))) continue;
            c2 = c3;
            d2 = d3;
        }
        return c2;
    }

    private void auA() {
        if (!this.dBq.isEmpty()) {
            this.ax(this.dBq.remove(0));
        }
    }

    private void auB() {
        for (int i2 = 0; i2 < this.dBr.size(); ++i2) {
            f f2 = this.dBr.get(i2);
            c c2 = this.e(f2.auF(), 32);
            if (c2 == null) {
                c2 = new c(this.baU);
                this.dBs.add(c2);
                this.Lw();
            }
            c2.b(f2);
        }
        this.dBr.clear();
    }

    private void ax(b b2) {
        int n2 = 16;
        int n3 = 4;
        int n4 = 16;
        for (int i2 = -16; i2 < 16; ++i2) {
            for (int i3 = -4; i3 < 4; ++i3) {
                for (int i4 = -16; i4 < 16; ++i4) {
                    b b3 = b2.C(i2, i3, i4);
                    if (!this.av(b3)) continue;
                    f f2 = this.ay(b3);
                    if (f2 == null) {
                        this.az(b3);
                        continue;
                    }
                    f2.hZ(this.qH);
                }
            }
        }
    }

    private f ay(b b2) {
        for (f object : this.dBr) {
            if (object.auF().wt() != b2.wt() || object.auF().wx() != b2.wx() || Math.abs(object.auF().wu() - b2.wu()) > 1) continue;
            return object;
        }
        for (c c2 : this.dBs) {
            f f2 = c2.au(b2);
            if (f2 == null) continue;
            return f2;
        }
        return null;
    }

    private void az(b b2) {
        int n2;
        ao ao2 = BlockDoor.g(this.baU, b2);
        ao ao3 = ao2.asC();
        int n3 = this.a(b2, ao2, 5);
        if (n3 != (n2 = this.a(b2, ao3, n3 + 1))) {
            this.dBr.add(new f(b2, n3 < n2 ? ao2 : ao3, this.qH));
        }
    }

    private int a(b b2, ao ao2, int n2) {
        int n3 = 0;
        for (int i2 = 1; i2 <= 5; ++i2) {
            if (!this.baU.aM(b2.d(ao2, i2)) || ++n3 < n2) continue;
            return n3;
        }
        return n3;
    }

    private boolean aA(b b2) {
        for (b b3 : this.dBq) {
            if (!b3.equals(b2)) continue;
            return true;
        }
        return false;
    }

    private boolean av(b b2) {
        Block block = this.baU.L(b2).df();
        return block instanceof BlockDoor && block.xb() == Material.ber;
    }

    @Override
    public void a(n n2) {
        this.qH = n2.eG("Tick");
        v v2 = n2.D("Villages", 10);
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n3 = v2.gi(i2);
            c c2 = new c();
            c2.I(n3);
            this.dBs.add(c2);
        }
    }

    @Override
    public void b(n n2) {
        n2.B("Tick", this.qH);
        v v2 = new v();
        for (c c2 : this.dBs) {
            n n3 = new n();
            c2.J(n3);
            v2.a(n3);
        }
        n2.b("Villages", v2);
    }

    public static String a(ac ac2) {
        return "villages" + ac2.awd();
    }
}

