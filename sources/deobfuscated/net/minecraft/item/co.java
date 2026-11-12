/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Multimap
 */
package net.minecraft.item;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.enchantment.i;
import net.minecraft.enchantment.l;
import net.minecraft.entity.aj;
import net.minecraft.entity.item.j;
import net.minecraft.entity.r;
import net.minecraft.entity.z;
import net.minecraft.init.Items;
import net.minecraft.item.a;
import net.minecraft.item.ai;
import net.minecraft.item.c;
import net.minecraft.item.d;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.util.an;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.cm;
import net.minecraft.util.cr;
import net.minecraft.util.s;
import net.minecraft.world.w;

public final class co {
    public static final DecimalFormat cWY = new DecimalFormat("#.###");
    public int cWZ;
    public int cXa;
    public int cXb = 9999999;
    public int cXc;
    private d cXd;
    private n cXe;
    private int cXf;
    private j cXg;
    private Block cXh = null;
    private boolean cXi = false;
    private Block cXj = null;
    private boolean cXk = false;

    public co(Block block) {
        this(block, 1);
    }

    public co(Block block, int n2) {
        this(block, n2, 0);
    }

    public co(Block block, int n2, int n3) {
        this(d.I(block), n2, n3);
    }

    public co(d d2) {
        this(d2, 1);
    }

    public co(d d2, int n2) {
        this(d2, n2, 0);
    }

    public co(d d2, int n2, int n3) {
        this.cXd = d2;
        this.cWZ = n2;
        this.cXf = n3;
        if (this.cXf < 0) {
            this.cXf = 0;
        }
    }

    public static co s(n n2) {
        co co2 = new co();
        co2.a(n2);
        return co2.bP() != null ? co2 : null;
    }

    public int jX() {
        return this.cWZ;
    }

    public co() {
    }

    public co ge(int n2) {
        co co2 = new co(this.cXd, n2, this.cXf);
        if (this.cXe != null) {
            co2.cXe = (n)this.cXe.aeG();
        }
        this.cWZ -= n2;
        return co2;
    }

    public d bP() {
        return this.cXd;
    }

    public boolean a(net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        boolean bl2 = this.bP().a(this, a2, w2, b2, ao2, f2, f3, f4);
        if (bl2) {
            a2.a(net.minecraft.stats.n.dqE[d.p(this.cXd)]);
        }
        return bl2;
    }

    public float G(Block block) {
        return this.bP().a(this, block);
    }

    public co a(w w2, net.minecraft.entity.player.a a2) {
        return this.bP().a(this, w2, a2);
    }

    public co b(w w2, net.minecraft.entity.player.a a2) {
        return this.bP().b(this, w2, a2);
    }

    public n t(n n2) {
        cm cm2 = d.cVi.y(this.cXd);
        n2.R("id", cm2 == null ? "minecraft:air" : cm2.toString());
        n2.a("Count", (byte)this.cWZ);
        n2.a("Damage", (short)this.cXf);
        if (this.cXe != null) {
            n2.b("tag", this.cXe);
        }
        return n2;
    }

    public void a(n n2) {
        this.cXd = n2.C("id", 8) ? d.et(n2.eK("id")) : d.fT(n2.eF("id"));
        this.cWZ = n2.eE("Count");
        this.cXf = n2.eF("Damage");
        if (this.cXf < 0) {
            this.cXf = 0;
        }
        if (n2.C("tag", 10)) {
            this.cXe = n2.eN("tag");
            if (this.cXd != null) {
                this.cXd.q(this.cXe);
            }
        }
    }

    public int aeb() {
        return this.bP().adr();
    }

    public boolean aec() {
        return this.aeb() > 1 && (!this.aed() || !this.aee());
    }

    public boolean aed() {
        return this.cXd != null && this.cXd.adt() > 0 && (!this.aej() || !this.aek().eO("Unbreakable"));
    }

    public boolean ads() {
        return this.cXd.ads();
    }

