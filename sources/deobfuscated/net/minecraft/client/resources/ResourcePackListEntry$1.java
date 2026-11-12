/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

import java.util.List;
import net.minecraft.client.gui.cv;
import net.minecraft.client.resources.ResourcePackListEntry;

class ResourcePackListEntry$1
implements cv {
    final /* synthetic */ ResourcePackListEntry cdp;

    ResourcePackListEntry$1(ResourcePackListEntry resourcePackListEntry) {
        this.cdp = resourcePackListEntry;
    }

    @Override
    public void confirmClicked(boolean bl2, int n2) {
        List<ResourcePackListEntry> list = this.cdp.cdo.b(this.cdp);
        this.cdp.cdn.a(this.cdp.cdo);
        if (bl2) {
            list.remove(this.cdp);
            this.cdp.cdo.FM().add(0, this.cdp);
        }
    }
}

