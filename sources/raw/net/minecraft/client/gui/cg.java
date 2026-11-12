/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.p;
import net.minecraft.util.s;
import net.minecraft.util.t;
import net.minecraft.world.ao;

public class cg
extends bp {
    private final bp bsK;
    private c bsL;
    private c bsM;
    private String bsN = "survival";
    private boolean bsO;

    public cg(bp bp2) {
        this.bsK = bp2;
    }

    @Override
    public void initGui() {
        this.buttonList.clear();
        this.buttonList.add(new c(101, this.width / 2 - 155, this.height - 28, 150, 20, I18n.a("lanServer.start", new Object[0])));
        this.buttonList.add(new c(102, this.width / 2 + 5, this.height - 28, 150, 20, I18n.a("gui.cancel", new Object[0])));
        this.bsM = new c(104, this.width / 2 - 155, 100, 150, 20, I18n.a("selectWorld.gameMode", new Object[0]));
        this.buttonList.add(this.bsM);
        this.bsL = new c(103, this.width / 2 + 5, 100, 150, 20, I18n.a("selectWorld.allowCommands", new Object[0]));
        this.buttonList.add(this.bsL);
        this.FQ();
    }

    private void FQ() {
        this.bsM.displayString = I18n.a("selectWorld.gameMode", new Object[0]) + " " + I18n.a("selectWorld.gameMode." + this.bsN, new Object[0]);
        this.bsL.displayString = I18n.a("selectWorld.allowCommands", new Object[0]) + " ";
        this.bsL.displayString = this.bsO ? this.bsL.displayString + I18n.a("options.on", new Object[0]) : this.bsL.displayString + I18n.a("options.off", new Object[0]);
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.id == 102) {
            aER.a(this.bsK);
        } else if (c2.id == 104) {
            this.bsN = this.bsN.equals("spectator") ? "creative" : (this.bsN.equals("creative") ? "adventure" : (this.bsN.equals("adventure") ? "survival" : "spectator"));
            this.FQ();
        } else if (c2.id == 103) {
            this.bsO = !this.bsO;
            this.FQ();
        } else if (c2.id == 101) {
            aER.a((bp)null);
            String string = aER.Bg().a(ao.gC(this.bsN), this.bsO);
            p p2 = string != null ? new t("commands.publish.started", string) : new s("commands.publish.failed");
            cg.aER.bha.Ey().c(p2);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.a("lanServer.title", new Object[0]), this.width / 2, 50, 0xFFFFFF);
        this.drawCenteredString(this.fontRendererObj, I18n.a("lanServer.otherPlayers", new Object[0]), this.width / 2, 82, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
    }
}

