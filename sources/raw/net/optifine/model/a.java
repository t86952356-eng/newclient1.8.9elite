/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package net.optifine.model;

import com.google.common.collect.ImmutableList;
import java.util.List;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.l;
import net.optifine.bb;
import net.optifine.bj;
import net.optifine.j;
import net.optifine.render.g;

public class a {
    private static final List<BakedQuad> elp = ImmutableList.of();

    public static IBakedModel a(IBakedModel iBakedModel, IBlockState iBlockState, g g2) {
        if (g2.aEe()) {
            iBakedModel = bj.a(iBakedModel, iBlockState);
        }
        return iBakedModel;
    }

    public static List<BakedQuad> a(List<BakedQuad> list, l l2, IBlockState iBlockState, b b2, ao ao2, av av2, long l3, g g2) {
        if (ao2 != null) {
            if (g2.aEe() && bj.b(l2.L(b2.x(ao2)), iBlockState)) {
                return elp;
            }
            if (!g2.R(list) && net.minecraft.src.a.anS()) {
                list = net.optifine.a.a(l2, iBlockState, b2, ao2, list);
            }
        }
        List<BakedQuad> list2 = g2.aEf();
        list2.clear();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            BakedQuad bakedQuad = list.get(i2);
            BakedQuad[] bakedQuadArray = a.a(bakedQuad, l2, iBlockState, b2, ao2, l3, g2);
            if (i2 == 0 && list.size() == 1 && bakedQuadArray.length == 1 && bakedQuadArray[0] == bakedQuad && bakedQuad.Mc() == null) {
                return list;
            }
            for (int i3 = 0; i3 < bakedQuadArray.length; ++i3) {
                BakedQuad bakedQuad2 = bakedQuadArray[i3];
                list2.add(bakedQuad2);
                if (bakedQuad2.Mc() == null) continue;
                g2.k(a.j(av2)).a(bakedQuad2.Mc(), iBlockState);
                g2.cP(true);
            }
        }
        return list2;
    }

    private static av j(av av2) {
        return av2 != null && av2 != av.dxV ? av2 : av.dxW;
    }

    private static BakedQuad[] a(BakedQuad bakedQuad, l l2, IBlockState iBlockState, b b2, ao ao2, long l3, g g2) {
        BakedQuad[] bakedQuadArray;
        if (g2.e(bakedQuad)) {
            return g2.f(bakedQuad);
        }
        BakedQuad bakedQuad2 = bakedQuad;
        if (net.minecraft.src.a.aoA() && ((bakedQuadArray = j.a(l2, iBlockState, b2, bakedQuad, g2)).length != 1 || bakedQuadArray[0] != bakedQuad)) {
            return bakedQuadArray;
        }
        if (net.minecraft.src.a.aoB() && (bakedQuad = bb.a(b2, bakedQuad)) != bakedQuad2) {
            return g2.f(bakedQuad);
        }
        return g2.f(bakedQuad);
    }
}

