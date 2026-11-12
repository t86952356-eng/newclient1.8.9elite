/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.block.model;

import java.util.List;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variant;

public class ModelBlockDefinition$Variants {
    private final String bSf;
    private final List<ModelBlockDefinition$Variant> bSg;

    public ModelBlockDefinition$Variants(String string, List<ModelBlockDefinition$Variant> list) {
        this.bSf = string;
        this.bSg = list;
    }

    public List<ModelBlockDefinition$Variant> MA() {
        return this.bSg;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ModelBlockDefinition$Variants)) {
            return false;
        }
        ModelBlockDefinition$Variants modelBlockDefinition$Variants = (ModelBlockDefinition$Variants)object;
        return this.bSf.equals(modelBlockDefinition$Variants.bSf) && this.bSg.equals(modelBlockDefinition$Variants.bSg);
    }

    public int hashCode() {
        int n2 = this.bSf.hashCode();
        n2 = 31 * n2 + this.bSg.hashCode();
        return n2;
    }
}

