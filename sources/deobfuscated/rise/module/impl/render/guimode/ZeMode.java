/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.module.impl.render.guimode;

import lombok.Generated;
import rise.module.Mode;
import rise.module.Module;
import rise.module.impl.render.Interface;
import rise.module.impl.render.TargetInfo;

public class ZeMode<I extends Module>
extends Mode<Interface> {
    private final Mode<TargetInfo> atO;

    public ZeMode(String string, Interface interface_, Mode<TargetInfo> mode) {
        super(string, interface_);
        this.atO = mode;
    }

    @Generated
    public Mode<TargetInfo> nF() {
        return this.atO;
    }
}

