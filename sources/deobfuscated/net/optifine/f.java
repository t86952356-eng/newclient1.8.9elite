/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
package net.optifine;

import com.google.common.collect.AbstractIterator;
import net.optifine.d;
import net.optifine.e;

class f
extends AbstractIterator {
    private d dVC = null;
    final /* synthetic */ e dVD;

    f(e e2) {
        this.dVD = e2;
    }

    protected d aAj() {
        if (this.dVC == null) {
            this.dVC = new d(this.dVD.dVA.wt(), this.dVD.dVA.wu(), this.dVD.dVA.wx(), 3);
            return this.dVC;
        }
        if (this.dVC.equals(this.dVD.dVB)) {
            return (d)this.endOfData();
        }
        int n2 = this.dVC.wt();
        int n3 = this.dVC.wu();
        int n4 = this.dVC.wx();
        if (n2 < this.dVD.dVB.wt()) {
            ++n2;
        } else if (n3 < this.dVD.dVB.wu()) {
            n2 = this.dVD.dVA.wt();
            ++n3;
        } else if (n4 < this.dVD.dVB.wx()) {
            n2 = this.dVD.dVA.wt();
            n3 = this.dVD.dVA.wu();
            ++n4;
        }
        this.dVC.ah(n2, n3, n4);
        return this.dVC;
    }

    protected Object computeNext() {
        return this.aAj();
    }
}

