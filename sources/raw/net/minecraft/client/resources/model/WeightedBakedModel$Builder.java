/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.resources.model;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.WeightedBakedModel;
import net.minecraft.client.resources.model.WeightedBakedModel$MyWeighedRandomItem;

public class WeightedBakedModel$Builder {
    private final List<WeightedBakedModel$MyWeighedRandomItem> cgd = Lists.newArrayList();

    public WeightedBakedModel$Builder b(IBakedModel iBakedModel, int n2) {
        this.cgd.add(new WeightedBakedModel$MyWeighedRandomItem(iBakedModel, n2));
        return this;
    }

    public WeightedBakedModel QG() {
        Collections.sort(this.cgd);
        return new WeightedBakedModel(this.cgd);
    }

    public IBakedModel QH() {
        return this.cgd.get((int)0).cge;
    }
}

