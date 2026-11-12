/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render.interface;

import hackclient.rise.ady;
import hackclient.rise.agf;
import hackclient.rise.agg;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aiw;
import hackclient.rise.akr;
import hackclient.rise.ch;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import hackclient.rise.yz;
import hackclient.rise.za;
import hackclient.rise.zb;
import hackclient.rise.zc;
import hackclient.rise.zf;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.client.gui.inventory.i;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.potion.d;
import net.minecraft.util.cm;
import rip.vantage.network.core.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.KillEvent;
import rise.event.impl.Render2DEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.render.Interface;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.ModeValue;

public class YyMode
extends Mode<Interface> {
    private final agf atm = gb.ks.a(36, gd.kF);
    private final agf atn = gb.ks.a(20, gd.kG);
    private final agf ato = gb.ks.a(18, gd.kF);
    private final agf atp = gb.ks.a(18, gd.kG);
    agf ky = gb.ks.a(18, gd.kG);
    private final rip.vantage.commons.util.time.a atq = new rip.vantage.commons.util.time.a();
    private final ModeValue atr = new yz(this, "ArrayList Color Mode", this);
    private final ModeValue ats = new za(this, "ArrayList Font", this);
    private final akr att = new akr("Custom Installed Font", (Mode<?>)this, "Arial", () -> !((Mode)this.ats.wD()).getName().equals("Custom"));
    private final ModeValue atu = new zb(this, "Shader Effect", this);
    private final BooleanValue atv = new BooleanValue("Drop Shadow", (Mode<?>)this, (Boolean)true);
    private final BooleanValue atw = new BooleanValue("Sidebar", (Mode<?>)this, (Boolean)true);
    private final BooleanValue atx = new BooleanValue("Particles on Kill", (Mode<?>)this, (Boolean)true);
    private final ModeValue aty = new zc(this, "BackGround", this);
    private final akr atz = new akr("Custom Client Name", (Mode<?>)this, "");
    private boolean atA;
    private boolean atB;
    private boolean atC;
    private String atD;
    private float atE;
    private float atF;
    private Color atG = new Color(0);
    private final rip.vantage.commons.util.time.a atH = new rip.vantage.commons.util.time.a();
    @EventLink
    public final Listener<Render2DEvent> atI = render2DEvent -> {
        double d3;
        if (aER == null || YyMode.aER.aIY.bJS || YyMode.aER.bgF == null || YyMode.aER.bgK == null) {
            return;
        }
        boolean bl2 = this.ky == gb.kt.dM();
        ((Interface)this.wy()).n(this.ky.tF() + (float)(bl2 ? 2 : 0));
        ((Interface)this.wy()).a(this.ky);
        ((Interface)this.wy()).o(10.0f);
        float f2 = render2DEvent.dx().getScaledWidth();
        float f3 = (float)render2DEvent.dx().getScaledHeight() - this.ky.tF() - 1.0f;
        double d4 = d3 = bl2 ? 3.5 : 2.0;
        if (this.atA || this.atB) {
            this.b(gg.kT).c(() -> {
                for (zf object2 : ((Interface)this.wy()).mc()) {
                    if (object2.atQ == 0.0f) continue;
                    double string = object2.nH().getX();
                    double string3 = object2.nH().getY();
                    Color f6 = object2.nM();
                    if (this.atC) {
                        if (!bl2) {
                            ait.d(string - d3, string3 - 3.0, (double)(object2.atS + object2.atT + 3.0f) + d3, ((Interface)this.wy()).aoZ, this.atA ? ais.d(f6, 255) : this.rP().rU());
                        } else {
                            ait.d(string - d3 + 0.5, string3 - 3.0, (double)(object2.atS + object2.atT + 3.0f) + d3, ((Interface)this.wy()).aoZ, this.atA ? ais.d(f6, 255) : this.rP().rU());
                        }
                    } else if (this.atA) {
                        this.a(object2, string + 0.5, string3, f6.getRGB());
                    } else if (this.atB) {
                        this.ky.a(object2.getDisplayName(), string, string3, Color.BLACK.getRGB());
                        if (object2.nQ()) {
                            this.ky.a(object2.nP(), string + (double)object2.nK() + 3.0, string3, Color.BLACK.getRGB());
                        }
                    }
                    if (!((Boolean)this.atw.wD()).booleanValue()) continue;
                    ait.c(string + (double)object2.nK() + (double)object2.nL() + 2.0, string3 - 1.5, 2.0, 9.0, 1.0, f6);
                }
                if (((Mode)this.ats.wD()).getName().equals("Minecraft")) {
                    agg cfr_ignored_0 = YyMode.aER.fontRendererObj;
                    float f4 = 16.0f / (float)agg.aIF;
                    GlStateManager.JV();
                    GlStateManager.i(f4, f4, f4);
                    YyMode.aER.fontRendererObj.b(Client.b, 6.0f / f4, 6.0f / f4, this.rP().rQ().getRGB());
                    GlStateManager.JW();
                } else {
                    ais.a(this.atm, Client.b, 6.0, 6.0, true);
                    this.ato.b("", 39.0, 6.0, ais.d(Color.WHITE, 170).getRGB());
                }
                if (!((String)this.atz.wD()).isEmpty()) {
                    this.ato.a((String)this.atz.wD(), (double)(6 + this.atm.bQ(Client.b) + 2), 6.0, this.rP().rR().getRGB());
                }
                agf agf2 = gb.ks.a(18, gd.kF);
                agf agf3 = gb.ks.a(18, gd.kH);
                String string = "6.9.9";
                String string2 = a.aKQ().bX();
                String string3 = "User:";
                float f4 = agf2.bQ("Version:\u2009\u2009\u2009\u2009\u2009\u2009");
                float f5 = agf3.bQ(string);
                float f6 = this.atn.bQ(string3);
                float f7 = this.atn.bQ(string2);
                float f8 = f2 - (f4 + f5 + f6 + f7) - 6.0f;
                this.atp.b("Version:\u2009\u2009\u2009\u2009\u2009\u2009", f8, f3, -3355444);
                agf3.b(string, f8 + f4, f3, -3355444);
                float f9 = f8 + f4 + f5 + 5.0f;
                this.atp.b(string3, f9, f3, -3355444);
                this.ato.b(string2, f9 + f6, f3, -3355444);
                this.atp.b("XYZ:", 5.0, f3, -3355444);
                this.ato.b(this.atD, 5.0f + this.atF, f3, -3355444);
                agf agf4 = gb.ks.a(16, gd.kF);
                agf agf5 = gb.ks.a(16, gd.kH);
                Collection<d> collection = YyMode.aER.bgK.VL();
                if (!collection.isEmpty()) {
                    String string4;
                    agf agf6 = this.atp;
                    ArrayList<String[]> arrayList = new ArrayList<String[]>();
                    for (d d3 : collection) {
                        if (d3.getDuration() > 24000) continue;
                        string4 = this.S(d3.ajf() + 1);
                        String string5 = I18n.a(d3.ajj(), new Object[0]) + " " + string4;
                        String string6 = net.minecraft.potion.a.f(d3);
                        arrayList.add(new String[]{string5, string6});
                    }
                    arrayList.sort((stringArray, stringArray2) -> Float.compare(agf4.bQ(stringArray2[0]) + agf4.bQ(" " + stringArray2[1]), agf4.bQ(stringArray[0]) + agf4.bQ(" " + stringArray[1])));
                    for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                        String string7 = ((String[])arrayList.get(i2))[0];
                        string4 = ((String[])arrayList.get(i2))[1];
                        float f10 = agf5.bQ(string7) + agf6.bQ(" " + string4);
                        float f11 = f2 - f10 - 5.0f;
                        float f12 = f3 - (agf6.tF() + 5.0f) * (float)(i2 + 1);
                        agf5.b(string7, f11, f12, -3355444);
                        agf5.b(" " + string4, f11 + (float)agf5.bQ(string7), f12, -3355444);
                    }
                }
            });
        }
        for (zf object2 : ((Interface)this.wy()).mc()) {
            if (object2.atQ == 0.0f) continue;
            double string2 = object2.nH().getX();
            double agf3 = object2.nH().getY();
            Color f5 = object2.nM();
            if (this.atC) {
                Consumer<Color> f6 = color -> {
                    if (!bl2) {
                        ait.d(string2 - d3, agf3 - 3.0, (double)(zf2.atS + zf2.atT + 3.0f) + d3, ((Interface)this.wy()).aoZ, color);
                    } else {
                        ait.d(string2 - d3 + 0.5, agf3 - 3.0, (double)(zf2.atS + zf2.atT + 3.0f) + d3, ((Interface)this.wy()).aoZ, color);
                    }
                };
                this.b(gg.kU).c(() -> consumer.accept(Color.BLACK));
                this.b(gg.kV, 1).c(() -> {
                    this.rP();
                    consumer.accept(ady.sa());
                });
            }
            this.b(gg.kV, 1).c(() -> this.a(object2, string2, agf3 - 0.5, f5.getRGB()));
            if (!((Boolean)this.atw.wD()).booleanValue()) continue;
            ait.c(string2 + (double)object2.nK() + (double)object2.nL() + 2.0, agf3 - 1.5, 2.0, 9.0, 1.0, f5);
        }
        if (this.atD == null) {
            return;
        }
        if (!this.atq.T(2000L)) {
            this.b(gg.kT).c(ch::cj);
        }
        String string = a.aKQ().bX();
        String string2 = "User:";
        String string3 = "6.9.9";
        agf agf2 = gb.ks.a(18, gd.kF);
        agf agf3 = gb.ks.a(18, gd.kH);
        float f4 = agf2.bQ("Version:\u2009\u2009\u2009\u2009\u2009\u2009");
        float f5 = agf3.bQ(string3);
        float f6 = this.atn.bQ(string2);
        float f7 = this.atn.bQ(string);
        float f8 = f2 - (f4 + f5 + f6 + f7) - 6.0f;
        this.atp.b("Version:\u2009\u2009\u2009\u2009\u2009\u2009", f8, f3, -3355444);
        agf3.b(string3, f8 + f4, f3, -3355444);
        float f9 = f8 + f4 + f5 + 5.0f;
        this.atp.b(string2, f9, f3, -3355444);
        this.ato.b(string, f9 + f6, f3, -3355444);
        this.atE = f6 + f7;
        this.atp.b("XYZ:", 5.0, f3, -3355444);
        this.ato.b(this.atD, 5.0f + this.atF, f3, -3355444);
        agf agf4 = gb.ks.a(16, gd.kF);
        agf agf5 = gb.ks.a(16, gd.kH);
        Collection<d> collection = YyMode.aER.bgK.VL();
        if (!collection.isEmpty()) {
            String string4;
            agf f15 = this.atp;
            ArrayList<String[]> arrayList = new ArrayList<String[]>();
            for (d f11 : collection) {
                if (f11.getDuration() > 24000) continue;
                String f12 = this.S(f11.ajf() + 1);
                String i2 = I18n.a(f11.ajj(), new Object[0]) + " " + f12;
                string4 = net.minecraft.potion.a.f(f11);
                arrayList.add(new String[]{i2, string4});
            }
            arrayList.sort((stringArray, stringArray2) -> Float.compare(agf5.bQ(stringArray2[0]) + agf5.bQ(" " + stringArray2[1]), agf5.bQ(stringArray[0]) + agf5.bQ(" " + stringArray[1])));
            float f10 = 10.0f;
            float f11 = -3.7f;
            float f12 = 9.0f;
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                string4 = ((String[])arrayList.get(i2))[0];
                String string5 = ((String[])arrayList.get(i2))[1];
                d d5 = collection.stream().filter(d2 -> {
                    String string2 = this.S(d2.ajf() + 1);
                    return I18n.a(d2.ajj(), new Object[0]).equals(string3.replace(" " + string2, ""));
                }).findFirst().orElse(null);
                if (d5 == null) continue;
                float f13 = f2 - (float)agf5.bQ(string4) - (float)f15.bQ(" " + string5) - f10 - f12 - 5.0f;
                float f14 = f3 - (f15.tF() + 5.0f) * (float)(i2 + 1);
                this.a(d5.aje(), f13 + 4.0f, f14 + f11, 13.0f);
                agf5.b(string4, f13 + f10 + f12, f14, -3355444);
                agf5.b(" " + string5, f13 + f10 + f12 + (float)agf5.bQ(string4), f14, -3355444);
            }
        }
        if (((Mode)this.ats.wD()).getName().equals("Minecraft")) {
            agg cfr_ignored_0 = YyMode.aER.fontRendererObj;
            float f15 = 16.0f / (float)agg.aIF;
            GlStateManager.JV();
            GlStateManager.i(f15, f15, f15);
            YyMode.aER.fontRendererObj.b(Client.b, 6.0f / f15, 6.0f / f15, this.rP().rQ().getRGB());
            GlStateManager.JW();
        } else {
            ais.a(this.atm, Client.b, 6.0, 6.0, true);
            this.ato.b("", 39.0, 6.0, ais.d(Color.WHITE, 170).getRGB());
        }
        this.ato.b("", 39.0, 6.0, ais.d(Color.WHITE, 170).getRGB());
        if (!((String)this.atz.wD()).isEmpty()) {
            this.ato.a((String)this.atz.wD(), (double)(6 + this.atm.bQ(Client.b) + 2), 6.0, this.rP().rR().getRGB());
        }
        if (this.atH.T(7500L)) {
            this.atq.aX();
            this.atH.aX();
        }
    };
    @EventLink
    public final Listener<KillEvent> atJ = killEvent -> {
        if (!this.atq.T(2000L) && ((Boolean)this.atx.wD()).booleanValue()) {
            for (int i2 = 0; i2 <= 10; ++i2) {
                ch.a(new aiw(new Vector2f(0.0f, 0.0f), new Vector2f((float)Math.random(), (float)Math.random())));
            }
        }
        this.atq.aX();
    };
    @EventLink
    public final Listener<TickEvent> atK = tickEvent -> {
        if (YyMode.aER.bgK == null || !YyMode.aER.AU().bEQ) {
            return;
        }
        try {
            if (((Mode)this.ats.wD()).getName().equals("Custom") && this.ky != gb.kw.o(18)) {
                this.ky = gb.kw.o(18);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        aNC.execute(() -> {
            Object object;
            Object object2;
            Object object3;
            this.atA = ((Mode)this.atu.wD()).getName().equals("Glow");
            this.atB = ((Mode)this.atu.wD()).getName().equals("Shadow");
            this.atE = this.atn.bQ("riseclient.com") + 2;
            this.atD = (int)Math.floor(YyMode.aER.bgK.gW) + ", " + (int)Math.floor(YyMode.aER.bgK.gX) + ", " + (int)Math.floor(YyMode.aER.bgK.gY);
            this.atF = this.ato.bQ("XYZ:") + 2;
            this.atG = this.rP().rQ();
            this.atC = ((Mode)this.aty.wD()).getName().equals("Normal");
            switch (((Mode)this.ats.wD()).getName()) {
                case "Apple UI": {
                    object3 = gb.ks.a(18, gd.kG);
                    if (this.ky.equals(object3)) break;
                    this.ky = object3;
                    break;
                }
                case "Minecraft": {
                    object2 = gb.kt.dM();
                    if (this.ky.equals(object2)) break;
                    this.ky = object2;
                    break;
                }
                case "Custom": {
                    Object object4;
                    object = (String)this.att.wD();
                    if (!(Math.random() > 0.95) || !((Optional)(object4 = gb.dN().stream().filter(arg_0 -> YyMode.o((String)object, arg_0)).findFirst())).isPresent() || gb.kw.getName().equals(((Optional)object4).get())) break;
                    gb.kw.setName((String)((Optional)object4).get());
                    gb.kw.dO().clear();
                }
            }
            for (zf zf2 : ((Interface)this.wy()).mc()) {
                if (zf2.atQ == 0.0f) continue;
                zf2.y(!zf2.getTag().isEmpty() && (Boolean)((Interface)this.wy()).aoI.wD() != false);
                object3 = ((Boolean)((Interface)this.wy()).aoJ.wD() != false ? zf2.nN().toLowerCase() : zf2.nN()).replace((Boolean)((Interface)this.wy()).lY().wD() != false ? " " : "", "");
                object2 = ((Boolean)((Interface)this.wy()).aoJ.wD() != false ? zf2.getTag().toLowerCase() : zf2.getTag()).replace((Boolean)((Interface)this.wy()).lY().wD() != false ? " " : "", "");
                object = this.rP().rQ();
                switch (((Mode)this.atr.wD()).getName()) {
                    case "Breathe": {
                        double d2 = this.rP().k(new Vector2d(0.0, 0.0));
                        object = ais.a((Color)object, this.rP().rR(), d2);
                        break;
                    }
                    case "Fade": {
                        object = this.rP().j(new Vector2d(0.0, zf2.nH().getY()));
                    }
                }
                zf2.b((Color)object);
                zf2.t(this.ky.bQ((String)object3));
                zf2.u(zf2.nQ() ? (float)(this.ky.bQ((String)object2) + 3) : 0.0f);
                zf2.ap((String)object3);
                zf2.aq((String)object2);
            }
        });
    };

    public YyMode(String string, Interface interface_) {
        super(string, interface_);
    }

    private String S(int n2) {
        if (n2 < 1) {
            return String.valueOf(n2);
        }
        if (n2 > 255) {
            n2 = 255;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] stringArray = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        while (n2 >= 100) {
            stringBuilder.append("C");
            n2 -= 100;
        }
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            while (n2 >= nArray[i2]) {
                stringBuilder.append(stringArray[i2]);
                n2 -= nArray[i2];
            }
        }
        return stringBuilder.toString();
    }

    private void a(int n2, float f2, float f3, float f4) {
        net.minecraft.potion.a a2 = net.minecraft.potion.a.dgt[n2];
        if (a2 == null || !a2.aiX()) {
            return;
        }
        cm cm2 = i.bwf;
        int n3 = a2.aiY();
        int n4 = n3 % 8 * 18;
        int n5 = 198 + n3 / 8 * 19;
        ait.a(cm2, f2, f3, n4, n5, 18, 18, 256, 256, f4, f4);
    }

    public static String am(String string) {
        return string.replaceAll("[^a-zA-Z]", "");
    }

    private void a(zf zf2, double d2, double d3, int n2) {
        if (((Boolean)this.atv.wD()).booleanValue()) {
            this.ky.b(zf2.getDisplayName(), d2, d3, n2);
            if (zf2.nQ()) {
                this.ky.b(zf2.nP(), d2 + (double)zf2.nK() + 3.0, d3, -3355444);
            }
        } else {
            this.ky.a(zf2.getDisplayName(), d2, d3, n2);
            if (zf2.nQ()) {
                this.ky.a(zf2.nP(), d2 + (double)zf2.nK() + 3.0, d3, -3355444);
            }
        }
    }

    private static /* synthetic */ boolean o(String string, String string2) {
        return YyMode.am(string2).toLowerCase().contains(YyMode.am(string).toLowerCase());
    }
}

