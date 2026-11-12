/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.lang.reflect.Method;
import net.minecraft.src.a;
import net.optifine.util.y;

class ad
implements y {
    private boolean qW = false;
    final /* synthetic */ Method eNm;
    final /* synthetic */ Object eNn;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ad(Method method, Object object) {
        this.eNm = method;
        this.eNn = object;
    }

    @Override
    public long aJp() {
        if (this.qW) {
            return -1L;
        }
        try {
            return (Long)this.eNm.invoke(this.eNn, new Object[0]);
        }
        catch (Throwable throwable) {
            a.warn(throwable.getClass().getName() + ": " + throwable.getMessage());
            this.qW = true;
            return -1L;
        }
    }
}

