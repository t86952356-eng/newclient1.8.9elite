/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import rise.event.impl.KeyboardInputEvent;

public class ScriptKeyboardInputEvent
extends ScriptEvent<KeyboardInputEvent> {
    public ScriptKeyboardInputEvent(KeyboardInputEvent keyboardInputEvent) {
        super(keyboardInputEvent);
    }

    public int getKey() {
        return ((KeyboardInputEvent)this.wrapped).cO();
    }

    @Override
    public String getHandlerName() {
        return "onKeyboardInput";
    }
}

