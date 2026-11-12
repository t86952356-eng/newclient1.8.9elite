/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aks;
import rise.module.Mode;
import rise.module.Module;
import rise.module.impl.render.Interface;
import rise.value.ModeValue;

class xl
extends ModeValue {
    xl(Interface interface_, String string, Module module) {
        super(string, module);
        this.a(new Mode[]{new aks("Rise")});
        this.a(new Mode[]{new aks("Traditional")});
        this.co("Rise");
    }
}

