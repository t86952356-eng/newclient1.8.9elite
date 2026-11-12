/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import java.util.Set;
import java.util.TreeMap;
import net.minecraft.nbt.n;
import net.minecraft.world.j;
import net.minecraft.world.k;

public class i {
    private final TreeMap<String, j> dCo = new TreeMap();

    public i() {
        this.a("doFireTick", "true", k.dCv);
        this.a("mobGriefing", "true", k.dCv);
        this.a("keepInventory", "false", k.dCv);
        this.a("doMobSpawning", "true", k.dCv);
        this.a("doMobLoot", "true", k.dCv);
        this.a("doTileDrops", "true", k.dCv);
        this.a("doEntityDrops", "true", k.dCv);
        this.a("commandBlockOutput", "true", k.dCv);
        this.a("naturalRegeneration", "true", k.dCv);
        this.a("doDaylightCycle", "true", k.dCv);
        this.a("logAdminCommands", "true", k.dCv);
        this.a("showDeathMessages", "true", k.dCv);
        this.a("randomTickSpeed", "3", k.dCw);
        this.a("sendCommandFeedback", "true", k.dCv);
        this.a("reducedDebugInfo", "false", k.dCv);
    }

    public void a(String string, String string2, k k2) {
        this.dCo.put(string, new j(string2, k2));
    }

    public void Y(String string, String string2) {
        j j2 = this.dCo.get(string);
        if (j2 != null) {
            j2.cp(string2);
        } else {
            this.a(string, string2, k.dCu);
        }
    }

    public String gv(String string) {
        j j2 = this.dCo.get(string);
        return j2 != null ? j2.avj() : "";
    }

    public boolean gw(String string) {
        j j2 = this.dCo.get(string);
        return j2 != null && j2.avk();
    }

    public int gx(String string) {
        j j2 = this.dCo.get(string);
        return j2 != null ? j2.aeK() : 0;
    }

    public n avh() {
        n n2 = new n();
        for (String string : this.dCo.keySet()) {
            j j2 = this.dCo.get(string);
            n2.R(string, j2.avj());
        }
        return n2;
    }

    public void a(n n2) {
        for (String string : n2.aeQ()) {
            String string2 = n2.eK(string);
            this.Y(string, string2);
        }
    }

    public String[] avi() {
        Set<String> set = this.dCo.keySet();
        return set.toArray(new String[set.size()]);
    }

    public boolean gy(String string) {
        return this.dCo.containsKey(string);
    }

    public boolean a(String string, k k2) {
        j j2 = this.dCo.get(string);
        return j2 != null && (j2.avl() == k2 || k2 == k.dCu);
    }
}

