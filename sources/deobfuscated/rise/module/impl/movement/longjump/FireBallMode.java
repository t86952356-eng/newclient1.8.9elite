/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.longjump;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.ain;
import hackclient.rise.aks;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import net.minecraft.init.Items;
import net.minecraft.network.play.client.k;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.LongJump;
import rise.util.math.Vector2f;
import rise.value.ModeValue;
import rise.value.NumberValue;

public class FireBallMode
extends Mode<LongJump> {
    public ModeValue lI = new ModeValue("Mode", this).a(new Mode[]{new aks("Custom")}).a(new Mode[]{new aks("Hypixel")}).co("Hypixel");
    private final NumberValue Lh = new NumberValue("Height", this, (Number)1, (Number)0.42, (Number)9, (Number)0.1, () -> !((Mode)this.lI.wD()).getName().equals("Custom"));
    private final NumberValue Li = new NumberValue("Speed", this, (Number)1, (Number)0.1, (Number)3, (Number)0.1, () -> !((Mode)this.lI.wD()).getName().equals("Custom"));
    private int hQ;
    private double xv = 0.0;
    private float Lj;
    @EventLink
    public final Listener<PreUpdateEvent> Lk = preUpdateEvent -> {
        switch (((Mode)this.lI.wD()).getName()) {
            case "Hypixel": {
                if (FireBallMode.aER.bgK.cus == 10) {
                    this.Lj = FireBallMode.aER.bgK.pl;
                    FireBallMode.aER.bgK.ue = 1.5;
                    this.xv = 1.4;
                }
                if (FireBallMode.aER.bgK.cus == 9) {
                    this.xv = 2.0 - Math.random() / 100.0;
                }
                if (FireBallMode.aER.bgK.ae > 11) break;
                aii.a(this.xv, this.Lj);
                this.xv -= this.xv / 249.9 + Math.random() / 100.0;
                break;
            }
            case "Custom": {
                if (FireBallMode.aER.bgK.ae > 1) break;
                FireBallMode.aER.bgK.ue = ((Number)this.Lh.wD()).doubleValue();
                aii.strafe(((Number)this.Li.wD()).doubleValue());
            }
        }
        int n2 = ain.e(Items.cRP);
        if (FireBallMode.aER.bgK.crx == 1) {
            aii.stop();
        }
        if (n2 == -1) {
            return;
        }
        ++this.hQ;
        this.d(bu.class);
        bu.setSlot(n2);
        if (this.hQ == 2) {
            this.d(bu.class);
            ahn.m(new k(bu.bO()));
        }
        bs.a(new Vector2f(FireBallMode.aER.bgK.pl, 90.0f), 10.0, cb.gG);
    };

    public FireBallMode(String string, LongJump longJump) {
        super(string, longJump);
    }

    @Override
    public void onEnable() {
        this.hQ = 0;
        if (((Mode)this.lI.wD()).getName().equals("Hypixel")) {
            afl.b("Don't enable on bridges, the ac falses, also make sure you take the velocity when on the ground.", new Object[0]);
        }
    }
}

