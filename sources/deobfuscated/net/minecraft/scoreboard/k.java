/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package net.minecraft.scoreboard;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import net.minecraft.entity.player.e;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.bn;
import net.minecraft.network.play.server.bo;
import net.minecraft.network.play.server.bq;
import net.minecraft.network.play.server.br;
import net.minecraft.scoreboard.d;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.h;
import net.minecraft.scoreboard.i;
import net.minecraft.scoreboard.j;
import net.minecraft.server.MinecraftServer;

public class k
extends i {
    private final MinecraftServer dkj;
    private final Set<g> dkk = Sets.newHashSet();
    private j dkl;

    public k(MinecraftServer minecraftServer) {
        this.dkj = minecraftServer;
    }

    @Override
    public void e(d d2) {
        super.e(d2);
        if (this.dkk.contains(d2.akn())) {
            this.dkj.alE().H(new bo(d2));
        }
        this.akJ();
    }

    @Override
    public void ft(String string) {
        super.ft(string);
        this.dkj.alE().H(new bo(string));
        this.akJ();
    }

    @Override
    public void d(String string, g g2) {
        super.d(string, g2);
        this.dkj.alE().H(new bo(string, g2));
        this.akJ();
    }

    @Override
    public void a(int n2, g g2) {
        g g3 = this.gY(n2);
        super.a(n2, g2);
        if (g3 != g2 && g3 != null) {
            if (this.k(g3) > 0) {
                this.dkj.alE().H(new bq(n2, g2));
            } else {
                this.j(g3);
            }
        }
        if (g2 != null) {
            if (this.dkk.contains(g2)) {
                this.dkj.alE().H(new bq(n2, g2));
            } else {
                this.h(g2);
            }
        }
        this.akJ();
    }

    @Override
    public boolean T(String string, String string2) {
        if (super.T(string, string2)) {
            h h2 = this.dX(string2);
            this.dkj.alE().H(new br(h2, Arrays.asList(string), 3));
            this.akJ();
            return true;
        }
        return false;
    }

    @Override
    public void a(String string, h h2) {
        super.a(string, h2);
        this.dkj.alE().H(new br(h2, Arrays.asList(string), 4));
        this.akJ();
    }

    @Override
    public void d(g g2) {
        super.d(g2);
        this.akJ();
    }

    @Override
    public void e(g g2) {
        super.e(g2);
        if (this.dkk.contains(g2)) {
            this.dkj.alE().H(new bn(g2, 2));
        }
        this.akJ();
    }

    @Override
    public void f(g g2) {
        super.f(g2);
        if (this.dkk.contains(g2)) {
            this.j(g2);
        }
        this.akJ();
    }

    @Override
    public void b(h h2) {
        super.b(h2);
        this.dkj.alE().H(new br(h2, 0));
        this.akJ();
    }

    @Override
    public void c(h h2) {
        super.c(h2);
        this.dkj.alE().H(new br(h2, 2));
        this.akJ();
    }

    @Override
    public void d(h h2) {
        super.d(h2);
        this.dkj.alE().H(new br(h2, 1));
        this.akJ();
    }

    public void a(j j2) {
        this.dkl = j2;
    }

    protected void akJ() {
        if (this.dkl != null) {
            this.dkl.Lw();
        }
    }

    public List<aj> g(g g2) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new bn(g2, 0));
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.gY(i2) != g2) continue;
            arrayList.add(new bq(i2, g2));
        }
        for (d d2 : this.b(g2)) {
            arrayList.add(new bo(d2));
        }
        return arrayList;
    }

    public void h(g g2) {
        List<aj> list = this.g(g2);
        for (e e2 : this.dkj.alE().amB()) {
            for (aj aj2 : list) {
                e2.cIX.B(aj2);
            }
        }
        this.dkk.add(g2);
    }

    public List<aj> i(g g2) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new bn(g2, 1));
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.gY(i2) != g2) continue;
            arrayList.add(new bq(i2, g2));
        }
        return arrayList;
    }

    public void j(g g2) {
        List<aj> list = this.i(g2);
        for (e e2 : this.dkj.alE().amB()) {
            for (aj aj2 : list) {
                e2.cIX.B(aj2);
            }
        }
        this.dkk.remove(g2);
    }

    public int k(g g2) {
        int n2 = 0;
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.gY(i2) != g2) continue;
            ++n2;
        }
        return n2;
    }
}

