/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aks;
import rise.module.Mode;
import rise.module.Module;
import rise.module.impl.render.Interface;
import rise.value.ModeValue;

class xk
extends ModeValue {
    xk(Interface interface_, String string, Module module) {
        super(string, module);
        this.a(new Mode[]{new aks("All")});
        this.a(new Mode[]{new aks("Exclude render")});
        this.a(new Mode[]{new aks("Only bound")});
        this.co("Exclude render");
    }
}

