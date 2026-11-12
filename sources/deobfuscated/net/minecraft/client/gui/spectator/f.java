/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.gui.spectator;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.spectator.a;
import net.minecraft.client.gui.spectator.b;
import net.minecraft.client.gui.spectator.c;
import net.minecraft.client.gui.spectator.d;
import net.minecraft.client.gui.spectator.g;
import net.minecraft.client.gui.spectator.h;
import net.minecraft.client.gui.spectator.i;

public class f {
    private static final b bxp = new h();
    private static final b bxq = new i(-1, true);
    private static final b bxr = new i(1, true);
    private static final b bxs = new i(1, false);
    public static final b bxt = new g();
    private final c bxu;
    private final List<net.minecraft.client.gui.spectator.categories.a> bxv = Lists.newArrayList();
    private d bxw = new a();
    private int bxx = -1;
    private int bxy;

    public f(c c2) {
        this.bxu = c2;
    }

    public b ci(int n2) {
        int n3 = n2 + this.bxy * 6;
        return this.bxy > 0 && n2 == 0 ? bxq : (n2 == 7 ? (n3 < this.bxw.GN().size() ? bxr : bxs) : (n2 == 8 ? bxp : (n3 >= 0 && n3 < this.bxw.GN().size() ? (b)Objects.firstNonNull((Object)this.bxw.GN().get(n3), (Object)bxt) : bxt)));
    }

    public List<b> GR() {
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = 0; i2 <= 8; ++i2) {
            arrayList.add(this.ci(i2));
        }
        return arrayList;
    }

    public b GS() {
        return this.ci(this.bxx);
    }

    public d GT() {
        return this.bxw;
    }

    public void cj(int n2) {
        b b2 = this.ci(n2);
        if (b2 != bxt) {
            if (this.bxx == n2 && b2.GQ()) {
                b2.b(this);
            } else {
                this.bxx = n2;
            }
        }
    }

    public void GU() {
        this.bxu.a(this);
    }

    public int GV() {
        return this.bxx;
    }

    public void a(d d2) {
        this.bxv.add(this.GW());
        this.bxw = d2;
        this.bxx = -1;
        this.bxy = 0;
    }

    public net.minecraft.client.gui.spectator.categories.a GW() {
        return new net.minecraft.client.gui.spectator.categories.a(this.bxw, this.GR(), this.bxx);
    }
}

