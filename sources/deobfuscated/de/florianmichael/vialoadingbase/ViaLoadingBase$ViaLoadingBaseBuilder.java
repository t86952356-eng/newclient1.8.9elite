/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.ViaManagerImpl$ViaManagerBuilder
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.libs.gson.JsonObject
 */
package de.florianmichael.vialoadingbase;

import com.viaversion.viaversion.ViaManagerImpl;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.gson.JsonObject;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import de.florianmichael.vialoadingbase.model.Platform;
import java.io.File;
import java.util.LinkedList;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ViaLoadingBase$ViaLoadingBaseBuilder {
    private final LinkedList<Platform> platforms = new LinkedList();
    private File runDirectory;
    private Integer nativeVersion;
    private BooleanSupplier forceNativeVersionCondition;
    private Supplier<JsonObject> dumpSupplier;
    private Consumer<ViaProviders> providers;
    private Consumer<ViaManagerImpl.ViaManagerBuilder> managerBuilderConsumer;
    private Consumer<ProtocolVersion> onProtocolReload;

    public ViaLoadingBase$ViaLoadingBaseBuilder() {
        this.platforms.add(ViaLoadingBase.PSEUDO_VIA_VERSION);
        this.platforms.add(ViaLoadingBase.PLATFORM_VIA_BACKWARDS);
        this.platforms.add(ViaLoadingBase.PLATFORM_VIA_REWIND);
    }

    public static ViaLoadingBase$ViaLoadingBaseBuilder create() {
        return new ViaLoadingBase$ViaLoadingBaseBuilder();
    }

    public ViaLoadingBase$ViaLoadingBaseBuilder platform(Platform platform) {
        this.platforms.add(platform);
        return this;
    }

    public ViaLoadingBase$ViaLoadingBaseBuilder platform(Platform platform, int n2) {
        this.platforms.add(n2, platform);
        return this;
    }

    public ViaLoadingBase$ViaLoadingBaseBuilder runDirectory(File file) {
        this.runDirectory = file;
        return this;
    }

    public ViaLoadingBase$ViaLoadingBaseBuilder nativeVersion(int n2) {
        this.nativeVersion = n2;
        return this;
    }

    public ViaLoadingBase$ViaLoadingBaseBuilder forceNativeVersionCondition(BooleanSupplier booleanSupplier) {
        this.forceNativeVersionCondition = booleanSupplier;
        return this;
    }

    public ViaLoadingBase$ViaLoadingBaseBuilder dumpSupplier(Supplier<JsonObject> supplier) {
        this.dumpSupplier = supplier;
        return this;
    }

    public ViaLoadingBase$ViaLoadingBaseBuilder providers(Consumer<ViaProviders> consumer) {
        this.providers = consumer;
        return this;
    }

    public ViaLoadingBase$ViaLoadingBaseBuilder managerBuilderConsumer(Consumer<ViaManagerImpl.ViaManagerBuilder> consumer) {
        this.managerBuilderConsumer = consumer;
        return this;
    }

    public ViaLoadingBase$ViaLoadingBaseBuilder onProtocolReload(Consumer<ProtocolVersion> consumer) {
        this.onProtocolReload = consumer;
        return this;
    }

    public void build() {
        if (ViaLoadingBase.getInstance() != null) {
            ViaLoadingBase.LOGGER.severe("ViaLoadingBase has already started the platform!");
            return;
        }
        if (this.runDirectory == null || this.nativeVersion == null) {
            ViaLoadingBase.LOGGER.severe("Please check your ViaLoadingBaseBuilder arguments!");
            return;
        }
        new ViaLoadingBase(this.platforms, this.runDirectory, this.nativeVersion, this.forceNativeVersionCondition, this.dumpSupplier, this.providers, this.managerBuilderConsumer, this.onProtocolReload);
    }
}

