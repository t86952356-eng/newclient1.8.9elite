/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import com.alan.clients.script.api.wrapper.impl.event.ScriptEvent;
import com.alan.clients.script.api.wrapper.impl.event.impl.ScriptChatInputEvent;
import hackclient.rise.a;
import hackclient.rise.dh;
import hackclient.rise.di;
import lombok.Generated;

public final class dq
extends dh {
    private String jc;

    public static void p(String string) {
        a.a.e().d(new dq(string));
    }

    @Override
    public ScriptEvent<? extends di> cG() {
        return new ScriptChatInputEvent(this);
    }

    @Generated
    public String getMessage() {
        return this.jc;
    }

    @Generated
    public dq(String string) {
        this.jc = string;
    }
}

