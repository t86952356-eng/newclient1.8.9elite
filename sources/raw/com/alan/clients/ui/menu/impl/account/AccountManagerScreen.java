/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.alan.clients.ui.menu.impl.account;

import com.alan.clients.ui.menu.impl.account.display.AccountViewModel;
import com.alan.clients.ui.menu.impl.account.impl.AddAccountScreen;
import hackclient.rise.a;
import hackclient.rise.adk;
import hackclient.rise.adp;
import hackclient.rise.adu;
import hackclient.rise.aea;
import hackclient.rise.aee;
import hackclient.rise.aeo;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.afy;
import hackclient.rise.agn;
import hackclient.rise.ait;
import hackclient.rise.aiu;
import hackclient.rise.aiy;
import hackclient.rise.ajc;
import hackclient.rise.gg;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.d;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.cz;
import org.lwjgl.opengl.GL11;

public class AccountManagerScreen
extends bp
implements aea {
    private static final afy ALT_MANAGER = a.a.q();
    private static final Runnable ADD_ACCOUNT_RUNNABLE = () -> aER.a(new AddAccountScreen());
    private static final Runnable CANCEL_RUNNABLE = () -> aER.a(new adu());
    private static final Runnable BACKGROUND_RUNNABLE = () -> {
        cz cz2 = new cz(aER);
        ait.d(0.0, 0.0, cz2.getScaledWidth(), cz2.getScaledHeight(), Color.BLACK);
    };
    private static final afj SLIDE_ANIMATION = new afj(afk.aHq, 350L);
    private static final adk[] MENU_BUTTONS = new adk[2];
    private static final List<AccountViewModel<?>> ACCOUNT_DISPLAY_LIST = new ArrayList();
    private static bp prevScreen;
    private boolean updateMarker;
    private static int screenWidth;
    private static int screenHeight;
    agn scrollUtil = new agn();
    private static int accountsInRow;

    public AccountManagerScreen(bp bp2) {
        prevScreen = bp2;
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        int n4;
        aiy.aQy.a(ajc.aQF, f2, null);
        this.b(gg.kU).c(BACKGROUND_RUNNABLE);
        GL11.glPushMatrix();
        aiu.hQ();
        this.b(gg.kT).c(() -> bp.drawRect(0, 0, 0, 0, 0));
        this.scrollUtil.qN();
        if (!ACCOUNT_DISPLAY_LIST.isEmpty()) {
            n4 = (int)ACCOUNT_DISPLAY_LIST.get(0).getHeight();
            int n5 = 5;
            int n6 = (int)Math.ceil((double)ACCOUNT_DISPLAY_LIST.size() / (double)accountsInRow);
            int n7 = n6 * (n4 + n5) + 16;
            int n8 = this.height - 48;
            int n9 = Math.min(0, -(n7 - n8));
            this.scrollUtil.V(n9);
        } else {
            this.scrollUtil.V(0.0);
        }
        for (n4 = 0; n4 < ACCOUNT_DISPLAY_LIST.size(); ++n4) {
            AccountViewModel<?> accountViewModel = ACCOUNT_DISPLAY_LIST.get(n4);
            accountViewModel.setScroll(this.scrollUtil.tT());
            accountViewModel.draw();
        }
        aiu.a(new cz(aER), 0.0, 0.0, this.width, this.height - 48);
        aiu.disable();
        GL11.glPopMatrix();
        for (adk adk2 : MENU_BUTTONS) {
            if (adk2 == null) continue;
            adk2.c(n2, n3, f2);
        }
    }

    @Override
    public void updateScreen() {
        if (this.updateMarker) {
            this.updateMarker = false;
            ArrayList arrayList = new ArrayList();
            for (AccountViewModel<?> accountViewModel : ACCOUNT_DISPLAY_LIST) {
                if (!accountViewModel.isRemovable()) continue;
                ALT_MANAGER.tA().remove(accountViewModel.getAccount());
                arrayList.add(accountViewModel);
            }
            ACCOUNT_DISPLAY_LIST.removeAll(arrayList);
            ALT_MANAGER.update();
            this.reorderViewModels();
        }
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        for (adk adk2 : MENU_BUTTONS) {
            if (!aee.a(adk2.getX(), adk2.getY(), adk2.pc(), adk2.da(), n2, n3)) continue;
            adk2.rC();
            return;
        }
        for (AccountViewModel accountViewModel : ACCOUNT_DISPLAY_LIST) {
            if (!accountViewModel.mouseClicked(n2, n3, n4)) continue;
            this.updateMarker = true;
            return;
        }
    }

    @Override
    protected void mouseReleased(int n2, int n3, int n4) {
        super.mouseReleased(n2, n3, n4);
    }

    @Override
    public void initGui() {
        super.initGui();
        screenWidth = this.width;
        screenHeight = this.height;
        int n2 = MENU_BUTTONS.length;
        int n3 = 100;
        int n4 = 24;
        int n5 = 5;
        int n6 = this.width / 2 - ((n2 & 1) == 0 ? (n3 + n5) * (n2 / 2) - n5 / 2 : (n3 + n5) * (n2 / 2) + n3 / 2);
        AccountManagerScreen.MENU_BUTTONS[0] = new adp(0.0, 0.0, 0.0, 0.0, ADD_ACCOUNT_RUNNABLE, "Add Account");
        AccountManagerScreen.MENU_BUTTONS[1] = new adp(0.0, 0.0, 0.0, 0.0, CANCEL_RUNNABLE, "Cancel");
        for (adk adk2 : MENU_BUTTONS) {
            adk2.setX(n6);
            adk2.setY(this.height - n4 - n5 * 2);
            adk2.P(n3);
            adk2.h(n4);
            n6 += n3 + n5;
        }
        if (prevScreen instanceof AccountManagerScreen) {
            this.reorderViewModels();
            return;
        }
        ACCOUNT_DISPLAY_LIST.clear();
        ALT_MANAGER.tz();
        List<aeo> list = ALT_MANAGER.tA();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            aeo aeo2 = (aeo)iterator.next();
            AccountManagerScreen.addDisplay(aeo2);
        }
        this.b(gg.kV).c(BACKGROUND_RUNNABLE);
    }

    public static void addAccount(aeo aeo2) {
        AccountManagerScreen.addDisplay(aeo2);
        ALT_MANAGER.tA().add(aeo2);
        ALT_MANAGER.update();
    }

    private static void addDisplay(aeo aeo2) {
        int n2 = 172;
        int n3 = 40;
        int n4 = 5;
        accountsInRow = Math.max(1, Math.min(3, (screenWidth - n2 / 3) / (n2 + n4)));
        int n5 = 16 + (n3 + n4) * (ACCOUNT_DISPLAY_LIST.size() / accountsInRow);
        int n6 = screenWidth / 2 - ((accountsInRow & 1) == 0 ? (n2 + n4) * (accountsInRow / 2) - n4 / 2 : (n2 + n4) * (accountsInRow / 2) + n2 / 2);
        AccountViewModel<aeo> accountViewModel = new AccountViewModel<aeo>(aeo2, n6 += (n2 + n4) * (ACCOUNT_DISPLAY_LIST.size() % accountsInRow), n5, n2, n3);
        accountViewModel.setScreenHeight(screenHeight);
        ACCOUNT_DISPLAY_LIST.add(accountViewModel);
    }

    private void reorderViewModels() {
        ArrayList arrayList = new ArrayList(ACCOUNT_DISPLAY_LIST);
        ACCOUNT_DISPLAY_LIST.clear();
        for (AccountViewModel accountViewModel : arrayList) {
            AccountManagerScreen.addDisplay(accountViewModel.getAccount());
        }
    }

    @Override
    public void onResize(d d2, int n2, int n3) {
        prevScreen = this;
        super.onResize(d2, n2, n3);
    }

    @Override
    public void onGuiClosed() {
        ACCOUNT_DISPLAY_LIST.clear();
        Arrays.fill(MENU_BUTTONS, null);
    }
}

