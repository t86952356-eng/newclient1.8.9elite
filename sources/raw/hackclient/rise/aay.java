/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import com.alan.clients.security.a;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ar;

public final class aay
extends a {
    public aay() {
        super("Explosion Checker", "Server attempted to crash the client with a large explosion");
    }

    @Override
    public boolean k(aj<?> aj2) {
        if (aj2 instanceof ar) {
            ar ar2 = (ar)aj2;
            return ar2.ahm() >= 127.0f || ar2.ahn() >= 127.0f || ar2.aho() >= 127.0f;
        }
        return false;
    }
}

