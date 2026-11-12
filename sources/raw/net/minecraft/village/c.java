/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.village;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.w;
import net.minecraft.entity.passive.z;
import net.minecraft.entity.r;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerProfileCache;
import net.minecraft.util.a;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import net.minecraft.village.d;
import net.minecraft.village.f;

public class c {
    private net.minecraft.world.w baU;
    private final List<f> dBe = Lists.newArrayList();
    private b dBf = b.dtN;
    private b dBg = b.dtN;
    private int dBh;
    private int dBi;
    private int qH;
    private int dBj;
    private int dBk;
    private final TreeMap<String, Integer> dBl = new TreeMap();
    private final List<d> dBm = Lists.newArrayList();
    private int dBn;

    public c() {
    }

    public c(net.minecraft.world.w w2) {
        this.baU = w2;
    }

    public void b(net.minecraft.world.w w2) {
        this.baU = w2;
    }

    public void hX(int n2) {
        da da2;
        int n3;
        this.qH = n2;
        this.auu();
        this.aut();
        if (n2 % 20 == 0) {
            this.aul();
        }
        if (n2 % 30 == 0) {
            this.auk();
        }
        if (this.dBn < (n3 = this.dBj / 10) && this.dBe.size() > 20 && this.baU.dDk.nextInt(7000) == 0 && (da2 = this.c(this.dBg, 2, 4, 2)) != null) {
            w w2 = new w(this.baU);
            w2.setPosition(da2.dAG, da2.dAH, da2.dAI);
            this.baU.G(w2);
            ++this.dBn;
        }
    }

    private da c(b b2, int n2, int n3, int n4) {
        for (int i2 = 0; i2 < 10; ++i2) {
            b b3 = b2.C(this.baU.dDk.nextInt(16) - 8, this.baU.dDk.nextInt(6) - 3, this.baU.dDk.nextInt(16) - 8);
            if (!this.ar(b3) || !this.d(new b(n2, n3, n4), b3)) continue;
            return new da(b3.wt(), b3.wu(), b3.wx());
        }
        return null;
    }

    private boolean d(b b2, b b3) {
        if (!net.minecraft.world.w.v(this.baU, b3.aqY())) {
            return false;
        }
        int n2 = b3.wt() - b2.wt() / 2;
        int n3 = b3.wx() - b2.wx() / 2;
        for (int i2 = n2; i2 < n2 + b2.wt(); ++i2) {
            for (int i3 = b3.wu(); i3 < b3.wu() + b2.wu(); ++i3) {
                for (int i4 = n3; i4 < n3 + b2.wx(); ++i4) {
                    if (!this.baU.L(new b(i2, i3, i4)).df().xd()) continue;
                    return false;
                }
            }
        }
        return true;
    }

    private void auk() {
        List<w> list = this.baU.a(w.class, new a(this.dBg.wt() - this.dBh, this.dBg.wu() - 4, this.dBg.wx() - this.dBh, this.dBg.wt() + this.dBh, this.dBg.wu() + 4, this.dBg.wx() + this.dBh));
        this.dBn = list.size();
    }

    private void aul() {
        List<z> list = this.baU.a(z.class, new a(this.dBg.wt() - this.dBh, this.dBg.wu() - 4, this.dBg.wx() - this.dBh, this.dBg.wt() + this.dBh, this.dBg.wu() + 4, this.dBg.wx() + this.dBh));
        this.dBj = list.size();
        if (this.dBj == 0) {
            this.dBl.clear();
        }
    }

    public b aum() {
        return this.dBg;
    }

    public int aun() {
        return this.dBh;
    }

    public int auo() {
        return this.dBe.size();
    }

    public int aup() {
        return this.qH - this.dBi;
    }

    public int auq() {
        return this.dBj;
    }

    public boolean ar(b b2) {
        return this.dBg.i(b2) < (double)(this.dBh * this.dBh);
    }

