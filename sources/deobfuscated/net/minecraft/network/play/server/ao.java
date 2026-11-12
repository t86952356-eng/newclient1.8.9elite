/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.block.Block;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.b;

public class ao
implements aj<a> {
    private b ddy;
    private int data1;
    private int data2;
    private Block jH;

    public ao() {
    }

    public ao(b b2, Block block, int n2, int n3) {
        this.ddy = b2;
        this.data1 = n2;
        this.data2 = n3;
        this.jH = block;
    }

    @Override
    public void a(ak ak2) {
        this.ddy = ak2.afu();
        this.data1 = ak2.readUnsignedByte();
        this.data2 = ak2.readUnsignedByte();
        this.jH = Block.aK(ak2.afw() & 0xFFF);
    }

    @Override
    public void b(ak ak2) {
        ak2.ak(this.ddy);
        ak2.writeByte(this.data1);
        ak2.writeByte(this.data2);
        ak2.gr(Block.i(this.jH) & 0xFFF);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public b ahk() {
        return this.ddy;
    }

    public int getData1() {
        return this.data1;
    }

    public int getData2() {
        return this.data2;
    }

    public Block ahl() {
        return this.jH;
    }
}

