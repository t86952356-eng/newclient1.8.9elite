/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.optifine.util.ak;

class al
implements IResourceManagerReloadListener {
    al() {
    }

    @Override
    public void a(IResourceManager iResourceManager) {
        ak.d(iResourceManager);
    }
}

