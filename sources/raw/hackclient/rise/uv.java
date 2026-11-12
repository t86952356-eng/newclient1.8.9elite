/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.fi;
import hackclient.rise.ua;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;

public class uv
extends akg<ua> {
    private int aju = 0;
    private boolean ajv = false;
    private boolean ajw = false;
    @dm
    public final dk<ej> ajx = ej2 -> {
        if ((double)Math.round(uv.aER.bgK.csf) - uv.aER.bgK.ue > 3.0) {
            uv.aER.bgK.ue = 0.0;
            uv.aER.bgK.csf = 0.0f;
            uv.aER.bgK.ud *= 0.1;
            uv.aER.bgK.uf *= 0.1;
            this.ajw = true;
        }
        if (uv.aER.bgK.csf / 3.0f > (float)this.aju) {
            this.aju = Math.round(uv.aER.bgK.csf) / 3;
            this.ajv = true;
        }
        if (uv.aER.bgK.aO) {
            this.aju = 0;
        }
    };
    @dm
    public final dk<fi> ajy = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof e) {
            e e2 = (e)aj2;
            if (this.ajw) {
                uv.aER.bgC.dAp = 0.5f;
                e2.aO = false;
                ahn.n(new e(true));
                this.ajw = false;
            }
        }
    };

    public uv(String string, ua ua2) {
        super(string, ua2);
    }

    @Override
    public void onEnable() {
        this.ajw = false;
        this.ajv = false;
        this.aju = 0;
    }
}

