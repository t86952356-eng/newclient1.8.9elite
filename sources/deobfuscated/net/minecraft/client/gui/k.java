/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.l;
import net.minecraft.client.gui.m;
import net.minecraft.client.gui.u;
import net.minecraft.client.resources.I18n;
import net.minecraft.world.gen.j;

public class k
extends GuiScreen {
    private final m blt;
    private j blu = j.ayn();
    private String blv;
    private String blw;
    private String blx;
    private l bly;
    private c blz;
    private c blA;
    private c blB;

    public k(m m2, String string) {
        this.blt = m2;
        this.cG(string);
    }

    public String Eb() {
        return this.blu.toString();
    }

    public void cG(String string) {
        this.blu = j.gJ(string);
    }

    @Override
    public void initGui() {
        this.buttonList.clear();
        this.blv = I18n.a("createWorld.customize.flat.title", new Object[0]);
        this.blw = I18n.a("createWorld.customize.flat.tile", new Object[0]);
        this.blx = I18n.a("createWorld.customize.flat.height", new Object[0]);
        this.bly = new l(this);
        this.blz = new c(2, this.width / 2 - 154, this.height - 52, 100, 20, I18n.a("createWorld.customize.flat.addLayer", new Object[0]) + " (NYI)");
        this.buttonList.add(this.blz);
        this.blA = new c(3, this.width / 2 - 50, this.height - 52, 100, 20, I18n.a("createWorld.customize.flat.editLayer", new Object[0]) + " (NYI)");
        this.buttonList.add(this.blA);
        this.blB = new c(4, this.width / 2 - 155, this.height - 52, 150, 20, I18n.a("createWorld.customize.flat.removeLayer", new Object[0]));
        this.buttonList.add(this.blB);
        this.buttonList.add(new c(0, this.width / 2 - 155, this.height - 28, 150, 20, I18n.a("gui.done", new Object[0])));
        this.buttonList.add(new c(5, this.width / 2 + 5, this.height - 52, 150, 20, I18n.a("createWorld.customize.presets", new Object[0])));
        this.buttonList.add(new c(1, this.width / 2 + 5, this.height - 28, 150, 20, I18n.a("gui.cancel", new Object[0])));
        this.blA.visible = false;
        this.blz.visible = false;
        this.blu.aym();
        this.Ec();
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        this.bly.handleMouseInput();
    }

    @Override
    protected void actionPerformed(c c2) {
        int n2 = this.blu.ayl().size() - this.bly.blC - 1;
        if (c2.id == 1) {
            aER.a(this.blt);
        } else if (c2.id == 0) {
            this.blt.bmc = this.Eb();
            aER.a(this.blt);
        } else if (c2.id == 5) {
            aER.a(new u(this));
        } else if (c2.id == 4 && this.Ed()) {
            this.blu.ayl().remove(n2);
            this.bly.blC = Math.min(this.bly.blC, this.blu.ayl().size() - 1);
        }
        this.blu.aym();
        this.Ec();
    }

    public void Ec() {
        boolean bl2;
        this.blB.enabled = bl2 = this.Ed();
        this.blA.enabled = bl2;
        this.blA.enabled = false;
        this.blz.enabled = false;
    }

    private boolean Ed() {
        return this.bly.blC > -1 && this.bly.blC < this.blu.ayl().size();
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.bly.drawScreen(n2, n3, f2);
        this.drawCenteredString(this.fontRendererObj, this.blv, this.width / 2, 8, 0xFFFFFF);
        int n4 = this.width / 2 - 92 - 16;
        this.drawString(this.fontRendererObj, this.blw, n4, 32, 0xFFFFFF);
        this.drawString(this.fontRendererObj, this.blx, n4 + 2 + 213 - this.fontRendererObj.bQ(this.blx), 32, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
    }
}

