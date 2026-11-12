/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.client.gui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.a;
import net.minecraft.client.gui.bk;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cf;
import net.minecraft.client.gui.cu;
import net.minecraft.client.gui.cv;
import net.minecraft.client.gui.m;
import net.minecraft.client.gui.t;
import net.minecraft.client.resources.I18n;
import net.minecraft.world.ao;
import net.minecraft.world.storage.d;
import net.minecraft.world.storage.j;
import net.minecraft.world.storage.o;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ce
extends bp
implements cv {
    private static final Logger bsu = LogManager.getLogger();
    private final DateFormat bsv = new SimpleDateFormat();
    protected bp bln;
    protected String bsw = "Select world";
    private boolean bsx;
    private int bsy;
    private List<j> bsz;
    private cf bsA;
    private String bsB;
    private String bsC;
    private final String[] bsD = new String[4];
    private boolean bsE;
    private c bsF;
    private c bsG;
    private c bsH;
    private c bsI;

    public ce(bp bp2) {
        this.bln = bp2;
    }

    @Override
    public void initGui() {
        this.bsw = I18n.a("selectWorld.title", new Object[0]);
        try {
            this.FO();
        }
        catch (a a2) {
            bsu.error("Couldn't load level list", (Throwable)a2);
            aER.a(new t("Unable to load worlds", a2.getMessage()));
            return;
        }
        this.bsB = I18n.a("selectWorld.world", new Object[0]);
        this.bsC = I18n.a("selectWorld.conversion", new Object[0]);
        this.bsD[ao.dEx.awE()] = I18n.a("gameMode.survival", new Object[0]);
        this.bsD[ao.dEy.awE()] = I18n.a("gameMode.creative", new Object[0]);
        this.bsD[ao.dEz.awE()] = I18n.a("gameMode.adventure", new Object[0]);
        this.bsD[ao.dEA.awE()] = I18n.a("gameMode.spectator", new Object[0]);
        this.bsA = new cf(this, aER);
        this.bsA.registerScrollButtons(4, 5);
        this.FP();
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        this.bsA.handleMouseInput();
    }

    private void FO() {
        net.minecraft.world.storage.c c2 = aER.AB();
        this.bsz = c2.axT();
        Collections.sort(this.bsz);
        this.bsy = -1;
    }

    protected String bL(int n2) {
        return this.bsz.get(n2).azD();
    }

    protected String bM(int n2) {
        Object object = this.bsz.get(n2).getDisplayName();
        if (StringUtils.isEmpty((CharSequence)object)) {
            object = I18n.a("selectWorld.world", new Object[0]) + " " + (n2 + 1);
        }
        return object;
    }

    public void FP() {
        this.bsG = new c(1, this.width / 2 - 154, this.height - 52, 150, 20, I18n.a("selectWorld.select", new Object[0]));
        this.buttonList.add(this.bsG);
        this.buttonList.add(new c(3, this.width / 2 + 4, this.height - 52, 150, 20, I18n.a("selectWorld.create", new Object[0])));
        this.bsH = new c(6, this.width / 2 - 154, this.height - 28, 72, 20, I18n.a("selectWorld.rename", new Object[0]));
        this.buttonList.add(this.bsH);
        this.bsF = new c(2, this.width / 2 - 76, this.height - 28, 72, 20, I18n.a("selectWorld.delete", new Object[0]));
        this.buttonList.add(this.bsF);
        this.bsI = new c(7, this.width / 2 + 4, this.height - 28, 72, 20, I18n.a("selectWorld.recreate", new Object[0]));
        this.buttonList.add(this.bsI);
        this.buttonList.add(new c(0, this.width / 2 + 82, this.height - 28, 72, 20, I18n.a("gui.cancel", new Object[0])));
        this.bsG.enabled = false;
        this.bsF.enabled = false;
        this.bsH.enabled = false;
        this.bsI.enabled = false;
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id == 2) {
                String string = this.bM(this.bsy);
                if (string != null) {
                    this.bsE = true;
                    cu cu2 = ce.a(this, string, this.bsy);
                    aER.a(cu2);
                }
            } else if (c2.id == 1) {
                this.bN(this.bsy);
            } else if (c2.id == 3) {
                aER.a(new m(this));
            } else if (c2.id == 6) {
                aER.a(new bk(this, this.bL(this.bsy)));
            } else if (c2.id == 0) {
                aER.a(this.bln);
            } else if (c2.id == 7) {
                m m2 = new m(this);
                d d2 = aER.AB().q(this.bL(this.bsy), false);
                o o2 = d2.azx();
                d2.bf();
                m2.a(o2);
                aER.a(m2);
            } else {
                this.bsA.actionPerformed(c2);
            }
        }
    }

    public void bN(int n2) {
        aER.a((bp)null);
        if (!this.bsx) {
            Object object;
            this.bsx = true;
            Object object2 = this.bL(n2);
            if (object2 == null) {
                object2 = "World" + n2;
            }
            if ((object = this.bM(n2)) == null) {
                object = "World" + n2;
            }
            if (aER.AB().gN((String)object2)) {
                aER.a((String)object2, (String)object, null);
            }
        }
    }

    @Override
    public void confirmClicked(boolean bl2, int n2) {
        if (this.bsE) {
            this.bsE = false;
            if (bl2) {
                net.minecraft.world.storage.c c2 = aER.AB();
                c2.axV();
                c2.gM(this.bL(n2));
                try {
                    this.FO();
                }
                catch (a a2) {
                    bsu.error("Couldn't load level list", (Throwable)a2);
                }
            }
            aER.a(this);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.bsA.drawScreen(n2, n3, f2);
        this.drawCenteredString(this.fontRendererObj, this.bsw, this.width / 2, 20, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
    }

    public static cu a(cv cv2, String string, int n2) {
        String string2 = I18n.a("selectWorld.deleteQuestion", new Object[0]);
        String string3 = "'" + string + "' " + I18n.a("selectWorld.deleteWarning", new Object[0]);
        String string4 = I18n.a("selectWorld.deleteButton", new Object[0]);
        String string5 = I18n.a("gui.cancel", new Object[0]);
        cu cu2 = new cu(cv2, string2, string3, string4, string5, n2);
        return cu2;
    }
}

