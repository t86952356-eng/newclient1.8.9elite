/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources.data;

import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.IMetadataSectionSerializer;
import net.minecraft.client.resources.data.IMetadataSerializer;

class IMetadataSerializer$Registration<T extends IMetadataSection> {
    final IMetadataSectionSerializer<T> ceG;
    final Class<T> ceH;

    private IMetadataSerializer$Registration(IMetadataSerializer iMetadataSerializer, IMetadataSectionSerializer<T> iMetadataSectionSerializer, Class<T> clazz) {
        this.ceG = iMetadataSectionSerializer;
        this.ceH = clazz;
    }
}

