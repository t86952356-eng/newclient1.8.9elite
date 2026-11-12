/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.di;
import net.minecraft.entity.r;

public final class fx
implements di {
    private final r ko;
    private Runnable kp;
    private Runnable kq;

    public fx(r r2, Runnable runnable, Runnable runnable2) {
        this.ko = r2;
        this.kp = runnable;
        this.kq = runnable2;
    }

    public r dH() {
        return this.ko;
    }

    public Runnable dI() {
        return this.kp;
    }

    public Runnable dJ() {
        return this.kq;
    }

    public void a(Runnable runnable) {
        this.kp = runnable;
    }

    public void b(Runnable runnable) {
        this.kq = runnable;
    }
}

