/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.zr;
import java.util.ArrayList;
import rise.module.impl.render.KeyStrokes;
import rise.util.InstanceAccess;
import rise.util.math.Vector2f;

class xq
extends ArrayList<zr> {
    final /* synthetic */ KeyStrokes apA;

    xq(KeyStrokes keyStrokes) {
        this.apA = keyStrokes;
        this.add(new zr(new Vector2f(25.0f, 0.0f), InstanceAccess.aER.aIY.chm));
        this.add(new zr(new Vector2f(0.0f, 25.0f), InstanceAccess.aER.aIY.chn));
        this.add(new zr(new Vector2f(50.0f, 25.0f), InstanceAccess.aER.aIY.chp));
        this.add(new zr(new Vector2f(25.0f, 25.0f), InstanceAccess.aER.aIY.cho));
        if (((Boolean)this.apA.apv.wD()).booleanValue()) {
            this.add(new zr(new Vector2f(72.0f, 22.0f), new Vector2f(0.0f, 50.0f), "Space", InstanceAccess.aER.aIY.chq));
        }
    }
}

