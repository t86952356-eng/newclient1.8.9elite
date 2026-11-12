/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aks;
import rise.module.Mode;
import rise.module.impl.render.interface.YvMode;
import rise.value.ModeValue;

class yx
extends ModeValue {
    yx(YvMode yvMode, String string, Mode mode) {
        super(string, mode);
        this.a(new Mode[]{new aks("Right")});
        this.a(new Mode[]{new aks("Left")});
        this.co("Right");
    }
}

