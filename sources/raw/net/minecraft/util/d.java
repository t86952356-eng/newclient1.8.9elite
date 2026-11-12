/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
package net.minecraft.util;

import com.google.common.collect.AbstractIterator;
import net.minecraft.util.b;
import net.minecraft.util.c;

class d
extends AbstractIterator<b> {
    private b dtY = null;
    final /* synthetic */ c dtZ;

    d(c c2) {
        this.dtZ = c2;
    }

    protected b are() {
        if (this.dtY == null) {
            this.dtY = this.dtZ.dtW;
            return this.dtY;
        }
        if (this.dtY.equals(this.dtZ.dtX)) {
            return (b)this.endOfData();
        }
        int n2 = this.dtY.wt();
        int n3 = this.dtY.wu();
        int n4 = this.dtY.wx();
        if (n2 < this.dtZ.dtX.wt()) {
            ++n2;
        } else if (n3 < this.dtZ.dtX.wu()) {
            n2 = this.dtZ.dtW.wt();
            ++n3;
        } else if (n4 < this.dtZ.dtX.wx()) {
            n2 = this.dtZ.dtW.wt();
            n3 = this.dtZ.dtW.wu();
            ++n4;
        }
        this.dtY = new b(n2, n3, n4);
        return this.dtY;
    }

    protected /* synthetic */ Object computeNext() {
        return this.are();
    }
}

