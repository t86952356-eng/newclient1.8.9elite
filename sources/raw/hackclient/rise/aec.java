/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import lombok.Generated;

public class aec<T>
extends LinkedList<T>
implements Serializable {
    private int aET;

    public aec(int n2) {
        this.aET = n2;
    }

    public aec(Collection<? extends T> collection, int n2) {
        super(collection);
        this.aET = n2;
    }

    @Override
    public boolean add(T t2) {
        if (this.size() >= this.si()) {
            this.removeFirst();
        }
        return super.add(t2);
    }

    public boolean sg() {
        return this.size() >= this.si();
    }

    public aec<T> sh() {
        aec aec2 = new aec(this.aET);
        for (int i2 = this.size() - 1; i2 >= 0; --i2) {
            aec2.add((T)this.get(i2));
        }
        return aec2;
    }

    @Generated
    public int si() {
        return this.aET;
    }

    @Generated
    public void aj(int n2) {
        this.aET = n2;
    }
}

