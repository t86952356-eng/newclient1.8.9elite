/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.reflect;

import net.minecraft.src.a;
import net.optifine.reflect.j;
import net.optifine.reflect.m;

public class h {
    private String esW = null;
    private boolean esX = false;
    private Class cyT = null;

    public h(String string) {
        this(string, false);
    }

    public h(String string, boolean bl2) {
        this.esW = string;
        if (!bl2) {
            Class clazz = this.aDz();
        }
    }

    public h(Class clazz) {
        this.cyT = clazz;
        this.esW = clazz.getName();
        this.esX = true;
    }

    public Class aDz() {
        if (this.esX) {
            return this.cyT;
        }
        this.esX = true;
        try {
            this.cyT = Class.forName(this.esW);
        }
        catch (ClassNotFoundException classNotFoundException) {
            a.fO("(Reflector) Class not present: " + this.esW);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return this.cyT;
    }

    public boolean aDA() {
        return this.aDz() != null;
    }

    public String aDB() {
        return this.esW;
    }

    public boolean F(Object object) {
        return this.aDz() != null && this.aDz().isInstance(object);
    }

    public j iv(String string) {
        return new j(this, string);
    }

    public m iw(String string) {
        return new m(this, string);
    }

    public m a(String string, Class[] classArray) {
        return new m(this, string, classArray);
    }

    public m a(String string, Class[] classArray, boolean bl2) {
        return new m(this, string, classArray, bl2);
    }
}

