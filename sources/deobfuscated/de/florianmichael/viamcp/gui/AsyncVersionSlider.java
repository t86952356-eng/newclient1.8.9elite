/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package de.florianmichael.viamcp.gui;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.c;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.bt;

public class AsyncVersionSlider
extends c {
    private float dragValue = (float)ViaLoadingBase.PROTOCOLS.indexOf(ViaLoadingBase.getInstance().getTargetVersion()) / (float)(ViaLoadingBase.PROTOCOLS.size() - 1);
    private final List<ProtocolVersion> values = ViaLoadingBase.PROTOCOLS;
    private float sliderValue;
    public boolean dragging;

    public AsyncVersionSlider(int n2, int n3, int n4, int n5, int n6) {
        super(n2, n3, n4, Math.max(n5, 110), n6, "");
        Collections.reverse(this.values);
        this.sliderValue = this.dragValue;
        this.displayString = this.values.get((int)Math.ceil(this.sliderValue * (float)(this.values.size() - 1))).getName();
    }

    @Override
    public void drawButton(Minecraft minecraft, int n2, int n3) {
        super.drawButton(minecraft, n2, n3);
    }

    @Override
    protected int getHoverState(boolean bl2) {
        return 0;
    }

    @Override
    protected void mouseDragged(Minecraft minecraft, int n2, int n3) {
        if (this.visible) {
            if (this.dragging) {
                this.sliderValue = (float)(n2 - (this.xPosition + 4)) / (float)(this.buttonWidth - 8);
                this.dragValue = this.sliderValue = bt.I(this.sliderValue, 0.0f, 1.0f);
                int n4 = (int)Math.ceil(this.sliderValue * (float)(this.values.size() - 1));
                this.displayString = this.values.get(n4).getName();
                ViaLoadingBase.getInstance().reload(this.values.get(n4));
            }
            minecraft.Bq().a(buttonTextures);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.drawTexturedModalRect((float)(this.xPosition + (int)(this.sliderValue * (float)(this.buttonWidth - 8))), this.yPosition, 0, 66, 4, 20);
            this.drawTexturedModalRect((float)(this.xPosition + (int)(this.sliderValue * (float)(this.buttonWidth - 8)) + 4), this.yPosition, 196, 66, 4, 20);
        }
    }

    @Override
    public boolean mousePressed(Minecraft minecraft, int n2, int n3) {
        if (super.mousePressed(minecraft, n2, n3)) {
            this.sliderValue = (float)(n2 - (this.xPosition + 4)) / (float)(this.buttonWidth - 8);
            this.dragValue = this.sliderValue = bt.I(this.sliderValue, 0.0f, 1.0f);
            int n4 = (int)Math.ceil(this.sliderValue * (float)(this.values.size() - 1));
            this.displayString = this.values.get(n4).getName();
            ViaLoadingBase.getInstance().reload(this.values.get(n4));
            this.dragging = true;
            return true;
        }
        return false;
    }

    @Override
    public void mouseReleased(int n2, int n3) {
        this.dragging = false;
    }

    public void setVersion(int n2) {
        this.sliderValue = this.dragValue = (float)ViaLoadingBase.PROTOCOLS.indexOf(ProtocolVersion.getProtocol((int)n2)) / (float)(ViaLoadingBase.PROTOCOLS.size() - 1);
        int n3 = (int)(this.sliderValue * (float)(this.values.size() - 1) + 0.5f);
        this.displayString = this.values.get(n3).getName();
    }
}

