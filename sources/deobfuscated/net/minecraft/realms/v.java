/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.realms;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.realms.f;
import net.minecraft.util.bt;

public class v
extends f {
    public float value = 1.0f;
    public boolean sliding;
    private final float minValue;
    private final float maxValue;
    private int steps;

    public v(int n2, int n3, int n4, int n5, int n6, int n7) {
        this(n2, n3, n4, n5, n7, 0, 1.0f, n6);
    }

    public v(int n2, int n3, int n4, int n5, int n6, int n7, float f2, float f3) {
        super(n2, n3, n4, n5, 20, "");
        this.minValue = f2;
        this.maxValue = f3;
        this.value = this.toPct(n7);
        this.getProxy().displayString = this.getMessage();
    }

    public String getMessage() {
        return "";
    }

    public float toPct(float f2) {
        return bt.I((this.clamp(f2) - this.minValue) / (this.maxValue - this.minValue), 0.0f, 1.0f);
    }

    public float toValue(float f2) {
        return this.clamp(this.minValue + (this.maxValue - this.minValue) * bt.I(f2, 0.0f, 1.0f));
    }

    public float clamp(float f2) {
        f2 = this.clampSteps(f2);
        return bt.I(f2, this.minValue, this.maxValue);
    }

    protected float clampSteps(float f2) {
        if (this.steps > 0) {
            f2 = this.steps * Math.round(f2 / (float)this.steps);
        }
        return f2;
    }

    @Override
    public int getYImage(boolean bl2) {
        return 0;
    }

    @Override
    public void renderBg(int n2, int n3) {
        if (this.getProxy().visible) {
            if (this.sliding) {
                this.value = (float)(n2 - (this.getProxy().xPosition + 4)) / (float)(this.getProxy().getButtonWidth() - 8);
                this.value = bt.I(this.value, 0.0f, 1.0f);
                float f2 = this.toValue(this.value);
                this.clicked(f2);
                this.value = this.toPct(f2);
                this.getProxy().displayString = this.getMessage();
            }
            Minecraft.getMinecraft().Bq().a(WIDGETS_LOCATION);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            this.blit(this.getProxy().xPosition + (int)(this.value * (float)(this.getProxy().getButtonWidth() - 8)), this.getProxy().yPosition, 0, 66, 4, 20);
            this.blit(this.getProxy().xPosition + (int)(this.value * (float)(this.getProxy().getButtonWidth() - 8)) + 4, this.getProxy().yPosition, 196, 66, 4, 20);
        }
    }

    @Override
    public void clicked(int n2, int n3) {
        this.value = (float)(n2 - (this.getProxy().xPosition + 4)) / (float)(this.getProxy().getButtonWidth() - 8);
        this.value = bt.I(this.value, 0.0f, 1.0f);
        this.clicked(this.toValue(this.value));
        this.getProxy().displayString = this.getMessage();
        this.sliding = true;
    }

    public void clicked(float f2) {
    }

    @Override
    public void released(int n2, int n3) {
        this.sliding = false;
    }
}

