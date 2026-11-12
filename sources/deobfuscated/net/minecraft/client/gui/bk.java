/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cq;
import net.minecraft.client.resources.I18n;
import net.minecraft.world.storage.o;
import org.lwjgl.input.Keyboard;

public class bk
extends GuiScreen {
    private final GuiScreen bqV;
    private cq bqW;
    private final String bqX;

    public bk(GuiScreen guiScreen, String string) {
        this.bqV = guiScreen;
        this.bqX = string;
    }

    @Override
    public void updateScreen() {
        this.bqW.Gb();
    }

    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.buttonList.clear();
        this.buttonList.add(new c(0, this.width / 2 - 100, this.height / 4 + 96 + 12, I18n.a("selectWorld.renameButton", new Object[0])));
        this.buttonList.add(new c(1, this.width / 2 - 100, this.height / 4 + 120 + 12, I18n.a("gui.cancel", new Object[0])));
        net.minecraft.world.storage.c c2 = aER.AB();
        o o2 = c2.gK(this.bqX);
        String string = o2.aln();
        this.bqW = new cq(2, this.fontRendererObj, this.width / 2 - 100, 60, 200, 20);
        this.bqW.ag(true);
        this.bqW.bX(string);
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id == 1) {
                aER.a(this.bqV);
            } else if (c2.id == 0) {
                net.minecraft.world.storage.c c3 = aER.AB();
                c3.Z(this.bqX, this.bqW.getText().trim());
                aER.a(this.bqV);
            }
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        this.bqW.f(c2, n2);
        boolean bl2 = ((c)this.buttonList.get((int)0)).enabled = this.bqW.getText().trim().length() > 0;
        if (n2 == 28 || n2 == 156) {
            this.actionPerformed((c)this.buttonList.get(0));
        }
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        super.mouseClicked(n2, n3, n4);
        this.bqW.mouseClicked(n2, n3, n4);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.a("selectWorld.renameTitle", new Object[0]), this.width / 2, 20, 0xFFFFFF);
        this.drawString(this.fontRendererObj, I18n.a("selectWorld.enterName", new Object[0]), this.width / 2 - 100, 47, 0xA0A0A0);
        this.bqW.Gf();
        super.drawScreen(n2, n3, f2);
    }
}

