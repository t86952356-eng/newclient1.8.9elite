/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fe;
import hackclient.rise.xd;

public final class yt
extends akg<xd> {
    private float asT;
    @dm
    public final dk<fe> asU = fe2 -> {
        yt.aER.aIY.chW = 100.0f;
    };

    public yt(String string, xd xd2) {
        super(string, xd2);
    }

    @Override
    public void onEnable() {
        this.asT = yt.aER.aIY.chW;
    }

    @Override
    public void onDisable() {
        yt.aER.aIY.chW = this.asT;
    }
}