    public boolean aee() {
        return this.aed() && this.cXf > 0;
    }

    public int aef() {
        return this.cXf;
    }

    public int yc() {
        return this.cXf;
    }

    public void gf(int n2) {
        this.cXf = n2;
        if (this.cXf < 0) {
            this.cXf = 0;
        }
    }

    public int adt() {
        return this.cXd.adt();
    }

    public boolean d(int n2, Random random) {
        if (!this.aed()) {
            return false;
        }
        if (n2 > 0) {
            int n3 = l.d(net.minecraft.enchantment.a.cqo.cqw, this);
            int n4 = 0;
            for (int i2 = 0; n3 > 0 && i2 < n2; ++i2) {
                if (!i.a(this, n3, random)) continue;
                ++n4;
            }
            if ((n2 -= n4) <= 0) {
                return false;
            }
        }
        this.cXf += n2;
        return this.cXf > this.adt();
    }

    public void b(int n2, r r2) {
        if ((!(r2 instanceof net.minecraft.entity.player.a) || !((net.minecraft.entity.player.a)r2).cIt.cJM) && this.aed() && this.d(n2, r2.VB())) {
            r2.X(this);
            --this.cWZ;
            if (r2 instanceof net.minecraft.entity.player.a) {
                net.minecraft.entity.player.a a2 = (net.minecraft.entity.player.a)r2;
                a2.a(net.minecraft.stats.n.dqF[d.p(this.cXd)]);
                if (this.cWZ == 0 && this.bP() instanceof ai) {
                    a2.abP();
                }
            }
            if (this.cWZ < 0) {
                this.cWZ = 0;
            }
            this.cXf = 0;
        }
    }

    public void a(r r2, net.minecraft.entity.player.a a2) {
        boolean bl2 = this.cXd.a(this, r2, (r)a2);
        if (bl2) {
            a2.a(net.minecraft.stats.n.dqE[d.p(this.cXd)]);
        }
    }

    public void a(w w2, Block block, b b2, net.minecraft.entity.player.a a2) {
        boolean bl2 = this.cXd.a(this, w2, block, b2, a2);
        if (bl2) {
            a2.a(net.minecraft.stats.n.dqE[d.p(this.cXd)]);
        }
    }

    public boolean F(Block block) {
        return this.cXd.F(block);
    }

    public boolean a(net.minecraft.entity.player.a a2, r r2) {
        return this.cXd.a(this, a2, r2);
    }

    public co aeg() {
        co co2 = new co(this.cXd, this.cWZ, this.cXf);
        if (this.cXe != null) {
            co2.cXe = (n)this.cXe.aeG();
        }
        return co2;
    }

    public static boolean c(co co2, co co3) {
        return co2 == null && co3 == null || co2 != null && co3 != null && (co2.cXe != null || co3.cXe == null) && (co2.cXe == null || co2.cXe.equals(co3.cXe));
    }

    public static boolean d(co co2, co co3) {
        return co2 == null && co3 == null || co2 != null && co3 != null && co2.aI(co3);
    }

    private boolean aI(co co2) {
        return !(this.cWZ != co2.cWZ || this.cXd != co2.cXd || this.cXf != co2.cXf || this.cXe == null && co2.cXe != null || this.cXe != null && !this.cXe.equals(co2.cXe));
    }

    public static boolean e(co co2, co co3) {
        return co2 == null && co3 == null || co2 != null && co3 != null && co2.aJ(co3);
    }

    public boolean aJ(co co2) {
        return co2 != null && this.cXd == co2.cXd && this.cXf == co2.cXf;
    }

    public String xB() {
        return this.cXd.ao(this);
    }

    public static co aK(co co2) {
        return co2 == null ? null : co2.aeg();
    }

    public String toString() {
        return this.cWZ + "x" + this.cXd.xB() + "@" + this.cXf;
    }

