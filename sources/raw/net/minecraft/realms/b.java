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
import net.minecraft.client.d;
import net.minecraft.client.gui.am;
import net.minecraft.client.settings.c;
import net.minecraft.realms.n;
import net.minecraft.util.cp;
import net.minecraft.world.ao;

public class b {
    public static boolean ajy() {
        return d.AZ().aIY.cgO;
    }

    public static Proxy Bp() {
        return d.AZ().Bp();
    }

    public static String ajz() {
        cp cp2 = d.AZ().Bl();
        return cp2 == null ? null : cp2.atD();
    }

    public static String ajA() {
        cp cp2 = d.AZ().Bl();
        return cp2 == null ? null : cp2.bX();
    }

    public static long aeY() {
        return d.Bj();
    }

    public static String ajB() {
        return d.AZ().Bl().atD();
    }

    public static String ajC() {
        return d.AZ().Bl().getPlayerID();
    }

    public static String getName() {
        return d.AZ().Bl().bX();
    }

    public static String fb(String string) {
        return d.AZ().BA().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString((String)string), null), false).getName();
    }

    public static void a(n n2) {
        d.AZ().a(n2.getProxy());
    }

    public static String ajD() {
        return d.AZ().bhf.getAbsolutePath();
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
        d.AZ().R(bl2);
    }

    public static ListenableFuture<Object> L(String string, String string2) {
        ListenableFuture<Object> listenableFuture = d.AZ().Bs().L(string, string2);
        return listenableFuture;
    }

    public static void ajI() {
        d.AZ().Bs().PN();
    }

    public static boolean ajJ() {
        return d.AZ().aIY.b(c.ckr);
    }

    public static boolean ajK() {
        return d.AZ().bgR != null && d.AZ().bgR instanceof am;
    }
}

