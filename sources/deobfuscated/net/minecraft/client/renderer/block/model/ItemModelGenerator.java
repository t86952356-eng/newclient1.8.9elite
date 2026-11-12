/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.lwjgl.util.vector.Vector3f
 */
package net.minecraft.client.renderer.block.model;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.block.model.BlockFaceUV;
import net.minecraft.client.renderer.block.model.BlockPart;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.client.renderer.block.model.ItemModelGenerator$Span;
import net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ao;
import net.minecraft.util.cm;
import org.lwjgl.util.vector.Vector3f;

public class ItemModelGenerator {
    public static final List<String> bRt = Lists.newArrayList((Object[])new String[]{"layer0", "layer1", "layer2", "layer3", "layer4"});

    public ModelBlock a(TextureMap textureMap, ModelBlock modelBlock) {
        String string;
        HashMap hashMap = Maps.newHashMap();
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = 0; i2 < bRt.size() && modelBlock.di(string = bRt.get(i2)); ++i2) {
            String string2 = modelBlock.dj(string);
            hashMap.put(string, string2);
            TextureAtlasSprite textureAtlasSprite = textureMap.dq(new cm(string2).toString());
            arrayList.addAll(this.a(i2, string, textureAtlasSprite));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        hashMap.put("particle", modelBlock.di("particle") ? modelBlock.dj("particle") : (String)hashMap.get("layer0"));
        return new ModelBlock(arrayList, (Map<String, String>)hashMap, false, false, modelBlock.Mw());
    }

