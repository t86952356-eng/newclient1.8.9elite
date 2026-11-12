/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.ViaManagerImpl
 *  com.viaversion.viaversion.ViaManagerImpl$ViaManagerBuilder
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.ViaManager
 *  com.viaversion.viaversion.api.platform.ViaInjector
 *  com.viaversion.viaversion.api.platform.ViaPlatform
 *  com.viaversion.viaversion.api.platform.ViaPlatformLoader
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.commands.ViaCommandHandler
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.protocol.ProtocolManagerImpl
 */
package de.florianmichael.vialoadingbase;

import com.viaversion.viaversion.ViaManagerImpl;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.ViaManager;
import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.api.platform.ViaPlatform;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.commands.ViaCommandHandler;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocol.ProtocolManagerImpl;
import de.florianmichael.vialoadingbase.model.Platform;
import de.florianmichael.vialoadingbase.platform.ViaBackwardsPlatformImpl;
import de.florianmichael.vialoadingbase.platform.ViaRewindPlatformImpl;
import de.florianmichael.vialoadingbase.platform.ViaVersionPlatformImpl;
import de.florianmichael.vialoadingbase.platform.viaversion.VLBViaCommandHandler;
import de.florianmichael.vialoadingbase.platform.viaversion.VLBViaInjector;
import de.florianmichael.vialoadingbase.platform.viaversion.VLBViaProviders;
import de.florianmichael.vialoadingbase.util.JLoggerToLog4j;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;

public class ViaLoadingBase {
    public static final String VERSION = "${vialoadingbase_version}";
    public static final Logger LOGGER = new JLoggerToLog4j(LogManager.getLogger());
    public static final Platform PSEUDO_VIA_VERSION = new Platform("ViaVersion", () -> true, () -> {}, list -> list.addAll(ViaVersionPlatformImpl.createVersionList()));
    public static final Platform PLATFORM_VIA_BACKWARDS = new Platform("ViaBackwards", () -> ViaLoadingBase.inClassPath("com.viaversion.viabackwards.api.ViaBackwardsPlatform"), () -> new ViaBackwardsPlatformImpl(Via.getManager().getPlatform().getDataFolder()));
    public static final Platform PLATFORM_VIA_REWIND = new Platform("ViaRewind", () -> ViaLoadingBase.inClassPath("com.viaversion.viarewind.api.ViaRewindPlatform"), () -> new ViaRewindPlatformImpl(Via.getManager().getPlatform().getDataFolder()));
    public static final List<ProtocolVersion> PROTOCOLS = new ArrayList<ProtocolVersion>();
    private static ViaLoadingBase instance;
    private final LinkedList<Platform> subPlatforms;
    private final File runDirectory;
    private final int nativeVersion;
    private final BooleanSupplier forceNativeVersionCondition;
    private final Supplier<JsonObject> dumpSupplier;
    private final Consumer<ViaProviders> providers;
    private final Consumer<ViaManagerImpl.ViaManagerBuilder> managerBuilderConsumer;
    private final Consumer<ProtocolVersion> onProtocolReload;
    private ProtocolVersion nativeProtocolVersion;
    private ProtocolVersion targetProtocolVersion;

    public ViaLoadingBase(LinkedList<Platform> linkedList, File file, int n2, BooleanSupplier booleanSupplier, Supplier<JsonObject> supplier, Consumer<ViaProviders> consumer, Consumer<ViaManagerImpl.ViaManagerBuilder> consumer2, Consumer<ProtocolVersion> consumer3) {
        this.subPlatforms = linkedList;
        this.runDirectory = new File(file, "ViaLoadingBase");
        this.nativeVersion = n2;
        this.forceNativeVersionCondition = booleanSupplier;
        this.dumpSupplier = supplier;
        this.providers = consumer;
        this.managerBuilderConsumer = consumer2;
        this.onProtocolReload = consumer3;
        instance = this;
        this.initPlatform();
    }

    public ProtocolVersion getTargetVersion() {
        if (this.forceNativeVersionCondition != null && this.forceNativeVersionCondition.getAsBoolean()) {
            return this.nativeProtocolVersion;
        }
        return this.targetProtocolVersion;
    }

    public void reload(ProtocolVersion protocolVersion) {
        this.targetProtocolVersion = protocolVersion;
        if (this.onProtocolReload != null) {
            this.onProtocolReload.accept(this.targetProtocolVersion);
        }
    }

    public void initPlatform() {
        Platform platform2;
        for (Platform platform2 : this.subPlatforms) {
            platform2.createProtocolPath();
        }
        this.targetProtocolVersion = this.nativeProtocolVersion = ProtocolVersion.getProtocol((int)this.nativeVersion);
        ViaVersionPlatformImpl viaVersionPlatformImpl = new ViaVersionPlatformImpl(LOGGER);
        platform2 = ViaManagerImpl.builder().platform((ViaPlatform)viaVersionPlatformImpl).loader((ViaPlatformLoader)new VLBViaProviders()).injector((ViaInjector)new VLBViaInjector()).commandHandler((ViaCommandHandler)new VLBViaCommandHandler());
        if (this.managerBuilderConsumer != null) {
            this.managerBuilderConsumer.accept((ViaManagerImpl.ViaManagerBuilder)platform2);
        }
        Via.init((ViaManager)platform2.build());
        ViaManagerImpl viaManagerImpl = (ViaManagerImpl)Via.getManager();
        viaManagerImpl.addEnableListener(() -> {
            for (Platform platform : this.subPlatforms) {
                platform.build(LOGGER);
            }
        });
        viaManagerImpl.init();
        viaManagerImpl.onServerLoaded();
        viaManagerImpl.getProtocolManager().setMaxProtocolPathSize(Integer.MAX_VALUE);
        viaManagerImpl.getProtocolManager().setMaxPathDeltaIncrease(-1);
        ((ProtocolManagerImpl)viaManagerImpl.getProtocolManager()).refreshVersions();
        LOGGER.info("ViaLoadingBase has loaded " + Platform.COUNT + "/" + this.subPlatforms.size() + " platforms");
    }

    public static ViaLoadingBase getInstance() {
        return instance;
    }

    public List<Platform> getSubPlatforms() {
        return this.subPlatforms;
    }

    public File getRunDirectory() {
        return this.runDirectory;
    }

    public int getNativeVersion() {
        return this.nativeVersion;
    }

    public Supplier<JsonObject> getDumpSupplier() {
        return this.dumpSupplier;
    }

    public Consumer<ViaProviders> getProviders() {
        return this.providers;
    }

    public static boolean inClassPath(String string) {
        try {
            Class.forName(string);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    @Deprecated
    public static List<ProtocolVersion> getProtocols() {
        return PROTOCOLS;
    }
}

