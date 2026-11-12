/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model.anim;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.optifine.entity.model.anim.a;
import net.optifine.entity.model.anim.b;
import net.optifine.entity.model.anim.e;
import net.optifine.entity.model.anim.f;
import net.optifine.entity.model.anim.j;
import net.optifine.entity.model.anim.k;
import net.optifine.entity.model.h;
import net.optifine.expr.l;

public class c
implements a {
    private final h egq;
    private final d egr;
    private final net.optifine.entity.model.f[] egs;
    private ag egt;
    private ag egu;
    private final b egv;

    public c(h h2, d d2, net.optifine.entity.model.f[] fArray) {
        this.egq = h2;
        this.egr = d2;
        this.egs = fArray;
        Class clazz = h2.Np();
        this.egv = net.minecraft.tileentity.d.class.isAssignableFrom(clazz) ? new k() : new j();
    }

    @Override
    public l ib(String string) {
        e e2 = this.hZ(string);
        if (e2 != null) {
            return e2;
        }
        l l2 = this.egv.ia(string);
        return l2;
    }

    @Override
    public ag hY(String string) {
        if (string == null) {
            return null;
        }
        if (string.indexOf(":") >= 0) {
            String[] stringArray = net.minecraft.src.a.V(string, ":");
            ag ag2 = this.hY(stringArray[0]);
            for (int i2 = 1; i2 < stringArray.length; ++i2) {
                String string2 = stringArray[i2];
                ag ag3 = ag2.cZ(string2);
                if (ag3 == null) {
                    return null;
                }
                ag2 = ag3;
            }
            return ag2;
        }
        if (this.egt != null && string.equals("this")) {
            return this.egt;
        }
        if (this.egu != null && string.equals("part")) {
            return this.egu;
        }
        ag ag4 = this.egq.a(this.egr, string);
        if (ag4 != null) {
            return ag4;
        }
        for (int i3 = 0; i3 < this.egs.length; ++i3) {
            net.optifine.entity.model.f f2 = this.egs[i3];
            ag ag5 = f2.aCj();
            if (string.equals(ag5.tn())) {
                return ag5;
            }
            ag ag6 = ag5.cZ(string);
            if (ag6 == null) continue;
            return ag6;
        }
        return null;
    }

    @Override
    public e hZ(String string) {
        String[] stringArray = net.minecraft.src.a.V(string, ".");
        if (stringArray.length != 2) {
            return null;
        }
        String string2 = stringArray[0];
        String string3 = stringArray[1];
        ag ag2 = this.hY(string2);
        if (ag2 == null) {
            return null;
        }
        f f2 = f.ic(string3);
        return f2 == null ? null : new e(string, ag2, f2);
    }

    public void b(ag ag2) {
        this.egu = ag2;
    }

    public void c(ag ag2) {
        this.egt = ag2;
    }
}

