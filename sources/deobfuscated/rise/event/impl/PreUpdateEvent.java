/*
 * Decompiled with CFR 0.152.
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptPreUpdateEvent;
import hackclient.rise.di;

public class PreUpdateEvent
implements di {
    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptPreUpdateEvent(this);
    }
}

