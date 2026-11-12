/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.src.a;
import net.minecraftforge.client.model.c;
import net.optifine.ae;
import net.optifine.reflect.g;

public class ItemModelMesher {
    private final Map<Integer, ModelResourceLocation> bMa = Maps.newHashMap();
    private final Map<Integer, IBakedModel> bMb = Maps.newHashMap();
    private final Map<d, ItemMeshDefinition> bMc = Maps.newHashMap();
    private final ModelManager bMd;

    public ItemModelMesher(ModelManager modelManager) {
        this.bMd = modelManager;
    }

    public TextureAtlasSprite g(d d2) {
        return this.a(d2, 0);
    }

    public TextureAtlasSprite a(d d2, int n2) {
        return this.M(new co(d2, 1, n2)).Qm();
    }

    public IBakedModel M(co co2) {
        ItemMeshDefinition itemMeshDefinition;
        d d2 = co2.bP();
        IBakedModel iBakedModel = this.b(d2, this.N(co2));
        if (iBakedModel == null && (itemMeshDefinition = this.bMc.get(d2)) != null) {
            iBakedModel = this.bMd.a(itemMeshDefinition.L(co2));
        }
        if (g.eoT.aDA() && iBakedModel instanceof c) {
            iBakedModel = ((c)iBakedModel).aZ(co2);
        }
        if (iBakedModel == null) {
            iBakedModel = this.bMd.QA();
        }
        if (a.aoT()) {
            iBakedModel = ae.a(co2, iBakedModel, null, true);
        }
        return iBakedModel;
    }

    protected int N(co co2) {
        return co2.aed() ? 0 : co2.yc();
    }

    protected IBakedModel b(d d2, int n2) {
        return this.bMb.get(this.c(d2, n2));
    }

    private int c(d d2, int n2) {
        return d.p(d2) << 16 | n2;
    }

    public void a(d d2, int n2, ModelResourceLocation modelResourceLocation) {
        this.bMa.put(this.c(d2, n2), modelResourceLocation);
        this.bMb.put(this.c(d2, n2), this.bMd.a(modelResourceLocation));
    }

    public void a(d d2, ItemMeshDefinition itemMeshDefinition) {
        this.bMc.put(d2, itemMeshDefinition);
    }

    public ModelManager IV() {
        return this.bMd;
    }

    public void Kk() {
        this.bMb.clear();
        for (Map.Entry<Integer, ModelResourceLocation> entry : this.bMa.entrySet()) {
            this.bMb.put(entry.getKey(), this.bMd.a(entry.getValue()));
        }
    }
}

