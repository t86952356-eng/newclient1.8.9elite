/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package rise.module.impl.movement;

import hackclient.rise.aec;
import hackclient.rise.aei;
import hackclient.rise.afl;
import hackclient.rise.aho;
import hackclient.rise.ahs;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.ait;
import hackclient.rise.akd;
import hackclient.rise.akm;
import hackclient.rise.akn;
import hackclient.rise.akr;
import hackclient.rise.bs;
import hackclient.rise.ds;
import hackclient.rise.du;
import hackclient.rise.eh;
import hackclient.rise.es;
import hackclient.rise.fd;
import hackclient.rise.fg;
import hackclient.rise.fr;
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
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.ClickEvent;
import rise.event.impl.JumpEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PostMotionEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render2DEvent;
import rise.event.impl.Render3DEvent;
import rise.event.impl.StrafeEvent;
import rise.event.impl.TickEvent;
import rise.event.impl.WaterEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;

@ModuleInfo(aliases={"module.other.test.name"}, description="module.other.test.description", category=Category.MOVEMENT)
public final class Test
extends Module {
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
    private final akn YM = new akn("Position", (Module)this, new Vector2d(255.0, 255.0));
    public da Jr = new da(0.0, 0.0, 0.0);
    private final akr YN = new akr("Run If () ->", (Module)this, "onGround");
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
    List<Vector2d> YZ = new ArrayList<Vector2d>();
    Vector2d Za = null;
    @EventLink
    public final Listener<fr> Zb = fr2 -> {
        this.YR = true;
    };
    @EventLink(cH=0)
    public final Listener<PacketReceiveEvent> Zc = packetReceiveEvent -> {
        this.YR = true;
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof ah) {
            ah ah2 = (ah)aj2;
            for (ai ai2 : ah2.ahb()) {
                for (a a2 : ai2.ahe()) {
                    if (!a2.Xo().equals(Test.aER.bgK.Ul())) continue;
                    afl.c("s", new Object[0]);
                }
            }
        }
    };
    @EventLink
    public final Listener<PacketSendEvent> Zd = packetSendEvent -> {
        this.YR = true;
    };
    @EventLink
    public final Listener<fd> Ze = fd2 -> {
        this.YR = true;
    };
    @EventLink
    public final Listener<es> Zf = es2 -> {
        this.YR = true;
    };
    @EventLink
    public final Listener<Render2DEvent> Zg = render2DEvent -> {
        this.YR = true;
    };
    @EventLink
    public final Listener<Render3DEvent> Zh = render3DEvent -> {
        this.YR = true;
    };
    private HashMap<Integer, Integer> Zi = new HashMap();
    public static double Zj;
    @EventLink
    public final Listener<PreUpdateEvent> Zk = preUpdateEvent -> {
        this.YR = true;
        Test.aER.aIY.chr.ay(aik.p(0.0, aii.predictedMotion(Test.aER.bgK.ue), 0.0) instanceof BlockSlime && Test.aER.bgK.ue < -0.1);
    };
    @EventLink
    public final Listener<WaterEvent> Zl = waterEvent -> {
        this.YR = true;
    };
    @EventLink
    public final Listener<AttackEvent> Zm = attackEvent -> {
        ++this.Ma;
        this.YR = true;
    };
    @EventLink
    public final Listener<fg> Zn = fg2 -> {
        this.YL = null;
        this.YR = true;
    };
    @EventLink
    public final Listener<PreMotionEvent> Zo = preMotionEvent -> {
        this.YR = true;
        if (Test.aER.bgK.tR == 0) {
            preMotionEvent.setPosY(Test.aER.bgK.gX - 0.01);
        }
    };
    @EventLink
    public final Listener<du> Zp = du2 -> {
        this.Za = null;
    };
    @EventLink
    public final Listener<ds> Zq = ds2 -> {
        int n2 = ds2.cL();
        int n3 = ds2.cM();
        ArrayList<Vector2d> arrayList = new ArrayList<Vector2d>(this.YZ);
        arrayList.sort((vector2d, vector2d2) -> (int)(sw.aaa.a(vector2d.getX() - (double)n2, vector2d.getY() - (double)n3) - sw.aaa.a(vector2d2.getX() - (double)n2, vector2d2.getY() - (double)n3)));
        this.Za = (Vector2d)arrayList.stream().findFirst().get();
    };
    @EventLink
    public final Listener<ClickEvent> Zr = clickEvent -> {
        this.YR = true;
    };
    @EventLink
    public final Listener<PostMotionEvent> Zs = postMotionEvent -> {
        this.YR = true;
    };
    @EventLink
    public final Listener<TickEvent> Zt = tickEvent -> {
        this.YR = true;
    };
    @EventLink
    public final Listener<StrafeEvent> Zu = strafeEvent -> {
        this.YR = true;
    };
    @EventLink
    public final Listener<eh> Zv = eh2 -> {
        this.YR = true;
    };
    public final Listener<JumpEvent> Zw = jumpEvent -> {
        this.YR = true;
    };
    @EventLink
    public final Listener<MoveInputEvent> Zx = moveInputEvent -> {
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
        Test.aER.aIY.chr.ay(Keyboard.isKeyDown((int)Test.aER.aIY.chr.cO()));
        Test.aER.aIY.chq.ay(Keyboard.isKeyDown((int)Test.aER.aIY.chq.cO()));
        Test.aER.aIY.chp.ay(Keyboard.isKeyDown((int)Test.aER.aIY.chp.cO()));
        Test.aER.aIY.chn.ay(Keyboard.isKeyDown((int)Test.aER.aIY.chn.cO()));
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
        this.YZ.add(new Vector2d(100.0, 500.0));
        this.YZ.add(new Vector2d(200.0, 100.0));
        this.YZ.add(new Vector2d(600.0, 100.0));
        this.YZ.add(new Vector2d(700.0, 500.0));
    }

    private void g(List<Vector2d> list) {
        for (Vector2d vector2d : list) {
            ait.c(vector2d.x, vector2d.y, 3.0, this.rP().rQ());
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
            Vector2d vector2d;
            vector2d = this.a(f2, list);
            GL11.glVertex2f((float)((float)vector2d.x), (float)((float)vector2d.y));
            f2 += 0.01f;
        }
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        ait.e(Color.WHITE);
    }

    private Vector2d a(float f2, List<Vector2d> list) {
        float f3 = 1.0f - f2;
        float f4 = (float)(Math.pow(f3, 3.0) * list.get((int)0).x + 3.0 * Math.pow(f3, 2.0) * (double)f2 * list.get((int)1).x + (double)(3.0f * f3) * Math.pow(f2, 2.0) * list.get((int)2).x + Math.pow(f2, 3.0) * list.get((int)3).x);
        float f5 = (float)(Math.pow(f3, 3.0) * list.get((int)0).y + 3.0 * Math.pow(f3, 2.0) * (double)f2 * list.get((int)1).y + (double)(3.0f * f3) * Math.pow(f2, 2.0) * list.get((int)2).y + Math.pow(f2, 3.0) * list.get((int)3).y);
        return new Vector2d(f4, f5);
    }

    public void run() {
        if (Test.aER.aIY.chr.Re()) {
            this.Zi.clear();
        }
        if (aei.c((Vector2f)bs.fk, (double)15.0).dzu == cf.dzz) {
            this.Yv = Test.aER.bgK.pl;
            this.Yw = Test.aER.bgK.pm;
            return;
        }
        double d2 = Math.hypot(Test.aER.bgK.pl - this.Yv, Test.aER.bgK.pm - this.Yw);
        int n4 = (int)Math.round(d2);
        this.Zi.putIfAbsent(n4, 1);
        this.Zi.put(n4, this.Zi.get(n4) + 1);
        afl.b("Outputted", new Object[0]);
        this.Zi.forEach((n2, n3) -> System.out.println(n3 + "\t" + n2));
        this.Yv = Test.aER.bgK.pl;
        this.Yw = Test.aER.bgK.pm;
    }
}

