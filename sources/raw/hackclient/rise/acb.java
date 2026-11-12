/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.abf;
import hackclient.rise.abo;
import hackclient.rise.abz;
import hackclient.rise.aca;
import hackclient.rise.ack;
import hackclient.rise.aea;
import hackclient.rise.agp;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akb;
import java.lang.reflect.Field;
import java.util.ArrayList;
import lombok.Generated;

public final class acb
implements aca,
aea {
    private abf H;
    private ack aAi = new ack(new ArrayList<float[]>(), new akb(0.0f, 0.0f), this.rP().rQ());
    private ack aAj = new ack(new ArrayList<float[]>(), new akb(0.0f, 0.0f), this.rP().rQ());
    private float aAk = 10.0f;
    public ArrayList<abo> cj = new ArrayList();

    @Override
    public void aT() {
    }

    @Override
    public void b(int n2, int n3, float f2) {
        akb akb2 = new akb(this.H.pm()).h(this.aAk, 0.0f);
        ait.c((double)akb2.getX(), (double)(akb2.getY() + this.aAk), (double)(this.H.alQ.x - this.aAk * 2.0f), 100.0, this.H.pB(), abz.aAb.ql());
        this.aAi.b(this.rP().rQ());
        this.aAi.i(new akb(akb2.h(this.aAk, 0.0f)));
        this.aAi.qN();
        this.aAj.b(this.rP().rR());
        this.aAj.i(new akb(akb2.h(this.aAk, 0.0f)));
        this.aAj.qN();
        akb2 = akb2.h(0.0f, 100.0f);
        akb2 = akb2.h(0.0f, this.aAk * 2.0f);
        ait.c((double)akb2.getX(), (double)akb2.getY(), (double)(this.H.alQ.x - this.aAk * 2.0f), (double)(this.H.pn().getY() - (akb2.getY() - this.H.pm().getY()) - this.aAk), this.H.pB(), abz.aAb.ql());
        akb2 = akb2.h(0.0f, this.aAk);
        for (abo abo2 : this.pQ()) {
            if (abo2.qi() != null && abo2.qi().wB() != null && abo2.qi().wB().getAsBoolean()) continue;
            abo2.U(200);
            abo2.a(new aka(akb2.x + 1.0f + this.aAk + (float)(abo2.qi().wB() == null ? 0 : 10), akb2.y), n2, n3, f2);
            akb2 = akb2.h(0.0f, (float)abo2.da());
        }
    }

    @Override
    public void a(char c2, int n2) {
        for (abo abo2 : this.pQ()) {
            abo2.b(c2, n2);
        }
    }

    @Override
    public void f(int n2, int n3, int n4) {
        for (abo abo2 : this.pQ()) {
            if ((abo2.qi() == null || abo2.qi().wB() == null || !abo2.qi().wB().getAsBoolean()) && abo2.e(n2, n3, n4)) break;
        }
    }

    @Override
    public void oW() {
        for (abo abo2 : this.pQ()) {
            abo2.pP();
        }
    }

    @Override
    public void qo() {
        akb akb2 = new akb(this.H.pm());
        this.aAi.qo();
        this.aAj.qo();
    }

    @Override
    public boolean qq() {
        return true;
    }

    @Override
    public boolean qp() {
        return this.cj.stream().noneMatch(abo2 -> {
            for (Field field : abo2.getClass().getDeclaredFields()) {
                if (!field.getType().equals(agp.class)) continue;
                try {
                    return ((agp)field.get(abo2)).ud();
                }
                catch (IllegalAccessException illegalAccessException) {
                    // empty catch block
                }
            }
            return false;
        });
    }

    @Override
    @Generated
    public abf v() {
        return this.H;
    }

    @Generated
    public ack qr() {
        return this.aAi;
    }

    @Generated
    public ack qs() {
        return this.aAj;
    }

    @Generated
    public float qt() {
        return this.aAk;
    }

    @Generated
    public ArrayList<abo> pQ() {
        return this.cj;
    }

    @Generated
    public void a(abf abf2) {
        this.H = abf2;
    }

    @Generated
    public void a(ack ack2) {
        this.aAi = ack2;
    }

    @Generated
    public void b(ack ack2) {
        this.aAj = ack2;
    }

    @Generated
    public void v(float f2) {
        this.aAk = f2;
    }

    @Generated
    public void a(ArrayList<abo> arrayList) {
        this.cj = arrayList;
    }
}

