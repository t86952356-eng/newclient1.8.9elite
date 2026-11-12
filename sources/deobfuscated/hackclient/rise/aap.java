/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.adh;
import hackclient.rise.adk;
import hackclient.rise.adp;
import net.minecraft.client.gui.am;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agf;
import hackclient.rise.agp;
import hackclient.rise.ait;
import hackclient.rise.er;
import hackclient.rise.gb;
import hackclient.rise.gd;
import java.awt.Color;
import java.net.BindException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.gui.cz;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class aap
extends adh {
    public /* synthetic */ boolean aDo;
    public static /* synthetic */ Object[] oOo00Oo0OOo0;
    public /* synthetic */ String jc;
    public /* synthetic */ adp aDh;
    public /* synthetic */ agp aDj;
    public static /* synthetic */ Object oo000o00Oo00;
    public /* synthetic */ adp aDi;
    public static /* synthetic */ String q0OOOoo00o0;
    public /* synthetic */ agf aDf;
    public /* synthetic */ afj aDg;
    public static /* synthetic */ String Oo0o00000O00;
    public /* synthetic */ afj animation;
    public /* synthetic */ a bN;
    public /* synthetic */ String aDl;
    public /* synthetic */ adk[] menuButtons;
    public static /* synthetic */ String o0Oo000O0oO;
    public static /* synthetic */ String O0OoOO0OOOOO;
    public static /* synthetic */ String oO00O0OO0ooO;
    public static /* synthetic */ String[] o0000000O000;
    public static /* synthetic */ String[] oO000O00OO00;
    public /* synthetic */ boolean aDk;
    private static /* synthetic */ int[] ooO00oO0OoO0;
    public /* synthetic */ boolean aDn;
    public static /* synthetic */ String q0oOOoOo0O00O;
    public static /* synthetic */ String ooo00oo0Ooo0;
    public /* synthetic */ String aDm;
    @EventLink
    public /* synthetic */ Listener<er> aDp;
    public static /* synthetic */ Object[] o0o000o0O0o0;
    private static /* synthetic */ int o0O000O0O0O0;
    private static /* synthetic */ boolean oOO00OO0OOO0;

    /*
     * Unable to fully structure code
     */
    static { /* RISE-PORT STUB: initializer unrestored */ }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void q0OOOoo00o0() {
        int n2 = -889461239;
        if (n2 != n2) {
            throw new BindException();
        }
        int n3 = 2032167653;
        block82: while (true) {
            switch (n3) {
                case -1528629578: {
                    aap.ooO00oO0OoO0[0xF734 ^ 0xF7F6] = 0xF7AF ^ 0xF7F6;
                    n3 = -1023208189;
                    continue block82;
                }
                case -1023208189: {
                    aap.ooO00oO0OoO0[0x9D3B ^ 0x9CB3] = 0x9C82 ^ 0x9CB3;
                    aap.ooO00oO0OoO0[0x3F91 ^ 0x3E83] = 0x3E80 ^ 0x3E83;
                    aap.ooO00oO0OoO0[0x38BF ^ 0x38A8] = 0x38BF ^ 0x38A8;
                    aap.ooO00oO0OoO0[0x102BF ^ 0x10206] = 0x10255 ^ 0x10206;
                    aap.ooO00oO0OoO0[0x783F ^ 0x78C1] = 0xB502EA3A ^ 0x78C1;
                    aap.ooO00oO0OoO0[0xC604 ^ 0xC6E8] = 0xFFFF3917 ^ 0xC6E8;
                    aap.ooO00oO0OoO0[0x7138 ^ 0x710B] = 0xFFFF8B29 ^ 0x710B;
                    aap.ooO00oO0OoO0[0xEE6C ^ 0xEF17] = 0xEF06 ^ 0xEF17;
                    aap.ooO00oO0OoO0[0x1DCF ^ 0x1D3E] = 0x1D2D ^ 0x1D3E;
                    aap.ooO00oO0OoO0[0xC2D2 ^ 0xC243] = 0x28D0C243 ^ 0xC243;
                    aap.ooO00oO0OoO0[0xAB0C ^ 0xABB3] = 0xFFFF544C ^ 0xABB3;
                    aap.ooO00oO0OoO0[0xF7EC ^ 0xF759] = 0xF75C ^ 0xF759;
                    n3 = 466196973;
                    continue block82;
                }
                case 466196973: {
                    aap.ooO00oO0OoO0[0xA5A2 ^ 0xA50E] = 0xC71CD4C9 ^ 0xA50E;
                    n3 = -939223810;
                    continue block82;
                }
                case -939223810: {
                    aap.ooO00oO0OoO0[0x10D4C ^ 0x10D8D] = 0x10D8C ^ 0x10D8D;
                    aap.ooO00oO0OoO0[0xF988 ^ 0xF8D0] = 0xFFFF058F ^ 0xF8D0;
                    aap.ooO00oO0OoO0[0xF597 ^ 0xF5EF] = 0xF5F2 ^ 0xF5EF;
                    n3 = -27584977;
                    continue block82;
                }
                case -27584977: {
                    aap.ooO00oO0OoO0[0xD40F ^ 0xD567] = 0xD56A ^ 0xD567;
                    aap.ooO00oO0OoO0[0x51E7 ^ 0x51E5] = 0x51FE ^ 0x51E5;
                    aap.ooO00oO0OoO0[0x4456 ^ 0x44A1] = 0x444C ^ 0x44A1;
                    aap.ooO00oO0OoO0[0x6A8E ^ 0x6A09] = 0xFFFF9582 ^ 0x6A09;
                    n3 = 1914543635;
                    continue block82;
                }
                case 1914543635: {
                    aap.ooO00oO0OoO0[0xC130 ^ 0xC165] = 0xC128 ^ 0xC165;
                    aap.ooO00oO0OoO0[0x7004 ^ 0x7078] = 0x706D ^ 0x7078;
                    n3 = 298603386;
                    continue block82;
                }
                case 298603386: {
                    aap.ooO00oO0OoO0[0x10C5A ^ 0x10CBF] = 0x10CA4 ^ 0x10CBF;
                    aap.ooO00oO0OoO0[0xA38C ^ 0xA2EC] = 0xEFDF1D93 ^ 0xA2EC;
                    n3 = 586209847;
                    continue block82;
                }
                case 586209847: {
                    aap.ooO00oO0OoO0[0xD327 ^ 0xD211] = 0xD22F ^ 0xD211;
                    aap.ooO00oO0OoO0[0x39C4 ^ 0x39DE] = 0xFFFFC66D ^ 0x39DE;
                    n3 = -77294045;
                    continue block82;
                }
                case -77294045: {
                    aap.ooO00oO0OoO0[0x4A57 ^ 0x4B46] = 0x4B4D ^ 0x4B46;
                    aap.ooO00oO0OoO0[0xE0B8 ^ 0xE186] = 0xE185 ^ 0xE186;
                    aap.ooO00oO0OoO0[0x3E5A ^ 0x3E42] = 0x3E4B ^ 0x3E42;
                    aap.ooO00oO0OoO0[0x4479 ^ 0x4504] = 0x4551 ^ 0x4504;
                    aap.ooO00oO0OoO0[0x10C38 ^ 0x10C54] = 0x10C4B ^ 0x10C54;
                    aap.ooO00oO0OoO0[0x58FA ^ 0x5848] = 0x582C ^ 0x5848;
                    aap.ooO00oO0OoO0[0x62C8 ^ 0x6214] = 0x6207 ^ 0x6214;
                    n3 = 25467612;
                    continue block82;
                }
                case 25467612: {
                    aap.ooO00oO0OoO0[0xD105 ^ 0xD046] = 0xFFFF2FED ^ 0xD046;
                    aap.ooO00oO0OoO0[0x10ED5 ^ 0x10EA6] = 0x10EAF ^ 0x10EA6;
                    aap.ooO00oO0OoO0[0xF01B ^ 0xF049] = 0xFFFF0F90 ^ 0xF049;
                    aap.ooO00oO0OoO0[0x28CB ^ 0x29ED] = 0x5F750EE0 ^ 0x29ED;
                    aap.ooO00oO0OoO0[0x8F90 ^ 0x8E91] = 0x8EF2 ^ 0x8E91;
                    aap.ooO00oO0OoO0[0xC287 ^ 0xC227] = 0xC279 ^ 0xC227;
                    aap.ooO00oO0OoO0[0x1742 ^ 0x1781] = 0x1782 ^ 0x1781;
                    aap.ooO00oO0OoO0[0x2088 ^ 0x2034] = 0xFFFFDFCB ^ 0x2034;
                    aap.ooO00oO0OoO0[0xBAF6 ^ 0xBA80] = 0xBA9B ^ 0xBA80;
                    aap.ooO00oO0OoO0[0x583D ^ 0x5941] = 0xFFFFA6BE ^ 0x5941;
                    aap.ooO00oO0OoO0[0xDBD2 ^ 0xDB0A] = 0xFFFF24F5 ^ 0xDB0A;
                    aap.ooO00oO0OoO0[0x433B ^ 0x4277] = 0xC18FDE6E ^ 0x4277;
                    aap.ooO00oO0OoO0[0x7796 ^ 0x7694] = 0xC0ED0597 ^ 0x7694;
                    aap.ooO00oO0OoO0[0xA9AA ^ 0xA8A1] = 0xA8FE ^ 0xA8A1;
                    aap.ooO00oO0OoO0[0x846E ^ 0x844D] = 0xFFFF7BB0 ^ 0x844D;
                    aap.ooO00oO0OoO0[0x3A4D ^ 0x3AF7] = 0xFFFFC51E ^ 0x3AF7;
                    aap.ooO00oO0OoO0[0xAD25 ^ 0xAD48] = 0xAD49 ^ 0xAD48;
                    aap.ooO00oO0OoO0[0xEB1A ^ 0xEA68] = 0xEA75 ^ 0xEA68;
                    aap.ooO00oO0OoO0[0xD676 ^ 0xD692] = 0x5C06E85 ^ 0xD692;
                    aap.ooO00oO0OoO0[0xDF34 ^ 0xDFC0] = 0xCC545325 ^ 0xDFC0;
                    aap.ooO00oO0OoO0[0x53B2 ^ 0x53AF] = 0x53A8 ^ 0x53AF;
                    aap.ooO00oO0OoO0[0xA1FF ^ 0xA1BD] = 0xA1D6 ^ 0xA1BD;
                    return;
                }
                default: {
                    ooO00oO0OoO0 = new int[0x5411 ^ 0x5581];
                    n3 = -1546308425;
                    continue block82;
                }
                case -1546308425: {
                    aap.ooO00oO0OoO0[0xE2F1 ^ 0xE26B] = 0x7A4AE00 ^ 0xE26B;
                    n3 = -735595236;
                    continue block82;
                }
                case -735595236: {
                    aap.ooO00oO0OoO0[0x4487 ^ 0x4478] = 0x9E0D1F3D ^ 0x4478;
                    aap.ooO00oO0OoO0[0x8BDD ^ 0x8BCF] = 0x8BB4 ^ 0x8BCF;
                    n3 = 1926406815;
                    continue block82;
                }
                case 1926406815: {
                    aap.ooO00oO0OoO0[0x2EEC ^ 0x2E10] = 0x2E03 ^ 0x2E10;
                    aap.ooO00oO0OoO0[0x44A9 ^ 0x4453] = 0xFDFFBBAC ^ 0x4453;
                    aap.ooO00oO0OoO0[0xA895 ^ 0xA840] = 0xA859 ^ 0xA840;
                    aap.ooO00oO0OoO0[0xABFE ^ 0xAB58] = 0xAB5B ^ 0xAB58;
                    aap.ooO00oO0OoO0[0x1037B ^ 0x10328] = 0xFFFEFCD7 ^ 0x10328;
                    aap.ooO00oO0OoO0[0x190E ^ 0x194A] = 0x194B ^ 0x194A;
                    aap.ooO00oO0OoO0[0xF615 ^ 0xF65D] = 0xF654 ^ 0xF65D;
                    aap.ooO00oO0OoO0[0x4448 ^ 0x4547] = 0x154547 ^ 0x4547;
                    aap.ooO00oO0OoO0[0x6826 ^ 0x68A6] = 0x68DF ^ 0x68A6;
                    aap.ooO00oO0OoO0[0x89DA ^ 0x88D3] = 0x88D2 ^ 0x88D3;
                    aap.ooO00oO0OoO0[0xD2DF ^ 0xD2D8] = 0xD2EB ^ 0xD2D8;
                    aap.ooO00oO0OoO0[0x89C ^ 0x9C8] = 0xEF4009C8 ^ 0x9C8;
                    aap.ooO00oO0OoO0[0x194C ^ 0x18C1] = 0x18CE ^ 0x18C1;
                    aap.ooO00oO0OoO0[0xF328 ^ 0xF3B5] = 0xFFFF0C4A ^ 0xF3B5;
                    aap.ooO00oO0OoO0[0x1504 ^ 0x1461] = 0x1464 ^ 0x1461;
                    aap.ooO00oO0OoO0[0xBDEE ^ 0xBD84] = 0xFFFF6277 ^ 0xBD84;
                    aap.ooO00oO0OoO0[0x9DCD ^ 0x9CAA] = 0x9CA3 ^ 0x9CAA;
                    aap.ooO00oO0OoO0[0xDF2E ^ 0xDEA4] = 0xFFC3A15B ^ 0xDEA4;
                    aap.ooO00oO0OoO0[0x745C ^ 0x7443] = 0xFFFF8BBC ^ 0x7443;
                    aap.ooO00oO0OoO0[0x291C ^ 0x290F] = 0x6000290F ^ 0x290F;
                    n3 = -1367093456;
                    continue block82;
                }
                case -1367093456: {
                    aap.ooO00oO0OoO0[0x4AF7 ^ 0x4ADD] = 0x4AD0 ^ 0x4ADD;
                    aap.ooO00oO0OoO0[0x373D ^ 0x364A] = 0x364F ^ 0x364A;
                    aap.ooO00oO0OoO0[0xCD6A ^ 0xCD17] = 0xCD16 ^ 0xCD17;
                    aap.ooO00oO0OoO0[0x23EC ^ 0x22E9] = 0x2292 ^ 0x22E9;
                    n3 = 1391051483;
                    continue block82;
                }
                case 1391051483: {
                    aap.ooO00oO0OoO0[0x59FE ^ 0x5999] = 0x598E ^ 0x5999;
                    n3 = 743808936;
                    continue block82;
                }
                case 743808936: {
                    aap.ooO00oO0OoO0[0x1C15 ^ 0x1D9A] = 0x1D81 ^ 0x1D9A;
                    aap.ooO00oO0OoO0[0xD900 ^ 0xD837] = 0xFFFF2784 ^ 0xD837;
                    aap.ooO00oO0OoO0[0x10358 ^ 0x1037E] = 0x1036B ^ 0x1037E;
                    n3 = -265801470;
                    continue block82;
                }
                case -265801470: {
                    aap.ooO00oO0OoO0[0x18F5 ^ 0x1816] = 0x1811 ^ 0x1816;
                    aap.ooO00oO0OoO0[0xA63 ^ 0xA5A] = 0xFFFFF591 ^ 0xA5A;
                    aap.ooO00oO0OoO0[0x701C ^ 0x719E] = 0x3A83D908 ^ 0x719E;
                    n3 = -1865862095;
                    continue block82;
                }
                case -1865862095: {
                    aap.ooO00oO0OoO0[0x10C72 ^ 0x10C9D] = 0x69D13A00 ^ 0x10C9D;
                    aap.ooO00oO0OoO0[0x52D2 ^ 0x5262] = 0x5277 ^ 0x5262;
                    aap.ooO00oO0OoO0[0xA3B5 ^ 0xA35B] = 0x216C354 ^ 0xA35B;
                    aap.ooO00oO0OoO0[0x6E6A ^ 0x6ED9] = 0xFFFF9144 ^ 0x6ED9;
                    aap.ooO00oO0OoO0[0x68CA ^ 0x6988] = 0xC71C184F ^ 0x6988;
                    aap.ooO00oO0OoO0[0xABB6 ^ 0xAB98] = 0x72D7F802 ^ 0xAB98;
                    n3 = -1797940025;
                    continue block82;
                }
                case -1797940025: {
                    aap.ooO00oO0OoO0[0x8E48 ^ 0x8EC9] = 0xFFFF7120 ^ 0x8EC9;
                    aap.ooO00oO0OoO0[0x3585 ^ 0x3588] = 0xFFFFC91A ^ 0x3588;
                    aap.ooO00oO0OoO0[0xAA40 ^ 0xAB64] = 0xAB47 ^ 0xAB64;
                    aap.ooO00oO0OoO0[0xF941 ^ 0xF922] = 0xF921 ^ 0xF922;
                    aap.ooO00oO0OoO0[0xCA90 ^ 0xCBE3] = 0xD794FE06 ^ 0xCBE3;
                    n3 = -605068685;
                    continue block82;
                }
                case -605068685: {
                    aap.ooO00oO0OoO0[0x9001 ^ 0x9060] = 0x5D03F9B0 ^ 0x9060;
                    n3 = -546865860;
                    continue block82;
                }
                case -546865860: {
                    aap.ooO00oO0OoO0[0xEAD4 ^ 0xEA3C] = 0xFFFF158F ^ 0xEA3C;
                    aap.ooO00oO0OoO0[0x1981 ^ 0x1885] = 0xFFFFE73E ^ 0x1885;
                    aap.ooO00oO0OoO0[0xBBDF ^ 0xBAD3] = 0xBAAC ^ 0xBAD3;
                    aap.ooO00oO0OoO0[0xB884 ^ 0xB881] = 0x72912215 ^ 0xB881;
                    n3 = 70400822;
                    continue block82;
                }
                case 70400822: {
                    aap.ooO00oO0OoO0[0xFF83 ^ 0xFFFA] = 0xEC0FFEF ^ 0xFFFA;
                    aap.ooO00oO0OoO0[0xE32B ^ 0xE359] = 0xE34E ^ 0xE359;
                    aap.ooO00oO0OoO0[0xA981 ^ 0xA990] = 0xA98D ^ 0xA990;
                    aap.ooO00oO0OoO0[0xEB88 ^ 0xEB2F] = 0xEB32 ^ 0xEB2F;
                    aap.ooO00oO0OoO0[0x486 ^ 0x40C] = 0x41F ^ 0x40C;
                    n3 = -2025839070;
                    continue block82;
                }
                case -2025839070: {
                    aap.ooO00oO0OoO0[0xC107 ^ 0xC144] = 0xC12F ^ 0xC144;
                    aap.ooO00oO0OoO0[0xD1E7 ^ 0xD0C9] = 0xD0EB ^ 0xD0C9;
                    n3 = 1287758151;
                    continue block82;
                }
                case 1287758151: {
                    aap.ooO00oO0OoO0[0x29F3 ^ 0x294D] = 0x293C ^ 0x294D;
                    aap.ooO00oO0OoO0[0x8C4A ^ 0x8C31] = 0x8C3A ^ 0x8C31;
                    aap.ooO00oO0OoO0[0xBDF5 ^ 0xBD57] = 0xBD68 ^ 0xBD57;
                    aap.ooO00oO0OoO0[0x5C6D ^ 0x5CFA] = 0xE5E0FBD5 ^ 0x5CFA;
                    aap.ooO00oO0OoO0[0xA848 ^ 0xA844] = 0xA861 ^ 0xA844;
                    aap.ooO00oO0OoO0[0x10A2C ^ 0x10A03] = 0x10A20 ^ 0x10A03;
                    aap.ooO00oO0OoO0[0x6B77 ^ 0x6A50] = 0x7FFF9197 ^ 0x6A50;
                    aap.ooO00oO0OoO0[0xADD4 ^ 0xAD9A] = 0xFFFF5213 ^ 0xAD9A;
                    aap.ooO00oO0OoO0[0x10AB3 ^ 0x10A21] = 0xFFFEF59A ^ 0x10A21;
                    aap.ooO00oO0OoO0[0xA4B0 ^ 0xA434] = 0x5555C20D ^ 0xA434;
                    n3 = -2035485540;
                    continue block82;
                }
                case -2035485540: {
                    aap.ooO00oO0OoO0[0xB12 ^ 0xBE2] = 0xBEF ^ 0xBE2;
                    aap.ooO00oO0OoO0[0xAEEF ^ 0xAF9F] = 0xFFFF4298 ^ 0xAF9F;
                    aap.ooO00oO0OoO0[0x9D39 ^ 0x9D05] = 0xFFFF62E4 ^ 0x9D05;
                    aap.ooO00oO0OoO0[0x68A6 ^ 0x6805] = 0xFFFF9789 ^ 0x6805;
                    n3 = 333180633;
                    continue block82;
                }
                case 333180633: {
                    aap.ooO00oO0OoO0[0xF620 ^ 0xF61B] = 0xFFFF0988 ^ 0xF61B;
                    aap.ooO00oO0OoO0[0xCAD ^ 0xDFA] = 0xDEB ^ 0xDFA;
                    aap.ooO00oO0OoO0[0xD569 ^ 0xD528] = 0xD50F ^ 0xD528;
                    aap.ooO00oO0OoO0[0x8309 ^ 0x8257] = 0x823E ^ 0x8257;
                    aap.ooO00oO0OoO0[0xA21E ^ 0xA26F] = 0xA27C ^ 0xA26F;
                    n3 = 837417842;
                    continue block82;
                }
                case 837417842: {
                    aap.ooO00oO0OoO0[0xCFBA ^ 0xCF02] = 0xCF09 ^ 0xCF02;
                    n3 = -5444101;
                    continue block82;
                }
                case -5444101: {
                    aap.ooO00oO0OoO0[0xF32 ^ 0xE5C] = 0xE4B ^ 0xE5C;
                    aap.ooO00oO0OoO0[0x2CF6 ^ 0x2C93] = 0xFFFFD304 ^ 0x2C93;
                    n3 = -1265981926;
                    continue block82;
                }
                case -1265981926: {
                    aap.ooO00oO0OoO0[0x9BA8 ^ 0x9B13] = 0x9B21 ^ 0x9B13;
                    aap.ooO00oO0OoO0[0xB68F ^ 0xB7A3] = 0xFFFF484E ^ 0xB7A3;
                    aap.ooO00oO0OoO0[0x941D ^ 0x9536] = 0x9509 ^ 0x9536;
                    aap.ooO00oO0OoO0[0x9A93 ^ 0x9A71] = 0x9A68 ^ 0x9A71;
                    aap.ooO00oO0OoO0[0x627E ^ 0x6323] = 0xFFFF9CE0 ^ 0x6323;
                    aap.ooO00oO0OoO0[0x762 ^ 0x790] = 0x7B3 ^ 0x790;
                    aap.ooO00oO0OoO0[0xADCD ^ 0xACAC] = 0xFFFF5353 ^ 0xACAC;
                    aap.ooO00oO0OoO0[0x229 ^ 0x200] = 0x213 ^ 0x200;
                    aap.ooO00oO0OoO0[0x90F1 ^ 0x91E6] = 0x91FB ^ 0x91E6;
                    aap.ooO00oO0OoO0[0xB5C8 ^ 0xB543] = 0xFFFF4A5B ^ 0xB543;
                    aap.ooO00oO0OoO0[0x6A38 ^ 0x6A18] = 0x6A0F ^ 0x6A18;
                    aap.ooO00oO0OoO0[0x751A ^ 0x7553] = 0x7544 ^ 0x7553;
                    aap.ooO00oO0OoO0[0xCB7B ^ 0xCA3C] = 0xCA2D ^ 0xCA3C;
                    aap.ooO00oO0OoO0[0xE6C5 ^ 0xE680] = 0xE69F ^ 0xE680;
                    n3 = 1827302286;
                    continue block82;
                }
                case 1827302286: {
                    aap.ooO00oO0OoO0[0x10018 ^ 0x100B5] = 0x100D0 ^ 0x100B5;
                    n3 = -671824763;
                    continue block82;
                }
                case -671824763: {
                    aap.ooO00oO0OoO0[0xCBDC ^ 0xCB4F] = 0xCB5E ^ 0xCB4F;
                    n3 = -289361125;
                    continue block82;
                }
                case -289361125: {
                    aap.ooO00oO0OoO0[0x3631 ^ 0x363E] = 0x3663 ^ 0x363E;
                    aap.ooO00oO0OoO0[0x65BD ^ 0x64CC] = 0x64CF ^ 0x64CC;
                    aap.ooO00oO0OoO0[0xD8C1 ^ 0xD85F] = 0xD862 ^ 0xD85F;
                    n3 = 921890610;
                    continue block82;
                }
                case 921890610: {
                    aap.ooO00oO0OoO0[0x1062B ^ 0x106DD] = 0x106B0 ^ 0x106DD;
                    aap.ooO00oO0OoO0[0x89B3 ^ 0x8837] = 0xFFFF77A0 ^ 0x8837;
                    aap.ooO00oO0OoO0[0x6577 ^ 0x64F0] = 0xFFFF9B3E ^ 0x64F0;
                    aap.ooO00oO0OoO0[0x5B0A ^ 0x5BD7] = 0x5BDA ^ 0x5BD7;
                    n3 = -1540671339;
                    continue block82;
                }
                case -1540671339: {
                    aap.ooO00oO0OoO0[0x8EFD ^ 0x8F84] = 0xFF55707B ^ 0x8F84;
                    aap.ooO00oO0OoO0[0x86A5 ^ 0x87F0] = 0xFFFF7865 ^ 0x87F0;
                    aap.ooO00oO0OoO0[0x37B4 ^ 0x36ED] = 0x36E2 ^ 0x36ED;
                    n3 = 1456545943;
                    continue block82;
                }
                case 1456545943: {
                    aap.ooO00oO0OoO0[0xD134 ^ 0xD011] = 0xFFFF2F96 ^ 0xD011;
                    aap.ooO00oO0OoO0[0xAFED ^ 0xAEE3] = 0xE3270794 ^ 0xAEE3;
                    n3 = -1222541241;
                    continue block82;
                }
                case -1222541241: {
                    aap.ooO00oO0OoO0[0x221 ^ 0x2A8] = 0xFFFFFD57 ^ 0x2A8;
                    aap.ooO00oO0OoO0[0x333C ^ 0x33E3] = 0xFFFFCC1E ^ 0x33E3;
                    aap.ooO00oO0OoO0[0x2B7 ^ 0x250] = 0x231 ^ 0x250;
                    aap.ooO00oO0OoO0[0x371A ^ 0x371C] = 0xCCCCFBD1 ^ 0x371C;
                    aap.ooO00oO0OoO0[0xFD86 ^ 0xFC0A] = 0xA9416A3D ^ 0xFC0A;
                    n3 = -995219407;
                    continue block82;
                }
                case -995219407: {
                    aap.ooO00oO0OoO0[0x166C ^ 0x1775] = 0xFFFFE8B2 ^ 0x1775;
                    aap.ooO00oO0OoO0[0xDB87 ^ 0xDACF] = 0xDAD4 ^ 0xDACF;
                    n3 = 2054957085;
                    continue block82;
                }
                case 2054957085: {
                    aap.ooO00oO0OoO0[0x4FAC ^ 0x4F4A] = 0x4F4F ^ 0x4F4A;
                    aap.ooO00oO0OoO0[0xF43D ^ 0xF56C] = 0x7FF0A93 ^ 0xF56C;
                    aap.ooO00oO0OoO0[0x10B4E ^ 0x10B80] = 0x10B9D ^ 0x10B80;
                    aap.ooO00oO0OoO0[0xFE6 ^ 0xFE8] = 0xFFFFF04F ^ 0xFE8;
                    aap.ooO00oO0OoO0[0xEC5 ^ 0xF43] = 0xFFFFF0BC ^ 0xF43;
                    n3 = -1078801983;
                    continue block82;
                }
                case -1078801983: {
                    aap.ooO00oO0OoO0[0xF18F ^ 0xF154] = 0xFFFF0EC9 ^ 0xF154;
                    n3 = -1370190181;
                    continue block82;
                }
                case -1370190181: {
                    aap.ooO00oO0OoO0[0xB948 ^ 0xB958] = 0xB95B ^ 0xB958;
                    aap.ooO00oO0OoO0[0x1EFA ^ 0x1E66] = 0x1E41 ^ 0x1E66;
                    n3 = 839151780;
                    continue block82;
                }
                case 839151780: {
                    aap.ooO00oO0OoO0[0x6CE7 ^ 0x6D69] = 0x6D78 ^ 0x6D69;
                    aap.ooO00oO0OoO0[0x9E5C ^ 0x9E54] = 0xFFFF61F7 ^ 0x9E54;
                    n3 = 2036494875;
                    continue block82;
                }
                case 2036494875: {
                    aap.ooO00oO0OoO0[0xD5C0 ^ 0xD5F8] = 0xD5FB ^ 0xD5F8;
                    aap.ooO00oO0OoO0[0x9479 ^ 0x9561] = 0x9540 ^ 0x9561;
                    aap.ooO00oO0OoO0[0x6869 ^ 0x69E9] = 0x698C ^ 0x69E9;
                    aap.ooO00oO0OoO0[0xF2CD ^ 0xF3A1] = 0xC466 ^ 0xF3A1;
                    aap.ooO00oO0OoO0[0x6C0B ^ 0x6C34] = 0xFFFF9399 ^ 0x6C34;
                    aap.ooO00oO0OoO0[0x10465 ^ 0x104BC] = 0x104CF ^ 0x104BC;
                    aap.ooO00oO0OoO0[0x6DA1 ^ 0x6CAB] = 0x6CB4 ^ 0x6CAB;
                    aap.ooO00oO0OoO0[0xC1E4 ^ 0xC1E5] = 0xC1E0 ^ 0xC1E5;
                    aap.ooO00oO0OoO0[0x170D ^ 0x17BA] = 0x17AF ^ 0x17BA;
                    n3 = 1351263942;
                    continue block82;
                }
                case 1351263942: {
                    aap.ooO00oO0OoO0[0xE4AD ^ 0xE4E1] = 0xE4F6 ^ 0xE4E1;
                    aap.ooO00oO0OoO0[0x9F76 ^ 0x9F60] = 0x9F71 ^ 0x9F60;
                    aap.ooO00oO0OoO0[0xC65 ^ 0xD7E] = 0xD25 ^ 0xD7E;
                    aap.ooO00oO0OoO0[0xDF27 ^ 0xDFF5] = 0xDF82 ^ 0xDFF5;
                    aap.ooO00oO0OoO0[0xF4F2 ^ 0xF4C6] = 0xFFFF0B1B ^ 0xF4C6;
                    aap.ooO00oO0OoO0[0x287F ^ 0x295D] = 0x294E ^ 0x295D;
                    aap.ooO00oO0OoO0[0xF65 ^ 0xFE7] = 0x3F2B3762 ^ 0xFE7;
                    n3 = -1782202766;
                    continue block82;
                }
                case -1782202766: {
                    aap.ooO00oO0OoO0[0x7533 ^ 0x7543] = 0x7750 ^ 0x7543;
                    n3 = -1938859855;
                    continue block82;
                }
                case -1938859855: {
                    aap.ooO00oO0OoO0[0x1541 ^ 0x1473] = 0xFFFFE282 ^ 0x1473;
                    aap.ooO00oO0OoO0[0x27DE ^ 0x26C2] = 0xFFFFD93D ^ 0x26C2;
                    n3 = -1899387104;
                    continue block82;
                }
                case -1899387104: {
                    aap.ooO00oO0OoO0[0x159A ^ 0x1503] = 0x151C ^ 0x1503;
                    aap.ooO00oO0OoO0[0x5291 ^ 0x52F9] = 0xFFFFAD10 ^ 0x52F9;
                    aap.ooO00oO0OoO0[0x6E35 ^ 0x6E07] = 0xFFFF91E2 ^ 0x6E07;
                    n3 = 385470077;
                    continue block82;
                }
                case 385470077: {
                    aap.ooO00oO0OoO0[0xC1F5 ^ 0xC096] = 0xC196 ^ 0xC096;
                    aap.ooO00oO0OoO0[0x6B50 ^ 0x6BFF] = 0xFFFF9464 ^ 0x6BFF;
                    aap.ooO00oO0OoO0[0xE794 ^ 0xE6E2] = 0xE6F9 ^ 0xE6E2;
                    n3 = 2002414790;
                    continue block82;
                }
                case 2002414790: {
                    aap.ooO00oO0OoO0[0x10C82 ^ 0x10DF8] = 0x10DF7 ^ 0x10DF8;
                    aap.ooO00oO0OoO0[0x3F84 ^ 0x3FC3] = 0xFFFFC012 ^ 0x3FC3;
                    aap.ooO00oO0OoO0[0x1E72 ^ 0x1F16] = 0x1F0D ^ 0x1F16;
                    aap.ooO00oO0OoO0[0xE124 ^ 0xE0AD] = 0xFFFF1F52 ^ 0xE0AD;
                    aap.ooO00oO0OoO0[0x73D6 ^ 0x7378] = 0xFFFF8C87 ^ 0x7378;
                    n3 = -2002906037;
                    continue block82;
                }
                case -2002906037: {
                    aap.ooO00oO0OoO0[0xD79A ^ 0xD7ED] = 0xD7EE ^ 0xD7ED;
                    n3 = -678820440;
                    continue block82;
                }
                case -678820440: {
                    aap.ooO00oO0OoO0[0x6487 ^ 0x6487] = 0xFFFF99F8 ^ 0x6487;
                    aap.ooO00oO0OoO0[0x7E1E ^ 0x7F45] = 0x7F48 ^ 0x7F45;
                    aap.ooO00oO0OoO0[0xE159 ^ 0xE017] = 0xE01C ^ 0xE017;
                    aap.ooO00oO0OoO0[0xBB77 ^ 0xBA5E] = 0xBA5F ^ 0xBA5E;
                    aap.ooO00oO0OoO0[0xE69E ^ 0xE675] = 0xE63D ^ 0xE675;
                    aap.ooO00oO0OoO0[0xE692 ^ 0xE6BA] = 0x7B3EA6BA ^ 0xE6BA;
                    aap.ooO00oO0OoO0[0x57C6 ^ 0x572B] = 0x5764 ^ 0x572B;
                    aap.ooO00oO0OoO0[0x1044B ^ 0x10483] = 0x10494 ^ 0x10483;
                    aap.ooO00oO0OoO0[0xC3CA ^ 0xC29A] = 0xC29D ^ 0xC29A;
                    aap.ooO00oO0OoO0[0xB27D ^ 0xB224] = 0xB23B ^ 0xB224;
                    aap.ooO00oO0OoO0[0x1239 ^ 0x1259] = 0x1252 ^ 0x1259;
                    aap.ooO00oO0OoO0[0x8D86 ^ 0x8C81] = 0x8C88 ^ 0x8C81;
                    aap.ooO00oO0OoO0[0xA6F1 ^ 0xA7D9] = 0x16426F80 ^ 0xA7D9;
                    aap.ooO00oO0OoO0[0x285D ^ 0x28D1] = 0xFFFFD72E ^ 0x28D1;
                    aap.ooO00oO0OoO0[0x21C9 ^ 0x204A] = 0x2011 ^ 0x204A;
                    aap.ooO00oO0OoO0[0xB4B7 ^ 0xB4AC] = 0xFFFF4B03 ^ 0xB4AC;
                    aap.ooO00oO0OoO0[0x617E ^ 0x6134] = 0x7651DE97 ^ 0x6134;
                    aap.ooO00oO0OoO0[0xF702 ^ 0xF744] = 0xAE4CB744 ^ 0xF744;
                    aap.ooO00oO0OoO0[0xA9AB ^ 0xA94B] = 0xA970 ^ 0xA94B;
                    aap.ooO00oO0OoO0[0x5775 ^ 0x5641] = 0x5658 ^ 0x5641;
                    aap.ooO00oO0OoO0[0xD171 ^ 0xD147] = 0xD14E ^ 0xD147;
                    n3 = 115027012;
                    continue block82;
                }
                case 115027012: {
                    aap.ooO00oO0OoO0[0x4DC0 ^ 0x4D7D] = 0x4D3C ^ 0x4D7D;
                    n3 = -125534512;
                    continue block82;
                }
                case -125534512: {
                    aap.ooO00oO0OoO0[0x850B ^ 0x8551] = 0xD0B0551 ^ 0x8551;
                    n3 = 213037770;
                    continue block82;
                }
                case 213037770: {
                    aap.ooO00oO0OoO0[0x4411 ^ 0x443A] = 0xE9BD739D ^ 0x443A;
                    aap.ooO00oO0OoO0[0x87DE ^ 0x87FF] = 0x87F6 ^ 0x87FF;
                    aap.ooO00oO0OoO0[0x888C ^ 0x88EE] = 0x88A5 ^ 0x88EE;
                    aap.ooO00oO0OoO0[0x4A4 ^ 0x47A] = 0x5555514D ^ 0x47A;
                    aap.ooO00oO0OoO0[0x61AC ^ 0x60AF] = 0x60EA ^ 0x60AF;
                    n3 = -801664286;
                    continue block82;
                }
                case -801664286: {
                    aap.ooO00oO0OoO0[0xB8A4 ^ 0xB877] = 0xB844 ^ 0xB877;
                    aap.ooO00oO0OoO0[0xF7A8 ^ 0xF6E3] = 0xFFFFFD0F ^ 0xF6E3;
                    aap.ooO00oO0OoO0[0x9DAA ^ 0x9D2F] = 0x9D2C ^ 0x9D2F;
                    aap.ooO00oO0OoO0[0xAEB1 ^ 0xAE94] = 0xAE9F ^ 0xAE94;
                    aap.ooO00oO0OoO0[0xE29 ^ 0xE4D] = 0xE50 ^ 0xE4D;
                    aap.ooO00oO0OoO0[0xB0C ^ 0xB58] = 0xC59D3B8B ^ 0xB58;
                    aap.ooO00oO0OoO0[0x1053A ^ 0x1050B] = 0xFFFEFAF4 ^ 0x1050B;
                    aap.ooO00oO0OoO0[0x7546 ^ 0x7476] = 0x7469 ^ 0x7476;
                    aap.ooO00oO0OoO0[0xCCAE ^ 0xCCAA] = 0xCCF1 ^ 0xCCAA;
                    n3 = -2084983210;
                    continue block82;
                }
                case -2084983210: {
                    aap.ooO00oO0OoO0[0x1F3D ^ 0x1F8B] = 0x37A98636 ^ 0x1F8B;
                    aap.ooO00oO0OoO0[0xD3AE ^ 0xD2E7] = 0xD2E2 ^ 0xD2E7;
                    aap.ooO00oO0OoO0[0x9626 ^ 0x9775] = 0x976E ^ 0x9775;
                    n3 = -1063475897;
                    continue block82;
                }
                case -1063475897: {
                    aap.ooO00oO0OoO0[0xAB85 ^ 0xAB42] = 0xFFFF54AD ^ 0xAB42;
                    aap.ooO00oO0OoO0[0xAB7C ^ 0xAB3C] = 0xFFFF54A7 ^ 0xAB3C;
                    aap.ooO00oO0OoO0[0xE30C ^ 0xE26A] = 0xE27D ^ 0xE26A;
                    aap.ooO00oO0OoO0[0xC9F9 ^ 0xC9A7] = 0xC988 ^ 0xC9A7;
                    n3 = -1812590956;
                    continue block82;
                }
                case -1812590956: {
                    aap.ooO00oO0OoO0[0x10918 ^ 0x109B3] = 0xFFFEF64C ^ 0x109B3;
                    aap.ooO00oO0OoO0[0x6AE4 ^ 0x6A0D] = 0x6A00 ^ 0x6A0D;
                    aap.ooO00oO0OoO0[0x6C6E ^ 0x6C08] = 0x6C62 ^ 0x6C08;
                    aap.ooO00oO0OoO0[0xAC7F ^ 0xAC32] = 0xAC3B ^ 0xAC32;
                    aap.ooO00oO0OoO0[0xF217 ^ 0xF357] = 0xFFFF0CC8 ^ 0xF357;
                    aap.ooO00oO0OoO0[0x6FEB ^ 0x6EFD] = 0x6EFE ^ 0x6EFD;
                    aap.ooO00oO0OoO0[0x7680 ^ 0x76E9] = 0xFFFF895A ^ 0x76E9;
                    aap.ooO00oO0OoO0[0x7740 ^ 0x77C3] = 0x30374C0 ^ 0x77C3;
                    aap.ooO00oO0OoO0[0x9086 ^ 0x9098] = 0xFFFF2F67 ^ 0x9098;
                    n3 = -1723050234;
                    continue block82;
                }
                case -1723050234: {
                    aap.ooO00oO0OoO0[0xEEBF ^ 0xEE72] = 0xC811BF47 ^ 0xEE72;
                    n3 = 1228329569;
                    continue block82;
                }
                case 1228329569: {
                    aap.ooO00oO0OoO0[0xC2AE ^ 0xC2C0] = 0xC2CB ^ 0xC2C0;
                    aap.ooO00oO0OoO0[0xD62B ^ 0xD779] = 0xD77C ^ 0xD779;
                    aap.ooO00oO0OoO0[0x8596 ^ 0x856D] = 0x8560 ^ 0x856D;
                    aap.ooO00oO0OoO0[0x43FC ^ 0x42C9] = 0x42CE ^ 0x42C9;
                    aap.ooO00oO0OoO0[0x564A ^ 0x5755] = 0x5764 ^ 0x5755;
                    aap.ooO00oO0OoO0[0x95B1 ^ 0x95A5] = 0xFCFC6958 ^ 0x95A5;
                    n3 = 1958825392;
                    continue block82;
                }
                case 1958825392: {
                    aap.ooO00oO0OoO0[0x790E ^ 0x79AA] = 0x79C5 ^ 0x79AA;
                    aap.ooO00oO0OoO0[0x2CBB ^ 0x2D87] = 0x2D8E ^ 0x2D87;
                    aap.ooO00oO0OoO0[0x9659 ^ 0x9689] = 0x9686 ^ 0x9689;
                    aap.ooO00oO0OoO0[0x2576 ^ 0x2468] = 0xFFFFDB97 ^ 0x2468;
                    aap.ooO00oO0OoO0[0xA10D ^ 0xA12F] = 0xD912 ^ 0xA12F;
                    n3 = -1553900639;
                    continue block82;
                }
                case -1553900639: {
                    aap.ooO00oO0OoO0[0x413A ^ 0x4133] = 0x412E ^ 0x4133;
                    aap.ooO00oO0OoO0[0xB51A ^ 0xB527] = 0xFFFF4BA3 ^ 0xB527;
                    n3 = -298278050;
                    continue block82;
                }
                case -298278050: {
                    aap.ooO00oO0OoO0[0xA42 ^ 0xB62] = 0xAAAAA1C9 ^ 0xB62;
                    aap.ooO00oO0OoO0[0xD2FE ^ 0xD3C1] = 0xD3DC ^ 0xD3C1;
                    aap.ooO00oO0OoO0[0x80FA ^ 0x800F] = 0x1CD8D686 ^ 0x800F;
                    aap.ooO00oO0OoO0[0x10D3 ^ 0x10CF] = 0x10D6 ^ 0x10CF;
                    aap.ooO00oO0OoO0[0xC101 ^ 0xC009] = 0xC01E ^ 0xC009;
                    aap.ooO00oO0OoO0[0x4148 ^ 0x4182] = 0x8FC7A593 ^ 0x4182;
                    aap.ooO00oO0OoO0[0x60E1 ^ 0x602A] = 0xFFFF9FCB ^ 0x602A;
                    aap.ooO00oO0OoO0[0xC754 ^ 0xC7E0] = 0xC7FB ^ 0xC7E0;
                    aap.ooO00oO0OoO0[0x4EF2 ^ 0x4E7F] = 0x4E2C ^ 0x4E7F;
                    aap.ooO00oO0OoO0[0x156C ^ 0x15A9] = 0x15B0 ^ 0x15A9;
                    aap.ooO00oO0OoO0[0x307B ^ 0x316B] = 0x317E ^ 0x316B;
                    aap.ooO00oO0OoO0[0xDCF3 ^ 0xDCC3] = 0xDCA8 ^ 0xDCC3;
                    n3 = 1425391393;
                    continue block82;
                }
                case 1425391393: {
                    aap.ooO00oO0OoO0[0x9329 ^ 0x93BF] = 0x93FE ^ 0x93BF;
                    aap.ooO00oO0OoO0[0x1BBF ^ 0x1AC7] = 0xFFFFE558 ^ 0x1AC7;
                    aap.ooO00oO0OoO0[0xC992 ^ 0xC956] = 0xFFFF354F ^ 0xC956;
                    aap.ooO00oO0OoO0[0x9272 ^ 0x934B] = 0xFFFF6E4C ^ 0x934B;
                    aap.ooO00oO0OoO0[0xEB9E ^ 0xEBC5] = 0xEBC8 ^ 0xEBC5;
                    aap.ooO00oO0OoO0[0x89E3 ^ 0x88BF] = 0x88AC ^ 0x88BF;
                    aap.ooO00oO0OoO0[0xE109 ^ 0xE110] = 0xFFFF0EF2 ^ 0xE110;
                    aap.ooO00oO0OoO0[0xC6A8 ^ 0xC7E7] = 0xC7FE ^ 0xC7E7;
                    aap.ooO00oO0OoO0[0x1E7 ^ 0x1CA] = 0xFFFFFE41 ^ 0x1CA;
                    aap.ooO00oO0OoO0[0x4F2A ^ 0x4FAC] = 0xDA6C46C9 ^ 0x4FAC;
                    aap.ooO00oO0OoO0[0x97C1 ^ 0x9791] = 0x97CA ^ 0x9791;
                    aap.ooO00oO0OoO0[0x3E19 ^ 0x3F0C] = 0xE5D14B50 ^ 0x3F0C;
                    aap.ooO00oO0OoO0[0x4793 ^ 0x47C5] = 0x47FC ^ 0x47C5;
                    aap.ooO00oO0OoO0[0x527B ^ 0x52B7] = 0x52FE ^ 0x52B7;
                    aap.ooO00oO0OoO0[0x5D9A ^ 0x5D12] = 0xFFFFA2E0 ^ 0x5D12;
                    aap.ooO00oO0OoO0[0xC681 ^ 0xC70A] = 0xC70B ^ 0xC70A;
                    n3 = 954756762;
                    continue block82;
                }
                case 954756762: {
                    aap.ooO00oO0OoO0[0x5257 ^ 0x5286] = 0x5297 ^ 0x5286;
                    aap.ooO00oO0OoO0[0x8EF ^ 0x99B] = 0x9AE ^ 0x99B;
                    aap.ooO00oO0OoO0[0x6749 ^ 0x6715] = 0x6706 ^ 0x6715;
                    n3 = 488523974;
                    continue block82;
                }
                case 488523974: {
                    aap.ooO00oO0OoO0[0x3469 ^ 0x3543] = 0x355C ^ 0x3543;
                    aap.ooO00oO0OoO0[0x5F1 ^ 0x550] = 0xFFFFFAAF ^ 0x550;
                    n3 = 2095477175;
                    continue block82;
                }
                case 2095477175: {
                    aap.ooO00oO0OoO0[0x29A ^ 0x2F5] = 0x2E0 ^ 0x2F5;
                    aap.ooO00oO0OoO0[0x1031A ^ 0x1029B] = 0xFFFEFD64 ^ 0x1029B;
                    aap.ooO00oO0OoO0[0x8BC5 ^ 0x8AFE] = 0x8AFD ^ 0x8AFE;
                    aap.ooO00oO0OoO0[0xD897 ^ 0xD832] = 0xFFFF27CD ^ 0xD832;
                    aap.ooO00oO0OoO0[0xBADE ^ 0xBA27] = 0xFFFF45EE ^ 0xBA27;
                    aap.ooO00oO0OoO0[0x2EDE ^ 0x2E3F] = 0x4FFFD1C0 ^ 0x2E3F;
                    aap.ooO00oO0OoO0[0xD598 ^ 0xD4C2] = 0xD4D3 ^ 0xD4C2;
                    aap.ooO00oO0OoO0[0xD3C3 ^ 0xD2D9] = 0xFFFF2D7D ^ 0xD2D9;
                    n3 = -735858539;
                    continue block82;
                }
                case -735858539: {
                    aap.ooO00oO0OoO0[0x5FF1 ^ 0x5E8F] = 0xFFFFA12B ^ 0x5E8F;
                    aap.ooO00oO0OoO0[0xB049 ^ 0xB0DD] = 0xB0D2 ^ 0xB0DD;
                    aap.ooO00oO0OoO0[0x2DBA ^ 0x2DEB] = 0x2DCF ^ 0x2DEB;
                    aap.ooO00oO0OoO0[0x5720 ^ 0x57EF] = 0x57EC ^ 0x57EF;
                    aap.ooO00oO0OoO0[0xC83B ^ 0xC84F] = 0xFFFF3650 ^ 0xC84F;
                    aap.ooO00oO0OoO0[0x24FA ^ 0x24F9] = 0xFFFFDB58 ^ 0x24F9;
                    aap.ooO00oO0OoO0[0xFF21 ^ 0xFE54] = 0xFFFF019D ^ 0xFE54;
                    aap.ooO00oO0OoO0[0x5486 ^ 0x545C] = 0x3ABC1 ^ 0x545C;
                    aap.ooO00oO0OoO0[0x9FD1 ^ 0x9F17] = 0x9F54 ^ 0x9F17;
                    aap.ooO00oO0OoO0[0xC76E ^ 0xC7C4] = 0xC7D5 ^ 0xC7C4;
                    aap.ooO00oO0OoO0[0x10B76 ^ 0x10B7C] = 0x10B24 ^ 0x10B7C;
                    n3 = 2098050473;
                    continue block82;
                }
                case 2098050473: {
                    aap.ooO00oO0OoO0[0xFB6D ^ 0xFA27] = 0xFFFF05D6 ^ 0xFA27;
                    aap.ooO00oO0OoO0[0xB780 ^ 0xB6C6] = 0xB6C9 ^ 0xB6C6;
                    aap.ooO00oO0OoO0[0xAE0E ^ 0xAE95] = 0x8374C15C ^ 0xAE95;
                    aap.ooO00oO0OoO0[0x679D ^ 0x6788] = 0x6787 ^ 0x6788;
                    aap.ooO00oO0OoO0[0x5E28 ^ 0x5E81] = 0x5E8E ^ 0x5E81;
                    aap.ooO00oO0OoO0[0x3353 ^ 0x3239] = 0x3230 ^ 0x3239;
                    aap.ooO00oO0OoO0[0x35D8 ^ 0x34A7] = 0xFFFFCB58 ^ 0x34A7;
                    n3 = 2072256688;
                    continue block82;
                }
                case 2072256688: {
                    aap.ooO00oO0OoO0[0xC0C9 ^ 0xC031] = 0x55559564 ^ 0xC031;
                    aap.ooO00oO0OoO0[0xB2B ^ 0xBBB] = 0xBAE ^ 0xBBB;
                    aap.ooO00oO0OoO0[0xDD6C ^ 0xDD12] = 0xDD45 ^ 0xDD12;
                    aap.ooO00oO0OoO0[0x128B ^ 0x12D4] = 0x12C1 ^ 0x12D4;
                    aap.ooO00oO0OoO0[0xC1BA ^ 0xC0AE] = 0xC0FB ^ 0xC0AE;
                    aap.ooO00oO0OoO0[0x48E5 ^ 0x49DD] = 0x49F2 ^ 0x49DD;
                    aap.ooO00oO0OoO0[0x46F4 ^ 0x46BF] = 0x46DC ^ 0x46BF;
                    n3 = 1820174302;
                    continue block82;
                }
                case 1820174302: {
                    aap.ooO00oO0OoO0[0x6033 ^ 0x6046] = 0x6043 ^ 0x6046;
                    n3 = -1866675753;
                    continue block82;
                }
                case -1866675753: {
                    aap.ooO00oO0OoO0[0x22F ^ 0x329] = 0xCFAA7204 ^ 0x329;
                    aap.ooO00oO0OoO0[0x837A ^ 0x8277] = 0x8208 ^ 0x8277;
                    aap.ooO00oO0OoO0[0xD7EE ^ 0xD683] = 0xD6BA ^ 0xD683;
                    n3 = -1019141943;
                    continue block82;
                }
                case -1019141943: {
                    aap.ooO00oO0OoO0[0xE586 ^ 0xE5DB] = 0xFFFF1A08 ^ 0xE5DB;
                    aap.ooO00oO0OoO0[0x6764 ^ 0x67F1] = 0xFFFF022A ^ 0x67F1;
                    aap.ooO00oO0OoO0[0x5147 ^ 0x5170] = 0x516D ^ 0x5170;
                    aap.ooO00oO0OoO0[0x47C6 ^ 0x475E] = 0x475F ^ 0x475E;
                    aap.ooO00oO0OoO0[0xC96E ^ 0xC9A7] = 0xC9AE ^ 0xC9A7;
                    aap.ooO00oO0OoO0[0x5F3 ^ 0x5BC] = 0xA05A001C ^ 0x5BC;
                    aap.ooO00oO0OoO0[0x7186 ^ 0x70C2] = 0x5F0B ^ 0x70C2;
                    aap.ooO00oO0OoO0[0x4F8F ^ 0x4F7C] = 0x41045F3D ^ 0x4F7C;
                    aap.ooO00oO0OoO0[0x32AE ^ 0x33F8] = 0x33F7 ^ 0x33F8;
                    n3 = -1214977159;
                    continue block82;
                }
                case -1214977159: {
                    aap.ooO00oO0OoO0[0xC57C ^ 0xC446] = 0xC45B ^ 0xC446;
                    aap.ooO00oO0OoO0[0x2AEE ^ 0x2BFD] = 0x2BE0 ^ 0x2BFD;
                    aap.ooO00oO0OoO0[0x6939 ^ 0x6907] = 0xD4E23298 ^ 0x6907;
                    n3 = -946381698;
                    continue block82;
                }
                case -946381698: {
                    aap.ooO00oO0OoO0[0x78F4 ^ 0x78D0] = 0x78EF ^ 0x78D0;
                    aap.ooO00oO0OoO0[0x46A3 ^ 0x47BE] = 0xFFF6078E ^ 0x47BE;
                    aap.ooO00oO0OoO0[0xF1F6 ^ 0xF09F] = 0xF08C ^ 0xF09F;
                    n3 = 184192669;
                    continue block82;
                }
                case 184192669: {
                    aap.ooO00oO0OoO0[0x8716 ^ 0x8789] = 0x87CE ^ 0x8789;
                    n3 = 1174624527;
                    continue block82;
                }
                case 1174624527: {
                    aap.ooO00oO0OoO0[0xAA2E ^ 0xABAB] = 0xAB9A ^ 0xABAB;
                    n3 = 612535036;
                    continue block82;
                }
                case 612535036: {
                    aap.ooO00oO0OoO0[0x2BE0 ^ 0x2BB7] = 0x10206B36 ^ 0x2BB7;
                    aap.ooO00oO0OoO0[0x5B08 ^ 0x5BB9] = 0x5BAE ^ 0x5BB9;
                    aap.ooO00oO0OoO0[0x848A ^ 0x8460] = 0xFFFF7B9F ^ 0x8460;
                    aap.ooO00oO0OoO0[0x2C71 ^ 0x2C8C] = 0x3B139DB7 ^ 0x2C8C;
                    n3 = -893382539;
                    continue block82;
                }
                case -893382539: {
                    aap.ooO00oO0OoO0[0x5520 ^ 0x554B] = 0xFFFFAAB8 ^ 0x554B;
                    aap.ooO00oO0OoO0[0x2457 ^ 0x245C] = 0x2461 ^ 0x245C;
                    aap.ooO00oO0OoO0[0xCD5E ^ 0xCC5E] = 0xFFFF33A7 ^ 0xCC5E;
                    aap.ooO00oO0OoO0[0x5FF4 ^ 0x5F8E] = 0xFFFFA065 ^ 0x5F8E;
                    aap.ooO00oO0OoO0[0x879E ^ 0x8736] = 0x23E8736 ^ 0x8736;
                    aap.ooO00oO0OoO0[0x528B ^ 0x53E4] = 0x53ED ^ 0x53E4;
                    aap.ooO00oO0OoO0[0x46A8 ^ 0x4668] = 0xFFFFB9EB ^ 0x4668;
                    aap.ooO00oO0OoO0[0x5F9A ^ 0x5FAF] = 0x5FB8 ^ 0x5FAF;
                    aap.ooO00oO0OoO0[0xEEB4 ^ 0xEFD6] = 0xFFFF1029 ^ 0xEFD6;
                    aap.ooO00oO0OoO0[0x8269 ^ 0x8328] = 0x801B ^ 0x8328;
                    aap.ooO00oO0OoO0[0xB714 ^ 0xB79A] = 0x9DCE50E9 ^ 0xB79A;
                    n3 = 1102089171;
                    continue block82;
                }
                case 1102089171: {
                    aap.ooO00oO0OoO0[0x5333 ^ 0x536B] = 0xFFFFAC94 ^ 0x536B;
                    aap.ooO00oO0OoO0[0xEC9E ^ 0xECE1] = 0xFFFC219F ^ 0xECE1;
                    aap.ooO00oO0OoO0[0x10E12 ^ 0x10F21] = 0x10F50 ^ 0x10F21;
                    aap.ooO00oO0OoO0[0x458E ^ 0x44C3] = 0xFFFFBB44 ^ 0x44C3;
                    aap.ooO00oO0OoO0[0x9627 ^ 0x971A] = 0x970D ^ 0x971A;
                    n3 = 184280306;
                    continue block82;
                }
                case 184280306: 
            }
            aap.ooO00oO0OoO0[0xEBBD ^ 0xEB6B] = 0xEB6C ^ 0xEB6B;
            aap.ooO00oO0OoO0[0x3807 ^ 0x3942] = 0xFFFFC68B ^ 0x3942;
            aap.ooO00oO0OoO0[0xECF4 ^ 0xEDD9] = 0xEDCA ^ 0xEDD9;
            aap.ooO00oO0OoO0[0xB425 ^ 0xB402] = 0xFFFF4BFD ^ 0xB402;
            aap.ooO00oO0OoO0[0x10F74 ^ 0x10E55] = 0x10E58 ^ 0x10E55;
            aap.ooO00oO0OoO0[0x7AC8 ^ 0x7AF2] = 0xFFFF8579 ^ 0x7AF2;
            aap.ooO00oO0OoO0[0x7BB7 ^ 0x7B38] = 0xFFFF848F ^ 0x7B38;
            aap.ooO00oO0OoO0[0xC4BF ^ 0xC5E0] = 0xC59F ^ 0xC5E0;
            aap.ooO00oO0OoO0[0xCF8E ^ 0xCEE5] = 0xCEF2 ^ 0xCEE5;
            aap.ooO00oO0OoO0[0x6940 ^ 0x6863] = 0xFFFF9095 ^ 0x6863;
            aap.ooO00oO0OoO0[0xE1F8 ^ 0xE12C] = 0x4FB2C ^ 0xE12C;
            aap.ooO00oO0OoO0[0x94DD ^ 0x95EC] = 0xFFFF6A1D ^ 0x95EC;
            aap.ooO00oO0OoO0[0xB0B ^ 0xA24] = 0xA25 ^ 0xA24;
            aap.ooO00oO0OoO0[0x10C38 ^ 0x10C14] = 0x3F4EDFE1 ^ 0x10C14;
            aap.ooO00oO0OoO0[0xEEEC ^ 0xEE3B] = 0x3D704DEC ^ 0xEE3B;
            n3 = -1528629578;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public aap() {
        int n2 = 756157151;
        if (n2 != n2) {
            int cfr_ignored_0 = 0x16 & 1;
        }
        this.aDf = gb.ks.a((ooO00oO0OoO0[10] ^ ooO00oO0OoO0[11]) - ooO00oO0OoO0[12], gd.kE);
        this.animation = new afj(afk.aHh, 600L);
        this.aDg = new afj(afk.aHc, 3000L);
        this.bN = new a();
        this.aDm = null;
        this.aDp = var1_1 -> {
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
        Client.a.e().b(this);
    }

    public static /* bridge */ strictfp /* synthetic */ void lambda$new$4() {
        aER.a(new am());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    public static /* bridge */ strictfp /* synthetic */ void b(cz cz2) {
        int n2 = 2046267183;
        if (n2 != n2) {
            o0O000O0O0O0 = n2 = -833193538;
        }
        ait.d(0.0, 0.0, cz2.getScaledWidth(), cz2.getScaledHeight(), Color.BLACK);
    }
}

