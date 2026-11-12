/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import com.alan.clients.security.a;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.au;

public final class aba
extends a {
    private int axR;

    public aba() {
        super("ParticleCheck", "Server attempted to crash the client with a large amount of particles");
    }

    @Override
    public boolean k(aj<?> aj2) {
        if (aj2 instanceof au) {
            au au2 = (au)aj2;
            this.axR += au2.getParticleCount();
            this.axR -= 6;
            this.axR = Math.min(this.axR, 150);
            return this.axR > 100 || au2.getParticleCount() < 1 || Math.abs(au2.getParticleCount()) > 20 || au2.getParticleSpeed() < 0.0f || au2.getParticleSpeed() > 1000.0f;
        }
        return false;
    }
}

