/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package net.minecraft.network.play.server;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class bc
implements aj<a> {
    public int cSL;
    public short dbB;
    public boolean dbE;

    public bc() {
    }

    public bc(int n2, short s2, boolean bl2) {
        this.cSL = n2;
        this.dbB = s2;
        this.dbE = bl2;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(ak ak2) {
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17)) {
            this.cSL = ak2.readInt();
        } else {
            this.cSL = ak2.readUnsignedByte();
            this.dbB = ak2.readShort();
            this.dbE = ak2.readBoolean();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.cSL);
        ak2.writeShort(this.dbB);
        ak2.writeBoolean(this.dbE);
    }

    public int getWindowId() {
        return this.cSL;
    }

    public short getActionNumber() {
        return this.dbB;
    }

    public boolean ahJ() {
        return this.dbE;
    }
}

