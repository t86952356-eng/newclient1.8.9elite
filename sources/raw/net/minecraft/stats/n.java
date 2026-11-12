/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.stats;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.entity.o;
import net.minecraft.init.Blocks;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.item.crafting.a;
import net.minecraft.item.crafting.c;
import net.minecraft.item.crafting.d;
import net.minecraft.stats.b;
import net.minecraft.stats.f;
import net.minecraft.stats.k;
import net.minecraft.stats.l;
import net.minecraft.util.cm;
import net.minecraft.util.t;

public class n {
    protected static Map<String, f> dpB = Maps.newHashMap();
    public static List<f> dpC = Lists.newArrayList();
    public static List<f> dpD = Lists.newArrayList();
    public static List<l> dpE = Lists.newArrayList();
    public static List<l> dpF = Lists.newArrayList();
    public static f dpG = new k("stat.leaveGame", new t("stat.leaveGame", new Object[0])).aps().apr();
    public static f dpH = new k("stat.playOneMinute", new t("stat.playOneMinute", new Object[0]), f.dpw).aps().apr();
    public static f dpI = new k("stat.timeSinceDeath", new t("stat.timeSinceDeath", new Object[0]), f.dpw).aps().apr();
    public static f dpJ = new k("stat.walkOneCm", new t("stat.walkOneCm", new Object[0]), f.dpx).aps().apr();
    public static f dpK = new k("stat.crouchOneCm", new t("stat.crouchOneCm", new Object[0]), f.dpx).aps().apr();
    public static f dpL = new k("stat.sprintOneCm", new t("stat.sprintOneCm", new Object[0]), f.dpx).aps().apr();
    public static f dpM = new k("stat.swimOneCm", new t("stat.swimOneCm", new Object[0]), f.dpx).aps().apr();
    public static f dpN = new k("stat.fallOneCm", new t("stat.fallOneCm", new Object[0]), f.dpx).aps().apr();
    public static f dpO = new k("stat.climbOneCm", new t("stat.climbOneCm", new Object[0]), f.dpx).aps().apr();
    public static f dpP = new k("stat.flyOneCm", new t("stat.flyOneCm", new Object[0]), f.dpx).aps().apr();
    public static f dpQ = new k("stat.diveOneCm", new t("stat.diveOneCm", new Object[0]), f.dpx).aps().apr();
    public static f dpR = new k("stat.minecartOneCm", new t("stat.minecartOneCm", new Object[0]), f.dpx).aps().apr();
    public static f dpS = new k("stat.boatOneCm", new t("stat.boatOneCm", new Object[0]), f.dpx).aps().apr();
    public static f dpT = new k("stat.pigOneCm", new t("stat.pigOneCm", new Object[0]), f.dpx).aps().apr();
    public static f dpU = new k("stat.horseOneCm", new t("stat.horseOneCm", new Object[0]), f.dpx).aps().apr();
    public static f dpV = new k("stat.jump", new t("stat.jump", new Object[0])).aps().apr();
    public static f dpW = new k("stat.drop", new t("stat.drop", new Object[0])).aps().apr();
    public static f dpX = new k("stat.damageDealt", new t("stat.damageDealt", new Object[0]), f.dpy).apr();
    public static f dpY = new k("stat.damageTaken", new t("stat.damageTaken", new Object[0]), f.dpy).apr();
    public static f dpZ = new k("stat.deaths", new t("stat.deaths", new Object[0])).apr();
    public static f dqa = new k("stat.mobKills", new t("stat.mobKills", new Object[0])).apr();
    public static f dqb = new k("stat.animalsBred", new t("stat.animalsBred", new Object[0])).apr();
    public static f dqc = new k("stat.playerKills", new t("stat.playerKills", new Object[0])).apr();
    public static f dqd = new k("stat.fishCaught", new t("stat.fishCaught", new Object[0])).apr();
    public static f dqe = new k("stat.junkFished", new t("stat.junkFished", new Object[0])).apr();
    public static f dqf = new k("stat.treasureFished", new t("stat.treasureFished", new Object[0])).apr();
    public static f dqg = new k("stat.talkedToVillager", new t("stat.talkedToVillager", new Object[0])).apr();
    public static f dqh = new k("stat.tradedWithVillager", new t("stat.tradedWithVillager", new Object[0])).apr();
    public static f dqi = new k("stat.cakeSlicesEaten", new t("stat.cakeSlicesEaten", new Object[0])).apr();
    public static f dqj = new k("stat.cauldronFilled", new t("stat.cauldronFilled", new Object[0])).apr();
    public static f dqk = new k("stat.cauldronUsed", new t("stat.cauldronUsed", new Object[0])).apr();
    public static f dql = new k("stat.armorCleaned", new t("stat.armorCleaned", new Object[0])).apr();
    public static f dqm = new k("stat.bannerCleaned", new t("stat.bannerCleaned", new Object[0])).apr();
    public static f dqn = new k("stat.brewingstandInteraction", new t("stat.brewingstandInteraction", new Object[0])).apr();
    public static f dqo = new k("stat.beaconInteraction", new t("stat.beaconInteraction", new Object[0])).apr();
    public static f dqp = new k("stat.dropperInspected", new t("stat.dropperInspected", new Object[0])).apr();
    public static f dqq = new k("stat.hopperInspected", new t("stat.hopperInspected", new Object[0])).apr();
    public static f dqr = new k("stat.dispenserInspected", new t("stat.dispenserInspected", new Object[0])).apr();
    public static f dqs = new k("stat.noteblockPlayed", new t("stat.noteblockPlayed", new Object[0])).apr();
    public static f dqt = new k("stat.noteblockTuned", new t("stat.noteblockTuned", new Object[0])).apr();
    public static f dqu = new k("stat.flowerPotted", new t("stat.flowerPotted", new Object[0])).apr();
    public static f dqv = new k("stat.trappedChestTriggered", new t("stat.trappedChestTriggered", new Object[0])).apr();
    public static f dqw = new k("stat.enderchestOpened", new t("stat.enderchestOpened", new Object[0])).apr();
    public static f dqx = new k("stat.itemEnchanted", new t("stat.itemEnchanted", new Object[0])).apr();
    public static f dqy = new k("stat.recordPlayed", new t("stat.recordPlayed", new Object[0])).apr();
    public static f dqz = new k("stat.furnaceInteraction", new t("stat.furnaceInteraction", new Object[0])).apr();
    public static f dqA = new k("stat.craftingTableInteraction", new t("stat.workbenchInteraction", new Object[0])).apr();
    public static f dqB = new k("stat.chestOpened", new t("stat.chestOpened", new Object[0])).apr();
    public static final f[] dqC = new f[4096];
    public static final f[] dqD = new f[32000];
    public static final f[] dqE = new f[32000];
    public static final f[] dqF = new f[32000];

