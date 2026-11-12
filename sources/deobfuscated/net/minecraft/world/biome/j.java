/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.world.biome;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSand$EnumType;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.ap;
import net.minecraft.entity.monster.at;
import net.minecraft.entity.monster.au;
import net.minecraft.entity.monster.e;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.g;
import net.minecraft.world.biome.aa;
import net.minecraft.world.biome.ab;
import net.minecraft.world.biome.ac;
import net.minecraft.world.biome.ad;
import net.minecraft.world.biome.af;
import net.minecraft.world.biome.ag;
import net.minecraft.world.biome.ah;
import net.minecraft.world.biome.ai;
import net.minecraft.world.biome.h;
import net.minecraft.world.biome.l;
import net.minecraft.world.biome.m;
import net.minecraft.world.biome.n;
import net.minecraft.world.biome.o;
import net.minecraft.world.biome.p;
import net.minecraft.world.biome.q;
import net.minecraft.world.biome.r;
import net.minecraft.world.biome.u;
import net.minecraft.world.biome.v;
import net.minecraft.world.biome.x;
import net.minecraft.world.biome.y;
import net.minecraft.world.biome.z;
import net.minecraft.world.c;
import net.minecraft.world.chunk.f;
import net.minecraft.world.d;
import net.minecraft.world.gen.feature.a;
import net.minecraft.world.gen.feature.ak;
import net.minecraft.world.gen.feature.al;
import net.minecraft.world.gen.feature.ao;
import net.minecraft.world.gen.feature.k;
import net.minecraft.world.gen.t;
import net.minecraft.world.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class j {
    private static final Logger dFO = LogManager.getLogger();
    protected static final l dFP = new l(0.1f, 0.2f);
    protected static final l dFQ = new l(-0.5f, 0.0f);
    protected static final l dFR = new l(-1.0f, 0.1f);
    protected static final l dFS = new l(-1.8f, 0.1f);
    protected static final l dFT = new l(0.125f, 0.05f);
    protected static final l dFU = new l(0.2f, 0.2f);
    protected static final l dFV = new l(0.45f, 0.3f);
    protected static final l dFW = new l(1.5f, 0.025f);
    protected static final l dFX = new l(1.0f, 0.5f);
    protected static final l dFY = new l(0.0f, 0.025f);
    protected static final l dFZ = new l(0.1f, 0.8f);
    protected static final l dGa = new l(0.2f, 0.3f);
    protected static final l dGb = new l(-0.2f, 0.1f);
    private static final j[] dGc = new j[256];
    public static final Set<j> dGd = Sets.newHashSet();
    public static final Map<String, j> dGe = Maps.newHashMap();
    public static final j dGf = new aa(0).il(112).gE("Ocean").a(dFR);
    public static final j dGg = new ab(1).il(9286496).gE("Plains");
    public static final j dGh = new p(2).il(16421912).gE("Desert").awU().B(2.0f, 0.0f).a(dFT);
    public static final j dGi = new v(3, false).il(0x606060).gE("Extreme Hills").a(dFX).B(0.2f, 0.3f);
    public static final j dGj = new r(4, 0).il(353825).gE("Forest");
    public static final j dGk = new ai(5, 0).il(747097).gE("Taiga").ik(5159473).B(0.25f, 0.8f).a(dFU);
    public static final j dGl = new ah(6).il(522674).gE("Swampland").ik(9154376).a(dGb).B(0.8f, 0.9f);
    public static final j dGm = new ac(7).il(255).gE("River").a(dFQ);
    public static final j dGn = new u(8).il(0xFF0000).gE("Hell").awU().B(2.0f, 0.0f);
    public static final j dGo = new q(9).il(0x8080FF).gE("The End").awU();
    public static final j dGp = new aa(10).il(0x9090A0).gE("FrozenOcean").awV().a(dFR).B(0.0f, 0.5f);
    public static final j dGq = new ac(11).il(0xA0A0FF).gE("FrozenRiver").awV().a(dFQ).B(0.0f, 0.5f);
    public static final j dGr = new af(12, false).il(0xFFFFFF).gE("Ice Plains").awV().B(0.0f, 0.5f).a(dFT);
    public static final j dGs = new af(13, false).il(0xA0A0A0).gE("Ice Mountains").awV().a(dFV).B(0.0f, 0.5f);
    public static final j dGt = new y(14).il(0xFF00FF).gE("MushroomIsland").B(0.9f, 1.0f).a(dGa);
    public static final j dGu = new y(15).il(0xA000FF).gE("MushroomIslandShore").B(0.9f, 1.0f).a(dFY);
    public static final j dGv = new o(16).il(16440917).gE("Beach").B(0.8f, 0.4f).a(dFY);
    public static final j dGw = new p(17).il(13786898).gE("DesertHills").awU().B(2.0f, 0.0f).a(dFV);
    public static final j dGx = new r(18, 0).il(2250012).gE("ForestHills").a(dFV);
    public static final j dGy = new ai(19, 0).il(1456435).gE("TaigaHills").ik(5159473).B(0.25f, 0.8f).a(dFV);
    public static final j dGz = new v(20, true).il(7501978).gE("Extreme Hills Edge").a(dFX.axh()).B(0.2f, 0.3f);
    public static final j dGA = new net.minecraft.world.biome.w(21, false).il(5470985).gE("Jungle").ik(5470985).B(0.95f, 0.9f);
    public static final j dGB = new net.minecraft.world.biome.w(22, false).il(2900485).gE("JungleHills").ik(5470985).B(0.95f, 0.9f).a(dFV);
    public static final j dGC = new net.minecraft.world.biome.w(23, true).il(6458135).gE("JungleEdge").ik(5470985).B(0.95f, 0.8f);
    public static final j dGD = new aa(24).il(48).gE("Deep Ocean").a(dFS);
    public static final j dGE = new ag(25).il(10658436).gE("Stone Beach").B(0.2f, 0.3f).a(dFZ);
    public static final j dGF = new o(26).il(16445632).gE("Cold Beach").B(0.05f, 0.3f).a(dFY).awV();
    public static final j dGG = new r(27, 2).gE("Birch Forest").il(3175492);
    public static final j dGH = new r(28, 2).gE("Birch Forest Hills").il(2055986).a(dFV);
    public static final j dGI = new r(29, 3).il(4215066).gE("Roofed Forest");
    public static final j dGJ = new ai(30, 0).il(3233098).gE("Cold Taiga").ik(5159473).awV().B(-0.5f, 0.4f).a(dFU).im(0xFFFFFF);
    public static final j dGK = new ai(31, 0).il(2375478).gE("Cold Taiga Hills").ik(5159473).awV().B(-0.5f, 0.4f).a(dFV).im(0xFFFFFF);
    public static final j dGL = new ai(32, 1).il(5858897).gE("Mega Taiga").ik(5159473).B(0.3f, 0.8f).a(dFU);
    public static final j dGM = new ai(33, 1).il(4542270).gE("Mega Taiga Hills").ik(5159473).B(0.3f, 0.8f).a(dFV);
    public static final j dGN = new v(34, true).il(0x507050).gE("Extreme Hills+").a(dFX).B(0.2f, 0.3f);
    public static final j dGO = new ad(35).il(12431967).gE("Savanna").B(1.2f, 0.0f).awU().a(dFT);
    public static final j dGP = new ad(36).il(10984804).gE("Savanna Plateau").B(1.0f, 0.0f).awU().a(dFW);
    public static final j dGQ = new x(37, false, false).il(14238997).gE("Mesa");
    public static final j dGR = new x(38, false, true).il(11573093).gE("Mesa Plateau F").a(dFW);
    public static final j dGS = new x(39, false, false).il(13274213).gE("Mesa Plateau").a(dFW);
    public static final j dGT = dGf;
    protected static final t dGU;
    protected static final t dGV;
    protected static final k dGW;
    public String dGX;
    public int lp;
    public int dGY;
    public IBlockState dGZ = Blocks.cLe.xM();
    public IBlockState dHa = Blocks.cLf.xM();
    public int dHb = 5169201;
    public float dHc;
    public float dHd;
    public float dHe;
    public float dHf;
    public int dHg;
    public h dHh;
    protected List<m> dHi;
    protected List<m> dHj;
    protected List<m> dHk;
    protected List<m> dHl;
    protected boolean dHm;
    protected boolean dHn;
    public final int dHo;
    protected al dHp;
    protected net.minecraft.world.gen.feature.c dHq;
    protected net.minecraft.world.gen.feature.ah dHr;

    protected j(int n2) {
        this.dHc = j.dFP.dHt;
        this.dHd = j.dFP.dHu;
        this.dHe = 0.5f;
        this.dHf = 0.5f;
        this.dHg = 0xFFFFFF;
        this.dHi = Lists.newArrayList();
        this.dHj = Lists.newArrayList();
        this.dHk = Lists.newArrayList();
        this.dHl = Lists.newArrayList();
        this.dHn = true;
        this.dHp = new al(false);
        this.dHq = new net.minecraft.world.gen.feature.c(false);
        this.dHr = new net.minecraft.world.gen.feature.ah();
        this.dHo = n2;
        j.dGc[n2] = this;
        this.dHh = this.awT();
        this.dHj.add(new m(net.minecraft.entity.passive.u.class, 12, 4, 4));
        this.dHj.add(new m(net.minecraft.entity.passive.l.class, 10, 3, 3));
        this.dHj.add(new m(net.minecraft.entity.passive.k.class, 10, 4, 4));
        this.dHj.add(new m(net.minecraft.entity.passive.d.class, 10, 4, 4));
        this.dHj.add(new m(net.minecraft.entity.passive.e.class, 8, 4, 4));
        this.dHi.add(new m(ap.class, 100, 4, 4));
        this.dHi.add(new m(au.class, 100, 4, 4));
        this.dHi.add(new m(net.minecraft.entity.monster.ah.class, 100, 4, 4));
        this.dHi.add(new m(net.minecraft.entity.monster.d.class, 100, 4, 4));
        this.dHi.add(new m(net.minecraft.entity.monster.ai.class, 100, 4, 4));
        this.dHi.add(new m(e.class, 10, 1, 4));
        this.dHi.add(new m(at.class, 5, 1, 1));
        this.dHk.add(new m(net.minecraft.entity.passive.w.class, 10, 4, 4));
        this.dHl.add(new m(net.minecraft.entity.passive.c.class, 10, 8, 8));
    }

    protected h awT() {
        return new h();
    }

    protected j B(float f2, float f3) {
        if (f2 > 0.1f && f2 < 0.2f) {
            throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
        }
        this.dHe = f2;
        this.dHf = f3;
        return this;
    }

    protected final j a(l l2) {
        this.dHc = l2.dHt;
        this.dHd = l2.dHu;
        return this;
    }

    protected j awU() {
        this.dHn = false;
        return this;
    }

    public a j(Random random) {
        return random.nextInt(10) == 0 ? this.dHq : this.dHp;
    }

    public ao k(Random random) {
        return new ak(BlockTallGrass$EnumType.bcz);
    }

    public BlockFlower$EnumFlowerType a(Random random, b b2) {
        return random.nextInt(3) > 0 ? BlockFlower$EnumFlowerType.aVa : BlockFlower$EnumFlowerType.aVb;
    }

    protected j awV() {
        this.dHm = true;
        return this;
    }

    protected j gE(String string) {
        this.dGX = string;
        return this;
    }

    protected j ik(int n2) {
        this.dHb = n2;
        return this;
    }

    protected j il(int n2) {
        this.s(n2, false);
        return this;
    }

    protected j im(int n2) {
        this.dGY = n2;
        return this;
    }

    protected j s(int n2, boolean bl2) {
        this.lp = n2;
        this.dGY = bl2 ? (n2 & 0xFEFEFE) >> 1 : n2;
        return this;
    }

    public int cc(float f2) {
        f2 /= 3.0f;
        f2 = bt.I(f2, -1.0f, 1.0f);
        return bt.K(0.62222224f - f2 * 0.05f, 0.5f + f2 * 0.1f, 1.0f);
    }

    public List<m> a(net.minecraft.entity.aa aa2) {
        switch (aa2) {
            case cvX: {
                return this.dHi;
            }
            case cvY: {
                return this.dHj;
            }
            case cwa: {
                return this.dHk;
            }
            case cvZ: {
                return this.dHl;
            }
        }
        return Collections.emptyList();
    }

    public boolean awW() {
        return this.axc();
    }

    public boolean awX() {
        return !this.axc() && this.dHn;
    }

    public boolean awY() {
        return this.dHf > 0.85f;
    }

    public float awZ() {
        return 0.1f;
    }

    public final int axa() {
        return (int)(this.dHf * 65536.0f);
    }

    public final float axb() {
        return this.dHf;
    }

    public final float bi(b b2) {
        if (b2.wu() > 64) {
            float f2 = (float)(dGU.D((double)b2.wt() * 1.0 / 8.0, (double)b2.wx() * 1.0 / 8.0) * 4.0);
            return this.dHe - (f2 + (float)b2.wu() - 64.0f) * 0.05f / 30.0f;
        }
        return this.dHe;
    }

    public void a(w w2, Random random, b b2) {
        this.dHh.a(w2, random, this, b2);
    }

    public int bj(b b2) {
        double d2 = bt.I(this.bi(b2), 0.0f, 1.0f);
        double d3 = bt.I(this.axb(), 0.0f, 1.0f);
        return d.A(d2, d3);
    }

    public int bk(b b2) {
        double d2 = bt.I(this.bi(b2), 0.0f, 1.0f);
        double d3 = bt.I(this.axb(), 0.0f, 1.0f);
        return c.z(d2, d3);
    }

    public boolean axc() {
        return this.dHm;
    }

    public void a(w w2, Random random, f f2, int n2, int n3, double d2) {
        this.b(w2, random, f2, n2, n3, d2);
    }

    public final void b(w w2, Random random, f f2, int n2, int n3, double d2) {
        int n4 = w2.avB();
        IBlockState iBlockState = this.dGZ;
        IBlockState iBlockState2 = this.dHa;
        int n5 = -1;
        int n6 = (int)(d2 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        int n7 = n2 & 0xF;
        int n8 = n3 & 0xF;
        g g2 = new g();
        for (int i2 = 255; i2 >= 0; --i2) {
            if (i2 <= random.nextInt(5)) {
                f2.a(n8, i2, n7, Blocks.cLj.xM());
                continue;
            }
            IBlockState iBlockState3 = f2.S(n8, i2, n7);
            if (iBlockState3.df().xb() == Material.beo) {
                n5 = -1;
                continue;
            }
            if (iBlockState3.df() != Blocks.cLd) continue;
            if (n5 == -1) {
                if (n6 <= 0) {
                    iBlockState = null;
                    iBlockState2 = Blocks.cLd.xM();
                } else if (i2 >= n4 - 4 && i2 <= n4 + 1) {
                    iBlockState = this.dGZ;
                    iBlockState2 = this.dHa;
                }
                if (i2 < n4 && (iBlockState == null || iBlockState.df().xb() == Material.beo)) {
                    iBlockState = this.bi(g2.E(n2, i2, n3)) < 0.15f ? Blocks.cMK.xM() : Blocks.cLl.xM();
                }
                n5 = n6;
                if (i2 >= n4 - 1) {
                    f2.a(n8, i2, n7, iBlockState);
                    continue;
                }
                if (i2 < n4 - 7 - n6) {
                    iBlockState = null;
                    iBlockState2 = Blocks.cLd.xM();
                    f2.a(n8, i2, n7, Blocks.cLp.xM());
                    continue;
                }
                f2.a(n8, i2, n7, iBlockState2);
                continue;
            }
            if (n5 <= 0) continue;
            f2.a(n8, i2, n7, iBlockState2);
            if (--n5 != 0 || iBlockState2.df() != Blocks.cLo) continue;
            n5 = random.nextInt(4) + Math.max(0, i2 - 63);
            iBlockState2 = iBlockState2.b(BlockSand.bab) == BlockSand$EnumType.bad ? Blocks.cOO.xM() : Blocks.cLC.xM();
        }
    }

    protected j axd() {
        return this.in(this.dHo + 128);
    }

    protected j in(int n2) {
        return new z(n2, this);
    }

    public Class<? extends j> axe() {
        return this.getClass();
    }

    public boolean b(j j2) {
        return j2 == this || j2 != null && this.axe() == j2.axe();
    }

    public n axf() {
        return (double)this.dHe < 0.2 ? n.dHy : ((double)this.dHe < 1.0 ? n.dHz : n.dHA);
    }

    public static j[] axg() {
        return dGc;
    }

    public static j io(int n2) {
        return j.a(n2, null);
    }

    public static j a(int n2, j j2) {
        if (n2 >= 0 && n2 <= dGc.length) {
            j j3 = dGc[n2];
            return j3 == null ? j2 : j3;
        }
        dFO.warn("Biome ID is out of bounds: " + n2 + ", defaulting to 0 (Ocean)");
        return dGf;
    }

    static {
        dGg.axd();
        dGh.axd();
        dGj.axd();
        dGk.axd();
        dGl.axd();
        dGr.axd();
        dGA.axd();
        dGC.axd();
        dGJ.axd();
        dGO.axd();
        dGP.axd();
        dGQ.axd();
        dGR.axd();
        dGS.axd();
        dGG.axd();
        dGH.axd();
        dGI.axd();
        dGL.axd();
        dGi.axd();
        dGN.axd();
        dGL.in(j.dGM.dHo + 128).gE("Redwood Taiga Hills M");
        for (j j2 : dGc) {
            if (j2 == null) continue;
            if (dGe.containsKey(j2.dGX)) {
                throw new Error("Biome \"" + j2.dGX + "\" is defined as both ID " + j.dGe.get((Object)j2.dGX).dHo + " and " + j2.dHo);
            }
            dGe.put(j2.dGX, j2);
            if (j2.dHo >= 128) continue;
            dGd.add(j2);
        }
        dGd.remove(dGn);
        dGd.remove(dGo);
        dGd.remove(dGp);
        dGd.remove(dGz);
        dGU = new t(new Random(1234L), 1);
        dGV = new t(new Random(2345L), 1);
        dGW = new k();
    }
}

