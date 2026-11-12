/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fa;

public final class bi
extends am {
    public static String dx;
    public static int dy;
    @dm
    public final dk<fa> dz = fa2 -> {
        dx = fa2.getIp();
        dy = fa2.getPort();
    };
}

