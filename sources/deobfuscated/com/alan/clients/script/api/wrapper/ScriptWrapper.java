/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.alan.clients.script.api.wrapper;

import com.alan.clients.script.api.API;
import lombok.Generated;

public abstract class ScriptWrapper<T>
extends API {
    protected T wrapped;

    @Generated
    public ScriptWrapper(T t2) {
        this.wrapped = t2;
    }
}

