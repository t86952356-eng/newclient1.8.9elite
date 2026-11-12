/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nl.hidden.Hidden0
 */
package rip.vantage.network.core;

import java.security.SecureRandom;
import nl.Loader;
import nl.hidden.Hidden0;
import rip.vantage.network.handler.b;
import rip.vantage.network.handler.c;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.GameEvent;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class a {
    public static /* synthetic */ Object[] oOOO0OOOOOOO;
    public static /* synthetic */ String[] q00oo0O0oo0;
    public static volatile /* synthetic */ long eSj;
    public static /* synthetic */ String oO0O0O0OOO0O;
    public static volatile /* synthetic */ boolean eSi;
    public static /* synthetic */ String o0O000O0O0O0;
    public static /* synthetic */ String o0oO00oOO0oO;
    public static /* synthetic */ String o00O000OO00O;
    public static /* synthetic */ String eSd;
    public static /* synthetic */ String o0Oo000O0oO;
    public static /* synthetic */ String o0o000o0O0o0;
    public /* synthetic */ c ddr;
    public static /* synthetic */ String oO000O00OO00;
    public static /* synthetic */ String oooO0ooOOooO;
    public /* synthetic */ String aCU;
    public static /* synthetic */ String oO00O0OO0ooO;
    public static /* synthetic */ String oo000o00Oo00;
    public static /* synthetic */ String O0OoOO0OOOOO;
    public static /* synthetic */ String oo0O0o0OOo0O;
    public static /* synthetic */ String o0000000O000;
    public static /* synthetic */ String ooO00oO0OoO0;
    public static /* synthetic */ String ooOO0oOOOoOO;
    public volatile /* synthetic */ boolean eSf;
    public static /* synthetic */ SecureRandom eSh;
    public static /* synthetic */ Object[] oooo00ooo0;
    public /* synthetic */ b eSe;
    public static /* synthetic */ String[] oOoo00Ooo0;
    public static volatile /* synthetic */ boolean eSk;
    private static /* synthetic */ int[] OOoo0oo0o0;
    public static /* synthetic */ String oOoO0OoOOOoO;
    public static /* synthetic */ String oOO00OO0OOO0;
    public static /* synthetic */ String o0OO00OOO0OO;
    public static /* synthetic */ String Oo0o00000O00;
    public static /* synthetic */ String ooo00oo0Ooo0;
    public /* synthetic */ rip.vantage.commons.util.time.a eSg;
    public static /* synthetic */ String q0OOOoo00o0;
    public static volatile /* synthetic */ a eSc;
    public static /* synthetic */ String oOo00Oo0OOo0;
    public static /* synthetic */ String q0oOOoOo0O00O;
    @EventLink
    public /* synthetic */ Listener<GameEvent> eSl;
    public static /* synthetic */ Object Oooo0o0oo0;
    private static /* synthetic */ int q0o0o0Oo0o0;
    private static /* synthetic */ boolean o00o0000o0;

    /*
     * Enabled aggressive block sorting
     */
    public a() {
        int n2 = -1377219982;
        if (n2 != n2) {
            q0o0o0Oo0o0 = n2 = 1016465090;
        }
        this.eSg = new rip.vantage.commons.util.time.a();
        this.eSl = this::a;
        Client.a.e().b(this);
    }

    public static String o0Oo000O0oO(int var0, String var1) {
        /* ANDROID/VANILLA PORT NOTE: JNI native replaced by pure-Java nl.StringDecryptor. */
        return nl.StringDecryptor.decrypt(var0, var1);
    }

    private static void q0OOOoo00o0() {}

    public static /* bridge */ native strictfp /* synthetic */ a aKQ();

    static {
        Hidden0.special_clinit_2_200(a.class);
    }

    public static /* bridge */ native strictfp /* synthetic */ void aKR();
}

