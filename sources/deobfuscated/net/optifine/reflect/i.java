/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.reflect;

import java.lang.reflect.Constructor;
import net.minecraft.src.a;
import net.optifine.reflect.g;
import net.optifine.reflect.h;

public class i {
    private h end = null;
    private Class[] esY = null;
    private boolean esX = false;
    private Constructor esZ = null;

    public i(h h2, Class[] classArray) {
        this.end = h2;
        this.esY = classArray;
        Constructor constructor = this.aDC();
    }

    public Constructor aDC() {
        if (this.esX) {
            return this.esZ;
        }
        this.esX = true;
        Class clazz = this.end.aDz();
        if (clazz == null) {
            return null;
        }
        try {
            this.esZ = i.a(clazz, this.esY);
            if (this.esZ == null) {
                a.fN("(Reflector) Constructor not present: " + clazz.getName() + ", params: " + a.c(this.esY));
            }
            if (this.esZ != null) {
                this.esZ.setAccessible(true);
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return this.esZ;
    }

    private static Constructor a(Class clazz, Class[] classArray) {
        Constructor<?>[] constructorArray = clazz.getDeclaredConstructors();
        for (int i2 = 0; i2 < constructorArray.length; ++i2) {
            Constructor<?> constructor = constructorArray[i2];
            Class[] classArray2 = constructor.getParameterTypes();
            if (!g.a(classArray, classArray2)) continue;
            return constructor;
        }
        return null;
    }

    public boolean aDA() {
        return this.esX ? this.esZ != null : this.aDC() != null;
    }

    public void aDD() {
        this.esX = true;
        this.esZ = null;
    }
}

