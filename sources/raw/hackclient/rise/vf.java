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
import hackclient.rise.eo;
import hackclient.rise.fi;
import hackclient.rise.tn;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import org.lwjgl.input.Keyboard;

public class vf
extends akg<tn> {
    public static int bj;
    @dm(cH=0)
    public final dk<eo> ajO = eo2 -> {
        if (!Keyboard.isKeyDown((int)vf.aER.aIY.chr.cO())) {
            return;
        }
    };
    @dm(cH=3)
    public final dk<ej> ajP = ej2 -> {
        if (!Keyboard.isKeyDown((int)vf.aER.aIY.chr.cO()) || vf.aER.bgK.cst > 20) {
            return;
        }
    };
    @dm
    public final dk<fi> ajQ = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof k) {
            k k2 = (k)aj2;
        }
    };

    public vf(String string, tn tn2) {
        super(string, tn2);
    }

    @Override
    public void onEnable() {
        bj = 0;
    }
}

