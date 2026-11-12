/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.ui.menu.impl.account.impl;

import com.alan.clients.ui.menu.impl.account.AccountManagerScreen;
import com.alan.clients.ui.menu.impl.account.impl.AddCookieScreen;
import com.alan.clients.ui.menu.impl.account.impl.AddCrackedScreen;
import com.alan.clients.ui.menu.impl.account.impl.AddLocaltsScreen;
import com.alan.clients.ui.menu.impl.account.impl.AddMicrosoftScreen;
import com.alan.clients.ui.menu.impl.account.impl.AddSessionIDScreen;
import hackclient.rise.adi;
import hackclient.rise.adk;
import hackclient.rise.adl;
import hackclient.rise.aee;
import hackclient.rise.afh;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aiy;
import hackclient.rise.ajc;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.cz;
import net.minecraft.util.cm;
import rise.util.InstanceAccess;

public class AddAccountScreen
extends GuiScreen
implements InstanceAccess {
    private static final agf FONT_RENDERER = gb.ks.a(36, gd.kH);
    private static final agf AD_FONT_RENDERER = gb.ks.a(16, gd.kG);
    private static final agf DISCOUNT_FONT_RENDERER = gb.ks.a(14, gd.kH);
    private static final cm XBOX_RESOURCE = new cm("rise/images/xbox.png");
    private static final cm MICROSOFT_RESOURCE = new cm("rise/images/microsoft.png");
    private static final cm CRACKED_RESOURCE = new cm("rise/images/minecraft.png");
    private static final cm COOKIE_RESOURCE = new cm("rise/images/Cookie.png");
    private static final cm LOCALTS_RESOURCE = new cm("rise/images/localts.png");
    private static final String AD_TEXT = "Need alts? Localts purchases in Rise are 5% off \u2014 Click here!";
    private static final String AD_URL = "https://localts.store/?campaign=rise";
    private static final int AD_LOGO_SIZE = 24;
    private static final int AD_GAP = 8;
    private static final int AD_SIDE_PADDING = 14;
    private static final float CENTER_REF_HEIGHT = gb.ks.a(24, gd.kH).tF();
    private static GuiScreen reference;
    private afj animation;
    private afj adHoverAnimation;
    private int adX;
    private int adY;
    private int adWidth;
    private int adHeight;
    private static final Runnable BACKGROUND_RUNNABLE;
    private static final Runnable CANCEL_RUNNABLE;
    private static final Runnable CRACKED_RUNNABLE;
    private static final Runnable MICROSOFT_RUNNABLE;
    private static final Runnable GAMEPASS_RUNNABLE;
    private static final Runnable COOKIE_RUNNABLE;
    private static final Runnable LOCALTS_RUNNABLE;
    private final adl[] menuButtons = new adl[5];

    private static float centeredTextY(double d2, double d3, agf agf2) {
        return (float)(d2 + d3 / 2.0 - 4.0 * (double)agf2.tF() / (double)CENTER_REF_HEIGHT);
    }

    public AddAccountScreen() {
        reference = this;
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.animation.Q(0.0);
        aiy.aQy.a(ajc.aQF, f2, null);
        this.b(gg.kU).c(BACKGROUND_RUNNABLE);
        this.adHoverAnimation.Q(aee.a(this.adX, this.adY, this.adWidth, this.adHeight, n2, n3) ? 100.0 : 45.0);
        this.b(gg.kV).c(() -> FONT_RENDERER.c("Select your login method", this.width / 2, (double)(this.height / 2 - 76) + this.animation.sV(), Color.WHITE.getRGB()));
        Color color = ais.d(Color.BLACK, 150);
        Color color2 = ais.d(Color.WHITE, (int)(150.0 + this.adHoverAnimation.sV()));
        this.b(gg.kU).c(() -> ait.c((double)this.adX, (double)this.adY, (double)this.adWidth, (double)this.adHeight, 5.0, Color.WHITE));
        this.b(gg.kT).c(() -> ait.c((double)((float)this.adX + 0.5f), (double)((float)this.adY + 0.5f), (double)(this.adWidth - 1), (double)(this.adHeight - 1), 6.0, color));
        this.b(gg.kV).c(() -> {
            ait.c((double)this.adX, (double)this.adY, (double)this.adWidth, (double)this.adHeight, 5.0, ais.d(adi.aCG, (int)this.adHoverAnimation.sV() - 15));
            ait.a((double)this.adX, (double)this.adY, (double)this.adWidth, (double)this.adHeight, 5.0, 1.0, ais.d(adi.aCA, 32), ais.d(adi.aCz, 32));
            int n2 = this.adX + 14;
            int n3 = this.adY + (this.adHeight - 24) / 2;
            ait.a(LOCALTS_RESOURCE, (float)n2, (float)n3, 24.0f, 24.0f, color2);
            float f2 = n2 + 24 + 8;
            float f3 = AddAccountScreen.centeredTextY(this.adY, this.adHeight, AD_FONT_RENDERER);
            AD_FONT_RENDERER.a(AD_TEXT, f2, f3, color2.getRGB());
        });
        for (adl adl2 : this.menuButtons) {
            ((adk)adl2).c(n2, n3, f2);
        }
        this.b(gg.kV).c(() -> {
            adl adl2 = this.menuButtons[4];
            if (adl2 == null) {
                return;
            }
            String string = "5% OFF";
            float f2 = 16.0f;
            float f3 = DISCOUNT_FONT_RENDERER.bQ(string) + 16;
            float f4 = (float)(adl2.getX() + adl2.pc() / 2.0 - (double)(f3 / 2.0f));
            float f5 = (float)(adl2.getY() + adl2.da() - (double)f2 - 10.0);
            ait.c((double)f4, (double)f5, (double)f3, (double)f2, 7.0, new Color(38, 132, 93, 225));
            DISCOUNT_FONT_RENDERER.c(string, f4 + f3 / 2.0f, AddAccountScreen.centeredTextY(f5, f2, DISCOUNT_FONT_RENDERER), Color.WHITE.getRGB());
        });
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        if (aee.a(this.adX, this.adY, this.adWidth, this.adHeight, n2, n3)) {
            afh.A("login_ad", AD_URL);
            try {
                Desktop.getDesktop().browse(new URI(AD_URL));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return;
        }
        for (adl adl2 : this.menuButtons) {
            if (!aee.a(adl2.getX(), adl2.getY(), adl2.pc(), adl2.da(), n2, n3)) continue;
            adl2.rC();
            break;
        }
    }

    @Override
    public void initGui() {
        int n2 = this.menuButtons.length;
        int n3 = 100;
        int n4 = 140;
        int n5 = 5;
        int n6 = this.width / 2 - ((n2 & 1) == 0 ? (n3 + n5) * (n2 / 2) + n5 / 2 : (n3 + n5) * (n2 / 2) + n3 / 2);
        this.menuButtons[0] = new adl(0.0, 0.0, 0.0, 0.0, GAMEPASS_RUNNABLE, "SessionID/refID", XBOX_RESOURCE);
        this.menuButtons[1] = new adl(0.0, 0.0, 0.0, 0.0, MICROSOFT_RUNNABLE, "Microsoft", MICROSOFT_RESOURCE);
        this.menuButtons[2] = new adl(0.0, 0.0, 0.0, 0.0, CRACKED_RUNNABLE, "Cracked", CRACKED_RESOURCE);
        this.menuButtons[3] = new adl(0.0, 0.0, 0.0, 0.0, COOKIE_RUNNABLE, "Cookie", COOKIE_RESOURCE);
        this.menuButtons[4] = new adl(0.0, 0.0, 0.0, 0.0, LOCALTS_RUNNABLE, "Localts", LOCALTS_RESOURCE);
        for (adl adl2 : this.menuButtons) {
            adl2.setX(n6);
            adl2.setY(this.height / 2 - n4 / 2 + 24);
            adl2.P(n3);
            adl2.h(n4);
            n6 += n3 + n5;
        }
        this.animation = new afj(afk.aHh, 600L);
        this.animation.R(-200.0);
        this.adHoverAnimation = new afj(afk.aGW, 200L);
        this.adWidth = 60 + AD_FONT_RENDERER.bQ(AD_TEXT);
        this.adHeight = 40;
        this.adX = this.width / 2 - this.adWidth / 2;
        this.adY = this.height - 50;
    }

    static {
        BACKGROUND_RUNNABLE = () -> {
            cz cz2 = new cz(aER);
            ait.d(0.0, 0.0, cz2.getScaledWidth(), cz2.getScaledHeight(), Color.BLACK);
        };
        CANCEL_RUNNABLE = () -> aER.a(new AccountManagerScreen(reference));
        CRACKED_RUNNABLE = () -> aER.a(new AddCrackedScreen());
        MICROSOFT_RUNNABLE = () -> aER.a(new AddMicrosoftScreen());
        GAMEPASS_RUNNABLE = () -> aER.a(new AddSessionIDScreen());
        COOKIE_RUNNABLE = () -> aER.a(new AddCookieScreen());
        LOCALTS_RUNNABLE = () -> aER.a(new AddLocaltsScreen());
    }
}

