/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.gui;

import hackclient.rise.agg;
import io.netty.buffer.Unpooled;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cq;
import net.minecraft.client.resources.I18n;
import net.minecraft.command.server.e;
import net.minecraft.network.ak;
import net.minecraft.network.play.client.ab;
import net.minecraft.util.ba;
import org.lwjgl.input.Keyboard;

public class h
extends bp {
    private cq blb;
    private cq blc;
    private final e bld;
    private c ble;
    private c blf;
    private c blg;
    private boolean blh;

    public h(e e2) {
        this.bld = e2;
    }

    @Override
    public void updateScreen() {
        this.blb.Gb();
    }

    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.buttonList.clear();
        this.ble = new c(0, this.width / 2 - 4 - 150, this.height / 4 + 120 + 12, 150, 20, I18n.a("gui.done", new Object[0]));
        this.buttonList.add(this.ble);
        this.blf = new c(1, this.width / 2 + 4, this.height / 4 + 120 + 12, 150, 20, I18n.a("gui.cancel", new Object[0]));
        this.buttonList.add(this.blf);
        this.blg = new c(4, this.width / 2 + 150 - 20, 150, 20, 20, "O");
        this.buttonList.add(this.blg);
        this.blb = new cq(2, this.fontRendererObj, this.width / 2 - 150, 50, 300, 20);
        this.blb.bV(Short.MAX_VALUE);
        this.blb.ag(true);
        this.blb.bX(this.bld.Sy());
        this.blc = new cq(3, this.fontRendererObj, this.width / 2 - 150, 150, 276, 20);
        this.blc.bV(Short.MAX_VALUE);
        this.blc.setEnabled(false);
        this.blc.bX("-");
        this.blh = this.bld.SB();
        this.DY();
        this.ble.enabled = this.blb.getText().trim().length() > 0;
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id == 1) {
                this.bld.aA(this.blh);
                aER.a((bp)null);
            } else if (c2.id == 0) {
                ak ak2 = new ak(Unpooled.buffer());
                ak2.writeByte(this.bld.SA());
                this.bld.b(ak2);
                ak2.eS(this.blb.getText());
                ak2.writeBoolean(this.bld.SB());
                aER.AU().u(new ab("MC|AdvCdm", ak2));
                if (!this.bld.SB()) {
                    this.bld.h((ba)null);
                }
                aER.a((bp)null);
            } else if (c2.id == 4) {
                this.bld.aA(!this.bld.SB());
                this.DY();
            }
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        this.blb.f(c2, n2);
        this.blc.f(c2, n2);
        boolean bl2 = this.ble.enabled = this.blb.getText().trim().length() > 0;
        if (n2 != 28 && n2 != 156) {
            if (n2 == 1) {
                this.actionPerformed(this.blf);
            }
        } else {
            this.actionPerformed(this.ble);
        }
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        super.mouseClicked(n2, n3, n4);
        this.blb.mouseClicked(n2, n3, n4);
        this.blc.mouseClicked(n2, n3, n4);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.a("advMode.setCommand", new Object[0]), this.width / 2, 20, 0xFFFFFF);
        this.drawString(this.fontRendererObj, I18n.a("advMode.command", new Object[0]), this.width / 2 - 150, 37, 0xA0A0A0);
        this.blb.Gf();
        int n4 = 75;
        int n5 = 0;
        this.drawString(this.fontRendererObj, I18n.a("advMode.nearestPlayer", new Object[0]), this.width / 2 - 150, n4 + n5++ * agg.aIF, 0xA0A0A0);
        this.drawString(this.fontRendererObj, I18n.a("advMode.randomPlayer", new Object[0]), this.width / 2 - 150, n4 + n5++ * agg.aIF, 0xA0A0A0);
        this.drawString(this.fontRendererObj, I18n.a("advMode.allPlayers", new Object[0]), this.width / 2 - 150, n4 + n5++ * agg.aIF, 0xA0A0A0);
        this.drawString(this.fontRendererObj, I18n.a("advMode.allEntities", new Object[0]), this.width / 2 - 150, n4 + n5++ * agg.aIF, 0xA0A0A0);
        this.drawString(this.fontRendererObj, "", this.width / 2 - 150, n4 + n5++ * agg.aIF, 0xA0A0A0);
        if (this.blc.getText().length() > 0) {
            n4 = n4 + n5 * agg.aIF + 16;
            this.drawString(this.fontRendererObj, I18n.a("advMode.previousOutput", new Object[0]), this.width / 2 - 150, n4, 0xA0A0A0);
            this.blc.Gf();
        }
        super.drawScreen(n2, n3, f2);
    }

    private void DY() {
        if (this.bld.SB()) {
            this.blg.displayString = "O";
            if (this.bld.Sx() != null) {
                this.blc.bX(this.bld.Sx().arq());
            }
        } else {
            this.blg.displayString = "X";
            this.blc.bX("-");
        }
    }
}

