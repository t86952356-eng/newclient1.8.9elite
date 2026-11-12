/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.chunk.storage;

import java.io.ByteArrayOutputStream;
import net.minecraft.world.chunk.storage.j;

class k
extends ByteArrayOutputStream {
    private final int dJV;
    private final int dJW;
    final /* synthetic */ j dJX;

    public k(j j2, int n2, int n3) {
        this.dJX = j2;
        super(8096);
        this.dJV = n2;
        this.dJW = n3;
    }

    @Override
    public void close() {
        this.dJX.a(this.dJV, this.dJW, this.buf, this.count);
    }
}

