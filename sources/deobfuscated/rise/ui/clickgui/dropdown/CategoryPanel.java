/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.input.Mouse
 */
package rise.ui.clickgui.dropdown;

import hackclient.rise.abz;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agm;
import hackclient.rise.ahg;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import org.lwjgl.input.Mouse;
import rise.module.Category;
import rise.module.Mode;
import rise.ui.clickgui.ModuleComponent;
import rise.ui.clickgui.value.ValueComponent;
import rise.util.InstanceAccess;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;
import rise.value.Value;

public class CategoryPanel
implements InstanceAccess {
    private final Category aye;
    private final List<ModuleComponent> ayf;
    private boolean ayg = false;
    private final afj ayh = new afj(afk.aHh, 300L);
    private final afj ayi = new afj(afk.aGW, 100L);
    private double x;
    private double y;
    private double ayj;
    private double ayk = 0.8;
    private static final double ayl = 22.0;
    private static final double aym = 34.0;
    private static final double ayn = 1.0;
    private static final double ayo = 18.0;
    private final Map<Value<?>, Boolean> ayp = new HashMap();
    private NumberValue ayq = null;
    private double ayr = 0.0;
    private double ays = 0.0;

    public CategoryPanel(Category category, List<ModuleComponent> list) {
        this.aye = category;
        this.ayf = list;
    }

    public void a(double d2, double d3, double d4, int n2, int n3, float f2, double d5) {
        int n4;
        double d6;
        double d7;
        double d8;
        double d9;
        this.ayj = d4;
        this.ayk = d5;
        double d10 = d2;
        double d11 = d3;
        if (this.ayq != null) {
            if (Mouse.isButtonDown((int)0)) {
                d9 = (double)n2 - this.ayr;
                d8 = this.ayq.wN().doubleValue() - this.ayq.wM().doubleValue();
                d7 = d8 / (d4 * 0.8);
                d6 = this.ays + d9 * d7;
                d6 = Math.max(this.ayq.wM().doubleValue(), Math.min(this.ayq.wN().doubleValue(), d6));
                n4 = this.ayq.wO().intValue();
                if (n4 == 0) {
                    d6 = Math.round(d6);
                } else {
                    double d12 = Math.pow(10.0, n4);
                    d6 = (double)Math.round(d6 * d12) / d12;
                }
                this.ayq.n(d6);
            } else {
                this.ayq = null;
            }
        }
        d9 = 0.0;
        if (this.ayg) {
            for (ModuleComponent moduleComponent : this.ayf) {
                d9 += 34.0 * d5;
                d9 += 1.0 * d5;
                if (!moduleComponent.oZ()) continue;
                for (Value<?> value : moduleComponent.dl().getAllValues()) {
                    if (!this.d(value)) continue;
                    d9 += 18.0 * d5;
                    if (!(value instanceof ModeValue) || !this.ayp.getOrDefault(value, false).booleanValue()) continue;
                    ModeValue modeValue = (ModeValue)value;
                    d9 += (double)modeValue.wU().size() * 18.0 * d5;
                }
                d9 += 1.0 * d5;
            }
            d9 += 4.0 * d5;
        }
        this.ayh.Q(this.ayg ? d9 : 0.0);
        d8 = this.ayh.sV();
        d7 = 22.0 + d8;
        d6 = 22.0 * d5;
        n4 = agm.c(d10, d11, d4, d6, n2, n3);
        this.ayi.Q(n4 != 0 ? 30.0 : 0.0);
        Color color = this.rP().rQ();
        Color color2 = new Color(Math.min(255, abz.aAa.ql().getRed() + color.getRed() / 26), Math.min(255, abz.aAa.ql().getGreen() + color.getGreen() / 26), Math.min(255, abz.aAa.ql().getBlue() + color.getBlue() / 26), 245);
        ait.a(d10, d11, d4, d6, 6.0 * d5, ais.d(abz.aAb.ql(), 180), true, true, !this.ayg, !this.ayg);
        if (this.ayi.sV() > 0.0) {
            ait.a(d10, d11, d4, d6, 6.0 * d5, ais.d(Color.WHITE, (int)this.ayi.sV()), true, true, !this.ayg, !this.ayg);
        }
        String string = ahg.cf(this.aye.getName());
        gb.ks.a((int)(16.0 * d5), gd.kH).a(string, (float)(d10 + 8.0 * d5), (float)(d11 + 7.0 * d5), this.rP().rT().getRGB());
        String string2 = this.ayg ? "\u25b2" : "\u25bc";
        gb.ks.a((int)(12.0 * d5), gd.kG).a(string2, (float)(d10 + d4 - 16.0 * d5), (float)(d11 + 7.0 * d5), abz.aAe.qm());
        String string3 = "(" + this.ayf.size() + ")";
        gb.ks.a((int)(12.0 * d5), gd.kG).d(string3, (float)(d10 + d4 - 26.0 * d5), (float)(d11 + 8.0 * d5), abz.aAe.qm());
        if (d8 > 1.0) {
            if (this.ayg) {
                ait.d(d10, d11 + d6 - 4.0 * d5, d4, 4.0 * d5, ais.d(abz.aAb.ql(), 180));
            }
            ait.a(d10, d11 + d6, d4, d8, 6.0 * d5, color2, false, false, true, true);
            double d13 = d11 + d6 + 3.0 * d5;
            for (ModuleComponent moduleComponent : this.ayf) {
                Iterator<Value<?>> iterator;
                double d14 = 34.0;
                if (moduleComponent.oZ()) {
                    for (Value<?> value : moduleComponent.dl().getAllValues()) {
                        if (!this.d(value)) continue;
                        d14 += 18.0;
                        if (!(value instanceof ModeValue) || !this.ayp.getOrDefault(value, false).booleanValue()) continue;
                        ModeValue modeValue = (ModeValue)value;
                        d14 += (double)modeValue.wU().size() * 18.0;
                    }
                    d14 += 2.0;
                }
                if (d13 + d14 < d11 || d13 > d11 + d7) {
                    d13 += d14;
                    d13 += 1.0;
                    continue;
                }
                double d15 = 34.0 * d5;
                boolean bl2 = agm.c(d10 + 6.0 * d5, d13, d4 - 12.0 * d5, d15 - 2.0 * d5, n2, n3);
                if (bl2) {
                    ait.c(d10 + 6.0 * d5, d13, d4 - 12.0 * d5, d15 - 2.0 * d5, 4.0 * d5, ais.d(Color.WHITE, 15));
                }
                if (moduleComponent.dl().isEnabled()) {
                    ait.c(d10 + 6.0 * d5, d13, 2.0 * d5, d15 - 2.0 * d5, 1.0 * d5, this.rP().rT());
                }
                double d16 = d10 + 12.0 * d5;
                double d17 = d13 + 4.0 * d5;
                gb.ks.a((int)(13.0 * d5), gd.kG).a(moduleComponent.dl().getName(), (float)d16, (float)d17, moduleComponent.dl().isEnabled() ? this.rP().rT().getRGB() : abz.aAc.qm());
                if (!moduleComponent.oZ()) {
                    iterator = "(" + ahg.cf(moduleComponent.dl().getModuleInfo().category().getName()) + ")";
                    gb.ks.a((int)(10.0 * d5), gd.kG).a((String)((Object)iterator), (float)(d16 + (double)gb.ks.a((int)(13.0 * d5), gd.kG).bQ(moduleComponent.dl().getName()) + 4.0 * d5), (float)(d17 + 1.0 * d5), abz.aAe.qm());
                }
                if (!moduleComponent.oZ()) {
                    iterator = ahg.cf(moduleComponent.dl().getModuleInfo().description());
                    int n5 = (int)(9.0 * d5);
                    float f3 = (float)(d4 - 24.0 * d5);
                    String[] stringArray = ((String)((Object)iterator)).split(" ");
                    StringBuilder stringBuilder = new StringBuilder();
                    StringBuilder stringBuilder2 = new StringBuilder();
                    float f4 = 0.0f;
                    boolean bl3 = false;
                    for (String string4 : stringArray) {
                        float f5 = gb.ks.a(n5, gd.kG).bQ(string4 + " ");
                        if (!bl3 && f4 + f5 > f3 && stringBuilder.length() > 0) {
                            bl3 = true;
                            f4 = 0.0f;
                        }
                        if (!bl3) {
                            stringBuilder.append(string4).append(" ");
                            f4 += f5;
                            continue;
                        }
                        if (!(f4 + f5 <= f3)) break;
                        stringBuilder2.append(string4).append(" ");
                        f4 += f5;
                    }
                    gb.ks.a(n5, gd.kG).a(stringBuilder.toString().trim(), (float)d16, (float)(d17 + 11.0 * d5), abz.aAe.qm());
                    if (stringBuilder2.length() > 0) {
                        gb.ks.a(n5, gd.kG).a(stringBuilder2.toString().trim(), (float)d16, (float)(d17 + 19.0 * d5), abz.aAe.qm());
                    }
                }
                d13 += d15;
                d13 += 1.0 * d5;
                if (!moduleComponent.oZ()) continue;
                for (Value<?> value : moduleComponent.dl().getAllValues()) {
                    if (!this.d(value)) continue;
                    double d18 = 18.0 * d5;
                    boolean bl4 = agm.c(d10 + 10.0 * d5, d13, d4 - 20.0 * d5, d18, n2, n3);
                    if (bl4) {
                        ait.c(d10 + 10.0 * d5, d13, d4 - 20.0 * d5, d18 - 2.0 * d5, 3.0 * d5, ais.d(Color.WHITE, 10));
                    }
                    double d19 = d10 + 14.0 * d5;
                    double d20 = d13 + 4.0 * d5;
                    if (value instanceof BooleanValue) {
                        BooleanValue booleanValue = (BooleanValue)value;
                        String string5 = ahg.cf(value.getName());
                        gb.ks.a((int)(12.0 * d5), gd.kG).a(string5, (float)d19, (float)d20, abz.aAc.qm());
                        double d21 = d10 + d4 - 28.0 * d5;
                        var56_68 = d13 + 4.0 * d5;
                        ait.c(d21, var56_68, 12.0 * d5, 12.0 * d5, 3.0 * d5, ais.d(abz.aAb.ql(), 150));
                        if (((Boolean)booleanValue.wD()).booleanValue()) {
                            ait.c(d21 + 2.0 * d5, var56_68 + 2.0 * d5, 8.0 * d5, 8.0 * d5, 2.0 * d5, this.rP().rT());
                        }
                    } else if (value instanceof ModeValue) {
                        String string4;
                        ModeValue modeValue = (ModeValue)value;
                        String string6 = ahg.cf(value.getName());
                        gb.ks.a((int)(12.0 * d5), gd.kG).a(string6, (float)d19, (float)d20, abz.aAc.qm());
                        string4 = ((Mode)modeValue.wD()).getName();
                        gb.ks.a((int)(11.0 * d5), gd.kG).d(string4, (float)(d10 + d4 - 18.0 * d5), (float)d20, this.rP().rT().getRGB());
                        String string7 = this.ayp.getOrDefault(value, false) != false ? "\u25b2" : "\u25bc";
                        gb.ks.a((int)(10.0 * d5), gd.kG).a(string7, (float)(d10 + d4 - 16.0 * d5), (float)d20, abz.aAe.qm());
                    } else if (value instanceof NumberValue) {
                        NumberValue numberValue = (NumberValue)value;
                        String string8 = ahg.cf(value.getName());
                        gb.ks.a((int)(12.0 * d5), gd.kG).a(string8, (float)d19, (float)d20, abz.aAc.qm());
                        double d22 = d10 + 12.0 * d5;
                        var56_68 = d13 + 18.0 * d5 - 6.0 * d5;
                        double d23 = d4 - 24.0 * d5;
                        double d24 = 2.0 * d5;
                        ait.c(d22, var56_68, d23, d24, 1.5 * d5, ais.d(abz.aAb.ql(), 100));
                        double d25 = (((Number)numberValue.wD()).doubleValue() - numberValue.wM().doubleValue()) / (numberValue.wN().doubleValue() - numberValue.wM().doubleValue());
                        if (d25 > 0.0) {
                            ait.c(d22, var56_68, d23 * d25, d24, 1.5 * d5, this.rP().rT());
                        }
                        int n6 = numberValue.wO().intValue();
                        String string9 = String.format("%." + n6 + "f", ((Number)numberValue.wD()).doubleValue());
                        gb.ks.a((int)(11.0 * d5), gd.kG).d(string9, (float)(d10 + d4 - 14.0 * d5), (float)(d20 - 2.0 * d5), abz.aAe.qm());
                    }
                    d13 += d18;
                    if (!(value instanceof ModeValue) || !this.ayp.getOrDefault(value, false).booleanValue()) continue;
                    ModeValue modeValue = (ModeValue)value;
                    for (Mode<?> mode : modeValue.wU()) {
                        boolean bl5;
                        boolean bl6 = agm.c(d10 + 16.0 * d5, d13, d4 - 32.0 * d5, d18, n2, n3);
                        if (bl6) {
                            ait.c(d10 + 16.0 * d5, d13, d4 - 32.0 * d5, d18 - 2.0 * d5, 3.0 * d5, ais.d(Color.WHITE, 12));
                        }
                        boolean bl7 = bl5 = modeValue.wD() == mode;
                        if (bl5) {
                            ait.c(d10 + 16.0 * d5, d13, 2.0 * d5, d18 - 2.0 * d5, 1.0 * d5, this.rP().rT());
                        }
                        gb.ks.a((int)(11.0 * d5), gd.kG).a(mode.getName(), (float)(d10 + 22.0 * d5), (float)(d13 + 6.0 * d5), bl5 ? this.rP().rT().getRGB() : abz.aAc.qm());
                        d13 += d18;
                    }
                }
                d13 += 2.0 * d5;
            }
        }
    }

    public void i(double d2, double d3, double d4) {
        String string = ahg.cf(this.aye.getName());
        gb.ks.a((int)(16.0 * d4), gd.kH).a(string, (float)(d2 + 8.0 * d4), (float)(d3 + 7.0 * d4), ais.d(this.rP().rQ(), 200).getRGB());
        if (this.ayg && this.ayh.sV() > 1.0) {
            double d5 = d3 + 22.0 * d4 + 3.0 * d4;
            for (ModuleComponent moduleComponent : this.ayf) {
                if (moduleComponent.dl().isEnabled()) {
                    ait.c(d2 + 6.0 * d4, d5, 2.0 * d4, 34.0 * d4 - 2.0 * d4, 1.0 * d4, ais.d(this.rP().rQ(), 150));
                    gb.ks.a((int)(13.0 * d4), gd.kG).a(moduleComponent.dl().getName(), (float)(d2 + 12.0 * d4), (float)(d5 + 4.0 * d4), ais.d(this.rP().rQ(), 120).getRGB());
                    if (moduleComponent.oZ()) {
                        moduleComponent.ci();
                    }
                }
                d5 += 34.0 * d4 + 1.0 * d4;
                if (!moduleComponent.oZ()) continue;
                for (Value<?> value : moduleComponent.dl().getAllValues()) {
                    if (!this.d(value)) continue;
                    d5 += 18.0 * d4;
                    if (!(value instanceof ModeValue) || !this.ayp.getOrDefault(value, false).booleanValue()) continue;
                    ModeValue modeValue = (ModeValue)value;
                    d5 += (double)modeValue.wU().size() * 18.0 * d4;
                }
                d5 += 2.0 * d4;
            }
        }
    }

    public void a(double d2, double d3, int n2, int n3, int n4) {
        double d4 = this.ayk;
        double d5 = 22.0 * d4;
        double d6 = 34.0 * d4;
        double d7 = 18.0 * d4;
        if (agm.c(d2, d3, this.ayj, d5, n2, n3)) {
            if (n4 == 1) {
                this.ayg = !this.ayg;
            }
            return;
        }
        if (this.ayg && this.ayh.sV() > 1.0) {
            double d8 = d3 + d5 + 3.0 * d4;
            for (ModuleComponent moduleComponent : this.ayf) {
                if (agm.c(d2 + 6.0 * d4, d8, this.ayj - 12.0 * d4, d6, n2, n3)) {
                    if (n4 == 0) {
                        moduleComponent.dl().toggle();
                    } else if (n4 == 1) {
                        moduleComponent.ayg = !moduleComponent.ayg;
                    }
                    return;
                }
                d8 += d6 + 1.0 * d4;
                if (!moduleComponent.oZ()) continue;
                for (Value<?> value : moduleComponent.dl().getAllValues()) {
                    if (!this.d(value)) continue;
                    if (agm.c(d2 + 10.0 * d4, d8, this.ayj - 20.0 * d4, d7, n2, n3)) {
                        this.a(value, n4);
                        return;
                    }
                    d8 += d7;
                    if (!(value instanceof ModeValue) || !this.ayp.getOrDefault(value, false).booleanValue()) continue;
                    ModeValue modeValue = (ModeValue)value;
                    for (Mode<?> mode : modeValue.wU()) {
                        if (agm.c(d2 + 16.0 * d4, d8, this.ayj - 32.0 * d4, d7, n2, n3)) {
                            if (n4 == 0) {
                                modeValue.n(mode);
                            }
                            return;
                        }
                        d8 += d7;
                    }
                }
                d8 += 2.0 * d4;
            }
        }
    }

    private void a(Value<?> value, int n2) {
        if (value instanceof BooleanValue && n2 == 0) {
            BooleanValue booleanValue;
            booleanValue.c((Boolean)(booleanValue = (BooleanValue)value).wD() == false);
        } else if (value instanceof ModeValue && n2 == 0) {
            this.ayp.put(value, this.ayp.getOrDefault(value, false) == false);
        } else if (value instanceof NumberValue && n2 == 0) {
            NumberValue numberValue;
            this.ayq = numberValue = (NumberValue)value;
            this.ayr = Mouse.getEventX() * CategoryPanel.aER.bgR.width / CategoryPanel.aER.bgz;
            this.ays = ((Number)numberValue.wD()).doubleValue();
        }
    }

    private boolean d(Value<?> value) {
        if (value.wB() != null && value.wB().getAsBoolean()) {
            return false;
        }
        return value.wC() == null || !value.wC().getAsBoolean();
    }

    public void oW() {
        this.ayq = null;
        if (this.ayg) {
            for (ModuleComponent moduleComponent : this.ayf) {
                moduleComponent.pP();
            }
        }
    }

    public void a(char c2, int n2) {
        if (this.ayg) {
            for (ModuleComponent moduleComponent : this.ayf) {
                if (!moduleComponent.oZ()) continue;
                for (ValueComponent valueComponent : moduleComponent.pQ()) {
                    valueComponent.b(c2, n2);
                }
            }
        }
    }

    public double da() {
        return 22.0 + this.ayh.sV();
    }

    public void i(double d2, double d3) {
        this.x = d2;
        this.y = d3;
    }

    @Generated
    public Category oX() {
        return this.aye;
    }

    @Generated
    public List<ModuleComponent> oY() {
        return this.ayf;
    }

    @Generated
    public boolean oZ() {
        return this.ayg;
    }

    @Generated
    public afj pa() {
        return this.ayh;
    }

    @Generated
    public afj pb() {
        return this.ayi;
    }

    @Generated
    public double getX() {
        return this.x;
    }

    @Generated
    public double getY() {
        return this.y;
    }

    @Generated
    public double pc() {
        return this.ayj;
    }

    @Generated
    public double pd() {
        return this.ayk;
    }

    @Generated
    public Map<Value<?>, Boolean> pe() {
        return this.ayp;
    }

    @Generated
    public NumberValue pf() {
        return this.ayq;
    }

    @Generated
    public double pg() {
        return this.ayr;
    }

    @Generated
    public double ph() {
        return this.ays;
    }
}

