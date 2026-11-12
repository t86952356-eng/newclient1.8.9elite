/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  lombok.Generated
 */
package net.minecraft.network.play.client;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import lombok.Generated;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class s
implements aj<b> {
    private int windowId;
    private short uid;
    private boolean dbE;

    public s() {
    }

    public s(int n2, short s2, boolean bl2) {
        this.windowId = n2;
        this.uid = s2;
        this.dbE = bl2;
    }

    public s(int n2, boolean bl2) {
        this.windowId = n2;
        this.dbE = bl2;
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    @Override
    public void a(ak ak2) {
        this.windowId = ak2.readByte();
        this.uid = ak2.readShort();
        this.dbE = ak2.readByte() != 0;
    }

    @Override
    public void b(ak ak2) {
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17)) {
            ak2.writeInt(this.windowId);
        } else {
            ak2.writeByte(this.windowId);
            ak2.writeShort(this.uid);
            ak2.writeByte(this.dbE ? 1 : 0);
        }
    }

    public int getWindowId() {
        return this.windowId;
    }

    public short getUid() {
        return this.uid;
    }

    @Generated
    public void setWindowId(int n2) {
        this.windowId = n2;
    }

    @Generated
    public void setUid(short s2) {
        this.uid = s2;
    }

    @Generated
    public void setAccepted(boolean bl2) {
        this.dbE = bl2;
    }
}