    public List<f> aur() {
        return this.dBe;
    }

    public f as(b b2) {
        f f2 = null;
        int n2 = Integer.MAX_VALUE;
        for (f f3 : this.dBe) {
            int n3 = f3.aB(b2);
            if (n3 >= n2) continue;
            f2 = f3;
            n2 = n3;
        }
        return f2;
    }

    public f at(b b2) {
        f f2 = null;
        int n2 = Integer.MAX_VALUE;
        for (f f3 : this.dBe) {
            int n3 = f3.aB(b2);
            n3 = n3 > 256 ? (n3 *= 1000) : f3.auE();
            if (n3 >= n2) continue;
            f2 = f3;
            n2 = n3;
        }
        return f2;
    }

    public f au(b b2) {
        if (this.dBg.i(b2) > (double)(this.dBh * this.dBh)) {
            return null;
        }
        for (f f2 : this.dBe) {
            if (f2.auF().wt() != b2.wt() || f2.auF().wx() != b2.wx() || Math.abs(f2.auF().wu() - b2.wu()) > 1) continue;
            return f2;
        }
        return null;
    }

    public void b(f f2) {
        this.dBe.add(f2);
        this.dBf = this.dBf.b(f2.auF());
        this.auv();
        this.dBi = f2.auJ();
    }

    public boolean aus() {
        return this.dBe.isEmpty();
    }

    public void ae(r r2) {
        for (d d2 : this.dBm) {
            if (d2.dBo != r2) continue;
            d2.dBp = this.qH;
            return;
        }
        this.dBm.add(new d(this, r2, this.qH));
    }

    public r af(r r2) {
        double d2 = Double.MAX_VALUE;
        d d3 = null;
        for (int i2 = 0; i2 < this.dBm.size(); ++i2) {
            d d4 = this.dBm.get(i2);
            double d5 = d4.dBo.T((net.minecraft.entity.c)r2);
            if (!(d5 <= d2)) continue;
            d3 = d4;
            d2 = d5;
        }
        return d3 != null ? d3.dBo : null;
    }

    public net.minecraft.entity.player.a ag(r r2) {
        double d2 = Double.MAX_VALUE;
        net.minecraft.entity.player.a a2 = null;
        for (String string : this.dBl.keySet()) {
            double d3;
            net.minecraft.entity.player.a a3;
            if (!this.gu(string) || (a3 = this.baU.gz(string)) == null || !((d3 = a3.T((net.minecraft.entity.c)r2)) <= d2)) continue;
            a2 = a3;
            d2 = d3;
        }
        return a2;
    }

    private void aut() {
        Iterator<d> iterator = this.dBm.iterator();
        while (iterator.hasNext()) {
            d d2 = iterator.next();
            if (d2.dBo.TS() && Math.abs(this.qH - d2.dBp) <= 300) continue;
            iterator.remove();
        }
    }

    private void auu() {
        boolean bl2 = false;
        boolean bl3 = this.baU.dDk.nextInt(50) == 0;
        Iterator<f> iterator = this.dBe.iterator();
        while (iterator.hasNext()) {
            f f2 = iterator.next();
            if (bl3) {
                f2.auC();
            }
            if (this.av(f2.auF()) && Math.abs(this.qH - f2.auJ()) <= 1200) continue;
            this.dBf = this.dBf.c(f2.auF());
            bl2 = true;
            f2.cr(true);
            iterator.remove();
        }
        if (bl2) {
            this.auv();
        }
    }

    private boolean av(b b2) {
        Block block = this.baU.L(b2).df();
        return block instanceof BlockDoor && block.xb() == Material.ber;
    }

    private void auv() {
        int n2 = this.dBe.size();
        if (n2 == 0) {
            this.dBg = new b(0, 0, 0);
            this.dBh = 0;
        } else {
            this.dBg = new b(this.dBf.wt() / n2, this.dBf.wu() / n2, this.dBf.wx() / n2);
            int n3 = 0;
            for (f f2 : this.dBe) {
                n3 = Math.max(f2.aB(this.dBg), n3);
            }
            this.dBh = Math.max(32, (int)Math.sqrt(n3) + 1);
        }
    }

