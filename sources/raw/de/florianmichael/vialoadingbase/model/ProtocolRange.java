/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package de.florianmichael.vialoadingbase.model;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

@Deprecated
public class ProtocolRange {
    private final ProtocolVersion lowerBound;
    private final ProtocolVersion upperBound;

    public ProtocolRange(ProtocolVersion protocolVersion, ProtocolVersion protocolVersion2) {
        if (protocolVersion == null && protocolVersion2 == null) {
            throw new RuntimeException("Invalid protocol range");
        }
        this.lowerBound = protocolVersion;
        this.upperBound = protocolVersion2;
    }

    public static ProtocolRange andNewer(ProtocolVersion protocolVersion) {
        return new ProtocolRange(null, protocolVersion);
    }

    public static ProtocolRange singleton(ProtocolVersion protocolVersion) {
        return new ProtocolRange(protocolVersion, protocolVersion);
    }

    public static ProtocolRange andOlder(ProtocolVersion protocolVersion) {
        return new ProtocolRange(protocolVersion, null);
    }

    public boolean contains(ProtocolVersion protocolVersion) {
        if (this.lowerBound != null && protocolVersion.olderThan(this.lowerBound)) {
            return false;
        }
        return this.upperBound == null || protocolVersion.olderThanOrEqualTo(this.upperBound);
    }

    public String toString() {
        if (this.lowerBound == null) {
            return this.upperBound.getName() + "+";
        }
        if (this.upperBound == null) {
            return this.lowerBound.getName() + "-";
        }
        if (this.lowerBound == this.upperBound) {
            return this.lowerBound.getName();
        }
        return this.lowerBound.getName() + " - " + this.upperBound.getName();
    }
}

