/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.authlib.properties.PropertyMap$Serializer
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.NonOptionArgumentSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 */
package net.minecraft.client.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import net.minecraft.client.main.a;
import net.minecraft.client.main.b;
import net.minecraft.client.main.c;
import net.minecraft.client.main.d;
import net.minecraft.client.main.e;
import net.minecraft.client.main.f;
import net.minecraft.client.main.g;
import net.minecraft.client.main.h;
import net.minecraft.util.cp;

public class Main {
    public static void main(String[] stringArray) {
        try {
            System.setProperty("java.net.preferIPv4Stack", "true");
            OptionParser optionParser = new OptionParser();
            optionParser.allowsUnrecognizedOptions();
            optionParser.accepts("demo");
            optionParser.accepts("fullscreen");
            optionParser.accepts("checkGlErrors");
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec = optionParser.accepts("server").withRequiredArg();
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec2 = optionParser.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo((Object)25565, (Object[])new Integer[0]);
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec3 = optionParser.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo((Object)new File("."), (Object[])new File[0]);
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec4 = optionParser.accepts("assetsDir").withRequiredArg().ofType(File.class);
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec5 = optionParser.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec6 = optionParser.accepts("proxyHost").withRequiredArg();
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec7 = optionParser.accepts("proxyPort").withRequiredArg().defaultsTo((Object)"8080", (Object[])new String[0]).ofType(Integer.class);
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec8 = optionParser.accepts("proxyUser").withRequiredArg();
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec9 = optionParser.accepts("proxyPass").withRequiredArg();
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec10 = optionParser.accepts("username").withRequiredArg().defaultsTo((Object)"Rise", (Object[])new String[0]);
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec11 = optionParser.accepts("uuid").withRequiredArg();
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec12 = optionParser.accepts("accessToken").withRequiredArg().required();
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec13 = optionParser.accepts("version").withRequiredArg().required();
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec14 = optionParser.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo((Object)854, (Object[])new Integer[0]);
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec15 = optionParser.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo((Object)480, (Object[])new Integer[0]);
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec16 = optionParser.accepts("userProperties").withRequiredArg().defaultsTo((Object)"{}", (Object[])new String[0]);
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec17 = optionParser.accepts("profileProperties").withRequiredArg().defaultsTo((Object)"{}", (Object[])new String[0]);
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec18 = optionParser.accepts("assetIndex").withRequiredArg();
            ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec19 = optionParser.accepts("userType").withRequiredArg().defaultsTo((Object)"legacy", (Object[])new String[0]);
            NonOptionArgumentSpec nonOptionArgumentSpec = optionParser.nonOptions();
            OptionSet optionSet = optionParser.parse(stringArray);
            List list = optionSet.valuesOf((OptionSpec)nonOptionArgumentSpec);
            if (!list.isEmpty()) {
                System.out.println("Completely ignored arguments: " + String.valueOf(list));
            }
            String string = (String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec6);
            Proxy proxy = Proxy.NO_PROXY;
            if (string != null) {
                try {
                    proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(string, (int)((Integer)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec7))));
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            String string2 = (String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec8);
            String string3 = (String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec9);
            if (!proxy.equals(Proxy.NO_PROXY) && Main.cU(string2) && Main.cU(string3)) {
                Authenticator.setDefault(new g(string2, string3));
            }
            int n2 = (Integer)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec14);
            int n3 = (Integer)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec15);
            boolean bl2 = optionSet.has("fullscreen");
            boolean bl3 = optionSet.has("checkGlErrors");
            boolean bl4 = optionSet.has("demo");
            String string4 = (String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec13);
            Gson gson = new GsonBuilder().registerTypeAdapter(PropertyMap.class, (Object)new PropertyMap.Serializer()).create();
            PropertyMap propertyMap = (PropertyMap)gson.fromJson((String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec16), PropertyMap.class);
            PropertyMap propertyMap2 = (PropertyMap)gson.fromJson((String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec17), PropertyMap.class);
            File file = (File)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec3);
            File file2 = optionSet.has((OptionSpec)argumentAcceptingOptionSpec4) ? (File)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec4) : new File(file, "assets/");
            File file3 = optionSet.has((OptionSpec)argumentAcceptingOptionSpec5) ? (File)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec5) : new File(file, "resourcepacks/");
            String string5 = optionSet.has((OptionSpec)argumentAcceptingOptionSpec11) ? (String)argumentAcceptingOptionSpec11.value(optionSet) : (String)argumentAcceptingOptionSpec10.value(optionSet);
            String string6 = optionSet.has((OptionSpec)argumentAcceptingOptionSpec18) ? (String)argumentAcceptingOptionSpec18.value(optionSet) : null;
            String string7 = (String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec);
            Integer n4 = (Integer)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec2);
            cp cp2 = new cp((String)argumentAcceptingOptionSpec10.value(optionSet), string5, (String)argumentAcceptingOptionSpec12.value(optionSet), (String)argumentAcceptingOptionSpec19.value(optionSet));
            a a2 = new a(new f(cp2, propertyMap, propertyMap2, proxy), new b(n2, n3, bl2, bl3), new c(file, file3, file2, string6), new d(bl4, string4), new e(string7, n4));
            System.out.println("Using " + Math.max(1, Math.min(2, Runtime.getRuntime().availableProcessors() - 1)) + " threads.");
            Runtime.getRuntime().addShutdownHook(new h("Client Shutdown Thread"));
            Thread.currentThread().setName("Client thread");
            new net.minecraft.client.d(a2).run();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("If this error continues, please use Rise's launcher, download from https://Vantage.Rip");
        }
    }

    private static boolean cU(String string) {
        return string != null && !string.isEmpty();
    }
}

