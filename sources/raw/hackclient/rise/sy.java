/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aec;
import java.util.Collection;

public class sy<T>
extends aec<T>
implements Cloneable {
    public sy(int n2) {
        super(n2);
    }

    public sy(Collection<? extends T> collection, int n2) {
        super(collection, n2);
    }

    public sy(sy<? extends T> sy2) {
        super(sy2, sy2.si());
    }

    public T jw() {
        return (T)this.getLast();
    }

    @Override
    public T get(int n2) {
        return (T)super.get(this.size() - n2 - 1);
    }

    public sy<T> jx() {
        return (sy)super.clone();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.jx();
    }
}