    public static void init() {
        n.apy();
        n.apz();
        n.apA();
        n.apx();
        b.init();
        net.minecraft.entity.n.UO();
    }

    private static void apx() {
        HashSet hashSet = Sets.newHashSet();
        for (d object : a.aey().aez()) {
            if (object.aeD() == null) continue;
            hashSet.add(object.aeD().bP());
        }
        for (co co2 : c.aeA().aeB().values()) {
            hashSet.add(co2.bP());
        }
        for (net.minecraft.item.d d2 : hashSet) {
            if (d2 == null) continue;
            int n2 = net.minecraft.item.d.p(d2);
            String string = n.s(d2);
            if (string == null) continue;
            n.dqD[n2] = new l("stat.craftItem.", string, new t("stat.craftItem", new co(d2).DM()), d2).apr();
        }
        n.a(dqD);
    }

    private static void apy() {
        for (Block block : Block.aRV) {
            net.minecraft.item.d d2 = net.minecraft.item.d.I(block);
            if (d2 == null) continue;
            int n2 = Block.i(block);
            String string = n.s(d2);
            if (string == null || !block.xC()) continue;
            n.dqC[n2] = new l("stat.mineBlock.", string, new t("stat.mineBlock", new co(block).DM()), d2).apr();
            dpF.add((l)dqC[n2]);
        }
        n.a(dqC);
    }

    private static void apz() {
        for (net.minecraft.item.d d2 : net.minecraft.item.d.cVi) {
            if (d2 == null) continue;
            int n2 = net.minecraft.item.d.p(d2);
            String string = n.s(d2);
            if (string == null) continue;
            n.dqE[n2] = new l("stat.useItem.", string, new t("stat.useItem", new co(d2).DM()), d2).apr();
            if (d2 instanceof af) continue;
            dpE.add((l)dqE[n2]);
        }
        n.a(dqE);
    }

    private static void apA() {
        for (net.minecraft.item.d d2 : net.minecraft.item.d.cVi) {
            if (d2 == null) continue;
            int n2 = net.minecraft.item.d.p(d2);
            String string = n.s(d2);
            if (string == null || !d2.adu()) continue;
            n.dqF[n2] = new l("stat.breakItem.", string, new t("stat.breakItem", new co(d2).DM()), d2).apr();
        }
        n.a(dqF);
    }

    private static String s(net.minecraft.item.d d2) {
        cm cm2 = net.minecraft.item.d.cVi.y(d2);
        return cm2 != null ? cm2.toString().replace(':', '.') : null;
    }

    private static void a(f[] fArray) {
        n.a(fArray, Blocks.cLl, Blocks.cLk);
        n.a(fArray, Blocks.cLn, Blocks.cLm);
        n.a(fArray, Blocks.cNb, Blocks.cMW);
        n.a(fArray, Blocks.cMo, Blocks.cMn);
        n.a(fArray, Blocks.cMF, Blocks.cME);
        n.a(fArray, Blocks.cNe, Blocks.cNd);
        n.a(fArray, Blocks.cOm, Blocks.cOl);
        n.a(fArray, Blocks.cMH, Blocks.cMG);
        n.a(fArray, Blocks.cNM, Blocks.cNL);
        n.a(fArray, Blocks.cLV, Blocks.cLW);
        n.a(fArray, Blocks.cNN, Blocks.cNO);
        n.a(fArray, Blocks.cOQ, Blocks.cOR);
        n.a(fArray, Blocks.cLe, Blocks.cLf);
        n.a(fArray, Blocks.cMm, Blocks.cLf);
    }

    private static void a(f[] fArray, Block block, Block block2) {
        int n2 = Block.i(block);
        int n3 = Block.i(block2);
        if (fArray[n2] != null && fArray[n3] == null) {
            fArray[n3] = fArray[n2];
        } else {
            dpC.remove(fArray[n2]);
            dpF.remove(fArray[n2]);
            dpD.remove(fArray[n2]);
            fArray[n2] = fArray[n3];
        }
    }

    public static f a(o o2) {
        String string = net.minecraft.entity.n.eF(o2.ctG);
        return string == null ? null : new f("stat.killEntity." + string, new t("stat.entityKill", new t("entity." + string + ".name", new Object[0]))).apr();
    }

    public static f b(o o2) {
        String string = net.minecraft.entity.n.eF(o2.ctG);
        return string == null ? null : new f("stat.entityKilledBy." + string, new t("stat.entityKilledBy", new t("entity." + string + ".name", new Object[0]))).apr();
    }

    public static f fU(String string) {
        return dpB.get(string);
    }
}

