/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.Sys
 */
package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.as;
import net.minecraft.client.gui.bm;
import net.minecraft.client.gui.bo;
import net.minecraft.client.gui.c;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.ResourcePackListEntry;
import net.minecraft.client.resources.ResourcePackListEntryDefault;
import net.minecraft.client.resources.ResourcePackListEntryFound;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.client.resources.ResourcePackRepository$Entry;
import net.minecraft.util.cy;
import net.minecraft.util.cz;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.Sys;

public class cb
extends GuiScreen {
    private static final Logger bsg = LogManager.getLogger();
    private final GuiScreen bsh;
    private List<ResourcePackListEntry> bsi;
    private List<ResourcePackListEntry> bsj;
    private bm bsk;
    private bo bsl;
    private boolean bsm = false;

    public cb(GuiScreen guiScreen) {
        this.bsh = guiScreen;
    }

    @Override
    public void initGui() {
        this.buttonList.add(new as(2, this.width / 2 - 154, this.height - 48, I18n.a("resourcePack.openFolder", new Object[0])));
        this.buttonList.add(new as(1, this.width / 2 + 4, this.height - 48, I18n.a("gui.done", new Object[0])));
        if (!this.bsm) {
            this.bsi = Lists.newArrayList();
            this.bsj = Lists.newArrayList();
            ResourcePackRepository resourcePackRepository = aER.Bs();
            resourcePackRepository.PH();
            ArrayList arrayList = Lists.newArrayList(resourcePackRepository.PI());
            arrayList.removeAll(resourcePackRepository.PJ());
            for (ResourcePackRepository$Entry resourcePackRepository$Entry : arrayList) {
                this.bsi.add(new ResourcePackListEntryFound(this, resourcePackRepository$Entry));
            }
            for (ResourcePackRepository$Entry resourcePackRepository$Entry : Lists.reverse(resourcePackRepository.PJ())) {
                this.bsj.add(new ResourcePackListEntryFound(this, resourcePackRepository$Entry));
            }
            this.bsj.add(new ResourcePackListEntryDefault(this));
        }
        this.bsk = new bm(aER, 200, this.height, this.bsi);
        this.bsk.setSlotXBoundsFromLeft(this.width / 2 - 4 - 200);
        this.bsk.registerScrollButtons(7, 8);
        this.bsl = new bo(aER, 200, this.height, this.bsj);
        this.bsl.setSlotXBoundsFromLeft(this.width / 2 + 4);
        this.bsl.registerScrollButtons(7, 8);
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        this.bsl.handleMouseInput();
        this.bsk.handleMouseInput();
    }

    public boolean a(ResourcePackListEntry resourcePackListEntry) {
        return this.bsj.contains(resourcePackListEntry);
    }

    public List<ResourcePackListEntry> b(ResourcePackListEntry resourcePackListEntry) {
        return this.a(resourcePackListEntry) ? this.bsj : this.bsi;
    }

    public List<ResourcePackListEntry> FL() {
        return this.bsi;
    }

    public List<ResourcePackListEntry> FM() {
        return this.bsj;
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id == 2) {
                boolean bl2;
                File file = aER.Bs().PK();
                String string = file.getAbsolutePath();
                if (cy.atP() == cz.dAD) {
                    try {
                        bsg.info(string);
                        Runtime.getRuntime().exec(new String[]{"/usr/bin/open", string});
                        return;
                    }
                    catch (IOException iOException) {
                        bsg.error("Couldn't open file", (Throwable)iOException);
                    }
                } else if (cy.atP() == cz.dAC) {
                    String string2 = String.format("cmd.exe /C start \"Open file\" \"%s\"", string);
                    try {
                        Runtime.getRuntime().exec(string2);
                        return;
                    }
                    catch (IOException iOException) {
                        bsg.error("Couldn't open file", (Throwable)iOException);
                    }
                }
                boolean object = false;
                try {
                    Class<?> clazz = Class.forName("java.awt.Desktop");
                    Object object2 = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    clazz.getMethod("browse", URI.class).invoke(object2, file.toURI());
                }
                catch (Throwable throwable) {
                    bsg.error("Couldn't open link", throwable);
                    bl2 = true;
                }
                if (bl2) {
                    bsg.info("Opening via system class!");
                    Sys.openURL((String)("file://" + string));
                }
            } else if (c2.id == 1) {
                if (this.bsm) {
                    ArrayList arrayList = Lists.newArrayList();
                    for (ResourcePackListEntry resourcePackListEntry : this.bsj) {
                        if (!(resourcePackListEntry instanceof ResourcePackListEntryFound)) continue;
                        arrayList.add(((ResourcePackListEntryFound)resourcePackListEntry).PE());
                    }
                    Collections.reverse(arrayList);
                    aER.Bs().y(arrayList);
                    cb.aER.aIY.ccK.clear();
                    cb.aER.aIY.cgy.clear();
                    for (ResourcePackRepository$Entry resourcePackRepository$Entry : arrayList) {
                        cb.aER.aIY.ccK.add(resourcePackRepository$Entry.Pm());
                        if (resourcePackRepository$Entry.PS() == 1) continue;
                        cb.aER.aIY.cgy.add(resourcePackRepository$Entry.Pm());
                    }
                    cb.aER.aIY.QK();
                    aER.Az();
                }
                aER.a(this.bsh);
            }
        }
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        super.mouseClicked(n2, n3, n4);
        this.bsk.mouseClicked(n2, n3, n4);
        this.bsl.mouseClicked(n2, n3, n4);
    }

    @Override
    protected void mouseReleased(int n2, int n3, int n4) {
        super.mouseReleased(n2, n3, n4);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawBackground(0);
        this.bsk.drawScreen(n2, n3, f2);
        this.bsl.drawScreen(n2, n3, f2);
        this.drawCenteredString(this.fontRendererObj, I18n.a("resourcePack.title", new Object[0]), this.width / 2, 16, 0xFFFFFF);
        this.drawCenteredString(this.fontRendererObj, I18n.a("resourcePack.folderInfo", new Object[0]), this.width / 2 - 77, this.height - 26, 0x808080);
        super.drawScreen(n2, n3, f2);
    }

    public void FN() {
        this.bsm = true;
    }
}

