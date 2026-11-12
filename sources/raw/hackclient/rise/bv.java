/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aea;
import hackclient.rise.aik;
import hackclient.rise.am;
import hackclient.rise.bx;
import hackclient.rise.go;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.entity.af;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.aw;
import net.minecraft.entity.passive.ah;
import net.minecraft.entity.passive.b;
import net.minecraft.entity.r;

public class bv
extends am
implements aea {
    private static go gj;

    public static r e(double d2) {
        return bv.f(d2).stream().findFirst().orElse(null);
    }

    public static List<r> f(double d2) {
        if (gj == null) {
            gj = a.a.g().c(go.class);
        }
        return bv.b((Boolean)bv.gj.nz.wD(), (Boolean)bv.gj.nA.wD(), (Boolean)bv.gj.nB.wD(), (Boolean)bv.gj.nC.wD(), (Boolean)bv.gj.nD.wD()).stream().filter(r2 -> aik.v(r2) <= d2).collect(Collectors.toList());
    }

    public static List<r> a(double d2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        return bv.b(bl2, bl3, bl4, bl5, bl6).stream().filter(r2 -> aik.v(r2) <= d2).collect(Collectors.toList());
    }

    public static List<r> bR() {
        if (gj == null) {
            gj = a.a.g().c(go.class);
        }
        return bv.b((Boolean)bv.gj.nz.wD(), (Boolean)bv.gj.nA.wD(), (Boolean)bv.gj.nB.wD(), (Boolean)bv.gj.nC.wD(), (Boolean)bv.gj.nD.wD());
    }

    public static List<r> b(boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        return bv.b(bl2, bl3, bl4, bl5, bl6, false);
    }

    public static List<r> b(boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        return bv.aER.bgF.dCS.stream().filter(c2 -> !(!(c2 instanceof r) || a.a.x().a((c)c2) || c2 == aER.BC() || bx.isFriend(c2.xU()) && !bl7 || c2 instanceof net.minecraft.entity.player.a && !bl2 || (c2 instanceof aw || c2 instanceof af) && !bl5 || (c2 instanceof b || c2 instanceof net.minecraft.entity.passive.a || c2 instanceof ah) && !bl4 || c2.isInvisible() && !bl3 || c2 instanceof net.minecraft.entity.item.a)).map(c2 -> (r)c2).filter(r2 -> !(r2 instanceof net.minecraft.entity.player.a) || !aik.D(r2) || bl6).collect(Collectors.toList());
    }
}

