/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 */
package net.minecraft.client.network;

import com.google.common.util.concurrent.FutureCallback;
import net.minecraft.client.network.l;
import net.minecraft.network.play.client.ad;
import net.minecraft.network.play.client.ae;

class m
implements FutureCallback<Object> {
    final /* synthetic */ l bFe;

    m(l l2) {
        this.bFe = l2;
    }

    public void onSuccess(Object object) {
        this.bFe.bFd.bFc.bEL.B(new ad(this.bFe.bFd.bFa, ae.dbW));
    }

    public void onFailure(Throwable throwable) {
        this.bFe.bFd.bFc.bEL.B(new ad(this.bFe.bFd.bFa, ae.dbY));
    }
}

