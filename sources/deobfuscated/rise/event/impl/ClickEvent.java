/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptClickEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;

public final class ClickEvent
extends dh {
    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptClickEvent(this);
    }

    @Generated
    public ClickEvent() {
    }
}

