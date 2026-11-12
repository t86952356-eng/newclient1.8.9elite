/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aks;
import rise.module.Mode;
import rise.module.impl.render.targetinfo.CreidaModernMode;
import rise.value.ModeValue;

class aab
extends ModeValue {
    aab(CreidaModernMode creidaModernMode, String string, Mode mode) {
        super(string, mode);
        this.a(new Mode[]{new aks("Glass")});
        this.a(new Mode[]{new aks("Tint")});
        this.a(new Mode[]{new aks("Solid")});
        this.co("Glass");
    }
}

