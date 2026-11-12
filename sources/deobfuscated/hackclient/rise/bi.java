/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.fa;
import rise.event.EventLink;
import rise.event.Listener;

public final class bi
extends am {
    public static String dx;
    public static int dy;
    @EventLink
    public final Listener<fa> dz = fa2 -> {
        dx = fa2.getIp();
        dy = fa2.getPort();
    };
}

