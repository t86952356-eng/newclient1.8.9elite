/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.reflect;

import java.lang.reflect.Field;
import net.optifine.reflect.b;
import net.optifine.reflect.c;
import net.optifine.reflect.d;
import net.optifine.reflect.f;
import net.optifine.reflect.g;
import net.optifine.reflect.h;

public class j {
    private f eta = null;
    private boolean esX = false;
    private Field etb = null;

    public j(h h2, String string) {
        this(new c(h2, string));
    }

    public j(h h2, String string, boolean bl2) {
        this(new c(h2, string), bl2);
    }

    public j(h h2, Class clazz) {
        this(h2, clazz, 0);
    }

    public j(h h2, Class clazz, int n2) {
        this(new d(h2, clazz, n2));
    }

    public j(Field field) {
        this(new b(field));
    }

    public j(f f2) {
        this(f2, false);
    }

    public j(f f2, boolean bl2) {
        this.eta = f2;
        if (!bl2) {
            this.aDE();
        }
    }

    public Field aDE() {
        if (this.esX) {
            return this.etb;
        }
        this.esX = true;
        this.etb = this.eta.aDx();
        if (this.etb != null) {
            this.etb.setAccessible(true);
        }
        return this.etb;
    }

    public Object wD() {
        return g.a(null, this);
    }

    public void n(Object object) {
        g.a(null, this, object);
    }

    public void c(Object object, Object object2) {
        g.a(object, this, object2);
    }

    public boolean aDA() {
        return this.aDE() != null;
    }
}

