/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.d;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.cm;
import net.optifine.a;
import net.optifine.c;
import net.optifine.config.k;
import net.optifine.i;
import net.optifine.l;
import net.optifine.model.b;
import net.optifine.render.g;
import net.optifine.util.af;
import net.optifine.util.ah;
import net.optifine.util.an;

public class j {
    private static Map[] dWR = null;
    private static Map[] dWS = null;
    private static Map[][] dWT = null;
    private static i[][] dWU = null;
    private static i[][] dWV = null;
    private static boolean dWW = false;
    protected static final int dWX = -1;
    protected static final int dWY = 0;
    protected static final int dWZ = 1;
    protected static final int dXa = 2;
    protected static final int dXb = 3;
    protected static final int dXc = 4;
    protected static final int dXd = 5;
    private static final int dXe = 0;
    private static final int dXf = 1;
    private static final int dXg = 2;
    public static final IBlockState dXh = Blocks.cLc.xM();
    private static TextureAtlasSprite dXi = null;
    private static final c[] dXj = new c[]{c.dVe, c.dVf, c.dVc, c.dVd};
    private static final c[] dXk = new c[]{c.dVe, c.dVf, c.dVd, c.dVc};
    private static final c[] dXl = new c[]{c.dVf, c.dVe, c.dVa, c.dVb};
    private static final c[] dXm = new c[]{c.dVe, c.dVf, c.dVa, c.dVb};
    private static final c[] dXn = new c[]{c.dVc, c.dVd, c.dVa, c.dVb};
    private static final c[] dXo = new c[]{c.dVd, c.dVc, c.dVa, c.dVb};
    private static final c[] dXp = new c[]{c.dVe, c.dVf, c.dVb, c.dVa};
    private static final c[] dXq = new c[]{c.dVc, c.dVd, c.dVb, c.dVa};
    private static final c[] dXr = new c[]{c.dVh, c.dVg, c.dVj, c.dVi};
    private static final c[] dXs = new c[]{c.dVj, c.dVi, c.dVh, c.dVg};
    private static final c[] dXt = new c[]{c.dVo, c.dVp, c.dVq, c.dVr};
    private static final c[] dXu = new c[]{c.dVp, c.dVo, c.dVr, c.dVq};
    private static final c[] dXv = new c[]{c.dVl, c.dVk, c.dVn, c.dVm};
    private static final c[] dXw = new c[]{c.dVk, c.dVl, c.dVm, c.dVn};
    private static final c[] dXx = new c[]{c.dVr, c.dVq, c.dVp, c.dVo};
    private static final c[] dXy = new c[]{c.dVn, c.dVm, c.dVl, c.dVk};
    public static final TextureAtlasSprite dXz = new TextureAtlasSprite("<default>");

    public static BakedQuad[] a(net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, BakedQuad bakedQuad, g g2) {
        TextureAtlasSprite textureAtlasSprite = bakedQuad.LO();
        if (textureAtlasSprite == null) {
            return g2.f(bakedQuad);
        }
        Block block = iBlockState.df();
        if (j.b(l2, iBlockState, b2, bakedQuad, g2)) {
            bakedQuad = j.a(dXi, bakedQuad);
            return g2.f(bakedQuad);
        }
        ao ao2 = bakedQuad.LS();
        BakedQuad[] bakedQuadArray = j.a(l2, iBlockState, b2, ao2, bakedQuad, g2);
        return bakedQuadArray;
    }

    private static boolean b(net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, BakedQuad bakedQuad, g g2) {
        Object object;
        Block block = iBlockState.df();
        if (block instanceof BlockPane && ((TextureAtlasSprite)(object = bakedQuad.LO())).Oc().startsWith("minecraft:blocks/glass_pane_top")) {
            IBlockState iBlockState2 = l2.L(b2.x(bakedQuad.LS()));
            return iBlockState2 == iBlockState;
        }
        if (block instanceof BlockPane) {
            object = bakedQuad.LS();
            if (object != ao.dwr && object != ao.dwq) {
                return false;
            }
            if (!bakedQuad.LZ()) {
                return false;
            }
            net.minecraft.util.b b3 = b2.x(bakedQuad.LS());
            IBlockState iBlockState3 = l2.L(b3);
            if (iBlockState3.df() != block) {
                return false;
            }
            if (block == Blocks.cOJ && iBlockState3.b(BlockStainedGlassPane.baY) != iBlockState.b(BlockStainedGlassPane.baY)) {
                return false;
            }
            iBlockState3 = iBlockState3.df().a(iBlockState3, l2, b3);
            double d2 = bakedQuad.LW();
            if (d2 < 0.4) {
                return iBlockState3.b(BlockPane.aXs);
            }
            if (d2 > 0.6) {
                return iBlockState3.b(BlockPane.aXq);
            }
            double d3 = bakedQuad.LY();
            if (d3 < 0.4) {
                return iBlockState3.b(BlockPane.aXp);
            }
            if (d3 <= 0.6) {
                return true;
            }
            return iBlockState3.b(BlockPane.aXr);
        }
        return false;
    }

    protected static BakedQuad[] a(TextureAtlasSprite textureAtlasSprite, BakedQuad bakedQuad, g g2) {
        if (textureAtlasSprite == null) {
            return null;
        }
        if (textureAtlasSprite == dXz) {
            return g2.f(bakedQuad);
        }
        BakedQuad bakedQuad2 = j.a(textureAtlasSprite, bakedQuad);
        BakedQuad[] bakedQuadArray = g2.f(bakedQuad2);
        return bakedQuadArray;
    }

    private static synchronized BakedQuad a(TextureAtlasSprite textureAtlasSprite, BakedQuad bakedQuad) {
        if (dWR == null) {
            return bakedQuad;
        }
        int n2 = textureAtlasSprite.Oj();
        if (n2 >= 0 && n2 < dWR.length) {
            BakedQuad bakedQuad2;
            IdentityHashMap<BakedQuad, BakedQuad> identityHashMap = dWR[n2];
            if (identityHashMap == null) {
                j.dWR[n2] = identityHashMap = new IdentityHashMap<BakedQuad, BakedQuad>(1);
            }
            if ((bakedQuad2 = (BakedQuad)identityHashMap.get(bakedQuad)) == null) {
                bakedQuad2 = j.a(bakedQuad, textureAtlasSprite);
                identityHashMap.put(bakedQuad, bakedQuad2);
            }
            return bakedQuad2;
        }
        return bakedQuad;
    }

    private static synchronized BakedQuad a(TextureAtlasSprite textureAtlasSprite, BakedQuad bakedQuad, int n2) {
        if (dWS == null) {
            return null;
        }
        if (textureAtlasSprite == null) {
            return null;
        }
        int n3 = textureAtlasSprite.Oj();
        if (n3 >= 0 && n3 < dWS.length) {
            ao ao2;
            BakedQuad bakedQuad2;
            EnumMap<ao, BakedQuad> enumMap = dWS[n3];
            if (enumMap == null) {
                j.dWS[n3] = enumMap = new EnumMap<ao, BakedQuad>(ao.class);
            }
            if ((bakedQuad2 = (BakedQuad)enumMap.get(ao2 = bakedQuad.LS())) == null) {
                bakedQuad2 = b.a(ao2, textureAtlasSprite, n2);
                enumMap.put(ao2, bakedQuad2);
            }
            return bakedQuad2;
        }
        return null;
    }

    private static BakedQuad a(BakedQuad bakedQuad, TextureAtlasSprite textureAtlasSprite) {
        int[] nArray = (int[])bakedQuad.LP().clone();
        TextureAtlasSprite textureAtlasSprite2 = bakedQuad.LO();
        for (int i2 = 0; i2 < 4; ++i2) {
            j.a(nArray, i2, textureAtlasSprite2, textureAtlasSprite);
        }
        BakedQuad bakedQuad2 = new BakedQuad(nArray, bakedQuad.LR(), bakedQuad.LS(), textureAtlasSprite);
        return bakedQuad2;
    }

    private static void a(int[] nArray, int n2, TextureAtlasSprite textureAtlasSprite, TextureAtlasSprite textureAtlasSprite2) {
        int n3 = nArray.length / 4;
        int n4 = n3 * n2;
        float f2 = Float.intBitsToFloat(nArray[n4 + 4]);
        float f3 = Float.intBitsToFloat(nArray[n4 + 4 + 1]);
        double d2 = textureAtlasSprite.aD(f2);
        double d3 = textureAtlasSprite.aE(f3);
        nArray[n4 + 4] = Float.floatToRawIntBits(textureAtlasSprite2.al(d2));
        nArray[n4 + 4 + 1] = Float.floatToRawIntBits(textureAtlasSprite2.am(d3));
    }

