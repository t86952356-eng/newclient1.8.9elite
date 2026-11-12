/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.optifine.render.h;
import net.optifine.util.t;
import net.optifine.util.v;

public class w {
    public static void main(String[] stringArray) {
        h h2;
        int n2;
        t<h> t2 = new t<h>();
        ArrayList<h> arrayList = new ArrayList<h>();
        ArrayList<h> arrayList2 = new ArrayList<h>();
        Random random = new Random();
        int n3 = 100;
        for (n2 = 0; n2 < 100; ++n2) {
            h2 = new h();
            h2.setPosition(n2);
            arrayList.add(h2);
        }
        for (n2 = 0; n2 < 100000; ++n2) {
            v<h> v2;
            w.b(arrayList, arrayList2, 100);
            w.a(t2, arrayList2.size());
            if (n2 % 5 == 0) {
                w.b(t2);
            }
            if (random.nextBoolean()) {
                if (arrayList.isEmpty()) continue;
                h2 = (h)arrayList.get(random.nextInt(arrayList.size()));
                v2 = h2.aEi();
                if (random.nextBoolean()) {
                    t2.a(v2);
                    w.fN("Add first: " + h2.getPosition());
                } else if (random.nextBoolean()) {
                    t2.b(v2);
                    w.fN("Add last: " + h2.getPosition());
                } else {
                    if (arrayList2.isEmpty()) continue;
                    h h3 = (h)arrayList2.get(random.nextInt(arrayList2.size()));
                    v<h> v3 = h3.aEi();
                    t2.a(v3, v2);
                    w.fN("Add after: " + h3.getPosition() + ", " + h2.getPosition());
                }
                arrayList.remove(h2);
                arrayList2.add(h2);
                continue;
            }
            if (arrayList2.isEmpty()) continue;
            h2 = (h)arrayList2.get(random.nextInt(arrayList2.size()));
            v2 = h2.aEi();
            t2.c(v2);
            w.fN("Remove: " + h2.getPosition());
            arrayList2.remove(h2);
            arrayList.add(h2);
        }
    }

    private static void b(t<h> t2) {
        StringBuffer stringBuffer = new StringBuffer();
        t2.iterator().forEachRemaining(v2 -> {
            v v3 = v2;
            if (v3.aJj() == null) {
                return;
            }
            h h2 = (h)v3.aJj();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(h2.getPosition());
        });
        w.fN("List: " + String.valueOf(stringBuffer));
    }

    private static void a(t<h> t2, int n2) {
        if (t2.getSize() != n2) {
            throw new RuntimeException("Wrong size, linked: " + t2.getSize() + ", used: " + n2);
        }
        int n3 = 0;
        for (v<h> v2 = t2.aJg(); v2 != null; v2 = v2.aJl()) {
            ++n3;
        }
        if (t2.getSize() != n3) {
            throw new RuntimeException("Wrong count, linked: " + t2.getSize() + ", count: " + n3);
        }
        int n4 = 0;
        for (v<h> v3 = t2.aJh(); v3 != null; v3 = v3.aJk()) {
            ++n4;
        }
        if (t2.getSize() != n4) {
            throw new RuntimeException("Wrong count back, linked: " + t2.getSize() + ", count: " + n4);
        }
    }

    private static void b(List<h> list, List<h> list2, int n2) {
        int n3 = list.size() + list2.size();
        if (n3 != n2) {
            throw new RuntimeException("Total size: " + n3);
        }
    }

    private static void fN(String string) {
        System.out.println(string);
    }
}

