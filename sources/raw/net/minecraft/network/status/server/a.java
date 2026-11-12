/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.TypeAdapterFactory
 */
package net.minecraft.network.status.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.ao;
import net.minecraft.network.ap;
import net.minecraft.network.aq;
import net.minecraft.network.ar;
import net.minecraft.network.as;
import net.minecraft.network.at;
import net.minecraft.util.ba;
import net.minecraft.util.bb;
import net.minecraft.util.v;
import net.minecraft.util.x;

public class a
implements aj<net.minecraft.network.status.a> {
    private static final Gson dfR = new GsonBuilder().registerTypeAdapter(ap.class, (Object)new aq()).registerTypeAdapter(ar.class, (Object)new as()).registerTypeAdapter(ao.class, (Object)new at()).registerTypeHierarchyAdapter(ba.class, (Object)new bb()).registerTypeHierarchyAdapter(v.class, (Object)new x()).registerTypeAdapterFactory((TypeAdapterFactory)new net.minecraft.util.at()).create();
    private ao dfS;

    public a() {
    }

    public a(ao ao2) {
        this.dfS = ao2;
    }

    @Override
    public void a(ak ak2) {
        this.dfS = (ao)dfR.fromJson(ak2.gs(Short.MAX_VALUE), ao.class);
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(dfR.toJson((Object)this.dfS));
    }

    @Override
    public void a(net.minecraft.network.status.a a2) {
        a2.a(this);
    }

    public ao aix() {
        return this.dfS;
    }
}

