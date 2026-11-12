/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aeo;
import hackclient.rise.aep;
import java.util.UUID;

public class aer
extends aeo {
    public aer(String string) {
        super(aep.aFz, string, aer.bl(string), "accessToken");
    }

    private static String bl(String string) {
        String string2 = "OfflinePlayer:" + string;
        return UUID.nameUUIDFromBytes(string2.getBytes()).toString().replace("-", "");
    }
}

