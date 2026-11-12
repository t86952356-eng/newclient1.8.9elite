/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.alan.clients.ui.menu.impl.account.impl;

import com.alan.clients.ui.menu.impl.account.AccountManagerScreen;
import com.alan.clients.ui.menu.impl.account.display.AccountViewModel;
import hackclient.rise.adk;
import hackclient.rise.adp;
import hackclient.rise.aea;
import hackclient.rise.aee;
import hackclient.rise.aes;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
import hackclient.rise.ait;
import hackclient.rise.aiy;
import hackclient.rise.ajc;
import hackclient.rise.aka;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import net.minecraft.client.d;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

public class AddMicrosoftScreen
extends bp
implements aea {
    private static final agf FONT_RENDERER = gb.ks.a(36, gd.kH);
    private static final agf INFO_FONT_RENDERER = gb.ks.a(18, gd.kG);
    private static AccountViewModel<aes> accountViewModel;
    private static bp reference;
    private final adk[] menuButtons = new adk[2];
    private afj animation;
    private static final Runnable CANCEL_RUNNABLE;
    private static final Runnable ADD_RUNNABLE;
    private static final Runnable BACKGROUND_RUNNABLE;

    public AddMicrosoftScreen() {
        reference = this;
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        if (accountViewModel.getAccount().ln()) {
            this.animation.Q(36.0);
        } else {
            this.animation.Q(0.0);
        }
        aiy.aQy.a(ajc.aQF, f2, null);
        this.b(gg.kU).c(BACKGROUND_RUNNABLE);
        this.b(gg.kV).c(() -> {
            FONT_RENDERER.c("Log in to your microsoft account", this.width / 2, (double)(this.height / 2 - 96) + this.animation.sV(), Color.WHITE.getRGB());
            INFO_FONT_RENDERER.c("A link has been copied to your clipboard.", this.width / 2, (double)(this.height / 2 - 64) + this.animation.sV(), Color.WHITE.darker().getRGB());
            INFO_FONT_RENDERER.c("To load a cookie, please use firefox and install \"Cookie Quick Manager\".", this.width / 2, (double)(this.height / 2 - 48) + this.animation.sV(), Color.WHITE.darker().getRGB());
            INFO_FONT_RENDERER.c("To login to your own account, just fill out the form.", this.width / 2, (double)(this.height / 2 - 32) + this.animation.sV(), Color.WHITE.darker().getRGB());
            int n2 = this.width / 2;
            int n3 = this.height / 2 + 4;
            int n4 = 12;
            if (!accountViewModel.getAccount().ln()) {
                GlStateManager.JV();
                GlStateManager.C(n2, (double)n3 + this.animation.sV(), 0.0);
                GlStateManager.JV();
                GlStateManager.tQ();
                GlStateManager.P(770, 771);
                GlStateManager.Jy();
                GlStateManager.JO();
                GL11.glEnable((int)2832);
                GL11.glPointSize((float)8.0f);
                GL11.glBegin((int)0);
                long l2 = (long)((double)d.Bj() * 0.5);
                l2 %= 360L;
                l2 -= l2 % 30L;
                for (int i2 = 0; i2 < 360; i2 += 30) {
                    double d2 = Math.PI * 2 * (double)i2 / 360.0;
                    double d3 = Math.cos(d2);
                    double d4 = Math.sin(d2);
                    float f2 = 1.0f - (float)((long)i2 + l2) % 360.0f / 360.0f;
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f2);
                    GL11.glVertex2d((double)(d3 * (double)n4), (double)(d4 * (double)n4));
                }
                GL11.glEnd();
                GL11.glDisable((int)2832);
                GL11.glLineWidth((float)1.0f);
                GlStateManager.JN();
                GlStateManager.tR();
                GlStateManager.tL();
                GlStateManager.JW();
                GlStateManager.JW();
            }
        });
        accountViewModel.draw();
        for (adk adk2 : this.menuButtons) {
            adk2.c(n2, n3, f2);
        }
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        for (adk adk2 : this.menuButtons) {
            if (!aee.a(adk2.getX(), adk2.getY(), adk2.pc(), adk2.da(), n2, n3)) continue;
            adk2.rC();
            break;
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
    }

    @Override
    public void initGui() {
        int n2 = 200;
        int n3 = 24;
        int n4 = 4;
        float f2 = (float)(n2 - n4) / 2.0f;
        aka aka2 = new aka(this.width / 2 - n2 / 2, this.height / 2 + 76);
        this.menuButtons[0] = new adp(aka2.x, aka2.y, f2, n3, ADD_RUNNABLE, "Add");
        this.menuButtons[1] = new adp(aka2.x + (double)f2 + (double)n4, aka2.y, f2, n3, CANCEL_RUNNABLE, "Back");
        accountViewModel = new AccountViewModel<aes>(aes.sD(), this.width / 2 - 100, this.height / 2 + 32, 200.0f, 40.0f);
        accountViewModel.setScreenHeight(this.height);
        this.animation = new afj(afk.aHh, 600L);
        this.animation.R(-200.0);
    }

    static {
        CANCEL_RUNNABLE = () -> aER.a(new AccountManagerScreen(reference));
        ADD_RUNNABLE = () -> {
            if (accountViewModel.getAccount().ln()) {
                AccountManagerScreen.addAccount(accountViewModel.getAccount());
                CANCEL_RUNNABLE.run();
            }
        };
        BACKGROUND_RUNNABLE = () -> {
            cz cz2 = new cz(aER);
            ait.d(0.0, 0.0, cz2.getScaledWidth(), cz2.getScaledHeight(), Color.BLACK);
        };
    }
}

