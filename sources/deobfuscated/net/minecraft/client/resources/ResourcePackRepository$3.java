/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.SettableFuture
 */
package net.minecraft.client.resources;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import net.minecraft.client.resources.ResourcePackRepository;

class ResourcePackRepository$3
implements FutureCallback<Object> {
    final /* synthetic */ File cdH;
    final /* synthetic */ SettableFuture cdI;
    final /* synthetic */ ResourcePackRepository cdJ;

    ResourcePackRepository$3() {
        this.cdJ = var1_1;
        this.cdH = var2_2;
        this.cdI = var3_3;
    }

    public void onSuccess(Object object) {
        this.cdJ.f(this.cdH);
        this.cdI.set(null);
    }

    public void onFailure(Throwable throwable) {
        this.cdI.setException(throwable);
    }
}

