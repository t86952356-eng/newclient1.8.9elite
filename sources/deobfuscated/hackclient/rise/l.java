/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.d;
import hackclient.rise.f;
import hackclient.rise.g;
import hackclient.rise.h;
import hackclient.rise.i;
import hackclient.rise.j;
import hackclient.rise.k;
import hackclient.rise.m;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public final class l {
    public static final Class<?>[] ak = new Class[]{j.class, i.class, g.class, h.class, f.class, k.class};
    private static final List<Constructor<?>> al = new ArrayList();

    public static List<d> a(m m2) {
        ArrayList<d> arrayList = new ArrayList<d>();
        for (Constructor<?> constructor : al) {
            try {
                arrayList.add((d)constructor.newInstance(m2));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return arrayList;
    }

    public static void U() {
        for (Class<?> clazz : ak) {
            try {
                al.add(clazz.getConstructor(m.class));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

