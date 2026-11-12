/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.commons.packet.api.abstracts;

import rip.vantage.commons.packet.api.interfaces.c;

public abstract class b
implements c {
    private final byte ePd;

    public b(byte by2) {
        this.ePd = by2;
    }

    public byte aeF() {
        return this.ePd;
    }
}

