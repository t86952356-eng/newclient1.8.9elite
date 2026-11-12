/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aja;
import hackclient.rise.ajc;
import java.util.ArrayList;
import lombok.Generated;
import rise.util.InstanceAccess;

public class ge
implements InstanceAccess {
    private final ArrayList<Runnable> kK = new ArrayList();
    aja kL = null;

    public ge(aja aja2) {
        this.kL = aja2;
    }

    public ge() {
    }

    public void a(ajc ajc2) {
        ArrayList<Runnable> arrayList = new ArrayList<Runnable>(this.kK);
        if (arrayList.isEmpty()) {
            return;
        }
        if (this.kL == null) {
            aER.Aw().az(false);
            arrayList.forEach(Runnable::run);
        } else {
            this.kL.a(ajc2, 0.0f, arrayList);
            if (ajc2 == ajc.aQF) {
                this.kL.jA();
            }
        }
    }

    public void clear() {
        this.kK.clear();
    }

    public void c(Runnable runnable) {
        this.kK.add(runnable);
    }

    @Generated
    public ArrayList<Runnable> dT() {
        return this.kK;
    }

    @Generated
    public aja dU() {
        return this.kL;
    }
}

