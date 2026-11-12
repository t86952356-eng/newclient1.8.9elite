/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.DisplayMode
 */
package net.minecraft.client.settings;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.d;
import net.minecraft.client.gui.ar;
import net.minecraft.client.gui.bp;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.b;
import net.minecraft.client.settings.c;
import net.minecraft.entity.player.f;
import net.minecraft.network.play.client.y;
import net.minecraft.util.bt;
import net.optifine.ac;
import net.optifine.al;
import net.optifine.ao;
import net.optifine.aw;
import net.optifine.bb;
import net.optifine.bd;
import net.optifine.h;
import net.optifine.reflect.g;
import net.optifine.s;
import net.optifine.shaders.ah;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class a {
    private static final Logger cgf = LogManager.getLogger();
    private static final Gson cgg = new Gson();
    private static final ParameterizedType cgh = new b();
    private static final String[] cgi = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
    private static final String[] cgj = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
    private static final String[] cgk = new String[]{"options.ao.off", "options.ao.min", "options.ao.max"};
    private static final String[] cgl = new String[]{"options.stream.compression.low", "options.stream.compression.medium", "options.stream.compression.high"};
    private static final String[] cgm = new String[]{"options.stream.chat.enabled.streaming", "options.stream.chat.enabled.always", "options.stream.chat.enabled.never"};
    private static final String[] cgn = new String[]{"options.stream.chat.userFilter.all", "options.stream.chat.userFilter.subs", "options.stream.chat.userFilter.mods"};
    private static final String[] cgo = new String[]{"options.stream.mic_toggle.mute", "options.stream.mic_toggle.talk"};
    private static final String[] cgp = new String[]{"options.off", "options.graphics.fast", "options.graphics.fancy"};
    public float cgq = 0.5f;
    public boolean cgr;
    public int bOt = -1;
    public boolean cgs = true;
    public boolean cgt;
    public boolean cgu = true;
    public int cgv = 120;
    public int cgw = 2;
    public boolean aWD = true;
    public int cgx = 2;
    public List<String> ccK = Lists.newArrayList();
    public List<String> cgy = Lists.newArrayList();
    public net.minecraft.entity.player.c cgz = net.minecraft.entity.player.c.cIH;
    public boolean cgA = true;
    public boolean cgB = true;
    public boolean cgC = true;
    public float cgD = 1.0f;
    public boolean cgE = true;
    public boolean cgF;
    public boolean cgG = true;
    public boolean cgH = true;
    public boolean cgI = true;
    public boolean cgJ = false;
    public boolean cgK;
    public boolean cgL;
    public boolean cgM = true;
    private final Set<f> cgN = Sets.newHashSet((Object[])f.values());
    public boolean cgO;
    public int cgP;
    public int cgQ;
    public boolean cgR = true;
    public float cgS = 1.0f;
    public float cgT = 1.0f;
    public float cgU = 0.44366196f;
    public float cgV = 1.0f;
    public boolean cgW = true;
    public int bZj = 4;
    private final Map<SoundCategory, Float> cgX = Maps.newEnumMap(SoundCategory.class);
    public float cgY = 0.5f;
    public float cgZ = 1.0f;
    public float cha = 1.0f;
    public float chb = 0.5412844f;
    public float chc = 0.31690142f;
    public int chd = 1;
    public boolean che = true;
    public String chf = "";
    public int chg = 0;
    public int chh = 0;
    public int chi = 0;
    public boolean chj = true;
    public boolean chk = true;
    public boolean chl = true;
    public net.minecraft.client.settings.d chm = new net.minecraft.client.settings.d("key.forward", 17, "key.categories.movement");
    public net.minecraft.client.settings.d chn = new net.minecraft.client.settings.d("key.left", 30, "key.categories.movement");
    public net.minecraft.client.settings.d cho = new net.minecraft.client.settings.d("key.back", 31, "key.categories.movement");
    public net.minecraft.client.settings.d chp = new net.minecraft.client.settings.d("key.right", 32, "key.categories.movement");
    public net.minecraft.client.settings.d chq = new net.minecraft.client.settings.d("key.jump", 57, "key.categories.movement");
    public net.minecraft.client.settings.d chr = new net.minecraft.client.settings.d("key.sneak", 42, "key.categories.movement");
    public net.minecraft.client.settings.d chs = new net.minecraft.client.settings.d("key.sprint", 29, "key.categories.movement");
    public net.minecraft.client.settings.d cht = new net.minecraft.client.settings.d("key.inventory", 18, "key.categories.inventory");
    public net.minecraft.client.settings.d chu = new net.minecraft.client.settings.d("key.use", -99, "key.categories.gameplay");
    public net.minecraft.client.settings.d chv = new net.minecraft.client.settings.d("key.drop", 16, "key.categories.gameplay");
    public net.minecraft.client.settings.d chw = new net.minecraft.client.settings.d("key.attack", -100, "key.categories.gameplay");
    public net.minecraft.client.settings.d chx = new net.minecraft.client.settings.d("key.pickItem", -98, "key.categories.gameplay");
    public net.minecraft.client.settings.d chy = new net.minecraft.client.settings.d("key.chat", 20, "key.categories.multiplayer");
    public net.minecraft.client.settings.d chz = new net.minecraft.client.settings.d("key.playerlist", 15, "key.categories.multiplayer");
    public net.minecraft.client.settings.d chA = new net.minecraft.client.settings.d("key.command", 53, "key.categories.multiplayer");
    public net.minecraft.client.settings.d chB = new net.minecraft.client.settings.d("key.screenshot", 60, "key.categories.misc");
    public net.minecraft.client.settings.d chC = new net.minecraft.client.settings.d("key.togglePerspective", 63, "key.categories.misc");
    public net.minecraft.client.settings.d chD = new net.minecraft.client.settings.d("key.smoothCamera", 0, "key.categories.misc");
    public net.minecraft.client.settings.d chE = new net.minecraft.client.settings.d("key.fullscreen", 87, "key.categories.misc");
    public net.minecraft.client.settings.d chF = new net.minecraft.client.settings.d("key.spectatorOutlines", 0, "key.categories.misc");
    public net.minecraft.client.settings.d chG = new net.minecraft.client.settings.d("key.streamStartStop", 64, "key.categories.stream");
    public net.minecraft.client.settings.d chH = new net.minecraft.client.settings.d("key.streamPauseUnpause", 65, "key.categories.stream");
    public net.minecraft.client.settings.d chI = new net.minecraft.client.settings.d("key.streamCommercial", 0, "key.categories.stream");
    public net.minecraft.client.settings.d chJ = new net.minecraft.client.settings.d("key.streamToggleMic", 0, "key.categories.stream");
    public net.minecraft.client.settings.d[] chK = new net.minecraft.client.settings.d[]{new net.minecraft.client.settings.d("key.hotbar.1", 2, "key.categories.inventory"), new net.minecraft.client.settings.d("key.hotbar.2", 3, "key.categories.inventory"), new net.minecraft.client.settings.d("key.hotbar.3", 4, "key.categories.inventory"), new net.minecraft.client.settings.d("key.hotbar.4", 5, "key.categories.inventory"), new net.minecraft.client.settings.d("key.hotbar.5", 6, "key.categories.inventory"), new net.minecraft.client.settings.d("key.hotbar.6", 7, "key.categories.inventory"), new net.minecraft.client.settings.d("key.hotbar.7", 8, "key.categories.inventory"), new net.minecraft.client.settings.d("key.hotbar.8", 9, "key.categories.inventory"), new net.minecraft.client.settings.d("key.hotbar.9", 10, "key.categories.inventory")};
    public net.minecraft.client.settings.d[] chL;
    protected d P;
    private File chM;
    public net.minecraft.world.f chN;
    public boolean chO;
    public int chP;
    public boolean bJS;
    public boolean chQ;
    public boolean chR;
    public String chS = "";
    public boolean chT;
    public boolean chU;
    public float chV = 70.0f;
    public float chW;
    public float chX;
    public int chY;
    public int chZ;
    public String cia = "en_US";
    public boolean cib = false;
    public int cic = 1;
    public float cid = 0.8f;
    public int cie = 0;
    public boolean cif = false;
    public boolean cig = false;
    public boolean cih = net.minecraft.src.a.aoL();
    public boolean cii = net.minecraft.src.a.aoL();
    public boolean cij = false;
    public boolean cik = false;
    public float cil = 1.0f;
    public int cim = 0;
    public int cin = 1;
    public int cio = 0;
    public float cip = 0.0f;
    public int ciq = 0;
    public int cir = 0;
    public int cis = 0;
    public int cit = 3;
    public int ciu = 4000;
    public boolean civ = false;
    public boolean ciw = false;
    public boolean cix = false;
    public boolean ciy = true;
    public boolean ciz = true;
    public boolean ciA = true;
    public boolean ciB = true;
    public int ciC = 0;
    public int ciD = 1;
    public boolean ciE = false;
    public int ciF = 0;
    public boolean ciG = false;
    public boolean ciH = false;
    public String ciI = "Default";
    public boolean ciJ = true;
    public boolean ciK = true;
    public boolean ciL = true;
    public boolean ciM = true;
    public boolean ciN = true;
    public boolean ciO = true;
    public boolean ciP = true;
    public int ciQ = 2;
    public boolean ciR = true;
    public boolean ciS = false;
    public boolean ciT = true;
    public boolean ciU = false;
    public boolean ciV = false;
    public int ciW = 0;
    public boolean ciX = true;
    public boolean ciY = true;
    public int ciZ = 3;
    public boolean cja = true;
    public boolean cjb = true;
    public boolean cjc = false;
    public int cjd = 1;
    public int cje = 0;
    public int cjf = 0;
    public boolean cjg = true;
    public boolean cjh = true;
    public boolean cji = true;
    public boolean cjj = true;
    public boolean cjk = true;
    public boolean cjl = true;
    public boolean cjm = true;
    public boolean cjn = true;
    public boolean cjo = true;
    public boolean cjp = true;
    public boolean cjq = true;
    public boolean cjr = true;
    public boolean cjs = true;
    public boolean cjt = true;
    public boolean cju = true;
    public static final int cjv = 0;
    public static final int cjw = 1;
    public static final int cjx = 2;
    public static final int cjy = 3;
    public static final int cjz = 4;
    public static final int cjA = 0;
    public static final int cjB = 1;
    public static final int cjC = 2;
    public static final String cjD = "Default";
    private static final int[] cjE = new int[]{0, 1, 4, 2};
    private static final int[] cjF = new int[]{3, 1, 2};
    private static final String[] cjG = new String[]{"options.off", "options.graphics.fast", "options.graphics.fancy"};
    public net.minecraft.client.settings.d cjH;
    private File cjI;

    public a(d d2, File file) {
        this.chL = (net.minecraft.client.settings.d[])ArrayUtils.addAll((Object[])new net.minecraft.client.settings.d[]{this.chw, this.chu, this.chm, this.chn, this.cho, this.chp, this.chq, this.chr, this.chs, this.chv, this.cht, this.chy, this.chz, this.chx, this.chA, this.chB, this.chC, this.chD, this.chG, this.chH, this.chI, this.chJ, this.chE, this.chF}, (Object[])this.chK);
        this.chN = net.minecraft.world.f.dBT;
        this.P = d2;
        this.chM = new File(file, "options.txt");
        if (d2.Bv() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
            c.cjO.aH(32.0f);
            long l2 = 1000000L;
            if (Runtime.getRuntime().maxMemory() >= 1500000000L) {
                c.cjO.aH(48.0f);
            }
            if (Runtime.getRuntime().maxMemory() >= 2500000000L) {
                c.cjO.aH(64.0f);
            }
        } else {
            c.cjO.aH(16.0f);
        }
        this.bOt = d2.Bv() ? 12 : 8;
        this.cjI = new File(file, "optionsof.txt");
        this.cgv = (int)c.cjR.QZ();
        this.cjH = new net.minecraft.client.settings.d("of.key.zoom", 46, "key.categories.misc");
        this.chL = (net.minecraft.client.settings.d[])ArrayUtils.add((Object[])this.chL, (Object)this.cjH);
        net.optifine.util.s.a(this.chL, new net.minecraft.client.settings.d[]{this.cjH});
        this.bOt = 8;
        this.QJ();
        net.minecraft.src.a.a(this);
    }

    public a() {
        this.chL = (net.minecraft.client.settings.d[])ArrayUtils.addAll((Object[])new net.minecraft.client.settings.d[]{this.chw, this.chu, this.chm, this.chn, this.cho, this.chp, this.chq, this.chr, this.chs, this.chv, this.cht, this.chy, this.chz, this.chx, this.chA, this.chB, this.chC, this.chD, this.chG, this.chH, this.chI, this.chJ, this.chE, this.chF}, (Object[])this.chK);
        this.chN = net.minecraft.world.f.dBT;
    }

    public static String dY(int n2) {
        return n2 < 0 ? I18n.a("key.mouseButton", n2 + 101) : (n2 < 256 ? Keyboard.getKeyName((int)n2) : String.format("%c", Character.valueOf((char)(n2 - 256))).toUpperCase());
    }

    public static boolean a(net.minecraft.client.settings.d d2) {
        return d2.cO() != 0 && (d2.cO() < 0 ? Mouse.isButtonDown((int)(d2.cO() + 100)) : Keyboard.isKeyDown((int)d2.cO()));
    }

    public void a(net.minecraft.client.settings.d d2, int n2) {
        d2.eb(n2);
        this.QK();
    }

    public void a(c c2, float f2) {
        this.b(c2, f2);
        switch (c2.ordinal()) {
            case 1: {
                this.cgq = f2;
                break;
            }
            case 2: {
                this.chV = f2;
                break;
            }
            case 3: {
                this.chW = f2;
                break;
            }
            case 8: {
                this.cgv = (int)f2;
                this.cgG = false;
                if (this.cgv <= 0) {
                    this.cgv = (int)c.cjR.QZ();
                    this.cgG = true;
                }
                this.QT();
                break;
            }
            case 18: {
                this.cgD = f2;
                this.P.bha.Ey().ES();
                break;
            }
            case 27: {
                this.cgV = f2;
                this.P.bha.Ey().ES();
                break;
            }
            case 28: {
                this.cgU = f2;
                this.P.bha.Ey().ES();
                break;
            }
            case 26: {
                this.cgT = f2;
                this.P.bha.Ey().ES();
                break;
            }
            case 25: {
                this.cgS = f2;
                this.P.bha.Ey().ES();
                break;
            }
            case 29: {
                int n2 = this.bZj;
                this.bZj = (int)f2;
                if ((float)n2 == f2) break;
                this.P.Bu().dK(this.bZj);
                this.P.Bq().a(TextureMap.bZE);
                this.P.Bu().e(false, this.bZj > 0);
                this.P.Ba();
                break;
            }
            case 31: {
                this.cgI = !this.cgI;
                this.P.bgG.KI();
                break;
            }
            case 5: {
                this.bOt = (int)f2;
                this.P.bgG.KR();
            }
        }
    }

    public void a(c c2, int n2) {
        this.e(c2);
        switch (c2.ordinal()) {
            case 0: {
                this.cgr = !this.cgr;
                break;
            }
            case 13: {
                this.chY += n2;
                if (bp.isShiftKeyDown()) {
                    this.chY = 0;
                }
                DisplayMode displayMode = net.minecraft.src.a.aop();
                int n3 = displayMode.getWidth() / 320;
                int n4 = displayMode.getHeight() / 240;
                int n5 = Math.min(n3, n4);
                if (this.chY < 0) {
                    this.chY = n5 - 1;
                }
                if (this.P.Ay() && this.chY % 2 != 0) {
                    this.chY += n2;
                }
                if (this.chY >= 0 && this.chY < n5) break;
                this.chY = 0;
                break;
            }
            case 14: {
                this.chZ = (this.chZ + n2) % 3;
                break;
            }
            case 6: {
                this.cgs = !this.cgs;
                break;
            }
            case 10: {
                this.cgw = (this.cgw + n2) % 3;
                break;
            }
            case 30: {
                this.cib = !this.cib;
                this.P.fontRendererObj.C(this.P.Bt().Pp() || this.cib);
                break;
            }
            case 9: {
                this.cgu = !this.cgu;
                break;
            }
            case 7: {
                if (!this.cgt && net.minecraft.src.a.aoG()) {
                    net.minecraft.src.a.X(aw.cf("of.message.an.shaders1"), aw.cf("of.message.an.shaders2"));
                    return;
                }
                this.cgt = !this.cgt;
                this.P.Az();
                break;
            }
            case 11: {
                this.aWD = !this.aWD;
                this.QR();
                this.P.bgG.KI();
                break;
            }
            case 12: {
                this.cgx = (this.cgx + n2) % 3;
                this.P.bgG.KI();
                break;
            }
            case 15: {
                this.cgz = net.minecraft.entity.player.c.fH((this.cgz.ace() + n2) % 3);
                break;
            }
            case 16: {
                this.cgA = !this.cgA;
                break;
            }
            case 17: {
                this.cgB = !this.cgB;
                break;
            }
            case 19: {
                this.cgC = !this.cgC;
                break;
            }
            case 20: {
                this.cgE = !this.cgE;
                break;
            }
            case 24: {
                this.cgO = !this.cgO;
                break;
            }
            case 21: {
                boolean bl2 = this.cgF = !this.cgF;
                if (this.P.Bk() == this.cgF) break;
                this.P.AP();
                break;
            }
            case 22: {
                this.cgG = !this.cgG;
                Display.setVSyncEnabled((boolean)this.cgG);
                break;
            }
            case 23: {
                this.cgH = !this.cgH;
                this.P.bgG.KI();
                break;
            }
            case 31: {
                this.cgI = !this.cgI;
                this.P.bgG.KI();
                break;
            }
            case 32: {
                this.cgJ = !this.cgJ;
                break;
            }
            case 33: {
                this.chk = !this.chk;
                break;
            }
            case 34: {
                this.chl = !this.chl;
            }
        }
        this.QK();
    }

    public float a(c c2) {
        float f2 = this.d(c2);
        return f2 != Float.MAX_VALUE ? f2 : (c2 == c.cjL ? this.chV : (c2 == c.cjM ? this.chW : (c2 == c.cjN ? this.chX : (c2 == c.cjK ? this.cgq : (c2 == c.ckb ? this.cgD : (c2 == c.ckk ? this.cgV : (c2 == c.ckl ? this.cgU : (c2 == c.cki ? this.cgS : (c2 == c.ckj ? this.cgT : (c2 == c.cjR ? (float)this.cgv : (c2 == c.ckm ? (float)this.bZj : (c2 == c.cjO ? (float)this.bOt : 0.0f))))))))))));
    }

    public boolean b(c c2) {
        switch (c2.ordinal()) {
            case 0: {
                return this.cgr;
            }
            case 6: {
                return this.cgs;
            }
            case 7: {
                return this.cgt;
            }
            case 9: {
                return this.cgu;
            }
            case 16: {
                return this.cgA;
            }
            case 17: {
                return this.cgB;
            }
            case 19: {
                return this.cgC;
            }
            case 20: {
                return this.cgE;
            }
            case 21: {
                return this.cgF;
            }
            case 22: {
                return this.cgG;
            }
            case 23: {
                return this.cgH;
            }
            case 24: {
                return this.cgO;
            }
            case 30: {
                return this.cib;
            }
            case 31: {
                return this.cgI;
            }
            case 32: {
                return this.cgJ;
            }
            case 33: {
                return this.chk;
            }
            case 34: {
                return this.chl;
            }
        }
        return false;
    }

    private static String b(String[] stringArray, int n2) {
        if (n2 < 0 || n2 >= stringArray.length) {
            n2 = 0;
        }
        return I18n.a(stringArray[n2], new Object[0]);
    }

    public String c(c c2) {
        String string = this.f(c2);
        if (string != null) {
            return string;
        }
        String string2 = I18n.a(c2.QY(), new Object[0]) + ": ";
        if (c2.QV()) {
            float f2 = this.a(c2);
            float f3 = c2.aI(f2);
            return c2 == c.ckm && (double)f2 >= 4.0 ? string2 + aw.cf("of.general.max") : (c2 == c.cjK ? (f3 == 0.0f ? string2 + I18n.a("options.sensitivity.min", new Object[0]) : (f3 == 1.0f ? string2 + I18n.a("options.sensitivity.max", new Object[0]) : string2 + (int)(f3 * 200.0f) + "%")) : (c2 == c.cjL ? (f2 == 70.0f ? string2 + I18n.a("options.fov.min", new Object[0]) : (f2 == 110.0f ? string2 + I18n.a("options.fov.max", new Object[0]) : string2 + (int)f2)) : (c2 == c.cjR ? (f2 == c2.clR ? string2 + I18n.a("options.framerateLimit.max", new Object[0]) : string2 + (int)f2 + " fps") : (c2 == c.cjT ? (f2 == c2.clQ ? string2 + I18n.a("options.cloudHeight.min", new Object[0]) : string2 + ((int)f2 + 128)) : (c2 == c.cjM ? (f3 == 0.0f ? string2 + I18n.a("options.gamma.min", new Object[0]) : (f3 == 1.0f ? string2 + I18n.a("options.gamma.max", new Object[0]) : string2 + "+" + (int)(f3 * 100.0f) + "%")) : (c2 == c.cjN ? string2 + (int)(f3 * 400.0f) + "%" : (c2 == c.ckb ? string2 + (int)(f3 * 90.0f + 10.0f) + "%" : (c2 == c.ckl ? string2 + ar.U(f3) + "px" : (c2 == c.ckk ? string2 + ar.U(f3) + "px" : (c2 == c.ckj ? string2 + ar.T(f3) + "px" : (c2 == c.cjO ? string2 + (int)f2 + " chunks" : (c2 == c.ckm ? (f2 == 0.0f ? string2 + I18n.a("options.off", new Object[0]) : string2 + (int)f2) : (f3 == 0.0f ? string2 + I18n.a("options.off", new Object[0]) : string2 + (int)(f3 * 100.0f) + "%")))))))))))));
        }
        if (c2.QW()) {
            boolean bl2 = this.b(c2);
            return bl2 ? string2 + I18n.a("options.on", new Object[0]) : string2 + I18n.a("options.off", new Object[0]);
        }
        switch (c2.ordinal()) {
            case 13: {
                return this.chY >= cgi.length ? string2 + this.chY + "x" : string2 + a.b(cgi, this.chY);
            }
            case 15: {
                return string2 + I18n.a(this.cgz.acf(), new Object[0]);
            }
            case 14: {
                return string2 + a.b(cgj, this.chZ);
            }
            case 12: {
                return string2 + a.b(cgk, this.cgx);
            }
            case 10: {
                return string2 + a.b(cgp, this.cgw);
            }
            case 11: {
                if (this.aWD) {
                    return string2 + I18n.a("options.graphics.fancy", new Object[0]);
                }
                return string2 + I18n.a("options.graphics.fast", new Object[0]);
            }
        }
        return string2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Could not resolve type clashes
     */
    public void QJ() {
        block154: {
            FileInputStream fileInputStream = null;
            try {
                if (this.chM.exists()) {
                    String string;
                    fileInputStream = new FileInputStream(this.chM);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                    this.cgX.clear();
                    while ((string = bufferedReader.readLine()) != null) {
                        try {
                            String[] stringArray = string.split(":");
                            block64 : switch (stringArray[0]) {
                                case "mouseSensitivity": {
                                    this.cgq = this.dB(stringArray[1]);
                                    break;
                                }
                                case "fov": {
                                    this.chV = this.dB(stringArray[1]) * 40.0f + 70.0f;
                                    break;
                                }
                                case "gamma": {
                                    this.chW = this.dB(stringArray[1]);
                                    break;
                                }
                                case "saturation": {
                                    this.chX = this.dB(stringArray[1]);
                                    break;
                                }
                                case "invertYMouse": {
                                    this.cgr = stringArray[1].equals("true");
                                    break;
                                }
                                case "renderDistance": {
                                    this.bOt = Integer.parseInt(stringArray[1]);
                                    break;
                                }
                                case "guiScale": {
                                    this.chY = Integer.parseInt(stringArray[1]);
                                    break;
                                }
                                case "particles": {
                                    this.chZ = Integer.parseInt(stringArray[1]);
                                    break;
                                }
                                case "bobView": {
                                    this.cgs = stringArray[1].equals("true");
                                    break;
                                }
                                case "anaglyph3d": {
                                    this.cgt = stringArray[1].equals("true");
                                    break;
                                }
                                case "maxFps": {
                                    this.cgv = Integer.parseInt(stringArray[1]);
                                    if (this.cgG) {
                                        this.cgv = (int)c.cjR.QZ();
                                    }
                                    if (this.cgv > 0) break;
                                    this.cgv = (int)c.cjR.QZ();
                                    break;
                                }
                                case "fboEnable": {
                                    this.cgu = stringArray[1].equals("true");
                                    break;
                                }
                                case "difficulty": {
                                    this.chN = net.minecraft.world.f.ib(Integer.parseInt(stringArray[1]));
                                    break;
                                }
                                case "fancyGraphics": {
                                    this.aWD = stringArray[1].equals("true");
                                    this.QR();
                                    break;
                                }
                                case "ao": {
                                    switch (stringArray[1]) {
                                        case "true": {
                                            this.cgx = 2;
                                            break block64;
                                        }
                                        case "false": {
                                            this.cgx = 0;
                                            break block64;
                                        }
                                    }
                                    this.cgx = Integer.parseInt(stringArray[1]);
                                    break;
                                }
                                case "renderClouds": {
                                    switch (stringArray[1]) {
                                        case "true": {
                                            this.cgw = 2;
                                            break;
                                        }
                                        case "false": {
                                            this.cgw = 0;
                                            break;
                                        }
                                        case "fast": {
                                            this.cgw = 1;
                                        }
                                    }
                                    break;
                                }
                                case "resourcePacks": {
                                    this.ccK = (List)cgg.fromJson(string.substring(string.indexOf(58) + 1), (Type)cgh);
                                    if (this.ccK != null) break;
                                    this.ccK = Lists.newArrayList();
                                    break;
                                }
                                case "incompatibleResourcePacks": {
                                    this.cgy = (List)cgg.fromJson(string.substring(string.indexOf(58) + 1), (Type)cgh);
                                    if (this.cgy != null) break;
                                    this.cgy = Lists.newArrayList();
                                    break;
                                }
                                case "lastServer": {
                                    if (stringArray.length < 2) break;
                                    this.chS = string.substring(string.indexOf(58) + 1);
                                    break;
                                }
                                case "lang": {
                                    if (stringArray.length < 2) break;
                                    this.cia = stringArray[1];
                                    break;
                                }
                                case "chatVisibility": {
                                    this.cgz = net.minecraft.entity.player.c.fH(Integer.parseInt(stringArray[1]));
                                    break;
                                }
                                case "chatColors": {
                                    this.cgA = stringArray[1].equals("true");
                                    break;
                                }
                                case "chatLinks": {
                                    this.cgB = stringArray[1].equals("true");
                                    break;
                                }
                                case "chatLinksPrompt": {
                                    this.cgC = stringArray[1].equals("true");
                                    break;
                                }
                                case "chatOpacity": {
                                    this.cgD = this.dB(stringArray[1]);
                                    break;
                                }
                                case "snooperEnabled": {
                                    this.cgE = stringArray[1].equals("true");
                                    break;
                                }
                                case "fullscreen": {
                                    this.cgF = stringArray[1].equals("true");
                                    break;
                                }
                                case "enableVsync": {
                                    this.cgG = stringArray[1].equals("true");
                                    if (this.cgG) {
                                        this.cgv = (int)c.cjR.QZ();
                                    }
                                    this.QT();
                                    break;
                                }
                                case "useVbo": {
                                    this.cgH = stringArray[1].equals("true");
                                    break;
                                }
                                case "hideServerAddress": {
                                    this.cgK = stringArray[1].equals("true");
                                    break;
                                }
                                case "advancedItemTooltips": {
                                    this.cgL = stringArray[1].equals("true");
                                    break;
                                }
                                case "pauseOnLostFocus": {
                                    this.cgM = stringArray[1].equals("true");
                                    break;
                                }
                                case "touchscreen": {
                                    this.cgO = stringArray[1].equals("true");
                                    break;
                                }
                                case "overrideHeight": {
                                    this.cgQ = Integer.parseInt(stringArray[1]);
                                    break;
                                }
                                case "overrideWidth": {
                                    this.cgP = Integer.parseInt(stringArray[1]);
                                    break;
                                }
                                case "heldItemTooltips": {
                                    this.cgR = stringArray[1].equals("true");
                                    break;
                                }
                                case "chatHeightFocused": {
                                    this.cgV = this.dB(stringArray[1]);
                                    break;
                                }
                                case "chatHeightUnfocused": {
                                    this.cgU = this.dB(stringArray[1]);
                                    break;
                                }
                                case "chatScale": {
                                    this.cgS = this.dB(stringArray[1]);
                                    break;
                                }
                                case "chatWidth": {
                                    this.cgT = this.dB(stringArray[1]);
                                    break;
                                }
                                case "showInventoryAchievementHint": {
                                    this.cgW = stringArray[1].equals("true");
                                    break;
                                }
                                case "mipmapLevels": {
                                    this.bZj = Integer.parseInt(stringArray[1]);
                                    break;
                                }
                                case "streamBytesPerPixel": {
                                    this.cgY = this.dB(stringArray[1]);
                                    break;
                                }
                                case "streamMicVolume": {
                                    this.cgZ = this.dB(stringArray[1]);
                                    break;
                                }
                                case "streamSystemVolume": {
                                    this.cha = this.dB(stringArray[1]);
                                    break;
                                }
                                case "streamKbps": {
                                    this.chb = this.dB(stringArray[1]);
                                    break;
                                }
                                case "streamFps": {
                                    this.chc = this.dB(stringArray[1]);
                                    break;
                                }
                                case "streamCompression": {
                                    this.chd = Integer.parseInt(stringArray[1]);
                                    break;
                                }
                                case "streamSendMetadata": {
                                    this.che = stringArray[1].equals("true");
                                    break;
                                }
                                case "streamPreferredServer": {
                                    if (stringArray.length < 2) break;
                                    this.chf = string.substring(string.indexOf(58) + 1);
                                    break;
                                }
                                case "streamChatEnabled": {
                                    this.chg = Integer.parseInt(stringArray[1]);
                                    break;
                                }
                                case "streamChatUserFilter": {
                                    this.chh = Integer.parseInt(stringArray[1]);
                                    break;
                                }
                                case "streamMicToggleBehavior": {
                                    this.chi = Integer.parseInt(stringArray[1]);
                                    break;
                                }
                                case "forceUnicodeFont": {
                                    this.cib = stringArray[1].equals("true");
                                    break;
                                }
                                case "allowBlockAlternatives": {
                                    this.cgI = stringArray[1].equals("true");
                                    break;
                                }
                                case "reducedDebugInfo": {
                                    this.cgJ = stringArray[1].equals("true");
                                    break;
                                }
                                case "useNativeTransport": {
                                    this.chj = stringArray[1].equals("true");
                                    break;
                                }
                                case "entityShadows": {
                                    this.chk = stringArray[1].equals("true");
                                    break;
                                }
                                case "realmsNotifications": {
                                    this.chl = stringArray[1].equals("true");
                                }
                            }
                            for (net.minecraft.client.settings.d d2 : this.chL) {
                                if (!stringArray[0].equals("key_" + d2.Ri())) continue;
                                d2.eb(Integer.parseInt(stringArray[1]));
                            }
                            for (net.minecraft.client.settings.d d3 : SoundCategory.values()) {
                                if (!stringArray[0].equals("soundCategory_" + ((SoundCategory)((Object)d3)).Ct())) continue;
                                this.cgX.put((SoundCategory)((Object)d3), Float.valueOf(this.dB(stringArray[1])));
                            }
                            for (net.minecraft.client.settings.d d4 : f.values()) {
                                if (!stringArray[0].equals("modelPart_" + ((f)((Object)d4)).acB())) continue;
                                this.a((f)((Object)d4), stringArray[1].equals("true"));
                            }
                        }
                        catch (Exception exception) {
                            cgf.warn("Skipping bad option: " + string);
                            exception.printStackTrace();
                        }
                    }
                    net.minecraft.client.settings.d.Rc();
                    bufferedReader.close();
                    IOUtils.closeQuietly((InputStream)fileInputStream);
                    break block154;
                }
                IOUtils.closeQuietly(fileInputStream);
            }
            catch (Exception exception) {
                cgf.error("Failed to load options", (Throwable)exception);
                break block154;
            }
            finally {
                IOUtils.closeQuietly(fileInputStream);
            }
            return;
        }
        this.QP();
    }

    private float dB(String string) {
        return string.equals("true") ? 1.0f : (string.equals("false") ? 0.0f : Float.parseFloat(string));
    }

    public void QK() {
        Object object;
        if (g.enQ.aDA() && (object = g.g(g.enR, new Object[0])) != null && g.b(object, g.enT, new Object[0])) {
            return;
        }
        try {
            object = new PrintWriter(new FileWriter(this.chM));
            ((PrintWriter)object).println("invertYMouse:" + this.cgr);
            ((PrintWriter)object).println("mouseSensitivity:" + this.cgq);
            ((PrintWriter)object).println("fov:" + (this.chV - 70.0f) / 40.0f);
            ((PrintWriter)object).println("gamma:" + this.chW);
            ((PrintWriter)object).println("saturation:" + this.chX);
            ((PrintWriter)object).println("renderDistance:" + this.bOt);
            ((PrintWriter)object).println("guiScale:" + this.chY);
            ((PrintWriter)object).println("particles:" + this.chZ);
            ((PrintWriter)object).println("bobView:" + this.cgs);
            ((PrintWriter)object).println("anaglyph3d:" + this.cgt);
            ((PrintWriter)object).println("maxFps:" + this.cgv);
            ((PrintWriter)object).println("fboEnable:" + this.cgu);
            ((PrintWriter)object).println("difficulty:" + this.chN.auZ());
            ((PrintWriter)object).println("fancyGraphics:" + this.aWD);
            ((PrintWriter)object).println("ao:" + this.cgx);
            switch (this.cgw) {
                case 0: {
                    ((PrintWriter)object).println("renderClouds:false");
                    break;
                }
                case 1: {
                    ((PrintWriter)object).println("renderClouds:fast");
                    break;
                }
                case 2: {
                    ((PrintWriter)object).println("renderClouds:true");
                }
            }
            ((PrintWriter)object).println("resourcePacks:" + cgg.toJson(this.ccK));
            ((PrintWriter)object).println("incompatibleResourcePacks:" + cgg.toJson(this.cgy));
            ((PrintWriter)object).println("lastServer:" + this.chS);
            ((PrintWriter)object).println("lang:" + this.cia);
            ((PrintWriter)object).println("chatVisibility:" + this.cgz.ace());
            ((PrintWriter)object).println("chatColors:" + this.cgA);
            ((PrintWriter)object).println("chatLinks:" + this.cgB);
            ((PrintWriter)object).println("chatLinksPrompt:" + this.cgC);
            ((PrintWriter)object).println("chatOpacity:" + this.cgD);
            ((PrintWriter)object).println("snooperEnabled:" + this.cgE);
            ((PrintWriter)object).println("fullscreen:" + this.cgF);
            ((PrintWriter)object).println("enableVsync:" + this.cgG);
            ((PrintWriter)object).println("useVbo:" + this.cgH);
            ((PrintWriter)object).println("hideServerAddress:" + this.cgK);
            ((PrintWriter)object).println("advancedItemTooltips:" + this.cgL);
            ((PrintWriter)object).println("pauseOnLostFocus:" + this.cgM);
            ((PrintWriter)object).println("touchscreen:" + this.cgO);
            ((PrintWriter)object).println("overrideWidth:" + this.cgP);
            ((PrintWriter)object).println("overrideHeight:" + this.cgQ);
            ((PrintWriter)object).println("heldItemTooltips:" + this.cgR);
            ((PrintWriter)object).println("chatHeightFocused:" + this.cgV);
            ((PrintWriter)object).println("chatHeightUnfocused:" + this.cgU);
            ((PrintWriter)object).println("chatScale:" + this.cgS);
            ((PrintWriter)object).println("chatWidth:" + this.cgT);
            ((PrintWriter)object).println("showInventoryAchievementHint:" + this.cgW);
            ((PrintWriter)object).println("mipmapLevels:" + this.bZj);
            ((PrintWriter)object).println("streamBytesPerPixel:" + this.cgY);
            ((PrintWriter)object).println("streamMicVolume:" + this.cgZ);
            ((PrintWriter)object).println("streamSystemVolume:" + this.cha);
            ((PrintWriter)object).println("streamKbps:" + this.chb);
            ((PrintWriter)object).println("streamFps:" + this.chc);
            ((PrintWriter)object).println("streamCompression:" + this.chd);
            ((PrintWriter)object).println("streamSendMetadata:" + this.che);
            ((PrintWriter)object).println("streamPreferredServer:" + this.chf);
            ((PrintWriter)object).println("streamChatEnabled:" + this.chg);
            ((PrintWriter)object).println("streamChatUserFilter:" + this.chh);
            ((PrintWriter)object).println("streamMicToggleBehavior:" + this.chi);
            ((PrintWriter)object).println("forceUnicodeFont:" + this.cib);
            ((PrintWriter)object).println("allowBlockAlternatives:" + this.cgI);
            ((PrintWriter)object).println("reducedDebugInfo:" + this.cgJ);
            ((PrintWriter)object).println("useNativeTransport:" + this.chj);
            ((PrintWriter)object).println("entityShadows:" + this.chk);
            ((PrintWriter)object).println("realmsNotifications:" + this.chl);
            for (net.minecraft.client.settings.d d2 : this.chL) {
                ((PrintWriter)object).println("key_" + d2.Ri() + ":" + d2.cO());
            }
            for (SoundCategory soundCategory : SoundCategory.values()) {
                ((PrintWriter)object).println("soundCategory_" + soundCategory.Ct() + ":" + this.d(soundCategory));
            }
            for (f f2 : f.values()) {
                ((PrintWriter)object).println("modelPart_" + f2.acB() + ":" + this.cgN.contains((Object)f2));
            }
            ((PrintWriter)object).close();
        }
        catch (Exception exception) {
            cgf.error("Failed to save options", (Throwable)exception);
        }
        this.QQ();
        this.QL();
    }

    public float d(SoundCategory soundCategory) {
        return this.cgX.getOrDefault((Object)soundCategory, Float.valueOf(1.0f)).floatValue();
    }

    public void a(SoundCategory soundCategory, float f2) {
        this.P.Bx().a(soundCategory, f2);
        this.cgX.put(soundCategory, Float.valueOf(f2));
    }

    public void QL() {
        if (this.P.bgK != null) {
            int n2 = 0;
            for (f f2 : this.cgN) {
                n2 |= f2.acz();
            }
            this.P.bgK.bkd.u(new y(this.cia, this.bOt, this.cgz, this.cgA, n2));
        }
    }

    public Set<f> QM() {
        return ImmutableSet.copyOf(this.cgN);
    }

    public void a(f f2, boolean bl2) {
        if (bl2) {
            this.cgN.add(f2);
        } else {
            this.cgN.remove((Object)f2);
        }
        this.QL();
    }

    public void b(f f2) {
        if (!this.QM().contains((Object)f2)) {
            this.cgN.add(f2);
        } else {
            this.cgN.remove((Object)f2);
        }
        this.QL();
    }

    public int QN() {
        return this.bOt >= 4 ? this.cgw : 0;
    }

    public boolean QO() {
        return this.chj;
    }

    private void b(c c2, float f2) {
        switch (c2.ordinal()) {
            case 40: {
                this.cip = f2;
                this.P.bgG.KT();
                break;
            }
            case 47: {
                this.cil = f2;
                this.P.bgG.KI();
                break;
            }
            case 85: {
                int n2 = (int)f2;
                if (n2 > 0 && net.minecraft.src.a.aoG()) {
                    net.minecraft.src.a.X(aw.cf("of.message.aa.shaders1"), aw.cf("of.message.aa.shaders2"));
                    return;
                }
                int[] nArray = new int[]{0, 2, 4, 6, 8, 12, 16};
                this.cim = 0;
                for (int n3 : nArray) {
                    if (n2 < n3) continue;
                    this.cim = n3;
                }
                this.cim = net.minecraft.src.a.A(this.cim, 0, 16);
                break;
            }
            case 86: {
                int n4 = (int)f2;
                if (n4 > 1 && net.minecraft.src.a.aoG()) {
                    net.minecraft.src.a.X(aw.cf("of.message.af.shaders1"), aw.cf("of.message.af.shaders2"));
                    return;
                }
                this.cin = net.minecraft.src.a.A(this.cin, 1, 16);
                this.P.Az();
                break;
            }
            case 37: {
                int n5 = (int)f2;
                this.cie = net.minecraft.src.a.A(n5, 0, 3);
                this.P.Az();
                break;
            }
            case 75: {
                int n6 = (int)f2 - 1;
                String[] stringArray = net.minecraft.src.a.aoq();
                if (n6 < 0 || n6 >= stringArray.length) {
                    this.ciI = cjD;
                    return;
                }
                this.ciI = stringArray[n6];
            }
        }
    }

    private float d(c c2) {
        switch (c2.ordinal()) {
            case 40: {
                return this.cip;
            }
            case 47: {
                return this.cil;
            }
            case 85: {
                return this.cim;
            }
            case 86: {
                return this.cin;
            }
            case 37: {
                return this.cie;
            }
            case 8: {
                return (float)this.cgv == c.cjR.QZ() && this.cgG ? 0.0f : (float)this.cgv;
            }
            case 75: {
                if (this.ciI.equals(cjD)) {
                    return 0.0f;
                }
                List<String> list = Arrays.asList(net.minecraft.src.a.aoq());
                int n2 = list.indexOf(this.ciI);
                return n2 < 0 ? 0.0f : (float)(n2 + 1);
            }
        }
        return Float.MAX_VALUE;
    }

    private void e(c c2) {
        block0 : switch (c2.ordinal()) {
            case 35: {
                switch (this.cic) {
                    case 1: {
                        this.cic = 2;
                        if (net.minecraft.src.a.amR()) break block0;
                        this.cic = 3;
                        break block0;
                    }
                    case 2: {
                        this.cic = 3;
                        break block0;
                    }
                }
                this.cic = 1;
                break;
            }
            case 36: {
                this.cid += 0.2f;
                if (!(this.cid > 0.81f)) break;
                this.cid = 0.2f;
                break;
            }
            case 38: {
                this.cig = !this.cig;
                break;
            }
            case 65: {
                this.cih = !this.cih;
                net.minecraft.src.a.ana();
                break;
            }
            case 39: {
                ++this.cio;
                if (this.cio > 3) {
                    this.cio = 0;
                }
                this.QR();
                this.P.bgG.KT();
                break;
            }
            case 41: {
                this.ciq = a.a(this.ciq, cjE);
                this.P.bgG.KI();
                break;
            }
            case 91: {
                ++this.cis;
                if (this.cis <= 2) break;
                this.cis = 0;
                break;
            }
            case 42: {
                ++this.cir;
                if (this.cir <= 3) break;
                this.cir = 0;
                break;
            }
            case 43: {
                ++this.cje;
                if (this.cje == 1) {
                    ++this.cje;
                }
                if (this.cje <= 2) break;
                this.cje = 0;
                break;
            }
            case 44: {
                ++this.cjf;
                if (this.cjf == 1) {
                    ++this.cjf;
                }
                if (this.cjf <= 2) break;
                this.cjf = 0;
                break;
            }
            case 45: {
                this.cjg = !this.cjg;
                break;
            }
            case 46: {
                this.cjh = !this.cjh;
                break;
            }
            case 52: {
                this.cji = !this.cji;
                break;
            }
            case 53: {
                this.cjj = !this.cjj;
                break;
            }
            case 54: {
                this.cjk = !this.cjk;
                break;
            }
            case 55: {
                this.cjl = !this.cjl;
                break;
            }
            case 66: {
                this.cjm = !this.cjm;
                break;
            }
            case 67: {
                this.cjn = !this.cjn;
                break;
            }
            case 69: {
                this.cjp = !this.cjp;
                break;
            }
            case 70: {
                this.cjq = !this.cjq;
                break;
            }
            case 71: {
                this.cjr = !this.cjr;
                break;
            }
            case 73: {
                this.cjs = !this.cjs;
                break;
            }
            case 76: {
                this.cjt = !this.cjt;
                break;
            }
            case 87: {
                this.cju = !this.cju;
                break;
            }
            case 68: {
                this.cjo = !this.cjo;
                break;
            }
            case 48: {
                this.civ = !this.civ;
                break;
            }
            case 49: {
                this.cix = !this.cix;
                break;
            }
            case 50: {
                int n2 = 900;
                this.ciu = Math.max(this.ciu / 900 * 900, 900);
                this.ciu *= 2;
                if (this.ciu <= 28800) break;
                this.ciu = 900;
                break;
            }
            case 51: {
                ++this.cit;
                if (this.cit > 3) {
                    this.cit = 1;
                }
                this.P.bgG.KI();
                break;
            }
            case 83: {
                ++this.ciQ;
                if (this.ciQ > 3) {
                    this.ciQ = 1;
                }
                if (this.ciQ == 2) {
                    this.P.bgG.KI();
                    break;
                }
                this.P.Az();
                break;
            }
            case 56: {
                this.ciy = !this.ciy;
                break;
            }
            case 57: {
                this.ciz = !this.ciz;
                break;
            }
            case 58: {
                this.ciA = !this.ciA;
                break;
            }
            case 59: {
                this.ciB = !this.ciB;
                break;
            }
            case 60: {
                ++this.ciC;
                if (this.ciC <= 2) break;
                this.ciC = 0;
                break;
            }
            case 61: {
                ++this.ciD;
                if (this.ciD <= 5) break;
                this.ciD = 1;
                break;
            }
            case 62: {
                this.ciE = !this.ciE;
                break;
            }
            case 63: {
                ++this.ciF;
                if (this.ciF <= 2) break;
                this.ciF = 0;
                break;
            }
            case 64: {
                this.ciG = !this.ciG;
                this.QU();
                break;
            }
            case 72: {
                this.ciw = !this.ciw;
                break;
            }
            case 74: {
                this.ciH = !this.ciH;
                this.P.bgG.KI();
                break;
            }
            case 77: {
                this.ciJ = !this.ciJ;
                s.aAA();
                this.P.bgG.KI();
                break;
            }
            case 78: {
                this.ciK = !this.ciK;
                bd.jA();
                break;
            }
            case 79: {
                this.ciL = !this.ciL;
                s.aAA();
                this.P.bgG.KI();
                break;
            }
            case 80: {
                this.ciM = !this.ciM;
                this.P.fontRendererObj.a(net.minecraft.src.a.Br());
                this.P.bgQ.a(net.minecraft.src.a.Br());
                break;
            }
            case 81: {
                this.ciN = !this.ciN;
                s.jA();
                this.P.bgG.KI();
                break;
            }
            case 84: {
                this.ciR = !this.ciR;
                this.P.Az();
                break;
            }
            case 93: {
                this.ciO = !this.ciO;
                al.jA();
                break;
            }
            case 82: {
                this.ciP = !this.ciP;
                break;
            }
            case 88: {
                this.ciS = !this.ciS;
                bb.jA();
                this.P.bgG.KI();
                break;
            }
            case 89: {
                this.ciT = !this.ciT;
                this.P.Az();
                break;
            }
            case 94: {
                bt.dyZ = this.ciU = !this.ciU;
                break;
            }
            case 95: {
                if (!this.ciV && net.minecraft.src.a.aoG()) {
                    net.minecraft.src.a.X(aw.cf("of.message.fr.shaders1"), aw.cf("of.message.fr.shaders2"));
                    return;
                }
                boolean bl2 = this.ciV = !this.ciV;
                if (this.ciV) {
                    this.P.bgT.Jd();
                }
                net.minecraft.src.a.AQ();
                break;
            }
            case 96: {
                switch (this.ciW) {
                    case 0: {
                        this.ciW = 1;
                        break;
                    }
                    case 1: {
                        this.ciW = 2;
                        break;
                    }
                    default: {
                        this.ciW = 0;
                    }
                }
                this.P.bgG.KI();
                break;
            }
            case 92: {
                this.cii = !this.cii;
                break;
            }
            case 104: {
                this.cij = !this.cij;
                this.P.bgG.KI();
                break;
            }
            case 106: {
                this.cik = !this.cik;
                this.P.bgG.KI();
                break;
            }
            case 97: {
                this.ciX = !this.ciX;
                break;
            }
            case 99: {
                this.ciY = !this.ciY;
                this.P.Az();
                break;
            }
            case 98: {
                this.ciZ = a.a(this.ciZ, cjF);
                ao.d(this.P.bgG);
                break;
            }
            case 102: {
                ++this.cjd;
                if (this.cjd > 4) {
                    this.cjd = 1;
                }
                if (OpenGlHelper.Ky()) break;
                this.cjd = 1;
                break;
            }
            case 100: {
                this.cja = !this.cja;
                this.P.Az();
                break;
            }
            case 103: {
                this.cjb = !this.cjb;
                ac.jA();
                break;
            }
            case 105: {
                this.cjc = !this.cjc;
                break;
            }
            case 90: {
                this.cgR = !this.cgR;
                break;
            }
            case 101: {
                this.cgL = !this.cgL;
            }
        }
    }

    private String f(c c2) {
        String string = I18n.a(c2.QY(), new Object[0]) + ": ";
        switch (c2.ordinal()) {
            case 5: {
                int n2 = (int)this.a(c2);
                String string2 = I18n.a("options.renderDistance.tiny", new Object[0]);
                int n3 = 2;
                if (n2 >= 4) {
                    string2 = I18n.a("options.renderDistance.short", new Object[0]);
                    n3 = 4;
                }
                if (n2 >= 8) {
                    string2 = I18n.a("options.renderDistance.normal", new Object[0]);
                    n3 = 8;
                }
                if (n2 >= 16) {
                    string2 = I18n.a("options.renderDistance.far", new Object[0]);
                    n3 = 16;
                }
                if (n2 >= 32) {
                    string2 = aw.cf("of.options.renderDistance.extreme");
                    n3 = 32;
                }
                if (n2 >= 48) {
                    string2 = aw.cf("of.options.renderDistance.insane");
                    n3 = 48;
                }
                if (n2 >= 64) {
                    string2 = aw.cf("of.options.renderDistance.ludicrous");
                    n3 = 64;
                }
                int n4 = this.bOt - n3;
                Object object = string2;
                if (n4 > 0) {
                    object = string2 + "+";
                }
                return string + n2 + " " + (String)object;
            }
            case 35: {
                switch (this.cic) {
                    case 1: {
                        return string + aw.aBD();
                    }
                    case 2: {
                        return string + aw.aBE();
                    }
                }
                return string + aw.aBC();
            }
            case 36: {
                return string + this.cid;
            }
            case 37: {
                switch (this.cie) {
                    case 0: {
                        return string + aw.cf("of.options.mipmap.nearest");
                    }
                    case 1: {
                        return string + aw.cf("of.options.mipmap.linear");
                    }
                    case 2: {
                        return string + aw.cf("of.options.mipmap.bilinear");
                    }
                    case 3: {
                        return string + aw.cf("of.options.mipmap.trilinear");
                    }
                }
                return string + "of.options.mipmap.nearest";
            }
            case 38: {
                return this.cig ? string + aw.aBB() : string + aw.aBC();
            }
            case 65: {
                return this.cih ? string + aw.aBB() : string + aw.aBC();
            }
            case 39: {
                switch (this.cio) {
                    case 1: {
                        return string + aw.aBD();
                    }
                    case 2: {
                        return string + aw.aBE();
                    }
                    case 3: {
                        return string + aw.aBC();
                    }
                }
                return string + aw.aBF();
            }
            case 41: {
                switch (this.ciq) {
                    case 1: {
                        return string + aw.aBD();
                    }
                    case 2: {
                        return string + aw.aBE();
                    }
                    default: {
                        return string + aw.aBF();
                    }
                    case 4: 
                }
                return string + aw.cf("of.general.smart");
            }
            case 91: {
                switch (this.cis) {
                    case 1: {
                        return string + aw.aBD();
                    }
                    case 2: {
                        return string + aw.aBE();
                    }
                }
                return string + aw.aBF();
            }
            case 42: {
                switch (this.cir) {
                    case 1: {
                        return string + aw.aBD();
                    }
                    case 2: {
                        return string + aw.aBE();
                    }
                    case 3: {
                        return string + aw.aBC();
                    }
                }
                return string + aw.aBF();
            }
            case 43: {
                switch (this.cje) {
                    case 1: {
                        return string + aw.cf("of.options.animation.dynamic");
                    }
                    case 2: {
                        return string + aw.aBC();
                    }
                }
                return string + aw.aBB();
            }
            case 44: {
                switch (this.cjf) {
                    case 1: {
                        return string + aw.cf("of.options.animation.dynamic");
                    }
                    case 2: {
                        return string + aw.aBC();
                    }
                }
                return string + aw.aBB();
            }
            case 45: {
                return this.cjg ? string + aw.aBB() : string + aw.aBC();
            }
            case 46: {
                return this.cjh ? string + aw.aBB() : string + aw.aBC();
            }
            case 52: {
                return this.cji ? string + aw.aBB() : string + aw.aBC();
            }
            case 53: {
                return this.cjj ? string + aw.aBB() : string + aw.aBC();
            }
            case 54: {
                return this.cjk ? string + aw.aBB() : string + aw.aBC();
            }
            case 55: {
                return this.cjl ? string + aw.aBB() : string + aw.aBC();
            }
            case 66: {
                return this.cjm ? string + aw.aBB() : string + aw.aBC();
            }
            case 67: {
                return this.cjn ? string + aw.aBB() : string + aw.aBC();
            }
            case 69: {
                return this.cjp ? string + aw.aBB() : string + aw.aBC();
            }
            case 70: {
                return this.cjq ? string + aw.aBB() : string + aw.aBC();
            }
            case 71: {
                return this.cjr ? string + aw.aBB() : string + aw.aBC();
            }
            case 73: {
                return this.cjs ? string + aw.aBB() : string + aw.aBC();
            }
            case 76: {
                return this.cjt ? string + aw.aBB() : string + aw.aBC();
            }
            case 87: {
                return this.cju ? string + aw.aBB() : string + aw.aBC();
            }
            case 68: {
                return this.cjo ? string + aw.aBB() : string + aw.aBC();
            }
            case 48: {
                return this.civ ? string + aw.aBB() : string + aw.aBC();
            }
            case 49: {
                return this.cix ? string + aw.aBB() : string + aw.aBC();
            }
            case 50: {
                int n5 = 900;
                return this.ciu <= 900 ? string + aw.cf("of.options.save.45s") : (this.ciu <= 1800 ? string + aw.cf("of.options.save.90s") : (this.ciu <= 3600 ? string + aw.cf("of.options.save.3min") : (this.ciu <= 7200 ? string + aw.cf("of.options.save.6min") : (this.ciu <= 14400 ? string + aw.cf("of.options.save.12min") : string + aw.cf("of.options.save.24min")))));
            }
            case 51: {
                switch (this.cit) {
                    case 1: {
                        return string + aw.aBD();
                    }
                    case 2: {
                        return string + aw.aBE();
                    }
                }
                return string + aw.aBC();
            }
            case 83: {
                switch (this.ciQ) {
                    case 1: {
                        return string + aw.aBD();
                    }
                    case 2: {
                        return string + aw.aBE();
                    }
                }
                return string + aw.aBC();
            }
            case 56: {
                return this.ciy ? string + aw.aBB() : string + aw.aBC();
            }
            case 57: {
                return this.ciz ? string + aw.aBB() : string + aw.aBC();
            }
            case 58: {
                return this.ciA ? string + aw.aBB() : string + aw.aBC();
            }
            case 59: {
                return this.ciB ? string + aw.aBB() : string + aw.aBC();
            }
            case 60: {
                switch (this.ciC) {
                    case 1: {
                        return string + aw.aBD();
                    }
                    case 2: {
                        return string + aw.aBE();
                    }
                }
                return string + aw.aBF();
            }
            case 61: {
                return string + this.ciD;
            }
            case 62: {
                return this.ciE ? string + aw.aBB() : string + aw.aBC();
            }
            case 63: {
                return this.ciF == 1 ? string + aw.cf("of.options.time.dayOnly") : (this.ciF == 2 ? string + aw.cf("of.options.time.nightOnly") : string + aw.aBF());
            }
            case 64: {
                return this.ciG ? string + aw.aBB() : string + aw.aBC();
            }
            case 85: {
                Object object = "";
                if (this.cim != net.minecraft.src.a.aoh()) {
                    object = " (" + aw.cf("of.general.restart") + ")";
                }
                return this.cim == 0 ? string + aw.aBC() + (String)object : string + this.cim + (String)object;
            }
            case 86: {
                return this.cin == 1 ? string + aw.aBC() : string + this.cin;
            }
            case 72: {
                return this.ciw ? string + aw.aBB() : string + aw.aBC();
            }
            case 74: {
                return this.ciH ? string + aw.aBB() : string + aw.aBC();
            }
            case 77: {
                return this.ciJ ? string + aw.aBB() : string + aw.aBC();
            }
            case 78: {
                return this.ciK ? string + aw.aBB() : string + aw.aBC();
            }
            case 79: {
                return this.ciL ? string + aw.aBB() : string + aw.aBC();
            }
            case 80: {
                return this.ciM ? string + aw.aBB() : string + aw.aBC();
            }
            case 81: {
                return this.ciN ? string + aw.aBB() : string + aw.aBC();
            }
            case 93: {
                return this.ciO ? string + aw.aBB() : string + aw.aBC();
            }
            case 82: {
                return this.ciP ? string + aw.aBB() : string + aw.aBC();
            }
            case 84: {
                return this.ciR ? string + aw.aBB() : string + aw.aBC();
            }
            case 88: {
                return this.ciS ? string + aw.aBB() : string + aw.aBC();
            }
            case 89: {
                return this.ciT ? string + aw.aBB() : string + aw.aBC();
            }
            case 94: {
                return this.ciU ? string + aw.aBB() : string + aw.aBC();
            }
            case 95: {
                return this.ciV ? string + aw.aBB() : string + aw.aBC();
            }
            case 96: {
                return this.ciW == 1 ? string + aw.aBD() : (this.ciW == 2 ? string + aw.aBE() : string + aw.aBF());
            }
            case 92: {
                return this.cii ? string + aw.aBB() : string + aw.aBC();
            }
            case 104: {
                return this.cij ? string + aw.aBB() : string + aw.aBC();
            }
            case 106: {
                return this.cik ? string + aw.aBB() : string + aw.aBC();
            }
            case 97: {
                return this.ciX ? string + aw.aBB() : string + aw.aBC();
            }
            case 99: {
                return this.ciY ? string + aw.aBB() : string + aw.aBC();
            }
            case 98: {
                int n6 = a.c(this.ciZ, cjF);
                return string + a.b(cjG, n6);
            }
            case 102: {
                return this.cjd <= 1 ? string + aw.aBF() : string + this.cjd + "x";
            }
            case 100: {
                return this.cja ? string + aw.aBB() : string + aw.aBC();
            }
            case 103: {
                return this.cjb ? string + aw.aBB() : string + aw.aBC();
            }
            case 105: {
                return this.cjc ? string + aw.aBB() : string + aw.aBC();
            }
            case 75: {
                return this.ciI.equals(cjD) ? string + aw.aBF() : string + this.ciI;
            }
            case 90: {
                return this.cgR ? string + aw.aBB() : string + aw.aBC();
            }
            case 101: {
                return this.cgL ? string + aw.aBB() : string + aw.aBC();
            }
            case 8: {
                float f2 = this.a(c2);
                return f2 == 0.0f ? string + aw.cf("of.options.framerateLimit.vsync") : (f2 == c2.clR ? string + I18n.a("options.framerateLimit.max", new Object[0]) : string + (int)f2 + " fps");
            }
        }
        return null;
    }

    public void QP() {
        try {
            String string;
            File file = this.cjI;
            if (!file.exists()) {
                file = this.chM;
            }
            if (!file.exists()) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(file), StandardCharsets.UTF_8));
            while ((string = bufferedReader.readLine()) != null) {
                try {
                    String[] stringArray = string.split(":");
                    if (stringArray.length >= 2) {
                        switch (stringArray[0]) {
                            case "ofRenderDistanceChunks": {
                                this.bOt = Integer.parseInt(stringArray[1]);
                                this.bOt = net.minecraft.src.a.A(this.bOt, 2, 1024);
                                break;
                            }
                            case "ofFogType": {
                                this.cic = Integer.parseInt(stringArray[1]);
                                this.cic = net.minecraft.src.a.A(this.cic, 1, 3);
                                break;
                            }
                            case "ofFogStart": {
                                this.cid = Float.parseFloat(stringArray[1]);
                                if (this.cid < 0.2f) {
                                    this.cid = 0.2f;
                                }
                                if (!(this.cid > 0.81f)) break;
                                this.cid = 0.8f;
                                break;
                            }
                            case "ofMipmapType": {
                                this.cie = Integer.parseInt(stringArray[1]);
                                this.cie = net.minecraft.src.a.A(this.cie, 0, 3);
                                break;
                            }
                            case "ofOcclusionFancy": {
                                this.cif = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofSmoothFps": {
                                this.cig = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofSmoothWorld": {
                                this.cih = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofAoLevel": {
                                this.cil = Float.parseFloat(stringArray[1]);
                                this.cil = net.minecraft.src.a.F(this.cil, 0.0f, 1.0f);
                                break;
                            }
                            case "ofClouds": {
                                this.cio = Integer.parseInt(stringArray[1]);
                                this.cio = net.minecraft.src.a.A(this.cio, 0, 3);
                                this.QR();
                                break;
                            }
                            case "ofCloudsHeight": {
                                this.cip = Float.parseFloat(stringArray[1]);
                                this.cip = net.minecraft.src.a.F(this.cip, 0.0f, 1.0f);
                                break;
                            }
                            case "ofTrees": {
                                this.ciq = Integer.parseInt(stringArray[1]);
                                this.ciq = a.b(this.ciq, cjE);
                                break;
                            }
                            case "ofDroppedItems": {
                                this.cis = Integer.parseInt(stringArray[1]);
                                this.cis = net.minecraft.src.a.A(this.cis, 0, 2);
                                break;
                            }
                            case "ofRain": {
                                this.cir = Integer.parseInt(stringArray[1]);
                                this.cir = net.minecraft.src.a.A(this.cir, 0, 3);
                                break;
                            }
                            case "ofAnimatedWater": {
                                this.cje = Integer.parseInt(stringArray[1]);
                                this.cje = net.minecraft.src.a.A(this.cje, 0, 2);
                                break;
                            }
                            case "ofAnimatedLava": {
                                this.cjf = Integer.parseInt(stringArray[1]);
                                this.cjf = net.minecraft.src.a.A(this.cjf, 0, 2);
                                break;
                            }
                            case "ofAnimatedFire": {
                                this.cjg = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofAnimatedPortal": {
                                this.cjh = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofAnimatedRedstone": {
                                this.cji = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofAnimatedExplosion": {
                                this.cjj = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofAnimatedFlame": {
                                this.cjk = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofAnimatedSmoke": {
                                this.cjl = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofVoidParticles": {
                                this.cjm = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofWaterParticles": {
                                this.cjn = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofPortalParticles": {
                                this.cjp = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofPotionParticles": {
                                this.cjq = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofFireworkParticles": {
                                this.cjr = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofDrippingWaterLava": {
                                this.cjs = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofAnimatedTerrain": {
                                this.cjt = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofAnimatedTextures": {
                                this.cju = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofRainSplash": {
                                this.cjo = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofLagometer": {
                                this.civ = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofShowFps": {
                                this.cix = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofAutoSaveTicks": {
                                this.ciu = Integer.parseInt(stringArray[1]);
                                this.ciu = net.minecraft.src.a.A(this.ciu, 40, 40000);
                                break;
                            }
                            case "ofBetterGrass": {
                                this.cit = Integer.parseInt(stringArray[1]);
                                this.cit = net.minecraft.src.a.A(this.cit, 1, 3);
                                break;
                            }
                            case "ofConnectedTextures": {
                                this.ciQ = Integer.parseInt(stringArray[1]);
                                this.ciQ = net.minecraft.src.a.A(this.ciQ, 1, 3);
                                break;
                            }
                            case "ofWeather": {
                                this.ciy = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofSky": {
                                this.ciz = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofStars": {
                                this.ciA = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofSunMoon": {
                                this.ciB = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofVignette": {
                                this.ciC = Integer.parseInt(stringArray[1]);
                                this.ciC = net.minecraft.src.a.A(this.ciC, 0, 2);
                                break;
                            }
                            case "ofChunkUpdates": {
                                this.ciD = Integer.parseInt(stringArray[1]);
                                this.ciD = net.minecraft.src.a.A(this.ciD, 1, 5);
                                break;
                            }
                            case "ofChunkUpdatesDynamic": {
                                this.ciE = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofTime": {
                                this.ciF = Integer.parseInt(stringArray[1]);
                                this.ciF = net.minecraft.src.a.A(this.ciF, 0, 2);
                                break;
                            }
                            case "ofClearWater": {
                                this.ciG = Boolean.parseBoolean(stringArray[1]);
                                this.QU();
                                break;
                            }
                            case "ofAaLevel": {
                                this.cim = Integer.parseInt(stringArray[1]);
                                this.cim = net.minecraft.src.a.A(this.cim, 0, 16);
                                break;
                            }
                            case "ofAfLevel": {
                                this.cin = Integer.parseInt(stringArray[1]);
                                this.cin = net.minecraft.src.a.A(this.cin, 1, 16);
                                break;
                            }
                            case "ofProfiler": {
                                this.ciw = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofBetterSnow": {
                                this.ciH = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofSwampColors": {
                                this.ciJ = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofRandomEntities": {
                                this.ciK = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofSmoothBiomes": {
                                this.ciL = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofCustomFonts": {
                                this.ciM = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofCustomColors": {
                                this.ciN = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofCustomItems": {
                                this.ciR = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofCustomSky": {
                                this.ciO = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofShowCapes": {
                                this.ciP = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofNaturalTextures": {
                                this.ciS = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofEmissiveTextures": {
                                this.ciT = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofLazyChunkLoading": {
                                this.cii = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofRenderRegions": {
                                this.cij = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofSmartAnimations": {
                                this.cik = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofDynamicFov": {
                                this.ciX = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofAlternateBlocks": {
                                this.ciY = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofDynamicLights": {
                                this.ciZ = Integer.parseInt(stringArray[1]);
                                this.ciZ = a.b(this.ciZ, cjF);
                                break;
                            }
                            case "ofScreenshotSize": {
                                this.cjd = Integer.parseInt(stringArray[1]);
                                this.cjd = net.minecraft.src.a.A(this.cjd, 1, 4);
                                break;
                            }
                            case "ofCustomEntityModels": {
                                this.cja = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofCustomGuis": {
                                this.cjb = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofShowGlErrors": {
                                this.cjc = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofFullscreenMode": {
                                this.ciI = stringArray[1];
                                break;
                            }
                            case "ofFastMath": {
                                bt.dyZ = this.ciU = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofFastRender": {
                                this.ciV = Boolean.parseBoolean(stringArray[1]);
                                break;
                            }
                            case "ofTranslucentBlocks": {
                                this.ciW = Integer.parseInt(stringArray[1]);
                                this.ciW = net.minecraft.src.a.A(this.ciW, 0, 2);
                            }
                        }
                    }
                    if (!stringArray[0].equals("key_" + this.cjH.Ri())) continue;
                    this.cjH.eb(Integer.parseInt(stringArray[1]));
                }
                catch (Exception exception) {
                    net.minecraft.src.a.fN("Skipping bad option: " + string);
                    exception.printStackTrace();
                }
            }
            net.optifine.util.s.a(this.chL, new net.minecraft.client.settings.d[]{this.cjH});
            net.minecraft.client.settings.d.Rc();
            bufferedReader.close();
        }
        catch (Exception exception) {
            net.minecraft.src.a.warn("Failed to load options");
            exception.printStackTrace();
        }
    }

    public void QQ() {
        try {
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(this.cjI), StandardCharsets.UTF_8));
            printWriter.println("ofFogType:" + this.cic);
            printWriter.println("ofFogStart:" + this.cid);
            printWriter.println("ofMipmapType:" + this.cie);
            printWriter.println("ofOcclusionFancy:" + this.cif);
            printWriter.println("ofSmoothFps:" + this.cig);
            printWriter.println("ofSmoothWorld:" + this.cih);
            printWriter.println("ofAoLevel:" + this.cil);
            printWriter.println("ofClouds:" + this.cio);
            printWriter.println("ofCloudsHeight:" + this.cip);
            printWriter.println("ofTrees:" + this.ciq);
            printWriter.println("ofDroppedItems:" + this.cis);
            printWriter.println("ofRain:" + this.cir);
            printWriter.println("ofAnimatedWater:" + this.cje);
            printWriter.println("ofAnimatedLava:" + this.cjf);
            printWriter.println("ofAnimatedFire:" + this.cjg);
            printWriter.println("ofAnimatedPortal:" + this.cjh);
            printWriter.println("ofAnimatedRedstone:" + this.cji);
            printWriter.println("ofAnimatedExplosion:" + this.cjj);
            printWriter.println("ofAnimatedFlame:" + this.cjk);
            printWriter.println("ofAnimatedSmoke:" + this.cjl);
            printWriter.println("ofVoidParticles:" + this.cjm);
            printWriter.println("ofWaterParticles:" + this.cjn);
            printWriter.println("ofPortalParticles:" + this.cjp);
            printWriter.println("ofPotionParticles:" + this.cjq);
            printWriter.println("ofFireworkParticles:" + this.cjr);
            printWriter.println("ofDrippingWaterLava:" + this.cjs);
            printWriter.println("ofAnimatedTerrain:" + this.cjt);
            printWriter.println("ofAnimatedTextures:" + this.cju);
            printWriter.println("ofRainSplash:" + this.cjo);
            printWriter.println("ofLagometer:" + this.civ);
            printWriter.println("ofShowFps:" + this.cix);
            printWriter.println("ofAutoSaveTicks:" + this.ciu);
            printWriter.println("ofBetterGrass:" + this.cit);
            printWriter.println("ofConnectedTextures:" + this.ciQ);
            printWriter.println("ofWeather:" + this.ciy);
            printWriter.println("ofSky:" + this.ciz);
            printWriter.println("ofStars:" + this.ciA);
            printWriter.println("ofSunMoon:" + this.ciB);
            printWriter.println("ofVignette:" + this.ciC);
            printWriter.println("ofChunkUpdates:" + this.ciD);
            printWriter.println("ofChunkUpdatesDynamic:" + this.ciE);
            printWriter.println("ofTime:" + this.ciF);
            printWriter.println("ofClearWater:" + this.ciG);
            printWriter.println("ofAaLevel:" + this.cim);
            printWriter.println("ofAfLevel:" + this.cin);
            printWriter.println("ofProfiler:" + this.ciw);
            printWriter.println("ofBetterSnow:" + this.ciH);
            printWriter.println("ofSwampColors:" + this.ciJ);
            printWriter.println("ofRandomEntities:" + this.ciK);
            printWriter.println("ofSmoothBiomes:" + this.ciL);
            printWriter.println("ofCustomFonts:" + this.ciM);
            printWriter.println("ofCustomColors:" + this.ciN);
            printWriter.println("ofCustomItems:" + this.ciR);
            printWriter.println("ofCustomSky:" + this.ciO);
            printWriter.println("ofShowCapes:" + this.ciP);
            printWriter.println("ofNaturalTextures:" + this.ciS);
            printWriter.println("ofEmissiveTextures:" + this.ciT);
            printWriter.println("ofLazyChunkLoading:" + this.cii);
            printWriter.println("ofRenderRegions:" + this.cij);
            printWriter.println("ofSmartAnimations:" + this.cik);
            printWriter.println("ofDynamicFov:" + this.ciX);
            printWriter.println("ofAlternateBlocks:" + this.ciY);
            printWriter.println("ofDynamicLights:" + this.ciZ);
            printWriter.println("ofScreenshotSize:" + this.cjd);
            printWriter.println("ofCustomEntityModels:" + this.cja);
            printWriter.println("ofCustomGuis:" + this.cjb);
            printWriter.println("ofShowGlErrors:" + this.cjc);
            printWriter.println("ofFullscreenMode:" + this.ciI);
            printWriter.println("ofFastMath:" + this.ciU);
            printWriter.println("ofFastRender:" + this.ciV);
            printWriter.println("ofTranslucentBlocks:" + this.ciW);
            printWriter.println("key_" + this.cjH.Ri() + ":" + this.cjH.cO());
            printWriter.close();
        }
        catch (Exception exception) {
            net.minecraft.src.a.warn("Failed to save options");
            exception.printStackTrace();
        }
    }

    private void QR() {
        switch (this.cio) {
            case 1: {
                this.cgw = 1;
                break;
            }
            case 2: {
                this.cgw = 2;
                break;
            }
            case 3: {
                this.cgw = 0;
                break;
            }
            default: {
                this.cgw = this.aWD ? 2 : 1;
            }
        }
    }

    public void QS() {
        this.bOt = 8;
        this.cgs = true;
        this.cgt = false;
        this.cgv = (int)c.cjR.QZ();
        this.cgG = false;
        this.QT();
        this.bZj = 4;
        this.aWD = true;
        this.cgx = 2;
        this.cgw = 2;
        this.chV = 70.0f;
        this.chW = 0.0f;
        this.chY = 2;
        this.chZ = 0;
        this.cgR = true;
        this.cgH = false;
        this.cib = false;
        this.cic = 1;
        this.cid = 0.8f;
        this.cie = 0;
        this.cif = false;
        this.cik = false;
        this.cig = false;
        net.minecraft.src.a.aoK();
        this.cih = net.minecraft.src.a.aoL();
        this.cii = false;
        this.cij = false;
        this.ciU = false;
        this.ciV = false;
        this.ciW = 0;
        this.ciX = true;
        this.ciY = true;
        this.ciZ = 3;
        this.cjd = 1;
        this.cja = true;
        this.cjb = true;
        this.cjc = false;
        this.cil = 1.0f;
        this.cim = 0;
        this.cin = 1;
        this.cio = 0;
        this.cip = 0.0f;
        this.ciq = 0;
        this.cir = 0;
        this.cit = 3;
        this.ciu = 4000;
        this.civ = false;
        this.cix = false;
        this.ciw = false;
        this.ciy = true;
        this.ciz = true;
        this.ciA = true;
        this.ciB = true;
        this.ciC = 0;
        this.ciD = 1;
        this.ciE = false;
        this.ciF = 0;
        this.ciG = false;
        this.ciH = false;
        this.ciI = cjD;
        this.ciJ = true;
        this.ciK = true;
        this.ciL = true;
        this.ciM = true;
        this.ciN = true;
        this.ciR = true;
        this.ciO = true;
        this.ciP = true;
        this.ciQ = 2;
        this.ciS = false;
        this.ciT = true;
        this.cje = 0;
        this.cjf = 0;
        this.cjg = true;
        this.cjh = true;
        this.cji = true;
        this.cjj = true;
        this.cjk = true;
        this.cjl = true;
        this.cjm = true;
        this.cjn = true;
        this.cjo = true;
        this.cjp = true;
        this.cjq = true;
        this.cjr = true;
        this.cjs = true;
        this.cjt = true;
        this.cju = true;
        ah.iK("OFF");
        ah.eDi = 0;
        ah.aFx();
        ah.aEY();
        this.QU();
        this.P.Az();
        this.QK();
    }

    public void QT() {
        try {
            Display.setVSyncEnabled((boolean)this.cgG);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void QU() {
        if (net.minecraft.src.a.Bf()) {
            net.minecraft.src.a.doj = true;
        }
        h.a(this, this.P.bgF);
    }

    public void ax(boolean bl2) {
        int n2;
        this.cje = n2 = bl2 ? 0 : 2;
        this.cjf = n2;
        this.cjg = bl2;
        this.cjh = bl2;
        this.cji = bl2;
        this.cjj = bl2;
        this.cjk = bl2;
        this.cjl = bl2;
        this.cjm = bl2;
        this.cjn = bl2;
        this.cjo = bl2;
        this.cjp = bl2;
        this.cjq = bl2;
        this.cjr = bl2;
        this.chZ = bl2 ? 0 : 2;
        this.cjs = bl2;
        this.cjt = bl2;
        this.cju = bl2;
    }

    private static int a(int n2, int[] nArray) {
        int n3 = a.c(n2, nArray);
        if (n3 < 0) {
            return nArray[0];
        }
        if (++n3 >= nArray.length) {
            n3 = 0;
        }
        return nArray[n3];
    }

    private static int b(int n2, int[] nArray) {
        int n3 = a.c(n2, nArray);
        return n3 < 0 ? nArray[0] : n2;
    }

    private static int c(int n2, int[] nArray) {
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if (nArray[i2] != n2) continue;
            return i2;
        }
        return -1;
    }
}

