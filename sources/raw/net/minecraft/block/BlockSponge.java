/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.block;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.cr;
import net.minecraft.util.cw;
import net.minecraft.world.w;

public class BlockSponge
extends Block {
    public static final PropertyBool baW = PropertyBool.cs("wet");

    protected BlockSponge() {
        super(Material.beA);
        this.h(this.aSG.zS().a(baW, false));
        this.a(a.cpx);
    }

    @Override
    public String xA() {
        return cr.gm(this.xB() + ".dry.name");
    }

    @Override
    public int d(IBlockState iBlockState) {
        return iBlockState.b(baW) != false ? 1 : 0;
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState) {
        this.H(w2, b2, iBlockState);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        this.H(w2, b2, iBlockState);
        super.a(w2, b2, iBlockState, block);
    }

    protected void H(w w2, b b2, IBlockState iBlockState) {
        if (!iBlockState.b(baW).booleanValue() && this.T(w2, b2)) {
            w2.a(b2, iBlockState.a(baW, true), 2);
            w2.e(2001, b2, Block.i(Blocks.cLl));
        }
    }

    private boolean T(w w2, b b2) {
        LinkedList linkedList = Lists.newLinkedList();
        ArrayList arrayList = Lists.newArrayList();
        linkedList.add(new cw<b, Integer>(b2, 0));
        int n2 = 0;
        while (!linkedList.isEmpty()) {
            cw cw2 = (cw)linkedList.poll();
            b b3 = (b)cw2.wi();
            int n3 = (Integer)cw2.wj();
            for (ao ao2 : ao.values()) {
                b b4 = b3.x(ao2);
                if (w2.L(b4).df().xb() != Material.bev) continue;
                w2.a(b4, Blocks.cLc.xM(), 2);
                arrayList.add(b4);
                ++n2;
                if (n3 >= 6) continue;
                linkedList.add(new cw<b, Integer>(b4, n3 + 1));
            }
            if (n2 <= 64) continue;
            break;
        }
        for (b b3 : arrayList) {
            w2.c(b3, Blocks.cLc);
        }
        return n2 > 0;
    }

    @Override
    public void a(d d2, a a2, List<co> list) {
        list.add(new co(d2, 1, 0));
        list.add(new co(d2, 1, 1));
    }

    @Override
    public IBlockState aM(int n2) {
        return this.xM().a(baW, (n2 & 1) == 1);
    }

    @Override
    public int c(IBlockState iBlockState) {
        return iBlockState.b(baW) != false ? 1 : 0;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, baW);
    }

    @Override
    public void c(w w2, b b2, IBlockState iBlockState, Random random) {
        ao ao2;
        if (iBlockState.b(baW).booleanValue() && (ao2 = ao.g(random)) != ao.dwr && !w.v(w2, b2.x(ao2))) {
            double d2 = b2.wt();
            double d3 = b2.wu();
            double d4 = b2.wx();
            if (ao2 == ao.dwq) {
                d3 -= 0.05;
                d2 += random.nextDouble();
                d4 += random.nextDouble();
            } else {
                d3 += random.nextDouble() * 0.8;
                if (ao2.asL() == ap.dwH) {
                    d4 += random.nextDouble();
                    d2 = ao2 == ao.dwv ? (d2 += 1.0) : (d2 += 0.05);
                } else {
                    d2 += random.nextDouble();
                    d4 = ao2 == ao.dwt ? (d4 += 1.0) : (d4 += 0.05);
                }
            }
            w2.a(as.dxo, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
    }
}

