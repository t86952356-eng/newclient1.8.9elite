/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.be;
import net.optifine.ah;
import net.optifine.ai;

public class cd
extends GuiScreen
implements be {
    private String bsq = "";
    private String bsr = "";
    private int bmI;
    private boolean bss;
    private final ah bst = ai.aAQ();

    @Override
    public void cv(String string) {
        this.cu(string);
    }

    @Override
    public void cu(String string) {
        this.bsq = string;
        this.cx("Working...");
    }

    @Override
    public void cx(String string) {
        this.bsr = string;
        this.bv(0);
    }

    @Override
    public void bv(int n2) {
        this.bmI = n2;
    }

    @Override
    public void Ao() {
        this.bss = true;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void drawScreen(int var1_1, int var2_2, float var3_3) {
        block5: {
            block4: {
                if (!this.bss) break block4;
                if (!cd.aER.BL()) {
                    cd.aER.a((GuiScreen)null);
                }
                break block5;
            }
            if (this.bst == null) ** GOTO lbl-1000
            if (cd.aER.bgF == null) {
                this.bst.bE(this.width, this.height);
            } else lbl-1000:
            // 2 sources

            {
                this.drawDefaultBackground();
            }
            if (this.bmI > 0) {
                this.drawCenteredString(this.fontRendererObj, this.bsq, this.width / 2, 70, 0xFFFFFF);
                this.drawCenteredString(this.fontRendererObj, this.bsr + " " + this.bmI + "%", this.width / 2, 90, 0xFFFFFF);
            }
            super.drawScreen(var1_1, var2_2, var3_3);
        }
    }
}

