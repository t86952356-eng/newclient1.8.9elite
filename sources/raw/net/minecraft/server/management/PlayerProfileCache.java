/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonParseException
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.server.management;

import com.google.common.base.Charsets;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import net.minecraft.entity.player.a;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerProfileCache$1;
import net.minecraft.server.management.PlayerProfileCache$2;
import net.minecraft.server.management.PlayerProfileCache$ProfileEntry;
import net.minecraft.server.management.PlayerProfileCache$Serializer;
import org.apache.commons.io.IOUtils;

public class PlayerProfileCache {
    public static final SimpleDateFormat dml = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    private final Map<String, PlayerProfileCache$ProfileEntry> dmm = Maps.newHashMap();
    private final Map<UUID, PlayerProfileCache$ProfileEntry> dmn = Maps.newHashMap();
    private final LinkedList<GameProfile> dmo = Lists.newLinkedList();
    private final MinecraftServer dmp;
    protected final Gson dmq;
    private final File dmr;
    private static final ParameterizedType dms = new PlayerProfileCache$1();

    public PlayerProfileCache(MinecraftServer minecraftServer, File file) {
        this.dmp = minecraftServer;
        this.dmr = file;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(PlayerProfileCache$ProfileEntry.class, (Object)new PlayerProfileCache$Serializer(this));
        this.dmq = gsonBuilder.create();
        this.load();
    }

    private static GameProfile a(MinecraftServer minecraftServer, String string) {
        GameProfile[] gameProfileArray = new GameProfile[1];
        PlayerProfileCache$2 playerProfileCache$2 = new PlayerProfileCache$2(gameProfileArray);
        minecraftServer.alR().findProfilesByNames(new String[]{string}, Agent.MINECRAFT, (ProfileLookupCallback)playerProfileCache$2);
        if (!minecraftServer.alu() && gameProfileArray[0] == null) {
            UUID uUID = a.e(new GameProfile(null, string));
            GameProfile gameProfile = new GameProfile(uUID, string);
            playerProfileCache$2.onProfileLookupSucceeded(gameProfile);
        }
        return gameProfileArray[0];
    }

    public void f(GameProfile gameProfile) {
        this.a(gameProfile, null);
    }

    private void a(GameProfile gameProfile, Date date) {
        Object object;
        UUID uUID = gameProfile.getId();
        if (date == null) {
            object = Calendar.getInstance();
            ((Calendar)object).setTime(new Date());
            ((Calendar)object).add(2, 1);
            date = ((Calendar)object).getTime();
        }
        object = gameProfile.getName().toLowerCase(Locale.ROOT);
        PlayerProfileCache$ProfileEntry playerProfileCache$ProfileEntry = new PlayerProfileCache$ProfileEntry(this, gameProfile, date);
        if (this.dmn.containsKey(uUID)) {
            PlayerProfileCache$ProfileEntry playerProfileCache$ProfileEntry2 = this.dmn.get(uUID);
            this.dmm.remove(playerProfileCache$ProfileEntry2.Ie().getName().toLowerCase(Locale.ROOT));
            this.dmo.remove(gameProfile);
        }
        this.dmm.put(gameProfile.getName().toLowerCase(Locale.ROOT), playerProfileCache$ProfileEntry);
        this.dmn.put(uUID, playerProfileCache$ProfileEntry);
        this.dmo.addFirst(gameProfile);
        this.sJ();
    }

    public GameProfile fE(String string) {
        String string2 = string.toLowerCase(Locale.ROOT);
        PlayerProfileCache$ProfileEntry playerProfileCache$ProfileEntry = this.dmm.get(string2);
        if (playerProfileCache$ProfileEntry != null && new Date().getTime() >= playerProfileCache$ProfileEntry.dmv.getTime()) {
            this.dmn.remove(playerProfileCache$ProfileEntry.Ie().getId());
            this.dmm.remove(playerProfileCache$ProfileEntry.Ie().getName().toLowerCase(Locale.ROOT));
            this.dmo.remove(playerProfileCache$ProfileEntry.Ie());
            playerProfileCache$ProfileEntry = null;
        }
        if (playerProfileCache$ProfileEntry != null) {
            GameProfile gameProfile = playerProfileCache$ProfileEntry.Ie();
            this.dmo.remove(gameProfile);
            this.dmo.addFirst(gameProfile);
        } else {
            GameProfile gameProfile = PlayerProfileCache.a(this.dmp, string2);
            if (gameProfile != null) {
                this.f(gameProfile);
                playerProfileCache$ProfileEntry = this.dmm.get(string2);
            }
        }
        this.sJ();
        return playerProfileCache$ProfileEntry == null ? null : playerProfileCache$ProfileEntry.Ie();
    }

    public String[] Sl() {
        ArrayList arrayList = Lists.newArrayList(this.dmm.keySet());
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public GameProfile k(UUID uUID) {
        PlayerProfileCache$ProfileEntry playerProfileCache$ProfileEntry = this.dmn.get(uUID);
        return playerProfileCache$ProfileEntry == null ? null : playerProfileCache$ProfileEntry.Ie();
    }

    private PlayerProfileCache$ProfileEntry l(UUID uUID) {
        PlayerProfileCache$ProfileEntry playerProfileCache$ProfileEntry = this.dmn.get(uUID);
        if (playerProfileCache$ProfileEntry != null) {
            GameProfile gameProfile = playerProfileCache$ProfileEntry.Ie();
            this.dmo.remove(gameProfile);
            this.dmo.addFirst(gameProfile);
        }
        return playerProfileCache$ProfileEntry;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void load() {
        BufferedReader bufferedReader;
        block5: {
            bufferedReader = null;
            try {
                bufferedReader = Files.newReader((File)this.dmr, (Charset)Charsets.UTF_8);
                List list = (List)this.dmq.fromJson((Reader)bufferedReader, (Type)dms);
                this.dmm.clear();
                this.dmn.clear();
                this.dmo.clear();
                if (list == null) break block5;
                for (PlayerProfileCache$ProfileEntry playerProfileCache$ProfileEntry : Lists.reverse((List)list)) {
                    if (playerProfileCache$ProfileEntry == null) continue;
                    this.a(playerProfileCache$ProfileEntry.Ie(), playerProfileCache$ProfileEntry.amn());
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
                IOUtils.closeQuietly(bufferedReader);
            }
            catch (JsonParseException jsonParseException) {
                IOUtils.closeQuietly(bufferedReader);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(bufferedReader);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((Reader)bufferedReader);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void sJ() {
        String string = this.dmq.toJson(this.hf(1000));
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = Files.newWriter((File)this.dmr, (Charset)Charsets.UTF_8);
            bufferedWriter.write(string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            IOUtils.closeQuietly(bufferedWriter);
        }
        catch (IOException iOException) {
            IOUtils.closeQuietly(bufferedWriter);
            return;
        }
        catch (Throwable throwable) {
            IOUtils.closeQuietly(bufferedWriter);
            throw throwable;
        }
        IOUtils.closeQuietly((Writer)bufferedWriter);
        return;
    }

    private List<PlayerProfileCache$ProfileEntry> hf(int n2) {
        ArrayList arrayList = Lists.newArrayList();
        for (GameProfile gameProfile : Lists.newArrayList((Iterator)Iterators.limit(this.dmo.iterator(), (int)n2))) {
            PlayerProfileCache$ProfileEntry playerProfileCache$ProfileEntry = this.l(gameProfile.getId());
            if (playerProfileCache$ProfileEntry == null) continue;
            arrayList.add(playerProfileCache$ProfileEntry);
        }
        return arrayList;
    }
}

