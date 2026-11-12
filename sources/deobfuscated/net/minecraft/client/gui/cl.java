/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.gui;

import hackclient.rise.agn;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.bn;
import net.minecraft.client.gui.c;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.bt;
import org.lwjgl.input.Mouse;

public abstract class cl {
    protected final Minecraft mc;
    protected int width;
    protected int height;
    protected int top;
    protected int bottom;
    protected int right;
    protected int left;
    protected final int slotHeight;
    private int scrollUpButtonID;
    private int scrollDownButtonID;
    protected int mouseX;
    protected int mouseY;
    protected boolean field_148163_i = true;
    protected int initialClickY = -2;
    protected float scrollMultiplier;
    protected float amountScrolled;
    protected int selectedElement = -1;
    protected long lastClicked;
    protected boolean field_178041_q = true;
    protected boolean showSelectionBox = true;
    protected boolean hasListHeader;
    protected int headerPadding;
    private boolean enabled = true;
    agn scrollUtil = new agn();

    public cl(Minecraft minecraft, int n2, int n3, int n4, int n5, int n6) {
        this.mc = minecraft;
        this.width = n2;
        this.height = n3;
        this.top = n4;
        this.bottom = n5;
        this.slotHeight = n6;
        this.left = 0;
        this.right = n2;
    }

    public void setDimensions(int n2, int n3, int n4, int n5) {
        this.width = n2;
        this.height = n3;
        this.top = n4;
        this.bottom = n5;
        this.left = 0;
        this.right = n2;
    }

    public void setShowSelectionBox(boolean bl2) {
        this.showSelectionBox = bl2;
    }

    protected void setHasListHeader(boolean bl2, int n2) {
        this.hasListHeader = bl2;
        this.headerPadding = n2;
        if (!bl2) {
            this.headerPadding = 0;
        }
    }

    protected abstract int getSize();

    protected abstract void elementClicked(int var1, boolean var2, int var3, int var4);

    protected abstract boolean isSelected(int var1);

    protected int getContentHeight() {
        return this.getSize() * this.slotHeight + this.headerPadding;
    }

    protected abstract void drawBackground();

    protected void func_178040_a(int n2, int n3, int n4) {
    }

    protected abstract void drawSlot(int var1, int var2, int var3, int var4, int var5, int var6);

    protected void drawListHeader(int n2, int n3, Tessellator tessellator) {
    }

    protected void func_148132_a(int n2, int n3) {
    }

    protected void func_148142_b(int n2, int n3) {
    }

    public int getSlotIndexFromScreenCoords(int n2, int n3) {
        int n4 = this.left + this.width / 2 - this.getListWidth() / 2;
        int n5 = this.left + this.width / 2 + this.getListWidth() / 2;
        int n6 = n3 - this.top - this.headerPadding + (int)this.amountScrolled - 4;
        int n7 = n6 / this.slotHeight;
        return n2 < this.getScrollBarX() && n2 >= n4 && n2 <= n5 && n7 >= 0 && n6 >= 0 && n7 < this.getSize() ? n7 : -1;
    }

    public void registerScrollButtons(int n2, int n3) {
        this.scrollUpButtonID = n2;
        this.scrollDownButtonID = n3;
    }

    protected void bindAmountScrolled() {
        this.amountScrolled = bt.I(this.amountScrolled, 0.0f, this.func_148135_f());
    }

    public int func_148135_f() {
        return Math.max(0, this.getContentHeight() - (this.bottom - this.top - 4));
    }

    public int getAmountScrolled() {
        return (int)this.amountScrolled;
    }

    public boolean isMouseYWithinSlotBounds(int n2) {
        return n2 >= this.top && n2 <= this.bottom && this.mouseX >= this.left && this.mouseX <= this.right;
    }

    public void scrollBy(int n2) {
        this.amountScrolled += (float)n2;
        this.bindAmountScrolled();
        this.initialClickY = -2;
    }

