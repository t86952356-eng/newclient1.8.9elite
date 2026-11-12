/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.aik;
import hackclient.rise.s;
import net.minecraft.client.gui.bp;

public final class ac
extends s {
    public ac() {
        super("command.name.description", "name", "ign", "username", "nick", "nickname");
    }

    @Override
    public void execute(String[] stringArray) {
        String string = aik.R();
        bp.setClipboardString(string);
        afl.b("command.name.copied", string);
    }
}

