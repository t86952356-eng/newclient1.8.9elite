/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.reflect;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import net.minecraft.client.d;
import net.optifine.reflect.f;
import net.optifine.reflect.n;

public class a
implements f {
    @Override
    public Field aDx() {
        Class<d> clazz = d.class;
        Field field = this.aDy();
        if (field == null) {
            net.minecraft.src.a.fO("(Reflector) Field not present: " + clazz.getName() + ".actionKeyF3 (field renderChunksMany not found)");
            return null;
        }
        Field field2 = n.a(d.class, field, Boolean.TYPE, 0);
        if (field2 == null) {
            net.minecraft.src.a.fO("(Reflector) Field not present: " + clazz.getName() + ".actionKeyF3");
            return null;
        }
        return field2;
    }

    private Field aDy() {
        d d2 = d.AZ();
        boolean bl2 = d2.bhR;
        Field[] fieldArray = d.class.getDeclaredFields();
        d2.bhR = true;
        Field[] fieldArray2 = n.a((Object)d2, fieldArray, Boolean.TYPE, (Object)Boolean.TRUE);
        d2.bhR = false;
        Field[] fieldArray3 = n.a((Object)d2, fieldArray, Boolean.TYPE, (Object)Boolean.FALSE);
        d2.bhR = bl2;
        HashSet<Field> hashSet = new HashSet<Field>(Arrays.asList(fieldArray2));
        HashSet<Field> hashSet2 = new HashSet<Field>(Arrays.asList(fieldArray3));
        HashSet<Field> hashSet3 = new HashSet<Field>(hashSet);
        hashSet3.retainAll(hashSet2);
        Field[] fieldArray4 = hashSet3.toArray(new Field[hashSet3.size()]);
        return fieldArray4.length != 1 ? null : fieldArray4[0];
    }
}

