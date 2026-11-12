/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.afl;
import hackclient.rise.ahm;
import hackclient.rise.akr;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.other.spammer.name"}, description="module.other.spammer.description", category=Category.PLAYER)
public final class Spammer
extends Module {
    private final akr Wc = new akr("Message", (Module)this, "Buy Rise at riseclient.com!");
    private final NumberValue Wd = new NumberValue("Delay", this, (Number)3000, (Number)0, (Number)20000, (Number)1);
    private final a We = new a();
    @EventLink
    public final Listener<PreMotionEvent> Wf = preMotionEvent -> {
        if (ahm.ch("loyisa.cn") && ((String)this.Wc.wD()).startsWith("/")) {
            afl.b("Upon a request from Loyisa we have blacklisted Loyisa's Test Server from Spammer.", new Object[0]);
            this.toggle();
            return;
        }
        if (this.We.T(((Number)this.Wd.wD()).longValue())) {
            if (((String)this.Wc.wD()).startsWith("#")) {
                afl.b("Spammer message cannot contain #. You're not spamming IRC Skid.", new Object[0]);
                return;
            }
            Spammer.aER.bgK.sendChatMessage((String)this.Wc.wD());
            this.We.aX();
        }
    };
}

