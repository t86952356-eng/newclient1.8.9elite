/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.optifine.an;

public class ap {
    private final Map<Integer, an> ecs = new HashMap<Integer, an>();
    private final List<an> ect = new ArrayList<an>();
    private boolean aCw = false;

    public an a(int n2, an an2) {
        an an3 = this.ecs.put(n2, an2);
        this.aBj();
        return an3;
    }

    public an jh(int n2) {
        return this.ecs.get(n2);
    }

    public int size() {
        return this.ecs.size();
    }

    public an ji(int n2) {
        an an2 = this.ecs.remove(n2);
        if (an2 != null) {
            this.aBj();
        }
        return an2;
    }

    public void clear() {
        this.ecs.clear();
        this.ect.clear();
        this.aBj();
    }

    private void aBj() {
        this.aCw = true;
    }

    public List<an> aBk() {
        if (this.aCw) {
            this.ect.clear();
            this.ect.addAll(this.ecs.values());
            this.aCw = false;
        }
        return this.ect;
    }
}

