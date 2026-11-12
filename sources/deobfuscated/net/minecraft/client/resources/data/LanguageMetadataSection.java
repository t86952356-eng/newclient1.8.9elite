/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources.data;

import java.util.Collection;
import net.minecraft.client.resources.Language;
import net.minecraft.client.resources.data.IMetadataSection;

public class LanguageMetadataSection
implements IMetadataSection {
    private final Collection<Language> ceI;

    public LanguageMetadataSection(Collection<Language> collection) {
        this.ceI = collection;
    }

    public Collection<Language> Qe() {
        return this.ceI;
    }
}

