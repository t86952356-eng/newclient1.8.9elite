/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package net.minecraft.util;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import net.minecraft.client.settings.a;
import net.minecraft.util.cc;
import rise.Client;
import rise.event.impl.MoveInputEvent;

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
        MoveInputEvent moveInputEvent = new MoveInputEvent(this.cuW, this.dzs, this.gD, this.jr, 0.3);
        Client.a.e().d(moveInputEvent);
        double d2 = moveInputEvent.getSneakSlowDownMultiplier();
        this.cuW = moveInputEvent.getForward();
        this.dzs = moveInputEvent.getStrafe();
        this.gD = moveInputEvent.isJump();
        this.jr = moveInputEvent.isSneak();
        ProtocolVersion protocolVersion = ViaLoadingBase.getInstance().getTargetVersion();
        if (protocolVersion.newerThanOrEqualTo(ProtocolVersion.v1_14) ? (protocolVersion.newerThanOrEqualTo(ProtocolVersion.v1_15) ? bl2 : this.jr || bl2) : this.jr) {
            this.dzs = (float)((double)this.dzs * d2);
            this.cuW = (float)((double)this.cuW * d2);
        }
    }
}

