/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahg;
import hackclient.rise.s;
import net.minecraft.util.an;
import rise.Client;
import rise.module.Module;

public final class ak
extends s {
    public ak() {
        super("command.toggle.description", "toggle", "t");
    }

    @Override
    public void execute(String[] stringArray) {
        if (stringArray.length != 2) {
            this.error(String.format(".%s <module>", stringArray[0]));
            return;
        }
        Object t2 = Client.a.g().q(stringArray[1]);
        if (t2 == null) {
            afl.b(ahg.cf("command.bind.invalidmodule"), new Object[0]);
            return;
        }
        ((Module)t2).toggle();
        afl.b(ahg.cf("command.toggle.toggled"), ((Module)t2).getAliases()[0] + " " + (((Module)t2).isEnabled() ? String.valueOf((Object)an.dvV) + "on" : String.valueOf((Object)an.dvX) + "off"));
    }
}

