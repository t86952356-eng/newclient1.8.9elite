/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptAttackEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;
import net.minecraft.entity.r;

public final class AttackEvent
extends dh {
    private r jE;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptAttackEvent(this);
    }

    @Generated
    public r dc() {
        return this.jE;
    }

    @Generated
    public void b(r r2) {
        this.jE = r2;
    }

    @Generated
    public AttackEvent(r r2) {
        this.jE = r2;
    }
}