    private static BakedQuad[] a(net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, ao ao2, BakedQuad bakedQuad, g g2) {
        int n2;
        BakedQuad[] bakedQuadArray = j.a(l2, iBlockState, b2, ao2, bakedQuad, true, 0, g2);
        if (!dWW) {
            return bakedQuadArray;
        }
        if (bakedQuadArray.length == 1 && bakedQuadArray[0] == bakedQuad) {
            return bakedQuadArray;
        }
        List<BakedQuad> list = g2.a(bakedQuadArray);
        for (n2 = 0; n2 < list.size(); ++n2) {
            BakedQuad[] bakedQuadArray2;
            BakedQuad bakedQuad2;
            BakedQuad bakedQuad3 = bakedQuad2 = list.get(n2);
            for (int i2 = 0; i2 < 3 && (bakedQuadArray2 = j.a(l2, iBlockState, b2, ao2, bakedQuad3, false, i2 + 1, g2)).length == 1 && bakedQuadArray2[0] != bakedQuad3; ++i2) {
                bakedQuad3 = bakedQuadArray2[0];
            }
            list.set(n2, bakedQuad3);
        }
        for (n2 = 0; n2 < bakedQuadArray.length; ++n2) {
            bakedQuadArray[n2] = list.get(n2);
        }
        return bakedQuadArray;
    }

    public static BakedQuad[] a(net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, ao ao2, BakedQuad bakedQuad, boolean bl2, int n2, g g2) {
        BakedQuad[] bakedQuadArray;
        i i2;
        int n3;
        int n4;
        i[] iArray;
        int n5;
        Block block = iBlockState.df();
        if (!(iBlockState instanceof BlockStateBase)) {
            return g2.f(bakedQuad);
        }
        BlockStateBase blockStateBase = (BlockStateBase)iBlockState;
        TextureAtlasSprite textureAtlasSprite = bakedQuad.LO();
        if (dWV != null && (n5 = textureAtlasSprite.Oj()) >= 0 && n5 < dWV.length && (iArray = dWV[n5]) != null) {
            n4 = j.B(ao2);
            for (n3 = 0; n3 < iArray.length; ++n3) {
                i2 = iArray[n3];
                if (i2 == null || !i2.iX(blockStateBase.zW()) || (bakedQuadArray = j.a(i2, l2, blockStateBase, b2, n4, bakedQuad, n2, g2)) == null) continue;
                return bakedQuadArray;
            }
        }
        if (dWU != null && bl2 && (n5 = g2.zW()) >= 0 && n5 < dWU.length && (iArray = dWU[n5]) != null) {
            n4 = j.B(ao2);
            for (n3 = 0; n3 < iArray.length; ++n3) {
                i2 = iArray[n3];
                if (i2 == null || !i2.j(textureAtlasSprite) || (bakedQuadArray = j.a(i2, l2, blockStateBase, b2, n4, bakedQuad, n2, g2)) == null) continue;
                return bakedQuadArray;
            }
        }
        return g2.f(bakedQuad);
    }

    public static int B(ao ao2) {
        if (ao2 == null) {
            return -1;
        }
        switch (ao2) {
            case dwq: {
                return 0;
            }
            case dwr: {
                return 1;
            }
            case dwv: {
                return 5;
            }
            case dwu: {
                return 4;
            }
            case dws: {
                return 2;
            }
            case dwt: {
                return 3;
            }
        }
        return -1;
    }

    private static ao aQ(int n2) {
        switch (n2) {
            case 0: {
                return ao.dwq;
            }
            case 1: {
                return ao.dwr;
            }
            case 2: {
                return ao.dws;
            }
            case 3: {
                return ao.dwt;
            }
            case 4: {
                return ao.dwu;
            }
            case 5: {
                return ao.dwv;
            }
        }
        return ao.dwr;
    }

    private static BakedQuad[] a(i i2, net.minecraft.world.l l2, BlockStateBase blockStateBase, net.minecraft.util.b b2, int n2, BakedQuad bakedQuad, int n3, g g2) {
        Object object;
        int n4;
        int n5;
        int n6 = 0;
        int n7 = n5 = blockStateBase.yc();
        Block block = blockStateBase.df();
        if (block instanceof BlockRotatedPillar) {
            n6 = j.bv(n2, n5);
            if (i2.aAo() <= 3) {
                n7 = n5 & 3;
            }
        }
        if (block instanceof BlockQuartz) {
            n6 = j.bw(n2, n5);
            if (i2.aAo() <= 2 && n7 > 2) {
                n7 = 2;
            }
        }
        if (!i2.bt(blockStateBase.zW(), n7)) {
            return null;
        }
        if (n2 >= 0 && i2.dVO != 63) {
            n4 = n2;
            if (n6 != 0) {
                n4 = j.bu(n2, n6);
            }
            if ((1 << n4 & i2.dVO) == 0) {
                return null;
            }
        }
        n4 = b2.wu();
        if (i2.dVP != null && !i2.dVP.jt(n4)) {
            return null;
        }
        if (i2.dEV != null && !i2.d((net.minecraft.world.biome.j)(object = l2.aF(b2)))) {
            return null;
        }
        if (i2.dVX != null && !i2.dVX.hW((String)(object = an.D(l2, b2)))) {
            return null;
        }
        object = bakedQuad.LO();
        switch (i2.dVL) {
            case 1: {
                return j.a(j.a(i2, l2, (IBlockState)blockStateBase, b2, n6, n2, (TextureAtlasSprite)object, n5, g2), bakedQuad, g2);
            }
            case 2: {
                return j.a(j.a(i2, l2, (IBlockState)blockStateBase, b2, n6, n2, (TextureAtlasSprite)object, n5), bakedQuad, g2);
            }
            case 3: {
                return j.a(j.e(i2, l2, blockStateBase, b2, n6, n2, (TextureAtlasSprite)object, n5), bakedQuad, g2);
            }
            case 4: {
                return j.a(j.a(i2, l2, blockStateBase, b2, n2), bakedQuad, g2);
            }
            case 5: {
                return j.a(j.a(i2, b2, n2), bakedQuad, g2);
            }
            case 6: {
                return j.a(j.b(i2, l2, blockStateBase, b2, n6, n2, (TextureAtlasSprite)object, n5), bakedQuad, g2);
            }
            case 7: {
                return j.a(j.a(i2), bakedQuad, g2);
            }
            case 8: {
                return j.a(j.c(i2, l2, blockStateBase, b2, n6, n2, (TextureAtlasSprite)object, n5), bakedQuad, g2);
            }
            case 9: {
                return j.a(j.d(i2, l2, blockStateBase, b2, n6, n2, (TextureAtlasSprite)object, n5), bakedQuad, g2);
            }
            case 10: {
                if (n3 == 0) {
                    return j.a(i2, l2, (IBlockState)blockStateBase, b2, n6, n2, bakedQuad, n5, g2);
                }
            }
            default: {
                return null;
            }
            case 11: {
                return j.b(i2, l2, (IBlockState)blockStateBase, b2, n6, n2, bakedQuad, n5, g2);
            }
            case 12: {
                return j.a(i2, bakedQuad, g2);
            }
            case 13: {
                return j.a(i2, l2, blockStateBase, b2, n2, bakedQuad, g2);
            }
            case 14: {
                return j.a(i2, b2, n2, bakedQuad, g2);
            }
            case 15: 
        }
        return j.c(i2, l2, blockStateBase, b2, n6, n2, bakedQuad, n5, g2);
    }

    private static int bu(int n2, int n3) {
        switch (n3) {
            case 0: {
                return n2;
            }
            case 1: {
                switch (n2) {
                    case 0: {
                        return 2;
                    }
                    case 1: {
                        return 3;
                    }
                    case 2: {
                        return 1;
                    }
                    case 3: {
                        return 0;
                    }
                }
                return n2;
            }
            case 2: {
                switch (n2) {
                    case 0: {
                        return 4;
                    }
                    case 1: {
                        return 5;
                    }
                    default: {
                        return n2;
                    }
                    case 4: {
                        return 1;
                    }
                    case 5: 
                }
                return 0;
            }
        }
        return n2;
    }

    private static int bv(int n2, int n3) {
        int n4 = (n3 & 0xC) >> 2;
        switch (n4) {
            case 1: {
                return 2;
            }
            case 2: {
                return 1;
            }
        }
        return 0;
    }

    private static int bw(int n2, int n3) {
        switch (n3) {
            case 3: {
                return 2;
            }
            case 4: {
                return 1;
            }
        }
        return 0;
    }

