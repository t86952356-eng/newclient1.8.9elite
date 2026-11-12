/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.reflect;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import net.minecraft.src.a;
import net.optifine.reflect.f;

public class e
implements f {
    private Field enc = null;

    public e(Class clazz, Class[] classArray, Class clazz2, Class[] classArray2, String string) {
        Field[] fieldArray = clazz.getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < fieldArray.length; ++i2) {
            Field field = fieldArray[i2];
            arrayList.add(field.getType());
        }
        ArrayList<Class> arrayList2 = new ArrayList<Class>(Arrays.asList(classArray));
        arrayList2.add(clazz2);
        arrayList2.addAll(Arrays.asList(classArray2));
        int n2 = Collections.indexOfSubList(arrayList, arrayList2);
        if (n2 < 0) {
            a.fO("(Reflector) Field not found: " + string);
        } else {
            int n3 = Collections.indexOfSubList(arrayList.subList(n2 + 1, arrayList.size()), arrayList2);
            if (n3 >= 0) {
                a.fO("(Reflector) More than one match found for field: " + string);
            } else {
                int n4 = n2 + classArray.length;
                this.enc = fieldArray[n4];
            }
        }
    }

    @Override
    public Field aDx() {
        return this.enc;
    }
}

