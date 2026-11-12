/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import rise.event.impl.PostMotionEvent;

public class ScriptPostMotionEvent
extends ScriptEvent<PostMotionEvent> {
    public ScriptPostMotionEvent(PostMotionEvent postMotionEvent) {
        super(postMotionEvent);
    }

    @Override
    public String getHandlerName() {
        return "onPostMotion";
    }
}

