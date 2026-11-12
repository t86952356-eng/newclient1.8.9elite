/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import hackclient.rise.agg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.e;
import net.minecraft.item.co;
import net.minecraft.realms.f;
import net.minecraft.realms.n;

public class ca
extends bp {
    private final n bsf;

    public ca(n n2) {
        this.bsf = n2;
        this.buttonList = Collections.synchronizedList(Lists.newArrayList());
    }

    public n FH() {
        return this.bsf;
    }

    @Override
    public void initGui() {
        this.bsf.init();
        super.initGui();
    }

    public void a(String string, int n2, int n3, int n4) {
        super.drawCenteredString(this.fontRendererObj, string, n2, n3, n4);
    }

    public void b(String string, int n2, int n3, int n4, boolean bl2) {
        if (bl2) {
            super.drawString(this.fontRendererObj, string, n2, n3, n4);
        } else {
            this.fontRendererObj.a(string, (double)n2, (double)n3, n4);
        }
    }

    @Override
    public void drawTexturedModalRect(float f2, int n2, int n3, int n4, int n5, int n6) {
        this.bsf.blit(f2, n2, n3, n4, n5, n6);
        super.drawTexturedModalRect(f2, n2, n3, n4, n5, n6);
    }

    @Override
    public void drawGradientRect(int n2, int n3, int n4, int n5, int n6, int n7) {
        super.drawGradientRect(n2, n3, n4, n5, n6, n7);
    }

    @Override
    public void drawDefaultBackground() {
        super.drawDefaultBackground();
    }

    @Override
    public boolean doesGuiPauseGame() {
        return super.doesGuiPauseGame();
    }

    @Override
    public void drawWorldBackground(int n2) {
        super.drawWorldBackground(n2);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.bsf.render(n2, n3, f2);
    }

    @Override
    public void renderToolTip(co co2, int n2, int n3) {
        super.renderToolTip(co2, n2, n3);
    }

    @Override
    public void drawCreativeTabHoveringText(String string, int n2, int n3) {
        super.drawCreativeTabHoveringText(string, n2, n3);
    }

    @Override
    public void drawHoveringText(List<String> list, int n2, int n3) {
        super.drawHoveringText(list, n2, n3);
    }

    @Override
    public void updateScreen() {
        this.bsf.tick();
        super.updateScreen();
    }

    public int FI() {
        return agg.aIF;
    }

    public int cS(String string) {
        return this.fontRendererObj.bQ(string);
    }

    public void b(String string, int n2, int n3, int n4) {
        this.fontRendererObj.b(string, n2, n3, n4);
    }

    public List<String> u(String string, int n2) {
        return this.fontRendererObj.m(string, n2);
    }

    @Override
    public final void actionPerformed(c c2) {
        this.bsf.buttonClicked(((e)c2).DS());
    }

    public void FJ() {
        this.buttonList.clear();
    }

    public void a(f f2) {
        this.buttonList.add(f2.getProxy());
    }

    public List<f> FK() {
        ArrayList arrayList = Lists.newArrayListWithExpectedSize((int)this.buttonList.size());
        for (c c2 : this.buttonList) {
            arrayList.add(((e)c2).DS());
        }
        return arrayList;
    }

    public void b(f f2) {
        this.buttonList.remove(f2.getProxy());
    }

    @Override
    public void mouseClicked(int n2, int n3, int n4) {
        this.bsf.mouseClicked(n2, n3, n4);
        super.mouseClicked(n2, n3, n4);
    }

    @Override
    public void handleMouseInput() {
        this.bsf.mouseEvent();
        super.handleMouseInput();
    }

    @Override
    public void handleKeyboardInput() {
        this.bsf.keyboardEvent();
        super.handleKeyboardInput();
    }

    @Override
    public void mouseReleased(int n2, int n3, int n4) {
        this.bsf.mouseReleased(n2, n3, n4);
    }

    @Override
    public void mouseClickMove(int n2, int n3, int n4, long l2) {
        this.bsf.mouseDragged(n2, n3, n4, l2);
    }

    @Override
    public void keyTyped(char c2, int n2) {
        this.bsf.keyPressed(c2, n2);
    }

    @Override
    public void confirmClicked(boolean bl2, int n2) {
        this.bsf.confirmResult(bl2, n2);
    }

    @Override
    public void onGuiClosed() {
        this.bsf.removed();
        super.onGuiClosed();
    }
}

