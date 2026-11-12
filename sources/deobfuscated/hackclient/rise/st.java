/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ajw;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import rise.module.impl.player.clientspoofer.LabyModMode;

class st
extends ArrayList<ajw<String, String, Boolean>> {
    final /* synthetic */ LabyModMode ZV;

    st(LabyModMode labyModMode) {
        this.ZV = labyModMode;
        this.add(new ajw<String, String, Boolean>("MC|Brand", "labymod", true));
        this.add(new ajw<String, String, Boolean>("REGISTER", "labymod:neominecraft:intavelabymod3:main", false));
        this.add(new ajw<String, CallSite, Boolean>("labymod:neo", (CallSite)((Object)("{\"version\":\"" + (String)this.ZV.ZT.wD() + "\"}")), false));
        this.add(new ajw<String, CallSite, Boolean>("labymod3:main", (CallSite)((Object)("INFO{\"version\":\"" + (String)this.ZV.ZT.wD() + "\"}")), false));
        this.add(new ajw<String, String, Boolean>("minecraft:intave", "L{\"legacySneakHeight\":false,\"legacyOldRange\":false,\"legacyOldSlowdown\":false}", false));
        this.add(new ajw<String, String, Boolean>("minecraft:intave", "\nclientconfigL{\"legacySneakHeight\":false,\"legacyOldRange\":false,\"legacyOldSlowdown\":false}", false));
    }
}

