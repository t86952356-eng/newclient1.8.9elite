/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import net.minecraft.src.a;
import net.optifine.reflect.g;
import net.optifine.reflect.h;

public class m {
    private h end = null;
    private String etj = null;
    private Class[] etk = null;
    private boolean esX = false;
    private Method etl = null;

    public m(h h2, String string) {
        this(h2, string, null, false);
    }

    public m(h h2, String string, Class[] classArray) {
        this(h2, string, classArray, false);
    }

    public m(h h2, String string, Class[] classArray, boolean bl2) {
        this.end = h2;
        this.etj = string;
        this.etk = classArray;
        if (!bl2) {
            Method method = this.aDI();
        }
    }

    public Method aDI() {
        if (this.esX) {
            return this.etl;
        }
        this.esX = true;
        Class clazz = this.end.aDz();
        if (clazz == null) {
            return null;
        }
        try {
            if (this.etk == null) {
                Method[] methodArray = m.g(clazz, this.etj);
                if (methodArray.length <= 0) {
                    a.fO("(Reflector) Method not present: " + clazz.getName() + "." + this.etj);
                    return null;
                }
                if (methodArray.length > 1) {
                    a.warn("(Reflector) More than one method found: " + clazz.getName() + "." + this.etj);
                    for (int i2 = 0; i2 < methodArray.length; ++i2) {
                        Method method = methodArray[i2];
                        a.warn("(Reflector)  - " + String.valueOf(method));
                    }
                    return null;
                }
                this.etl = methodArray[0];
            } else {
                this.etl = m.a(clazz, this.etj, this.etk);
            }
            if (this.etl == null) {
                a.fO("(Reflector) Method not present: " + clazz.getName() + "." + this.etj);
                return null;
            }
            this.etl.setAccessible(true);
            return this.etl;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    public boolean aDA() {
        return this.esX ? this.etl != null : this.aDI() != null;
    }

    public Class aDJ() {
        Method method = this.aDI();
        return method == null ? null : method.getReturnType();
    }

    public void aDD() {
        this.esX = true;
        this.etl = null;
    }

    public static Method a(Class clazz, String string, Class[] classArray) {
        Method[] methodArray = clazz.getDeclaredMethods();
        for (int i2 = 0; i2 < methodArray.length; ++i2) {
            Class[] classArray2;
            Method method = methodArray[i2];
            if (!method.getName().equals(string) || !g.a(classArray, classArray2 = method.getParameterTypes())) continue;
            return method;
        }
        return null;
    }

    public static Method[] g(Class clazz, String string) {
        ArrayList<Method> arrayList = new ArrayList<Method>();
        Method[] methodArray = clazz.getDeclaredMethods();
        for (int i2 = 0; i2 < methodArray.length; ++i2) {
            Method method = methodArray[i2];
            if (!method.getName().equals(string)) continue;
            arrayList.add(method);
        }
        Method[] methodArray2 = arrayList.toArray(new Method[arrayList.size()]);
        return methodArray2;
    }
}

