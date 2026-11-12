/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.input.Mouse
 */
package hackclient.rise;

import hackclient.rise.abg;
import hackclient.rise.abo;
import hackclient.rise.abz;
import hackclient.rise.aea;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agm;
import hackclient.rise.ahg;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gj;
import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import org.lwjgl.input.Mouse;

public class abe
implements aea {
    private final gj aye;
    private final List<abg> ayf;
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
    private final Map<akh<?>, Boolean> ayp = new HashMap();
    private akq ayq = null;
    private double ayr = 0.0;
    private double ays = 0.0;

    public abe(gj gj2, List<abg> list) {
        this.aye = gj2;
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
            for (abg abg2 : this.ayf) {
                d9 += 34.0 * d5;
                d9 += 1.0 * d5;
                if (!abg2.oZ()) continue;
                for (akh<?> akh2 : abg2.dl().getAllValues()) {
                    if (!this.d(akh2)) continue;
                    d9 += 18.0 * d5;
                    if (!(akh2 instanceof akp) || !this.ayp.getOrDefault(akh2, false).booleanValue()) continue;
                    akp akp2 = (akp)akh2;
                    d9 += (double)akp2.wU().size() * 18.0 * d5;
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
            for (abg abg3 : this.ayf) {
                Iterator<akh<?>> iterator;
                double d14 = 34.0;
                if (abg3.oZ()) {
                    for (akh<?> akh3 : abg3.dl().getAllValues()) {
                        if (!this.d(akh3)) continue;
                        d14 += 18.0;
                        if (!(akh3 instanceof akp) || !this.ayp.getOrDefault(akh3, false).booleanValue()) continue;
                        akp akp3 = (akp)akh3;
                        d14 += (double)akp3.wU().size() * 18.0;
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
                if (abg3.dl().isEnabled()) {
                    ait.c(d10 + 6.0 * d5, d13, 2.0 * d5, d15 - 2.0 * d5, 1.0 * d5, this.rP().rT());
                }
                double d16 = d10 + 12.0 * d5;
                double d17 = d13 + 4.0 * d5;
                gb.ks.a((int)(13.0 * d5), gd.kG).a(abg3.dl().getName(), (float)d16, (float)d17, abg3.dl().isEnabled() ? this.rP().rT().getRGB() : abz.aAc.qm());
                if (!abg3.oZ()) {
                    iterator = "(" + ahg.cf(abg3.dl().getModuleInfo().category().getName()) + ")";
                    gb.ks.a((int)(10.0 * d5), gd.kG).a((String)((Object)iterator), (float)(d16 + (double)gb.ks.a((int)(13.0 * d5), gd.kG).bQ(abg3.dl().getName()) + 4.0 * d5), (float)(d17 + 1.0 * d5), abz.aAe.qm());
                }
                if (!abg3.oZ()) {
                    iterator = ahg.cf(abg3.dl().getModuleInfo().description());
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
                if (!abg3.oZ()) continue;
                for (akh<?> akh4 : abg3.dl().getAllValues()) {
                    if (!this.d(akh4)) continue;
                    double d18 = 18.0 * d5;
                    boolean bl4 = agm.c(d10 + 10.0 * d5, d13, d4 - 20.0 * d5, d18, n2, n3);
                    if (bl4) {
                        ait.c(d10 + 10.0 * d5, d13, d4 - 20.0 * d5, d18 - 2.0 * d5, 3.0 * d5, ais.d(Color.WHITE, 10));
                    }
                    double d19 = d10 + 14.0 * d5;
                    double d20 = d13 + 4.0 * d5;
                    if (akh4 instanceof aki) {
                        aki aki2 = (aki)akh4;
                        String string5 = ahg.cf(akh4.getName());
                        gb.ks.a((int)(12.0 * d5), gd.kG).a(string5, (float)d19, (float)d20, abz.aAc.qm());
                        double d21 = d10 + d4 - 28.0 * d5;
                        var56_68 = d13 + 4.0 * d5;
                        ait.c(d21, var56_68, 12.0 * d5, 12.0 * d5, 3.0 * d5, ais.d(abz.aAb.ql(), 150));
                        if (((Boolean)aki2.wD()).booleanValue()) {
                            ait.c(d21 + 2.0 * d5, var56_68 + 2.0 * d5, 8.0 * d5, 8.0 * d5, 2.0 * d5, this.rP().rT());
                        }
                    } else if (akh4 instanceof akp) {
                        String string4;
                        akp akp4 = (akp)akh4;
                        String string6 = ahg.cf(akh4.getName());
                        gb.ks.a((int)(12.0 * d5), gd.kG).a(string6, (float)d19, (float)d20, abz.aAc.qm());
                        string4 = ((akg)akp4.wD()).getName();
                        gb.ks.a((int)(11.0 * d5), gd.kG).d(string4, (float)(d10 + d4 - 18.0 * d5), (float)d20, this.rP().rT().getRGB());
                        String string7 = this.ayp.getOrDefault(akh4, false) != false ? "\u25b2" : "\u25bc";
                        gb.ks.a((int)(10.0 * d5), gd.kG).a(string7, (float)(d10 + d4 - 16.0 * d5), (float)d20, abz.aAe.qm());
                    } else if (akh4 instanceof akq) {
                        akq akq2 = (akq)akh4;
                        String string8 = ahg.cf(akh4.getName());
                        gb.ks.a((int)(12.0 * d5), gd.kG).a(string8, (float)d19, (float)d20, abz.aAc.qm());
                        double d22 = d10 + 12.0 * d5;
                        var56_68 = d13 + 18.0 * d5 - 6.0 * d5;
                        double d23 = d4 - 24.0 * d5;
                        double d24 = 2.0 * d5;
                        ait.c(d22, var56_68, d23, d24, 1.5 * d5, ais.d(abz.aAb.ql(), 100));
                        double d25 = (((Number)akq2.wD()).doubleValue() - akq2.wM().doubleValue()) / (akq2.wN().doubleValue() - akq2.wM().doubleValue());
                        if (d25 > 0.0) {
                            ait.c(d22, var56_68, d23 * d25, d24, 1.5 * d5, this.rP().rT());
                        }
                        int n6 = akq2.wO().intValue();
                        String string9 = String.format("%." + n6 + "f", ((Number)akq2.wD()).doubleValue());
                        gb.ks.a((int)(11.0 * d5), gd.kG).d(string9, (float)(d10 + d4 - 14.0 * d5), (float)(d20 - 2.0 * d5), abz.aAe.qm());
                    }
                    d13 += d18;
                    if (!(akh4 instanceof akp) || !this.ayp.getOrDefault(akh4, false).booleanValue()) continue;
                    akp akp5 = (akp)akh4;
                    for (akg<?> akg2 : akp5.wU()) {
                        boolean bl5;
                        boolean bl6 = agm.c(d10 + 16.0 * d5, d13, d4 - 32.0 * d5, d18, n2, n3);
                        if (bl6) {
                            ait.c(d10 + 16.0 * d5, d13, d4 - 32.0 * d5, d18 - 2.0 * d5, 3.0 * d5, ais.d(Color.WHITE, 12));
                        }
                        boolean bl7 = bl5 = akp5.wD() == akg2;
                        if (bl5) {
                            ait.c(d10 + 16.0 * d5, d13, 2.0 * d5, d18 - 2.0 * d5, 1.0 * d5, this.rP().rT());
                        }
                        gb.ks.a((int)(11.0 * d5), gd.kG).a(akg2.getName(), (float)(d10 + 22.0 * d5), (float)(d13 + 6.0 * d5), bl5 ? this.rP().rT().getRGB() : abz.aAc.qm());
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
            for (abg abg2 : this.ayf) {
                if (abg2.dl().isEnabled()) {
                    ait.c(d2 + 6.0 * d4, d5, 2.0 * d4, 34.0 * d4 - 2.0 * d4, 1.0 * d4, ais.d(this.rP().rQ(), 150));
                    gb.ks.a((int)(13.0 * d4), gd.kG).a(abg2.dl().getName(), (float)(d2 + 12.0 * d4), (float)(d5 + 4.0 * d4), ais.d(this.rP().rQ(), 120).getRGB());
                    if (abg2.oZ()) {
                        abg2.ci();
                    }
                }
                d5 += 34.0 * d4 + 1.0 * d4;
                if (!abg2.oZ()) continue;
                for (akh<?> akh2 : abg2.dl().getAllValues()) {
                    if (!this.d(akh2)) continue;
                    d5 += 18.0 * d4;
                    if (!(akh2 instanceof akp) || !this.ayp.getOrDefault(akh2, false).booleanValue()) continue;
                    akp akp2 = (akp)akh2;
                    d5 += (double)akp2.wU().size() * 18.0 * d4;
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
            for (abg abg2 : this.ayf) {
                if (agm.c(d2 + 6.0 * d4, d8, this.ayj - 12.0 * d4, d6, n2, n3)) {
                    if (n4 == 0) {
                        abg2.dl().toggle();
                    } else if (n4 == 1) {
                        abg2.ayg = !abg2.ayg;
                    }
                    return;
                }
                d8 += d6 + 1.0 * d4;
                if (!abg2.oZ()) continue;
                for (akh<?> akh2 : abg2.dl().getAllValues()) {
                    if (!this.d(akh2)) continue;
                    if (agm.c(d2 + 10.0 * d4, d8, this.ayj - 20.0 * d4, d7, n2, n3)) {
                        this.a(akh2, n4);
                        return;
                    }
                    d8 += d7;
                    if (!(akh2 instanceof akp) || !this.ayp.getOrDefault(akh2, false).booleanValue()) continue;
                    akp akp2 = (akp)akh2;
                    for (akg<?> akg2 : akp2.wU()) {
                        if (agm.c(d2 + 16.0 * d4, d8, this.ayj - 32.0 * d4, d7, n2, n3)) {
                            if (n4 == 0) {
                                akp2.n(akg2);
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

    private void a(akh<?> akh2, int n2) {
        if (akh2 instanceof aki && n2 == 0) {
            aki aki2;
            aki2.c((Boolean)(aki2 = (aki)akh2).wD() == false);
        } else if (akh2 instanceof akp && n2 == 0) {
            this.ayp.put(akh2, this.ayp.getOrDefault(akh2, false) == false);
        } else if (akh2 instanceof akq && n2 == 0) {
            akq akq2;
            this.ayq = akq2 = (akq)akh2;
            this.ayr = Mouse.getEventX() * abe.aER.bgR.width / abe.aER.bgz;
            this.ays = ((Number)akq2.wD()).doubleValue();
        }
    }

    private boolean d(akh<?> akh2) {
        if (akh2.wB() != null && akh2.wB().getAsBoolean()) {
            return false;
        }
        return akh2.wC() == null || !akh2.wC().getAsBoolean();
    }

    public void oW() {
        this.ayq = null;
        if (this.ayg) {
            for (abg abg2 : this.ayf) {
                abg2.pP();
            }
        }
    }

    public void a(char c2, int n2) {
        if (this.ayg) {
            for (abg abg2 : this.ayf) {
                if (!abg2.oZ()) continue;
                for (abo abo2 : abg2.pQ()) {
                    abo2.b(c2, n2);
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
    public gj oX() {
        return this.aye;
    }

    @Generated
    public List<abg> oY() {
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
    public Map<akh<?>, Boolean> pe() {
        return this.ayp;
    }

    @Generated
    public akq pf() {
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

