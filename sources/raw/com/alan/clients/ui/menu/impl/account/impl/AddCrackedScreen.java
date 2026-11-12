/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.ui.menu.impl.account.impl;

import com.alan.clients.ui.menu.impl.account.AccountManagerScreen;
import hackclient.rise.adk;
import hackclient.rise.adp;
import hackclient.rise.aea;
import hackclient.rise.aee;
import hackclient.rise.aer;
import hackclient.rise.afi;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
import hackclient.rise.ago;
import hackclient.rise.agp;
import hackclient.rise.ait;
import hackclient.rise.aiy;
import hackclient.rise.ajc;
import hackclient.rise.aka;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.cz;

public class AddCrackedScreen
extends bp
implements aea {
    private static final agf FONT_RENDERER = gb.ks.a(36, gd.kH);
    private final adk[] menuButtons = new adk[5];
    private static agp usernameBox;
    private static bp reference;
    private afj animation;
    private static final Runnable TEXT_BOX_RUNNABLE;
    private static final Runnable CANCEL_RUNNABLE;
    private static final Runnable GENERATE_RANDOM_RUNNABLE;
    private static final Runnable ADD_RUNNABLE;
    private static final Runnable LOGIN_RUNNABLE;
    private static final Runnable BACKGROUND_RUNNABLE;

    public AddCrackedScreen() {
        reference = this;
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.animation.Q(0.0);
        aiy.aQy.a(ajc.aQF, f2, null);
        this.b(gg.kU).c(BACKGROUND_RUNNABLE);
        for (adk adk2 : this.menuButtons) {
            adk2.c(n2, n3, f2);
        }
        this.b(gg.kV).c(() -> {
            FONT_RENDERER.c("Select your username", this.width / 2, (double)(this.height / 2 - 64) + this.animation.sV(), Color.WHITE.getRGB());
            usernameBox.pZ();
        });
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        usernameBox.d(n2, n3, n4);
        for (adk adk2 : this.menuButtons) {
            if (!aee.a(adk2.getX(), adk2.getY(), adk2.pc(), adk2.da(), n2, n3)) continue;
            adk2.rC();
            break;
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (usernameBox.ud()) {
            usernameBox.b(c2, n2);
        }
    }

    @Override
    public void initGui() {
        int n2 = 200;
        int n3 = 24;
        int n4 = 4;
        float f2 = (float)(n2 - n4 * 2) / 3.0f;
        aka aka2 = new aka(this.width / 2 - n2 / 2, this.height / 2 - 24);
        usernameBox = new agp(aka2.p(n2 / 2, 8.0), gb.ks.a(24, gd.kH), Color.WHITE, ago.aJT, "Username", n2);
        this.menuButtons[0] = new adp(aka2.x, aka2.y, n2, n3, TEXT_BOX_RUNNABLE, "");
        this.menuButtons[1] = new adp(aka2.x, aka2.y + (double)n3 + (double)n4, n2, n3, GENERATE_RANDOM_RUNNABLE, "Generate random");
        this.menuButtons[2] = new adp(aka2.x, aka2.y + (double)((n3 + n4) * 2), f2, n3, ADD_RUNNABLE, "Add");
        this.menuButtons[3] = new adp(aka2.x + (double)f2 + (double)n4, aka2.y + (double)((n3 + n4) * 2), f2, n3, LOGIN_RUNNABLE, "Login");
        this.menuButtons[4] = new adp(aka2.x + (double)((f2 + (float)n4) * 2.0f), aka2.y + (double)((n3 + n4) * 2), f2, n3, CANCEL_RUNNABLE, "Cancel");
        this.animation = new afj(afk.aHh, 600L);
        this.animation.R(-200.0);
    }

    private static boolean validate(String string) {
        if (string.length() < 3 || string.length() > 16) {
            return false;
        }
        for (char c2 : string.toCharArray()) {
            if (Character.isLetterOrDigit(c2) || c2 == '_') continue;
            return false;
        }
        return true;
    }

    static {
        TEXT_BOX_RUNNABLE = () -> usernameBox.I(true);
        CANCEL_RUNNABLE = () -> aER.a(new AccountManagerScreen(reference));
        GENERATE_RANDOM_RUNNABLE = () -> new Thread(() -> {
            String string = afi.sN();
            if (string != null && AddCrackedScreen.validate(string)) {
                usernameBox.bX(string);
            }
        }, "Account generation thread").start();
        ADD_RUNNABLE = () -> {
            String string = AddCrackedScreen.usernameBox.Yg;
            if (AddCrackedScreen.validate(string)) {
                aer aer2 = new aer(string);
                AccountManagerScreen.addAccount(aer2);
                aer2.su();
                CANCEL_RUNNABLE.run();
            }
        };
        LOGIN_RUNNABLE = () -> {
            String string = AddCrackedScreen.usernameBox.Yg;
            if (AddCrackedScreen.validate(string)) {
                new aer(string).su();
                CANCEL_RUNNABLE.run();
            }
        };
        BACKGROUND_RUNNABLE = () -> {
            cz cz2 = new cz(aER);
            ait.d(0.0, 0.0, cz2.getScaledWidth(), cz2.getScaledHeight(), Color.BLACK);
        };
    }
}

