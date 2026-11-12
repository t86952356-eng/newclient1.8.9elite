/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import hackclient.rise.eg;

public class ScriptPostMotionEvent
extends ScriptEvent<eg> {
    public ScriptPostMotionEvent(eg eg2) {
        super(eg2);
    }

    @Override
    public String getHandlerName() {
        return "onPostMotion";
    }
}

