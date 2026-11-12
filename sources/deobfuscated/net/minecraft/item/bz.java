/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.item;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import net.minecraft.block.BlockJukebox;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.c;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.cr;
import net.minecraft.world.w;

public class bz
extends d {
    private static final Map<String, bz> cWN = Maps.newHashMap();
    public final String cWO;

    protected bz(String string) {
        this.cWO = string;
        this.cVn = 1;
        this.d(a.cpB);
        cWN.put("records." + string, this);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        IBlockState iBlockState = w2.L(b2);
        if (iBlockState.df() == Blocks.cMP && !iBlockState.b(BlockJukebox.aWt).booleanValue()) {
            if (w2.dDw) {
                return true;
            }
            ((BlockJukebox)Blocks.cMP).a(w2, b2, iBlockState, co2);
            w2.b(null, 1005, b2, d.p(this));
            --co2.cWZ;
            a2.a(n.dqy);
            return true;
        }
        return false;
    }

    @Override
    public void a(co co2, net.minecraft.entity.player.a a2, List<String> list, boolean bl2) {
        list.add(this.aea());
    }

    public String aea() {
        return cr.gm("item.record." + this.cWO + ".desc");
    }

    @Override
    public c av(co co2) {
        return c.cVd;
    }

    public static bz ex(String string) {
        return cWN.get(string);
    }
}

