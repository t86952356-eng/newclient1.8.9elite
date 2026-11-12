/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ags;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

class agt
implements InputMethodListener {
    final /* synthetic */ ags aKq;

    agt(ags ags2) {
        this.aKq = ags2;
    }

    public void b(InputMethodEvent inputMethodEvent) {
        try {
            this.aKq.a(inputMethodEvent);
        }
        finally {
            inputMethodEvent.consume();
        }
    }

    public void c(InputMethodEvent inputMethodEvent) {
    }
}

