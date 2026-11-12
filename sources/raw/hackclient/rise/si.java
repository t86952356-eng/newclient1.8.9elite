/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahm;
import hackclient.rise.akq;
import hackclient.rise.akr;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import rip.vantage.commons.util.time.a;

@gl(aliases={"module.other.spammer.name"}, description="module.other.spammer.description", category=gj.PLAYER)
public final class si
extends gi {
    private final akr Wc = new akr("Message", (gi)this, "Buy Rise at riseclient.com!");
    private final akq Wd = new akq("Delay", this, (Number)3000, (Number)0, (Number)20000, (Number)1);
    private final a We = new a();
    @dm
    public final dk<ei> Wf = ei2 -> {
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
            si.aER.bgK.sendChatMessage((String)this.Wc.wD());
            this.We.aX();
        }
    };
}

