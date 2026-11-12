/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player.antivoid;

import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akd;
import hackclient.rise.bd;
import hackclient.rise.bm;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PostMotionEvent;
import rise.module.Mode;
import rise.module.impl.player.AntiVoid;
import rise.util.math.Vector2f;

public class BlinkMode
extends Mode<AntiVoid> {
    private akd Ft;
    private akd EC;
    private Vector2f ka;
    @EventLink
    public final Listener<PostMotionEvent> aim = postMotionEvent -> {
        if (BlinkMode.aER.bgK.aRg <= 60) {
            return;
        }
        if (this.Ft != null && this.EC != null && this.ka != null && !aik.a(50.0, true)) {
            if (bd.cY > 4.0f) {
                BlinkMode.aER.bgK.setPosition(this.Ft.x, this.Ft.y, this.Ft.z);
                BlinkMode.aER.bgK.ud = 0.0;
                BlinkMode.aER.bgK.ue = aii.predictedMotion(this.EC.y);
                BlinkMode.aER.bgK.uf = 0.0;
                BlinkMode.aER.bgK.pl = this.ka.x;
                BlinkMode.aER.bgK.pm = this.ka.y;
                bd.cY = 0.0f;
                bm.disable();
                bm.dispatch();
            }
        } else {
            this.Ft = new akd(BlinkMode.aER.bgK.gW, BlinkMode.aER.bgK.gX, BlinkMode.aER.bgK.gY);
            this.EC = new akd(BlinkMode.aER.bgK.ud, BlinkMode.aER.bgK.ue, BlinkMode.aER.bgK.uf);
            this.ka = new Vector2f(BlinkMode.aER.bgK.pl, BlinkMode.aER.bgK.pm);
        }
    };

    public BlinkMode(String string, AntiVoid antiVoid) {
        super(string, antiVoid);
    }
}

