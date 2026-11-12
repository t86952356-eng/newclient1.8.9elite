/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package net.minecraft.client.resources.model;

import com.google.common.collect.ComparisonChain;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.util.ao;
import net.minecraft.util.df;

class WeightedBakedModel$MyWeighedRandomItem
extends df
implements Comparable<WeightedBakedModel$MyWeighedRandomItem> {
    protected final IBakedModel cge;

    public WeightedBakedModel$MyWeighedRandomItem(IBakedModel iBakedModel, int n2) {
        super(n2);
        this.cge = iBakedModel;
    }

    public int a(WeightedBakedModel$MyWeighedRandomItem weightedBakedModel$MyWeighedRandomItem) {
        return ComparisonChain.start().compare(weightedBakedModel$MyWeighedRandomItem.dAR, this.dAR).compare(this.QI(), weightedBakedModel$MyWeighedRandomItem.QI()).result();
    }

    protected int QI() {
        int n2 = this.cge.Qk().size();
        for (ao ao2 : ao.values()) {
            n2 += this.cge.p(ao2).size();
        }
        return n2;
    }

    public String toString() {
        return "MyWeighedRandomItem{weight=" + this.dAR + ", model=" + String.valueOf(this.cge) + "}";
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((WeightedBakedModel$MyWeighedRandomItem)object);
    }
}

