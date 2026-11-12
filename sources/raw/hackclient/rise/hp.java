/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gn;
import hackclient.rise.r;
import net.minecraft.entity.c;
import net.minecraft.util.cf;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public final class hp
extends akg<gn> {
    private boolean ji;
    @dm
    public final dk<ei> rz = ei2 -> {
        if (Mouse.isButtonDown((int)2) || Keyboard.isKeyDown((int)29) && hp.aER.aIY.chw.Re()) {
            if (this.ji) {
                return;
            }
            this.ji = true;
            if (hp.aER.bhc.dzu == cf.dzz) {
                c c2;
                r r2 = a.a.x();
                if (r2.a(this, c2 = hp.aER.bhc.dzw)) {
                    a.a.x().c(this, c2);
                } else {
                    a.a.x().b(this, c2);
                }
            }
        } else {
            this.ji = false;
        }
    };

    public hp(String string, gn gn2) {
        super(string, gn2);
    }

    @Override
    public void onDisable() {
        a.a.x().a(this);
    }
}

