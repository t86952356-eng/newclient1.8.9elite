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

class j
implements FutureCallback<Object> {
    final /* synthetic */ String bEY;
    final /* synthetic */ h bEZ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    j(h h2, String string) {
        this.bEZ = h2;
        this.bEY = string;
    }

    public void onSuccess(Object object) {
        this.bEZ.bEL.B(new ad(this.bEY, ae.dbW));
    }

    public void onFailure(Throwable throwable) {
        this.bEZ.bEL.B(new ad(this.bEY, ae.dbY));
    }
}

