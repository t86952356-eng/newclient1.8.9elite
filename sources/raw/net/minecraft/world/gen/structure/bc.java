/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Sets;
import java.util.Random;
import java.util.Set;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.world.b;
import net.minecraft.world.gen.structure.bn;
import net.minecraft.world.gen.structure.cb;
import net.minecraft.world.gen.structure.w;

public class bc
extends cb {
    private final Set<b> dRr = Sets.newHashSet();
    private boolean dRs;

    public bc() {
    }

    public bc(net.minecraft.world.w w2, Random random, int n2, int n3) {
        super(n2, n3);
        this.a(w2, random, n2, n3);
    }

    private void a(net.minecraft.world.w w2, Random random, int n2, int n3) {
        random.setSeed(w2.avD());
        long l2 = random.nextLong();
        long l3 = random.nextLong();
        long l4 = (long)n2 * l2;
        long l5 = (long)n3 * l3;
        random.setSeed(l4 ^ l5 ^ w2.avD());
        int n4 = n2 * 16 + 8 - 29;
        int n5 = n3 * 16 + 8 - 29;
        ao ao2 = ar.dwT.g(random);
        this.dRQ.add(new bn(random, n4, n5, ao2));
        this.UJ();
        this.dRs = true;
    }

    @Override
    public void b(net.minecraft.world.w w2, Random random, w w3) {
        if (!this.dRs) {
            this.dRQ.clear();
            this.a(w2, random, this.azd(), this.aze());
        }
        super.b(w2, random, w3);
    }

    @Override
    public boolean b(b b2) {
        return !this.dRr.contains(b2) && super.b(b2);
    }

    @Override
    public void c(b b2) {
        super.c(b2);
        this.dRr.add(b2);
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        v v2 = new v();
        for (b b2 : this.dRr) {
            n n3 = new n();
            n3.B("X", b2.dBK);
            n3.B("Z", b2.dBL);
            v2.a(n3);
        }
        n2.b("Processed", v2);
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        if (n2.C("Processed", 9)) {
            v v2 = n2.D("Processed", 10);
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                n n3 = v2.gi(i2);
                this.dRr.add(new b(n3.eG("X"), n3.eG("Z")));
            }
        }
    }
}

