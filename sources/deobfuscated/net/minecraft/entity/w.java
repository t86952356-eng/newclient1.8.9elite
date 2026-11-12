/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package net.minecraft.entity;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Set;
import net.minecraft.entity.boss.d;
import net.minecraft.entity.item.a;
import net.minecraft.entity.item.b;
import net.minecraft.entity.item.i;
import net.minecraft.entity.item.k;
import net.minecraft.entity.item.v;
import net.minecraft.entity.l;
import net.minecraft.entity.passive.ak;
import net.minecraft.entity.passive.c;
import net.minecraft.entity.player.e;
import net.minecraft.entity.projectile.f;
import net.minecraft.entity.projectile.g;
import net.minecraft.entity.projectile.h;
import net.minecraft.entity.x;
import net.minecraft.entity.y;
import net.minecraft.network.aj;
import net.minecraft.util.bj;
import net.minecraft.util.cl;
import net.minecraft.world.ai;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class w {
    private static final Logger cvr = LogManager.getLogger();
    private final ai cvs;
    private final Set<y> cvt = Sets.newHashSet();
    private final bj<y> cvu = new bj();
    private final int cvv;

    public w(ai ai2) {
        this.cvs = ai2;
        this.cvv = ai2.awt().alE().amo();
    }

    public void aj(net.minecraft.entity.c c2) {
        if (c2 instanceof e) {
            this.a(c2, 512, 2);
            e e2 = (e)c2;
            for (y y2 : this.cvt) {
                if (y2.cvy == e2) continue;
                y2.e(e2);
            }
        } else if (c2 instanceof net.minecraft.entity.projectile.d) {
            this.a(c2, 64, 5, true);
        } else if (c2 instanceof net.minecraft.entity.projectile.a) {
            this.a(c2, 64, 20, false);
        } else if (c2 instanceof g) {
            this.a(c2, 64, 10, false);
        } else if (c2 instanceof net.minecraft.entity.projectile.c) {
            this.a(c2, 64, 10, false);
        } else if (c2 instanceof h) {
            this.a(c2, 64, 10, true);
        } else if (c2 instanceof net.minecraft.entity.item.e) {
            this.a(c2, 64, 10, true);
        } else if (c2 instanceof net.minecraft.entity.item.d) {
            this.a(c2, 64, 4, true);
        } else if (c2 instanceof net.minecraft.entity.projectile.b) {
            this.a(c2, 64, 10, true);
        } else if (c2 instanceof f) {
            this.a(c2, 64, 10, true);
        } else if (c2 instanceof net.minecraft.entity.item.f) {
            this.a(c2, 64, 10, true);
        } else if (c2 instanceof net.minecraft.entity.item.h) {
            this.a(c2, 64, 10, true);
        } else if (c2 instanceof i) {
            this.a(c2, 64, 20, true);
        } else if (c2 instanceof k) {
            this.a(c2, 80, 3, true);
        } else if (c2 instanceof b) {
            this.a(c2, 80, 3, true);
        } else if (c2 instanceof net.minecraft.entity.passive.w) {
            this.a(c2, 64, 3, true);
        } else if (c2 instanceof d) {
            this.a(c2, 80, 3, false);
        } else if (c2 instanceof c) {
            this.a(c2, 80, 3, false);
        } else if (c2 instanceof net.minecraft.entity.boss.b) {
            this.a(c2, 160, 3, true);
        } else if (c2 instanceof ak) {
            this.a(c2, 80, 3, true);
        } else if (c2 instanceof v) {
            this.a(c2, 160, 10, true);
        } else if (c2 instanceof net.minecraft.entity.item.g) {
            this.a(c2, 160, 20, true);
        } else if (c2 instanceof l) {
            this.a(c2, 160, Integer.MAX_VALUE, false);
        } else if (c2 instanceof a) {
            this.a(c2, 160, 3, true);
        } else if (c2 instanceof net.minecraft.entity.item.w) {
            this.a(c2, 160, 20, true);
        } else if (c2 instanceof net.minecraft.entity.item.c) {
            this.a(c2, 256, Integer.MAX_VALUE, false);
        }
    }

    public void a(net.minecraft.entity.c c2, int n2, int n3) {
        this.a(c2, n2, n3, false);
    }

    public void a(net.minecraft.entity.c c2, int n2, int n3, boolean bl2) {
        if (n2 > this.cvv) {
            n2 = this.cvv;
        }
        try {
            if (this.cvu.hF(c2.getEntityId())) {
                throw new IllegalStateException("Entity is already tracked!");
            }
            y y2 = new y(c2, n2, n3, bl2);
            this.cvt.add(y2);
            this.cvu.c(c2.getEntityId(), y2);
            y2.D(this.cvs.dCY);
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Adding entity to track");
            net.minecraft.crash.i i2 = a2.dY("Entity To Track");
            i2.b("Tracking range", n2 + " blocks");
            i2.a("Update interval", new x(this, n3));
            c2.a(i2);
            net.minecraft.crash.i i3 = a2.dY("Entity That Is Already Tracked");
            this.cvu.hE((int)c2.getEntityId()).cvy.a(i3);
            try {
                throw new cl(a2);
            }
            catch (cl cl2) {
                cvr.error("\"Silently\" catching entity tracking error.", (Throwable)cl2);
            }
        }
    }

    public void ak(net.minecraft.entity.c c2) {
        Object object;
        if (c2 instanceof e) {
            object = (e)c2;
            for (y y2 : this.cvt) {
                y2.d((e)object);
            }
        }
        if ((object = this.cvu.hI(c2.getEntityId())) != null) {
            this.cvt.remove(object);
            ((y)object).Wr();
        }
    }

    public void Wp() {
        ArrayList arrayList = Lists.newArrayList();
        try {
            for (y object : this.cvt) {
                object.C(this.cvs.dCY);
                if (!object.cvR || !(object.cvy instanceof e)) continue;
                arrayList.add((e)object.cvy);
            }
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                e e2 = (e)arrayList.get(i2);
                for (y y2 : this.cvt) {
                    if (y2.cvy == e2) continue;
                    y2.e(e2);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void b(e e2) {
        for (y y2 : this.cvt) {
            if (y2.cvy == e2) {
                y2.D(this.cvs.dCY);
                continue;
            }
            y2.e(e2);
        }
    }

    public void a(net.minecraft.entity.c c2, aj aj2) {
        y y2 = this.cvu.hE(c2.getEntityId());
        if (y2 != null) {
            y2.y(aj2);
        }
    }

    public void b(net.minecraft.entity.c c2, aj aj2) {
        y y2 = this.cvu.hE(c2.getEntityId());
        if (y2 != null) {
            y2.z(aj2);
        }
    }

    public void c(e e2) {
        for (y y2 : this.cvt) {
            y2.h(e2);
        }
    }

    public void a(e e2, net.minecraft.world.chunk.a a2) {
        for (y y2 : this.cvt) {
            if (y2.cvy == e2 || y2.cvy.csH != a2.dIK || y2.cvy.csJ != a2.dIL) continue;
            y2.e(e2);
        }
    }
}

