/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import java.util.List;
import net.optifine.util.o;
import net.optifine.util.q;

public class p
implements q<Object> {
    private List<Object> ect;
    private int Ho;
    private boolean evs;

    @Override
    public void Y(List<Object> list) {
        if (this.evs) {
            throw new RuntimeException("Iterator still used, oldList: " + String.valueOf(this.ect) + ", newList: " + String.valueOf(list));
        }
        this.ect = list;
        this.Ho = 0;
        this.evs = list != null && this.Ho < list.size();
    }

    @Override
    public Object next() {
        if (!this.evs) {
            return null;
        }
        if (this.Ho <= this.ect.size()) {
            try {
                Object object = this.ect.get(this.Ho);
                ++this.Ho;
                this.evs = this.Ho < this.ect.size();
                return object;
            }
            catch (Exception exception) {
                ++this.Ho;
                this.evs = this.Ho < this.ect.size();
                System.out.println("IteratorChache: 65");
                exception.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (!this.evs) {
            o.a(this);
            return false;
        }
        return this.evs;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}

