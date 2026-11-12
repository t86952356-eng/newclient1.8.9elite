/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aks;
import rise.module.Mode;
import rise.module.impl.render.targetinfo.ModernMode;
import rise.value.ModeValue;

class aae
extends ModeValue {
    aae(ModernMode modernMode, String string, Mode mode) {
        super(string, mode);
        this.a(new Mode[]{new aks("Glass")});
        this.a(new Mode[]{new aks("Tint")});
        this.a(new Mode[]{new aks("Solid")});
        this.co("Glass");
    }
}

