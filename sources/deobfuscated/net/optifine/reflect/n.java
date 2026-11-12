/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.optifine.reflect.g;
import net.optifine.reflect.h;
import net.optifine.reflect.j;

public class n {
    public static Field a(Class clazz, Class clazz2) {
        try {
            Field[] fieldArray = clazz.getDeclaredFields();
            for (int i2 = 0; i2 < fieldArray.length; ++i2) {
                Field field = fieldArray[i2];
                if (field.getType() != clazz2) continue;
                field.setAccessible(true);
                return field;
            }
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Field[] b(Class clazz, Class clazz2) {
        try {
            Field[] fieldArray = clazz.getDeclaredFields();
            return n.a(fieldArray, clazz2);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Field[] a(Field[] fieldArray, Class clazz) {
        try {
            ArrayList<Field> arrayList = new ArrayList<Field>();
            for (int i2 = 0; i2 < fieldArray.length; ++i2) {
                Field field = fieldArray[i2];
                if (field.getType() != clazz) continue;
                field.setAccessible(true);
                arrayList.add(field);
            }
            Field[] fieldArray2 = arrayList.toArray(new Field[arrayList.size()]);
            return fieldArray2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Field[] a(Class clazz, Field field, Class clazz2) {
        try {
            Field[] fieldArray = clazz.getDeclaredFields();
            List<Field> list = Arrays.asList(fieldArray);
            int n2 = list.indexOf(field);
            if (n2 < 0) {
                return new Field[0];
            }
            List<Field> list2 = list.subList(n2 + 1, list.size());
            Field[] fieldArray2 = list2.toArray(new Field[list2.size()]);
            return n.a(fieldArray2, clazz2);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Field[] a(Object object, Field[] fieldArray, Class clazz, Object object2) {
        try {
            ArrayList<Field> arrayList = new ArrayList<Field>();
            for (int i2 = 0; i2 < fieldArray.length; ++i2) {
                Field field = fieldArray[i2];
                if (field.getType() != clazz) continue;
                boolean bl2 = Modifier.isStatic(field.getModifiers());
                if (object == null && !bl2 || object != null && bl2) continue;
                field.setAccessible(true);
                Object object3 = field.get(object);
                if (object3 == object2) {
                    arrayList.add(field);
                    continue;
                }
                if (object3 == null || object2 == null || !object3.equals(object2)) continue;
                arrayList.add(field);
            }
            Field[] fieldArray2 = arrayList.toArray(new Field[arrayList.size()]);
            return fieldArray2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Field a(Class clazz, Class clazz2, int n2) {
        Field[] fieldArray = n.b(clazz, clazz2);
        return n2 >= 0 && n2 < fieldArray.length ? fieldArray[n2] : null;
    }

    public static Field a(Class clazz, Field field, Class clazz2, int n2) {
        Field[] fieldArray = n.a(clazz, field, clazz2);
        return n2 >= 0 && n2 < fieldArray.length ? fieldArray[n2] : null;
    }

    public static Object a(Object object, Class clazz, Class clazz2) {
        j j2 = n.c(clazz, clazz2);
        return j2 == null ? null : (!j2.aDA() ? null : g.a(object, j2));
    }

    public static Object a(Object object, Class clazz, Class clazz2, int n2) {
        j j2 = n.b(clazz, clazz2, n2);
        return j2 == null ? null : (!j2.aDA() ? null : g.a(object, j2));
    }

    public static boolean a(Object object, Class clazz, Class clazz2, Object object2) {
        j j2 = n.c(clazz, clazz2);
        return j2 != null && j2.aDA() && g.a(object, j2, object2);
    }

    public static boolean a(Object object, Class clazz, Class clazz2, int n2, Object object2) {
        j j2 = n.b(clazz, clazz2, n2);
        return j2 != null && j2.aDA() && g.a(object, j2, object2);
    }

    public static j c(Class clazz, Class clazz2) {
        Field field = n.a(clazz, clazz2);
        if (field == null) {
            return null;
        }
        h h2 = new h(clazz);
        return new j(h2, field.getName());
    }

    public static j b(Class clazz, Class clazz2, int n2) {
        Field field = n.a(clazz, clazz2, n2);
        if (field == null) {
            return null;
        }
        h h2 = new h(clazz);
        return new j(h2, field.getName());
    }
}

