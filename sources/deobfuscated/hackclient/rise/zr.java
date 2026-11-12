/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.input.Keyboard
 */
package hackclient.rise;

import hackclient.rise.ady;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import lombok.Generated;
import net.minecraft.client.settings.d;
import org.lwjgl.input.Keyboard;
import rise.module.impl.render.Interface;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;

public class zr
implements InstanceAccess {
    private Interface amO;
    private final Vector2f atZ;
    private final Vector2f aua;
    private final String aub;
    private final d auc;
    private final afj aud = new afj(afk.aGW, 200L);

    public zr(Vector2f vector2f, String string, d d2) {
        this(new Vector2f(22.0f, 22.0f), vector2f, string, d2);
    }

    public zr(Vector2f vector2f, d d2) {
        this(vector2f, Keyboard.getKeyName((int)d2.cO()), d2);
    }

    public void c(Vector2d vector2d) {
        vector2d = new Vector2d(vector2d.getX() + (double)this.aua.getX(), vector2d.getY() + (double)this.aua.getY());
        if (this.amO == null) {
            this.amO = this.e(Interface.class);
        }
        double d2 = this.amO != null ? this.amO.lU() : 4.0;
        double d3 = vector2d.getX();
        double d4 = vector2d.getY();
        double d5 = this.atZ.getX();
        double d6 = this.atZ.getY();
        this.rP();
        ait.c(d3, d4, d5, d6, d2, ais.d(ady.sa(), (int)this.aud.sV()));
        this.nR();
        Vector2d vector2d2 = new Vector2d(gb.ks.a(20, gd.kG).bQ(this.aub), gb.ks.a(20, gd.kG).tF());
        Vector2d vector2d3 = new Vector2d(vector2d.getX() + (double)(this.atZ.getX() * 0.5f) - (double)((float)gb.ks.a(20, gd.kG).bQ(this.aub) * 0.5f), vector2d.getY() + ((double)this.atZ.getY() - vector2d2.getY()) / 2.0 + 3.0);
        gb.ks.a(20, gd.kG).b(this.aub, vector2d3.getX(), vector2d3.getY(), this.rP().rQ().getRGB());
    }

    public void e(Vector2d vector2d) {
        if (this.amO == null) {
            this.amO = this.e(Interface.class);
        }
        double d2 = this.amO != null ? this.amO.lU() : 4.0;
        ait.c(vector2d.x + (double)this.aua.x + 0.5, vector2d.y + (double)this.aua.y + 0.5, (double)(this.atZ.x - 1.0f), (double)(this.atZ.y - 1.0f), d2, this.rP().rU());
    }

    public void d(Vector2d vector2d) {
        if (this.amO == null) {
            this.amO = this.e(Interface.class);
        }
        double d2 = this.amO != null ? this.amO.lU() : 4.0;
        ait.c(vector2d.x + (double)this.aua.x, vector2d.y + (double)this.aua.y, (double)this.atZ.x, (double)this.atZ.y, d2, Color.BLACK);
    }

    public void nR() {
        this.rP();
        int n2 = ady.sa().getAlpha();
        this.aud.Q(this.auc.Re() ? (double)Math.min((float)n2 * 1.4f, 150.0f) : (double)n2);
    }

    @Generated
    public zr(Vector2f vector2f, Vector2f vector2f2, String string, d d2) {
        this.atZ = vector2f;
        this.aua = vector2f2;
        this.aub = string;
        this.auc = d2;
    }
}

