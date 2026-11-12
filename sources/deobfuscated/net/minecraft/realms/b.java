/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.mojang.authlib.GameProfile
 *  com.mojang.util.UUIDTypeAdapter
 */
package net.minecraft.realms;

import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.net.Proxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.am;
import net.minecraft.client.settings.c;
import net.minecraft.realms.n;
import net.minecraft.util.cp;
import net.minecraft.world.ao;

public class b {
    public static boolean ajy() {
        return Minecraft.getMinecraft().aIY.cgO;
    }

    public static Proxy Bp() {
        return Minecraft.getMinecraft().Bp();
    }

    public static String ajz() {
        cp cp2 = Minecraft.getMinecraft().Bl();
        return cp2 == null ? null : cp2.atD();
    }

    public static String ajA() {
        cp cp2 = Minecraft.getMinecraft().Bl();
        return cp2 == null ? null : cp2.bX();
    }

    public static long aeY() {
        return Minecraft.Bj();
    }

    public static String ajB() {
        return Minecraft.getMinecraft().Bl().atD();
    }

    public static String ajC() {
        return Minecraft.getMinecraft().Bl().getPlayerID();
    }

    public static String getName() {
        return Minecraft.getMinecraft().Bl().bX();
    }

    public static String fb(String string) {
        return Minecraft.getMinecraft().BA().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString((String)string), null), false).getName();
    }

    public static void a(n n2) {
        Minecraft.getMinecraft().a(n2.getProxy());
    }

    public static String ajD() {
        return Minecraft.getMinecraft().bhf.getAbsolutePath();
    }

    public static int ajE() {
        return ao.dEx.awE();
    }

    public static int ajF() {
        return ao.dEy.awE();
    }

    public static int ajG() {
        return ao.dEz.awE();
    }

    public static int ajH() {
        return ao.dEA.awE();
    }

    public static void bX(boolean bl2) {
        Minecraft.getMinecraft().R(bl2);
    }

    public static ListenableFuture<Object> L(String string, String string2) {
        ListenableFuture<Object> listenableFuture = Minecraft.getMinecraft().Bs().L(string, string2);
        return listenableFuture;
    }

    public static void ajI() {
        Minecraft.getMinecraft().Bs().PN();
    }

    public static boolean ajJ() {
        return Minecraft.getMinecraft().aIY.b(c.ckr);
    }

    public static boolean ajK() {
        return Minecraft.getMinecraft().bgR != null && Minecraft.getMinecraft().bgR instanceof am;
    }
}

