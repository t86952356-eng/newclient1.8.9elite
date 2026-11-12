/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptRender2DEvent;
import hackclient.rise.di;
import lombok.Generated;
import net.minecraft.client.gui.cz;

public final class fs
implements di {
    private final cz kg;
    private final float kh;

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
        return this.kh;
    }

    @Generated
    public fs(cz cz2, float f2) {
        this.kg = cz2;
        this.kh = f2;
    }
}

