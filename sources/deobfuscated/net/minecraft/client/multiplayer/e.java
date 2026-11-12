/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.multiplayer;

import java.net.IDN;
import java.util.Hashtable;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public class e {
    private final String bDF;
    private final int port;

    private e(String string, int n2) {
        this.bDF = string;
        this.port = n2;
    }

    public String HC() {
        return IDN.toASCII(this.bDF);
    }

    public int getPort() {
        return this.port;
    }

    public static e da(String string) {
        int n2;
        Object object;
        int n3;
        if (string == null) {
            return null;
        }
        String[] stringArray = string.split(":");
        if (string.startsWith("[") && (n3 = string.indexOf("]")) > 0) {
            String string2 = string.substring(1, n3);
            object = string.substring(n3 + 1).trim();
            if (object.startsWith(":") && object.length() > 0) {
                object = object.substring(1);
                stringArray = new String[]{string2, object};
            } else {
                stringArray = new String[]{string2};
            }
        }
        if (stringArray.length > 2) {
            stringArray = new String[]{string};
        }
        String string3 = stringArray[0];
        int n4 = n2 = stringArray.length > 1 ? e.w(stringArray[1], 25565) : 25565;
        if (n2 == 25565) {
            object = e.db(string3);
            string3 = object[0];
            n2 = e.w(object[1], 25565);
        }
        return new e(string3, n2);
    }

    private static String[] db(String string) {
        try {
            String string2 = "com.sun.jndi.dns.DnsContextFactory";
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            Hashtable<String, String> hashtable = new Hashtable<String, String>();
            hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            hashtable.put("java.naming.provider.url", "dns:");
            hashtable.put("com.sun.jndi.dns.timeout.retries", "1");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            Attributes attributes = initialDirContext.getAttributes("_minecraft._tcp." + string, new String[]{"SRV"});
            String[] stringArray = attributes.get("srv").get().toString().split(" ", 4);
            return new String[]{stringArray[3], stringArray[2]};
        }
        catch (Throwable throwable) {
            return new String[]{string, Integer.toString(25565)};
        }
    }

    private static int w(String string, int n2) {
        try {
            return Integer.parseInt(string.trim());
        }
        catch (Exception exception) {
            return n2;
        }
    }
}

