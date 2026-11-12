/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParser
 */
package hackclient.rise;

import com.alan.clients.util.account.auth.MicrosoftLogin;
import com.alan.clients.util.account.auth.d;
import com.google.gson.JsonParser;
import hackclient.rise.afp;
import hackclient.rise.akf;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.util.cp;

public final class aeq {
    private static final String aFE = "https://api.minecraftservices.com/minecraft/profile";

    private aeq() {
    }

    public static cp bj(String string) {
        Object object;
        if (string == null) {
            throw new IOException("Empty token");
        }
        String string2 = string.trim();
        if (string2.isEmpty()) {
            throw new IOException("Empty token");
        }
        if (string2.matches("^\\d+$")) {
            try {
                int n2 = Integer.parseInt(string2);
                object = afp.am(n2);
                if (object == null || ((String)object).trim().isEmpty()) {
                    throw new IOException("Invalid ref id");
                }
                string2 = ((String)object).trim();
            }
            catch (NumberFormatException numberFormatException) {
                throw new IOException("Invalid ref id", numberFormatException);
            }
        }
        try {
            String string3 = akf.I(aFE, string2);
            if (string3 == null || string3.trim().isEmpty()) {
                throw new IOException("Invalid/expired token");
            }
            try {
                object = JsonParser.parseString((String)string3).getAsJsonObject();
            }
            catch (Exception exception) {
                throw new IOException("Invalid/expired token", exception);
            }
            if (!object.has("name") || !object.has("id")) {
                throw new IOException("Invalid/expired token");
            }
            String string4 = object.get("name").getAsString();
            String string5 = object.get("id").getAsString();
            cp cp2 = new cp(string4, string5, string2, "mojang");
            Minecraft.getMinecraft().a(cp2);
            return cp2;
        }
        catch (IOException iOException) {
            object = MicrosoftLogin.login(string2);
            if (object == null || !((d)object).sC() || ((d)object).aCU == null || ((d)object).aFw == null) {
                throw iOException;
            }
            cp cp3 = new cp(((d)object).aCU, ((d)object).aFw, ((d)object).aFI, "mojang");
            Minecraft.getMinecraft().a(cp3);
            return cp3;
        }
    }
}

