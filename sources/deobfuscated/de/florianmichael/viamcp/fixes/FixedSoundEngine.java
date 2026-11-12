/*
 * Decompiled with CFR 0.152.
 */
package de.florianmichael.viamcp.fixes;

import de.florianmichael.vialoadingbase.ViaLoadingBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.w;

public class FixedSoundEngine {
    private static final Minecraft mc = Minecraft.getMinecraft();

    public static boolean destroyBlock(w w2, b b2, boolean bl2) {
        IBlockState iBlockState = w2.L(b2);
        Block block = iBlockState.df();
        w2.e(2001, b2, Block.a(iBlockState));
        if (block.xb() == Material.beo) {
            return false;
        }
        if (bl2) {
            block.a(w2, b2, iBlockState, 0);
        }
        return w2.a(b2, Blocks.cLc.xM(), 3);
    }

    public static boolean onItemUse(af af2, co co2, a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        IBlockState iBlockState = w2.L(b2);
        Block block = iBlockState.df();
        if (!block.a(w2, b2)) {
            b2 = b2.x(ao2);
        }
        if (co2.cWZ == 0) {
            return false;
        }
        if (!a2.a(b2, ao2, co2)) {
            return false;
        }
        if (w2.a(af2.df(), b2, false, ao2, null, co2)) {
            int n2 = af2.fV(co2.yc());
            IBlockState iBlockState2 = af2.df().a(w2, b2, ao2, f2, f3, f4, n2, a2);
            if (w2.a(b2, iBlockState2, 3)) {
                iBlockState2 = w2.L(b2);
                if (iBlockState2.df() == af2.df()) {
                    af.a(w2, a2, b2, co2);
                    af2.df().a(w2, b2, iBlockState2, a2, co2);
                }
                if (ViaLoadingBase.getInstance().getTargetVersion().getOriginalVersion() != 47) {
                    FixedSoundEngine.mc.bgF.a(b2.ag(0.5, 0.5, 0.5), af2.df().aSB.xQ(), (af2.df().aSB.getVolume() + 1.0f) / 2.0f, af2.df().aSB.xT() * 0.8f, false);
                } else {
                    w2.a((float)b2.wt() + 0.5f, (double)((float)b2.wu() + 0.5f), (double)((float)b2.wx() + 0.5f), af2.df().aSB.xQ(), (af2.df().aSB.getVolume() + 1.0f) / 2.0f, af2.df().aSB.xT() * 0.8f);
                }
                --co2.cWZ;
            }
            return true;
        }
        return false;
    }
}

