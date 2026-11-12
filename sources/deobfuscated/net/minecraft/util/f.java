/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
package net.minecraft.util;

import com.google.common.collect.AbstractIterator;
import net.minecraft.util.e;
import net.minecraft.util.g;

class f
extends AbstractIterator<g> {
    private g duc = null;
    final /* synthetic */ e dud;

    f(e e2) {
        this.dud = e2;
    }

    protected g arf() {
        if (this.duc == null) {
            this.duc = new g(this.dud.dua.wt(), this.dud.dua.wu(), this.dud.dua.wx());
            return this.duc;
        }
        if (this.duc.equals(this.dud.dub)) {
            return (g)this.endOfData();
        }
        int n2 = this.duc.wt();
        int n3 = this.duc.wu();
        int n4 = this.duc.wx();
        if (n2 < this.dud.dub.wt()) {
            ++n2;
        } else if (n3 < this.dud.dub.wu()) {
            n2 = this.dud.dua.wt();
            ++n3;
        } else if (n4 < this.dud.dub.wx()) {
            n2 = this.dud.dua.wt();
            n3 = this.dud.dua.wu();
            ++n4;
        }
        this.duc.alM = n2;
        this.duc.alN = n3;
        this.duc.aRr = n4;
        return this.duc;
    }

    protected /* synthetic */ Object computeNext() {
        return this.arf();
    }
}

