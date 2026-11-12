/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.src.a;
import net.minecraft.util.b;
import net.optifine.reflect.g;
import net.optifine.reflect.h;
import net.optifine.reflect.j;

public class f {
    private static final h eMD = new h(net.minecraft.world.chunk.a.class);
    private static final j eME = f.aIY();
    private static final j eMF = new j(eMD, int[].class, 0);

    public static boolean d(net.minecraft.world.chunk.a a2) {
        return g.a((Object)a2, eME, true);
    }

    public static int a(net.minecraft.world.chunk.a a2, b b2) {
        int[] nArray = (int[])g.a(a2, eMF);
        if (nArray != null && nArray.length == 256) {
            int n2;
            int n3 = b2.wt() & 0xF;
            int n4 = n3 | (n2 = b2.wx() & 0xF) << 4;
            int n5 = nArray[n4];
            if (n5 >= 0) {
                return n5;
            }
            b b3 = a2.aS(b2);
            return b3.wu();
        }
        return -1;
    }

    private static j aIY() {
        try {
            Field field;
            Field field3;
            Object object2;
            net.minecraft.world.chunk.a a2 = new net.minecraft.world.chunk.a(null, 0, 0);
            ArrayList arrayList = new ArrayList();
            ArrayList<Object> arrayList2 = new ArrayList<Object>();
            Field[] fieldArray = net.minecraft.world.chunk.a.class.getDeclaredFields();
            for (int i2 = 0; i2 < fieldArray.length; ++i2) {
                object2 = fieldArray[i2];
                if (((Field)object2).getType() != Boolean.TYPE) continue;
                ((Field)object2).setAccessible(true);
                arrayList.add(object2);
                arrayList2.add(((Field)object2).get(a2));
            }
            a2.cD(false);
            ArrayList<Object> arrayList3 = new ArrayList<Object>();
            for (Object object3 : arrayList) {
                field3 = (Field)object3;
                arrayList3.add(field3.get(a2));
            }
            a2.cD(true);
            object2 = new ArrayList<Object>();
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                field = field3 = iterator.next();
                object2.add(field.get(a2));
            }
            ArrayList<Field> arrayList4 = new ArrayList<Field>();
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                field = (Field)arrayList.get(i2);
                Boolean bl2 = (Boolean)arrayList3.get(i2);
                Boolean bl3 = (Boolean)object2.get(i2);
                if (bl2.booleanValue() || !bl3.booleanValue()) continue;
                arrayList4.add(field);
                Boolean bl4 = (Boolean)arrayList2.get(i2);
                field.set(a2, bl4);
            }
            if (arrayList4.size() == 1) {
                Field field2 = (Field)arrayList4.get(0);
                return new j(field2);
            }
        }
        catch (Exception exception) {
            a.warn(exception.getClass().getName() + " " + exception.getMessage());
        }
        a.warn("Error finding Chunk.hasEntities");
        return new j(new h(net.minecraft.world.chunk.a.class), "hasEntities");
    }
}

