/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.jf;

public class jq
extends akg<jf> {
    private double x;
    private double y;
    private double z;
    @dm
    public final dk<ei> xq = ei2 -> {
        double d2 = 5.0;
        this.x += 5.0;
        this.y = Math.min(this.y + 5.0, 255.0);
        this.z += 5.0;
        ei2.setPosX(this.x);
        ei2.setPosY(this.y);
        ei2.setPosZ(this.z);
    };

    public jq(String string, jf jf2) {
        super(string, jf2);
    }

    @Override
    public void onEnable() {
        this.x = jq.aER.bgK.gW;
        this.y = jq.aER.bgK.gX;
        this.z = jq.aER.bgK.gY;
    }
}