    public void a(w w2, net.minecraft.entity.c c2, int n2, boolean bl2) {
        if (this.cXc > 0) {
            --this.cXc;
        }
        ++this.cXb;
        if (this.cXb >= 20) {
            this.cXa = this.cWZ;
        }
        if (this.cXd != null) {
            this.cXd.a(this, w2, c2, n2, bl2);
        }
    }

    public void a(w w2, net.minecraft.entity.player.a a2, int n2) {
        a2.a(net.minecraft.stats.n.dqD[d.p(this.cXd)], n2);
        this.cXd.c(this, w2, a2);
    }

    public boolean aL(co co2) {
        return this.aI(co2);
    }

    public int aeh() {
        return this.bP().aq(this);
    }

    public a aei() {
        return this.bP().ap(this);
    }

    public void b(w w2, net.minecraft.entity.player.a a2, int n2) {
        this.bP().a(this, w2, a2, n2);
    }

    public boolean aej() {
        return this.cXe != null;
    }

    public n aek() {
        return this.cXe;
    }

    public n j(String string, boolean bl2) {
        if (this.cXe != null && this.cXe.C(string, 10)) {
            return this.cXe.eN(string);
        }
        if (bl2) {
            n n2 = new n();
            this.a(string, n2);
            return n2;
        }
        return null;
    }

    public v ael() {
        return this.cXe == null ? null : this.cXe.D("ench", 10);
    }

    public void u(n n2) {
        this.cXe = n2;
    }

    public String getDisplayName() {
        n n2;
        String string;
        String string2 = string = this.bP() != null ? this.bP().at(this) : "";
        if (this.cXe != null && this.cXe.C("display", 10) && (n2 = this.cXe.eN("display")).C("Name", 8)) {
            string = n2.eK("Name");
        }
        return string;
    }

    public co ey(String string) {
        if (this.cXe == null) {
            this.cXe = new n();
        }
        if (!this.cXe.C("display", 10)) {
            this.cXe.b("display", new n());
        }
        this.cXe.eN("display").R("Name", string);
        return this;
    }

    public void aem() {
        if (this.cXe != null && this.cXe.C("display", 10)) {
            n n2 = this.cXe.eN("display");
            n2.eP("Name");
            if (n2.aeH()) {
                this.cXe.eP("display");
                if (this.cXe.aeH()) {
                    this.u(null);
                }
            }
        }
    }

    public boolean aen() {
        return this.cXe != null && this.cXe.C("display", 10) && this.cXe.eN("display").C("Name", 8);
    }

