/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net.minecraft.entity.ai;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collections;
import net.minecraft.entity.ai.ah;
import net.minecraft.entity.ai.ai;
import net.minecraft.entity.ai.av;
import net.minecraft.entity.j;
import net.minecraft.entity.r;

public class ag<T extends r>
extends av {
    protected final Class<T> cyT;
    private final int cyU;
    protected final ai cyV;
    protected Predicate<? super T> cyW;
    protected r qX;

    public ag(j j2, Class<T> clazz, boolean bl2) {
        this(j2, clazz, bl2, false);
    }

    public ag(j j2, Class<T> clazz, boolean bl2, boolean bl3) {
        this(j2, clazz, 10, bl2, bl3, null);
    }

    public ag(j j2, Class<T> clazz, int n2, boolean bl2, boolean bl3, Predicate<? super T> predicate) {
        super(j2, bl2, bl3);
        this.cyT = clazz;
        this.cyU = n2;
        this.cyV = new ai(j2);
        this.eO(1);
        this.cyW = new ah(this, predicate);
    }

    @Override
    public boolean WC() {
        if (this.cyU > 0 && this.czA.VB().nextInt(this.cyU) != 0) {
            return false;
        }
        double d2 = this.WV();
        Predicate predicate = this.czA.baU.a(this.cyT, this.czA.Us().ad(d2, 4.0, d2), Predicates.and(this.cyW, net.minecraft.util.ah.dvJ));
        Collections.sort(predicate, this.cyV);
        if (predicate.isEmpty()) {
            return false;
        }
        this.qX = (r)predicate.get(0);
        return true;
    }

    @Override
    public void WG() {
        this.czA.S(this.qX);
        super.WG();
    }
}

