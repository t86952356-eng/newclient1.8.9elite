/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package net.minecraft.network.play.client;

import java.io.IOException;
import lombok.Generated;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class ab
implements aj<b> {
    private String channelName;
    public ak dbU;

    public ab() {
    }

    public ab(String string, ak ak2) {
        this.channelName = string;
        this.dbU = ak2;
        if (ak2.writerIndex() > Short.MAX_VALUE) {
            throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
        }
    }

    @Override
    public void a(ak ak2) {
        this.channelName = ak2.gs(20);
        int n2 = ak2.readableBytes();
        if (n2 < 0 || n2 > Short.MAX_VALUE) {
            throw new IOException("Payload may not be larger than 32767 bytes");
        }
        this.dbU = new ak(ak2.readBytes(n2));
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(this.channelName);
        ak2.writeBytes(this.dbU);
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    public String getChannelName() {
        return this.channelName;
    }

    public ak agj() {
        return this.dbU;
    }

    @Generated
    public void setChannel(String string) {
        this.channelName = string;
    }

    @Generated
    public void e(ak ak2) {
        this.dbU = ak2;
    }
}

