/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class bs
implements aj<a> {
    private String dbT;
    private ak dbU;

    public bs() {
    }

    public bs(String string, ak ak2) {
        this.dbT = string;
        this.dbU = ak2;
        if (ak2.writerIndex() > 0x100000) {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
        }
    }

    @Override
    public void a(ak ak2) {
        this.dbT = ak2.gs(20);
        int n2 = ak2.readableBytes();
        if (n2 < 0 || n2 > 0x100000) {
            throw new IOException("Payload may not be larger than 1048576 bytes");
        }
        this.dbU = new ak(ak2.readBytes(n2));
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(this.dbT);
        ak2.writeBytes(this.dbU, this.dbU.readerIndex(), this.dbU.readableBytes());
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public String getChannelName() {
        return this.dbT;
    }

    public ak agj() {
        return this.dbU;
    }
}

