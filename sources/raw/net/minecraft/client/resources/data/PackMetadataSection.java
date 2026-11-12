/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources.data;

import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.util.ba;

public class PackMetadataSection
implements IMetadataSection {
    private final ba ceJ;
    private final int ceK;

    public PackMetadataSection(ba ba2, int n2) {
        this.ceJ = ba2;
        this.ceK = n2;
    }

    public ba Qf() {
        return this.ceJ;
    }

    public int Qg() {
        return this.ceK;
    }
}

