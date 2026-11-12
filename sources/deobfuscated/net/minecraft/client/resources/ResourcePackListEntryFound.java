/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

import net.minecraft.client.gui.cb;
import net.minecraft.client.resources.ResourcePackListEntry;
import net.minecraft.client.resources.ResourcePackRepository$Entry;

public class ResourcePackListEntryFound
extends ResourcePackListEntry {
    private final ResourcePackRepository$Entry cdt;

    public ResourcePackListEntryFound(cb cb2, ResourcePackRepository$Entry resourcePackRepository$Entry) {
        super(cb2);
        this.cdt = resourcePackRepository$Entry;
    }

    @Override
    protected void Py() {
        this.cdt.b(this.cdn.Bq());
    }

    @Override
    protected int Pv() {
        return this.cdt.PS();
    }

    @Override
    protected String Pw() {
        return this.cdt.PR();
    }

    @Override
    protected String Px() {
        return this.cdt.Pm();
    }

    public ResourcePackRepository$Entry PE() {
        return this.cdt;
    }
}