    private static TextureAtlasSprite a(i i2, net.minecraft.world.l l2, BlockStateBase blockStateBase, net.minecraft.util.b b2, int n2) {
        int n3;
        if (i2.dWb.length == 1) {
            return i2.dWb[0];
        }
        int n4 = n2 / i2.dVV * i2.dVV;
        if (i2.dVW) {
            net.minecraft.util.b b3 = b2.aqY();
            IBlockState iBlockState = l2.L(b3);
            while (iBlockState.df() == blockStateBase.df()) {
                b2 = b3;
                if ((b3 = b3.aqY()).wu() < 0) break;
                iBlockState = l2.L(b3);
            }
        }
        int n5 = net.minecraft.src.a.d(b2, n4) & Integer.MAX_VALUE;
        for (n3 = 0; n3 < i2.dVU; ++n3) {
            n5 = net.minecraft.src.a.hh(n5);
        }
        n3 = 0;
        if (i2.dVT == null) {
            n3 = n5 % i2.dWb.length;
        } else {
            int n6 = n5 % i2.dVZ;
            int[] nArray = i2.dVY;
            for (int i3 = 0; i3 < nArray.length; ++i3) {
                if (n6 >= nArray[i3]) continue;
                n3 = i3;
                break;
            }
        }
        return i2.dWb[n3];
    }

    private static TextureAtlasSprite a(i i2) {
        return i2.dWb[0];
    }

    private static TextureAtlasSprite a(i i2, net.minecraft.util.b b2, int n2) {
        if (i2.dWb.length == 1) {
            return i2.dWb[0];
        }
        int n3 = b2.wt();
        int n4 = b2.wu();
        int n5 = b2.wx();
        int n6 = 0;
        int n7 = 0;
        switch (n2) {
            case 0: {
                n6 = n3;
                n7 = -n5 - 1;
                break;
            }
            case 1: {
                n6 = n3;
                n7 = n5;
                break;
            }
            case 2: {
                n6 = -n3 - 1;
                n7 = -n4;
                break;
            }
            case 3: {
                n6 = n3;
                n7 = -n4;
                break;
            }
            case 4: {
                n6 = n5;
                n7 = -n4;
                break;
            }
            case 5: {
                n6 = -n5 - 1;
                n7 = -n4;
            }
        }
        n7 %= i2.height;
        if ((n6 %= i2.width) < 0) {
            n6 += i2.width;
        }
        if (n7 < 0) {
            n7 += i2.height;
        }
        int n8 = n7 * i2.width + n6;
        return i2.dWb[n8];
    }

    private static TextureAtlasSprite a(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, int n2, int n3, TextureAtlasSprite textureAtlasSprite, int n4, g g2) {
        int n5 = j.b(i2, l2, iBlockState, b2, n2, n3, textureAtlasSprite, n4, g2);
        return i2.dWb[n5];
    }

