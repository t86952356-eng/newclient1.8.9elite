/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.tn;
import org.lwjgl.input.Keyboard;

public class vd
extends akg<tn> {
    @dm(cH=1)
    public final dk<ej> ajK = ej2 -> {
        if (!Keyboard.isKeyDown((int)vd.aER.aIY.chr.cO())) {
            return;
        }
        ((tn)this.wy()).ahh = ((tn)this.wy()).ahh.v(0.0, -1.0, 0.0);
    };

    public vd(String string, tn tn2) {
        super(string, tn2);
    }
}

