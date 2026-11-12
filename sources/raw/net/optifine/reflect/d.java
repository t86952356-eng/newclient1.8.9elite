/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.reflect;

import java.lang.reflect.Field;
import net.minecraft.src.a;
import net.optifine.reflect.f;
import net.optifine.reflect.h;

public class d
implements f {
    private h end = null;
    private Class enf = null;
    private final int eng;

    public d(h h2, Class clazz) {
        this(h2, clazz, 0);
    }

    public d(h h2, Class clazz, int n2) {
        this.end = h2;
        this.enf = clazz;
        this.eng = n2;
    }

    @Override
    public Field aDx() {
        Class clazz = this.end.aDz();
        if (clazz == null) {
            return null;
        }
        try {
            Field[] fieldArray = clazz.getDeclaredFields();
            int n2 = 0;
            for (int i2 = 0; i2 < fieldArray.length; ++i2) {
                Field field = fieldArray[i2];
                if (field.getType() != this.enf) continue;
                if (n2 == this.eng) {
                    field.setAccessible(true);
                    return field;
                }
                ++n2;
            }
            a.fO("(Reflector) Field not present: " + clazz.getName() + ".(type: " + String.valueOf(this.enf) + ", index: " + this.eng + ")");
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
}

