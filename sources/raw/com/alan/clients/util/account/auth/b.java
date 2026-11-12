/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 */
package com.alan.clients.util.account.auth;

import com.alan.clients.util.account.auth.c;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class b {
    @Expose
    @SerializedName(value="items")
    private c[] aFH;

    private b() {
    }

    private boolean sB() {
        boolean bl2 = false;
        boolean bl3 = false;
        for (c c2 : this.aFH) {
            if (c2.gK.equals("product_minecraft")) {
                bl2 = true;
                continue;
            }
            if (!c2.gK.equals("game_minecraft")) continue;
            bl3 = true;
        }
        return bl2 && bl3;
    }
}

