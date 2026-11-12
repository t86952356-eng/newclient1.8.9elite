/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.world.b;
import net.minecraft.world.gen.structure.t;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public abstract class cb {
    protected LinkedList<y> dRQ = new LinkedList();
    protected w dQI;
    private int dRR;
    private int dRS;

    public cb() {
    }

    public cb(int n2, int n3) {
        this.dRR = n2;
        this.dRS = n3;
    }

    public w ayR() {
        return this.dQI;
    }

    public LinkedList<y> azc() {
        return this.dRQ;
    }

    public void b(net.minecraft.world.w w2, Random random, w w3) {
        Iterator iterator = this.dRQ.iterator();
        while (iterator.hasNext()) {
            y y2 = (y)iterator.next();
            if (!y2.ayR().b(w3) || y2.a(w2, random, w3)) continue;
            iterator.remove();
        }
    }

    protected void UJ() {
        this.dQI = w.ayJ();
        for (y y2 : this.dRQ) {
            this.dQI.c(y2.ayR());
        }
    }

    public n bp(int n2, int n3) {
        n n4 = new n();
        n4.R("id", t.a(this));
        n4.B("ChunkX", n2);
        n4.B("ChunkZ", n3);
        n4.b("BB", this.dQI.ayP());
        v v2 = new v();
        for (y y2 : this.dRQ) {
            v2.a(y2.ayQ());
        }
        n4.b("Children", v2);
        this.b(n4);
        return n4;
    }

    public void b(n n2) {
    }

    public void c(net.minecraft.world.w w2, n n2) {
        this.dRR = n2.eG("ChunkX");
        this.dRS = n2.eG("ChunkZ");
        if (n2.eD("BB")) {
            this.dQI = new w(n2.eM("BB"));
        }
        v v2 = n2.D("Children", 10);
        for (int i2 = 0; i2 < v2.aeS(); ++i2) {
            this.dRQ.add(t.c(v2.gi(i2), w2));
        }
        this.a(n2);
    }

    public void a(n n2) {
    }

    protected void a(net.minecraft.world.w w2, Random random, int n2) {
        int n3 = w2.avB() - n2;
        int n4 = this.dQI.ayM() + 1;
        if (n4 < n3) {
            n4 += random.nextInt(n3 - n4);
        }
        int n5 = n4 - this.dQI.dQF;
        this.dQI.ad(0, n5, 0);
        for (y y2 : this.dRQ) {
            y2.ae(0, n5, 0);
        }
    }

    protected void b(net.minecraft.world.w w2, Random random, int n2, int n3) {
        int n4 = n3 - n2 + 1 - this.dQI.ayM();
        int n5 = 1;
        n5 = n4 > 1 ? n2 + random.nextInt(n4) : n2;
        int n6 = n5 - this.dQI.dQC;
        this.dQI.ad(0, n6, 0);
        for (y y2 : this.dRQ) {
            y2.ae(0, n6, 0);
        }
    }

    public boolean ayI() {
        return true;
    }

    public boolean b(b b2) {
        return true;
    }

    public void c(b b2) {
    }

    public int azd() {
        return this.dRR;
    }

    public int aze() {
        return this.dRS;
    }
}

