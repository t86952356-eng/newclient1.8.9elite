/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.entity.ai;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.entity.c;
import net.minecraft.entity.p;

public class bl {
    p cAv;
    List<c> cAw = Lists.newArrayList();
    List<c> cAx = Lists.newArrayList();

    public bl(p p2) {
        this.cAv = p2;
    }

    public void Xn() {
        this.cAw.clear();
        this.cAx.clear();
    }

    public boolean al(c c2) {
        if (this.cAw.contains(c2)) {
            return true;
        }
        if (this.cAx.contains(c2)) {
            return false;
        }
        this.cAv.baU.dDt.eY("canSee");
        boolean bl2 = this.cAv.ai(c2);
        this.cAv.baU.dDt.ajv();
        if (bl2) {
            this.cAw.add(c2);
        } else {
            this.cAx.add(c2);
        }
        return bl2;
    }
}

