/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aea;
import hackclient.rise.ahd;
import hackclient.rise.ahe;
import hackclient.rise.akh;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

public abstract class akg<T>
implements aea,
ahd,
ahe {
    private final String aRs;
    private final T aRt;
    private final List<akh<?>> aRu = new ArrayList();

    public void a() {
        a.a.e().b(this);
        this.onEnable();
    }

    public void unregister() {
        a.a.e().c(this);
        this.onDisable();
    }

    @Override
    public void toggle() {
    }

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }

    @Generated
    public String getName() {
        return this.aRs;
    }

    @Generated
    public T wy() {
        return this.aRt;
    }

    @Generated
    public List<akh<?>> getValues() {
        return this.aRu;
    }

    @Generated
    public akg(String string, T t2) {
        this.aRs = string;
        this.aRt = t2;
    }
}

