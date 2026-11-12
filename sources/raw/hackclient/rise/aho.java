/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import net.minecraft.network.aj;

public class aho {
    private final aj<?> aNZ;
    private final long aOa;

    public aho(aj<?> aj2, long l2) {
        this.aNZ = aj2;
        this.aOa = l2;
    }

    public aho(aj<?> aj2) {
        this.aNZ = aj2;
        this.aOa = System.currentTimeMillis();
    }

    public aj<?> dq() {
        return this.aNZ;
    }

    public long getTime() {
        return this.aOa;
    }
}

