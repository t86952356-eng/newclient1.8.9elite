/*
 * Decompiled with CFR 0.152.
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptTickEvent;
import hackclient.rise.dh;
import hackclient.rise.di;

public final class TickEvent
extends dh {
    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptTickEvent(this);
    }
}

