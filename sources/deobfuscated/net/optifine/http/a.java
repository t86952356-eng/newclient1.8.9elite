/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.http;

import net.minecraft.client.Minecraft;
import net.optifine.http.d;
import net.optifine.http.m;

public class a
extends Thread {
    private String ekj = null;
    private m ekk = null;

    public a(String string, m m2) {
        this.ekj = string;
        this.ekk = m2;
    }

    @Override
    public void run() {
        try {
            byte[] byArray = d.b(this.ekj, Minecraft.getMinecraft().Bp());
            this.ekk.b(this.ekj, byArray, null);
        }
        catch (Exception exception) {
            this.ekk.b(this.ekj, null, exception);
        }
    }

    public String aCL() {
        return this.ekj;
    }

    public m aCM() {
        return this.ekk;
    }
}

