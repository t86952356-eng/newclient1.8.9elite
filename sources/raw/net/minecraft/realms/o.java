/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.realms;

import net.minecraft.client.gui.cm;
import net.minecraft.realms.y;

public class o {
    private final cm proxy;

    public o(int n2, int n3, int n4, int n5, int n6) {
        this.proxy = new cm(this, n2, n3, n4, n5, n6);
    }

    public void render(int n2, int n3, float f2) {
        this.proxy.drawScreen(n2, n3, f2);
    }

    public int width() {
        return this.proxy.FV();
    }

    public int ym() {
        return this.proxy.FW();
    }

    public int xm() {
        return this.proxy.FX();
    }

    protected void renderItem(int n2, int n3, int n4, int n5, y y2, int n6, int n7) {
    }

    public void renderItem(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.renderItem(n2, n3, n4, n5, y.djn, n6, n7);
    }

    public int getItemCount() {
        return 0;
    }

    public void selectItem(int n2, boolean bl2, int n3, int n4) {
    }

    public boolean isSelectedItem(int n2) {
        return false;
    }

    public void renderBackground() {
    }

    public int getMaxPosition() {
        return 0;
    }

    public int getScrollbarPosition() {
        return this.proxy.FV() / 2 + 124;
    }

    public void mouseEvent() {
        this.proxy.handleMouseInput();
    }

    public void scroll(int n2) {
        this.proxy.scrollBy(n2);
    }

    public int getScroll() {
        return this.proxy.getAmountScrolled();
    }

    protected void renderList(int n2, int n3, int n4, int n5) {
    }
}

