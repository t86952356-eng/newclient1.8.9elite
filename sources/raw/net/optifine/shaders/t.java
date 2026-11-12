/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import java.util.ArrayDeque;
import java.util.Deque;
import net.optifine.shaders.ah;
import net.optifine.shaders.s;

public class t {
    private final Deque<s> evN = new ArrayDeque<s>();

    public void b(s s2) {
        this.evN.addLast(s2);
    }

    public s aEO() {
        if (this.evN.isEmpty()) {
            return ah.eBV;
        }
        s s2 = this.evN.pollLast();
        return s2;
    }
}

