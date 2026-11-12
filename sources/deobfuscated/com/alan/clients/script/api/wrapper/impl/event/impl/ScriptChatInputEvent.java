/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import rise.event.impl.ChatInputEvent;

public class ScriptChatInputEvent
extends CancellableScriptEvent<ChatInputEvent> {
    public ScriptChatInputEvent(ChatInputEvent chatInputEvent) {
        super(chatInputEvent);
    }

    public String getMessage() {
        return ((ChatInputEvent)this.wrapped).getMessage();
    }

    @Override
    public String getHandlerName() {
        return "onChatInput";
    }
}

