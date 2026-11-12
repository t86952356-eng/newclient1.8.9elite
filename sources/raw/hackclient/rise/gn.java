/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aki;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.hi;
import hackclient.rise.hj;
import hackclient.rise.hl;
import hackclient.rise.hm;
import hackclient.rise.hn;
import hackclient.rise.ho;
import hackclient.rise.hp;
import hackclient.rise.hr;
import hackclient.rise.hs;
import hackclient.rise.ht;
import hackclient.rise.hu;

@gl(aliases={"module.combat.antibot.name"}, description="module.combat.antibot.description", category=gj.COMBAT)
public final class gn
extends gi {
    private final aki lu = new aki("Funcraft Check", (gi)this, (Boolean)false, new hn("", this));
    private final aki lv = new aki("Tab Check", (gi)this, (Boolean)false, new ho("", this));
    private final aki lw = new aki("NPC Detection Check", (gi)this, (Boolean)false, new hr("", this));
    private final aki lx = new aki("Duplicate Name Check", (gi)this, (Boolean)false, new hm("", this));
    private final aki ly = new aki("No Ping Check", (gi)this, (Boolean)false, new ht("", this));
    private final aki lz = new aki("Cubecraft Bedrock Check", (gi)this, (Boolean)false, new hs("", this));
    private final aki lA = new aki("Duplicate Unique ID Check", (gi)this, (Boolean)false, new hl("", this));
    private final aki lB = new aki("Colour Check", (gi)this, (Boolean)false, new hl("", this));
    private final aki lC = new aki("Time Visible Check", (gi)this, (Boolean)false, new hu("", this));
    private final aki lD = new aki("Middle Click Bot", (gi)this, (Boolean)false, new hp("", this));
    private final aki lE = new aki("Advanced", (gi)this, (Boolean)false, new hj("", this));
    private final aki lF = new aki("Advanced 2", (gi)this, (Boolean)false, new hi("", this));

    @Override
    public void onDisable() {
        a.a.x().clear();
    }
}

