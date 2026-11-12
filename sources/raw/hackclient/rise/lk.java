/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.lp;
import hackclient.rise.lq;

@gl(aliases={"module.ghost.wtap.name", "Extra Knock Back", "Super Knock Back", "Knock Back", "Sprint Reset"}, description="module.ghost.wtap.description", category=gj.GHOST)
public class lk
extends gi {
    private final akp Cd = new akp("Mode", this).a(new akg[]{new lp("Legit", this)}).a(new akg[]{new lq("Silent", this)}).co("Legit");
    public final akq Ce = new akq("WTap Chance", this, (Number)100, (Number)0, (Number)100, (Number)1);
}

