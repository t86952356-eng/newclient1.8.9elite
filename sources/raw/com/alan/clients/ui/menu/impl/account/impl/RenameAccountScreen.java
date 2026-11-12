/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.ui.menu.impl.account.impl;

import com.alan.clients.ui.menu.impl.account.AccountManagerScreen;
import com.alan.clients.ui.menu.impl.account.display.AccountViewModel;
import hackclient.rise.a;
import hackclient.rise.adk;
import hackclient.rise.adp;
import hackclient.rise.aea;
import hackclient.rise.aee;
import hackclient.rise.aeo;
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

public class RenameAccountScreen
extends bp
implements aea {
    private static final agf FONT_RENDERER = gb.ks.a(36, gd.kH);
    private final adk[] menuButtons = new adk[3];
    private static agp usernameBox;
    private static bp reference;
    private AccountViewModel<?> accountViewModel;
    private afj animation;
    private static final Runnable TEXT_BOX_RUNNABLE;
    private final Runnable CANCEL_RUNNABLE = () -> aER.a(new AccountManagerScreen(reference));
    private final Runnable UPDATE_RUNNABLE = () -> {
        String string = RenameAccountScreen.usernameBox.Yg;
        if (!this.validate(string)) {
            return;
        }
        System.out.println("Updating username to " + string);
        ((aeo)this.accountViewModel.getAccount()).setName(string);
        ((aeo)this.accountViewModel.getAccount()).su();
        a.a.q().update();
        this.CANCEL_RUNNABLE.run();
        System.out.println("Write");
    };
    private static final Runnable BACKGROUND_RUNNABLE;

    public RenameAccountScreen(AccountViewModel<?> accountViewModel) {
        this.accountViewModel = accountViewModel;
        reference = this;
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.animation.Q(0.0);
        aiy.aQy.a(ajc.aQF, f2, null);
        this.b(gg.kU).c(BACKGROUND_RUNNABLE);
        FONT_RENDERER.c("Update your username", this.width / 2, (double)(this.height / 2 - 64) + this.animation.sV(), Color.WHITE.getRGB());
        this.accountViewModel.draw();
        for (adk adk2 : this.menuButtons) {
            adk2.c(n2, n3, f2);
        }
        usernameBox.pZ();
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
        float f2 = (float)(n2 - n4) / 2.0f;
        aka aka2 = new aka(this.width / 2 - n2 / 2, this.height / 2 - 32);
        this.accountViewModel = new AccountViewModel(this.accountViewModel.getAccount(), (float)aka2.x, (float)aka2.y, 200.0f, 40.0f);
        this.accountViewModel.setScreenHeight(this.height);
        aka2 = new aka(this.width / 2 - n2 / 2, this.height / 2 + 32);
        usernameBox = new agp(aka2.p(n2 / 2, 8.0), gb.ks.a(24, gd.kG), Color.WHITE, ago.aJT, "Username", n2);
        usernameBox.bX(((aeo)this.accountViewModel.getAccount()).getName());
        this.menuButtons[0] = new adp(aka2.x, aka2.y, n2, n3, TEXT_BOX_RUNNABLE, "");
        this.menuButtons[1] = new adp(aka2.x, aka2.y + (double)n3 + (double)n4, f2, n3, this.UPDATE_RUNNABLE, "Update");
        this.menuButtons[2] = new adp(aka2.x + (double)f2 + (double)n4, aka2.y + (double)n3 + (double)n4, f2, n3, this.CANCEL_RUNNABLE, "Back");
        this.animation = new afj(afk.aHh, 600L);
        this.animation.R(-200.0);
    }

    private boolean validate(String string) {
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
        BACKGROUND_RUNNABLE = () -> {
            cz cz2 = new cz(aER);
            ait.d(0.0, 0.0, cz2.getScaledWidth(), cz2.getScaledHeight(), Color.BLACK);
        };
    }
}

