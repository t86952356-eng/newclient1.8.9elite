/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.openjdk.nashorn.api.scripting.JSObject
 *  org.openjdk.nashorn.internal.runtime.ECMAException
 */
package com.alan.clients.script.util;

import hackclient.rise.afl;
import java.util.HashMap;
import java.util.Map;
import org.openjdk.nashorn.api.scripting.JSObject;
import org.openjdk.nashorn.internal.runtime.ECMAException;

public class ScriptHandler {
    private final Map<String, JSObject> functionRegistry = new HashMap<String, JSObject>();

    public void handle(String string, JSObject jSObject) {
        this.functionRegistry.put(string, jSObject);
    }

    public void unhandle(String string) {
        this.functionRegistry.remove(string);
    }

    public void call(String string, Object ... objectArray) {
        JSObject jSObject = this.functionRegistry.get(string);
        if (jSObject == null) {
            return;
        }
        try {
            jSObject.call((Object)this, objectArray);
        }
        catch (ECMAException eCMAException) {
            afl.b(eCMAException.toString(), new Object[0]);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            afl.b("A script threw an exception, stacktrace printed.", new Object[0]);
        }
    }
}

