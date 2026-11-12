/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 */
package net.minecraft.item;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.a;
import net.minecraft.item.aa;
import net.minecraft.item.ab;
import net.minecraft.item.ac;
import net.minecraft.item.ad;
import net.minecraft.item.ae;
import net.minecraft.item.af;
import net.minecraft.item.ag;
import net.minecraft.item.ah;
import net.minecraft.item.ai;
import net.minecraft.item.aj;
import net.minecraft.item.ak;
import net.minecraft.item.al;
import net.minecraft.item.am;
import net.minecraft.item.an;
import net.minecraft.item.ao;
import net.minecraft.item.ap;
import net.minecraft.item.aq;
import net.minecraft.item.ar;
import net.minecraft.item.as;
import net.minecraft.item.at;
import net.minecraft.item.au;
import net.minecraft.item.av;
import net.minecraft.item.aw;
import net.minecraft.item.ax;
import net.minecraft.item.ay;
import net.minecraft.item.az;
import net.minecraft.item.ba;
import net.minecraft.item.bb;
import net.minecraft.item.bc;
import net.minecraft.item.be;
import net.minecraft.item.bf;
import net.minecraft.item.bg;
import net.minecraft.item.bh;
import net.minecraft.item.bi;
import net.minecraft.item.bj;
import net.minecraft.item.bl;
import net.minecraft.item.bm;
import net.minecraft.item.bn;
import net.minecraft.item.bo;
import net.minecraft.item.bq;
import net.minecraft.item.bs;
import net.minecraft.item.bt;
import net.minecraft.item.bv;
import net.minecraft.item.bw;
import net.minecraft.item.bx;
import net.minecraft.item.by;
import net.minecraft.item.bz;
import net.minecraft.item.c;
import net.minecraft.item.ca;
import net.minecraft.item.cb;
import net.minecraft.item.cc;
import net.minecraft.item.cd;
import net.minecraft.item.ce;
import net.minecraft.item.cf;
import net.minecraft.item.cg;
import net.minecraft.item.ch;
import net.minecraft.item.ci;
import net.minecraft.item.cj;
import net.minecraft.item.ck;
import net.minecraft.item.cl;
import net.minecraft.item.cm;
import net.minecraft.item.cn;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.cr;
import net.minecraft.item.e;
import net.minecraft.item.f;
import net.minecraft.item.g;
import net.minecraft.item.h;
import net.minecraft.item.i;
import net.minecraft.item.j;
import net.minecraft.item.k;
import net.minecraft.item.l;
import net.minecraft.item.m;
import net.minecraft.item.n;
import net.minecraft.item.o;
import net.minecraft.item.p;
import net.minecraft.item.q;
import net.minecraft.item.r;
import net.minecraft.item.s;
import net.minecraft.item.t;
import net.minecraft.item.u;
import net.minecraft.item.v;
import net.minecraft.item.w;
import net.minecraft.item.x;
import net.minecraft.item.y;
import net.minecraft.util.b;
import net.minecraft.util.da;

public class d {
    public static final net.minecraft.util.ci<net.minecraft.util.cm, d> cVi = new net.minecraft.util.ci();
    private static final Map<Block, d> cVj = Maps.newHashMap();
    protected static final UUID cVk = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
    private net.minecraft.creativetab.a cVl;
    protected static Random cVm = new Random();
    protected int cVn = 64;
    private int cVo;
    protected boolean cVp;
    protected boolean cVq;
    private d cVr;
    private String cVs;
    private String aSI;

    public static int p(d d2) {
        return d2 == null ? 0 : cVi.z(d2);
    }

    public static d fT(int n2) {
        return cVi.hT(n2);
    }

    public static d I(Block block) {
        return cVj.get(block);
    }

