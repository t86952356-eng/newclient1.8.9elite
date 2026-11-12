/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.entity.ai;

import com.google.common.base.Predicate;
import net.minecraft.entity.ai.ag;
import net.minecraft.entity.passive.y;
import net.minecraft.entity.r;

public class aw<T extends r>
extends ag {
    private final y czG;

    public aw(y y2, Class<T> clazz, boolean bl2, Predicate<? super T> predicate) {
        super(y2, clazz, 10, bl2, false, predicate);
        this.czG = y2;
    }

    @Override
    public boolean WC() {
        return !this.czG.abl() && super.WC();
    }
}

