/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cq;
import net.minecraft.client.gui.k;
import net.minecraft.client.gui.v;
import net.minecraft.client.gui.w;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.world.gen.j;
import org.lwjgl.input.Keyboard;

public class u
extends bp {
    private static final List<v> bnc = Lists.newArrayList();
    private final k bnd;
    private String bne;
    private String bnf;
    private String bng;
    private w bnh;
    private c bni;
    private cq bnj;

    public u(k k2) {
        this.bnd = k2;
    }

    @Override
    public void initGui() {
        this.buttonList.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        this.bne = I18n.a("createWorld.customize.presets.title", new Object[0]);
        this.bnf = I18n.a("createWorld.customize.presets.share", new Object[0]);
        this.bng = I18n.a("createWorld.customize.presets.list", new Object[0]);
        this.bnj = new cq(2, this.fontRendererObj, 50, 40, this.width - 100, 20);
        this.bnh = new w(this);
        this.bnj.bV(1230);
        this.bnj.bX(this.bnd.Eb());
        this.bni = new c(0, this.width / 2 - 155, this.height - 28, 150, 20, I18n.a("createWorld.customize.presets.select", new Object[0]));
        this.buttonList.add(this.bni);
        this.buttonList.add(new c(1, this.width / 2 + 5, this.height - 28, 150, 20, I18n.a("gui.cancel", new Object[0])));
        this.Es();
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        this.bnh.handleMouseInput();
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        this.bnj.mouseClicked(n2, n3, n4);
        super.mouseClicked(n2, n3, n4);
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (!this.bnj.f(c2, n2)) {
            super.keyTyped(c2, n2);
        }
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.id == 0 && this.Et()) {
            this.bnd.cG(this.bnj.getText());
            aER.a(this.bnd);
        } else if (c2.id == 1) {
            aER.a(this.bnd);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.bnh.drawScreen(n2, n3, f2);
        this.drawCenteredString(this.fontRendererObj, this.bne, this.width / 2, 8, 0xFFFFFF);
        this.drawString(this.fontRendererObj, this.bnf, 50, 30, 0xA0A0A0);
        this.drawString(this.fontRendererObj, this.bng, 50, 70, 0xA0A0A0);
        this.bnj.Gf();
        super.drawScreen(n2, n3, f2);
    }

    @Override
    public void updateScreen() {
        this.bnj.Gb();
        super.updateScreen();
    }

    public void Es() {
        this.bni.enabled = this.Et();
    }

    private boolean Et() {
        return this.bnh.bno > -1 && this.bnh.bno < bnc.size() || this.bnj.getText().length() > 1;
    }

    private static void a(String string, d d2, net.minecraft.world.biome.j j2, net.minecraft.world.gen.k ... kArray) {
        u.a(string, d2, 0, j2, null, kArray);
    }

    private static void a(String string, d d2, net.minecraft.world.biome.j j2, List<String> list, net.minecraft.world.gen.k ... kArray) {
        u.a(string, d2, 0, j2, list, kArray);
    }

    private static void a(String string, d d2, int n2, net.minecraft.world.biome.j j2, List<String> list, net.minecraft.world.gen.k ... kArray) {
        j j3 = new j();
        for (int i2 = kArray.length - 1; i2 >= 0; --i2) {
            j3.ayl().add(kArray[i2]);
        }
        j3.iw(j2.dHo);
        j3.aym();
        if (list != null) {
            for (String string2 : list) {
                j3.ayk().put(string2, Maps.newHashMap());
            }
        }
        bnc.add(new v(d2, n2, string, j3.toString()));
    }

    static {
        u.a("Classic Flat", d.I(Blocks.cLe), net.minecraft.world.biome.j.dGg, Collections.singletonList("village"), new net.minecraft.world.gen.k(1, Blocks.cLe), new net.minecraft.world.gen.k(2, Blocks.cLf), new net.minecraft.world.gen.k(1, Blocks.cLj));
        u.a("Tunnelers' Dream", d.I(Blocks.cLd), net.minecraft.world.biome.j.dGi, Arrays.asList("biome_1", "dungeon", "decoration", "stronghold", "mineshaft"), new net.minecraft.world.gen.k(1, Blocks.cLe), new net.minecraft.world.gen.k(5, Blocks.cLf), new net.minecraft.world.gen.k(230, Blocks.cLd), new net.minecraft.world.gen.k(1, Blocks.cLj));
        u.a("Water World", Items.cQB, net.minecraft.world.biome.j.dGD, Arrays.asList("biome_1", "oceanmonument"), new net.minecraft.world.gen.k(90, Blocks.cLl), new net.minecraft.world.gen.k(5, Blocks.cLo), new net.minecraft.world.gen.k(5, Blocks.cLf), new net.minecraft.world.gen.k(5, Blocks.cLd), new net.minecraft.world.gen.k(1, Blocks.cLj));
        u.a("Overworld", d.I(Blocks.cLJ), BlockTallGrass$EnumType.bcz.yi(), net.minecraft.world.biome.j.dGg, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake"), new net.minecraft.world.gen.k(1, Blocks.cLe), new net.minecraft.world.gen.k(3, Blocks.cLf), new net.minecraft.world.gen.k(59, Blocks.cLd), new net.minecraft.world.gen.k(1, Blocks.cLj));
        u.a("Snowy Kingdom", d.I(Blocks.cMJ), net.minecraft.world.biome.j.dGr, Arrays.asList("village", "biome_1"), new net.minecraft.world.gen.k(1, Blocks.cMJ), new net.minecraft.world.gen.k(1, Blocks.cLe), new net.minecraft.world.gen.k(3, Blocks.cLf), new net.minecraft.world.gen.k(59, Blocks.cLd), new net.minecraft.world.gen.k(1, Blocks.cLj));
        u.a("Bottomless Pit", Items.cPK, net.minecraft.world.biome.j.dGg, Arrays.asList("village", "biome_1"), new net.minecraft.world.gen.k(1, Blocks.cLe), new net.minecraft.world.gen.k(3, Blocks.cLf), new net.minecraft.world.gen.k(2, Blocks.cLg));
        u.a("Desert", d.I(Blocks.cLo), net.minecraft.world.biome.j.dGh, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"), new net.minecraft.world.gen.k(8, Blocks.cLo), new net.minecraft.world.gen.k(52, Blocks.cLC), new net.minecraft.world.gen.k(3, Blocks.cLd), new net.minecraft.world.gen.k(1, Blocks.cLj));
        u.a("Redstone Ready", Items.cQG, net.minecraft.world.biome.j.dGh, new net.minecraft.world.gen.k(52, Blocks.cLC), new net.minecraft.world.gen.k(3, Blocks.cLd), new net.minecraft.world.gen.k(1, Blocks.cLj));
    }
}

