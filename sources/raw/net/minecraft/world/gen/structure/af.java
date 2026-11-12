/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.ab;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class af
extends y {
    private final List<w> dQV = Lists.newLinkedList();

    public af() {
    }

    public af(int n2, Random random, int n3, int n4) {
        super(n2);
        this.dQI = new w(n3, 50, n4, n3 + 7 + random.nextInt(6), 54 + random.nextInt(6), n4 + 7 + random.nextInt(6));
    }

    @Override
    public void a(y y2, List<y> list, Random random) {
        Object object;
        int n2;
        int n3 = this.ayS();
        int n4 = this.dQI.ayM() - 3 - 1;
        if (n4 <= 0) {
            n4 = 1;
        }
        boolean bl2 = false;
        for (n2 = 0; n2 < this.dQI.ayL() && (n2 += random.nextInt(this.dQI.ayL())) + 3 <= this.dQI.ayL(); n2 += 4) {
            object = ab.a(y2, list, random, this.dQI.dQB + n2, this.dQI.dQC + random.nextInt(n4) + 1, this.dQI.dQD - 1, ao.dws, n3);
            if (object == null) continue;
            w w2 = ((y)object).ayR();
            this.dQV.add(new w(w2.dQB, w2.dQC, this.dQI.dQD, w2.dQE, w2.dQF, this.dQI.dQD + 1));
        }
        for (n2 = 0; n2 < this.dQI.ayL() && (n2 += random.nextInt(this.dQI.ayL())) + 3 <= this.dQI.ayL(); n2 += 4) {
            y y3 = ab.a(y2, list, random, this.dQI.dQB + n2, this.dQI.dQC + random.nextInt(n4) + 1, this.dQI.dQG + 1, ao.dwt, n3);
            if (y3 == null) continue;
            object = y3.ayR();
            this.dQV.add(new w(((w)object).dQB, ((w)object).dQC, this.dQI.dQG - 1, ((w)object).dQE, ((w)object).dQF, this.dQI.dQG));
        }
        for (n2 = 0; n2 < this.dQI.ayN() && (n2 += random.nextInt(this.dQI.ayN())) + 3 <= this.dQI.ayN(); n2 += 4) {
            y y4 = ab.a(y2, list, random, this.dQI.dQB - 1, this.dQI.dQC + random.nextInt(n4) + 1, this.dQI.dQD + n2, ao.dwu, n3);
            if (y4 == null) continue;
            object = y4.ayR();
            this.dQV.add(new w(this.dQI.dQB, ((w)object).dQC, ((w)object).dQD, this.dQI.dQB + 1, ((w)object).dQF, ((w)object).dQG));
        }
        for (n2 = 0; n2 < this.dQI.ayN() && (n2 += random.nextInt(this.dQI.ayN())) + 3 <= this.dQI.ayN(); n2 += 4) {
            y y5 = ab.a(y2, list, random, this.dQI.dQE + 1, this.dQI.dQC + random.nextInt(n4) + 1, this.dQI.dQD + n2, ao.dwv, n3);
            if (y5 == null) continue;
            object = y5.ayR();
            this.dQV.add(new w(this.dQI.dQE - 1, ((w)object).dQC, ((w)object).dQD, this.dQI.dQE, ((w)object).dQF, ((w)object).dQG));
        }
    }

    @Override
    public boolean a(net.minecraft.world.w w2, Random random, w w3) {
        if (this.a(w2, w3)) {
            return false;
        }
        this.a(w2, w3, this.dQI.dQB, this.dQI.dQC, this.dQI.dQD, this.dQI.dQE, this.dQI.dQC, this.dQI.dQG, Blocks.cLf.xM(), Blocks.cLc.xM(), true);
        this.a(w2, w3, this.dQI.dQB, this.dQI.dQC + 1, this.dQI.dQD, this.dQI.dQE, Math.min(this.dQI.dQC + 3, this.dQI.dQF), this.dQI.dQG, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        for (w w4 : this.dQV) {
            this.a(w2, w3, w4.dQB, w4.dQF - 2, w4.dQD, w4.dQE, w4.dQF, w4.dQG, Blocks.cLc.xM(), Blocks.cLc.xM(), false);
        }
        this.a(w2, w3, this.dQI.dQB, this.dQI.dQC + 4, this.dQI.dQD, this.dQI.dQE, this.dQI.dQF, this.dQI.dQG, Blocks.cLc.xM(), false);
        return true;
    }

    @Override
    public void ae(int n2, int n3, int n4) {
        super.ae(n2, n3, n4);
        for (w w2 : this.dQV) {
            w2.ad(n2, n3, n4);
        }
    }

    @Override
    protected void N(n n2) {
        v v2 = new v();
        for (w w2 : this.dQV) {
            v2.a(w2.ayP());
        }
        n2.b("Entrances", v2);
    }

    @Override
    protected void O(n n2) {
        v v2 = n2.D("Entrances", 11);
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            this.dQV.add(new w(v2.gj(i2)));
        }
    }
}

