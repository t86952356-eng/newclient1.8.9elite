/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptPostMotionEvent;
import hackclient.rise.di;

public final class eg
implements di {
    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptPostMotionEvent(this);
    }
}

