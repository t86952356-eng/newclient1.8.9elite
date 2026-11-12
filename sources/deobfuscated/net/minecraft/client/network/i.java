/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 */
package net.minecraft.client.network;

import com.google.common.util.concurrent.FutureCallback;
import net.minecraft.client.network.h;
import net.minecraft.network.play.client.ad;
import net.minecraft.network.play.client.ae;

class i
implements FutureCallback<Object> {
    final /* synthetic */ String bEW;
    final /* synthetic */ h bEX;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    i(h h2, String string) {
        this.bEX = h2;
        this.bEW = string;
    }

    public void onSuccess(Object object) {
        this.bEX.bEL.B(new ad(this.bEW, ae.dbW));
    }

    public void onFailure(Throwable throwable) {
        this.bEX.bEL.B(new ad(this.bEW, ae.dbY));
    }
}

