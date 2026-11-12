/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fg;
import java.util.ArrayList;
import java.util.HashMap;
import net.minecraft.entity.c;

public class r {
    private final HashMap<Object, ArrayList<Integer>> bn = new HashMap();
    @dm
    public final dk<fg> bo = fg2 -> this.clear();

    public void init() {
        a.a.e().b(this);
    }

    public boolean a(c c2) {
        for (ArrayList<Integer> arrayList : this.bn.values()) {
            if (!arrayList.contains(c2.getEntityId())) continue;
            return true;
        }
        return false;
    }

    public boolean a(Object object, c c2) {
        if (!this.bn.containsKey(object)) {
            return false;
        }
        return this.bn.get(object).contains(c2.getEntityId());
    }

    public void b(Object object, c c2) {
        ArrayList<Integer> arrayList;
        int n2 = c2.getEntityId();
        if (!this.bn.containsKey(object)) {
            this.bn.put(object, new ArrayList());
        }
        if (!(arrayList = this.bn.get(object)).contains(n2)) {
            arrayList.add(n2);
        }
    }

    public void c(Object object, c c2) {
        if (this.bn.containsKey(object)) {
            ArrayList<Integer> arrayList = this.bn.get(object);
            arrayList.remove((Object)c2.getEntityId());
        }
    }

    public void clear() {
        this.bn.clear();
    }

    public void a(Object object) {
        if (!this.bn.containsKey(object)) {
            return;
        }
        this.bn.get(object).clear();
    }
}