    public static d et(String string) {
        d d2 = cVi.w(new net.minecraft.util.cm(string));
        if (d2 == null) {
            try {
                return d.fT(Integer.parseInt(string));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return d2;
    }

    public boolean q(net.minecraft.nbt.n n2) {
        return false;
    }

    public d fU(int n2) {
        this.cVn = n2;
        return this;
    }

    public boolean a(co co2, net.minecraft.entity.player.a a2, net.minecraft.world.w w2, b b2, net.minecraft.util.ao ao2, float f2, float f3, float f4) {
        return false;
    }

    public float a(co co2, Block block) {
        return 1.0f;
    }

    public co a(co co2, net.minecraft.world.w w2, net.minecraft.entity.player.a a2) {
        return co2;
    }

    public co b(co co2, net.minecraft.world.w w2, net.minecraft.entity.player.a a2) {
        return co2;
    }

    public int adr() {
        return this.cVn;
    }

    public int fV(int n2) {
        return 0;
    }

    public boolean ads() {
        return this.cVq;
    }

    protected d bM(boolean bl2) {
        this.cVq = bl2;
        return this;
    }

    public int adt() {
        return this.cVo;
    }

    protected d fW(int n2) {
        this.cVo = n2;
        return this;
    }

    public boolean adu() {
        return this.cVo > 0 && !this.cVq;
    }

    public boolean a(co co2, net.minecraft.entity.r r2, net.minecraft.entity.r r3) {
        return false;
    }

    public boolean a(co co2, net.minecraft.world.w w2, Block block, b b2, net.minecraft.entity.r r2) {
        return false;
    }

    public boolean F(Block block) {
        return false;
    }

    public boolean a(co co2, net.minecraft.entity.player.a a2, net.minecraft.entity.r r2) {
        return false;
    }

    public d adv() {
        this.cVp = true;
        return this;
    }

    public boolean adw() {
        return this.cVp;
    }

    public boolean adx() {
        return false;
    }

    public d eu(String string) {
        this.aSI = string;
        return this;
    }

    public String an(co co2) {
        String string = this.ao(co2);
        return string == null ? "" : net.minecraft.util.cr.gm(string);
    }

    public String xB() {
        return "item." + this.aSI;
    }

    public String ao(co co2) {
        return "item." + this.aSI;
    }

    public d q(d d2) {
        this.cVr = d2;
        return this;
    }

    public boolean ady() {
        return true;
    }

    public d adz() {
        return this.cVr;
    }

    public boolean adA() {
        return this.cVr != null;
    }

    public int e(co co2, int n2) {
        return 0xFFFFFF;
    }

    public void a(co co2, net.minecraft.world.w w2, net.minecraft.entity.c c2, int n2, boolean bl2) {
    }

    public void c(co co2, net.minecraft.world.w w2, net.minecraft.entity.player.a a2) {
    }

    public boolean adB() {
        return false;
    }

    public a ap(co co2) {
        return a.cUw;
    }

    public int aq(co co2) {
        return 0;
    }

    public void a(co co2, net.minecraft.world.w w2, net.minecraft.entity.player.a a2, int n2) {
    }

    protected d ev(String string) {
        this.cVs = string;
        return this;
    }

    public String ar(co co2) {
        return this.cVs;
    }

    public boolean as(co co2) {
        return this.ar(co2) != null;
    }

    public void a(co co2, net.minecraft.entity.player.a a2, List<String> list, boolean bl2) {
    }

    public String at(co co2) {
        return net.minecraft.util.cr.gm(this.an(co2) + ".name").trim();
    }

    public boolean au(co co2) {
        return co2.aer();
    }

    public c av(co co2) {
        return co2.aer() ? c.cVd : c.cVb;
    }

    public boolean aw(co co2) {
        return this.adr() == 1 && this.adu();
    }

    protected net.minecraft.util.ce a(net.minecraft.world.w w2, net.minecraft.entity.player.a a2, boolean bl2) {
        float f2 = a2.pm;
        float f3 = a2.pl;
        double d2 = a2.gW;
        double d3 = a2.gX + (double)a2.getEyeHeight();
        double d4 = a2.gY;
        da da2 = new da(d2, d3, d4);
        float f4 = net.minecraft.util.bt.bB(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = net.minecraft.util.bt.bx(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = -net.minecraft.util.bt.bB(-f2 * ((float)Math.PI / 180));
        float f7 = net.minecraft.util.bt.bx(-f2 * ((float)Math.PI / 180));
        float f8 = f5 * f6;
        float f9 = f4 * f6;
        double d5 = 5.0;
        da da3 = da2.al((double)f8 * 5.0, (double)f7 * 5.0, (double)f9 * 5.0);
        return w2.a(da2, da3, bl2, !bl2, false);
    }

    public int adC() {
        return 0;
    }

    public void b(d d2, net.minecraft.creativetab.a a2, List<co> list) {
        list.add(new co(d2, 1, 0));
    }

    public net.minecraft.creativetab.a adD() {
        return this.cVl;
    }

    public d d(net.minecraft.creativetab.a a2) {
        this.cVl = a2;
        return this;
    }

    public boolean adE() {
        return false;
    }

    public boolean b(co co2, co co3) {
        return false;
    }

    public Multimap<String, net.minecraft.entity.ai.attributes.a> adF() {
        return HashMultimap.create();
    }

    public static void Nu() {
        d.a(Blocks.cLd, new bt(Blocks.cLd, Blocks.cLd, new e()).ew("stone"));
        d.a(Blocks.cLe, new ao(Blocks.cLe, false));
        d.a(Blocks.cLf, new bt(Blocks.cLf, Blocks.cLf, new n()).ew("dirt"));
        d.J(Blocks.cLg);
        d.a(Blocks.cLh, new bt(Blocks.cLh, Blocks.cLh, new o()).ew("wood"));
        d.a(Blocks.cLi, new bt(Blocks.cLi, Blocks.cLi, new p()).ew("sapling"));
        d.J(Blocks.cLj);
        d.a(Blocks.cLo, new bt((Block)Blocks.cLo, (Block)Blocks.cLo, new q()).ew("sand"));
        d.J(Blocks.cLp);
        d.J(Blocks.cLq);
        d.J(Blocks.cLr);
        d.J(Blocks.cLs);
        d.a(Blocks.cLt, new bt(Blocks.cLt, Blocks.cLt, new r()).ew("log"));
        d.a(Blocks.cLu, new bt(Blocks.cLu, Blocks.cLu, new s()).ew("log"));
        d.a(Blocks.cLv, new bm(Blocks.cLv).ew("leaves"));
        d.a(Blocks.cLw, new bm(Blocks.cLw).ew("leaves"));
        d.a(Blocks.cLx, new bt(Blocks.cLx, Blocks.cLx, new t()).ew("sponge"));
        d.J(Blocks.cLy);
        d.J(Blocks.cLz);
        d.J(Blocks.cLA);
        d.J(Blocks.cLB);
        d.a(Blocks.cLC, new bt(Blocks.cLC, Blocks.cLC, new u()).ew("sandStone"));
        d.J(Blocks.cLD);
        d.J(Blocks.cLF);
        d.J(Blocks.cLG);
        d.a(Blocks.cLH, new bx(Blocks.cLH));
        d.J(Blocks.cLI);
        d.a(Blocks.cLJ, new ao(Blocks.cLJ, true).j(new String[]{"shrub", "grass", "fern"}));
        d.J(Blocks.cLK);
        d.a(Blocks.cLL, new bx(Blocks.cLL));
        d.a(Blocks.cLN, new am(Blocks.cLN).ew("cloth"));
        d.a(Blocks.cLP, new bt((Block)Blocks.cLP, (Block)Blocks.cLP, new f()).ew("flower"));
        d.a(Blocks.cLQ, new bt((Block)Blocks.cLQ, (Block)Blocks.cLQ, new g()).ew("rose"));
        d.J(Blocks.cLR);
        d.J(Blocks.cLS);
        d.J(Blocks.cLT);
        d.J(Blocks.cLU);
        d.a(Blocks.cLW, new cj(Blocks.cLW, Blocks.cLW, Blocks.cLV).ew("stoneSlab"));
        d.J(Blocks.cLX);
        d.J(Blocks.cLY);
        d.J(Blocks.cLZ);
        d.J(Blocks.cMa);
        d.J(Blocks.cMb);
        d.J(Blocks.cMc);
        d.J(Blocks.cMe);
        d.J(Blocks.cMf);
        d.J(Blocks.cMg);
        d.J(Blocks.cMi);
        d.J(Blocks.cMj);
        d.J(Blocks.cMk);
        d.J(Blocks.cMm);
        d.J(Blocks.cMn);
        d.J(Blocks.cMo);
        d.J(Blocks.cMw);
        d.J(Blocks.cMx);
        d.J(Blocks.cMy);
        d.J(Blocks.cMA);
        d.J(Blocks.cMB);
        d.J(Blocks.cMD);
        d.J(Blocks.cME);
        d.J(Blocks.cMH);
        d.J(Blocks.cMI);
        d.a(Blocks.cMJ, new ck(Blocks.cMJ));
        d.J(Blocks.cMK);
        d.J(Blocks.cML);
        d.J(Blocks.cMM);
        d.J(Blocks.cMN);
        d.J(Blocks.cMP);
        d.J(Blocks.cMQ);
        d.J(Blocks.cMR);
        d.J(Blocks.cMS);
        d.J(Blocks.cMT);
        d.J(Blocks.cMU);
        d.J(Blocks.cMV);
        d.J(Blocks.cMW);
        d.J(Blocks.cMX);
        d.J(Blocks.cMY);
        d.J(Blocks.cMZ);
        d.J(Blocks.cNb);
        d.J(Blocks.cNf);
        d.a(Blocks.cNg, new bt(Blocks.cNg, Blocks.cNg, new h()).ew("monsterStoneEgg"));
        d.a(Blocks.cNh, new bt(Blocks.cNh, Blocks.cNh, new i()).ew("stonebricksmooth"));
        d.J(Blocks.cNi);
        d.J(Blocks.cNj);
        d.J(Blocks.cNk);
        d.J(Blocks.cNl);
        d.J(Blocks.cNm);
        d.a(Blocks.cNp, new ao(Blocks.cNp, false));
        d.J(Blocks.cNq);
        d.J(Blocks.cNr);
        d.J(Blocks.cNs);
        d.J(Blocks.cNt);
        d.J(Blocks.cNu);
        d.J(Blocks.cNv);
        d.J(Blocks.cNw);
        d.J(Blocks.cNx);
        d.J(Blocks.cNy);
        d.a(Blocks.cNz, new bn(Blocks.cNz));
        d.J(Blocks.cNA);
        d.J(Blocks.cNB);
        d.J(Blocks.cNC);
        d.J(Blocks.cNE);
        d.J(Blocks.cNI);
        d.J(Blocks.cNJ);
        d.J(Blocks.cNK);
        d.J(Blocks.cNL);
        d.a(Blocks.cNO, new cj(Blocks.cNO, Blocks.cNO, Blocks.cNN).ew("woodSlab"));
        d.J(Blocks.cNQ);
        d.J(Blocks.cNR);
        d.J(Blocks.cNS);
        d.J(Blocks.cNT);
        d.J(Blocks.cNV);
        d.J(Blocks.cNW);
        d.J(Blocks.cNX);
        d.J(Blocks.cNY);
        d.J(Blocks.cNZ);
        d.J(Blocks.cOa);
        d.a(Blocks.cOb, new bt(Blocks.cOb, Blocks.cOb, new j()).ew("cobbleWall"));
        d.J(Blocks.cOf);
        d.a(Blocks.cOh, new w(Blocks.cOh).ew("anvil"));
        d.J(Blocks.cOi);
        d.J(Blocks.cOj);
        d.J(Blocks.cOk);
        d.J(Blocks.cOnn);
        d.J(Blocks.cOp);
        d.J(Blocks.cOq);
        d.J(Blocks.cOr);
        d.a(Blocks.cOs, new bt(Blocks.cOs, Blocks.cOs, new String[]{"default", "chiseled", "lines"}).ew("quartzBlock"));
        d.J(Blocks.cOt);
        d.J(Blocks.cOu);
        d.J(Blocks.cOv);
        d.a(Blocks.cOw, new am(Blocks.cOw).ew("clayHardenedStained"));
        d.J(Blocks.cOx);
        d.J(Blocks.cOy);
        d.J(Blocks.cOz);
        d.a(Blocks.cOA, new am(Blocks.cOA).ew("woolCarpet"));
        d.J(Blocks.cOB);
        d.J(Blocks.cOC);
        d.J(Blocks.cOD);
        d.J(Blocks.cOE);
        d.J(Blocks.cOF);
        d.J(Blocks.cOG);
        d.a(Blocks.cOH, new aq((Block)Blocks.cOH, (Block)Blocks.cOH, new k()).ew("doublePlant"));
        d.a(Blocks.cOI, new am(Blocks.cOI).ew("stainedGlass"));
        d.a(Blocks.cOJ, new am(Blocks.cOJ).ew("stainedGlassPane"));
        d.a(Blocks.cOK, new bt(Blocks.cOK, Blocks.cOK, new l()).ew("prismarine"));
        d.J(Blocks.cOL);
        d.a(Blocks.cOO, new bt(Blocks.cOO, Blocks.cOO, new m()).ew("redSandStone"));
        d.J(Blocks.cOP);
        d.a(Blocks.cOR, new cj(Blocks.cOR, Blocks.cOR, Blocks.cOQ).ew("stoneSlab2"));
        d.a(256, "iron_shovel", new cn(v.cVv).eu("shovelIron"));
        d.a(257, "iron_pickaxe", new bw(v.cVv).eu("pickaxeIron"));
        d.a(258, "iron_axe", new ac(v.cVv).eu("hatchetIron"));
        d.a(259, "flint_and_steel", new bf().eu("flintAndSteel"));
        d.a(260, "apple", new bg(4, 0.3f, false).eu("apple"));
        d.a(261, "bow", new ai().eu("bow"));
        d.a(262, "arrow", new d().eu("arrow").d(net.minecraft.creativetab.a.cpF));
        d.a(263, "coal", new an().eu("coal"));
        d.a(264, "diamond", new d().eu("diamond").d(net.minecraft.creativetab.a.cpH));
        d.a(265, "iron_ingot", new d().eu("ingotIron").d(net.minecraft.creativetab.a.cpH));
        d.a(266, "gold_ingot", new d().eu("ingotGold").d(net.minecraft.creativetab.a.cpH));
        d.a(267, "iron_sword", new cp(v.cVv).eu("swordIron"));
        d.a(268, "wooden_sword", new cp(v.cVt).eu("swordWood"));
        d.a(269, "wooden_shovel", new cn(v.cVt).eu("shovelWood"));
        d.a(270, "wooden_pickaxe", new bw(v.cVt).eu("pickaxeWood"));
        d.a(271, "wooden_axe", new ac(v.cVt).eu("hatchetWood"));
        d.a(272, "stone_sword", new cp(v.cVu).eu("swordStone"));
        d.a(273, "stone_shovel", new cn(v.cVu).eu("shovelStone"));
        d.a(274, "stone_pickaxe", new bw(v.cVu).eu("pickaxeStone"));
        d.a(275, "stone_axe", new ac(v.cVu).eu("hatchetStone"));
        d.a(276, "diamond_sword", new cp(v.cVw).eu("swordDiamond"));
        d.a(277, "diamond_shovel", new cn(v.cVw).eu("shovelDiamond"));
        d.a(278, "diamond_pickaxe", new bw(v.cVw).eu("pickaxeDiamond"));
        d.a(279, "diamond_axe", new ac(v.cVw).eu("hatchetDiamond"));
        d.a(280, "stick", new d().adv().eu("stick").d(net.minecraft.creativetab.a.cpH));
        d.a(281, "bowl", new d().eu("bowl").d(net.minecraft.creativetab.a.cpH));
        d.a(282, "mushroom_stew", new cm(6).eu("mushroomStew"));
        d.a(283, "golden_sword", new cp(v.cVx).eu("swordGold"));
        d.a(284, "golden_shovel", new cn(v.cVx).eu("shovelGold"));
        d.a(285, "golden_pickaxe", new bw(v.cVx).eu("pickaxeGold"));
        d.a(286, "golden_axe", new ac(v.cVx).eu("hatchetGold"));
        d.a(287, "string", new cb(Blocks.cNU).eu("string").d(net.minecraft.creativetab.a.cpH));
        d.a(288, "feather", new d().eu("feather").d(net.minecraft.creativetab.a.cpH));
        d.a(289, "gunpowder", new d().eu("sulphur").ev("+14&13-13").d(net.minecraft.creativetab.a.cpH));
        d.a(290, "wooden_hoe", new bj(v.cVt).eu("hoeWood"));
        d.a(291, "stone_hoe", new bj(v.cVu).eu("hoeStone"));
        d.a(292, "iron_hoe", new bj(v.cVv).eu("hoeIron"));
        d.a(293, "diamond_hoe", new bj(v.cVw).eu("hoeDiamond"));
        d.a(294, "golden_hoe", new bj(v.cVx).eu("hoeGold"));
        d.a(295, "wheat_seeds", new ce(Blocks.cMl, Blocks.cMm).eu("seeds"));
        d.a(296, "wheat", new d().eu("wheat").d(net.minecraft.creativetab.a.cpH));
        d.a(297, "bread", new bg(5, 0.6f, false).eu("bread"));
        d.a(298, "leather_helmet", new y(aa.cVL, 0, 0).eu("helmetCloth"));
        d.a(299, "leather_chestplate", new y(aa.cVL, 0, 1).eu("chestplateCloth"));
        d.a(300, "leather_leggings", new y(aa.cVL, 0, 2).eu("leggingsCloth"));
        d.a(301, "leather_boots", new y(aa.cVL, 0, 3).eu("bootsCloth"));
        d.a(302, "chainmail_helmet", new y(aa.cVM, 1, 0).eu("helmetChain"));
        d.a(303, "chainmail_chestplate", new y(aa.cVM, 1, 1).eu("chestplateChain"));
        d.a(304, "chainmail_leggings", new y(aa.cVM, 1, 2).eu("leggingsChain"));
        d.a(305, "chainmail_boots", new y(aa.cVM, 1, 3).eu("bootsChain"));
        d.a(306, "iron_helmet", new y(aa.cVN, 2, 0).eu("helmetIron"));
        d.a(307, "iron_chestplate", new y(aa.cVN, 2, 1).eu("chestplateIron"));
        d.a(308, "iron_leggings", new y(aa.cVN, 2, 2).eu("leggingsIron"));
        d.a(309, "iron_boots", new y(aa.cVN, 2, 3).eu("bootsIron"));
        d.a(310, "diamond_helmet", new y(aa.cVP, 3, 0).eu("helmetDiamond"));
        d.a(311, "diamond_chestplate", new y(aa.cVP, 3, 1).eu("chestplateDiamond"));
        d.a(312, "diamond_leggings", new y(aa.cVP, 3, 2).eu("leggingsDiamond"));
        d.a(313, "diamond_boots", new y(aa.cVP, 3, 3).eu("bootsDiamond"));
        d.a(314, "golden_helmet", new y(aa.cVO, 4, 0).eu("helmetGold"));
        d.a(315, "golden_chestplate", new y(aa.cVO, 4, 1).eu("chestplateGold"));
        d.a(316, "golden_leggings", new y(aa.cVO, 4, 2).eu("leggingsGold"));
        d.a(317, "golden_boots", new y(aa.cVO, 4, 3).eu("bootsGold"));
        d.a(318, "flint", new d().eu("flint").d(net.minecraft.creativetab.a.cpH));
        d.a(319, "porkchop", new bg(3, 0.3f, true).eu("porkchopRaw"));
        d.a(320, "cooked_porkchop", new bg(8, 0.8f, true).eu("porkchopCooked"));
        d.a(321, "painting", new bi(net.minecraft.entity.item.t.class).eu("painting"));
        d.a(322, "golden_apple", new x(4, 1.2f, false).adX().a(net.minecraft.potion.a.dgF.dhb, 5, 1, 1.0f).eu("appleGold"));
        d.a(323, "sign", new cg().eu("sign"));
        d.a(324, "wooden_door", new ap(Blocks.cMq).eu("doorOak"));
        d d2 = new aj(Blocks.cLc).eu("bucket").fU(16);
        d.a(325, "bucket", d2);
        d.a(326, "water_bucket", new aj(Blocks.cLk).eu("bucketWater").q(d2));
        d.a(327, "lava_bucket", new aj(Blocks.cLm).eu("bucketLava").q(d2));
        d.a(328, "minecart", new bq(net.minecraft.entity.item.m.cCG).eu("minecart"));
        d.a(329, "saddle", new cc().eu("saddle"));
        d.a(330, "iron_door", new ap(Blocks.cMC).eu("doorIron"));
        d.a(331, "redstone", new ca().eu("redstone").ev("-5+6-7"));
        d.a(332, "snowball", new cl().eu("snowball"));
        d.a(333, "boat", new ag().eu("boat"));
        d.a(334, "leather", new d().eu("leather").d(net.minecraft.creativetab.a.cpH));
        d.a(335, "milk_bucket", new ak().eu("milk").q(d2));
        d.a(336, "brick", new d().eu("brick").d(net.minecraft.creativetab.a.cpH));
        d.a(337, "clay_ball", new d().eu("clay").d(net.minecraft.creativetab.a.cpH));
        d.a(338, "reeds", new cb(Blocks.cMO).eu("reeds").d(net.minecraft.creativetab.a.cpH));
        d.a(339, "paper", new d().eu("paper").d(net.minecraft.creativetab.a.cpB));
        d.a(340, "book", new ah().eu("book").d(net.minecraft.creativetab.a.cpB));
        d.a(341, "slime_ball", new d().eu("slimeball").d(net.minecraft.creativetab.a.cpB));
        d.a(342, "chest_minecart", new bq(net.minecraft.entity.item.m.cCH).eu("minecartChest"));
        d.a(343, "furnace_minecart", new bq(net.minecraft.entity.item.m.cCI).eu("minecartFurnace"));
        d.a(344, "egg", new at().eu("egg"));
        d.a(345, "compass", new d().eu("compass").d(net.minecraft.creativetab.a.cpE));
        d.a(346, "fishing_rod", new be().eu("fishingRod"));
        d.a(347, "clock", new d().eu("clock").d(net.minecraft.creativetab.a.cpE));
        d.a(348, "glowstone_dust", new d().eu("yellowDust").ev("+5-6-7").d(net.minecraft.creativetab.a.cpH));
        d.a(349, "fish", new bc(false).eu("fish").bM(true));
        d.a(350, "cooked_fish", new bc(true).eu("fish").bM(true));
        d.a(351, "dye", new ar().eu("dyePowder"));
        d.a(352, "bone", new d().eu("bone").adv().d(net.minecraft.creativetab.a.cpB));
        d.a(353, "sugar", new d().eu("sugar").ev("-0+1-2-3&4-4+13").d(net.minecraft.creativetab.a.cpH));
        d.a(354, "cake", new cb(Blocks.cNc).fU(1).eu("cake").d(net.minecraft.creativetab.a.cpD));
        d.a(355, "bed", new ae().fU(1).eu("bed"));
        d.a(356, "repeater", new cb(Blocks.cNd).eu("diode").d(net.minecraft.creativetab.a.cpz));
        d.a(357, "cookie", new bg(2, 0.1f, false).eu("cookie"));
        d.a(358, "filled_map", new bo().eu("map"));
        d.a(359, "shears", new cf().eu("shears"));
        d.a(360, "melon", new bg(2, 0.3f, false).eu("melon"));
        d.a(361, "pumpkin_seeds", new ce(Blocks.cNn, Blocks.cMm).eu("seeds_pumpkin"));
        d.a(362, "melon_seeds", new ce(Blocks.cNo, Blocks.cMm).eu("seeds_melon"));
        d.a(363, "beef", new bg(3, 0.3f, true).eu("beefRaw"));
        d.a(364, "cooked_beef", new bg(8, 0.8f, true).eu("beefCooked"));
        d.a(365, "chicken", new bg(2, 0.3f, true).a(net.minecraft.potion.a.dgM.dhb, 30, 0, 0.3f).eu("chickenRaw"));
        d.a(366, "cooked_chicken", new bg(6, 0.6f, true).eu("chickenCooked"));
        d.a(367, "rotten_flesh", new bg(4, 0.1f, true).a(net.minecraft.potion.a.dgM.dhb, 30, 0, 0.8f).eu("rottenFlesh"));
        d.a(368, "ender_pearl", new ax().eu("enderPearl"));
        d.a(369, "blaze_rod", new d().eu("blazeRod").d(net.minecraft.creativetab.a.cpH).adv());
        d.a(370, "ghast_tear", new d().eu("ghastTear").ev("+0-1-2-3&4-4+13").d(net.minecraft.creativetab.a.cpG));
        d.a(371, "gold_nugget", new d().eu("goldNugget").d(net.minecraft.creativetab.a.cpH));
        d.a(372, "nether_wart", new ce(Blocks.cND, Blocks.cMY).eu("netherStalkSeeds").ev("+4"));
        d.a(373, "potion", new by().eu("potion"));
        d.a(374, "glass_bottle", new bh().eu("glassBottle"));
        d.a(375, "spider_eye", new bg(2, 0.8f, false).a(net.minecraft.potion.a.dgO.dhb, 5, 0, 1.0f).eu("spiderEye").ev("-0-1+2-3&4-4+13"));
        d.a(376, "fermented_spider_eye", new d().eu("fermentedSpiderEye").ev("-0+3-4+13").d(net.minecraft.creativetab.a.cpG));
        d.a(377, "blaze_powder", new d().eu("blazePowder").ev("+0-1-2+3&4-4+13").d(net.minecraft.creativetab.a.cpG));
        d.a(378, "magma_cream", new d().eu("magmaCream").ev("+0+1-2-3&4-4+13").d(net.minecraft.creativetab.a.cpG));
        d.a(379, "brewing_stand", new cb(Blocks.cNF).eu("brewingStand").d(net.minecraft.creativetab.a.cpG));
        d.a(380, "cauldron", new cb(Blocks.cNG).eu("cauldron").d(net.minecraft.creativetab.a.cpG));
        d.a(381, "ender_eye", new aw().eu("eyeOfEnder"));
        d.a(382, "speckled_melon", new d().eu("speckledMelon").ev("+0-1+2-3&4-4+13").d(net.minecraft.creativetab.a.cpG));
        d.a(383, "spawn_egg", new bs().eu("monsterPlacer"));
        d.a(384, "experience_bottle", new ay().eu("expBottle"));
        d.a(385, "fire_charge", new az().eu("fireball"));
        d.a(386, "writable_book", new cr().eu("writingBook").d(net.minecraft.creativetab.a.cpB));
        d.a(387, "written_book", new as().eu("writtenBook").fU(16));
        d.a(388, "emerald", new d().eu("emerald").d(net.minecraft.creativetab.a.cpH));
        d.a(389, "item_frame", new bi(net.minecraft.entity.item.j.class).eu("frame"));
        d.a(390, "flower_pot", new cb(Blocks.cOc).eu("flowerPot").d(net.minecraft.creativetab.a.cpy));
        d.a(391, "carrot", new cd(3, 0.6f, Blocks.cOd, Blocks.cMm).eu("carrots"));
        d.a(392, "potato", new cd(1, 0.3f, Blocks.cOe, Blocks.cMm).eu("potato"));
        d.a(393, "baked_potato", new bg(5, 0.6f, false).eu("potatoBaked"));
        d.a(394, "poisonous_potato", new bg(2, 0.3f, false).a(net.minecraft.potion.a.dgO.dhb, 5, 0, 0.6f).eu("potatoPoisonous"));
        d.a(395, "map", new au().eu("emptyMap"));
        d.a(396, "golden_carrot", new bg(6, 1.2f, false).eu("carrotGolden").ev("-0+1+2-3+13&4-4").d(net.minecraft.creativetab.a.cpG));
        d.a(397, "skull", new ci().eu("skull"));
        d.a(398, "carrot_on_a_stick", new al().eu("carrotOnAStick"));
        d.a(399, "nether_star", new ch().eu("netherStar").d(net.minecraft.creativetab.a.cpH));
        d.a(400, "pumpkin_pie", new bg(8, 0.3f, false).eu("pumpkinPie").d(net.minecraft.creativetab.a.cpD));
        d.a(401, "fireworks", new ba().eu("fireworks"));
        d.a(402, "firework_charge", new bb().eu("fireworksCharge").d(net.minecraft.creativetab.a.cpB));
        d.a(403, "enchanted_book", new av().fU(1).eu("enchantedBook"));
        d.a(404, "comparator", new cb(Blocks.cOl).eu("comparator").d(net.minecraft.creativetab.a.cpz));
        d.a(405, "netherbrick", new d().eu("netherbrick").d(net.minecraft.creativetab.a.cpH));
        d.a(406, "quartz", new d().eu("netherquartz").d(net.minecraft.creativetab.a.cpH));
        d.a(407, "tnt_minecart", new bq(net.minecraft.entity.item.m.cCJ).eu("minecartTnt"));
        d.a(408, "hopper_minecart", new bq(net.minecraft.entity.item.m.cCL).eu("minecartHopper"));
        d.a(409, "prismarine_shard", new d().eu("prismarineShard").d(net.minecraft.creativetab.a.cpH));
        d.a(410, "prismarine_crystals", new d().eu("prismarineCrystals").d(net.minecraft.creativetab.a.cpH));
        d.a(411, "rabbit", new bg(3, 0.3f, true).eu("rabbitRaw"));
        d.a(412, "cooked_rabbit", new bg(5, 0.6f, true).eu("rabbitCooked"));
        d.a(413, "rabbit_stew", new cm(10).eu("rabbitStew"));
        d.a(414, "rabbit_foot", new d().eu("rabbitFoot").ev("+0+1-2+3&4-4+13").d(net.minecraft.creativetab.a.cpG));
        d.a(415, "rabbit_hide", new d().eu("rabbitHide").d(net.minecraft.creativetab.a.cpH));
        d.a(416, "armor_stand", new ab().eu("armorStand").fU(16));
        d.a(417, "iron_horse_armor", new d().eu("horsearmormetal").fU(1).d(net.minecraft.creativetab.a.cpB));
        d.a(418, "golden_horse_armor", new d().eu("horsearmorgold").fU(1).d(net.minecraft.creativetab.a.cpB));
        d.a(419, "diamond_horse_armor", new d().eu("horsearmordiamond").fU(1).d(net.minecraft.creativetab.a.cpB));
        d.a(420, "lead", new bl().eu("leash"));
        d.a(421, "name_tag", new bv().eu("nameTag"));
        d.a(422, "command_block_minecart", new bq(net.minecraft.entity.item.m.cCM).eu("minecartCommandBlock").d(null));
        d.a(423, "mutton", new bg(2, 0.3f, true).eu("muttonRaw"));
        d.a(424, "cooked_mutton", new bg(6, 0.8f, true).eu("muttonCooked"));
        d.a(425, "banner", (d)new ad().ew("banner"));
        d.a(427, "spruce_door", new ap(Blocks.cMr).eu("doorSpruce"));
        d.a(428, "birch_door", new ap(Blocks.cMs).eu("doorBirch"));
        d.a(429, "jungle_door", new ap(Blocks.cMt).eu("doorJungle"));
        d.a(430, "acacia_door", new ap(Blocks.cMu).eu("doorAcacia"));
        d.a(431, "dark_oak_door", new ap(Blocks.cMv).eu("doorDarkOak"));
        d.a(2256, "record_13", new bz("13").eu("record"));
        d.a(2257, "record_cat", new bz("cat").eu("record"));
        d.a(2258, "record_blocks", new bz("blocks").eu("record"));
        d.a(2259, "record_chirp", new bz("chirp").eu("record"));
        d.a(2260, "record_far", new bz("far").eu("record"));
        d.a(2261, "record_mall", new bz("mall").eu("record"));
        d.a(2262, "record_mellohi", new bz("mellohi").eu("record"));
        d.a(2263, "record_stal", new bz("stal").eu("record"));
        d.a(2264, "record_strad", new bz("strad").eu("record"));
        d.a(2265, "record_ward", new bz("ward").eu("record"));
        d.a(2266, "record_11", new bz("11").eu("record"));
        d.a(2267, "record_wait", new bz("wait").eu("record"));
    }

    private static void J(Block block) {
        d.a(block, new af(block));
    }

    protected static void a(Block block, d d2) {
        d.a(Block.i(block), (net.minecraft.util.cm)Block.aRV.y(block), d2);
        cVj.put(block, d2);
    }

    private static void a(int n2, String string, d d2) {
        d.a(n2, new net.minecraft.util.cm(string), d2);
    }

    private static void a(int n2, net.minecraft.util.cm cm2, d d2) {
        cVi.a(n2, cm2, d2);
    }
}

