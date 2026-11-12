/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api;

import com.alan.clients.script.api.RiseAPI;
import com.alan.clients.script.api.wrapper.impl.ScriptCommand;
import hackclient.rise.s;
import java.util.concurrent.atomic.AtomicReference;

class RiseAPI$2
extends s {
    final /* synthetic */ AtomicReference val$scriptCommandReference;

    RiseAPI$2(RiseAPI riseAPI, String string, String[] stringArray,  /* corrupt varargs signature?! */ AtomicReferenceAtomicReference atomicReference) {
        this.val$scriptCommandReference = atomicReference;
        super(string, stringArray);
    }

    @Override
    public void execute(String[] stringArray) {
        ScriptCommand scriptCommand = (ScriptCommand)this.val$scriptCommandReference.get();
        if (scriptCommand == null) {
            return;
        }
        scriptCommand.call("onExecute", stringArray);
    }
}

