/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.bz;
import net.minecraft.client.gui.c;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.a;

public class by
extends bp {
    private final bp brW;
    private final a brX;
    protected String brY = "Options";
    private String brZ;

    public by(bp bp2, a a2) {
        this.brW = bp2;
        this.brX = a2;
    }

    @Override
    public void initGui() {
        int n2 = 0;
        this.brY = I18n.a("options.sounds.title", new Object[0]);
        this.brZ = I18n.a("options.off", new Object[0]);
        this.buttonList.add(new bz(this, SoundCategory.biH.Cu(), this.width / 2 - 155 + n2 % 2 * 160, this.height / 6 - 12 + 24 * (n2 >> 1), SoundCategory.biH, true));
        n2 += 2;
        for (SoundCategory soundCategory : SoundCategory.values()) {
            if (soundCategory == SoundCategory.biH) continue;
            this.buttonList.add(new bz(this, soundCategory.Cu(), this.width / 2 - 155 + n2 % 2 * 160, this.height / 6 - 12 + 24 * (n2 >> 1), soundCategory, false));
            ++n2;
        }
        this.buttonList.add(new c(200, this.width / 2 - 100, this.height / 6 + 168, I18n.a("gui.done", new Object[0])));
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled && c2.id == 200) {
            by.aER.aIY.QK();
            aER.a(this.brW);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.brY, this.width / 2, 15, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
    }

    protected String c(SoundCategory soundCategory) {
        float f2 = this.brX.d(soundCategory);
        return f2 == 0.0f ? this.brZ : (int)(f2 * 100.0f) + "%";
    }
}

