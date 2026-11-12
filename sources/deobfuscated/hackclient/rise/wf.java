/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aks;
import rise.module.Mode;
import rise.module.Module;
import rise.module.impl.render.Ambience;
import rise.value.ModeValue;

class wf
extends ModeValue {
    wf(Ambience ambience, String string, Module module) {
        super(string, module);
        this.a(new Mode[]{new aks("Unchanged")});
        this.a(new Mode[]{new aks("Clear")});
        this.a(new Mode[]{new aks("Rain")});
        this.a(new Mode[]{new aks("Heavy Snow")});
        this.a(new Mode[]{new aks("Light Snow")});
        this.a(new Mode[]{new aks("Nether Particles")});
        this.co("Unchanged");
    }
}

