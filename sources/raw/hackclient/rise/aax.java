/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import com.alan.clients.security.a;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.av;

public final class aax
extends a {
    public aax() {
        super("Demo Check", "Server attempted to prevent gameplay with a demo screen");
    }

    @Override
    public boolean k(aj<?> aj2) {
        if (aj2 instanceof av) {
            av av2 = (av)aj2;
            return av2.getGameState() == 5 && av2.ahv() == 0.0f;
        }
        return false;
    }
}

