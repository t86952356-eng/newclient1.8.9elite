/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 */
package net.minecraft.server.management;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.player.a;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PreYggdrasilConverter$1;
import net.minecraft.server.management.PreYggdrasilConverter$2;
import net.minecraft.util.ct;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PreYggdrasilConverter {
    private static final Logger dmx = LogManager.getLogger();
    public static final File dmy = new File("banned-ips.txt");
    public static final File dmz = new File("banned-players.txt");
    public static final File dmA = new File("ops.txt");
    public static final File dmB = new File("white-list.txt");

    private static void a(MinecraftServer minecraftServer, Collection<String> collection, ProfileLookupCallback profileLookupCallback) {
        String[] stringArray = (String[])Iterators.toArray((Iterator)Iterators.filter(collection.iterator(), (Predicate)new PreYggdrasilConverter$1()), String.class);
        if (minecraftServer.alu()) {
            minecraftServer.alR().findProfilesByNames(stringArray, Agent.MINECRAFT, profileLookupCallback);
        } else {
            for (String string : stringArray) {
                UUID uUID = a.e(new GameProfile(null, string));
                GameProfile gameProfile = new GameProfile(uUID, string);
                profileLookupCallback.onProfileLookupSucceeded(gameProfile);
            }
        }
    }

    public static String fF(String string) {
        if (!ct.cU(string) && string.length() <= 16) {
            MinecraftServer minecraftServer = MinecraftServer.afs();
            GameProfile gameProfile = minecraftServer.alS().fE(string);
            if (gameProfile != null && gameProfile.getId() != null) {
                return gameProfile.getId().toString();
            }
            if (!minecraftServer.all() && minecraftServer.alu()) {
                ArrayList arrayList = Lists.newArrayList();
                PreYggdrasilConverter$2 preYggdrasilConverter$2 = new PreYggdrasilConverter$2(minecraftServer, (List)arrayList);
                PreYggdrasilConverter.a(minecraftServer, Lists.newArrayList((Object[])new String[]{string}), preYggdrasilConverter$2);
                return arrayList.size() > 0 && ((GameProfile)arrayList.get(0)).getId() != null ? ((GameProfile)arrayList.get(0)).getId().toString() : "";
            }
            return a.e(new GameProfile(null, string)).toString();
        }
        return string;
    }
}