    public int gt(String string) {
        Integer n2 = this.dBl.get(string);
        return n2 != null ? n2 : 0;
    }

    public int H(String string, int n2) {
        int n3 = this.gt(string);
        int n4 = bt.F(n3 + n2, -30, 10);
        this.dBl.put(string, n4);
        return n4;
    }

    public boolean gu(String string) {
        return this.gt(string) <= -15;
    }

    public void I(n n2) {
        Object object;
        this.dBj = n2.eG("PopSize");
        this.dBh = n2.eG("Radius");
        this.dBn = n2.eG("Golems");
        this.dBi = n2.eG("Stable");
        this.qH = n2.eG("Tick");
        this.dBk = n2.eG("MTick");
        this.dBg = new b(n2.eG("CX"), n2.eG("CY"), n2.eG("CZ"));
        this.dBf = new b(n2.eG("ACX"), n2.eG("ACY"), n2.eG("ACZ"));
        v v2 = n2.D("Doors", 10);
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            n n3 = v2.gi(i2);
            object = new f(new b(n3.eG("X"), n3.eG("Y"), n3.eG("Z")), n3.eG("IDX"), n3.eG("IDZ"), n3.eG("TS"));
            this.dBe.add((f)object);
        }
        v v3 = n2.D("Players", 10);
        for (int i3 = 0; i3 < v3.aeS(); ++i3) {
            object = v3.gi(i3);
            if (((n)object).eD("UUID")) {
                PlayerProfileCache playerProfileCache = MinecraftServer.afs().alS();
                GameProfile gameProfile = playerProfileCache.k(UUID.fromString(((n)object).eK("UUID")));
                if (gameProfile == null) continue;
                this.dBl.put(gameProfile.getName(), ((n)object).eG("S"));
                continue;
            }
            this.dBl.put(((n)object).eK("Name"), ((n)object).eG("S"));
        }
    }

    public void J(n n2) {
        n2.B("PopSize", this.dBj);
        n2.B("Radius", this.dBh);
        n2.B("Golems", this.dBn);
        n2.B("Stable", this.dBi);
        n2.B("Tick", this.qH);
        n2.B("MTick", this.dBk);
        n2.B("CX", this.dBg.wt());
        n2.B("CY", this.dBg.wu());
        n2.B("CZ", this.dBg.wx());
        n2.B("ACX", this.dBf.wt());
        n2.B("ACY", this.dBf.wu());
        n2.B("ACZ", this.dBf.wx());
        v v2 = new v();
        for (f object : this.dBe) {
            n n3 = new n();
            n3.B("X", object.auF().wt());
            n3.B("Y", object.auF().wu());
            n3.B("Z", object.auF().wx());
            n3.B("IDX", object.auH());
            n3.B("IDZ", object.auI());
            n3.B("TS", object.auJ());
            v2.a(n3);
        }
        n2.b("Doors", v2);
        v v3 = new v();
        for (String string : this.dBl.keySet()) {
            n n4 = new n();
            PlayerProfileCache playerProfileCache = MinecraftServer.afs().alS();
            GameProfile gameProfile = playerProfileCache.fE(string);
            if (gameProfile == null) continue;
            n4.R("UUID", gameProfile.getId().toString());
            n4.B("S", this.dBl.get(string));
            v3.a(n4);
        }
        n2.b("Players", v3);
    }

    public void auw() {
        this.dBk = this.qH;
    }

    public boolean auxx() {
        return this.dBk == 0 || this.qH - this.dBk >= 3600;
    }

    public void hY(int n2) {
        for (String string : this.dBl.keySet()) {
            this.H(string, n2);
        }
    }
}

