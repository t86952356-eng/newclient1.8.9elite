/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.nz;
import hackclient.rise.oa;
import hackclient.rise.ob;
import hackclient.rise.oc;
import hackclient.rise.od;
import hackclient.rise.oe;

@gl(aliases={"module.movement.inventorymove.name"}, description="module.movement.inventorymove.description", category=gj.MOVEMENT)
public class lx
extends gi {
    private final ob Dy = new ob("Grim", this);
    private final akp Dz = new akp("Bypass Mode", this).a(new akg[]{new od("Normal", this)}).a(new akg[]{new nz("Buffer Abuse", this)}).a(new akg[]{new oa("Cancel", this)}).a(new akg[]{this.Dy}).a(new akg[]{new oc("Grim 2", this)}).a(new akg[]{new oe("Watchdog", this)}).co("Normal");

    public boolean hj() {
        return this.Dz.wD() != null && ((akg)this.Dz.wD()).getName().equalsIgnoreCase("Grim");
    }

    public int hk() {
        return this.Dy.hA();
    }
}

