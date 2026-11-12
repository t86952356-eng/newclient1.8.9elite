/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nl.hidden.Hidden0
 */
package rise.module.impl.movement.wallclimb;

import nl.Loader;
import nl.hidden.Hidden0;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.module.Mode;
import rise.module.impl.movement.WallClimb;

public class GrimMode
extends Mode<WallClimb> {
    @EventLink
    public final Listener<PreMotionEvent> Tq = GrimMode::a;

    public GrimMode(String string, WallClimb wallClimb) {
        super(string, wallClimb);
    }

    private static native /* synthetic */ void a(PreMotionEvent var0);

    static {
        Hidden0.special_clinit_6_20(GrimMode.class);
    }
}

