/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.afj;
import hackclient.rise.afk;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import net.minecraft.client.gui.cz;
import rise.module.Mode;
import rise.module.Module;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;
import rise.value.Value;

public class akn
extends Value<Vector2d>
implements InstanceAccess {
    public Vector2d aqy = new Vector2d(100.0, 100.0);
    public Vector2d atP = new Vector2d(100.0, 100.0);
    public Vector2d aHP = new Vector2d(100.0, 100.0);
    public Vector2d aRK = new Vector2d(-1.0, -1.0);
    public afj aRL = new afj(afk.aGW, 600L);
    public afj aRM = new afj(afk.aHn, 300L);
    public cz aRN = new cz(aER);
    public boolean fX = true;
    public boolean aRO;

    public akn(String string, Module module, Vector2d vector2d) {
        super(string, module, vector2d);
    }

    public akn(String string, Module module, Vector2d vector2d, boolean bl2) {
        super(string, module, vector2d);
        this.fX = bl2;
    }

    public akn(String string, Module module, Vector2d vector2d, boolean bl2, boolean bl3) {
        super(string, module, vector2d);
        this.fX = bl2 && !bl3;
        this.aRO = bl3;
    }

    public akn(String string, Mode<?> mode, Vector2d vector2d) {
        super(string, mode, vector2d);
    }

    public akn(String string, Module module, Vector2d vector2d, BooleanSupplier booleanSupplier) {
        super(string, module, vector2d, booleanSupplier);
    }

    public akn(String string, Mode<?> mode, Vector2d vector2d, BooleanSupplier booleanSupplier) {
        super(string, mode, vector2d, booleanSupplier);
    }

    @Override
    public List<Value<?>> wz() {
        return null;
    }

    @Override
    public void n(Vector2d vector2d) {
        cz cz2;
        this.aHP = vector2d;
        if (this.aRK.x == -1.0 && this.aRK.y == -1.0) {
            this.aRK = this.aHP;
        }
        if (this.aqy.x > (double)((float)(cz2 = akn.aER.jY).getScaledWidth() / 2.0f)) {
            this.atP.x += this.aRK.x - this.aHP.x;
            this.aqy = this.atP;
        }
        if (this.aqy.y > (double)((float)cz2.getScaledHeight() / 2.0f)) {
            this.atP.y += this.aRK.y - this.aHP.y;
            this.aqy = this.atP;
        }
        this.aRK = vector2d;
        this.aRN = cz2;
    }

    @Generated
    public void h(Vector2d vector2d) {
        this.aqy = vector2d;
    }

    @Generated
    public void i(Vector2d vector2d) {
        this.atP = vector2d;
    }

    @Override
    @Generated
    public void o(Vector2d vector2d) {
        this.aRK = vector2d;
    }

    @Generated
    public void d(afj afj2) {
        this.aRL = afj2;
    }

    @Generated
    public void e(afj afj2) {
        this.aRM = afj2;
    }

    @Generated
    public void d(cz cz2) {
        this.aRN = cz2;
    }

    @Generated
    public void m(boolean bl2) {
        this.fX = bl2;
    }

    @Generated
    public void N(boolean bl2) {
        this.aRO = bl2;
    }
}

