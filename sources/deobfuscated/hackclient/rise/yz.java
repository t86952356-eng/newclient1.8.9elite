/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aks;
import rise.module.Mode;
import rise.module.impl.render.guimode.YyMode;
import rise.value.ModeValue;

class yz
extends ModeValue {
    yz(YyMode yyMode, String string, Mode mode) {
        super(string, mode);
        this.a(new Mode[]{new aks("Static")});
        this.a(new Mode[]{new aks("Fade")});
        this.a(new Mode[]{new aks("Breathe")});
        this.co("Fade");
    }
}

