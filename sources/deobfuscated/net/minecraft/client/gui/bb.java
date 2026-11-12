/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net.minecraft.client.gui;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.client.gui.bf;

public class bb
extends bf {
    private final Predicate<String> bqB;

    public bb(int n2, String string, boolean bl2, Predicate<String> predicate) {
        super(n2, string, bl2);
        this.bqB = (Predicate)Objects.firstNonNull(predicate, (Object)Predicates.alwaysTrue());
    }

    public Predicate<String> Fn() {
        return this.bqB;
    }
}

