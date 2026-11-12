/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.block.model;

import net.minecraft.client.resources.model.ModelRotation;
import net.minecraft.util.cm;

public class ModelBlockDefinition$Variant {
    private final cm bSb;
    private final ModelRotation bSc;
    private final boolean bSd;
    private final int bSe;

    public ModelBlockDefinition$Variant(cm cm2, ModelRotation modelRotation, boolean bl2, int n2) {
        this.bSb = cm2;
        this.bSc = modelRotation;
        this.bSd = bl2;
        this.bSe = n2;
    }

    public cm Mx() {
        return this.bSb;
    }

    public ModelRotation My() {
        return this.bSc;
    }

    public boolean Mz() {
        return this.bSd;
    }

    public int Cl() {
        return this.bSe;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ModelBlockDefinition$Variant)) {
            return false;
        }
        ModelBlockDefinition$Variant modelBlockDefinition$Variant = (ModelBlockDefinition$Variant)object;
        return this.bSb.equals(modelBlockDefinition$Variant.bSb) && this.bSc == modelBlockDefinition$Variant.bSc && this.bSd == modelBlockDefinition$Variant.bSd;
    }

    public int hashCode() {
        int n2 = this.bSb.hashCode();
        n2 = 31 * n2 + (this.bSc != null ? this.bSc.hashCode() : 0);
        n2 = 31 * n2 + (this.bSd ? 1 : 0);
        return n2;
    }
}

