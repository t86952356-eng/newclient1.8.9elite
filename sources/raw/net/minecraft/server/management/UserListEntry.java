/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net.minecraft.server.management;

import com.google.gson.JsonObject;

public class UserListEntry<T> {
    private final T dnf;

    public UserListEntry(T t2) {
        this.dnf = t2;
    }

    protected UserListEntry(T t2, JsonObject jsonObject) {
        this.dnf = t2;
    }

    T wD() {
        return this.dnf;
    }

    boolean amf() {
        return false;
    }

    protected void x(JsonObject jsonObject) {
    }
}

