/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.module.impl.render;

import hackclient.rise.ady;
import hackclient.rise.agf;
import hackclient.rise.ahj;
import hackclient.rise.cg;
import hackclient.rise.fa;
import hackclient.rise.fg;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.xj;
import hackclient.rise.xk;
import hackclient.rise.xl;
import hackclient.rise.zf;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Generated;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.ModuleToggleEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render2DEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;
import rise.value.Value;

@ModuleInfo(aliases={"module.render.interface.name"}, description="module.render.interface.description", category=Category.RENDER, autoEnabled=true)
public final class Interface
extends Module {
    private final ModeValue aoG = new xj(this, "Mode", this);
    private final ModeValue aoH = new xk(this, "Modules to Show", this);
    public BooleanValue aoI = new BooleanValue("Suffix", (Module)this, (Boolean)true);
    public BooleanValue aoJ = new BooleanValue("Lowercase", (Module)this, (Boolean)false);
    public BooleanValue aoK = new BooleanValue("Remove Spaces", (Module)this, (Boolean)false);
    public BooleanValue aoL = new BooleanValue("Shaders", (Module)this, (Boolean)false);
    public BooleanValue aoM = new BooleanValue("Toggle Notifications", (Module)this, (Boolean)false);
    /* ANDROID/VANILLA PORT NOTE (blur removal): "Blur Radius" (aoN) and
     * "Blur Compression" (aoO) settings were removed together with the
     * blur engine (hackclient.rise.aji). */
    private final NumberValue aoP = new NumberValue("Bloom Radius", this, (Number)14, (Number)1, (Number)30, (Number)1);
    private final NumberValue aoQ = new NumberValue("Bloom Compression", this, (Number)2.0, (Number)1.0, (Number)10.0, (Number)0.1);
    private final NumberValue aoR = new NumberValue("Background Alpha", this, (Number)110, (Number)0, (Number)255, (Number)1);
    private final NumberValue aoS = new NumberValue("Rounding Radius", this, (Number)5, (Number)0, (Number)20, (Number)0.5);
    private List<zf> aoT = new ArrayList<zf>();
    private List<zf> aoU = new ArrayList<zf>();
    private ModeValue aoV = new xl(this, "Information Type", this);
    private final a aoW = new a();
    private final a aoX = new a();
    public agf aoY = gb.ks.a(20, gd.kF);
    public float aoZ = 12.0f;
    public float apa;
    @EventLink
    public final Listener<fg> onWorldChange = fg2 -> this.lM();
    @EventLink
    public final Listener<fa> apc = fa2 -> this.lM();
    @EventLink
    public final Listener<ModuleToggleEvent> apd = moduleToggleEvent -> {
        if (((Boolean)this.aoM.wD()).booleanValue()) {
            cg.a("Toggled", "Toggled " + moduleToggleEvent.dl().getName() + " " + (moduleToggleEvent.dl().isEnabled() ? "on" : "off"), 900);
        }
    };
    a ape = new a();
    @EventLink
    public final Listener<PreUpdateEvent> apf = preUpdateEvent -> aNC.execute(() -> {
        ady.c(new Color(0, 0, 0, (Boolean)this.aoL.wD() != false ? this.lT() : 150));
        if (this.ape.T(15000L)) {
            this.lO();
            this.ape.aX();
        }
        this.aoX.aX();
        block0: for (zf zf2 : this.aoU) {
            if (zf2.atQ == 0.0f) continue;
            for (Value<?> value : zf2.dl().getValues()) {
                if (value instanceof ModeValue) {
                    ModeValue modeValue = (ModeValue)value;
                    String string = ((Mode)modeValue.wD()).getName();
                    if ("Bloxd".equalsIgnoreCase(string)) {
                        zf2.an("Blocks");
                        continue block0;
                    }
                    zf2.an(string);
                    continue block0;
                }
                zf2.an("");
            }
        }
        this.lN();
    });
    @EventLink
    public final Listener<Render2DEvent> apg = render2DEvent -> {
        for (zf object2 : this.aoT) {
            float f2;
            float f3 = f2 = ((Mode)this.aoG.wD()).getName().equals("Classic") ? 10.0f : 100.0f;
            if (object2.dl().isEnabled()) {
                object2.atQ = Math.min(object2.atQ + (float)this.aoW.aKM() / f2, 10.0f);
                continue;
            }
            object2.atQ = Math.max(object2.atQ - (float)this.aoW.aKM() / f2, 0.0f);
        }
        float f4 = render2DEvent.dx().getScaledWidth();
        Vector2f vector2f = new Vector2f(0.0f, 0.0f);
        for (zf zf2 : this.aoU) {
            if (zf2.atQ == 0.0f) continue;
            zf2.atP = new Vector2d(f4 - zf2.nK() - zf2.nL(), vector2f.getY());
            if (!zf2.dl().isEnabled() && zf2.atQ < 10.0f) {
                zf2.atP = new Vector2d(f4 + zf2.nK() + zf2.nL(), vector2f.getY());
            } else {
                vector2f.setY(vector2f.getY() + this.aoZ);
            }
            float f5 = this.apa;
            float f6 = this.apa;
            zf2.atP.x -= (double)f5;
            zf2.atP.y += (double)f6;
            if (Math.abs(zf2.nH().getX() - zf2.atP.x) > 0.5 || Math.abs(zf2.nH().getY() - zf2.atP.y) > 0.5 || zf2.atQ != 0.0f && zf2.atQ != 10.0f) {
                zf2.aqy.x = ahj.m(zf2.aqy.x, zf2.atP.x, 0.015f * (float)this.aoW.aKM());
                zf2.aqy.y = ahj.m(zf2.aqy.y, zf2.atP.y, 0.015f * (float)this.aoW.aKM());
                continue;
            }
            zf2.aqy = zf2.atP;
        }
        this.aoW.aX();
    };

    public Interface() {
        this.lM();
    }

    public void lM() {
        this.aoT.clear();
        Client.a.g().ef().stream().sorted(Comparator.comparingDouble(module -> -this.aoY.bQ(module.getName()))).forEach(module -> this.aoT.add(new zf((Module)module)));
        this.lO();
    }

    public void lN() {
        this.aoU = this.aoT.stream().filter(zf2 -> zf2.a(this)).sorted(Comparator.comparingDouble(zf2 -> -zf2.nK() - zf2.nL())).collect(Collectors.toCollection(ArrayList::new));
    }

    public void lO() {
        for (zf zf2 : this.aoT) {
            zf2.ao(zf2.dl().getName());
        }
    }

    public int lR() {
        return ((Number)this.aoP.wD()).intValue();
    }

    public float lS() {
        return ((Number)this.aoQ.wD()).floatValue();
    }

    public int lT() {
        return ((Number)this.aoR.wD()).intValue();
    }

    public double lU() {
        return ((Number)this.aoS.wD()).doubleValue();
    }

    @Generated
    public ModeValue hl() {
        return this.aoG;
    }

    @Generated
    public ModeValue lV() {
        return this.aoH;
    }

    @Generated
    public BooleanValue lW() {
        return this.aoI;
    }

    @Generated
    public BooleanValue lX() {
        return this.aoJ;
    }

    @Generated
    public BooleanValue lY() {
        return this.aoK;
    }

    @Generated
    public BooleanValue lZ() {
        return this.aoL;
    }

    @Generated
    public BooleanValue ma() {
        return this.aoM;
    }

    @Generated
    public List<zf> mb() {
        return this.aoT;
    }

    @Generated
    public List<zf> mc() {
        return this.aoU;
    }

    @Generated
    public ModeValue md() {
        return this.aoV;
    }

    @Generated
    public a me() {
        return this.aoW;
    }

    @Generated
    public a mf() {
        return this.aoX;
    }

    @Generated
    public agf mg() {
        return this.aoY;
    }

    @Generated
    public float mh() {
        return this.aoZ;
    }

    @Generated
    public float mi() {
        return this.apa;
    }

    @Generated
    public Listener<fg> getOnWorldChange() {
        return this.onWorldChange;
    }

    @Generated
    public Listener<fa> mj() {
        return this.apc;
    }

    @Generated
    public Listener<ModuleToggleEvent> mk() {
        return this.apd;
    }

    @Generated
    public a ml() {
        return this.ape;
    }

    @Generated
    public Listener<PreUpdateEvent> mm() {
        return this.apf;
    }

    @Generated
    public Listener<Render2DEvent> mn() {
        return this.apg;
    }

    @Generated
    public void a(BooleanValue booleanValue) {
        this.aoI = booleanValue;
    }

    @Generated
    public void b(BooleanValue booleanValue) {
        this.aoJ = booleanValue;
    }

    @Generated
    public void c(BooleanValue booleanValue) {
        this.aoK = booleanValue;
    }

    @Generated
    public void d(BooleanValue booleanValue) {
        this.aoL = booleanValue;
    }

    @Generated
    public void e(BooleanValue booleanValue) {
        this.aoM = booleanValue;
    }

    @Generated
    public void n(List<zf> list) {
        this.aoT = list;
    }

    @Generated
    public void o(List<zf> list) {
        this.aoU = list;
    }

    @Generated
    public void a(ModeValue modeValue) {
        this.aoV = modeValue;
    }

    @Generated
    public void a(agf agf2) {
        this.aoY = agf2;
    }

    @Generated
    public void a(a a2) {
        this.ape = a2;
    }

    @Generated
    public void n(float f2) {
        this.aoZ = f2;
    }

    @Generated
    public void o(float f2) {
        this.apa = f2;
    }

    private static /* synthetic */ void a(zf zf2) {
        zf2.aqy = zf2.atP;
    }
}

