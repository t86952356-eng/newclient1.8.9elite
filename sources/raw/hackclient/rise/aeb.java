/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class aeb<K, V>
extends HashMap<K, V>
implements Serializable {
    private final ArrayList<V> aES = new ArrayList();

    public void g(V v2) {
        this.aES.add(v2);
    }

    public ArrayList<V> sf() {
        ArrayList arrayList = new ArrayList(super.values());
        arrayList.addAll(this.aES);
        return arrayList;
    }

    public void h(V v2) {
        for (Map.Entry entry : this.entrySet()) {
            if (!entry.getValue().equals(v2)) continue;
            this.remove(entry.getKey());
            break;
        }
        this.aES.remove(v2);
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.sf();
    }
}

