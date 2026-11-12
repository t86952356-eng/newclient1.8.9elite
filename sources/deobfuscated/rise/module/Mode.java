/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.module;

import hackclient.rise.ahd;
import hackclient.rise.ahe;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import rise.Client;
import rise.util.InstanceAccess;
import rise.value.Value;

public abstract class Mode<T>
implements InstanceAccess,
ahd,
ahe {
    private final String name;
    private final T aRt;
    private final List<Value<?>> values = new ArrayList();

    public void a() {
        Client.a.e().b(this);
        this.onEnable();
    }

    public void unregister() {
        Client.a.e().c(this);
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
        return this.name;
    }

    @Generated
    public T wy() {
        return this.aRt;
    }

    @Generated
    public List<Value<?>> getValues() {
        return this.values;
    }

    @Generated
    public Mode(String string, T t2) {
        this.name = string;
        this.aRt = t2;
    }
}

