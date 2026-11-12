/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aea;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.gi;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import net.minecraft.client.gui.cz;

public class akn
extends akh<aka>
implements aea {
    public aka aqy = new aka(100.0, 100.0);
    public aka atP = new aka(100.0, 100.0);
    public aka aHP = new aka(100.0, 100.0);
    public aka aRK = new aka(-1.0, -1.0);
    public afj aRL = new afj(afk.aGW, 600L);
    public afj aRM = new afj(afk.aHn, 300L);
    public cz aRN = new cz(aER);
    public boolean fX = true;
    public boolean aRO;

    public akn(String string, gi gi2, aka aka2) {
        super(string, gi2, aka2);
    }

    public akn(String string, gi gi2, aka aka2, boolean bl2) {
        super(string, gi2, aka2);
        this.fX = bl2;
    }

    public akn(String string, gi gi2, aka aka2, boolean bl2, boolean bl3) {
        super(string, gi2, aka2);
        this.fX = bl2 && !bl3;
        this.aRO = bl3;
    }

    public akn(String string, akg<?> akg2, aka aka2) {
        super(string, akg2, aka2);
    }

    public akn(String string, gi gi2, aka aka2, BooleanSupplier booleanSupplier) {
        super(string, gi2, aka2, booleanSupplier);
    }

    public akn(String string, akg<?> akg2, aka aka2, BooleanSupplier booleanSupplier) {
        super(string, akg2, aka2, booleanSupplier);
    }

    @Override
    public List<akh<?>> wz() {
        return null;
    }

    @Override
    public void n(aka aka2) {
        cz cz2;
        this.aHP = aka2;
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
        this.aRK = aka2;
        this.aRN = cz2;
    }

    @Generated
    public void h(aka aka2) {
        this.aqy = aka2;
    }

    @Generated
    public void i(aka aka2) {
        this.atP = aka2;
    }

    @Override
    @Generated
    public void o(aka aka2) {
        this.aRK = aka2;
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

