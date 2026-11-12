/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.ez;
import hackclient.rise.fd;
import hackclient.rise.fg;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.jg;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import net.minecraft.network.aj;
import net.minecraft.util.da;
import rip.vantage.commons.util.time.a;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class jp
extends akg<jg> {
    public static /* synthetic */ String o0Oo000O0oO;
    @dm
    public /* synthetic */ dk<ej> zZ;
    public /* synthetic */ float jp;
    public /* synthetic */ double zM;
    public /* synthetic */ aki zR;
    public static /* synthetic */ String oO00O0OO0ooO;
    public /* synthetic */ a zG;
    public static /* synthetic */ String[] oOo00Oo0OOo0;
    @dm
    public /* synthetic */ dk<ez> zV;
    @dm
    public /* synthetic */ dk<fi> zY;
    public /* synthetic */ int zO;
    public /* synthetic */ Integer zH;
    public /* synthetic */ boolean gD;
    public static /* synthetic */ String Oo0o00000O00;
    @dm(cH=3)
    public /* synthetic */ dk<dz> yv;
    public /* synthetic */ Queue<aj<?>> zE;
    public /* synthetic */ int dm;
    @dm
    public /* synthetic */ dk<fd> zT;
    public /* synthetic */ boolean zL;
    private static /* synthetic */ int[] oo000o00Oo00;
    public /* synthetic */ a zC;
    public /* synthetic */ aki zQ;
    public /* synthetic */ float jq;
    @dm
    public /* synthetic */ dk<fd> Aa;
    public static /* synthetic */ Object[] 0oOOoOo0O00O;
    public static /* synthetic */ Object[] O0OoOO0OOOOO;
    public /* synthetic */ boolean zN;
    public static /* synthetic */ boolean zK;
    public /* synthetic */ Queue<da> zD;
    @dm(cH=1)
    public /* synthetic */ dk<ej> zX;
    public static /* synthetic */ boolean qW;
    public static /* synthetic */ Object ooo00oo0Ooo0;
    public static /* synthetic */ String[] o0o000o0O0o0;
    @dm
    public /* synthetic */ dk<fg> Ab;
    @dm
    public /* synthetic */ dk<ei> zU;
    public /* synthetic */ boolean zJ;
    public /* synthetic */ boolean zP;
    @dm
    public /* synthetic */ dk<fh> zW;
    public /* synthetic */ aki zS;
    public /* synthetic */ List<Short> zB;
    public /* synthetic */ Integer zI;
    public static /* synthetic */ String 0OOOoo00o0;
    public /* synthetic */ Queue<aj<?>> zF;
    private static /* synthetic */ int o0000000O000;
    private static /* synthetic */ boolean oO000O00OO00;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void 0OOOoo00o0() {
        int n2 = -289886007;
        if (n2 != n2) {
            throw null;
        }
        oo000o00Oo00 = new int[0xDD15 ^ 0xDC85];
        hackclient.rise.jp.oo000o00Oo00[0x22A7 ^ 0x2284] = 0x2281 ^ 0x2284;
        hackclient.rise.jp.oo000o00Oo00[0xCC97 ^ 0xCCAC] = 0xCCD1 ^ 0xCCAC;
        hackclient.rise.jp.oo000o00Oo00[0xECBA ^ 0xEDAB] = 0xEDB8 ^ 0xEDAB;
        hackclient.rise.jp.oo000o00Oo00[0x10828 ^ 0x1090B] = 0xDAABA3A7 ^ 0x1090B;
        hackclient.rise.jp.oo000o00Oo00[0xCE51 ^ 0xCFD2] = 0xCFC3 ^ 0xCFD2;
        hackclient.rise.jp.oo000o00Oo00[0xEF26 ^ 0xEE3E] = 0xEE75 ^ 0xEE3E;
        int n3 = 1125216315;
        block85: while (true) {
            switch (n3) {
                case -1267568748: {
                    hackclient.rise.jp.oo000o00Oo00[0x7B8 ^ 0x703] = 0x70A ^ 0x703;
                    hackclient.rise.jp.oo000o00Oo00[0xC816 ^ 0xC8C0] = 0xA4FA8765 ^ 0xC8C0;
                    hackclient.rise.jp.oo000o00Oo00[0xA9C3 ^ 0xA901] = 0xA914 ^ 0xA901;
                    hackclient.rise.jp.oo000o00Oo00[0x78A6 ^ 0x7859] = 0xFFFF87CE ^ 0x7859;
                    hackclient.rise.jp.oo000o00Oo00[0xD7AD ^ 0xD7CF] = 0xFCEABF3F ^ 0xD7CF;
                    hackclient.rise.jp.oo000o00Oo00[0x51EB ^ 0x5186] = 0xEB854F44 ^ 0x5186;
                    hackclient.rise.jp.oo000o00Oo00[0xC7F5 ^ 0xC703] = 0x3CF3083E ^ 0xC703;
                    hackclient.rise.jp.oo000o00Oo00[0x8755 ^ 0x8704] = 0x8705 ^ 0x8704;
                    hackclient.rise.jp.oo000o00Oo00[0x9CB ^ 0x971] = 0xFFFFF6FC ^ 0x971;
                    hackclient.rise.jp.oo000o00Oo00[0xA2DE ^ 0xA2F9] = 0xFFFF5D06 ^ 0xA2F9;
                    hackclient.rise.jp.oo000o00Oo00[0x127A ^ 0x122A] = 0xFFFFEDE7 ^ 0x122A;
                    n3 = -989105533;
                    continue block85;
                }
                case -989105533: {
                    hackclient.rise.jp.oo000o00Oo00[0x701F ^ 0x7033] = 0x7038 ^ 0x7033;
                    hackclient.rise.jp.oo000o00Oo00[0x9957 ^ 0x9835] = 0x9826 ^ 0x9835;
                    hackclient.rise.jp.oo000o00Oo00[0xDFFD ^ 0xDF93] = 0x56BEB65A ^ 0xDF93;
                    hackclient.rise.jp.oo000o00Oo00[0xFB56 ^ 0xFA61] = 0x1711 ^ 0xFA61;
                    hackclient.rise.jp.oo000o00Oo00[0x99A8 ^ 0x98F0] = 0xFFFF670F ^ 0x98F0;
                    n3 = 1960487595;
                    continue block85;
                }
                case 1960487595: {
                    hackclient.rise.jp.oo000o00Oo00[0x6A50 ^ 0x6B1F] = 0x6B0C ^ 0x6B1F;
                    hackclient.rise.jp.oo000o00Oo00[0xFDBD ^ 0xFDB3] = 0xFDB2 ^ 0xFDB3;
                    hackclient.rise.jp.oo000o00Oo00[0x8430 ^ 0x854D] = 0xFFFF7AB2 ^ 0x854D;
                    n3 = -1352780426;
                    continue block85;
                }
                case -1352780426: {
                    hackclient.rise.jp.oo000o00Oo00[0x3E89 ^ 0x3E6E] = 0xFFFFC183 ^ 0x3E6E;
                    hackclient.rise.jp.oo000o00Oo00[0x1E95 ^ 0x1E3F] = 0x1E2E ^ 0x1E3F;
                    hackclient.rise.jp.oo000o00Oo00[0x3BEF ^ 0x3A80] = 0x3AF1 ^ 0x3A80;
                    hackclient.rise.jp.oo000o00Oo00[0x6C01 ^ 0x6CEC] = 0x6CED ^ 0x6CEC;
                    n3 = 938711936;
                    continue block85;
                }
                case 938711936: {
                    hackclient.rise.jp.oo000o00Oo00[0xCB82 ^ 0xCBF1] = 0xCBEE ^ 0xCBF1;
                    hackclient.rise.jp.oo000o00Oo00[0x1A6D ^ 0x1A29] = 0x2CDDAAFD ^ 0x1A29;
                    hackclient.rise.jp.oo000o00Oo00[0x388B ^ 0x389A] = 0x38BF ^ 0x389A;
                    n3 = 2073897232;
                    continue block85;
                }
                case 2073897232: {
                    hackclient.rise.jp.oo000o00Oo00[0x1DAD ^ 0x1DDD] = 0xFFFFE222 ^ 0x1DDD;
                    hackclient.rise.jp.oo000o00Oo00[0x13E8 ^ 0x133B] = 0xFFFFEC86 ^ 0x133B;
                    hackclient.rise.jp.oo000o00Oo00[0x41E0 ^ 0x4086] = 0xFFFFBF31 ^ 0x4086;
                    hackclient.rise.jp.oo000o00Oo00[0x18E ^ 0xE7] = 0x111111F6 ^ 0xE7;
                    hackclient.rise.jp.oo000o00Oo00[0x9B68 ^ 0x9BD1] = 0x2809BA2 ^ 0x9BD1;
                    hackclient.rise.jp.oo000o00Oo00[0x38C5 ^ 0x3987] = 0x3987 ^ 0x3987;
                    hackclient.rise.jp.oo000o00Oo00[0x694A ^ 0x69FF] = 0x69EC ^ 0x69FF;
                    n3 = -15757502;
                    continue block85;
                }
                case -15757502: {
                    hackclient.rise.jp.oo000o00Oo00[0x820E ^ 0x8274] = 0x8273 ^ 0x8274;
                    hackclient.rise.jp.oo000o00Oo00[0x10878 ^ 0x10950] = 0x10959 ^ 0x10950;
                    hackclient.rise.jp.oo000o00Oo00[0xDC4C ^ 0xDDC6] = 0xDDCF ^ 0xDDC6;
                    hackclient.rise.jp.oo000o00Oo00[0x855 ^ 0x9D3] = 0x9B0 ^ 0x9D3;
                    hackclient.rise.jp.oo000o00Oo00[0x8D3 ^ 0x8FD] = 0x4A90E2 ^ 0x8FD;
                    hackclient.rise.jp.oo000o00Oo00[0x84E9 ^ 0x8476] = 0xBFFF7B89 ^ 0x8476;
                    hackclient.rise.jp.oo000o00Oo00[0x9B9 ^ 0x915] = 0x91A ^ 0x915;
                    n3 = -1800959796;
                    continue block85;
                }
                case -1800959796: {
                    hackclient.rise.jp.oo000o00Oo00[0x3A6 ^ 0x363] = 0x366 ^ 0x363;
                    hackclient.rise.jp.oo000o00Oo00[0x109DC ^ 0x10953] = 0xFFFEF6E8 ^ 0x10953;
                    n3 = -40380535;
                    continue block85;
                }
                case -40380535: {
                    hackclient.rise.jp.oo000o00Oo00[0xC404 ^ 0xC500] = 0xC513 ^ 0xC500;
                    n3 = -22189110;
                    continue block85;
                }
                case -22189110: {
                    hackclient.rise.jp.oo000o00Oo00[0xC6E1 ^ 0xC7F7] = 0x487289F3 ^ 0xC7F7;
                    hackclient.rise.jp.oo000o00Oo00[0x90AA ^ 0x91ED] = 0x918C ^ 0x91ED;
                    hackclient.rise.jp.oo000o00Oo00[0x2C25 ^ 0x2C98] = 0xFFFFD37A ^ 0x2C98;
                    hackclient.rise.jp.oo000o00Oo00[0xC028 ^ 0xC043] = 0xC040 ^ 0xC043;
                    hackclient.rise.jp.oo000o00Oo00[0x10A06 ^ 0x10A86] = 0xFFFEF535 ^ 0x10A86;
                    hackclient.rise.jp.oo000o00Oo00[0x554C ^ 0x55C8] = 0xFFFFAC78 ^ 0x55C8;
                    n3 = 869884935;
                    continue block85;
                }
                case 869884935: {
                    hackclient.rise.jp.oo000o00Oo00[0x2B35 ^ 0x2A62] = 0xFFFFD59D ^ 0x2A62;
                    hackclient.rise.jp.oo000o00Oo00[0xF855 ^ 0xF80D] = 0xFFFF07B4 ^ 0xF80D;
                    hackclient.rise.jp.oo000o00Oo00[0xA5EB ^ 0xA5AC] = 0x9E5AC ^ 0xA5AC;
                    hackclient.rise.jp.oo000o00Oo00[0x8970 ^ 0x8830] = 0x882F ^ 0x8830;
                    hackclient.rise.jp.oo000o00Oo00[0x45E7 ^ 0x44EE] = 0x44DF ^ 0x44EE;
                    hackclient.rise.jp.oo000o00Oo00[0x88F6 ^ 0x89AB] = 0x89AE ^ 0x89AB;
                    hackclient.rise.jp.oo000o00Oo00[0xF613 ^ 0xF672] = 0xFFFF098D ^ 0xF672;
                    hackclient.rise.jp.oo000o00Oo00[0xEF0F ^ 0xEF58] = 0xEF2B ^ 0xEF58;
                    hackclient.rise.jp.oo000o00Oo00[0x7F7 ^ 0x6F8] = 0x6A5 ^ 0x6F8;
                    hackclient.rise.jp.oo000o00Oo00[0x8C84 ^ 0x8DA6] = 0x8DAD ^ 0x8DA6;
                    hackclient.rise.jp.oo000o00Oo00[0x95D6 ^ 0x954F] = 0xFFFF6A98 ^ 0x954F;
                    hackclient.rise.jp.oo000o00Oo00[0x9ECA ^ 0x9EC0] = 0x9EDD ^ 0x9EC0;
                    hackclient.rise.jp.oo000o00Oo00[0x1937 ^ 0x1908] = 0x2CBCFDA1 ^ 0x1908;
                    hackclient.rise.jp.oo000o00Oo00[0x1060 ^ 0x114E] = 0x6346 ^ 0x114E;
                    hackclient.rise.jp.oo000o00Oo00[0xBED1 ^ 0xBFA5] = 0xF28675BF ^ 0xBFA5;
                    hackclient.rise.jp.oo000o00Oo00[0x774 ^ 0x632] = 0x659 ^ 0x632;
                    hackclient.rise.jp.oo000o00Oo00[0x66CA ^ 0x668A] = 0xFFFF997B ^ 0x668A;
                    n3 = -788705225;
                    continue block85;
                }
                case -788705225: {
                    hackclient.rise.jp.oo000o00Oo00[0xEC13 ^ 0xEC7C] = 0xFFFF139B ^ 0xEC7C;
                    hackclient.rise.jp.oo000o00Oo00[0xD52E ^ 0xD4AF] = 0xD4FE ^ 0xD4AF;
                    hackclient.rise.jp.oo000o00Oo00[0xA68C ^ 0xA644] = 0xAAAA0CEF ^ 0xA644;
                    n3 = -1325525146;
                    continue block85;
                }
                case -1325525146: {
                    hackclient.rise.jp.oo000o00Oo00[0x105EE ^ 0x104C7] = 0x104C7 ^ 0x104C7;
                    hackclient.rise.jp.oo000o00Oo00[0xA19A ^ 0xA114] = 0xA107 ^ 0xA114;
                    n3 = 242384176;
                    continue block85;
                }
                case 242384176: {
                    hackclient.rise.jp.oo000o00Oo00[0x7AE4 ^ 0x7BAF] = 0xFFFE8450 ^ 0x7BAF;
                    n3 = -590899846;
                    continue block85;
                }
                case -590899846: {
                    hackclient.rise.jp.oo000o00Oo00[0xAAED ^ 0xAA66] = 0xAA75 ^ 0xAA66;
                    n3 = -1137626675;
                    continue block85;
                }
                case -1137626675: {
                    hackclient.rise.jp.oo000o00Oo00[0x1076B ^ 0x10671] = 0xFFFEF98E ^ 0x10671;
                    hackclient.rise.jp.oo000o00Oo00[0x183C ^ 0x1859] = 0xFFFFE7BC ^ 0x1859;
                    n3 = -980312324;
                    continue block85;
                }
                case -980312324: {
                    hackclient.rise.jp.oo000o00Oo00[0x90F8 ^ 0x9039] = 0x9032 ^ 0x9039;
                    n3 = 2083932199;
                    continue block85;
                }
                case 2083932199: {
                    hackclient.rise.jp.oo000o00Oo00[0x84D6 ^ 0x8445] = 0xFFFF7BC0 ^ 0x8445;
                    hackclient.rise.jp.oo000o00Oo00[0x9BF2 ^ 0x9B25] = 0x9B72 ^ 0x9B25;
                    hackclient.rise.jp.oo000o00Oo00[0x63D9 ^ 0x633B] = 0x6326 ^ 0x633B;
                    hackclient.rise.jp.oo000o00Oo00[0x6078 ^ 0x601E] = 0x6009 ^ 0x601E;
                    hackclient.rise.jp.oo000o00Oo00[0xD2BA ^ 0xD251] = 0xD24E ^ 0xD251;
                    hackclient.rise.jp.oo000o00Oo00[0xBBCB ^ 0xBA43] = 0xBA4C ^ 0xBA43;
                    hackclient.rise.jp.oo000o00Oo00[0xC9F9 ^ 0xC9F6] = 0xC9E9 ^ 0xC9F6;
                    hackclient.rise.jp.oo000o00Oo00[0x103E1 ^ 0x10398] = 0x10381 ^ 0x10398;
                    hackclient.rise.jp.oo000o00Oo00[0x6F19 ^ 0x6F4D] = 0x6F42 ^ 0x6F4D;
                    hackclient.rise.jp.oo000o00Oo00[0xB674 ^ 0xB7F6] = 0xB7F9 ^ 0xB7F6;
                    hackclient.rise.jp.oo000o00Oo00[0x1694 ^ 0x164D] = 0x1628 ^ 0x164D;
                    n3 = 205663937;
                    continue block85;
                }
                case 205663937: {
                    hackclient.rise.jp.oo000o00Oo00[0xA004 ^ 0xA0B3] = 0xFFFF5F12 ^ 0xA0B3;
                    hackclient.rise.jp.oo000o00Oo00[0x47D8 ^ 0x46EC] = 0x5FDE ^ 0x46EC;
                    n3 = -814085436;
                    continue block85;
                }
                case -814085436: {
                    hackclient.rise.jp.oo000o00Oo00[0xA0C0 ^ 0xA06E] = 0xA07D ^ 0xA06E;
                    hackclient.rise.jp.oo000o00Oo00[0x2DA4 ^ 0x2D42] = 0x2D57 ^ 0x2D42;
                    hackclient.rise.jp.oo000o00Oo00[0xD05 ^ 0xC44] = 0xC45 ^ 0xC44;
                    hackclient.rise.jp.oo000o00Oo00[0x5439 ^ 0x5507] = 0x5542 ^ 0x5507;
                    hackclient.rise.jp.oo000o00Oo00[0x5C04 ^ 0x5C88] = 0xE05C88 ^ 0x5C88;
                    hackclient.rise.jp.oo000o00Oo00[0x771 ^ 0x7B7] = 0xFFFFF8F8 ^ 0x7B7;
                    n3 = 748911479;
                    continue block85;
                }
                case 748911479: {
                    hackclient.rise.jp.oo000o00Oo00[0xFB7F ^ 0xFA59] = 0xFFFF05A6 ^ 0xFA59;
                    hackclient.rise.jp.oo000o00Oo00[0xB4E6 ^ 0xB5BF] = 0xFFFF4402 ^ 0xB5BF;
                    hackclient.rise.jp.oo000o00Oo00[0xA757 ^ 0xA762] = 0xA76D ^ 0xA762;
                    hackclient.rise.jp.oo000o00Oo00[0xF0C3 ^ 0xF080] = 0xF0E7 ^ 0xF080;
                    hackclient.rise.jp.oo000o00Oo00[0xF9C5 ^ 0xF97B] = 0xFFFF068E ^ 0xF97B;
                    n3 = -1531983417;
                    continue block85;
                }
                case -1531983417: {
                    hackclient.rise.jp.oo000o00Oo00[0x3A10 ^ 0x3A13] = 0x3A13 ^ 0x3A13;
                    n3 = 1267942070;
                    continue block85;
                }
                case 1267942070: {
                    hackclient.rise.jp.oo000o00Oo00[0xAC2 ^ 0xBCF] = 0xFFFFF44E ^ 0xBCF;
                    hackclient.rise.jp.oo000o00Oo00[0x1F35 ^ 0x1E61] = 0xFFFFE19E ^ 0x1E61;
                    hackclient.rise.jp.oo000o00Oo00[0x83CE ^ 0x82FD] = 0xB051 ^ 0x82FD;
                    hackclient.rise.jp.oo000o00Oo00[0xBC5D ^ 0xBCFB] = 0xC859B7EC ^ 0xBCFB;
                    hackclient.rise.jp.oo000o00Oo00[0x7835 ^ 0x782F] = 0xFFFF879E ^ 0x782F;
                    hackclient.rise.jp.oo000o00Oo00[0x9B68 ^ 0x9B5B] = 0x9B5A ^ 0x9B5B;
                    hackclient.rise.jp.oo000o00Oo00[0xFD0A ^ 0xFD40] = 0xFD47 ^ 0xFD40;
                    hackclient.rise.jp.oo000o00Oo00[0x1086B ^ 0x109E4] = 0x109F5 ^ 0x109E4;
                    hackclient.rise.jp.oo000o00Oo00[0x7463 ^ 0x74E4] = 0xFFFCAB52 ^ 0x74E4;
                    hackclient.rise.jp.oo000o00Oo00[0x8D62 ^ 0x8DDA] = 0x8D9F ^ 0x8DDA;
                    n3 = -1112698551;
                    continue block85;
                }
                case -1112698551: {
                    hackclient.rise.jp.oo000o00Oo00[0xF114 ^ 0xF14D] = 0xFFFF0EEE ^ 0xF14D;
                    hackclient.rise.jp.oo000o00Oo00[0x10B1D ^ 0x10A6A] = 0x10A53 ^ 0x10A6A;
                    hackclient.rise.jp.oo000o00Oo00[0x4D20 ^ 0x4C3E] = 0x5CC0A14D ^ 0x4C3E;
                    n3 = -1125753866;
                    continue block85;
                }
                case -1125753866: {
                    hackclient.rise.jp.oo000o00Oo00[0xE2FD ^ 0xE3B5] = 0xFFFF1C1A ^ 0xE3B5;
                    hackclient.rise.jp.oo000o00Oo00[0xFFE1 ^ 0xFFF7] = 0xFFB0 ^ 0xFFF7;
                    hackclient.rise.jp.oo000o00Oo00[0xF411 ^ 0xF4E0] = 0xF5E0 ^ 0xF4E0;
                    hackclient.rise.jp.oo000o00Oo00[0xF27C ^ 0xF3F5] = 0xF386 ^ 0xF3F5;
                    hackclient.rise.jp.oo000o00Oo00[0x1112 ^ 0x1100] = 0x1139 ^ 0x1100;
                    n3 = 1212640371;
                    continue block85;
                }
                case 1212640371: {
                    hackclient.rise.jp.oo000o00Oo00[0xBD63 ^ 0xBDAA] = 0xBDAB ^ 0xBDAA;
                    n3 = 457929203;
                    continue block85;
                }
                case 457929203: {
                    hackclient.rise.jp.oo000o00Oo00[0x8241 ^ 0x8286] = 0x82A7 ^ 0x8286;
                    hackclient.rise.jp.oo000o00Oo00[0x4BB9 ^ 0x4BC7] = 0x677D0D08 ^ 0x4BC7;
                    hackclient.rise.jp.oo000o00Oo00[0x5B0 ^ 0x4DE] = 0x280004AF ^ 0x4DE;
                    hackclient.rise.jp.oo000o00Oo00[0x91AB ^ 0x9092] = 0xFFFF6F6D ^ 0x9092;
                    hackclient.rise.jp.oo000o00Oo00[0xACA8 ^ 0xACBD] = 0xACBA ^ 0xACBD;
                    hackclient.rise.jp.oo000o00Oo00[0x9ED3 ^ 0x9F9E] = 0x9F9D ^ 0x9F9E;
                    n3 = 62025529;
                    continue block85;
                }
                case 62025529: {
                    hackclient.rise.jp.oo000o00Oo00[0xF724 ^ 0xF7EB] = 0xFFFF0846 ^ 0xF7EB;
                    hackclient.rise.jp.oo000o00Oo00[0x5449 ^ 0x547E] = 0x9902A56A ^ 0x547E;
                    hackclient.rise.jp.oo000o00Oo00[0xF082 ^ 0xF0CB] = 0xF0D0 ^ 0xF0CB;
                    hackclient.rise.jp.oo000o00Oo00[0xEAE8 ^ 0xEAB7] = 0xEB0D ^ 0xEAB7;
                    hackclient.rise.jp.oo000o00Oo00[0x77CB ^ 0x7707] = 0x7710 ^ 0x7707;
                    hackclient.rise.jp.oo000o00Oo00[0xCF71 ^ 0xCF5E] = 0x42104B7F ^ 0xCF5E;
                    n3 = -813356495;
                    continue block85;
                }
                case -813356495: {
                    hackclient.rise.jp.oo000o00Oo00[0x8D23 ^ 0x8D7D] = 0xFFFF7282 ^ 0x8D7D;
                    return;
                }
                default: {
                    hackclient.rise.jp.oo000o00Oo00[0x218 ^ 0x33D] = 0x360 ^ 0x33D;
                    n3 = -146315579;
                    continue block85;
                }
                case -146315579: {
                    hackclient.rise.jp.oo000o00Oo00[0x22F7 ^ 0x23D3] = 0x2396 ^ 0x23D3;
                    hackclient.rise.jp.oo000o00Oo00[0x104A3 ^ 0x104CB] = 0x400104AE ^ 0x104CB;
                    hackclient.rise.jp.oo000o00Oo00[0xEA2D ^ 0xEA91] = 0xEA86 ^ 0xEA91;
                    hackclient.rise.jp.oo000o00Oo00[0x80FD ^ 0x81C0] = 0x81C0 ^ 0x81C0;
                    hackclient.rise.jp.oo000o00Oo00[0xD468 ^ 0xD526] = 0xD53B ^ 0xD526;
                    hackclient.rise.jp.oo000o00Oo00[0x1292 ^ 0x13A4] = 0x13A0 ^ 0x13A4;
                    hackclient.rise.jp.oo000o00Oo00[0x466 ^ 0x47D] = 0x468 ^ 0x47D;
                    hackclient.rise.jp.oo000o00Oo00[0x62C6 ^ 0x63CD] = 0xFFFF9CF0 ^ 0x63CD;
                    hackclient.rise.jp.oo000o00Oo00[0x1D7C ^ 0x1C49] = 0x1C45 ^ 0x1C49;
                    hackclient.rise.jp.oo000o00Oo00[0x10E14 ^ 0x10E0C] = 0xFFFEF60D ^ 0x10E0C;
                    hackclient.rise.jp.oo000o00Oo00[0x1F2E ^ 0x1E64] = 0xFFFFE19B ^ 0x1E64;
                    hackclient.rise.jp.oo000o00Oo00[0x1896 ^ 0x18CA] = 0x18C6 ^ 0x18CA;
                    n3 = -1937594912;
                    continue block85;
                }
                case -1937594912: {
                    hackclient.rise.jp.oo000o00Oo00[0xBD52 ^ 0xBDB6] = 0xFFFF426F ^ 0xBDB6;
                    n3 = 2045904014;
                    continue block85;
                }
                case 2045904014: {
                    hackclient.rise.jp.oo000o00Oo00[0x12BA ^ 0x13EB] = 0x1CDA ^ 0x13EB;
                    hackclient.rise.jp.oo000o00Oo00[0xE0C ^ 0xF3E] = 0x11C9 ^ 0xF3E;
                    hackclient.rise.jp.oo000o00Oo00[0x3CA2 ^ 0x3C72] = 0xC7A5EA51 ^ 0x3C72;
                    hackclient.rise.jp.oo000o00Oo00[0xEE3 ^ 0xEB8] = 0xEAB ^ 0xEB8;
                    hackclient.rise.jp.oo000o00Oo00[0x10C70 ^ 0x10CDD] = 0x10CCC ^ 0x10CDD;
                    hackclient.rise.jp.oo000o00Oo00[0xFF39 ^ 0xFFBA] = 0xFFBD ^ 0xFFBA;
                    hackclient.rise.jp.oo000o00Oo00[0xB82F ^ 0xB864] = 0xB87D ^ 0xB864;
                    hackclient.rise.jp.oo000o00Oo00[0xECA4 ^ 0xEC2D] = 0xFFFF13B8 ^ 0xEC2D;
                    n3 = -1271464339;
                    continue block85;
                }
                case -1271464339: {
                    hackclient.rise.jp.oo000o00Oo00[0x6F67 ^ 0x6E64] = 0x6E69 ^ 0x6E64;
                    hackclient.rise.jp.oo000o00Oo00[0xA8E3 ^ 0xA87F] = 0xA86C ^ 0xA87F;
                    hackclient.rise.jp.oo000o00Oo00[0x4002 ^ 0x403C] = 0x402B ^ 0x403C;
                    n3 = 1052385876;
                    continue block85;
                }
                case 1052385876: {
                    hackclient.rise.jp.oo000o00Oo00[0x5EB ^ 0x517] = 0xFFFFFAA2 ^ 0x517;
                    n3 = 1524500253;
                    continue block85;
                }
                case 1524500253: {
                    hackclient.rise.jp.oo000o00Oo00[0x6DC4 ^ 0x6D7B] = 0x6D6A ^ 0x6D7B;
                    hackclient.rise.jp.oo000o00Oo00[0xE6C ^ 0xE3E] = 0xE2B ^ 0xE3E;
                    hackclient.rise.jp.oo000o00Oo00[0x5DEC ^ 0x5D4F] = 0x5D4E ^ 0x5D4F;
                    hackclient.rise.jp.oo000o00Oo00[0xFC7C ^ 0xFC88] = 0xFFFF0377 ^ 0xFC88;
                    hackclient.rise.jp.oo000o00Oo00[0x6169 ^ 0x6018] = 0x600F ^ 0x6018;
                    hackclient.rise.jp.oo000o00Oo00[0xC34B ^ 0xC396] = 0xFFFF3CA1 ^ 0xC396;
                    hackclient.rise.jp.oo000o00Oo00[0xAA8E ^ 0xABEE] = 0xABE7 ^ 0xABEE;
                    hackclient.rise.jp.oo000o00Oo00[0xED14 ^ 0xEDD7] = 0xED80 ^ 0xEDD7;
                    hackclient.rise.jp.oo000o00Oo00[0x47AE ^ 0x4740] = 0xFFFFB897 ^ 0x4740;
                    hackclient.rise.jp.oo000o00Oo00[0xD177 ^ 0xD196] = 0xD195 ^ 0xD196;
                    hackclient.rise.jp.oo000o00Oo00[0x5F4F ^ 0x5FC9] = 0x5FC6 ^ 0x5FC9;
                    n3 = 924115722;
                    continue block85;
                }
                case 924115722: {
                    hackclient.rise.jp.oo000o00Oo00[0xDEB7 ^ 0xDFA8] = 0x1DFE3 ^ 0xDFA8;
                    hackclient.rise.jp.oo000o00Oo00[0x4E95 ^ 0x4E34] = 0x4E3D ^ 0x4E34;
                    hackclient.rise.jp.oo000o00Oo00[0x9F5F ^ 0x9FEE] = 0x9F9B ^ 0x9FEE;
                    hackclient.rise.jp.oo000o00Oo00[0xD4A9 ^ 0xD459] = 0xD470 ^ 0xD459;
                    hackclient.rise.jp.oo000o00Oo00[0xAAA4 ^ 0xABDA] = 0xFFFF5453 ^ 0xABDA;
                    hackclient.rise.jp.oo000o00Oo00[0x7387 ^ 0x72CE] = 0x72FF ^ 0x72CE;
                    n3 = -1553272515;
                    continue block85;
                }
                case -1553272515: {
                    hackclient.rise.jp.oo000o00Oo00[0xBED2 ^ 0xBEA3] = 0xBEA7 ^ 0xBEA3;
                    hackclient.rise.jp.oo000o00Oo00[0xF761 ^ 0xF7BD] = 0xFFFF084A ^ 0xF7BD;
                    hackclient.rise.jp.oo000o00Oo00[0xC0A2 ^ 0xC183] = 0xC196 ^ 0xC183;
                    hackclient.rise.jp.oo000o00Oo00[0xC655 ^ 0xC779] = 0xC779 ^ 0xC779;
                    hackclient.rise.jp.oo000o00Oo00[0xC3AD ^ 0xC38C] = 0xC381 ^ 0xC38C;
                    hackclient.rise.jp.oo000o00Oo00[0xE686 ^ 0xE699] = 0xA0BE4EB6 ^ 0xE699;
                    n3 = -746688080;
                    continue block85;
                }
                case -746688080: {
                    hackclient.rise.jp.oo000o00Oo00[0x58A6 ^ 0x59F5] = 0xFFFFA64C ^ 0x59F5;
                    hackclient.rise.jp.oo000o00Oo00[0x43DE ^ 0x42DC] = 0xFFFFBD19 ^ 0x42DC;
                    hackclient.rise.jp.oo000o00Oo00[0x2EF9 ^ 0x2E1C] = 0xFFFFD1D1 ^ 0x2E1C;
                    hackclient.rise.jp.oo000o00Oo00[0xAEFF ^ 0xAEB3] = 0xFFFF5130 ^ 0xAEB3;
                    hackclient.rise.jp.oo000o00Oo00[0x7799 ^ 0x76B6] = 0x76BD ^ 0x76B6;
                    hackclient.rise.jp.oo000o00Oo00[0x6139 ^ 0x611D] = 0xFFFF9EC8 ^ 0x611D;
                    hackclient.rise.jp.oo000o00Oo00[0xCD3D ^ 0xCD94] = 0xFFFF3219 ^ 0xCD94;
                    hackclient.rise.jp.oo000o00Oo00[0x1756 ^ 0x1760] = 0x1771 ^ 0x1760;
                    hackclient.rise.jp.oo000o00Oo00[0x8838 ^ 0x891F] = 0x8908 ^ 0x891F;
                    hackclient.rise.jp.oo000o00Oo00[0xBEA4 ^ 0xBECE] = 0xBED3 ^ 0xBECE;
                    hackclient.rise.jp.oo000o00Oo00[0xD3A9 ^ 0xD33D] = 0xEB2F0D8E ^ 0xD33D;
                    hackclient.rise.jp.oo000o00Oo00[0x518B ^ 0x50BA] = 0x302E ^ 0x50BA;
                    hackclient.rise.jp.oo000o00Oo00[0x14F3 ^ 0x146E] = 0x1433 ^ 0x146E;
                    hackclient.rise.jp.oo000o00Oo00[0x1288 ^ 0x13B4] = 0x62E8 ^ 0x13B4;
                    hackclient.rise.jp.oo000o00Oo00[0x6DCB ^ 0x6D7F] = 0xFFFF92DA ^ 0x6D7F;
                    hackclient.rise.jp.oo000o00Oo00[0x8D12 ^ 0x8DF1] = 0x8DD8 ^ 0x8DF1;
                    hackclient.rise.jp.oo000o00Oo00[0xA411 ^ 0xA570] = 0x44A570 ^ 0xA570;
                    hackclient.rise.jp.oo000o00Oo00[0xE419 ^ 0xE565] = 0xFFFF1AD2 ^ 0xE565;
                    hackclient.rise.jp.oo000o00Oo00[0x1726 ^ 0x1620] = 0x1621 ^ 0x1620;
                    hackclient.rise.jp.oo000o00Oo00[0xF689 ^ 0xF6DC] = 0xF6CD ^ 0xF6DC;
                    n3 = 1074764184;
                    continue block85;
                }
                case 1074764184: {
                    hackclient.rise.jp.oo000o00Oo00[0x596F ^ 0x59ED] = 0x59F4 ^ 0x59ED;
                    hackclient.rise.jp.oo000o00Oo00[0x3BB2 ^ 0x3BCE] = 0xFFFFC41F ^ 0x3BCE;
                    hackclient.rise.jp.oo000o00Oo00[0x257F ^ 0x25A0] = 0x25A5 ^ 0x25A0;
                    hackclient.rise.jp.oo000o00Oo00[0xF50B ^ 0xF509] = 0xFFFF0AF6 ^ 0xF509;
                    hackclient.rise.jp.oo000o00Oo00[0x7A15 ^ 0x7B15] = 0x7B58 ^ 0x7B15;
                    n3 = -2117236169;
                    continue block85;
                }
                case -2117236169: {
                    hackclient.rise.jp.oo000o00Oo00[0x64EC ^ 0x65C1] = 0x3BE2 ^ 0x65C1;
                    n3 = -1461896775;
                    continue block85;
                }
                case -1461896775: {
                    hackclient.rise.jp.oo000o00Oo00[0xC477 ^ 0xC4A3] = 0xFFFDEC5B ^ 0xC4A3;
                    hackclient.rise.jp.oo000o00Oo00[0x8AE4 ^ 0x8AED] = 0x8AEE ^ 0x8AED;
                    n3 = 684293283;
                    continue block85;
                }
                case 684293283: {
                    hackclient.rise.jp.oo000o00Oo00[0xE217 ^ 0xE300] = 0xFFFF1CD3 ^ 0xE300;
                    hackclient.rise.jp.oo000o00Oo00[0xED1 ^ 0xE46] = 0xE5B ^ 0xE46;
                    hackclient.rise.jp.oo000o00Oo00[0x57D0 ^ 0x5708] = 0xFFFFADAF ^ 0x5708;
                    hackclient.rise.jp.oo000o00Oo00[0xC559 ^ 0xC45E] = 0xC441 ^ 0xC45E;
                    hackclient.rise.jp.oo000o00Oo00[0x23B4 ^ 0x22A7] = 0x22B4 ^ 0x22A7;
                    hackclient.rise.jp.oo000o00Oo00[0x8E68 ^ 0x8F62] = 0x3038C61 ^ 0x8F62;
                    hackclient.rise.jp.oo000o00Oo00[0x123E ^ 0x128C] = 0x690682E5 ^ 0x128C;
                    n3 = 116731085;
                    continue block85;
                }
                case 116731085: {
                    hackclient.rise.jp.oo000o00Oo00[0x1E26 ^ 0x1F27] = 0x8681DF27 ^ 0x1F27;
                    hackclient.rise.jp.oo000o00Oo00[0x564E ^ 0x567E] = 0x566B ^ 0x567E;
                    hackclient.rise.jp.oo000o00Oo00[0xD6D6 ^ 0xD7FC] = 0xD7FC ^ 0xD7FC;
                    hackclient.rise.jp.oo000o00Oo00[0xF24B ^ 0xF257] = 0xF256 ^ 0xF257;
                    hackclient.rise.jp.oo000o00Oo00[0x6CC8 ^ 0x6CAC] = 0x6CE7 ^ 0x6CAC;
                    n3 = 450698090;
                    continue block85;
                }
                case 450698090: {
                    hackclient.rise.jp.oo000o00Oo00[0x1E7E ^ 0x1E47] = 0x1E10 ^ 0x1E47;
                    n3 = 1889851806;
                    continue block85;
                }
                case 1889851806: {
                    hackclient.rise.jp.oo000o00Oo00[0xC1C3 ^ 0xC0FC] = 0xFFFF3F37 ^ 0xC0FC;
                    hackclient.rise.jp.oo000o00Oo00[0xCBEA ^ 0xCBE2] = 0xFFFF3443 ^ 0xCBE2;
                    hackclient.rise.jp.oo000o00Oo00[0x4222 ^ 0x43AC] = 0x43A3 ^ 0x43AC;
                    n3 = -585442182;
                    continue block85;
                }
                case -585442182: {
                    hackclient.rise.jp.oo000o00Oo00[0x31F ^ 0x313] = 0x3F03F32C ^ 0x313;
                    n3 = -48110963;
                    continue block85;
                }
                case -48110963: {
                    hackclient.rise.jp.oo000o00Oo00[0x8EDF ^ 0x8F8D] = 0x8FF8 ^ 0x8F8D;
                    n3 = -1947182130;
                    continue block85;
                }
                case -1947182130: {
                    hackclient.rise.jp.oo000o00Oo00[0xF82C ^ 0xF8FE] = 0xF8CB ^ 0xF8FE;
                    n3 = -809636509;
                    continue block85;
                }
                case -809636509: {
                    hackclient.rise.jp.oo000o00Oo00[0xF3DF ^ 0xF289] = 0xFFFF0D69 ^ 0xF289;
                    hackclient.rise.jp.oo000o00Oo00[0x4EF5 ^ 0x4FA9] = 0xFA9 ^ 0x4FA9;
                    hackclient.rise.jp.oo000o00Oo00[0x9FB4 ^ 0x9F7F] = 0xEAF0BEA6 ^ 0x9F7F;
                    hackclient.rise.jp.oo000o00Oo00[0x2568 ^ 0x25A8] = 0xEE025A8 ^ 0x25A8;
                    n3 = 1292719847;
                    continue block85;
                }
                case 1292719847: {
                    hackclient.rise.jp.oo000o00Oo00[0xCAA8 ^ 0xCA47] = 0xFFFF35B8 ^ 0xCA47;
                    hackclient.rise.jp.oo000o00Oo00[0x1166 ^ 0x11F3] = 0xCCCCDD6F ^ 0x11F3;
                    hackclient.rise.jp.oo000o00Oo00[0xB59F ^ 0xB48F] = 0xB482 ^ 0xB48F;
                    hackclient.rise.jp.oo000o00Oo00[0x3D2E ^ 0x3DA4] = 0x3DA9 ^ 0x3DA4;
                    hackclient.rise.jp.oo000o00Oo00[0x9AEC ^ 0x9B68] = 0xFFFF64C5 ^ 0x9B68;
                    n3 = -1214928214;
                    continue block85;
                }
                case -1214928214: {
                    hackclient.rise.jp.oo000o00Oo00[0x1311 ^ 0x1268] = 0x9E0D492D ^ 0x1268;
                    hackclient.rise.jp.oo000o00Oo00[0x41C9 ^ 0x41CF] = 0x41DA ^ 0x41CF;
                    hackclient.rise.jp.oo000o00Oo00[0xDEFB ^ 0xDE35] = 0xDE4C ^ 0xDE35;
                    hackclient.rise.jp.oo000o00Oo00[0xC820 ^ 0xC827] = 0xFFFF3786 ^ 0xC827;
                    hackclient.rise.jp.oo000o00Oo00[0x8302 ^ 0x83F8] = 0x83E9 ^ 0x83F8;
                    hackclient.rise.jp.oo000o00Oo00[0x7086 ^ 0x7075] = 0x7072 ^ 0x7075;
                    hackclient.rise.jp.oo000o00Oo00[0xEEDB ^ 0xEEA9] = 0xEEA8 ^ 0xEEA9;
                    hackclient.rise.jp.oo000o00Oo00[0x1F4E ^ 0x1E3E] = 0x1E37 ^ 0x1E3E;
                    n3 = -879542835;
                    continue block85;
                }
                case -879542835: {
                    hackclient.rise.jp.oo000o00Oo00[0xBF8C ^ 0xBE84] = 0xBEB5 ^ 0xBE84;
                    hackclient.rise.jp.oo000o00Oo00[0x8276 ^ 0x834E] = 0xE519 ^ 0x834E;
                    hackclient.rise.jp.oo000o00Oo00[0xCFAB ^ 0xCF42] = 0xFFFF30AD ^ 0xCF42;
                    hackclient.rise.jp.oo000o00Oo00[0xB6F ^ 0xB98] = 0xB8D ^ 0xB98;
                    hackclient.rise.jp.oo000o00Oo00[0x589E ^ 0x5913] = 0xFFFFA6A2 ^ 0x5913;
                    hackclient.rise.jp.oo000o00Oo00[0x57C6 ^ 0x574B] = 0x5746 ^ 0x574B;
                    hackclient.rise.jp.oo000o00Oo00[0x372E ^ 0x3670] = 0x366B ^ 0x3670;
                    hackclient.rise.jp.oo000o00Oo00[0xD541 ^ 0xD5B3] = 0xD5AA ^ 0xD5B3;
                    hackclient.rise.jp.oo000o00Oo00[0xFFC ^ 0xE98] = 0xF0F0197 ^ 0xE98;
                    hackclient.rise.jp.oo000o00Oo00[0x396E ^ 0x3919] = 0x3954 ^ 0x3919;
                    hackclient.rise.jp.oo000o00Oo00[0x672F ^ 0x67B7] = 0xFFFF984C ^ 0x67B7;
                    hackclient.rise.jp.oo000o00Oo00[0x10572 ^ 0x105A3] = 0x105A0 ^ 0x105A3;
                    hackclient.rise.jp.oo000o00Oo00[0x28DA ^ 0x2878] = 0x286F ^ 0x2878;
                    hackclient.rise.jp.oo000o00Oo00[0xE90D ^ 0xE861] = 0xE800 ^ 0xE861;
                    n3 = 2076305658;
                    continue block85;
                }
                case 2076305658: {
                    hackclient.rise.jp.oo000o00Oo00[0x103E0 ^ 0x103A8] = 0x103AD ^ 0x103A8;
                    hackclient.rise.jp.oo000o00Oo00[0x3209 ^ 0x32F2] = 0x32FD ^ 0x32F2;
                    hackclient.rise.jp.oo000o00Oo00[0xC1BD ^ 0xC11A] = 0xFFFF3EE5 ^ 0xC11A;
                    hackclient.rise.jp.oo000o00Oo00[0xEB42 ^ 0xEB36] = 0xEB37 ^ 0xEB36;
                    n3 = -531781632;
                    continue block85;
                }
                case -531781632: {
                    hackclient.rise.jp.oo000o00Oo00[0x9D84 ^ 0x9D80] = 0xFFFF622D ^ 0x9D80;
                    hackclient.rise.jp.oo000o00Oo00[0x5CBF ^ 0x5CA1] = 0xFFFFA35E ^ 0x5CA1;
                    hackclient.rise.jp.oo000o00Oo00[0x9584 ^ 0x95B6] = 0x690605DF ^ 0x95B6;
                    hackclient.rise.jp.oo000o00Oo00[0xF245 ^ 0xF2B8] = 0xFFFF0D37 ^ 0xF2B8;
                    hackclient.rise.jp.oo000o00Oo00[0xA606 ^ 0xA67B] = 0xFFFF59AA ^ 0xA67B;
                    n3 = -998099399;
                    continue block85;
                }
                case -998099399: {
                    hackclient.rise.jp.oo000o00Oo00[0xBD0C ^ 0xBC17] = 0xBC00 ^ 0xBC17;
                    hackclient.rise.jp.oo000o00Oo00[0x2006 ^ 0x2006] = 0xFFFFDFF8 ^ 0x2006;
                    hackclient.rise.jp.oo000o00Oo00[0x107E1 ^ 0x10699] = 0xFFFEF956 ^ 0x10699;
                    hackclient.rise.jp.oo000o00Oo00[0x1D12 ^ 0x1DF8] = 0x1DF9 ^ 0x1DF8;
                    hackclient.rise.jp.oo000o00Oo00[0x8879 ^ 0x891E] = 0xFFFF7600 ^ 0x891E;
                    hackclient.rise.jp.oo000o00Oo00[0xC575 ^ 0xC56C] = 0xE9BDF2CB ^ 0xC56C;
                    hackclient.rise.jp.oo000o00Oo00[0xCBB9 ^ 0xCBBC] = 0xCBB7 ^ 0xCBBC;
                    hackclient.rise.jp.oo000o00Oo00[0x82D2 ^ 0x83F2] = 0x83B9 ^ 0x83F2;
                    hackclient.rise.jp.oo000o00Oo00[0x5F21 ^ 0x5EAA] = 0x5EBD ^ 0x5EAA;
                    hackclient.rise.jp.oo000o00Oo00[0xE614 ^ 0xE652] = 0xFFFF19F5 ^ 0xE652;
                    hackclient.rise.jp.oo000o00Oo00[0xCFCE ^ 0xCF6A] = 0xCF6F ^ 0xCF6A;
                    n3 = 884119000;
                    continue block85;
                }
                case 884119000: {
                    hackclient.rise.jp.oo000o00Oo00[0x2E0C ^ 0x2E73] = 0x2002E16 ^ 0x2E73;
                    hackclient.rise.jp.oo000o00Oo00[0xD600 ^ 0xD685] = 0x83CD9816 ^ 0xD685;
                    hackclient.rise.jp.oo000o00Oo00[0x6308 ^ 0x6211] = 0xFFFF9DFC ^ 0x6211;
                    hackclient.rise.jp.oo000o00Oo00[0x4C57 ^ 0x4CC6] = 0x4CC6 ^ 0x4CC6;
                    hackclient.rise.jp.oo000o00Oo00[0x62B8 ^ 0x6284] = 0x60E7 ^ 0x6284;
                    hackclient.rise.jp.oo000o00Oo00[0xB1FB ^ 0xB148] = 0x6257657C ^ 0xB148;
                    hackclient.rise.jp.oo000o00Oo00[0x3D2F ^ 0x3D22] = 0xFFFFC2D1 ^ 0x3D22;
                    hackclient.rise.jp.oo000o00Oo00[0xD1B8 ^ 0xD0D0] = 0xFFFF2F2F ^ 0xD0D0;
                    hackclient.rise.jp.oo000o00Oo00[0x3CA3 ^ 0x3CC0] = 0xFFFFC36D ^ 0x3CC0;
                    hackclient.rise.jp.oo000o00Oo00[0xF0B1 ^ 0xF1E1] = 0xF1EC ^ 0xF1E1;
                    hackclient.rise.jp.oo000o00Oo00[0x5C28 ^ 0x5C0E] = 0xFFFFA3F1 ^ 0x5C0E;
                    n3 = 1297818235;
                    continue block85;
                }
                case 1297818235: {
                    hackclient.rise.jp.oo000o00Oo00[0x8E92 ^ 0x8E8F] = 0xFFFF7170 ^ 0x8E8F;
                    hackclient.rise.jp.oo000o00Oo00[0xB71E ^ 0xB7C0] = 0xFFFF485F ^ 0xB7C0;
                    hackclient.rise.jp.oo000o00Oo00[0x7145 ^ 0x716E] = 0xFFFF8EDB ^ 0x716E;
                    hackclient.rise.jp.oo000o00Oo00[0xE55 ^ 0xEBD] = 0xFFFFF142 ^ 0xEBD;
                    hackclient.rise.jp.oo000o00Oo00[0x1021B ^ 0x10248] = 0x10243 ^ 0x10248;
                    hackclient.rise.jp.oo000o00Oo00[0x89DE ^ 0x8892] = 0xFFFF776D ^ 0x8892;
                    n3 = -962224587;
                    continue block85;
                }
                case -962224587: {
                    hackclient.rise.jp.oo000o00Oo00[0x2EE3 ^ 0x2EA2] = 0x34319BCD ^ 0x2EA2;
                    n3 = -1966571538;
                    continue block85;
                }
                case -1966571538: {
                    hackclient.rise.jp.oo000o00Oo00[0xA503 ^ 0xA40D] = 0xFC00A450 ^ 0xA40D;
                    n3 = -1912654190;
                    continue block85;
                }
                case -1912654190: {
                    hackclient.rise.jp.oo000o00Oo00[0x6B08 ^ 0x6B1B] = 0x90006B1A ^ 0x6B1B;
                    n3 = -438189603;
                    continue block85;
                }
                case -438189603: {
                    hackclient.rise.jp.oo000o00Oo00[0x9CBA ^ 0x9DA8] = 0x9DA5 ^ 0x9DA8;
                    hackclient.rise.jp.oo000o00Oo00[0x4C6 ^ 0x41D] = 0x40A ^ 0x41D;
                    hackclient.rise.jp.oo000o00Oo00[0x87DB ^ 0x86A1] = 0xFFFF792C ^ 0x86A1;
                    hackclient.rise.jp.oo000o00Oo00[0x550E ^ 0x546D] = 0x5460 ^ 0x546D;
                    n3 = -187316707;
                    continue block85;
                }
                case -187316707: {
                    hackclient.rise.jp.oo000o00Oo00[0x1046E ^ 0x104CB] = 0x104D0 ^ 0x104CB;
                    hackclient.rise.jp.oo000o00Oo00[0x4F8F ^ 0x4FD2] = 0xFFFFB021 ^ 0x4FD2;
                    hackclient.rise.jp.oo000o00Oo00[0x666C ^ 0x6728] = 0x672D ^ 0x6728;
                    hackclient.rise.jp.oo000o00Oo00[0xD82D ^ 0xD80D] = 0xD81E ^ 0xD80D;
                    hackclient.rise.jp.oo000o00Oo00[0x2271 ^ 0x22F0] = 0xFFFFDD27 ^ 0x22F0;
                    hackclient.rise.jp.oo000o00Oo00[0x7887 ^ 0x781C] = 0x7811 ^ 0x781C;
                    hackclient.rise.jp.oo000o00Oo00[0x100D1 ^ 0x100DA] = 0x100DA ^ 0x100DA;
                    hackclient.rise.jp.oo000o00Oo00[0x5ABA ^ 0x5B8A] = 0x5B8F ^ 0x5B8A;
                    n3 = 37431538;
                    continue block85;
                }
                case 37431538: {
                    hackclient.rise.jp.oo000o00Oo00[0x67EB ^ 0x6743] = 0x5B05D718 ^ 0x6743;
                    n3 = 1159298627;
                    continue block85;
                }
                case 1159298627: {
                    hackclient.rise.jp.oo000o00Oo00[0x84EC ^ 0x84C9] = 0x84C9 ^ 0x84C9;
                    hackclient.rise.jp.oo000o00Oo00[0xCEA8 ^ 0xCFA4] = 0xCFE7 ^ 0xCFA4;
                    hackclient.rise.jp.oo000o00Oo00[0x7116 ^ 0x712C] = 0x712D ^ 0x712C;
                    hackclient.rise.jp.oo000o00Oo00[0x192C ^ 0x1905] = 0x201979 ^ 0x1905;
                    n3 = 273710797;
                    continue block85;
                }
                case 273710797: {
                    hackclient.rise.jp.oo000o00Oo00[0x16BF ^ 0x16C4] = 0xFFFFE923 ^ 0x16C4;
                    n3 = 586368148;
                    continue block85;
                }
                case 586368148: {
                    hackclient.rise.jp.oo000o00Oo00[0xA6DE ^ 0xA784] = 0xFFFF5819 ^ 0xA784;
                    hackclient.rise.jp.oo000o00Oo00[0x523F ^ 0x5265] = 0x5268 ^ 0x5265;
                    hackclient.rise.jp.oo000o00Oo00[0xD654 ^ 0xD751] = 0xBF5A561A ^ 0xD751;
                    hackclient.rise.jp.oo000o00Oo00[0x1039B ^ 0x1039A] = 0xFFFEFC65 ^ 0x1039A;
                    n3 = -1813577650;
                    continue block85;
                }
                case -1813577650: {
                    hackclient.rise.jp.oo000o00Oo00[0x4D09 ^ 0x4DA6] = 0x4DAB ^ 0x4DA6;
                    hackclient.rise.jp.oo000o00Oo00[0xC7C8 ^ 0xC705] = 0xC70C ^ 0xC705;
                    hackclient.rise.jp.oo000o00Oo00[0xC08A ^ 0xC0A2] = 0xFFFF3F4B ^ 0xC0A2;
                    n3 = 1495226040;
                    continue block85;
                }
                case 1495226040: {
                    hackclient.rise.jp.oo000o00Oo00[0xA359 ^ 0xA3A7] = 0x3F2B9BBB ^ 0xA3A7;
                    hackclient.rise.jp.oo000o00Oo00[0x106F3 ^ 0x107C9] = 0x107C0 ^ 0x107C9;
                    hackclient.rise.jp.oo000o00Oo00[0x74B3 ^ 0x743B] = 0xFFFF8BE6 ^ 0x743B;
                    hackclient.rise.jp.oo000o00Oo00[0x1304 ^ 0x1219] = 0xFFFFEDE6 ^ 0x1219;
                    hackclient.rise.jp.oo000o00Oo00[0x10AE1 ^ 0x10BDA] = 0x10BDD ^ 0x10BDA;
                    hackclient.rise.jp.oo000o00Oo00[0xEC6C ^ 0xEC7C] = 0x306E5F9A ^ 0xEC7C;
                    hackclient.rise.jp.oo000o00Oo00[0xBC0 ^ 0xB8E] = 0x185E ^ 0xB8E;
                    hackclient.rise.jp.oo000o00Oo00[0x10B8B ^ 0x10A0C] = 0x10A1D ^ 0x10A0C;
                    hackclient.rise.jp.oo000o00Oo00[0xD11F ^ 0xD152] = 0xD143 ^ 0xD152;
                    n3 = -1774334008;
                    continue block85;
                }
                case -1774334008: {
                    hackclient.rise.jp.oo000o00Oo00[0x4C2F ^ 0x4C6A] = 0xFFFFB3F5 ^ 0x4C6A;
                    n3 = -1436127171;
                    continue block85;
                }
                case -1436127171: {
                    hackclient.rise.jp.oo000o00Oo00[0xB208 ^ 0xB31C] = 0xB318 ^ 0xB31C;
                    n3 = 2006633721;
                    continue block85;
                }
                case 2006633721: {
                    hackclient.rise.jp.oo000o00Oo00[0xF0E2 ^ 0xF162] = 0xF6C03AA3 ^ 0xF162;
                    n3 = -130149520;
                    continue block85;
                }
                case -130149520: {
                    hackclient.rise.jp.oo000o00Oo00[0x1CEB ^ 0x1CDF] = 0xFFFFE320 ^ 0x1CDF;
                    n3 = 613515492;
                    continue block85;
                }
                case 613515492: {
                    hackclient.rise.jp.oo000o00Oo00[0x10CD5 ^ 0x10C9A] = 0x10CF1 ^ 0x10C9A;
                    hackclient.rise.jp.oo000o00Oo00[0xAA05 ^ 0xAB70] = 0xAB65 ^ 0xAB70;
                    hackclient.rise.jp.oo000o00Oo00[0x102AB ^ 0x10296] = 0x102D9 ^ 0x10296;
                    n3 = -735374370;
                    continue block85;
                }
                case -735374370: {
                    hackclient.rise.jp.oo000o00Oo00[0x9CBA ^ 0x9DC1] = 0x9DDE ^ 0x9DC1;
                    hackclient.rise.jp.oo000o00Oo00[0x6179 ^ 0x6026] = 0x6031 ^ 0x6026;
                    hackclient.rise.jp.oo000o00Oo00[0x6813 ^ 0x6831] = 0x682A ^ 0x6831;
                    n3 = 571034450;
                    continue block85;
                }
                case 571034450: {
                    hackclient.rise.jp.oo000o00Oo00[0xAFA0 ^ 0xAEE5] = 0xAEFE ^ 0xAEE5;
                    hackclient.rise.jp.oo000o00Oo00[0xAF0B ^ 0xAFCF] = 0xAFD4 ^ 0xAFCF;
                    hackclient.rise.jp.oo000o00Oo00[0xB8EE ^ 0xB983] = 0xFFFF4602 ^ 0xB983;
                    n3 = 1496509648;
                    continue block85;
                }
                case 1496509648: {
                    hackclient.rise.jp.oo000o00Oo00[0x51D6 ^ 0x51FB] = 0x51EE ^ 0x51FB;
                    hackclient.rise.jp.oo000o00Oo00[0x8783 ^ 0x871D] = 0xFFFF78E2 ^ 0x871D;
                    n3 = 1817047513;
                    continue block85;
                }
                case 1817047513: {
                    hackclient.rise.jp.oo000o00Oo00[0x53AD ^ 0x5286] = 0x5286 ^ 0x5286;
                    hackclient.rise.jp.oo000o00Oo00[0x5D9A ^ 0x5DAB] = 0x5DA0 ^ 0x5DAB;
                    hackclient.rise.jp.oo000o00Oo00[0xF257 ^ 0xF2A2] = 0x1A2A2 ^ 0xF2A2;
                    hackclient.rise.jp.oo000o00Oo00[0xAB31 ^ 0xAA64] = 0xEFDF151B ^ 0xAA64;
                    hackclient.rise.jp.oo000o00Oo00[0x10A8B ^ 0x10AB3] = 0x10AEC ^ 0x10AB3;
                    hackclient.rise.jp.oo000o00Oo00[0x71C0 ^ 0x7152] = 0xA7903B2B ^ 0x7152;
                    hackclient.rise.jp.oo000o00Oo00[0xF3D7 ^ 0xF30D] = 0x3EF39BE6 ^ 0xF30D;
                    hackclient.rise.jp.oo000o00Oo00[0x9E0 ^ 0x989] = 0x9EE ^ 0x989;
                    hackclient.rise.jp.oo000o00Oo00[0x4679 ^ 0x4713] = 0xFFFFB8C2 ^ 0x4713;
                    hackclient.rise.jp.oo000o00Oo00[0x9E19 ^ 0x9F6B] = 0xFFFF6094 ^ 0x9F6B;
                    hackclient.rise.jp.oo000o00Oo00[0xF586 ^ 0xF403] = 0x798B9403 ^ 0xF403;
                    hackclient.rise.jp.oo000o00Oo00[0x2BCE ^ 0x2B6E] = 0xFFFFD491 ^ 0x2B6E;
                    hackclient.rise.jp.oo000o00Oo00[0x62AF ^ 0x63EC] = 0xEFDFDC93 ^ 0x63EC;
                    hackclient.rise.jp.oo000o00Oo00[0xCF68 ^ 0xCEE4] = 0x8341690F ^ 0xCEE4;
                    hackclient.rise.jp.oo000o00Oo00[0x9888 ^ 0x9823] = 0x9783 ^ 0x9823;
                    hackclient.rise.jp.oo000o00Oo00[0x203B ^ 0x2057] = 0xFFFFDFB4 ^ 0x2057;
                    hackclient.rise.jp.oo000o00Oo00[0xBBE5 ^ 0xBB30] = 0x677DFDFF ^ 0xBB30;
                    hackclient.rise.jp.oo000o00Oo00[0x7552 ^ 0x75C8] = 0xBB5C8 ^ 0x75C8;
                    hackclient.rise.jp.oo000o00Oo00[0x7475 ^ 0x748C] = 0x7ADFDA98 ^ 0x748C;
                    hackclient.rise.jp.oo000o00Oo00[0x4D5D ^ 0x4D2B] = 0x4D02 ^ 0x4D2B;
                    hackclient.rise.jp.oo000o00Oo00[0xA20 ^ 0xB53] = 0xFFFFF4EC ^ 0xB53;
                    n3 = -828418583;
                    continue block85;
                }
                case -828418583: {
                    hackclient.rise.jp.oo000o00Oo00[0xCA8E ^ 0xCA76] = 0xCA7D ^ 0xCA76;
                    n3 = 2084015617;
                    continue block85;
                }
                case 2084015617: {
                    hackclient.rise.jp.oo000o00Oo00[0xE96B ^ 0xE91E] = 0x38311A9B ^ 0xE91E;
                    hackclient.rise.jp.oo000o00Oo00[0x401C ^ 0x407B] = 0x4072 ^ 0x407B;
                    hackclient.rise.jp.oo000o00Oo00[0xA7B0 ^ 0xA7A7] = 0xFFFF5858 ^ 0xA7A7;
                    hackclient.rise.jp.oo000o00Oo00[0xC537 ^ 0xC54F] = 0xC84F ^ 0xC54F;
                    hackclient.rise.jp.oo000o00Oo00[0xEC4E ^ 0xED5B] = 0xED5A ^ 0xED5B;
                    hackclient.rise.jp.oo000o00Oo00[0x6BF2 ^ 0x6B92] = 0xF0F649D ^ 0x6B92;
                    hackclient.rise.jp.oo000o00Oo00[0x9095 ^ 0x9081] = 0x9098 ^ 0x9081;
                    n3 = 1120413917;
                    continue block85;
                }
                case 1120413917: {
                    hackclient.rise.jp.oo000o00Oo00[0x774F ^ 0x77FF] = 0xFFFF89F0 ^ 0x77FF;
                    hackclient.rise.jp.oo000o00Oo00[0x35BD ^ 0x3597] = 0xFFFFCA5E ^ 0x3597;
                    hackclient.rise.jp.oo000o00Oo00[0xF8EB ^ 0xF80B] = 0xF810 ^ 0xF80B;
                    n3 = 1214802933;
                    continue block85;
                }
                case 1214802933: {
                    hackclient.rise.jp.oo000o00Oo00[0x104A3 ^ 0x105F8] = 0xDB185B77 ^ 0x105F8;
                    hackclient.rise.jp.oo000o00Oo00[0x2974 ^ 0x2811] = 0x2846 ^ 0x2811;
                    hackclient.rise.jp.oo000o00Oo00[0xEBEF ^ 0xEB25] = 0xEB14 ^ 0xEB25;
                    hackclient.rise.jp.oo000o00Oo00[0x10C3B ^ 0x10CD7] = 0x10CC8 ^ 0x10CD7;
                    n3 = -381594557;
                    continue block85;
                }
                case -381594557: {
                    hackclient.rise.jp.oo000o00Oo00[0x10517 ^ 0x10461] = 0x1046A ^ 0x10461;
                    hackclient.rise.jp.oo000o00Oo00[0xE332 ^ 0xE3A4] = 0xE3A7 ^ 0xE3A4;
                    hackclient.rise.jp.oo000o00Oo00[0x708C ^ 0x71F3] = 0xFFFF8E12 ^ 0x71F3;
                    hackclient.rise.jp.oo000o00Oo00[0xB99E ^ 0xB8F5] = 0xFBF7574A ^ 0xB8F5;
                    hackclient.rise.jp.oo000o00Oo00[0x24D9 ^ 0x248F] = 0xFFFFDA66 ^ 0x248F;
                    n3 = 1275281038;
                    continue block85;
                }
                case 1275281038: 
            }
            hackclient.rise.jp.oo000o00Oo00[0xD91E ^ 0xD802] = 0xD80B ^ 0xD802;
            hackclient.rise.jp.oo000o00Oo00[0x8D1C ^ 0x8DAA] = 0x8DA7 ^ 0x8DAA;
            hackclient.rise.jp.oo000o00Oo00[0xE63A ^ 0xE678] = 0x902FF2E1 ^ 0xE678;
            hackclient.rise.jp.oo000o00Oo00[0x7D62 ^ 0x7DF2] = 0xFFFF8225 ^ 0x7DF2;
            n3 = -1267568748;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block18: {
            block19: {
                var28 = -1751511844;
                if (var28 == var28) break block19;
                throw null;
lbl4:
                // 1 sources

                while (true) {
                    continue;
lbl6:
                    // 1 sources

                    while (true) {
                        v0 = var24_5[16];
                        var24_5[16] = var25_6 = v0 ^ (0L ^ v0) & -1L << (hackclient.rise.jp.oo000o00Oo00[380] ^ hackclient.rise.jp.oo000o00Oo00[381] ^ hackclient.rise.jp.oo000o00Oo00[382] ^ hackclient.rise.jp.oo000o00Oo00[383]);
lbl9:
                        // 2 sources

                        while (true) {
                            v1 = hackclient.rise.jp.oo000o00Oo00[384] ^ hackclient.rise.jp.oo000o00Oo00[385];
                            if ((int)(var24_5[16] >>> -((v1 << hackclient.rise.jp.oo000o00Oo00[386] | v1 >>> hackclient.rise.jp.oo000o00Oo00[387]) * hackclient.rise.jp.oo000o00Oo00[388])) < (int)var24_5[4]) {
                                v2 = hackclient.rise.jp.oo000o00Oo00[389] * hackclient.rise.jp.oo000o00Oo00[390];
                                v3 = (v2 >>> hackclient.rise.jp.oo000o00Oo00[391] | v2 << hackclient.rise.jp.oo000o00Oo00[392]) - hackclient.rise.jp.oo000o00Oo00[393];
                                v4 = hackclient.rise.jp.oo000o00Oo00[396] - hackclient.rise.jp.oo000o00Oo00[397];
                                ((char[])var23_4[10])[(int)(var24_5[16] >>> (v3 << hackclient.rise.jp.oo000o00Oo00[394] | v3 >>> hackclient.rise.jp.oo000o00Oo00[395]))] = ((char[])var23_4[17])[(int)var24_5[16] + (int)(var24_5[16] >>> (v4 << hackclient.rise.jp.oo000o00Oo00[398] | v4 >>> hackclient.rise.jp.oo000o00Oo00[399]) * 1205604855 * 35)];
                                var24_5[16] = var25_6 = var24_5[16] + 0x100000000L;
                                continue;
                            }
lbl18:
                            // 3 sources

                            while (true) {
                                var24_5[1] = var25_6 = var24_5[1] + 0x100000000L;
                                hackclient.rise.jp.0oOOoOo0O00O[(int)(var24_5[1] >>> ((0x400000 << 15 | 0x400000 >>> 17) ^ -1 ^ -1))] = new String((char[])var23_4[10]);
                                v5 = var24_5[16];
                                var24_5[16] = var25_6 = v5 ^ ((long)((int)var24_5[16] + (int)var24_5[4]) ^ v5) & -1L >>> ~(~(--3360 * -654471207));
lbl23:
                                // 2 sources

                                while ((int)var24_5[16] >= (int)var24_5[1]) {
                                    return;
                                }
                                break block18;
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    var24_5[4] = var25_6 = v6 ^ ((long)((char[])var23_4[17])[(int)var24_5[16]] << (-hackclient.rise.jp.oo000o00Oo00[342] ^ hackclient.rise.jp.oo000o00Oo00[343] ^ hackclient.rise.jp.oo000o00Oo00[344]) ^ v6) & -1L << -(hackclient.rise.jp.oo000o00Oo00[345] - hackclient.rise.jp.oo000o00Oo00[346]) * hackclient.rise.jp.oo000o00Oo00[347];
                    v7 = var24_5[16];
                    v8 = hackclient.rise.jp.oo000o00Oo00[348];
                    v9 = v8 >>> hackclient.rise.jp.oo000o00Oo00[349] | v8 << hackclient.rise.jp.oo000o00Oo00[350];
                    v10 = hackclient.rise.jp.oo000o00Oo00[353];
                    var24_5[16] = var25_6 = v7 ^ (v7 ^ v7 + (long)(v9 << hackclient.rise.jp.oo000o00Oo00[351] | v9 >>> hackclient.rise.jp.oo000o00Oo00[352])) & -1L >>> -(v10 << hackclient.rise.jp.oo000o00Oo00[354] | v10 >>> hackclient.rise.jp.oo000o00Oo00[355]) * hackclient.rise.jp.oo000o00Oo00[356];
                    var24_5[22] = var25_6 = -5052227918709969048L;
                    v11 = var24_5[22];
                    var24_5[22] = var25_6 = v11 ^ ((long)((char[])var23_4[17])[(int)var24_5[16]] << -(hackclient.rise.jp.oo000o00Oo00[357] ^ hackclient.rise.jp.oo000o00Oo00[358]) ^ v11) & -1L << (hackclient.rise.jp.oo000o00Oo00[359] ^ hackclient.rise.jp.oo000o00Oo00[360]) * hackclient.rise.jp.oo000o00Oo00[361] - hackclient.rise.jp.oo000o00Oo00[362];
                    v12 = hackclient.rise.jp.oo000o00Oo00[366] ^ hackclient.rise.jp.oo000o00Oo00[367];
                    v13 = hackclient.rise.jp.oo000o00Oo00[372];
                    v14 = var24_5[4];
                    var24_5[4] = var25_6 = v14 ^ ((long)((int)(var24_5[4] >>> (-hackclient.rise.jp.oo000o00Oo00[363] ^ hackclient.rise.jp.oo000o00Oo00[364]) * hackclient.rise.jp.oo000o00Oo00[365]) << ((v12 << hackclient.rise.jp.oo000o00Oo00[368] | v12 >>> hackclient.rise.jp.oo000o00Oo00[369]) ^ hackclient.rise.jp.oo000o00Oo00[370] ^ hackclient.rise.jp.oo000o00Oo00[371]) | (int)(var24_5[22] >>> (v13 << hackclient.rise.jp.oo000o00Oo00[373] | v13 >>> hackclient.rise.jp.oo000o00Oo00[374]) * hackclient.rise.jp.oo000o00Oo00[375] + hackclient.rise.jp.oo000o00Oo00[376])) ^ v14) & -1L >>> hackclient.rise.jp.oo000o00Oo00[377] * hackclient.rise.jp.oo000o00Oo00[378] + hackclient.rise.jp.oo000o00Oo00[379];
                    var21_2 = -1091817258;
                    var23_4[10] = new char[(int)var24_5[4]];
                    var22_3 = -1602793658;
                    switch (var22_3) {
                        default: {
                            ** continue;
                        }
                        case 1796073523: {
                            ** continue;
                        }
                        ** case 687680593:
lbl48:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
lbl49:
                // 1 sources

                while (true) {
                    var23_4 = new Object[23];
                    var24_5 = new long[23];
                    hackclient.rise.jp.0OOOoo00o0();
                    hackclient.rise.jp.oOo00Oo0OOo0 = new String[hackclient.rise.jp.oo000o00Oo00[276]];
                    hackclient.rise.jp.o0o000o0O0o0 = new String[hackclient.rise.jp.oo000o00Oo00[277]];
                    hackclient.rise.jp.0oOOoOo0O00O = new Object[-(hackclient.rise.jp.oo000o00Oo00[278] * hackclient.rise.jp.oo000o00Oo00[279]) * hackclient.rise.jp.oo000o00Oo00[280] * hackclient.rise.jp.oo000o00Oo00[281]];
                    v15 = hackclient.rise.jp.oo000o00Oo00[282];
                    var24_5[1] = var25_6 = 2930489542994366555L;
                    v16 = hackclient.rise.jp.oo000o00Oo00[287] - hackclient.rise.jp.oo000o00Oo00[288];
                    v17 = var24_5[1];
                    v18 = hackclient.rise.jp.oo000o00Oo00[291] * hackclient.rise.jp.oo000o00Oo00[292] - hackclient.rise.jp.oo000o00Oo00[293] ^ hackclient.rise.jp.oo000o00Oo00[294];
                    var24_5[1] = var25_6 = v17 ^ ((long)(((v15 << hackclient.rise.jp.oo000o00Oo00[283] | v15 >>> hackclient.rise.jp.oo000o00Oo00[284]) ^ hackclient.rise.jp.oo000o00Oo00[285]) * hackclient.rise.jp.oo000o00Oo00[286]) << (v16 << hackclient.rise.jp.oo000o00Oo00[289] | v16 >>> hackclient.rise.jp.oo000o00Oo00[290]) ^ v17) & -1L << (v18 >>> hackclient.rise.jp.oo000o00Oo00[295] | v18 << hackclient.rise.jp.oo000o00Oo00[296]);
                    var19_1 = 2038611112;
                    block14: while (true) {
                        switch (var19_1) {
                            default: {
                                v19 = hackclient.rise.jp.o0o000o0O0o0[hackclient.rise.jp.oo000o00Oo00[297]];
                                if (v19 != null) break block14;
                                var19_1 = -1537003461;
                                continue block14;
                            }
                            case -1537003461: {
                                v20 = hackclient.rise.jp.oo000o00Oo00[298];
                                v21 = hackclient.rise.jp.oOo00Oo0OOo0[hackclient.rise.jp.oo000o00Oo00[299]];
                                if (v21 == null) {
                                    var23_4[15] = "\ufbc7\uf99c\u37a8\u35d3\u33e6\u319d\u2fa1\u2e04\u2bf4\u29cf\u27db\u65aa\u63a8\u61bc\u6006\u5e06\u5c0f\u5a04\u97ad\u95ea\u93aa\u9219\u8fc6\u8e17\u8ba3\u899e\u87ab\u45b3\u43a4\u41ef\u3fd9\u3dff\u3bdc\u3a3d\u77f7\u75f8\u73f8\u71dc\u7040\u6da8\u6c48\u6a0d\u67f1\ua5d1\ua45a\ua1d0\ua05c\u9dea\u9c5c\u9a42\ud85a\ud5a6\ud3a2\ud208\ucfed\ucda0\ucbe1\uc9f7\uc840\u85ff\u8440\u8250\u801a\u7e45\u7b87\u79f6\ub824\ub628\ub429\ub256\ub024\uae27\uabf1\ua9f4\ua81d\ue5e8\ue3ec\ue252\ue028\ude0c\udbe6\uda18\u17fe\u161e\u13ee\u1236\u1038\u0df4\u0c30\u09e1\u0800\uc61a\uc3f7\uc225\uc002\ubdeb\ubc57\ub9f1\uf853\uf5ed\uf3e6\uf1fb\ueff8\uedfc\uebf4\uea57\ue853\u2613\u23ec\u2252\u20c5\u1ec4\u1c23\u1ad8\u57f8\u55f8\u5420\u52d7\u50da\u4ecf\u4c38\u49ed\u482c\u06db\u0427\u02c4\ufff4\ufeb6\ufc9c\uf9ea\u38a8\u368d\u34a4\u328d\u30aa\u2ea2\u2c03\u2adb\u289b\u66a1\u64cd\u620c\u5fee\u5def\u5c14\u5ab5\u98c6\u95ff\u9403\u92b1\u90c6\u8eb1\u8c17\u89e1\u880d\u45f9\u43ed\u42a6\u4000\u3e39\u3c10\u39fb\u78d5\u7618\u74d0\u721b\u6ff7\u6e13\u6cd2\u6ad8\u68a8\ua5fa\ua3ee\ua1ec\ua0b7\u9e13\u9c06\u99e8\ud8b4\ud5f7\ud407\ud25a\ud048\ucea8\uccb4\uc9f3\uc848\u863e\u84a4\u823c\u80ae\u7e4b\u7be9\u7a90\ub824\ub64f\ub423\ub20a\ub022\uae24\uac57\ua9f4\ua7e7\ue62c\ue491\ue22c\ue026\ude40\udc00\uda30\u1811\u164a\u143b\u123a\u1036\u0e33\u0c14\u09fd\u080f\uc5e6\uc5ba\uc218\uc022\ubdf1\ubbf5\uba1d\uf85a\uf60d\uf44f\uf20d\uf05a\uee58\uebed\uea27\ue9c0\u2652\u2422\u2251\u204f\u1df0\u1c36\u1bbd\u5822\u561f\u53f0\u53bd\u51d6\u4fd6\u4c2b\u4bc5\u49ca\u05fc\u05c1\u03ca2\ufde7".toCharArray();
                                    var24_5[13] = var25_6 = (long)hackclient.rise.jp.oo000o00Oo00[300];
                                    while ((int)var24_5[13] < ((char[])var23_4[15]).length) {
                                        v22 = (char[])var23_4[15];
                                        v23 = (int)var24_5[13];
                                        v24 = (char)((char)((char)((char)(v22[v23] + hackclient.rise.jp.oo000o00Oo00[301]) ^ v23) - v23) - hackclient.rise.jp.oo000o00Oo00[302]);
                                        v25 = (char)((char)(-((char)((char)((char)((char)(v24 << hackclient.rise.jp.oo000o00Oo00[303] | v24 >>> hackclient.rise.jp.oo000o00Oo00[304]) - hackclient.rise.jp.oo000o00Oo00[305]) ^ hackclient.rise.jp.oo000o00Oo00[306]) - hackclient.rise.jp.oo000o00Oo00[307]))) - hackclient.rise.jp.oo000o00Oo00[308]);
                                        v26 = (char)((char)((char)((char)((char)(v25 << hackclient.rise.jp.oo000o00Oo00[309] | v25 >>> hackclient.rise.jp.oo000o00Oo00[310]) ^ hackclient.rise.jp.oo000o00Oo00[311]) + v23) + hackclient.rise.jp.oo000o00Oo00[312]) ^ hackclient.rise.jp.oo000o00Oo00[313]);
                                        v22[v23] = -((char)(-((char)((char)(v26 << hackclient.rise.jp.oo000o00Oo00[314] | v26 >>> hackclient.rise.jp.oo000o00Oo00[315]) + hackclient.rise.jp.oo000o00Oo00[316]))));
                                        var24_5[13] = var25_6 = (long)((int)var24_5[13] + 1);
                                    }
                                    v21 = hackclient.rise.jp.oOo00Oo0OOo0[hackclient.rise.jp.oo000o00Oo00[317]] = new String((char[])var23_4[15]);
                                }
                                v19 = hackclient.rise.jp.o0Oo000O0oO(v20, v21);
                                break block14;
                            }
                        }
                        break;
                    }
                    var23_4[17] = v19.toCharArray();
                    v27 = var24_5[1];
                    v28 = hackclient.rise.jp.oo000o00Oo00[318] + hackclient.rise.jp.oo000o00Oo00[319];
                    var24_5[1] = var25_6 = v27 ^ (173L ^ v27) & -1L >>> (v28 >>> hackclient.rise.jp.oo000o00Oo00[320] | v28 << hackclient.rise.jp.oo000o00Oo00[321]);
                    v29 = hackclient.rise.jp.oo000o00Oo00[322] * hackclient.rise.jp.oo000o00Oo00[323];
                    var24_5[16] = var25_6 = -3998226646111262840L;
                    v30 = var24_5[16];
                    var24_5[16] = var25_6 = v30 ^ ((long)((v29 >>> hackclient.rise.jp.oo000o00Oo00[324] | v29 << hackclient.rise.jp.oo000o00Oo00[325]) * hackclient.rise.jp.oo000o00Oo00[326]) ^ v30) & -1L >>> (hackclient.rise.jp.oo000o00Oo00[327] + hackclient.rise.jp.oo000o00Oo00[328] - hackclient.rise.jp.oo000o00Oo00[329] ^ hackclient.rise.jp.oo000o00Oo00[330]);
                    ** GOTO lbl23
                    break;
                }
            }
            ** while ((var28 = 1599973230) == var28)
lbl99:
            // 1 sources

            throw new ClassNotFoundException();
        }
        v31 = var24_5[16];
        v32 = hackclient.rise.jp.oo000o00Oo00[331] ^ hackclient.rise.jp.oo000o00Oo00[332];
        v33 = v32 << hackclient.rise.jp.oo000o00Oo00[333] | v32 >>> hackclient.rise.jp.oo000o00Oo00[334];
        var24_5[16] = var25_6 = v31 ^ (v31 ^ v31 + (long)(v33 >>> hackclient.rise.jp.oo000o00Oo00[335] | v33 << hackclient.rise.jp.oo000o00Oo00[336])) & -1L >>> (hackclient.rise.jp.oo000o00Oo00[337] + hackclient.rise.jp.oo000o00Oo00[338] ^ hackclient.rise.jp.oo000o00Oo00[339] ^ hackclient.rise.jp.oo000o00Oo00[340]) * hackclient.rise.jp.oo000o00Oo00[341];
        var24_5[4] = var25_6 = -7851802817437287725L;
        v6 = var24_5[4];
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) {
        block35: {
            block36: {
                block32: {
                    block33: {
                        block30: {
                            block31: {
                                var37_2 = 952778766;
                                if (var37_2 == var37_2) break block33;
                                throw null;
lbl4:
                                // 1 sources

                                while (true) {
                                    if ((int)var33_4[3] < ((char[])var32_3[12]).length) {
                                        v0 = (char[])var32_3[12];
                                        v1 = (int)var33_4[3];
                                        v2 = -v0[v1];
                                        v3 = ~((char)(v2 >>> 2 | v2 << 14));
                                        v4 = -((char)((char)((char)(v3 << 13 | v3 >>> 3) ^ v1) - v1));
                                        v0[v1] = (char)((char)(-((char)((char)(v4 >>> 1 | v4 << 15) ^ 11045))) ^ v1);
                                        var33_4[3] = var34_5 = (long)((int)var33_4[3] + 1);
                                        continue;
                                    }
                                    v5 = new String((char[])var32_3[12]);
lbl15:
                                    // 2 sources

                                    while (true) {
                                        v6(v7, v5);
                                        hackclient.rise.jp.ooo00oo0Ooo0 = v6;
lbl18:
                                        // 2 sources

                                        while (true) {
                                            var32_3[17] = Base64.getDecoder().decode(var1_1);
                                            var32_3[24] = Arrays.copyOfRange((byte[])var32_3[17], 0, 16);
                                            var28_12 = -1414620951;
                                            var32_3[15] = Arrays.copyOfRange((byte[])var32_3[17], 16, ((byte[])var32_3[17]).length);
                                            v8 = hackclient.rise.jp.oOo00Oo0OOo0[3];
                                            if (v8 != null) ** GOTO lbl42
                                            var29_13 = -115037607;
                                            var32_3[12] = "\u3c22\u5c22\ucc23\uac1e\u4c1a\u441a\u4c1e\uac1e\ub413\u8c12\u4c1e\ucc1d\udc1a\ub419\u3c1b\u541d\u5403\u7c01\ua404\u6c1d".toCharArray();
                                            var33_4[3] = var34_5 = (long)0;
                                            block20: while (true) {
                                                block29: {
                                                    block34: {
                                                        if ((int)var33_4[3] >= ((char[])var32_3[12]).length) break block34;
                                                        var30_14 = 1164701069;
                                                        break block29;
lbl32:
                                                        // 1 sources

                                                        while (true) {
                                                            v9 = (char[])var32_3[12];
                                                            v10 = (int)var33_4[3];
                                                            v11 = (char)((char)((char)((char)((char)((char)((char)(-v9[v10]) ^ v10) + 61072) - 54087) - v10) - 37792) - 60668);
                                                            v9[v10] = -((char)(~((char)((char)(-((char)(v11 << 5 | v11 >>> 11))) - 11861))));
                                                            var33_4[3] = var34_5 = (long)((int)var33_4[3] + 1);
                                                            var30_14 = 2076995455;
                                                            break block29;
                                                            break;
                                                        }
                                                    }
                                                    v8 = new String((char[])var32_3[12]);
lbl42:
                                                    // 2 sources

                                                    var32_3[29] = Cipher.getInstance(v8);
                                                    var31_15 = 969703136;
                                                    ((Cipher)var32_3[29]).init(2, (Key)((SecretKey)hackclient.rise.jp.ooo00oo0Ooo0), new IvParameterSpec((byte[])var32_3[24]));
                                                    var32_3[22] = ((Cipher)var32_3[29]).doFinal((byte[])var32_3[15]);
                                                    hackclient.rise.jp.o0o000o0O0o0[var0] = new String((byte[])var32_3[22], StandardCharsets.UTF_8);
                                                    return hackclient.rise.jp.o0o000o0O0o0[var0];
                                                }
                                                switch (var30_14) {
                                                    default: {
                                                        ** continue;
                                                    }
                                                    ** case 2076995455:
lbl53:
                                                    // 1 sources

                                                    continue block20;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                while (true) {
                                    var32_3 = new Object[30];
                                    var33_4 = new long[30];
                                    v12 = hackclient.rise.jp.O0OoOO0OOOOO;
                                    if (hackclient.rise.jp.O0OoOO0OOOOO != null) break block30;
                                    break block31;
                                    break;
                                }
lbl60:
                                // 2 sources

                                while (true) {
                                    if ((var37_2 = -1960868315) == var37_2) ** continue;
                                    throw null;
                                }
                            }
                            v13 = new Object[1];
                            hackclient.rise.jp.O0OoOO0OOOOO = v13;
                            v12 = v13;
                            var32_3[5] = new byte[16620 ^ 16636];
                            ((byte[])var32_3[5])[39500 ^ 39495] = 39425 ^ 39495;
                            ((byte[])var32_3[5])[58045 ^ 58041] = -58023 ^ 58041;
                            ((byte[])var32_3[5])[68032 ^ 68033] = -68030 ^ 68033;
                            ((byte[])var32_3[5])[43745 ^ 43751] = -43744 ^ 43751;
                            ((byte[])var32_3[5])[66891 ^ 66884] = -66918 ^ 66884;
                            ((byte[])var32_3[5])[55414 ^ 55420] = 55332 ^ 55420;
                            ((byte[])var32_3[5])[29471 ^ 29469] = -29545 ^ 29469;
                            ((byte[])var32_3[5])[12522 ^ 12522] = 12448 ^ 12522;
                            ((byte[])var32_3[5])[1978 ^ 1970] = -1934 ^ 1970;
                            ((byte[])var32_3[5])[13549 ^ 13536] = -13525 ^ 13536;
                            ((byte[])var32_3[5])[30392 ^ 30385] = 30414 ^ 30385;
                            ((byte[])var32_3[5])[36155 ^ 36152] = 36140 ^ 36152;
                            ((byte[])var32_3[5])[8033 ^ 8047] = -7985 ^ 8047;
                            ((byte[])var32_3[5])[16987 ^ 16983] = 16914 ^ 16983;
                            ((byte[])var32_3[5])[42076 ^ 42073] = -42049 ^ 42073;
                            ((byte[])var32_3[5])[53123 ^ 53124] = -53130 ^ 53124;
                            v13[0] = (byte[])var32_3[5];
                        }
                        var32_3[9] = (byte[])v12[0];
                        ** while (hackclient.rise.jp.ooo00oo0Ooo0 != null)
lbl88:
                        // 1 sources

                        var32_3[6] = new byte[46555 ^ 46587];
                        ((byte[])var32_3[6])[50775 ^ 50766] = -50734 ^ 50766;
                        ((byte[])var32_3[6])[30899 ^ 30886] = -30964 ^ 30886;
                        ((byte[])var32_3[6])[58764 ^ 58774] = 58773 ^ 58774;
                        ((byte[])var32_3[6])[273 ^ 273] = -345 ^ 273;
                        ((byte[])var32_3[6])[34181 ^ 34188] = 34234 ^ 34188;
                        ((byte[])var32_3[6])[721 ^ 718] = -768 ^ 718;
                        ((byte[])var32_3[6])[46485 ^ 46477] = -46554 ^ 46477;
                        ((byte[])var32_3[6])[10155 ^ 10173] = 10203 ^ 10173;
                        ((byte[])var32_3[6])[60726 ^ 60732] = -60731 ^ 60732;
                        var23_7 = -1900564073;
                        block24: while (true) {
                            switch (var23_7) {
                                default: {
                                    ((byte[])var32_3[6])[33023 ^ 33017] = -32962 ^ 33017;
                                    ((byte[])var32_3[6])[33163 ^ 33166] = 33265 ^ 33166;
                                    ((byte[])var32_3[6])[44849 ^ 44861] = -44875 ^ 44861;
                                    var23_7 = -1629908861;
                                    continue block24;
                                }
                                case -1629908861: {
                                    ((byte[])var32_3[6])[48891 ^ 48884] = 48830 ^ 48884;
                                    ((byte[])var32_3[6])[26486 ^ 26470] = 26392 ^ 26470;
                                    ((byte[])var32_3[6])[22814 ^ 22813] = -22900 ^ 22813;
                                    ((byte[])var32_3[6])[51114 ^ 51133] = -51129 ^ 51133;
                                    ((byte[])var32_3[6])[24119 ^ 24106] = -24126 ^ 24106;
                                    ((byte[])var32_3[6])[65415 ^ 65420] = 65501 ^ 65420;
                                    ((byte[])var32_3[6])[47683 ^ 47709] = 47709 ^ 47709;
                                    ((byte[])var32_3[6])[14016 ^ 14030] = 13955 ^ 14030;
                                    var23_7 = -392852913;
                                    continue block24;
                                }
                                case -392852913: {
                                    ((byte[])var32_3[6])[50869 ^ 50871] = -50889 ^ 50871;
                                    ((byte[])var32_3[6])[59484 ^ 59476] = 59502 ^ 59476;
                                    ((byte[])var32_3[6])[54133 ^ 54113] = -54083 ^ 54113;
                                    ((byte[])var32_3[6])[16112 ^ 16098] = -16095 ^ 16098;
                                    ((byte[])var32_3[6])[36370 ^ 36374] = 36414 ^ 36374;
                                    ((byte[])var32_3[6])[46285 ^ 46284] = -46308 ^ 46284;
                                    var23_7 = -263750606;
                                    continue block24;
                                }
                                case -263750606: 
                            }
                            break;
                        }
                        ((byte[])var32_3[6])[20361 ^ 20376] = -20445 ^ 20376;
                        ((byte[])var32_3[6])[48932 ^ 48931] = 48983 ^ 48931;
                        ((byte[])var32_3[6])[56768 ^ 56781] = 56747 ^ 56781;
                        ((byte[])var32_3[6])[89 ^ 69] = 6 ^ 69;
                        ((byte[])var32_3[6])[68654 ^ 68661] = 68717 ^ 68661;
                        ((byte[])var32_3[6])[27679 ^ 27660] = 27751 ^ 27660;
                        var32_3[21] = new byte[((byte[])var32_3[9]).length + ((byte[])var32_3[6]).length];
                        System.arraycopy((byte[])var32_3[9], 0, (byte[])var32_3[21], 0, ((byte[])var32_3[9]).length);
                        System.arraycopy((byte[])var32_3[6], 0, (byte[])var32_3[21], ((byte[])var32_3[9]).length, ((byte[])var32_3[6]).length);
                        var24_8 = -530150320;
                        v14 = hackclient.rise.jp.oOo00Oo0OOo0[1];
                        if (v14 != null) break block35;
                        var32_3[12] = "\u1a7f\u3a8b\u228b\u4a7f\uea7f\u7a94\u428e\ue28e\u3a85\uca9a\u7a9b\u4295\ud29a\u729a\u229e\u2a9e\u92aa\uc2ab".toCharArray();
                        var33_4[3] = var34_5 = (long)0;
lbl142:
                        // 2 sources

                        while ((int)var33_4[3] < ((char[])var32_3[12]).length) {
                            break block32;
                        }
                        break block36;
lbl145:
                        // 2 sources

                        while (true) {
                            var37_2 = 1291731446;
                            if (var37_2 == var37_2) ** GOTO lbl60
                            hackclient.rise.jp.o0000000O000 = var37_2 = 1636788478;
                            ** continue;
                            break;
                        }
                    }
                    var37_2 = -801809444;
                    if (var37_2 == var37_2 || -2066898910 == 0) ** GOTO lbl145
                    ** while (true)
                }
                v15 = (char[])var32_3[12];
                v16 = (int)var33_4[3];
                v17 = ~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(v15[v16] - 9685) ^ 8452) - 27370) - v16) ^ 35418) + 5454) + v16))) ^ 30185));
                v15[v16] = (char)((char)((char)(v17 >>> 11 | v17 << 5) - v16) - v16);
                var25_9 = -1658235842;
                var33_4[3] = var34_5 = (long)((int)var33_4[3] + 1);
                ** GOTO lbl142
            }
            v14 = new String((char[])var32_3[12]);
        }
        var32_3[19] = SecretKeyFactory.getInstance(v14);
        var26_10 = 1986927462;
        var32_3[1] = new byte[16];
        ((byte[])var32_3[1])[8] = -62;
        ((byte[])var32_3[1])[11] = -16;
        var27_11 = -678687253;
        block27: while (true) {
            switch (var27_11) {
                default: {
                    ((byte[])var32_3[1])[14] = 50;
                    ((byte[])var32_3[1])[9] = -11;
                    ((byte[])var32_3[1])[15] = 94;
                    ((byte[])var32_3[1])[12] = -71;
                    ((byte[])var32_3[1])[2] = -115;
                    var27_11 = 1892699031;
                    continue block27;
                }
                case 1892699031: 
            }
            break;
        }
        ((byte[])var32_3[1])[4] = 51;
        ((byte[])var32_3[1])[1] = 113;
        ((byte[])var32_3[1])[10] = 6;
        ((byte[])var32_3[1])[7] = -121;
        ((byte[])var32_3[1])[3] = -16;
        ((byte[])var32_3[1])[13] = -77;
        ((byte[])var32_3[1])[5] = -110;
        ((byte[])var32_3[1])[0] = -48;
        ((byte[])var32_3[1])[6] = 62;
        var7_6 = new PBEKeySpec(new String((byte[])var32_3[21], StandardCharsets.UTF_8).toCharArray(), (byte[])var32_3[1], 7, 256);
        var32_3[16] = ((SecretKeyFactory)var32_3[19]).generateSecret(var7_6).getEncoded();
        v7 = (byte[])var32_3[16];
        ** while ((v5 = hackclient.rise.jp.oOo00Oo0OOo0[2]) != null)
lbl195:
        // 1 sources

        var32_3[12] = "\ud96b\ud9eb\uddeb".toCharArray();
        var33_4[3] = var34_5 = (long)0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public jp(String string, jg jg2) {
        int n2 = 1501860058;
        if (n2 != n2) {
            int cfr_ignored_0 = 37 + 61;
        }
        super(string, jg2);
        this.zL = -(oo000o00Oo00[0] ^ oo000o00Oo00[1]) ^ oo000o00Oo00[2];
        this.zM = 0.0;
        int n3 = oo000o00Oo00[3] * oo000o00Oo00[4];
        this.zN = -(n3 << oo000o00Oo00[5] | n3 >>> oo000o00Oo00[6]);
        int n4 = oo000o00Oo00[7] - oo000o00Oo00[8];
        this.zO = n4 << oo000o00Oo00[9] | n4 >>> oo000o00Oo00[10];
        int n5 = oo000o00Oo00[11] * oo000o00Oo00[12] * oo000o00Oo00[13];
        this.zP = -(n5 << oo000o00Oo00[14] | n5 >>> oo000o00Oo00[15]);
        int n6 = 1212006142;
        block4: while (true) {
            switch (n6) {
                default: {
                    int n7 = -oo000o00Oo00[19];
                    this.zQ = new aki((String)0oOOoOo0O00O[oo000o00Oo00[16] * oo000o00Oo00[17] - oo000o00Oo00[18]], (akg<?>)this, (Boolean)(((n7 >>> oo000o00Oo00[20] | n7 << oo000o00Oo00[21]) + oo000o00Oo00[22] ^ oo000o00Oo00[23]) != 0));
                    this.zR = new aki((String)0oOOoOo0O00O[oo000o00Oo00[24] * oo000o00Oo00[25] ^ oo000o00Oo00[26] ^ oo000o00Oo00[27]], (akg<?>)this, (Boolean)((oo000o00Oo00[28] ^ oo000o00Oo00[29] ^ oo000o00Oo00[30]) != 0));
                    n6 = -1167510121;
                    continue block4;
                }
                case -1167510121: {
                    int n8 = oo000o00Oo00[31];
                    int n9 = n8 >>> oo000o00Oo00[32] | n8 << oo000o00Oo00[33];
                    this.zS = new aki((String)0oOOoOo0O00O[(n9 >>> oo000o00Oo00[34] | n9 << oo000o00Oo00[35]) * oo000o00Oo00[36]], (akg<?>)this, (Boolean)((oo000o00Oo00[37] ^ oo000o00Oo00[38] ^ oo000o00Oo00[39]) * oo000o00Oo00[40]));
                    this.zT = fd2 -> {};
                    this.yv = dz2 -> {
                        int n2 = -1512057570;
                        if (n2 != n2) {
                        }
                        int n3 = 1945362421;
                        block4: while (true) {
                            switch (n3) {
                                case 132308846: {
                                    return;
                                }
                                default: {
                                    this.jp = dz2.getForward();
                                    n3 = -635094213;
                                    continue block4;
                                }
                                case -635094213: 
                            }
                            this.jq = dz2.getStrafe();
                            n3 = 132308846;
                        }
                    };
                    this.zU = this::g;
                    this.zV = ez2 -> {
                        int n2 = -1195460039;
                        if (n2 != n2) {
                            int cfr_ignored_0 = 45 + 33;
                        }
                        if (((Boolean)this.zR.wD()).booleanValue() && hackclient.rise.jp.aER.bgK.tR >= (oo000o00Oo00[176] ^ oo000o00Oo00[177]) * oo000o00Oo00[178] && zK) {
                            ez2.setPosX(0.0);
                            int n3 = -364867614;
                            ez2.setPosY(0.0);
                            ez2.setPosZ(0.0);
                        }
                    };
                    n6 = 1461825023;
                    continue block4;
                }
                case 1461825023: 
            }
            break;
        }
        this.zW = var1_1 -> {
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
        };
        this.zX = this::h;
        this.zY = var1_1 -> {
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
        };
        this.zZ = ej2 -> {
            int n2 = 534814525;
            if (n2 != n2) {
                n2 = 32;
            }
            if (this.zI == null) return;
            int n3 = 783986912;
            while (true) {
                switch (n3) {
                    case -349009291: {
                        int n4 = oo000o00Oo00[98] * oo000o00Oo00[99] - oo000o00Oo00[100] ^ oo000o00Oo00[101];
                        if (hackclient.rise.jp.aER.bgK.aRg >= (n4 << oo000o00Oo00[102] | n4 >>> oo000o00Oo00[103])) return;
                        return;
                    }
                }
                if (hackclient.rise.jp.aER.bgK.cus != 0) return;
                if (this.zI > (oo000o00Oo00[95] * oo000o00Oo00[96] ^ oo000o00Oo00[97])) return;
                n3 = -349009291;
            }
        };
        this.Aa = var0 -> {
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
        };
        this.Ab = this::h;
        this.zD = new ArrayDeque<da>();
        this.zE = new ArrayDeque();
        this.zG = new a();
        this.zF = new ArrayDeque();
        this.zB = new ArrayList<Short>();
        this.zC = new a();
    }
}

