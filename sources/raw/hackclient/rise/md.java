/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.po;
import hackclient.rise.pp;
import hackclient.rise.pq;
import hackclient.rise.pr;
import hackclient.rise.ps;
import hackclient.rise.pt;
import hackclient.rise.pu;
import hackclient.rise.pw;

@gl(aliases={"module.movement.phase.name"}, description="module.movement.phase.description", category=gj.MOVEMENT)
public class md
extends gi {
    private final akp DS = new akp("Mode", this).a(new akg[]{new pq("Normal", this)}).a(new akg[]{new pu("Watchdog Semi Block", this)}).a(new akg[]{new pw("Watchdog Prediction Full Block", this)}).a(new akg[]{new pt("Watchdog 1.17.1 Full Block", this)}).a(new akg[]{new ps("Watchdog Blink", this)}).a(new akg[]{new po("BlocksMC", this)}).a(new akg[]{new pr("Vulcan", this)}).a(new akg[]{new pp("Grim", this)}).co("Normal");
}

