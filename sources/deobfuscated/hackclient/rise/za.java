/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aks;
import rise.module.Mode;
import rise.module.impl.render.interface.YyMode;
import rise.value.ModeValue;

class za
extends ModeValue {
    za(YyMode yyMode, String string, Mode mode) {
        super(string, mode);
        this.a(new Mode[]{new aks("Apple UI")});
        this.a(new Mode[]{new aks("Minecraft")});
        this.a(new Mode[]{new aks("Custom")});
        this.co("Apple UI");
    }
}

