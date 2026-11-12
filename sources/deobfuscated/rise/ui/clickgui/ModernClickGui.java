/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package rise.ui.clickgui;

import hackclient.rise.abi;
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
import hackclient.rise.fk;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.ge;
import hackclient.rise.gg;
import java.awt.Color;
import java.lang.reflect.Field;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.cz;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.module.Category;
import rise.module.Module;
import rise.module.impl.render.ClickGUI;
import rise.ui.clickgui.ModuleComponent;
import rise.ui.clickgui.value.ValueComponent;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;

public class ModernClickGui
extends GuiScreen
implements ahd {
    public Vector2f ayt = new Vector2f(-1.0f, -1.0f);
    public Vector2f alQ = new Vector2f(416.0f, 338.0f);
    public abi ayu = new abi();
    public aca ayv;
    public aca ayw = this.ayv = Category.ld.ec();
    public aca ayx = this.ayv;
    public float ayy;
    public float ayz;
    public boolean dragging;
    public a ayA = new a();
    public a rG = new a();
    public ConcurrentLinkedQueue<ModuleComponent> ayB = new ConcurrentLinkedQueue();
    public Vector2f ayC;
    public double ayD;
    public double ayE;
    public double ayF;
    public int ayG = 7;
    Vector2d ayH;
    public ValueComponent ayI;
    public Vector2f ayJ = new Vector2f(283.0f, 38.0f);
    public afj hB = new afj(afk.aHm, 300L);
    public afj ayK = new afj(afk.aHm, 300L);
    private final agz ayL = new agz();
    private agp ayM;
    ge ayN = new ge(new aje());
    @EventLink(cH=0)
    public final Listener<fk> ayO = fk2 -> {
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
        if (Client.a.s().od()) {
            return;
        }
        System.out.println("RMC");
        ArrayList<Module> arrayList = Client.a.g().ef();
        arrayList.sort((module, module2) -> Collator.getInstance().compare(module.getName(), module2.getName()));
        arrayList.forEach(module -> this.ayB.add(new ModuleComponent((Module)module)));
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
            cz cz2 = ModernClickGui.aER.jY;
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
            this.ayB.forEach(moduleComponent -> moduleComponent.pQ().forEach(valueComponent -> {
                if (valueComponent instanceof abw) {
                    ((abw)valueComponent).qk();
                } else if (valueComponent instanceof abq) {
                    ((abq)valueComponent).qk();
                }
            }));
        });
        if (Client.a.s().od()) {
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
        this.alQ = new Vector2f(400.0f, 300.0f);
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
        Minecraft minecraft = Minecraft.getMinecraft();
        int n3 = (int)this.ayC.x;
        int n4 = (int)this.ayC.y;
        float f2 = minecraft.Bm().bWY;
        if (this.dragging) {
            if (this.ayv instanceof acj) {
                ((acj)this.ayv).qM();
            }
            this.ayt.x = (float)n3 + this.ayy;
            this.ayt.y = (float)n4 + this.ayz;
        }
        this.ayK.a(minecraft.bgR == Client.a.v() ? afk.aHn : afk.aGW);
        this.ayK.h(minecraft.bgR == Client.a.v() ? 300L : 100L);
        this.ayK.Q(minecraft.bgR == Client.a.v() ? 1.0 : 0.0);
        this.ayE = this.ayK.sV();
        this.hB.a(minecraft.bgR == Client.a.v() ? afk.aHn : afk.aGW);
        this.hB.Q(minecraft.bgR == Client.a.v() ? 1.0 : 0.0);
        this.ayD = this.hB.sV();
        if (minecraft.bgR == Client.a.v() && this.ayD == 0.0) {
            this.ayD = 0.01;
        }
        if (this.ayD == 0.0) {
            Client.a.g().c(ClickGUI.class).setEnabled(false);
            return;
        }
        this.ayH = new Vector2d((double)(this.ayt.x + this.alQ.x / 2.0f) * (1.0 - this.ayD), (double)(this.ayt.y + this.alQ.y / 2.0f) * (1.0 - this.ayD));
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
            double d2 = (double)this.ayt.x * this.ayD + this.ayH.x + 1.0;
            double d3 = (double)this.ayt.y * this.ayD + this.ayH.y + 1.0;
            double d4 = (double)this.alQ.x * this.ayD - 2.0;
            double d5 = (double)this.alQ.y * this.ayD - 2.0;
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
                        double d6 = 6.0;
                        double d7 = (double)gb.ks.a(16, gd.kG).bQ(string3) + d6 * 2.0;
                        double d8 = (double)gb.ks.a(16, gd.kG).tF() + d6 * 2.0 - 5.0;
                        double d9 = f3 - 2.0f;
                        double d10 = f4 + gb.ks.a(16, gd.kG).tF() + 6.0f;
                        double d11 = 8.0;
                        Color color = ais.d(Color.WHITE, 255);
                        this.b(gg.kU).c(() -> ait.c(d9, d10, d7, d8, d11, color));
                        this.b(gg.kT, 2).c(() -> {
                            GL11.glDisable((int)3089);
                            ait.c(d9, d10, d7, d8, d11 + 2.0, this.rP().rU());
                            GL11.glEnable((int)3089);
                            ait.g(d2, d3, d4, d5);
                        });
                        boolean bl2 = GL11.glIsEnabled((int)3089);
                        if (bl2) {
                            GL11.glDisable((int)3089);
                        }
                        ait.c(d9, d10, d7, d8, d11, ais.d(abz.aAa.ql(), (int)Math.min(220.0, this.ayE * 255.0)));
                        gb.ks.a(16, gd.kG).a(string3, d9 + d6, d10 + d6, ais.d(Color.WHITE, 240).getRGB());
                        if (bl2) {
                            GL11.glEnable((int)3089);
                            ait.g(d2, d3, d4, d5);
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
            double d12 = i3 * 50;
            ait.c((double)this.ayt.x + this.ayu.ayX - d12 / 2.0, (double)(this.ayt.y + this.alQ.y / 2.0f) - d12 / 2.0, d12, ais.d(this.rP().rQ(), 1));
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
        this.ayC = new Vector2f(n2, n3);
    }

    public void ci() {
        this.ayH = new Vector2d((double)(this.ayt.x + this.alQ.x / 2.0f) * (1.0 - this.ayD), (double)(this.ayt.y + this.alQ.y / 2.0f) * (1.0 - this.ayD));
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
            this.a(Category.ld);
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
            for (ModuleComponent moduleComponent : this.ayB) {
                for (ValueComponent valueComponent : moduleComponent.pQ()) {
                    if (!(valueComponent instanceof aby)) continue;
                    aby aby2 = (aby)valueComponent;
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

    public void a(Category category) {
        if (!category.ec().equals(this.ayv)) {
            this.ayx = this.v().ayv;
            this.ayv = category.ec();
            this.ayA.aX();
            this.ayv.aT();
            aci aci2 = (aci)Category.ld.ec();
            aci2.aAm = aci2.aG(aci2.aAC.getText());
        }
    }

    public void a(aca aca2) {
        if (!this.ayv.getClass().getSimpleName().equals(aca2.getClass().getSimpleName())) {
            this.ayx = this.v().ayv;
            this.ayv = aca2;
            this.ayA.aX();
            this.ayv.aT();
            aci aci2 = (aci)Category.ld.ec();
            aci2.aAm = aci2.aG(aci2.aAC.getText());
        }
    }

    public boolean pl() {
        for (ModuleComponent moduleComponent : this.ayB) {
            for (ValueComponent valueComponent : moduleComponent.pQ()) {
                if (valueComponent instanceof aby && valueComponent.aqy != null && ((aby)valueComponent).azZ.azF && !((aby)valueComponent).azZ.aKg.T(50L)) {
                    return true;
                }
                if (valueComponent instanceof abw && ((abw)valueComponent).azX.ud() && !((abw)valueComponent).azX.aKg.T(50L)) {
                    return true;
                }
                if (!(valueComponent instanceof abq) || !((abq)valueComponent).azD.ud() || ((abq)valueComponent).azD.aKg.T(50L)) continue;
                return true;
            }
        }
        return false;
    }

    @Generated
    public Vector2f pm() {
        return this.ayt;
    }

    @Generated
    public Vector2f pn() {
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
    public a pv() {
        return this.ayA;
    }

    @Generated
    public a me() {
        return this.rG;
    }

    @Generated
    public ConcurrentLinkedQueue<ModuleComponent> pw() {
        return this.ayB;
    }

    @Generated
    public Vector2f px() {
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
    public Vector2d pC() {
        return this.ayH;
    }

    @Generated
    public ValueComponent pD() {
        return this.ayI;
    }

    @Generated
    public Vector2f pE() {
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
    public Listener<fk> pJ() {
        return this.ayO;
    }
}

