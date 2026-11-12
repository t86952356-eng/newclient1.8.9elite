/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonObject
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.server.management;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.ParameterizedType;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import net.minecraft.server.management.UserList$1;
import net.minecraft.server.management.UserList$Serializer;
import net.minecraft.server.management.UserListEntry;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserList<K, V extends UserListEntry<K>> {
    protected static final Logger dmY = LogManager.getLogger();
    protected final Gson dmZ;
    private final File dna;
    private final Map<String, V> dnb = Maps.newHashMap();
    private boolean dnc = true;
    private static final ParameterizedType dnd = new UserList$1();

    public UserList(File file) {
        this.dna = file;
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        gsonBuilder.registerTypeHierarchyAdapter(UserListEntry.class, (Object)new UserList$Serializer(this));
        this.dmZ = gsonBuilder.create();
    }

    public boolean amC() {
        return this.dnc;
    }

    public void co(boolean bl2) {
        this.dnc = bl2;
    }

    public void a(V v2) {
        this.dnb.put(this.t(((UserListEntry)v2).wD()), v2);
        try {
            this.amG();
        }
        catch (IOException iOException) {
            dmY.warn("Could not save the list after adding a user.", (Throwable)iOException);
        }
    }

    public V r(K k2) {
        this.amE();
        return (V)((UserListEntry)this.dnb.get(this.t(k2)));
    }

    public void s(K k2) {
        this.dnb.remove(this.t(k2));
        try {
            this.amG();
        }
        catch (IOException iOException) {
            dmY.warn("Could not save the list after removing a user.", (Throwable)iOException);
        }
    }

    public String[] amD() {
        return this.dnb.keySet().toArray(new String[this.dnb.size()]);
    }

    protected String t(K k2) {
        return k2.toString();
    }

    protected boolean u(K k2) {
        return this.dnb.containsKey(this.t(k2));
    }

    private void amE() {
        ArrayList arrayList = Lists.newArrayList();
        for (Object object : this.dnb.values()) {
            if (!((UserListEntry)object).amf()) continue;
            arrayList.add(((UserListEntry)object).wD());
        }
        for (Object object : arrayList) {
            this.dnb.remove(object);
        }
    }

    protected UserListEntry<K> y(JsonObject jsonObject) {
        return new UserListEntry<Object>(null, jsonObject);
    }

    protected Map<String, V> amF() {
        return this.dnb;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void amG() {
        Collection<V> collection = this.dnb.values();
        String string = this.dmZ.toJson(collection);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = Files.newWriter((File)this.dna, (Charset)Charsets.UTF_8);
            bufferedWriter.write(string);
        }
        catch (Throwable throwable) {
            IOUtils.closeQuietly(bufferedWriter);
            throw throwable;
        }
        IOUtils.closeQuietly((Writer)bufferedWriter);
    }
}

