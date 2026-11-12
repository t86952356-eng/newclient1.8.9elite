/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.s;

public final class ad
extends s {
    public ad() {
        super("command.panic.description", "panic", "p", "myau");
    }

    @Override
    public void execute(String[] stringArray) {
        a.a.g().ef().stream().filter(gi2 -> !gi2.getModuleInfo().autoEnabled()).forEach(gi2 -> gi2.setEnabled(false));
    }
}

