/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.aco;
import hackclient.rise.ady;
import hackclient.rise.aec;
import hackclient.rise.aee;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.afl;
import hackclient.rise.agf;
import hackclient.rise.agn;
import hackclient.rise.ago;
import hackclient.rise.agp;
import hackclient.rise.agz;
import hackclient.rise.aha;
import hackclient.rise.ahg;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akn;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dt;
import hackclient.rise.dx;
import hackclient.rise.fh;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.xi;
import hackclient.rise.yh;
import hackclient.rise.yi;
import hackclient.rise.yo;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import lombok.Generated;
import net.minecraft.client.d;
import net.minecraft.client.gui.ar;
import net.minecraft.client.gui.bp;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.x;
import net.minecraft.network.play.server.bm;
import net.minecraft.util.an;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.cf;
import net.minecraft.util.l;
import net.optifine.gui.c;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import rip.vantage.network.core.a;

@gl(aliases={"module.render.chat.name"}, description="module.render.chat.description", category=gj.RENDER, autoEnabled=true, allowDisable=false)
public final class yg
extends gi {
    private static final float are = 4.0f;
    private final akq arf = new akq("Open Height", this, (Number)130, (Number)0, (Number)200, (Number)1);
    private final akq arg = new akq("Width", this, (Number)320, (Number)40, (Number)320, (Number)1);
    private final akq arh = new akq("Max Closed Height", this, (Number)130, (Number)0, (Number)500, (Number)1);
    private final akq ari = new akq("Message disappearance speed", this, (Number)5000, (Number)0, (Number)5000, (Number)1);
    private final aki arj = new aki("Background", (gi)this, (Boolean)true);
    private final aki ark = new aki("Hide Player Source Messages", (gi)this, (Boolean)false);
    private final aki arl = new aki("Image Chat", (gi)this, (Boolean)true);
    private final yi arm = new yi();
    private final akn arn = new akn("", this, new aka(200.0, 200.0), false, true);
    private final afj aro = new afj(afk.aHn, 500L);
    private final afj arp = new afj(afk.aHt, 400L);
    private final afj arq = new afj(afk.aGW, 400L);
    private final afj arr = new afj(afk.aHn, 500L);
    private final agn ars = new agn();
    private final agf art;
    private final agf aru;
    private static final String arv = afl.getPrefix();
    private static final String arw = "[Rise] ";
    private static final agz arx = new agz();
    private final aki ary;
    private static final String arz = yg.mI();
    private static final int arA = 100;
    private int arB;
    private String arC;
    private agp arD;
    private int arE;
    private int arF;
    private float arG;
    public boolean anG;
    public boolean aed;
    private rip.vantage.commons.util.time.a bN;
    private aec<String> arH;
    private ArrayList<String> arI;
    private xi amO;
    @dm
    public final dk<dx> arJ;
    @dm
    public final dk<fh> arK;
    @dm
    public final dk<dt> arL;
    @dm
    public final dk<fs> arM;

    public yg() {
        this.art = yg.aER.fontRendererObj;
        this.aru = yg.aER.fontRendererObj;
        this.ary = new aki("Pinyin Chinese IME", (gi)this, (Boolean)false);
        this.arB = -1;
        this.arC = "";
        this.arD = new agp(new aka(0.0, 0.0), this.aru, Color.WHITE, ago.aJS, "", 1000.0f, arz);
        this.bN = new rip.vantage.commons.util.time.a();
        this.arH = new aec(20);
        this.arJ = dx2 -> {
            char c2 = dx2.cP();
            if (c2 == '.' || c2 == '\u3002') {
                String string;
                if (dx2.cQ() == null) {
                    aER.a(new aco(null));
                    dx2.cF();
                    return;
                }
                if (dx2.cQ() instanceof c && ((string = this.nc().getText()) == null || string.trim().isEmpty())) {
                    aER.a(new aco(yg.aER.bgR));
                    dx2.cF();
                    return;
                }
            }
            if (c2 == '/' || c2 == '.') {
                this.arD.I(true);
                this.arD.b(c2, dx2.cO());
            }
        };
        this.arK = fh2 -> {
            aj<?> aj2 = fh2.dq();
            if (aj2 instanceof bm) {
                this.arI = new ArrayList<String>(Arrays.asList(((bm)aj2).ahR()));
                for (String string : this.arI) {
                    afl.b(string, new Object[0]);
                }
            }
        };
        this.arL = dt2 -> {
            int n2 = dt2.cO();
            char c2 = dt2.cP();
            boolean bl2 = yg.aER.bgR instanceof c;
            if (Character.getType(c2) == 18 || c2 >= '\uf700' && c2 <= '\uf8ff') {
                c2 = '\u0000';
            }
            if (bl2 && ((Boolean)this.ary.wD()).booleanValue() && aha.isEnabled()) {
                this.arD.azF = true;
                if (arx.a(this.arD, c2, n2)) {
                    return;
                }
            }
            switch (n2) {
                case 28: {
                    if (this.arD.getText().isEmpty()) {
                        return;
                    }
                    String string = this.arD.getText();
                    if (!string.startsWith("#") && string.length() > 100 && this.arm.Z(string)) {
                        afl.d(afl.getPrefix() + String.valueOf((Object)an.dvX) + "Vanilla chat only sends 100 characters. Long image URLs will be truncated.", new Object[0]);
                    }
                    if (!string.startsWith("#") && string.length() > 100) {
                        string = string.substring(0, 100);
                    }
                    yg.aER.bgK.sendChatMessage(string);
                    if (this.arH.isEmpty() || !string.equals(this.arH.get(this.arH.size() - 1))) {
                        this.arH.add(string);
                    }
                    this.arD.Yg = "";
                    this.arD.aJV = 0;
                    this.arB = -1;
                    this.arC = "";
                    aER.a((bp)null);
                    return;
                }
                case 200: {
                    if (this.arH.isEmpty()) {
                        return;
                    }
                    if (this.arB == -1) {
                        this.arC = this.arD.Yg;
                        this.arB = 0;
                    } else {
                        this.arB = Math.min(this.arB + 1, this.arH.size() - 1);
                    }
                    int n3 = this.arH.size() - 1 - this.arB;
                    this.arD.Yg = (String)this.arH.get(n3);
                    this.arD.aJV = this.arD.Yg.length();
                    return;
                }
                case 208: {
                    if (this.arH.isEmpty() || this.arB == -1) {
                        return;
                    }
                    --this.arB;
                    if (this.arB < 0) {
                        this.arD.Yg = this.arC;
                        this.arD.aJV = this.arD.Yg.length();
                        this.arC = "";
                    } else {
                        int n4 = this.arH.size() - 1 - this.arB;
                        this.arD.Yg = (String)this.arH.get(n4);
                        this.arD.aJV = this.arD.Yg.length();
                    }
                    return;
                }
                case 15: {
                    if (this.arI == null) {
                        String string = this.nc().getText();
                        if (!string.startsWith(".") && !string.isEmpty()) {
                            b b2 = null;
                            if (yg.aER.bhc != null && yg.aER.bhc.dzu == cf.dzy) {
                                b2 = yg.aER.bhc.dg();
                            }
                            yg.aER.bgK.bkd.u(new x(string, b2));
                        }
                        this.arI = new ArrayList();
                    } else if (!this.arI.isEmpty()) {
                        CharSequence[] charSequenceArray = this.arD.getText().split(" ");
                        int n5 = this.arI.indexOf(charSequenceArray[charSequenceArray.length - 1]);
                        charSequenceArray[charSequenceArray.length - 1] = this.arI.get(this.arI.size() > n5 + 1 ? n5 + 1 : 0);
                        this.arD.Yg = String.join((CharSequence)" ", charSequenceArray);
                        this.arD.aJV = this.arD.getText().length();
                    }
                    return;
                }
            }
            this.arD.azF = bl2;
            this.arD.b(c2, n2);
        };
        this.arM = fs2 -> {
            this.mE();
            this.mH();
        };
        this.mG();
    }

    public void mE() {
        this.mG();
        this.rP();
        if (this.amO == null) {
            this.amO = this.e(xi.class);
        }
        boolean bl2 = ((akg)this.amO.md().wD()).getName().equals("Rise");
        this.aed = yg.aER.bgR instanceof c;
        this.arG = this.art.tF();
        ArrayList<net.minecraft.client.gui.a> arrayList = new ArrayList<net.minecraft.client.gui.a>(yg.aER.bha.Ey().bpZ);
        int n2 = this.p(arrayList);
        float f2 = Math.min((float)((Number)(this.aed ? this.arf : this.arh).wD()).intValue(), this.arG * (float)n2 + (float)(n2 == 0 ? 0 : 7));
        this.arr.Q(Math.min(f2, this.arG * (this.aed ? f2 : (float)this.arF) + (float)(this.arG * (this.aed ? f2 : (float)this.arF) == 0.0f ? 0 : 7)));
        this.arn.aHP = new aka(((Number)this.arg.wD()).doubleValue(), this.arr.sV());
        this.arn.aqy = new aka(this.rP().qt(), (double)(yg.aER.jY.getScaledHeight() - 10 - 20) - this.arn.aHP.y);
        aka aka2 = new aka(this.arn.aqy.x + 5.0, this.arn.aqy.y + this.arn.aHP.y - 1.5);
        aka aka3 = new aka(aka2.getX(), aka2.getY());
        double d2 = Math.min(this.arn.aHP.y / 5.0, 6.0);
        if (((Boolean)this.arj.wD()).booleanValue()) {
            if (bl2) {
                double d3 = this.amO != null ? this.amO.lU() : d2;
                this.b(gg.kV, 1).c(() -> ait.c(this.arn.aqy.x, this.arn.aqy.y, this.arn.aHP.x, this.arn.aHP.y, d3, ady.sa()));
                this.b(gg.kT).c(() -> ait.c(this.arn.aqy.x + 1.0, this.arn.aqy.y + 1.0, this.arn.aHP.x - 2.0, this.arn.aHP.y - 2.0, d3, this.rP().rU()));
                this.b(gg.kU).c(() -> ait.c(this.arn.aqy.x, this.arn.aqy.y, this.arn.aHP.x, this.arn.aHP.y, d3, Color.BLACK));
            } else {
                this.b(gg.kV, 1).c(() -> ait.d(this.arn.aqy.x, this.arn.aqy.y, this.arn.aHP.x, this.arn.aHP.y, new Color(0, 0, 0, 130)));
            }
        }
        this.b(gg.kV, 1).c(() -> {
            Iterable<net.minecraft.client.gui.a> iterable;
            block21: {
                block22: {
                    GL11.glEnable((int)3089);
                    ait.g(this.arn.aqy.x, this.arn.aqy.y, this.arn.aHP.x, this.arn.aHP.y);
                    this.aro.Q(0.0);
                    aka2.setY(aka2.getY() + this.aro.sV() - this.ars.tT());
                    this.ars.E(this.aed);
                    this.ars.H(true);
                    this.ars.V((double)(-this.arG * (float)n2) + this.arn.aHP.y - 6.0);
                    if (!this.aed) {
                        this.ars.U(0.0);
                    }
                    if (arrayList.size() > 150) {
                        iterable = yg.aER.bha.Ey().bpZ;
                        while (iterable.size() > 100) {
                            iterable.remove(iterable.size() - 1);
                        }
                    }
                    if (this.arE >= n2) break block21;
                    if (!((Boolean)this.ark.wD()).booleanValue()) break block22;
                    yg.aER.bha.Ey().bpZ.removeIf(a2 -> a2.DM().getFormattedText().contains(":"));
                    if (this.arE >= yg.aER.bha.Ey().bpZ.size()) break block21;
                }
                this.aro.T(this.aro.sV() + (double)((float)(n2 - this.arE) * this.arG));
                this.aro.Q(this.aro.sV());
                this.arF += n2 - this.arE;
                this.arF = (int)Math.max(Math.min((float)((Number)this.arh.wD()).intValue() / this.arG, (float)this.arF), 0.0f);
            }
            this.arE = n2;
            if (this.bN.T(((Number)this.ari.wD()).intValue()) || this.arF == 0) {
                this.bN.aX();
                this.arF = Math.max(0, this.arF - 1);
            }
            iterable = null;
            for (net.minecraft.client.gui.a a3 : arrayList) {
                int n3;
                aka2.setX(aka3.getX());
                yh yh2 = this.a(a3);
                float f2 = this.a(yh2);
                float f3 = f2 > 0.0f ? 4.0f : 0.0f;
                float f4 = this.arG + f3 + f2;
                aka2.setY(aka2.getY() - (double)f4);
                float f5 = (float)(aka2.getY() + (double)f2 + (double)f3);
                float f6 = (float)aka2.getY();
                double d2 = this.arn.aqy.y - (double)this.arG + (double)(this.aed ? 0 : 6);
                double d3 = this.arn.aqy.y + this.arn.aHP.y;
                if (aka2.y + (double)f4 < d2 || aka2.y > d3) continue;
                for (ba ba2 : a3.DM()) {
                    String string;
                    String string2 = ba2.arj();
                    an an2 = ba2.arp().arv() == null ? an.dwh : ba2.arp().arv();
                    float f7 = (float)aka2.getX();
                    float f8 = f5;
                    if (string2.startsWith(arv) || string2.startsWith(arw)) {
                        string = string2.startsWith(arv) ? arv : arw;
                        this.a(this.art, string, f7, f8);
                        float f9 = this.art.bQ(string);
                        if (this.aed && aee.e(f7, f8, f9, this.arG)) {
                            iterable = ba2;
                        }
                        aka2.x += (double)f9;
                        string2 = string2.substring(string.length());
                        f7 = (float)aka2.getX();
                    }
                    string = string2.toLowerCase();
                    String[] stringArray = new String[]{"billionaire2", "billionaire", a.aKQ().bX()};
                    int n4 = -1;
                    String string3 = null;
                    for (String string4 : stringArray) {
                        int n5 = string.indexOf(string4);
                        if (n5 == -1) continue;
                        n4 = n5;
                        string3 = string4;
                        break;
                    }
                    if (n4 != -1 && string3 != null) {
                        String string5 = string2.substring(0, n4);
                        String string6 = string2.substring(n4, n4 + string3.length());
                        String string7 = string2.substring(n4 + string3.length());
                        if (!string5.isEmpty()) {
                            this.art.b(String.valueOf((Object)an2) + (String)string5, f7, f8, 0xFFFFFF);
                            float f10 = this.art.bQ(string5);
                            if (this.aed && aee.e(f7, f8, f10, this.arG)) {
                                iterable = ba2;
                            }
                            aka2.x += (double)f10;
                            f7 = (float)aka2.getX();
                        }
                        this.a(this.art, string6, f7, f8);
                        float f11 = this.art.bQ(string6);
                        if (this.aed && aee.e(f7, f8, f11, this.arG)) {
                            iterable = ba2;
                        }
                        aka2.x += (double)f11;
                        f7 = (float)aka2.getX();
                        if (string7.isEmpty()) continue;
                        this.art.b(String.valueOf((Object)an2) + string7, f7, f8, 0xFFFFFF);
                        float f12 = this.art.bQ(string7);
                        if (this.aed && aee.e(f7, f8, f12, this.arG)) {
                            iterable = ba2;
                        }
                        aka2.x += (double)f12;
                        continue;
                    }
                    float f13 = (float)this.art.b(String.valueOf((Object)an2) + string2, f7, f8, 0xFFFFFF) - f7;
                    if (this.aed && aee.e(f7, f8, f13, this.arG)) {
                        iterable = ba2;
                    }
                    aka2.x += (double)f13;
                }
                int n6 = n3 = yh2 == null ? -1 : yh2.ny();
                if (yh2 == null || !(f2 > 0.0f) || n3 < 0) continue;
                int n7 = yh2.q(this.mF());
                int n8 = yh2.r(this.mF());
                ait.d(aka3.getX(), f6, n7, n8, new Color(30, 30, 30, 200));
                ait.a(n3, (float)aka3.getX(), f6, (float)n7, (float)n8, Color.WHITE);
            }
            if (iterable != null) {
                aka aka4 = aee.sk();
                yg.aER.bgR.handleComponentHover((ba)iterable, (int)aka4.getX(), (int)aka4.getY());
                if (!this.anG && Mouse.isButtonDown((int)0)) {
                    yg.aER.bgR.handleComponentClick((ba)iterable);
                }
                this.anG = Mouse.isButtonDown((int)0);
            }
            if (((Boolean)this.arj.wD()).booleanValue()) {
                this.ars.a(new aka(this.arn.aqy.x + this.arn.aHP.x - 5.0, this.arn.aqy.y + 5.0), this.arn.aHP.y - 10.0);
            }
            GL11.glDisable((int)3089);
        });
    }

    private int p(List<net.minecraft.client.gui.a> list) {
        int n2 = list.size();
        for (net.minecraft.client.gui.a a2 : list) {
            float f2 = this.a(this.a(a2));
            if (!(f2 > 0.0f)) continue;
            n2 += Math.max(1, (int)Math.ceil(f2 / this.arG));
        }
        return n2;
    }

    private float a(yh yh2) {
        if (!((Boolean)this.arl.wD()).booleanValue() || yh2 == null || yh2.nt() || !yh2.isLoaded()) {
            return 0.0f;
        }
        this.arm.c(yh2);
        return yh2.r(this.mF());
    }

    private float mF() {
        return Math.max(1.0f, (float)((Number)this.arg.wD()).doubleValue() - 10.0f);
    }

    private yh a(net.minecraft.client.gui.a a2) {
        if (!((Boolean)this.arl.wD()).booleanValue() || a2 == null || !a2.DQ()) {
            return null;
        }
        ba ba2 = a2.DP() == null ? a2.DM() : a2.DP();
        String string = this.arm.aa(ba2.arq());
        if (string == null) {
            return null;
        }
        yh yh2 = this.arm.ad(string);
        if (yh2 == null) {
            this.arm.b(new yh(string, a2.DN(), a2.DO()));
            yh2 = this.arm.ad(string);
        }
        return yh2;
    }

    private void mG() {
        if (aER == null || yg.aER.bha == null) {
            return;
        }
        if (yg.aER.bha.Ey() instanceof yo) {
            return;
        }
        ar ar2 = yg.aER.bha.Ey();
        yo yo2 = new yo(aER);
        if (ar2 != null) {
            yo2.ET().addAll(ar2.ET());
            yo2.EZ().addAll(ar2.EZ());
            yo2.bpZ.addAll(ar2.bpZ);
            yo2.bqa = ar2.bqa;
            yo2.bqb = ar2.bqb;
        }
        yg.aER.bha.bnA = yo2;
        System.out.println("[ChatImage] Installed RiseGuiNewChat hook");
    }

    public void mH() {
        this.rP();
        if (this.amO == null) {
            this.amO = this.e(xi.class);
        }
        boolean bl2 = ((akg)this.amO.md().wD()).getName().equals("Rise");
        if (!((Boolean)this.ary.wD()).booleanValue()) {
            arx.aX();
            aha.K(false);
            aha.setEnabled(false);
        } else {
            aha.K(true);
        }
        if (!this.aed) {
            arx.aX();
        }
        if (bl2) {
            this.arp.h(!this.aed ? 300L : 850L);
            this.arp.a(!this.aed ? afk.aHm : afk.aHt);
        } else {
            this.arp.h(0L);
            this.arp.a(!this.aed ? afk.aHm : afk.aHt);
        }
        this.arp.Q(!this.aed ? 0.0 : 1.0);
        this.arq.Q(this.aed ? 255.0 : 0.0);
        double d2 = this.arp.sV() > 1.0 ? 1.0 + (this.arp.sV() - 1.0) * 0.4 : this.arp.sV();
        this.arD.bY("");
        if (this.arp.sV() <= 0.0) {
            return;
        }
        aka aka2 = new aka(this.rP().qt(), (float)yg.aER.jY.getScaledHeight() - this.rP().qt() - gb.ks.a(20, gd.kG).tF() - 3.0f);
        aka aka3 = new aka(this.arn.aHP.x, (double)this.aru.tF() + 7.5);
        Runnable runnable = () -> {
            GlStateManager.JV();
            GlStateManager.C((aka2.x + aka3.x / 2.0) * (1.0 - d2), (aka2.y + aka3.y / 2.0) * (1.0 - d2), 0.0);
            GlStateManager.B(d2, d2, 0.0);
        };
        if (bl2) {
            double d3 = this.amO != null ? this.amO.lU() : 6.0;
            this.b(gg.kV, 1).c(() -> {
                runnable.run();
                ait.c(aka2.x, aka2.y, aka3.x, aka3.y, d3, ais.d(ady.sa(), Math.min((int)this.arq.sV(), ady.sa().getAlpha())));
                GlStateManager.JW();
            });
            this.b(gg.kT).c(() -> {
                runnable.run();
                ait.c(aka2.x, aka2.y, aka3.x, aka3.y, d3, this.rP().rU());
                GlStateManager.JW();
            });
            this.b(gg.kU).c(() -> {
                runnable.run();
                ait.c(aka2.x, aka2.y, aka3.x, aka3.y, d3, Color.BLACK);
                GlStateManager.JW();
            });
        } else {
            this.b(gg.kV, 1).c(() -> {
                runnable.run();
                ait.d(aka2.x, aka2.y, aka3.x, aka3.y, new Color(0, 0, 0, Math.min((int)this.arq.sV(), 130)));
                GlStateManager.JW();
            });
        }
        this.arD.b(ais.d(Color.WHITE, (int)this.arq.sV()));
        this.arD.c(this.aru);
        this.arD.h(new aka(this.rP().qt() + 5.0f, (float)yg.aER.jY.getScaledHeight() - this.aru.tF() - this.rP().qt()));
        this.b(gg.kV, 1).c(() -> {
            double d2;
            int n2;
            float f2;
            Object object;
            runnable.run();
            this.arD.pZ();
            if (this.aed && ((Boolean)this.ary.wD()).booleanValue()) {
                int n3 = Math.min(255, Math.max(0, (int)this.arq.sV()));
                object = ahg.cf(aha.isEnabled() ? "ui.chat.pinyin_ime.hint.on" : "ui.chat.pinyin_ime.hint.off");
                float f3 = (float)aka2.x + 6.0f;
                f2 = (float)aka2.y - this.aru.tF() - 2.0f;
                ArrayList<Object> arrayList = new ArrayList<Object>(3);
                arrayList.add(object);
                if (aha.isEnabled()) {
                    arrayList.add(ahg.cf("ui.chat.pinyin_ime.hint.help"));
                    try {
                        boolean bl2;
                        File file2 = d.AZ().bhf;
                        File file3 = file2 == null ? null : new File(file2, "Rise");
                        File file4 = file3 == null ? null : new File(file3, "pinyin_dict.properties");
                        File file5 = file3 == null ? null : new File(file3, "pinyin_dict.tsv");
                        File file6 = file3 == null ? null : new File(file3, "pinyin_dict.txt");
                        n2 = file4 != null && file4.isFile() ? 1 : 0;
                        n2 |= file5 != null && file5.isFile() ? 1 : 0;
                        if ((n2 |= file6 != null && file6.isFile() ? 1 : 0) == 0 && file3 != null && file3.isDirectory()) {
                            File[] fileArray = file3.listFiles((file, string) -> string != null && string.toLowerCase(Locale.ROOT).endsWith(".dict.yaml"));
                            n2 = fileArray != null && fileArray.length > 0 ? 1 : 0;
                        }
                        boolean bl3 = bl2 = n2 == 0;
                        if (bl2) {
                            arrayList.add(ahg.cf("ui.chat.pinyin_ime.dict.help"));
                        }
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                d2 = 4.0;
                double d3 = 2.0;
                double d4 = this.aru.tF();
                double d5 = 0.0;
                for (String string2 : arrayList) {
                    if (string2 == null || string2.isEmpty()) continue;
                    d5 = Math.max(d5, (double)this.aru.bQ(string2));
                }
                int n4 = Math.max(1, arrayList.size());
                double d6 = d5 + 8.0;
                double d7 = (double)n4 * d4 + 4.0 + (double)(n4 - 1);
                double d8 = (double)f3 - 4.0;
                double d9 = (double)f2 - (double)(n4 - 1) * (d4 + 1.0);
                double d10 = d9 - 2.0;
                double d11 = 6.0;
                this.b(gg.kU).c(() -> {
                    runnable.run();
                    ait.c(d8, d10, d6, d7, 6.0, Color.BLACK);
                    GlStateManager.JW();
                });
                this.b(gg.kT).c(() -> {
                    runnable.run();
                    ait.c(d8, d10, d6, d7, 6.0, this.rP().rU());
                    GlStateManager.JW();
                });
                ait.c(d8, d10, d6, d7, 6.0, ais.d(ady.sa(), Math.min(n3, ady.sa().getAlpha())));
                for (int i2 = 0; i2 < n4; ++i2) {
                    String string3 = (String)arrayList.get(i2);
                    if (string3 == null || string3.isEmpty()) continue;
                    float f4 = (float)((double)f2 - (double)i2 * (d4 + 1.0));
                    int n5 = i2 == 0 ? 180 : (i2 == 1 ? 140 : 120);
                    this.aru.b(string3, f3, f4, ais.d(Color.WHITE, Math.min(n3, n5)).hashCode());
                }
            }
            if (this.aed && ((Boolean)this.ary.wD()).booleanValue() && aha.isEnabled() && arx.ur()) {
                String string4 = arx.uD();
                object = arx.uE();
                if (string4 != null && !string4.isEmpty()) {
                    int n6 = Math.min(255, Math.max(0, (int)this.arq.sV()));
                    f2 = this.arD.ua();
                    float f5 = this.arD.ub();
                    this.aru.b(string4, f2, f5, ais.d(new Color(220, 220, 220), n6).hashCode());
                    d2 = this.aru.bQ(string4);
                    ait.d(f2, f5 + this.aru.tF() + 1.0f, d2, 1.0, ais.d(Color.WHITE, Math.min(n6, 180)));
                    if (object != null && !object.isEmpty()) {
                        float f6 = (float)this.arD.nH().x;
                        float f7 = f5 - this.aru.tF() - 3.0f;
                        StringBuilder stringBuilder = new StringBuilder();
                        n2 = Math.min(9, object.size());
                        int n7 = arx.uC();
                        for (int i3 = 0; i3 < n2; ++i3) {
                            if (i3 > 0) {
                                stringBuilder.append("  ");
                            }
                            String string5 = i3 + 1 + "." + (String)object.get(i3);
                            if (i3 == n7) {
                                stringBuilder.append('[').append(string5).append(']');
                                continue;
                            }
                            stringBuilder.append(string5);
                        }
                        stringBuilder.append(arx.uI());
                        String string6 = stringBuilder.toString();
                        double d12 = this.aru.bQ(string6) + 6;
                        double d13 = this.aru.tF() + 4.0f;
                        ait.d(f6 - 2.0f, f7 - 2.0f, d12, d13, ais.d(new Color(0, 0, 0), Math.min(n6, 140)));
                        this.aru.b(string6, f6 + 1.0f, f7, ais.d(Color.WHITE, n6).hashCode());
                    }
                }
            }
            GlStateManager.JW();
            if (!this.aed) {
                this.arD.Yg = "";
            }
        });
        if (!this.aed) {
            this.arD.Yg = "";
            this.arI = null;
        }
    }

    private void a(agf agf2, String string, float f2, float f3) {
        String string2 = an.ge(string);
        Color color = this.rP().rQ();
        Color color2 = this.rP().rR();
        long l2 = System.currentTimeMillis();
        double d2 = 0.005;
        float f4 = f2;
        int n2 = string2.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string2.charAt(i2);
            double d3 = (double)i2 / (double)n2 * Math.PI * 2.0;
            float f5 = (float)((Math.sin((double)l2 * d2 + d3) + 1.0) * 0.5);
            int n3 = (int)((float)color.getRed() + (float)(color2.getRed() - color.getRed()) * f5);
            int n4 = (int)((float)color.getGreen() + (float)(color2.getGreen() - color.getGreen()) * f5);
            int n5 = (int)((float)color.getBlue() + (float)(color2.getBlue() - color.getBlue()) * f5);
            int n6 = (int)((float)color.getAlpha() + (float)(color2.getAlpha() - color.getAlpha()) * f5);
            agf2.b(String.valueOf(c2), f4, f3, new Color(n3, n4, n5, n6).getRGB());
            f4 += (float)agf2.bQ(String.valueOf(c2));
        }
    }

    private static String mI() {
        StringBuilder stringBuilder = new StringBuilder(4096);
        for (char c2 = '\u0000'; c2 < '\uffff'; c2 = (char)(c2 + '\u0001')) {
            if (!l.o(c2) && c2 != 32) continue;
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    @Generated
    public akq mJ() {
        return this.arf;
    }

    @Generated
    public akq mK() {
        return this.arg;
    }

    @Generated
    public akq mL() {
        return this.arh;
    }

    @Generated
    public akq mM() {
        return this.ari;
    }

    @Generated
    public aki mN() {
        return this.arj;
    }

    @Generated
    public aki mO() {
        return this.ark;
    }

    @Generated
    public aki mP() {
        return this.arl;
    }

    @Generated
    public yi mQ() {
        return this.arm;
    }

    @Generated
    public akn mR() {
        return this.arn;
    }

    @Generated
    public afj mS() {
        return this.aro;
    }

    @Generated
    public afj mT() {
        return this.arp;
    }

    @Generated
    public afj mU() {
        return this.arq;
    }

    @Generated
    public afj mV() {
        return this.arr;
    }

    @Generated
    public agn mW() {
        return this.ars;
    }

    @Generated
    public agf mX() {
        return this.art;
    }

    @Generated
    public agf mY() {
        return this.aru;
    }

    @Generated
    public aki mZ() {
        return this.ary;
    }

    @Generated
    public int na() {
        return this.arB;
    }

    @Generated
    public String nb() {
        return this.arC;
    }

    @Generated
    public agp nc() {
        return this.arD;
    }

    @Generated
    public int nd() {
        return this.arE;
    }

    @Generated
    public int ne() {
        return this.arF;
    }

    @Generated
    public float nf() {
        return this.arG;
    }

    @Generated
    public boolean ng() {
        return this.anG;
    }

    @Generated
    public boolean kq() {
        return this.aed;
    }

    @Generated
    public rip.vantage.commons.util.time.a nh() {
        return this.bN;
    }

    @Generated
    public aec<String> ni() {
        return this.arH;
    }

    @Generated
    public ArrayList<String> nj() {
        return this.arI;
    }

    @Generated
    public xi nk() {
        return this.amO;
    }

    @Generated
    public dk<dx> nl() {
        return this.arJ;
    }

    @Generated
    public dk<fh> nm() {
        return this.arK;
    }

    @Generated
    public dk<dt> nn() {
        return this.arL;
    }

    @Generated
    public dk<fs> mn() {
        return this.arM;
    }
}

