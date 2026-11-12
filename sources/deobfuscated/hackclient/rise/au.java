/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abp;
import hackclient.rise.abq;
import hackclient.rise.abr;
import hackclient.rise.abu;
import hackclient.rise.abv;
import hackclient.rise.abw;
import hackclient.rise.abx;
import hackclient.rise.aby;
import hackclient.rise.ady;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akj;
import hackclient.rise.akl;
import hackclient.rise.akn;
import hackclient.rise.ako;
import hackclient.rise.akr;
import hackclient.rise.gg;
import java.awt.Color;
import java.util.ArrayList;
import net.minecraft.client.renderer.GlStateManager;
import rise.module.Module;
import rise.ui.clickgui.value.ValueComponent;
import rise.util.InstanceAccess;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;
import rise.value.Value;

public class au
implements InstanceAccess {
    public Module cg;
    public akn ch;
    public afj animation = new afj(afk.aHt, 300L);
    public boolean ci;
    public ArrayList<ValueComponent> cj = new ArrayList();

    public au(Module module, akn akn2) {
        this.cg = module;
        this.ch = akn2;
        for (Value<?> value : module.getAllValues()) {
            if (value instanceof ModeValue) {
                this.cj.add(new abv(value));
                continue;
            }
            if (value instanceof BooleanValue) {
                this.cj.add(new abp(value));
                continue;
            }
            if (value instanceof akr) {
                this.cj.add(new aby(value));
                continue;
            }
            if (value instanceof NumberValue) {
                this.cj.add(new abw(value));
                continue;
            }
            if (value instanceof akj) {
                this.cj.add(new abq(value));
                continue;
            }
            if (value instanceof akn) {
                this.cj.add(new abx(value));
                continue;
            }
            if (value instanceof ako) {
                this.cj.add(new abu(value));
                continue;
            }
            if (!(value instanceof akl)) continue;
            this.cj.add(new abr(value));
        }
    }

    public void render(int n2, int n3, float f2) {
        double d2 = 100.0;
        double d3 = 100.0;
        this.animation.h(300L);
        this.animation.a(this.ci ? afk.aHm : afk.aHn);
        this.animation.Q(this.ci ? 0.0 : 1.0);
        double d4 = this.animation.sV();
        if (d4 <= 1.0E-4) {
            return;
        }
        this.b(gg.kV).c(() -> {
            GlStateManager.JV();
            GlStateManager.C(this.ch.aqy.x * (1.0 - d4), (this.ch.aqy.y + this.ch.aHP.y / 2.0) * (1.0 - d4), 0.0);
            GlStateManager.B(d4, d4, 1.0);
            double d5 = this.ch.aqy.x - d2 - 10.0;
            double d6 = this.ch.aqy.y + this.ch.aHP.y / 2.0 - d3 / 2.0;
            double d7 = this.rP().pB();
            this.rP();
            Color color = ady.sa();
            double d8 = this.animation.sV();
            this.rP();
            ait.c(d5, d6, d2, d3, d7, ais.d(color, (int)(d8 * (double)ady.sa().getAlpha())));
            for (ValueComponent valueComponent : this.cj) {
                if (valueComponent.qi() != null && valueComponent.qi().wB() != null && !valueComponent.qi().wB().getAsBoolean()) continue;
            }
            GlStateManager.JW();
        });
        this.b(gg.kU).c(() -> {
            GlStateManager.JV();
            GlStateManager.C(this.ch.aqy.x * (1.0 - d4), (this.ch.aqy.y + this.ch.aHP.y / 2.0) * (1.0 - d4), 0.0);
            GlStateManager.B(d4, d4, 1.0);
            ait.c(this.ch.aqy.x - d2 - 10.0, this.ch.aqy.y + this.ch.aHP.y / 2.0 - d3 / 2.0, d2, d3, this.rP().pB(), Color.BLACK);
            GlStateManager.JW();
        });
    }

    public void close() {
        this.ci = true;
    }
}

