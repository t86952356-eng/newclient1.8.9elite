/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ags;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

class agw
implements InputMethodListener {
    final /* synthetic */ ags aKv;

    agw(ags ags2) {
        this.aKv = ags2;
    }

    public void b(InputMethodEvent inputMethodEvent) {
        try {
            this.aKv.a(inputMethodEvent);
        }
        finally {
            inputMethodEvent.consume();
        }
    }

    public void c(InputMethodEvent inputMethodEvent) {
    }
}

