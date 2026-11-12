/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import java.util.UUID;
import net.minecraft.entity.ai.ae;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.c;
import net.minecraft.entity.p;
import net.minecraft.entity.passive.y;
import net.minecraft.pathfinding.f;
import net.minecraft.util.b;
import net.minecraft.world.w;

public abstract class j
extends p {
    public static final UUID ctq = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
    public static final a ctr = new a(ctq, "Fleeing speed bonus", 2.0, 2).aM(false);
    private b cts = b.dtN;
    private float ctt = -1.0f;
    private final e ctu = new ae(this, 1.0);
    private boolean ctv;

    public j(w w2) {
        super(w2);
    }

    public float ad(b b2) {
        return 0.0f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean UB() {
        if (!super.UB()) return false;
        b b2 = new b(this.gW, this.Us().dtI, this.gY);
        if (!(this.ad(b2) >= 0.0f)) return false;
        return true;
    }

    public boolean UC() {
        return !this.ctR.aiK();
    }

    public boolean UD() {
        return this.ae(new b(this));
    }

    public boolean ae(b b2) {
        return this.ctt == -1.0f || this.cts.i(b2) < (double)(this.ctt * this.ctt);
    }

    public void c(b b2, int n2) {
        this.cts = b2;
        this.ctt = n2;
    }

    public b UE() {
        return this.cts;
    }

    public float UF() {
        return this.ctt;
    }

    public void UG() {
        this.ctt = -1.0f;
    }

    public boolean UH() {
        return this.ctt != -1.0f;
    }

    @Override
    protected void UI() {
        super.UI();
        if (this.Vq() && this.Vr() != null && this.Vr().baU == this.baU) {
            c c2 = this.Vr();
            this.c(new b((int)c2.gW, (int)c2.gX, (int)c2.gY), 5);
            float f2 = this.S(c2);
            if (this instanceof y && ((y)this).abm()) {
                if (f2 > 10.0f) {
                    this.h(true, true);
                }
                return;
            }
            if (!this.ctv) {
                this.ctS.a(2, this.ctu);
                if (this.UU() instanceof f) {
                    ((f)this.UU()).bQ(false);
                }
                this.ctv = true;
            }
            this.aV(f2);
            if (f2 > 4.0f) {
                this.UU().e(c2, 1.0);
            }
            if (f2 > 6.0f) {
                double d2 = (c2.gW - this.gW) / (double)f2;
                double d3 = (c2.gX - this.gX) / (double)f2;
                double d4 = (c2.gY - this.gY) / (double)f2;
                this.ud += d2 * Math.abs(d2) * 0.4;
                this.ue += d3 * Math.abs(d3) * 0.4;
                this.uf += d4 * Math.abs(d4) * 0.4;
            }
            if (f2 > 10.0f) {
                this.h(true, true);
            }
        } else if (!this.Vq() && this.ctv) {
            this.ctv = false;
            this.ctS.a(this.ctu);
            if (this.UU() instanceof f) {
                ((f)this.UU()).bQ(true);
            }
            this.UG();
        }
    }

    protected void aV(float f2) {
    }
}

