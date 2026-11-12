/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement;

import hackclient.rise.afl;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import net.minecraft.entity.c;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.world.l;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.Render2DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.movement.Flight;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.movement.clipper.name"}, description="module.movement.clipper.description", category=Category.MOVEMENT)
public class Clipper
extends Module {
    private final NumberValue Dh = new NumberValue("Clip Height", this, (Number)5, (Number)1, (Number)50, (Number)1);
    private final Set<ao> Di = new HashSet<ao>();
    private int Dj = 0;
    @EventLink
    public final Listener<Render2DEvent> Dk = render2DEvent -> {
        String string;
        String string2;
        boolean bl2 = this.Di.contains(ao.dwr);
        boolean bl3 = this.Di.contains(ao.dwq);
        if (!bl2 && !bl3) {
            return;
        }
        float f2 = (float)Clipper.aER.jY.getScaledWidth() / 2.0f;
        float f3 = (float)Clipper.aER.jY.getScaledHeight() / 2.0f;
        int n2 = this.rP().rQ().getRGB();
        if (bl2 && bl3) {
            string2 = "^ v";
            string = "SPACE & SHIFT";
        } else if (bl2) {
            string2 = "^";
            string = "SPACE";
        } else {
            string2 = "v";
            string = "SHIFT";
        }
        int n3 = new Color(0, 0, 0, 200).getRGB();
        if (Clipper.aER.bgK.crx > 2) {
            gb.ks.a(17, gd.kE).c(string2, f2 + 1.0f, f3 - 10.0f + 1.0f, n3);
            gb.ks.a(17, gd.kE).c(string, f2 + 1.0f, f3 + 10.0f + 1.0f, n3);
            gb.ks.a(17, gd.kE).c(string2, f2, f3 - 10.0f, n2);
            gb.ks.a(17, gd.kE).c(string, f2, f3 + 10.0f, n2);
        }
    };
    @EventLink
    public final Listener<JumpEvent> Dl = jumpEvent -> {
        boolean bl2 = this.Di.contains(ao.dwr);
        if (bl2 && Clipper.aER.bgK.tR > 2 && Clipper.aER.aIY.chq.Rg()) {
            jumpEvent.cF();
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> Dm = preMotionEvent -> {
        void var3_7;
        if (this.Dj > 0) {
            --this.Dj;
            return;
        }
        this.Di.clear();
        if (this.e(Flight.class).isEnabled()) {
            return;
        }
        int n2 = ((Number)this.Dh.wD()).intValue();
        for (ao ao2 : new ao[]{ao.dwr, ao.dwq}) {
            this.a(ao2, n2, b2 -> this.Di.add(ao2));
        }
        if (Clipper.aER.aIY.chr.Rg() && Clipper.aER.bgK.crx > 2) {
            ao ao3 = ao.dwq;
        } else if (Clipper.aER.aIY.chq.Rg() && Clipper.aER.bgK.crx > 2) {
            ao ao4 = ao.dwr;
        } else {
            Object var3_6 = null;
            return;
        }
        if (!this.Di.contains(var3_7)) {
            return;
        }
        this.a((ao)var3_7, n2, arg_0 -> this.a((ao)var3_7, arg_0));
    };

    private void a(ao ao2, int n2, Consumer<b> consumer) {
        if (n2 <= 0) {
            return;
        }
        boolean bl2 = false;
        b b2 = Clipper.aER.bgK.yl();
        for (int i2 = 0; i2 < n2; ++i2) {
            b2 = b2.x(ao2);
            if (ao2 == ao.dwq && this.a(b2, 50)) {
                return;
            }
            if (bl2 && this.f(b2)) {
                consumer.accept(b2);
                return;
            }
            if (this.g(b2)) continue;
            bl2 = true;
        }
    }

    private boolean a(b b2, int n2) {
        b b3;
        int n3 = 0;
        for (int i2 = 1; i2 <= n2 && Clipper.aER.bgF.aG(b3 = b2.hr(i2)); ++i2) {
            ++n3;
        }
        return n3 >= n2;
    }

    private boolean f(b b2) {
        double d2 = Clipper.aER.bgK.gW;
        double d3 = Clipper.aER.bgK.gY;
        double d4 = b2.wu();
        a a2 = Clipper.aER.bgK.Us().ae(d2 - Clipper.aER.bgK.gW, d4 - Clipper.aER.bgK.gX, d3 - Clipper.aER.bgK.gY);
        return Clipper.aER.bgF.a((c)Clipper.aER.bgK, a2).isEmpty();
    }

    private boolean g(b b2) {
        return Clipper.aER.bgF.L(b2).df().a((l)Clipper.aER.bgF, b2);
    }

    private /* synthetic */ void a(ao ao2, b b2) {
        Clipper.aER.bgK.Q(Clipper.aER.bgK.gW, b2.wu(), Clipper.aER.bgK.gY);
        afl.b("Clipped " + (ao2 == ao.dwr ? "up" : "down"), new Object[0]);
        this.Dj = 5;
    }
}

