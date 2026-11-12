/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.abz;
import hackclient.rise.aca;
import hackclient.rise.ack;
import hackclient.rise.agp;
import hackclient.rise.ait;
import java.lang.reflect.Field;
import java.util.ArrayList;
import lombok.Generated;
import rise.ui.clickgui.ModernClickGui;
import rise.ui.clickgui.value.ValueComponent;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;

public final class acb
implements aca,
InstanceAccess {
    private ModernClickGui H;
    private ack aAi = new ack(new ArrayList<float[]>(), new Vector2f(0.0f, 0.0f), this.rP().rQ());
    private ack aAj = new ack(new ArrayList<float[]>(), new Vector2f(0.0f, 0.0f), this.rP().rQ());
    private float aAk = 10.0f;
    public ArrayList<ValueComponent> cj = new ArrayList();

    @Override
    public void aT() {
    }

    @Override
    public void b(int n2, int n3, float f2) {
        Vector2f vector2f = new Vector2f(this.H.pm()).h(this.aAk, 0.0f);
        ait.c((double)vector2f.getX(), (double)(vector2f.getY() + this.aAk), (double)(this.H.alQ.x - this.aAk * 2.0f), 100.0, this.H.pB(), abz.aAb.ql());
        this.aAi.b(this.rP().rQ());
        this.aAi.i(new Vector2f(vector2f.h(this.aAk, 0.0f)));
        this.aAi.qN();
        this.aAj.b(this.rP().rR());
        this.aAj.i(new Vector2f(vector2f.h(this.aAk, 0.0f)));
        this.aAj.qN();
        vector2f = vector2f.h(0.0f, 100.0f);
        vector2f = vector2f.h(0.0f, this.aAk * 2.0f);
        ait.c((double)vector2f.getX(), (double)vector2f.getY(), (double)(this.H.alQ.x - this.aAk * 2.0f), (double)(this.H.pn().getY() - (vector2f.getY() - this.H.pm().getY()) - this.aAk), this.H.pB(), abz.aAb.ql());
        vector2f = vector2f.h(0.0f, this.aAk);
        for (ValueComponent valueComponent : this.pQ()) {
            if (valueComponent.qi() != null && valueComponent.qi().wB() != null && valueComponent.qi().wB().getAsBoolean()) continue;
            valueComponent.U(200);
            valueComponent.a(new Vector2d(vector2f.x + 1.0f + this.aAk + (float)(valueComponent.qi().wB() == null ? 0 : 10), vector2f.y), n2, n3, f2);
            vector2f = vector2f.h(0.0f, (float)valueComponent.da());
        }
    }

    @Override
    public void a(char c2, int n2) {
        for (ValueComponent valueComponent : this.pQ()) {
            valueComponent.b(c2, n2);
        }
    }

    @Override
    public void f(int n2, int n3, int n4) {
        for (ValueComponent valueComponent : this.pQ()) {
            if ((valueComponent.qi() == null || valueComponent.qi().wB() == null || !valueComponent.qi().wB().getAsBoolean()) && valueComponent.e(n2, n3, n4)) break;
        }
    }

    @Override
    public void oW() {
        for (ValueComponent valueComponent : this.pQ()) {
            valueComponent.pP();
        }
    }

    @Override
    public void qo() {
        Vector2f vector2f = new Vector2f(this.H.pm());
        this.aAi.qo();
        this.aAj.qo();
    }

    @Override
    public boolean qq() {
        return true;
    }

    @Override
    public boolean qp() {
        return this.cj.stream().noneMatch(valueComponent -> {
            for (Field field : valueComponent.getClass().getDeclaredFields()) {
                if (!field.getType().equals(agp.class)) continue;
                try {
                    return ((agp)field.get(valueComponent)).ud();
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
    public ModernClickGui v() {
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
    public ArrayList<ValueComponent> pQ() {
        return this.cj;
    }

    @Generated
    public void a(ModernClickGui modernClickGui) {
        this.H = modernClickGui;
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
    public void a(ArrayList<ValueComponent> arrayList) {
        this.cj = arrayList;
    }
}

