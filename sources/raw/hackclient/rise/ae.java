/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.s;

public final class ae
extends s {
    public ae() {
        super("command.say.description", "say", "chat");
    }

    @Override
    public void execute(String[] stringArray) {
        if (stringArray.length <= 1) {
            this.error(String.format(".%s <message>", stringArray[0]));
        } else {
            afl.i(String.join((CharSequence)" ", stringArray).substring(3).trim());
            afl.b("command.say.sent", new Object[0]);
        }
    }
}

