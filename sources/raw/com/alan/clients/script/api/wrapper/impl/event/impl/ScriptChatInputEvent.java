/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import hackclient.rise.dq;

public class ScriptChatInputEvent
extends CancellableScriptEvent<dq> {
    public ScriptChatInputEvent(dq dq2) {
        super(dq2);
    }

    public String getMessage() {
        return ((dq)this.wrapped).getMessage();
    }

    @Override
    public String getHandlerName() {
        return "onChatInput";
    }
}