    public void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id == this.scrollUpButtonID) {
                this.amountScrolled -= (float)(this.slotHeight * 2 / 3);
                this.initialClickY = -2;
                this.bindAmountScrolled();
            } else if (c2.id == this.scrollDownButtonID) {
                this.amountScrolled += (float)(this.slotHeight * 2 / 3);
                this.initialClickY = -2;
                this.bindAmountScrolled();
            }
        }
    }

    public void drawScreen(int n2, int n3, float f2) {
        if (this.field_178041_q) {
            this.mouseX = n2;
            this.mouseY = n3;
            this.drawBackground();
            int n4 = this.getScrollBarX();
            int n5 = n4 + 6;
            GlStateManager.JA();
            GlStateManager.JG();
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            this.drawContainerBackground(tessellator);
            this.scrollUtil.V(-this.func_148135_f());
            this.scrollUtil.qN();
            this.amountScrolled = (float)(-this.scrollUtil.scroll);
            int n6 = this.left + this.width / 2 - this.getListWidth() / 2 + 2;
            int n7 = this.top + 4 - (int)this.amountScrolled;
            if (this.hasListHeader) {
                this.drawListHeader(n6, n7, tessellator);
            }
            this.drawSelectionBox(n6, n7, n2, n3);
            GlStateManager.JD();
            int n8 = 4;
            this.overlayBackground(0, this.top, 255, 255);
            this.overlayBackground(this.bottom, this.height, 255, 255);
            GlStateManager.tQ();
            GlStateManager.h(770, 771, 0, 1);
            GlStateManager.Jy();
            GlStateManager.cP(7425);
            GlStateManager.JO();
            worldRenderer.a(7, DefaultVertexFormats.cbI);
            worldRenderer.F(this.left, this.top + 4, 0.0).r(0.0, 1.0).s(0, 0, 0, 0).Lx();
            worldRenderer.F(this.right, this.top + 4, 0.0).r(1.0, 1.0).s(0, 0, 0, 0).Lx();
            worldRenderer.F(this.right, this.top, 0.0).r(1.0, 0.0).s(0, 0, 0, 255).Lx();
            worldRenderer.F(this.left, this.top, 0.0).r(0.0, 0.0).s(0, 0, 0, 255).Lx();
            tessellator.pZ();
            worldRenderer.a(7, DefaultVertexFormats.cbI);
            worldRenderer.F(this.left, this.bottom, 0.0).r(0.0, 1.0).s(0, 0, 0, 255).Lx();
            worldRenderer.F(this.right, this.bottom, 0.0).r(1.0, 1.0).s(0, 0, 0, 255).Lx();
            worldRenderer.F(this.right, this.bottom - 4, 0.0).r(1.0, 0.0).s(0, 0, 0, 0).Lx();
            worldRenderer.F(this.left, this.bottom - 4, 0.0).r(0.0, 0.0).s(0, 0, 0, 0).Lx();
            tessellator.pZ();
            int n9 = this.func_148135_f();
            if (n9 > 0) {
                int n10 = (this.bottom - this.top) * (this.bottom - this.top) / this.getContentHeight();
                int n11 = (int)this.amountScrolled * (this.bottom - this.top - (n10 = bt.F(n10, 32, this.bottom - this.top - 8))) / n9 + this.top;
                if (n11 < this.top) {
                    n11 = this.top;
                }
                worldRenderer.a(7, DefaultVertexFormats.cbI);
                worldRenderer.F(n4, this.bottom, 0.0).r(0.0, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(n5, this.bottom, 0.0).r(1.0, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(n5, this.top, 0.0).r(1.0, 0.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(n4, this.top, 0.0).r(0.0, 0.0).s(0, 0, 0, 255).Lx();
                tessellator.pZ();
                worldRenderer.a(7, DefaultVertexFormats.cbI);
                worldRenderer.F(n4, n11 + n10, 0.0).r(0.0, 1.0).s(128, 128, 128, 255).Lx();
                worldRenderer.F(n5, n11 + n10, 0.0).r(1.0, 1.0).s(128, 128, 128, 255).Lx();
                worldRenderer.F(n5, n11, 0.0).r(1.0, 0.0).s(128, 128, 128, 255).Lx();
                worldRenderer.F(n4, n11, 0.0).r(0.0, 0.0).s(128, 128, 128, 255).Lx();
                tessellator.pZ();
                worldRenderer.a(7, DefaultVertexFormats.cbI);
                worldRenderer.F(n4, n11 + n10 - 1, 0.0).r(0.0, 1.0).s(192, 192, 192, 255).Lx();
                worldRenderer.F(n5 - 1, n11 + n10 - 1, 0.0).r(1.0, 1.0).s(192, 192, 192, 255).Lx();
                worldRenderer.F(n5 - 1, n11, 0.0).r(1.0, 0.0).s(192, 192, 192, 255).Lx();
                worldRenderer.F(n4, n11, 0.0).r(0.0, 0.0).s(192, 192, 192, 255).Lx();
                tessellator.pZ();
            }
            this.func_148142_b(n2, n3);
            GlStateManager.JN();
            GlStateManager.cP(7424);
            GlStateManager.tL();
            GlStateManager.tR();
        }
    }

    public void handleMouseInput() {
        if (this.isMouseYWithinSlotBounds(this.mouseY)) {
            int n2;
            int n3;
            int n4;
            int n5;
            if (Mouse.getEventButton() == 0 && Mouse.getEventButtonState() && this.mouseY >= this.top && this.mouseY <= this.bottom) {
                n5 = (this.width - this.getListWidth()) / 2;
                n4 = (this.width + this.getListWidth()) / 2;
                n3 = this.mouseY - this.top - this.headerPadding + (int)this.amountScrolled - 4;
                n2 = n3 / this.slotHeight;
                if (n2 < this.getSize() && this.mouseX >= n5 && this.mouseX <= n4 && n2 >= 0 && n3 >= 0) {
                    this.elementClicked(n2, false, this.mouseX, this.mouseY);
                    this.selectedElement = n2;
                } else if (this.mouseX >= n5 && this.mouseX <= n4 && n3 < 0) {
                    this.func_148132_a(this.mouseX - n5, this.mouseY - this.top + (int)this.amountScrolled - 4);
                }
            }
            if (Mouse.isButtonDown((int)0) && this.getEnabled()) {
                if (this.initialClickY != -1) {
                    if (this.initialClickY >= 0) {
                        this.amountScrolled -= (float)(this.mouseY - this.initialClickY) * this.scrollMultiplier;
                        this.initialClickY = this.mouseY;
                    }
                } else {
                    n5 = 1;
                    if (this.mouseY >= this.top && this.mouseY <= this.bottom) {
                        int n6;
                        n4 = (this.width - this.getListWidth()) / 2;
                        n3 = (this.width + this.getListWidth()) / 2;
                        n2 = this.mouseY - this.top - this.headerPadding + (int)this.amountScrolled - 4;
                        int n7 = n2 / this.slotHeight;
                        if (n7 < this.getSize() && this.mouseX >= n4 && this.mouseX <= n3 && n7 >= 0 && n2 >= 0) {
                            n6 = n7 == this.selectedElement && Minecraft.Bj() - this.lastClicked < 250L ? 1 : 0;
                            this.elementClicked(n7, n6 != 0, this.mouseX, this.mouseY);
                            this.selectedElement = n7;
                            this.lastClicked = Minecraft.Bj();
                        } else if (this.mouseX >= n4 && this.mouseX <= n3 && n2 < 0) {
                            this.func_148132_a(this.mouseX - n4, this.mouseY - this.top + (int)this.amountScrolled - 4);
                            n5 = 0;
                        }
                        n6 = this.getScrollBarX();
                        int n8 = n6 + 6;
                        if (this.mouseX >= n6 && this.mouseX <= n8) {
                            this.scrollMultiplier = -1.0f;
                            int n9 = this.func_148135_f();
                            if (n9 < 1) {
                                n9 = 1;
                            }
                            int n10 = (int)((float)((this.bottom - this.top) * (this.bottom - this.top)) / (float)this.getContentHeight());
                            n10 = bt.F(n10, 32, this.bottom - this.top - 8);
                            this.scrollMultiplier /= (float)(this.bottom - this.top - n10) / (float)n9;
                        } else {
                            this.scrollMultiplier = 1.0f;
                        }
                        this.initialClickY = n5 != 0 ? this.mouseY : -2;
                    } else {
                        this.initialClickY = -2;
                    }
                }
            } else {
                this.initialClickY = -1;
            }
            if ((n5 = Mouse.getEventDWheel()) != 0) {
                if (n5 > 0) {
                    n5 = -1;
                } else if (n5 < 0) {
                    n5 = 1;
                }
                this.amountScrolled += (float)(n5 * this.slotHeight / 2);
            }
        }
    }

    public void setEnabled(boolean bl2) {
        this.enabled = bl2;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public int getListWidth() {
        return 220;
    }

    protected void drawSelectionBox(int n2, int n3, int n4, int n5) {
        int n6 = this.getSize();
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        for (int i2 = 0; i2 < n6; ++i2) {
            int n7 = n3 + i2 * this.slotHeight + this.headerPadding;
            int n8 = this.slotHeight - 4;
            if (n7 > this.bottom || n7 + n8 < this.top) {
                this.func_178040_a(i2, n2, n7);
            }
            if (this.showSelectionBox && this.isSelected(i2)) {
                int n9 = this.left + (this.width / 2 - this.getListWidth() / 2);
                int n10 = this.left + this.width / 2 + this.getListWidth() / 2;
                GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
                GlStateManager.JO();
                worldRenderer.a(7, DefaultVertexFormats.cbI);
                worldRenderer.F(n9, n7 + n8 + 2, 0.0).r(0.0, 1.0).s(128, 128, 128, 255).Lx();
                worldRenderer.F(n10, n7 + n8 + 2, 0.0).r(1.0, 1.0).s(128, 128, 128, 255).Lx();
                worldRenderer.F(n10, n7 - 2, 0.0).r(1.0, 0.0).s(128, 128, 128, 255).Lx();
                worldRenderer.F(n9, n7 - 2, 0.0).r(0.0, 0.0).s(128, 128, 128, 255).Lx();
                worldRenderer.F(n9 + 1, n7 + n8 + 1, 0.0).r(0.0, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(n10 - 1, n7 + n8 + 1, 0.0).r(1.0, 1.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(n10 - 1, n7 - 1, 0.0).r(1.0, 0.0).s(0, 0, 0, 255).Lx();
                worldRenderer.F(n9 + 1, n7 - 1, 0.0).r(0.0, 0.0).s(0, 0, 0, 255).Lx();
                tessellator.pZ();
                GlStateManager.JN();
            }
            if (this instanceof bn && (n7 < this.top - this.slotHeight || n7 > this.bottom)) continue;
            this.drawSlot(i2, n2, n7, n8, n4, n5);
        }
    }

    protected int getScrollBarX() {
        return this.width / 2 + 124;
    }

    protected void overlayBackground(int n2, int n3, int n4, int n5) {
        Tessellator tessellator = Tessellator.Li();
        WorldRenderer worldRenderer = tessellator.Lj();
        this.mc.Bq().a(b.optionsBackground);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        float f2 = 32.0f;
        worldRenderer.a(7, DefaultVertexFormats.cbI);
        worldRenderer.F(this.left, n3, 0.0).r(0.0, (float)n3 / 32.0f).s(64, 64, 64, n5).Lx();
        worldRenderer.F(this.left + this.width, n3, 0.0).r((float)this.width / 32.0f, (float)n3 / 32.0f).s(64, 64, 64, n5).Lx();
        worldRenderer.F(this.left + this.width, n2, 0.0).r((float)this.width / 32.0f, (float)n2 / 32.0f).s(64, 64, 64, n4).Lx();
        worldRenderer.F(this.left, n2, 0.0).r(0.0, (float)n2 / 32.0f).s(64, 64, 64, n4).Lx();
        tessellator.pZ();
    }

    public void setSlotXBoundsFromLeft(int n2) {
        this.left = n2;
        this.right = n2 + this.width;
    }

    public int getSlotHeight() {
        return this.slotHeight;
    }

    protected void drawContainerBackground(Tessellator tessellator) {
        WorldRenderer worldRenderer = tessellator.Lj();
        this.mc.Bq().a(b.optionsBackground);
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        float f2 = 32.0f;
        worldRenderer.a(7, DefaultVertexFormats.cbI);
        worldRenderer.F(this.left, this.bottom, 0.0).r((float)this.left / 32.0f, (float)(this.bottom + (int)this.amountScrolled) / 32.0f).s(32, 32, 32, 255).Lx();
        worldRenderer.F(this.right, this.bottom, 0.0).r((float)this.right / 32.0f, (float)(this.bottom + (int)this.amountScrolled) / 32.0f).s(32, 32, 32, 255).Lx();
        worldRenderer.F(this.right, this.top, 0.0).r((float)this.right / 32.0f, (float)(this.top + (int)this.amountScrolled) / 32.0f).s(32, 32, 32, 255).Lx();
        worldRenderer.F(this.left, this.top, 0.0).r((float)this.left / 32.0f, (float)(this.top + (int)this.amountScrolled) / 32.0f).s(32, 32, 32, 255).Lx();
        tessellator.pZ();
    }
}

