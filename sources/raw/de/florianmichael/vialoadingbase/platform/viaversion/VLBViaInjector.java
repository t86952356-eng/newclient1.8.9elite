/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.platform.ViaInjector
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectLinkedOpenHashSet
 *  com.viaversion.viaversion.libs.gson.JsonObject
 */
package de.florianmichael.vialoadingbase.platform.viaversion;

import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectLinkedOpenHashSet;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.util.SortedSet;

public class VLBViaInjector
implements ViaInjector {
    public void inject() {
    }

    public void uninject() {
    }

    public String getDecoderName() {
        return "via-decoder";
    }

    public String getEncoderName() {
        return "via-encoder";
    }

    public SortedSet<ProtocolVersion> getServerProtocolVersions() {
        ObjectLinkedOpenHashSet objectLinkedOpenHashSet = new ObjectLinkedOpenHashSet();
        objectLinkedOpenHashSet.addAll(ProtocolVersion.getProtocols());
        return objectLinkedOpenHashSet;
    }

    public ProtocolVersion getServerProtocolVersion() {
        return this.getServerProtocolVersions().first();
    }

    public JsonObject getDump() {
        return new JsonObject();
    }
}

