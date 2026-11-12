/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.util.glu.Project
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.client.gui.cz;
import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.enchantment.a;
import net.minecraft.entity.player.g;
import net.minecraft.inventory.j;
import net.minecraft.item.co;
import net.minecraft.util.ae;
import net.minecraft.util.an;
import net.minecraft.util.bt;
import net.minecraft.util.cm;
import net.minecraft.world.p;
import net.minecraft.world.w;
import org.lwjgl.util.glu.Project;

public class s
extends i {
    private static final cm bmK = new cm("textures/gui/container/enchanting_table.png");
    private static final cm bmL = new cm("textures/entity/enchanting_table_book.png");
    private static final net.minecraft.client.model.i bmM = new net.minecraft.client.model.i();
    private final g bmN;
    private final Random bmO = new Random();
    private final j bmP;
    public int bmQ;
    public float bmR;
    public float bmS;
    public float bmT;
    public float bmU;
    public float bmV;
    public float bmW;
    co bmX;
    private final p bmY;

    public s(g g2, w w2, p p2) {
        super(new j(g2, w2));
        this.bmN = g2;
        this.bmP = (j)this.bwi;
        this.bmY = p2;
    }

    @Override
    protected void s(int n2, int n3) {
        this.fontRendererObj.a(this.bmY.xW().arq(), 12.0, 5.0, 0x404040);
        this.fontRendererObj.a(this.bmN.xW().arq(), 8.0, (double)(this.bwh - 96 + 2), 0x404040);
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        this.Er();
    }

    @Override
    public void mouseClicked(int n2, int n3, int n4) {
        super.mouseClicked(n2, n3, n4);
        int n5 = (this.width - this.bwg) / 2;
        int n6 = (this.height - this.bwh) / 2;
        for (int i2 = 0; i2 < 3; ++i2) {
            int n7 = n2 - (n5 + 60);
            int n8 = n3 - (n6 + 14 + 19 * i2);
            if (n7 < 0 || n8 < 0 || n7 >= 108 || n8 >= 19) continue;
            if (!this.bmP.c((net.minecraft.entity.player.a)s.aER.bgK, i2)) continue;
            s.aER.bgu.I(this.bmP.cSL, i2);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void b(float var1_1, int var2_2, int var3_3) {
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        s.aER.Bq().a(s.bmK);
        var4_4 = (this.width - this.bwg) / 2;
        var5_5 = (this.height - this.bwh) / 2;
        this.drawTexturedModalRect((float)var4_4, var5_5, 0, 0, this.bwg, this.bwh);
        GlStateManager.JV();
        GlStateManager.cR(5889);
        GlStateManager.JV();
        GlStateManager.JU();
        var6_6 = new cz(s.aER);
        GlStateManager.i((var6_6.getScaledWidth() - 320) / 2 * var6_6.getScaleFactor(), (var6_6.getScaledHeight() - 240) / 2 * var6_6.getScaleFactor(), 320 * var6_6.getScaleFactor(), 240 * var6_6.getScaleFactor());
        GlStateManager.j(-0.34f, 0.23f, 0.0f);
        Project.gluPerspective((float)90.0f, (float)1.3333334f, (float)9.0f, (float)80.0f);
        var7_7 = 1.0f;
        GlStateManager.cR(5888);
        GlStateManager.JU();
        RenderHelper.Lg();
        GlStateManager.j(0.0f, 3.3f, -16.0f);
        GlStateManager.i(1.0f, 1.0f, 1.0f);
        var8_8 = 5.0f;
        GlStateManager.i(5.0f, 5.0f, 5.0f);
        GlStateManager.d(180.0f, 0.0f, 0.0f, 1.0f);
        s.aER.Bq().a(s.bmL);
        GlStateManager.d(20.0f, 1.0f, 0.0f, 0.0f);
        var9_9 = this.bmW + (this.bmV - this.bmW) * var1_1;
        GlStateManager.j((1.0f - var9_9) * 0.2f, (1.0f - var9_9) * 0.1f, (1.0f - var9_9) * 0.25f);
        GlStateManager.d(-(1.0f - var9_9) * 90.0f - 90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.d(180.0f, 1.0f, 0.0f, 0.0f);
        var10_10 = this.bmS + (this.bmR - this.bmS) * var1_1 + 0.25f;
        var11_11 = this.bmS + (this.bmR - this.bmS) * var1_1 + 0.75f;
        var10_10 = (var10_10 - (float)bt.aE(var10_10)) * 1.6f - 0.3f;
        var11_11 = (var11_11 - (float)bt.aE(var11_11)) * 1.6f - 0.3f;
        if (var10_10 < 0.0f) {
            var10_10 = 0.0f;
        }
        if (var11_11 < 0.0f) {
            var11_11 = 0.0f;
        }
        if (var10_10 > 1.0f) {
            var10_10 = 1.0f;
        }
        if (var11_11 > 1.0f) {
            var11_11 = 1.0f;
        }
        GlStateManager.JS();
        s.bmM.a(null, 0.0f, var10_10, var11_11, var9_9, 0.0f, 0.0625f);
        GlStateManager.JT();
        RenderHelper.Lf();
        GlStateManager.cR(5889);
        GlStateManager.i(0, 0, s.aER.bgz, s.aER.bgA);
        GlStateManager.JW();
        GlStateManager.cR(5888);
        GlStateManager.JW();
        RenderHelper.Lf();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        ae.asr().y(this.bmP.cIx);
        var12_12 = this.bmP.adg();
        for (var13_13 = 0; var13_13 < 3; ++var13_13) {
            block10: {
                var14_14 = var4_4 + 60;
                var15_15 = var14_14 + 20;
                var16_16 = 86;
                var17_17 = ae.asr().ass();
                s.zLevel = 0.0f;
                s.aER.Bq().a(s.bmK);
                var18_18 = this.bmP.cTf[var13_13];
                GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
                if (var18_18 == 0) {
                    this.drawTexturedModalRect((float)var14_14, var5_5 + 14 + 19 * var13_13, 0, 185, 108, 19);
                    continue;
                }
                var19_19 = "" + var18_18;
                var20_20 = s.aER.bgQ;
                var21_21 = 6839882;
                if (var12_12 < var13_13 + 1) break block10;
                if (s.aER.bgK.cIu >= var18_18) ** GOTO lbl-1000
            }
            if (!s.aER.bgK.cIt.cJM) {
                this.drawTexturedModalRect((float)var14_14, var5_5 + 14 + 19 * var13_13, 0, 185, 108, 19);
                this.drawTexturedModalRect((float)(var14_14 + 1), var5_5 + 15 + 19 * var13_13, 16 * var13_13, 239, 16, 16);
                var20_20.a(var17_17, var15_15, var5_5 + 16 + 19 * var13_13, 86, (var21_21 & 0xFEFEFE) >> 1);
                var21_21 = 4226832;
            } else lbl-1000:
            // 2 sources

            {
                var22_22 = var2_2 - (var4_4 + 60);
                var23_23 = var3_3 - (var5_5 + 14 + 19 * var13_13);
                if (var22_22 >= 0 && var23_23 >= 0 && var22_22 < 108 && var23_23 < 19) {
                    this.drawTexturedModalRect((float)var14_14, var5_5 + 14 + 19 * var13_13, 0, 204, 108, 19);
                    var21_21 = 0xFFFF80;
                } else {
                    this.drawTexturedModalRect((float)var14_14, var5_5 + 14 + 19 * var13_13, 0, 166, 108, 19);
                }
                this.drawTexturedModalRect((float)(var14_14 + 1), var5_5 + 15 + 19 * var13_13, 16 * var13_13, 223, 16, 16);
                var20_20.a(var17_17, var15_15, var5_5 + 16 + 19 * var13_13, 86, var21_21);
                var21_21 = 8453920;
            }
            var20_20 = s.aER.fontRendererObj;
            var20_20.b(var19_19, var15_15 + 86 - var20_20.bQ(var19_19), var5_5 + 16 + 19 * var13_13 + 7, var21_21);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        super.drawScreen(n2, n3, f2);
        boolean bl2 = s.aER.bgK.cIt.cJM;
        int n4 = this.bmP.adg();
        for (int i2 = 0; i2 < 3; ++i2) {
            String string;
            int n5 = this.bmP.cTf[i2];
            int n6 = this.bmP.cTg[i2];
            int n7 = i2 + 1;
            if (!this.c(60, 14 + 19 * i2, 108, 17, n2, n3) || n5 <= 0 || n6 < 0) continue;
            ArrayList arrayList = Lists.newArrayList();
            if (a.eh(n6 & 0xFF) != null) {
                string = a.eh(n6 & 0xFF).ek((n6 & 0xFF00) >> 8);
                arrayList.add(an.dwa.toString() + String.valueOf((Object)an.dwg) + I18n.a("container.enchant.clue", string));
            }
            if (!bl2) {
                arrayList.add("");
                if (s.aER.bgK.cIu < n5) {
                    arrayList.add(String.valueOf((Object)an.dvX) + "Level Requirement: " + this.bmP.cTf[i2]);
                } else {
                    string = "";
                    string = n7 == 1 ? I18n.a("container.enchant.lapis.one", new Object[0]) : I18n.a("container.enchant.lapis.many", n7);
                    if (n4 >= n7) {
                        arrayList.add(String.valueOf((Object)an.dvS) + string);
                    } else {
                        arrayList.add(String.valueOf((Object)an.dvX) + string);
                    }
                    string = n7 == 1 ? I18n.a("container.enchant.level.one", new Object[0]) : I18n.a("container.enchant.level.many", n7);
                    arrayList.add(String.valueOf((Object)an.dvS) + string);
                }
            }
            this.drawHoveringText(arrayList, n2, n3);
            break;
        }
    }

    public void Er() {
        co co2 = this.bwi.fM(0).ls();
        if (!co.d(co2, this.bmX)) {
            this.bmX = co2;
            do {
                this.bmT += (float)(this.bmO.nextInt(4) - this.bmO.nextInt(4));
            } while (!(this.bmR > this.bmT + 1.0f) && !(this.bmR < this.bmT - 1.0f));
        }
        ++this.bmQ;
        this.bmS = this.bmR;
        this.bmW = this.bmV;
        boolean bl2 = false;
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.bmP.cTf[i2] == 0) continue;
            bl2 = true;
            break;
        }
        this.bmV = bl2 ? (this.bmV += 0.2f) : (this.bmV -= 0.2f);
        this.bmV = bt.I(this.bmV, 0.0f, 1.0f);
        float f2 = (this.bmT - this.bmR) * 0.4f;
        float f3 = 0.2f;
        f2 = bt.I(f2, -0.2f, 0.2f);
        this.bmU += (f2 - this.bmU) * 0.9f;
        this.bmR += this.bmU;
    }
}

