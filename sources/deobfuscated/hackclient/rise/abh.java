/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aca;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agm;
import hackclient.rise.ahg;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;
import rise.Client;
import rise.module.Category;
import rise.ui.clickgui.ModernClickGui;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;

public final class abh
implements InstanceAccess {
    private final afj ayS = new afj(afk.aGW, 500L);
    public final Category ayT;
    private long ayU = 0L;
    private double ayV;
    private float x;
    private float y;
    private boolean ji;

    public abh(Category category) {
        this.ayT = category;
    }

    public void a(double d2, double d3, double d4, aca aca2) {
        ModernClickGui modernClickGui = Client.a.v();
        if (System.currentTimeMillis() - this.ayU > 300L) {
            this.ayU = System.currentTimeMillis();
        }
        long l2 = System.currentTimeMillis();
        this.x = (float)((double)modernClickGui.ayt.x - (69.0 - d3) - 21.0);
        this.y = (float)((double)modernClickGui.ayt.y + d2) + 16.0f;
        this.ayS.h(200L);
        this.ayS.Q(aca2.equals(this.ayT.ec()) ? 255.0 : 0.0);
        double d5 = 4.0;
        double d6 = (double)gb.ks.a(16, gd.kG).bQ(ahg.cf(this.ayT.getName())) + 8.0 + (double)this.ayT.eb().bQ(this.ayT.ea());
        double d7 = 0.5;
        GlStateManager.JV();
        ait.c((double)this.x, (double)this.y - 5.5, d6 + 8.0, 15.0, 5.0, ais.d(this.rP().j(new Vector2d(0.0, (double)this.y / 5.0)), (int)Math.min(this.ayS.sV(), d4)).darker());
        int n2 = new Color(255, 255, 255, Math.min(aca2.equals(this.ayT.ec()) ? 255 : 200, (int)d4)).hashCode();
        this.ayT.eb().a(this.ayT.ea(), (float)((double)this.x + this.ayS.sV() / 80.0 + 3.0), this.y, n2);
        gb.ks.a(16, gd.kG).a(ahg.cf(this.ayT.getName()), (float)((double)this.x + this.ayS.sV() / 80.0 + 3.0 + 4.0) + (float)gb.ku.o(17).bQ(this.ayT.ea()), this.y, n2);
        GlStateManager.JW();
        this.ayU = l2;
    }

    public void a(float f2, float f3, int n2) {
        boolean bl2;
        boolean bl3 = bl2 = n2 == 0;
        if (agm.c(this.x - 11.0f, this.y - 5.0f, 70.0, 22.0, f2, f3) && bl2) {
            this.v().a(this.ayT);
            this.ji = true;
        }
    }

    public void F(double d2) {
        double d3 = 4.0;
        double d4 = (double)gb.ks.a(16, gd.kG).bQ(ahg.cf(this.ayT.getName())) + 8.0 + (double)this.ayT.eb().bQ(this.ayT.ea());
        ait.c((double)this.x, (double)(this.y - 5.0f), d4 + 8.0, 14.0, 5.0, ais.d(this.rP().j(new Vector2d(0.0, (double)this.y / 5.0)), (int)Math.min(this.ayS.sV(), d2)).darker());
    }

    public void pU() {
        this.ji = false;
    }
}

