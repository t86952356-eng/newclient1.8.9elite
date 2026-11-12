/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aks;
import rise.module.Mode;
import rise.module.impl.render.guimode.YyMode;
import rise.value.ModeValue;

class zb
extends ModeValue {
    zb(YyMode yyMode, String string, Mode mode) {
        super(string, mode);
        this.a(new Mode[]{new aks("Glow")});
        this.a(new Mode[]{new aks("Shadow")});
        this.co("Shadow");
    }
}

