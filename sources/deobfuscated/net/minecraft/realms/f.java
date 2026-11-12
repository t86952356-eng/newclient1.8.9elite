/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.realms;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.e;
import net.minecraft.util.cm;

public class f {
    protected static final cm WIDGETS_LOCATION = new cm("textures/gui/widgets.png");
    private final e proxy;

    public f(int n2, int n3, int n4, String string) {
        this.proxy = new e(this, n2, n3, n4, string);
    }

    public f(int n2, int n3, int n4, int n5, int n6, String string) {
        this.proxy = new e(this, n2, n3, n4, string, n5, n6);
    }

    public c getProxy() {
        return this.proxy;
    }

    public int id() {
        return this.proxy.getId();
    }

    public boolean active() {
        return this.proxy.getEnabled();
    }

    public void active(boolean bl2) {
        this.proxy.setEnabled(bl2);
    }

    public void msg(String string) {
        this.proxy.bX(string);
    }

    public int getWidth() {
        return this.proxy.getButtonWidth();
    }

    public int getHeight() {
        return this.proxy.DT();
    }

    public int y() {
        return this.proxy.DR();
    }

    public void render(int n2, int n3) {
        this.proxy.drawButton(Minecraft.getMinecraft(), n2, n3);
    }

    public void clicked(int n2, int n3) {
    }

    public void released(int n2, int n3) {
    }

    public void blit(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.proxy.drawTexturedModalRect((float)n2, n3, n4, n5, n6, n7);
    }

    public void renderBg(int n2, int n3) {
    }

    public int getYImage(boolean bl2) {
        return this.proxy.W(bl2);
    }
}

