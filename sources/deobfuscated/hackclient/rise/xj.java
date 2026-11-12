/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import rise.module.Mode;
import rise.module.Module;
import rise.module.impl.render.Interface;
import rise.module.impl.render.interface.YuMode;
import rise.module.impl.render.interface.YvMode;
import rise.module.impl.render.interface.YyMode;
import rise.module.impl.render.interface.ZdMode;
import rise.value.ModeValue;

class xj
extends ModeValue {
    xj(Interface interface_, String string, Module module) {
        super(string, module);
        this.a(new Mode[]{new YyMode("Modern", (Interface)this.wF())});
        this.a(new Mode[]{new ZdMode("Wurst", (Interface)this.wF())});
        this.a(new Mode[]{new YvMode("Classic", (Interface)this.wF())});
        this.a(new Mode[]{new YuMode("Creida", (Interface)this.wF())});
        this.co("Modern");
    }
}

