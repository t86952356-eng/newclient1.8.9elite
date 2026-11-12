/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources.data;

import java.util.Collections;
import java.util.List;
import net.minecraft.client.resources.data.IMetadataSection;

public class TextureMetadataSection
implements IMetadataSection {
    private final boolean ceL;
    private final boolean ceM;
    private final List<Integer> ceN;

    public TextureMetadataSection(boolean bl2, boolean bl3, List<Integer> list) {
        this.ceL = bl2;
        this.ceM = bl3;
        this.ceN = list;
    }

    public boolean Qh() {
        return this.ceL;
    }

    public boolean Qi() {
        return this.ceM;
    }

    public List<Integer> Qj() {
        return Collections.unmodifiableList(this.ceN);
    }
}

