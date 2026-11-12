/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 */
package net.minecraft.nbt;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.UUID;
import net.minecraft.nbt.g;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.util.ct;

public final class aa {
    public static GameProfile x(n n2) {
        UUID uUID;
        String string = null;
        String string2 = null;
        if (n2.C("Name", 8)) {
            string = n2.eK("Name");
        }
        if (n2.C("Id", 8)) {
            string2 = n2.eK("Id");
        }
        if (ct.cU(string) && ct.cU(string2)) {
            return null;
        }
        try {
            uUID = UUID.fromString(string2);
        }
        catch (Throwable throwable) {
            uUID = null;
        }
        GameProfile gameProfile = new GameProfile(uUID, string);
        if (n2.C("Properties", 10)) {
            n n3 = n2.eN("Properties");
            for (String string3 : n3.aeQ()) {
                v v2 = n3.D(string3, 10);
                for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                    n n4 = v2.gi(i2);
                    String string4 = n4.eK("Value");
                    if (n4.C("Signature", 8)) {
                        gameProfile.getProperties().put((Object)string3, (Object)new Property(string3, string4, n4.eK("Signature")));
                        continue;
                    }
                    gameProfile.getProperties().put((Object)string3, (Object)new Property(string3, string4));
                }
            }
        }
        return gameProfile;
    }

    public static n a(n n2, GameProfile gameProfile) {
        if (!ct.cU(gameProfile.getName())) {
            n2.R("Name", gameProfile.getName());
        }
        if (gameProfile.getId() != null) {
            n2.R("Id", gameProfile.getId().toString());
        }
        if (!gameProfile.getProperties().isEmpty()) {
            n n3 = new n();
            for (String string : gameProfile.getProperties().keySet()) {
                v v2 = new v();
                for (Property property : gameProfile.getProperties().get((Object)string)) {
                    n n4 = new n();
                    n4.R("Value", property.getValue());
                    if (property.hasSignature()) {
                        n4.R("Signature", property.getSignature());
                    }
                    v2.a(n4);
                }
                n3.b(string, v2);
            }
            n2.b("Properties", n3);
        }
        return n2;
    }

    public static boolean a(g g2, g g3, boolean bl2) {
        if (g2 == g3) {
            return true;
        }
        if (g2 == null) {
            return true;
        }
        if (g3 == null) {
            return false;
        }
        if (!g2.getClass().equals(g3.getClass())) {
            return false;
        }
        if (g2 instanceof n) {
            n n2 = (n)g2;
            n n3 = (n)g3;
            for (String string : n2.aeQ()) {
                g g4 = n2.eB(string);
                if (aa.a(g4, n3.eB(string), bl2)) continue;
                return false;
            }
            return true;
        }
        if (g2 instanceof v && bl2) {
            v v2 = (v)g2;
            v v3 = (v)g3;
            if (v2.aeS() == 0) {
                return v3.aeS() == 0;
            }
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                g g5 = v2.gn(i2);
                boolean bl3 = false;
                for (int i3 = 0; i3 < v3.aeS(); ++i3) {
                    if (!aa.a(g5, v3.gn(i3), bl2)) continue;
                    bl3 = true;
                    break;
                }
                if (bl3) continue;
                return false;
            }
            return true;
        }
        return g2.equals(g3);
    }
}

