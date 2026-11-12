/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptKeyboardInputEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;
import net.minecraft.client.gui.bp;

public final class dx
extends dh {
    private final int jl;
    private final char jm;
    private final bp jn;

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptKeyboardInputEvent(this);
    }

    @Generated
    public int cO() {
        return this.jl;
    }

    @Generated
    public char cP() {
        return this.jm;
    }

    @Generated
    public bp cQ() {
        return this.jn;
    }

    @Generated
    public dx(int n2, char c2, bp bp2) {
        this.jl = n2;
        this.jm = c2;
        this.jn = bp2;
    }
}

