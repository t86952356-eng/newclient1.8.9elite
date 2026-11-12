/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.block.state.IBlockState;
import net.minecraft.network.play.server.al;
import net.minecraft.util.b;
import net.minecraft.world.chunk.a;

public class am {
    private final short ddv;
    private final IBlockState ddw;
    final /* synthetic */ al ddx;

    public am(al al2, short s2, IBlockState iBlockState) {
        this.ddx = al2;
        this.ddv = s2;
        this.ddw = iBlockState;
    }

    public am(al al2, short s2, a a2) {
        this.ddx = al2;
        this.ddv = s2;
        this.ddw = a2.L(this.Ab());
    }

    public b Ab() {
        return new b(this.ddx.ddt.J(this.ddv >> 12 & 0xF, this.ddv & 0xFF, this.ddv >> 8 & 0xF));
    }

    public short ahj() {
        return this.ddv;
    }

    public IBlockState yU() {
        return this.ddw;
    }
}

