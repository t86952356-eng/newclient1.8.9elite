/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.ViaAPI
 *  com.viaversion.viaversion.api.configuration.ViaVersionConfig
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.UnsupportedSoftware
 *  com.viaversion.viaversion.api.platform.ViaPlatform
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.libs.gson.JsonObject
 */
package de.florianmichael.vialoadingbase.platform;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.ViaAPI;
import com.viaversion.viaversion.api.configuration.ViaVersionConfig;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.UnsupportedSoftware;
import com.viaversion.viaversion.api.platform.ViaPlatform;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.gson.JsonObject;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import de.florianmichael.vialoadingbase.platform.viaversion.VLBViaAPIWrapper;
import de.florianmichael.vialoadingbase.platform.viaversion.VLBViaConfig;
import de.florianmichael.vialoadingbase.util.VLBTask;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ViaVersionPlatformImpl
implements ViaPlatform<UserConnection> {
    private final ViaAPI<UserConnection> api = new VLBViaAPIWrapper();
    private final Logger logger;
    private final VLBViaConfig config;

    public ViaVersionPlatformImpl(Logger logger) {
        this.logger = logger;
        this.config = new VLBViaConfig(new File(ViaLoadingBase.getInstance().getRunDirectory(), "viaversion.yml"), logger);
    }

    public static List<ProtocolVersion> createVersionList() {
        List<ProtocolVersion> list = new ArrayList(ProtocolVersion.getProtocols()).stream().filter(protocolVersion -> protocolVersion.isKnown() && protocolVersion.newerThanOrEqualTo(ProtocolVersion.v1_8)).collect(Collectors.toList());
        Collections.reverse(list);
        return list;
    }

    public VLBTask runAsync(Runnable runnable) {
        return new VLBTask(Via.getManager().getScheduler().execute(runnable));
    }

    public VLBTask runRepeatingAsync(Runnable runnable, long l2) {
        return new VLBTask(Via.getManager().getScheduler().scheduleRepeating(runnable, 0L, l2 * 50L, TimeUnit.MILLISECONDS));
    }

    public VLBTask runSync(Runnable runnable) {
        return this.runAsync(runnable);
    }

    public VLBTask runSync(Runnable runnable, long l2) {
        return new VLBTask(Via.getManager().getScheduler().schedule(runnable, l2 * 50L, TimeUnit.MILLISECONDS));
    }

    public VLBTask runRepeatingSync(Runnable runnable, long l2) {
        return this.runRepeatingAsync(runnable, l2);
    }

    public boolean isProxy() {
        return true;
    }

    public void onReload() {
    }

    public Logger getLogger() {
        return this.logger;
    }

    public ViaVersionConfig getConf() {
        return this.config;
    }

    public ViaAPI<UserConnection> getApi() {
        return this.api;
    }

    public File getDataFolder() {
        return ViaLoadingBase.getInstance().getRunDirectory();
    }

    public String getPluginVersion() {
        return "5.7.1";
    }

    public String getPlatformName() {
        return "ViaLoadingBase";
    }

    public String getPlatformVersion() {
        return "${vialoadingbase_version}";
    }

    public VLBViaConfig getConfig() {
        return this.config;
    }

    public Collection<UnsupportedSoftware> getUnsupportedSoftwareClasses() {
        return super.getUnsupportedSoftwareClasses();
    }

    public boolean hasPlugin(String string) {
        return false;
    }

    public JsonObject getDump() {
        if (ViaLoadingBase.getInstance().getDumpSupplier() == null) {
            return new JsonObject();
        }
        return ViaLoadingBase.getInstance().getDumpSupplier().get();
    }
}

