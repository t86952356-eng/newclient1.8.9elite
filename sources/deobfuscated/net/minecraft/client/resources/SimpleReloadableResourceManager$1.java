/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net.minecraft.client.resources;

import com.google.common.base.Function;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.SimpleReloadableResourceManager;

class SimpleReloadableResourceManager$1
implements Function<IResourcePack, String> {
    SimpleReloadableResourceManager$1(SimpleReloadableResourceManager simpleReloadableResourceManager) {
    }

    public String c(IResourcePack iResourcePack) {
        return iResourcePack.Pf();
    }

    public /* synthetic */ Object apply(Object object) {
        return this.c((IResourcePack)object);
    }
}

