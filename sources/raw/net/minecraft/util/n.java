/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.scoreboard.d;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.i;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ba;
import net.minecraft.util.ct;
import net.minecraft.util.p;

public class n
extends p {
    private final String duk;
    private final String dul;
    private String cpv = "";

    public n(String string, String string2) {
        this.duk = string;
        this.dul = string2;
    }

    public String getName() {
        return this.duk;
    }

    public String ari() {
        return this.dul;
    }

    public void cp(String string) {
        this.cpv = string;
    }

    @Override
    public String arj() {
        MinecraftServer minecraftServer = MinecraftServer.afs();
        if (minecraftServer != null && minecraftServer.alh() && ct.cU(this.cpv)) {
            g g2;
            i i2 = minecraftServer.ha(0).SD();
            if (i2.a(this.duk, g2 = i2.fo(this.dul))) {
                d d2 = i2.b(this.duk, g2);
                this.cp(String.format("%d", d2.akm()));
            } else {
                this.cpv = "";
            }
        }
        return this.cpv;
    }

    public n ark() {
        n n2 = new n(this.duk, this.dul);
        n2.cp(this.cpv);
        n2.a(this.arp().arG());
        for (ba ba2 : this.aro()) {
            n2.n(ba2.arl());
        }
        return n2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof n)) {
            return false;
        }
        n n2 = (n)object;
        return this.duk.equals(n2.duk) && this.dul.equals(n2.dul) && super.equals(object);
    }

    @Override
    public String toString() {
        return "ScoreComponent{name='" + this.duk + "'objective='" + this.dul + "', siblings=" + String.valueOf(this.dun) + ", style=" + String.valueOf(this.arp()) + "}";
    }

    @Override
    public /* synthetic */ ba arl() {
        return this.ark();
    }
}

