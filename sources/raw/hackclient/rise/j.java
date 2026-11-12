/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.d;
import hackclient.rise.e;
import hackclient.rise.m;
import hackclient.rise.o;
import net.minecraft.client.entity.b;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.v;
import net.minecraft.network.play.server.z;
import rip.vantage.commons.util.time.a;

@e(R="Speed", S="Limit", description="Detects speeds")
public final class j
extends d {
    private double ah;
    private double ai;
    private a aj = new a();

    public j(m m2) {
        super(m2);
    }

    @Override
    public void a(aj<?> aj2) {
        if (o.b(aj2) && ((v)aj2).crw == this.R.Y().getEntityId() || aj2 instanceof z && ((z)aj2).crw == this.R.Y().getEntityId()) {
            b b2 = this.R.Y();
            if (b2.isInvisible()) {
                return;
            }
            if (this.R.ae() <= 10 + this.R.aH()) {
                return;
            }
            double d2 = 0.356;
            double d3 = Math.abs(this.R.aw() - this.R.ay());
            if (!this.R.aB()) {
                d2 *= 0.7;
            } else if (this.R.aI() <= 2) {
                d2 *= 0.75;
            }
            if (d3 < 180.0 && d3 > 20.0 && !this.R.isOnGround()) {
                d2 *= 1.0 - d3 / 300.0;
            }
            if (this.R.Y().abK()) {
                d2 *= 0.7;
            }
            this.ah += this.R.ao();
            this.ai += (double)((float)this.aj.aKM() / 50.0f) * d2;
            this.ai = Math.min(this.ai, this.ah + 2.0);
            if (this.R.aj() == 0.65625 && this.R.am() == 0.75) {
                this.J();
            }
            if (this.ah > this.ai) {
                if (this.Q() > 6.0) {
                    this.J();
                }
                this.K();
                this.ai = this.ah;
            } else {
                this.b(0.2f);
            }
            this.aj.aX();
        }
    }
}

