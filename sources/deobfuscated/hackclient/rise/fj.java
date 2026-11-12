/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.dh;
import io.netty.buffer.ByteBuf;
import lombok.Generated;

public final class fj
extends dh {
    private ByteBuf jT;
    private int id;

    @Generated
    public ByteBuf ds() {
        return this.jT;
    }

    @Generated
    public int getId() {
        return this.id;
    }

    @Generated
    public void a(ByteBuf byteBuf) {
        this.jT = byteBuf;
    }

    @Generated
    public void k(int n2) {
        this.id = n2;
    }

    @Generated
    public fj(ByteBuf byteBuf, int n2) {
        this.jT = byteBuf;
        this.id = n2;
    }
}