    public List<String> d(net.minecraft.entity.player.a a2, boolean bl2) {
        v v2;
        v v3;
        Multimap<String, net.minecraft.entity.ai.attributes.a> multimap;
        ArrayList arrayList = Lists.newArrayList();
        Object object = this.getDisplayName();
        if (this.aen()) {
            object = String.valueOf((Object)an.dwg) + (String)object;
        }
        object = (String)object + String.valueOf((Object)an.dwh);
        if (bl2) {
            String string = "";
            if (((String)object).length() > 0) {
                object = (String)object + " (";
                string = ")";
            }
            int n2 = d.p(this.cXd);
            object = this.ads() ? (String)object + String.format("#%04d/%d%s", n2, this.cXf, string) : (String)object + String.format("#%04d%s", n2, string);
        } else if (!this.aen() && this.cXd == Items.cRh) {
            object = (String)object + " #" + this.cXf;
        }
        arrayList.add(object);
        int n3 = 0;
        if (this.aej() && this.cXe.C("HideFlags", 99)) {
            n3 = this.cXe.eG("HideFlags");
        }
        if ((n3 & 0x20) == 0) {
            this.cXd.a(this, a2, arrayList, bl2);
        }
        if (this.aej()) {
            int n4;
            v v4;
            if ((n3 & 1) == 0 && (v4 = this.ael()) != null) {
                for (int i2 = 0; i2 < v4.aeS(); ++i2) {
                    n4 = v4.gi(i2).eF("id");
                    short s2 = v4.gi(i2).eF("lvl");
                    if (net.minecraft.enchantment.a.eh(n4) == null) continue;
                    arrayList.add(net.minecraft.enchantment.a.eh(n4).ek(s2));
                }
            }
            if (this.cXe.C("display", 10)) {
                v v5;
                n n5 = this.cXe.eN("display");
                if (n5.C("color", 3)) {
                    if (bl2) {
                        arrayList.add("Color: #" + Integer.toHexString(n5.eG("color")).toUpperCase());
                    } else {
                        arrayList.add(String.valueOf((Object)an.dwg) + cr.gm("item.dyed"));
                    }
                }
                if (n5.eC("Lore") == 9 && (v5 = n5.D("Lore", 8)).aeS() > 0) {
                    for (n4 = 0; n4 < v5.aeS(); ++n4) {
                        arrayList.add(String.valueOf((Object)an.dvQ) + String.valueOf((Object)an.dwg) + v5.gm(n4));
                    }
                }
            }
        }
        if (!(multimap = this.aew()).isEmpty() && (n3 & 2) == 0) {
            arrayList.add("");
            for (Map.Entry entry : multimap.entries()) {
                net.minecraft.entity.ai.attributes.a a3 = (net.minecraft.entity.ai.attributes.a)entry.getValue();
                double d2 = a3.Xq();
                if (a3.Xo() == d.cVk) {
                    d2 += (double)l.b(this, z.cvT);
                }
                double d3 = a3.Xp() != 1 && a3.Xp() != 2 ? d2 : d2 * 100.0;
                if (d2 > 0.0) {
                    arrayList.add(String.valueOf((Object)an.dvU) + cr.c("attribute.modifier.plus." + a3.Xp(), cWY.format(d3), cr.gm("attribute.name." + (String)entry.getKey())));
                    continue;
                }
                if (!(d2 < 0.0)) continue;
                arrayList.add(String.valueOf((Object)an.dvX) + cr.c("attribute.modifier.take." + a3.Xp(), cWY.format(d3 *= -1.0), cr.gm("attribute.name." + (String)entry.getKey())));
            }
        }
        if (this.aej() && this.aek().eO("Unbreakable") && (n3 & 4) == 0) {
            arrayList.add(String.valueOf((Object)an.dvU) + cr.gm("item.unbreakable"));
        }
        if (this.aej() && this.cXe.C("CanDestroy", 9) && (n3 & 8) == 0 && (v3 = this.cXe.D("CanDestroy", 8)).aeS() > 0) {
            arrayList.add("");
            arrayList.add(String.valueOf((Object)an.dvS) + cr.gm("item.canBreak"));
            for (int i3 = 0; i3 < v3.aeS(); ++i3) {
                Block block = Block.cq(v3.gm(i3));
                if (block != null) {
                    arrayList.add(String.valueOf((Object)an.dvT) + block.xA());
                    continue;
                }
                arrayList.add(String.valueOf((Object)an.dvT) + "missingno");
            }
        }
        if (this.aej() && this.cXe.C("CanPlaceOn", 9) && (n3 & 0x10) == 0 && (v2 = this.cXe.D("CanPlaceOn", 8)).aeS() > 0) {
            arrayList.add("");
            arrayList.add(String.valueOf((Object)an.dvS) + cr.gm("item.canPlace"));
            for (int i4 = 0; i4 < v2.aeS(); ++i4) {
                Block block = Block.cq(v2.gm(i4));
                if (block != null) {
                    arrayList.add(String.valueOf((Object)an.dvT) + block.xA());
                    continue;
                }
                arrayList.add(String.valueOf((Object)an.dvT) + "missingno");
            }
        }
        if (bl2) {
            if (this.aee()) {
                arrayList.add("Durability: " + (this.adt() - this.aef()) + " / " + this.adt());
            }
            arrayList.add(String.valueOf((Object)an.dvT) + d.cVi.y(this.cXd).toString());
            if (this.aej()) {
                arrayList.add(String.valueOf((Object)an.dvT) + "NBT: " + this.aek().aeQ().size() + " tag(s)");
            }
        }
        return arrayList;
    }

