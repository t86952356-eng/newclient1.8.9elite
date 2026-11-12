/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.alan.clients.ui.menu.impl.account.display;

import com.alan.clients.ui.menu.impl.account.impl.RenameAccountScreen;
import hackclient.rise.adi;
import hackclient.rise.ado;
import hackclient.rise.ady;
import hackclient.rise.aea;
import hackclient.rise.aee;
import hackclient.rise.aek;
import hackclient.rise.ael;
import hackclient.rise.aeo;
import hackclient.rise.aes;
import hackclient.rise.aet;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aiv;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import java.text.DateFormat;
import java.util.Date;
import lombok.Generated;

public class AccountViewModel<T extends aeo>
implements adi,
aea {
    private static final agf FONT_RENDERER = gb.ks.a(24, gd.kH);
    private static final agf INFO_FONT_RENDERER = gb.ks.a(18, gd.kF);
    private static final DateFormat DATE_FORMAT = DateFormat.getDateInstance(3);
    private static final Color BLOOM_COLOR = ais.d(Color.BLACK, 150);
    private static final Color FONT_COLOR = ais.d(Color.WHITE, 150);
    private static final Color INFO_COLOR = ais.d(FONT_COLOR.darker(), 150);
    private static final Color BACKGROUND_COLOR = ais.d(aCG, 50);
    private static final Color BORDER_ONE_COLOR = ais.d(aCA, 32);
    private static final Color BORDER_TWO_COLOR = ais.d(aCz, 32);
    private final afj hoverAnimation;
    private final afj positionAnimation;
    private T account;
    private float x;
    private float y;
    private double scroll;
    private float width;
    private float height;
    private int screenHeight;
    private boolean removable;
    private ado[] labelButtons;
    private final Runnable defaultRenderRunnable = () -> {
        ait.c((double)this.x, (double)this.y + this.scroll, (double)this.width, (double)this.height, 5.0, BACKGROUND_COLOR);
        ait.a((double)this.x, (double)this.y + this.scroll, (double)this.width, (double)this.height, 5.0, 1.0, BORDER_ONE_COLOR, BORDER_TWO_COLOR);
        this.renderHead(this.x + 4.0f, (double)(this.y + 4.0f) + this.scroll, 32);
        FONT_RENDERER.a(((aeo)this.account).getName(), this.x + 40.0f, (double)(this.y + 6.0f) + this.scroll, FONT_COLOR.getRGB());
        String string = ((aeo)this.account).sz() < 31536000000L ? "Not yet" : DATE_FORMAT.format(new Date(((aeo)this.account).sz()));
        INFO_FONT_RENDERER.a("Last login: " + string, this.x + 40.0f, (double)(this.y + 19.0f) + this.scroll, INFO_COLOR.getRGB());
        INFO_FONT_RENDERER.a("Actions:", this.x + 40.0f, (double)(this.y + 29.0f) + this.scroll, INFO_COLOR.getRGB());
        for (ado ado2 : this.labelButtons) {
            ado2.setY(ado2.getY() + this.scroll);
            ado2.c(0, 0, 0.0f);
            ado2.setY(ado2.getY() - this.scroll);
        }
    };
    private final Runnable invalidRenderRunnable = () -> {
        ait.c((double)this.x, (double)this.y, (double)this.width, (double)this.height, 5.0, BACKGROUND_COLOR);
        ait.a((double)this.x, (double)this.y, (double)this.width, (double)this.height, 5.0, 1.0, BORDER_ONE_COLOR, BORDER_TWO_COLOR);
        this.renderInvalidHead(this.x + 4.0f, this.y + 4.0f, 32);
        FONT_RENDERER.a("Waiting...", this.x + 40.0f, this.y + 6.0f, FONT_COLOR.getRGB());
        INFO_FONT_RENDERER.a("Last login: -", this.x + 40.0f, this.y + 19.0f, INFO_COLOR.getRGB());
        INFO_FONT_RENDERER.a("Actions: -", this.x + 40.0f, this.y + 29.0f, INFO_COLOR.getRGB());
    };
    private final Runnable bloomRunnable = () -> ait.c((double)(this.x + 0.5f), (double)(this.y + 0.5f) + this.scroll, (double)(this.width - 1.0f), (double)(this.height - 1.0f), 6.0, BLOOM_COLOR);

    public AccountViewModel(T t2, float f2, float f3, float f4, float f5) {
        this.account = t2;
        this.x = f2;
        this.y = f3;
        this.width = f4;
        this.height = f5;
        this.hoverAnimation = new afj(afk.aHb, 200L);
        this.positionAnimation = new afj(afk.aHb, 200L);
        if (t2 instanceof aes || t2 instanceof aet) {
            this.labelButtons = new ado[]{new ado(f2 + 76.0f, f3 + f5 - 12.0f, 24.0, 8.0, () -> {
                this.removable = true;
            }, "Delete", Color.RED)};
        } else {
            int n2 = 2;
            this.labelButtons = new ado[]{new ado(f2 + 76.0f, f3 + f5 - 12.0f, 28.0, 8.0, () -> aER.a(new RenameAccountScreen(this)), "Rename", Color.YELLOW), new ado(f2 + 76.0f + 28.0f + (float)n2, f3 + f5 - 12.0f, 24.0, 8.0, () -> {
                this.removable = true;
            }, "Delete", Color.RED)};
        }
    }

    public boolean draw() {
        if (this.isOutOfScreen()) {
            return false;
        }
        this.b(gg.kT).c(this.bloomRunnable);
        if (((aeo)this.account).ln()) {
            this.b(gg.kV).c(this.defaultRenderRunnable);
        } else {
            this.b(gg.kV).c(this.invalidRenderRunnable);
        }
        return true;
    }

    public boolean mouseClicked(int n2, int n3, int n4) {
        if (n4 != 0) {
            return false;
        }
        if (aee.a(this.x, (double)this.y + this.scroll, this.width, this.height, n2, n3)) {
            if (((aeo)this.account).ln()) {
                for (ado ado2 : this.labelButtons) {
                    if (!aee.a(ado2.getX(), ado2.getY() + this.scroll, ado2.pc(), ado2.da(), n2, n3)) continue;
                    ado2.rC();
                    return true;
                }
            }
            return ((aeo)this.account).su();
        }
        return false;
    }

    private void renderHead(double d2, double d3, int n2) {
        aiv.vZ();
        aiv.wa();
        double d4 = n2;
        double d5 = n2;
        this.rP();
        ait.c(d2, d3, d4, d5, 5.0, ady.sa());
        aiv.aD(1);
        ait.a(aek.a(ael.aFm, ((aeo)this.account).sx(), 24), d2, d3, (double)n2, (double)n2, ais.d(Color.WHITE, (int)(200.0 + this.hoverAnimation.sV())));
        aiv.wb();
    }

    private void renderInvalidHead(double d2, double d3, int n2) {
        double d4 = Math.sin((double)System.currentTimeMillis() * 0.003) * -0.5 + 0.5;
        Color color = Color.getHSBColor(1.0f, 0.0f, (float)(d4 * 0.25) + 0.5f);
        ait.c(d2, d3, (double)n2, (double)n2, 5.0, color);
    }

    public boolean update() {
        if (!((aeo)this.account).ln()) {
            return false;
        }
        this.positionAnimation.Q(this.y);
        return true;
    }

    private void addScrollOffset(float f2) {
        this.y += f2;
    }

    private boolean isOutOfScreen() {
        double d2 = (double)this.y + this.scroll;
        return d2 + (double)this.height < 0.0 || d2 > (double)this.screenHeight;
    }

    public boolean isRemovable() {
        return this.removable || !((aeo)this.account).ln();
    }

    @Generated
    public T getAccount() {
        return this.account;
    }

    @Generated
    public void setScroll(double d2) {
        this.scroll = d2;
    }

    @Generated
    public float getHeight() {
        return this.height;
    }

    @Generated
    public int getScreenHeight() {
        return this.screenHeight;
    }

    @Generated
    public void setScreenHeight(int n2) {
        this.screenHeight = n2;
    }
}

