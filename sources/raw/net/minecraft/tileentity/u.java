/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import java.util.Random;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.b;
import net.minecraft.inventory.j;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.d;
import net.minecraft.util.ba;
import net.minecraft.util.bi;
import net.minecraft.util.bt;
import net.minecraft.util.s;
import net.minecraft.util.t;
import net.minecraft.world.m;

public class u
extends d
implements bi,
m {
    public int czL;
    public float dsN;
    public float dsO;
    public float dsP;
    public float dsQ;
    public float dsR;
    public float dsS;
    public float dsT;
    public float dsU;
    public float dsV;
    private static final Random dsW = new Random();
    private String coX;

    @Override
    public void b(n n2) {
        super.b(n2);
        if (this.xV()) {
            n2.R("CustomName", this.coX);
        }
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        if (n2.C("CustomName", 8)) {
            this.coX = n2.eK("CustomName");
        }
    }

    @Override
    public void jA() {
        float f2;
        this.dsS = this.dsR;
        this.dsU = this.dsT;
        a a2 = this.baU.o((float)this.aZf.wt() + 0.5f, (float)this.aZf.wu() + 0.5f, (float)this.aZf.wx() + 0.5f, 3.0);
        if (a2 != null) {
            double d2 = a2.gW - (double)((float)this.aZf.wt() + 0.5f);
            double d3 = a2.gY - (double)((float)this.aZf.wx() + 0.5f);
            this.dsV = (float)bt.y(d3, d2);
            this.dsR += 0.1f;
            if (this.dsR < 0.5f || dsW.nextInt(40) == 0) {
                float f3 = this.dsP;
                do {
                    this.dsP += (float)(dsW.nextInt(4) - dsW.nextInt(4));
                } while (f3 == this.dsP);
            }
        } else {
            this.dsV += 0.02f;
            this.dsR -= 0.1f;
        }
        while (this.dsT >= (float)Math.PI) {
            this.dsT -= (float)Math.PI * 2;
        }
        while (this.dsT < (float)(-Math.PI)) {
            this.dsT += (float)Math.PI * 2;
        }
        while (this.dsV >= (float)Math.PI) {
            this.dsV -= (float)Math.PI * 2;
        }
        while (this.dsV < (float)(-Math.PI)) {
            this.dsV += (float)Math.PI * 2;
        }
        for (f2 = this.dsV - this.dsT; f2 >= (float)Math.PI; f2 -= (float)Math.PI * 2) {
        }
        while (f2 < (float)(-Math.PI)) {
            f2 += (float)Math.PI * 2;
        }
        this.dsT += f2 * 0.4f;
        this.dsR = bt.I(this.dsR, 0.0f, 1.0f);
        ++this.czL;
        this.dsO = this.dsN;
        float f4 = (this.dsP - this.dsN) * 0.4f;
        float f5 = 0.2f;
        f4 = bt.I(f4, -0.2f, 0.2f);
        this.dsQ += (f4 - this.dsQ) * 0.9f;
        this.dsN += this.dsQ;
    }

    @Override
    public String xU() {
        return this.xV() ? this.coX : "container.enchant";
    }

    @Override
    public boolean xV() {
        return this.coX != null && this.coX.length() > 0;
    }

    public void es(String string) {
        this.coX = string;
    }

    @Override
    public ba xW() {
        return this.xV() ? new s(this.xU()) : new t(this.xU(), new Object[0]);
    }

    @Override
    public b a(g g2, a a2) {
        return new j(g2, this.baU, this.aZf);
    }

    @Override
    public String xX() {
        return "minecraft:enchanting_table";
    }
}

