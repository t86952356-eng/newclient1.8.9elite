/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.gui;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import de.florianmichael.viamcp.ViaMCP;
import hackclient.rise.adv;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.aj;
import net.minecraft.client.gui.bq;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cc;
import net.minecraft.client.gui.cu;
import net.minecraft.client.gui.cv;
import net.minecraft.client.gui.db;
import net.minecraft.client.gui.dc;
import net.minecraft.client.gui.dd;
import net.minecraft.client.gui.df;
import net.minecraft.client.multiplayer.b;
import net.minecraft.client.multiplayer.f;
import net.minecraft.client.multiplayer.h;
import net.minecraft.client.network.d;
import net.minecraft.client.network.r;
import net.minecraft.client.resources.I18n;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class aq
extends GuiScreen
implements cv {
    private static final Logger bpD = LogManager.getLogger();
    private final r bpE = new r();
    private final GuiScreen bpF;
    private df bpG;
    public static h bpH;
    private c bpI;
    private c bpJ;
    private c bpK;
    private c bpL;
    private boolean bpM;
    private boolean bpN;
    private boolean bpO;
    private boolean bpP;
    private String bpQ;
    private f bpR;
    private net.minecraft.client.network.c bpS;
    private d bpT;
    private boolean Mq;
    public static boolean bpU;

    public aq(GuiScreen guiScreen) {
        this.bpF = guiScreen;
    }

    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.buttonList.clear();
        if (!this.Mq) {
            this.Mq = true;
            bpH = new h(aER);
            bpH.HJ();
            this.bpS = new net.minecraft.client.network.c();
            try {
                this.bpT = new d(this.bpS);
                this.bpT.start();
            }
            catch (Exception exception) {
                bpD.warn("Unable to start LAN server detection: " + exception.getMessage());
            }
            this.bpG = new df(this, aER, this.width, this.height, 32, this.height - 64, 36);
            this.bpG.a(bpH);
        } else {
            this.bpG.setDimensions(this.width, this.height, 32, this.height - 64);
        }
        this.EM();
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        this.bpG.handleMouseInput();
    }

    public void EM() {
        this.bpI = new c(7, this.width / 2 - 154, this.height - 28, 70, 20, I18n.a("selectServer.edit", new Object[0]));
        this.buttonList.add(this.bpI);
        this.bpK = new c(2, this.width / 2 - 74, this.height - 28, 70, 20, I18n.a("selectServer.delete", new Object[0]));
        this.buttonList.add(this.bpK);
        this.bpJ = new c(1, this.width / 2 - 154, this.height - 52, 100, 20, I18n.a("selectServer.select", new Object[0]));
        this.buttonList.add(this.bpJ);
        this.buttonList.add(new c(4, this.width / 2 - 50, this.height - 52, 100, 20, I18n.a("selectServer.direct", new Object[0])));
        this.buttonList.add(new c(3, this.width / 2 + 4 + 50, this.height - 52, 100, 20, I18n.a("selectServer.add", new Object[0])));
        this.buttonList.add(new c(8, this.width / 2 + 4, this.height - 28, 70, 20, I18n.a("selectServer.refresh", new Object[0])));
        this.buttonList.add(new c(0, this.width / 2 + 4 + 76, this.height - 28, 75, 20, I18n.a("gui.cancel", new Object[0])));
        this.bC(this.bpG.Gw());
        this.buttonList.add(ViaMCP.INSTANCE.getAsyncVersionSlider());
        int n2 = 100;
        this.buttonList.add(new c(9, this.width - n2 - 5, 5, n2, 20, "Server Finder"));
        n2 = 50;
        this.buttonList.add(new c(10, this.width - n2 - 5, this.height - 28, n2, 20, "Change"));
        this.bpL = new c(11, this.width - n2 - 5, this.height - 52, n2, 20, "Clear");
        this.buttonList.add(this.bpL);
        this.bpL.enabled = bpU;
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        if (this.bpS.HZ()) {
            List<net.minecraft.client.network.b> list = this.bpS.Ib();
            this.bpS.Ia();
            this.bpG.q(list);
        }
        this.bpE.Ip();
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
        if (this.bpT != null) {
            this.bpT.interrupt();
            this.bpT = null;
        }
        this.bpE.Iq();
    }

    @Override
    protected void actionPerformed(c c2) {
        if (c2.enabled) {
            aj aj2;
            aj aj3 = aj2 = this.bpG.Gw() < 0 ? null : this.bpG.bB(this.bpG.Gw());
            if (c2.id == 2 && aj2 instanceof dd) {
                String string = ((dd)aj2).Gv().fc;
                if (string != null) {
                    this.bpM = true;
                    String string2 = I18n.a("selectServer.deleteQuestion", new Object[0]);
                    String string3 = "'" + string + "' " + I18n.a("selectServer.deleteWarning", new Object[0]);
                    String string4 = I18n.a("selectServer.deleteButton", new Object[0]);
                    String string5 = I18n.a("gui.cancel", new Object[0]);
                    cu cu2 = new cu(this, string2, string3, string4, string5, this.bpG.Gw());
                    aER.a(cu2);
                }
            } else if (c2.id == 1) {
                this.EO();
            } else if (c2.id == 4) {
                this.bpP = true;
                this.bpR = new f(I18n.a("selectServer.defaultName", new Object[0]), "", false);
                aER.a(new cc(this, this.bpR));
            } else if (c2.id == 3) {
                this.bpN = true;
                this.bpR = new f(I18n.a("selectServer.defaultName", new Object[0]), "", false);
                aER.a(new bq(this, this.bpR));
            } else if (c2.id == 7 && aj2 instanceof dd) {
                this.bpO = true;
                f f2 = ((dd)aj2).Gv();
                this.bpR = new f(f2.fc, f2.bDH, false);
                this.bpR.d(f2);
                aER.a(new bq(this, this.bpR));
            } else if (c2.id == 0) {
                aER.a(this.bpF);
            } else if (c2.id == 8) {
                this.EN();
            } else if (c2.id == 9) {
                aER.a(new adv());
            } else if (c2.id == 10) {
                this.bpL.enabled = bpU = !bpU;
                bpH.HJ();
                this.bpG.a(bpH);
            } else if (c2.id == 11) {
                bpH.HL();
                bpH.HK();
                this.bpG.a(bpH);
            }
        }
    }

    private void EN() {
        aER.a(new aq(this.bpF));
    }

    @Override
    public void confirmClicked(boolean bl2, int n2) {
        aj aj2;
        aj aj3 = aj2 = this.bpG.Gw() < 0 ? null : this.bpG.bB(this.bpG.Gw());
        if (this.bpM) {
            this.bpM = false;
            if (bl2 && aj2 instanceof dd) {
                bpH.cm(this.bpG.Gw());
                bpH.HK();
                this.bpG.ca(-1);
                this.bpG.a(bpH);
            }
            aER.a(this);
        } else if (this.bpP) {
            this.bpP = false;
            if (bl2) {
                this.c(this.bpR);
            } else {
                aER.a(this);
            }
        } else if (this.bpN) {
            this.bpN = false;
            if (bl2) {
                bpH.e(this.bpR);
                bpH.HK();
                this.bpG.ca(-1);
                this.bpG.a(bpH);
            }
            aER.a(this);
        } else if (this.bpO) {
            this.bpO = false;
            if (bl2 && aj2 instanceof dd) {
                f f2 = ((dd)aj2).Gv();
                f2.fc = this.bpR.fc;
                f2.bDH = this.bpR.bDH;
                f2.d(this.bpR);
                bpH.HK();
                this.bpG.a(bpH);
            }
            aER.a(this);
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        aj aj2;
        int n3 = this.bpG.Gw();
        aj aj3 = aj2 = n3 < 0 ? null : this.bpG.bB(n3);
        if (n2 == 63) {
            this.EN();
        } else if (n3 >= 0) {
            if (n2 == 200) {
                if (aq.isShiftKeyDown()) {
                    if (n3 > 0 && aj2 instanceof dd) {
                        bpH.J(n3, n3 - 1);
                        this.bC(this.bpG.Gw() - 1);
                        this.bpG.scrollBy(-this.bpG.getSlotHeight());
                        this.bpG.a(bpH);
                    }
                } else if (n3 > 0) {
                    this.bC(this.bpG.Gw() - 1);
                    this.bpG.scrollBy(-this.bpG.getSlotHeight());
                    if (this.bpG.bB(this.bpG.Gw()) instanceof dc) {
                        if (this.bpG.Gw() > 0) {
                            this.bC(this.bpG.getSize() - 1);
                            this.bpG.scrollBy(-this.bpG.getSlotHeight());
                        } else {
                            this.bC(-1);
                        }
                    }
                } else {
                    this.bC(-1);
                }
            } else if (n2 == 208) {
                if (aq.isShiftKeyDown()) {
                    if (n3 < bpH.HM() - 1) {
                        bpH.J(n3, n3 + 1);
                        this.bC(n3 + 1);
                        this.bpG.scrollBy(this.bpG.getSlotHeight());
                        this.bpG.a(bpH);
                    }
                } else if (n3 < this.bpG.getSize()) {
                    this.bC(this.bpG.Gw() + 1);
                    this.bpG.scrollBy(this.bpG.getSlotHeight());
                    if (this.bpG.bB(this.bpG.Gw()) instanceof dc) {
                        if (this.bpG.Gw() < this.bpG.getSize() - 1) {
                            this.bC(this.bpG.getSize() + 1);
                            this.bpG.scrollBy(this.bpG.getSlotHeight());
                        } else {
                            this.bC(-1);
                        }
                    }
                } else {
                    this.bC(-1);
                }
            } else if (n2 != 28 && n2 != 156) {
                super.keyTyped(c2, n2);
            } else {
                this.actionPerformed((c)this.buttonList.get(2));
            }
        } else {
            super.keyTyped(c2, n2);
        }
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.bpQ = null;
        this.drawDefaultBackground();
        this.bpG.drawScreen(n2, n3, f2);
        this.drawCenteredString(this.fontRendererObj, I18n.a("multiplayer.title", new Object[0]) + (!bpU ? " (Normal)" : " (Finder)"), this.width / 2, 20, 0xFFFFFF);
        super.drawScreen(n2, n3, f2);
        if (this.bpQ != null) {
            this.drawHoveringText(Lists.newArrayList((Iterable)Splitter.on((String)"\n").split((CharSequence)this.bpQ)), n2, n3);
        }
    }

    public void EO() {
        aj aj2;
        aj aj3 = aj2 = this.bpG.Gw() < 0 ? null : this.bpG.bB(this.bpG.Gw());
        if (aj2 instanceof dd) {
            this.c(((dd)aj2).Gv());
        } else if (aj2 instanceof db) {
            net.minecraft.client.network.b b2 = ((db)aj2).Gs();
            this.c(new f(b2.HW(), b2.HX(), true));
        }
    }

    private void c(f f2) {
        aER.a(new b(this, aER, f2));
    }

    public void bC(int n2) {
        this.bpG.ca(n2);
        aj aj2 = n2 < 0 ? null : this.bpG.bB(n2);
        this.bpJ.enabled = false;
        this.bpI.enabled = false;
        this.bpK.enabled = false;
        if (aj2 != null && !(aj2 instanceof dc)) {
            this.bpJ.enabled = true;
            if (aj2 instanceof dd) {
                this.bpI.enabled = true;
                this.bpK.enabled = true;
            }
        }
    }

    public r EP() {
        return this.bpE;
    }

    public void cN(String string) {
        this.bpQ = string;
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        super.mouseClicked(n2, n3, n4);
        this.bpG.mouseClicked(n2, n3, n4);
    }

    @Override
    protected void mouseReleased(int n2, int n3, int n4) {
        super.mouseReleased(n2, n3, n4);
        this.bpG.p(n2, n3, n4);
    }

    public h EQ() {
        return bpH;
    }

    public boolean a(dd dd2, int n2) {
        return n2 > 0;
    }

    public boolean b(dd dd2, int n2) {
        return n2 < bpH.HM() - 1;
    }

    public void a(dd dd2, int n2, boolean bl2) {
        int n3 = bl2 ? 0 : n2 - 1;
        bpH.J(n2, n3);
        if (this.bpG.Gw() == n2) {
            this.bC(n3);
        }
        this.bpG.a(bpH);
    }

    public void b(dd dd2, int n2, boolean bl2) {
        int n3 = bl2 ? bpH.HM() - 1 : n2 + 1;
        bpH.J(n2, n3);
        if (this.bpG.Gw() == n2) {
            this.bC(n3);
        }
        this.bpG.a(bpH);
    }
}

