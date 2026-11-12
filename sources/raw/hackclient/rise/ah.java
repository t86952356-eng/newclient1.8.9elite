/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.s;
import net.minecraft.network.play.client.f;

public final class ah
extends s {
    public ah() {
        super("command.stuck.description", "stuck");
    }

    @Override
    public void execute(String[] stringArray) {
        ahn.n(new f(ah.aER.bgK.gW, -1.0, ah.aER.bgK.gY, false));
        afl.b("command.stuck.sent", new Object[0]);
    }
}

