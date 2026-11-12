/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.expr;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.optifine.expr.a;
import net.optifine.expr.f;
import net.optifine.expr.g;
import net.optifine.expr.h;
import net.optifine.expr.j;
import net.optifine.expr.k;
import net.optifine.expr.l;
import net.optifine.expr.m;
import net.optifine.expr.o;
import net.optifine.expr.q;
import net.optifine.expr.u;
import net.optifine.expr.w;
import net.optifine.expr.x;
import net.optifine.expr.y;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class d {
    private final q ehM;

    public d(q q2) {
        this.ehM = q2;
    }

    public o if(String string) {
        l l2 = this.ih(string);
        if (!(l2 instanceof o)) {
            throw new u("Not a float expression: " + String.valueOf((Object)l2.aCq()));
        }
        return (o)l2;
    }

    public m ig(String string) {
        l l2 = this.ih(string);
        if (!(l2 instanceof m)) {
            throw new u("Not a boolean expression: " + String.valueOf((Object)l2.aCq()));
        }
        return (m)l2;
    }

    public l ih(String string) {
        try {
            w[] wArray = x.ij(string);
            if (wArray == null) {
                return null;
            }
            ArrayDeque<w> arrayDeque = new ArrayDeque<w>(Arrays.asList(wArray));
            return this.a(arrayDeque);
        }
        catch (IOException iOException) {
            throw new u(iOException.getMessage(), iOException);
        }
    }

    private l a(Deque<w> deque) {
        if (deque.isEmpty()) {
            return null;
        }
        LinkedList<l> linkedList = new LinkedList<l>();
        LinkedList<w> linkedList2 = new LinkedList<w>();
        l l2 = this.b(deque);
        d.a(l2, "Missing expression");
        linkedList.add(l2);
        w w2;
        while ((w2 = deque.poll()) != null) {
            if (w2.aCF() != y.ejp) {
                throw new u("Invalid operator: " + String.valueOf(w2));
            }
            l l3 = this.b(deque);
            d.a(l3, "Missing expression");
            linkedList2.add(w2);
            linkedList.add(l3);
        }
        return this.c(linkedList, linkedList2);
    }

    private l c(List<l> list, List<w> list2) {
        LinkedList<k> linkedList = new LinkedList<k>();
        for (w w2 : list2) {
            k k2 = k.ii(w2.getText());
            d.a((Object)k2, "Invalid operator: " + String.valueOf(w2));
            linkedList.add(k2);
        }
        return this.d(list, linkedList);
    }

    private l d(List<l> list, List<k> list2) {
        if (list.size() != list2.size() + 1) {
            throw new u("Invalid infix expression, expressions: " + list.size() + ", operators: " + list2.size());
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MIN_VALUE;
        for (k k2 : list2) {
            n2 = Math.min(k2.aCy(), n2);
            n3 = Math.max(k2.aCy(), n3);
        }
        if (n3 >= n2 && n3 - n2 <= 10) {
            for (int i2 = n3; i2 >= n2; --i2) {
                this.a(list, list2, i2);
            }
            if (list.size() == 1 && list2.size() == 0) {
                return list.get(0);
            }
            throw new u("Error merging operators, expressions: " + list.size() + ", operators: " + list2.size());
        }
        throw new u("Invalid infix precedence, min: " + n2 + ", max: " + n3);
    }

    private void a(List<l> list, List<k> list2, int n2) {
        for (int i2 = 0; i2 < list2.size(); ++i2) {
            k k2 = list2.get(i2);
            if (k2.aCy() != n2) continue;
            list2.remove(i2);
            l l2 = list.remove(i2);
            l l3 = list.remove(i2);
            l l4 = d.a(k2, new l[]{l2, l3});
            list.add(i2, l4);
            --i2;
        }
    }

    private l b(Deque<w> deque) {
        w w2 = deque.poll();
        d.a(w2, "Missing expression");
        switch (w2.aCF()) {
            case ejo: {
                return d.a(w2);
            }
            case ejn: {
                k k2 = this.a(w2, deque);
                if (k2 != null) {
                    return this.a(k2, deque);
                }
                return this.b(w2);
            }
            case ejr: {
                return this.b(w2, deque);
            }
            case ejp: {
                k k3 = k.ii(w2.getText());
                d.a((Object)k3, "Invalid operator: " + String.valueOf(w2));
                if (k3 == k.eia) {
                    return this.b(deque);
                }
                if (k3 == k.eib) {
                    l l2 = this.b(deque);
                    return d.a(k.eif, new l[]{l2});
                }
                if (k3 != k.eiH) break;
                l l3 = this.b(deque);
                return d.a(k.eiH, new l[]{l3});
            }
        }
        throw new u("Invalid expression: " + String.valueOf(w2));
    }

    private static l a(w w2) {
        float f2 = net.minecraft.src.a.b(w2.getText(), Float.NaN);
        return new a(f2);
    }

    private k a(w w2, Deque<w> deque) {
        w w3 = deque.peek();
        if (w2 != null && w3.aCF() == y.ejr) {
            k k2 = k.ii(w3.getText());
            d.a((Object)k2, "Unknown function: " + String.valueOf(w3));
            return k2;
        }
        k k3 = k.ii(w3.getText());
        if (k3 == null) {
            return null;
        }
        if (k3.a(new l[0]) > 0) {
            throw new u("Missing arguments: " + String.valueOf((Object)k3));
        }
        return k3;
    }

    private l a(k k2, Deque<w> deque) {
        w w2;
        if (k2.a(new l[0]) == 0 && ((w2 = deque.peek()) == null || w2.aCF() != y.ejr)) {
            return d.a(k2, new l[0]);
        }
        w2 = deque.poll();
        Deque<w> deque2 = d.a(deque, y.ejs, true);
        l[] lArray = this.c(deque2);
        return d.a(k2, lArray);
    }

    private l[] c(Deque<w> deque) {
        ArrayList<l> arrayList = new ArrayList<l>();
        while (true) {
            Deque<w> deque2;
            l l2;
            if ((l2 = this.a(deque2 = d.a(deque, y.ejq, false))) == null) {
                l[] lArray = arrayList.toArray(new l[arrayList.size()]);
                return lArray;
            }
            arrayList.add(l2);
        }
    }

    private static l a(k k2, l[] lArray) {
        f[] fArray = k2.b(lArray);
        if (lArray.length != fArray.length) {
            throw new u("Invalid number of arguments, function: \"" + k2.getName() + "\", count arguments: " + lArray.length + ", should be: " + fArray.length);
        }
        for (int i2 = 0; i2 < lArray.length; ++i2) {
            f f2;
            l l2 = lArray[i2];
            f f3 = l2.aCq();
            if (f3 == (f2 = fArray[i2])) continue;
            throw new u("Invalid argument type, function: \"" + k2.getName() + "\", index: " + i2 + ", type: " + String.valueOf((Object)f3) + ", should be: " + String.valueOf((Object)f2));
        }
        if (k2.aCq() == f.ehO) {
            return new h(k2, lArray);
        }
        if (k2.aCq() == f.ehQ) {
            return new g(k2, lArray);
        }
        if (k2.aCq() == f.ehP) {
            return new j(k2, lArray);
        }
        throw new u("Unknown function type: " + String.valueOf((Object)k2.aCq()) + ", function: " + k2.getName());
    }

    private l b(w w2) {
        if (this.ehM == null) {
            throw new u("Model variable not found: " + String.valueOf(w2));
        }
        l l2 = this.ehM.ib(w2.getText());
        if (l2 == null) {
            throw new u("Model variable not found: " + String.valueOf(w2));
        }
        return l2;
    }

    private l b(w w2, Deque<w> deque) {
        Deque<w> deque2 = d.a(deque, y.ejs, true);
        return this.a(deque2);
    }

    private static Deque<w> a(Deque<w> deque, y y2, boolean bl2) {
        ArrayDeque<w> arrayDeque = new ArrayDeque<w>();
        int n2 = 0;
        Iterator<w> iterator = deque.iterator();
        while (iterator.hasNext()) {
            w w2 = iterator.next();
            iterator.remove();
            if (n2 == 0 && w2.aCF() == y2) {
                return arrayDeque;
            }
            arrayDeque.add(w2);
            if (w2.aCF() == y.ejr) {
                ++n2;
            }
            if (w2.aCF() != y.ejs) continue;
            --n2;
        }
        if (bl2) {
            throw new u("Missing end token: " + String.valueOf((Object)y2));
        }
        return arrayDeque;
    }

    private static void a(Object object, String string) {
        if (object == null) {
            throw new u(string);
        }
    }
}

