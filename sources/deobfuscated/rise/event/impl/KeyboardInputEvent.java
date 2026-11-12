/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptKeyboardInputEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;
import net.minecraft.client.gui.GuiScreen;

public final class KeyboardInputEvent
extends dh {
    private final int jl;
    private final char jm;
    private final GuiScreen jn;

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
    public GuiScreen cQ() {
        return this.jn;
    }

    @Generated
    public KeyboardInputEvent(int n2, char c2, GuiScreen guiScreen) {
        this.jl = n2;
        this.jm = c2;
        this.jn = guiScreen;
    }
}

