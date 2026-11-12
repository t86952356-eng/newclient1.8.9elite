/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.input.Keyboard
 */
package hackclient.rise;

import hackclient.rise.ady;
import hackclient.rise.aea;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akb;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.xi;
import java.awt.Color;
import lombok.Generated;
import net.minecraft.client.settings.d;
import org.lwjgl.input.Keyboard;

public class zr
implements aea {
    private xi amO;
    private final akb atZ;
    private final akb aua;
    private final String aub;
    private final d auc;
    private final afj aud = new afj(afk.aGW, 200L);

    public zr(akb akb2, String string, d d2) {
        this(new akb(22.0f, 22.0f), akb2, string, d2);
    }

    public zr(akb akb2, d d2) {
        this(akb2, Keyboard.getKeyName((int)d2.cO()), d2);
    }

    public void c(aka aka2) {
        aka2 = new aka(aka2.getX() + (double)this.aua.getX(), aka2.getY() + (double)this.aua.getY());
        if (this.amO == null) {
            this.amO = this.e(xi.class);
        }
        double d2 = this.amO != null ? this.amO.lU() : 4.0;
        double d3 = aka2.getX();
        double d4 = aka2.getY();
        double d5 = this.atZ.getX();
        double d6 = this.atZ.getY();
        this.rP();
        ait.c(d3, d4, d5, d6, d2, ais.d(ady.sa(), (int)this.aud.sV()));
        this.nR();
        aka aka3 = new aka(gb.ks.a(20, gd.kG).bQ(this.aub), gb.ks.a(20, gd.kG).tF());
        aka aka4 = new aka(aka2.getX() + (double)(this.atZ.getX() * 0.5f) - (double)((float)gb.ks.a(20, gd.kG).bQ(this.aub) * 0.5f), aka2.getY() + ((double)this.atZ.getY() - aka3.getY()) / 2.0 + 3.0);
        gb.ks.a(20, gd.kG).b(this.aub, aka4.getX(), aka4.getY(), this.rP().rQ().getRGB());
    }

    public void e(aka aka2) {
        if (this.amO == null) {
            this.amO = this.e(xi.class);
        }
        double d2 = this.amO != null ? this.amO.lU() : 4.0;
        ait.c(aka2.x + (double)this.aua.x + 0.5, aka2.y + (double)this.aua.y + 0.5, (double)(this.atZ.x - 1.0f), (double)(this.atZ.y - 1.0f), d2, this.rP().rU());
    }

    public void d(aka aka2) {
        if (this.amO == null) {
            this.amO = this.e(xi.class);
        }
        double d2 = this.amO != null ? this.amO.lU() : 4.0;
        ait.c(aka2.x + (double)this.aua.x, aka2.y + (double)this.aua.y, (double)this.atZ.x, (double)this.atZ.y, d2, Color.BLACK);
    }

    public void nR() {
        this.rP();
        int n2 = ady.sa().getAlpha();
        this.aud.Q(this.auc.Re() ? (double)Math.min((float)n2 * 1.4f, 150.0f) : (double)n2);
    }

    @Generated
    public zr(akb akb2, akb akb3, String string, d d2) {
        this.atZ = akb2;
        this.aua = akb3;
        this.aub = string;
        this.auc = d2;
    }
}

