/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.block;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.stats.n;
import net.minecraft.tileentity.ad;
import net.minecraft.tileentity.d;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class BlockNote
extends BlockContainer {
    private static final List<String> aXk = Lists.newArrayList((Object[])new String[]{"harp", "bd", "snare", "hat", "bassattack"});

    public BlockNote() {
        super(Material.ber);
        this.a(a.cpz);
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        boolean bl2 = w2.bb(b2);
        d d2 = w2.K(b2);
        if (d2 instanceof ad) {
            ad ad2 = (ad)d2;
            if (ad2.dto != bl2) {
                if (bl2) {
                    ad2.ae(w2, b2);
                }
                ad2.dto = bl2;
            }
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        if (w2.dDw) {
            return true;
        }
        d d2 = w2.K(b2);
        if (d2 instanceof ad) {
            ad ad2 = (ad)d2;
            ad2.aqJ();
            ad2.ae(w2, b2);
            a2.a(n.dqt);
        }
        return true;
    }

    @Override
    public void a(w w2, b b2, net.minecraft.entity.player.a a2) {
        d d2;
        if (!w2.dDw && (d2 = w2.K(b2)) instanceof ad) {
            ((ad)d2).ae(w2, b2);
            a2.a(n.dqs);
        }
    }

    @Override
    public d a(w w2, int n2) {
        return new ad();
    }

    private String bc(int n2) {
        if (n2 < 0 || n2 >= aXk.size()) {
            n2 = 0;
        }
        return aXk.get(n2);
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, int n2, int n3) {
        float f2 = (float)Math.pow(2.0, (double)(n3 - 12) / 12.0);
        w2.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, "note." + this.bc(n2), 3.0f, f2);
        w2.a(as.dxt, (double)b2.wt() + 0.5, (double)b2.wu() + 1.2, (double)b2.wx() + 0.5, (double)n3 / 24.0, 0.0, 0.0, new int[0]);
        return true;
    }

    @Override
    public int xg() {
        return 3;
    }
}

