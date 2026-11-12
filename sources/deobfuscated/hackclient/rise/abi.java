/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.input.Mouse
 */
package hackclient.rise;

import hackclient.rise.abh;
import hackclient.rise.abz;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agm;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Generated;
import org.lwjgl.input.Mouse;
import rise.Client;
import rise.module.Category;
import rise.ui.clickgui.ModernClickGui;
import rise.util.InstanceAccess;

public final class abi
implements InstanceAccess {
    private final List<abh> ayW;
    public double ayX = 100.0;
    private double ayE;
    private double ayY;
    private boolean ayZ;
    private long ayU = 0L;
    private afj animation = new afj(afk.aHn, 300L);
    private afj aza = new afj(afk.aGW, 300L);

    public abi() {
        this.ayW = Arrays.stream(Category.values()).map(abh::new).collect(Collectors.toList());
    }

    public void pV() {
        ModernClickGui modernClickGui = Client.a.v();
        Color color = abz.aAb.Y((int)this.ayE);
        this.animation.h(this.ayZ ? 700L : 2000L);
        this.animation.Q(this.ayZ ? 0.0 : -this.ayX / 1.5);
        ait.a(modernClickGui.ayt.x, modernClickGui.ayt.y, this.ayX + this.animation.sV(), modernClickGui.alQ.y, this.v().pB(), color, true, false, false, true);
        this.aza.h(1000L);
        this.aza.Q(modernClickGui.pp().qq() ? 255.0 : 0.0);
        ait.c((double)modernClickGui.ayt.x + this.ayX + this.animation.sV(), (double)modernClickGui.ayt.y, 30.0, (double)modernClickGui.alQ.y, ais.d(Color.BLACK, (int)Math.min(this.aza.sV(), this.ayE / 7.0)), new Color(0, 0, 0, 0));
    }

    public void d(float f2, float f3) {
        ModernClickGui modernClickGui = Client.a.v();
        long l2 = System.currentTimeMillis();
        if (this.ayU == 0L) {
            this.ayU = l2;
        }
        boolean bl2 = modernClickGui.ayv.qq();
        this.ayZ = (!Mouse.isButtonDown((int)0) || this.ayZ) && agm.c(modernClickGui.ayt.x - 200.0f, modernClickGui.ayt.y, this.ayZ ? 310.0 : 210.0, modernClickGui.alQ.y, f2, f3) || !bl2;
        this.ayE = this.ayZ ? Math.min(this.ayE + (double)((l2 - this.ayU) * 2L), 255.0) : Math.max(this.ayE - (double)((float)(l2 - this.ayU) * 1.5f), 0.0);
        this.ayY = agm.c(modernClickGui.ayt.x, modernClickGui.ayt.y, this.ayY > 0.0 ? 70.0 : 10.0, modernClickGui.alQ.y, f2, f3) && bl2 ? Math.min(this.ayY + (double)((l2 - this.ayU) * 2L), 255.0) : Math.max(this.ayY - (double)(l2 - this.ayU), 0.0);
        this.ayU = l2;
        double d2 = 10.0;
        for (abh abh2 : this.ayW) {
            abh2.a(d2 += 19.5, this.ayX + this.animation.sV(), (int)this.ayE, modernClickGui.ayv);
        }
        float f4 = (float)((double)(modernClickGui.ayt.getX() + 9.0f) + this.animation.sV());
        float f5 = modernClickGui.ayt.getY() + (24.75f - gb.ks.a(42, gd.kG).tF() / 2.0f);
        gb.ks.a(32, gd.kG).a(Client.b, f4 + 5.0f, f5 + 2.0f, ais.d(Color.WHITE, (int)this.ayE).hashCode());
        gb.ks.a(16, gd.kG).a("6.9.9", f4 + 5.0f + (float)gb.ks.a(32, gd.kG).bQ(Client.b), f5, ais.d(this.rP().rQ(), (int)Math.min(this.ayE, 200.0)).getRGB());
    }

    public void ci() {
        for (abh abh2 : this.ayW) {
            abh2.F(this.ayE);
        }
    }

    public void b(float f2, float f3, int n2) {
        if (this.ayE > 0.0) {
            for (abh abh2 : this.ayW) {
                abh2.a(f2, f3, n2);
            }
        }
    }

    public void pU() {
        if (this.ayE > 0.0) {
            for (abh abh2 : this.ayW) {
                abh2.pU();
            }
        }
    }

    @Generated
    public boolean pW() {
        return this.ayZ;
    }
}

