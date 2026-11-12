/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.s;
import rise.Client;

public final class ad
extends s {
    public ad() {
        super("command.panic.description", "panic", "p", "myau");
    }

    @Override
    public void execute(String[] stringArray) {
        Client.a.g().ef().stream().filter(module -> !module.getModuleInfo().autoEnabled()).forEach(module -> module.setEnabled(false));
    }
}

