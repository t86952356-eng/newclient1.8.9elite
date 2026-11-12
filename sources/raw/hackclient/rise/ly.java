/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ed;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.of;
import hackclient.rise.og;
import hackclient.rise.oh;
import hackclient.rise.oi;
import hackclient.rise.oj;
import hackclient.rise.ok;
import hackclient.rise.ol;

@gl(aliases={"module.movement.jesus.name"}, description="module.movement.jesus.description", category=gj.MOVEMENT)
public class ly
extends gi {
    public final akp DA = new akp("Mode", this).a(new akg[]{new oi("Vanilla", this)}).a(new akg[]{new of("Vulcan Gravity", this)}).a(new akg[]{new og("Karhu", this)}).a(new akg[]{new oh("NCP", this)}).a(new akg[]{new ol("Watchdog", this)}).a(new akg[]{new oj("Vulcan Dolphin", this)}).a(new akg[]{new ok("Watchdog Dolphin 1.18+", this)}).co("Vanilla");
    private final aki DB = new aki("Allow Jump", (gi)this, (Boolean)true);
    @dm
    public final dk<ed> DC = ed2 -> {
        if (!((Boolean)this.DB.wD()).booleanValue() && aik.vA()) {
            ed2.cF();
        }
    };
}

