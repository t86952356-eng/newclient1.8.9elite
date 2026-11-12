/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.config;

import net.minecraft.enchantment.a;
import net.optifine.config.h;

public class m
implements h {
    @Override
    public int P(String string, int n2) {
        a a2 = a.ea(string);
        return a2 == null ? n2 : a2.cqw;
    }
}

