/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.monster;

import net.minecraft.block.material.Material;
import net.minecraft.entity.ah;
import net.minecraft.entity.ai.a;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.z;
import net.minecraft.entity.aj;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.aw;
import net.minecraft.entity.monster.q;
import net.minecraft.entity.p;
import net.minecraft.entity.projectile.h;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.pathfinding.f;
import net.minecraft.util.ad;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class ao
extends q
implements ah {
    public ao(w w2) {
        super(w2);
        this.o(0.7f, 1.9f);
        ((f)this.UU()).bQ(true);
        this.ctS.a(1, new a(this, 1.25, 20, 10.0f));
        this.ctS.a(2, new bd(this, 1.0));
        this.ctS.a(3, new be(this, net.minecraft.entity.player.a.class, 6.0f));
        this.ctS.a(4, new z(this));
        this.ctT.a(1, new ag<c>(this, p.class, 10, true, false, aw.cFy));
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(4.0);
        this.a(aj.cwp).ap(0.2f);
    }

    @Override
    public void Dn() {
        super.Dn();
        if (!this.baU.dDw) {
            int n2 = bt.aF(this.gW);
            int n3 = bt.aF(this.gX);
            int n4 = bt.aF(this.gY);
            if (this.TG()) {
                this.a(ad.dvg, 1.0f);
            }
            b b2 = new b(n2, 0, n4);
            b b3 = new b(n2, n3, n4);
            if (this.baU.aF(b2).bi(b3) > 1.0f) {
                this.a(ad.dvd, 1.0f);
            }
            for (int i2 = 0; i2 < 4; ++i2) {
                n2 = bt.aF(this.gW + (double)((float)(i2 % 2 * 2 - 1) * 0.25f));
                b b4 = new b(n2, n3 = bt.aF(this.gX), n4 = bt.aF(this.gY + (double)((float)(i2 / 2 % 2 * 2 - 1) * 0.25f)));
                if (this.baU.L(b4).df().xb() != Material.beo) continue;
                b b5 = new b(n2, 0, n4);
                if (!(this.baU.aF(b5).bi(b4) < 0.8f) || !Blocks.cMJ.d(this.baU, b4)) continue;
                this.baU.d(b4, Blocks.cMJ.xM());
            }
        }
    }

    @Override
    protected d Vc() {
        return Items.cQH;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        int n3 = this.ta.nextInt(16);
        for (int i2 = 0; i2 < n3; ++i2) {
            this.d(Items.cQH, 1);
        }
    }

    @Override
    public void g(r r2, float f2) {
        h h2 = new h(this.baU, this);
        double d2 = r2.gX + (double)r2.getEyeHeight() - (double)1.1f;
        double d3 = r2.gW - this.gW;
        double d4 = d2 - h2.gX;
        double d5 = r2.gY - this.gY;
        float f3 = bt.aD(d3 * d3 + d5 * d5) * 0.2f;
        h2.c(d3, d4 + (double)f3, d5, 1.6f, 12.0f);
        this.a("random.bow", 1.0f, 1.0f / (this.VB().nextFloat() * 0.4f + 0.8f));
        this.baU.G(h2);
    }

    @Override
    public float getEyeHeight() {
        return 1.7f;
    }
}

