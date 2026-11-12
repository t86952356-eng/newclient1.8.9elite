/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.NetworkAPI;
import java.util.Arrays;
import lombok.Generated;
import net.minecraft.client.network.h;
import net.minecraft.network.aj;
import rise.event.impl.PacketReceiveEvent;
import rise.util.InstanceAccess;

public final class ahn
implements InstanceAccess {
    private static h uZ() {
        return aER != null ? aER.AU() : null;
    }

    public static void m(aj<?> aj2) {
        h h2 = ahn.uZ();
        if (h2 != null && aj2 != null) {
            h2.u(aj2);
        }
    }

    public static void n(aj<?> aj2) {
        h h2 = ahn.uZ();
        if (h2 != null && aj2 != null) {
            h2.v(aj2);
        }
    }

    public static void o(aj<?> aj2) {
        if (aj2 == null) {
            System.out.println("Packet is null");
            return;
        }
        h h2 = ahn.uZ();
        if (h2 == null) {
            return;
        }
        if (ahn.t(aj2)) {
            h2.u(aj2);
        } else {
            h2.w(aj2);
        }
    }

    public static void p(aj<?> aj2) {
        h h2 = ahn.uZ();
        if (h2 == null || aj2 == null) {
            return;
        }
        if (ahn.t(aj2)) {
            h2.v(aj2);
        } else {
            h2.x(aj2);
        }
    }

    public static void q(aj<?> aj2) {
        h h2 = ahn.uZ();
        if (h2 != null && aj2 != null) {
            h2.w(aj2);
        }
    }

    public static void r(aj<?> aj2) {
        h h2 = ahn.uZ();
        if (h2 != null && aj2 != null) {
            h2.x(aj2);
        }
    }

    public static boolean s(aj<?> aj2) {
        return !ahn.t(aj2);
    }

    public static boolean t(aj<?> aj2) {
        return Arrays.stream(NetworkAPI.serverbound).anyMatch(clazz -> clazz == aj2.getClass());
    }

    public static void j(PacketReceiveEvent packetReceiveEvent) {
        if (!ahn.aER.bgK.csb) {
            // empty if block
        }
    }

    @Generated
    private ahn() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

