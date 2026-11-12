/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.world.chunk;

import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.d;
import net.minecraft.util.b;
import net.minecraft.world.chunk.a;
import net.minecraft.world.chunk.e;
import net.minecraft.world.w;

public class g
extends a {
    public g(w w2, int n2, int n3) {
        super(w2, n2, n3);
    }

    @Override
    public boolean aT(int n2, int n3) {
        return n2 == this.dIK && n3 == this.dIL;
    }

    @Override
    public int aU(int n2, int n3) {
        return 0;
    }

    @Override
    public void axx() {
    }

    @Override
    public void axy() {
    }

    @Override
    public Block bp(b b2) {
        return Blocks.cLc;
    }

    @Override
    public int bo(b b2) {
        return 255;
    }

    @Override
    public int bq(b b2) {
        return 0;
    }

    @Override
    public int b(net.minecraft.world.g g2, b b2) {
        return g2.dCb;
    }

    @Override
    public void a(net.minecraft.world.g g2, b b2, int n2) {
    }

    @Override
    public int g(b b2, int n2) {
        return 0;
    }

    @Override
    public void aE(c c2) {
    }

    @Override
    public void H(c c2) {
    }

    @Override
    public void e(c c2, int n2) {
    }

    @Override
    public boolean aM(b b2) {
        return false;
    }

    @Override
    public d a(b b2, e e2) {
        return null;
    }

    @Override
    public void a(d d2) {
    }

    @Override
    public void c(b b2, d d2) {
    }

    @Override
    public void aU(b b2) {
    }

    @Override
    public void TR() {
    }

    @Override
    public void axz() {
    }

    @Override
    public void axA() {
    }

    @Override
    public void a(c c2, net.minecraft.util.a a2, List<c> list, Predicate<? super c> predicate) {
    }

    @Override
    public <T extends c> void a(Class<? extends T> clazz, net.minecraft.util.a a2, List<T> list, Predicate<? super T> predicate) {
    }

    @Override
    public boolean cx(boolean bl2) {
        return false;
    }

    @Override
    public Random L(long l2) {
        return new Random(this.de().avD() + (long)(this.dIK * this.dIK * 4987142) + (long)(this.dIK * 5947611) + (long)(this.dIL * this.dIL) * 4392871L + (long)(this.dIL * 389711) ^ l2);
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean aW(int n2, int n3) {
        return true;
    }
}

