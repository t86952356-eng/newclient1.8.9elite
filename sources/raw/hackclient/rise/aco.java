/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.lwjgl.input.Keyboard
 */
package hackclient.rise;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import hackclient.rise.a;
import hackclient.rise.acp;
import hackclient.rise.acq;
import hackclient.rise.acs;
import hackclient.rise.act;
import hackclient.rise.acu;
import hackclient.rise.acv;
import hackclient.rise.acw;
import hackclient.rise.acx;
import hackclient.rise.acy;
import hackclient.rise.acz;
import hackclient.rise.ada;
import hackclient.rise.adb;
import hackclient.rise.adc;
import hackclient.rise.add;
import hackclient.rise.ade;
import hackclient.rise.adf;
import hackclient.rise.ady;
import hackclient.rise.aee;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.afm;
import hackclient.rise.afz;
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
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.p;
import hackclient.rise.s;
import hackclient.rise.u;
import hackclient.rise.v;
import hackclient.rise.xi;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.client.gui.bp;
import org.lwjgl.input.Keyboard;

public final class aco
extends bp {
    private static final double aAW = -0.5;
    private static final double aAX = 28.0;
    private static final double aAY = 2.0;
    private static final long aAZ = 3000L;
    private static final agf aBa = gb.ks.a(17, gd.kF);
    private static final agf aBb = gb.ks.a(13, gd.kG);
    private static final agf aBc = gb.ks.a(12, gd.kG);
    private final bp aBd;
    private final agp aBe;
    private final agz aBf = new agz();
    private final agn aBg = new agn();
    private final afj aBh = new afj(afk.aGY, 1L);
    private final rip.vantage.commons.util.time.a aBi = new rip.vantage.commons.util.time.a();
    private final List<acu> aBj = new ArrayList<acu>();
    private List<acu> aBk = new ArrayList<acu>();
    private final Map<String, add> aBl = new HashMap<String, add>();
    private List<adb> aBm = new ArrayList<adb>();
    private boolean aBn;
    private boolean aBo;
    private adc aBp;
    private double aBq;
    private double aBr;
    private double aBs;
    private double aBt;
    private double aBu = 36.0;
    private double aBv;
    private double aBw;
    private double aBx;
    private double aBy;
    private String aBz = "";
    private int aBA;
    private String statusMessage = "";
    private Color statusColor = new Color(255, 90, 90);
    private String aBB;
    private String aBC;
    private String aBD;
    private boolean aBE;
    private String aBF;
    private boolean aBG;
    private boolean aBH;
    private boolean aBI = true;
    private long aBJ;
    private long aBK;
    @dm
    public final dk<fs> aBL = fs2 -> {
        if (aco.aER.bgR != this) {
            return;
        }
        double d2 = 10.0;
        try {
            xi xi2 = this.e(xi.class);
            if (xi2 != null && ((Boolean)xi2.aoL.wD()).booleanValue()) {
                Color color = ais.d(ady.sa(), 255);
                this.b(gg.kU).c(() -> ait.c(this.aBq, this.aBr, this.aBs, this.aBt, d2, color));
                this.b(gg.kT).c(() -> ait.c(this.aBq, this.aBr, this.aBs, this.aBt, d2 + 2.0, this.rP().rU()));
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    };

    public aco(bp bp2) {
        this.aBd = bp2;
        this.aBe = new agp(new aka(0.0, 0.0), gb.ks.a(20, gd.kG), Color.WHITE, ago.aJS, ahg.cf("ui.command.palette.placeholder"), 400.0f);
        this.aBe.I(true);
        this.aBe.bX(".");
        this.aBe.ar(1);
        this.aBh.T(0.0);
        this.aBh.R(0.0);
        a.a.i().aQ().forEach(s2 -> this.aBj.add(new acu((s)s2)));
        this.aBk = new ArrayList<acu>(this.aBj);
        this.ru();
        a.a.e().b(this);
    }

    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.aBe.I(true);
        this.aBe.ar(this.aBe.getText().length());
        this.statusMessage = "";
        this.aBi.aX();
        try {
            afm.sY().th();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
        a.a.e().c(this);
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        double d2 = this.qZ();
        this.ri();
        this.rk();
        this.K(d2);
        this.ra();
        this.L(d2);
        this.M(d2);
        this.N(d2);
        this.a(n2, n3, d2);
        this.O(d2);
        super.drawScreen(n2, n3, f2);
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (this.ab(n2)) {
            return;
        }
        if (aha.isEnabled() && this.aBf.a(this.aBe, c2, n2)) {
            this.rb();
            return;
        }
        switch (n2) {
            case 1: {
                aER.a(this.aBd);
                return;
            }
            case 200: {
                this.aa(-1);
                return;
            }
            case 208: {
                this.aa(1);
                return;
            }
            case 15: {
                if (this.aBn) {
                    this.rs();
                } else {
                    this.rd();
                }
                return;
            }
            case 28: {
                if (!this.aBn) {
                    String string;
                    String string2 = this.aBe.getText();
                    if (string2 == null) {
                        string2 = "";
                    }
                    if (!(string = this.aS(string2)).isEmpty() && !string.contains(" ")) {
                        int n3;
                        String string3 = null;
                        int n4 = this.rl();
                        int n5 = this.rm();
                        if (n4 != -1 && this.aBA == n4) {
                            String string4 = this.aBC == null ? "" : this.aBC;
                            var9_12 = this.aS(string4);
                            String[] stringArray = var10_14 = ((String)var9_12).trim().isEmpty() ? new String[]{} : ((String)var9_12).trim().split("\\s+");
                            if (var10_14.length > 0) {
                                string3 = var10_14[0];
                            }
                        } else if (n5 != -1 && this.aBA == n5) {
                            String string5 = this.aBB == null ? "" : this.aBB;
                            var9_12 = this.aS(string5);
                            String[] stringArray = var10_14 = ((String)var9_12).trim().isEmpty() ? new String[]{} : ((String)var9_12).trim().split("\\s+");
                            if (var10_14.length > 0) {
                                string3 = var10_14[0];
                            }
                        } else if (!this.aBk.isEmpty() && (n3 = this.ag(this.aBA)) >= 0 && n3 < this.aBk.size()) {
                            var9_12 = this.aBk.get(n3);
                            string3 = ((acu)var9_12).aBV;
                        }
                        if (string3 != null && !string3.isEmpty()) {
                            boolean bl2;
                            String string6 = string2.trim();
                            boolean bl3 = string2.endsWith(" ");
                            boolean bl4 = bl2 = (string6.equals("." + string3) || string6.equals("/" + string3)) && bl3;
                            if (bl2) {
                                this.re();
                            } else {
                                this.rd();
                            }
                        } else {
                            this.rd();
                        }
                        return;
                    }
                }
                if (this.aBn && this.qY()) {
                    this.rs();
                    return;
                }
                if (this.aBe.getText().trim().isEmpty()) {
                    this.rd();
                    return;
                }
                this.re();
                return;
            }
        }
        this.aBe.b(c2, n2);
        this.rb();
    }

    private boolean qY() {
        char c2;
        String string;
        String string2;
        if (!this.aBn || this.aBm.isEmpty()) {
            return false;
        }
        String string3 = this.aBe.getText();
        if (string3 == null) {
            string3 = "";
        }
        if ((string2 = (string = (c2 = this.aP(string3)) != '\u0000' && string3.startsWith(String.valueOf(c2)) ? string3.substring(1) : string3).trim()).isEmpty()) {
            return false;
        }
        String[] stringArray = string2.split("\\s+");
        if (stringArray.length == 0) {
            return false;
        }
        int n2 = Math.max(0, Math.min(this.aBA, this.aBm.size() - 1));
        adb adb2 = this.aBm.get(n2);
        int n3 = adb2.aCo;
        if (n3 + 1 >= stringArray.length) {
            return true;
        }
        String string4 = stringArray[n3 + 1];
        String string5 = adb2.aCn;
        return !string4.equals(string5);
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        int n5;
        if (this.ac(n4)) {
            return;
        }
        if (n4 == 0 && !aee.a(this.aBq, this.aBr, this.aBs, this.aBt, n2, n3)) {
            aER.a(this.aBd);
            return;
        }
        this.aBe.d(n2, n3, n4);
        if (n4 == 0 && (n5 = this.j(n2, n3)) != -1) {
            this.aBA = n5;
            if (this.aBn) {
                this.rs();
            } else if (bp.isShiftKeyDown()) {
                int n6 = this.rl();
                int n7 = this.rm();
                if (n6 != -1 && n5 == n6) {
                    this.ro();
                } else if (n7 != -1 && n5 == n7) {
                    this.rr();
                } else {
                    int n8 = this.ag(n5);
                    if (n8 >= 0 && n8 < this.aBk.size()) {
                        this.a(this.aBk.get(n8));
                    }
                }
            } else {
                this.rd();
            }
        }
        super.mouseClicked(n2, n3, n4);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    private double qZ() {
        this.aBh.Q(1.0);
        return Math.min(1.0, this.aBh.sV());
    }

    private void K(double d2) {
        double d3;
        this.aBs = Math.min(this.width - 80, 500);
        int n2 = Math.max(1, this.rh());
        double d4 = Math.max(28.0, (double)n2 * 30.0 - 2.0);
        double d5 = Math.min((double)(this.height - 80), Math.max(300.0, (double)this.height * 0.6));
        double d6 = 200.0;
        double d7 = this.aBu + -1.0 + 14.0 + d4 + 10.0;
        d7 = Math.max(d6, Math.min(d5, d7));
        if (this.aBt == 0.0) {
            this.aBt = d7;
        } else {
            d3 = 1.0;
            this.aBt += (d7 - this.aBt) * d3;
        }
        this.aBq = ((double)this.width - this.aBs) / 2.0;
        d3 = ((double)this.height - d5) / 2.0;
        this.aBr = d3 + (1.0 - d2) * 12.0;
        this.aBv = this.aBq + -0.5;
        this.aBx = this.aBs - -1.0;
        this.aBw = this.aBr + -0.5 + this.aBu + 10.0;
        this.aBy = this.aBt - (this.aBu + -1.0 + 14.0);
    }

    private void L(double d2) {
        double d3 = 10.0;
        Color color = ais.d(Color.BLACK, (int)(43.0 * d2));
        ait.c(this.aBq - 3.0, this.aBr - 3.0, this.aBs + 6.0, this.aBt + 6.0, d3 + 2.0, color);
        Color color2 = ais.d(ady.sa(), 115);
        ait.c(this.aBq, this.aBr, this.aBs, this.aBt, d3, color2);
        Color color3 = ais.d(this.rP().rQ(), (int)(65.0 * d2));
        Color color4 = ais.d(this.rP().rR(), (int)(40.0 * d2));
        ait.a(this.aBq, this.aBr, this.aBs, this.aBt, d3, 1.0, color3, color4);
    }

    private void M(double d2) {
        String string;
        double d3 = this.aBq + -0.5;
        double d4 = this.aBr + -0.5;
        double d5 = this.aBs - -1.0;
        this.aBe.z((float)(d5 - 24.0));
        this.aBe.h(new aka(d3 + 12.0, d4 + (this.aBu - (double)this.aBe.eb().tF()) / 2.0 + 1.5));
        this.aBe.b(ais.d(Color.WHITE, (int)(255.0 * d2)));
        this.aBe.I(true);
        String string2 = this.aBe.aJX;
        if (aha.isEnabled() && this.aBf.ur() && (string = this.aBf.uD()) != null && !string.isEmpty()) {
            this.aBe.aJX = "";
        }
        this.aBe.pZ();
        this.aBe.aJX = string2;
        this.k(d3 + 12.0, d4 + (this.aBu - (double)this.aBe.eb().tF()) / 2.0 + 1.5, d2);
        if (aha.isEnabled() && this.aBf.ur()) {
            string = this.aBf.uD();
            List<String> list = this.aBf.uE();
            if (string != null && !string.isEmpty()) {
                float f2 = this.aBe.ua();
                float f3 = this.aBe.ub();
                int n2 = ais.d(Color.WHITE, (int)(215.0 * d2)).getRGB();
                aBa.a(string, f2, f3, n2);
                ait.d(f2, f3 + aBa.tF() + 1.0f, aBa.bQ(string), 1.0, ais.d(Color.WHITE, (int)(160.0 * d2)));
                if (list != null && !list.isEmpty()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    int n3 = Math.min(9, list.size());
                    int n4 = this.aBf.uC();
                    for (int i2 = 0; i2 < n3; ++i2) {
                        if (i2 > 0) {
                            stringBuilder.append("  ");
                        }
                        String string3 = i2 + 1 + "." + list.get(i2);
                        if (i2 == n4) {
                            stringBuilder.append('[').append(string3).append(']');
                            continue;
                        }
                        stringBuilder.append(string3);
                    }
                    stringBuilder.append(this.aBf.uI());
                    String string4 = stringBuilder.toString();
                    double d6 = 6.0;
                    double d7 = (double)aBa.bQ(string4) + d6 * 2.0;
                    double d8 = (double)aBa.tF() + d6 * 2.0;
                    double d9 = f2 - 2.0f;
                    double d10 = f3 + aBa.tF() + 6.0f;
                    double d11 = 8.0;
                    this.b(gg.kT).c(() -> ait.c(d9, d10, d7, d8, d11 + 2.0, this.rP().rU()));
                    ait.c(d9, d10, d7, d8, d11, ais.d(ady.sa(), 190));
                    aBa.a(string4, d9 + d6, d10 + d6, ais.d(Color.WHITE, 230).getRGB());
                }
            }
        }
    }

    private void k(double d2, double d3, double d4) {
        int n2;
        Object object;
        String string;
        if (aha.isEnabled() && this.aBf.ur() && (string = this.aBf.uD()) != null && !string.isEmpty()) {
            return;
        }
        string = this.aBe.getText();
        if (string == null || string.isEmpty()) {
            return;
        }
        Object object2 = null;
        if (this.aBn && !this.aBm.isEmpty()) {
            String string2;
            this.aBA = Math.max(0, Math.min(this.aBA, this.aBm.size() - 1));
            object = this.aBm.get(this.aBA);
            String string3 = this.aS(string);
            String[] stringArray = string3.trim().isEmpty() ? new String[]{} : string3.split("\\s+");
            n2 = ((adb)object).aCo + 1;
            boolean bl2 = stringArray.length > n2;
            String string4 = string2 = bl2 ? stringArray[n2] : null;
            if (string2 != null && !string2.isEmpty()) {
                String string5 = ((adb)object).aCn;
                if (string5.toLowerCase(Locale.ROOT).startsWith(string2.toLowerCase(Locale.ROOT)) && !string2.equalsIgnoreCase(string5)) {
                    object2 = string5.substring(string2.length());
                }
            } else {
                boolean bl3 = stringArray.length <= n2;
                boolean bl4 = string.endsWith(" ");
                String string6 = ((adb)object).aCn;
                object2 = (bl3 && !bl4 ? " " : "") + string6;
            }
        } else if (!this.aBk.isEmpty()) {
            int n3 = this.rl();
            int n4 = this.rm();
            if (n3 != -1 && this.aBA == n3 && this.aBC != null && (string.startsWith(".") || string.startsWith("/"))) {
                String string7 = string.length() > 0 ? string.substring(1) : "";
                String string8 = this.aBC.trim();
                if (string8.startsWith(".") || string8.startsWith("/")) {
                    string8 = string8.substring(1);
                }
                if (string8.toLowerCase(Locale.ROOT).startsWith(string7.toLowerCase(Locale.ROOT)) && !string7.equalsIgnoreCase(string8)) {
                    object2 = string8.substring(Math.min(string7.length(), string8.length()));
                }
            } else if (n4 != -1 && this.aBA == n4 && this.aBB != null && (string.startsWith(".") || string.startsWith("/"))) {
                String string9 = string.length() > 0 ? string.substring(1) : "";
                String string10 = this.aBB.trim();
                if (string10.startsWith(".") || string10.startsWith("/")) {
                    string10 = string10.substring(1);
                }
                if (string10.toLowerCase(Locale.ROOT).startsWith(string9.toLowerCase(Locale.ROOT)) && !string9.equalsIgnoreCase(string10)) {
                    object2 = string10.substring(Math.min(string9.length(), string10.length()));
                }
            } else {
                int n5 = this.ag(this.aBA);
                n5 = Math.max(0, Math.min(n5, this.aBk.size() - 1));
                acu acu2 = this.aBk.get(n5);
                String string11 = this.aS(string);
                String string12 = acu2.aBV;
                if ((string.startsWith(".") || string.startsWith("/")) && string12.toLowerCase(Locale.ROOT).startsWith(string11.toLowerCase(Locale.ROOT)) && !string11.equalsIgnoreCase(string12)) {
                    object2 = string12.substring(string11.length());
                }
            }
        }
        if (object2 != null && !((String)object2).isEmpty()) {
            object = this.aBe.eb();
            double d5 = d2 + (double)((agf)object).bQ(string);
            n2 = ais.d(Color.WHITE, (int)(120.0 * d4)).getRGB();
            ((agf)object).a((String)object2, d5, d3, n2);
        }
    }

    private void N(double d2) {
        String[] stringArray;
        int n2 = ais.d(Color.WHITE, (int)(155.0 * d2)).getRGB();
        String string = this.aS(this.aBe.getText());
        String[] stringArray2 = stringArray = string.isEmpty() ? new String[]{} : string.split("\\s+");
        String string2 = stringArray.length >= 2 ? (this.aBn ? ahg.cf("ui.command.palette.hint.arguments") : ahg.cf("ui.command.palette.hint.commands")) : (this.aBn ? ahg.cf("ui.command.palette.hint.arguments") : ahg.cf("ui.command.palette.hint.commands"));
        double d3 = this.aBq + -0.5 + 8.0;
        double d4 = this.aBr + -0.5 + this.aBu + 3.0;
        aBc.a(string2, d3, d4, n2);
    }

    private void a(int n2, int n3, double d2) {
        ait.c(this.aBv, this.aBw, this.aBx, this.aBy, 8.0, ais.d(Color.BLACK, (int)(45.0 * d2)));
        double d3 = this.aBv + 6.0;
        double d4 = this.aBx - 12.0;
        double d5 = this.aBy - 8.0;
        int n4 = this.rh();
        double d6 = Math.max(0.0, (double)n4 * 30.0 - 2.0);
        double d7 = Math.max(0.0, d6 - d5);
        this.aBg.V(-d7);
        this.aBg.qN();
        ait.g(this.aBv, this.aBw, this.aBx, this.aBy);
        double d8 = this.aBw + 5.0 + this.aBg.tT();
        int n5 = this.j(n2, n3);
        for (int i2 = 0; i2 < n4; ++i2) {
            Object object;
            double d9 = d8 + (double)i2 * 30.0;
            double d10 = d9 + 28.0;
            if (d10 < this.aBw || d9 > this.aBw + this.aBy) continue;
            boolean bl2 = i2 == this.aBA;
            boolean bl3 = i2 == n5;
            double d11 = 1.0;
            if (n4 > 1) {
                double d12 = (double)i2 / (double)(n4 - 1);
                d11 = 1.0 - d12 * 0.35;
            }
            int n6 = bl2 ? 95 : (bl3 ? 60 : 38);
            n6 = (int)((double)n6 * d11);
            ait.c(d3, d9, d4, 28.0, 6.0, ais.d(Color.WHITE, (int)((double)n6 * d2)));
            if (this.aBn) {
                adb adb2 = this.aBm.get(i2);
                this.a(adb2, d3 + 8.0, d9 + 5.0, d4 - 16.0, d2);
                continue;
            }
            int n7 = this.rl();
            int n8 = this.rm();
            if (n7 != -1 && i2 == n7) {
                Color color = ais.d(this.rP().rQ(), (int)(85.0 * d2));
                object = ais.d(this.rP().rR(), (int)(55.0 * d2));
                ait.a(d3, d9, d4, 28.0, 6.0, 1.0, color, (Color)object);
                this.a(this.aBC, this.aBD, d3 + 8.0, d9 + 5.0, d4 - 16.0, d2);
                continue;
            }
            if (n8 != -1 && i2 == n8) {
                this.a(this.aBB, d3 + 8.0, d9 + 5.0, d4 - 16.0, d2);
                continue;
            }
            int n9 = this.ag(i2);
            if (n9 < 0 || n9 >= this.aBk.size()) continue;
            object = this.aBk.get(n9);
            this.a((acu)object, d3 + 8.0, d9 + 5.0, d4 - 16.0, d2);
        }
        if (n4 == 0) {
            agf agf2 = gb.ks.a(15, gd.kG);
            String string = this.rt();
            agf2.c(string, this.aBv + this.aBx / 2.0, this.aBw + this.aBy / 2.0 - (double)agf2.tF() / 2.0, ais.d(Color.WHITE, (int)(180.0 * d2)).getRGB());
        }
        ait.vY();
        this.aBg.a(new aka(this.aBv + this.aBx - 4.0, this.aBw + 6.0), this.aBy - 12.0);
    }

    private void a(acu acu2, double d2, double d3, double d4, double d5) {
        int n2;
        double d6 = d3 + (28.0 - (double)aBa.tF()) / 2.0;
        int n3 = ais.d(Color.WHITE, (int)(255.0 * d5)).getRGB();
        String string = "." + acu2.aBV;
        aBa.a(string, d2, d6, n3);
        double d7 = d2 + (double)aBa.bQ(string) + 10.0;
        double d8 = d6 + (double)aBa.tF() - (double)aBb.tF() - 1.0;
        StringBuilder stringBuilder = new StringBuilder();
        if (acu2.aBX != null && !acu2.aBX.isEmpty()) {
            stringBuilder.append(acu2.aBX);
        }
        if (acu2.aBZ != null && !acu2.aBZ.isEmpty()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("  ");
            }
            stringBuilder.append(acu2.aBZ);
        }
        if (stringBuilder.length() > 0) {
            n2 = ais.d(Color.WHITE, (int)(205.0 * d5)).getRGB();
            aBb.a(stringBuilder.toString(), d7, d8, n2);
            d7 += (double)aBb.bQ(stringBuilder.toString());
        }
        if (!acu2.aCa.isEmpty()) {
            if (stringBuilder.length() > 0) {
                d7 += (double)aBb.bQ("  ");
            }
            n2 = ais.d(Color.WHITE, (int)(155.0 * d5)).getRGB();
            aBb.a(acu2.aCa, d7, d8, n2);
        }
    }

    private void a(adb adb2, double d2, double d3, double d4, double d5) {
        int n2;
        double d6 = d3 + (28.0 - (double)aBa.tF()) / 2.0;
        int n3 = ais.d(Color.WHITE, (int)(250.0 * d5)).getRGB();
        String string = adb2.aCk;
        aBa.a(string, d2, d6, n3);
        double d7 = d2 + (double)aBa.bQ(string) + 10.0;
        double d8 = d6 + (double)aBa.tF() - (double)aBb.tF();
        if (!adb2.aCl.isEmpty()) {
            n2 = ais.d(Color.WHITE, (int)(220.0 * d5)).getRGB();
            aBb.a(adb2.aCl, d7, d8, n2);
            d7 += (double)aBb.bQ(adb2.aCl);
        }
        if (!adb2.aCm.isEmpty()) {
            if (!adb2.aCl.isEmpty()) {
                d7 += (double)aBb.bQ("  ");
            }
            n2 = ais.d(Color.WHITE, (int)(155.0 * d5)).getRGB();
            aBb.a(adb2.aCm, d7, d8, n2);
        }
    }

    private void O(double d2) {
        if (!this.statusMessage.isEmpty() && !this.aBi.T(3000L)) {
            double d3 = 1.0 - (double)this.aBi.aKM() / 3000.0;
            d3 = Math.max(0.0, Math.min(1.0, d3));
            int n2 = (int)((double)this.statusColor.getAlpha() * d3);
            agf agf2 = gb.ks.a(13, gd.kF);
            agf2.a(this.statusMessage, this.aBq + -0.5, this.aBr + this.aBt - -0.5 - (double)agf2.tF() + 4.0, ais.d(this.statusColor, n2).getRGB());
        }
    }

    private void ra() {
        String string = this.aBe.getText();
        if (string == null) {
            string = "";
        }
        if (string.equals(this.aBz)) {
            return;
        }
        this.aBz = string;
        String string2 = this.aS(string);
        String string3 = string2.toLowerCase(Locale.ROOT);
        ArrayList<acu> arrayList = new ArrayList<acu>();
        if (string3.isEmpty()) {
            arrayList.addAll(this.aBj);
            arrayList.sort((acu2, acu3) -> {
                long l2;
                long l3 = aco.aR(acu2.aBV);
                if (l3 != (l2 = aco.aR(acu3.aBV))) {
                    return Long.compare(l2, l3);
                }
                return acu2.aBV.compareToIgnoreCase(acu3.aBV);
            });
        } else {
            for (acu acu4 : this.aBj) {
                double d2 = acu4.aU(string3);
                if (!(d2 > 0.0)) continue;
                acu4.aCb = d2;
                arrayList.add(acu4);
            }
            arrayList.sort((acu2, acu3) -> {
                long l2;
                int n2 = Double.compare(acu3.aCb, acu2.aCb);
                if (n2 != 0) {
                    return n2;
                }
                long l3 = aco.aR(acu2.aBV);
                if (l3 != (l2 = aco.aR(acu3.aBV))) {
                    return Long.compare(l2, l3);
                }
                return acu2.aBV.compareToIgnoreCase(acu3.aBV);
            });
        }
        this.aBk = arrayList;
        this.aK(string2);
        this.rg();
    }

    private void rb() {
        this.aBz = null;
        this.ra();
    }

    private void aa(int n2) {
        int n3 = this.rh();
        if (n3 == 0) {
            return;
        }
        this.aBA = Math.max(0, Math.min(n3 - 1, this.aBA + n2));
        this.rc();
    }

    private void rc() {
        if (this.rh() == 0) {
            return;
        }
        double d2 = this.aBw + 6.0;
        double d3 = this.aBw + this.aBy - 6.0;
        double d4 = this.aBw + 6.0 + this.aBg.tT() + (double)this.aBA * 30.0;
        double d5 = d4 + 28.0;
        if (d4 < d2) {
            this.aBg.U(Math.min(0.0, this.aBg.tS() + (d2 - d4)));
        } else if (d5 > d3) {
            this.aBg.U(Math.max(this.aBg.tU(), this.aBg.tS() - (d5 - d3)));
        }
    }

    private void rd() {
        if (this.aBn) {
            return;
        }
        int n2 = this.rl();
        int n3 = this.rm();
        if (n2 != -1 && this.aBA == n2) {
            this.rn();
            return;
        }
        if (n3 != -1 && this.aBA == n3) {
            this.rq();
            return;
        }
        if (this.aBk.isEmpty()) {
            return;
        }
        int n4 = this.ag(this.aBA);
        if (n4 < 0 || n4 >= this.aBk.size()) {
            return;
        }
        acu acu2 = this.aBk.get(n4);
        String string = "." + acu2.aBV + " ";
        this.aBe.bX(string);
        this.aBe.ar(string.length());
        this.rb();
    }

    private void re() {
        String string = this.aBe.getText().trim();
        if (string.isEmpty()) {
            return;
        }
        u u2 = a.a.i().a(string, false);
        if (u2 == u.bs) {
            aER.a(this.aBd);
        } else if (u2 == u.bt) {
            this.a(ahg.cf("command.unknown"), new Color(255, 90, 90));
        }
    }

    private boolean ab(int n2) {
        p p2 = this.rf();
        if (p2 == null) {
            return false;
        }
        if (n2 == 0) {
            return false;
        }
        int n3 = n2 == 1 ? 0 : n2;
        this.a(p2, n3);
        return true;
    }

    private boolean ac(int n2) {
        p p2 = this.rf();
        if (p2 == null) {
            return false;
        }
        this.a(p2, n2 - 100);
        return true;
    }

    private void a(p p2, int n2) {
        String[] stringArray = p2.getAliases();
        if (stringArray == null || stringArray.length == 0) {
            this.a(ahg.cf("command.bind.invalidmodule"), new Color(255, 90, 90));
            return;
        }
        String string = stringArray[0].replace(" ", "");
        String string2 = ".bind " + string + " " + v.c(n2);
        u u2 = a.a.i().a(string2, false);
        if (u2 == u.bs) {
            aER.a(this.aBd);
        } else if (u2 == u.bt) {
            this.a(ahg.cf("command.unknown"), new Color(255, 90, 90));
        }
    }

    private p rf() {
        String string;
        if (!this.aBo || this.aBp == null) {
            return null;
        }
        if (!this.aT(this.aBp.rz())) {
            return null;
        }
        String[] stringArray = this.aBp.rA();
        if (stringArray.length == 0) {
            return null;
        }
        String string2 = string = stringArray[0] == null ? "" : stringArray[0].trim();
        if (string.isEmpty()) {
            return null;
        }
        if (stringArray.length >= 2) {
            String string3;
            String string4 = string3 = stringArray[1] == null ? "" : stringArray[1].trim();
            if (!string3.isEmpty()) {
                return null;
            }
        }
        return a.a.t().a(string);
    }

    private void a(acu acu2) {
        String string = "." + acu2.aBV;
        u u2 = a.a.i().a(string, false);
        if (u2 == u.bs) {
            aER.a(this.aBd);
        } else {
            this.a(ahg.cf("command.unknown"), new Color(255, 90, 90));
        }
    }

    private void aK(String string) {
        this.aBm = Collections.emptyList();
        this.aBn = false;
        this.aBo = false;
        this.aBp = null;
        String string2 = this.aBe.getText();
        if (string2 == null) {
            string2 = "";
        }
        if (string2.isEmpty()) {
            this.rg();
            return;
        }
        String string3 = string2;
        char c2 = this.aP(string2);
        if (c2 != '\u0000' && string2.startsWith(String.valueOf(c2))) {
            string3 = string2.substring(1);
        }
        boolean bl2 = string3.endsWith(" ");
        String string4 = string3.trim();
        if (string4.isEmpty()) {
            this.rg();
            return;
        }
        String[] stringArray = string4.split("\\s+");
        if (stringArray.length == 0) {
            this.rg();
            return;
        }
        String string5 = stringArray[0];
        add add2 = this.aBl.get(string5.toLowerCase(Locale.ROOT));
        if (add2 == null) {
            this.rg();
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        if (stringArray.length == 1) {
            arrayList.add(stringArray[0].length() == string4.length() ? "" : string4.substring(stringArray[0].length()).trim());
        } else {
            arrayList.addAll(Arrays.asList(stringArray).subList(1, stringArray.length));
            if (bl2) {
                arrayList.add("");
            }
        }
        String[] stringArray2 = arrayList.toArray(new String[0]);
        adc adc2 = new adc(string5, stringArray2, string4);
        this.aBo = true;
        this.aBp = adc2;
        try {
            add2.a(adc2);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        List<adb> list = add2.b(adc2);
        this.aBm = list == null ? Collections.emptyList() : list;
        this.aBn = !this.aBm.isEmpty();
        this.rg();
    }

    private void rg() {
        int n2 = this.rh();
        if (n2 <= 0) {
            this.aBA = 0;
            this.aBg.U(0.0);
            return;
        }
        this.aBA = Math.max(0, Math.min(this.aBA, n2 - 1));
    }

    private int rh() {
        if (this.aBn) {
            return this.aBm.size();
        }
        int n2 = 0;
        if (this.aBC != null) {
            ++n2;
        }
        if (this.aBE && this.aBB != null) {
            ++n2;
        }
        return this.aBk.size() + n2;
    }

    private void ri() {
        boolean bl2;
        if (this.aBn) {
            return;
        }
        String string = this.aS(this.aBe.getText());
        boolean bl3 = bl2 = string == null || string.isEmpty();
        if (!bl2) {
            if (this.aBI && this.aBH && !this.aBG && this.aBF != null) {
                try {
                    afm.sY().bJ(this.aBF);
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            this.aBH = false;
            this.aBG = false;
            this.aBI = false;
            this.aBJ = 0L;
            this.aBC = null;
            this.aBD = null;
            this.aBF = null;
            return;
        }
        this.aBI = true;
        try {
            String string2;
            String string3;
            String string4;
            String string5;
            Object object;
            boolean bl4;
            afm afm2 = afm.sY();
            long l2 = System.currentTimeMillis();
            long l3 = afm2.tf();
            boolean bl5 = bl4 = l3 > 0L && l2 - l3 <= 60000L;
            if (this.aBH && this.aBC != null && this.aBF != null && !this.aBG && !bl4 && l2 - this.aBK < 1000L) {
                return;
            }
            this.aBC = null;
            this.aBD = null;
            this.aBF = null;
            long l4 = 30000L;
            if (bl4) {
                boolean bl6;
                String string6 = this.aM(afm2.tg());
                String string7 = "serverJoin.configLoad" + (String)(string6 == null ? "" : ":" + string6.toLowerCase(Locale.ROOT));
                String string8 = afm2.tc();
                long l5 = afm2.te();
                boolean bl7 = bl6 = string6 != null && string8 != null && string6.equalsIgnoreCase(string8) && l5 > 0L && l5 >= l3;
                if (!bl6 && afm2.bG(string7)) {
                    this.aBF = string7;
                    String string9 = this.aL("config");
                    this.aBC = string6 == null ? string9 + " load " : string9 + " load " + string6;
                    this.aBD = "ui.command.palette.suggested.reason.serverJoin";
                    afm2.bH(string7);
                    this.aBH = true;
                    this.aBK = l2;
                    return;
                }
            }
            boolean bl8 = afm2.c("cmd:bind", 30000L);
            boolean bl9 = afm2.c("cmd:toggle", 30000L);
            boolean bl10 = afm2.c("cmd:module", 30000L);
            boolean bl11 = afm2.c("cmd:friend", 30000L);
            String string10 = afm2.tc();
            String string11 = afm2.td();
            long l6 = afm2.te();
            if (!(string10 == null || string10.trim().isEmpty() || string11 == null || string11.trim().isEmpty() || "latest".equalsIgnoreCase(string10.trim()) || l6 > 0L && System.currentTimeMillis() - l6 < 7500L)) {
                String string12;
                boolean bl12;
                String string13 = aco.a(afz.b(false, false));
                boolean bl13 = bl12 = string13 != null && !string13.equals(string11);
                if (bl12) {
                    if (this.aBJ == 0L) {
                        this.aBJ = System.currentTimeMillis();
                    }
                } else {
                    this.aBJ = 0L;
                }
                if (bl12 && afm2.bG(string12 = "config.save.dirty:" + string10.trim().toLowerCase(Locale.ROOT))) {
                    this.aBF = string12;
                    this.aBC = this.aL("config") + " save " + string10.trim();
                    this.aBD = "ui.command.palette.suggested.reason.dirtyConfig";
                    afm2.bH(string12);
                    this.aBH = true;
                    this.aBK = l2;
                    return;
                }
            }
            try {
                long l7 = afm2.ti();
                int n2 = afm2.tj();
                if (!(l7 < 180000L || n2 < 6 || string10 == null || string10.trim().isEmpty() || string11 == null || string11.trim().isEmpty() || "latest".equalsIgnoreCase(string10.trim()))) {
                    String string14;
                    boolean bl14;
                    object = aco.a(afz.b(false, false));
                    boolean bl15 = bl14 = object != null && !((String)object).equals(string11);
                    if (bl14 && afm2.bG(string14 = "config.save.big:" + string10.trim().toLowerCase(Locale.ROOT))) {
                        this.aBF = string14;
                        this.aBC = this.aL("config") + " save " + string10.trim();
                        this.aBD = "ui.command.palette.suggested.reason.dirtyConfig";
                        afm2.bH(string14);
                        this.aBH = true;
                        this.aBK = l2;
                        return;
                    }
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            if (bl8) {
                List<acp> list = this.ad(6);
                for (acp acp2 : list) {
                    object = "bind.unbound:" + acp2.aBN;
                    if (!afm2.bG((String)object)) continue;
                    this.aBF = object;
                    this.aBC = this.aL("bind") + " " + acp2.aBM;
                    this.aBD = "ui.command.palette.suggested.reason.bindUnboundFrequent";
                    afm2.bH((String)object);
                    this.aBH = true;
                    this.aBK = l2;
                    return;
                }
            }
            if (bl9) {
                List<acx> list = this.ae(6);
                for (acx acx2 : list) {
                    object = "toggle.recent:" + acx2.aCf;
                    if (!afm2.bG((String)object)) continue;
                    this.aBF = object;
                    this.aBC = this.aL("toggle") + " " + acx2.aCe;
                    this.aBD = "ui.command.palette.suggested.reason.toggleRecent";
                    afm2.bH((String)object);
                    this.aBH = true;
                    this.aBK = l2;
                    return;
                }
            }
            if (bl10) {
                List<acx> list = this.af(6);
                for (acx acx3 : list) {
                    object = "module.recent:" + acx3.aCf;
                    if (!afm2.bG((String)object)) continue;
                    this.aBF = object;
                    this.aBC = this.aL("module") + " " + acx3.aCe;
                    this.aBD = "ui.command.palette.suggested.reason.moduleRecent";
                    afm2.bH((String)object);
                    this.aBH = true;
                    this.aBK = l2;
                    return;
                }
            }
            if (bl11 && afm2.bG(string5 = "friend.recent")) {
                this.aBF = string5;
                this.aBC = this.aL("friend") + " ";
                this.aBD = "ui.command.palette.suggested.reason.friendRecent";
                afm2.bH(string5);
                this.aBH = true;
                this.aBK = l2;
                return;
            }
            if (afm2.c("cmd:config", 30000L) && (string4 = this.rj()) != null && (l6 == 0L || System.currentTimeMillis() - l6 > 120000L) && afm2.bG(string3 = "config.load.mostUsed")) {
                this.aBF = string3;
                String string15 = this.aL("config");
                this.aBC = string15 + string4.substring(".config".length());
                this.aBD = "ui.command.palette.suggested.reason.mostUsedConfig";
                afm2.bH(string3);
                this.aBH = true;
                this.aBK = l2;
                return;
            }
            String string16 = this.rp();
            if (string16 != null && !string16.isEmpty() && afm2.bG(string2 = "cmd.mostUsed")) {
                this.aBF = string2;
                this.aBC = "." + string16;
                this.aBD = "ui.command.palette.suggested.reason.mostUsed";
                afm2.bH(string2);
                this.aBH = true;
                this.aBK = l2;
            }
            if (this.aBC == null) {
                if (string16 != null && !string16.isEmpty()) {
                    this.aBF = "cmd.mostUsed";
                    this.aBC = "." + string16;
                    this.aBD = "ui.command.palette.suggested.reason.mostUsed";
                    this.aBH = true;
                    this.aBK = l2;
                } else if (!this.aBk.isEmpty()) {
                    this.aBF = "cmd.topResult";
                    this.aBC = "." + this.aBk.get((int)0).aBV;
                    this.aBD = "ui.command.palette.suggested.reason.mostUsed";
                    this.aBH = true;
                    this.aBK = l2;
                }
            }
        }
        catch (Throwable throwable) {
            this.aBC = null;
            this.aBD = null;
            this.aBF = null;
        }
    }

    private String aL(String string) {
        try {
            if (string == null || string.isEmpty()) {
                return ".";
            }
            Object t2 = a.a.i().b(string);
            if (t2 == null) {
                return "." + string;
            }
            String[] stringArray = ((s)t2).getExpressions();
            String string2 = afm.sY().a(string, stringArray);
            if (string2 == null || string2.trim().isEmpty()) {
                string2 = string;
            }
            return "." + string2.trim();
        }
        catch (Throwable throwable) {
            return "." + (string == null ? "" : string);
        }
    }

    private String aM(String string) {
        try {
            String string2;
            String string3 = string2 = string == null ? "" : string.trim().toLowerCase(Locale.ROOT);
            if (string2.isEmpty()) {
                return null;
            }
            int n2 = string2.indexOf(58);
            if (n2 > 0) {
                string2 = string2.substring(0, n2);
            }
            if (string2.isEmpty()) {
                return null;
            }
            String[] stringArray = this.aN(string2);
            if (stringArray.length == 0) {
                return null;
            }
            String string4 = null;
            int n3 = -1;
            long l2 = -1L;
            for (afz afz2 : a.a.p()) {
                long l3;
                int n4;
                String string5;
                String[] stringArray2;
                String string6;
                if (afz2 == null || afz2.getName() == null || (string6 = afz2.getName().trim()).isEmpty() || "latest".equalsIgnoreCase(string6) || (stringArray2 = this.aN(string5 = string6.toLowerCase(Locale.ROOT))).length == 0 || (n4 = this.a(stringArray, stringArray2, string5)) < 2 || (l3 = afm.sY().bA("config.load:" + string5)) <= l2 && (l3 != l2 || n4 <= n3)) continue;
                l2 = l3;
                n3 = n4;
                string4 = string6;
            }
            return string4;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private String[] aN(String string) {
        if (string == null) {
            return new String[0];
        }
        String string2 = string.replace("https://", "").replace("http://", "").replace("www.", "");
        string2 = string2.replaceAll("[^a-z0-9]+", " ");
        if ((string2 = string2.trim()).isEmpty()) {
            return new String[0];
        }
        String[] stringArray = string2.split("\\s+");
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string3 : stringArray) {
            if (string3 == null || string3.length() < 3 || string3.equals("play") || string3.equals("mc") || string3.equals("server") || string3.equals("net") || string3.equals("com") || string3.equals("org")) continue;
            arrayList.add(string3);
        }
        return arrayList.toArray(new String[0]);
    }

    private int a(String[] stringArray, String[] stringArray2, String string) {
        int n2 = 0;
        for (String string2 : stringArray) {
            for (String string3 : stringArray2) {
                if (string2.equals(string3)) {
                    n2 += 3;
                    break;
                }
                if (!string3.startsWith(string2) && !string2.startsWith(string3)) continue;
                n2 += 2;
                break;
            }
            if (!string.contains(string2)) continue;
            n2 += 2;
        }
        return n2;
    }

    private List<acp> ad(int n2) {
        try {
            if (n2 <= 0) {
                return Collections.emptyList();
            }
            afm afm2 = afm.sY();
            ArrayList<acp> arrayList = new ArrayList<acp>();
            for (gi gi2 : a.a.g().ef()) {
                String string;
                Object object;
                Object object2;
                if (gi2 == null || gi2.getKey() != 0 || gi2 instanceof xi) continue;
                Object object3 = null;
                String string2 = null;
                long l2 = 0L;
                ArrayList<Object> arrayList2 = new ArrayList<Object>();
                try {
                    object2 = gi2.getAliases();
                    if (object2 != null) {
                        object = object2;
                        int n3 = ((String[])object).length;
                        for (int i2 = 0; i2 < n3; ++i2) {
                            Object object4 = object[i2];
                            if (object4 == null || (string = ((String)object4).replace(" ", "").trim()).isEmpty()) continue;
                            arrayList2.add(string);
                        }
                    }
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                if ((object2 = gi2.getName()) != null && !((String)(object = ((String)object2).replace(" ", "").trim())).isEmpty()) {
                    arrayList2.add(object);
                }
                object = new HashSet();
                ArrayList<Object> arrayList3 = new ArrayList<Object>();
                for (Object object4 : arrayList2) {
                    string = ((String)object4).toLowerCase(Locale.ROOT);
                    if (!object.add(string)) continue;
                    arrayList3.add(object4);
                }
                for (Object object4 : arrayList3) {
                    string = ((String)object4).toLowerCase(Locale.ROOT);
                    long l3 = 0L;
                    l3 += afm2.bA("bind.target:" + string) * 3L;
                    l3 += afm2.bA("arg:toggle:0:" + string) * 2L;
                    if ((l3 += afm2.bA("arg:bind:0:" + string)) <= l2) continue;
                    l2 = l3;
                    object3 = object4;
                    string2 = string;
                }
                if (object3 == null || string2 == null || l2 <= 0L) continue;
                arrayList.add(new acp((String)object3, string2, l2));
            }
            arrayList.sort((acp2, acp3) -> Long.compare(acp3.aBO, acp2.aBO));
            if (arrayList.size() > n2) {
                return new ArrayList<acp>(arrayList.subList(0, n2));
            }
            return arrayList;
        }
        catch (Throwable throwable) {
            return Collections.emptyList();
        }
    }

    private List<acx> ae(int n2) {
        return this.a("arg:toggle:0:", 2L, 1L, n2, true);
    }

    private List<acx> af(int n2) {
        return this.a("arg:module:0:", 1L, 0L, n2, false);
    }

    private List<acx> a(String string, long l2, long l3, int n2, boolean bl2) {
        try {
            if (n2 <= 0) {
                return Collections.emptyList();
            }
            afm afm2 = afm.sY();
            ArrayList<acx> arrayList = new ArrayList<acx>();
            for (gi gi2 : a.a.g().ef()) {
                List<String> list;
                if (gi2 == null || gi2 instanceof xi || (list = this.m(gi2)).isEmpty()) continue;
                String string2 = null;
                String string3 = null;
                long l4 = 0L;
                long l5 = 0L;
                for (String string4 : list) {
                    String string5 = string4.toLowerCase(Locale.ROOT);
                    long l6 = afm2.bA(string + string5);
                    long l7 = l3 > 0L ? afm2.bA("arg:toggle:0:" + string5) : 0L;
                    long l8 = l6 * l2 + l7 * l3;
                    l5 += l8;
                    if (l8 <= l4) continue;
                    l4 = l8;
                    string2 = string4;
                    string3 = string5;
                }
                if (string2 == null || string3 == null || l5 <= 0L) continue;
                arrayList.add(new acx(string2, string3, l5, gi2.isEnabled()));
            }
            arrayList.sort((acx2, acx3) -> {
                if (bl2 && acx2.aCh != acx3.aCh) {
                    return acx2.aCh ? 1 : -1;
                }
                return Long.compare(acx3.aCg, acx2.aCg);
            });
            if (arrayList.size() > n2) {
                return new ArrayList<acx>(arrayList.subList(0, n2));
            }
            return arrayList;
        }
        catch (Throwable throwable) {
            return Collections.emptyList();
        }
    }

    private List<String> m(gi gi2) {
        String string;
        Object object;
        Object object2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        try {
            object2 = gi2.getAliases();
            if (object2 != null) {
                object = object2;
                int n2 = ((String[])object).length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    Object object3 = object[i2];
                    if (object3 == null || (string = ((String)object3).replace(" ", "").trim()).isEmpty()) continue;
                    arrayList.add(string);
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if ((object2 = gi2.getName()) != null && !((String)(object = ((String)object2).replace(" ", "").trim())).isEmpty()) {
            arrayList.add(object);
        }
        object = new HashSet();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (Object object3 : arrayList) {
            string = ((String)object3).toLowerCase(Locale.ROOT);
            if (!object.add(string)) continue;
            arrayList2.add((String)object3);
        }
        return arrayList2;
    }

    private String rj() {
        try {
            afm afm2 = afm.sY();
            List<String> list = afm2.j("config.load:", 8);
            if (list == null || list.isEmpty()) {
                return null;
            }
            for (String string : list) {
                String string2 = this.r(string, "config.load:");
                if (string2 == null || string2.isEmpty() || "latest".equalsIgnoreCase(string2)) continue;
                for (afz afz2 : a.a.p()) {
                    if (afz2 == null || afz2.getName() == null || "latest".equalsIgnoreCase(afz2.getName()) || !afz2.getName().equalsIgnoreCase(string2)) continue;
                    return ".config load " + afz2.getName();
                }
                return ".config load " + string2;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return null;
    }

    private String r(String string, String string2) {
        if (string == null || string2 == null) {
            return null;
        }
        if (!string.startsWith(string2)) {
            return null;
        }
        return string.substring(string2.length());
    }

    private static String a(JsonObject jsonObject) {
        try {
            if (jsonObject == null) {
                return null;
            }
            JsonObject jsonObject2 = jsonObject.deepCopy();
            jsonObject2.remove("Metadata");
            jsonObject2.remove("theme");
            String string = a.a.A().toJson((JsonElement)jsonObject2);
            return aco.aO(string);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static String aO(String string) {
        if (string == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] byArray = messageDigest.digest(string.getBytes(StandardCharsets.UTF_8));
            StringBuilder stringBuilder = new StringBuilder(byArray.length * 2);
            for (byte by2 : byArray) {
                stringBuilder.append(String.format("%02x", by2));
            }
            return stringBuilder.toString();
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private void rk() {
        if (this.aBn) {
            this.aBE = false;
            return;
        }
        String string = this.aS(this.aBe.getText());
        if (string != null && !string.isEmpty()) {
            this.aBE = false;
            return;
        }
        try {
            String[] stringArray;
            Object object = afm.sY().tb();
            if (object == null) {
                this.aBE = false;
                return;
            }
            if (((String)(object = ((String)object).trim())).isEmpty()) {
                this.aBE = false;
                return;
            }
            String string2 = this.aS((String)object).toLowerCase(Locale.ROOT).trim();
            String[] stringArray2 = stringArray = string2.isEmpty() ? new String[]{} : string2.split("\\s+");
            if (stringArray.length >= 3 && "load".equalsIgnoreCase(stringArray[1]) && "latest".equalsIgnoreCase(stringArray[2])) {
                try {
                    Object t2 = a.a.i().b("config");
                    if (t2 != null) {
                        String string3 = stringArray[0];
                        for (String string4 : ((s)t2).getExpressions()) {
                            if (string4 == null || !string4.trim().equalsIgnoreCase(string3)) continue;
                            this.aBE = false;
                            return;
                        }
                    }
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            if (!((String)object).startsWith(".") && !((String)object).startsWith("/")) {
                object = "." + (String)object;
            }
            this.aBB = object;
            this.aBE = true;
        }
        catch (Throwable throwable) {
            this.aBE = false;
        }
    }

    private int rl() {
        if (this.aBn) {
            return -1;
        }
        return this.aBC == null ? -1 : 0;
    }

    private int rm() {
        if (this.aBn) {
            return -1;
        }
        if (!this.aBE || this.aBB == null) {
            return -1;
        }
        int n2 = this.rl();
        if (n2 != -1) {
            return 1;
        }
        return this.aBk.isEmpty() ? 0 : 1;
    }

    private int ag(int n2) {
        int n3 = this.rl();
        if (n3 != -1 && n2 == n3) {
            return -1;
        }
        int n4 = this.rm();
        if (n4 == -1) {
            return n2;
        }
        if (n2 == n4) {
            return -1;
        }
        int n5 = 0;
        if (n3 != -1 && n2 > n3) {
            ++n5;
        }
        if (n4 != -1 && n2 > n4) {
            ++n5;
        }
        return n2 - n5;
    }

    private void rn() {
        if (this.aBC == null) {
            return;
        }
        if (this.aBF != null) {
            try {
                afm.sY().bI(this.aBF);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        this.aBG = true;
        Object object = this.aBC;
        if (!((String)object).endsWith(" ")) {
            object = (String)object + " ";
        }
        this.aBe.bX((String)object);
        this.aBe.ar(((String)object).length());
        this.rb();
    }

    private void ro() {
        if (this.aBC == null) {
            return;
        }
        if (this.aBF != null) {
            try {
                afm.sY().bI(this.aBF);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        this.aBG = true;
        u u2 = a.a.i().a(this.aBC, false);
        if (u2 == u.bs) {
            aER.a(this.aBd);
        } else {
            this.a(ahg.cf("command.unknown"), new Color(255, 90, 90));
        }
    }

    private void a(String string, String string2, double d2, double d3, double d4, double d5) {
        String string3;
        if (string == null) {
            return;
        }
        double d6 = d3 + (28.0 - (double)aBa.tF()) / 2.0;
        int n2 = ais.d(Color.WHITE, (int)(255.0 * d5)).getRGB();
        String string4 = ahg.cf("ui.command.palette.suggested.meta");
        int n3 = ais.d(Color.WHITE, (int)(175.0 * d5)).getRGB();
        double d7 = aBb.bQ(string4);
        double d8 = d2 + Math.max(0.0, d4 - d7);
        double d9 = d6 + (double)aBa.tF() - (double)aBb.tF() - 1.0;
        aBb.a(string4, d8, d9, n3);
        String string5 = string3 = string2 == null ? "" : ahg.cf(string2);
        if (string2 != null && string2.equals(string3)) {
            string3 = "";
        }
        double d10 = Math.max(0.0, d4 - d7 - 10.0);
        String string6 = this.a(aBa, string, d10);
        aBa.a(string6, d2, d6, n2);
        if (!string3.isEmpty()) {
            double d11 = d2 + (double)aBa.bQ(string6) + 10.0;
            double d12 = Math.max(0.0, d8 - d11 - 10.0);
            String string7 = this.a(aBb, string3, d12);
            int n4 = ais.d(Color.WHITE, (int)(160.0 * d5)).getRGB();
            aBb.a(string7, d11, d9, n4);
        }
    }

    private String rp() {
        try {
            String string = null;
            long l2 = 0L;
            for (acu acu2 : this.aBj) {
                long l3;
                if (acu2 == null || acu2.aBV == null || (l3 = aco.aR(acu2.aBV)) <= l2) continue;
                l2 = l3;
                string = acu2.aBV;
            }
            return string;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private void rq() {
        if (this.aBB == null) {
            return;
        }
        Object object = this.aBB;
        if (!((String)object).endsWith(" ")) {
            object = (String)object + " ";
        }
        this.aBe.bX((String)object);
        this.aBe.ar(((String)object).length());
        this.rb();
    }

    private void rr() {
        if (this.aBB == null) {
            return;
        }
        u u2 = a.a.i().a(this.aBB, false);
        if (u2 == u.bs) {
            aER.a(this.aBd);
        } else {
            this.a(ahg.cf("command.unknown"), new Color(255, 90, 90));
        }
    }

    private void a(String string, double d2, double d3, double d4, double d5) {
        if (string == null) {
            return;
        }
        double d6 = d3 + (28.0 - (double)aBa.tF()) / 2.0;
        int n2 = ais.d(Color.WHITE, (int)(255.0 * d5)).getRGB();
        String string2 = ahg.cf("ui.command.palette.previous.meta");
        int n3 = ais.d(Color.WHITE, (int)(165.0 * d5)).getRGB();
        double d7 = aBb.bQ(string2);
        double d8 = d2 + Math.max(0.0, d4 - d7);
        double d9 = d6 + (double)aBa.tF() - (double)aBb.tF() - 1.0;
        aBb.a(string2, d8, d9, n3);
        double d10 = Math.max(0.0, d4 - d7 - 10.0);
        String string3 = this.a(aBa, string, d10);
        aBa.a(string3, d2, d6, n2);
    }

    private String a(agf agf2, String string, double d2) {
        if (string == null) {
            return "";
        }
        if (d2 <= 0.0) {
            return "";
        }
        if ((double)agf2.bQ(string) <= d2) {
            return string;
        }
        String string2 = "\u2026";
        if ((double)agf2.bQ(string2) > d2) {
            return "";
        }
        int n2 = 0;
        int n3 = string.length();
        while (n2 < n3) {
            int n4 = n2 + n3 + 1 >>> 1;
            String string3 = string.substring(0, n4) + string2;
            if ((double)agf2.bQ(string3) <= d2) {
                n2 = n4;
                continue;
            }
            n3 = n4 - 1;
        }
        return string.substring(0, n2) + string2;
    }

    private void rs() {
        if (!this.aBn || this.aBm.isEmpty()) {
            return;
        }
        this.aBA = Math.max(0, Math.min(this.aBA, this.aBm.size() - 1));
        this.a(this.aBm.get(this.aBA));
    }

    private void a(adb adb2) {
        if (adb2 == null) {
            return;
        }
        this.a(adb2.aCo, adb2.aCn, adb2.aCp);
    }

    private void a(int n2, String string, boolean bl2) {
        String string2 = this.aBe.getText();
        if (string2 == null) {
            string2 = "";
        }
        char c2 = this.aP(string2);
        String string3 = this.aS(string2);
        if (string3.isEmpty()) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(string3.split("\\s+")));
        while (arrayList.size() <= n2 + 1) {
            arrayList.add("");
        }
        arrayList.set(n2 + 1, string);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (String string4 : arrayList) {
            if (string4 == null || string4.isEmpty()) continue;
            arrayList2.add(string4);
        }
        Object object = String.join((CharSequence)" ", arrayList2);
        if (c2 != '\u0000') {
            object = c2 + (String)object;
        }
        if (bl2) {
            object = (String)object + " ";
        }
        this.aBe.bX((String)object);
        this.aBe.ar(((String)object).length());
        this.rb();
    }

    private char aP(String string) {
        if (string == null) {
            return '\u0000';
        }
        String string2 = string.trim();
        if (string2.startsWith(".")) {
            return '.';
        }
        if (string2.startsWith("/")) {
            return '/';
        }
        return '\u0000';
    }

    private void a(String string, Color color) {
        this.statusMessage = string;
        this.statusColor = color;
        this.aBi.aX();
    }

    private static String aQ(String string) {
        if (string == null) {
            return "";
        }
        String string2 = string.trim();
        if (string2.isEmpty()) {
            return "";
        }
        try {
            String[] stringArray;
            Object t2 = a.a.i().b(string2);
            if (t2 != null && (stringArray = ((s)t2).getExpressions()) != null && stringArray.length > 0 && stringArray[0] != null && !stringArray[0].trim().isEmpty()) {
                return stringArray[0].trim().toLowerCase(Locale.ROOT);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return string2.toLowerCase(Locale.ROOT);
    }

    private static long aR(String string) {
        if (string == null || string.trim().isEmpty()) {
            return 0L;
        }
        return afm.sY().bA("cmd:" + string.trim().toLowerCase(Locale.ROOT));
    }

    private static long b(String string, int n2, String string2) {
        if (string == null || string.isEmpty()) {
            return 0L;
        }
        if (n2 < 0) {
            return 0L;
        }
        if (string2 == null) {
            return 0L;
        }
        String string3 = string2.trim();
        if (string3.isEmpty()) {
            return 0L;
        }
        String string4 = string.toLowerCase(Locale.ROOT);
        String string5 = string3.toLowerCase(Locale.ROOT);
        return afm.sY().bA("arg:" + string4 + ":" + n2 + ":" + string5);
    }

    private int j(int n2, int n3) {
        if (!aee.a(this.aBv, this.aBw, this.aBx, this.aBy, n2, n3)) {
            return -1;
        }
        int n4 = this.rh();
        if (n4 == 0) {
            return -1;
        }
        double d2 = this.aBw + 6.0 + this.aBg.tT();
        for (int i2 = 0; i2 < n4; ++i2) {
            double d3 = d2 + (double)i2 * 30.0;
            if (!((double)n3 >= d3) || !((double)n3 <= d3 + 28.0)) continue;
            return i2;
        }
        return -1;
    }

    private String aS(String string) {
        if (string == null) {
            return "";
        }
        String string2 = string.trim();
        if (string2.startsWith(".") || string2.startsWith("/")) {
            string2 = string2.substring(1);
        }
        return string2;
    }

    private String rt() {
        if (!this.aBo || this.aBp == null) {
            return ahg.cf("ui.command.palette.empty");
        }
        String string = this.aBp.rz().toLowerCase(Locale.ROOT);
        String[] stringArray = this.aBp.rA();
        if ((string.equals("spotify") || string.equals("music")) && stringArray.length >= 1 && !stringArray[0].isEmpty()) {
            return "Paste in the respective ID from the API dashboard";
        }
        if ((string.equals("bind") || string.equals("binds") || string.equals("keybind") || string.equals("b")) && this.rf() != null) {
            return "In game, press any key or mouse button to bind, or Escape for NONE";
        }
        if ((string.equals("clip") || string.equals("vclip") || string.equals("hclip")) && stringArray.length >= 1 && !stringArray[0].isEmpty()) {
            return "Type a number distance and press, Enter to clip";
        }
        return ahg.cf("ui.command.palette.empty");
    }

    private void ru() {
        acq acq2 = new acq();
        this.a(acq2, "bind", "binds", "keybind", "b");
        act act2 = new act();
        this.a(act2, "config", "configs", "cfg", "settings", "c");
        acv acv2 = new acv();
        this.a(acv2, "friend", "setfriend", "f");
        ade ade2 = new ade();
        this.a(ade2, "target", "settarget");
        adf adf2 = new adf();
        this.a(adf2, "toggle", "t");
        acz acz2 = new acz();
        this.a(acz2, "script", "scripts", "js");
        ada ada2 = new ada();
        this.a(ada2, "spotify", "music");
        acw acw2 = new acw();
        this.a(acw2, "insults", "killinsults", "insult");
        acs acs2 = new acs();
        this.a(acs2, "clip", "vclip", "hclip");
        acy acy2 = new acy();
        this.a(acy2, "module", "modules");
    }

    private void a(add add2, String ... stringArray) {
        for (String string : stringArray) {
            this.aBl.put(string.toLowerCase(Locale.ROOT), add2);
        }
    }

    private boolean aT(String string) {
        if (string == null) {
            return false;
        }
        String string2 = string.trim().toLowerCase(Locale.ROOT);
        return string2.equals("bind") || string2.equals("binds") || string2.equals("keybind") || string2.equals("b");
    }
}

