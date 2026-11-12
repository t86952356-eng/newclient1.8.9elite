/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import com.alan.clients.security.a;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.i;

public final class abc
extends a {
    public abc() {
        super("Large Teleport", "Detects ridiculous teleports");
    }

    @Override
    public boolean k(aj<?> aj2) {
        if (aj2 instanceof i) {
            i i2 = (i)aj2;
            return Math.abs(i2.x) > 1.0E9 || Math.abs(i2.y) > 1.0E9 || Math.abs(i2.z) > 1.0E9;
        }
        return false;
    }
}

