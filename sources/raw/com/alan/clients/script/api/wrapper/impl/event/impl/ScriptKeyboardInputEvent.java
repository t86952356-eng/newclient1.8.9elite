/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.dx;

public class ScriptKeyboardInputEvent
extends ScriptEvent<dx> {
    public ScriptKeyboardInputEvent(dx dx2) {
        super(dx2);
    }

    public int getKey() {
        return ((dx)this.wrapped).cO();
    }

    @Override
    public String getHandlerName() {
        return "onKeyboardInput";
    }
}

