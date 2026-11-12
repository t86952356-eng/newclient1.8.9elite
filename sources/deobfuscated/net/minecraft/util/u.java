/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.util.t;

public class u
extends IllegalArgumentException {
    public u(t t2, String string) {
        super(String.format("Error parsing: %s: %s", t2, string));
    }

    public u(t t2, int n2) {
        super(String.format("Invalid index %d requested for %s", n2, t2));
    }

    public u(t t2, Throwable throwable) {
        super(String.format("Error while parsing: %s", t2), throwable);
    }
}

