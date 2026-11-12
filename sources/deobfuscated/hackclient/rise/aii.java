/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector2d
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.abs;
import hackclient.rise.ahj;
import hackclient.rise.aik;
import hackclient.rise.akd;
import java.util.Arrays;
import javax.vecmath.Vector2d;
import lombok.Generated;
import net.minecraft.client.network.h;
import net.minecraft.client.settings.d;
import net.minecraft.enchantment.l;
import net.minecraft.entity.c;
import net.minecraft.network.r;
import net.minecraft.potion.a;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cc;
import net.minecraft.util.cd;
import rise.Client;
import rise.event.impl.MoveEvent;
import rise.event.impl.MoveInputEvent;
import rise.module.impl.player.Scaffold;
import rise.util.InstanceAccess;
import rise.util.math.Vector2f;

public final class aii
implements InstanceAccess {
    private static float aPa;
    private static float aPb;
    public static final double aPc = 0.221;
    public static final double aPd = 0.66;
    public static final double aPe = (double)1.3f;
    public static final double aPf = (double)0.3f;
    public static final double aPg = 2.5;
    public static final double aPh = 0.4751131221719457;
    public static final double aPi = (double)0.42f;
    public static final double aPj = (double)159.9f;
    public static final double aPk = 1.0E-5;
    public static final double aPl = 0.0626;
    public static final double aPm = 0.015625;
    public static final double aPn = (double)0.98f;
    public static final double aPo = (double)0.8f;
    public static final double aPp = 0.5;
    public static final double aPq = 0.5203620003898759;
    public static final double[] aPr;
    public static final double aPs = -0.09800000190735147;
    public static final double aPt = -0.0784000015258789;

    public static boolean isMoving() {
        return aii.aER.bgK.cuW != 0.0f || aii.aER.bgK.cuV != 0.0f;
    }

    public static boolean enoughMovementForSprinting() {
        return Math.abs(aii.aER.bgK.cuW) >= 0.8f || Math.abs(aii.aER.bgK.cuV) >= 0.8f;
    }

    public static boolean canSprint(boolean bl2) {
        return bl2 ? !(!(aii.aER.bgK.cuW >= 0.8f) || aii.aER.bgK.crR || aii.aER.bgK.abY().getFoodLevel() <= 6 && !aii.aER.bgK.cIt.cJL || aii.aER.bgK.a(a.dgK) || aii.aER.bgK.isUsingItem() || aii.aER.bgK.isSneaking()) : aii.enoughMovementForSprinting();
    }

    public static double movementDelta() {
        return Math.hypot(aii.aER.bgK.gW - aii.aER.bgK.crF, aii.aER.bgK.gY - aii.aER.bgK.crH);
    }

    public static double speedPotionAmp(double d2) {
        return aii.aER.bgK.a(a.dgw) ? (double)(aii.aER.bgK.b(a.dgw).ajf() + 1) * d2 : 0.0;
    }

    public static double jumpMotion() {
        return aii.jumpBoostMotion(0.42f);
    }

    public static double jumpBoostMotion(double d2) {
        if (aii.aER.bgK.a(a.dgD)) {
            return d2 + (double)((float)(aii.aER.bgK.b(a.dgD).ajf() + 1) * 0.1f);
        }
        return d2;
    }

    public static Vector2d ac(double d2) {
        cc cc2 = aii.aER.bgK.bkr;
        double d3 = cc2.cuW;
        double d4 = cc2.dzs;
        double d5 = aii.aER.bgK.pp;
        if (d3 != 0.0 || d4 != 0.0) {
            if (d4 > 0.0) {
                d4 = 1.0;
            } else if (d4 < 0.0) {
                d4 = -1.0;
            }
            if (d3 != 0.0) {
                if (d4 > 0.0) {
                    d5 += d3 > 0.0 ? -45.0 : 45.0;
                } else if (d4 < 0.0) {
                    d5 += d3 > 0.0 ? 45.0 : -45.0;
                }
                d4 = 0.0;
                if (d3 > 0.0) {
                    d3 = 1.0;
                } else if (d3 < 0.0) {
                    d3 = -1.0;
                }
            }
            double d6 = Math.cos(Math.toRadians(d5 + (double)abs.aHN));
            double d7 = Math.sin(Math.toRadians(d5 + (double)abs.aHN));
            return new Vector2d(d3 * d2 * d6 + d4 * d2 * d7, d3 * d2 * d7 - d4 * d2 * d6);
        }
        return new Vector2d(0.0, 0.0);
    }

    public static int depthStriderLevel() {
        return l.R(aii.aER.bgK);
    }

    public static float fallDistanceForDamage() {
        float f2 = 3.0f;
        if (aii.aER.bgK.a(a.dgD)) {
            int n2 = aii.aER.bgK.b(a.dgD).ajf();
            f2 += (float)(n2 + 1);
        }
        return f2;
    }

    public static double roundToGround(double d2) {
        return (double)Math.round(d2 / 0.015625) * 0.015625;
    }

    public static double predictedMotion(double d2) {
        return (d2 - 0.08) * (double)0.98f;
    }

    public static void forward(double d2) {
        double d3 = aii.direction();
        aii.aER.bgK.ud = -Math.sin(d3) * d2;
        aii.aER.bgK.uf = Math.cos(d3) * d2;
    }

    public static double predictedMotion(double d2, int n2) {
        if (n2 == 0) {
            return d2;
        }
        double d3 = d2;
        for (int i2 = 0; i2 < n2; ++i2) {
            d3 = (d3 - 0.08) * (double)0.98f;
        }
        return d3;
    }

    public static float getMoveX(float f2) {
        return (float)(-Math.sin(Math.toRadians(f2)));
    }

    public static float getMoveZ(float f2) {
        return (float)Math.cos(Math.toRadians(f2));
    }

    public static float getMoveX() {
        return aii.getMoveX(aii.aER.bgK.pp);
    }

    public static float getMoveZ() {
        return aii.getMoveZ(aii.aER.bgK.pp);
    }

    public static double getLastVelocityDelta() {
        return Math.hypot(aii.aER.bgK.csu, aii.aER.bgK.csu);
    }

    public static double vs() {
        double d2 = 0.2873;
        if (aii.aER.bgK.a(a.dgw)) {
            d2 *= 1.0 + 0.2 * (double)(aii.aER.bgK.b(a.dgw).ajf() + 1);
        }
        return d2;
    }

    public static double getAllowedHorizontalDistance() {
        double d2;
        boolean bl2 = false;
        if (aii.aER.bgK.crZ) {
            d2 = 0.105;
        } else if (aik.vy()) {
            d2 = 0.11500000208616258;
            int n2 = aii.depthStriderLevel();
            if (n2 > 0) {
                d2 *= aPr[n2];
                bl2 = true;
            }
        } else if (aii.aER.bgK.isSneaking()) {
            d2 = 0.0663000026345253;
        } else {
            d2 = 0.221;
            bl2 = true;
        }
        if (bl2) {
            if (aii.canSprint(false)) {
                d2 *= (double)1.3f;
            }
            Scaffold scaffold = Client.a.g().c(Scaffold.class);
            if (!(!aii.aER.bgK.a(a.dgw) || aii.aER.bgK.b((a)a.dgw).duration <= 0 || scaffold.isEnabled() && ((Boolean)scaffold.ahc.wD()).booleanValue())) {
                d2 *= 1.0 + 0.2 * (double)(aii.aER.bgK.b(a.dgw).ajf() + 1);
            }
            if (aii.aER.bgK.a(a.dgx)) {
                d2 = 0.29;
            }
        }
        return d2;
    }

    public static void jumpRandom(double d2) {
        aii.aER.bgK.ue = d2 + Math.random() / 500.0;
    }

    public static void strafe() {
        aii.a(aii.speed(), aii.aER.bgK);
    }

    public static void u(c c2) {
        aii.a(aii.speed(), c2);
    }

    public static void strafe(double d2) {
        aii.a(d2, aii.aER.bgK);
    }

    public static void a(double d2, c c2) {
        if (!aii.isMoving()) {
            return;
        }
        double d3 = aii.direction();
        c2.ud = (double)(-bt.bx((float)d3)) * d2;
        c2.uf = (double)bt.bB((float)d3) * d2;
    }

    public static void a(double d2, float f2) {
        if (!aii.isMoving()) {
            return;
        }
        f2 = (float)Math.toRadians(f2);
        aii.aER.bgK.ud = (double)(-bt.bx(f2)) * d2;
        aii.aER.bgK.uf = (double)bt.bB(f2) * d2;
    }

    public static void stop() {
        aii.aER.bgK.ud = 0.0;
        aii.aER.bgK.uf = 0.0;
    }

    public static double direction() {
        float f2 = aii.aER.bgK.pp;
        if (aii.aER.bgK.cuW < 0.0f) {
            f2 += 180.0f;
        }
        float f3 = 1.0f;
        if (aii.aER.bgK.cuW < 0.0f) {
            f3 = -0.5f;
        } else if (aii.aER.bgK.cuW > 0.0f) {
            f3 = 0.5f;
        }
        if (aii.aER.bgK.cuV > 0.0f) {
            f2 -= 90.0f * f3;
        }
        if (aii.aER.bgK.cuV < 0.0f) {
            f2 += 90.0f * f3;
        }
        return Math.toRadians(f2);
    }

    public static float moveYaw(double d2, double d3) {
        if (d2 == 0.0 && d3 == 0.0) {
            return aii.aER.bgK.pl;
        }
        return (float)(Math.toDegrees(Math.atan2(d3, d2)) - 90.0);
    }

    public static double m(MoveInputEvent moveInputEvent) {
        float f2 = aii.aER.bgK.pp;
        if (moveInputEvent.getForward() < 0.0f) {
            f2 += 180.0f;
        }
        float f3 = 1.0f;
        if (moveInputEvent.getForward() < 0.0f) {
            f3 = -0.5f;
        } else if (moveInputEvent.getForward() > 0.0f) {
            f3 = 0.5f;
        }
        if (moveInputEvent.getStrafe() > 0.0f) {
            f2 -= 70.0f * f3;
        }
        if (moveInputEvent.getStrafe() < 0.0f) {
            f2 += 70.0f * f3;
        }
        return Math.toRadians(f2);
    }

    public static double g(float f2, float f3) {
        float f4 = aii.aER.bgK.pp;
        if (f2 < 0.0f) {
            f4 += 180.0f;
        }
        float f5 = 1.0f;
        if (f2 < 0.0f) {
            f5 = -0.5f;
        } else if (f2 > 0.0f) {
            f5 = 0.5f;
        }
        if (f3 > 0.0f) {
            f4 -= 70.0f * f5;
        }
        if (f3 < 0.0f) {
            f4 += 70.0f * f5;
        }
        return Math.toRadians(f4);
    }

    public static double wrappedDirection() {
        float f2 = aii.aER.bgK.pp;
        if (aii.aER.bgK.cuW < 0.0f && aii.aER.bgK.cuV == 0.0f) {
            f2 += 180.0f;
        }
        if (aii.aER.bgK.cuV > 0.0f) {
            f2 -= 90.0f;
        }
        if (aii.aER.bgK.cuV < 0.0f) {
            f2 += 90.0f;
        }
        return Math.toRadians(f2);
    }

    public static double direction(float f2, double d2, double d3) {
        if (d2 < 0.0) {
            f2 += 180.0f;
        }
        float f3 = 1.0f;
        if (d2 < 0.0) {
            f3 = -0.5f;
        } else if (d2 > 0.0) {
            f3 = 0.5f;
        }
        if (d3 > 0.0) {
            f2 -= 90.0f * f3;
        }
        if (d3 < 0.0) {
            f2 += 90.0f * f3;
        }
        return Math.toRadians(f2);
    }

    public static double speed() {
        return Math.hypot(aii.aER.bgK.ud, aii.aER.bgK.uf);
    }

    public static void a(MoveEvent moveEvent, double d2) {
        aii.a(moveEvent, d2, aii.aER.bgK.pp, (double)aii.aER.bgK.bkr.dzs, aii.aER.bgK.bkr.cuW);
    }

    public static void a(MoveEvent moveEvent, double d2, float f2, double d3, double d4) {
        double d5 = d4;
        double d6 = d3;
        float f3 = f2;
        if (d5 != 0.0) {
            if (d6 > 0.0) {
                f3 += d5 > 0.0 ? -45.0f : 45.0f;
            } else if (d6 < 0.0) {
                f3 += d5 > 0.0 ? 45.0f : -45.0f;
            }
            d6 = 0.0;
            if (d5 > 0.0) {
                d5 = 1.0;
            } else if (d5 < 0.0) {
                d5 = -1.0;
            }
        }
        double d7 = Math.cos(Math.toRadians(f3 + abs.aHN));
        double d8 = Math.sin(Math.toRadians(f3 + abs.aHN));
        moveEvent.setPosX(d5 * d2 * d7 + d6 * d2 * d8);
        moveEvent.setPosZ(d5 * d2 * d8 - d6 * d2 * d7);
    }

    public static void a(MoveInputEvent moveInputEvent, float f2) {
        float f3 = moveInputEvent.getForward();
        float f4 = moveInputEvent.getStrafe();
        double d2 = bt.aJ(Math.toDegrees(aii.direction(aii.aER.bgK.pl, f3, f4)));
        if (f3 == 0.0f && f4 == 0.0f) {
            return;
        }
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = Float.MAX_VALUE;
        for (float f8 = -1.0f; f8 <= 1.0f; f8 += 1.0f) {
            for (float f9 = -1.0f; f9 <= 1.0f; f9 += 1.0f) {
                double d3;
                double d4;
                if (f9 == 0.0f && f8 == 0.0f || !((d4 = ahj.n(d2, d3 = bt.aJ(Math.toDegrees(aii.direction(f2, f8, f9))))) < (double)f7)) continue;
                f7 = (float)d4;
                f5 = f8;
                f6 = f9;
            }
        }
        boolean bl2 = f5 == 1.0f;
        boolean bl3 = f5 == -1.0f;
        boolean bl4 = f6 == 1.0f;
        boolean bl5 = f6 == -1.0f;
        aPa = f6;
        aPb = f5;
        moveInputEvent.setForward(f5);
        moveInputEvent.setStrafe(f6);
    }

    public static double getMCFriction() {
        float f2 = 0.91f;
        if (aii.aER.bgK.aO) {
            f2 = aii.aER.bgF.L((b)new b((int)bt.aF((double)aii.aER.bgK.gW), (int)(bt.aF((double)aii.aER.bgK.Us().dtI) - 1), (int)bt.aF((double)aii.aER.bgK.gY))).df().aSF * 0.91f;
        }
        return f2;
    }

    public static double[] a(float f2, float f3, boolean bl2, float f4, boolean bl3) {
        float f5;
        float f6;
        float f7 = 0.02f;
        float f8 = aii.aER.bgK.Wf();
        if (bl2) {
            f6 = 0.54600006f;
            f5 = 0.9999998f;
            f7 = f8 / 2.0f * 0.9999998f;
        }
        if (bl3) {
            f7 = (float)((double)f7 + (double)(bl2 ? f8 / 2.0f : 0.02f) * 0.3);
        }
        if ((f6 = f2 * f2 + f3 * f3) >= 1.0E-4f) {
            if ((f6 = bt.bK(f6)) < 1.0f) {
                f6 = 1.0f;
            }
            f6 = f7 / f6;
            f5 = bt.bx(f4 * (float)abs.aHM / 180.0f);
            float f9 = bt.bB(f4 * (float)abs.aHM / 180.0f);
            double d2 = (f2 *= f6) * f9 - (f3 *= f6) * f5;
            double d3 = f3 * f9 + f2 * f5;
            return new double[]{d2, d3};
        }
        return null;
    }

    public static rise.util.math.Vector2d b(float f2, float f3, boolean bl2, float f4, boolean bl3) {
        double[] dArray = aii.a(f2, f3, bl2, f4, bl3);
        if (dArray == null) {
            return null;
        }
        return new rise.util.math.Vector2d(dArray[0], dArray[1]);
    }

    public static Double moveFlyingSpeed(float f2, float f3, boolean bl2, float f4, boolean bl3) {
        double[] dArray = aii.a(f2, f3, bl2, f4, bl3);
        if (dArray == null) {
            return null;
        }
        return Math.hypot(dArray[0], dArray[1]);
    }

    public static Double moveFlyingSpeed(boolean bl2) {
        double[] dArray = aii.a(0.98f, 0.98f, aii.aER.bgK.aO, 180.0f, bl2);
        if (dArray == null) {
            return null;
        }
        return Math.hypot(dArray[0], dArray[1]);
    }

    public static void partialStrafeMax(double d2) {
        aii.b(d2, aii.aER.bgK);
    }

    public static void b(double d2, c c2) {
        double d3 = c2.ud;
        double d4 = c2.uf;
        aii.u(c2);
        c2.ud = d3 + Math.max(-d2, Math.min(d2, c2.ud - d3));
        c2.uf = d4 + Math.max(-d2, Math.min(d2, c2.uf - d4));
    }

    public static void partialStrafePercent(double d2) {
        d2 /= 100.0;
        d2 = Math.min(1.0, Math.max(0.0, d2));
        double d3 = aii.aER.bgK.ud;
        double d4 = aii.aER.bgK.uf;
        aii.strafe();
        aii.aER.bgK.ud = d3 + (aii.aER.bgK.ud - d3) * d2;
        aii.aER.bgK.uf = d4 + (aii.aER.bgK.uf - d4) * d2;
    }

    public static double moveMaxFlying(boolean bl2) {
        float f2;
        float f3;
        float f4 = 0.02f;
        float f5 = aii.aER.bgK.Wf() / 2.0f;
        float f6 = 0.98f;
        float f7 = 0.98f;
        float f8 = 180.0f;
        if (bl2) {
            f3 = 0.54600006f;
            f2 = 0.9999998f;
            f4 = f5 * 0.9999998f;
        }
        f4 = (float)((double)f4 + (double)(bl2 ? f5 : 0.02f) * 0.3);
        f3 = f6 * f6 + f7 * f7;
        if (f3 >= 1.0E-4f) {
            if ((f3 = (float)Math.sqrt(f3)) < 1.0f) {
                f3 = 1.0f;
            }
            f3 = f4 / f3;
            f2 = bt.bx(f8 * (float)abs.aHM / 180.0f);
            float f9 = bt.bB(f8 * (float)abs.aHM / 180.0f);
            double d2 = (f6 *= f3) * f9 - (f7 *= f3) * f2;
            double d3 = f7 * f9 + f6 * f2;
            return Math.hypot(d2, d3);
        }
        return 0.0;
    }

    public static float simulationStrafeAngle(float f2, float f3) {
        float f4 = (float)Math.toDegrees(aii.direction());
        f2 = Math.abs(f2 - f4) <= f3 ? f4 : (f2 > f4 ? (f2 -= f3) : (f2 += f3));
        float f5 = f2;
        aii.a(aii.speed(), f5);
        return f5;
    }

    public static float simulationStrafe(float f2) {
        double d2 = 0.02599999835384377;
        double d3 = 0.91f;
        double d4 = aii.aER.bgK.He * d3;
        double d5 = aii.aER.bgK.Hg * d3;
        float f3 = f2;
        float f4 = (float)Math.toDegrees(aii.direction());
        for (int i2 = 0; i2 <= 360; ++i2) {
            aii.a(aii.speed(), f2);
            double d6 = Math.abs(aii.aER.bgK.ud);
            double d7 = Math.abs(aii.aER.bgK.uf);
            double d8 = d4 - d2;
            double d9 = d5 - d2;
            if (f2 == f4 || d6 < d8 || d7 < d9) break;
            f3 = f2;
            if (Math.abs(f2 - f4) <= 1.0f) {
                f2 = f4;
                continue;
            }
            if (f2 > f4) {
                f2 -= 1.0f;
                continue;
            }
            f2 += 1.0f;
        }
        aii.a(aii.speed(), f3);
        return f3;
    }

    public static void preventDiagonalSpeed() {
        boolean bl2;
        d[] dArray = new d[]{aii.aER.aIY.chm, aii.aER.aIY.chp, aii.aER.aIY.cho, aii.aER.aIY.chn};
        int[] nArray = new int[]{0};
        Arrays.stream(dArray).forEach(d2 -> {
            nArray[0] = nArray[0] + (d2.Re() ? 1 : 0);
        });
        boolean bl3 = bl2 = nArray[0] == 1;
        if (bl2) {
            return;
        }
        double d3 = 0.0026000750109401644;
        double d4 = 5.199896488849598E-4;
        double d5 = aii.aER.bgK.aO ? 0.0026000750109401644 : 5.199896488849598E-4;
        aii.moveFlying(-d5);
    }

    public static void useDiagonalSpeed() {
        boolean bl2;
        d[] dArray = new d[]{aii.aER.aIY.chm, aii.aER.aIY.chp, aii.aER.aIY.cho, aii.aER.aIY.chn};
        int[] nArray = new int[]{0};
        Arrays.stream(dArray).forEach(d2 -> {
            nArray[0] = nArray[0] + (d2.Re() ? 1 : 0);
        });
        boolean bl3 = bl2 = nArray[0] == 1;
        if (!bl2) {
            return;
        }
        double d3 = 0.0026000750109401644;
        double d4 = 5.199896488849598E-4;
        double d5 = aii.aER.bgK.aO ? 0.0026000750109401644 : 5.199896488849598E-4;
        aii.moveFlying(d5);
    }

    public static void c(double d2, c c2) {
        if (!aii.isMoving()) {
            return;
        }
        double d3 = aii.getMCFriction();
        double d4 = d3 > 1.0E-6 ? d2 / d3 : d2;
        double d5 = aii.direction();
        c2.ud = (double)(-bt.bx((float)d5)) * d4;
        c2.uf = (double)bt.bB((float)d5) * d4;
    }

    public static void strafeNoFriction(double d2) {
        aii.c(d2, aii.aER.bgK);
    }

    public static void moveFlying(double d2) {
        if (!aii.isMoving()) {
            return;
        }
        double d3 = aii.direction();
        aii.aER.bgK.ud += (double)(-bt.bx((float)d3)) * d2;
        aii.aER.bgK.uf += (double)bt.bB((float)d3) * d2;
    }

    public static void moveFlying2(double d2, float f2) {
        aii.aER.bgK.ud += (double)(-bt.bx((float)Math.toRadians(f2))) * d2;
        aii.aER.bgK.uf += (double)bt.bB((float)Math.toRadians(f2)) * d2;
    }

    public static akd a(c c2, Vector2f vector2f, int n2, boolean bl2) {
        double d2 = c2.gW - c2.csh;
        double d3 = c2.gY - c2.csj;
        return aii.a(new akd(c2.gW, c2.gX, c2.gY), new akd(d2, 0.0, d3), c2.pl, vector2f, n2, bl2);
    }

    public static akd a(akd akd2, akd akd3, float f2, Vector2f vector2f) {
        return aii.a(akd2, akd3, f2, vector2f, 1, vector2f.x != 0.0f || vector2f.y != 0.0f);
    }

    public static akd a(akd akd2, akd akd3, float f2, Vector2f vector2f, int n2, boolean bl2) {
        for (int i2 = 0; i2 <= n2; ++i2) {
            akd3.z *= 0.546000063419342;
            akd3.x *= 0.546000063419342;
            double[] dArray = aii.a(vector2f.x, vector2f.y, true, f2, bl2);
            if (dArray == null) {
                return akd2;
            }
            akd3.x += dArray[0];
            akd3.y = 0.0;
            akd3.z += dArray[1];
            akd2 = akd2.e(akd3);
        }
        return akd2;
    }

    public static akd vt() {
        net.minecraft.client.entity.c c2 = new net.minecraft.client.entity.c(aER, aii.aER.bgF, new h(aER, aii.aER.bgR, new r(aii.aER.AU().dr().cZG), aii.aER.bgK.Ie()), aii.aER.bgK.Dx());
        aii.aER.bgF.a(-99999, (c)c2);
        c2.ud = aii.aER.bgK.ud;
        c2.ue = aii.aER.bgK.ue;
        c2.uf = aii.aER.bgK.uf;
        c2.setPosition(aii.aER.bgK.gW, aii.aER.bgK.gX, aii.aER.bgK.gY);
        c2.pl = c2.pp = aii.aER.bgK.pp;
        c2.aO = aii.aER.bgK.aO;
        c2.setSprinting(aii.aER.bgK.isSprinting());
        c2.bkD = aii.aER.bgK.bkD;
        c2.bkr = new cd(aii.aER.aIY);
        c2.bkr.atv();
        c2.cuW = c2.bkr.cuW;
        c2.cuV = c2.bkr.dzs;
        c2.Dm();
        aii.aER.bgF.co(-99999);
        if (aii.aER.aIY.chq.Re() && aii.aER.bgK.aO && aii.aER.bgK.cvk <= 1) {
            c2.setPosition(c2.gW, c2.gX + aii.jumpMotion(), c2.gY);
        }
        return new akd(c2.gW, c2.gX, c2.gY);
    }

    @Generated
    private aii() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        aPr = new double[]{1.0, 1.4304347400741908, 1.7347825295420372, 1.9217390955733897};
    }
}

