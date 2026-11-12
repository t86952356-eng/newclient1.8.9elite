/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aia;
import java.util.Comparator;

public class ahz
implements Comparator<aia> {
    public int a(aia aia2, aia aia3) {
        return (int)(aia2.vj() + aia2.vl() - (aia3.vj() + aia3.vl()));
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aia)object, (aia)object2);
    }
}

