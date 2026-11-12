/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptModuleToggleEvent;
import hackclient.rise.di;
import hackclient.rise.gi;
import lombok.Generated;

public final class ey
implements di {
    private gi cg;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptModuleToggleEvent(this);
    }

    @Generated
    public gi dl() {
        return this.cg;
    }

    @Generated
    public ey(gi gi2) {
        this.cg = gi2;
    }
}

