/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.gui;

import java.util.Random;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cq;
import net.minecraft.client.gui.k;
import net.minecraft.client.gui.p;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.l;
import net.minecraft.world.an;
import net.minecraft.world.ao;
import net.minecraft.world.ap;
import net.minecraft.world.storage.o;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.input.Keyboard;

public class m
extends bp {
    private final bp blE;
    private cq blF;
    private cq blG;
    private String blH;
    private String blI = "survival";
    private String blJ;
    private boolean blK = true;
    private boolean blL;
    private boolean blM;
    private boolean blN;
    private boolean blO;
    private boolean blP;
    private boolean blQ;
    private c blR;
    private c blS;
    private c blT;
    private c blU;
    private c blV;
    private c blW;
    private c blX;
    private String blY;
    private String blZ;
    private String bma;
    private String bmb;
    private int aBA;
    public String bmc = "";
    private static final String[] bmd = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};

    public m(bp bp2) {
        this.blE = bp2;
        this.bma = "";
        this.bmb = I18n.a("selectWorld.newWorld", new Object[0]);
    }

    @Override
    public void updateScreen() {
        this.blF.Gb();
        this.blG.Gb();
    }

    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.buttonList.clear();
        this.buttonList.add(new c(0, this.width / 2 - 155, this.height - 28, 150, 20, I18n.a("selectWorld.create", new Object[0])));
        this.buttonList.add(new c(1, this.width / 2 + 5, this.height - 28, 150, 20, I18n.a("gui.cancel", new Object[0])));
        this.blR = new c(2, this.width / 2 - 75, 115, 150, 20, I18n.a("selectWorld.gameMode", new Object[0]));
        this.buttonList.add(this.blR);
        this.blS = new c(3, this.width / 2 - 75, 187, 150, 20, I18n.a("selectWorld.moreWorldOptions", new Object[0]));
        this.buttonList.add(this.blS);
        this.blT = new c(4, this.width / 2 - 155, 100, 150, 20, I18n.a("selectWorld.mapFeatures", new Object[0]));
        this.buttonList.add(this.blT);
        this.blT.visible = false;
        this.blU = new c(7, this.width / 2 + 5, 151, 150, 20, I18n.a("selectWorld.bonusItems", new Object[0]));
        this.buttonList.add(this.blU);
        this.blU.visible = false;
        this.blV = new c(5, this.width / 2 + 5, 100, 150, 20, I18n.a("selectWorld.mapType", new Object[0]));
        this.buttonList.add(this.blV);
        this.blV.visible = false;
        this.blW = new c(6, this.width / 2 - 155, 151, 150, 20, I18n.a("selectWorld.allowCommands", new Object[0]));
        this.buttonList.add(this.blW);
        this.blW.visible = false;
        this.blX = new c(8, this.width / 2 + 5, 120, 150, 20, I18n.a("selectWorld.customizeType", new Object[0]));
        this.buttonList.add(this.blX);
        this.blX.visible = false;
        this.blF = new cq(9, this.fontRendererObj, this.width / 2 - 100, 60, 200, 20);
        this.blF.ag(true);
        this.blF.bX(this.bmb);
        this.blG = new cq(10, this.fontRendererObj, this.width / 2 - 100, 60, 200, 20);
        this.blG.bX(this.bma);
        this.X(this.blQ);
        this.Ee();
        this.Ef();
    }

    private void Ee() {
        this.blH = this.blF.getText().trim();
        for (char c2 : l.duj) {
            this.blH = this.blH.replace(c2, '_');
        }
        if (StringUtils.isEmpty((CharSequence)this.blH)) {
            this.blH = "World";
        }
        this.blH = m.a(aER.AB(), this.blH);
    }

    private void Ef() {
        this.blR.displayString = I18n.a("selectWorld.gameMode", new Object[0]) + ": " + I18n.a("selectWorld.gameMode." + this.blI, new Object[0]);
        this.blY = I18n.a("selectWorld.gameMode." + this.blI + ".line1", new Object[0]);
        this.blZ = I18n.a("selectWorld.gameMode." + this.blI + ".line2", new Object[0]);
        this.blT.displayString = I18n.a("selectWorld.mapFeatures", new Object[0]) + " ";
        this.blT.displayString = this.blK ? this.blT.displayString + I18n.a("options.on", new Object[0]) : this.blT.displayString + I18n.a("options.off", new Object[0]);
        this.blU.displayString = I18n.a("selectWorld.bonusItems", new Object[0]) + " ";
        this.blU.displayString = this.blN && !this.blO ? this.blU.displayString + I18n.a("options.on", new Object[0]) : this.blU.displayString + I18n.a("options.off", new Object[0]);
        this.blV.displayString = I18n.a("selectWorld.mapType", new Object[0]) + " " + I18n.a(ap.dEC[this.aBA].awJ(), new Object[0]);
        this.blW.displayString = I18n.a("selectWorld.allowCommands", new Object[0]) + " ";
        this.blW.displayString = this.blL && !this.blO ? this.blW.displayString + I18n.a("options.on", new Object[0]) : this.blW.displayString + I18n.a("options.off", new Object[0]);
    }

    public static String a(net.minecraft.world.storage.c c2, String object) {
        object = ((String)object).replaceAll("[\\./\"]", "_");
        for (String string : bmd) {
            if (!((String)object).equalsIgnoreCase(string)) continue;
            object = "_" + (String)object + "_";
        }
        while (c2.gK((String)object) != null) {
            object = (String)object + "-";
        }
        return object;
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            if (c2.id == 1) {
                aER.a(this.blE);
            } else if (c2.id == 0) {
                aER.a((bp)null);
                if (this.blP) {
                    return;
                }
                this.blP = true;
                long l2 = new Random().nextLong();
                String string = this.blG.getText();
                if (!StringUtils.isEmpty((CharSequence)string)) {
                    try {
                        long l3 = Long.parseLong(string);
                        if (l3 != 0L) {
                            l2 = l3;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        l2 = string.hashCode();
                    }
                }
                ao ao2 = ao.gC(this.blI);
                an an2 = new an(l2, ao2, this.blK, this.blO, ap.dEC[this.aBA]);
                an2.gB(this.bmc);
                if (this.blN && !this.blO) {
                    an2.awx();
                }
                if (this.blL && !this.blO) {
                    an2.awy();
                }
                aER.a(this.blH, this.blF.getText().trim(), an2);
            } else if (c2.id == 3) {
                this.Eh();
            } else if (c2.id == 2) {
                if (this.blI.equals("survival")) {
                    if (!this.blM) {
                        this.blL = false;
                    }
                    this.blO = false;
                    this.blI = "hardcore";
                    this.blO = true;
                    this.blW.enabled = false;
                    this.blU.enabled = false;
                    this.Ef();
                } else if (this.blI.equals("hardcore")) {
                    if (!this.blM) {
                        this.blL = true;
                    }
                    this.blO = false;
                    this.blI = "creative";
                    this.Ef();
                    this.blO = false;
                    this.blW.enabled = true;
                    this.blU.enabled = true;
                } else {
                    if (!this.blM) {
                        this.blL = false;
                    }
                    this.blI = "survival";
                    this.Ef();
                    this.blW.enabled = true;
                    this.blU.enabled = true;
                    this.blO = false;
                }
                this.Ef();
            } else if (c2.id == 4) {
                this.blK = !this.blK;
                this.Ef();
            } else if (c2.id == 7) {
                this.blN = !this.blN;
                this.Ef();
            } else if (c2.id == 5) {
                ++this.aBA;
                if (this.aBA >= ap.dEC.length) {
                    this.aBA = 0;
                }
                while (!this.Eg()) {
                    ++this.aBA;
                    if (this.aBA < ap.dEC.length) continue;
                    this.aBA = 0;
                }
                this.bmc = "";
                this.Ef();
                this.X(this.blQ);
            } else if (c2.id == 6) {
                this.blM = true;
                this.blL = !this.blL;
                this.Ef();
            } else if (c2.id == 8) {
                if (ap.dEC[this.aBA] == ap.dEE) {
                    aER.a(new k(this, this.bmc));
                } else {
                    aER.a(new p(this, this.bmc));
                }
            }
        }
    }

    private boolean Eg() {
        ap ap2 = ap.dEC[this.aBA];
        return ap2 != null && ap2.awM() && (ap2 != ap.dEI || m.isShiftKeyDown());
    }

    private void Eh() {
        this.X(!this.blQ);
    }

    private void X(boolean bl2) {
        this.blQ = bl2;
        if (ap.dEC[this.aBA] == ap.dEI) {
            this.blR.visible = !this.blQ;
            this.blR.enabled = false;
            if (this.blJ == null) {
                this.blJ = this.blI;
            }
            this.blI = "spectator";
            this.blT.visible = false;
            this.blU.visible = false;
            this.blV.visible = this.blQ;
            this.blW.visible = false;
            this.blX.visible = false;
        } else {
            this.blR.visible = !this.blQ;
            this.blR.enabled = true;
            if (this.blJ != null) {
                this.blI = this.blJ;
                this.blJ = null;
            }
            this.blT.visible = this.blQ && ap.dEC[this.aBA] != ap.dEH;
            this.blU.visible = this.blQ;
            this.blV.visible = this.blQ;
            this.blW.visible = this.blQ;
            this.blX.visible = this.blQ && (ap.dEC[this.aBA] == ap.dEE || ap.dEC[this.aBA] == ap.dEH);
        }
        this.Ef();
        this.blS.displayString = this.blQ ? I18n.a("gui.done", new Object[0]) : I18n.a("selectWorld.moreWorldOptions", new Object[0]);
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (this.blF.Gj() && !this.blQ) {
            this.blF.f(c2, n2);
            this.bmb = this.blF.getText();
        } else if (this.blG.Gj() && this.blQ) {
            this.blG.f(c2, n2);
            this.bma = this.blG.getText();
        }
        if (n2 == 28 || n2 == 156) {
            this.actionPerformed((c)this.buttonList.get(0));
        }
        ((c)this.buttonList.get((int)0)).enabled = this.blF.getText().length() > 0;
        this.Ee();
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        super.mouseClicked(n2, n3, n4);
        if (this.blQ) {
            this.blG.mouseClicked(n2, n3, n4);
        } else {
            this.blF.mouseClicked(n2, n3, n4);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.a("selectWorld.create", new Object[0]), this.width / 2, 20, -1);
        if (this.blQ) {
            this.drawString(this.fontRendererObj, I18n.a("selectWorld.enterSeed", new Object[0]), this.width / 2 - 100, 47, -6250336);
            this.drawString(this.fontRendererObj, I18n.a("selectWorld.seedInfo", new Object[0]), this.width / 2 - 100, 85, -6250336);
            if (this.blT.visible) {
                this.drawString(this.fontRendererObj, I18n.a("selectWorld.mapFeatures.info", new Object[0]), this.width / 2 - 150, 122, -6250336);
            }
            if (this.blW.visible) {
                this.drawString(this.fontRendererObj, I18n.a("selectWorld.allowCommands.info", new Object[0]), this.width / 2 - 150, 172, -6250336);
            }
            this.blG.Gf();
            if (ap.dEC[this.aBA].awQ()) {
                this.fontRendererObj.a(I18n.a(ap.dEC[this.aBA].awK(), new Object[0]), this.blV.xPosition + 2, this.blV.yPosition + 22, this.blV.getButtonWidth(), 0xA0A0A0);
            }
        } else {
            this.drawString(this.fontRendererObj, I18n.a("selectWorld.enterName", new Object[0]), this.width / 2 - 100, 47, -6250336);
            this.drawString(this.fontRendererObj, I18n.a("selectWorld.resultFolder", new Object[0]) + " " + this.blH, this.width / 2 - 100, 85, -6250336);
            this.blF.Gf();
            this.drawString(this.fontRendererObj, this.blY, this.width / 2 - 100, 137, -6250336);
            this.drawString(this.fontRendererObj, this.blZ, this.width / 2 - 100, 149, -6250336);
        }
        super.drawScreen(n2, n3, f2);
    }

    public void a(o o2) {
        this.bmb = I18n.a("selectWorld.newWorld.copyOf", o2.aln());
        this.bma = "" + o2.avD();
        this.aBA = o2.awC().awP();
        this.bmc = o2.azM();
        this.blK = o2.awB();
        this.blL = o2.awD();
        if (o2.azv()) {
            this.blI = "hardcore";
        } else if (o2.If().awG()) {
            this.blI = "survival";
        } else if (o2.If().amh()) {
            this.blI = "creative";
        }
    }
}

