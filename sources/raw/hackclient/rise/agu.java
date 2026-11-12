/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ags;
import hackclient.rise.agv;
import java.awt.Canvas;
import java.awt.Window;
import java.awt.im.InputMethodRequests;

class agu
extends Canvas {
    private final InputMethodRequests aKr = new agv(this);
    final /* synthetic */ Window aKs;
    final /* synthetic */ ags aKt;

    agu(ags ags2, Window window) {
        this.aKt = ags2;
        this.aKs = window;
    }

    public InputMethodRequests uy() {
        return this.aKr;
    }
}

