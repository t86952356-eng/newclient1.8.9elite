/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.openjdk.nashorn.api.scripting.ClassFilter
 */
package com.alan.clients.script.util;

import org.openjdk.nashorn.api.scripting.ClassFilter;

public final class ScriptClassFilter
implements ClassFilter {
    public boolean exposeToScripts(String string) {
        return string.startsWith("com.alan.clients.script.api");
    }
}

