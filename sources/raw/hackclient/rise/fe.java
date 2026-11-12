/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptTickEvent;
import hackclient.rise.dh;
import hackclient.rise.di;

public final class fe
extends dh {
    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptTickEvent(this);
    }
}

