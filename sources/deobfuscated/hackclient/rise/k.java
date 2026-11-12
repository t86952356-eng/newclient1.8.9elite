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

@e(R="Tower", S="Watchdog", description="Impossible Motion")
public final class k
extends d {
    public k(m m2) {
        super(m2);
    }

    @Override
    public void a(aj<?> aj2) {
        if (o.b(aj2) && ((v)aj2).entityId == this.R.Y().getEntityId() || aj2 instanceof z && ((z)aj2).entityId == this.R.Y().getEntityId()) {
            b b2 = this.R.Y();
            if (b2.isInvisible()) {
                return;
            }
            if (this.R.ae() <= 10 + this.R.aH()) {
                return;
            }
            if (this.R.aj() == 0.65625 && this.R.am() == 0.75) {
                this.J();
            }
        }
    }
}

