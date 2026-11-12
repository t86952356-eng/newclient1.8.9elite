/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.entity.ai;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.ai.ay;
import net.minecraft.entity.ai.e;
import net.minecraft.profiler.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ax {
    private static final Logger czH = LogManager.getLogger();
    private final List<ay> czI = Lists.newArrayList();
    private final List<ay> czJ = Lists.newArrayList();
    private final d czK;
    private int czL;
    private final int czM = 3;

    public ax(d d2) {
        this.czK = d2;
    }

    public void a(int n2, e e2) {
        this.czI.add(new ay(this, n2, e2));
    }

    public void a(e e2) {
        Iterator<ay> iterator = this.czI.iterator();
        while (iterator.hasNext()) {
            ay ay2 = iterator.next();
            e e3 = ay2.czN;
            if (e3 != e2) continue;
            if (this.czJ.contains(ay2)) {
                e3.WE();
                this.czJ.remove(ay2);
            }
            iterator.remove();
        }
    }

    public void WW() {
        this.czK.eY("goalSetup");
        if (this.czL++ % this.czM == 0) {
            for (ay ay2 : this.czI) {
                boolean bl2 = this.czJ.contains(ay2);
                if (bl2) {
                    if (this.b(ay2) && this.a(ay2)) continue;
                    ay2.czN.WE();
                    this.czJ.remove(ay2);
                }
                if (!this.b(ay2) || !ay2.czN.WC()) continue;
                ay2.czN.WG();
                this.czJ.add(ay2);
            }
        } else {
            Iterator<ay> iterator = this.czJ.iterator();
            while (iterator.hasNext()) {
                ay ay2;
                ay2 = iterator.next();
                if (this.a(ay2)) continue;
                ay2.czN.WE();
                iterator.remove();
            }
        }
        this.czK.ajv();
        this.czK.eY("goalTick");
        for (ay ay2 : this.czJ) {
            ay2.czN.WF();
        }
        this.czK.ajv();
    }

    private boolean a(ay ay2) {
        boolean bl2 = ay2.czN.WD();
        return bl2;
    }

    private boolean b(ay ay2) {
        for (ay ay3 : this.czI) {
            if (ay3 == ay2 || !(ay2.hH >= ay3.hH ? !this.a(ay2, ay3) && this.czJ.contains(ay3) : !ay3.czN.WH() && this.czJ.contains(ay3))) continue;
            return false;
        }
        return true;
    }

    private boolean a(ay ay2, ay ay3) {
        return (ay2.czN.WI() & ay3.czN.WI()) == 0;
    }
}

