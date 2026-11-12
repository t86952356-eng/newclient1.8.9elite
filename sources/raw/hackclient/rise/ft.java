/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptRender3DEvent;
import hackclient.rise.di;
import lombok.Generated;

public final class ft
implements di {
    private final float ki;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptRender3DEvent(this);
    }

    @Generated
    public float getPartialTicks() {
        return this.ki;
    }

    @Generated
    public ft(float f2) {
        this.ki = f2;
    }
}

