/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.platform.ViaPlatformLoader
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.version.VersionProvider
 */
package de.florianmichael.vialoadingbase.platform.viaversion;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.version.VersionProvider;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import de.florianmichael.vialoadingbase.provider.VLBBaseVersionProvider;

public class VLBViaProviders
implements ViaPlatformLoader {
    public void load() {
        ViaProviders viaProviders = Via.getManager().getProviders();
        viaProviders.use(VersionProvider.class, (Provider)new VLBBaseVersionProvider());
        if (ViaLoadingBase.getInstance().getProviders() != null) {
            ViaLoadingBase.getInstance().getProviders().accept(viaProviders);
        }
    }

    public void unload() {
    }
}

