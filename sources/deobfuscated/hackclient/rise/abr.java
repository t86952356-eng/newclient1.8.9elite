/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abz;
import hackclient.rise.agm;
import hackclient.rise.ahg;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akl;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.bt;
import rise.ui.clickgui.value.ValueComponent;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;
import rise.value.Value;

public class abr
extends ValueComponent {
    private static final double azE = 5.0;
    private boolean azF = false;
    private boolean azG;
    private boolean azH;
    private final float azI = 10.0f;
    private final float azJ = 0.5f;
    private float azK = 0.0f;
    private double azL = 90.0;
    private double azM = 80.0;
    private Vector2f azN = new Vector2f(1.0f, 1.0f);
    private Color azO = Color.RED;

    public abr(Value<?> value) {
        super(value);
    }

    @Override
    public void a(Vector2d vector2d, int n2, int n3, float f2) {
        this.aqy = vector2d;
        this.azL = 105.0;
        this.azM = 120.0;
        akl akl2 = (akl)this.azn;
        String string = ahg.cf(this.azn.getName());
        float f3 = gb.ks.a(16, gd.kG).bQ(string) + 4;
        gb.ks.a(16, gd.kG).a(string, this.aqy.x, this.aqy.y, abz.aAd.qm());
        ait.c(this.aqy.x + (double)f3, this.aqy.y, 15.0, 7.0, 2.5, (Color)akl2.wD());
        double d2 = this.jy = this.azF ? 110.0 : 15.0;
        if (this.azF) {
            Color color;
            double d3 = this.aqy.x + 0.5 + 10.0 + (double)f3 + 8.0;
            double d4 = this.aqy.y + 0.5;
            ait.a(10, (double)((float)d3), (double)((float)d4), (double)((float)this.azL), (double)((float)this.azM - 15.0f), 40.0, this.v().ayG * 2);
            ait.c(d3 - 0.5, this.aqy.y, this.azL, this.azM - 15.0, this.v().ayG - 3, abz.aAb.ql());
            ait.c(d3, d4, this.azL - 1.0, this.azM - 1.0 - 15.0, this.v().ayG - 3, abz.aAa.ql());
            double d5 = this.azM * 0.55;
            ait.a(d3, d4, this.azL - 1.0, d5, 7.0, Color.WHITE, this.azO, false);
            ait.a(d3 - 0.5, d4, this.azL - 1.0 + 1.0, d5 + 0.5, 0.5, Color.BLACK, new Color(0, 0, 0, 0), true);
            double d6 = 8.5;
            double d7 = d3 + d6;
            double d8 = d4 + d6 + d5 - 5.0;
            double d9 = this.azL - d6 * 2.0;
            ait.rainbowRectangle(d7, d8 + 2.5, d9, this.v().ayG - 5);
            ait.a(30, (double)((float)(d3 + d6)), (double)((float)(d4 + d5 + d6 + d6 + (double)this.v().ayG - 11.0)), 15.0, 15.5, 40.0, (float)this.v().ayG / 2.0f);
            ait.c(d3 + d6, d4 + d5 + d6 + d6 + (double)this.v().ayG - 11.0, 15.0, 15.5, 3.5, (Color)akl2.wD());
            if (this.azG) {
                this.azN = new Vector2f((float)((double)n2 - d3), (float)((double)n3 - d4));
                this.azN.x = bt.I(this.azN.x, 0.0f, (float)this.azL);
                this.azN.y = bt.I(this.azN.y, 0.0f, (float)d5);
                color = ais.a(new Color(0, 0, 0, 0), ais.a(this.azO, Color.WHITE, (double)this.azN.x / this.azL), (double)this.azN.y / d5);
                akl2.n(color);
            } else if (this.azH) {
                this.azK = (float)((double)n2 - d7);
                this.azK = bt.I(this.azK, 0.0f, (float)d9);
                this.azO = Color.getHSBColor((float)((double)this.azK / d9), 1.0f, 1.0f);
                color = ais.a(new Color(0, 0, 0, 0), ais.a(this.azO, Color.WHITE, (double)this.azN.x / this.azL), (double)this.azN.y / d5);
                akl2.n(color);
            }
            ait.c(d7 + (double)this.azK - (double)((float)this.v().ayG / 2.0f) + 0.5, d8 + 0.5, (double)(this.v().ayG - 1), (double)(this.v().ayG - 1), (float)this.v().ayG / 3.0f + 1.0f, this.azO);
            ait.a(d7 + (double)this.azK - (double)((float)this.v().ayG / 2.0f) + 0.5, d8 + 0.5, (double)(this.v().ayG - 1), (double)(this.v().ayG - 1), (double)((float)this.v().ayG / 5.0f + 1.0f), 1.0, Color.BLACK);
            if (this.azN.x != -1.0f && this.azN.y != -1.0f) {
                ait.c(d3 - 1.0 + (double)this.azN.x - 2.5, d4 - 1.0 + (double)this.azN.y - 2.5, 7.0, 7.0, 3.5, Color.WHITE);
                ait.c(d3 - 0.5 + (double)this.azN.x - 2.5, d4 - 0.5 + (double)this.azN.y - 2.5, 6.0, 6.0, 3.0, Color.BLACK);
                ait.c(d3 + (double)this.azN.x - 2.5, d4 + (double)this.azN.y - 2.5, 5.0, 5.0, 2.5, (Color)akl2.wD());
            }
            color = (Color)akl2.wD();
            double d10 = d3 + d6 * 2.0 + 15.0;
            double d11 = d4 + d5 + d6 + d6 + (double)this.v().ayG - 11.0;
            gb.ks.a(17, gd.kG).c("" + color.getRed(), d10 + d6, d11, abz.aAd.qm());
            gb.ks.a(17, gd.kG).c("" + color.getGreen(), d10 + 30.0, d11, abz.aAd.qm());
            gb.ks.a(17, gd.kG).c("" + color.getBlue(), d10 + d6 * 6.0, d11, abz.aAd.qm());
            gb.ks.a(13, gd.kG).a(String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue()), d10, d11 += 13.0, new Color(55, 59, 61).hashCode());
        }
    }

    @Override
    public boolean e(int n2, int n3, int n4) {
        if (this.aqy == null) {
            return false;
        }
        float f2 = gb.ks.a(16, gd.kG).bQ(ahg.cf(this.azn.getName())) + 4;
        this.azG = this.azF && agm.c(this.aqy.x + 10.0 + (double)f2, this.aqy.y, this.azL, this.azM * 0.55, n2, n3);
        this.azH = this.azF && agm.c(this.aqy.x + 10.0 + (double)f2, this.aqy.y + this.azM * 0.55, this.azL, 20.0, n2, n3);
        double d2 = this.aqy.x + 14.5 + (double)f2;
        double d3 = d2 + 32.0;
        double d4 = this.aqy.y + 0.5;
        double d5 = d4 + this.azM - 40.0 + (double)this.v().ayG;
        if (agm.c(d3, d5, 60.0, 10.0, n2, n3)) {
            Color color = (Color)this.azn.wD();
            GuiScreen.setClipboardString(color.getRed() + ", " + color.getBlue() + ", " + color.getGreen());
        } else if (agm.c(d3, d5 + 13.0, 60.0, 10.0, n2, n3)) {
            Color color = (Color)this.azn.wD();
            GuiScreen.setClipboardString(String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue()));
        }
        this.azF = (this.v().ayI == null || this.azF) && (this.azG || agm.c(this.aqy.x + 10.0 + (double)f2, this.aqy.y + this.azM * 0.55, this.azL, 52.0, n2, n3) || !this.azF && agm.c(this.aqy.x, this.aqy.y - 3.5, this.v().width - 70, this.jy, n2, n3));
        return false;
    }

    @Override
    public void pP() {
        this.azH = false;
        this.azG = false;
    }

    @Override
    public void ci() {
    }

    @Override
    public void b(char c2, int n2) {
        if (this.aqy == null) {
            // empty if block
        }
    }
}

