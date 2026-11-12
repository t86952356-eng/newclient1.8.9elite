/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.s;

public final class aa
extends s {
    public aa() {
        super("command.insults.description", "insults", "killinsults", "insult");
    }

    @Override
    public void execute(String[] stringArray) {
        if (stringArray.length >= 3) {
            String string = stringArray[1].toLowerCase();
            String string2 = stringArray[2];
            if (string.equals("create")) {
                this.sd().r().bO(string2);
                afl.b("command.insults.created", string2);
            } else if (string.equals("delete")) {
                this.sd().r().bM(string2);
                afl.b("command.insults.removed", string2);
            }
        } else {
            afl.b("command.insults.help1", new Object[0]);
            afl.b("command.insults.help2", new Object[0]);
        }
    }
}

