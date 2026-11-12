/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import lombok.Generated;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.v;
import net.minecraft.network.play.server.x;
import net.minecraft.network.play.server.y;

public final class o {
    public static boolean b(aj<?> aj2) {
        return aj2 instanceof v;
    }

    public static boolean c(aj<?> aj2) {
        return aj2 instanceof y || aj2 instanceof x;
    }

    @Generated
    private o() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

