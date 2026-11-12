/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.ui.clickgui.value;

import lombok.Generated;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;
import rise.value.Value;

public abstract class ValueComponent
implements InstanceAccess {
    public double jy = 14.0;
    public Vector2d aqy;
    public Value<?> azn;
    public int azo = 255;

    public ValueComponent(Value<?> value) {
        this.azn = value;
    }

    public abstract void a(Vector2d var1, int var2, int var3, float var4);

    public abstract boolean e(int var1, int var2, int var3);

    public abstract void pP();

    public abstract void ci();

    public abstract void b(char var1, int var2);

    @Generated
    public double da() {
        return this.jy;
    }

    @Generated
    public Vector2d nH() {
        return this.aqy;
    }

    @Generated
    public Value<?> qi() {
        return this.azn;
    }

    @Generated
    public int qj() {
        return this.azo;
    }

    @Generated
    public void U(int n2) {
        this.azo = n2;
    }
}

