/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import hackclient.rise.aeq;
import hackclient.rise.aer;
import hackclient.rise.afi;
import hackclient.rise.agg;
import hackclient.rise.bi;
import hackclient.rise.fb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.aq;
import net.minecraft.client.gui.c;
import net.minecraft.client.multiplayer.b;
import net.minecraft.client.multiplayer.f;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ba;
import rise.Client;

public class q
extends GuiScreen {
    private final String bmB;
    private final ba bmC;
    private List<String> bmD;
    private final GuiScreen bmE;
    private int bmF;
    private volatile String bmG;

    public q(GuiScreen guiScreen, String string, ba ba2) {
        this.bmE = guiScreen;
        this.bmB = I18n.a(string, new Object[0]);
        this.bmC = ba2;
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (n2 == 1) {
            aER.a((GuiScreen)null);
            if (q.aER.bgR == null) {
                aER.AK();
            }
        }
    }

    @Override
    public void initGui() {
        this.buttonList.clear();
        this.bmD = this.fontRendererObj.m(this.bmC.getFormattedText(), this.width - 50);
        this.bmF = this.bmD.size() * agg.aIF;
        int n2 = 3;
        int n3 = this.height / 2 + this.bmF / 2 + agg.aIF;
        int n4 = 100;
        int n5 = -107;
        int n6 = 200;
        int n7 = 100 + n2 + -107 + n2 + 200;
        int n8 = this.width / 2 - n7 / 2;
        this.buttonList.add(new c(0, this.width / 2 - 100, this.height / 2 + this.bmF / 2 + agg.aIF, 100 - n2, 20, "Leave"));
        this.buttonList.add(new c(1, this.width / 2 + n2, this.height / 2 + this.bmF / 2 + agg.aIF, 100 - n2, 20, "Reconnect"));
        this.buttonList.add(new c(2, n8 + 100 + n2 + -107 + n2, n3 + 35, 200, 20, "Reconnect with token in clipboard"));
        this.buttonList.add(new c(3, n8 + 100 + n2 + -107 + n2, n3 + 35 + 23, 200, 20, "Reconnect with random cracked"));
        Client.a.e().d(new fb(this.bmD));
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.id == 0) {
            aER.a(this.bmE);
        }
        if (c2.id == 1) {
            aER.a(new b(new aq(new am()), aER, new f("", bi.dx, false)));
        }
        if (c2.id == 2) {
            this.bmG = "Reading clipboard\u2026";
            new Thread(() -> {
                try {
                    String string;
                    String string2 = GuiScreen.getClipboardString();
                    String string3 = string = string2 == null ? "" : string2.trim();
                    if (string.isEmpty()) {
                        this.bmG = "Clipboard is empty";
                        return;
                    }
                    this.bmG = "Logging in\u2026";
                    aeq.bj(string);
                    this.bmG = "Reconnecting\u2026";
                    aER.f(() -> aER.a(new b(new aq(new am()), aER, new f("", bi.dx, false))));
                }
                catch (Exception exception) {
                    this.bmG = "Token login failed";
                    exception.printStackTrace();
                }
            }, "Reconnect (Clipboard Token)").start();
        }
        if (c2.id == 3) {
            this.bmG = "Picking username\u2026";
            new Thread(() -> {
                try {
                    String[] stringArray = afi.sM();
                    if (stringArray == null || stringArray.length == 0) {
                        this.bmG = "Name list unavailable";
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    Arrays.stream(stringArray).map(string -> string == null ? "" : string.trim()).filter(q::cJ).forEach(arrayList::add);
                    if (arrayList.isEmpty()) {
                        this.bmG = "No valid names in list";
                        return;
                    }
                    String string2 = (String)arrayList.get((int)(Math.random() * (double)arrayList.size()));
                    this.bmG = "Logging in as " + string2 + "\u2026";
                    new aer(string2).su();
                    this.bmG = "Reconnecting\u2026";
                    aER.f(() -> aER.a(new b(new aq(new am()), aER, new f("", bi.dx, false))));
                }
                catch (Exception exception) {
                    this.bmG = "Cracked login failed";
                    exception.printStackTrace();
                }
            }, "Reconnect (Random Cracked Account)").start();
        }
    }

    private static boolean cJ(String string) {
        if (string == null) {
            return false;
        }
        if (string.length() < 3 || string.length() > 16) {
            return false;
        }
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (Character.isLetterOrDigit(c2) || c2 == '_') continue;
            return false;
        }
        return true;
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.bmB, this.width / 2, this.height / 2 - this.bmF / 2 - agg.aIF * 2, 0xAAAAAA);
        int n4 = this.height / 2 - this.bmF / 2;
        if (this.bmD != null) {
            for (String string : this.bmD) {
                this.drawCenteredString(this.fontRendererObj, string, this.width / 2, n4, 0xFFFFFF);
                n4 += agg.aIF;
            }
        }
        if (this.bmG != null && !this.bmG.isEmpty()) {
            this.drawCenteredString(this.fontRendererObj, this.bmG, this.width / 2, this.height / 2 + this.bmF / 2 + agg.aIF + 24, 0xFFFFFF);
        }
        super.drawScreen(n2, n3, f2);
    }
}

