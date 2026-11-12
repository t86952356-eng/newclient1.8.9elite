/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.zg;
import hackclient.rise.zh;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystemException;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class zi
extends zg
implements zh {
    public static /* synthetic */ String o0Oo000O0oO;
    private static /* synthetic */ int[] ooo00oo0Ooo0;
    public static /* synthetic */ Object[] Oo0o00000O00;
    public static /* synthetic */ String[] q0oOOoOo0O00O;
    public static /* synthetic */ String[] O0OoOO0OOOOO;
    public volatile /* synthetic */ boolean awj;
    public static /* synthetic */ Object[] q0OOOoo00o0;
    public static /* synthetic */ Object oO00O0OO0ooO;
    private static /* synthetic */ int o0o000o0O0o0;
    private static /* synthetic */ boolean oOo00Oo0OOo0;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void q0OOOoo00o0() {
        int n2 = 1064376914;
        if (n2 != n2) {
            throw null;
        }
        ooo00oo0Ooo0 = new int[0x85CD ^ 0x845D];
        zi.ooo00oo0Ooo0[0x1BD0 ^ 0x1BB6] = 0x79001BB6 ^ 0x1BB6;
        zi.ooo00oo0Ooo0[0xD66E ^ 0xD6F4] = 0xD6CB ^ 0xD6F4;
        zi.ooo00oo0Ooo0[0x8626 ^ 0x86D8] = 0x45A7 ^ 0x86D8;
        zi.ooo00oo0Ooo0[0x97EA ^ 0x96AE] = 0xC363 ^ 0x96AE;
        zi.ooo00oo0Ooo0[0x95BA ^ 0x953F] = 0xFFFF6AC6 ^ 0x953F;
        zi.ooo00oo0Ooo0[0xFA9A ^ 0xFA50] = 0xFFFF1E66 ^ 0xFA50;
        zi.ooo00oo0Ooo0[0x6E95 ^ 0x6FE3] = 0x5DF1 ^ 0x6FE3;
        zi.ooo00oo0Ooo0[0x2DB3 ^ 0x2D1D] = 0x2D00 ^ 0x2D1D;
        zi.ooo00oo0Ooo0[0x2B58 ^ 0x2B1B] = 0x2B16 ^ 0x2B1B;
        zi.ooo00oo0Ooo0[0xEA73 ^ 0xEB71] = 0x96FF ^ 0xEB71;
        int n3 = -1762413129;
        block92: while (true) {
            switch (n3) {
                case -436684652: {
                    zi.ooo00oo0Ooo0[0xAD22 ^ 0xAC4D] = 0x7CF8 ^ 0xAC4D;
                    n3 = -756388903;
                    continue block92;
                }
                case -756388903: {
                    zi.ooo00oo0Ooo0[0x3F10 ^ 0x3F90] = 0x3F9D ^ 0x3F90;
                    zi.ooo00oo0Ooo0[0x80B0 ^ 0x80FD] = 0xFFFF7F4C ^ 0x80FD;
                    n3 = 1407720576;
                    continue block92;
                }
                case 1407720576: {
                    zi.ooo00oo0Ooo0[0xC46F ^ 0xC50F] = 0x1CBED ^ 0xC50F;
                    zi.ooo00oo0Ooo0[0x653 ^ 0x654] = 0xC0D4C12F ^ 0x654;
                    zi.ooo00oo0Ooo0[0xC647 ^ 0xC612] = 0xC61D ^ 0xC612;
                    zi.ooo00oo0Ooo0[0x10325 ^ 0x10273] = 0xF98 ^ 0x10273;
                    zi.ooo00oo0Ooo0[0x7812 ^ 0x78E8] = 0xFFFFF4B8 ^ 0x78E8;
                    zi.ooo00oo0Ooo0[0xC7C4 ^ 0xC7A1] = 0xC798 ^ 0xC7A1;
                    zi.ooo00oo0Ooo0[0xDC16 ^ 0xDCC1] = 0x33F7 ^ 0xDCC1;
                    zi.ooo00oo0Ooo0[0x4374 ^ 0x433A] = 0xFFFFBCC1 ^ 0x433A;
                    zi.ooo00oo0Ooo0[0x2B06 ^ 0x2B32] = 0xFFFFD4CD ^ 0x2B32;
                    zi.ooo00oo0Ooo0[0x74B1 ^ 0x74E0] = 0x74DB ^ 0x74E0;
                    zi.ooo00oo0Ooo0[0x6853 ^ 0x6832] = 0xFFF9F7CD ^ 0x6832;
                    zi.ooo00oo0Ooo0[0x6BC1 ^ 0x6BED] = 0x481CB3BF ^ 0x6BED;
                    n3 = -717499866;
                    continue block92;
                }
                case -717499866: {
                    zi.ooo00oo0Ooo0[0xDB72 ^ 0xDB22] = 0xFFFF24DD ^ 0xDB22;
                    zi.ooo00oo0Ooo0[0x2A7A ^ 0x2B6E] = 0x235C ^ 0x2B6E;
                    n3 = 1371837941;
                    continue block92;
                }
                case 1371837941: {
                    zi.ooo00oo0Ooo0[0xD3B6 ^ 0xD28D] = 0xCEA5 ^ 0xD28D;
                    zi.ooo00oo0Ooo0[0xE46A ^ 0xE557] = 0xF949 ^ 0xE557;
                    zi.ooo00oo0Ooo0[0xA381 ^ 0xA349] = 0xB8AE ^ 0xA349;
                    zi.ooo00oo0Ooo0[0xBB79 ^ 0xBBAB] = 0xFFFFDDB6 ^ 0xBBAB;
                    n3 = 436492714;
                    continue block92;
                }
                case 436492714: {
                    zi.ooo00oo0Ooo0[0x9A32 ^ 0x9B04] = 0xA4F5 ^ 0x9B04;
                    zi.ooo00oo0Ooo0[0xBA8D ^ 0xBAA2] = 0xFFFF455D ^ 0xBAA2;
                    n3 = -134466804;
                    continue block92;
                }
                case -134466804: {
                    zi.ooo00oo0Ooo0[0x2B23 ^ 0x2B99] = 0xE837 ^ 0x2B99;
                    n3 = 25919642;
                    continue block92;
                }
                case 25919642: {
                    zi.ooo00oo0Ooo0[0x5ABA ^ 0x5B92] = 0x15323 ^ 0x5B92;
                    zi.ooo00oo0Ooo0[0xEA12 ^ 0xEB6E] = 0x6169 ^ 0xEB6E;
                    n3 = -1131212444;
                    continue block92;
                }
                case -1131212444: {
                    zi.ooo00oo0Ooo0[0xD0EA ^ 0xD09C] = 0xFDB100D ^ 0xD09C;
                    zi.ooo00oo0Ooo0[0x20D8 ^ 0x20DC] = 0xFFFFDF35 ^ 0x20DC;
                    n3 = -7322762;
                    continue block92;
                }
                case -7322762: {
                    zi.ooo00oo0Ooo0[0x90AF ^ 0x9053] = 0x9053 ^ 0x9053;
                    zi.ooo00oo0Ooo0[0x10211 ^ 0x1021D] = 0x1020E ^ 0x1021D;
                    zi.ooo00oo0Ooo0[0x9F ^ 0x192] = 0xDFA ^ 0x192;
                    zi.ooo00oo0Ooo0[0x511B ^ 0x5006] = 0xFFFFA754 ^ 0x5006;
                    zi.ooo00oo0Ooo0[0xFBC9 ^ 0xFBD7] = 0xFFFF0428 ^ 0xFBD7;
                    zi.ooo00oo0Ooo0[0x6953 ^ 0x6947] = 0x695E ^ 0x6947;
                    zi.ooo00oo0Ooo0[0xBD31 ^ 0xBD3C] = 0xBD31 ^ 0xBD3C;
                    n3 = 970383702;
                    continue block92;
                }
                case 970383702: {
                    zi.ooo00oo0Ooo0[0x49E9 ^ 0x48E3] = 0x8D05 ^ 0x48E3;
                    n3 = 1673739095;
                    continue block92;
                }
                case 1673739095: {
                    zi.ooo00oo0Ooo0[0xB93 ^ 0xA9D] = 0x6AE ^ 0xA9D;
                    zi.ooo00oo0Ooo0[0x5D57 ^ 0x5C58] = 0x1AE8 ^ 0x5C58;
                    zi.ooo00oo0Ooo0[0x7CC5 ^ 0x7CEE] = 0xD34367B9 ^ 0x7CEE;
                    zi.ooo00oo0Ooo0[0xE3CF ^ 0xE336] = 0x90B6 ^ 0xE336;
                    zi.ooo00oo0Ooo0[0x9FAB ^ 0x9FAA] = 0x9F91 ^ 0x9FAA;
                    zi.ooo00oo0Ooo0[0xB047 ^ 0xB056] = 0xFFFF4F81 ^ 0xB056;
                    n3 = -260255194;
                    continue block92;
                }
                case -260255194: {
                    zi.ooo00oo0Ooo0[0xF8F4 ^ 0xF890] = 0xF8BB ^ 0xF890;
                    zi.ooo00oo0Ooo0[0x2D02 ^ 0x2D6D] = 0xE9FA53E1 ^ 0x2D6D;
                    n3 = 489022772;
                    continue block92;
                }
                case 489022772: {
                    zi.ooo00oo0Ooo0[0x10309 ^ 0x10200] = 0xFFFE385B ^ 0x10200;
                    zi.ooo00oo0Ooo0[0x862 ^ 0x881] = 0x80DB ^ 0x881;
                    n3 = -1448387636;
                    continue block92;
                }
                case -1448387636: {
                    zi.ooo00oo0Ooo0[0x4BEC ^ 0x4B64] = 0x4B43 ^ 0x4B64;
                    n3 = 494368633;
                    continue block92;
                }
                case 494368633: {
                    zi.ooo00oo0Ooo0[0x9455 ^ 0x9566] = 0xAA96 ^ 0x9566;
                    n3 = -1326315643;
                    continue block92;
                }
                case -1326315643: {
                    zi.ooo00oo0Ooo0[0xB2D3 ^ 0xB3CF] = 0xBB75 ^ 0xB3CF;
                    n3 = 915278128;
                    continue block92;
                }
                case 915278128: {
                    zi.ooo00oo0Ooo0[0x83CC ^ 0x8386] = 0xFFFF7C27 ^ 0x8386;
                    zi.ooo00oo0Ooo0[0x488C ^ 0x4843] = 0xABA9 ^ 0x4843;
                    zi.ooo00oo0Ooo0[0x587 ^ 0x57C] = 0x76FC ^ 0x57C;
                    zi.ooo00oo0Ooo0[0x6259 ^ 0x62D0] = 0x2C2D0 ^ 0x62D0;
                    zi.ooo00oo0Ooo0[0x56A3 ^ 0x5613] = 0xBC2650 ^ 0x5613;
                    zi.ooo00oo0Ooo0[0xE77E ^ 0xE7B2] = 0x457 ^ 0xE7B2;
                    zi.ooo00oo0Ooo0[0xB052 ^ 0xB0F7] = 0xDF2D4292 ^ 0xB0F7;
                    n3 = 1842129910;
                    continue block92;
                }
                case 1842129910: {
                    zi.ooo00oo0Ooo0[0x1A17 ^ 0x1A44] = 0x1A43 ^ 0x1A44;
                    zi.ooo00oo0Ooo0[0x5CF1 ^ 0x5D9B] = 0x55F7 ^ 0x5D9B;
                    zi.ooo00oo0Ooo0[0xB4A1 ^ 0xB447] = 0xC49 ^ 0xB447;
                    zi.ooo00oo0Ooo0[0x2C4C ^ 0x2C1A] = 0x2C0B ^ 0x2C1A;
                    zi.ooo00oo0Ooo0[0x9A72 ^ 0x9B22] = 0x5D8D ^ 0x9B22;
                    n3 = 1063293468;
                    continue block92;
                }
                case 1063293468: {
                    zi.ooo00oo0Ooo0[0xCB4C ^ 0xCB54] = 0xFFFF349D ^ 0xCB54;
                    n3 = -896009894;
                    continue block92;
                }
                case -896009894: {
                    zi.ooo00oo0Ooo0[0x9008 ^ 0x9048] = 0x904B ^ 0x9048;
                    n3 = -712045450;
                    continue block92;
                }
                case -712045450: {
                    zi.ooo00oo0Ooo0[0xD4B2 ^ 0xD4AB] = 0x56BEBD62 ^ 0xD4AB;
                    zi.ooo00oo0Ooo0[0x3483 ^ 0x35B9] = 0x2D34 ^ 0x35B9;
                    zi.ooo00oo0Ooo0[0x7605 ^ 0x76BB] = 0x25D ^ 0x76BB;
                    n3 = -1085784031;
                    continue block92;
                }
                case -1085784031: {
                    zi.ooo00oo0Ooo0[0x886C ^ 0x88AB] = 0x1E43 ^ 0x88AB;
                    zi.ooo00oo0Ooo0[0x8B54 ^ 0x8B90] = 0x1D78 ^ 0x8B90;
                    zi.ooo00oo0Ooo0[0x5721 ^ 0x5713] = 0x5713 ^ 0x5713;
                    zi.ooo00oo0Ooo0[0x494A ^ 0x482B] = 0x146E2 ^ 0x482B;
                    zi.ooo00oo0Ooo0[0xCF4C ^ 0xCF32] = 0xFFFF30C3 ^ 0xCF32;
                    zi.ooo00oo0Ooo0[0xE0E3 ^ 0xE045] = 0xFFFF1FBA ^ 0xE045;
                    zi.ooo00oo0Ooo0[0x8E1B ^ 0x8E42] = 0x8E43 ^ 0x8E42;
                    zi.ooo00oo0Ooo0[0x2717 ^ 0x2638] = 0x1914 ^ 0x2638;
                    zi.ooo00oo0Ooo0[0xA4F2 ^ 0xA42A] = 0x580E ^ 0xA42A;
                    zi.ooo00oo0Ooo0[0x4950 ^ 0x4855] = 0xFFFF22C9 ^ 0x4855;
                    zi.ooo00oo0Ooo0[0xDBDA ^ 0xDAAB] = 0xFFFFF5CD ^ 0xDAAB;
                    zi.ooo00oo0Ooo0[0x3D6B ^ 0x3D9D] = 0x5C1B ^ 0x3D9D;
                    zi.ooo00oo0Ooo0[0x40C2 ^ 0x40E2] = 0xFFFFBF1B ^ 0x40E2;
                    zi.ooo00oo0Ooo0[0xA544 ^ 0xA59B] = 0xC8A4 ^ 0xA59B;
                    zi.ooo00oo0Ooo0[0xBCBE ^ 0xBDEA] = 0x1B001 ^ 0xBDEA;
                    zi.ooo00oo0Ooo0[0xB235 ^ 0xB2B9] = 0xB2B2 ^ 0xB2B9;
                    zi.ooo00oo0Ooo0[0xB142 ^ 0xB18B] = 0xAA66 ^ 0xB18B;
                    zi.ooo00oo0Ooo0[0x10E6 ^ 0x1096] = 0xFFFFEF45 ^ 0x1096;
                    zi.ooo00oo0Ooo0[0x9EE5 ^ 0x9E90] = 0x9E97 ^ 0x9E90;
                    zi.ooo00oo0Ooo0[0x4A ^ 0x48] = 0xFFFFFFB7 ^ 0x48;
                    n3 = -187807572;
                    continue block92;
                }
                case -187807572: {
                    zi.ooo00oo0Ooo0[0xC975 ^ 0xC915] = 0xC924 ^ 0xC915;
                    zi.ooo00oo0Ooo0[0x10037 ^ 0x10080] = 0xFFFEFF29 ^ 0x10080;
                    zi.ooo00oo0Ooo0[0x1FF5 ^ 0x1F4A] = 0x6BE8 ^ 0x1F4A;
                    zi.ooo00oo0Ooo0[0x671 ^ 0x677] = 0x600 ^ 0x677;
                    zi.ooo00oo0Ooo0[0x282B ^ 0x2874] = 0xC71C59B3 ^ 0x2874;
                    n3 = 1453124592;
                    continue block92;
                }
                case 1453124592: {
                    zi.ooo00oo0Ooo0[0x981 ^ 0x8DC] = 0xFFFEF733 ^ 0x8DC;
                    zi.ooo00oo0Ooo0[0x77AB ^ 0x76F8] = 0x17B07 ^ 0x76F8;
                    zi.ooo00oo0Ooo0[0x53B3 ^ 0x53FB] = 0x32F76580 ^ 0x53FB;
                    zi.ooo00oo0Ooo0[0x20E7 ^ 0x20BC] = 0xFFFFDF43 ^ 0x20BC;
                    zi.ooo00oo0Ooo0[0x2D72 ^ 0x2D9F] = 0x556C ^ 0x2D9F;
                    zi.ooo00oo0Ooo0[0x1FCA ^ 0x1EAF] = 0xFFFF8065 ^ 0x1EAF;
                    zi.ooo00oo0Ooo0[0xB5F3 ^ 0xB5E3] = 0xB5FE ^ 0xB5E3;
                    zi.ooo00oo0Ooo0[0x3D5C ^ 0x3D17] = 0xD91D1726 ^ 0x3D17;
                    zi.ooo00oo0Ooo0[0x194C ^ 0x19C1] = 0x5E19C3 ^ 0x19C1;
                    zi.ooo00oo0Ooo0[0xE6AE ^ 0xE6AE] = 0xD37A899D ^ 0xE6AE;
                    zi.ooo00oo0Ooo0[0x9A5 ^ 0x907] = 0xFFFFF68A ^ 0x907;
                    n3 = 1439765234;
                    continue block92;
                }
                case 1439765234: {
                    zi.ooo00oo0Ooo0[0xC038 ^ 0xC0AA] = 0xC0BF ^ 0xC0AA;
                    zi.ooo00oo0Ooo0[0x76A9 ^ 0x7608] = 0x7687 ^ 0x7608;
                    zi.ooo00oo0Ooo0[0x1F5 ^ 0x1A9] = 0xFFFFFE2E ^ 0x1A9;
                    zi.ooo00oo0Ooo0[0xB9A9 ^ 0xB9F4] = 0xFFFF4653 ^ 0xB9F4;
                    n3 = 1233809168;
                    continue block92;
                }
                case 1233809168: {
                    zi.ooo00oo0Ooo0[0xE127 ^ 0xE05D] = 0x58F8 ^ 0xE05D;
                    zi.ooo00oo0Ooo0[0xF8E1 ^ 0xF9AE] = 0x3F1C ^ 0xF9AE;
                    n3 = 1160460553;
                    continue block92;
                }
                case 1160460553: {
                    zi.ooo00oo0Ooo0[0x10759 ^ 0x10632] = 0x15F05 ^ 0x10632;
                    zi.ooo00oo0Ooo0[0x82FC ^ 0x8290] = 0xFFFF7D31 ^ 0x8290;
                    zi.ooo00oo0Ooo0[0x10D3F ^ 0x10C3C] = 0x19931 ^ 0x10C3C;
                    zi.ooo00oo0Ooo0[0xDC58 ^ 0xDD4F] = 0x4A6C ^ 0xDD4F;
                    zi.ooo00oo0Ooo0[0x2C32 ^ 0x2D65] = 0x7E25 ^ 0x2D65;
                    zi.ooo00oo0Ooo0[0x23D2 ^ 0x23A3] = 0xFFFFDC5C ^ 0x23A3;
                    zi.ooo00oo0Ooo0[0x4015 ^ 0x4077] = 0x4064 ^ 0x4077;
                    zi.ooo00oo0Ooo0[0x5545 ^ 0x557D] = 0xC5E1 ^ 0x557D;
                    zi.ooo00oo0Ooo0[0xEEC0 ^ 0xEE4F] = 0xEE5E ^ 0xEE4F;
                    zi.ooo00oo0Ooo0[0x9FDE ^ 0x9E94] = 0xAD55 ^ 0x9E94;
                    zi.ooo00oo0Ooo0[0xADF2 ^ 0xACCB] = 0xFFFF4BF2 ^ 0xACCB;
                    return;
                }
                default: {
                    zi.ooo00oo0Ooo0[0x1CB8 ^ 0x1DA2] = 0x8A8C ^ 0x1DA2;
                    zi.ooo00oo0Ooo0[0x1028E ^ 0x10306] = 0x1F6CB ^ 0x10306;
                    zi.ooo00oo0Ooo0[0x9173 ^ 0x90F4] = 0xFFFF6F0B ^ 0x90F4;
                    zi.ooo00oo0Ooo0[0x2B38 ^ 0x2BC7] = 0x565B ^ 0x2BC7;
                    n3 = -2041521514;
                    continue block92;
                }
                case -2041521514: {
                    zi.ooo00oo0Ooo0[0x4DC4 ^ 0x4C4F] = 0x4C49 ^ 0x4C4F;
                    zi.ooo00oo0Ooo0[0xC281 ^ 0xC2B2] = 0xC2B2 ^ 0xC2B2;
                    zi.ooo00oo0Ooo0[0xBDCD ^ 0xBDCE] = 0xBDED ^ 0xBDCE;
                    zi.ooo00oo0Ooo0[0x8DAD ^ 0x8D07] = 0xBFFF72F0 ^ 0x8D07;
                    n3 = -555091200;
                    continue block92;
                }
                case -555091200: {
                    zi.ooo00oo0Ooo0[0x20C3 ^ 0x2027] = 0x9810 ^ 0x2027;
                    zi.ooo00oo0Ooo0[0x2D6C ^ 0x2DAC] = 0x12806 ^ 0x2DAC;
                    zi.ooo00oo0Ooo0[0x3AC ^ 0x3C7] = 0x72D7507A ^ 0x3C7;
                    n3 = -951520080;
                    continue block92;
                }
                case -951520080: {
                    zi.ooo00oo0Ooo0[0xE068 ^ 0xE104] = 0xB830 ^ 0xE104;
                    n3 = 1398190096;
                    continue block92;
                }
                case 1398190096: {
                    zi.ooo00oo0Ooo0[0x1079B ^ 0x106B2] = 0xFFFFF1BD ^ 0x106B2;
                    n3 = 730429642;
                    continue block92;
                }
                case 730429642: {
                    zi.ooo00oo0Ooo0[0x59D8 ^ 0x59A4] = 0x24E6F8D5 ^ 0x59A4;
                    zi.ooo00oo0Ooo0[0x3916 ^ 0x390C] = 0x395F ^ 0x390C;
                    zi.ooo00oo0Ooo0[0xF635 ^ 0xF60E] = 0xFD20 ^ 0xF60E;
                    zi.ooo00oo0Ooo0[0xAF21 ^ 0xAF1B] = 0xAF14 ^ 0xAF1B;
                    zi.ooo00oo0Ooo0[0x404B ^ 0x40BF] = 0x2179 ^ 0x40BF;
                    zi.ooo00oo0Ooo0[0xBBB ^ 0xB07] = 0x7FA2 ^ 0xB07;
                    n3 = 1740479456;
                    continue block92;
                }
                case 1740479456: {
                    zi.ooo00oo0Ooo0[0xE118 ^ 0xE12E] = 0xE120 ^ 0xE12E;
                    zi.ooo00oo0Ooo0[0x9CEB ^ 0x9CCF] = 0xFFFF635A ^ 0x9CCF;
                    zi.ooo00oo0Ooo0[0x4D01 ^ 0x4D3F] = 0x76B9 ^ 0x4D3F;
                    n3 = -540289506;
                    continue block92;
                }
                case -540289506: {
                    zi.ooo00oo0Ooo0[0x96C8 ^ 0x964C] = 0xFFFF69D5 ^ 0x964C;
                    n3 = 2031130030;
                    continue block92;
                }
                case 2031130030: {
                    zi.ooo00oo0Ooo0[0x61FC ^ 0x610C] = 0x2EFB ^ 0x610C;
                    zi.ooo00oo0Ooo0[0x7971 ^ 0x785F] = 0x8D5D ^ 0x785F;
                    n3 = 287844221;
                    continue block92;
                }
                case 287844221: {
                    zi.ooo00oo0Ooo0[0x37EC ^ 0x3744] = 0xFFFFC8D1 ^ 0x3744;
                    zi.ooo00oo0Ooo0[0xDE83 ^ 0xDFCF] = 0xD7E9 ^ 0xDFCF;
                    n3 = -1191134203;
                    continue block92;
                }
                case -1191134203: {
                    zi.ooo00oo0Ooo0[0x1CD3 ^ 0x1CBB] = 0x1CB6 ^ 0x1CBB;
                    zi.ooo00oo0Ooo0[0xF8B7 ^ 0xF9EC] = 0x1F994 ^ 0xF9EC;
                    zi.ooo00oo0Ooo0[0x9F7D ^ 0x9FA0] = 0xF29F ^ 0x9FA0;
                    zi.ooo00oo0Ooo0[0x3CE8 ^ 0x3DC2] = 0x13573 ^ 0x3DC2;
                    zi.ooo00oo0Ooo0[0x5D34 ^ 0x5DC9] = 0x9E96 ^ 0x5DC9;
                    zi.ooo00oo0Ooo0[0x4E4D ^ 0x4EA3] = 0xFFFFC9DC ^ 0x4EA3;
                    n3 = -1633074477;
                    continue block92;
                }
                case -1633074477: {
                    zi.ooo00oo0Ooo0[0x2E57 ^ 0x2FD5] = 0x2FD4 ^ 0x2FD5;
                    zi.ooo00oo0Ooo0[0xF9BF ^ 0xF8C6] = 0x400A ^ 0xF8C6;
                    zi.ooo00oo0Ooo0[0xA73F ^ 0xA7AA] = 0xA7AB ^ 0xA7AA;
                    n3 = 768285322;
                    continue block92;
                }
                case 768285322: {
                    zi.ooo00oo0Ooo0[0xE290 ^ 0xE3F7] = 0xEB82 ^ 0xE3F7;
                    zi.ooo00oo0Ooo0[0x88 ^ 0x16] = 0xFFFFFFEC ^ 0x16;
                    zi.ooo00oo0Ooo0[0xD7F0 ^ 0xD701] = 0x98F4 ^ 0xD701;
                    n3 = -1123974180;
                    continue block92;
                }
                case -1123974180: {
                    zi.ooo00oo0Ooo0[0x8E11 ^ 0x8F30] = 0x18AAF ^ 0x8F30;
                    zi.ooo00oo0Ooo0[0x24C9 ^ 0x2543] = 0x2553 ^ 0x2543;
                    n3 = -2045197523;
                    continue block92;
                }
                case -2045197523: {
                    zi.ooo00oo0Ooo0[0xC9B8 ^ 0xC889] = 0xF7E8 ^ 0xC889;
                    zi.ooo00oo0Ooo0[0x573A ^ 0x57EB] = 0xCE7E ^ 0x57EB;
                    zi.ooo00oo0Ooo0[0x81A4 ^ 0x818C] = 0x81E7 ^ 0x818C;
                    zi.ooo00oo0Ooo0[0x92EA ^ 0x923A] = 0xBA9 ^ 0x923A;
                    n3 = 778248059;
                    continue block92;
                }
                case 778248059: {
                    zi.ooo00oo0Ooo0[0xACF7 ^ 0xAC21] = 0xFFFFBC8E ^ 0xAC21;
                    zi.ooo00oo0Ooo0[0x10816 ^ 0x108AE] = 0x108AF ^ 0x108AE;
                    n3 = -1098073952;
                    continue block92;
                }
                case -1098073952: {
                    zi.ooo00oo0Ooo0[0x89DF ^ 0x8935] = 0xA8C9 ^ 0x8935;
                    n3 = -1155613180;
                    continue block92;
                }
                case -1155613180: {
                    zi.ooo00oo0Ooo0[0x7764 ^ 0x7761] = 0xFFFF9FCC ^ 0x7761;
                    n3 = -1304166884;
                    continue block92;
                }
                case -1304166884: {
                    zi.ooo00oo0Ooo0[0x45BC ^ 0x44C1] = 0xCED5 ^ 0x44C1;
                    zi.ooo00oo0Ooo0[0x4235 ^ 0x42AC] = 0x3CF38D8C ^ 0x42AC;
                    zi.ooo00oo0Ooo0[0x30CE ^ 0x318F] = 0xA317 ^ 0x318F;
                    zi.ooo00oo0Ooo0[0x8A96 ^ 0x8BB2] = 0x24B ^ 0x8BB2;
                    zi.ooo00oo0Ooo0[0xADD6 ^ 0xAD13] = 0x3BFB ^ 0xAD13;
                    zi.ooo00oo0Ooo0[0x901C ^ 0x9123] = 0x3E8 ^ 0x9123;
                    zi.ooo00oo0Ooo0[0x173B ^ 0x1756] = 0x1747 ^ 0x1756;
                    zi.ooo00oo0Ooo0[0xD7C4 ^ 0xD779] = 0xA3DB ^ 0xD779;
                    zi.ooo00oo0Ooo0[0x527E ^ 0x535B] = 0xFFFF2545 ^ 0x535B;
                    n3 = -1723281772;
                    continue block92;
                }
                case -1723281772: {
                    zi.ooo00oo0Ooo0[0x52BD ^ 0x5216] = 0x5215 ^ 0x5216;
                    zi.ooo00oo0Ooo0[0xB0D3 ^ 0xB0FD] = 0xFFFF4F44 ^ 0xB0FD;
                    zi.ooo00oo0Ooo0[0x9960 ^ 0x99D1] = 0xF85B2A44 ^ 0x99D1;
                    zi.ooo00oo0Ooo0[0xE004 ^ 0xE167] = 0x8032 ^ 0xE167;
                    zi.ooo00oo0Ooo0[0x7A01 ^ 0x7B4F] = 0x7369 ^ 0x7B4F;
                    n3 = -873732210;
                    continue block92;
                }
                case -873732210: {
                    zi.ooo00oo0Ooo0[0xCB0B ^ 0xCA7F] = 0xF86D ^ 0xCA7F;
                    zi.ooo00oo0Ooo0[0x4EAA ^ 0x4FAB] = 0x3271 ^ 0x4FAB;
                    zi.ooo00oo0Ooo0[0xA82 ^ 0xA5B] = 0xF672 ^ 0xA5B;
                    zi.ooo00oo0Ooo0[0x2E1F ^ 0x2E76] = 0xA941B841 ^ 0x2E76;
                    zi.ooo00oo0Ooo0[0x96EB ^ 0x96F4] = 0xC1F0EAEB ^ 0x96F4;
                    zi.ooo00oo0Ooo0[0xB4F ^ 0xB5D] = 0x10000B2B ^ 0xB5D;
                    zi.ooo00oo0Ooo0[0x3896 ^ 0x38CE] = 0x3889 ^ 0x38CE;
                    zi.ooo00oo0Ooo0[0x9C3E ^ 0x9CA6] = 0x9CBF ^ 0x9CA6;
                    zi.ooo00oo0Ooo0[0xB4D3 ^ 0xB586] = 0x1B82E ^ 0xB586;
                    zi.ooo00oo0Ooo0[0xBBB7 ^ 0xBA89] = 0xA6B7 ^ 0xBA89;
                    zi.ooo00oo0Ooo0[0x103C1 ^ 0x102E2] = 0x18B0A ^ 0x102E2;
                    zi.ooo00oo0Ooo0[0xDC51 ^ 0xDD39] = 0xD555 ^ 0xDD39;
                    zi.ooo00oo0Ooo0[0xD581 ^ 0xD4B6] = 0xCC24 ^ 0xD4B6;
                    n3 = -143009400;
                    continue block92;
                }
                case -143009400: {
                    zi.ooo00oo0Ooo0[0x3F0A ^ 0x3F00] = 0xDA6C3665 ^ 0x3F00;
                    zi.ooo00oo0Ooo0[0x1E5F ^ 0x1EB7] = 0x3F42 ^ 0x1EB7;
                    zi.ooo00oo0Ooo0[0x2914 ^ 0x297E] = 0x6B00ECB ^ 0x297E;
                    zi.ooo00oo0Ooo0[0x7AF9 ^ 0x7BEF] = 0x73DD ^ 0x7BEF;
                    n3 = -674621231;
                    continue block92;
                }
                case -674621231: {
                    zi.ooo00oo0Ooo0[0xD80E ^ 0xD975] = 0x5372 ^ 0xD975;
                    n3 = 425158298;
                    continue block92;
                }
                case 425158298: {
                    zi.ooo00oo0Ooo0[0x84B0 ^ 0x8596] = 0xC6F ^ 0x8596;
                    zi.ooo00oo0Ooo0[0x6AF6 ^ 0x6A22] = 0x851C ^ 0x6A22;
                    n3 = 196862804;
                    continue block92;
                }
                case 196862804: {
                    zi.ooo00oo0Ooo0[0x8480 ^ 0x85D1] = 0xFFFFBCBB ^ 0x85D1;
                    zi.ooo00oo0Ooo0[0x8658 ^ 0x87DB] = 0x87DB ^ 0x87DB;
                    zi.ooo00oo0Ooo0[0x971B ^ 0x9652] = 0xFFFF5A65 ^ 0x9652;
                    zi.ooo00oo0Ooo0[0x8702 ^ 0x87D8] = 0xFFFF8445 ^ 0x87D8;
                    zi.ooo00oo0Ooo0[0xB0A4 ^ 0xB09D] = 0xB09C ^ 0xB09D;
                    zi.ooo00oo0Ooo0[0x2C70 ^ 0x2C40] = 0x2C40 ^ 0x2C40;
                    zi.ooo00oo0Ooo0[0x7630 ^ 0x7615] = 0x765A ^ 0x7615;
                    zi.ooo00oo0Ooo0[0xA4D5 ^ 0xA482] = 0xA4B4 ^ 0xA482;
                    n3 = -2074751165;
                    continue block92;
                }
                case -2074751165: {
                    zi.ooo00oo0Ooo0[0x3C1A ^ 0x3C11] = 0xFFFFC3FC ^ 0x3C11;
                    zi.ooo00oo0Ooo0[0x9487 ^ 0x9599] = 0x9D23 ^ 0x9599;
                    n3 = -800359678;
                    continue block92;
                }
                case -800359678: {
                    zi.ooo00oo0Ooo0[0xA343 ^ 0xA31D] = 0x6343483D ^ 0xA31D;
                    zi.ooo00oo0Ooo0[0xDAA6 ^ 0xDBE4] = 0x492D ^ 0xDBE4;
                    zi.ooo00oo0Ooo0[0x2E4 ^ 0x2C6] = 0x2C7 ^ 0x2C6;
                    zi.ooo00oo0Ooo0[0xF138 ^ 0xF021] = 0x677A ^ 0xF021;
                    zi.ooo00oo0Ooo0[0x19A5 ^ 0x1823] = 0xAC71 ^ 0x1823;
                    zi.ooo00oo0Ooo0[0x6D2D ^ 0x6C74] = 0xFFFFC0F7 ^ 0x6C74;
                    zi.ooo00oo0Ooo0[0x88B1 ^ 0x893D] = 0x8927 ^ 0x893D;
                    zi.ooo00oo0Ooo0[0x158E ^ 0x15E9] = 0x15FA ^ 0x15E9;
                    zi.ooo00oo0Ooo0[0xF040 ^ 0xF10D] = 0xF903 ^ 0xF10D;
                    zi.ooo00oo0Ooo0[0x7C6 ^ 0x6EB] = 0xFFFF0C77 ^ 0x6EB;
                    n3 = 748886298;
                    continue block92;
                }
                case 748886298: {
                    zi.ooo00oo0Ooo0[0xDB76 ^ 0xDA18] = 0x832C ^ 0xDA18;
                    n3 = 589054737;
                    continue block92;
                }
                case 589054737: {
                    zi.ooo00oo0Ooo0[0x37D3 ^ 0x370F] = 0x5A39 ^ 0x370F;
                    zi.ooo00oo0Ooo0[0xB698 ^ 0xB65E] = 0xFFFFDF76 ^ 0xB65E;
                    zi.ooo00oo0Ooo0[0x2578 ^ 0x25CB] = 0x25C0 ^ 0x25CB;
                    zi.ooo00oo0Ooo0[0x620C ^ 0x62FF] = 0x2D0A ^ 0x62FF;
                    zi.ooo00oo0Ooo0[0x10CCF ^ 0x10C01] = 0xFFFE1005 ^ 0x10C01;
                    zi.ooo00oo0Ooo0[0xA2D5 ^ 0xA3C0] = 0xABC5 ^ 0xA3C0;
                    n3 = 103004517;
                    continue block92;
                }
                case 103004517: {
                    zi.ooo00oo0Ooo0[0x35DE ^ 0x35B0] = 0x35BF ^ 0x35B0;
                    n3 = 1037449289;
                    continue block92;
                }
                case 1037449289: {
                    zi.ooo00oo0Ooo0[0x10D69 ^ 0x10C35] = 0xC56 ^ 0x10C35;
                    zi.ooo00oo0Ooo0[0x3CC2 ^ 0x3CD9] = 0xFFFFC308 ^ 0x3CD9;
                    n3 = 535045797;
                    continue block92;
                }
                case 535045797: {
                    zi.ooo00oo0Ooo0[0x1967 ^ 0x1971] = 0xA9418F46 ^ 0x1971;
                    n3 = -1851483196;
                    continue block92;
                }
                case -1851483196: {
                    zi.ooo00oo0Ooo0[0x89B ^ 0x9A9] = 0x368D ^ 0x9A9;
                    zi.ooo00oo0Ooo0[0xEC21 ^ 0xECEA] = 0xF707 ^ 0xECEA;
                    zi.ooo00oo0Ooo0[0xFC2C ^ 0xFD1C] = 0xC238 ^ 0xFD1C;
                    n3 = 1811962671;
                    continue block92;
                }
                case 1811962671: {
                    zi.ooo00oo0Ooo0[0x474 ^ 0x40D] = 0xFFFFFCED ^ 0x40D;
                    zi.ooo00oo0Ooo0[0xC208 ^ 0xC30F] = 0x6ED ^ 0xC30F;
                    zi.ooo00oo0Ooo0[0xA6F7 ^ 0xA663] = 0xA66A ^ 0xA663;
                    zi.ooo00oo0Ooo0[0x552B ^ 0x5446] = 0xFFFFF2E6 ^ 0x5446;
                    zi.ooo00oo0Ooo0[0xAC57 ^ 0xAC82] = 0x43B4 ^ 0xAC82;
                    zi.ooo00oo0Ooo0[0x29B2 ^ 0x29F7] = 0x29F2 ^ 0x29F7;
                    zi.ooo00oo0Ooo0[0xFBB6 ^ 0xFB11] = 0xFB00 ^ 0xFB11;
                    zi.ooo00oo0Ooo0[0x1023C ^ 0x10298] = 0xFFFEFD0F ^ 0x10298;
                    n3 = 721442734;
                    continue block92;
                }
                case 721442734: {
                    zi.ooo00oo0Ooo0[0xF772 ^ 0xF62A] = 0xA561 ^ 0xF62A;
                    zi.ooo00oo0Ooo0[0xC62C ^ 0xC77E] = 0x1D1 ^ 0xC77E;
                    zi.ooo00oo0Ooo0[0xB268 ^ 0xB2C1] = 0xFFFF4D18 ^ 0xB2C1;
                    n3 = -1073107644;
                    continue block92;
                }
                case -1073107644: {
                    zi.ooo00oo0Ooo0[0x479F ^ 0x46BF] = 0x14303 ^ 0x46BF;
                    zi.ooo00oo0Ooo0[0xC720 ^ 0xC762] = 0xB4BE ^ 0xC762;
                    zi.ooo00oo0Ooo0[0xDEDA ^ 0xDE19] = 0x1DBB0 ^ 0xDE19;
                    zi.ooo00oo0Ooo0[0x348E ^ 0x3409] = 0x340C ^ 0x3409;
                    zi.ooo00oo0Ooo0[0xBB34 ^ 0xBA2B] = 0x1BF8F ^ 0xBA2B;
                    zi.ooo00oo0Ooo0[0xF0D6 ^ 0xF08C] = 0xF093 ^ 0xF08C;
                    n3 = -1618960992;
                    continue block92;
                }
                case -1618960992: {
                    zi.ooo00oo0Ooo0[0xAE7F ^ 0xAFFA] = 0xAFF2 ^ 0xAFFA;
                    zi.ooo00oo0Ooo0[0xC221 ^ 0xC23D] = 0xFFFF3CBB ^ 0xC23D;
                    zi.ooo00oo0Ooo0[0xD033 ^ 0xD00F] = 0xD008 ^ 0xD00F;
                    zi.ooo00oo0Ooo0[0x6E88 ^ 0x6FAA] = 0x16A16 ^ 0x6FAA;
                    zi.ooo00oo0Ooo0[0x288C ^ 0x28A6] = 0x28E5 ^ 0x28A6;
                    zi.ooo00oo0Ooo0[0xDDDA ^ 0xDD4C] = 0xDD53 ^ 0xDD4C;
                    zi.ooo00oo0Ooo0[0xB01E ^ 0xB0F2] = 0xC80A ^ 0xB0F2;
                    zi.ooo00oo0Ooo0[0x6B96 ^ 0x6BB0] = 0xFFFF944F ^ 0x6BB0;
                    zi.ooo00oo0Ooo0[0xA3CA ^ 0xA2DA] = 0xE464 ^ 0xA2DA;
                    n3 = 1664111144;
                    continue block92;
                }
                case 1664111144: {
                    zi.ooo00oo0Ooo0[0xB89F ^ 0xB9F9] = 0xD8A5 ^ 0xB9F9;
                    n3 = 859659596;
                    continue block92;
                }
                case 859659596: {
                    zi.ooo00oo0Ooo0[0xF586 ^ 0xF4CE] = 0xC70F ^ 0xF4CE;
                    zi.ooo00oo0Ooo0[0xA71F ^ 0xA696] = 0xA697 ^ 0xA696;
                    zi.ooo00oo0Ooo0[0xB7B0 ^ 0xB720] = 0xFFFF48F1 ^ 0xB720;
                    zi.ooo00oo0Ooo0[0xAF6E ^ 0xAEEF] = 0xAEEF ^ 0xAEEF;
                    zi.ooo00oo0Ooo0[0x66B8 ^ 0x662F] = 0x6628 ^ 0x662F;
                    zi.ooo00oo0Ooo0[0x109E5 ^ 0x1095E] = 0x1CAE0 ^ 0x1095E;
                    zi.ooo00oo0Ooo0[0xD8CB ^ 0xD87F] = 0xFFFF27FA ^ 0xD87F;
                    zi.ooo00oo0Ooo0[0x842B ^ 0x8549] = 0x18BAB ^ 0x8549;
                    zi.ooo00oo0Ooo0[0xDBE5 ^ 0xDB76] = 0xDC81 ^ 0xDB76;
                    zi.ooo00oo0Ooo0[0x115F ^ 0x11D4] = 0x11C7 ^ 0x11D4;
                    n3 = -724596344;
                    continue block92;
                }
                case -724596344: {
                    zi.ooo00oo0Ooo0[0xB013 ^ 0xB034] = 0xFFFF4FA1 ^ 0xB034;
                    zi.ooo00oo0Ooo0[0xFC0 ^ 0xFD7] = 0x2240 ^ 0xFD7;
                    zi.ooo00oo0Ooo0[0xA5F8 ^ 0xA51D] = 0x1D2B ^ 0xA51D;
                    zi.ooo00oo0Ooo0[0xB254 ^ 0xB312] = 0xE6DF ^ 0xB312;
                    zi.ooo00oo0Ooo0[0x630A ^ 0x63A6] = 0x63BB ^ 0x63A6;
                    zi.ooo00oo0Ooo0[0xC8AB ^ 0xC9C2] = 0xC1F4 ^ 0xC9C2;
                    zi.ooo00oo0Ooo0[0x23F4 ^ 0x227A] = 0x2252 ^ 0x227A;
                    zi.ooo00oo0Ooo0[0xFA94 ^ 0xFBEA] = 0x71ED ^ 0xFBEA;
                    zi.ooo00oo0Ooo0[0x7DD8 ^ 0x7DE9] = 0x7DE9 ^ 0x7DE9;
                    zi.ooo00oo0Ooo0[0x2177 ^ 0x21FD] = 0x21F0 ^ 0x21FD;
                    zi.ooo00oo0Ooo0[0x7039 ^ 0x70D2] = 0x5123 ^ 0x70D2;
                    zi.ooo00oo0Ooo0[0x632B ^ 0x6367] = 0x6376 ^ 0x6367;
                    n3 = -853001761;
                    continue block92;
                }
                case -853001761: {
                    zi.ooo00oo0Ooo0[0x7C4F ^ 0x7D73] = 0x614D ^ 0x7D73;
                    n3 = -714804011;
                    continue block92;
                }
                case -714804011: {
                    zi.ooo00oo0Ooo0[0x10538 ^ 0x1057E] = 0x10575 ^ 0x1057E;
                    zi.ooo00oo0Ooo0[0xF6B5 ^ 0xF6CE] = 0xFFFF0931 ^ 0xF6CE;
                    zi.ooo00oo0Ooo0[0xAF91 ^ 0xAECF] = 0x1AEAC ^ 0xAECF;
                    zi.ooo00oo0Ooo0[0x10EC5 ^ 0x10ED6] = 0x10EA1 ^ 0x10ED6;
                    n3 = 389128704;
                    continue block92;
                }
                case 389128704: {
                    zi.ooo00oo0Ooo0[0x10BA2 ^ 0x10B71] = 0x192E4 ^ 0x10B71;
                    n3 = 1039782763;
                    continue block92;
                }
                case 1039782763: {
                    zi.ooo00oo0Ooo0[0x4FE5 ^ 0x4F10] = 0x2ED3 ^ 0x4F10;
                    n3 = -2086860786;
                    continue block92;
                }
                case -2086860786: {
                    zi.ooo00oo0Ooo0[0x1E7D ^ 0x1EBF] = 0x11B79 ^ 0x1EBF;
                    n3 = -1513337733;
                    continue block92;
                }
                case -1513337733: {
                    zi.ooo00oo0Ooo0[0x9A33 ^ 0x9AAE] = 0xE9BDAD09 ^ 0x9AAE;
                    zi.ooo00oo0Ooo0[0xED0 ^ 0xE31] = 0x866B ^ 0xE31;
                    zi.ooo00oo0Ooo0[0x29DA ^ 0x285A] = 0x285A ^ 0x285A;
                    n3 = 1522421899;
                    continue block92;
                }
                case 1522421899: {
                    zi.ooo00oo0Ooo0[0xD438 ^ 0xD5B7] = 0xD5B6 ^ 0xD5B7;
                    zi.ooo00oo0Ooo0[0xE63B ^ 0xE733] = 0x22D5 ^ 0xE733;
                    zi.ooo00oo0Ooo0[0x3563 ^ 0x341B] = 0x8CBE ^ 0x341B;
                    zi.ooo00oo0Ooo0[0xC323 ^ 0xC230] = 0xCA11 ^ 0xC230;
                    zi.ooo00oo0Ooo0[0x8C70 ^ 0x8D61] = 0xCBEF ^ 0x8D61;
                    n3 = -194842386;
                    continue block92;
                }
                case -194842386: {
                    zi.ooo00oo0Ooo0[0x867E ^ 0x864B] = 0xFFFF79B4 ^ 0x864B;
                    zi.ooo00oo0Ooo0[0xCC7 ^ 0xD9D] = 0x5ED6 ^ 0xD9D;
                    zi.ooo00oo0Ooo0[0x63BC ^ 0x630E] = 0x631B ^ 0x630E;
                    zi.ooo00oo0Ooo0[0xE367 ^ 0xE3BC] = 0x1F95 ^ 0xE3BC;
                    zi.ooo00oo0Ooo0[0x5F36 ^ 0x5FFB] = 0xBC11 ^ 0x5FFB;
                    zi.ooo00oo0Ooo0[0x584F ^ 0x597A] = 0x66BC ^ 0x597A;
                    n3 = 1476357527;
                    continue block92;
                }
                case 1476357527: {
                    zi.ooo00oo0Ooo0[0x7CDF ^ 0x7C96] = 0x7C81 ^ 0x7C96;
                    zi.ooo00oo0Ooo0[0xA3AE ^ 0xA3BB] = 0xA3BC ^ 0xA3BB;
                    zi.ooo00oo0Ooo0[0xFCA4 ^ 0xFC04] = 0xFFFF03FB ^ 0xFC04;
                    zi.ooo00oo0Ooo0[0x5066 ^ 0x507B] = 0x500A ^ 0x507B;
                    zi.ooo00oo0Ooo0[0xADAB ^ 0xADA2] = 0x44BA4B ^ 0xADA2;
                    zi.ooo00oo0Ooo0[0x7A1F ^ 0x7A7C] = 0x7A71 ^ 0x7A7C;
                    zi.ooo00oo0Ooo0[0xD3DE ^ 0xD329] = 0xB2EA ^ 0xD329;
                    zi.ooo00oo0Ooo0[0x2C69 ^ 0x2D65] = 0x2156 ^ 0x2D65;
                    zi.ooo00oo0Ooo0[0xDFAA ^ 0xDF2C] = 0xDF37 ^ 0xDF2C;
                    zi.ooo00oo0Ooo0[0x2EEE ^ 0x2F91] = 0x2F91 ^ 0x2F91;
                    zi.ooo00oo0Ooo0[0xD28A ^ 0xD285] = 0xD286 ^ 0xD285;
                    zi.ooo00oo0Ooo0[0xEEEB ^ 0xEE9F] = 0xEE86 ^ 0xEE9F;
                    zi.ooo00oo0Ooo0[0x28E3 ^ 0x289C] = 0x288F ^ 0x289C;
                    n3 = 798096052;
                    continue block92;
                }
                case 798096052: {
                    zi.ooo00oo0Ooo0[0x60D6 ^ 0x60E9] = 0xEFA5 ^ 0x60E9;
                    zi.ooo00oo0Ooo0[0x5B9F ^ 0x5B26] = 0x5B26 ^ 0x5B26;
                    zi.ooo00oo0Ooo0[0xA00F ^ 0xA07C] = 0x1E00A07C ^ 0xA07C;
                    zi.ooo00oo0Ooo0[0x7C1 ^ 0x64C] = 0x64B ^ 0x64C;
                    zi.ooo00oo0Ooo0[0xD42F ^ 0xD53D] = 0x9383 ^ 0xD53D;
                    zi.ooo00oo0Ooo0[0xFB20 ^ 0xFB83] = 0xFBAE ^ 0xFB83;
                    zi.ooo00oo0Ooo0[0x4A7A ^ 0x4B0D] = 0xF3B8 ^ 0x4B0D;
                    zi.ooo00oo0Ooo0[0x10785 ^ 0x10744] = 0x2ED ^ 0x10744;
                    zi.ooo00oo0Ooo0[0x7C29 ^ 0x7C9C] = 0x81027895 ^ 0x7C9C;
                    zi.ooo00oo0Ooo0[0xED21 ^ 0xED02] = 0x577E8CA0 ^ 0xED02;
                    zi.ooo00oo0Ooo0[0xA236 ^ 0xA311] = 0x1ABA7 ^ 0xA311;
                    n3 = -1173755250;
                    continue block92;
                }
                case -1173755250: {
                    zi.ooo00oo0Ooo0[0x9C58 ^ 0x9D28] = 0x4D98 ^ 0x9D28;
                    zi.ooo00oo0Ooo0[0xCDBC ^ 0xCD5E] = 0x453A ^ 0xCD5E;
                    zi.ooo00oo0Ooo0[0x4747 ^ 0x4607] = 0xD4CE ^ 0x4607;
                    zi.ooo00oo0Ooo0[0x9D54 ^ 0x9DBD] = 0xBC4C ^ 0x9DBD;
                    zi.ooo00oo0Ooo0[0xE3E6 ^ 0xE2E6] = 0x9F68 ^ 0xE2E6;
                    n3 = -571500730;
                    continue block92;
                }
                case -571500730: {
                    zi.ooo00oo0Ooo0[0x1FC7 ^ 0x1EB5] = 0xCE05 ^ 0x1EB5;
                    zi.ooo00oo0Ooo0[0xAA9B ^ 0xAA93] = 0xAADC ^ 0xAA93;
                    zi.ooo00oo0Ooo0[0x2853 ^ 0x2967] = 0x1696 ^ 0x2967;
                    zi.ooo00oo0Ooo0[0x9309 ^ 0x938A] = 0x1A413031 ^ 0x938A;
                    zi.ooo00oo0Ooo0[0xD3E7 ^ 0xD39D] = 0xD3AC ^ 0xD39D;
                    zi.ooo00oo0Ooo0[0x13E5 ^ 0x134A] = 0xFFFFEC89 ^ 0x134A;
                    zi.ooo00oo0Ooo0[0x2CA9 ^ 0x2DEA] = 0x7828 ^ 0x2DEA;
                    zi.ooo00oo0Ooo0[0xC895 ^ 0xC8C1] = 0xC8D8 ^ 0xC8C1;
                    n3 = -1163482046;
                    continue block92;
                }
                case -1163482046: {
                    zi.ooo00oo0Ooo0[0x112F ^ 0x116B] = 0x1168 ^ 0x116B;
                    zi.ooo00oo0Ooo0[0xC67E ^ 0xC6FC] = 0x16420EA5 ^ 0xC6FC;
                    n3 = -1208449142;
                    continue block92;
                }
                case -1208449142: {
                    zi.ooo00oo0Ooo0[0x43C0 ^ 0x42C6] = 0xD7C7 ^ 0x42C6;
                    zi.ooo00oo0Ooo0[0x4462 ^ 0x4566] = 0xD067 ^ 0x4566;
                    n3 = -336889022;
                    continue block92;
                }
                case -336889022: {
                    zi.ooo00oo0Ooo0[0x5639 ^ 0x574A] = 0x655E ^ 0x574A;
                    zi.ooo00oo0Ooo0[0x10597 ^ 0x105BA] = 0xFFFEFA41 ^ 0x105BA;
                    zi.ooo00oo0Ooo0[0x5145 ^ 0x5132] = 0x513F ^ 0x5132;
                    zi.ooo00oo0Ooo0[0x8358 ^ 0x8240] = 0x156E ^ 0x8240;
                    zi.ooo00oo0Ooo0[0x57F9 ^ 0x57C4] = 0x57CD ^ 0x57C4;
                    n3 = 1316396342;
                    continue block92;
                }
                case 1316396342: {
                    zi.ooo00oo0Ooo0[0x5F86 ^ 0x5ED9] = 0x15031 ^ 0x5ED9;
                    zi.ooo00oo0Ooo0[0x10A8E ^ 0x10AF6] = 0x10AE5 ^ 0x10AF6;
                    zi.ooo00oo0Ooo0[0x4C91 ^ 0x4CE3] = 0x4CBE ^ 0x4CE3;
                    zi.ooo00oo0Ooo0[0xBBB1 ^ 0xBB56] = 0x360 ^ 0xBB56;
                    zi.ooo00oo0Ooo0[0xE218 ^ 0xE2B5] = 0xFFFF1D28 ^ 0xE2B5;
                    zi.ooo00oo0Ooo0[0x73DB ^ 0x729C] = 0x4147 ^ 0x729C;
                    zi.ooo00oo0Ooo0[0xB752 ^ 0xB715] = 0xB715 ^ 0xB715;
                    zi.ooo00oo0Ooo0[0xA277 ^ 0xA2C1] = 0xA2BE ^ 0xA2C1;
                    zi.ooo00oo0Ooo0[0x2F39 ^ 0x2FC1] = 0x5C4D ^ 0x2FC1;
                    n3 = 513986735;
                    continue block92;
                }
                case 513986735: {
                    zi.ooo00oo0Ooo0[0xB165 ^ 0xB020] = 0xE5A8 ^ 0xB020;
                    zi.ooo00oo0Ooo0[0xB728 ^ 0xB64C] = 0xD710 ^ 0xB64C;
                    zi.ooo00oo0Ooo0[0xE555 ^ 0xE41E] = 0xEC24 ^ 0xE41E;
                    zi.ooo00oo0Ooo0[0x3B24 ^ 0x3A1C] = 0x2291 ^ 0x3A1C;
                    zi.ooo00oo0Ooo0[0x4117 ^ 0x4136] = 0x4132 ^ 0x4136;
                    n3 = 2055061443;
                    continue block92;
                }
                case 2055061443: {
                    zi.ooo00oo0Ooo0[0xDC82 ^ 0xDC19] = 0xFFFF23E6 ^ 0xDC19;
                    zi.ooo00oo0Ooo0[0x945C ^ 0x9570] = 0x6072 ^ 0x9570;
                    zi.ooo00oo0Ooo0[0x9EC9 ^ 0x9FD2] = 0x977F ^ 0x9FD2;
                    n3 = -1895894998;
                    continue block92;
                }
                case -1895894998: {
                    zi.ooo00oo0Ooo0[0xA699 ^ 0xA679] = 0x2E2D ^ 0xA679;
                    n3 = -1660522972;
                    continue block92;
                }
                case -1660522972: {
                    zi.ooo00oo0Ooo0[0x9C46 ^ 0x9DC2] = 0x9DCA ^ 0x9DC2;
                    zi.ooo00oo0Ooo0[0x664 ^ 0x66A] = 0x2000066F ^ 0x66A;
                    zi.ooo00oo0Ooo0[0xA04D ^ 0xA0D1] = 0xFFFF5F3A ^ 0xA0D1;
                    zi.ooo00oo0Ooo0[0x94E4 ^ 0x95CF] = 0x60D8 ^ 0x95CF;
                    zi.ooo00oo0Ooo0[0x4B69 ^ 0x4B9B] = 0x47C ^ 0x4B9B;
                    zi.ooo00oo0Ooo0[0x78ED ^ 0x78AC] = 0x78A1 ^ 0x78AC;
                    n3 = 1851242714;
                    continue block92;
                }
                case 1851242714: {
                    zi.ooo00oo0Ooo0[0xEE8C ^ 0xEE13] = 0xAAAA44B8 ^ 0xEE13;
                    zi.ooo00oo0Ooo0[0x30A9 ^ 0x30E6] = 0x30D1 ^ 0x30E6;
                    zi.ooo00oo0Ooo0[0xC826 ^ 0xC92D] = 0xC500 ^ 0xC92D;
                    n3 = -475228258;
                    continue block92;
                }
                case -475228258: {
                    zi.ooo00oo0Ooo0[0x5286 ^ 0x53F3] = 0xFFFF9E75 ^ 0x53F3;
                    zi.ooo00oo0Ooo0[0xEF02 ^ 0xEF7F] = 0xD4104A38 ^ 0xEF7F;
                    n3 = 396462725;
                    continue block92;
                }
                case 396462725: 
            }
            zi.ooo00oo0Ooo0[0xE80C ^ 0xE89D] = 0xE896 ^ 0xE89D;
            zi.ooo00oo0Ooo0[0x1EB9 ^ 0x1E56] = 0x66A5 ^ 0x1E56;
            zi.ooo00oo0Ooo0[0xAD0C ^ 0xADD2] = 0xFFFF3F42 ^ 0xADD2;
            zi.ooo00oo0Ooo0[0x7232 ^ 0x7260] = 0x20007260 ^ 0x7260;
            zi.ooo00oo0Ooo0[0xB815 ^ 0xB894] = 0xB887 ^ 0xB894;
            zi.ooo00oo0Ooo0[0xE171 ^ 0xE158] = 0xFFFF123B ^ 0xE158;
            zi.ooo00oo0Ooo0[0xC5A1 ^ 0xC52F] = 0xC520 ^ 0xC52F;
            zi.ooo00oo0Ooo0[0xE2F7 ^ 0xE2C0] = 0xE2C2 ^ 0xE2C0;
            n3 = -436684652;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static { /* RISE-PORT STUB: initializer unrestored */ }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }
}

