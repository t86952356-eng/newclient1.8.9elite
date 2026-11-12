/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

class aj {
    double conn;
    double coo;

    aj() {
    }

    aj(double d2, double d3) {
        this.conn = d2;
        this.coo = d3;
    }

    double a(aj aj2) {
        double d2 = this.conn - aj2.conn;
        double d3 = this.coo - aj2.coo;
        return Math.sqrt(d2 * d2 + d3 * d3);
    }

    void Sq() {
        double d2 = this.Sr();
        this.conn /= d2;
        this.coo /= d2;
    }

    float Sr() {
        return bt.aD(this.conn * this.conn + this.coo * this.coo);
    }

    public void b(aj aj2) {
        this.conn -= aj2.conn;
        this.coo -= aj2.coo;
    }

    public boolean j(double d2, double d3, double d4, double d5) {
        boolean bl2 = false;
        if (this.conn < d2) {
            this.conn = d2;
            bl2 = true;
        } else if (this.conn > d4) {
            this.conn = d4;
            bl2 = true;
        }
        if (this.coo < d3) {
            this.coo = d3;
            bl2 = true;
        } else if (this.coo > d5) {
            this.coo = d5;
            bl2 = true;
        }
        return bl2;
    }

    public int f(w w2) {
        b b2 = new b(this.conn, 256.0, this.coo);
        while (b2.wu() > 0) {
            if (w2.L(b2 = b2.aqY()).df().xb() == Material.beo) continue;
            return b2.wu() + 1;
        }
        return 257;
    }

    public boolean g(w w2) {
        b b2 = new b(this.conn, 256.0, this.coo);
        while (b2.wu() > 0) {
            Material material = w2.L(b2 = b2.aqY()).df().xb();
            if (material == Material.beo) continue;
            return !material.zv() && material != Material.beC;
        }
        return false;
    }

    public void a(Random random, double d2, double d3, double d4, double d5) {
        this.conn = bt.b(random, d2, d4);
        this.coo = bt.b(random, d3, d5);
    }
}

