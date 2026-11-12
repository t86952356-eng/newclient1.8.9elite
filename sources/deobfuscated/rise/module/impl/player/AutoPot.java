/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.ahj;
import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.akj;
import hackclient.rise.bb;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import java.util.List;
import net.minecraft.item.by;
import net.minecraft.item.co;
import net.minecraft.network.play.client.k;
import net.minecraft.potion.d;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.player.Scaffold;
import rise.util.math.Vector2f;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.player.autopot.name"}, description="module.player.autopot.description", category=Category.PLAYER)
public class AutoPot
extends Module {
    private final NumberValue abw = new NumberValue("Health", this, (Number)15, (Number)1, (Number)20, (Number)1);
    private final akj abx = new akj("Delay", this, (Number)500, (Number)1000, (Number)50, (Number)5000, (Number)50);
    private final akj aby = new akj("Rotation Speed", this, (Number)5, (Number)10, (Number)0, (Number)10, (Number)1);
    private final a abz = new a();
    private int BV;
    private long abA;
    @EventLink
    public final Listener<PreUpdateEvent> abB = preUpdateEvent -> {
        ++this.BV;
        if (AutoPot.aER.bgR != null) {
            this.BV = 0;
        }
        if (AutoPot.aER.bgK.crx <= 1 || !this.abz.T(this.abA) || this.BV < 10 || this.e(Scaffold.class).isEnabled()) {
            return;
        }
        for (int i2 = 0; i2 < 9; ++i2) {
            by by2;
            List<d> list;
            net.minecraft.item.d d2;
            co co2 = AutoPot.aER.bgK.cHV.fi(i2);
            if (co2 == null || !((d2 = co2.bP()) instanceof by) || (list = (by2 = (by)d2).aH(co2)).isEmpty()) continue;
            d d3 = list.get(0);
            if (!by.gb(co2.yc()) || !aik.aw(d3.aje()) || (d3.aje() == net.minecraft.potion.a.dgF.id || d3.aje() == net.minecraft.potion.a.dgB.id) && AutoPot.aER.bgK.getHealth() > ((Number)this.abw.wD()).floatValue() || AutoPot.aER.bgK.isPotionActive(d3.dhj) && AutoPot.aER.bgK.eJ((int)d3.dhj).duration != 0) continue;
            double d4 = ((Number)this.aby.wD()).doubleValue();
            double d5 = this.aby.wP().doubleValue();
            float f2 = (float)ahj.l(d4, d5);
            bs.a(new Vector2f((float)((double)AutoPot.aER.bgK.pl + (Math.random() - 0.5) * 3.0), (float)(87.0 + Math.random() * 3.0)), f2, cb.gH);
            this.d(bu.class);
            bu.setSlot(i2);
            if (!(bs.fk.y > 85.0f) || bb.a(false, true, false, true, false)) continue;
            AutoPot.aER.bgu.Ht();
            this.d(bu.class);
            ahn.m(new k(bu.bO()));
            this.abA = Math.round(ahj.l(((Number)this.abx.wD()).longValue(), this.abx.wP().longValue()));
            this.abz.aX();
            break;
        }
    };
    @EventLink
    public final Listener<AttackEvent> abC = attackEvent -> {
        this.BV = 0;
    };
}

