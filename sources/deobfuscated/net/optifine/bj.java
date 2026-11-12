/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.src.a;
import net.minecraft.util.ao;
import net.minecraft.util.cm;
import net.optifine.model.e;

public class bj {
    private static IBakedModel eep = null;
    private static IBakedModel eeq = null;
    private static IBakedModel eer = null;
    private static IBakedModel ees = null;
    private static IBakedModel eet = null;
    private static IBakedModel eeu = null;
    private static List eev = null;
    private static List eew = null;
    private static List eex = null;
    private static List eey = null;
    private static List eez = null;
    private static List eeA = null;
    private static IBakedModel eeB = null;
    private static IBakedModel eeC = null;
    private static IBakedModel eeD = null;
    private static IBakedModel eeE = null;
    private static IBakedModel eeF = null;
    private static IBakedModel eeG = null;

    public static IBakedModel a(IBakedModel iBakedModel, IBlockState iBlockState) {
        if (!a.anu()) {
            return iBakedModel;
        }
        List<BakedQuad> list = iBakedModel.Qk();
        return list == eev ? eeB : (list == eew ? eeC : (list == eex ? eeD : (list == eey ? eeE : (list == eez ? eeF : (list == eeA ? eeG : iBakedModel)))));
    }

    public static boolean b(IBlockState iBlockState, IBlockState iBlockState2) {
        Block block;
        if (iBlockState == iBlockState2) {
            return true;
        }
        Block block2 = iBlockState.df();
        return block2 == (block = iBlockState2.df()) && (block2 instanceof BlockOldLeaf ? iBlockState.b(BlockOldLeaf.aXl).equals(iBlockState2.b(BlockOldLeaf.aXl)) : block2 instanceof BlockNewLeaf && iBlockState.b(BlockNewLeaf.aXg).equals(iBlockState2.b(BlockNewLeaf.aXg)));
    }

    public static void aBM() {
        ArrayList arrayList = new ArrayList();
        eep = bj.a("acacia", arrayList);
        eeq = bj.a("birch", arrayList);
        eer = bj.a("dark_oak", arrayList);
        ees = bj.a("jungle", arrayList);
        eet = bj.a("oak", arrayList);
        eeu = bj.a("spruce", arrayList);
        eev = bj.c(eep);
        eew = bj.c(eeq);
        eex = bj.c(eer);
        eey = bj.c(ees);
        eez = bj.c(eet);
        eeA = bj.c(eeu);
        eeB = bj.d(eep);
        eeC = bj.d(eeq);
        eeD = bj.d(eer);
        eeE = bj.d(ees);
        eeF = bj.d(eet);
        eeG = bj.d(eeu);
        if (arrayList.size() > 0) {
            a.fN("Enable face culling: " + a.c(arrayList.toArray()));
        }
    }

    private static List c(IBakedModel iBakedModel) {
        return iBakedModel == null ? null : iBakedModel.Qk();
    }

    static IBakedModel a(String string, List list) {
        ModelManager modelManager = a.IV();
        if (modelManager == null) {
            return null;
        }
        cm cm2 = new cm("blockstates/" + string + "_leaves.json");
        if (a.H(cm2) != a.anQ()) {
            return null;
        }
        cm cm3 = new cm("models/block/" + string + "_leaves.json");
        if (a.H(cm3) != a.anQ()) {
            return null;
        }
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(string + "_leaves", "normal");
        IBakedModel iBakedModel = modelManager.a(modelResourceLocation);
        if (iBakedModel != null && iBakedModel != modelManager.QA()) {
            List<BakedQuad> list2 = iBakedModel.Qk();
            if (list2.size() == 0) {
                return iBakedModel;
            }
            if (list2.size() != 6) {
                return null;
            }
            for (BakedQuad bakedQuad : list2) {
                BakedQuad bakedQuad2 = bakedQuad;
                List<BakedQuad> list3 = iBakedModel.p(bakedQuad2.LS());
                if (list3.size() > 0) {
                    return null;
                }
                list3.add(bakedQuad2);
            }
            list2.clear();
            list.add(string + "_leaves");
            return iBakedModel;
        }
        return null;
    }

    private static IBakedModel d(IBakedModel iBakedModel) {
        List[] listArray;
        if (iBakedModel == null) {
            return null;
        }
        if (iBakedModel.Qk().size() > 0) {
            a.warn("SmartLeaves: Model is not cube, general quads: " + iBakedModel.Qk().size() + ", model: " + String.valueOf(iBakedModel));
            return iBakedModel;
        }
        ao[] aoArray = ao.dwD;
        for (int i2 = 0; i2 < aoArray.length; ++i2) {
            listArray = aoArray[i2];
            List<BakedQuad> list = iBakedModel.p((ao)listArray);
            if (list.size() == 1) continue;
            a.warn("SmartLeaves: Model is not cube, side: " + String.valueOf(listArray) + ", quads: " + list.size() + ", model: " + String.valueOf(iBakedModel));
            return iBakedModel;
        }
        IBakedModel iBakedModel2 = e.f(iBakedModel);
        listArray = new List[aoArray.length];
        for (int i3 = 0; i3 < aoArray.length; ++i3) {
            ao ao2 = aoArray[i3];
            List<BakedQuad> list = iBakedModel2.p(ao2);
            BakedQuad bakedQuad = list.get(0);
            BakedQuad bakedQuad2 = new BakedQuad((int[])bakedQuad.LP().clone(), bakedQuad.LR(), bakedQuad.LS(), bakedQuad.LO());
            int[] nArray = bakedQuad2.LP();
            int[] nArray2 = (int[])nArray.clone();
            int n2 = nArray.length / 4;
            System.arraycopy(nArray, 0 * n2, nArray2, 3 * n2, n2);
            System.arraycopy(nArray, 1 * n2, nArray2, 2 * n2, n2);
            System.arraycopy(nArray, 2 * n2, nArray2, 1 * n2, n2);
            System.arraycopy(nArray, 3 * n2, nArray2, 0 * n2, n2);
            System.arraycopy(nArray2, 0, nArray, 0, nArray2.length);
            list.add(bakedQuad2);
        }
        return iBakedModel2;
    }
}

