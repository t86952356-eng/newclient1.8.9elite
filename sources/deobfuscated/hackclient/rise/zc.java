/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aks;
import rise.module.Mode;
import rise.module.impl.render.interface.YyMode;
import rise.value.ModeValue;

class zc
extends ModeValue {
    zc(YyMode yyMode, String string, Mode mode) {
        super(string, mode);
        this.a(new Mode[]{new aks("Off")});
        this.a(new Mode[]{new aks("Normal")});
        this.co("Normal");
    }
}

