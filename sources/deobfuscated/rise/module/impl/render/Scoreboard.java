/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 */
package rise.module.impl.render;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import hackclient.rise.agg;
import hackclient.rise.ahm;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akc;
import hackclient.rise.akn;
import hackclient.rise.gg;
import java.awt.Color;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.scoreboard.d;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.h;
import net.minecraft.util.an;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.event.impl.TickEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.render.Interface;
import rise.util.math.Vector2d;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.render.scoreboard.name"}, description="module.render.scoreboard.description", category=Category.RENDER, autoEnabled=true)
public final class Scoreboard
extends Module {
    private final akn aqe = new akn("Position", (Module)this, new Vector2d(200.0, 200.0));
    private final BooleanValue aqf = new BooleanValue("Outline", (Module)this, (Boolean)false, () -> true);
    /* ANDROID/VANILLA PORT NOTE (blur removal): "Blur color" (aqg) setting
     * removed together with the blur engine. */
    private final BooleanValue aqh = new BooleanValue("Replace IP with Rise Website", (Module)this, (Boolean)true);
    private Collection<d> aqi;
    private g aqj;
    private int aqk;
    private Interface amO;
    private final int aql = 3;
    private final int aqm = agg.aIF;
    @EventLink
    public final Listener<Render2DEvent> aqn = render2DEvent -> {
        if (this.aqj == null) {
            return;
        }
        if (this.amO == null) {
            this.amO = this.e(Interface.class);
        }
        akc akc2 = new akc((int)this.aqe.aqy.x, (int)this.aqe.aqy.y);
        boolean bl2 = ((Mode)this.amO.md().wD()).getName().equals("Rise");
        int n2 = this.amO != null ? (int)this.amO.lU() : (bl2 ? 5 : 1);
        this.b(gg.kV).c(() -> {
            int n3 = this.aqi.size();
            int n4 = this.aqm * n3 + 3;
            if (((Boolean)this.aqf.wD()).booleanValue()) {
                ait.a((double)(akc2.alM - 1), (double)(akc2.alN - 1), (double)(this.aqk + 12 + 2), (double)(n4 + this.aqm + 3 + 2), (double)n2, 1.0, ais.d(this.rP().rQ(), 100), ais.d(this.rP().rR(), 100));
            }
        });
        this.b(gg.kU).c(() -> this.a(akc2.alM, akc2.alN, Color.WHITE, false, n2, false));
        this.b(gg.kT).c(() -> this.a(akc2.alM, akc2.alN, bl2 ? this.rP().rU() : Color.BLACK, false, n2 + 1, true));
        this.b(gg.kV, 1).c(() -> this.a(akc2.alM, akc2.alN, new Color(0, 0, 0, 100), true, n2, false));
    };
    @EventLink
    public final Listener<TickEvent> aqo = tickEvent -> {
        this.aqj = this.mv();
        if (this.aqj == null) {
            return;
        }
        Collection<d> collection = this.aqj.SD().b(this.aqj);
        List list = collection.stream().filter(d2 -> d2.getPlayerName() != null && !d2.getPlayerName().startsWith("#")).collect(Collectors.toList());
        this.aqi = list.size() > 15 ? Lists.newArrayList((Iterable)Iterables.skip(list, (int)(list.size() - 15))) : list;
        this.aqk = Scoreboard.aER.fontRendererObj.bQ(this.aqj.getDisplayName());
        for (d d3 : collection) {
            h h2 = this.aqj.SD().fs(d3.getPlayerName());
            String string = h.a(h2, d3.getPlayerName());
            String string2 = this.X(string);
            this.aqk = Math.max(this.aqk, Scoreboard.aER.fontRendererObj.bQ(string2));
        }
        this.aqk += 2;
    };

    private boolean W(String string) {
        if (!((Boolean)this.aqh.wD()).booleanValue()) {
            return false;
        }
        String string2 = an.ge(string);
        if (string2 == null) {
            return false;
        }
        String string3 = string2.toLowerCase();
        return string3.contains("www.hypixel");
    }

    private String X(String string) {
        if (this.W(string)) {
            return this.mw();
        }
        return string;
    }

    private g mv() {
        return ahm.vL();
    }

    private void a(int n2, int n3, Color color, boolean bl2, int n4, boolean bl3) {
        agg agg2 = Scoreboard.aER.fontRendererObj;
        int n5 = this.aqi.size();
        int n6 = this.aqm * n5 + 3;
        Vector2d vector2d = new Vector2d(this.aqk + 12, n6 + this.aqm + 3);
        this.aqe.n(vector2d);
        if (bl3) {
            ait.c((double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), (double)(this.aqk + 12 - 1), (double)(n6 + this.aqm + 3 - 1), n4, color);
        } else {
            ait.c((double)n2, (double)n3, (double)(this.aqk + 12), (double)(n6 + this.aqm + 3), n4, color);
        }
        if (!bl2) {
            return;
        }
        int n7 = 0x20FFFFFF;
        n3 = (int)((double)n3 + 4.5);
        String string = this.aqj.getDisplayName();
        agg2.b(string, (float)(n2 += 6) + (float)this.aqk / 2.0f - (float)agg2.bQ(string) / 2.0f, n3, n7);
        for (d d2 : this.aqi) {
            n3 += this.aqm;
            h h2 = this.aqj.SD().fs(d2.getPlayerName());
            String string2 = h.a(h2, d2.getPlayerName());
            String string3 = this.X(string2);
            if (((Boolean)this.aqh.wD()).booleanValue() && string3.equals(this.mw())) {
                this.a(agg2, string3, n2, n3);
                continue;
            }
            agg2.b(string3, n2, n3, n7);
        }
    }

    private String mw() {
        return String.valueOf((Object)this.rP().rX()) + "riseclient.com";
    }

    private void a(agg agg2, String string, int n2, int n3) {
        String string2 = an.ge(string);
        Color color = this.rP().rQ();
        Color color2 = this.rP().rR();
        long l2 = System.currentTimeMillis();
        double d2 = 0.005;
        int n4 = n2;
        int n5 = string2.length();
        for (int i2 = 0; i2 < n5; ++i2) {
            char c2 = string2.charAt(i2);
            double d3 = (double)i2 / (double)n5 * Math.PI * 2.0;
            float f2 = (float)((Math.sin((double)l2 * d2 + d3) + 1.0) * 0.5);
            int n6 = (int)((float)color.getRed() + (float)(color2.getRed() - color.getRed()) * f2);
            int n7 = (int)((float)color.getGreen() + (float)(color2.getGreen() - color.getGreen()) * f2);
            int n8 = (int)((float)color.getBlue() + (float)(color2.getBlue() - color.getBlue()) * f2);
            int n9 = (int)((float)color.getAlpha() + (float)(color2.getAlpha() - color.getAlpha()) * f2);
            agg2.b(String.valueOf(c2), n4, n3, new Color(n6, n7, n8, n9).getRGB());
            n4 += agg2.bQ(String.valueOf(c2));
        }
    }
}

