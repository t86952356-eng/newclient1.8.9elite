/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import java.util.Iterator;
import java.util.NoSuchElementException;
import net.minecraft.util.b;
import net.optifine.d;

public class p
implements Iterator<b> {
    private final double evg;
    private final double evh;
    private final int evi;
    private final int evj;
    private double evk;
    private double evl;
    private double evm;
    private double evn;
    private int evo;
    private double evp;
    private double evq;
    private final d evr = new d(0, 0, 0);
    private boolean evs = false;

    public p(b b2, b b3, double d2, double d3) {
        this.evg = d2;
        this.evh = d3;
        this.evi = b2.wt();
        this.evj = b3.wt();
        this.evk = b2.wu();
        this.evl = (double)b3.wu() - 0.5;
        this.evm = b2.wx();
        this.evn = (double)b3.wx() - 0.5;
        this.evo = this.evi;
        this.evp = this.evk;
        this.evq = this.evm;
        this.evs = this.evo < this.evj && this.evp < this.evl && this.evq < this.evn;
    }

    @Override
    public boolean hasNext() {
        return this.evs;
    }

    public b aEu() {
        if (!this.evs) {
            throw new NoSuchElementException();
        }
        this.evr.aq(this.evo, this.evp, this.evq);
        this.aEv();
        this.evs = this.evo < this.evj && this.evp < this.evl && this.evq < this.evn;
        return this.evr;
    }

    private void aEv() {
        this.evq += 1.0;
        if (this.evq >= this.evn) {
            this.evq = this.evm;
            this.evp += 1.0;
            if (this.evp >= this.evl) {
                this.evp = this.evk;
                this.evk += this.evg;
                this.evl += this.evg;
                this.evp = this.evk;
                this.evm += this.evh;
                this.evn += this.evh;
                this.evq = this.evm;
                ++this.evo;
                if (this.evo >= this.evj) {
                    // empty if block
                }
            }
        }
    }

    @Override
    public void remove() {
        throw new RuntimeException("Not implemented");
    }

    public static void main(String[] stringArray) {
        b b2 = new b(-2, 10, 20);
        b b3 = new b(2, 12, 22);
        double d2 = -0.5;
        double d3 = 0.5;
        p p2 = new p(b2, b3, -0.5, 0.5);
        System.out.println("Start: " + String.valueOf(b2) + ", end: " + String.valueOf(b3) + ", yDelta: -0.5, zDelta: 0.5");
        while (p2.hasNext()) {
            b b4 = p2.aEu();
            System.out.println(String.valueOf(b4));
        }
    }

    @Override
    public /* synthetic */ Object next() {
        return this.aEu();
    }
}

