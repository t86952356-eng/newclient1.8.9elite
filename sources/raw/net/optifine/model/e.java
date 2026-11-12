/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.model;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.SimpleBakedModel;
import net.minecraft.src.a;
import net.minecraft.util.ao;

public class e {
    public static void e(IBakedModel iBakedModel) {
        if (iBakedModel != null) {
            a.fN("Model: " + String.valueOf(iBakedModel) + ", ao: " + iBakedModel.Mr() + ", gui3d: " + iBakedModel.Ms() + ", builtIn: " + iBakedModel.Ql() + ", particle: " + String.valueOf(iBakedModel.Qm()));
            ao[] aoArray = ao.dwD;
            for (int i2 = 0; i2 < aoArray.length; ++i2) {
                ao ao2 = aoArray[i2];
                List<BakedQuad> list = iBakedModel.p(ao2);
                e.a(ao2.getName(), list, "  ");
            }
            List<BakedQuad> list = iBakedModel.Qk();
            e.a("General", list, "  ");
        }
    }

    private static void a(String string, List list, String string2) {
        for (Object e2 : list) {
            BakedQuad bakedQuad = (BakedQuad)e2;
            e.a(string, bakedQuad, string2);
        }
    }

    public static void a(String string, BakedQuad bakedQuad, String string2) {
        a.fN(string2 + "Quad: " + bakedQuad.getClass().getName() + ", type: " + string + ", face: " + String.valueOf(bakedQuad.LS()) + ", tint: " + bakedQuad.LR() + ", sprite: " + String.valueOf(bakedQuad.LO()));
        e.b(bakedQuad.LP(), "  " + string2);
    }

    public static void b(int[] nArray, String string) {
        int n2 = nArray.length / 4;
        a.fN(string + "Length: " + nArray.length + ", step: " + n2);
        for (int i2 = 0; i2 < 4; ++i2) {
            int n3 = i2 * n2;
            float f2 = Float.intBitsToFloat(nArray[n3 + 0]);
            float f3 = Float.intBitsToFloat(nArray[n3 + 1]);
            float f4 = Float.intBitsToFloat(nArray[n3 + 2]);
            int n4 = nArray[n3 + 3];
            float f5 = Float.intBitsToFloat(nArray[n3 + 4]);
            float f6 = Float.intBitsToFloat(nArray[n3 + 5]);
            a.fN(string + i2 + " xyz: " + f2 + "," + f3 + "," + f4 + " col: " + n4 + " com.alan.clients.protection.external.u,v: " + f5 + "," + f6);
        }
    }

    public static IBakedModel f(IBakedModel iBakedModel) {
        List list = e.Q(iBakedModel.Qk());
        ao[] aoArray = ao.dwD;
        ArrayList<List<BakedQuad>> arrayList = new ArrayList<List<BakedQuad>>();
        for (int i2 = 0; i2 < aoArray.length; ++i2) {
            ao ao2 = aoArray[i2];
            List<BakedQuad> list2 = iBakedModel.p(ao2);
            List list3 = e.Q(list2);
            arrayList.add(list3);
        }
        SimpleBakedModel simpleBakedModel = new SimpleBakedModel(list, arrayList, iBakedModel.Mr(), iBakedModel.Ms(), iBakedModel.Qm(), iBakedModel.Qn());
        return simpleBakedModel;
    }

    public static List Q(List list) {
        ArrayList<BakedQuad> arrayList = new ArrayList<BakedQuad>();
        for (Object e2 : list) {
            BakedQuad bakedQuad = (BakedQuad)e2;
            BakedQuad bakedQuad2 = e.d(bakedQuad);
            arrayList.add(bakedQuad2);
        }
        return arrayList;
    }

    public static BakedQuad d(BakedQuad bakedQuad) {
        BakedQuad bakedQuad2 = new BakedQuad((int[])bakedQuad.LP().clone(), bakedQuad.LR(), bakedQuad.LS(), bakedQuad.LO());
        return bakedQuad2;
    }
}

