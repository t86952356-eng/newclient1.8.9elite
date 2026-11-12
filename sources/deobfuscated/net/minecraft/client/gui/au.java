/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.af;
import net.minecraft.client.gui.ak;
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.at;
import net.minecraft.client.gui.av;
import net.minecraft.client.gui.by;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cb;
import net.minecraft.client.gui.cn;
import net.minecraft.client.gui.cs;
import net.minecraft.client.gui.cu;
import net.minecraft.client.gui.cv;
import net.minecraft.client.gui.da;
import net.minecraft.client.gui.j;
import net.minecraft.client.gui.n;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.a;
import net.minecraft.util.s;
import net.minecraft.util.t;
import net.minecraft.world.f;

public class au
extends GuiScreen
implements cv {
    private static final net.minecraft.client.settings.c[] bqg = new net.minecraft.client.settings.c[]{net.minecraft.client.settings.c.cjL};
    private final GuiScreen bqh;
    private final a bqi;
    private c bqj;
    private ak bqk;
    protected String bql = "Options";

    public au(GuiScreen guiScreen, a a2) {
        this.bqh = guiScreen;
        this.bqi = a2;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public void initGui() {
        block6: {
            block5: {
                var1_1 = 0;
                this.bql = I18n.a("options.title", new Object[0]);
                for (net.minecraft.client.settings.c var5_5 : au.bqg) {
                    if (var5_5.QV()) {
                        this.buttonList.add(new at(var5_5.QX(), this.width / 2 - 155 + var1_1 % 2 * 160, this.height / 6 - 12 + 24 * (var1_1 >> 1), var5_5));
                    } else {
                        var6_6 = new as(var5_5.QX(), this.width / 2 - 155 + var1_1 % 2 * 160, this.height / 6 - 12 + 24 * (var1_1 >> 1), var5_5, this.bqi.c(var5_5));
                        this.buttonList.add(var6_6);
                    }
                    ++var1_1;
                }
                if (au.aER.bgF == null) break block5;
                var2_2 /* !! */  = au.aER.bgF.agm();
                this.bqj = new c(108, this.width / 2 - 155 + var1_1 % 2 * 160, this.height / 6 - 12 + 24 * (var1_1 >> 1), 150, 20, this.a((f)var2_2 /* !! */ ));
                this.buttonList.add(this.bqj);
                /* ANDROID/VANILLA PORT NOTE: CFR GOTO lbl-1000 restructured. */
                if (au.aER.isSingleplayer() && !au.aER.bgF.avH().azv()) {
                    this.bqj.setWidth(this.bqj.getButtonWidth() - 20);
                    this.bqk = new ak(109, this.bqj.xPosition + this.bqj.getButtonWidth(), this.bqj.yPosition);
                    this.buttonList.add(this.bqk);
                    this.bqk.ab(au.aER.bgF.avH().isDifficultyLocked());
                    this.bqk.enabled = this.bqk.EG() == false;
                    this.bqj.enabled = this.bqk.EG() == false;
                } else {
                    this.bqj.enabled = false;
                }
                break block6;
            }
            var2_2 /* !! */  = new as(net.minecraft.client.settings.c.ckr.QX(), this.width / 2 - 155 + var1_1 % 2 * 160, this.height / 6 - 12 + 24 * (var1_1 >> 1), net.minecraft.client.settings.c.ckr, this.bqi.c(net.minecraft.client.settings.c.ckr));
            this.buttonList.add(var2_2 /* !! */ );
        }
        this.buttonList.add(new c(110, this.width / 2 - 155, this.height / 6 + 48 - 6, 150, 20, I18n.a("options.skinCustomisation", new Object[0])));
        this.buttonList.add(new av(this, 8675309, this.width / 2 + 5, this.height / 6 + 48 - 6, 150, 20, "Super Secret Settings..."));
        this.buttonList.add(new c(106, this.width / 2 - 155, this.height / 6 + 72 - 6, 150, 20, I18n.a("options.sounds", new Object[0])));
        this.buttonList.add(new c(101, this.width / 2 - 155, this.height / 6 + 96 - 6, 150, 20, I18n.a("options.video", new Object[0])));
        this.buttonList.add(new c(100, this.width / 2 + 5, this.height / 6 + 96 - 6, 150, 20, I18n.a("options.controls", new Object[0])));
        this.buttonList.add(new c(102, this.width / 2 - 155, this.height / 6 + 120 - 6, 150, 20, I18n.a("options.language", new Object[0])));
        this.buttonList.add(new c(103, this.width / 2 + 5, this.height / 6 + 120 - 6, 150, 20, I18n.a("options.chat.title", new Object[0])));
        this.buttonList.add(new c(105, this.width / 2 - 155, this.height / 6 + 144 - 6, 150, 20, I18n.a("options.resourcepack", new Object[0])));
        this.buttonList.add(new c(104, this.width / 2 + 5, this.height / 6 + 144 - 6, 150, 20, I18n.a("options.snooper.view", new Object[0])));
        this.buttonList.add(new c(200, this.width / 2 - 100, this.height / 6 + 168, I18n.a("gui.done", new Object[0])));
    }

    public String a(f f2) {
        s s2 = new s("");
        s2.n(new t("options.difficulty", new Object[0]));
        s2.ga(": ");
        s2.n(new t(f2.ava(), new Object[0]));
        return s2.getFormattedText();
    }

    @Override
    public void confirmClicked(boolean bl2, int n2) {
        aER.a(this);
        if (n2 == 109 && bl2) {
            if (au.aER.bgF != null) {
                au.aER.bgF.avH().cJ(true);
                this.bqk.ab(true);
                this.bqk.enabled = false;
                this.bqj.enabled = false;
            }
        }
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id < 100 && c2 instanceof as) {
                net.minecraft.client.settings.c c3 = ((as)c2).Fa();
                this.bqi.a(c3, 1);
                c2.displayString = this.bqi.c(net.minecraft.client.settings.c.dZ(c2.id));
            }
            if (c2.id == 108) {
                au.aER.bgF.avH().c(f.ib(au.aER.bgF.agm().auZ() + 1));
                this.bqj.displayString = this.a(au.aER.bgF.agm());
            }
            if (c2.id == 109) {
                Object[] objectArray = new Object[1];
                objectArray[0] = new t(au.aER.bgF.avH().agm().ava(), new Object[0]);
                aER.a(new cu(this, new t("difficulty.lock.title", new Object[0]).getFormattedText(), new t("difficulty.lock.question", objectArray).getFormattedText(), 109));
            }
            if (c2.id == 110) {
                au.aER.aIY.QK();
                aER.a(new n(this));
            }
            if (c2.id == 8675309) {
                au.aER.bgT.Jf();
            }
            if (c2.id == 101) {
                au.aER.aIY.QK();
                aER.a(new cs(this, this.bqi));
            }
            if (c2.id == 100) {
                au.aER.aIY.QK();
                aER.a(new j(this, this.bqi));
            }
            if (c2.id == 102) {
                au.aER.aIY.QK();
                aER.a(new af(this, this.bqi, aER.Bt()));
            }
            if (c2.id == 103) {
                au.aER.aIY.QK();
                aER.a(new da(this, this.bqi));
            }
            if (c2.id == 104) {
                au.aER.aIY.QK();
                aER.a(new cn(this, this.bqi));
            }
            if (c2.id == 200) {
                au.aER.aIY.QK();
                aER.a(this.bqh);
            }
            if (c2.id == 105) {
                au.aER.aIY.QK();
                aER.a(new cb(this));
            }
            if (c2.id == 106) {
                au.aER.aIY.QK();
                aER.a(new by(this, this.bqi));
            }
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.bql, this.width / 2, 15, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
    }
}

