/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.event;

import com.google.common.collect.Maps;
import java.util.Map;

public final class b
extends Enum<b> {
    public static final /* enum */ b cKI = new b("open_url", true);
    public static final /* enum */ b cKJ = new b("open_file", false);
    public static final /* enum */ b cKK = new b("run_command", true);
    public static final /* enum */ b cKL = new b("twitch_user_info", false);
    public static final /* enum */ b cKM = new b("suggest_command", true);
    public static final /* enum */ b cKN = new b("change_page", true);
    private static final Map<String, b> cKO;
    private final boolean cKP;
    private final String cKQ;
    private static final /* synthetic */ b[] cKR;

    public static b[] values() {
        return (b[])cKR.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private b(String string2, boolean bl2) {
        this.cKQ = string2;
        this.cKP = bl2;
    }

    public boolean acT() {
        return this.cKP;
    }

    public String acU() {
        return this.cKQ;
    }

    public static b em(String string) {
        return cKO.get(string);
    }

    private static /* synthetic */ b[] acV() {
        return new b[]{cKI, cKJ, cKK, cKL, cKM, cKN};
    }

    static {
        cKR = b.acV();
        cKO = Maps.newHashMap();
        for (b b2 : b.values()) {
            cKO.put(b2.acU(), b2);
        }
    }
}

