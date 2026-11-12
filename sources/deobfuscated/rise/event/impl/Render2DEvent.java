/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptRender2DEvent;
import hackclient.rise.di;
import lombok.Generated;
import net.minecraft.client.gui.cz;

public final class Render2DEvent
implements di {
    private final cz kg;
    private final float partialTicks;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptRender2DEvent(this);
    }

    @Generated
    public cz dx() {
        return this.kg;
    }

    @Generated
    public float getPartialTicks() {
        return this.partialTicks;
    }

    @Generated
    public Render2DEvent(cz cz2, float f2) {
        this.kg = cz2;
        this.partialTicks = f2;
    }
}

