/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package net.minecraft.util;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.dz;
import net.minecraft.client.settings.a;
import net.minecraft.util.cc;

public class cd
extends cc {
    private final a dzt;

    public cd(a a2) {
        this.dzt = a2;
    }

    @Override
    public void atv() {
        this.dzs = 0.0f;
        this.cuW = 0.0f;
        if (this.dzt.chm.Re()) {
            this.cuW += 1.0f;
        }
        if (this.dzt.cho.Re()) {
            this.cuW -= 1.0f;
        }
        if (this.dzt.chn.Re()) {
            this.dzs += 1.0f;
        }
        if (this.dzt.chp.Re()) {
            this.dzs -= 1.0f;
        }
        this.gD = this.dzt.chq.Re();
        boolean bl2 = this.jr;
        this.jr = this.dzt.chr.Re();
        this.gD = this.dzt.chq.Re();
        this.jr = this.dzt.chr.Re();
        dz dz2 = new dz(this.cuW, this.dzs, this.gD, this.jr, 0.3);
        hackclient.rise.a.a.e().d(dz2);
        double d2 = dz2.getSneakSlowDownMultiplier();
        this.cuW = dz2.getForward();
        this.dzs = dz2.getStrafe();
        this.gD = dz2.isJump();
        this.jr = dz2.isSneak();
        ProtocolVersion protocolVersion = ViaLoadingBase.getInstance().getTargetVersion();
        if (protocolVersion.newerThanOrEqualTo(ProtocolVersion.v1_14) ? (protocolVersion.newerThanOrEqualTo(ProtocolVersion.v1_15) ? bl2 : this.jr || bl2) : this.jr) {
            this.dzs = (float)((double)this.dzs * d2);
            this.cuW = (float)((double)this.cuW * d2);
        }
    }
}

