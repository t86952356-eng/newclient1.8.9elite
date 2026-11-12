/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptKillEvent;
import hackclient.rise.di;
import lombok.Generated;
import net.minecraft.entity.c;

public final class ex
implements di {
    c jM;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptKillEvent(this);
    }

    @Generated
    public c dk() {
        return this.jM;
    }

    @Generated
    public ex(c c2) {
        this.jM = c2;
    }
}

