/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.aa;
import net.minecraft.init.Blocks;
import net.minecraft.util.b;
import net.minecraft.util.be;
import net.minecraft.util.bt;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.m;
import net.minecraft.world.chunk.f;
import net.minecraft.world.chunk.h;
import net.minecraft.world.w;

public class a
implements h {
    private static final List<IBlockState> dKf = Lists.newArrayList();
    private static final int dKg;
    private static final int dKh;
    private final w dKi;

    public a(w w2) {
        this.dKi = w2;
    }

    @Override
    public net.minecraft.world.chunk.a H(int n2, int n3) {
        int n4;
        f f2 = new f();
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                int n5 = n2 * 16 + i2;
                n4 = n3 * 16 + i3;
                f2.a(i2, 60, i3, Blocks.cOx.xM());
                IBlockState iBlockState = a.be(n5, n4);
                if (iBlockState == null) continue;
                f2.a(i2, 70, i3, iBlockState);
            }
        }
        net.minecraft.world.chunk.a a2 = new net.minecraft.world.chunk.a(this.dKi, f2, n2, n3);
        a2.axy();
        j[] jArray = this.dKi.avp().b(null, n2 * 16, n3 * 16, 16, 16);
        byte[] byArray = a2.axD();
        for (n4 = 0; n4 < byArray.length; ++n4) {
            byArray[n4] = (byte)jArray[n4].dHo;
        }
        a2.axy();
        return a2;
    }

    public static IBlockState be(int n2, int n3) {
        int n4;
        IBlockState iBlockState = null;
        if (n2 > 0 && n3 > 0 && n2 % 2 != 0 && n3 % 2 != 0 && (n2 /= 2) <= dKg && (n3 /= 2) <= dKh && (n4 = bt.hN(n2 * dKg + n3)) < dKf.size()) {
            iBlockState = dKf.get(n4);
        }
        return iBlockState;
    }

    @Override
    public boolean E(int n2, int n3) {
        return true;
    }

    @Override
    public void a(h h2, int n2, int n3) {
    }

    @Override
    public boolean a(h h2, net.minecraft.world.chunk.a a2, int n2, int n3) {
        return false;
    }

    @Override
    public boolean a(boolean bl2, be be2) {
        return true;
    }

    @Override
    public void Hj() {
    }

    @Override
    public boolean Hk() {
        return false;
    }

    @Override
    public boolean Hl() {
        return true;
    }

    @Override
    public String Hm() {
        return "DebugLevelSource";
    }

    @Override
    public List<m> a(aa aa2, b b2) {
        j j2 = this.dKi.aF(b2);
        return j2.a(aa2);
    }

    @Override
    public b a(w w2, String string, b b2) {
        return null;
    }

    @Override
    public int Hn() {
        return 0;
    }

    @Override
    public void a(net.minecraft.world.chunk.a a2, int n2, int n3) {
    }

    @Override
    public net.minecraft.world.chunk.a H(b b2) {
        return this.H(b2.wt() >> 4, b2.wx() >> 4);
    }

    static {
        for (Block block : Block.aRV) {
            dKf.addAll((Collection<IBlockState>)block.xL().zQ());
        }
        dKg = bt.bM(bt.bK(dKf.size()));
        dKh = bt.bM((float)dKf.size() / (float)dKg);
    }
}

