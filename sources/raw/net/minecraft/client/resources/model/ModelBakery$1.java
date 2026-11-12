/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources.model;

import java.util.Comparator;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;

class ModelBakery$1
implements Comparator<ModelResourceLocation> {
    ModelBakery$1(ModelBakery modelBakery) {
    }

    public int a(ModelResourceLocation modelResourceLocation, ModelResourceLocation modelResourceLocation2) {
        return modelResourceLocation.toString().compareTo(modelResourceLocation2.toString());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModelResourceLocation)object, (ModelResourceLocation)object2);
    }
}

