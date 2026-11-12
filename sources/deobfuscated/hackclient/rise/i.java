/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aec;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.d;
import hackclient.rise.e;
import hackclient.rise.f;
import hackclient.rise.m;
import hackclient.rise.o;
import java.util.ArrayList;
import net.minecraft.block.Block;
import net.minecraft.client.entity.b;
import net.minecraft.init.Blocks;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.v;
import net.minecraft.network.play.server.z;
import net.minecraft.util.da;
import rip.vantage.commons.util.time.a;

@e(R="Flight", S="Prediction", description="Detects flight")
public final class i
extends d {
    private aec<da> V = new aec(144);
    private ArrayList<Double> W = new ArrayList();
    private double X = 1.0E-5;
    private int Y = 60;
    private int Z = 10;
    private int aa = 5;
    private int ab;
    private a ac = new a();
    private int ad;
    private int ae;
    private boolean af;
    private boolean ag;

    public i(m m2) {
        super(m2);
        for (int i2 = 0; i2 < this.aa; ++i2) {
            double d2 = 0.42f;
            if (i2 != 0) {
                d2 += (double)((float)(i2 + 1) * 0.1f);
            }
            this.W.add(d2);
        }
        this.W.add(0.0);
    }

    @Override
    public void a(aj<?> aj2) {
        if (o.b(aj2) && ((v)aj2).entityId == this.R.Y().getEntityId() || aj2 instanceof z && ((z)aj2).entityId == this.R.Y().getEntityId()) {
            int n2;
            double d2;
            b b2 = this.R.Y();
            if (!this.af && this.R.ae() <= 20) {
                this.af = true;
                this.ae = 0;
                this.ag = false;
                this.M();
            }
            if (b2.aRg <= 100) {
                this.M();
            }
            ++this.ae;
            if (b2.isInvisible()) {
                return;
            }
            if (this.R.aD() || this.R.aC() || this.R.isOnGround() || this.R.aA()) {
                this.V.removeIf(da2 -> Math.abs(this.R.getX() - da2.dAG) + Math.abs(this.R.getZ() - da2.dAI) > 10.0);
            }
            for (d2 = 0.0; d2 >= -0.5; d2 -= 0.5) {
                for (int i2 = -3; i2 <= 3; ++i2) {
                    for (int i3 = -2; i3 <= 2; ++i3) {
                        for (n2 = -3; n2 <= 3; ++n2) {
                            Block block = aik.o(b2.gW + (double)i2, b2.gX + (double)i3, b2.gY + (double)n2);
                            if (block.xb() == Blocks.cLc.xb()) continue;
                            double d3 = Math.floor(b2.gW + (double)i2);
                            double d4 = Math.floor(b2.gX + (double)i3) + block.xs() + d2;
                            double d5 = Math.floor(b2.gY + (double)n2);
                            da da3 = new da(d3, d4, d5);
                            if (!this.V.stream().noneMatch(da2 -> da2.dAH == d4)) continue;
                            this.V.add(da3);
                        }
                    }
                }
            }
            if (this.V.size() <= 2) {
                return;
            }
            if (this.R.getY() < this.R.ar() - (double)this.Z) {
                return;
            }
            d2 = Double.MAX_VALUE;
            double d6 = Double.MAX_VALUE;
            n2 = Integer.MAX_VALUE;
            double d7 = Double.MAX_VALUE;
            for (da da4 : this.V) {
                for (double d5 : this.W) {
                    double d8 = da4.dAH;
                    for (int i4 = 0; i4 < this.Y; ++i4) {
                        double d9 = Math.abs((d8 += aii.predictedMotion(d5, i4)) - this.R.getY());
                        if (d9 < d2) {
                            d2 = d9;
                            n2 = i4;
                            d7 = da4.dAH;
                        }
                        if (!(d8 < d6)) continue;
                        d6 = d8;
                    }
                }
            }
            if (this.R.getY() < d6) {
                return;
            }
            if (this.ac.T(250L) && this.R.aC()) {
                this.ac.aX();
                this.ad = 0;
            }
            if (this.af) {
                if (d2 > 0.001 && d2 != 0.015485600668696975 && d2 != 0.01374998688697815 && d2 != 0.002786007340908725 && d2 != 0.0013359791121487774 && d2 != 0.0013735326446351337 && d2 != 0.005455650520339361 && d2 != 0.026450877005913753 && d2 != 0.006179987693194278 && d2 != 0.0029422088919233147 && d2 != 0.0031678198715923145) {
                    this.ag = true;
                }
                if (this.R.aC() && this.R.isOnGround() && d2 <= this.X && this.ae >= 30) {
                    this.af = false;
                    this.M();
                }
                if (this.ae == 25) {
                    f f2 = (f)this.R.a(f.class);
                    if (f2 == null) {
                        return;
                    }
                    if (this.ag) {
                        f2.L();
                    } else {
                        f2.K();
                        if (f2.Q() > 1.0) {
                            f2.J();
                        }
                    }
                    this.ag = true;
                }
            } else {
                if (n2 <= this.ab && !this.R.aC() && n2 > 2 && this.ab > 2) {
                    ++this.ad;
                    if (this.ad > 1) {
                        this.ad = 0;
                        this.a(0.11);
                    }
                }
                if (d2 < this.X) {
                    this.b(0.1f);
                }
                this.a(d2);
                if (this.Q() > 0.3) {
                    this.J();
                    this.M();
                }
            }
            this.ab = n2;
        }
    }
}

