/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.bx;
import hackclient.rise.s;
import net.minecraft.entity.player.a;

public final class y
extends s {
    public y() {
        super("command.friend.description", "friend", "setfriend", "f");
    }

    @Override
    public void execute(String[] stringArray) {
        if (stringArray.length != 3) {
            this.error(".f <add/remove> <player>");
        } else {
            String string = stringArray[1].toLowerCase();
            String string2 = stringArray[2];
            boolean bl2 = false;
            block8: for (a a2 : y.aER.bgF.dCY) {
                if (!a2.xU().equalsIgnoreCase(string2)) continue;
                switch (string) {
                    case "add": {
                        bx.j(a2.xU());
                        afl.b(String.format("Added %s to friends list", string2), new Object[0]);
                        bl2 = true;
                        break block8;
                    }
                    case "remove": {
                        bx.k(a2.xU());
                        afl.b(String.format("Removed %s from friends list", string2), new Object[0]);
                        bl2 = true;
                    }
                }
            }
            if (!bl2) {
                afl.b("That user could not be found.", new Object[0]);
            }
        }
    }
}

