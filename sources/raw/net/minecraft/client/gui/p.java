/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.primitives.Floats
 */
package net.minecraft.client.gui;

import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;
import java.util.Random;
import net.minecraft.client.gui.ah;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.ba;
import net.minecraft.client.gui.bb;
import net.minecraft.client.gui.bc;
import net.minecraft.client.gui.bd;
import net.minecraft.client.gui.be;
import net.minecraft.client.gui.bf;
import net.minecraft.client.gui.bg;
import net.minecraft.client.gui.bh;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.bu;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cj;
import net.minecraft.client.gui.ck;
import net.minecraft.client.gui.cq;
import net.minecraft.client.gui.m;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.bt;
import net.minecraft.world.biome.j;
import net.minecraft.world.gen.h;

public class p
extends bp
implements bg,
ck {
    private final m bmg;
    protected String bmh = "Customize World Settings";
    protected String bmi = "Page 1 of 3";
    protected String bmj = "Basic Settings";
    protected String[] bmk = new String[4];
    private ba bml;
    private c bmm;
    private c bmn;
    private c bmo;
    private c bmp;
    private c bmq;
    private c bmr;
    private c bms;
    private c bmt;
    private boolean bmu = false;
    private int bmv = 0;
    private boolean bmw = false;
    private final Predicate<String> bmx = string -> {
        Float f2 = Floats.tryParse((String)string);
        return string.length() == 0 || f2 != null && Floats.isFinite((float)f2.floatValue()) && f2.floatValue() >= 0.0f;
    };
    private final h bmy = new h();
    private h bmz;
    private final Random bmA = new Random();

    public p(bp bp2, String string2) {
        this.bmg = (m)bp2;
        this.cH(string2);
    }

    @Override
    public void initGui() {
        int n2 = 0;
        int n3 = 0;
        if (this.bml != null) {
            n2 = this.bml.Fi();
            n3 = this.bml.getAmountScrolled();
        }
        this.bmh = I18n.a("options.customizeTitle", new Object[0]);
        this.buttonList.clear();
        this.bmp = new c(302, 20, 5, 80, 20, I18n.a("createWorld.customize.custom.prev", new Object[0]));
        this.buttonList.add(this.bmp);
        this.bmq = new c(303, this.width - 100, 5, 80, 20, I18n.a("createWorld.customize.custom.next", new Object[0]));
        this.buttonList.add(this.bmq);
        this.bmo = new c(304, this.width / 2 - 187, this.height - 27, 90, 20, I18n.a("createWorld.customize.custom.defaults", new Object[0]));
        this.buttonList.add(this.bmo);
        this.bmn = new c(301, this.width / 2 - 92, this.height - 27, 90, 20, I18n.a("createWorld.customize.custom.randomize", new Object[0]));
        this.buttonList.add(this.bmn);
        this.bmt = new c(305, this.width / 2 + 3, this.height - 27, 90, 20, I18n.a("createWorld.customize.custom.presets", new Object[0]));
        this.buttonList.add(this.bmt);
        this.bmm = new c(300, this.width / 2 + 98, this.height - 27, 90, 20, I18n.a("gui.done", new Object[0]));
        this.buttonList.add(this.bmm);
        this.bmo.enabled = this.bmu;
        this.bmr = new c(306, this.width / 2 - 55, 160, 50, 20, I18n.a("gui.yes", new Object[0]));
        this.bmr.visible = false;
        this.buttonList.add(this.bmr);
        this.bms = new c(307, this.width / 2 + 5, 160, 50, 20, I18n.a("gui.no", new Object[0]));
        this.bms.visible = false;
        this.buttonList.add(this.bms);
        if (this.bmv != 0) {
            this.bmr.visible = true;
            this.bms.visible = true;
        }
        this.Ei();
        if (n2 != 0) {
            this.bml.bH(n2);
            this.bml.scrollBy(n3);
            this.Em();
        }
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        this.bml.handleMouseInput();
    }

    private void Ei() {
        bf[] bfArray = new bf[]{new bh(160, I18n.a("createWorld.customize.custom.seaLevel", new Object[0]), true, this, 1.0f, 255.0f, this.bmz.dMd), new bc(148, I18n.a("createWorld.customize.custom.useCaves", new Object[0]), true, this.bmz.dMe), new bc(150, I18n.a("createWorld.customize.custom.useStrongholds", new Object[0]), true, this.bmz.dMh), new bc(151, I18n.a("createWorld.customize.custom.useVillages", new Object[0]), true, this.bmz.dMi), new bc(152, I18n.a("createWorld.customize.custom.useMineShafts", new Object[0]), true, this.bmz.dMj), new bc(153, I18n.a("createWorld.customize.custom.useTemples", new Object[0]), true, this.bmz.dMk), new bc(210, I18n.a("createWorld.customize.custom.useMonuments", new Object[0]), true, this.bmz.dMl), new bc(154, I18n.a("createWorld.customize.custom.useRavines", new Object[0]), true, this.bmz.dMm), new bc(149, I18n.a("createWorld.customize.custom.useDungeons", new Object[0]), true, this.bmz.dMf), new bh(157, I18n.a("createWorld.customize.custom.dungeonChance", new Object[0]), true, this, 1.0f, 100.0f, this.bmz.dMg), new bc(155, I18n.a("createWorld.customize.custom.useWaterLakes", new Object[0]), true, this.bmz.dMn), new bh(158, I18n.a("createWorld.customize.custom.waterLakeChance", new Object[0]), true, this, 1.0f, 100.0f, this.bmz.dMo), new bc(156, I18n.a("createWorld.customize.custom.useLavaLakes", new Object[0]), true, this.bmz.dMp), new bh(159, I18n.a("createWorld.customize.custom.lavaLakeChance", new Object[0]), true, this, 10.0f, 100.0f, this.bmz.dMq), new bc(161, I18n.a("createWorld.customize.custom.useLavaOceans", new Object[0]), true, this.bmz.dMr), new bh(162, I18n.a("createWorld.customize.custom.fixedBiome", new Object[0]), true, this, -1.0f, 37.0f, this.bmz.dMs), new bh(163, I18n.a("createWorld.customize.custom.biomeSize", new Object[0]), true, this, 1.0f, 8.0f, this.bmz.dMt), new bh(164, I18n.a("createWorld.customize.custom.riverSize", new Object[0]), true, this, 1.0f, 5.0f, this.bmz.dMu)};
        bf[] bfArray2 = new bf[]{new be(416, I18n.a("tile.dirt.name", new Object[0]), false), null, new bh(165, I18n.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.bmz.dMv), new bh(166, I18n.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.bmz.dMw), new bh(167, I18n.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMx), new bh(168, I18n.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMy), new be(417, I18n.a("tile.gravel.name", new Object[0]), false), null, new bh(169, I18n.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.bmz.dMz), new bh(170, I18n.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.bmz.dMA), new bh(171, I18n.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMB), new bh(172, I18n.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMC), new be(418, I18n.a("tile.stone.granite.name", new Object[0]), false), null, new bh(173, I18n.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.bmz.dMD), new bh(174, I18n.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.bmz.dME), new bh(175, I18n.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMF), new bh(176, I18n.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMG), new be(419, I18n.a("tile.stone.diorite.name", new Object[0]), false), null, new bh(177, I18n.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.bmz.dMH), new bh(178, I18n.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.bmz.dMI), new bh(179, I18n.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMJ), new bh(180, I18n.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMK), new be(420, I18n.a("tile.stone.andesite.name", new Object[0]), false), null, new bh(181, I18n.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.bmz.dML), new bh(182, I18n.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.bmz.dMM), new bh(183, I18n.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMN), new bh(184, I18n.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMO), new be(421, I18n.a("tile.oreCoal.name", new Object[0]), false), null, new bh(185, I18n.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.bmz.dMP), new bh(186, I18n.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.bmz.dMQ), new bh(187, I18n.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMR), new bh(189, I18n.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMS), new be(422, I18n.a("tile.oreIron.name", new Object[0]), false), null, new bh(190, I18n.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.bmz.dMT), new bh(191, I18n.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.bmz.dMU), new bh(192, I18n.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMV), new bh(193, I18n.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMW), new be(423, I18n.a("tile.oreGold.name", new Object[0]), false), null, new bh(194, I18n.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.bmz.dMX), new bh(195, I18n.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.bmz.dMY), new bh(196, I18n.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dMZ), new bh(197, I18n.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dNa), new be(424, I18n.a("tile.oreRedstone.name", new Object[0]), false), null, new bh(198, I18n.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.bmz.dNb), new bh(199, I18n.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.bmz.dNc), new bh(200, I18n.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dNd), new bh(201, I18n.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dNe), new be(425, I18n.a("tile.oreDiamond.name", new Object[0]), false), null, new bh(202, I18n.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.bmz.dNf), new bh(203, I18n.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.bmz.dNg), new bh(204, I18n.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dNh), new bh(205, I18n.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dNi), new be(426, I18n.a("tile.oreLapis.name", new Object[0]), false), null, new bh(206, I18n.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.bmz.dNj), new bh(207, I18n.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.bmz.dNk), new bh(208, I18n.a("createWorld.customize.custom.center", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dNl), new bh(209, I18n.a("createWorld.customize.custom.spread", new Object[0]), false, this, 0.0f, 255.0f, this.bmz.dNm)};
        bf[] bfArray3 = new bf[]{new bh(100, I18n.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0]), false, this, 1.0f, 5000.0f, this.bmz.dLU), new bh(101, I18n.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0]), false, this, 1.0f, 5000.0f, this.bmz.dLV), new bh(102, I18n.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]), false, this, 1.0f, 5000.0f, this.bmz.dLW), new bh(103, I18n.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0]), false, this, 1.0f, 2000.0f, this.bmz.dLR), new bh(104, I18n.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]), false, this, 1.0f, 2000.0f, this.bmz.dLS), new bh(105, I18n.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]), false, this, 0.01f, 20.0f, this.bmz.dLT), new bh(106, I18n.a("createWorld.customize.custom.baseSize", new Object[0]), false, this, 1.0f, 25.0f, this.bmz.dLX), new bh(107, I18n.a("createWorld.customize.custom.coordinateScale", new Object[0]), false, this, 1.0f, 6000.0f, this.bmz.dLN), new bh(108, I18n.a("createWorld.customize.custom.heightScale", new Object[0]), false, this, 1.0f, 6000.0f, this.bmz.dLO), new bh(109, I18n.a("createWorld.customize.custom.stretchY", new Object[0]), false, this, 0.01f, 50.0f, this.bmz.dLY), new bh(110, I18n.a("createWorld.customize.custom.upperLimitScale", new Object[0]), false, this, 1.0f, 5000.0f, this.bmz.dLP), new bh(111, I18n.a("createWorld.customize.custom.lowerLimitScale", new Object[0]), false, this, 1.0f, 5000.0f, this.bmz.dLQ), new bh(112, I18n.a("createWorld.customize.custom.biomeDepthWeight", new Object[0]), false, this, 1.0f, 20.0f, this.bmz.dLZ), new bh(113, I18n.a("createWorld.customize.custom.biomeDepthOffset", new Object[0]), false, this, 0.0f, 20.0f, this.bmz.dNo), new bh(114, I18n.a("createWorld.customize.custom.biomeScaleWeight", new Object[0]), false, this, 1.0f, 20.0f, this.bmz.dMb), new bh(115, I18n.a("createWorld.customize.custom.biomeScaleOffset", new Object[0]), false, this, 0.0f, 20.0f, this.bmz.dMc)};
        bf[] bfArray4 = new bf[]{new be(400, I18n.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0]) + ":", false), new bb(132, String.format("%5.3f", Float.valueOf(this.bmz.dLU)), false, this.bmx), new be(401, I18n.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0]) + ":", false), new bb(133, String.format("%5.3f", Float.valueOf(this.bmz.dLV)), false, this.bmx), new be(402, I18n.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]) + ":", false), new bb(134, String.format("%5.3f", Float.valueOf(this.bmz.dLW)), false, this.bmx), new be(403, I18n.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0]) + ":", false), new bb(135, String.format("%5.3f", Float.valueOf(this.bmz.dLR)), false, this.bmx), new be(404, I18n.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]) + ":", false), new bb(136, String.format("%5.3f", Float.valueOf(this.bmz.dLS)), false, this.bmx), new be(405, I18n.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]) + ":", false), new bb(137, String.format("%2.3f", Float.valueOf(this.bmz.dLT)), false, this.bmx), new be(406, I18n.a("createWorld.customize.custom.baseSize", new Object[0]) + ":", false), new bb(138, String.format("%2.3f", Float.valueOf(this.bmz.dLX)), false, this.bmx), new be(407, I18n.a("createWorld.customize.custom.coordinateScale", new Object[0]) + ":", false), new bb(139, String.format("%5.3f", Float.valueOf(this.bmz.dLN)), false, this.bmx), new be(408, I18n.a("createWorld.customize.custom.heightScale", new Object[0]) + ":", false), new bb(140, String.format("%5.3f", Float.valueOf(this.bmz.dLO)), false, this.bmx), new be(409, I18n.a("createWorld.customize.custom.stretchY", new Object[0]) + ":", false), new bb(141, String.format("%2.3f", Float.valueOf(this.bmz.dLY)), false, this.bmx), new be(410, I18n.a("createWorld.customize.custom.upperLimitScale", new Object[0]) + ":", false), new bb(142, String.format("%5.3f", Float.valueOf(this.bmz.dLP)), false, this.bmx), new be(411, I18n.a("createWorld.customize.custom.lowerLimitScale", new Object[0]) + ":", false), new bb(143, String.format("%5.3f", Float.valueOf(this.bmz.dLQ)), false, this.bmx), new be(412, I18n.a("createWorld.customize.custom.biomeDepthWeight", new Object[0]) + ":", false), new bb(144, String.format("%2.3f", Float.valueOf(this.bmz.dLZ)), false, this.bmx), new be(413, I18n.a("createWorld.customize.custom.biomeDepthOffset", new Object[0]) + ":", false), new bb(145, String.format("%2.3f", Float.valueOf(this.bmz.dNo)), false, this.bmx), new be(414, I18n.a("createWorld.customize.custom.biomeScaleWeight", new Object[0]) + ":", false), new bb(146, String.format("%2.3f", Float.valueOf(this.bmz.dMb)), false, this.bmx), new be(415, I18n.a("createWorld.customize.custom.biomeScaleOffset", new Object[0]) + ":", false), new bb(147, String.format("%2.3f", Float.valueOf(this.bmz.dMc)), false, this.bmx)};
        this.bml = new ba(aER, this.width, this.height, 32, this.height - 32, 25, this, bfArray, bfArray2, bfArray3, bfArray4);
        for (int i2 = 0; i2 < 4; ++i2) {
            this.bmk[i2] = I18n.a("createWorld.customize.custom.page" + i2, new Object[0]);
        }
        this.Em();
    }

    public String Ej() {
        return this.bmz.toString().replace("\n", "");
    }

    public void cH(String string) {
        this.bmz = string != null && string.length() != 0 ? h.gI(string) : new h();
    }

    @Override
    public void d(int n2, String string) {
        float f2 = 0.0f;
        try {
            f2 = Float.parseFloat(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        float f3 = 0.0f;
        switch (n2) {
            case 132: {
                f3 = this.bmz.dLU = bt.I(f2, 1.0f, 5000.0f);
                break;
            }
            case 133: {
                f3 = this.bmz.dLV = bt.I(f2, 1.0f, 5000.0f);
                break;
            }
            case 134: {
                f3 = this.bmz.dLW = bt.I(f2, 1.0f, 5000.0f);
                break;
            }
            case 135: {
                f3 = this.bmz.dLR = bt.I(f2, 1.0f, 2000.0f);
                break;
            }
            case 136: {
                f3 = this.bmz.dLS = bt.I(f2, 1.0f, 2000.0f);
                break;
            }
            case 137: {
                f3 = this.bmz.dLT = bt.I(f2, 0.01f, 20.0f);
                break;
            }
            case 138: {
                f3 = this.bmz.dLX = bt.I(f2, 1.0f, 25.0f);
                break;
            }
            case 139: {
                f3 = this.bmz.dLN = bt.I(f2, 1.0f, 6000.0f);
                break;
            }
            case 140: {
                f3 = this.bmz.dLO = bt.I(f2, 1.0f, 6000.0f);
                break;
            }
            case 141: {
                f3 = this.bmz.dLY = bt.I(f2, 0.01f, 50.0f);
                break;
            }
            case 142: {
                f3 = this.bmz.dLP = bt.I(f2, 1.0f, 5000.0f);
                break;
            }
            case 143: {
                f3 = this.bmz.dLQ = bt.I(f2, 1.0f, 5000.0f);
                break;
            }
            case 144: {
                f3 = this.bmz.dLZ = bt.I(f2, 1.0f, 20.0f);
                break;
            }
            case 145: {
                f3 = this.bmz.dNo = bt.I(f2, 0.0f, 20.0f);
                break;
            }
            case 146: {
                f3 = this.bmz.dMb = bt.I(f2, 1.0f, 20.0f);
                break;
            }
            case 147: {
                f3 = this.bmz.dMc = bt.I(f2, 0.0f, 20.0f);
            }
        }
        if (f3 != f2 && f2 != 0.0f) {
            ((cq)this.bml.bI(n2)).bX(this.b(n2, f3));
        }
        ((cj)this.bml.bI(n2 - 132 + 100)).a(f3, false);
        if (!this.bmz.equals(this.bmy)) {
            this.Y(true);
        }
    }

    private void Y(boolean bl2) {
        this.bmu = bl2;
        this.bmo.enabled = bl2;
    }

    @Override
    public String b(int n2, String string, float f2) {
        return string + ": " + this.b(n2, f2);
    }

    private String b(int n2, float f2) {
        switch (n2) {
            case 100: 
            case 101: 
            case 102: 
            case 103: 
            case 104: 
            case 107: 
            case 108: 
            case 110: 
            case 111: 
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 136: 
            case 139: 
            case 140: 
            case 142: 
            case 143: {
                return String.format("%5.3f", Float.valueOf(f2));
            }
            case 105: 
            case 106: 
            case 109: 
            case 112: 
            case 113: 
            case 114: 
            case 115: 
            case 137: 
            case 138: 
            case 141: 
            case 144: 
            case 145: 
            case 146: 
            case 147: {
                return String.format("%2.3f", Float.valueOf(f2));
            }
            default: {
                return String.format("%d", (int)f2);
            }
            case 162: 
        }
        if (f2 < 0.0f) {
            return I18n.a("gui.all", new Object[0]);
        }
        if ((int)f2 >= j.dGn.dHo) {
            j j2 = j.axg()[(int)f2 + 2];
            return j2 != null ? j2.dGX : "?";
        }
        j j3 = j.axg()[(int)f2];
        return j3 != null ? j3.dGX : "?";
    }

    @Override
    public void i(int n2, boolean bl2) {
        switch (n2) {
            case 148: {
                this.bmz.dMe = bl2;
                break;
            }
            case 149: {
                this.bmz.dMf = bl2;
                break;
            }
            case 150: {
                this.bmz.dMh = bl2;
                break;
            }
            case 151: {
                this.bmz.dMi = bl2;
                break;
            }
            case 152: {
                this.bmz.dMj = bl2;
                break;
            }
            case 153: {
                this.bmz.dMk = bl2;
                break;
            }
            case 154: {
                this.bmz.dMm = bl2;
                break;
            }
            case 155: {
                this.bmz.dMn = bl2;
                break;
            }
            case 156: {
                this.bmz.dMp = bl2;
                break;
            }
            case 161: {
                this.bmz.dMr = bl2;
                break;
            }
            case 210: {
                this.bmz.dMl = bl2;
            }
        }
        if (!this.bmz.equals(this.bmy)) {
            this.Y(true);
        }
    }

    @Override
    public void c(int n2, float f2) {
        b b2;
        switch (n2) {
            case 100: {
                this.bmz.dLU = f2;
                break;
            }
            case 101: {
                this.bmz.dLV = f2;
                break;
            }
            case 102: {
                this.bmz.dLW = f2;
                break;
            }
            case 103: {
                this.bmz.dLR = f2;
                break;
            }
            case 104: {
                this.bmz.dLS = f2;
                break;
            }
            case 105: {
                this.bmz.dLT = f2;
                break;
            }
            case 106: {
                this.bmz.dLX = f2;
                break;
            }
            case 107: {
                this.bmz.dLN = f2;
                break;
            }
            case 108: {
                this.bmz.dLO = f2;
                break;
            }
            case 109: {
                this.bmz.dLY = f2;
                break;
            }
            case 110: {
                this.bmz.dLP = f2;
                break;
            }
            case 111: {
                this.bmz.dLQ = f2;
                break;
            }
            case 112: {
                this.bmz.dLZ = f2;
                break;
            }
            case 113: {
                this.bmz.dNo = f2;
                break;
            }
            case 114: {
                this.bmz.dMb = f2;
                break;
            }
            case 115: {
                this.bmz.dMc = f2;
            }
            default: {
                break;
            }
            case 157: {
                this.bmz.dMg = (int)f2;
                break;
            }
            case 158: {
                this.bmz.dMo = (int)f2;
                break;
            }
            case 159: {
                this.bmz.dMq = (int)f2;
                break;
            }
            case 160: {
                this.bmz.dMd = (int)f2;
                break;
            }
            case 162: {
                this.bmz.dMs = (int)f2;
                break;
            }
            case 163: {
                this.bmz.dMt = (int)f2;
                break;
            }
            case 164: {
                this.bmz.dMu = (int)f2;
                break;
            }
            case 165: {
                this.bmz.dMv = (int)f2;
                break;
            }
            case 166: {
                this.bmz.dMw = (int)f2;
                break;
            }
            case 167: {
                this.bmz.dMx = (int)f2;
                break;
            }
            case 168: {
                this.bmz.dMy = (int)f2;
                break;
            }
            case 169: {
                this.bmz.dMz = (int)f2;
                break;
            }
            case 170: {
                this.bmz.dMA = (int)f2;
                break;
            }
            case 171: {
                this.bmz.dMB = (int)f2;
                break;
            }
            case 172: {
                this.bmz.dMC = (int)f2;
                break;
            }
            case 173: {
                this.bmz.dMD = (int)f2;
                break;
            }
            case 174: {
                this.bmz.dME = (int)f2;
                break;
            }
            case 175: {
                this.bmz.dMF = (int)f2;
                break;
            }
            case 176: {
                this.bmz.dMG = (int)f2;
                break;
            }
            case 177: {
                this.bmz.dMH = (int)f2;
                break;
            }
            case 178: {
                this.bmz.dMI = (int)f2;
                break;
            }
            case 179: {
                this.bmz.dMJ = (int)f2;
                break;
            }
            case 180: {
                this.bmz.dMK = (int)f2;
                break;
            }
            case 181: {
                this.bmz.dML = (int)f2;
                break;
            }
            case 182: {
                this.bmz.dMM = (int)f2;
                break;
            }
            case 183: {
                this.bmz.dMN = (int)f2;
                break;
            }
            case 184: {
                this.bmz.dMO = (int)f2;
                break;
            }
            case 185: {
                this.bmz.dMP = (int)f2;
                break;
            }
            case 186: {
                this.bmz.dMQ = (int)f2;
                break;
            }
            case 187: {
                this.bmz.dMR = (int)f2;
                break;
            }
            case 189: {
                this.bmz.dMS = (int)f2;
                break;
            }
            case 190: {
                this.bmz.dMT = (int)f2;
                break;
            }
            case 191: {
                this.bmz.dMU = (int)f2;
                break;
            }
            case 192: {
                this.bmz.dMV = (int)f2;
                break;
            }
            case 193: {
                this.bmz.dMW = (int)f2;
                break;
            }
            case 194: {
                this.bmz.dMX = (int)f2;
                break;
            }
            case 195: {
                this.bmz.dMY = (int)f2;
                break;
            }
            case 196: {
                this.bmz.dMZ = (int)f2;
                break;
            }
            case 197: {
                this.bmz.dNa = (int)f2;
                break;
            }
            case 198: {
                this.bmz.dNb = (int)f2;
                break;
            }
            case 199: {
                this.bmz.dNc = (int)f2;
                break;
            }
            case 200: {
                this.bmz.dNd = (int)f2;
                break;
            }
            case 201: {
                this.bmz.dNe = (int)f2;
                break;
            }
            case 202: {
                this.bmz.dNf = (int)f2;
                break;
            }
            case 203: {
                this.bmz.dNg = (int)f2;
                break;
            }
            case 204: {
                this.bmz.dNh = (int)f2;
                break;
            }
            case 205: {
                this.bmz.dNi = (int)f2;
                break;
            }
            case 206: {
                this.bmz.dNj = (int)f2;
                break;
            }
            case 207: {
                this.bmz.dNk = (int)f2;
                break;
            }
            case 208: {
                this.bmz.dNl = (int)f2;
                break;
            }
            case 209: {
                this.bmz.dNm = (int)f2;
            }
        }
        if (n2 >= 100 && n2 < 116 && (b2 = this.bml.bI(n2 - 100 + 132)) != null) {
            ((cq)b2).bX(this.b(n2, f2));
        }
        if (!this.bmz.equals(this.bmy)) {
            this.Y(true);
        }
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            switch (c2.id) {
                case 300: {
                    this.bmg.bmc = this.bmz.toString();
                    aER.a(this.bmg);
                    break;
                }
                case 301: {
                    for (int i2 = 0; i2 < this.bml.getSize(); ++i2) {
                        b b2;
                        bd bd2 = this.bml.bJ(i2);
                        b b3 = bd2.Fp();
                        if (b3 instanceof c) {
                            b2 = (c)b3;
                            if (b2 instanceof cj) {
                                float f2 = ((cj)b2).FT() * (0.75f + this.bmA.nextFloat() * 0.5f) + (this.bmA.nextFloat() * 0.1f - 0.05f);
                                ((cj)b2).V(bt.I(f2, 0.0f, 1.0f));
                            } else if (b2 instanceof ah) {
                                ((ah)b2).aa(this.bmA.nextBoolean());
                            }
                        }
                        if (!((b2 = bd2.Fq()) instanceof c)) continue;
                        b b4 = b2;
                        if (b4 instanceof cj) {
                            float f3 = ((cj)b4).FT() * (0.75f + this.bmA.nextFloat() * 0.5f) + (this.bmA.nextFloat() * 0.1f - 0.05f);
                            ((cj)b4).V(bt.I(f3, 0.0f, 1.0f));
                            continue;
                        }
                        if (!(b4 instanceof ah)) continue;
                        ((ah)b4).aa(this.bmA.nextBoolean());
                    }
                    return;
                }
                case 302: {
                    this.bml.Fl();
                    this.Em();
                    break;
                }
                case 303: {
                    this.bml.Fm();
                    this.Em();
                    break;
                }
                case 304: {
                    if (!this.bmu) break;
                    this.bA(304);
                    break;
                }
                case 305: {
                    aER.a(new bu(this));
                    break;
                }
                case 306: {
                    this.El();
                    break;
                }
                case 307: {
                    this.bmv = 0;
                    this.El();
                }
            }
        }
    }

    private void Ek() {
        this.bmz.ayh();
        this.Ei();
        this.Y(false);
    }

    private void bA(int n2) {
        this.bmv = n2;
        this.Z(true);
    }

    private void El() {
        switch (this.bmv) {
            case 300: {
                this.actionPerformed((ah)this.bml.bI(300));
                break;
            }
            case 304: {
                this.Ek();
            }
        }
        this.bmv = 0;
        this.bmw = true;
        this.Z(false);
    }

    private void Z(boolean bl2) {
        this.bmr.visible = bl2;
        this.bms.visible = bl2;
        this.bmn.enabled = !bl2;
        this.bmm.enabled = !bl2;
        this.bmp.enabled = !bl2;
        this.bmq.enabled = !bl2;
        this.bmo.enabled = this.bmu && !bl2;
        this.bmt.enabled = !bl2;
        this.bml.ac(!bl2);
    }

    private void Em() {
        this.bmp.enabled = this.bml.Fi() != 0;
        this.bmq.enabled = this.bml.Fi() != this.bml.Fj() - 1;
        this.bmi = I18n.a("book.pageIndicator", this.bml.Fi() + 1, this.bml.Fj());
        this.bmj = this.bmk[this.bml.Fi()];
        this.bmn.enabled = this.bml.Fi() != this.bml.Fj() - 1;
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        super.keyTyped(c2, n2);
        if (this.bmv == 0) {
            switch (n2) {
                case 200: {
                    this.R(1.0f);
                    break;
                }
                case 208: {
                    this.R(-1.0f);
                    break;
                }
                default: {
                    this.bml.c(c2, n2);
                }
            }
        }
    }

    private void R(float f2) {
        b b2 = this.bml.Fk();
        if (b2 instanceof cq) {
            cq cq2;
            Float f3;
            float f4 = f2;
            if (bp.isShiftKeyDown()) {
                f4 = f2 * 0.1f;
                if (bp.isCtrlKeyDown()) {
                    f4 *= 0.1f;
                }
            } else if (bp.isCtrlKeyDown()) {
                f4 = f2 * 10.0f;
                if (bp.isAltKeyDown()) {
                    f4 *= 10.0f;
                }
            }
            if ((f3 = Floats.tryParse((String)(cq2 = (cq)b2).getText())) != null) {
                f3 = Float.valueOf(f3.floatValue() + f4);
                int n2 = cq2.getId();
                String string = this.b(cq2.getId(), f3.floatValue());
                cq2.bX(string);
                this.d(n2, string);
            }
        }
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        super.mouseClicked(n2, n3, n4);
        if (this.bmv == 0 && !this.bmw) {
            this.bml.mouseClicked(n2, n3, n4);
        }
    }

    @Override
    protected void mouseReleased(int n2, int n3, int n4) {
        super.mouseReleased(n2, n3, n4);
        if (this.bmw) {
            this.bmw = false;
        } else if (this.bmv == 0) {
            this.bml.p(n2, n3, n4);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.bml.drawScreen(n2, n3, f2);
        this.drawCenteredString(this.fontRendererObj, this.bmh, this.width / 2, 2, 0xFFFFFF);
        this.drawCenteredString(this.fontRendererObj, this.bmi, this.width / 2, 12, 0xFFFFFF);
        this.drawCenteredString(this.fontRendererObj, this.bmj, this.width / 2, 22, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
        if (this.bmv != 0) {
            p.drawRect(0, 0, this.width, this.height, Integer.MIN_VALUE);
            this.drawHorizontalLine(this.width / 2 - 91, this.width / 2 + 90, 99, -2039584);
            this.drawHorizontalLine(this.width / 2 - 91, this.width / 2 + 90, 185, -6250336);
            this.drawVerticalLine(this.width / 2 - 91, 99, 185, -2039584);
            this.drawVerticalLine(this.width / 2 + 90, 99, 185, -6250336);
            GlStateManager.JA();
            GlStateManager.JG();
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            aER.Bq().a(optionsBackground);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            worldRenderer.a(7, DefaultVertexFormats.cbI);
            worldRenderer.F(this.width / 2 - 90, 185.0, 0.0).r(0.0, 2.65625).s(64, 64, 64, 64).Lx();
            worldRenderer.F(this.width / 2 + 90, 185.0, 0.0).r(5.625, 2.65625).s(64, 64, 64, 64).Lx();
            worldRenderer.F(this.width / 2 + 90, 100.0, 0.0).r(5.625, 0.0).s(64, 64, 64, 64).Lx();
            worldRenderer.F(this.width / 2 - 90, 100.0, 0.0).r(0.0, 0.0).s(64, 64, 64, 64).Lx();
            tessellator.pZ();
            this.drawCenteredString(this.fontRendererObj, I18n.a("createWorld.customize.custom.confirmTitle", new Object[0]), this.width / 2, 105, 0xFFFFFF);
            this.drawCenteredString(this.fontRendererObj, I18n.a("createWorld.customize.custom.confirm1", new Object[0]), this.width / 2, 125, 0xFFFFFF);
            this.drawCenteredString(this.fontRendererObj, I18n.a("createWorld.customize.custom.confirm2", new Object[0]), this.width / 2, 135, 0xFFFFFF);
            this.bmr.drawButton(aER, n2, n3);
            this.bms.drawButton(aER, n2, n3);
        }
    }
}

