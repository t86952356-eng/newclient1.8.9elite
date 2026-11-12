/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.command;

import com.google.common.base.Predicate;
import java.util.Map;
import net.minecraft.entity.c;
import net.minecraft.entity.player.e;
import net.minecraft.scoreboard.d;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.i;
import net.minecraft.server.MinecraftServer;

class bi
implements Predicate<c> {
    final /* synthetic */ Map coF;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bi(Map map) {
        this.coF = map;
    }

    public boolean B(c c2) {
        i i2 = MinecraftServer.afs().ha(0).SD();
        for (Map.Entry entry : this.coF.entrySet()) {
            String string;
            g g2;
            String string2 = (String)entry.getKey();
            boolean bl2 = false;
            if (string2.endsWith("_min") && string2.length() > 4) {
                bl2 = true;
                string2 = string2.substring(0, string2.length() - 4);
            }
            if ((g2 = i2.fo(string2)) == null) {
                return false;
            }
            String string3 = string = c2 instanceof e ? c2.xU() : c2.Ul().toString();
            if (!i2.a(string, g2)) {
                return false;
            }
            d d2 = i2.b(string, g2);
            int n2 = d2.akm();
            if (n2 < (Integer)entry.getValue() && bl2) {
                return false;
            }
            if (n2 <= (Integer)entry.getValue() || bl2) continue;
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.B((c)object);
    }
}

