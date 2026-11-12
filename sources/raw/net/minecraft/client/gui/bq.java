/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.gui;

import com.google.common.base.Predicate;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.br;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cq;
import net.minecraft.client.multiplayer.f;
import net.minecraft.client.multiplayer.g;
import net.minecraft.client.resources.I18n;
import org.lwjgl.input.Keyboard;

public class bq
extends bp {
    private final bp bre;
    private final f brf;
    private cq brg;
    private cq brh;
    private c bri;
    private final Predicate<String> brj = new br(this);

    public bq(bp bp2, f f2) {
        this.bre = bp2;
        this.brf = f2;
    }

    @Override
    public void updateScreen() {
        this.brh.Gb();
        this.brg.Gb();
    }

    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.buttonList.clear();
        this.buttonList.add(new c(0, this.width / 2 - 100, this.height / 4 + 96 + 18, I18n.a("addServer.add", new Object[0])));
        this.buttonList.add(new c(1, this.width / 2 - 100, this.height / 4 + 120 + 18, I18n.a("gui.cancel", new Object[0])));
        this.bri = new c(2, this.width / 2 - 100, this.height / 4 + 72, I18n.a("addServer.resourcePack", new Object[0]) + ": " + this.brf.HE().HH().getFormattedText());
        this.buttonList.add(this.bri);
        this.brh = new cq(0, this.fontRendererObj, this.width / 2 - 100, 66, 200, 20);
        this.brh.ag(true);
        this.brh.bX(this.brf.fc);
        this.brg = new cq(1, this.fontRendererObj, this.width / 2 - 100, 106, 200, 20);
        this.brg.bV(128);
        this.brg.bX(this.brf.bDH);
        this.brg.b(this.brj);
        ((c)this.buttonList.get((int)0)).enabled = this.brg.getText().length() > 0 && this.brg.getText().split(":").length > 0 && this.brh.getText().length() > 0;
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id == 2) {
                this.brf.a(g.values()[(this.brf.HE().ordinal() + 1) % g.values().length]);
                this.bri.displayString = I18n.a("addServer.resourcePack", new Object[0]) + ": " + this.brf.HE().HH().getFormattedText();
            } else if (c2.id == 1) {
                this.bre.confirmClicked(false, 0);
            } else if (c2.id == 0) {
                this.brf.fc = this.brh.getText();
                this.brf.bDH = this.brg.getText();
                this.bre.confirmClicked(true, 0);
            }
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        this.brh.f(c2, n2);
        this.brg.f(c2, n2);
        if (n2 == 15) {
            this.brh.ag(!this.brh.Gj());
            this.brg.ag(!this.brg.Gj());
        }
        if (n2 == 28 || n2 == 156) {
            this.actionPerformed((c)this.buttonList.get(0));
        }
        ((c)this.buttonList.get((int)0)).enabled = this.brg.getText().length() > 0 && this.brg.getText().split(":").length > 0 && this.brh.getText().length() > 0;
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        super.mouseClicked(n2, n3, n4);
        this.brg.mouseClicked(n2, n3, n4);
        this.brh.mouseClicked(n2, n3, n4);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.a("addServer.title", new Object[0]), this.width / 2, 17, 0xFFFFFF);
        this.drawString(this.fontRendererObj, I18n.a("addServer.enterName", new Object[0]), this.width / 2 - 100, 53, 0xA0A0A0);
        this.drawString(this.fontRendererObj, I18n.a("addServer.enterIp", new Object[0]), this.width / 2 - 100, 94, 0xA0A0A0);
        this.brh.Gf();
        this.brg.Gf();
        super.drawScreen(n2, n3, f2);
    }
}