    private List<BlockPart> a(int n2, String string, TextureAtlasSprite textureAtlasSprite) {
        HashMap hashMap = Maps.newHashMap();
        hashMap.put(ao.dwt, new BlockPartFace(null, n2, string, new BlockFaceUV(new float[]{0.0f, 0.0f, 16.0f, 16.0f}, 0)));
        hashMap.put(ao.dws, new BlockPartFace(null, n2, string, new BlockFaceUV(new float[]{16.0f, 0.0f, 0.0f, 16.0f}, 0)));
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new BlockPart(new Vector3f(0.0f, 0.0f, 7.5f), new Vector3f(16.0f, 16.0f, 8.5f), hashMap, null, true));
        arrayList.addAll(this.a(textureAtlasSprite, string, n2));
        return arrayList;
    }

    private List<BlockPart> a(TextureAtlasSprite textureAtlasSprite, String string, int n2) {
        float f2 = textureAtlasSprite.NW();
        float f3 = textureAtlasSprite.NX();
        ArrayList arrayList = Lists.newArrayList();
        for (ItemModelGenerator$Span itemModelGenerator$Span : this.d(textureAtlasSprite)) {
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            float f7 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = itemModelGenerator$Span.Mi();
            float f15 = itemModelGenerator$Span.Mj();
            float f16 = itemModelGenerator$Span.Mk();
            ItemModelGenerator$SpanFacing itemModelGenerator$SpanFacing = itemModelGenerator$Span.Mh();
            switch (itemModelGenerator$SpanFacing.ordinal()) {
                case 0: {
                    f8 = f14;
                    f4 = f14;
                    f6 = f9 = f15 + 1.0f;
                    f10 = f16;
                    f5 = f16;
                    f11 = f16;
                    f7 = f16;
                    f12 = 16.0f / f2;
                    f13 = 16.0f / (f3 - 1.0f);
                    break;
                }
                case 1: {
                    f11 = f16;
                    f10 = f16;
                    f8 = f14;
                    f4 = f14;
                    f6 = f9 = f15 + 1.0f;
                    f5 = f16 + 1.0f;
                    f7 = f16 + 1.0f;
                    f12 = 16.0f / f2;
                    f13 = 16.0f / (f3 - 1.0f);
                    break;
                }
                case 2: {
                    f8 = f16;
                    f4 = f16;
                    f9 = f16;
                    f6 = f16;
                    f11 = f14;
                    f5 = f14;
                    f7 = f10 = f15 + 1.0f;
                    f12 = 16.0f / (f2 - 1.0f);
                    f13 = 16.0f / f3;
                    break;
                }
                case 3: {
                    f9 = f16;
                    f8 = f16;
                    f4 = f16 + 1.0f;
                    f6 = f16 + 1.0f;
                    f11 = f14;
                    f5 = f14;
                    f7 = f10 = f15 + 1.0f;
                    f12 = 16.0f / (f2 - 1.0f);
                    f13 = 16.0f / f3;
                }
            }
            float f17 = 16.0f / f2;
            float f18 = 16.0f / f3;
            f4 *= f17;
            f6 *= f17;
            f5 *= f18;
            f7 *= f18;
            f5 = 16.0f - f5;
            f7 = 16.0f - f7;
            HashMap hashMap = Maps.newHashMap();
            hashMap.put(itemModelGenerator$SpanFacing.yx(), new BlockPartFace(null, n2, string, new BlockFaceUV(new float[]{f8 *= f12, f10 *= f13, f9 *= f12, f11 *= f13}, 0)));
            switch (itemModelGenerator$SpanFacing.ordinal()) {
                case 0: {
                    arrayList.add(new BlockPart(new Vector3f(f4, f5, 7.5f), new Vector3f(f6, f5, 8.5f), hashMap, null, true));
                    break;
                }
                case 1: {
                    arrayList.add(new BlockPart(new Vector3f(f4, f7, 7.5f), new Vector3f(f6, f7, 8.5f), hashMap, null, true));
                    break;
                }
                case 2: {
                    arrayList.add(new BlockPart(new Vector3f(f4, f5, 7.5f), new Vector3f(f4, f7, 8.5f), hashMap, null, true));
                    break;
                }
                case 3: {
                    arrayList.add(new BlockPart(new Vector3f(f6, f5, 7.5f), new Vector3f(f6, f7, 8.5f), hashMap, null, true));
                }
            }
        }
        return arrayList;
    }

    private List<ItemModelGenerator$Span> d(TextureAtlasSprite textureAtlasSprite) {
        int n2 = textureAtlasSprite.NW();
        int n3 = textureAtlasSprite.NX();
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = 0; i2 < textureAtlasSprite.Of(); ++i2) {
            int[] nArray = textureAtlasSprite.dD(i2)[0];
            for (int i3 = 0; i3 < n3; ++i3) {
                for (int i4 = 0; i4 < n2; ++i4) {
                    boolean bl2 = !this.a(nArray, i4, i3, n2, n3);
                    this.a(ItemModelGenerator$SpanFacing.bRy, arrayList, nArray, i4, i3, n2, n3, bl2);
                    this.a(ItemModelGenerator$SpanFacing.bRz, arrayList, nArray, i4, i3, n2, n3, bl2);
                    this.a(ItemModelGenerator$SpanFacing.bRA, arrayList, nArray, i4, i3, n2, n3, bl2);
                    this.a(ItemModelGenerator$SpanFacing.bRB, arrayList, nArray, i4, i3, n2, n3, bl2);
                }
            }
        }
        return arrayList;
    }

    private void a(ItemModelGenerator$SpanFacing itemModelGenerator$SpanFacing, List<ItemModelGenerator$Span> list, int[] nArray, int n2, int n3, int n4, int n5, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = this.a(nArray, n2 + itemModelGenerator$SpanFacing.Ml(), n3 + itemModelGenerator$SpanFacing.Mm(), n4, n5) && bl2;
        if (bl3) {
            this.a(list, itemModelGenerator$SpanFacing, n2, n3);
        }
    }

    private void a(List<ItemModelGenerator$Span> list, ItemModelGenerator$SpanFacing itemModelGenerator$SpanFacing, int n2, int n3) {
        int n4;
        ItemModelGenerator$Span itemModelGenerator$Span = null;
        for (ItemModelGenerator$Span itemModelGenerator$Span2 : list) {
            int n5;
            if (itemModelGenerator$Span2.Mh() != itemModelGenerator$SpanFacing) continue;
            int n6 = n5 = itemModelGenerator$SpanFacing.Mn() ? n3 : n2;
            if (itemModelGenerator$Span2.Mk() != n5) continue;
            itemModelGenerator$Span = itemModelGenerator$Span2;
            break;
        }
        int n7 = itemModelGenerator$SpanFacing.Mn() ? n3 : n2;
        int n8 = n4 = itemModelGenerator$SpanFacing.Mn() ? n2 : n3;
        if (itemModelGenerator$Span == null) {
            list.add(new ItemModelGenerator$Span(itemModelGenerator$SpanFacing, n4, n7));
        } else {
            itemModelGenerator$Span.ds(n4);
        }
    }

    private boolean a(int[] nArray, int n2, int n3, int n4, int n5) {
        return n2 < 0 || n3 < 0 || n2 >= n4 || n3 >= n5 || (nArray[n3 * n4 + n2] >> 24 & 0xFF) == 0;
    }
}

