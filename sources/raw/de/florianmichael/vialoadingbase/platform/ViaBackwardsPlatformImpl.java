/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.ViaBackwardsPlatform
 */
package de.florianmichael.vialoadingbase.platform;

import com.viaversion.viabackwards.api.ViaBackwardsPlatform;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import java.io.File;
import java.util.logging.Logger;

public class ViaBackwardsPlatformImpl
implements ViaBackwardsPlatform {
    private final File directory;

    public ViaBackwardsPlatformImpl(File file) {
        this.directory = file;
        this.init(new File(this.directory, "viabackwards.yml"));
    }

    public Logger getLogger() {
        return ViaLoadingBase.LOGGER;
    }

    public boolean isOutdated() {
        return false;
    }

    public void disable() {
    }

    public File getDataFolder() {
        return this.directory;
    }
}

