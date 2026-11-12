/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.reflect;

import java.lang.reflect.Field;
import net.minecraft.src.a;
import net.optifine.reflect.f;
import net.optifine.reflect.h;

public class c
implements f {
    private h end = null;
    private String ene = null;

    public c(h h2, String string) {
        this.end = h2;
        this.ene = string;
    }

    @Override
    public Field aDx() {
        Class clazz = this.end.aDz();
        if (clazz == null) {
            return null;
        }
        try {
            Field field = this.f(clazz, this.ene);
            field.setAccessible(true);
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            a.fO("(Reflector) Field not present: " + clazz.getName() + "." + this.ene);
            return null;
        }
        catch (SecurityException securityException) {
            securityException.printStackTrace();
            return null;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    private Field f(Class clazz, String string) {
        Field[] fieldArray = clazz.getDeclaredFields();
        for (int i2 = 0; i2 < fieldArray.length; ++i2) {
            Field field = fieldArray[i2];
            if (!field.getName().equals(string)) continue;
            return field;
        }
        if (clazz == Object.class) {
            throw new NoSuchFieldException(string);
        }
        return this.f(clazz.getSuperclass(), string);
    }
}

