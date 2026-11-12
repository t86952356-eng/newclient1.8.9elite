/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.abg;
import hackclient.rise.abi;
import hackclient.rise.abo;
import hackclient.rise.abq;
import hackclient.rise.abw;
import hackclient.rise.aby;
import hackclient.rise.abz;
import hackclient.rise.aca;
import hackclient.rise.aci;
import hackclient.rise.acj;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agm;
import hackclient.rise.agp;
import hackclient.rise.agz;
import hackclient.rise.aha;
import hackclient.rise.ahd;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.ajc;
import hackclient.rise.aje;
import hackclient.rise.aka;
import hackclient.rise.akb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fk;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.ge;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.wy;
import java.awt.Color;
import java.lang.reflect.Field;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import lombok.Generated;
import net.minecraft.client.d;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class abf
extends bp
implements ahd {
    public akb ayt = new akb(-1.0f, -1.0f);
    public akb alQ = new akb(416.0f, 338.0f);
    public abi ayu = new abi();
    public aca ayv;
    public aca ayw = this.ayv = gj.ld.ec();
    public aca ayx = this.ayv;
    public float ayy;
    public float ayz;
    public boolean dragging;
    public rip.vantage.commons.util.time.a ayA = new rip.vantage.commons.util.time.a();
    public rip.vantage.commons.util.time.a rG = new rip.vantage.commons.util.time.a();
    public ConcurrentLinkedQueue<abg> ayB = new ConcurrentLinkedQueue();
    public akb ayC;
    public double ayD;
    public double ayE;
    public double ayF;
    public int ayG = 7;
    aka ayH;
    public abo ayI;
    public akb ayJ = new akb(283.0f, 38.0f);
    public afj hB = new afj(afk.aHm, 300L);
    public afj ayK = new afj(afk.aHm, 300L);
    private final agz ayL = new agz();
    private agp ayM;
    ge ayN = new ge(new aje());
    @dm(cH=0)
    public final dk<fk> ayO = fk2 -> {
        if (this.ayD <= 0.99) {
            this.pj();
        }
    };

    public boolean a(agp agp2) {
        if (!aha.isEnabled()) {
            return false;
        }
        if (agp2 == null) {
            return false;
        }
        if (agp2 != this.ayM) {
            return false;
        }
        if (!this.ayL.ur()) {
            return false;
        }
        String string = this.ayL.uD();
        return string != null && !string.isEmpty();
    }

    public void pi() {
        this.ayB.clear();
        System.out.println("PRE RMC");
        if (a.a.s().od()) {
            return;
        }
        System.out.println("RMC");
        ArrayList<gi> arrayList = a.a.g().ef();
        arrayList.sort((gi2, gi3) -> Collator.getInstance().compare(gi2.getName(), gi3.getName()));
        arrayList.forEach(gi2 -> this.ayB.add(new abg((gi)gi2)));
    }

    @Override
    public void initGui() {
        if (this.ayB == null || this.ayB.isEmpty()) {
            this.pi();
        }
        aNC.execute(() -> {
            this.ayG = 12;
            this.hB.aX();
            this.hB.T(0.0);
            cz cz2 = abf.aER.jY;
            this.ayx = this.ayv;
            this.ayA.aX();
            this.ayA.i(System.currentTimeMillis() - 150L);
            Keyboard.enableRepeatEvents((boolean)true);
            this.rG.aX();
            this.ayv.aT();
            if (this.ayt.x < 0.0f || this.ayt.y < 0.0f || this.ayt.x + this.alQ.x > (float)cz2.getScaledWidth() || this.ayt.y + this.alQ.y > (float)cz2.getScaledHeight()) {
                this.ayt.x = (float)cz2.getScaledWidth() / 2.0f - this.alQ.x / 2.0f;
                this.ayt.y = (float)cz2.getScaledHeight() / 2.0f - this.alQ.y / 2.0f;
            }
            this.ayB.forEach(abg2 -> abg2.pQ().forEach(abo2 -> {
                if (abo2 instanceof abw) {
                    ((abw)abo2).qk();
                } else if (abo2 instanceof abq) {
                    ((abq)abo2).qk();
                }
            }));
        });
        if (a.a.s().od()) {
            this.ayB.clear();
        }
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.dragging = false;
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    public void cj() {
        this.alQ = new akb(400.0f, 300.0f);
        if (this.ayD > 0.99) {
            this.pj();
        } else {
            ((aje)this.ayN.dU()).p((float)this.ayE);
            this.ayN.c(this::pj);
            this.ayN.a(ajc.aQF);
            this.ayN.clear();
        }
    }

    public void pj() {
        int n2;
        if (this.ayC == null) {
            return;
        }
        d d2 = d.AZ();
        int n3 = (int)this.ayC.x;
        int n4 = (int)this.ayC.y;
        float f2 = d2.Bm().bWY;
        if (this.dragging) {
            if (this.ayv instanceof acj) {
                ((acj)this.ayv).qM();
            }
            this.ayt.x = (float)n3 + this.ayy;
            this.ayt.y = (float)n4 + this.ayz;
        }
        this.ayK.a(d2.bgR == a.a.v() ? afk.aHn : afk.aGW);
        this.ayK.h(d2.bgR == a.a.v() ? 300L : 100L);
        this.ayK.Q(d2.bgR == a.a.v() ? 1.0 : 0.0);
        this.ayE = this.ayK.sV();
        this.hB.a(d2.bgR == a.a.v() ? afk.aHn : afk.aGW);
        this.hB.Q(d2.bgR == a.a.v() ? 1.0 : 0.0);
        this.ayD = this.hB.sV();
        if (d2.bgR == a.a.v() && this.ayD == 0.0) {
            this.ayD = 0.01;
        }
        if (this.ayD == 0.0) {
            a.a.g().c(wy.class).setEnabled(false);
            return;
        }
        this.ayH = new aka((double)(this.ayt.x + this.alQ.x / 2.0f) * (1.0 - this.ayD), (double)(this.ayt.y + this.alQ.y / 2.0f) * (1.0 - this.ayD));
        Runnable runnable = () -> {
            GlStateManager.JV();
            if (this.ayD != 1.0) {
                GlStateManager.C(this.ayH.x, this.ayH.y, 0.0);
                GlStateManager.B(this.ayD, this.ayD, 0.0);
            }
        };
        runnable.run();
        this.b(gg.kT, 2).c(runnable);
        if (this.ayD > 0.993) {
            ait.a(18, (double)this.ayt.x, (double)this.ayt.y, (double)this.alQ.x, (double)this.alQ.y, 30.0, (double)this.ayG * 1.3);
        }
        ait.c((double)this.ayt.x, (double)this.ayt.y, (double)this.alQ.x, (double)this.alQ.y, this.ayG, abz.aAa.ql());
        Runnable runnable2 = () -> {
            GL11.glEnable((int)3089);
            int n2 = 1;
            ait.g((double)this.ayt.x * this.ayD + this.ayH.x + (double)n2, (double)this.ayt.y * this.ayD + this.ayH.y + (double)n2, (double)this.alQ.x * this.ayD - (double)(n2 * 2), (double)this.alQ.y * this.ayD - (double)(n2 * 2));
        };
        runnable2.run();
        this.b(gg.kT, 2).c(runnable2);
        Runnable runnable3 = () -> {
            GL11.glPushMatrix();
            GL11.glTranslated((double)0.0, (double)0.0, (double)0.0);
        };
        this.b(gg.kT, 2).c(runnable3);
        int n5 = 200;
        this.ayw = this.ayA.T(n5) ? this.ayv : this.ayx;
        this.ayw.b(n3, n4, f2);
        if (aha.isEnabled()) {
            n2 = 1;
            double d3 = (double)this.ayt.x * this.ayD + this.ayH.x + 1.0;
            double d4 = (double)this.ayt.y * this.ayD + this.ayH.y + 1.0;
            double d5 = (double)this.alQ.x * this.ayD - 2.0;
            double d6 = (double)this.alQ.y * this.ayD - 2.0;
            agp agp2 = this.pk();
            if (agp2 != this.ayM) {
                this.ayL.aX();
                this.ayM = agp2;
            }
            if (agp2 != null && this.ayL.ur()) {
                String string = this.ayL.uD();
                List<String> list = this.ayL.uE();
                if (string != null && !string.isEmpty()) {
                    float f3 = agp2.ua();
                    float f4 = agp2.ub();
                    gb.ks.a(16, gd.kG).a(string, f3, f4, ais.d(Color.WHITE, 210).getRGB());
                    ait.d(f3, f4 + gb.ks.a(16, gd.kG).tF() + 1.0f, gb.ks.a(16, gd.kG).bQ(string), 1.0, ais.d(Color.WHITE, 140));
                    if (list != null && !list.isEmpty()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        int n6 = Math.min(9, list.size());
                        int n7 = this.ayL.uC();
                        for (int i2 = 0; i2 < n6; ++i2) {
                            if (i2 > 0) {
                                stringBuilder.append("  ");
                            }
                            String string2 = i2 + 1 + "." + list.get(i2);
                            if (i2 == n7) {
                                stringBuilder.append('[').append(string2).append(']');
                                continue;
                            }
                            stringBuilder.append(string2);
                        }
                        stringBuilder.append(this.ayL.uI());
                        String string3 = stringBuilder.toString();
                        double d7 = 6.0;
                        double d8 = (double)gb.ks.a(16, gd.kG).bQ(string3) + d7 * 2.0;
                        double d9 = (double)gb.ks.a(16, gd.kG).tF() + d7 * 2.0 - 5.0;
                        double d10 = f3 - 2.0f;
                        double d11 = f4 + gb.ks.a(16, gd.kG).tF() + 6.0f;
                        double d12 = 8.0;
                        Color color = ais.d(Color.WHITE, 255);
                        this.b(gg.kU).c(() -> ait.c(d10, d11, d8, d9, d12, color));
                        this.b(gg.kT, 2).c(() -> {
                            GL11.glDisable((int)3089);
                            ait.c(d10, d11, d8, d9, d12 + 2.0, this.rP().rU());
                            GL11.glEnable((int)3089);
                            ait.g(d3, d4, d5, d6);
                        });
                        boolean bl2 = GL11.glIsEnabled((int)3089);
                        if (bl2) {
                            GL11.glDisable((int)3089);
                        }
                        ait.c(d10, d11, d8, d9, d12, ais.d(abz.aAa.ql(), (int)Math.min(220.0, this.ayE * 255.0)));
                        gb.ks.a(16, gd.kG).a(string3, d10 + d7, d11 + d7, ais.d(Color.WHITE, 240).getRGB());
                        if (bl2) {
                            GL11.glEnable((int)3089);
                            ait.g(d3, d4, d5, d6);
                        }
                    }
                }
            }
        }
        n2 = 255 - (int)Math.max(0.0f, Math.min(255.0f, this.ayA.aKM() < (long)n5 ? 255.0f - (float)this.ayA.aKM() * (255.0f / (float)n5) : (float)(this.ayA.aKM() - (long)n5) * (255.0f / (float)n5)));
        if (this.ayA.aKM() <= (long)(n5 * 2)) {
            ait.c((double)this.ayt.x, (double)this.ayt.y, (double)this.alQ.x, (double)this.alQ.y, this.ayG, abz.aAa.Y(n2));
        }
        this.ayu.pV();
        for (int i3 = 0; i3 <= 8; ++i3) {
            double d13 = i3 * 50;
            ait.c((double)this.ayt.x + this.ayu.ayX - d13 / 2.0, (double)(this.ayt.y + this.alQ.y / 2.0f) - d13 / 2.0, d13, ais.d(this.rP().rQ(), 1));
        }
        this.ayu.d(n3, n4);
        Runnable runnable4 = () -> {
            GL11.glDisable((int)3089);
            GlStateManager.JW();
        };
        runnable4.run();
        this.b(gg.kT, 2).c(runnable4);
        Runnable runnable5 = GL11::glPopMatrix;
        this.b(gg.kT, 2).c(runnable5);
        this.rG.aX();
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        this.ayC = new akb(n2, n3);
    }

    public void ci() {
        this.ayH = new aka((double)(this.ayt.x + this.alQ.x / 2.0f) * (1.0 - this.ayD), (double)(this.ayt.y + this.alQ.y / 2.0f) * (1.0 - this.ayD));
        GlStateManager.JV();
        if (this.ayD != 1.0) {
            GlStateManager.C(this.ayH.x, this.ayH.y, 0.0);
            GlStateManager.B(this.ayD, this.ayD, 0.0);
        }
        GL11.glEnable((int)3089);
        ait.g((double)this.ayt.x * this.ayD + this.ayH.x, (double)this.ayt.y * this.ayD + this.ayH.y, (double)this.alQ.x * this.ayD, (double)(this.alQ.y - 4.0f) * this.ayD);
        this.ayw.qo();
        this.ayu.ci();
        GL11.glDisable((int)3089);
        GlStateManager.JW();
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        if (agm.c(this.ayt.x, this.ayt.y, this.alQ.x, 15.0, n2, n3) && this.ayI == null) {
            this.ayy = this.ayt.x - (float)n2;
            this.ayz = this.ayt.y - (float)n3;
            this.dragging = true;
        } else if (agm.c(this.ayt.getX(), this.ayt.getY(), this.alQ.getX(), this.alQ.getY(), n2, n3)) {
            if (this.ayI == null) {
                this.ayu.b(n2, n3, n4);
            }
            this.ayv.f(n2, n3, n4);
        }
        this.ayI = null;
    }

    @Override
    protected void mouseReleased(int n2, int n3, int n4) {
        this.dragging = false;
        this.ayv.oW();
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (aha.isEnabled()) {
            agp agp2 = this.pk();
            if (agp2 != this.ayM) {
                this.ayL.aX();
                this.ayM = agp2;
            }
            if (agp2 != null && this.ayL.a(agp2, c2, n2)) {
                return;
            }
        }
        if ("abcdefghijklmnopqrstuvwxyz1234567890 ".contains(String.valueOf(c2).toLowerCase()) && this.ayv.qp() && !this.v().pl()) {
            this.a(gj.ld);
        }
        super.keyTyped(c2, n2);
        this.ayv.a(c2, n2);
    }

    private agp pk() {
        try {
            Object object;
            if (this.ayv instanceof aci) {
                object = (aci)this.ayv;
                if (!this.pl()) {
                    return ((aci)object).aAC;
                }
            }
            try {
                if ("com.alan.clients.ui.click.standard.screen.impl.ConfigScreen".equals(this.ayv.getClass().getName())) {
                    object = this.ayv.getClass().getDeclaredField("searchBar");
                    ((Field)object).setAccessible(true);
                    Object object2 = ((Field)object).get(this.ayv);
                    if (object2 instanceof agp && !this.pl()) {
                        return (agp)object2;
                    }
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            for (abg abg2 : this.ayB) {
                for (abo abo2 : abg2.pQ()) {
                    if (!(abo2 instanceof aby)) continue;
                    aby aby2 = (aby)abo2;
                    if (aby2.azZ == null || !aby2.azZ.azF) continue;
                    return aby2.azZ;
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return null;
    }

    public void a(gj gj2) {
        if (!gj2.ec().equals(this.ayv)) {
            this.ayx = this.v().ayv;
            this.ayv = gj2.ec();
            this.ayA.aX();
            this.ayv.aT();
            aci aci2 = (aci)gj.ld.ec();
            aci2.aAm = aci2.aG(aci2.aAC.getText());
        }
    }

    public void a(aca aca2) {
        if (!this.ayv.getClass().getSimpleName().equals(aca2.getClass().getSimpleName())) {
            this.ayx = this.v().ayv;
            this.ayv = aca2;
            this.ayA.aX();
            this.ayv.aT();
            aci aci2 = (aci)gj.ld.ec();
            aci2.aAm = aci2.aG(aci2.aAC.getText());
        }
    }

    public boolean pl() {
        for (abg abg2 : this.ayB) {
            for (abo abo2 : abg2.pQ()) {
                if (abo2 instanceof aby && abo2.aqy != null && ((aby)abo2).azZ.azF && !((aby)abo2).azZ.aKg.T(50L)) {
                    return true;
                }
                if (abo2 instanceof abw && ((abw)abo2).azX.ud() && !((abw)abo2).azX.aKg.T(50L)) {
                    return true;
                }
                if (!(abo2 instanceof abq) || !((abq)abo2).azD.ud() || ((abq)abo2).azD.aKg.T(50L)) continue;
                return true;
            }
        }
        return false;
    }

    @Generated
    public akb pm() {
        return this.ayt;
    }

    @Generated
    public akb pn() {
        return this.alQ;
    }

    @Generated
    public abi po() {
        return this.ayu;
    }

    @Generated
    public aca pp() {
        return this.ayv;
    }

    @Generated
    public aca pq() {
        return this.ayw;
    }

    @Generated
    public aca pr() {
        return this.ayx;
    }

    @Generated
    public float ps() {
        return this.ayy;
    }

    @Generated
    public float pt() {
        return this.ayz;
    }

    @Generated
    public boolean pu() {
        return this.dragging;
    }

    @Generated
    public rip.vantage.commons.util.time.a pv() {
        return this.ayA;
    }

    @Generated
    public rip.vantage.commons.util.time.a me() {
        return this.rG;
    }

    @Generated
    public ConcurrentLinkedQueue<abg> pw() {
        return this.ayB;
    }

    @Generated
    public akb px() {
        return this.ayC;
    }

    @Generated
    public double py() {
        return this.ayD;
    }

    @Generated
    public double pz() {
        return this.ayE;
    }

    @Generated
    public double pA() {
        return this.ayF;
    }

    @Generated
    public int pB() {
        return this.ayG;
    }

    @Generated
    public aka pC() {
        return this.ayH;
    }

    @Generated
    public abo pD() {
        return this.ayI;
    }

    @Generated
    public akb pE() {
        return this.ayJ;
    }

    @Generated
    public afj mV() {
        return this.hB;
    }

    @Generated
    public afj pF() {
        return this.ayK;
    }

    @Generated
    public agz pG() {
        return this.ayL;
    }

    @Generated
    public agp pH() {
        return this.ayM;
    }

    @Generated
    public ge pI() {
        return this.ayN;
    }

    @Generated
    public dk<fk> pJ() {
        return this.ayO;
    }
}

