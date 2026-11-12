/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.bm;
import hackclient.rise.bp;

final class bn {
    private final long eh = bm.dU.getAndIncrement();
    private final bp ei;
    private boolean dj = true;

    private bn(bp bp2) {
        this.ei = bp2;
    }

    private boolean a(long l2, long l3) {
        return l2 + this.ei.dQ < l3;
    }

    private boolean bd() {
        return this.dj && this.ei.ek == this;
    }

    public boolean equals(Object object) {
        return object instanceof bn && ((bn)object).eh == this.eh;
    }

    public int hashCode() {
        return Long.hashCode(this.eh);
    }
}

