/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahz;
import hackclient.rise.aia;
import hackclient.rise.aib;
import hackclient.rise.aik;
import java.util.ArrayList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBarrier;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockEndPortal;
import net.minecraft.block.BlockEndPortalFrame;
import net.minecraft.block.BlockEnderChest;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLilyPad;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.block.BlockPistonMoving;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockSnowBlock;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.BlockVine;
import net.minecraft.block.BlockWall;
import net.minecraft.block.BlockWeb;
import net.minecraft.client.d;
import net.minecraft.util.b;

public final class ahy {
    private final ArrayList<aia> aOw = new ArrayList();
    private ArrayList<aib> aOx = new ArrayList();
    private final ArrayList<aia> aOy = new ArrayList();
    private final double aOz = 9.5;
    private final boolean aOA = true;
    private final aib aOB;
    private final aib aOC;
    private static final aib[] aOD = new aib[]{new aib(1.0, 0.0, 0.0), new aib(-1.0, 0.0, 0.0), new aib(0.0, 0.0, 1.0), new aib(0.0, 0.0, -1.0)};

    public ahy(aib aib2, aib aib3) {
        this.aOB = aib2.n(0.0, 0.0, 0.0).vm();
        this.aOC = aib3.n(0.0, 0.0, 0.0).vm();
    }

    public ArrayList<aib> vf() {
        return this.aOx;
    }

    public void vg() {
        this.o(1000, 4);
    }

    public void o(int n2, int n3) {
        this.aOx.clear();
        this.aOw.clear();
        ArrayList<aib> arrayList = new ArrayList<aib>();
        arrayList.add(this.aOB);
        this.aOw.add(new aia(this.aOB, null, arrayList, this.aOB.c(this.aOC), 0.0, 0.0));
        block0: for (int i2 = 0; i2 < n2; ++i2) {
            this.aOw.sort(new ahz());
            int n4 = 0;
            if (this.aOw.size() == 0) break;
            for (aia aia2 : new ArrayList<aia>(this.aOw)) {
                aib aib2;
                if (++n4 > n3) continue block0;
                this.aOw.remove(aia2);
                this.aOy.add(aia2);
                for (aib aib3 : aOD) {
                    aib aib4 = aia2.vh().d(aib3).vm();
                    if (ahy.a(aib4, false) && this.a(aia2, aib4, 0.0)) break block0;
                }
                aib object = aia2.vh().n(0.0, 1.0, 0.0).vm();
                if ((!ahy.a(object, false) || !this.a(aia2, object, 0.0)) && (!ahy.a(aib2 = aia2.vh().n(0.0, -1.0, 0.0).vm(), false) || !this.a(aia2, aib2, 0.0))) continue;
                break block0;
            }
        }
        this.aOy.sort(new ahz());
        this.aOx = this.aOy.get(0).vf();
    }

    public static boolean a(aib aib2, boolean bl2) {
        return ahy.a((int)aib2.getX(), (int)aib2.getY(), (int)aib2.getZ(), bl2);
    }

    public static boolean a(int n2, int n3, int n4, boolean bl2) {
        b b2 = new b(n2, n3 - 1, n4);
        return !ahy.s(new b(n2, n3, n4)) && !ahy.s(new b(n2, n3 + 1, n4)) && (ahy.s(b2) || !bl2) && ahy.t(b2);
    }

    private static boolean s(b b2) {
        Block block = aik.u(b2);
        return block.isFullBlock() || block instanceof BlockSlab || block instanceof BlockStairs || block instanceof BlockCactus || block instanceof BlockChest || block instanceof BlockEnderChest || block instanceof BlockSkull || block instanceof BlockPane || block instanceof BlockFence || block instanceof BlockWall || block instanceof BlockGlass || block instanceof BlockPistonBase || block instanceof BlockPistonExtension || block instanceof BlockPistonMoving || block instanceof BlockStainedGlass || block instanceof BlockTrapDoor || block instanceof BlockEndPortalFrame || block instanceof BlockEndPortal || block instanceof BlockBed || block instanceof BlockWeb || block instanceof BlockBarrier || block instanceof BlockLadder || block instanceof BlockLeaves || block instanceof BlockSnow || block instanceof BlockSnowBlock || block instanceof BlockCarpet || block instanceof BlockDoor || block instanceof BlockVine || block instanceof BlockLilyPad;
    }

    private static boolean t(b b2) {
        Block block = d.AZ().bgF.L(b2).df();
        return !(block instanceof BlockFence) && !(block instanceof BlockWall);
    }

    public aia a(aib aib2) {
        for (aia aia2 : this.aOy) {
            if (aia2.vh().getX() != aib2.getX() || aia2.vh().getY() != aib2.getY() || aia2.vh().getZ() != aib2.getZ()) continue;
            return aia2;
        }
        for (aia aia2 : this.aOw) {
            if (aia2.vh().getX() != aib2.getX() || aia2.vh().getY() != aib2.getY() || aia2.vh().getZ() != aib2.getZ()) continue;
            return aia2;
        }
        return null;
    }

    public boolean a(aia aia2, aib aib2, double d2) {
        aia aia3 = this.a(aib2);
        double d3 = d2;
        if (aia2 != null) {
            d3 += aia2.vl();
        }
        if (aia3 == null) {
            if (aib2.getX() == this.aOC.getX() && aib2.getY() == this.aOC.getY() && aib2.getZ() == this.aOC.getZ() || aib2.c(this.aOC) <= 9.5) {
                if (aia2 != null) {
                    this.aOx.clear();
                    this.aOx = aia2.vf();
                    this.aOx.add(aib2);
                    return true;
                }
                return false;
            }
            ArrayList<aib> arrayList = new ArrayList<aib>(aia2.vf());
            arrayList.add(aib2);
            this.aOw.add(new aia(aib2, aia2, arrayList, aib2.c(this.aOC), d2, d3));
        } else if (aia3.vk() > d2) {
            ArrayList<aib> arrayList = new ArrayList<aib>(aia2.vf());
            arrayList.add(aib2);
            aia3.b(aib2);
            aia3.a(aia2);
            aia3.e(arrayList);
            aia3.Y(aib2.c(this.aOC));
            aia3.Z(d2);
            aia3.aa(d3);
        }
        return false;
    }
}

