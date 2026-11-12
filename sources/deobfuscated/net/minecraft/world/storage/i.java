/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import net.minecraft.world.ah;
import net.minecraft.world.storage.h;

public class i
extends h {
    public i() {
        super(null);
    }

    @Override
    public ah e(Class<? extends ah> clazz, String string) {
        return (ah)this.dTv.get(string);
    }

    @Override
    public void b(String string, ah ah2) {
        this.dTv.put(string, ah2);
    }

    @Override
    public void azB() {
    }

    @Override
    public int gA(String string) {
        return 0;
    }
}