    private static synchronized BakedQuad[] a(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, int n2, int n3, BakedQuad bakedQuad, int n4, g g2) {
        TextureAtlasSprite textureAtlasSprite = bakedQuad.LO();
        int n5 = j.b(i2, l2, iBlockState, b2, n2, n3, textureAtlasSprite, n4, g2);
        return l.a(n5, i2, n3, bakedQuad, g2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static BakedQuad[] b(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, int n2, int n3, BakedQuad bakedQuad, int n4, g g2) {
        Object var13_18;
        if (!bakedQuad.Ma()) {
            return null;
        }
        TextureAtlasSprite textureAtlasSprite = bakedQuad.LO();
        c[] cArray = j.bx(n3, n2);
        boolean[] blArray = g2.aEa();
        for (int i3 = 0; i3 < 4; ++i3) {
            blArray[i3] = j.a(i2, l2, iBlockState, cArray[i3].by(b2), n3, textureAtlasSprite, n4);
        }
        net.optifine.model.c c2 = g2.k(i2.dWg);
        try {
            if (!(blArray[0] && blArray[1] && blArray[2] && blArray[3])) {
                if (blArray[0] && blArray[1] && blArray[2]) {
                    c2.a(j.a(i2.dWb[5], bakedQuad, i2.bQs), i2.dWf);
                    Object var13_14 = null;
                    BakedQuad[] bakedQuadArray = var13_14;
                    return bakedQuadArray;
                }
                if (blArray[0] && blArray[2] && blArray[3]) {
                    c2.a(j.a(i2.dWb[6], bakedQuad, i2.bQs), i2.dWf);
                    Object var13_15 = null;
                    BakedQuad[] bakedQuadArray = var13_15;
                    return bakedQuadArray;
                }
                if (blArray[1] && blArray[2] && blArray[3]) {
                    c2.a(j.a(i2.dWb[12], bakedQuad, i2.bQs), i2.dWf);
                    Object var13_16 = null;
                    BakedQuad[] bakedQuadArray = var13_16;
                    return bakedQuadArray;
                }
                if (blArray[0] && blArray[1] && blArray[3]) {
                    c2.a(j.a(i2.dWb[13], bakedQuad, i2.bQs), i2.dWf);
                    Object var13_17 = null;
                    BakedQuad[] bakedQuadArray = var13_17;
                    return bakedQuadArray;
                }
                c[] cArray2 = j.by(n3, n2);
                boolean[] blArray2 = g2.aEb();
                for (int i4 = 0; i4 < 4; ++i4) {
                    blArray2[i4] = j.a(i2, l2, iBlockState, cArray2[i4].by(b2), n3, textureAtlasSprite, n4);
                }
                if (blArray[1] && blArray[2]) {
                    c2.a(j.a(i2.dWb[3], bakedQuad, i2.bQs), i2.dWf);
                    if (blArray2[3]) {
                        c2.a(j.a(i2.dWb[16], bakedQuad, i2.bQs), i2.dWf);
                    }
                    Object var16_26 = null;
                    BakedQuad[] bakedQuadArray = var16_26;
                    return bakedQuadArray;
                }
                if (blArray[0] && blArray[2]) {
                    c2.a(j.a(i2.dWb[4], bakedQuad, i2.bQs), i2.dWf);
                    if (blArray2[2]) {
                        c2.a(j.a(i2.dWb[14], bakedQuad, i2.bQs), i2.dWf);
                    }
                    Object var16_27 = null;
                    BakedQuad[] bakedQuadArray = var16_27;
                    return bakedQuadArray;
                }
                if (blArray[1] && blArray[3]) {
                    c2.a(j.a(i2.dWb[10], bakedQuad, i2.bQs), i2.dWf);
                    if (blArray2[1]) {
                        c2.a(j.a(i2.dWb[2], bakedQuad, i2.bQs), i2.dWf);
                    }
                    Object var16_28 = null;
                    BakedQuad[] bakedQuadArray = var16_28;
                    return bakedQuadArray;
                }
                if (blArray[0] && blArray[3]) {
                    c2.a(j.a(i2.dWb[11], bakedQuad, i2.bQs), i2.dWf);
                    if (blArray2[0]) {
                        c2.a(j.a(i2.dWb[0], bakedQuad, i2.bQs), i2.dWf);
                    }
                    Object var16_29 = null;
                    BakedQuad[] bakedQuadArray = var16_29;
                    return bakedQuadArray;
                }
                boolean[] blArray3 = g2.aEc();
                for (int i5 = 0; i5 < 4; ++i5) {
                    blArray3[i5] = j.b(i2, l2, iBlockState, cArray[i5].by(b2), n3, textureAtlasSprite, n4);
                }
                if (blArray[0]) {
                    c2.a(j.a(i2.dWb[9], bakedQuad, i2.bQs), i2.dWf);
                }
                if (blArray[1]) {
                    c2.a(j.a(i2.dWb[7], bakedQuad, i2.bQs), i2.dWf);
                }
                if (blArray[2]) {
                    c2.a(j.a(i2.dWb[1], bakedQuad, i2.bQs), i2.dWf);
                }
                if (blArray[3]) {
                    c2.a(j.a(i2.dWb[15], bakedQuad, i2.bQs), i2.dWf);
                }
                if (blArray2[0] && (blArray3[1] || blArray3[2]) && !blArray[1] && !blArray[2]) {
                    c2.a(j.a(i2.dWb[0], bakedQuad, i2.bQs), i2.dWf);
                }
                if (blArray2[1] && (blArray3[0] || blArray3[2]) && !blArray[0] && !blArray[2]) {
                    c2.a(j.a(i2.dWb[2], bakedQuad, i2.bQs), i2.dWf);
                }
                if (blArray2[2] && (blArray3[1] || blArray3[3]) && !blArray[1] && !blArray[3]) {
                    c2.a(j.a(i2.dWb[14], bakedQuad, i2.bQs), i2.dWf);
                }
                if (blArray2[3] && (blArray3[0] || blArray3[3]) && !blArray[0] && !blArray[3]) {
                    c2.a(j.a(i2.dWb[16], bakedQuad, i2.bQs), i2.dWf);
                }
                Object var17_36 = null;
                BakedQuad[] bakedQuadArray = var17_36;
                return bakedQuadArray;
            }
            c2.a(j.a(i2.dWb[8], bakedQuad, i2.bQs), i2.dWf);
            var13_18 = null;
        }
        finally {
            if (c2.size() > 0) {
                g2.cP(true);
            }
        }
        return var13_18;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static BakedQuad[] a(i i2, BakedQuad bakedQuad, g g2) {
        Object var4_5;
        if (!bakedQuad.Ma()) {
            return null;
        }
        net.optifine.model.c c2 = g2.k(i2.dWg);
        try {
            TextureAtlasSprite textureAtlasSprite = j.a(i2);
            if (textureAtlasSprite != null) {
                c2.a(j.a(textureAtlasSprite, bakedQuad, i2.bQs), i2.dWf);
            }
            var4_5 = null;
        }
        finally {
            if (c2.size() > 0) {
                g2.cP(true);
            }
        }
        return var4_5;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static BakedQuad[] a(i i2, net.minecraft.world.l l2, BlockStateBase blockStateBase, net.minecraft.util.b b2, int n2, BakedQuad bakedQuad, g g2) {
        Object var8_9;
        if (!bakedQuad.Ma()) {
            return null;
        }
        net.optifine.model.c c2 = g2.k(i2.dWg);
        try {
            TextureAtlasSprite textureAtlasSprite = j.a(i2, l2, blockStateBase, b2, n2);
            if (textureAtlasSprite != null) {
                c2.a(j.a(textureAtlasSprite, bakedQuad, i2.bQs), i2.dWf);
            }
            var8_9 = null;
        }
        finally {
            if (c2.size() > 0) {
                g2.cP(true);
            }
        }
        return var8_9;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static BakedQuad[] a(i i2, net.minecraft.util.b b2, int n2, BakedQuad bakedQuad, g g2) {
        Object var6_7;
        if (!bakedQuad.Ma()) {
            return null;
        }
        net.optifine.model.c c2 = g2.k(i2.dWg);
        try {
            TextureAtlasSprite textureAtlasSprite = j.a(i2, b2, n2);
            if (textureAtlasSprite != null) {
                c2.a(j.a(textureAtlasSprite, bakedQuad, i2.bQs), i2.dWf);
            }
            var6_7 = null;
        }
        finally {
            if (c2.size() > 0) {
                g2.cP(true);
            }
        }
        return var6_7;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static BakedQuad[] c(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, int n2, int n3, BakedQuad bakedQuad, int n4, g g2) {
        Object var10_11;
        if (!bakedQuad.Ma()) {
            return null;
        }
        net.optifine.model.c c2 = g2.k(i2.dWg);
        try {
            TextureAtlasSprite textureAtlasSprite = j.a(i2, l2, iBlockState, b2, n2, n3, bakedQuad.LO(), n4, g2);
            if (textureAtlasSprite != null) {
                c2.a(j.a(textureAtlasSprite, bakedQuad, i2.bQs), i2.dWf);
            }
            var10_11 = null;
        }
        finally {
            if (c2.size() > 0) {
                g2.cP(true);
            }
        }
        return var10_11;
    }

    private static c[] bx(int n2, int n3) {
        switch (n2) {
            case 0: {
                return dXj;
            }
            case 1: {
                return dXk;
            }
            case 2: {
                if (n3 == 1) {
                    return dXp;
                }
                return dXl;
            }
            case 3: {
                return dXm;
            }
            case 4: {
                return dXn;
            }
            case 5: {
                if (n3 == 2) {
                    return dXq;
                }
                return dXo;
            }
        }
        throw new IllegalArgumentException("Unknown side: " + n2);
    }

    private static c[] by(int n2, int n3) {
        switch (n2) {
            case 0: {
                return dXr;
            }
            case 1: {
                return dXs;
            }
            case 2: {
                if (n3 == 1) {
                    return dXx;
                }
                return dXt;
            }
            case 3: {
                return dXu;
            }
            case 4: {
                return dXv;
            }
            case 5: {
                if (n3 == 2) {
                    return dXy;
                }
                return dXw;
            }
        }
        throw new IllegalArgumentException("Unknown side: " + n2);
    }

    protected static Map[][] aAp() {
        return dWT;
    }

    private static int b(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, int n2, int n3, TextureAtlasSprite textureAtlasSprite, int n4, g g2) {
        boolean[] blArray = g2.aEa();
        switch (n3) {
            case 0: {
                blArray[0] = j.c(i2, l2, iBlockState, b2.arb(), n3, textureAtlasSprite, n4);
                blArray[1] = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
                blArray[2] = j.c(i2, l2, iBlockState, b2.aqZ(), n3, textureAtlasSprite, n4);
                blArray[3] = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                if (!i2.dVR) break;
                net.minecraft.util.b b3 = b2.aqY();
                blArray[0] = blArray[0] && !j.c(i2, l2, iBlockState, b3.arb(), n3, textureAtlasSprite, n4);
                blArray[1] = blArray[1] && !j.c(i2, l2, iBlockState, b3.arc(), n3, textureAtlasSprite, n4);
                blArray[2] = blArray[2] && !j.c(i2, l2, iBlockState, b3.aqZ(), n3, textureAtlasSprite, n4);
                blArray[3] = blArray[3] && !j.c(i2, l2, iBlockState, b3.ara(), n3, textureAtlasSprite, n4);
                break;
            }
            case 1: {
                blArray[0] = j.c(i2, l2, iBlockState, b2.arb(), n3, textureAtlasSprite, n4);
                blArray[1] = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
                blArray[2] = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                blArray[3] = j.c(i2, l2, iBlockState, b2.aqZ(), n3, textureAtlasSprite, n4);
                if (!i2.dVR) break;
                net.minecraft.util.b b3 = b2.aqX();
                blArray[0] = blArray[0] && !j.c(i2, l2, iBlockState, b3.arb(), n3, textureAtlasSprite, n4);
                blArray[1] = blArray[1] && !j.c(i2, l2, iBlockState, b3.arc(), n3, textureAtlasSprite, n4);
                blArray[2] = blArray[2] && !j.c(i2, l2, iBlockState, b3.ara(), n3, textureAtlasSprite, n4);
                blArray[3] = blArray[3] && !j.c(i2, l2, iBlockState, b3.aqZ(), n3, textureAtlasSprite, n4);
                break;
            }
            case 2: {
                net.minecraft.util.b b3;
                blArray[0] = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
                blArray[1] = j.c(i2, l2, iBlockState, b2.arb(), n3, textureAtlasSprite, n4);
                blArray[2] = j.c(i2, l2, iBlockState, b2.aqY(), n3, textureAtlasSprite, n4);
                blArray[3] = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                if (i2.dVR) {
                    b3 = b2.aqZ();
                    blArray[0] = blArray[0] && !j.c(i2, l2, iBlockState, b3.arc(), n3, textureAtlasSprite, n4);
                    blArray[1] = blArray[1] && !j.c(i2, l2, iBlockState, b3.arb(), n3, textureAtlasSprite, n4);
                    blArray[2] = blArray[2] && !j.c(i2, l2, iBlockState, b3.aqY(), n3, textureAtlasSprite, n4);
                    boolean bl2 = blArray[3] = blArray[3] && !j.c(i2, l2, iBlockState, b3.aqX(), n3, textureAtlasSprite, n4);
                }
                if (n2 != 1) break;
                j.a(0, 1, blArray);
                j.a(2, 3, blArray);
                break;
            }
            case 3: {
                blArray[0] = j.c(i2, l2, iBlockState, b2.arb(), n3, textureAtlasSprite, n4);
                blArray[1] = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
                blArray[2] = j.c(i2, l2, iBlockState, b2.aqY(), n3, textureAtlasSprite, n4);
                blArray[3] = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                if (!i2.dVR) break;
                net.minecraft.util.b b3 = b2.ara();
                blArray[0] = blArray[0] && !j.c(i2, l2, iBlockState, b3.arb(), n3, textureAtlasSprite, n4);
                blArray[1] = blArray[1] && !j.c(i2, l2, iBlockState, b3.arc(), n3, textureAtlasSprite, n4);
                blArray[2] = blArray[2] && !j.c(i2, l2, iBlockState, b3.aqY(), n3, textureAtlasSprite, n4);
                blArray[3] = blArray[3] && !j.c(i2, l2, iBlockState, b3.aqX(), n3, textureAtlasSprite, n4);
                break;
            }
            case 4: {
                blArray[0] = j.c(i2, l2, iBlockState, b2.aqZ(), n3, textureAtlasSprite, n4);
                blArray[1] = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                blArray[2] = j.c(i2, l2, iBlockState, b2.aqY(), n3, textureAtlasSprite, n4);
                blArray[3] = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                if (!i2.dVR) break;
                net.minecraft.util.b b3 = b2.arb();
                blArray[0] = blArray[0] && !j.c(i2, l2, iBlockState, b3.aqZ(), n3, textureAtlasSprite, n4);
                blArray[1] = blArray[1] && !j.c(i2, l2, iBlockState, b3.ara(), n3, textureAtlasSprite, n4);
                blArray[2] = blArray[2] && !j.c(i2, l2, iBlockState, b3.aqY(), n3, textureAtlasSprite, n4);
                blArray[3] = blArray[3] && !j.c(i2, l2, iBlockState, b3.aqX(), n3, textureAtlasSprite, n4);
                break;
            }
            case 5: {
                net.minecraft.util.b b3;
                blArray[0] = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                blArray[1] = j.c(i2, l2, iBlockState, b2.aqZ(), n3, textureAtlasSprite, n4);
                blArray[2] = j.c(i2, l2, iBlockState, b2.aqY(), n3, textureAtlasSprite, n4);
                blArray[3] = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                if (i2.dVR) {
                    b3 = b2.arc();
                    blArray[0] = blArray[0] && !j.c(i2, l2, iBlockState, b3.ara(), n3, textureAtlasSprite, n4);
                    blArray[1] = blArray[1] && !j.c(i2, l2, iBlockState, b3.aqZ(), n3, textureAtlasSprite, n4);
                    blArray[2] = blArray[2] && !j.c(i2, l2, iBlockState, b3.aqY(), n3, textureAtlasSprite, n4);
                    boolean bl3 = blArray[3] = blArray[3] && !j.c(i2, l2, iBlockState, b3.aqX(), n3, textureAtlasSprite, n4);
                }
                if (n2 != 2) break;
                j.a(0, 1, blArray);
                j.a(2, 3, blArray);
            }
        }
        int n5 = 0;
        if (blArray[0] & !blArray[1] & !blArray[2] & !blArray[3]) {
            n5 = 3;
        } else if (!blArray[0] & blArray[1] & !blArray[2] & !blArray[3]) {
            n5 = 1;
        } else if (!blArray[0] & !blArray[1] & blArray[2] & !blArray[3]) {
            n5 = 12;
        } else if (!blArray[0] & !blArray[1] & !blArray[2] & blArray[3]) {
            n5 = 36;
        } else if (blArray[0] & blArray[1] & !blArray[2] & !blArray[3]) {
            n5 = 2;
        } else if (!blArray[0] & !blArray[1] & blArray[2] & blArray[3]) {
            n5 = 24;
        } else if (blArray[0] & !blArray[1] & blArray[2] & !blArray[3]) {
            n5 = 15;
        } else if (blArray[0] & !blArray[1] & !blArray[2] & blArray[3]) {
            n5 = 39;
        } else if (!blArray[0] & blArray[1] & blArray[2] & !blArray[3]) {
            n5 = 13;
        } else if (!blArray[0] & blArray[1] & !blArray[2] & blArray[3]) {
            n5 = 37;
        } else if (!blArray[0] & blArray[1] & blArray[2] & blArray[3]) {
            n5 = 25;
        } else if (blArray[0] & !blArray[1] & blArray[2] & blArray[3]) {
            n5 = 27;
        } else if (blArray[0] & blArray[1] & !blArray[2] & blArray[3]) {
            n5 = 38;
        } else if (blArray[0] & blArray[1] & blArray[2] & !blArray[3]) {
            n5 = 14;
        } else if (blArray[0] & blArray[1] & blArray[2] & blArray[3]) {
            n5 = 26;
        }
        if (n5 == 0) {
            return n5;
        }
        if (!net.minecraft.src.a.aoD()) {
            return n5;
        }
        switch (n3) {
            case 0: {
                blArray[0] = !j.c(i2, l2, iBlockState, b2.arc().aqZ(), n3, textureAtlasSprite, n4);
                blArray[1] = !j.c(i2, l2, iBlockState, b2.arb().aqZ(), n3, textureAtlasSprite, n4);
                blArray[2] = !j.c(i2, l2, iBlockState, b2.arc().ara(), n3, textureAtlasSprite, n4);
                boolean bl4 = blArray[3] = !j.c(i2, l2, iBlockState, b2.arb().ara(), n3, textureAtlasSprite, n4);
                if (!i2.dVR) break;
                net.minecraft.util.b b4 = b2.aqY();
                blArray[0] = blArray[0] || j.c(i2, l2, iBlockState, b4.arc().aqZ(), n3, textureAtlasSprite, n4);
                blArray[1] = blArray[1] || j.c(i2, l2, iBlockState, b4.arb().aqZ(), n3, textureAtlasSprite, n4);
                blArray[2] = blArray[2] || j.c(i2, l2, iBlockState, b4.arc().ara(), n3, textureAtlasSprite, n4);
                blArray[3] = blArray[3] || j.c(i2, l2, iBlockState, b4.arb().ara(), n3, textureAtlasSprite, n4);
                break;
            }
            case 1: {
                blArray[0] = !j.c(i2, l2, iBlockState, b2.arc().ara(), n3, textureAtlasSprite, n4);
                blArray[1] = !j.c(i2, l2, iBlockState, b2.arb().ara(), n3, textureAtlasSprite, n4);
                blArray[2] = !j.c(i2, l2, iBlockState, b2.arc().aqZ(), n3, textureAtlasSprite, n4);
                boolean bl5 = blArray[3] = !j.c(i2, l2, iBlockState, b2.arb().aqZ(), n3, textureAtlasSprite, n4);
                if (!i2.dVR) break;
                net.minecraft.util.b b5 = b2.aqX();
                blArray[0] = blArray[0] || j.c(i2, l2, iBlockState, b5.arc().ara(), n3, textureAtlasSprite, n4);
                blArray[1] = blArray[1] || j.c(i2, l2, iBlockState, b5.arb().ara(), n3, textureAtlasSprite, n4);
                blArray[2] = blArray[2] || j.c(i2, l2, iBlockState, b5.arc().aqZ(), n3, textureAtlasSprite, n4);
                blArray[3] = blArray[3] || j.c(i2, l2, iBlockState, b5.arb().aqZ(), n3, textureAtlasSprite, n4);
                break;
            }
            case 2: {
                blArray[0] = !j.c(i2, l2, iBlockState, b2.arb().aqY(), n3, textureAtlasSprite, n4);
                blArray[1] = !j.c(i2, l2, iBlockState, b2.arc().aqY(), n3, textureAtlasSprite, n4);
                blArray[2] = !j.c(i2, l2, iBlockState, b2.arb().aqX(), n3, textureAtlasSprite, n4);
                boolean bl6 = blArray[3] = !j.c(i2, l2, iBlockState, b2.arc().aqX(), n3, textureAtlasSprite, n4);
                if (i2.dVR) {
                    net.minecraft.util.b b6 = b2.aqZ();
                    blArray[0] = blArray[0] || j.c(i2, l2, iBlockState, b6.arb().aqY(), n3, textureAtlasSprite, n4);
                    blArray[1] = blArray[1] || j.c(i2, l2, iBlockState, b6.arc().aqY(), n3, textureAtlasSprite, n4);
                    blArray[2] = blArray[2] || j.c(i2, l2, iBlockState, b6.arb().aqX(), n3, textureAtlasSprite, n4);
                    boolean bl7 = blArray[3] = blArray[3] || j.c(i2, l2, iBlockState, b6.arc().aqX(), n3, textureAtlasSprite, n4);
                }
                if (n2 != 1) break;
                j.a(0, 3, blArray);
                j.a(1, 2, blArray);
                break;
            }
            case 3: {
                blArray[0] = !j.c(i2, l2, iBlockState, b2.arc().aqY(), n3, textureAtlasSprite, n4);
                blArray[1] = !j.c(i2, l2, iBlockState, b2.arb().aqY(), n3, textureAtlasSprite, n4);
                blArray[2] = !j.c(i2, l2, iBlockState, b2.arc().aqX(), n3, textureAtlasSprite, n4);
                boolean bl8 = blArray[3] = !j.c(i2, l2, iBlockState, b2.arb().aqX(), n3, textureAtlasSprite, n4);
                if (!i2.dVR) break;
                net.minecraft.util.b b7 = b2.ara();
                blArray[0] = blArray[0] || j.c(i2, l2, iBlockState, b7.arc().aqY(), n3, textureAtlasSprite, n4);
                blArray[1] = blArray[1] || j.c(i2, l2, iBlockState, b7.arb().aqY(), n3, textureAtlasSprite, n4);
                blArray[2] = blArray[2] || j.c(i2, l2, iBlockState, b7.arc().aqX(), n3, textureAtlasSprite, n4);
                blArray[3] = blArray[3] || j.c(i2, l2, iBlockState, b7.arb().aqX(), n3, textureAtlasSprite, n4);
                break;
            }
            case 4: {
                blArray[0] = !j.c(i2, l2, iBlockState, b2.aqY().ara(), n3, textureAtlasSprite, n4);
                blArray[1] = !j.c(i2, l2, iBlockState, b2.aqY().aqZ(), n3, textureAtlasSprite, n4);
                blArray[2] = !j.c(i2, l2, iBlockState, b2.aqX().ara(), n3, textureAtlasSprite, n4);
                boolean bl9 = blArray[3] = !j.c(i2, l2, iBlockState, b2.aqX().aqZ(), n3, textureAtlasSprite, n4);
                if (!i2.dVR) break;
                net.minecraft.util.b b8 = b2.arb();
                blArray[0] = blArray[0] || j.c(i2, l2, iBlockState, b8.aqY().ara(), n3, textureAtlasSprite, n4);
                blArray[1] = blArray[1] || j.c(i2, l2, iBlockState, b8.aqY().aqZ(), n3, textureAtlasSprite, n4);
                blArray[2] = blArray[2] || j.c(i2, l2, iBlockState, b8.aqX().ara(), n3, textureAtlasSprite, n4);
                blArray[3] = blArray[3] || j.c(i2, l2, iBlockState, b8.aqX().aqZ(), n3, textureAtlasSprite, n4);
                break;
            }
            case 5: {
                blArray[0] = !j.c(i2, l2, iBlockState, b2.aqY().aqZ(), n3, textureAtlasSprite, n4);
                blArray[1] = !j.c(i2, l2, iBlockState, b2.aqY().ara(), n3, textureAtlasSprite, n4);
                blArray[2] = !j.c(i2, l2, iBlockState, b2.aqX().aqZ(), n3, textureAtlasSprite, n4);
                boolean bl10 = blArray[3] = !j.c(i2, l2, iBlockState, b2.aqX().ara(), n3, textureAtlasSprite, n4);
                if (i2.dVR) {
                    net.minecraft.util.b b9 = b2.arc();
                    blArray[0] = blArray[0] || j.c(i2, l2, iBlockState, b9.aqY().aqZ(), n3, textureAtlasSprite, n4);
                    blArray[1] = blArray[1] || j.c(i2, l2, iBlockState, b9.aqY().ara(), n3, textureAtlasSprite, n4);
                    blArray[2] = blArray[2] || j.c(i2, l2, iBlockState, b9.aqX().aqZ(), n3, textureAtlasSprite, n4);
                    boolean bl11 = blArray[3] = blArray[3] || j.c(i2, l2, iBlockState, b9.aqX().ara(), n3, textureAtlasSprite, n4);
                }
                if (n2 != 2) break;
                j.a(0, 3, blArray);
                j.a(1, 2, blArray);
            }
        }
        if (n5 == 13 && blArray[0]) {
            n5 = 4;
        } else if (n5 == 15 && blArray[1]) {
            n5 = 5;
        } else if (n5 == 37 && blArray[2]) {
            n5 = 16;
        } else if (n5 == 39 && blArray[3]) {
            n5 = 17;
        } else if (n5 == 14 && blArray[0] && blArray[1]) {
            n5 = 7;
        } else if (n5 == 25 && blArray[0] && blArray[2]) {
            n5 = 6;
        } else if (n5 == 27 && blArray[3] && blArray[1]) {
            n5 = 19;
        } else if (n5 == 38 && blArray[3] && blArray[2]) {
            n5 = 18;
        } else if (n5 == 14 && !blArray[0] && blArray[1]) {
            n5 = 31;
        } else if (n5 == 25 && blArray[0] && !blArray[2]) {
            n5 = 30;
        } else if (n5 == 27 && !blArray[3] && blArray[1]) {
            n5 = 41;
        } else if (n5 == 38 && blArray[3] && !blArray[2]) {
            n5 = 40;
        } else if (n5 == 14 && blArray[0] && !blArray[1]) {
            n5 = 29;
        } else if (n5 == 25 && !blArray[0] && blArray[2]) {
            n5 = 28;
        } else if (n5 == 27 && blArray[3] && !blArray[1]) {
            n5 = 43;
        } else if (n5 == 38 && !blArray[3] && blArray[2]) {
            n5 = 42;
        } else if (n5 == 26 && blArray[0] && blArray[1] && blArray[2] && blArray[3]) {
            n5 = 46;
        } else if (n5 == 26 && !blArray[0] && blArray[1] && blArray[2] && blArray[3]) {
            n5 = 9;
        } else if (n5 == 26 && blArray[0] && !blArray[1] && blArray[2] && blArray[3]) {
            n5 = 21;
        } else if (n5 == 26 && blArray[0] && blArray[1] && !blArray[2] && blArray[3]) {
            n5 = 8;
        } else if (n5 == 26 && blArray[0] && blArray[1] && blArray[2] && !blArray[3]) {
            n5 = 20;
        } else if (n5 == 26 && blArray[0] && blArray[1] && !blArray[2] && !blArray[3]) {
            n5 = 11;
        } else if (n5 == 26 && !blArray[0] && !blArray[1] && blArray[2] && blArray[3]) {
            n5 = 22;
        } else if (n5 == 26 && !blArray[0] && blArray[1] && !blArray[2] && blArray[3]) {
            n5 = 23;
        } else if (n5 == 26 && blArray[0] && !blArray[1] && blArray[2] && !blArray[3]) {
            n5 = 10;
        } else if (n5 == 26 && blArray[0] && !blArray[1] && !blArray[2] && blArray[3]) {
            n5 = 34;
        } else if (n5 == 26 && !blArray[0] && blArray[1] && blArray[2] && !blArray[3]) {
            n5 = 35;
        } else if (n5 == 26 && blArray[0] && !blArray[1] && !blArray[2] && !blArray[3]) {
            n5 = 32;
        } else if (n5 == 26 && !blArray[0] && blArray[1] && !blArray[2] && !blArray[3]) {
            n5 = 33;
        } else if (n5 == 26 && !blArray[0] && !blArray[1] && blArray[2] && !blArray[3]) {
            n5 = 44;
        } else if (n5 == 26 && !blArray[0] && !blArray[1] && !blArray[2] && blArray[3]) {
            n5 = 45;
        }
        return n5;
    }

    private static void a(int n2, int n3, boolean[] blArray) {
        boolean bl2 = blArray[n2];
        blArray[n2] = blArray[n3];
        blArray[n3] = bl2;
    }

    private static boolean a(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, int n2, TextureAtlasSprite textureAtlasSprite, int n3) {
        Object object;
        IBlockState iBlockState2 = l2.L(b2);
        if (!j.G(iBlockState2)) {
            return false;
        }
        if (i2.dWc != null && !k.a(((BlockStateBase)(object = (BlockStateBase)iBlockState2)).zW(), ((BlockStateBase)object).yc(), i2.dWc)) {
            return false;
        }
        if (i2.dWe != null && !net.minecraft.src.a.f(object = j.a(l2, iBlockState, b2, iBlockState2, n2), i2.dWe)) {
            return false;
        }
        object = l2.L(b2.x(j.aQ(n2)));
        return !object.df().xk() && (n2 != 1 || object.df() != Blocks.cMJ) && !j.a(i2, l2, iBlockState, b2, iBlockState2, n2, textureAtlasSprite, n3);
    }

    private static boolean G(IBlockState iBlockState) {
        if (iBlockState.df().xf()) {
            return true;
        }
        Block block = iBlockState.df();
        return block instanceof BlockGlass || block instanceof BlockStainedGlass;
    }

    private static boolean b(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, int n2, TextureAtlasSprite textureAtlasSprite, int n3) {
        Object object;
        IBlockState iBlockState2 = l2.L(b2);
        if (iBlockState2 == dXh) {
            return false;
        }
        if (i2.dVI != null && iBlockState2 instanceof BlockStateBase && !i2.bt(((BlockStateBase)(object = (BlockStateBase)iBlockState2)).zW(), ((BlockStateBase)object).yc())) {
            return false;
        }
        if (i2.dWa != null && (object = j.a(l2, iBlockState, b2, iBlockState2, n2)) != textureAtlasSprite) {
            return false;
        }
        object = l2.L(b2.x(j.aQ(n2)));
        return !object.df().xk() && (n2 != 1 || object.df() != Blocks.cMJ);
    }

    private static boolean c(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, int n2, TextureAtlasSprite textureAtlasSprite, int n3) {
        IBlockState iBlockState2 = l2.L(b2);
        return j.a(i2, l2, iBlockState, b2, iBlockState2, n2, textureAtlasSprite, n3);
    }

    private static boolean a(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, IBlockState iBlockState2, int n2, TextureAtlasSprite textureAtlasSprite, int n3) {
        if (iBlockState == iBlockState2) {
            return true;
        }
        if (i2.dVN == 2) {
            if (iBlockState2 == null) {
                return false;
            }
            if (iBlockState2 == dXh) {
                return false;
            }
            TextureAtlasSprite textureAtlasSprite2 = j.a(l2, iBlockState, b2, iBlockState2, n2);
            return textureAtlasSprite2 == textureAtlasSprite;
        }
        if (i2.dVN == 3) {
            return iBlockState2 != null && iBlockState2 != dXh && iBlockState2.df().xb() == iBlockState.df().xb();
        }
        if (!(iBlockState2 instanceof BlockStateBase)) {
            return false;
        }
        BlockStateBase blockStateBase = (BlockStateBase)iBlockState2;
        Block block = blockStateBase.df();
        int n4 = blockStateBase.yc();
        return block == iBlockState.df() && n4 == n3;
    }

    private static TextureAtlasSprite a(net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, IBlockState iBlockState2, int n2) {
        ao ao2;
        List list;
        iBlockState2 = iBlockState2.df().a(iBlockState2, l2, b2);
        IBakedModel iBakedModel = d.AZ().BE().IY().B(iBlockState2);
        if (iBakedModel == null) {
            return null;
        }
        if (net.optifine.reflect.g.eom.aDA()) {
            iBlockState2 = (IBlockState)net.optifine.reflect.g.g(iBlockState2.df(), net.optifine.reflect.g.eom, iBlockState2, l2, b2);
        }
        if ((list = iBakedModel.p(ao2 = j.aQ(n2))) == null) {
            return null;
        }
        if (net.minecraft.src.a.anS()) {
            list = a.a(l2, iBlockState2, b2, ao2, list);
        }
        if (list.size() > 0) {
            BakedQuad bakedQuad = list.get(0);
            return bakedQuad.LO();
        }
        List<BakedQuad> list2 = iBakedModel.Qk();
        if (list2 == null) {
            return null;
        }
        for (int i2 = 0; i2 < list2.size(); ++i2) {
            BakedQuad bakedQuad = list2.get(i2);
            if (bakedQuad.LS() != ao2) continue;
            return bakedQuad.LO();
        }
        return null;
    }

    private static TextureAtlasSprite a(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, int n2, int n3, TextureAtlasSprite textureAtlasSprite, int n4) {
        boolean bl2 = false;
        boolean bl3 = false;
        block0 : switch (n2) {
            case 0: {
                switch (n3) {
                    case 0: {
                        bl2 = j.c(i2, l2, iBlockState, b2.arb(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
                        break;
                    }
                    case 1: {
                        bl2 = j.c(i2, l2, iBlockState, b2.arb(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
                        break;
                    }
                    case 2: {
                        bl2 = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.arb(), n3, textureAtlasSprite, n4);
                        break;
                    }
                    case 3: {
                        bl2 = j.c(i2, l2, iBlockState, b2.arb(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
                        break;
                    }
                    case 4: {
                        bl2 = j.c(i2, l2, iBlockState, b2.aqZ(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                        break;
                    }
                    case 5: {
                        bl2 = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.aqZ(), n3, textureAtlasSprite, n4);
                    }
                }
                break;
            }
            case 1: {
                switch (n3) {
                    case 0: {
                        bl2 = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.arb(), n3, textureAtlasSprite, n4);
                        break;
                    }
                    case 1: {
                        bl2 = j.c(i2, l2, iBlockState, b2.arb(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
                        break;
                    }
                    case 2: {
                        bl2 = j.c(i2, l2, iBlockState, b2.arb(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
                        break;
                    }
                    case 3: {
                        bl2 = j.c(i2, l2, iBlockState, b2.arb(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
                        break;
                    }
                    case 4: {
                        bl2 = j.c(i2, l2, iBlockState, b2.aqY(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                        break;
                    }
                    case 5: {
                        bl2 = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.aqY(), n3, textureAtlasSprite, n4);
                    }
                }
                break;
            }
            case 2: {
                switch (n3) {
                    case 0: {
                        bl2 = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.aqZ(), n3, textureAtlasSprite, n4);
                        break block0;
                    }
                    case 1: {
                        bl2 = j.c(i2, l2, iBlockState, b2.aqZ(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                        break block0;
                    }
                    case 2: {
                        bl2 = j.c(i2, l2, iBlockState, b2.aqY(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                        break block0;
                    }
                    case 3: {
                        bl2 = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.aqY(), n3, textureAtlasSprite, n4);
                        break block0;
                    }
                    case 4: {
                        bl2 = j.c(i2, l2, iBlockState, b2.aqZ(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                        break block0;
                    }
                    case 5: {
                        bl2 = j.c(i2, l2, iBlockState, b2.aqZ(), n3, textureAtlasSprite, n4);
                        bl3 = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                    }
                }
            }
        }
        int n5 = 3;
        n5 = bl2 ? (bl3 ? 1 : 2) : (bl3 ? 0 : 3);
        return i2.dWb[n5];
    }

    private static TextureAtlasSprite b(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, int n2, int n3, TextureAtlasSprite textureAtlasSprite, int n4) {
        boolean bl2 = false;
        boolean bl3 = false;
        switch (n2) {
            case 0: {
                if (n3 == 1) {
                    bl2 = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                    bl3 = j.c(i2, l2, iBlockState, b2.aqZ(), n3, textureAtlasSprite, n4);
                    break;
                }
                if (n3 == 0) {
                    bl2 = j.c(i2, l2, iBlockState, b2.aqZ(), n3, textureAtlasSprite, n4);
                    bl3 = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                    break;
                }
                bl2 = j.c(i2, l2, iBlockState, b2.aqY(), n3, textureAtlasSprite, n4);
                bl3 = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                break;
            }
            case 1: {
                if (n3 == 3) {
                    bl2 = j.c(i2, l2, iBlockState, b2.aqY(), n3, textureAtlasSprite, n4);
                    bl3 = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                    break;
                }
                if (n3 == 2) {
                    bl2 = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                    bl3 = j.c(i2, l2, iBlockState, b2.aqY(), n3, textureAtlasSprite, n4);
                    break;
                }
                bl2 = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                bl3 = j.c(i2, l2, iBlockState, b2.aqZ(), n3, textureAtlasSprite, n4);
                break;
            }
            case 2: {
                if (n3 == 5) {
                    bl2 = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                    bl3 = j.c(i2, l2, iBlockState, b2.aqY(), n3, textureAtlasSprite, n4);
                    break;
                }
                if (n3 == 4) {
                    bl2 = j.c(i2, l2, iBlockState, b2.aqY(), n3, textureAtlasSprite, n4);
                    bl3 = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                    break;
                }
                bl2 = j.c(i2, l2, iBlockState, b2.arb(), n3, textureAtlasSprite, n4);
                bl3 = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
            }
        }
        int n5 = 3;
        n5 = bl2 ? (bl3 ? 1 : 2) : (bl3 ? 0 : 3);
        return i2.dWb[n5];
    }

    private static TextureAtlasSprite c(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, int n2, int n3, TextureAtlasSprite textureAtlasSprite, int n4) {
        TextureAtlasSprite[] textureAtlasSpriteArray = i2.dWb;
        TextureAtlasSprite textureAtlasSprite2 = j.a(i2, l2, iBlockState, b2, n2, n3, textureAtlasSprite, n4);
        if (textureAtlasSprite2 != null && textureAtlasSprite2 != textureAtlasSprite && textureAtlasSprite2 != textureAtlasSpriteArray[3]) {
            return textureAtlasSprite2;
        }
        TextureAtlasSprite textureAtlasSprite3 = j.b(i2, l2, iBlockState, b2, n2, n3, textureAtlasSprite, n4);
        return textureAtlasSprite3 == textureAtlasSpriteArray[0] ? textureAtlasSpriteArray[4] : (textureAtlasSprite3 == textureAtlasSpriteArray[1] ? textureAtlasSpriteArray[5] : (textureAtlasSprite3 == textureAtlasSpriteArray[2] ? textureAtlasSpriteArray[6] : textureAtlasSprite3));
    }

    private static TextureAtlasSprite d(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, int n2, int n3, TextureAtlasSprite textureAtlasSprite, int n4) {
        TextureAtlasSprite[] textureAtlasSpriteArray = i2.dWb;
        TextureAtlasSprite textureAtlasSprite2 = j.b(i2, l2, iBlockState, b2, n2, n3, textureAtlasSprite, n4);
        if (textureAtlasSprite2 != null && textureAtlasSprite2 != textureAtlasSprite && textureAtlasSprite2 != textureAtlasSpriteArray[3]) {
            return textureAtlasSprite2;
        }
        TextureAtlasSprite textureAtlasSprite3 = j.a(i2, l2, iBlockState, b2, n2, n3, textureAtlasSprite, n4);
        return textureAtlasSprite3 == textureAtlasSpriteArray[0] ? textureAtlasSpriteArray[4] : (textureAtlasSprite3 == textureAtlasSpriteArray[1] ? textureAtlasSpriteArray[5] : (textureAtlasSprite3 == textureAtlasSpriteArray[2] ? textureAtlasSpriteArray[6] : textureAtlasSprite3));
    }

    private static TextureAtlasSprite e(i i2, net.minecraft.world.l l2, IBlockState iBlockState, net.minecraft.util.b b2, int n2, int n3, TextureAtlasSprite textureAtlasSprite, int n4) {
        boolean bl2 = false;
        switch (n2) {
            case 0: {
                if (n3 == 1 || n3 == 0) {
                    return null;
                }
                bl2 = j.c(i2, l2, iBlockState, b2.aqX(), n3, textureAtlasSprite, n4);
                break;
            }
            case 1: {
                if (n3 == 3 || n3 == 2) {
                    return null;
                }
                bl2 = j.c(i2, l2, iBlockState, b2.ara(), n3, textureAtlasSprite, n4);
                break;
            }
            case 2: {
                if (n3 == 5 || n3 == 4) {
                    return null;
                }
                bl2 = j.c(i2, l2, iBlockState, b2.arc(), n3, textureAtlasSprite, n4);
            }
        }
        if (bl2) {
            return i2.dWb[0];
        }
        return null;
    }

    public static void b(TextureMap textureMap) {
        dWU = null;
        dWV = null;
        dWR = null;
        dWT = null;
        if (net.minecraft.src.a.aoA()) {
            IResourcePack[] iResourcePackArray = net.minecraft.src.a.anO();
            for (int i2 = iResourcePackArray.length - 1; i2 >= 0; --i2) {
                IResourcePack iResourcePack = iResourcePackArray[i2];
                j.a(textureMap, iResourcePack);
            }
            j.a(textureMap, net.minecraft.src.a.anQ());
            cm cm2 = new cm("mcpatcher/ctm/default/empty");
            dXi = textureMap.n(cm2);
            dWR = new Map[textureMap.Ox() + 1];
            dWS = new Map[textureMap.Ox() + 1];
            dWT = new Map[textureMap.Ox() + 1][];
            if (dWU.length <= 0) {
                dWU = null;
            }
            if (dWV.length <= 0) {
                dWV = null;
            }
        }
    }

    private static void d(TextureMap textureMap) {
    }

    public static void a(TextureMap textureMap, IResourcePack iResourcePack) {
        Object[] objectArray = ah.a(iResourcePack, "mcpatcher/ctm/", ".properties", j.aAr());
        Arrays.sort(objectArray);
        List list = j.a(dWV);
        List list2 = j.a(dWU);
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            Object object = objectArray[i2];
            net.minecraft.src.a.fN("ConnectedTextures: " + (String)object);
            try {
                cm cm2 = new cm((String)object);
                InputStream inputStream = iResourcePack.r(cm2);
                if (inputStream == null) {
                    net.minecraft.src.a.warn("ConnectedTextures file not found: " + (String)object);
                    continue;
                }
                af af2 = new af();
                af2.load(inputStream);
                i i3 = new i(af2, (String)object);
                if (!i3.gY((String)object)) continue;
                i3.b(textureMap);
                j.a(i3, list);
                j.b(i3, list2);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                net.minecraft.src.a.warn("ConnectedTextures file not found: " + (String)object);
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        dWU = j.M(list2);
        dWV = j.M(list);
        dWW = j.aAq();
        net.minecraft.src.a.fN("Multipass connected textures: " + dWW);
    }

    private static List a(i[][] iArray) {
        ArrayList<ArrayList<i>> arrayList = new ArrayList<ArrayList<i>>();
        if (iArray != null) {
            for (int i2 = 0; i2 < iArray.length; ++i2) {
                i[] iArray2 = iArray[i2];
                ArrayList<i> arrayList2 = null;
                if (iArray2 != null) {
                    arrayList2 = new ArrayList<i>(Arrays.asList(iArray2));
                }
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    private static boolean aAq() {
        Object object;
        int n2;
        ArrayList<i> arrayList = new ArrayList<i>();
        for (n2 = 0; n2 < dWV.length; ++n2) {
            object = dWV[n2];
            if (object == null) continue;
            arrayList.addAll(Arrays.asList(object));
        }
        for (n2 = 0; n2 < dWU.length; ++n2) {
            object = dWU[n2];
            if (object == null) continue;
            arrayList.addAll(Arrays.asList(object));
        }
        i[] iArray = arrayList.toArray(new i[arrayList.size()]);
        object = new HashSet();
        HashSet<TextureAtlasSprite> hashSet = new HashSet<TextureAtlasSprite>();
        for (int i2 = 0; i2 < iArray.length; ++i2) {
            i i3 = iArray[i2];
            if (i3.dWa != null) {
                object.addAll(Arrays.asList(i3.dWa));
            }
            if (i3.dWb == null) continue;
            hashSet.addAll(Arrays.asList(i3.dWb));
        }
        object.retainAll(hashSet);
        return !object.isEmpty();
    }

    private static i[][] M(List list) {
        i[][] iArray = new i[list.size()][];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            List list2 = (List)list.get(i2);
            if (list2 == null) continue;
            i[] iArray2 = list2.toArray(new i[list2.size()]);
            iArray[i2] = iArray2;
        }
        return iArray;
    }

    private static void a(i i2, List list) {
        if (i2.dWa != null) {
            for (int i3 = 0; i3 < i2.dWa.length; ++i3) {
                TextureAtlasSprite textureAtlasSprite = i2.dWa[i3];
                if (!(textureAtlasSprite instanceof TextureAtlasSprite)) {
                    net.minecraft.src.a.warn("TextureAtlasSprite is not TextureAtlasSprite: " + String.valueOf(textureAtlasSprite) + ", name: " + textureAtlasSprite.Oc());
                    continue;
                }
                int n2 = textureAtlasSprite.Oj();
                if (n2 < 0) {
                    net.minecraft.src.a.warn("Invalid tile ID: " + n2 + ", icon: " + textureAtlasSprite.Oc());
                    continue;
                }
                j.a(i2, list, n2);
            }
        }
    }

    private static void b(i i2, List list) {
        if (i2.dVI != null) {
            for (int i3 = 0; i3 < i2.dVI.length; ++i3) {
                int n2 = i2.dVI[i3].zW();
                if (n2 < 0) {
                    net.minecraft.src.a.warn("Invalid block ID: " + n2);
                    continue;
                }
                j.a(i2, list, n2);
            }
        }
    }

    private static void a(i i2, List list, int n2) {
        while (n2 >= list.size()) {
            list.add(null);
        }
        ArrayList<i> arrayList = (ArrayList<i>)list.get(n2);
        if (arrayList == null) {
            arrayList = new ArrayList<i>();
            list.set(n2, arrayList);
        }
        arrayList.add(i2);
    }

    private static String[] aAr() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        String string = "mcpatcher/ctm/default/";
        if (net.minecraft.src.a.G(new cm("textures/blocks/glass.png"))) {
            arrayList.add("mcpatcher/ctm/default/glass.properties");
            arrayList.add("mcpatcher/ctm/default/glasspane.properties");
        }
        if (net.minecraft.src.a.G(new cm("textures/blocks/bookshelf.png"))) {
            arrayList.add("mcpatcher/ctm/default/bookshelf.properties");
        }
        if (net.minecraft.src.a.G(new cm("textures/blocks/sandstone_normal.png"))) {
            arrayList.add("mcpatcher/ctm/default/sandstone.properties");
        }
        String[] stringArray = new String[]{"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"};
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            if (!net.minecraft.src.a.G(new cm("textures/blocks/glass_" + string2 + ".png"))) continue;
            arrayList.add("mcpatcher/ctm/default/" + i2 + "_glass_" + string2 + "/glass_" + string2 + ".properties");
            arrayList.add("mcpatcher/ctm/default/" + i2 + "_glass_" + string2 + "/glass_pane_" + string2 + ".properties");
        }
        String[] stringArray2 = arrayList.toArray(new String[arrayList.size()]);
        return stringArray2;
    }
}

