/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package rip.vantage.commons.packet.impl.server.monitoring;

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
import org.json.JSONObject;
import rip.vantage.commons.packet.api.abstracts.b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class g
extends b {
    public static /* synthetic */ Object Oo0o00000O00;
    public static /* synthetic */ String[] q0oOOoOo0O00O;
    public static /* synthetic */ String[] oO00O0OO0ooO;
    public static /* synthetic */ Object[] o0Oo000O0oO;
    private static /* synthetic */ int[] O0OoOO0OOOOO;
    public static /* synthetic */ Object[] q0OOOoo00o0;
    private static /* synthetic */ int ooo00oo0Ooo0;
    private static /* synthetic */ boolean o0o000o0O0o0;

    /*
     * Unable to fully structure code
     */
    static { /* RISE-PORT STUB: initializer unrestored */ }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void q0OOOoo00o0() {
        int n2 = 1655152558;
        if (n2 != n2) {
        }
        O0OoOO0OOOOO = new int[0x6C83 ^ 0x6D13];
        g.O0OoOO0OOOOO[0x1FEF ^ 0x1EEA] = 0xBD17 ^ 0x1EEA;
        g.O0OoOO0OOOOO[0x10698 ^ 0x10603] = 0x10604 ^ 0x10603;
        g.O0OoOO0OOOOO[0xE666 ^ 0xE651] = 0xFFFF19AE ^ 0xE651;
        int n3 = -1151129375;
        block86: while (true) {
            switch (n3) {
                case 1658264816: {
                    g.O0OoOO0OOOOO[0x1019F ^ 0x10165] = 0x16ECB ^ 0x10165;
                    n3 = 1951960031;
                    continue block86;
                }
                case 1951960031: {
                    g.O0OoOO0OOOOO[0xFE7 ^ 0xFA0] = 0xFAB ^ 0xFA0;
                    g.O0OoOO0OOOOO[0xC3AC ^ 0xC3B3] = 0xC3B6 ^ 0xC3B3;
                    g.O0OoOO0OOOOO[0x46A8 ^ 0x466B] = 0x9E0E ^ 0x466B;
                    g.O0OoOO0OOOOO[0xC03B ^ 0xC04F] = 0xFFFF3FB0 ^ 0xC04F;
                    g.O0OoOO0OOOOO[0x3FB4 ^ 0x3FB0] = 0xFFFFC068 ^ 0x3FB0;
                    g.O0OoOO0OOOOO[0x2106 ^ 0x21E0] = 0xFFFF779B ^ 0x21E0;
                    g.O0OoOO0OOOOO[0x2AD5 ^ 0x2A21] = 0x1240D ^ 0x2A21;
                    n3 = 1750349519;
                    continue block86;
                }
                case 1750349519: {
                    g.O0OoOO0OOOOO[0x8F0E ^ 0x8E26] = 0x18775 ^ 0x8E26;
                    g.O0OoOO0OOOOO[0xFDD1 ^ 0xFDA0] = 0xFD99 ^ 0xFDA0;
                    g.O0OoOO0OOOOO[0xE55D ^ 0xE5F5] = 0xB1E2 ^ 0xE5F5;
                    g.O0OoOO0OOOOO[0x5EED ^ 0x5FB9] = 0xA081 ^ 0x5FB9;
                    n3 = 2077762710;
                    continue block86;
                }
                case 2077762710: {
                    g.O0OoOO0OOOOO[0x8F8 ^ 0x8FA] = 0x8ED ^ 0x8FA;
                    n3 = -1239415046;
                    continue block86;
                }
                case -1239415046: {
                    g.O0OoOO0OOOOO[0xD248 ^ 0xD2C4] = 0xFFFF2D6F ^ 0xD2C4;
                    n3 = 1759135794;
                    continue block86;
                }
                case 1759135794: {
                    g.O0OoOO0OOOOO[0xA415 ^ 0xA4F7] = 0x7036 ^ 0xA4F7;
                    g.O0OoOO0OOOOO[0x67C2 ^ 0x6683] = 0x5B96 ^ 0x6683;
                    n3 = 189324758;
                    continue block86;
                }
                case 189324758: {
                    g.O0OoOO0OOOOO[0x1DAE ^ 0x1DC2] = 0x1D81 ^ 0x1DC2;
                    g.O0OoOO0OOOOO[0x371 ^ 0x210] = 0x9D17 ^ 0x210;
                    n3 = -33662942;
                    continue block86;
                }
                case -33662942: {
                    g.O0OoOO0OOOOO[0xA112 ^ 0xA062] = 0xA060 ^ 0xA062;
                    g.O0OoOO0OOOOO[0xAF3 ^ 0xB9C] = 0xB92 ^ 0xB9C;
                    g.O0OoOO0OOOOO[0xD7AD ^ 0xD6CF] = 0xFFFFB648 ^ 0xD6CF;
                    g.O0OoOO0OOOOO[0x40E ^ 0x550] = 0xFFFFBA75 ^ 0x550;
                    g.O0OoOO0OOOOO[0x10D78 ^ 0x10C38] = 0x13128 ^ 0x10C38;
                    n3 = -1647176254;
                    continue block86;
                }
                case -1647176254: {
                    g.O0OoOO0OOOOO[0xC35F ^ 0xC388] = 0xFFFF8F03 ^ 0xC388;
                    g.O0OoOO0OOOOO[0x65AC ^ 0x65EA] = 0x801EC896 ^ 0x65EA;
                    g.O0OoOO0OOOOO[0xC8F ^ 0xDE1] = 0x8AE5 ^ 0xDE1;
                    g.O0OoOO0OOOOO[0xA2B3 ^ 0xA296] = 0xA296 ^ 0xA296;
                    g.O0OoOO0OOOOO[0x6DE2 ^ 0x6CD9] = 0xD3AC ^ 0x6CD9;
                    n3 = -1183037775;
                    continue block86;
                }
                case -1183037775: {
                    g.O0OoOO0OOOOO[0x1C8 ^ 0x18D] = 0x19A ^ 0x18D;
                    n3 = -1422063257;
                    continue block86;
                }
                case -1422063257: {
                    g.O0OoOO0OOOOO[0x923A ^ 0x92FA] = 0xD672 ^ 0x92FA;
                    n3 = -75955024;
                    continue block86;
                }
                case -75955024: {
                    g.O0OoOO0OOOOO[0x6351 ^ 0x6213] = 0x5F4B ^ 0x6213;
                    g.O0OoOO0OOOOO[0xB599 ^ 0xB48E] = 0x6747 ^ 0xB48E;
                    g.O0OoOO0OOOOO[0x1D85 ^ 0x1C94] = 0x942E ^ 0x1C94;
                    g.O0OoOO0OOOOO[0x2D52 ^ 0x2CD8] = 0x2CD1 ^ 0x2CD8;
                    n3 = -1247761835;
                    continue block86;
                }
                case -1247761835: {
                    g.O0OoOO0OOOOO[0x8F33 ^ 0x8F5D] = 0x8F42 ^ 0x8F5D;
                    g.O0OoOO0OOOOO[0xD571 ^ 0xD533] = 0x6666B3E9 ^ 0xD533;
                    g.O0OoOO0OOOOO[0xE886 ^ 0xE840] = 0xC4E7 ^ 0xE840;
                    g.O0OoOO0OOOOO[0x9C79 ^ 0x9C39] = 0xFFFF63A4 ^ 0x9C39;
                    n3 = 108401228;
                    continue block86;
                }
                case 108401228: {
                    g.O0OoOO0OOOOO[0xCFA ^ 0xC24] = 0xF240 ^ 0xC24;
                    n3 = -1351930402;
                    continue block86;
                }
                case -1351930402: {
                    g.O0OoOO0OOOOO[0xDC8C ^ 0xDDDA] = 0x229A ^ 0xDDDA;
                    n3 = 1319628339;
                    continue block86;
                }
                case 1319628339: {
                    g.O0OoOO0OOOOO[0xFC0A ^ 0xFC95] = 0x1F790 ^ 0xFC95;
                    g.O0OoOO0OOOOO[0xD18E ^ 0xD163] = 0xD6B0 ^ 0xD163;
                    g.O0OoOO0OOOOO[0xD728 ^ 0xD773] = 0x1FEE ^ 0xD773;
                    g.O0OoOO0OOOOO[0xD514 ^ 0xD5FC] = 0x1677 ^ 0xD5FC;
                    g.O0OoOO0OOOOO[0xF330 ^ 0xF22E] = 0xFFFE013C ^ 0xF22E;
                    n3 = 1929717539;
                    continue block86;
                }
                case 1929717539: {
                    g.O0OoOO0OOOOO[0xB1FD ^ 0xB154] = 0x4156 ^ 0xB154;
                    g.O0OoOO0OOOOO[0xF269 ^ 0xF23C] = 0xF245 ^ 0xF23C;
                    n3 = -1099767150;
                    continue block86;
                }
                case -1099767150: {
                    g.O0OoOO0OOOOO[0x5EC9 ^ 0x5EED] = 0x5EED ^ 0x5EED;
                    g.O0OoOO0OOOOO[0x54C ^ 0x573] = 0xFFFFFA8C ^ 0x573;
                    g.O0OoOO0OOOOO[0xF670 ^ 0xF6B7] = 0xDA50 ^ 0xF6B7;
                    g.O0OoOO0OOOOO[0xAE38 ^ 0xAF39] = 0x580F ^ 0xAF39;
                    g.O0OoOO0OOOOO[0x55BE ^ 0x55E7] = 0xFFFFAA0E ^ 0x55E7;
                    g.O0OoOO0OOOOO[0xFF97 ^ 0xFF99] = 0xFFFF004C ^ 0xFF99;
                    g.O0OoOO0OOOOO[0xA630 ^ 0xA76C] = 0xE7BA ^ 0xA76C;
                    g.O0OoOO0OOOOO[0x3BE7 ^ 0x3B59] = 0x7FD1 ^ 0x3B59;
                    g.O0OoOO0OOOOO[0x2A63 ^ 0x2A3F] = 0x73EC87DC ^ 0x2A3F;
                    g.O0OoOO0OOOOO[0x5656 ^ 0x5701] = 0xA82F ^ 0x5701;
                    g.O0OoOO0OOOOO[0x24B9 ^ 0x253A] = 0x255E ^ 0x253A;
                    g.O0OoOO0OOOOO[0xF382 ^ 0xF3E3] = 0xF3E4 ^ 0xF3E3;
                    g.O0OoOO0OOOOO[0x21F2 ^ 0x2188] = 0xFEFFDE77 ^ 0x2188;
                    g.O0OoOO0OOOOO[0x4821 ^ 0x48A1] = 0xFFFFB75E ^ 0x48A1;
                    n3 = 302423235;
                    continue block86;
                }
                case 302423235: {
                    g.O0OoOO0OOOOO[0x80A4 ^ 0x8002] = 0xD415 ^ 0x8002;
                    g.O0OoOO0OOOOO[0x95A ^ 0x866] = 0xE3C9 ^ 0x866;
                    g.O0OoOO0OOOOO[0x1E9B ^ 0x1E62] = 0x71C6 ^ 0x1E62;
                    g.O0OoOO0OOOOO[0xF989 ^ 0xF915] = 0xF90C ^ 0xF915;
                    g.O0OoOO0OOOOO[0x736C ^ 0x73F8] = 0xFFFF8C47 ^ 0x73F8;
                    g.O0OoOO0OOOOO[0x54E0 ^ 0x5455] = 0xAF14 ^ 0x5455;
                    g.O0OoOO0OOOOO[0x9B86 ^ 0x9B7B] = 0x7BB5 ^ 0x9B7B;
                    g.O0OoOO0OOOOO[0xC78D ^ 0xC72E] = 0x2790 ^ 0xC72E;
                    g.O0OoOO0OOOOO[0x2386 ^ 0x22C0] = 0xFFFF7D74 ^ 0x22C0;
                    g.O0OoOO0OOOOO[0xF34E ^ 0xF3CA] = 0xC1F08FD5 ^ 0xF3CA;
                    g.O0OoOO0OOOOO[0xB74B ^ 0xB662] = 0x1BF23 ^ 0xB662;
                    n3 = 685158198;
                    continue block86;
                }
                case 685158198: {
                    g.O0OoOO0OOOOO[0x69E0 ^ 0x696B] = 0x6944 ^ 0x696B;
                    g.O0OoOO0OOOOO[0xD61F ^ 0xD777] = 0xD777 ^ 0xD777;
                    g.O0OoOO0OOOOO[0xFF3E ^ 0xFFD9] = 0x561D ^ 0xFFD9;
                    g.O0OoOO0OOOOO[0x5E88 ^ 0x5E27] = 0xFFFF27E9 ^ 0x5E27;
                    n3 = -78248775;
                    continue block86;
                }
                case -78248775: {
                    g.O0OoOO0OOOOO[0x10D2F ^ 0x10C7A] = 0x1F354 ^ 0x10C7A;
                    n3 = 1788400800;
                    continue block86;
                }
                case 1788400800: {
                    g.O0OoOO0OOOOO[0x767C ^ 0x766B] = 0x7620 ^ 0x766B;
                    g.O0OoOO0OOOOO[0x516F ^ 0x51DD] = 0x24AE ^ 0x51DD;
                    n3 = 499918717;
                    continue block86;
                }
                case 499918717: {
                    g.O0OoOO0OOOOO[0x9FED ^ 0x9E9B] = 0x9E96 ^ 0x9E9B;
                    g.O0OoOO0OOOOO[0x5CFD ^ 0x5D82] = 0xFFFFA23A ^ 0x5D82;
                    g.O0OoOO0OOOOO[0xA0FD ^ 0xA1CC] = 0xB9B6 ^ 0xA1CC;
                    g.O0OoOO0OOOOO[0x1085F ^ 0x10829] = 0x1086A ^ 0x10829;
                    g.O0OoOO0OOOOO[0xC4D2 ^ 0xC465] = 0xFFFFC08A ^ 0xC465;
                    g.O0OoOO0OOOOO[0x1C0D ^ 0x1C0C] = 0x1C05 ^ 0x1C0C;
                    g.O0OoOO0OOOOO[0xD3AA ^ 0xD35F] = 0x1DD71 ^ 0xD35F;
                    g.O0OoOO0OOOOO[0x41D2 ^ 0x41B4] = 0x41BB ^ 0x41B4;
                    g.O0OoOO0OOOOO[0xAA9A ^ 0xABDD] = 0xBA5 ^ 0xABDD;
                    g.O0OoOO0OOOOO[0xF106 ^ 0xF18C] = 0xEFB9B0E1 ^ 0xF18C;
                    n3 = -828170297;
                    continue block86;
                }
                case -828170297: {
                    g.O0OoOO0OOOOO[0xE053 ^ 0xE01E] = 0xE38ED8FE ^ 0xE01E;
                    g.O0OoOO0OOOOO[0x874E ^ 0x8707] = 0x877E ^ 0x8707;
                    g.O0OoOO0OOOOO[0x437F ^ 0x430D] = 0x4312 ^ 0x430D;
                    g.O0OoOO0OOOOO[0xFA81 ^ 0xFBC2] = 0xC6D7 ^ 0xFBC2;
                    g.O0OoOO0OOOOO[0xE054 ^ 0xE164] = 0xF910 ^ 0xE164;
                    g.O0OoOO0OOOOO[0xC63A ^ 0xC64F] = 0xC649 ^ 0xC64F;
                    g.O0OoOO0OOOOO[0xD67E ^ 0xD6A5] = 0x650B ^ 0xD6A5;
                    g.O0OoOO0OOOOO[0x2438 ^ 0x245C] = 0xFFFFDBA3 ^ 0x245C;
                    g.O0OoOO0OOOOO[0xF7F6 ^ 0xF6FF] = 0x7CB2 ^ 0xF6FF;
                    g.O0OoOO0OOOOO[0xF2B4 ^ 0xF2C4] = 0xFFFF0D1C ^ 0xF2C4;
                    g.O0OoOO0OOOOO[0xAE57 ^ 0xAE9D] = 0xBBC3 ^ 0xAE9D;
                    n3 = -1245598484;
                    continue block86;
                }
                case -1245598484: {
                    g.O0OoOO0OOOOO[0x66C2 ^ 0x6643] = 0x666E ^ 0x6643;
                    g.O0OoOO0OOOOO[0x7EAF ^ 0x7F29] = 0x7F26 ^ 0x7F29;
                    g.O0OoOO0OOOOO[0x979 ^ 0x979] = 0x7CFFF680 ^ 0x979;
                    g.O0OoOO0OOOOO[0x56ED ^ 0x5602] = 0x51D1 ^ 0x5602;
                    g.O0OoOO0OOOOO[0x950B ^ 0x9432] = 0x2B47 ^ 0x9432;
                    g.O0OoOO0OOOOO[0x8662 ^ 0x86EF] = 0x1008681 ^ 0x86EF;
                    g.O0OoOO0OOOOO[0x61F1 ^ 0x6094] = 0x6094 ^ 0x6094;
                    g.O0OoOO0OOOOO[0xF9A5 ^ 0xF95E] = 0x96FA ^ 0xF95E;
                    g.O0OoOO0OOOOO[0x9A4A ^ 0x9B3E] = 0x9B3B ^ 0x9B3E;
                    g.O0OoOO0OOOOO[0x2248 ^ 0x2287] = 0xFFFF1487 ^ 0x2287;
                    g.O0OoOO0OOOOO[0x2088 ^ 0x21F5] = 0x21FC ^ 0x21F5;
                    g.O0OoOO0OOOOO[0xC7B7 ^ 0xC797] = 0xC78C ^ 0xC797;
                    g.O0OoOO0OOOOO[0xE67D ^ 0xE734] = 0x43BF ^ 0xE734;
                    g.O0OoOO0OOOOO[0x1023E ^ 0x1027D] = 0x1020E ^ 0x1027D;
                    n3 = -1945278028;
                    continue block86;
                }
                case -1945278028: {
                    g.O0OoOO0OOOOO[0x3D42 ^ 0x3C38] = 0x3C3A ^ 0x3C38;
                    g.O0OoOO0OOOOO[0xD8AB ^ 0xD8F5] = 0x42105CD4 ^ 0xD8F5;
                    n3 = 844236736;
                    continue block86;
                }
                case 844236736: {
                    g.O0OoOO0OOOOO[0xC726 ^ 0xC7BF] = 0xC80C ^ 0xC7BF;
                    g.O0OoOO0OOOOO[0xF6E1 ^ 0xF7C6] = 0xC239 ^ 0xF7C6;
                    g.O0OoOO0OOOOO[0x4C3B ^ 0x4D17] = 0xC342 ^ 0x4D17;
                    n3 = -1750805722;
                    continue block86;
                }
                case -1750805722: {
                    g.O0OoOO0OOOOO[0xDE77 ^ 0xDF24] = 0x7F0D ^ 0xDF24;
                    g.O0OoOO0OOOOO[0x4CAD ^ 0x4C7D] = 0x85FE ^ 0x4C7D;
                    g.O0OoOO0OOOOO[0xE2C5 ^ 0xE2FD] = 0xFFFF1D02 ^ 0xE2FD;
                    g.O0OoOO0OOOOO[0x9F3E ^ 0x9EBE] = 0x9EBD ^ 0x9EBE;
                    g.O0OoOO0OOOOO[0xFB0 ^ 0xE92] = 0x7B0 ^ 0xE92;
                    g.O0OoOO0OOOOO[0x2BF7 ^ 0x2B2D] = 0x98DE ^ 0x2B2D;
                    n3 = 1867238189;
                    continue block86;
                }
                case 1867238189: {
                    g.O0OoOO0OOOOO[0x2FD ^ 0x26E] = 0xFFFFFDF1 ^ 0x26E;
                    g.O0OoOO0OOOOO[0xEEF0 ^ 0xEFFD] = 0xEAC6 ^ 0xEFFD;
                    g.O0OoOO0OOOOO[0xBA85 ^ 0xBA9B] = 0xBA94 ^ 0xBA9B;
                    n3 = -1561910324;
                    continue block86;
                }
                case -1561910324: {
                    g.O0OoOO0OOOOO[0x70E4 ^ 0x70F0] = 0xCCCCBC3C ^ 0x70F0;
                    g.O0OoOO0OOOOO[0x7A2B ^ 0x7A8E] = 0x2E95 ^ 0x7A8E;
                    g.O0OoOO0OOOOO[0x61DB ^ 0x6160] = 0xFFFF4A19 ^ 0x6160;
                    g.O0OoOO0OOOOO[0xE182 ^ 0xE0A3] = 0xE9A6 ^ 0xE0A3;
                    g.O0OoOO0OOOOO[0x7D ^ 0x104] = 0x16C ^ 0x104;
                    g.O0OoOO0OOOOO[0xE4AC ^ 0xE5E1] = 0xC8E3 ^ 0xE5E1;
                    g.O0OoOO0OOOOO[0xA1A5 ^ 0xA081] = 0x957E ^ 0xA081;
                    g.O0OoOO0OOOOO[0xC098 ^ 0xC091] = 0xBBBB7B2A ^ 0xC091;
                    g.O0OoOO0OOOOO[0xB355 ^ 0xB31D] = 0xB308 ^ 0xB31D;
                    g.O0OoOO0OOOOO[0x9FB3 ^ 0x9FF9] = 0x9EC876A8 ^ 0x9FF9;
                    g.O0OoOO0OOOOO[0x10F17 ^ 0x10F01] = 0x10F18 ^ 0x10F01;
                    g.O0OoOO0OOOOO[0x3AFA ^ 0x3BC8] = 0x23DD ^ 0x3BC8;
                    n3 = 329233621;
                    continue block86;
                }
                case 329233621: {
                    g.O0OoOO0OOOOO[0x770F ^ 0x77C2] = 0xBE40 ^ 0x77C2;
                    g.O0OoOO0OOOOO[0x513 ^ 0x410] = 0xF326 ^ 0x410;
                    n3 = 151684832;
                    continue block86;
                }
                case 151684832: {
                    g.O0OoOO0OOOOO[0x304E ^ 0x305D] = 0x305C ^ 0x305D;
                    g.O0OoOO0OOOOO[0xE105 ^ 0xE193] = 0xE1AC ^ 0xE193;
                    g.O0OoOO0OOOOO[0x2777 ^ 0x2627] = 0x8612 ^ 0x2627;
                    g.O0OoOO0OOOOO[0xD40D ^ 0xD473] = 0xFFFF2BE4 ^ 0xD473;
                    g.O0OoOO0OOOOO[0x2FC4 ^ 0x2FB9] = 0x2FAA ^ 0x2FB9;
                    g.O0OoOO0OOOOO[0xB3BC ^ 0xB38D] = 0xC430E107 ^ 0xB38D;
                    g.O0OoOO0OOOOO[0x1907 ^ 0x1860] = 0x1861 ^ 0x1860;
                    g.O0OoOO0OOOOO[0xFB7A ^ 0xFB76] = 0xFB79 ^ 0xFB76;
                    g.O0OoOO0OOOOO[0x52D6 ^ 0x53BA] = 0x53BC ^ 0x53BA;
                    n3 = -1387714877;
                    continue block86;
                }
                case -1387714877: {
                    g.O0OoOO0OOOOO[0x2DDF ^ 0x2C5D] = 0x2C5A ^ 0x2C5D;
                    g.O0OoOO0OOOOO[0xFAE8 ^ 0xFA90] = 0xFAB9 ^ 0xFA90;
                    n3 = -1756014532;
                    continue block86;
                }
                case -1756014532: {
                    g.O0OoOO0OOOOO[0x880C ^ 0x896A] = 0x896A ^ 0x896A;
                    g.O0OoOO0OOOOO[0x7786 ^ 0x775A] = 0xC4A9 ^ 0x775A;
                    g.O0OoOO0OOOOO[0x7CB5 ^ 0x7CD7] = 0x7CDE ^ 0x7CD7;
                    g.O0OoOO0OOOOO[0x2900 ^ 0x29C1] = 0xF18C ^ 0x29C1;
                    g.O0OoOO0OOOOO[0x5014 ^ 0x514F] = 0x2BC6 ^ 0x514F;
                    g.O0OoOO0OOOOO[0x10265 ^ 0x10379] = 0xFCB ^ 0x10379;
                    g.O0OoOO0OOOOO[0x8834 ^ 0x891F] = 0x1805E ^ 0x891F;
                    g.O0OoOO0OOOOO[0xEF69 ^ 0xEF53] = 0xEF58 ^ 0xEF53;
                    g.O0OoOO0OOOOO[0xC143 ^ 0xC1C4] = 0xFFFF3E2B ^ 0xC1C4;
                    n3 = -976216668;
                    continue block86;
                }
                case -976216668: {
                    g.O0OoOO0OOOOO[0x2785 ^ 0x2765] = 0xD901 ^ 0x2765;
                    n3 = 624011796;
                    continue block86;
                }
                case 624011796: {
                    g.O0OoOO0OOOOO[0xD843 ^ 0xD912] = 0x793B ^ 0xD912;
                    g.O0OoOO0OOOOO[0xF3DF ^ 0xF2C2] = 0x1FE68 ^ 0xF2C2;
                    n3 = -363422036;
                    continue block86;
                }
                case -363422036: {
                    g.O0OoOO0OOOOO[0x30F4 ^ 0x31F3] = 0x920E ^ 0x31F3;
                    g.O0OoOO0OOOOO[0x1727 ^ 0x1637] = 0x9E98 ^ 0x1637;
                    n3 = -1409851832;
                    continue block86;
                }
                case -1409851832: {
                    g.O0OoOO0OOOOO[0x5C0F ^ 0x5D05] = 0xD768 ^ 0x5D05;
                    g.O0OoOO0OOOOO[0x818F ^ 0x81DF] = 0x81F8 ^ 0x81DF;
                    g.O0OoOO0OOOOO[0x8B02 ^ 0x8BB8] = 0x5F2B ^ 0x8BB8;
                    g.O0OoOO0OOOOO[0x61EB ^ 0x6086] = 0x608C ^ 0x6086;
                    g.O0OoOO0OOOOO[0xB6F9 ^ 0xB693] = 0xFFFF493A ^ 0xB693;
                    g.O0OoOO0OOOOO[0x8DEC ^ 0x8D1D] = 0x457 ^ 0x8D1D;
                    g.O0OoOO0OOOOO[0x9582 ^ 0x9510] = 0xE07E926F ^ 0x9510;
                    n3 = 1428653254;
                    continue block86;
                }
                case 1428653254: {
                    g.O0OoOO0OOOOO[0xD53A ^ 0xD583] = 0x113 ^ 0xD583;
                    n3 = -1908544317;
                    continue block86;
                }
                case -1908544317: {
                    g.O0OoOO0OOOOO[0x900 ^ 0x87C] = 0x87A ^ 0x87C;
                    g.O0OoOO0OOOOO[0x23C9 ^ 0x239B] = 0x2386 ^ 0x239B;
                    g.O0OoOO0OOOOO[0x5002 ^ 0x5118] = 0x704C ^ 0x5118;
                    n3 = 979995689;
                    continue block86;
                }
                case 979995689: {
                    g.O0OoOO0OOOOO[0xC4FF ^ 0xC4B1] = 0xFFFF3B46 ^ 0xC4B1;
                    g.O0OoOO0OOOOO[0x55ED ^ 0x54F4] = 0x75AC ^ 0x54F4;
                    g.O0OoOO0OOOOO[0x9A0B ^ 0x9A74] = 0xFFFF65D7 ^ 0x9A74;
                    g.O0OoOO0OOOOO[0x284C ^ 0x28A5] = 0xEB2D ^ 0x28A5;
                    n3 = 489878591;
                    continue block86;
                }
                case 489878591: {
                    g.O0OoOO0OOOOO[0xC690 ^ 0xC628] = 0x3D6C ^ 0xC628;
                    n3 = -1626111883;
                    continue block86;
                }
                case -1626111883: {
                    g.O0OoOO0OOOOO[0x6575 ^ 0x650C] = 0xFFFF9AF3 ^ 0x650C;
                    n3 = 280417207;
                    continue block86;
                }
                case 280417207: {
                    g.O0OoOO0OOOOO[0x1E57 ^ 0x1F22] = 0xFFFFE0E8 ^ 0x1F22;
                    g.O0OoOO0OOOOO[0xAA03 ^ 0xAB1B] = 0x8A5C ^ 0xAB1B;
                    n3 = 858972327;
                    continue block86;
                }
                case 858972327: {
                    g.O0OoOO0OOOOO[0xBDDC ^ 0xBD8A] = 0xFFFF4213 ^ 0xBD8A;
                    g.O0OoOO0OOOOO[0x8C2F ^ 0x8CCE] = 0x8CCE ^ 0x8CCE;
                    g.O0OoOO0OOOOO[0xD170 ^ 0xD1C0] = 0x57E7 ^ 0xD1C0;
                    g.O0OoOO0OOOOO[0x15E4 ^ 0x15B3] = 0x1339 ^ 0x15B3;
                    g.O0OoOO0OOOOO[0x10E20 ^ 0x10EF4] = 0x1989B ^ 0x10EF4;
                    g.O0OoOO0OOOOO[0xFA00 ^ 0xFA8E] = 0xFAB5 ^ 0xFA8E;
                    g.O0OoOO0OOOOO[0x1795 ^ 0x16C7] = 0xB6AF ^ 0x16C7;
                    g.O0OoOO0OOOOO[0x9422 ^ 0x9432] = 0xFFFF6BCD ^ 0x9432;
                    g.O0OoOO0OOOOO[0xA06D ^ 0xA05B] = 0xFFFF5FA4 ^ 0xA05B;
                    g.O0OoOO0OOOOO[0x41CE ^ 0x4196] = 0x4210C5B7 ^ 0x4196;
                    g.O0OoOO0OOOOO[0x8081 ^ 0x8189] = 0xBD7 ^ 0x8189;
                    g.O0OoOO0OOOOO[0xE4D8 ^ 0xE5E0] = 0x5A8C ^ 0xE5E0;
                    n3 = 599904376;
                    continue block86;
                }
                case 599904376: {
                    g.O0OoOO0OOOOO[0xBF92 ^ 0xBF2E] = 0x6BBD ^ 0xBF2E;
                    g.O0OoOO0OOOOO[0x5499 ^ 0x546F] = 0x15A0B ^ 0x546F;
                    n3 = -981217076;
                    continue block86;
                }
                case -981217076: {
                    g.O0OoOO0OOOOO[0x1990 ^ 0x19B3] = 0x19B3 ^ 0x19B3;
                    g.O0OoOO0OOOOO[0x1F15 ^ 0x1FF9] = 0x182E ^ 0x1FF9;
                    g.O0OoOO0OOOOO[0x101EB ^ 0x100C6] = 0x18E84 ^ 0x100C6;
                    n3 = -1389625860;
                    continue block86;
                }
                case -1389625860: {
                    g.O0OoOO0OOOOO[0x2FF9 ^ 0x2F4A] = 0x5A0A ^ 0x2F4A;
                    n3 = -1518068959;
                    continue block86;
                }
                case -1518068959: {
                    g.O0OoOO0OOOOO[0x266F ^ 0x26E0] = 0xFFFFD94B ^ 0x26E0;
                    n3 = -1737169285;
                    continue block86;
                }
                case -1737169285: {
                    g.O0OoOO0OOOOO[0xC603 ^ 0xC6CB] = 0xEA6C ^ 0xC6CB;
                    g.O0OoOO0OOOOO[0xC747 ^ 0xC667] = 0xCF69 ^ 0xC667;
                    g.O0OoOO0OOOOO[0x195D ^ 0x1836] = 0x183C ^ 0x1836;
                    g.O0OoOO0OOOOO[0xE086 ^ 0xE024] = 0x90 ^ 0xE024;
                    g.O0OoOO0OOOOO[0x5107 ^ 0x51D4] = 0xFFFF382D ^ 0x51D4;
                    n3 = -820713271;
                    continue block86;
                }
                case -820713271: {
                    g.O0OoOO0OOOOO[0x7342 ^ 0x73A6] = 0xDA6E ^ 0x73A6;
                    g.O0OoOO0OOOOO[0xE2A ^ 0xEBD] = 0xFFFFF144 ^ 0xEBD;
                    g.O0OoOO0OOOOO[0x67D4 ^ 0x6773] = 0x331A ^ 0x6773;
                    g.O0OoOO0OOOOO[0xD502 ^ 0xD44C] = 0xFFFF06A5 ^ 0xD44C;
                    g.O0OoOO0OOOOO[0x37D ^ 0x26F] = 0xFFFF7504 ^ 0x26F;
                    g.O0OoOO0OOOOO[0xB657 ^ 0xB606] = 0xFFFF4993 ^ 0xB606;
                    g.O0OoOO0OOOOO[0x619F ^ 0x6094] = 0xEAD9 ^ 0x6094;
                    g.O0OoOO0OOOOO[0x9E73 ^ 0x9EED] = 0x9EED ^ 0x9EED;
                    g.O0OoOO0OOOOO[0xFD11 ^ 0xFD55] = 0xFD5A ^ 0xFD55;
                    n3 = -1804204419;
                    continue block86;
                }
                case -1804204419: {
                    g.O0OoOO0OOOOO[0x941B ^ 0x94D5] = 0x5D56 ^ 0x94D5;
                    n3 = -374100496;
                    continue block86;
                }
                case -374100496: {
                    g.O0OoOO0OOOOO[0x4024 ^ 0x41A8] = 0x41A3 ^ 0x41A8;
                    g.O0OoOO0OOOOO[0xCA91 ^ 0xCA72] = 0x1E93 ^ 0xCA72;
                    g.O0OoOO0OOOOO[0xF587 ^ 0xF542] = 0xD9E7 ^ 0xF542;
                    g.O0OoOO0OOOOO[0x14FC ^ 0x15E8] = 0xC631 ^ 0x15E8;
                    g.O0OoOO0OOOOO[0xE1A6 ^ 0xE0DD] = 0xFFFF1F5A ^ 0xE0DD;
                    g.O0OoOO0OOOOO[0xD60A ^ 0xD621] = 0xEBFB ^ 0xD621;
                    n3 = -444410731;
                    continue block86;
                }
                case -444410731: {
                    g.O0OoOO0OOOOO[0x677F ^ 0x6741] = 0x19849C5E ^ 0x6741;
                    g.O0OoOO0OOOOO[0x7DEF ^ 0x7C85] = 0x7C83 ^ 0x7C85;
                    g.O0OoOO0OOOOO[0x94C4 ^ 0x9549] = 0xFFFF6AC9 ^ 0x9549;
                    g.O0OoOO0OOOOO[0x29F5 ^ 0x299D] = 0x299A ^ 0x299D;
                    g.O0OoOO0OOOOO[0xD3C ^ 0xDC3] = 0xED0D ^ 0xDC3;
                    g.O0OoOO0OOOOO[0xB442 ^ 0xB521] = 0x2A26 ^ 0xB521;
                    g.O0OoOO0OOOOO[0x3D62 ^ 0x3DCE] = 0xCDCB ^ 0x3DCE;
                    n3 = -1746955937;
                    continue block86;
                }
                case -1746955937: {
                    g.O0OoOO0OOOOO[0x1011B ^ 0x10025] = 0x1EB9B ^ 0x10025;
                    g.O0OoOO0OOOOO[0x63CA ^ 0x6324] = 0xFFFF9B2D ^ 0x6324;
                    n3 = -2034961798;
                    continue block86;
                }
                case -2034961798: {
                    g.O0OoOO0OOOOO[0x9EB ^ 0x94F] = 0xE9FB ^ 0x94F;
                    g.O0OoOO0OOOOO[0x1148 ^ 0x100D] = 0xB075 ^ 0x100D;
                    g.O0OoOO0OOOOO[0xFE2D ^ 0xFF4D] = 0x604C ^ 0xFF4D;
                    g.O0OoOO0OOOOO[0xA445 ^ 0xA467] = 0xA467 ^ 0xA467;
                    g.O0OoOO0OOOOO[0x6039 ^ 0x610C] = 0x8395 ^ 0x610C;
                    g.O0OoOO0OOOOO[0xAEEB ^ 0xAEFE] = 0xAEF9 ^ 0xAEFE;
                    g.O0OoOO0OOOOO[0x8108 ^ 0x8087] = 0x80A0 ^ 0x8087;
                    g.O0OoOO0OOOOO[0x45A4 ^ 0x44E0] = 0xE495 ^ 0x44E0;
                    g.O0OoOO0OOOOO[0xF98C ^ 0xF9AD] = 0xF9D8 ^ 0xF9AD;
                    g.O0OoOO0OOOOO[0x103C0 ^ 0x102B1] = 0x1C86E ^ 0x102B1;
                    g.O0OoOO0OOOOO[0x3F41 ^ 0x3F36] = 0xFFFFC0C9 ^ 0x3F36;
                    n3 = 1345151370;
                    continue block86;
                }
                case 1345151370: {
                    g.O0OoOO0OOOOO[0xABFE ^ 0xAB32] = 0xBE6C ^ 0xAB32;
                    n3 = -1975434347;
                    continue block86;
                }
                case -1975434347: {
                    g.O0OoOO0OOOOO[0xBD4E ^ 0xBC01] = 0x9103 ^ 0xBC01;
                    g.O0OoOO0OOOOO[0x9325 ^ 0x9227] = 0xFFFF9AB3 ^ 0x9227;
                    g.O0OoOO0OOOOO[0x8147 ^ 0x812C] = 0x813B ^ 0x812C;
                    n3 = 1414587580;
                    continue block86;
                }
                case 1414587580: {
                    g.O0OoOO0OOOOO[0x13ED ^ 0x12DB] = 0xF00B ^ 0x12DB;
                    g.O0OoOO0OOOOO[0xDC34 ^ 0xDC6E] = 0xFFFF2391 ^ 0xDC6E;
                    g.O0OoOO0OOOOO[0x8DCA ^ 0x8D2F] = 0x24EB ^ 0x8D2F;
                    g.O0OoOO0OOOOO[0xDCE4 ^ 0xDCF9] = 0xDCE8 ^ 0xDCF9;
                    g.O0OoOO0OOOOO[0x7EE7 ^ 0x7FF4] = 0xF74E ^ 0x7FF4;
                    g.O0OoOO0OOOOO[0x2E0 ^ 0x2BD] = 0x2AA ^ 0x2BD;
                    g.O0OoOO0OOOOO[0x1681 ^ 0x16FA] = 0xFFFFE905 ^ 0x16FA;
                    g.O0OoOO0OOOOO[0xD842 ^ 0xD825] = 0xFA1DB486 ^ 0xD825;
                    g.O0OoOO0OOOOO[0x1020D ^ 0x10217] = 0x10242 ^ 0x10217;
                    g.O0OoOO0OOOOO[0xC4CE ^ 0xC4C1] = 0xC4FF ^ 0xC4C1;
                    g.O0OoOO0OOOOO[0xE356 ^ 0xE36A] = 0xFFFF1C8F ^ 0xE36A;
                    g.O0OoOO0OOOOO[0xD2C7 ^ 0xD2DB] = 0xFFFA6D24 ^ 0xD2DB;
                    g.O0OoOO0OOOOO[0x43AA ^ 0x430B] = 0xA3B9 ^ 0x430B;
                    g.O0OoOO0OOOOO[0xFF70 ^ 0xFEFB] = 0xFEA9 ^ 0xFEFB;
                    g.O0OoOO0OOOOO[0x42B3 ^ 0x42DC] = 0x42EF ^ 0x42DC;
                    n3 = -705505829;
                    continue block86;
                }
                case -705505829: {
                    g.O0OoOO0OOOOO[0x1AA0 ^ 0x1A35] = 0xC5F93653 ^ 0x1A35;
                    g.O0OoOO0OOOOO[0x10FE3 ^ 0x10E6A] = 0xFFFEF1F1 ^ 0x10E6A;
                    n3 = -1327209053;
                    continue block86;
                }
                case -1327209053: {
                    g.O0OoOO0OOOOO[0x8EDD ^ 0x8E7D] = 0x18568 ^ 0x8E7D;
                    g.O0OoOO0OOOOO[0x16F ^ 0x11] = 0x1B ^ 0x11;
                    g.O0OoOO0OOOOO[0xB420 ^ 0xB410] = 0xB410 ^ 0xB410;
                    g.O0OoOO0OOOOO[0x7579 ^ 0x752D] = 0x4F24BCCD ^ 0x752D;
                    g.O0OoOO0OOOOO[0x52C7 ^ 0x52DF] = 0xEEEEBC30 ^ 0x52DF;
                    g.O0OoOO0OOOOO[0xB0EB ^ 0xB1D1] = 0xFFFFF179 ^ 0xB1D1;
                    g.O0OoOO0OOOOO[0x1B68 ^ 0x1A67] = 0x1F5C ^ 0x1A67;
                    g.O0OoOO0OOOOO[0x521E ^ 0x5283] = 0x5282 ^ 0x5283;
                    g.O0OoOO0OOOOO[0xC372 ^ 0xC3AA] = 0x70C6 ^ 0xC3AA;
                    g.O0OoOO0OOOOO[0xE6EB ^ 0xE632] = 0x55C9 ^ 0xE632;
                    g.O0OoOO0OOOOO[0x3A02 ^ 0x3A2E] = 0x69BB ^ 0x3A2E;
                    n3 = -136322786;
                    continue block86;
                }
                case -136322786: {
                    g.O0OoOO0OOOOO[0xDF63 ^ 0xDFBC] = 0xFFFFDE7D ^ 0xDFBC;
                    g.O0OoOO0OOOOO[0x96FB ^ 0x97DE] = 0xA221 ^ 0x97DE;
                    g.O0OoOO0OOOOO[0x9E06 ^ 0x9EF5] = 0x17BF ^ 0x9EF5;
                    g.O0OoOO0OOOOO[0xAD26 ^ 0xAD3F] = 0xFFFF5295 ^ 0xAD3F;
                    g.O0OoOO0OOOOO[0x13E3 ^ 0x136A] = 0x1351 ^ 0x136A;
                    g.O0OoOO0OOOOO[0xF60C ^ 0xF63E] = 0xF62F ^ 0xF63E;
                    n3 = -2088772568;
                    continue block86;
                }
                case -2088772568: {
                    g.O0OoOO0OOOOO[0x1034D ^ 0x10324] = 0x10351 ^ 0x10324;
                    g.O0OoOO0OOOOO[0x749A ^ 0x75BC] = 0xFFFFBF91 ^ 0x75BC;
                    g.O0OoOO0OOOOO[0x1040E ^ 0x10508] = 0xFFFE5975 ^ 0x10508;
                    g.O0OoOO0OOOOO[0x4CF5 ^ 0x4D70] = 0xFFFFB280 ^ 0x4D70;
                    g.O0OoOO0OOOOO[0x5445 ^ 0x5428] = 0xFFFFABD5 ^ 0x5428;
                    n3 = 1385747683;
                    continue block86;
                }
                case 1385747683: {
                    g.O0OoOO0OOOOO[0x2C96 ^ 0x2DA1] = 0xCF38 ^ 0x2DA1;
                    g.O0OoOO0OOOOO[0xECA8 ^ 0xECD4] = 0xECD9 ^ 0xECD4;
                    g.O0OoOO0OOOOO[0x95DD ^ 0x9521] = 0x75E0 ^ 0x9521;
                    g.O0OoOO0OOOOO[0x6A2D ^ 0x6B77] = 0xFFFFEE32 ^ 0x6B77;
                    g.O0OoOO0OOOOO[0x10E19 ^ 0x10E11] = 0x10E1A ^ 0x10E11;
                    g.O0OoOO0OOOOO[0xA14E ^ 0xA1E5] = 0xFFFFAE61 ^ 0xA1E5;
                    g.O0OoOO0OOOOO[0x2C64 ^ 0x2D3D] = 0x57B4 ^ 0x2D3D;
                    g.O0OoOO0OOOOO[0xED70 ^ 0xEDA1] = 0x7BC1 ^ 0xEDA1;
                    g.O0OoOO0OOOOO[0x348 ^ 0x25E] = 0xFFFF2E01 ^ 0x25E;
                    n3 = 364960280;
                    continue block86;
                }
                case 364960280: {
                    g.O0OoOO0OOOOO[0xF0AF ^ 0xF087] = 0x3416 ^ 0xF087;
                    n3 = 574073195;
                    continue block86;
                }
                case 574073195: {
                    g.O0OoOO0OOOOO[0xD30E ^ 0xD3E4] = 0xFFFFEFBC ^ 0xD3E4;
                    g.O0OoOO0OOOOO[0xBB22 ^ 0xBBEB] = 0xAEBF ^ 0xBBEB;
                    g.O0OoOO0OOOOO[0x792F ^ 0x7985] = 0x8980 ^ 0x7985;
                    n3 = -851256227;
                    continue block86;
                }
                case -851256227: {
                    g.O0OoOO0OOOOO[0x289A ^ 0x288B] = 0x410438CA ^ 0x288B;
                    g.O0OoOO0OOOOO[0x1624 ^ 0x169B] = 0x5229 ^ 0x169B;
                    g.O0OoOO0OOOOO[0xCC27 ^ 0xCC08] = 0xCC03 ^ 0xCC08;
                    g.O0OoOO0OOOOO[0x4A2E ^ 0x4AB4] = 0xFFFFB507 ^ 0x4AB4;
                    g.O0OoOO0OOOOO[0xF4A8 ^ 0xF5A6] = 0xFFFF0F18 ^ 0xF5A6;
                    g.O0OoOO0OOOOO[0x1980 ^ 0x1944] = 0xC107 ^ 0x1944;
                    n3 = 526674029;
                    continue block86;
                }
                case 526674029: {
                    g.O0OoOO0OOOOO[0xBAC3 ^ 0xBBF0] = 0xA38A ^ 0xBBF0;
                    g.O0OoOO0OOOOO[0x357B ^ 0x3508] = 0x3509 ^ 0x3508;
                    g.O0OoOO0OOOOO[0xC432 ^ 0xC41B] = 0x1130 ^ 0xC41B;
                    g.O0OoOO0OOOOO[0x4D07 ^ 0x4DD2] = 0xFEBA ^ 0x4DD2;
                    g.O0OoOO0OOOOO[0xCB7D ^ 0xCB31] = 0xCB34 ^ 0xCB31;
                    g.O0OoOO0OOOOO[0xD0A7 ^ 0xD025] = 0x3BA6564B ^ 0xD025;
                    g.O0OoOO0OOOOO[0x49B0 ^ 0x4834] = 0x4830 ^ 0x4834;
                    n3 = -1991353788;
                    continue block86;
                }
                case -1991353788: {
                    g.O0OoOO0OOOOO[0x98C5 ^ 0x999A] = 0xD957 ^ 0x999A;
                    g.O0OoOO0OOOOO[0x8D29 ^ 0x8CA7] = 0x8CA7 ^ 0x8CA7;
                    n3 = -1962511307;
                    continue block86;
                }
                case -1962511307: {
                    g.O0OoOO0OOOOO[0x89F9 ^ 0x8909] = 0x52 ^ 0x8909;
                    n3 = -1986700343;
                    continue block86;
                }
                case -1986700343: {
                    g.O0OoOO0OOOOO[0xC173 ^ 0xC073] = 0x375B ^ 0xC073;
                    g.O0OoOO0OOOOO[0xD90A ^ 0xD98F] = 0xD9E8 ^ 0xD98F;
                    g.O0OoOO0OOOOO[0xC92A ^ 0xC9AC] = 0xFA363C5D ^ 0xC9AC;
                    g.O0OoOO0OOOOO[0x72A2 ^ 0x7291] = 0x729E ^ 0x7291;
                    g.O0OoOO0OOOOO[0x196F ^ 0x19DB] = 0x6CA8 ^ 0x19DB;
                    g.O0OoOO0OOOOO[0x5206 ^ 0x5375] = 0x5365 ^ 0x5375;
                    g.O0OoOO0OOOOO[0xDEEE ^ 0xDF8A] = 0xDF8A ^ 0xDF8A;
                    g.O0OoOO0OOOOO[0xAF1D ^ 0xAE29] = 0x4CAA ^ 0xAE29;
                    n3 = 2002172536;
                    continue block86;
                }
                case 2002172536: {
                    g.O0OoOO0OOOOO[0xEDD1 ^ 0xED2F] = 0xDFC ^ 0xED2F;
                    g.O0OoOO0OOOOO[0x686B ^ 0x6860] = 0x687B ^ 0x6860;
                    n3 = -452336009;
                    continue block86;
                }
                case -452336009: {
                    g.O0OoOO0OOOOO[0xE885 ^ 0xE9AA] = 0x67E8 ^ 0xE9AA;
                    g.O0OoOO0OOOOO[0xFC32 ^ 0xFD0F] = 0x16A8 ^ 0xFD0F;
                    g.O0OoOO0OOOOO[0xA3C9 ^ 0xA31F] = 0x1073 ^ 0xA31F;
                    g.O0OoOO0OOOOO[0x8DC0 ^ 0x8C9D] = 0xCC50 ^ 0x8C9D;
                    n3 = -678621311;
                    continue block86;
                }
                case -678621311: {
                    g.O0OoOO0OOOOO[0x4812 ^ 0x495A] = 0xEDD8 ^ 0x495A;
                    g.O0OoOO0OOOOO[0x42D3 ^ 0x43C6] = 0x900F ^ 0x43C6;
                    g.O0OoOO0OOOOO[0x9059 ^ 0x90C8] = 0x90DB ^ 0x90C8;
                    g.O0OoOO0OOOOO[0x4DF ^ 0x49E] = 0xFFFFFB5D ^ 0x49E;
                    g.O0OoOO0OOOOO[0xEA2D ^ 0xEA14] = 0xFFFF15C4 ^ 0xEA14;
                    g.O0OoOO0OOOOO[0xDB13 ^ 0xDB28] = 0xDB2F ^ 0xDB28;
                    n3 = 1885224136;
                    continue block86;
                }
                case 1885224136: {
                    g.O0OoOO0OOOOO[0xC52A ^ 0xC52D] = 0xC538 ^ 0xC52D;
                    g.O0OoOO0OOOOO[0xAC94 ^ 0xACB2] = 0xACB8 ^ 0xACB2;
                    g.O0OoOO0OOOOO[0x24E7 ^ 0x2415] = 0xFFFF529E ^ 0x2415;
                    g.O0OoOO0OOOOO[0x1954 ^ 0x1826] = 0x1827 ^ 0x1826;
                    n3 = -1937607893;
                    continue block86;
                }
                case -1937607893: {
                    g.O0OoOO0OOOOO[0xD6BC ^ 0xD6AE] = 0xD6AA ^ 0xD6AE;
                    g.O0OoOO0OOOOO[0xFB23 ^ 0xFB95] = 0xD1 ^ 0xFB95;
                    g.O0OoOO0OOOOO[0xB1FC ^ 0xB0E3] = 0x1BC49 ^ 0xB0E3;
                    g.O0OoOO0OOOOO[0x65EE ^ 0x64C0] = 0xEACD ^ 0x64C0;
                    g.O0OoOO0OOOOO[0xBCA ^ 0xBCF] = 0xFFFFF464 ^ 0xBCF;
                    g.O0OoOO0OOOOO[0xE7EF ^ 0xE724] = 0xFFFF0D81 ^ 0xE724;
                    n3 = 1333455748;
                    continue block86;
                }
                case 1333455748: {
                    g.O0OoOO0OOOOO[0xD8B0 ^ 0xD847] = 0x1D669 ^ 0xD847;
                    g.O0OoOO0OOOOO[0xDF94 ^ 0xDFF7] = 0xDFE0 ^ 0xDFF7;
                    n3 = 1326690969;
                    continue block86;
                }
                case 1326690969: {
                    g.O0OoOO0OOOOO[0x3411 ^ 0x342C] = 0xFFFFCBE3 ^ 0x342C;
                    n3 = -1504841689;
                    continue block86;
                }
                case -1504841689: {
                    g.O0OoOO0OOOOO[0x10EEA ^ 0x10E37] = 0x1F05E ^ 0x10E37;
                    g.O0OoOO0OOOOO[0x8F6D ^ 0x8E47] = 0x18765 ^ 0x8E47;
                    g.O0OoOO0OOOOO[0x7558 ^ 0x750B] = 0x7508 ^ 0x750B;
                    g.O0OoOO0OOOOO[0xCCA4 ^ 0xCC76] = 0x5A19 ^ 0xCC76;
                    g.O0OoOO0OOOOO[0x8DD0 ^ 0x8CCB] = 0xAD93 ^ 0x8CCB;
                    n3 = -763310446;
                    continue block86;
                }
                case -763310446: {
                    g.O0OoOO0OOOOO[0x107CF ^ 0x106F0] = 0x1ED57 ^ 0x106F0;
                    g.O0OoOO0OOOOO[0x58EC ^ 0x5864] = 0xFFFFA799 ^ 0x5864;
                    n3 = 1791713273;
                    continue block86;
                }
                case 1791713273: {
                    g.O0OoOO0OOOOO[0x1353 ^ 0x12DB] = 0x12D5 ^ 0x12DB;
                    g.O0OoOO0OOOOO[0x646 ^ 0x640] = 0x633 ^ 0x640;
                    g.O0OoOO0OOOOO[0x828C ^ 0x82EC] = 0x82F5 ^ 0x82EC;
                    g.O0OoOO0OOOOO[0xAF91 ^ 0xAF3C] = 0x2910 ^ 0xAF3C;
                    g.O0OoOO0OOOOO[0xC759 ^ 0xC773] = 0xF1A3 ^ 0xC773;
                    n3 = -313474322;
                    continue block86;
                }
                case -313474322: {
                    g.O0OoOO0OOOOO[0xCC30 ^ 0xCDB1] = 0xFFFF3256 ^ 0xCDB1;
                    g.O0OoOO0OOOOO[0x7A8D ^ 0x7B0A] = 0xFFFF84B7 ^ 0x7B0A;
                    return;
                }
                default: {
                    g.O0OoOO0OOOOO[0x792C ^ 0x79EE] = 0xA1AD ^ 0x79EE;
                    g.O0OoOO0OOOOO[0x79D4 ^ 0x794C] = 0x7907 ^ 0x794C;
                    g.O0OoOO0OOOOO[0xB947 ^ 0xB94A] = 0xB96F ^ 0xB94A;
                    g.O0OoOO0OOOOO[0xBC7C ^ 0xBC23] = 0xFFFF439C ^ 0xBC23;
                    g.O0OoOO0OOOOO[0x102FA ^ 0x102DD] = 0x102DB ^ 0x102DD;
                    g.O0OoOO0OOOOO[0x518A ^ 0x51C5] = 0x69D8CC42 ^ 0x51C5;
                    g.O0OoOO0OOOOO[0xFA07 ^ 0xFA0D] = 0xFA08 ^ 0xFA0D;
                    g.O0OoOO0OOOOO[0x1078E ^ 0x107C5] = 0x107DE ^ 0x107C5;
                    g.O0OoOO0OOOOO[0xC5D6 ^ 0xC5F8] = 0xC5FD ^ 0xC5F8;
                    g.O0OoOO0OOOOO[0x142B ^ 0x1496] = 0x5017 ^ 0x1496;
                    g.O0OoOO0OOOOO[0x2264 ^ 0x2368] = 0x2659 ^ 0x2368;
                    g.O0OoOO0OOOOO[0x90C0 ^ 0x9198] = 0xEB05 ^ 0x9198;
                    g.O0OoOO0OOOOO[0x96FF ^ 0x964E] = 0xE33D ^ 0x964E;
                    g.O0OoOO0OOOOO[0xBE3B ^ 0xBF70] = 0x1BFB ^ 0xBF70;
                    g.O0OoOO0OOOOO[0x10AA5 ^ 0x10BE9] = 0x126F6 ^ 0x10BE9;
                    g.O0OoOO0OOOOO[0x62A2 ^ 0x63A6] = 0xC05C ^ 0x63A6;
                    g.O0OoOO0OOOOO[0x75F6 ^ 0x74BC] = 0xD025 ^ 0x74BC;
                    g.O0OoOO0OOOOO[0x7387 ^ 0x737F] = 0x1CDA ^ 0x737F;
                    g.O0OoOO0OOOOO[0xB16F ^ 0xB184] = 0x720C ^ 0xB184;
                    g.O0OoOO0OOOOO[0x3A9 ^ 0x3B2] = 0xFFFFFC4D ^ 0x3B2;
                    g.O0OoOO0OOOOO[0xE8F8 ^ 0xE8CC] = 0xE8A7 ^ 0xE8CC;
                    n3 = -128145199;
                    continue block86;
                }
                case -128145199: {
                    g.O0OoOO0OOOOO[0x10BA0 ^ 0x10AD7] = 0x10A83 ^ 0x10AD7;
                    n3 = 2106220260;
                    continue block86;
                }
                case 2106220260: 
            }
            g.O0OoOO0OOOOO[0x5E0B ^ 0x5E26] = 0x4E3D ^ 0x5E26;
            g.O0OoOO0OOOOO[0xBBE2 ^ 0xBB61] = 0xFFFF44A8 ^ 0xBB61;
            g.O0OoOO0OOOOO[0x30E2 ^ 0x31C1] = 0x38C4 ^ 0x31C1;
            g.O0OoOO0OOOOO[0x3C88 ^ 0x3C18] = 0x3C15 ^ 0x3C18;
            g.O0OoOO0OOOOO[0x2009 ^ 0x203C] = 0x203C ^ 0x203C;
            g.O0OoOO0OOOOO[0x5711 ^ 0x5669] = 0x5661 ^ 0x5669;
            g.O0OoOO0OOOOO[0x18D7 ^ 0x18B2] = 0x18A3 ^ 0x18B2;
            g.O0OoOO0OOOOO[0x48D ^ 0x5E4] = 0xFFFFFA1B ^ 0x5E4;
            g.O0OoOO0OOOOO[0x484 ^ 0x42A] = 0x820D ^ 0x42A;
            g.O0OoOO0OOOOO[0x4044 ^ 0x4047] = 0x9E0D1B02 ^ 0x4047;
            n3 = 1658264816;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public g(JSONObject jSONObject) {
        int n2 = -204054127;
        if (n2 != n2) {
            throw null;
        }
        int n3 = O0OoOO0OOOOO[0];
        super((n3 << O0OoOO0OOOOO[1] | n3 >>> O0OoOO0OOOOO[2]) * O0OoOO0OOOOO[3]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }
}

