/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import rip.vantage.commons.packet.impl.client.community.d;
import rip.vantage.network.core.a;

public final class afh {
    private afh() {
    }

    public static void A(String string, String string2) {
        try {
            a a2 = a.aKQ();
            if (a2.aKZ() == null || a2.bX() == null || a2.bX().trim().isEmpty()) {
                return;
            }
            a2.aKZ().sendMessage(new d(a2.bX(), string, string2).aJz());
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

