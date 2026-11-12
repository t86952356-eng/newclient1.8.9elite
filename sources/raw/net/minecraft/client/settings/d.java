/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.settings;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.bj;

public class d
implements Comparable<d> {
    private static final List<d> clT = Lists.newArrayList();
    private static final bj<d> clU = new bj();
    private static final Set<String> clV = Sets.newHashSet();
    private final String clW;
    private final int clX;
    private final String clY;
    private int je;
    private boolean VU;
    public int clZ;

    public static void ea(int n2) {
        d d2;
        if (n2 != 0 && (d2 = clU.hE(n2)) != null) {
            ++d2.clZ;
        }
    }

    public static void k(int n2, boolean bl2) {
        d d2;
        if (n2 != 0 && (d2 = clU.hE(n2)) != null) {
            d2.VU = bl2;
        }
    }

    public static void Rb() {
        for (d d2 : clT) {
            d2.Rh();
        }
    }

    public static void Rc() {
        clU.CY();
        for (d d2 : clT) {
            clU.c(d2.je, d2);
        }
    }

    public static Set<String> Rd() {
        return clV;
    }

    public d(String string, int n2, String string2) {
        this.clW = string;
        this.je = n2;
        this.clX = n2;
        this.clY = string2;
        clT.add(this);
        clU.c(n2, this);
        clV.add(string2);
    }

    public boolean Re() {
        return this.VU;
    }

    public String Rf() {
        return this.clY;
    }

    public boolean Rg() {
        if (this.clZ == 0) {
            return false;
        }
        --this.clZ;
        return true;
    }

    public void ay(boolean bl2) {
        this.VU = bl2;
    }

    private void Rh() {
        this.clZ = 0;
        this.VU = false;
    }

    public String Ri() {
        return this.clW;
    }

    public int Rj() {
        return this.clX;
    }

    public int cO() {
        return this.je;
    }

    public void eb(int n2) {
        this.je = n2;
    }

    public int b(d d2) {
        int n2 = I18n.a(this.clY, new Object[0]).compareTo(I18n.a(d2.clY, new Object[0]));
        if (n2 == 0) {
            n2 = I18n.a(this.clW, new Object[0]).compareTo(I18n.a(d2.clW, new Object[0]));
        }
        return n2;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.b((d)object);
    }
}

