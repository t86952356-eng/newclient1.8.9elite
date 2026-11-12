/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
package net.optifine.model;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block$EnumOffsetType;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.BlockFaceUV;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.client.renderer.block.model.BlockPartRotation;
import net.minecraft.client.renderer.block.model.BreakingFour;
import net.minecraft.client.renderer.block.model.FaceBakery;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.client.resources.model.ModelRotation;
import net.minecraft.client.resources.model.SimpleBakedModel;
import net.minecraft.src.a;
import net.minecraft.util.ao;
import net.optifine.model.e;
import org.lwjgl.util.vector.Vector3f;

public class b {
    private static final float elq = 1.0E-6f;

    public static IBakedModel Q(String string, int n2) {
        TextureAtlasSprite textureAtlasSprite = a.AZ().Bu().dq(string);
        return b.b(textureAtlasSprite, n2);
    }

    public static IBakedModel b(TextureAtlasSprite textureAtlasSprite, int n2) {
        ArrayList<BakedQuad> arrayList = new ArrayList<BakedQuad>();
        ao[] aoArray = ao.dwD;
        ArrayList<List<BakedQuad>> arrayList2 = new ArrayList<List<BakedQuad>>();
        for (int i2 = 0; i2 < aoArray.length; ++i2) {
            ao ao2 = aoArray[i2];
            ArrayList<BakedQuad> arrayList3 = new ArrayList<BakedQuad>();
            arrayList3.add(b.a(ao2, textureAtlasSprite, n2));
            arrayList2.add(arrayList3);
        }
        SimpleBakedModel simpleBakedModel = new SimpleBakedModel(arrayList, arrayList2, true, true, textureAtlasSprite, ItemCameraTransforms.bQV);
        return simpleBakedModel;
    }

    public static IBakedModel a(IBakedModel iBakedModel, IBakedModel iBakedModel2) {
        Object object;
        int n2;
        ArrayList<BakedQuad> arrayList = new ArrayList<BakedQuad>();
        arrayList.addAll(iBakedModel.Qk());
        arrayList.addAll(iBakedModel2.Qk());
        ao[] aoArray = ao.dwD;
        ArrayList<List<BakedQuad>> arrayList2 = new ArrayList<List<BakedQuad>>();
        for (n2 = 0; n2 < aoArray.length; ++n2) {
            ao ao2 = aoArray[n2];
            object = new ArrayList<BakedQuad>();
            object.addAll(iBakedModel.p(ao2));
            object.addAll(iBakedModel2.p(ao2));
            arrayList2.add((List<BakedQuad>)object);
        }
        n2 = iBakedModel.Mr() ? 1 : 0;
        boolean bl2 = iBakedModel.Ql();
        object = iBakedModel.Qm();
        ItemCameraTransforms itemCameraTransforms = iBakedModel.Qn();
        SimpleBakedModel simpleBakedModel = new SimpleBakedModel(arrayList, arrayList2, n2 != 0, bl2, (TextureAtlasSprite)object, itemCameraTransforms);
        return simpleBakedModel;
    }

    public static BakedQuad a(ao ao2, TextureAtlasSprite textureAtlasSprite, int n2) {
        Vector3f vector3f = new Vector3f(0.0f, 0.0f, 0.0f);
        Vector3f vector3f2 = new Vector3f(16.0f, 16.0f, 16.0f);
        BlockFaceUV blockFaceUV = new BlockFaceUV(new float[]{0.0f, 0.0f, 16.0f, 16.0f}, 0);
        BlockPartFace blockPartFace = new BlockPartFace(ao2, n2, "#" + ao2.getName(), blockFaceUV);
        ModelRotation modelRotation = ModelRotation.cfs;
        BlockPartRotation blockPartRotation = null;
        boolean bl2 = false;
        boolean bl3 = true;
        FaceBakery faceBakery = new FaceBakery();
        BakedQuad bakedQuad = faceBakery.a(vector3f, vector3f2, blockPartFace, textureAtlasSprite, ao2, modelRotation, blockPartRotation, false, true);
        return bakedQuad;
    }

    public static IBakedModel f(String string, String string2, String string3) {
        TextureMap textureMap = a.AZ().Bu();
        TextureAtlasSprite textureAtlasSprite = textureMap.dt(string2);
        TextureAtlasSprite textureAtlasSprite2 = textureMap.dt(string3);
        return b.a(string, textureAtlasSprite, textureAtlasSprite2);
    }

    public static IBakedModel a(String string, TextureAtlasSprite textureAtlasSprite, TextureAtlasSprite textureAtlasSprite2) {
        if (textureAtlasSprite != null && textureAtlasSprite2 != null) {
            ModelManager modelManager = a.IV();
            if (modelManager == null) {
                return null;
            }
            ModelResourceLocation modelResourceLocation = new ModelResourceLocation(string, "normal");
            IBakedModel iBakedModel = modelManager.a(modelResourceLocation);
            if (iBakedModel != null && iBakedModel != modelManager.QA()) {
                IBakedModel iBakedModel2 = e.f(iBakedModel);
                ao[] aoArray = ao.dwD;
                for (int i2 = 0; i2 < aoArray.length; ++i2) {
                    ao ao2 = aoArray[i2];
                    List<BakedQuad> list = iBakedModel2.p(ao2);
                    b.a(list, textureAtlasSprite, textureAtlasSprite2);
                }
                List<BakedQuad> list = iBakedModel2.Qk();
                b.a(list, textureAtlasSprite, textureAtlasSprite2);
                return iBakedModel2;
            }
            return null;
        }
        return null;
    }

    private static void a(List<BakedQuad> list, TextureAtlasSprite textureAtlasSprite, TextureAtlasSprite textureAtlasSprite2) {
        ArrayList<BakedQuad> arrayList = new ArrayList<BakedQuad>();
        for (BakedQuad bakedQuad : list) {
            if (bakedQuad.LO() == textureAtlasSprite) {
                bakedQuad = new BreakingFour(bakedQuad, textureAtlasSprite2);
            }
            arrayList.add(bakedQuad);
        }
        list.clear();
        list.addAll(arrayList);
    }

    public static void a(Vector3f vector3f) {
        vector3f.setX(b.cg(vector3f.getX()));
        vector3f.setY(b.cg(vector3f.getY()));
        vector3f.setZ(b.cg(vector3f.getZ()));
    }

    private static float cg(float f2) {
        return f2 > -1.0E-6f && f2 < 1.0E-6f ? 0.0f : (f2 > 0.999999f && f2 < 1.000001f ? 1.0f : f2);
    }

    public static net.minecraft.util.a a(net.minecraft.util.a a2, Block$EnumOffsetType block$EnumOffsetType, net.minecraft.util.b b2) {
        int n2 = b2.wt();
        int n3 = b2.wx();
        long l2 = (long)(n2 * 3129871) ^ (long)n3 * 116129781L;
        l2 = l2 * l2 * 42317861L + l2 * 11L;
        double d2 = ((double)((float)(l2 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
        double d3 = ((double)((float)(l2 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
        double d4 = 0.0;
        if (block$EnumOffsetType == Block$EnumOffsetType.aSL) {
            d4 = ((double)((float)(l2 >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
        }
        return a2.ae(d2, d4, d3);
    }
}

