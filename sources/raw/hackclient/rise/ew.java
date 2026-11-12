/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptGameEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;

public final class ew
extends dh {
    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptGameEvent(this);
    }

    @Generated
    public ew() {
    }
}

