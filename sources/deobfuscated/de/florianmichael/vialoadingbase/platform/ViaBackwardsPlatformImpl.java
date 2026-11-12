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
    private final File dataFolder;

    public ViaBackwardsPlatformImpl(File file) {
        this.dataFolder = file;
        this.init(new File(this.dataFolder, "viabackwards.yml"));
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
        return this.dataFolder;
    }
}

