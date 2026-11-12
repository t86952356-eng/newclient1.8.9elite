/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.aec;
import hackclient.rise.aei;
import hackclient.rise.afl;
import hackclient.rise.aho;
import hackclient.rise.ahs;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.akm;
import hackclient.rise.akn;
import hackclient.rise.akr;
import hackclient.rise.bs;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dr;
import hackclient.rise.ds;
import hackclient.rise.du;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.eg;
import hackclient.rise.eh;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.ep;
import hackclient.rise.eq;
import hackclient.rise.es;
import hackclient.rise.fd;
import hackclient.rise.fe;
import hackclient.rise.fg;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.fr;
import hackclient.rise.fs;
import hackclient.rise.ft;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.sw;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import net.minecraft.block.BlockSlime;
import net.minecraft.client.entity.c;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ah;
import net.minecraft.network.play.server.ai;
import net.minecraft.util.b;
import net.minecraft.util.cf;
import net.minecraft.util.cw;
import net.minecraft.util.da;
import net.minecraft.world.w;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

@gl(aliases={"module.other.test.name"}, description="module.other.test.description", category=gj.MOVEMENT)
public final class sp
extends gi {
    private final ArrayList<Integer> Yo = new ArrayList();
    private final ArrayList<Double> Yp = new ArrayList();
    private final ArrayList<Float> Yq = new ArrayList();
    private final ArrayList<aj<?>> Yr = new ArrayList();
    private final ArrayList<aj<?>> Ys = new ArrayList();
    private int ug;
    private int Ma;
    private boolean Eo;
    private boolean LZ;
    private boolean yc;
    private double Yt;
    private double Yu;
    private double Hy;
    private double Hz;
    private double HA;
    private float Yv;
    private float Yw;
    private da Yx;
    private da Yy;
    private da Yz;
    private net.minecraft.entity.c jM;
    private aj<?> YA;
    private net.minecraft.client.entity.b YB;
    private final List<aj<?>> YC = new ArrayList();
    private final ConcurrentLinkedQueue<aho> YD = new ConcurrentLinkedQueue();
    private final rip.vantage.commons.util.time.a YE = new rip.vantage.commons.util.time.a();
    private double YF;
    private double cl;
    private double xv;
    private double y;
    private double at;
    private double au;
    private double av;
    private int FX;
    private int YG;
    public static boolean zK;
    public static boolean YH;
    private b YI;
    private final DecimalFormat YJ = new DecimalFormat("0.0");
    private da YK;
    private b YL;
    private final akn YM = new akn("Position", (gi)this, new aka(255.0, 255.0));
    public da Jr = new da(0.0, 0.0, 0.0);
    private final akr YN = new akr("Run If () ->", (gi)this, "onGround");
    private final akm YO = new akm("Test Curve", this);
    private final ArrayList<net.minecraft.entity.c> YP = new ArrayList();
    private final ArrayList<akd> YQ = new ArrayList();
    private w jG;
    private boolean LK;
    private double LL;
    private boolean YR;
    Executor YS = Executors.newFixedThreadPool(1);
    ahs YT;
    c YU;
    aec<b> YV = new aec(2);
    private final HashMap<Double, HashMap<Integer, cw<Double, Boolean>>> YW = new HashMap();
    private Runnable YX;
    private Runnable YY;
    List<aka> YZ = new ArrayList<aka>();
    aka Za = null;
    @dm
    public final dk<fr> Zb = fr2 -> {
        this.YR = true;
    };
    @dm(cH=0)
    public final dk<fh> Zc = fh2 -> {
        this.YR = true;
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof ah) {
            ah ah2 = (ah)aj2;
            for (ai ai2 : ah2.ahb()) {
                for (a a2 : ai2.ahe()) {
                    if (!a2.Xo().equals(sp.aER.bgK.Ul())) continue;
                    afl.c("s", new Object[0]);
                }
            }
        }
    };
    @dm
    public final dk<fi> Zd = fi2 -> {
        this.YR = true;
    };
    @dm
    public final dk<fd> Ze = fd2 -> {
        this.YR = true;
    };
    @dm
    public final dk<es> Zf = es2 -> {
        this.YR = true;
    };
    @dm
    public final dk<fs> Zg = fs2 -> {
        this.YR = true;
    };
    @dm
    public final dk<ft> Zh = ft2 -> {
        this.YR = true;
    };
    private HashMap<Integer, Integer> Zi = new HashMap();
    public static double Zj;
    @dm
    public final dk<ej> Zk = ej2 -> {
        this.YR = true;
        sp.aER.aIY.chr.ay(aik.p(0.0, aii.predictedMotion(sp.aER.bgK.ue), 0.0) instanceof BlockSlime && sp.aER.bgK.ue < -0.1);
    };
    @dm
    public final dk<ep> Zl = ep2 -> {
        this.YR = true;
    };
    @dm
    public final dk<eq> Zm = eq2 -> {
        ++this.Ma;
        this.YR = true;
    };
    @dm
    public final dk<fg> Zn = fg2 -> {
        this.YL = null;
        this.YR = true;
    };
    @dm
    public final dk<ei> Zo = ei2 -> {
        this.YR = true;
        if (sp.aER.bgK.tR == 0) {
            ei2.setPosY(sp.aER.bgK.gX - 0.01);
        }
    };
    @dm
    public final dk<du> Zp = du2 -> {
        this.Za = null;
    };
    @dm
    public final dk<ds> Zq = ds2 -> {
        int n2 = ds2.cL();
        int n3 = ds2.cM();
        ArrayList<aka> arrayList = new ArrayList<aka>(this.YZ);
        arrayList.sort((aka2, aka3) -> (int)(sw.aaa.a(aka2.getX() - (double)n2, aka2.getY() - (double)n3) - sw.aaa.a(aka3.getX() - (double)n2, aka3.getY() - (double)n3)));
        this.Za = (aka)arrayList.stream().findFirst().get();
    };
    @dm
    public final dk<dr> Zr = dr2 -> {
        this.YR = true;
    };
    @dm
    public final dk<eg> Zs = eg2 -> {
        this.YR = true;
    };
    @dm
    public final dk<fe> Zt = fe2 -> {
        this.YR = true;
    };
    @dm
    public final dk<eo> Zu = eo2 -> {
        this.YR = true;
    };
    @dm
    public final dk<eh> Zv = eh2 -> {
        this.YR = true;
    };
    public final dk<ed> Zw = ed2 -> {
        this.YR = true;
    };
    @dm
    public final dk<dz> Zx = dz2 -> {
        this.YR = true;
    };

    @Override
    public void onDisable() {
        double d2 = 0.0;
        for (double d3 : this.Yp) {
            d2 += d3;
        }
        d2 /= (double)this.Yp.size();
        this.YR = true;
        sp.aER.aIY.chr.ay(Keyboard.isKeyDown((int)sp.aER.aIY.chr.cO()));
        sp.aER.aIY.chq.ay(Keyboard.isKeyDown((int)sp.aER.aIY.chq.cO()));
        sp.aER.aIY.chp.ay(Keyboard.isKeyDown((int)sp.aER.aIY.chp.cO()));
        sp.aER.aIY.chn.ay(Keyboard.isKeyDown((int)sp.aER.aIY.chn.cO()));
    }

    @Override
    public void onEnable() {
        this.Yp.clear();
        this.YR = true;
        this.Eo = false;
        this.YL = null;
        this.YV.clear();
        this.ug = 0;
        this.Ma = 0;
        this.YZ.clear();
        this.YZ.add(new aka(100.0, 500.0));
        this.YZ.add(new aka(200.0, 100.0));
        this.YZ.add(new aka(600.0, 100.0));
        this.YZ.add(new aka(700.0, 500.0));
    }

    private void g(List<aka> list) {
        for (aka aka2 : list) {
            ait.c(aka2.x, aka2.y, 3.0, this.rP().rQ());
        }
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glLineWidth((float)2.0f);
        GL11.glBegin((int)3);
        float f2 = 0.0f;
        while ((double)f2 <= 1.0) {
            aka aka2;
            aka2 = this.a(f2, list);
            GL11.glVertex2f((float)((float)aka2.x), (float)((float)aka2.y));
            f2 += 0.01f;
        }
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        ait.e(Color.WHITE);
    }

    private aka a(float f2, List<aka> list) {
        float f3 = 1.0f - f2;
        float f4 = (float)(Math.pow(f3, 3.0) * list.get((int)0).x + 3.0 * Math.pow(f3, 2.0) * (double)f2 * list.get((int)1).x + (double)(3.0f * f3) * Math.pow(f2, 2.0) * list.get((int)2).x + Math.pow(f2, 3.0) * list.get((int)3).x);
        float f5 = (float)(Math.pow(f3, 3.0) * list.get((int)0).y + 3.0 * Math.pow(f3, 2.0) * (double)f2 * list.get((int)1).y + (double)(3.0f * f3) * Math.pow(f2, 2.0) * list.get((int)2).y + Math.pow(f2, 3.0) * list.get((int)3).y);
        return new aka(f4, f5);
    }

    public void run() {
        if (sp.aER.aIY.chr.Re()) {
            this.Zi.clear();
        }
        if (aei.c((akb)bs.fk, (double)15.0).dzu == cf.dzz) {
            this.Yv = sp.aER.bgK.pl;
            this.Yw = sp.aER.bgK.pm;
            return;
        }
        double d2 = Math.hypot(sp.aER.bgK.pl - this.Yv, sp.aER.bgK.pm - this.Yw);
        int n4 = (int)Math.round(d2);
        this.Zi.putIfAbsent(n4, 1);
        this.Zi.put(n4, this.Zi.get(n4) + 1);
        afl.b("Outputted", new Object[0]);
        this.Zi.forEach((n2, n3) -> System.out.println(n3 + "\t" + n2));
        this.Yv = sp.aER.bgK.pl;
        this.Yw = sp.aER.bgK.pm;
    }
}

