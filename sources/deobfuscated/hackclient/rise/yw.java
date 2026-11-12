/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aks;
import rise.module.Mode;
import rise.module.impl.render.guimode.YvMode;
import rise.value.ModeValue;

class yw
extends ModeValue {
    yw(YvMode yvMode, String string, Mode mode) {
        super(string, mode);
        this.a(new Mode[]{new aks("Static")});
        this.a(new Mode[]{new aks("Rainbow")});
        this.a(new Mode[]{new aks("Fade")});
        this.co("Rainbow");
    }
}

