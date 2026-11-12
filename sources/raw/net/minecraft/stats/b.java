/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.stats;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.stats.a;
import net.minecraft.util.bm;

public class b {
    public static int doz;
    public static int doA;
    public static int doB;
    public static int doC;
    public static List<a> doD;
    public static a doE;
    public static a doF;
    public static a doG;
    public static a doH;
    public static a doI;
    public static a doJ;
    public static a doK;
    public static a doL;
    public static a doM;
    public static a doN;
    public static a doO;
    public static a doP;
    public static a doQ;
    public static a doR;
    public static a doS;
    public static a doT;
    public static a doU;
    public static a doV;
    public static a doW;
    public static a doX;
    public static a doY;
    public static a doZ;
    public static a dpa;
    public static a dpb;
    public static a dpc;
    public static a dpd;
    public static a dpe;
    public static a dpf;
    public static a dpg;
    public static a dph;
    public static a dpi;
    public static a dpj;
    public static a dpk;
    public static a dpl;

    public static void init() {
    }

    static {
        doD = Lists.newArrayList();
        doE = new a("achievement.openInventory", "openInventory", 0, 0, Items.cQP, null).apl().apn();
        doF = new a("achievement.mineWood", "mineWood", 2, 1, Blocks.cLt, doE).apn();
        doG = new a("achievement.buildWorkBench", "buildWorkBench", 4, -1, Blocks.cMk, doF).apn();
        doH = new a("achievement.buildPickaxe", "buildPickaxe", 4, 2, Items.cPs, doG).apn();
        doI = new a("achievement.buildFurnace", "buildFurnace", 3, 4, Blocks.cMn, doH).apn();
        doJ = new a("achievement.acquireIron", "acquireIron", 1, 4, Items.cPn, doI).apn();
        doK = new a("achievement.buildHoe", "buildHoe", 2, -3, Items.cPM, doG).apn();
        doL = new a("achievement.makeBread", "makeBread", -1, -3, Items.cPT, doK).apn();
        doM = new a("achievement.bakeCake", "bakeCake", 0, -5, Items.cRd, doK).apn();
        doN = new a("achievement.buildBetterPickaxe", "buildBetterPickaxe", 6, 2, Items.cPw, doH).apn();
        doO = new a("achievement.cookFish", "cookFish", 2, 6, Items.cQZ, doI).apn();
        doP = new a("achievement.onARail", "onARail", 2, 3, Blocks.cMx, doJ).apm().apn();
        doQ = new a("achievement.buildSword", "buildSword", 6, -1, Items.cPq, doG).apn();
        doR = new a("achievement.killEnemy", "killEnemy", 8, -1, Items.cRb, doQ).apn();
        doS = new a("achievement.killCow", "killCow", 7, -3, Items.cQJ, doQ).apn();
        doT = new a("achievement.flyPig", "flyPig", 9, -3, Items.cQE, doS).apm().apn();
        doU = new a("achievement.snipeSkeleton", "snipeSkeleton", 7, 0, Items.cPj, doR).apm().apn();
        doV = new a("achievement.diamonds", "diamonds", -1, 5, Blocks.cMi, doJ).apn();
        doW = new a("achievement.diamondsToYou", "diamondsToYou", -1, 2, Items.cPm, doV).apn();
        doX = new a("achievement.portal", "portal", -1, 7, Blocks.cMb, doV).apn();
        doY = new a("achievement.ghast", "ghast", -4, 8, Items.cRA, doX).apm().apn();
        doZ = new a("achievement.blazeRod", "blazeRod", 0, 9, Items.cRz, doX).apn();
        dpa = new a("achievement.potion", "potion", 2, 8, Items.cRD, doZ).apn();
        dpb = new a("achievement.theEnd", "theEnd", 3, 10, Items.cRL, doZ).apm().apn();
        dpc = new a("achievement.theEnd2", "theEnd2", 4, 13, Blocks.cNK, dpb).apm().apn();
        dpd = new a("achievement.enchantments", "enchantments", -4, 4, Blocks.cNE, doV).apn();
        dpe = new a("achievement.overkill", "overkill", -4, 1, Items.cPy, dpd).apm().apn();
        dpf = new a("achievement.bookcase", "bookcase", -3, 6, Blocks.cLZ, dpd).apn();
        dpg = new a("achievement.breedCow", "breedCow", 7, -5, Items.cPS, doS).apn();
        dph = new a("achievement.spawnWither", "spawnWither", 7, 12, new co(Items.cSb, 1, 1), dpc).apn();
        dpi = new a("achievement.killWither", "killWither", 7, 10, Items.cSd, dph).apn();
        dpj = new a("achievement.fullBeacon", "fullBeacon", 7, 8, Blocks.cOa, dpi).apm().apn();
        dpk = new a("achievement.exploreAllBiomes", "exploreAllBiomes", 4, 8, Items.cQj, dpb).m(bm.class).apm().apn();
        dpl = new a("achievement.overpowered", "overpowered", 6, 4, new co(Items.cQs, 1, 1), doN).apm().apn();
    }
}

