/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.afl;
import hackclient.rise.ahg;
import hackclient.rise.gi;
import hackclient.rise.s;
import net.minecraft.util.an;

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
        Object t2 = a.a.g().q(stringArray[1]);
        if (t2 == null) {
            afl.b(ahg.cf("command.bind.invalidmodule"), new Object[0]);
            return;
        }
        ((gi)t2).toggle();
        afl.b(ahg.cf("command.toggle.toggled"), ((gi)t2).getAliases()[0] + " " + (((gi)t2).isEnabled() ? String.valueOf((Object)an.dvV) + "on" : String.valueOf((Object)an.dvX) + "off"));
    }
}

