/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viarewind.api.ViaRewindPlatform
 */
package de.florianmichael.vialoadingbase.platform;

import com.viaversion.viarewind.api.ViaRewindPlatform;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import java.io.File;
import java.util.logging.Logger;

public class ViaRewindPlatformImpl
implements ViaRewindPlatform {
    private final File dataFolder;

    public ViaRewindPlatformImpl(File file) {
        this.dataFolder = file;
        this.init(new File(this.dataFolder, "viarewind.yml"));
    }

    public Logger getLogger() {
        return ViaLoadingBase.LOGGER;
    }

    public File getDataFolder() {
        return this.dataFolder;
    }
}

