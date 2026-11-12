/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.server.management;

import com.google.common.base.Predicate;
import net.minecraft.util.ct;

class PreYggdrasilConverter$1
implements Predicate<String> {
    PreYggdrasilConverter$1() {
    }

    public boolean cP(String string) {
        return !ct.cU(string);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.cP((String)object);
    }
}

