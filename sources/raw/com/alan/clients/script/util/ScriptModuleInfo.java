/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.util;

import hackclient.rise.gj;
import hackclient.rise.gl;
import java.lang.annotation.Annotation;

public final class ScriptModuleInfo
implements gl {
    private final String name;
    private final String description;

    public ScriptModuleInfo(String string, String string2) {
        this.name = string;
        this.description = string2;
    }

    @Override
    public String[] aliases() {
        return new String[]{this.name};
    }

    @Override
    public String description() {
        return this.description;
    }

    @Override
    public gj category() {
        return gj.lk;
    }

    @Override
    public int keyBind() {
        return 0;
    }

    @Override
    public boolean autoEnabled() {
        return false;
    }

    @Override
    public boolean allowDisable() {
        return true;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return ScriptModuleInfo.class;
    }
}

