/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.InsecureTextureException
 */
package net.minecraft.client.resources;

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.d;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.client.resources.SkinManager$3$1;
import net.minecraft.client.resources.SkinManager$SkinAvailableCallback;

class SkinManager$3
implements Runnable {
    final /* synthetic */ GameProfile ceo;
    final /* synthetic */ boolean cep;
    final /* synthetic */ SkinManager$SkinAvailableCallback ceq;
    final /* synthetic */ SkinManager cer;

    SkinManager$3() {
        this.cer = var1_1;
        this.ceo = var2_2;
        this.cep = n2;
        this.ceq = var4_4;
    }

    @Override
    public void run() {
        HashMap hashMap = Maps.newHashMap();
        try {
            hashMap.putAll(this.cer.ceh.getTextures(this.ceo, this.cep));
        }
        catch (InsecureTextureException insecureTextureException) {
            // empty catch block
        }
        if (hashMap.isEmpty() && this.ceo.getId().equals(d.AZ().Bl().afK().getId())) {
            this.ceo.getProperties().clear();
            this.ceo.getProperties().putAll((Multimap)d.AZ().Bo());
            hashMap.putAll(this.cer.ceh.getTextures(this.ceo, false));
        }
        d.AZ().f(new SkinManager$3$1(this, (Map)hashMap));
    }
}

