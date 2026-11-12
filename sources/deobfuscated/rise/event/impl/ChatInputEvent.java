/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.event.impl;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptChatInputEvent;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;
import rise.Client;

public final class ChatInputEvent
extends dh {
    private String message;

    public static void p(String string) {
        Client.a.e().d(new ChatInputEvent(string));
    }

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptChatInputEvent(this);
    }

    @Generated
    public String getMessage() {
        return this.message;
    }

    @Generated
    public ChatInputEvent(String string) {
        this.message = string;
    }
}

