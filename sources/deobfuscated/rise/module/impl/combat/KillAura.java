/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.combat;

import hackclient.rise.aec;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.akd;
import hackclient.rise.akj;
import hackclient.rise.ako;
import hackclient.rise.aks;
import hackclient.rise.cb;
import hackclient.rise.ea;
import hackclient.rise.en;
import hackclient.rise.fg;
import hackclient.rise.fr;
import hackclient.rise.fw;
import hackclient.rise.gu;
import java.net.BindException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.block.Block;
import net.minecraft.entity.c;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.item.a;
import net.minecraft.network.aj;
import net.minecraft.util.ce;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.ClickEvent;
import rise.event.impl.HitSlowDownEvent;
import rise.event.impl.JumpEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PostMotionEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render2DEvent;
import rise.event.impl.SlowDownEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@ModuleInfo(aliases={"module.combat.killaura.name", "Aura", "Force Field"}, description="module.combat.killaura.description", category=Category.COMBAT)
public class KillAura
extends Module {
    public static /* synthetic */ String Oo000o0000;
    public /* synthetic */ BooleanValue nC;
    public /* synthetic */ BooleanValue nu;
    public static /* synthetic */ String oooo00ooo0;
    public /* synthetic */ float oz;
    public /* synthetic */ BooleanValue nI;
    public /* synthetic */ BooleanValue ml;
    public static /* synthetic */ String ooo00oo0Ooo0;
    public /* synthetic */ NumberValue mZ;
    public /* synthetic */ int nY;
    public static /* synthetic */ String oooO0ooOOooO;
    public /* synthetic */ NumberValue nr;
    public static /* synthetic */ String Oooo0o0oo0;
    @EventLink
    public /* synthetic */ Listener<SlowDownEvent> pc;
    public static /* synthetic */ String q0oo00Ooo00;
    public static /* synthetic */ String q0oOOoOo0O00O;
    public static /* synthetic */ float oh;
    public static /* synthetic */ boolean cK;
    @EventLink(cH=3)
    public /* synthetic */ Listener<PreUpdateEvent> oR;
    public /* synthetic */ Vector2f mG;
    public /* synthetic */ boolean oI;
    public /* synthetic */ Vector2f nt;
    @EventLink
    public /* synthetic */ Listener<PostMotionEvent> oU;
    public /* synthetic */ Queue<aj<?>> nN;
    public /* synthetic */ boolean mz;
    public /* synthetic */ boolean oc;
    public static /* synthetic */ String q0OOOoo00o0;
    public /* synthetic */ BooleanValue mQ;
    public static /* synthetic */ String oO0O0O0OOO0O;
    public /* synthetic */ NumberValue nn;
    public /* synthetic */ NumberValue mW;
    public static /* synthetic */ Object[] O00O0oO0O0;
    public /* synthetic */ boolean oF;
    public /* synthetic */ int mA;
    public static /* synthetic */ String q0oO00OoO00;
    public /* synthetic */ int mH;
    public /* synthetic */ NumberValue mU;
    public /* synthetic */ ako<cb> ms;
    public /* synthetic */ int oA;
    public static /* synthetic */ String o0000000O000;
    public /* synthetic */ ModeValue lT;
    public /* synthetic */ BooleanValue mP;
    public /* synthetic */ BooleanValue no;
    public /* synthetic */ int ot;
    public /* synthetic */ double mJ;
    public /* synthetic */ int mF;
    public /* synthetic */ aec<r> oK;
    public /* synthetic */ akj mm;
    public /* synthetic */ long ox;
    public static /* synthetic */ String ooOO0oOOOoOO;
    public /* synthetic */ NumberValue na;
    public static /* synthetic */ String OooO0o0oO0;
    public static /* synthetic */ String[] OoOO0o0OO0;
    public /* synthetic */ afj oO;
    public /* synthetic */ float ok;
    public static /* synthetic */ String o0o000o0O0o0;
    public /* synthetic */ boolean oD;
    public /* synthetic */ BooleanValue nw;
    public /* synthetic */ int oa;
    public /* synthetic */ NumberValue mg;
    private static /* synthetic */ int[] oOOO00OOO0;
    public static /* synthetic */ String o00O000OO00O;
    public /* synthetic */ NumberValue nj;
    public /* synthetic */ float ol;
    public /* synthetic */ float om;
    public /* synthetic */ BooleanValue nL;
    public /* synthetic */ int my;
    public static /* synthetic */ boolean nS;
    public /* synthetic */ akd oq;
    public static /* synthetic */ String oOo00Oo0OOo0;
    public /* synthetic */ long ou;
    public /* synthetic */ NumberValue ns;
    public /* synthetic */ akd os;
    public static /* synthetic */ String ooO00oO0OoO0;
    public /* synthetic */ Vector2f on;
    @EventLink
    public /* synthetic */ Listener<Render2DEvent> pd;
    public /* synthetic */ BooleanValue mf;
    public /* synthetic */ ModeValue mL;
    public /* synthetic */ ModeValue lV;
    public static /* synthetic */ String oo0O0o0OOo0O;
    public /* synthetic */ BooleanValue mq;
    public /* synthetic */ BooleanValue lW;
    public /* synthetic */ BooleanValue nz;
    public /* synthetic */ BooleanValue mp;
    public static /* synthetic */ String o0Oo000O0oO;
    public static /* synthetic */ String oOoO00OoO0;
    public /* synthetic */ int oC;
    @EventLink
    public /* synthetic */ Listener<fr> oT;
    public /* synthetic */ ModeValue me;
    @EventLink(cH=3)
    public /* synthetic */ Listener<PacketSendEvent> oW;
    public /* synthetic */ boolean oJ;
    public /* synthetic */ Map<c, Integer> oL;
    public static /* synthetic */ String OO000ooO00;
    public static /* synthetic */ String oOO00OO0OOO0;
    public static /* synthetic */ String q00Oo0O0Oo0;
    public /* synthetic */ int oo;
    public static /* synthetic */ boolean mB;
    public static /* synthetic */ boolean nQ;
    @EventLink(cH=3)
    public /* synthetic */ Listener<fw> oV;
    public /* synthetic */ float oj;
    @EventLink
    public /* synthetic */ Listener<PreUpdateEvent> oS;
    public /* synthetic */ BooleanValue mw;
    public static /* synthetic */ String oO00O0OO0ooO;
    @EventLink
    public /* synthetic */ Listener<ClickEvent> oY;
    public /* synthetic */ BooleanValue mb;
    public /* synthetic */ BooleanValue nx;
    @EventLink
    public /* synthetic */ Listener<PreMotionEvent> oP;
    public /* synthetic */ String nE;
    public /* synthetic */ int nZ;
    public /* synthetic */ int op;
    public /* synthetic */ boolean oE;
    public /* synthetic */ ce mR;
    public /* synthetic */ gu mD;
    public /* synthetic */ NumberValue mh;
    public /* synthetic */ NumberValue mX;
    public static /* synthetic */ String oo000o00Oo00;
    public static /* synthetic */ String Oo0o00000O00;
    public /* synthetic */ String mE;
    @EventLink
    public /* synthetic */ Listener<JumpEvent> oZ;
    public /* synthetic */ BooleanValue nA;
    public /* synthetic */ BooleanValue mx;
    public /* synthetic */ NumberValue mo;
    public /* synthetic */ BooleanValue mu;
    public /* synthetic */ BooleanValue mS;
    public /* synthetic */ BooleanValue ma;
    public /* synthetic */ NumberValue mk;
    public static /* synthetic */ String q0O0o0OO0o0;
    public /* synthetic */ NumberValue np;
    public /* synthetic */ int nW;
    public /* synthetic */ BooleanValue nB;
    public static /* synthetic */ String OOOo0ooo00;
    public static /* synthetic */ String q0OO00OOO00;
    public static /* synthetic */ String q00000O0000;
    public /* synthetic */ float oi;
    public static /* synthetic */ String o00O0000O0;
    public static /* synthetic */ String o0OO00OOO0OO;
    public /* synthetic */ boolean oG;
    public /* synthetic */ BooleanValue nv;
    public /* synthetic */ akj lU;
    public static /* synthetic */ boolean nR;
    public static /* synthetic */ String OoOo0o0Oo0;
    public /* synthetic */ boolean nU;
    public /* synthetic */ BooleanValue nH;
    public static /* synthetic */ String o0O0000O00;
    public static /* synthetic */ String oO0000O000;
    public /* synthetic */ List<r> nV;
    public static /* synthetic */ String o0o0000o00;
    public /* synthetic */ NumberValue nd;
    public /* synthetic */ BooleanValue nD;
    public /* synthetic */ int oH;
    public /* synthetic */ NumberValue mV;
    public static /* synthetic */ String o0oO00oOO0oO;
    public /* synthetic */ int ov;
    public /* synthetic */ akj mj;
    public static /* synthetic */ String q0o0o0Oo0o0;
    public /* synthetic */ BooleanValue lZ;
    public static /* synthetic */ String O0o00oOo00;
    public /* synthetic */ BooleanValue nG;
    public static /* synthetic */ float og;
    public /* synthetic */ boolean ob;
    public /* synthetic */ List<r> oM;
    @EventLink
    public /* synthetic */ Listener<HitSlowDownEvent> pa;
    public static /* synthetic */ String oO000O00OO00;
    public /* synthetic */ NumberValue ng;
    public static /* synthetic */ String q0Oo00OOo00;
    public static /* synthetic */ String OOoo0oo0o0;
    public /* synthetic */ NumberValue nq;
    public /* synthetic */ BooleanValue nM;
    public /* synthetic */ NumberValue nk;
    public /* synthetic */ NumberValue nh;
    public static /* synthetic */ String q00oo0O0oo0;
    public /* synthetic */ NumberValue mi;
    public /* synthetic */ long nT;
    public /* synthetic */ boolean ow;
    public static /* synthetic */ String OOoO0oo0O0;
    public static /* synthetic */ String q0o0O0Oo0O0;
    public /* synthetic */ NumberValue nf;
    public static /* synthetic */ String ooOo00oOo0;
    public /* synthetic */ BooleanValue mM;
    public /* synthetic */ NumberValue nb;
    public /* synthetic */ Random od;
    public /* synthetic */ NumberValue nl;
    public /* synthetic */ int oe;
    @EventLink
    public /* synthetic */ Listener<fg> oQ;
    @EventLink
    public /* synthetic */ Listener<en> pb;
    public /* synthetic */ BooleanValue nJ;
    public static /* synthetic */ String oo0000o000;
    public static /* synthetic */ String o0O000O0O0O0;
    public static /* synthetic */ String O0O00oOO00;
    public /* synthetic */ boolean mC;
    public /* synthetic */ ModeValue mT;
    public static /* synthetic */ String O00o0oO0o0;
    public /* synthetic */ BooleanValue mn;
    public /* synthetic */ ModeValue mN;
    public /* synthetic */ BooleanValue mr;
    public /* synthetic */ NumberValue ne;
    public static /* synthetic */ Object ooOO00oOO0;
    public static /* synthetic */ String oOOo00OOo0;
    public /* synthetic */ akd or;
    public /* synthetic */ BooleanValue ny;
    public /* synthetic */ BooleanValue mt;
    public /* synthetic */ int nX;
    public /* synthetic */ BooleanValue nF;
    public /* synthetic */ int of;
    public /* synthetic */ BooleanValue mv;
    public /* synthetic */ int oB;
    public /* synthetic */ BooleanValue lX;
    public static /* synthetic */ String oooO00ooO0;
    public /* synthetic */ NumberValue nc;
    public /* synthetic */ c mI;
    public /* synthetic */ ModeValue md;
    public static /* synthetic */ String o00o0000o0;
    public /* synthetic */ r jE;
    public /* synthetic */ rip.vantage.commons.util.time.a nO;
    public /* synthetic */ int hV;
    public /* synthetic */ afj oN;
    public static /* synthetic */ String O0OoOO0OOOOO;
    public /* synthetic */ BooleanValue lY;
    public /* synthetic */ NumberValue ni;
    public /* synthetic */ BooleanValue nK;
    public static /* synthetic */ String oOoo00Ooo0;
    public static /* synthetic */ String[] q00OO0O0OO0;
    public /* synthetic */ NumberValue mY;
    public static /* synthetic */ Object[] q0O0O0OO0O0;
    public static /* synthetic */ String oOoO0OoOOOoO;
    public static /* synthetic */ String q00oO0O0oO0;
    @EventLink
    public /* synthetic */ Listener<ea> oX;
    public /* synthetic */ BooleanValue nm;
    public static /* synthetic */ String oOOO0OOOOOOO;
    public /* synthetic */ rip.vantage.commons.util.time.a nP;
    public /* synthetic */ int oy;
    public /* synthetic */ boolean mK;
    public /* synthetic */ BooleanValue mO;
    private static /* synthetic */ int OOOO0ooooO;
    private static /* synthetic */ boolean q0oooOOoooO;

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ boolean d(double d2, r r2) {
        int n2;
        if (!((double)KillAura.aER.bgK.S(r2) <= d2)) {
            n2 = ~(-(-(-126 + 125)));
            return n2 != 0;
        }
        int n3 = -396566581;
        switch (n3) {
            default: {
                break;
            }
            case -154859161: 
        }
        n2 = 129 - 109 + -19;
        return n2 != 0;
    }

    public static /* bridge */ strictfp /* synthetic */ boolean b(Mode mode) {
        return mode.getName().equals((String)O00O0oO0O0[-(~-267 - 35) ^ 0xFFFFFFE1]);
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ boolean c(double var0, r var2_1) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void q0OOOoo00o0() {
        int n2 = 1397046782;
        if (n2 != n2) {
            n2 = 561365466;
        }
        oOOO00OOO0 = new int[0x9A33 ^ 0x9BA3];
        KillAura.oOOO00OOO0[0xDFAF ^ 0xDEB4] = 0xDEB4 ^ 0xDEB4;
        KillAura.oOOO00OOO0[0xA82E ^ 0xA8F3] = 0xA8A4 ^ 0xA8F3;
        KillAura.oOOO00OOO0[0x5F1 ^ 0x587] = 0xFFFFFA2F ^ 0x587;
        KillAura.oOOO00OOO0[0x10ED6 ^ 0x10EEB] = 0x109D8 ^ 0x10EEB;
        int n3 = 842234693;
        block81: while (true) {
            switch (n3) {
                case 1011847568: {
                    KillAura.oOOO00OOO0[0x1069D ^ 0x107F9] = 0xFFF25F95 ^ 0x107F9;
                    n3 = -641123920;
                    continue block81;
                }
                case -641123920: {
                    KillAura.oOOO00OOO0[0xAE06 ^ 0xAF8B] = 0xAF9E ^ 0xAF8B;
                    KillAura.oOOO00OOO0[0x7BD9 ^ 0x7B38] = 0xFFFF84A5 ^ 0x7B38;
                    KillAura.oOOO00OOO0[0xAEE0 ^ 0xAFF4] = 0xAFF1 ^ 0xAFF4;
                    n3 = 1302844020;
                    continue block81;
                }
                case 1302844020: {
                    KillAura.oOOO00OOO0[0xFC17 ^ 0xFC07] = 0xFFFF03F8 ^ 0xFC07;
                    KillAura.oOOO00OOO0[0xAFF2 ^ 0xAF3D] = 0xFFFF508C ^ 0xAF3D;
                    KillAura.oOOO00OOO0[0x65D1 ^ 0x64F8] = 0x64E7 ^ 0x64F8;
                    KillAura.oOOO00OOO0[0x8B1B ^ 0x8B23] = 0x8B78 ^ 0x8B23;
                    n3 = 1738255745;
                    continue block81;
                }
                case 1738255745: {
                    KillAura.oOOO00OOO0[0xBA7E ^ 0xBA03] = 0xBA0E ^ 0xBA03;
                    n3 = 848239842;
                    continue block81;
                }
                case 848239842: {
                    KillAura.oOOO00OOO0[0xBC95 ^ 0xBC91] = 0xFFFF4344 ^ 0xBC91;
                    KillAura.oOOO00OOO0[0xB801 ^ 0xB868] = 0xFFFF4791 ^ 0xB868;
                    KillAura.oOOO00OOO0[0x4B61 ^ 0x4BC7] = 0xFFFFB444 ^ 0x4BC7;
                    KillAura.oOOO00OOO0[0x9E25 ^ 0x9F5E] = 0x9F4F ^ 0x9F5E;
                    n3 = 1335770304;
                    continue block81;
                }
                case 1335770304: {
                    KillAura.oOOO00OOO0[0x101E3 ^ 0x1017E] = 0x10165 ^ 0x1017E;
                    KillAura.oOOO00OOO0[0xB3F1 ^ 0xB35F] = 0xFFFF4CA0 ^ 0xB35F;
                    KillAura.oOOO00OOO0[0x687B ^ 0x693E] = 0xAC69BE ^ 0x693E;
                    KillAura.oOOO00OOO0[0x9D4D ^ 0x9DD3] = 0x9DC0 ^ 0x9DD3;
                    KillAura.oOOO00OOO0[0xEC9E ^ 0xEC8F] = 0xFFFF1370 ^ 0xEC8F;
                    KillAura.oOOO00OOO0[0x45EF ^ 0x457B] = 0x457B ^ 0x457B;
                    KillAura.oOOO00OOO0[0xB2F3 ^ 0xB3E5] = 0xB3BA ^ 0xB3E5;
                    KillAura.oOOO00OOO0[0x9980 ^ 0x98DE] = 0xFFFF6711 ^ 0x98DE;
                    n3 = 1740881749;
                    continue block81;
                }
                case 1740881749: {
                    KillAura.oOOO00OOO0[0xC557 ^ 0xC582] = 0xFFFF3A7D ^ 0xC582;
                    KillAura.oOOO00OOO0[0x7DE8 ^ 0x7D55] = 0xE0006278 ^ 0x7D55;
                    n3 = -1324047941;
                    continue block81;
                }
                case -1324047941: {
                    KillAura.oOOO00OOO0[0x4ACA ^ 0x4AAF] = 0x6CAAF ^ 0x4AAF;
                    KillAura.oOOO00OOO0[0x4D5D ^ 0x4C7E] = 0xFFFFB3E3 ^ 0x4C7E;
                    KillAura.oOOO00OOO0[0xD2A ^ 0xD02] = 0xFFFFF2FD ^ 0xD02;
                    KillAura.oOOO00OOO0[0xE07A ^ 0xE0BA] = 0x2FA05E39 ^ 0xE0BA;
                    n3 = 1167294139;
                    continue block81;
                }
                case 1167294139: {
                    KillAura.oOOO00OOO0[0xEADB ^ 0xEA29] = 0xEA2C ^ 0xEA29;
                    n3 = -1399861379;
                    continue block81;
                }
                case -1399861379: {
                    KillAura.oOOO00OOO0[0xB570 ^ 0xB458] = 0xB459 ^ 0xB458;
                    KillAura.oOOO00OOO0[0x9F0B ^ 0x9E87] = 0xFFFA1978 ^ 0x9E87;
                    KillAura.oOOO00OOO0[0x738C ^ 0x73DF] = 0x73C0 ^ 0x73DF;
                    n3 = 885381079;
                    continue block81;
                }
                case 885381079: {
                    KillAura.oOOO00OOO0[0xB03C ^ 0xB10A] = 0xB101 ^ 0xB10A;
                    KillAura.oOOO00OOO0[0x4315 ^ 0x439A] = 0x439B ^ 0x439A;
                    KillAura.oOOO00OOO0[0xDC87 ^ 0xDC64] = 0xDC61 ^ 0xDC64;
                    KillAura.oOOO00OOO0[0x310C ^ 0x31E5] = 0xA749B088 ^ 0x31E5;
                    KillAura.oOOO00OOO0[0x935D ^ 0x93DC] = 0xFFFF6C23 ^ 0x93DC;
                    KillAura.oOOO00OOO0[0x137C ^ 0x13EB] = 0x13EA ^ 0x13EB;
                    KillAura.oOOO00OOO0[0x8318 ^ 0x8376] = 0xFFFF7C89 ^ 0x8376;
                    KillAura.oOOO00OOO0[0x104AC ^ 0x1042A] = 0xFFFEFE90 ^ 0x1042A;
                    KillAura.oOOO00OOO0[0x138B ^ 0x1342] = 0xFFFFECFB ^ 0x1342;
                    KillAura.oOOO00OOO0[0x3E77 ^ 0x3F77] = 0x3F6E ^ 0x3F77;
                    KillAura.oOOO00OOO0[0xF496 ^ 0xF46D] = 0xF46A ^ 0xF46D;
                    n3 = 578403272;
                    continue block81;
                }
                case 578403272: {
                    KillAura.oOOO00OOO0[0x83A8 ^ 0x83C0] = 0x83F3 ^ 0x83C0;
                    KillAura.oOOO00OOO0[0xF8E6 ^ 0xF806] = 0xF806 ^ 0xF806;
                    KillAura.oOOO00OOO0[0x19B1 ^ 0x19CE] = 0x19B7 ^ 0x19CE;
                    KillAura.oOOO00OOO0[0x10DCA ^ 0x10C95] = 0x10C95 ^ 0x10C95;
                    KillAura.oOOO00OOO0[0x6C68 ^ 0x6D71] = 0x6D7C ^ 0x6D71;
                    KillAura.oOOO00OOO0[0x29F7 ^ 0x292F] = 0x2956 ^ 0x292F;
                    n3 = 2008326258;
                    continue block81;
                }
                case 2008326258: {
                    KillAura.oOOO00OOO0[0x9A3A ^ 0x9A55] = 0x9A4A ^ 0x9A55;
                    KillAura.oOOO00OOO0[0x7DB1 ^ 0x7D1C] = 0xFFFF82C3 ^ 0x7D1C;
                    n3 = -270555175;
                    continue block81;
                }
                case -270555175: {
                    KillAura.oOOO00OOO0[0xD006 ^ 0xD115] = 0xD11C ^ 0xD115;
                    KillAura.oOOO00OOO0[0x521B ^ 0x535C] = 0x535B ^ 0x535C;
                    n3 = -115261010;
                    continue block81;
                }
                case -115261010: {
                    KillAura.oOOO00OOO0[0x3AB2 ^ 0x3AF0] = 0x3AA1 ^ 0x3AF0;
                    KillAura.oOOO00OOO0[0x55D0 ^ 0x5524] = 0x23026507 ^ 0x5524;
                    KillAura.oOOO00OOO0[0xF40C ^ 0xF531] = 0xF590 ^ 0xF531;
                    KillAura.oOOO00OOO0[0x10B6F ^ 0x10A15] = 0x2AD0A15 ^ 0x10A15;
                    KillAura.oOOO00OOO0[0xD75C ^ 0xD7D4] = 0xFFFF2819 ^ 0xD7D4;
                    KillAura.oOOO00OOO0[0x4675 ^ 0x46CE] = 0x46DF ^ 0x46CE;
                    KillAura.oOOO00OOO0[0x30FE ^ 0x31DB] = 0x31DB ^ 0x31DB;
                    n3 = -1649128066;
                    continue block81;
                }
                case -1649128066: {
                    KillAura.oOOO00OOO0[0x69EA ^ 0x68D5] = 0xFE1868D5 ^ 0x68D5;
                    KillAura.oOOO00OOO0[0x6C3F ^ 0x6D03] = 0x6D64 ^ 0x6D03;
                    KillAura.oOOO00OOO0[0xACF7 ^ 0xAD7E] = 0xAD03 ^ 0xAD7E;
                    KillAura.oOOO00OOO0[0x8409 ^ 0x849C] = 0x8493 ^ 0x849C;
                    KillAura.oOOO00OOO0[0x8A8A ^ 0x8A73] = 0x61F22EC8 ^ 0x8A73;
                    KillAura.oOOO00OOO0[0xFF6B ^ 0xFFF8] = 0xFFFF001B ^ 0xFFF8;
                    KillAura.oOOO00OOO0[0x64C ^ 0x678] = 0x66B ^ 0x678;
                    KillAura.oOOO00OOO0[0x6342 ^ 0x63E6] = 0x63F1 ^ 0x63E6;
                    KillAura.oOOO00OOO0[0xBF11 ^ 0xBE5B] = 0xBE58 ^ 0xBE5B;
                    n3 = -1798390406;
                    continue block81;
                }
                case -1798390406: {
                    KillAura.oOOO00OOO0[0xD8E ^ 0xC9C] = 0xC8B ^ 0xC9C;
                    KillAura.oOOO00OOO0[0xF59 ^ 0xE5A] = 0xA0000E59 ^ 0xE5A;
                    n3 = 1548586990;
                    continue block81;
                }
                case 1548586990: {
                    KillAura.oOOO00OOO0[0xD09B ^ 0xD0CF] = 0xCCCC1C9A ^ 0xD0CF;
                    KillAura.oOOO00OOO0[0xEADE ^ 0xEAAD] = 0xEAAE ^ 0xEAAD;
                    KillAura.oOOO00OOO0[0x34CE ^ 0x3482] = 0xFFFFCB75 ^ 0x3482;
                    n3 = -242933500;
                    continue block81;
                }
                case -242933500: {
                    KillAura.oOOO00OOO0[0x9BA3 ^ 0x9B47] = 0x9B58 ^ 0x9B47;
                    KillAura.oOOO00OOO0[0x76A1 ^ 0x76D1] = 0x76D0 ^ 0x76D1;
                    n3 = -1359499645;
                    continue block81;
                }
                case -1359499645: {
                    KillAura.oOOO00OOO0[0xC662 ^ 0xC602] = 0xC60F ^ 0xC602;
                    KillAura.oOOO00OOO0[0xA731 ^ 0xA7CB] = 0xFFFF584B ^ 0xA7CB;
                    KillAura.oOOO00OOO0[0xD768 ^ 0xD6E9] = 0x37FF2917 ^ 0xD6E9;
                    n3 = -1298140411;
                    continue block81;
                }
                case -1298140411: {
                    KillAura.oOOO00OOO0[0x4F40 ^ 0x4E2C] = 0x4E2B ^ 0x4E2C;
                    KillAura.oOOO00OOO0[0x10D9 ^ 0x103F] = 0x334D ^ 0x103F;
                    KillAura.oOOO00OOO0[0xC6B8 ^ 0xC647] = 0xB4B47E73 ^ 0xC647;
                    n3 = 1590281792;
                    continue block81;
                }
                case 1590281792: {
                    KillAura.oOOO00OOO0[0xDF30 ^ 0xDE60] = 0x3B136F5B ^ 0xDE60;
                    n3 = 2056216469;
                    continue block81;
                }
                case 2056216469: {
                    KillAura.oOOO00OOO0[0xE0F3 ^ 0xE02C] = 0xE02D ^ 0xE02C;
                    KillAura.oOOO00OOO0[0x30AC ^ 0x30C0] = 0x300C ^ 0x30C0;
                    n3 = -5023834;
                    continue block81;
                }
                case -5023834: {
                    KillAura.oOOO00OOO0[0xB72F ^ 0xB64A] = 0x3CF37977 ^ 0xB64A;
                    KillAura.oOOO00OOO0[0xDE24 ^ 0xDE8D] = 0xFFFF2172 ^ 0xDE8D;
                    n3 = 1315674132;
                    continue block81;
                }
                case 1315674132: {
                    KillAura.oOOO00OOO0[0x14EC ^ 0x1410] = 0x1409 ^ 0x1410;
                    n3 = 1600105596;
                    continue block81;
                }
                case 1600105596: {
                    KillAura.oOOO00OOO0[0x2F1D ^ 0x2FB1] = 0x2FE8 ^ 0x2FB1;
                    KillAura.oOOO00OOO0[0xFA16 ^ 0xFB11] = 0xFB12 ^ 0xFB11;
                    KillAura.oOOO00OOO0[0xC766 ^ 0xC616] = 0x69D0F08B ^ 0xC616;
                    KillAura.oOOO00OOO0[0xDB30 ^ 0xDB39] = 0xDB38 ^ 0xDB39;
                    n3 = -1257899226;
                    continue block81;
                }
                case -1257899226: {
                    KillAura.oOOO00OOO0[0xE257 ^ 0xE2CD] = 0xE2DA ^ 0xE2CD;
                    KillAura.oOOO00OOO0[0x7FF2 ^ 0x7F8B] = 0x7F96 ^ 0x7F8B;
                    KillAura.oOOO00OOO0[0xBCDA ^ 0xBC1B] = 0xA790F662 ^ 0xBC1B;
                    KillAura.oOOO00OOO0[0x4D9C ^ 0x4D04] = 0x4DB1 ^ 0x4D04;
                    KillAura.oOOO00OOO0[0x57C ^ 0x529] = 0xFFFFFABE ^ 0x529;
                    KillAura.oOOO00OOO0[0xF739 ^ 0xF661] = 0xF638 ^ 0xF661;
                    KillAura.oOOO00OOO0[0x10809 ^ 0x1095C] = 0x5FFEF6F8 ^ 0x1095C;
                    KillAura.oOOO00OOO0[0x6E51 ^ 0x6EFA] = 0x6EF1 ^ 0x6EFA;
                    n3 = -2059913351;
                    continue block81;
                }
                case -2059913351: {
                    KillAura.oOOO00OOO0[0x72CB ^ 0x738A] = 0x7383 ^ 0x738A;
                    n3 = 1882125363;
                    continue block81;
                }
                case 1882125363: {
                    KillAura.oOOO00OOO0[0x6D6 ^ 0x7A8] = 0xFFFFF833 ^ 0x7A8;
                    n3 = 745560759;
                    continue block81;
                }
                case 745560759: {
                    KillAura.oOOO00OOO0[0x1108 ^ 0x1029] = 0x6A053BCC ^ 0x1029;
                    n3 = -1657485346;
                    continue block81;
                }
                case -1657485346: {
                    KillAura.oOOO00OOO0[0x9C12 ^ 0x9D91] = 0x9D8C ^ 0x9D91;
                    KillAura.oOOO00OOO0[0xA696 ^ 0xA719] = 0xA748 ^ 0xA719;
                    KillAura.oOOO00OOO0[0xBD71 ^ 0xBDDB] = 0xFFFF423E ^ 0xBDDB;
                    KillAura.oOOO00OOO0[0xE378 ^ 0xE216] = 0x46F38 ^ 0xE216;
                    KillAura.oOOO00OOO0[0x5849 ^ 0x58AC] = 0x58AD ^ 0x58AC;
                    KillAura.oOOO00OOO0[0xD04B ^ 0xD04D] = 0xD048 ^ 0xD04D;
                    KillAura.oOOO00OOO0[0xC3D4 ^ 0xC2C4] = 0xFFFF3D3B ^ 0xC2C4;
                    KillAura.oOOO00OOO0[0x8F87 ^ 0x8FD5] = 0x8FD4 ^ 0x8FD5;
                    KillAura.oOOO00OOO0[0x1E29 ^ 0x1EC7] = 0x1ED6 ^ 0x1EC7;
                    KillAura.oOOO00OOO0[0x17B5 ^ 0x17A1] = 0xD91690D7 ^ 0x17A1;
                    n3 = 1818617908;
                    continue block81;
                }
                case 1818617908: {
                    KillAura.oOOO00OOO0[0x9BB6 ^ 0x9AEC] = 0xE5DDC6F8 ^ 0x9AEC;
                    KillAura.oOOO00OOO0[0x907D ^ 0x911F] = 0xFFFF6EE0 ^ 0x911F;
                    n3 = -741095130;
                    continue block81;
                }
                case -741095130: {
                    KillAura.oOOO00OOO0[0x382A ^ 0x3949] = 0xFFFFC6B6 ^ 0x3949;
                    KillAura.oOOO00OOO0[0x29FC ^ 0x28ED] = 0xFFFFD712 ^ 0x28ED;
                    KillAura.oOOO00OOO0[0x35C ^ 0x39F] = 0x39F ^ 0x39F;
                    KillAura.oOOO00OOO0[0xDD1F ^ 0xDDE7] = 0xDDEC ^ 0xDDE7;
                    KillAura.oOOO00OOO0[0x4EC6 ^ 0x4FB4] = 0xFFFFB063 ^ 0x4FB4;
                    KillAura.oOOO00OOO0[0x1287 ^ 0x13F4] = 0xE8BA3D02 ^ 0x13F4;
                    KillAura.oOOO00OOO0[0x10B2E ^ 0x10A7C] = 0x10A7F ^ 0x10A7C;
                    KillAura.oOOO00OOO0[0x6370 ^ 0x63C1] = 0x63CA ^ 0x63C1;
                    KillAura.oOOO00OOO0[0xFF2D ^ 0xFE4B] = 0xFFFF01E2 ^ 0xFE4B;
                    KillAura.oOOO00OOO0[0x101B4 ^ 0x101CE] = 0x101CD ^ 0x101CE;
                    KillAura.oOOO00OOO0[0x4DCE ^ 0x4C44] = 0x4C45 ^ 0x4C44;
                    KillAura.oOOO00OOO0[0xA7BF ^ 0xA6F7] = 0x47DCB700 ^ 0xA6F7;
                    KillAura.oOOO00OOO0[0x4BF6 ^ 0x4AB5] = 0x4AA6 ^ 0x4AB5;
                    n3 = 702874400;
                    continue block81;
                }
                case 702874400: {
                    KillAura.oOOO00OOO0[0xA30F ^ 0xA335] = 0xA32A ^ 0xA335;
                    KillAura.oOOO00OOO0[0xB837 ^ 0xB808] = 0xFFFF4797 ^ 0xB808;
                    KillAura.oOOO00OOO0[0xFAC4 ^ 0xFB8A] = 0xFB9F ^ 0xFB8A;
                    KillAura.oOOO00OOO0[0xBF23 ^ 0xBE3D] = 0xFFFF419B ^ 0xBE3D;
                    KillAura.oOOO00OOO0[0x76AA ^ 0x76D1] = 0x471D859F ^ 0x76D1;
                    KillAura.oOOO00OOO0[0x443F ^ 0x4466] = 0xFFFFBB97 ^ 0x4466;
                    KillAura.oOOO00OOO0[0xA1E3 ^ 0xA097] = 0x97B4857A ^ 0xA097;
                    n3 = 1261439446;
                    continue block81;
                }
                case 1261439446: {
                    KillAura.oOOO00OOO0[0xA412 ^ 0xA443] = 0x5B051418 ^ 0xA443;
                    KillAura.oOOO00OOO0[0x9A3A ^ 0x9A1C] = 0x9A17 ^ 0x9A1C;
                    KillAura.oOOO00OOO0[0xADD7 ^ 0xAD24] = 0xAD3F ^ 0xAD24;
                    KillAura.oOOO00OOO0[0xCEED ^ 0xCEC3] = 0xFFFF3156 ^ 0xCEC3;
                    KillAura.oOOO00OOO0[0x10206 ^ 0x10247] = 0x10200 ^ 0x10247;
                    KillAura.oOOO00OOO0[0x7877 ^ 0x795A] = 0x7B22 ^ 0x795A;
                    KillAura.oOOO00OOO0[0x35EF ^ 0x3480] = 0x348B ^ 0x3480;
                    n3 = -882615839;
                    continue block81;
                }
                case -882615839: {
                    KillAura.oOOO00OOO0[0xFEDF ^ 0xFFD2] = 0x25930949 ^ 0xFFD2;
                    n3 = 1035663728;
                    continue block81;
                }
                case 1035663728: {
                    KillAura.oOOO00OOO0[0xF850 ^ 0xF857] = 0xF1F7 ^ 0xF857;
                    KillAura.oOOO00OOO0[0x93FE ^ 0x938A] = 0xFFFF6C15 ^ 0x938A;
                    KillAura.oOOO00OOO0[0x2235 ^ 0x2204] = 0x2253 ^ 0x2204;
                    n3 = 120774467;
                    continue block81;
                }
                case 120774467: {
                    KillAura.oOOO00OOO0[0x936D ^ 0x93C2] = 0x93CB ^ 0x93C2;
                    KillAura.oOOO00OOO0[0xD3C ^ 0xD42] = 0xFFFFF2A3 ^ 0xD42;
                    KillAura.oOOO00OOO0[0xD712 ^ 0xD69A] = 0xD69B ^ 0xD69A;
                    KillAura.oOOO00OOO0[0x9C79 ^ 0x9CB4] = 0xFFFF6331 ^ 0x9CB4;
                    n3 = -987188065;
                    continue block81;
                }
                case -987188065: {
                    KillAura.oOOO00OOO0[0x9678 ^ 0x965D] = 0xFFF871A2 ^ 0x965D;
                    KillAura.oOOO00OOO0[0x440A ^ 0x452E] = 0xFFFFBAF3 ^ 0x452E;
                    n3 = -595842133;
                    continue block81;
                }
                case -595842133: {
                    KillAura.oOOO00OOO0[0x2A59 ^ 0x2A9F] = 0x2A96 ^ 0x2A9F;
                    KillAura.oOOO00OOO0[0x9B38 ^ 0x9B1F] = 0x9B0A ^ 0x9B1F;
                    KillAura.oOOO00OOO0[0xE9AD ^ 0xE82F] = 0xE82C ^ 0xE82F;
                    KillAura.oOOO00OOO0[0x380E ^ 0x380F] = 0x384E ^ 0x380F;
                    KillAura.oOOO00OOO0[0x106B9 ^ 0x1063C] = 0x10625 ^ 0x1063C;
                    KillAura.oOOO00OOO0[0xA2AE ^ 0xA29C] = 0xA29C ^ 0xA29C;
                    KillAura.oOOO00OOO0[0xDDAB ^ 0xDCA7] = 0xDCB8 ^ 0xDCA7;
                    KillAura.oOOO00OOO0[0xB854 ^ 0xB812] = 0x8BA250AB ^ 0xB812;
                    n3 = 1420388271;
                    continue block81;
                }
                case 1420388271: {
                    KillAura.oOOO00OOO0[0x6233 ^ 0x632C] = 0xFFFF9CD3 ^ 0x632C;
                    KillAura.oOOO00OOO0[0xA7E2 ^ 0xA6D8] = 0xFFFF5903 ^ 0xA6D8;
                    KillAura.oOOO00OOO0[0x27EB ^ 0x2665] = 0x266E ^ 0x2665;
                    n3 = 306069422;
                    continue block81;
                }
                case 306069422: {
                    KillAura.oOOO00OOO0[0x38AF ^ 0x380D] = 0xC278 ^ 0x380D;
                    KillAura.oOOO00OOO0[0xC8CB ^ 0xC80E] = 0xD4D1742B ^ 0xC80E;
                    KillAura.oOOO00OOO0[0x35E6 ^ 0x34CC] = 0xFFFFCB1A ^ 0x34CC;
                    KillAura.oOOO00OOO0[0xA3EC ^ 0xA312] = 0x40A5DDA7 ^ 0xA312;
                    KillAura.oOOO00OOO0[0x1FA ^ 0x10F] = 0x178 ^ 0x10F;
                    KillAura.oOOO00OOO0[0xCEFD ^ 0xCFB1] = 0xFF96584E ^ 0xCFB1;
                    KillAura.oOOO00OOO0[0x6F60 ^ 0x6E5B] = 0xFFFF91AC ^ 0x6E5B;
                    KillAura.oOOO00OOO0[0xF047 ^ 0xF110] = 0xF10B ^ 0xF110;
                    KillAura.oOOO00OOO0[0xE584 ^ 0xE49E] = 0xE48D ^ 0xE49E;
                    KillAura.oOOO00OOO0[0x456F ^ 0x45A8] = 0x45BF ^ 0x45A8;
                    KillAura.oOOO00OOO0[0x9785 ^ 0x9749] = 0xFFFF688A ^ 0x9749;
                    KillAura.oOOO00OOO0[0x80DD ^ 0x80FC] = 0x80BA ^ 0x80FC;
                    KillAura.oOOO00OOO0[0x2A09 ^ 0x2A3C] = 0x2A35 ^ 0x2A3C;
                    KillAura.oOOO00OOO0[0x8AE2 ^ 0x8AFC] = 0x8AFB ^ 0x8AFC;
                    KillAura.oOOO00OOO0[0xF1CF ^ 0xF11D] = 0xFFFF0EB2 ^ 0xF11D;
                    KillAura.oOOO00OOO0[0x7317 ^ 0x733E] = 0xFFFF8CBB ^ 0x733E;
                    n3 = -1296133960;
                    continue block81;
                }
                case -1296133960: {
                    KillAura.oOOO00OOO0[0x67D1 ^ 0x6740] = 0x6759 ^ 0x6740;
                    KillAura.oOOO00OOO0[0x566F ^ 0x5718] = 0x575C ^ 0x5718;
                    KillAura.oOOO00OOO0[0xBD8A ^ 0xBD08] = 0xBD01 ^ 0xBD08;
                    KillAura.oOOO00OOO0[0xBAFA ^ 0xBA11] = 0xBA0C ^ 0xBA11;
                    KillAura.oOOO00OOO0[0xD83D ^ 0xD845] = 0xFFFF27CE ^ 0xD845;
                    KillAura.oOOO00OOO0[0x4692 ^ 0x46E3] = 0x89916175 ^ 0x46E3;
                    KillAura.oOOO00OOO0[0x1AC0 ^ 0x1A79] = 0xFFB76586 ^ 0x1A79;
                    KillAura.oOOO00OOO0[0x61E2 ^ 0x6094] = 0x60B5 ^ 0x6094;
                    KillAura.oOOO00OOO0[0x2DC7 ^ 0x2DD0] = 0xFFFFD21F ^ 0x2DD0;
                    KillAura.oOOO00OOO0[0x228D ^ 0x2214] = 0xFFFFDDC7 ^ 0x2214;
                    KillAura.oOOO00OOO0[0xA1DF ^ 0xA0BF] = 0xA0B0 ^ 0xA0BF;
                    KillAura.oOOO00OOO0[0xB55D ^ 0xB452] = 0x28E52 ^ 0xB452;
                    n3 = -420371776;
                    continue block81;
                }
                case -420371776: {
                    KillAura.oOOO00OOO0[0x10704 ^ 0x107B8] = 0xFFFEF827 ^ 0x107B8;
                    KillAura.oOOO00OOO0[0x10F1A ^ 0x10F21] = 0x10F36 ^ 0x10F21;
                    KillAura.oOOO00OOO0[0x298B ^ 0x298E] = 0x2995 ^ 0x298E;
                    n3 = -1113234722;
                    continue block81;
                }
                case -1113234722: {
                    KillAura.oOOO00OOO0[0xF2DF ^ 0xF2E6] = 0xF2C9 ^ 0xF2E6;
                    KillAura.oOOO00OOO0[0xE2FE ^ 0xE274] = 0x51EB66F7 ^ 0xE274;
                    KillAura.oOOO00OOO0[0xF1B6 ^ 0xF1EC] = 0xF1F9 ^ 0xF1EC;
                    KillAura.oOOO00OOO0[0xF631 ^ 0xF7B4] = 0xF7B7 ^ 0xF7B4;
                    KillAura.oOOO00OOO0[0xB41B ^ 0xB51F] = 0xFFFF4AE2 ^ 0xB51F;
                    KillAura.oOOO00OOO0[0x5DB1 ^ 0x5CF7] = 0x5CEE ^ 0x5CF7;
                    KillAura.oOOO00OOO0[0x9516 ^ 0x954D] = 0xFFFF6AB2 ^ 0x954D;
                    KillAura.oOOO00OOO0[0xAA4D ^ 0xAA87] = 0xFFFF5578 ^ 0xAA87;
                    KillAura.oOOO00OOO0[0xAEA8 ^ 0xAF88] = 0xFFFF504F ^ 0xAF88;
                    KillAura.oOOO00OOO0[0xA9F7 ^ 0xA8FD] = 0xB08D9536 ^ 0xA8FD;
                    KillAura.oOOO00OOO0[0x1DB ^ 0xCC] = 0xDD ^ 0xCC;
                    KillAura.oOOO00OOO0[0x8236 ^ 0x82D1] = 0xFFFF7D2E ^ 0x82D1;
                    KillAura.oOOO00OOO0[0x64A1 ^ 0x64BD] = 0xC13D ^ 0x64BD;
                    KillAura.oOOO00OOO0[0x5089 ^ 0x5195] = 0x5194 ^ 0x5195;
                    KillAura.oOOO00OOO0[0x5171 ^ 0x5025] = 0x507E ^ 0x5025;
                    KillAura.oOOO00OOO0[0x104F2 ^ 0x10485] = 0x104A6 ^ 0x10485;
                    KillAura.oOOO00OOO0[0x18C5 ^ 0x1892] = 0x188B ^ 0x1892;
                    KillAura.oOOO00OOO0[0x98BE ^ 0x99C3] = 0xFFFF6630 ^ 0x99C3;
                    KillAura.oOOO00OOO0[0x8415 ^ 0x8429] = 0x8420 ^ 0x8429;
                    KillAura.oOOO00OOO0[0x41C6 ^ 0x4181] = 0xFFFFBE48 ^ 0x4181;
                    n3 = 1610260781;
                    continue block81;
                }
                case 1610260781: {
                    KillAura.oOOO00OOO0[0x6FCD ^ 0x6F85] = 0x3F039FBA ^ 0x6F85;
                    KillAura.oOOO00OOO0[0x9C57 ^ 0x9D1E] = 0xFFFF62E1 ^ 0x9D1E;
                    KillAura.oOOO00OOO0[0xCFBD ^ 0xCF15] = 0x745DD838 ^ 0xCF15;
                    KillAura.oOOO00OOO0[0x3B11 ^ 0x3BAB] = 0x3BA4 ^ 0x3BAB;
                    KillAura.oOOO00OOO0[0x2251 ^ 0x225E] = 0xFFFFC3DE ^ 0x225E;
                    n3 = 708496455;
                    continue block81;
                }
                case 708496455: {
                    KillAura.oOOO00OOO0[0x5F4A ^ 0x5F91] = 0x5F8E ^ 0x5F91;
                    KillAura.oOOO00OOO0[0xA366 ^ 0xA339] = 0xA32A ^ 0xA339;
                    KillAura.oOOO00OOO0[0xBD52 ^ 0xBC61] = 0xBC1E ^ 0xBC61;
                    KillAura.oOOO00OOO0[0x4039 ^ 0x4109] = 0xFFFFBEB8 ^ 0x4109;
                    n3 = -675890542;
                    continue block81;
                }
                case -675890542: {
                    KillAura.oOOO00OOO0[0xEB60 ^ 0xEB63] = 0xF800EB48 ^ 0xEB63;
                    KillAura.oOOO00OOO0[0x39A4 ^ 0x391C] = 0x394B ^ 0x391C;
                    KillAura.oOOO00OOO0[0x768E ^ 0x765A] = 0xFFFF89F5 ^ 0x765A;
                    n3 = -1706933959;
                    continue block81;
                }
                case -1706933959: {
                    KillAura.oOOO00OOO0[0xE4D9 ^ 0xE559] = 0xE574 ^ 0xE559;
                    KillAura.oOOO00OOO0[0xA3C2 ^ 0xA315] = 0xA366 ^ 0xA315;
                    KillAura.oOOO00OOO0[0x20D7 ^ 0x2069] = 0x206A ^ 0x2069;
                    n3 = 1361926213;
                    continue block81;
                }
                case 1361926213: {
                    KillAura.oOOO00OOO0[0xED35 ^ 0xEC37] = 0xFFFF13D8 ^ 0xEC37;
                    KillAura.oOOO00OOO0[0xADFB ^ 0xACDD] = 0x56BEC514 ^ 0xACDD;
                    KillAura.oOOO00OOO0[0x8C8E ^ 0x8C93] = 0x8C8A ^ 0x8C93;
                    n3 = 633606808;
                    continue block81;
                }
                case 633606808: {
                    KillAura.oOOO00OOO0[0xE923 ^ 0xE93A] = 0xE93A ^ 0xE93A;
                    KillAura.oOOO00OOO0[0xE8DC ^ 0xE8F1] = 0xE8AA ^ 0xE8F1;
                    KillAura.oOOO00OOO0[0xD557 ^ 0xD436] = 0xD427 ^ 0xD436;
                    KillAura.oOOO00OOO0[0x781D ^ 0x7952] = 0x797F ^ 0x7952;
                    KillAura.oOOO00OOO0[0x97B9 ^ 0x963F] = 0xFFFF69B2 ^ 0x963F;
                    KillAura.oOOO00OOO0[0x9F4E ^ 0x9E4F] = 0x9E48 ^ 0x9E4F;
                    KillAura.oOOO00OOO0[0x5663 ^ 0x56C2] = 0x56EB ^ 0x56C2;
                    KillAura.oOOO00OOO0[0x9A21 ^ 0x9B7D] = 0x9B70 ^ 0x9B7D;
                    KillAura.oOOO00OOO0[0x96E9 ^ 0x9622] = 0x4FBC4C15 ^ 0x9622;
                    KillAura.oOOO00OOO0[0xB0B3 ^ 0xB138] = 0xB127 ^ 0xB138;
                    n3 = -1295099373;
                    continue block81;
                }
                case -1295099373: {
                    KillAura.oOOO00OOO0[0x10858 ^ 0x108E7] = 0x108FA ^ 0x108E7;
                    KillAura.oOOO00OOO0[0xD0B ^ 0xD35] = 0xD79438D0 ^ 0xD35;
                    KillAura.oOOO00OOO0[0x6094 ^ 0x60E8] = 0x60FB ^ 0x60E8;
                    n3 = -1892142111;
                    continue block81;
                }
                case -1892142111: {
                    KillAura.oOOO00OOO0[0x76B9 ^ 0x76FD] = 0x76F8 ^ 0x76FD;
                    n3 = 855748759;
                    continue block81;
                }
                case 855748759: {
                    KillAura.oOOO00OOO0[0xCA34 ^ 0xCAA4] = 0xCABB ^ 0xCAA4;
                    KillAura.oOOO00OOO0[0x9B76 ^ 0x9B3D] = 0xFFFF64C2 ^ 0x9B3D;
                    KillAura.oOOO00OOO0[0x2944 ^ 0x299A] = 0x2985 ^ 0x299A;
                    n3 = 2054108807;
                    continue block81;
                }
                case 2054108807: {
                    KillAura.oOOO00OOO0[0x10402 ^ 0x1055B] = 0x9EC9EC0A ^ 0x1055B;
                    KillAura.oOOO00OOO0[0xE25B ^ 0xE2A6] = 0xE2A6 ^ 0xE2A6;
                    KillAura.oOOO00OOO0[0x24A7 ^ 0x24CC] = 0x1642EC95 ^ 0x24CC;
                    KillAura.oOOO00OOO0[0xE8EB ^ 0xE85F] = 0xE846 ^ 0xE85F;
                    KillAura.oOOO00OOO0[0x4DC4 ^ 0x4CCA] = 0x4C9D ^ 0x4CCA;
                    KillAura.oOOO00OOO0[0x82B ^ 0x954] = 0x96D ^ 0x954;
                    KillAura.oOOO00OOO0[0xB43E ^ 0xB507] = 0xB55A ^ 0xB507;
                    KillAura.oOOO00OOO0[0x5E84 ^ 0x5E4C] = 0x6FC61118 ^ 0x5E4C;
                    KillAura.oOOO00OOO0[0x7800 ^ 0x782C] = 0x7827 ^ 0x782C;
                    KillAura.oOOO00OOO0[0xB1D9 ^ 0xB0F6] = 0xB0EB ^ 0xB0F6;
                    KillAura.oOOO00OOO0[0x5E1F ^ 0x5E0C] = 0x5E09 ^ 0x5E0C;
                    KillAura.oOOO00OOO0[0xD0A ^ 0xDDC] = 0xC89 ^ 0xDDC;
                    KillAura.oOOO00OOO0[0x5BF8 ^ 0x5ABA] = 0x5AB7 ^ 0x5ABA;
                    n3 = 621835985;
                    continue block81;
                }
                case 621835985: {
                    KillAura.oOOO00OOO0[0xF120 ^ 0xF143] = 0xF158 ^ 0xF143;
                    KillAura.oOOO00OOO0[0xE747 ^ 0xE745] = 0xE756 ^ 0xE745;
                    KillAura.oOOO00OOO0[0xE93B ^ 0xE870] = 0xE86D ^ 0xE870;
                    KillAura.oOOO00OOO0[0x1347 ^ 0x1385] = 0x97B43668 ^ 0x1385;
                    n3 = -1505189220;
                    continue block81;
                }
                case -1505189220: {
                    KillAura.oOOO00OOO0[0x2114 ^ 0x2130] = 0xFFFFDEB7 ^ 0x2130;
                    n3 = 108736399;
                    continue block81;
                }
                case 108736399: {
                    KillAura.oOOO00OOO0[0xD65D ^ 0xD6D6] = 0xD6AB ^ 0xD6D6;
                    KillAura.oOOO00OOO0[0x246 ^ 0x377] = 0x69EE5B39 ^ 0x377;
                    n3 = -51521793;
                    continue block81;
                }
                case -51521793: {
                    KillAura.oOOO00OOO0[0x8E33 ^ 0x8E1C] = 0x8EDB21EC ^ 0x8E1C;
                    KillAura.oOOO00OOO0[0xAA9B ^ 0xAB9D] = 0x5F02083C ^ 0xAB9D;
                    KillAura.oOOO00OOO0[0x482F ^ 0x48C2] = 0xFFFFB73D ^ 0x48C2;
                    KillAura.oOOO00OOO0[0xE94 ^ 0xFB8] = 0xFDB ^ 0xFB8;
                    KillAura.oOOO00OOO0[0xA9A0 ^ 0xA93F] = 0xA932 ^ 0xA93F;
                    KillAura.oOOO00OOO0[0xA4C2 ^ 0xA58F] = 0xA584 ^ 0xA58F;
                    KillAura.oOOO00OOO0[0x9D99 ^ 0x9DFF] = 0x9DF2 ^ 0x9DFF;
                    KillAura.oOOO00OOO0[0xCDE4 ^ 0xCCCF] = 0xCCE4 ^ 0xCCCF;
                    KillAura.oOOO00OOO0[0x8503 ^ 0x854D] = 0xFFFF7AB2 ^ 0x854D;
                    KillAura.oOOO00OOO0[0x4A29 ^ 0x4B41] = 0xB3FFAB49 ^ 0x4B41;
                    n3 = -1249399704;
                    continue block81;
                }
                case -1249399704: {
                    KillAura.oOOO00OOO0[0xD9FD ^ 0xD94E] = 0xD949 ^ 0xD94E;
                    KillAura.oOOO00OOO0[0xAFD2 ^ 0xAF82] = 0xFFFF5073 ^ 0xAF82;
                    KillAura.oOOO00OOO0[0x32A7 ^ 0x32B2] = 0xFFFFCD4D ^ 0x32B2;
                    KillAura.oOOO00OOO0[0x12F4 ^ 0x12A8] = 0x12B5 ^ 0x12A8;
                    KillAura.oOOO00OOO0[0xDF09 ^ 0xDF9B] = 0xDF9C ^ 0xDF9B;
                    KillAura.oOOO00OOO0[0x778 ^ 0x748] = 0x713 ^ 0x748;
                    KillAura.oOOO00OOO0[0x9CCD ^ 0x9CDB] = 0xFFFF637E ^ 0x9CDB;
                    KillAura.oOOO00OOO0[0x280B ^ 0x2848] = 0x72D77BF5 ^ 0x2848;
                    KillAura.oOOO00OOO0[0x5D82 ^ 0x5D14] = 0x5D05 ^ 0x5D14;
                    KillAura.oOOO00OOO0[0x7F50 ^ 0x7FE6] = 0x2D02AFCB ^ 0x7FE6;
                    KillAura.oOOO00OOO0[0x9DB0 ^ 0x9DBA] = 0x9DA7 ^ 0x9DBA;
                    KillAura.oOOO00OOO0[0x92C7 ^ 0x9287] = 0xCA451400 ^ 0x9287;
                    n3 = -1958549771;
                    continue block81;
                }
                case -1958549771: {
                    KillAura.oOOO00OOO0[0x44A8 ^ 0x44A0] = 0x44BF ^ 0x44A0;
                    KillAura.oOOO00OOO0[0xDF8B ^ 0xDF5B] = 0xDF56 ^ 0xDF5B;
                    KillAura.oOOO00OOO0[0xE80F ^ 0xE8C1] = 0xFFFF3770 ^ 0xE8C1;
                    KillAura.oOOO00OOO0[0x502C ^ 0x5033] = 0x5056 ^ 0x5033;
                    KillAura.oOOO00OOO0[0x7AAF ^ 0x7A22] = 0x89A9E65 ^ 0x7A22;
                    KillAura.oOOO00OOO0[0x10CAB ^ 0x10C6F] = 0x97B52982 ^ 0x10C6F;
                    KillAura.oOOO00OOO0[0xE058 ^ 0xE12D] = 0xFFFF1ED2 ^ 0xE12D;
                    KillAura.oOOO00OOO0[0xD02B ^ 0xD06E] = 0xD075 ^ 0xD06E;
                    return;
                }
                default: {
                    KillAura.oOOO00OOO0[0x4557 ^ 0x440A] = 0xE9BD73AD ^ 0x440A;
                    KillAura.oOOO00OOO0[0xC52E ^ 0xC4A9] = 0xAE14BE74 ^ 0xC4A9;
                    KillAura.oOOO00OOO0[0xEA98 ^ 0xEAF2] = 0xFFFF150B ^ 0xEAF2;
                    KillAura.oOOO00OOO0[0x747C ^ 0x754B] = 0xFFFF8A8C ^ 0x754B;
                    n3 = 1019491055;
                    continue block81;
                }
                case 1019491055: {
                    KillAura.oOOO00OOO0[0x17E0 ^ 0x16D4] = 0x16D4 ^ 0x16D4;
                    n3 = -1540826876;
                    continue block81;
                }
                case -1540826876: {
                    KillAura.oOOO00OOO0[0x5C95 ^ 0x5C87] = 0x5C9C ^ 0x5C87;
                    KillAura.oOOO00OOO0[0xD624 ^ 0xD6A4] = 0xBFFF295B ^ 0xD6A4;
                    KillAura.oOOO00OOO0[0x6B9B ^ 0x6B3C] = 0x9882D20D ^ 0x6B3C;
                    KillAura.oOOO00OOO0[0x9B73 ^ 0x9B9B] = 0xC1F0E784 ^ 0x9B9B;
                    KillAura.oOOO00OOO0[0x4B12 ^ 0x4A20] = 0x4A3D ^ 0x4A20;
                    KillAura.oOOO00OOO0[0x7A3C ^ 0x7AD0] = 0x7AD3 ^ 0x7AD0;
                    n3 = -121665591;
                    continue block81;
                }
                case -121665591: {
                    KillAura.oOOO00OOO0[0xBEAF ^ 0xBFA4] = 0xBFA5 ^ 0xBFA4;
                    KillAura.oOOO00OOO0[0x103E3 ^ 0x102FB] = 0xFFFEFD0C ^ 0x102FB;
                    KillAura.oOOO00OOO0[0x1549 ^ 0x141A] = 0x1407 ^ 0x141A;
                    KillAura.oOOO00OOO0[0xBE60 ^ 0xBE91] = 0xFFFF416E ^ 0xBE91;
                    KillAura.oOOO00OOO0[0x712D ^ 0x714F] = 0x714A ^ 0x714F;
                    KillAura.oOOO00OOO0[0x7EB0 ^ 0x7FF0] = 0xC71C0E37 ^ 0x7FF0;
                    n3 = 1259889453;
                    continue block81;
                }
                case 1259889453: {
                    KillAura.oOOO00OOO0[0x7F97 ^ 0x7F1E] = 0xFFFF80E5 ^ 0x7F1E;
                    KillAura.oOOO00OOO0[0xACD1 ^ 0xACFB] = 0xEDDAA833 ^ 0xACFB;
                    KillAura.oOOO00OOO0[0xEB86 ^ 0xEBDE] = 0xF2FFC42D ^ 0xEBDE;
                    KillAura.oOOO00OOO0[0x89DD ^ 0x896F] = 0x897A ^ 0x896F;
                    KillAura.oOOO00OOO0[0xA218 ^ 0xA369] = 0x5F0200C8 ^ 0xA369;
                    KillAura.oOOO00OOO0[0x6F34 ^ 0x6F3F] = 0x6F3C ^ 0x6F3F;
                    KillAura.oOOO00OOO0[0x76DE ^ 0x760F] = 0x761C ^ 0x760F;
                    KillAura.oOOO00OOO0[0x1099A ^ 0x108FD] = 0x9E0C53B8 ^ 0x108FD;
                    KillAura.oOOO00OOO0[0x1792 ^ 0x16EE] = 0x16E1 ^ 0x16EE;
                    KillAura.oOOO00OOO0[0xFE43 ^ 0xFE99] = 0xFE98 ^ 0xFE99;
                    KillAura.oOOO00OOO0[0x64D5 ^ 0x6422] = 0x6437 ^ 0x6422;
                    KillAura.oOOO00OOO0[0x10545 ^ 0x1042F] = 0xFFFEFBD0 ^ 0x1042F;
                    KillAura.oOOO00OOO0[0x6723 ^ 0x664E] = 0x6657 ^ 0x664E;
                    KillAura.oOOO00OOO0[0xEA52 ^ 0xEAD6] = 0xEAD1 ^ 0xEAD6;
                    n3 = 425730431;
                    continue block81;
                }
                case 425730431: {
                    KillAura.oOOO00OOO0[0xFAA8 ^ 0xFB90] = 0xBD22C7B2 ^ 0xFB90;
                    KillAura.oOOO00OOO0[0x1794 ^ 0x1718] = 0x303141B ^ 0x1718;
                    KillAura.oOOO00OOO0[0x8565 ^ 0x843E] = 0x842D ^ 0x843E;
                    KillAura.oOOO00OOO0[0xB5C8 ^ 0xB578] = 0xB56F ^ 0xB578;
                    KillAura.oOOO00OOO0[0x5449 ^ 0x5540] = 0x24C6E ^ 0x5540;
                    KillAura.oOOO00OOO0[0x64F0 ^ 0x64B9] = 0x6474 ^ 0x64B9;
                    KillAura.oOOO00OOO0[0x692F ^ 0x690F] = 0x83CD279C ^ 0x690F;
                    KillAura.oOOO00OOO0[0x10C90 ^ 0x10CA3] = 0x10CAE ^ 0x10CA3;
                    KillAura.oOOO00OOO0[0xF48E ^ 0xF4B8] = 0xF4AF ^ 0xF4B8;
                    KillAura.oOOO00OOO0[0x355C ^ 0x353D] = 0xE8003538 ^ 0x353D;
                    KillAura.oOOO00OOO0[0x9A29 ^ 0x9AC6] = 0x9AC9 ^ 0x9AC6;
                    KillAura.oOOO00OOO0[0x4DC9 ^ 0x4D6A] = 0xFFFFB2E1 ^ 0x4D6A;
                    KillAura.oOOO00OOO0[0xF842 ^ 0xF960] = 0xFFFF068F ^ 0xF960;
                    KillAura.oOOO00OOO0[0xF5 ^ 0xDE] = 0xCB ^ 0xDE;
                    n3 = 239327007;
                    continue block81;
                }
                case 239327007: {
                    KillAura.oOOO00OOO0[0x32D8 ^ 0x33C5] = 0x33DA ^ 0x33C5;
                    KillAura.oOOO00OOO0[0x466F ^ 0x46CA] = 0x46C3 ^ 0x46CA;
                    n3 = 143645324;
                    continue block81;
                }
                case 143645324: {
                    KillAura.oOOO00OOO0[0x2428 ^ 0x240B] = 0x245A ^ 0x240B;
                    KillAura.oOOO00OOO0[0xD27E ^ 0xD2F0] = 0xFFFF2D79 ^ 0xD2F0;
                    KillAura.oOOO00OOO0[0x1ED5 ^ 0x1FF2] = 0xFFFFE032 ^ 0x1FF2;
                    n3 = -1982634764;
                    continue block81;
                }
                case -1982634764: {
                    KillAura.oOOO00OOO0[0x7A96 ^ 0x7A8E] = 0xFFFF850D ^ 0x7A8E;
                    KillAura.oOOO00OOO0[0xE1F9 ^ 0xE109] = 0xFFFF1EF6 ^ 0xE109;
                    KillAura.oOOO00OOO0[0x4488 ^ 0x443F] = 0x4456 ^ 0x443F;
                    KillAura.oOOO00OOO0[0x5E77 ^ 0x5E38] = 0xFFFFA1C9 ^ 0x5E38;
                    KillAura.oOOO00OOO0[0xAAF1 ^ 0xAA95] = 0xFFFF556A ^ 0xAA95;
                    n3 = -928601091;
                    continue block81;
                }
                case -928601091: {
                    KillAura.oOOO00OOO0[0xCB92 ^ 0xCB4B] = 0xFFFF34E6 ^ 0xCB4B;
                    KillAura.oOOO00OOO0[0x9442 ^ 0x957C] = 0xFFFF6A8D ^ 0x957C;
                    n3 = -1859897204;
                    continue block81;
                }
                case -1859897204: {
                    KillAura.oOOO00OOO0[0x735 ^ 0x620] = 0x2665 ^ 0x620;
                    KillAura.oOOO00OOO0[0xFEB2 ^ 0xFF87] = 0xFF92 ^ 0xFF87;
                    n3 = -1171606318;
                    continue block81;
                }
                case -1171606318: {
                    KillAura.oOOO00OOO0[0x4ECE ^ 0x4E83] = 0x4E81 ^ 0x4E83;
                    KillAura.oOOO00OOO0[0xCCDE ^ 0xCC3C] = 0xCC27 ^ 0xCC3C;
                    KillAura.oOOO00OOO0[0xBCB ^ 0xBD0] = 0xBDD ^ 0xBD0;
                    KillAura.oOOO00OOO0[0x3BEA ^ 0x3BE7] = 0x3BFA ^ 0x3BE7;
                    KillAura.oOOO00OOO0[0x9C07 ^ 0x9D7E] = 0x9D6F ^ 0x9D7E;
                    n3 = -1249392158;
                    continue block81;
                }
                case -1249392158: {
                    KillAura.oOOO00OOO0[0xAEA4 ^ 0xAE86] = 0xAE91 ^ 0xAE86;
                    KillAura.oOOO00OOO0[0xE89A ^ 0xE86C] = 0x6FA0E868 ^ 0xE86C;
                    KillAura.oOOO00OOO0[0x102BC ^ 0x103B4] = 0x103A9 ^ 0x103B4;
                    KillAura.oOOO00OOO0[0x2957 ^ 0x29D0] = 0xC28F75F9 ^ 0x29D0;
                    KillAura.oOOO00OOO0[0xF869 ^ 0xF8F2] = 0xF8FB ^ 0xF8F2;
                    KillAura.oOOO00OOO0[0xEC85 ^ 0xECCF] = 0xFFFF135C ^ 0xECCF;
                    n3 = -1441961503;
                    continue block81;
                }
                case -1441961503: {
                    KillAura.oOOO00OOO0[0xA38D ^ 0xA3E0] = 0xA3E1 ^ 0xA3E0;
                    KillAura.oOOO00OOO0[0xEDE9 ^ 0xEDE7] = 0xEDAA ^ 0xEDE7;
                    KillAura.oOOO00OOO0[0xF292 ^ 0xF232] = 0x3E7091D5 ^ 0xF232;
                    KillAura.oOOO00OOO0[0x1D74 ^ 0x1C0C] = 0xFFFFE3A7 ^ 0x1C0C;
                    KillAura.oOOO00OOO0[0xBB79 ^ 0xBB4E] = 0x77D4D604 ^ 0xBB4E;
                    KillAura.oOOO00OOO0[0x5B7F ^ 0x5A3B] = 0x5A06 ^ 0x5A3B;
                    n3 = 1071102973;
                    continue block81;
                }
                case 1071102973: {
                    KillAura.oOOO00OOO0[0xDD2E ^ 0xDC00] = 0xDC03 ^ 0xDC00;
                    n3 = -1192012084;
                    continue block81;
                }
                case -1192012084: {
                    KillAura.oOOO00OOO0[0xE193 ^ 0xE14F] = 0xFFFF1EE4 ^ 0xE14F;
                    KillAura.oOOO00OOO0[0xDA9C ^ 0xDAE9] = 0xDADC ^ 0xDAE9;
                    n3 = -1389919036;
                    continue block81;
                }
                case -1389919036: {
                    KillAura.oOOO00OOO0[0xEA85 ^ 0xEA85] = 0x86BC4B72 ^ 0xEA85;
                    KillAura.oOOO00OOO0[0x302C ^ 0x304B] = 0x3058 ^ 0x304B;
                    KillAura.oOOO00OOO0[0x2635 ^ 0x2647] = 0x265A ^ 0x2647;
                    KillAura.oOOO00OOO0[0xFA16 ^ 0xFA1A] = 0xFA19 ^ 0xFA1A;
                    KillAura.oOOO00OOO0[0xFF2B ^ 0xFFA8] = 0xFFBF ^ 0xFFA8;
                    KillAura.oOOO00OOO0[0xC49E ^ 0xC5C8] = 0xC5CD ^ 0xC5C8;
                    KillAura.oOOO00OOO0[0xB0AB ^ 0xB0B1] = 0xB0A2 ^ 0xB0B1;
                    KillAura.oOOO00OOO0[0xA35D ^ 0xA3E8] = 0x6666C5F3 ^ 0xA3E8;
                    KillAura.oOOO00OOO0[0x8909 ^ 0x8957] = 0xFFFF76A8 ^ 0x8957;
                    KillAura.oOOO00OOO0[0xAEF ^ 0xB84] = 0xBD3 ^ 0xB84;
                    KillAura.oOOO00OOO0[0xD545 ^ 0xD4C1] = 0xD4DC ^ 0xD4C1;
                    n3 = 1520282980;
                    continue block81;
                }
                case 1520282980: {
                    KillAura.oOOO00OOO0[0x10BB6 ^ 0x10B65] = 0xFFFEF49A ^ 0x10B65;
                    n3 = -1584861512;
                    continue block81;
                }
                case -1584861512: 
            }
            KillAura.oOOO00OOO0[0x146E ^ 0x1433] = 0x1430 ^ 0x1433;
            KillAura.oOOO00OOO0[0x7A49 ^ 0x7B18] = 0x60007B14 ^ 0x7B18;
            KillAura.oOOO00OOO0[0xAE73 ^ 0xAF76] = 0xAF2B ^ 0xAF76;
            KillAura.oOOO00OOO0[0xA5E2 ^ 0xA508] = 0xFFFF5A93 ^ 0xA508;
            KillAura.oOOO00OOO0[0x6F19 ^ 0x6F4F] = 0xFFFF90B0 ^ 0x6F4F;
            KillAura.oOOO00OOO0[0xEB93 ^ 0xEB0F] = 0xEB0A ^ 0xEB0F;
            KillAura.oOOO00OOO0[0xDFA ^ 0xC93] = 0x3F4FDF66 ^ 0xC93;
            n3 = 1011847568;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ boolean a(Block var0) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public KillAura() {
        long l2;
        BooleanValue booleanValue;
        int n2 = -453327753;
        if (n2 != n2) {
        }
        if ((n2 = 1993590861) != n2) {
            throw new BindException();
        }
        n2 = 1489459453;
        if (n2 != n2) {
            OOOO0ooooO = n2 = -721951016;
        }
        if ((n2 = 1703789000) != n2) {
        }
        if ((n2 = 606141797) != n2) {
            throw null;
        }
        Object[] objectArray = new Object[6];
        long[] lArray = new long[6];
        int n3 = -(oOOO00OOO0[3] + oOOO00OOO0[4]);
        Mode[] modeArray = new Mode[n3 >>> oOOO00OOO0[5] | n3 << oOOO00OOO0[6]];
        int n4 = oOOO00OOO0[7];
        int n5 = n4 >>> oOOO00OOO0[8] | n4 << oOOO00OOO0[9];
        int n6 = n5 << oOOO00OOO0[10] | n5 >>> oOOO00OOO0[11];
        int n7 = oOOO00OOO0[15] + oOOO00OOO0[16] ^ oOOO00OOO0[17];
        modeArray[(n6 >>> KillAura.oOOO00OOO0[12] | n6 << KillAura.oOOO00OOO0[13]) - KillAura.oOOO00OOO0[14]] = new aks((String)O00O0oO0O0[n7 << oOOO00OOO0[18] | n7 >>> oOOO00OOO0[19]]);
        Mode[] modeArray2 = new Mode[((oOOO00OOO0[20] ^ oOOO00OOO0[21]) - oOOO00OOO0[22] ^ oOOO00OOO0[23]) * oOOO00OOO0[24]];
        int n8 = -oOOO00OOO0[25];
        int n9 = -(-oOOO00OOO0[28]);
        modeArray2[n8 >>> KillAura.oOOO00OOO0[26] | n8 << KillAura.oOOO00OOO0[27]] = new aks((String)O00O0oO0O0[n9 << oOOO00OOO0[29] | n9 >>> oOOO00OOO0[30]]);
        Mode[] modeArray3 = new Mode[-(oOOO00OOO0[31] * oOOO00OOO0[32])];
        int n10 = oOOO00OOO0[37];
        modeArray3[((KillAura.oOOO00OOO0[33] ^ KillAura.oOOO00OOO0[34]) - KillAura.oOOO00OOO0[35]) * KillAura.oOOO00OOO0[36]] = new aks((String)O00O0oO0O0[((n10 >>> oOOO00OOO0[38] | n10 << oOOO00OOO0[39]) ^ oOOO00OOO0[40]) - oOOO00OOO0[41]]);
        int n11 = oOOO00OOO0[42];
        this.lT = new ModeValue((String)O00O0oO0O0[(oOOO00OOO0[0] ^ oOOO00OOO0[1]) * oOOO00OOO0[2]], this).a(modeArray).a(modeArray2).a(modeArray3).co((String)O00O0oO0O0[-((n11 >>> oOOO00OOO0[43] | n11 << oOOO00OOO0[44]) + oOOO00OOO0[45]) * oOOO00OOO0[46]]);
        int n12 = oOOO00OOO0[50];
        int n13 = n12 >>> oOOO00OOO0[51] | n12 << oOOO00OOO0[52];
        int n14 = (oOOO00OOO0[55] - oOOO00OOO0[56]) * oOOO00OOO0[57] + oOOO00OOO0[58];
        int n15 = (oOOO00OOO0[64] - oOOO00OOO0[65]) * oOOO00OOO0[66] * oOOO00OOO0[67];
        this.lU = new akj((String)O00O0oO0O0[oOOO00OOO0[47] * oOOO00OOO0[48] * oOOO00OOO0[49]], this, (Number)(n13 << oOOO00OOO0[53] | n13 >>> oOOO00OOO0[54]), (Number)(n14 << oOOO00OOO0[59] | n14 >>> oOOO00OOO0[60]), (Number)(oOOO00OOO0[61] * oOOO00OOO0[62] - oOOO00OOO0[63]), (Number)(n15 >>> oOOO00OOO0[68] | n15 << oOOO00OOO0[69]), (Number)(-(oOOO00OOO0[70] * oOOO00OOO0[71]) * oOOO00OOO0[72]), () -> {
            int n2;
            int n3 = -1549002936;
            if (n3 != n3) {
                throw null;
            }
            if (!((Mode)this.lT.wD()).getName().equals((String)O00O0oO0O0[((2711552 >>> 13 | 2711552 << 19) ^ 0x13) + -45])) {
                n2 = ~((-1290349501 - -19) * -105 * 11);
            } else {
                int n4 = ~-1;
                int n5 = n4 >>> 19 | n4 << 13;
                int n6 = n5 << 11 | n5 >>> 21;
                n2 = n6 << 15 | n6 >>> 17;
            }
            return n2 != 0;
        });
        Mode[] modeArray4 = new Mode[-oOOO00OOO0[77] ^ oOOO00OOO0[78]];
        int n16 = (oOOO00OOO0[79] - oOOO00OOO0[80]) * oOOO00OOO0[81];
        modeArray4[-(n16 << KillAura.oOOO00OOO0[82] | n16 >>> KillAura.oOOO00OOO0[83])] = new aks((String)O00O0oO0O0[(oOOO00OOO0[84] - oOOO00OOO0[85] ^ oOOO00OOO0[86]) * oOOO00OOO0[87]]);
        Mode[] modeArray5 = new Mode[-oOOO00OOO0[88] * oOOO00OOO0[89] * oOOO00OOO0[90]];
        int n17 = oOOO00OOO0[91];
        int n18 = (n17 >>> oOOO00OOO0[92] | n17 << oOOO00OOO0[93]) ^ oOOO00OOO0[94];
        int n19 = oOOO00OOO0[97];
        modeArray5[-(n18 >>> KillAura.oOOO00OOO0[95] | n18 << KillAura.oOOO00OOO0[96])] = new aks((String)O00O0oO0O0[-(n19 << oOOO00OOO0[98] | n19 >>> oOOO00OOO0[99]) * oOOO00OOO0[100]]);
        int n20 = oOOO00OOO0[101];
        Mode[] modeArray6 = new Mode[(n20 >>> oOOO00OOO0[102] | n20 << oOOO00OOO0[103]) - oOOO00OOO0[104]];
        int n21 = -(oOOO00OOO0[108] - oOOO00OOO0[109]) ^ oOOO00OOO0[110];
        modeArray6[(KillAura.oOOO00OOO0[105] - KillAura.oOOO00OOO0[106]) * KillAura.oOOO00OOO0[107]] = new aks((String)O00O0oO0O0[n21 << oOOO00OOO0[111] | n21 >>> oOOO00OOO0[112]]);
        int n22 = oOOO00OOO0[113];
        Mode[] modeArray7 = new Mode[(n22 >>> oOOO00OOO0[114] | n22 << oOOO00OOO0[115]) * oOOO00OOO0[116] + oOOO00OOO0[117]];
        int n23 = oOOO00OOO0[118] ^ oOOO00OOO0[119] ^ oOOO00OOO0[120];
        int n24 = oOOO00OOO0[123];
        modeArray7[n23 >>> KillAura.oOOO00OOO0[121] | n23 << KillAura.oOOO00OOO0[122]] = new aks((String)O00O0oO0O0[-(((n24 >>> oOOO00OOO0[124] | n24 << oOOO00OOO0[125]) ^ oOOO00OOO0[126]) * oOOO00OOO0[127])]);
        int n25 = oOOO00OOO0[128] ^ oOOO00OOO0[129];
        int n26 = n25 << oOOO00OOO0[130] | n25 >>> oOOO00OOO0[131];
        Mode[] modeArray8 = new Mode[n26 >>> oOOO00OOO0[132] | n26 << oOOO00OOO0[133]];
        modeArray8[(-KillAura.oOOO00OOO0[134] * KillAura.oOOO00OOO0[135] ^ KillAura.oOOO00OOO0[136]) - KillAura.oOOO00OOO0[137]] = new aks((String)O00O0oO0O0[oOOO00OOO0[138] * oOOO00OOO0[139] * oOOO00OOO0[140]]);
        int n27 = oOOO00OOO0[141] * oOOO00OOO0[142];
        int n28 = n27 >>> oOOO00OOO0[143] | n27 << oOOO00OOO0[144];
        Mode[] modeArray9 = new Mode[(n28 << oOOO00OOO0[145] | n28 >>> oOOO00OOO0[146]) ^ oOOO00OOO0[147]];
        int n29 = oOOO00OOO0[148];
        int n30 = oOOO00OOO0[152] - oOOO00OOO0[153];
        int n31 = n30 << oOOO00OOO0[154] | n30 >>> oOOO00OOO0[155];
        int n32 = n31 >>> oOOO00OOO0[156] | n31 << oOOO00OOO0[157];
        modeArray9[(n29 << KillAura.oOOO00OOO0[149] | n29 >>> KillAura.oOOO00OOO0[150]) * KillAura.oOOO00OOO0[151]] = new aks((String)O00O0oO0O0[n32 >>> oOOO00OOO0[158] | n32 << oOOO00OOO0[159]]);
        Mode[] modeArray10 = new Mode[-oOOO00OOO0[160] * oOOO00OOO0[161]];
        int n33 = oOOO00OOO0[162] + oOOO00OOO0[163];
        modeArray10[((n33 << KillAura.oOOO00OOO0[164] | n33 >>> KillAura.oOOO00OOO0[165]) + KillAura.oOOO00OOO0[166]) * KillAura.oOOO00OOO0[167]] = new aks((String)O00O0oO0O0[((oOOO00OOO0[168] ^ oOOO00OOO0[169]) + oOOO00OOO0[170]) * oOOO00OOO0[171] + oOOO00OOO0[172]]);
        int n34 = oOOO00OOO0[173] ^ oOOO00OOO0[174];
        int n35 = n34 >>> oOOO00OOO0[175] | n34 << oOOO00OOO0[176];
        int n36 = n35 << oOOO00OOO0[177] | n35 >>> oOOO00OOO0[178];
        Mode[] modeArray11 = new Mode[n36 >>> oOOO00OOO0[179] | n36 << oOOO00OOO0[180]];
        int n37 = oOOO00OOO0[185];
        modeArray11[KillAura.oOOO00OOO0[181] * KillAura.oOOO00OOO0[182] * KillAura.oOOO00OOO0[183] - KillAura.oOOO00OOO0[184]] = new aks((String)O00O0oO0O0[(n37 >>> oOOO00OOO0[186] | n37 << oOOO00OOO0[187]) ^ oOOO00OOO0[188]]);
        ModeValue modeValue = new ModeValue((String)O00O0oO0O0[oOOO00OOO0[73] + oOOO00OOO0[74] ^ oOOO00OOO0[75] ^ oOOO00OOO0[76]], this).a(modeArray4).a(modeArray5).a(modeArray6).a(modeArray7).a(modeArray8).a(modeArray9).a(modeArray10).a(modeArray11);
        int n38 = oOOO00OOO0[189];
        Mode[] modeArray12 = new Mode[(n38 << oOOO00OOO0[190] | n38 >>> oOOO00OOO0[191]) * oOOO00OOO0[192] * oOOO00OOO0[193] * oOOO00OOO0[194]];
        int n39 = -(oOOO00OOO0[195] * oOOO00OOO0[196] * oOOO00OOO0[197]);
        int n40 = n39 << oOOO00OOO0[198] | n39 >>> oOOO00OOO0[199];
        String string = o0Oo000O0oO;
        if (string == null) {
            string = o0Oo000O0oO = (String)O00O0oO0O0[oOOO00OOO0[200] * oOOO00OOO0[201] ^ oOOO00OOO0[202]] + (String)O00O0oO0O0[oOOO00OOO0[203] * oOOO00OOO0[204] + oOOO00OOO0[205]];
        }
        modeArray12[n40] = new aks(string);
        int n41 = oOOO00OOO0[206] ^ oOOO00OOO0[207];
        Mode[] modeArray13 = new Mode[n41 >>> oOOO00OOO0[208] | n41 << oOOO00OOO0[209]];
        int n42 = (oOOO00OOO0[214] ^ oOOO00OOO0[215] ^ oOOO00OOO0[216]) + oOOO00OOO0[217];
        modeArray13[KillAura.oOOO00OOO0[210] ^ KillAura.oOOO00OOO0[211] ^ KillAura.oOOO00OOO0[212] ^ KillAura.oOOO00OOO0[213]] = new aks((String)O00O0oO0O0[n42 >>> oOOO00OOO0[218] | n42 << oOOO00OOO0[219]]);
        int n43 = oOOO00OOO0[220] + oOOO00OOO0[221];
        Mode[] modeArray14 = new Mode[n43 << oOOO00OOO0[222] | n43 >>> oOOO00OOO0[223]];
        int n44 = oOOO00OOO0[224] * oOOO00OOO0[225];
        int n45 = n44 << oOOO00OOO0[226] | n44 >>> oOOO00OOO0[227];
        modeArray14[n45 >>> KillAura.oOOO00OOO0[228] | n45 << KillAura.oOOO00OOO0[229]] = new aks((String)O00O0oO0O0[(oOOO00OOO0[230] ^ oOOO00OOO0[231]) * oOOO00OOO0[232]]);
        int n46 = oOOO00OOO0[233] * oOOO00OOO0[234];
        int n47 = (n46 >>> oOOO00OOO0[235] | n46 << oOOO00OOO0[236]) ^ oOOO00OOO0[237];
        Mode[] modeArray15 = new Mode[n47 << oOOO00OOO0[238] | n47 >>> oOOO00OOO0[239]];
        int n48 = oOOO00OOO0[240] ^ oOOO00OOO0[241];
        int n49 = oOOO00OOO0[246];
        modeArray15[(n48 << KillAura.oOOO00OOO0[242] | n48 >>> KillAura.oOOO00OOO0[243]) * KillAura.oOOO00OOO0[244] * KillAura.oOOO00OOO0[245]] = new aks((String)O00O0oO0O0[(n49 >>> oOOO00OOO0[247] | n49 << oOOO00OOO0[248]) * oOOO00OOO0[249]]);
        int n50 = -oOOO00OOO0[250];
        Mode[] modeArray16 = new Mode[n50 >>> oOOO00OOO0[251] | n50 << oOOO00OOO0[252]];
        int n51 = oOOO00OOO0[255];
        modeArray16[-(-KillAura.oOOO00OOO0[253]) * KillAura.oOOO00OOO0[254]] = new aks((String)O00O0oO0O0[-(n51 << oOOO00OOO0[256] | n51 >>> oOOO00OOO0[257]) * oOOO00OOO0[258]]);
        int n52 = (oOOO00OOO0[259] + oOOO00OOO0[260]) * oOOO00OOO0[261] * oOOO00OOO0[262];
        Mode[] modeArray17 = new Mode[n52 << oOOO00OOO0[263] | n52 >>> oOOO00OOO0[264]];
        int n53 = oOOO00OOO0[265] * oOOO00OOO0[266];
        int n54 = oOOO00OOO0[271] ^ oOOO00OOO0[272] ^ oOOO00OOO0[273];
        modeArray17[(n53 << KillAura.oOOO00OOO0[267] | n53 >>> KillAura.oOOO00OOO0[268]) * KillAura.oOOO00OOO0[269] ^ KillAura.oOOO00OOO0[270]] = new aks((String)O00O0oO0O0[(n54 << oOOO00OOO0[274] | n54 >>> oOOO00OOO0[275]) ^ oOOO00OOO0[276]]);
        int n55 = (oOOO00OOO0[277] ^ oOOO00OOO0[278]) - oOOO00OOO0[279] + oOOO00OOO0[280];
        Mode[] modeArray18 = new Mode[n55 >>> oOOO00OOO0[281] | n55 << oOOO00OOO0[282]];
        int n56 = oOOO00OOO0[283];
        modeArray18[-(n56 >>> KillAura.oOOO00OOO0[284] | n56 << KillAura.oOOO00OOO0[285])] = new aks((String)O00O0oO0O0[(oOOO00OOO0[286] ^ oOOO00OOO0[287]) + oOOO00OOO0[288]]);
        Mode[] modeArray19 = new Mode[(oOOO00OOO0[289] - oOOO00OOO0[290]) * oOOO00OOO0[291] - oOOO00OOO0[292]];
        int n57 = oOOO00OOO0[295];
        modeArray19[KillAura.oOOO00OOO0[293] * KillAura.oOOO00OOO0[294]] = new aks((String)O00O0oO0O0[-(n57 << oOOO00OOO0[296] | n57 >>> oOOO00OOO0[297])]);
        this.lV = modeValue.a(modeArray12).a(modeArray13).a(modeArray14).a(modeArray15).a(modeArray16).a(modeArray17).a(modeArray18).a(modeArray19).co((String)O00O0oO0O0[(oOOO00OOO0[298] ^ oOOO00OOO0[299]) + oOOO00OOO0[300]]);
        String string2 = q0OOOoo00o0;
        if (string2 == null) {
            int n58 = oOOO00OOO0[301];
            string2 = q0OOOoo00o0 = (String)O00O0oO0O0[(n58 >>> oOOO00OOO0[302] | n58 << oOOO00OOO0[303]) + oOOO00OOO0[304]] + (String)O00O0oO0O0[-(-(oOOO00OOO0[305] * oOOO00OOO0[306] ^ oOOO00OOO0[307]))];
        }
        int n59 = oOOO00OOO0[308];
        this.lW = new BooleanValue(string2, (Module)this, (Boolean)((n59 << oOOO00OOO0[309] | n59 >>> oOOO00OOO0[310]) * oOOO00OOO0[311]), () -> {
            int n2;
            int n3 = -307562926;
            if (n3 != n3) {
                int cfr_ignored_0 = 0xD & 1;
            }
            if (!((Mode)this.lV.wD()).getName().equals((String)O00O0oO0O0[~-294 - 5 + 19])) {
                n2 = -(~0);
            } else {
                int n4 = -0;
                n2 = n4 << 11 | n4 >>> 21;
            }
            return n2 != 0;
        });
        String string3 = Oo0o00000O00;
        if (string3 == null) {
            string3 = Oo0o00000O00 = (String)O00O0oO0O0[(oOOO00OOO0[312] * oOOO00OOO0[313] + oOOO00OOO0[314] - oOOO00OOO0[315]) * oOOO00OOO0[316]] + (String)O00O0oO0O0[-(-(oOOO00OOO0[317] + oOOO00OOO0[318]))];
        }
        int n60 = oOOO00OOO0[319] * oOOO00OOO0[320] * oOOO00OOO0[321];
        this.lX = new BooleanValue(string3, (Module)this, (Boolean)((n60 << oOOO00OOO0[322] | n60 >>> oOOO00OOO0[323]) - oOOO00OOO0[324]), () -> {
            block0: {
                int n2 = -784056802;
                if (n2 == n2) break block0;
                int cfr_ignored_0 = 73 + 55;
            }
            return !this.eB() ? (-65011713 << 11 | -65011713 >>> 21) + 33 : -(0 >>> 5 | 0 << 27) * -1556147571;
        });
        String string4 = oO00O0OO0ooO;
        if (string4 == null) {
            int n61 = oOOO00OOO0[325];
            int n62 = (n61 << oOOO00OOO0[326] | n61 >>> oOOO00OOO0[327]) * oOOO00OOO0[328] ^ oOOO00OOO0[329];
            int n63 = oOOO00OOO0[332];
            string4 = oO00O0OO0ooO = (String)O00O0oO0O0[n62 >>> oOOO00OOO0[330] | n62 << oOOO00OOO0[331]] + (String)O00O0oO0O0[((n63 >>> oOOO00OOO0[333] | n63 << oOOO00OOO0[334]) - oOOO00OOO0[335]) * oOOO00OOO0[336]];
        }
        int n64 = -oOOO00OOO0[337];
        this.lY = new BooleanValue(string4, (Module)this, (Boolean)(-((n64 << oOOO00OOO0[338] | n64 >>> oOOO00OOO0[339]) + oOOO00OOO0[340])), this::ge);
        String string5 = q0oOOoOo0O00O;
        if (string5 == null) {
            int n65 = oOOO00OOO0[341];
            int n66 = oOOO00OOO0[346];
            string5 = q0oOOoOo0O00O = (String)O00O0oO0O0[((n65 << oOOO00OOO0[342] | n65 >>> oOOO00OOO0[343]) + oOOO00OOO0[344]) * oOOO00OOO0[345]] + (String)O00O0oO0O0[(n66 << oOOO00OOO0[347] | n66 >>> oOOO00OOO0[348]) * oOOO00OOO0[349] * oOOO00OOO0[350]];
        }
        int n67 = oOOO00OOO0[351];
        this.lZ = new BooleanValue(string5, (Module)this, (Boolean)(((n67 << oOOO00OOO0[352] | n67 >>> oOOO00OOO0[353]) ^ oOOO00OOO0[354] ^ oOOO00OOO0[355]) != 0), this::gd);
        String string6 = O0OoOO0OOOOO;
        if (string6 == null) {
            int n68 = oOOO00OOO0[360] * oOOO00OOO0[361] ^ oOOO00OOO0[362] ^ oOOO00OOO0[363];
            string6 = O0OoOO0OOOOO = (String)O00O0oO0O0[-((oOOO00OOO0[356] * oOOO00OOO0[357] ^ oOOO00OOO0[358]) * oOOO00OOO0[359])] + (String)O00O0oO0O0[n68 << oOOO00OOO0[364] | n68 >>> oOOO00OOO0[365]];
        }
        booleanValue(string6, (Module)this, (Boolean)(((oOOO00OOO0[366] - oOOO00OOO0[367]) * oOOO00OOO0[368] * oOOO00OOO0[369] ^ oOOO00OOO0[370]) != 0), this::gc);
        this.ma = booleanValue;
        this.mb = new BooleanValue((String)O00O0oO0O0[(oOOO00OOO0[371] * oOOO00OOO0[372] ^ oOOO00OOO0[373]) * oOOO00OOO0[374]], (Module)this, (Boolean)(oOOO00OOO0[375] + oOOO00OOO0[376] + oOOO00OOO0[377]), () -> {
            int n2;
            int n3 = 32248506;
            if (n3 == n3 || -1934871612 == 0) {
                // empty if block
            }
            if (((Mode)this.lV.wD()).getName().equals((String)O00O0oO0O0[(8931 - 51) * -1857283155]) || ((Mode)this.lV.wD()).getName().equals((String)O00O0oO0O0[--333 + -37])) {
                n2 = -20 - -21;
            } else {
                int n4 = 0 * -1084587701;
                n2 = n4 >>> 3 | n4 << 29;
            }
            return n2 != 0;
        });
        int n69 = oOOO00OOO0[378];
        Mode[] modeArray20 = new Mode[-(oOOO00OOO0[382] + oOOO00OOO0[383]) ^ oOOO00OOO0[384]];
        int n70 = oOOO00OOO0[385];
        int n71 = n70 << oOOO00OOO0[386] | n70 >>> oOOO00OOO0[387];
        int n72 = oOOO00OOO0[391] * oOOO00OOO0[392] * oOOO00OOO0[393];
        modeArray20[(n71 >>> KillAura.oOOO00OOO0[388] | n71 << KillAura.oOOO00OOO0[389]) - KillAura.oOOO00OOO0[390]] = new aks((String)O00O0oO0O0[-(n72 >>> oOOO00OOO0[394] | n72 << oOOO00OOO0[395])]);
        int n73 = oOOO00OOO0[396];
        Mode[] modeArray21 = new Mode[((n73 << oOOO00OOO0[397] | n73 >>> oOOO00OOO0[398]) + oOOO00OOO0[399]) * 723362913];
        modeArray21[(5768 * -750576809 + -57 ^ 0xFFFFFFFF) * 1171354717] = new aks((String)O00O0oO0O0[-19 - -71 ^ 0x2D]);
        Mode[] modeArray22 = new Mode[~((0x7C0000 << 15 | 0x7C0000 >>> 17) * 1108378657)];
        int n74 = -108 - 1 ^ 0xFFFFFF93;
        int n75 = 0x1200078 ^ 0xFFFFFF8B ^ 0xFFFFFFF3;
        int n76 = n75 >>> 11 | n75 << 21;
        modeArray22[n74 >>> 31 | n74 << 1] = new aks((String)O00O0oO0O0[n76 << 25 | n76 >>> 7]);
        int n77 = ~(--169487) * 1084587701;
        this.md = new ModeValue((String)O00O0oO0O0[(n69 >>> oOOO00OOO0[379] | n69 << oOOO00OOO0[380]) + oOOO00OOO0[381]], this).a(modeArray20).a(modeArray21).a(modeArray22).co((String)O00O0oO0O0[n77 << 29 | n77 >>> 3]);
        String string7 = ooo00oo0Ooo0;
        if (string7 == null) {
            string7 = ooo00oo0Ooo0 = (String)O00O0oO0O0[((0xFFFFD8DD ^ 0x27) + -55) * 0x75075075] + (String)O00O0oO0O0[-52 - -73 - -5];
        }
        Mode[] modeArray23 = new Mode[-(--98 + -99)];
        int n78 = (0 >>> 29 | 0 << 3) * -49;
        int n79 = (0xB88012 ^ 0x7D) - 111;
        modeArray23[(n78 >>> 3 | n78 << 29) * -115] = new aks((String)O00O0oO0O0[(n79 >>> 15 | n79 << 17) + -17]);
        Mode[] modeArray24 = new Mode[~-17 - 15];
        int n80 = -357568 * 1857283155;
        modeArray24[-46 + 45 ^ 0xFFFFFFFF] = new aks((String)O00O0oO0O0[~(~(n80 >>> 5 | n80 << 27))]);
        Mode[] modeArray25 = new Mode[~-27 - 25];
        int n81 = --3885056 * -1227133513;
        modeArray25[-((-180225 << 19 | -180225 >>> 13) + 23)] = new aks((String)O00O0oO0O0[n81 >>> 11 | n81 << 21]);
        ModeValue modeValue2 = new ModeValue(string7, this).a(modeArray23).a(modeArray24).a(modeArray25);
        int n82 = 131071 + 1;
        Mode[] modeArray26 = new Mode[n82 >>> 17 | n82 << 15];
        String string8 = o0o000o0O0o0;
        if (string8 == null) {
            int n83 = -0x70000001;
            int n84 = -(0x8FFFFFF7 ^ 0x1B);
            int n85 = n84 >>> 7 | n84 << 25;
            string8 = o0o000o0O0o0 = (String)O00O0oO0O0[~(n83 >>> 27 | n83 << 5) ^ 0x5D] + (String)O00O0oO0O0[n85 >>> 21 | n85 << 11];
        }
        modeArray26[-76 + 61 + 15] = new aks(string8);
        int n86 = -5866 - 87;
        this.me = modeValue2.a(modeArray26).co((String)O00O0oO0O0[-((n86 >>> 5 | n86 << 27) + 25)]);
        String string9 = oOo00Oo0OOo0;
        if (string9 == null) {
            string9 = oOo00Oo0OOo0 = (String)O00O0oO0O0[~(((-1348005969 << 19 | -1348005969 >>> 13) ^ 0x4F) * 51)] + (String)O00O0oO0O0[~(12596 * -128207979)];
        }
        int n87 = 0 << 23 | 0 >>> 9;
        this.mf = new BooleanValue(string9, (Module)this, (Boolean)((n87 << 9 | n87 >>> 23) != 0), () -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        });
        String string10 = oo000o00Oo00;
        if (string10 == null) {
            int n88 = ~(-82044 + 123);
            string10 = oo000o00Oo00 = (String)O00O0oO0O0[~(0x1E ^ 0xFFFFFFE7 ^ 0xFFFFFFEB) ^ 0xFFFFFFBD] + (String)O00O0oO0O0[n88 << 19 | n88 >>> 13];
        }
        this.mg = new NumberValue(string10, this, (Number)Double.longBitsToDouble(0xDAFAE298B0539754L ^ 0xE5337B0129CA0ECEL), (Number)Double.longBitsToDouble(0xB7B4060FC699E1E5L ^ 0x881D9F965F00787FL), (Number)1.0, (Number)Double.longBitsToDouble(0x57854E8B16E94F34L ^ 0x682CD7128F70D6AEL), () -> {
            int n2;
            block4: {
                int n3 = 2077222101;
                if (n3 != n3) {
                }
                if (!((Boolean)this.mf.wD()).booleanValue()) break block4;
                int n4 = 717423884;
                switch (n4) {
                    case 1618427877: {
                        break;
                    }
                    default: {
                        int n5 = (0xBA2E8BE2 ^ 0xFFFFFFEF ^ 0xFFFFFFA9) * 11;
                        if (!((Mode)this.me.wD()).getName().contains((String)O00O0oO0O0[n5 >>> 31 | n5 << 1])) break block4;
                    }
                }
                int n6 = (0 << 7 | 0 >>> 25) * -9;
                n2 = n6 >>> 9 | n6 << 23;
                return n2 != 0;
            }
            int n7 = 0x66666666 * -5;
            n2 = n7 >>> 1 | n7 << 31;
            return n2 != 0;
        });
        this.mh = new NumberValue((String)O00O0oO0O0[-(-(-26 + 109) + 7)], this, (Number)(8787 * -1332920885 * -2083697005), (Number)(-(-1022611261 * 63)), (Number)(-(67 + 23 ^ 0x51) ^ 0xFFFFFFF3), (Number)Double.longBitsToDouble(0x14FE92C587A5038BL ^ 0x2B470B5C1E3C9A11L));
        int n89 = -(-6291481) + -25;
        this.mi = new NumberValue((String)O00O0oO0O0[~(~(18 - -105))], this, (Number)(n89 << 11 | n89 >>> 21), (Number)(-(-1431655791 * -3 ^ 0x4D)), (Number)((0xFFFFFFF << 7 | 0xFFFFFFF >>> 25) ^ 0xFFFFFF81), (Number)Double.longBitsToDouble(0x47B9CF0C561FAF97L ^ 0x78005695CF86360DL));
        int n90 = ~(~-1947066587);
        int n91 = ~10;
        int n92 = -0 * -1875962727 * -750576809;
        int n93 = ~(-5142 - -21);
        this.mj = new akj((String)O00O0oO0O0[(n90 << 19 | n90 >>> 13) * -75], this, (Number)(~(n91 << 31 | n91 >>> 1)), (Number)(~(-1260907830 * -81) * 109 + -43), (Number)(n92 >>> 5 | n92 << 27), (Number)(n93 >>> 9 | n93 << 23), (Number)(~(69 - 71)));
        int n94 = -10745 - 51 - 21;
        int n95 = 26100736 << 29 | 26100736 >>> 3;
        this.mk = new NumberValue((String)O00O0oO0O0[(0x2A5A ^ 0x21) * -1775253149], this, (Number)((n94 << 27 | n94 >>> 5) ^ 0xFFFFFFC5), (Number)(-621 * 954437177 ^ 0xFFFFFFBB), (Number)(((n95 >>> 7 | n95 << 25) - -71) * -483939977), (Number)(~(~(--11 * -1171354717))));
        int n96 = 1094795324 - -101;
        this.ml = new BooleanValue((String)O00O0oO0O0[-(n96 >>> 5 | n96 << 27) * 51], (Module)this, (Boolean)((-1720 ^ 3) * -252645135 + 101), () -> {
            int n2;
            int n3 = 1207254235;
            if (n3 != n3) {
                throw new EnumConstantNotPresentException();
            }
            int n4 = -2115968854;
            boolean bl2 = true;
            do {
                if (!bl2 || (bl2 = false) || !true) {
                    n4 = 188604836;
                }
                switch (n4) {
                    case 188604836: {
                        n2 = (-29 - -29) * -99;
                        return n2 != 0;
                    }
                }
            } while (!(((Number)this.mk.wD()).doubleValue() >= Double.longBitsToDouble(0x8EA57B9F377CE0F2L ^ 0xCED3FB9F377CE0F2L)));
            n2 = 425 * -252645135 + -25 + 1;
            return n2 != 0;
        });
        int n97 = -880 - 17;
        int n98 = n97 << 27 | n97 >>> 5;
        int n99 = 0xFFFFFFEF ^ 0xFFFFFFC7;
        this.mm = new akj((String)O00O0oO0O0[(1227133432 - -55) * -7], this, (Number)(-136 + 89 - -57), (Number)(-(n98 >>> 1 | n98 << 31)), (Number)(~654471206 * 105), (Number)(n99 >>> 1 | n99 << 31), (Number)(~(-4389 * -1059797125 ^ 0xFFFFFFC7)));
        this.mn = new BooleanValue((String)O00O0oO0O0[~(-875 * 15 + 59) * 128207979], (Module)this, (Boolean)((-1 >>> 19 | -1 << 13) + 1));
        this.mo = new NumberValue((String)O00O0oO0O0[-((-2011564384 * -1090785345 ^ 0x59) * -79)], this, (Number)(-(121 - 125)), (Number)(~(-1536731419 << 1 | -1536731419 >>> 31) * 109 ^ 0x25), (Number)(-(-10)), (Number)((8 << 1 | 8 >>> 31) + -15), () -> {
            int n2;
            int n3 = -1059229275;
            if (n3 != n3) {
                n3 = 576375840;
            }
            int n4 = (Boolean)this.mn.wD() == false ? -2125245558 : -1187370555;
            switch (n4) {
                case -1187370555: {
                    int n5 = 67 - 67;
                    n2 = n5 << 21 | n5 >>> 11;
                    return n2 != 0;
                }
            }
            n2 = (40960 >>> 9 | 40960 << 23) + -79;
            return n2 != 0;
        });
        String string11 = o0000000O000;
        if (string11 == null) {
            int n100 = 1313275904 * -1762037865 * 941362695;
            string11 = o0000000O000 = (String)O00O0oO0O0[-(1246365636 * -43) * 69] + (String)O00O0oO0O0[n100 >>> 13 | n100 << 19];
        }
        this.mp = new BooleanValue(string11, (Module)this, (Boolean)(-171 + 67 + 105));
        String string12 = oO000O00OO00;
        if (string12 == null) {
            int n101 = -732849127 * -41;
            string12 = oO000O00OO00 = (String)O00O0oO0O0[~(n101 >>> 17 | n101 << 15)] + (String)O00O0oO0O0[-(0 - 33)];
        }
        this.mq = new BooleanValue(string12, (Module)this, (Boolean)(((0xFFFFDC92 ^ 0x3B) * -724452315 ^ 0x6D) != 0), this::fW);
        String string13 = ooO00oO0OoO0;
        if (string13 == null) {
            int n102 = --141033472;
            string13 = ooO00oO0OoO0 = (String)O00O0oO0O0[~(~((0xB4 ^ 0x3B) - -89))] + (String)O00O0oO0O0[n102 << 13 | n102 >>> 19];
        }
        this.mr = new BooleanValue(string13, (Module)this, (Boolean)(~(~88 + 87) != 0));
        String string14 = o0O000O0O0O0;
        if (string14 == null) {
            string14 = o0O000O0O0O0 = (String)O00O0oO0O0[(0xFFFFFF24 ^ 0xFFFFFFB9) + -73] + (String)O00O0oO0O0[-(-1227133522 * 35) - -45 ^ 0x7F];
        }
        this.ms = new ako(string14, this);
        String string15 = oOO00OO0OOO0;
        if (string15 == null) {
            int n103 = -(-1207959258 * -438261969);
            string15 = oOO00OO0OOO0 = (String)O00O0oO0O0[(0xFFFFA54A ^ 0x11) * 0x27027027] + (String)O00O0oO0O0[(n103 << 5 | n103 >>> 27) - -73];
        }
        this.mt = new BooleanValue(string15, (Module)this, (Boolean)(~0x23723722 * 65 - 29), () -> {
            boolean bl2;
            int n2 = -1438076521;
            if (n2 != n2) {
                n2 = 50;
            }
            int n3 = -1068663053;
            switch (n3) {
                case 393232972: {
                    break;
                }
                default: {
                    if (this.ms.wD() != cb.gG) break;
                    bl2 = ~(-1238188770 * -111);
                    return bl2;
                }
            }
            bl2 = (19968 >>> 9 | 19968 << 23) + 19 ^ 0xFFFFFFDD ^ 0xFFFFFFE7;
            return bl2;
        });
        this.mu = new BooleanValue((String)O00O0oO0O0[(797004136 + 105) * 97], (Module)this, (Boolean)((-92 - 17 + 109) * 75));
        String string16 = oooO0ooOOooO;
        if (string16 == null) {
            string16 = oooO0ooOOooO = (String)O00O0oO0O0[(0xFFFFFEE1 ^ 0xFFFFFFB1) + 75 - 65 ^ 0x53] + (String)O00O0oO0O0[~(0x155 ^ 0xFFFFFFEF) - 113];
        }
        int n104 = -101 - -101;
        this.mv = new BooleanValue(string16, (Module)this, (Boolean)(-(n104 >>> 21 | n104 << 11)));
        String string17 = o0oO00oOO0oO;
        if (string17 == null) {
            int n105 = -(-0x8B8000);
            string17 = o0oO00oOO0oO = (String)O00O0oO0O0[n105 >>> 15 | n105 << 17] + (String)O00O0oO0O0[(-1530872880 * 0x5050505 + 125) * -101];
        }
        int n106 = 0 * -103;
        this.mw = new BooleanValue(string17, (Module)this, (Boolean)((n106 << 29 | n106 >>> 3) != 0));
        String string18 = oOoO0OoOOOoO;
        if (string18 == null) {
            string18 = oOoO0OoOOOoO = (String)O00O0oO0O0[(-(-780899362 * -723362913) + 41) * 11] + (String)O00O0oO0O0[~-156 + 27];
        }
        this.mx = new BooleanValue(string18, (Module)this, (Boolean)(~(-55 * 1483715975) != 0));
        this.my = 6499 * -1594008481 - -67;
        this.mz = (-154 - -47 + 107) * -1594008481;
        int n107 = -1 >>> 23 | -1 << 9;
        int n108 = n107 << 23 | n107 >>> 9;
        this.mA = n108 >>> 17 | n108 << 15;
        this.mC = (-12582913 << 15 | -12582913 >>> 17) - -97;
        this.mE = "";
        this.mF = ~104 * -654471207;
        int n109 = -723362913 * -95;
        this.mH = n109 >>> 7 | n109 << 25;
        int n110 = -630417896 - -55;
        Mode[] modeArray27 = new Mode[(n110 >>> 15 | n110 << 17) * 109 * 2083697005];
        int n111 = -(-43521 >>> 9 | -43521 << 23);
        modeArray27[(0xAB ^ 0xFFFFFFFF) + 107 ^ 0xFFFFFFBF] = new aks((String)O00O0oO0O0[(n111 << 31 | n111 >>> 1) - 15]);
        Mode[] modeArray28 = new Mode[~-34 + 31 + -63];
        modeArray28[(-212993 >>> 11 | -212993 << 21) ^ 0xFFFFFF97] = new aks((String)O00O0oO0O0[(--96 ^ 0xFFFFFFFD ^ 0xFFFFFF89) - -79]);
        Mode[] modeArray29 = new Mode[~(-54) * -1944890851];
        int n112 = 0x230000 << 17 | 0x230000 >>> 15;
        modeArray29[-70 ^ 0xFFFFFFFF ^ 0x45] = new aks((String)O00O0oO0O0[n112 >>> 1 | n112 << 31]);
        this.mL = new ModeValue((String)O00O0oO0O0[(706062420 << 19 | 706062420 >>> 13) * 73], this).a(modeArray27).a(modeArray28).a(modeArray29).co((String)O00O0oO0O0[~(~82)]);
        String string19 = oo0O0o0OOo0O;
        if (string19 == null) {
            int n113 = (1620160 >>> 9 | 1620160 << 23) * 266059921;
            string19 = oo0O0o0OOo0O = (String)O00O0oO0O0[(0x13B ^ 0x27) + -89 + -45] + (String)O00O0oO0O0[n113 >>> 29 | n113 << 3];
        }
        this.mM = new BooleanValue(string19, (Module)this, (Boolean)((0x88 ^ 0xFFFFFFC5) + 89 - -91), () -> {
            int n2;
            int n3 = 597660982;
            if (n3 == n3 || -2103353339 == 0) {
                // empty if block
            }
            int n4 = 2045221130 * 1631000239 * -1030792151 * -105;
            if (!((Mode)this.mL.wD()).getName().equals((String)O00O0oO0O0[n4 >>> 1 | n4 << 31])) {
                int n5 = 0x1E000000 >>> 3 | 0x1E000000 << 29;
                n2 = (n5 << 13 | n5 >>> 19) - 119;
            } else {
                int n6 = 0 * 0x75075075;
                n2 = (n6 << 13 | n6 >>> 19) * 109;
            }
            return n2 != 0;
        });
        Mode[] modeArray30 = new Mode[-(-(~-2))];
        modeArray30[-(330382101 * 39 ^ 0x33)] = new aks((String)O00O0oO0O0[~-21604 * -1205604855 - 119]);
        int n114 = -38272934 - 91;
        Mode[] modeArray31 = new Mode[(n114 >>> 19 | n114 << 13) ^ 0xFFFFFFB7];
        int n115 = (355076972 * 799063683 ^ 0x6B) - 47;
        modeArray31[0xFFFFFFA0 ^ 0x5F ^ 0xFFFFFFFF] = new aks((String)O00O0oO0O0[n115 << 15 | n115 >>> 17]);
        this.mN = new ModeValue((String)O00O0oO0O0[~(-(287 - 97 + -127))], (Module)this, () -> {
            boolean bl2;
            int n2 = -1356151499;
            if (n2 != n2) {
                int cfr_ignored_1 = 0x2D & 1;
            }
            int n3 = 2138529680;
            block5: while (true) {
                int n4 = 0;
                block6: do {
                    switch (n4 == 0 ? n3 : n4) {
                        default: {
                            int n4 = -395740 + -37;
                            n4 = (n4 << 27 | n4 >>> 5) ^ 0xFFFFFFAF;
                            n4 = -578711546;
                            if (((Mode)this.mL.wD()).getName().equals((String)O00O0oO0O0[n6 << 21 | n6 >>> 11])) continue block6;
                            n3 = 1595044715;
                            continue block5;
                        }
                        case 1595044715: {
                            bl2 = ~(~(-95 * 723362913));
                            return bl2;
                        }
                        case -578711546: {
                            n3 = -1634206965;
                            continue block5;
                        }
                        case -1634206965: 
                    }
                    break block5;
                } while (true);
                break;
            }
            bl2 = ~(8 + -9);
            return bl2;
        }).a(modeArray30).a(modeArray31).co((String)O00O0oO0O0[((~-220254718 ^ 0x4D) - -87) * -39]);
        int n116 = 0 * 1944890851;
        this.mO = new BooleanValue((String)O00O0oO0O0[-(-(3442 + -41)) * 678152731], (Module)this, (Boolean)((n116 >>> 13 | n116 << 19) != 0));
        this.mP = new BooleanValue((String)O00O0oO0O0[~12 * -9], (Module)this, (Boolean)(~(-2774 * -941362695 * 678152731) != 0), () -> {
            int n2;
            int n3 = 2513309;
            if (n3 != n3) {
                throw null;
            }
            int n4 = -2062494521;
            block3: while (true) {
                switch (n4) {
                    default: {
                        if (((Boolean)this.mO.wD()).booleanValue()) {
                            n2 = (3200 << 25 | 3200 >>> 7) + -25;
                            return n2 != 0;
                        }
                        n4 = 458617005;
                        continue block3;
                    }
                    case 458617005: 
                }
                break;
            }
            n2 = -(-(-79 << 31 | -79 >>> 1)) ^ 0xFFFFFFD9;
            return n2 != 0;
        });
        int n117 = -(1018691584 * 79) * 61;
        int n118 = -67 - -67;
        int n119 = n118 << 11 | n118 >>> 21;
        this.mQ = new BooleanValue((String)O00O0oO0O0[n117 << 13 | n117 >>> 19], (Module)this, (Boolean)((n119 << 19 | n119 >>> 13) != 0), () -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        });
        int n120 = -(0x22C85911 ^ 0xFFFFFFE5) * 23;
        this.mS = new BooleanValue((String)O00O0oO0O0[n120 << 3 | n120 >>> 29], (Module)this, (Boolean)((-71303169 << 11 | -71303169 >>> 21) - -35));
        Mode[] modeArray32 = new Mode[108 - 31 + 9 - 85];
        modeArray32[8 ^ 0xFFFFFFC7 ^ 0xFFFFFFCF] = new aks((String)O00O0oO0O0[~(-105 + -53 + 101)]);
        Mode[] modeArray33 = new Mode[(0xFFFFFFF7 ^ 5) + 15];
        int n121 = 0 >>> 27 | 0 << 5;
        modeArray33[n121 >>> 25 | n121 << 7] = new aks((String)O00O0oO0O0[486222710 * -53 + 51]);
        Mode[] modeArray34 = new Mode[(83398482 << 23 | 83398482 >>> 9) * -103 + 83 - -63];
        int n122 = --82944;
        modeArray34[(0xFFFFFF8E ^ 0xFFFFFFFF ^ 0xFFFFFFFF ^ 0xFFFFFFAD) + -35] = new aks((String)O00O0oO0O0[(n122 << 23 | n122 >>> 9) + 73 + -125]);
        ModeValue modeValue3 = new ModeValue((String)O00O0oO0O0[(-386198279 + 73) * 115 * -91], (Module)this, () -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }).a(modeArray32).a(modeArray33).a(modeArray34);
        Mode[] modeArray35 = new Mode[(~16781369 ^ 0xFFFFFFC7) * 117 * -35];
        int n123 = 0 * 27;
        int n124 = -(n123 << 29 | n123 >>> 3) * -127;
        String string20 = o00O000OO00O;
        if (string20 == null) {
            string20 = o00O000OO00O = (String)O00O0oO0O0[(--1651910546 + 93) * -1875962727 * -13] + (String)O00O0oO0O0[-((~2129735888 ^ 0x77) * -121)];
        }
        modeArray35[n124] = new aks(string20);
        Mode[] modeArray36 = new Mode[~((2102419265 << 9 | 2102419265 >>> 23) * 43)];
        int n125 = -855 * -1205604855 + 15;
        int n126 = 471 - -51;
        modeArray36[n125 << 23 | n125 >>> 9] = new aks((String)O00O0oO0O0[n126 << 31 | n126 >>> 1]);
        Mode[] modeArray37 = new Mode[~(~(--1))];
        int n127 = (-11777 >>> 7 | -11777 << 25) ^ 0xFFFFFFA3;
        modeArray37[n127 << 11 | n127 >>> 21] = new aks((String)O00O0oO0O0[(0x18000000 >>> 21 | 0x18000000 << 11) - -27]);
        this.mT = modeValue3.a(modeArray35).a(modeArray36).a(modeArray37).co((String)O00O0oO0O0[-(-(-1541783133 * -39))]);
        String string21 = oO0O0O0OOO0O;
        if (string21 == null) {
            int n128 = 461373818 * -1227133513 ^ 0xFFFFFFC9;
            string21 = oO0O0O0OOO0O = (String)O00O0oO0O0[-(n128 >>> 21 | n128 << 11)] + (String)O00O0oO0O0[-59 + 107 - 7];
        }
        int n129 = --294912;
        this.mU = new NumberValue(string21, this, (Number)(~(~(n129 << 17 | n129 >>> 15))), (Number)(~(-21 + 19)), (Number)((219136 << 21 | 219136 >>> 11) - 3 + 9 + -93), (Number)Double.longBitsToDouble(0x773BBFA6A8F23FECL ^ 0x4882263F316BA676L), () -> {
            int n2;
            int n3 = -399979846;
            if (n3 != n3) {
                OOOO0ooooO = n3 = 1459822848;
            }
            int n4 = --1044243422 * -91;
            if (((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[(n4 >>> 29 | n4 << 3) ^ 0x75])) {
                n2 = -(-31 - -31);
                return n2 != 0;
            }
            int n5 = 20 - 125;
            n2 = (n5 >>> 3 | n5 << 29) - -15;
            return n2 != 0;
        });
        this.mV = new NumberValue((String)O00O0oO0O0[-(0xBC ^ 0x6F ^ 0xFFFFFFED) + -39], this, (Number)((0x151 ^ 7) * -1205604855), (Number)(--72 + -107 ^ 0xFFFFFFDD), (Number)(9991 * 1594008481 - 93), (Number)Double.longBitsToDouble(0xA53D527FF91BBA5FL ^ 0x9A84CBE6608223C5L), () -> {
            int n2;
            int n3 = -377764524;
            if (n3 != n3) {
            }
            if (!((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[((-780289 >>> 11 | -780289 << 21) ^ 0xFFFFFF85) - 41])) {
                n2 = (0x28 ^ 0x15) * -1056139499;
                return n2 != 0;
            }
            int n4 = -(21 + -21);
            n2 = n4 << 9 | n4 >>> 23;
            return n2 != 0;
        });
        String string22 = ooOO0oOOOoOO;
        if (string22 == null) {
            int n130 = -249431182 << 9 | -249431182 >>> 23;
            string22 = ooOO0oOOOoOO = (String)O00O0oO0O0[((n130 >>> 5 | n130 << 27) ^ 0xFFFFFFAF) * 113] + (String)O00O0oO0O0[(0xFFFFFF09 ^ 0xFFFFFFFD) + 23];
        }
        int n131 = 1125081472 * 0x41041041;
        int n132 = (n131 >>> 7 | n131 << 25) - -125;
        int n133 = -1490945 >>> 19 | -1490945 << 13;
        this.mW = new NumberValue(string22, this, (Number)(n132 >>> 15 | n132 << 17), (Number)(-(43008 >>> 9 | 43008 << 23) ^ 0xFFFFFFAD), (Number)(~(-3266 * -483939977)), (Number)((n133 >>> 27 | n133 << 5) ^ 0xFFFFFFA5), () -> {
            int n2;
            int n3 = -1625330528;
            if (n3 != n3) {
                int cfr_ignored_0 = 0x1A & 1;
            }
            int n4 = -16102000 * -652835029;
            int n5 = (n4 << 15 | n4 >>> 17) * 0x55555555;
            if (((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[n5 >>> 17 | n5 << 15])) {
                n2 = -(-1916929 << 23 | -1916929 >>> 9) * 1926714301 - -35;
                return n2 != 0;
            }
            block3: while (true) {
                int n6 = 1805854685;
                switch (n6) {
                    default: {
                        continue block3;
                    }
                    case 1805854685: 
                }
                break;
            }
            int n7 = (-981727233 >>> 11 | -981727233 << 21) * 0x75075075;
            n2 = (n7 << 25 | n7 >>> 7) * -1926714301;
            return n2 != 0;
        });
        String string23 = o0OO00OOO0OO;
        if (string23 == null) {
            string23 = o0OO00OOO0OO = (String)O00O0oO0O0[(140264 + 13) * 373475417 * -678152731] + (String)O00O0oO0O0[2329497 * 1926714301 * 349184333];
        }
        this.mX = new NumberValue(string23, this, (Number)(~-15 + 1), (Number)(~(~-1276882169) * 37), (Number)((-301989883 >>> 25 | -301989883 << 7) * -373475417 - -27), (Number)Double.longBitsToDouble(0x371D77E5D5874C10L ^ 0x8FD77E5D5874C10L), () -> {
            int n2;
            block4: {
                int n3 = -670743448;
                if (n3 != n3) {
                    OOOO0ooooO = n3 = 189872255;
                }
                int n4 = 1310439478;
                switch (n4) {
                    case -573218833: {
                        break;
                    }
                    default: {
                        if (!((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[~(~(0xFFFFDD1B ^ 0x6F) * 1857283155)])) break block4;
                    }
                }
                n2 = -((0xFFFFFFA9 ^ 0xFFFFFFCD) + -33 + -67);
                return n2 != 0;
            }
            n2 = -(~438261968 * 49);
            return n2 != 0;
        });
        String string24 = oOOO0OOOOOOO;
        if (string24 == null) {
            int n134 = (1476403330 >>> 27 | 1476403330 << 5) + -75;
            int n135 = n134 >>> 1 | n134 << 31;
            string24 = oOOO0OOOOOOO = (String)O00O0oO0O0[n135 << 21 | n135 >>> 11] + (String)O00O0oO0O0[~(-214)];
        }
        int n136 = 1540096 >>> 3 | 1540096 << 29;
        int n137 = n136 << 25 | n136 >>> 7;
        int n138 = --11392;
        int n139 = (-291444220 << 3 | -291444220 >>> 29) * 105;
        this.mY = new NumberValue(string24, this, (Number)((n137 << 29 | n137 >>> 3) - 111), (Number)((n138 >>> 7 | n138 << 25) - 89), (Number)((352129 * -1857283155 + -17) * -723362913), (Number)(~(n139 >>> 13 | n139 << 19)), () -> {
            boolean bl2;
            int n2 = -849781321;
            if (n2 != n2) {
                int cfr_ignored_0 = 0 & 1;
            }
            if (((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[-(-56925 * 1483715975 * 0x11111111) ^ 0xFFFFFFAF])) {
                int n3 = 0 << 15 | 0 >>> 17;
                bl2 = n3 >>> 5 | n3 << 27;
                return bl2;
            }
            int n4 = ~-134217731 - -93 - 95;
            bl2 = n4 >>> 27 | n4 << 5;
            return bl2;
        });
        String string25 = oooo00ooo0;
        if (string25 == null) {
            string25 = oooo00ooo0 = (String)O00O0oO0O0[(~(~1310329075) ^ 0xFFFFFFBD) * -59] + (String)O00O0oO0O0[(-545 << 29 | -545 >>> 3) ^ 0xFFFFFFB9];
        }
        this.mZ = new NumberValue(string25, this, (Number)0.0, (Number)0.0, (Number)Double.longBitsToDouble(0xCC5183538DB46793L ^ 0xF3B2B060BE8754A0L), (Number)Double.longBitsToDouble(0x50A92DD4096198EAL ^ 0x6F2D57354ECF8C91L), () -> {
            int n2;
            int n3 = -752318557;
            if (n3 != n3) {
            }
            int n4 = !((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[(-1855425915 + 43) * -125]) ? -836193652 : 1177136455;
            switch (n4) {
                case 1177136455: {
                    int n5 = (3440640 >>> 15 | 3440640 << 17) - 105;
                    n2 = n5 << 7 | n5 >>> 25;
                    return n2 != 0;
                }
                default: {
                    break;
                }
                case -1751351936: 
            }
            n2 = ((153391687 << 3 | 153391687 >>> 29) - -17) * -7;
            return n2 != 0;
        });
        String string26 = Oooo0o0oo0;
        if (string26 == null) {
            string26 = Oooo0o0oo0 = (String)O00O0oO0O0[-(-(-189 * -1749801491))] + (String)O00O0oO0O0[~(-2195457 >>> 15 | -2195457 << 17)];
        }
        int n140 = (-9441 << 23 | -9441 >>> 9) ^ 0xFFFFFFED;
        this.na = new NumberValue(string26, this, (Number)((n140 << 7 | n140 >>> 25) + -39), (Number)(-((176 - 85 ^ 0xFFFFFFD9) * -1090785345)), (Number)(-(~(-1178265364 * 113))), (Number)Double.longBitsToDouble(0x98200BCE99C43AFEL ^ 0xA7C00BCE99C43AFEL), () -> {
            int n2;
            int n3 = -863057825;
            if (n3 != n3) {
            }
            if (!((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[(0xF9A723B8 ^ 0x41) * 121 - -57])) {
                n2 = (-71 - 51 ^ 0xFFFFFFE1) * -750576809;
            } else {
                int n4 = -13236 + -77;
                n2 = (n4 << 25 | n4 >>> 7) - -105;
            }
            return n2 != 0;
        });
        String string27 = q00oo0O0oo0;
        if (string27 == null) {
            int n141 = 1758 - 79 + 57;
            int n142 = (1643936 >>> 5 | 1643936 << 27) - -83;
            int n143 = n142 >>> 29 | n142 << 3;
            string27 = q00oo0O0oo0 = (String)O00O0oO0O0[n141 << 29 | n141 >>> 3] + (String)O00O0oO0O0[n143 >>> 11 | n143 << 21];
        }
        this.nb = new NumberValue(string27, this, (Number)0.0, (Number)(0xFFFFFF96 ^ 0x2D ^ 0xFFFFFFBB), (Number)Double.longBitsToDouble(0x131C3A7465EC8EEBL ^ 0x2CFF094756DFBDD8L), (Number)Double.longBitsToDouble(0x45C7300AFE45F14CL ^ 0x7A434AEBB9EBE537L), () -> {
            int n2;
            int n3 = -1486247076;
            if (n3 != n3) {
            }
            int n4 = 206720 * 678152731;
            if (!((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[n4 >>> 5 | n4 << 27])) {
                n2 = (50688 >>> 9 | 50688 << 23) - 123 - -25;
                return n2 != 0;
            }
            block3: while (true) {
                int n5 = -984190462;
                switch (n5) {
                    default: {
                        continue block3;
                    }
                    case -984190462: 
                }
                break;
            }
            int n6 = ((-145 << 29 | -145 >>> 3) ^ 0xFFFFFFED) * -349184333;
            n2 = n6 << 11 | n6 >>> 21;
            return n2 != 0;
        });
        String string28 = oOoo00Ooo0;
        if (string28 == null) {
            int n144 = 19333230 - 107 + -3;
            int n145 = n144 << 25 | n144 >>> 7;
            string28 = oOoo00Ooo0 = (String)O00O0oO0O0[n145 << 23 | n145 >>> 9] + (String)O00O0oO0O0[(21834 - 9) * 1594008481];
        }
        int n146 = ~0x7FFFFFFD;
        int n147 = n146 >>> 17 | n146 << 15;
        int n148 = ~-58720257;
        this.nc = new NumberValue(string28, this, (Number)(n147 >>> 11 | n147 << 21), (Number)(-(~-84 - 123)), (Number)((n148 >>> 23 | n148 << 9) + 93), (Number)((124492518 << 21 | 124492518 >>> 11) * -69), () -> {
            boolean bl2;
            int n2 = -188555945;
            if (n2 != n2) {
                n2 = 77;
            }
            if (!((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[(0x6400000 << 11 | 0x6400000 >>> 21) ^ 0x25])) {
                int n3 = ~((262720 >>> 3 | 262720 << 29) ^ 0xFFFFFFB7);
                bl2 = n3 << 17 | n3 >>> 15;
                return bl2;
            }
            int n5 = 0 * -89;
            n5 = n5 >>> 27 | n5 << 5;
            bl2 = n5 >>> 27 | n5 << 5;
            return bl2;
        });
        String string29 = OOoo0oo0o0;
        if (string29 == null) {
            int n149 = ~-1113;
            int n150 = n149 >>> 29 | n149 << 3;
            int n151 = 1476395132 + -119;
            string29 = OOoo0oo0o0 = (String)O00O0oO0O0[n150 << 27 | n150 >>> 5] + (String)O00O0oO0O0[(n151 >>> 27 | n151 << 5) * -678152731 ^ 0xFFFFFFD5];
        }
        int n152 = 60 + -61;
        this.nd = new NumberValue(string29, this, (Number)(~(n152 >>> 23 | n152 << 9)), (Number)0.0, (Number)Double.longBitsToDouble(0x8FE34E1F92251D41L ^ 0xCFC34E1F92251D41L), (Number)Double.longBitsToDouble(0xB176BDA194C1EF30L ^ 0x8ECF24380D5876AAL), () -> {
            int n2;
            int n3 = -1458166121;
            if (n3 != n3) {
                n3 = 51;
            }
            int n4 = 29 << 25 | 29 >>> 7;
            if (((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[n4 >>> 25 | n4 << 7])) {
                int n5 = -1000991036;
                block4: while (true) {
                    switch (n5) {
                        case -1000991036: {
                            n5 = -498665223;
                            continue block4;
                        }
                        case -498665223: {
                            int n6 = 1840700271 * 63 ^ 0x51;
                            n2 = n6 << 23 | n6 >>> 9;
                            return n2 != 0;
                        }
                    }
                    break;
                }
            }
            int n7 = -2013265922 * 1;
            n2 = (n7 >>> 27 | n7 << 5) - -49;
            return n2 != 0;
        });
        String string30 = q0o0o0Oo0o0;
        if (string30 == null) {
            int n153 = -1073742172 + 33;
            int n154 = (n153 >>> 29 | n153 << 3) ^ 0xFFFFFF8D;
            string30 = q0o0o0Oo0o0 = (String)O00O0oO0O0[n154 << 29 | n154 >>> 3] + (String)O00O0oO0O0[-1018394308 * -97];
        }
        this.ne = new NumberValue(string30, this, (Number)1.0, (Number)(0 >>> 7 | 0 << 25), (Number)Double.longBitsToDouble(0x7558C3398F583284L ^ 0x3554C3398F583284L), (Number)Double.longBitsToDouble(0x75132D4D28886DE7L ^ 0x4ABAB4D4B111F47DL), () -> {
            boolean bl2;
            int n2 = -1166896423;
            if (n2 != n2) {
                throw new NegativeArraySizeException();
            }
            if (!((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[(0x7F ^ 0xFFFFFF8F) - -87])) {
                int n3 = 2144619776;
                bl2 = (857759273 << 7 | 857759273 >>> 25) * -87;
            } else {
                int n3 = 0 << 15 | 0 >>> 17;
                bl2 = (n3 << 27 | n3 >>> 5) * 1030792151;
            }
            return bl2;
        });
        String string31 = o00o0000o0;
        if (string31 == null) {
            string31 = o00o0000o0 = (String)O00O0oO0O0[-(~(~(-25217 >>> 7 | -25217 << 25)))] + (String)O00O0oO0O0[-(-318767105 >>> 21 | -318767105 << 11)];
        }
        this.nf = new NumberValue(string31, this, (Number)1.0, (Number)Double.longBitsToDouble(0xF6392FDAF4DC9092L ^ 0xC9E92FDAF4DC9092L), (Number)Double.longBitsToDouble(0x592D8382D5EC79EEL ^ 0x193F8382D5EC79EEL), (Number)Double.longBitsToDouble(0x9EB57A7918A49DL ^ 0x3F372CE3E0813D07L), () -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        });
        this.ng = new NumberValue((String)O00O0oO0O0[-28248 * 1926714301], this, (Number)0.0, (Number)0.0, (Number)Double.longBitsToDouble(0x3A92D944541B9145L ^ 0x574BF22327DF723L), (Number)Double.longBitsToDouble(0xF17DA50F98999A2FL ^ 0xCEF9DFEEDF378E54L), () -> {
            int n2;
            block4: {
                int n3 = -2082041975;
                if (n3 != n3) {
                    n3 = 50;
                }
                int n4 = -1136887346;
                switch (n4) {
                    case -1846943175: {
                        break;
                    }
                    default: {
                        if (!((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[-18204 * 619094385])) break block4;
                    }
                }
                n2 = (35 - 35) * -266059921;
                return n2 != 0;
            }
            n2 = ~(-543041842 * -87);
            return n2 != 0;
        });
        String string32 = O00o0oO0o0;
        if (string32 == null) {
            int n155 = -1375731712 * -111 * 1022611261 * -1090785345;
            string32 = O00o0oO0o0 = (String)O00O0oO0O0[n155 << 7 | n155 >>> 25] + (String)O00O0oO0O0[~(~1227133539 * 7 - -45)];
        }
        this.nh = new NumberValue(string32, this, (Number)(~(145489365 * 109 * 13)), (Number)(-(-97 - -97) * -119), (Number)(~(-1847297538 * 750576809) * 93 - 101), (Number)((-6 + -91) * -1594008481), () -> {
            boolean bl2;
            int n2 = 2092538121;
            if (n2 != n2) {
                OOOO0ooooO = n2 = -612641405;
            }
            int n4 = 0x9C75 ^ 0x75;
            n4 = (n4 << 15 | n4 >>> 17) * -1631000239;
            int n5 = !((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[n4 << 7 | n4 >>> 25]) ? -857250085 : -575354825;
            switch (n5) {
                default: {
                    int n6 = 279412715 * 1022611261;
                    bl2 = (n6 << 17 | n6 >>> 15) * -1084587701 + 123;
                    return bl2;
                }
                case -575354825: 
            }
            int n7 = 0 >>> 7 | 0 << 25;
            bl2 = n7 >>> 25 | n7 << 7;
            return bl2;
        });
        String string33 = q0O0o0OO0o0;
        if (string33 == null) {
            int n156 = ~-9909761 * 1631000239;
            string33 = q0O0o0OO0o0 = (String)O00O0oO0O0[n156 >>> 9 | n156 << 23] + (String)O00O0oO0O0[-(-38)];
        }
        this.ni = new NumberValue(string33, this, (Number)1.0, (Number)0.0, (Number)Double.longBitsToDouble(0xFC230E1C71319E97L ^ 0xBC370E1C71319E97L), (Number)Double.longBitsToDouble(0x51769BA0D26710FL ^ 0x3ABEF02394BFE895L), () -> {
            int n2;
            int n3 = -243124353;
            if (n3 == n3 || 1894066338 == 0) {
                // empty if block
            }
            int n4 = 554 >>> 3 | 554 << 29;
            int n5 = n4 >>> 13 | n4 << 19;
            if (!((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[n5 << 15 | n5 >>> 17])) {
                n2 = --483939977 * -71;
            } else {
                int n6 = (20992 >>> 9 | 20992 << 23) - 41;
                n2 = n6 >>> 19 | n6 << 13;
            }
            return n2 != 0;
        });
        String string34 = ooOo00oOo0;
        if (string34 == null) {
            string34 = ooOo00oOo0 = (String)O00O0oO0O0[(~(1986668386 >>> 17 | 1986668386 << 15) ^ 0xFFFFFFCD) * -13] + (String)O00O0oO0O0[-(~(-9633 * 1205604855))];
        }
        this.nj = new NumberValue(string34, this, (Number)0.0, (Number)0.0, (Number)Double.longBitsToDouble(0xD7E02439A3CE9B2L ^ 0x32979BDA03A57028L), (Number)Double.longBitsToDouble(0x4B8BAFE6EC99CB5AL ^ 0x740FD507AB37DF21L), () -> {
            int n2;
            int n3 = 1000466044;
            if (n3 != n3) {
            }
            int n4 = !((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[~-1537146192 * 95 * 2014922929]) ? -1816544437 : 288767585;
            block4: while (true) {
                switch (n4) {
                    default: {
                        n4 = -846073124;
                        continue block4;
                    }
                    case -846073124: {
                        n2 = -36 + 37;
                        return n2 != 0;
                    }
                    case 288767585: 
                }
                break;
            }
            int n5 = ~-1;
            n2 = n5 << 7 | n5 >>> 25;
            return n2 != 0;
        });
        String string35 = OoOo0o0Oo0;
        if (string35 == null) {
            int n157 = (79616 << 21 | 79616 >>> 11) ^ 0x37;
            string35 = OoOo0o0Oo0 = (String)O00O0oO0O0[(20160 >>> 5 | 20160 << 27) * 954437177] + (String)O00O0oO0O0[n157 << 3 | n157 >>> 29];
        }
        int n158 = 0 >>> 15 | 0 << 17;
        int n159 = n158 >>> 31 | n158 << 1;
        this.nk = new NumberValue(string35, this, (Number)(-(~-1374389539 * 25) + 103), (Number)(n159 >>> 13 | n159 << 19), (Number)(7100 * 483939977 * -1), (Number)((-722920597 + -97 + 73) * 119 * -67), () -> {
            boolean bl2;
            int n2 = -1021899853;
            if (n2 != n2) {
                int cfr_ignored_0 = 18 + 85;
            }
            int n4 = ~-40;
            n4 = n4 >>> 29 | n4 << 3;
            int n5 = !((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[n4 << 29 | n4 >>> 3]) ? 731991312 : -1393045394;
            switch (n5) {
                default: {
                    bl2 = 1008383626 * -115 ^ 3;
                    return bl2;
                }
                case -1393045394: 
            }
            bl2 = -(-(-111 - -111));
            return bl2;
        });
        String string36 = q00Oo0O0Oo0;
        if (string36 == null) {
            string36 = q00Oo0O0Oo0 = (String)O00O0oO0O0[--334672773 * -77 - 101] + (String)O00O0oO0O0[(-2974721 >>> 9 | -2974721 << 23) * -991146299 * 0x55555555];
        }
        this.nl = new NumberValue(string36, this, (Number)0.0, (Number)0.0, (Number)1.0, (Number)Double.longBitsToDouble(0x43AE76097BDF78B4L ^ 0x7C2A0CE83C716CCFL), this::fy);
        String string37 = oOOo00OOo0;
        if (string37 == null) {
            int n160 = -1073612387 * -1059797125 * 1047552999;
            string37 = oOOo00OOo0 = (String)O00O0oO0O0[~(~(--239) ^ 0x51)] + (String)O00O0oO0O0[n160 >>> 29 | n160 << 3];
        }
        int n161 = ~-129;
        this.nm = new BooleanValue(string37, (Module)this, (Boolean)((n161 << 25 | n161 >>> 7) != 0), () -> {
            int n2;
            int n3 = -1322023802;
            if (n3 != n3) {
                n3 = 27;
            }
            if (!((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[(0xEC4EC494 ^ 0x71) * -39])) {
                n2 = ~107 ^ 0xFFFFFF95;
            } else {
                int n4 = ~(-1 << 17 | -1 >>> 15);
                n2 = n4 >>> 9 | n4 << 23;
            }
            return n2 != 0;
        });
        String string38 = OOOo0ooo00;
        if (string38 == null) {
            int n162 = 570425444 + -45 ^ 0x35;
            string38 = OOOo0ooo00 = (String)O00O0oO0O0[n162 >>> 25 | n162 << 7] + (String)O00O0oO0O0[(-1332924360 * 0x69069069 + -47) * -29 * 619094385];
        }
        int n163 = 991439607 * 11;
        int n164 = ~-122766 + 115;
        this.nn = new NumberValue(string38, this, (Number)(0xE80000 << 13 | 0xE80000 >>> 19), (Number)((n163 >>> 23 | n163 << 9) * 13), (Number)(n164 >>> 11 | n164 << 21), (Number)Double.longBitsToDouble(0xDF845D3FFDEB2F72L ^ 0xE0645D3FFDEB2F72L), () -> {
            int n2;
            int n3 = -86841228;
            if (n3 != n3) {
                throw null;
            }
            int n4 = !((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[21889 * -1601513229 + -79]) ? -818934553 : -1465692370;
            switch (n4) {
                default: {
                    int n5 = 70 - 79 ^ 0xFFFFFFF5;
                    n2 = n5 >>> 1 | n5 << 31;
                    return n2 != 0;
                }
                case -1465692370: 
            }
            n2 = (0x59 ^ 0x59) * -33;
            return n2 != 0;
        });
        int n165 = ~-9043969;
        this.no = new BooleanValue((String)O00O0oO0O0[n165 >>> 15 | n165 << 17], (Module)this, (Boolean)(-(--390451562) * -11 - -115), () -> {
            int n2;
            int n3 = -514146214;
            if (n3 != n3) {
                throw new NoSuchFieldException();
            }
            if (!((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[(-308 - 91 ^ 0xFFFFFFDD) + -89])) {
                int n4 = -1810721178;
                n2 = ~(1882725390 * 73);
            } else {
                n2 = (-9 - -9) * -53;
            }
            return n2 != 0;
        });
        String string39 = q0oo00Ooo00;
        if (string39 == null) {
            string39 = q0oo00Ooo00 = (String)O00O0oO0O0[~(~-926 * 1857283155 - 37)] + (String)O00O0oO0O0[~(-((-12058625 >>> 17 | -12058625 << 15) ^ 0xFFFFFF9B))];
        }
        int n166 = 0xF47 ^ 0x47;
        this.np = new NumberValue(string39, this, (Number)(-1939662879 * -31 * 1332920885 - 65), (Number)(n166 >>> 7 | n166 << 25), (Number)(423 - -3 - 81 - -105), (Number)(~((-217 >>> 1 | -217 << 31) + 103)), () -> {
            block0: {
                int n2 = 868126642;
                if (n2 == n2) break block0;
                n2 = -1670465948;
            }
            return (!((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[-(7740 * 0x5B05B05B)]) ? (0x2E ^ 0xFFFFFFF9) * 1047552999 : -1575 * 0x75075075 ^ 0xFFFFFFC5 ^ 0xFFFFFFCD ^ 0x25) != 0;
        });
        String string40 = o0o0000o00;
        if (string40 == null) {
            string40 = o0o0000o00 = (String)O00O0oO0O0[~(-1610612767 >>> 29 | -1610612767 << 3)] + (String)O00O0oO0O0[218 - -47 ^ 0x49];
        }
        int n167 = 0x8000000 * -1963413621;
        int n168 = ~-536870929;
        int n169 = 32791 - 23;
        this.nq = new NumberValue(string40, this, (Number)(n167 << 7 | n167 >>> 25), (Number)((62 - 59) * -21 + 63), (Number)((n168 >>> 29 | n168 << 3) - -91), (Number)(n169 >>> 15 | n169 << 17), this::ft);
        String string41 = O0o00oOo00;
        if (string41 == null) {
            int n170 = (0x5A4BFFDF ^ 0xFFFFFFDF) * 2083697005;
            string41 = O0o00oOo00 = (String)O00O0oO0O0[n170 << 15 | n170 >>> 17] + (String)O00O0oO0O0[((702336 << 25 | 702336 >>> 7) ^ 0x69) * -1762037865];
        }
        int n171 = 0xD ^ 0xD;
        int n172 = n171 << 23 | n171 >>> 9;
        int n173 = 4646521 * -1455319497;
        int n174 = (7996672 << 15 | 7996672 >>> 17) ^ 0x3D;
        this.nr = new NumberValue(string41, this, (Number)(~-11 ^ 0x55), (Number)((n172 >>> 17 | n172 << 15) * 21), (Number)(~(n173 << 25 | n173 >>> 7)), (Number)(n174 << 9 | n174 >>> 23), () -> {
            int n2;
            int n3 = -1282837926;
            if (n3 != n3) {
                int cfr_ignored_0 = 74 + 68;
            }
            if (!((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[~(-127 - 55)])) {
                int n4 = --131189 ^ 0x75;
                n2 = n4 << 15 | n4 >>> 17;
            } else {
                n2 = (148 - -11 ^ 0xFFFFFFD1) + 115 + 63;
            }
            return n2 != 0;
        });
        String string42 = q0Oo00OOo00;
        if (string42 == null) {
            int n175 = 487203985 * 93;
            int n176 = (n175 >>> 11 | n175 << 21) * 111;
            string42 = q0Oo00OOo00 = (String)O00O0oO0O0[n176 << 5 | n176 >>> 27] + (String)O00O0oO0O0[(--4372 + -95) * 1736263375 + 9];
        }
        this.ns = new NumberValue(string42, this, (Number)(~(~30)), (Number)((0x1FFFFFFF << 5 | 0x1FFFFFFF >>> 27) + 29), (Number)(((-472281544 << 15 | -472281544 >>> 17) + 27 + -67) * -45), (Number)(-(2113330896 * 75) * 83 + -47), () -> {
            int n2 = -1942068750;
            if (n2 != n2) {
                n2 = -1610856664;
            }
            int n3 = -(0x190011 - 17) * -5;
            if (((Mode)this.mT.wD()).getName().equals((String)O00O0oO0O0[n3 << 17 | n3 >>> 15])) {
                return 0 != 0;
            }
            int n4 = ~-32 * -1108378657;
            return n4 != 0;
        });
        this.nt = null;
        String string43 = oo0000o000;
        if (string43 == null) {
            int n177 = -908329015 * 1483715975;
            int n178 = n177 >>> 29 | n177 << 3;
            string43 = oo0000o000 = (String)O00O0oO0O0[~(n178 << 13 | n178 >>> 19)] + (String)O00O0oO0O0[-(-337 - -43)];
        }
        this.nu = new BooleanValue(string43, (Module)this, (Boolean)(0 * -1762037865 * 27), () -> {
            int n2;
            int n3 = 749288568;
            if (n3 != n3) {
            }
            if (!((Boolean)this.mS.wD()).booleanValue()) {
                int n4 = -244408604;
                switch (n4) {
                    default: {
                        n2 = ~(~(-(-1 << 21 | -1 >>> 11)));
                        return n2 != 0;
                    }
                    case 1595401313: 
                }
            }
            n2 = -(-(~(18 - 19)));
            return n2 != 0;
        });
        int n179 = (-164209624 >>> 15 | -164209624 << 17) * -25 * 1857283155;
        int n180 = 0x33 ^ 0x33;
        this.nv = new BooleanValue((String)O00O0oO0O0[n179 << 31 | n179 >>> 1], (Module)this, (Boolean)((n180 >>> 7 | n180 << 25) != 0), () -> {
            boolean bl2;
            int n2 = -264255922;
            if (n2 != n2) {
            }
            if (((Boolean)this.mS.wD()).booleanValue()) {
                bl2 = -(-(0 * -652835029) * -63);
                return bl2;
            }
            bl2 = ~3387 * -1059797125 ^ 0x2D;
            return bl2;
        });
        int n181 = 1348468690 - -47;
        this.nw = new BooleanValue((String)O00O0oO0O0[(~26325 ^ 0xFFFFFFED) * 724452315], (Module)this, (Boolean)(((n181 << 11 | n181 >>> 21) * -1556147571 ^ 0x27) != 0), () -> {
            int n2;
            int n3 = -1902236664;
            if (n3 != n3) {
                int cfr_ignored_0 = 0x50 & 1;
            }
            if (!((Boolean)this.mS.wD()).booleanValue()) {
                int n4 = -658725951;
                n2 = ~(--1260907830 * 109);
            } else {
                n2 = ~(118 + -99 + -41 - -21);
            }
            return n2 != 0;
        });
        String string44 = Oo000o0000;
        if (string44 == null) {
            int n182 = 1610612803 - -7 + -63;
            int n183 = -(2094400 >>> 21 | 2094400 << 11);
            int n184 = n183 << 11 | n183 >>> 21;
            string44 = Oo000o0000 = (String)O00O0oO0O0[n182 >>> 29 | n182 << 3] + (String)O00O0oO0O0[n184 << 7 | n184 >>> 25];
        }
        this.nx = new BooleanValue(string44, (Module)this, (Boolean)((-1227133514 * 35 ^ 0xFFFFFFC7) * -1857283155), () -> {
            int n2;
            int n3 = 1493666486;
            if (n3 != n3) {
                throw new IndexOutOfBoundsException();
            }
            int n4 = (Boolean)this.mS.wD() == false ? -1207885844 : -1091728114;
            switch (n4) {
                default: {
                    n2 = ~((9 ^ 0x33) * -1332920885);
                    return n2 != 0;
                }
                case -1091728114: 
            }
            n2 = ~(-1321528401 * -13 * -1332920885);
            return n2 != 0;
        });
        int n185 = -119 - -119;
        this.ny = new BooleanValue((String)O00O0oO0O0[((2012108871 << 7 | 2012108871 >>> 25) - 115) * -29], (Module)this, (Boolean)((n185 << 15 | n185 >>> 17) * -587345955 * 47));
        this.nz = new BooleanValue((String)O00O0oO0O0[677711656 * 41 * -19 * 125], (Module)this, (Boolean)(~(-2) != 0), () -> {
            int n2;
            int n3 = 1035142604;
            if (n3 != n3) {
                OOOO0ooooO = n3 = 828923806;
            }
            if (((Boolean)this.ny.wD()).booleanValue()) {
                n2 = ((0xFFFFE163 ^ 0xFFFFFF81) * 128207979 ^ 0x73) - 5;
                return n2 != 0;
            }
            int n4 = -(402653083 + 101) * 1062196213;
            n2 = n4 >>> 27 | n4 << 5;
            return n2 != 0;
        });
        this.nA = new BooleanValue((String)O00O0oO0O0[(3168 + 5) * 678152731], (Module)this, (Boolean)(-445 * 0x33333333 - 89), () -> {
            int n2;
            int n3 = -1431828885;
            if (n3 != n3) {
                OOOO0ooooO = n3 = 2120420995;
            }
            if (((Boolean)this.ny.wD()).booleanValue()) {
                n2 = (-782 * 0xF0F0F0F ^ 0x21) + -15;
                return n2 != 0;
            }
            n2 = -(~((0 >>> 11 | 0 << 21) * -799063683));
            return n2 != 0;
        });
        int n186 = -2141192192 * 1455319497;
        this.nB = new BooleanValue((String)O00O0oO0O0[n186 >>> 21 | n186 << 11], (Module)this, (Boolean)((37 + -37) * -109), () -> {
            int n2;
            int n3 = -1987915923;
            if (n3 != n3) {
            }
            if (!((Boolean)this.ny.wD()).booleanValue()) {
                n2 = -1445830520 * 101 * 1059797125 - 71;
            } else {
                int n4 = 18 + -19;
                n2 = ~(n4 >>> 9 | n4 << 23);
            }
            return n2 != 0;
        });
        int n187 = 31 - 31;
        this.nC = new BooleanValue((String)O00O0oO0O0[~(~74 ^ 0x1B)], (Module)this, (Boolean)((n187 << 11 | n187 >>> 21) != 0), () -> {
            int n2;
            int n3 = 326219304;
            if (n3 != n3) {
                n3 = 1204205283;
            }
            if (((Boolean)this.ny.wD()).booleanValue()) {
                n2 = ~(--39 * 0x69069069);
                return n2 != 0;
            }
            int n4 = -101 - -109;
            n2 = n4 >>> 3 | n4 << 29;
            return n2 != 0;
        });
        String string45 = q00000O0000;
        if (string45 == null) {
            string45 = q00000O0000 = (String)O00O0oO0O0[--375288405 * 103] + (String)O00O0oO0O0[-390451574 * 77 ^ 0xFFFFFFDF];
        }
        this.nD = new BooleanValue(string45, (Module)this, (Boolean)((-128208014 - -93 - 121 - -63) * -67), () -> {
            int n2;
            int n3 = 1616228874;
            if (n3 != n3) {
                throw null;
            }
            int n4 = 110036492;
            if (((Boolean)this.ny.wD()).booleanValue()) {
                int n5 = 0 >>> 11 | 0 << 21;
                n2 = n5 << 25 | n5 >>> 7;
                return n2 != 0;
            }
            n2 = ~(4859 * 266059921 + -45);
            return n2 != 0;
        });
        this.nE = null;
        this.nF = new BooleanValue((String)O00O0oO0O0[-(~(242 + -25))], (Module)this, (Boolean)(-2257 * -1056139499 - -37));
        int n188 = -95 + 95;
        this.nG = new BooleanValue((String)O00O0oO0O0[-(1171354717 * -121) + 13 + 93], (Module)this, (Boolean)((n188 << 9 | n188 >>> 23) * 0x3030303), () -> {
            int n2;
            int n3 = 337576575;
            if (n3 != n3) {
                n3 = 33;
            }
            if (!((Boolean)this.nF.wD()).booleanValue()) {
                n2 = 172 + -75 + -95 + -1;
            } else {
                int n4 = -474234643;
                n2 = -(0 << 3 | 0 >>> 29);
            }
            return n2 != 0;
        });
        int n189 = 185344 << 17 | 185344 >>> 15;
        int n190 = --1992915157 * -125;
        this.nH = new BooleanValue((String)O00O0oO0O0[(n189 << 5 | n189 >>> 27) + -117], (Module)this, (Boolean)(((n190 >>> 21 | n190 << 11) ^ 0xFFFFFFFD) != 0), () -> {
            int n2 = 1166742811;
            if (n2 != n2) {
                int cfr_ignored_0 = 1 & 1;
            }
            if (!((Boolean)this.nF.wD()).booleanValue()) {
                return 1 != 0;
            }
            int n3 = -89 * -96516119;
            int n4 = ~(n3 >>> 23 | n3 << 9);
            int n5 = n4 << 19 | n4 >>> 13;
            return n5 != 0;
        });
        this.nI = new BooleanValue((String)O00O0oO0O0[(386 + 93 ^ 0x1D) * -286331153], (Module)this, (Boolean)((0xFFFFFFFF ^ 0xFFFFFFA5 ^ 0xFFFFFFED) + 73), () -> {
            block0: {
                int n2 = 85121880;
                if (n2 == n2) break block0;
            }
            return ((Boolean)this.nF.wD() == false ? ~(885560266 * -97 + -123 ^ 5) : (0 << 11 | 0 >>> 21) * 1749801491) != 0;
        });
        int n191 = 1431661020 * -438261969 - -117;
        int n192 = 0 >>> 31 | 0 << 1;
        this.nJ = new BooleanValue((String)O00O0oO0O0[(n191 << 31 | n191 >>> 1) * 21], (Module)this, (Boolean)((n192 >>> 17 | n192 << 15) * 0x5B05B05B), () -> {
            int n2;
            int n3 = 744001380;
            if (n3 != n3) {
                OOOO0ooooO = n3 = -1338303578;
            }
            if (((Boolean)this.nF.wD()).booleanValue()) {
                int n4 = 0 * 87;
                n2 = n4 >>> 9 | n4 << 23;
                return n2 != 0;
            }
            int n5 = 0xFFFFE5A7 ^ 0xFFFFFFA7;
            n2 = (n5 >>> 7 | n5 << 25) ^ 0x35;
            return n2 != 0;
        });
        int n193 = ~0x60000000;
        this.nK = new BooleanValue((String)O00O0oO0O0[-(n193 << 9 | n193 >>> 23) ^ 0x67], (Module)this, (Boolean)((-1 + 51 ^ 0xFFFFFFBD ^ 0xFFFFFF8F) != 0), () -> {
            block0: {
                int n2 = 1805899881;
                if (n2 == n2) break block0;
                int cfr_ignored_0 = 0x4D & 1;
            }
            return ((Boolean)this.nF.wD() == false ? ~(-134217729 << 5 | -134217729 >>> 27) : ~2 ^ 0xFFFFFFFD) != 0;
        });
        this.nL = new BooleanValue((String)O00O0oO0O0[-316 * 1631000239 + 113], (Module)this, (Boolean)(-0 * -1643291835 * -266059921), () -> {
            boolean bl2;
            int n2 = -1605676037;
            if (n2 != n2) {
                n2 = 25;
            }
            if (!((Boolean)this.nF.wD()).booleanValue()) {
                bl2 = 5734 * 1056139499 + 95;
                return bl2;
            }
            bl2 = (79 - 79) * 35;
            return bl2;
        });
        int n194 = (106954629 - -123) * -39;
        int n195 = ~0;
        this.nM = new BooleanValue((String)O00O0oO0O0[(n194 << 13 | n194 >>> 19) ^ 0x1B], (Module)this, (Boolean)(~(n195 >>> 5 | n195 << 27) != 0), () -> {
            boolean bl2;
            int n2 = 1470461529;
            if (n2 != n2) {
            }
            int n3 = 1174226914;
            block5: while (true) {
                switch (n3) {
                    default: {
                        if (!((Boolean)this.nF.wD()).booleanValue()) {
                            n3 = 1423499833;
                            continue block5;
                        }
                        n3 = 1524281308;
                        continue block5;
                    }
                    case 1524281308: {
                        n3 = 484362870;
                        continue block5;
                    }
                    case 484362870: {
                        bl2 = -(~-1) * 7;
                        return bl2;
                    }
                    case 1423499833: 
                }
                break;
            }
            bl2 = -(0x1E7 ^ 0xB) * -1047552999 - -13;
            return bl2;
        });
        this.nN = new ConcurrentLinkedQueue();
        this.nO = new rip.vantage.commons.util.time.a();
        this.nP = new rip.vantage.commons.util.time.a();
        this.nU = ~(~-349184334 * 123 * 1);
        this.od = new Random();
        int n196 = 0x28000023 ^ 0x25;
        this.oe = (n196 << 5 | n196 >>> 27) + -97;
        int n197 = -(0xFFFFFFFC ^ 0xFFFFFFFD);
        this.of = (n197 >>> 25 | n197 << 7) + 1;
        this.op = --2147483613 - -35;
        this.or = new akd(0.0, 0.0, 0.0);
        this.os = new akd(0.0, 0.0, 0.0);
        this.ov = (0x7FFFFFEF + 17) * -109;
        this.oA = (-55 >>> 31 | -55 << 1) * -630453915;
        this.oB = ~-127 ^ 0xFFFFFF81;
        int n198 = 17 * 0xF0F0F0F;
        this.oC = n198 << 11 | n198 >>> 21;
        int n199 = ~0;
        this.oH = n199 << 13 | n199 >>> 19;
        this.oK = new aec(--118 - 109);
        this.oL = new HashMap<c, Integer>();
        this.oM = new ArrayList<r>();
        this.oN = new afj(afk.aHb, 300L);
        this.oO = new afj(afk.aHb, 250L);
        this.oP = var1_1 -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [66[UNCONDITIONALDOLOOP]], but top level block is 67[UNCONDITIONALDOLOOP]
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        };
        this.oQ = this::e;
        this.oR = this::f;
        this.oS = var1_1 -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        };
        this.oT = fr2 -> {
            int n2 = -978872054;
            if (n2 == n2 || 920507765 == 0) {
                // empty if block
            }
            fr2.i(fr2.dA() + ((Number)this.mh.wD()).doubleValue() - Double.longBitsToDouble(0xA1F321494EC94C6FL ^ 0xE1FB21494EC94C6FL));
        };
        this.oU = this::b;
        this.oV = fw2 -> {
            int n2 = 1255439886;
            if (n2 != n2) {
                throw null;
            }
            if (this.jE != null && !((Mode)this.lV.wD()).getName().equals((String)O00O0oO0O0[-1989248008 * 95 ^ 0x13]) && this.eX()) {
                fw2.a(a.cUz);
                fw2.k(-(0xFFFFF30B ^ 0xFFFFFFD1) * 1736263375 - -71);
            }
        };
        this.hV = (7 << 1 | 7 >>> 31) ^ 0xFFFFFF99 ^ 0xFFFFFF97;
        this.oW = this::e;
        this.oX = this::a;
        this.oY = clickEvent -> {
            int n2 = 1692245692;
            if (n2 != n2) {
                int cfr_ignored_0 = 14 + 5;
            }
            int n3 = 0x1CD ^ 5;
            int n4 = n3 >>> 31 | n3 << 1;
            if (((Mode)this.lV.wD()).getName().equals((String)O00O0oO0O0[n4 >>> 3 | n4 << 29]) && this.jE != null) {
                int n5 = 1105264143;
                int n6 = 0x10000000 * 81;
                if (this.nY == (n6 >>> 27 | n6 << 5)) {
                    clickEvent.cF();
                }
            }
        };
        this.oZ = this::b;
        this.pa = this::a;
        this.pb = this::a;
        this.pc = var1_1 -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        };
        this.pd = var1_1 -> {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        };
        objectArray[2] = cb.values();
        lArray[4] = l2 = 4635136331050018361L;
        long l3 = lArray[4];
        int n200 = (0x103 ^ 0x7F) * -723362913;
        lArray[4] = l2 = l3 ^ ((long)((cb[])objectArray[2]).length << (1300123399 - -89) * 79 * 93 ^ l3) & -1L << (n200 << 3 | n200 >>> 29);
        long l4 = lArray[4];
        lArray[4] = l2 = l4 ^ (0L ^ l4) & -1L >>> 1583103648 * -5 * -121;
        while (true) {
            if ((int)lArray[4] >= (int)(lArray[4] >>> ~(~(1 >>> 27 | 1 << 5)))) {
                this.ms.p(cb.gG);
                return;
            }
            cb cb2 = ((cb[])objectArray[2])[(int)lArray[4]];
            int n201 = ~-131073;
            cb[] cbArray = new cb[n201 >>> 17 | n201 << 15];
            cbArray[((0x66666668 ^ 0xFFFFFFFF) * 15 + 39) * 111] = cb2;
            this.ms.a((cb[])cbArray);
            long l5 = lArray[4];
            int n202 = ~(-2057390881 * -23);
            lArray[4] = l2 = l5 ^ (l5 ^ l5 + (long)(-107 + 107 + 1)) & -1L >>> (n202 >>> 9 | n202 << 23) * 57;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    public static /* bridge */ strictfp /* synthetic */ boolean a(Mode mode) {
        int n2 = -1308071540;
        if (n2 == n2 || -2131731145 == 0) {
            // empty if block
        }
        return mode.getName().equals((String)O00O0oO0O0[-(-(6223 * -270549121)) - -83]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* bridge */ strictfp /* synthetic */ double n(r r2) {
        int n2 = -105694230;
        if (n2 == n2) return r2.cus;
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ boolean a(Map.Entry entry) {
        int n2 = 1777884273;
        if (n2 != n2) {
            n2 = 68277473;
        }
        int n3 = 0xFFFFFD11 ^ 0xFFFFFF91;
        int n4 = n3 >>> 5 | n3 << 27;
        int n5 = n4 >>> 15 | n4 << 17;
        if (KillAura.aER.bgK.aRg - (Integer)entry.getValue() <= (n5 >>> 19 | n5 << 13)) return 1 != 0;
        int n6 = -((0x5FFFFFFF >>> 27 | 0x5FFFFFFF << 5) - -21) * 0x27027027;
        return n6 != 0;
    }

    /*
     * Unable to fully structure code
     */
    static { /* RISE-PORT STUB: initializer unrestored */ }
}

