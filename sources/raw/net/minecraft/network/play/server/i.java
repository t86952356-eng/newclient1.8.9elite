/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package net.minecraft.network.play.server;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import java.util.Set;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.j;

public class i
implements aj<a> {
    public double x;
    public double y;
    public double z;
    public float gZ;
    public float ha;
    public Set<j> dcl;
    public int dcm;

    public i() {
    }

    public i(double d2, double d3, double d4, float f2, float f3, Set<j> set) {
        this.x = d2;
        this.y = d3;
        this.z = d4;
        this.gZ = f2;
        this.ha = f3;
        this.dcl = set;
    }

    @Override
    public void a(ak ak2) {
        this.x = ak2.readDouble();
        this.y = ak2.readDouble();
        this.z = ak2.readDouble();
        this.gZ = ak2.readFloat();
        this.ha = ak2.readFloat();
        this.dcl = j.gv(ak2.readUnsignedByte());
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
            this.dcm = ak2.afw();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.writeDouble(this.x);
        ak2.writeDouble(this.y);
        ak2.writeDouble(this.z);
        ak2.writeFloat(this.gZ);
        ak2.writeFloat(this.ha);
        ak2.writeByte(j.b(this.dcl));
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public float getYaw() {
        return this.gZ;
    }

    public float getPitch() {
        return this.ha;
    }

    public Set<j> agr() {
        return this.dcl;
    }
}

