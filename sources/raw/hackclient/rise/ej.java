/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptPreUpdateEvent;
import hackclient.rise.di;

public class ej
implements di {
    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptPreUpdateEvent(this);
    }
}

