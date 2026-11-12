/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.bn;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.ResourcePackListEntry;

public class bo
extends bn {
    public bo(Minecraft minecraft, int n2, int n3, List<ResourcePackListEntry> list) {
        super(minecraft, n2, n3, list);
    }

    @Override
    protected String FA() {
        return I18n.a("resourcePack.selected.title", new Object[0]);
    }
}

