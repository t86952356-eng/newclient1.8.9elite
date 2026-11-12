/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.bv;
import net.minecraft.client.gui.bw;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cq;
import net.minecraft.client.gui.p;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.cm;
import net.minecraft.world.gen.h;
import org.lwjgl.input.Keyboard;

public class bu
extends GuiScreen {
    private static final List<bv> brH = Lists.newArrayList();
    private bw brI;
    private c brJ;
    private cq brK;
    private final p brL;
    protected String brM = "Customize World Presets";
    private String brN;
    private String brO;

    public bu(p p2) {
        this.brL = p2;
    }

    @Override
    public void initGui() {
        this.buttonList.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        this.brM = I18n.a("createWorld.customize.custom.presets.title", new Object[0]);
        this.brN = I18n.a("createWorld.customize.presets.share", new Object[0]);
        this.brO = I18n.a("createWorld.customize.presets.list", new Object[0]);
        this.brK = new cq(2, this.fontRendererObj, 50, 40, this.width - 100, 20);
        this.brI = new bw(this);
        this.brK.bV(2000);
        this.brK.bX(this.brL.Ej());
        this.brJ = new c(0, this.width / 2 - 102, this.height - 27, 100, 20, I18n.a("createWorld.customize.presets.select", new Object[0]));
        this.buttonList.add(this.brJ);
        this.buttonList.add(new c(1, this.width / 2 + 3, this.height - 27, 100, 20, I18n.a("gui.cancel", new Object[0])));
        this.FF();
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        this.brI.handleMouseInput();
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        this.brK.mouseClicked(n2, n3, n4);
        super.mouseClicked(n2, n3, n4);
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (!this.brK.f(c2, n2)) {
            super.keyTyped(c2, n2);
        }
    }

    @Override
    protected void actionPerformed(c c2) {
        switch (c2.id) {
            case 0: {
                this.brL.cH(this.brK.getText());
                aER.a(this.brL);
                break;
            }
            case 1: {
                aER.a(this.brL);
            }
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.brI.drawScreen(n2, n3, f2);
        this.drawCenteredString(this.fontRendererObj, this.brM, this.width / 2, 8, 0xFFFFFF);
        this.drawString(this.fontRendererObj, this.brN, 50, 30, 0xA0A0A0);
        this.drawString(this.fontRendererObj, this.brO, 50, 70, 0xA0A0A0);
        this.brK.Gf();
        super.drawScreen(n2, n3, f2);
    }

    @Override
    public void updateScreen() {
        this.brK.Gb();
        super.updateScreen();
    }

    public void FF() {
        this.brJ.enabled = this.FG();
    }

    private boolean FG() {
        return this.brI.brS > -1 && this.brI.brS < brH.size() || this.brK.getText().length() > 1;
    }

    static {
        h h2 = h.gI("{ \"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":8.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":0.5, \"biomeScaleWeight\":2.0, \"biomeScaleOffset\":0.375, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":255 }");
        cm cm2 = new cm("textures/gui/presets/water.png");
        brH.add(new bv(I18n.a("createWorld.customize.custom.preset.waterWorld", new Object[0]), cm2, h2));
        h2 = h.gI("{\"coordinateScale\":3000.0, \"heightScale\":6000.0, \"upperLimitScale\":250.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        cm2 = new cm("textures/gui/presets/isles.png");
        brH.add(new bv(I18n.a("createWorld.customize.custom.preset.isleLand", new Object[0]), cm2, h2));
        h2 = h.gI("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":5.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":1.0, \"biomeScaleWeight\":4.0, \"biomeScaleOffset\":1.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        cm2 = new cm("textures/gui/presets/delight.png");
        brH.add(new bv(I18n.a("createWorld.customize.custom.preset.caveDelight", new Object[0]), cm2, h2));
        h2 = h.gI("{\"coordinateScale\":738.41864, \"heightScale\":157.69133, \"upperLimitScale\":801.4267, \"lowerLimitScale\":1254.1643, \"depthNoiseScaleX\":374.93652, \"depthNoiseScaleZ\":288.65228, \"depthNoiseScaleExponent\":1.2092624, \"mainNoiseScaleX\":1355.9908, \"mainNoiseScaleY\":745.5343, \"mainNoiseScaleZ\":1183.464, \"baseSize\":1.8758626, \"stretchY\":1.7137525, \"biomeDepthWeight\":1.7553768, \"biomeDepthOffset\":3.4701107, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":2.535211, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        cm2 = new cm("textures/gui/presets/madness.png");
        brH.add(new bv(I18n.a("createWorld.customize.custom.preset.mountains", new Object[0]), cm2, h2));
        h2 = h.gI("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":1000.0, \"mainNoiseScaleY\":3000.0, \"mainNoiseScaleZ\":1000.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":20 }");
        cm2 = new cm("textures/gui/presets/drought.png");
        brH.add(new bv(I18n.a("createWorld.customize.custom.preset.drought", new Object[0]), cm2, h2));
        h2 = h.gI("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":2.0, \"lowerLimitScale\":64.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":6 }");
        cm2 = new cm("textures/gui/presets/chaos.png");
        brH.add(new bv(I18n.a("createWorld.customize.custom.preset.caveChaos", new Object[0]), cm2, h2));
        h2 = h.gI("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":true, \"seaLevel\":40 }");
        cm2 = new cm("textures/gui/presets/luck.png");
        brH.add(new bv(I18n.a("createWorld.customize.custom.preset.goodLuck", new Object[0]), cm2, h2));
    }
}