    public boolean aeo() {
        return this.bP() != null && this.bP().au(this);
    }

    public c aep() {
        return this.bP().av(this);
    }

    public boolean aeq() {
        return this.bP().aw(this) && !this.aer();
    }

    public void b(net.minecraft.enchantment.a a2, int n2) {
        if (this.cXe == null) {
            this.u(new n());
        }
        if (!this.cXe.C("ench", 9)) {
            this.cXe.b("ench", new v());
        }
        v v2 = this.cXe.D("ench", 10);
        n n3 = new n();
        n3.a("id", (short)a2.cqw);
        n3.a("lvl", (short)((byte)n2));
        v2.a(n3);
    }

    public boolean aer() {
        return this.cXe != null && this.cXe.C("ench", 9);
    }

    public void a(String string, g g2) {
        if (this.cXe == null) {
            this.u(new n());
        }
        this.cXe.b(string, g2);
    }

    public boolean aes() {
        return this.bP().adE();
    }

    public boolean aet() {
        return this.cXg != null;
    }

    public void d(j j2) {
        this.cXg = j2;
    }

    public j aeu() {
        return this.cXg;
    }

    public int aev() {
        return this.aej() && this.cXe.C("RepairCost", 3) ? this.cXe.eG("RepairCost") : 0;
    }

    public void gg(int n2) {
        if (!this.aej()) {
            this.cXe = new n();
        }
        this.cXe.B("RepairCost", n2);
    }

    public Multimap<String, net.minecraft.entity.ai.attributes.a> aew() {
        HashMultimap hashMultimap;
        if (this.aej() && this.cXe.C("AttributeModifiers", 9)) {
            hashMultimap = HashMultimap.create();
            v v2 = this.cXe.D("AttributeModifiers", 10);
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                n n2 = v2.gi(i2);
                net.minecraft.entity.ai.attributes.a a2 = aj.m(n2);
                if (a2 == null || a2.Xo().getLeastSignificantBits() == 0L || a2.Xo().getMostSignificantBits() == 0L) continue;
                hashMultimap.put((Object)n2.eK("AttributeName"), (Object)a2);
            }
        } else {
            hashMultimap = this.bP().adF();
        }
        return hashMultimap;
    }

    public void r(d d2) {
        this.cXd = d2;
    }

    public ba DM() {
        s s2 = new s(this.getDisplayName());
        if (this.aen()) {
            s2.arp().g(true);
        }
        ba ba2 = new s("[").n(s2).ga("]");
        if (this.cXd != null) {
            n n2 = new n();
            this.t(n2);
            ba2.arp().a(new net.minecraft.event.c(net.minecraft.event.d.cKW, new s(n2.toString())));
            ba2.arp().b(this.aep().cVf);
        }
        return ba2;
    }

    public boolean K(Block block) {
        if (block == this.cXh) {
            return this.cXi;
        }
        this.cXh = block;
        if (this.aej() && this.cXe.C("CanDestroy", 9)) {
            v v2 = this.cXe.D("CanDestroy", 8);
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                Block block2 = Block.cq(v2.gm(i2));
                if (block2 != block) continue;
                this.cXi = true;
                return true;
            }
        }
        this.cXi = false;
        return false;
    }

    public boolean w(Block block) {
        if (block == this.cXj) {
            return this.cXk;
        }
        this.cXj = block;
        if (this.aej() && this.cXe.C("CanPlaceOn", 9)) {
            v v2 = this.cXe.D("CanPlaceOn", 8);
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                Block block2 = Block.cq(v2.gm(i2));
                if (block2 != block) continue;
                this.cXk = true;
                return true;
            }
        }
        this.cXk = false;
        return false;
    }
}

