/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat.mimic;

import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.aix;
import hackclient.rise.bv;
import net.minecraft.entity.r;
import net.minecraft.util.bt;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render2DEvent;
import rise.module.Mode;
import rise.module.impl.combat.Mimic;
import rise.util.math.Vector2f;

public class RotationsMode
extends Mode<Mimic> {
    Vector2f sg = new Vector2f(0.0f, 0.0f);
    Vector2f fu = new Vector2f(0.0f, 0.0f);
    afj sh = new afj(afk.aGW, 150L);
    afj si = new afj(afk.aGW, 150L);
    @EventLink
    public final Listener<PreUpdateEvent> sj = preUpdateEvent -> {
        r r2 = bv.e(6.0);
        if (r2 == null || !RotationsMode.aER.aIY.chw.Re()) {
            this.sh.T(RotationsMode.aER.bgK.pl);
            this.si.T(RotationsMode.aER.bgK.pm);
            this.fu = new Vector2f(0.0f, 0.0f);
            return;
        }
        float f2 = r2.pl;
        float f3 = r2.pm;
        f3 = -f3;
        this.sh.Q(f2 -= 180.0f);
        this.sg.x = (float)this.sh.sV();
        this.si.Q(f3);
        this.sg.y = (float)this.si.sV();
        Vector2f vector2f = aix.a(new Vector2f(f2, f3), aix.y(r2), 1000.0);
        Vector2f vector2f2 = aix.a(new Vector2f(f2, f3), aix.y(r2), (double)(Math.abs(vector2f.getX()) + Math.abs(vector2f.getY())) / (vector2f.getX() > 90.0f ? 1.05 : 1.5));
        this.fu = new Vector2f(bt.bN((f2 += vector2f2.x) - RotationsMode.aER.bgK.pl), (f3 += vector2f2.y) - RotationsMode.aER.bgK.pm);
        this.fu.x += (float)((Math.random() - 0.5) * (double)this.fu.getX() / 10.0);
        this.fu.y += (float)((Math.random() - 0.5) * (double)this.fu.getY() / 10.0);
    };
    private long sk;
    @EventLink
    public final Listener<Render2DEvent> sl = render2DEvent -> {
        double d2 = 50.0 / (double)(System.currentTimeMillis() - this.sk);
        this.sk = System.currentTimeMillis();
        double d3 = (double)RotationsMode.aER.aIY.cgq * (double)0.6f + (double)0.2f;
        double d4 = d3 * d3 * d3;
        double d5 = d4 * 8.0;
        double d6 = (int)((double)this.fu.getX() / d5);
        double d7 = (int)((double)this.fu.getY() / d5);
        d6 = d6 * (1.0 / d5) * 6.666666507720947;
        d7 = d7 * (1.0 / d5) * 6.666666507720947;
        RotationsMode.aER.bgK.p((float)(d6 /= d2), (float)((d7 /= d2) * (RotationsMode.aER.aIY.cgr ? 1.0 : -1.0)));
    };

    public RotationsMode(String string, Mimic mimic) {
        super(string, mimic);
    }
}

