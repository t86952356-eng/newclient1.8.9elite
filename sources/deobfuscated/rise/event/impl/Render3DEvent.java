/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptRender3DEvent;
import hackclient.rise.di;
import lombok.Generated;

public final class Render3DEvent
implements di {
    private final float partialTicks;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptRender3DEvent(this);
    }

    @Generated
    public float getPartialTicks() {
        return this.partialTicks;
    }

    @Generated
    public Render3DEvent(float f2) {
        this.partialTicks = f2;
    }
}

