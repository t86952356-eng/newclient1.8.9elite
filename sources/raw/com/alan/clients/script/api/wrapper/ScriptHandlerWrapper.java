/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.openjdk.nashorn.api.scripting.JSObject
 */
package com.alan.clients.script.api.wrapper;

import com.alan.clients.script.api.wrapper.ScriptWrapper;
import com.alan.clients.script.util.ScriptHandler;
import org.openjdk.nashorn.api.scripting.JSObject;

public abstract class ScriptHandlerWrapper<T>
extends ScriptWrapper<T> {
    private final ScriptHandler handler = new ScriptHandler();

    public ScriptHandlerWrapper(T t2) {
        super(t2);
    }

    public void handle(String string, JSObject jSObject) {
        this.handler.handle(string, jSObject);
    }

    public void unhandle(String string) {
        this.handler.unhandle(string);
    }

    public void call(String string, Object ... objectArray) {
        this.handler.call(string, objectArray);
    }
}

