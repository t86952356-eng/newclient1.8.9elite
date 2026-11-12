/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
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
import net.minecraft.entity.r;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@gl(aliases={"module.combat.throwableaura.name"}, description="module.combat.throwableaura.description", category=gj.COMBAT)
public class hd
extends gi {
    public /* synthetic */ aki qy;
    @dm
    public /* synthetic */ dk<ej> qK;
    public /* synthetic */ aki qA;
    private static /* synthetic */ int[] ooo00oo0Ooo0;
    public /* synthetic */ aki qD;
    public /* synthetic */ aki qB;
    public /* synthetic */ akq qu;
    public /* synthetic */ int qI;
    public static /* synthetic */ String[] 0oOOoOo0O00O;
    public static /* synthetic */ Object[] Oo0o00000O00;
    public /* synthetic */ boolean qJ;
    public /* synthetic */ akq qv;
    public /* synthetic */ aki qz;
    public /* synthetic */ aki qx;
    public /* synthetic */ aki qE;
    public /* synthetic */ r jE;
    public static /* synthetic */ String[] O0OoOO0OOOOO;
    public /* synthetic */ aki qG;
    public static /* synthetic */ String o0Oo000O0oO;
    public /* synthetic */ akq qw;
    public static /* synthetic */ Object oO00O0OO0ooO;
    public static /* synthetic */ Object[] 0OOOoo00o0;
    public /* synthetic */ akq qs;
    public /* synthetic */ int qH;
    public /* synthetic */ aki qF;
    public /* synthetic */ akq qt;
    public /* synthetic */ aki qC;
    private static /* synthetic */ int o0o000o0O0o0;
    private static /* synthetic */ boolean oOo00Oo0OOo0;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) {
        block47: {
            block48: {
                var37_2 = 274246819;
                if (var37_2 != var37_2) {
                    throw new NullPointerException();
                }
                var37_2 = 2074984134;
                if (var37_2 != var37_2) {
                    68 + 65;
                }
                if ((var37_2 = 1469941949) != var37_2) {
                    hd.o0o000o0O0o0 = var37_2 = -1639106854;
                }
                if ((var37_2 = -509226475) != var37_2) {
                    var37_2 = 140242751;
                }
                var32_3 = new Object[30];
                var33_4 = new long[30];
                var22_7 = 567322866;
                break block48;
                while (true) {
                    v0 = new String((char[])var32_3[19]);
                    break block47;
                    break;
                }
            }
            block30: while (true) {
                switch (var22_7) {
                    default: {
                        v1 = hd.Oo0o00000O00;
                        if (hd.Oo0o00000O00 != null) break block30;
                        var22_7 = 2141346051;
                        continue block30;
                    }
                    case 2141346051: {
                        v2 = new Object[1];
                        hd.Oo0o00000O00 = v2;
                        v1 = v2;
                        var32_3[5] = new byte[39232 ^ 39248];
                        ((byte[])var32_3[5])[8466 ^ 8473] = 8493 ^ 8473;
                        ((byte[])var32_3[5])[50935 ^ 50931] = -50853 ^ 50931;
                        ((byte[])var32_3[5])[56603 ^ 56595] = -56597 ^ 56595;
                        ((byte[])var32_3[5])[26929 ^ 26932] = -26889 ^ 26932;
                        ((byte[])var32_3[5])[6897 ^ 6897] = -6812 ^ 6897;
                        ((byte[])var32_3[5])[1837 ^ 1838] = 1865 ^ 1838;
                        ((byte[])var32_3[5])[37529 ^ 37525] = 37586 ^ 37525;
                        ((byte[])var32_3[5])[63428 ^ 63435] = -63467 ^ 63435;
                        ((byte[])var32_3[5])[6222 ^ 6211] = -6234 ^ 6211;
                        ((byte[])var32_3[5])[54748 ^ 54747] = 54679 ^ 54747;
                        ((byte[])var32_3[5])[37271 ^ 37273] = -37258 ^ 37273;
                        ((byte[])var32_3[5])[29290 ^ 29283] = -29224 ^ 29283;
                        ((byte[])var32_3[5])[59031 ^ 59037] = 59075 ^ 59037;
                        ((byte[])var32_3[5])[32484 ^ 32485] = 32456 ^ 32485;
                        ((byte[])var32_3[5])[8374 ^ 8372] = 8369 ^ 8372;
                        ((byte[])var32_3[5])[2812 ^ 2810] = -2773 ^ 2810;
                        v2[0] = (byte[])var32_3[5];
                        break block30;
                    }
                }
                break;
            }
            var32_3[2] = (byte[])v1[0];
            var23_8 = -1778820939;
            block31: while (true) {
                block49: {
                    switch (var23_8) {
                        default: {
                            if (hd.oO00O0OO0ooO != null) break block49;
                        }
                        case -106387252: {
                            var32_3[24] = new byte[32250 ^ 32218];
                            var24_9 = -399230520;
                            break;
                        }
                        {
                        }
                        case 2100813878: {
                            var32_3[6] = Base64.getDecoder().decode(var1_1);
                            var32_3[14] = Arrays.copyOfRange((byte[])var32_3[6], 0, 16);
                            var32_3[4] = Arrays.copyOfRange((byte[])var32_3[6], 16, ((byte[])var32_3[6]).length);
                            v0 = hd.O0OoOO0OOOOO[3];
                            if (v0 != null) break block31;
                            var32_3[19] = "\u242f\u2650\u20d1\u2572\u2bd3\u2f64\u2e55\u2cf6\u34a7\u36b8\u35d9\u393a\u397b\u34cc\u3fbd\u2a0e\u086f\u1720\u0c91\u1302".toCharArray();
                            var33_4[7] = var34_5 = (long)0;
                            while (true) {
                                var29_14 = -1404808698;
                                if ((int)var33_4[7] >= ((char[])var32_3[19]).length) ** continue;
                                v3 = (char[])var32_3[19];
                                v4 = (int)var33_4[7];
                                v5 = (char)(v3[v4] - v4);
                                v6 = (char)((char)((char)(v5 >>> 9 | v5 << 7) ^ v4) ^ 64099);
                                v7 = (char)(v6 >>> 10 | v6 << 6);
                                v3[v4] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(v7 >>> 1 | v7 << 15) - v4) - 37354) + 46552) ^ 65356))) - v4) ^ 3758) - v4) ^ 53862) - v4) - 15887);
                                var33_4[7] = var34_5 = (long)((int)var33_4[7] + 1);
                            }
                        }
                    }
                    block33: while (true) {
                        switch (var24_9) {
                            default: {
                                ((byte[])var32_3[24])[61153 ^ 61167] = -61159 ^ 61167;
                                ((byte[])var32_3[24])[29719 ^ 29696] = 29720 ^ 29696;
                                ((byte[])var32_3[24])[40780 ^ 40771] = -40732 ^ 40771;
                                ((byte[])var32_3[24])[46792 ^ 46793] = 46780 ^ 46793;
                                ((byte[])var32_3[24])[1510 ^ 1532] = 1475 ^ 1532;
                                var24_9 = -204893928;
                                continue block33;
                            }
                            case -204893928: {
                                ((byte[])var32_3[24])[26110 ^ 26103] = -26094 ^ 26103;
                                ((byte[])var32_3[24])[55329 ^ 55356] = -55360 ^ 55356;
                                ((byte[])var32_3[24])[59807 ^ 59805] = -59857 ^ 59805;
                                ((byte[])var32_3[24])[6089 ^ 6093] = 6031 ^ 6093;
                                ((byte[])var32_3[24])[118 ^ 100] = 91 ^ 100;
                                ((byte[])var32_3[24])[28312 ^ 28307] = -28348 ^ 28307;
                                ((byte[])var32_3[24])[39276 ^ 39268] = 39201 ^ 39268;
                                ((byte[])var32_3[24])[29540 ^ 29564] = -29524 ^ 29564;
                                ((byte[])var32_3[24])[43591 ^ 43586] = -43546 ^ 43586;
                                ((byte[])var32_3[24])[66758 ^ 66770] = -66773 ^ 66770;
                                var24_9 = 1401505723;
                                continue block33;
                            }
                            case 1401505723: {
                                ((byte[])var32_3[24])[32778 ^ 32793] = 32820 ^ 32793;
                                var24_9 = -425600915;
                                continue block33;
                            }
                            case -425600915: {
                                ((byte[])var32_3[24])[14426 ^ 14403] = -14406 ^ 14403;
                                var24_9 = -224974464;
                                continue block33;
                            }
                            case -224974464: {
                                ((byte[])var32_3[24])[40981 ^ 40971] = 41080 ^ 40971;
                                ((byte[])var32_3[24])[6268 ^ 6271] = 6188 ^ 6271;
                                ((byte[])var32_3[24])[37657 ^ 37640] = 37669 ^ 37640;
                                var24_9 = 7874451;
                                continue block33;
                            }
                            case 7874451: {
                                ((byte[])var32_3[24])[34532 ^ 34548] = 34536 ^ 34548;
                                var24_9 = 996671587;
                                continue block33;
                            }
                            case 996671587: {
                                ((byte[])var32_3[24])[64505 ^ 64492] = 64409 ^ 64492;
                                ((byte[])var32_3[24])[59382 ^ 59382] = -59366 ^ 59382;
                                ((byte[])var32_3[24])[66024 ^ 66018] = -65926 ^ 66018;
                                ((byte[])var32_3[24])[46704 ^ 46699] = 46612 ^ 46699;
                                ((byte[])var32_3[24])[50834 ^ 50846] = -50886 ^ 50846;
                                ((byte[])var32_3[24])[38838 ^ 38843] = -38865 ^ 38843;
                                ((byte[])var32_3[24])[39171 ^ 39189] = -39257 ^ 39189;
                                var24_9 = -255972313;
                                continue block33;
                            }
                            case -255972313: {
                                ((byte[])var32_3[24])[14688 ^ 14719] = 14637 ^ 14719;
                                ((byte[])var32_3[24])[18138 ^ 18118] = 18111 ^ 18118;
                                ((byte[])var32_3[24])[27129 ^ 27135] = 27017 ^ 27135;
                                var24_9 = 1367731721;
                                continue block33;
                            }
                            case 1367731721: 
                        }
                        break;
                    }
                    ((byte[])var32_3[24])[35232 ^ 35239] = -35242 ^ 35239;
                    var32_3[0] = new byte[((byte[])var32_3[2]).length + ((byte[])var32_3[24]).length];
                    var25_10 = 1800708591;
                    System.arraycopy((byte[])var32_3[2], 0, (byte[])var32_3[0], 0, ((byte[])var32_3[2]).length);
                    System.arraycopy((byte[])var32_3[24], 0, (byte[])var32_3[0], ((byte[])var32_3[2]).length, ((byte[])var32_3[24]).length);
                    v8 = hd.O0OoOO0OOOOO[1];
                    if (v8 == null) {
                        var32_3[19] = "\uad77\uacd2\uab47\uaacc\uad47\uacbe\uab6b\uab12\ua547\ua51e\ua35d\ua336\ua519\ua518\ua37b\ua368\uad05\uaca8".toCharArray();
                        var33_4[7] = var34_5 = (long)0;
                        block34: while (true) {
                            if ((int)var33_4[7] < ((char[])var32_3[19]).length) {
                                v9 = (char[])var32_3[19];
                                v10 = (int)var33_4[7];
                                v11 = (char)(v9[v10] + v10);
                                v12 = (char)((char)((char)((char)((char)(v11 >>> 1 | v11 << 15) - v10) ^ v10) ^ 4079) + 58358);
                                v13 = (char)((char)((char)((char)((char)(v12 >>> 6 | v12 << 10) - v10) ^ v10) - 16029) - 44119);
                                v14 = (char)(v13 >>> 1 | v13 << 15);
                                v9[v10] = (char)(v14 << 7 | v14 >>> 9);
                                var33_4[7] = var34_5 = (long)((int)var33_4[7] + 1);
                                var26_11 = 971421745;
                            } else {
                                var26_11 = 1957940579;
                            }
                            switch (var26_11) {
                                default: {
                                    continue block34;
                                }
                                case 1957940579: 
                            }
                            break;
                        }
                        v8 = new String((char[])var32_3[19]);
                    }
                    var32_3[16] = SecretKeyFactory.getInstance(v8);
                    var27_12 = 255085645;
                    var32_3[26] = new byte[16];
                    ((byte[])var32_3[26])[10] = -24;
                    ((byte[])var32_3[26])[9] = -127;
                    ((byte[])var32_3[26])[12] = 50;
                    ((byte[])var32_3[26])[11] = 43;
                    ((byte[])var32_3[26])[14] = -68;
                    ((byte[])var32_3[26])[6] = 86;
                    ((byte[])var32_3[26])[1] = 13;
                    ((byte[])var32_3[26])[2] = -43;
                    var28_13 = -39467914;
                    block35: while (true) {
                        switch (var28_13) {
                            default: {
                                ((byte[])var32_3[26])[7] = 4;
                                var28_13 = -266663383;
                                continue block35;
                            }
                            case -266663383: {
                                ((byte[])var32_3[26])[5] = -47;
                                var28_13 = -788887862;
                                continue block35;
                            }
                            case -788887862: 
                        }
                        break;
                    }
                    ((byte[])var32_3[26])[4] = -97;
                    ((byte[])var32_3[26])[15] = -65;
                    ((byte[])var32_3[26])[13] = 53;
                    ((byte[])var32_3[26])[0] = -121;
                    ((byte[])var32_3[26])[8] = -23;
                    ((byte[])var32_3[26])[3] = 20;
                    var7_6 = new PBEKeySpec(new String((byte[])var32_3[0], StandardCharsets.UTF_8).toCharArray(), (byte[])var32_3[26], 9, 256);
                    var32_3[8] = ((SecretKeyFactory)var32_3[16]).generateSecret(var7_6).getEncoded();
                    v15 = (byte[])var32_3[8];
                    v16 = hd.O0OoOO0OOOOO[2];
                    if (v16 == null) {
                        var32_3[19] = "\ub639\ub5f9\ub689".toCharArray();
                        var33_4[7] = var34_5 = (long)0;
                        while ((int)var33_4[7] < ((char[])var32_3[19]).length) {
                            v17 = (char[])var32_3[19];
                            v18 = (int)var33_4[7];
                            v19 = ~((char)(~((char)(v17[v18] + 27661))));
                            v20 = ~((char)((char)(-((char)(v19 << 15 | v19 >>> 1))) + 13317));
                            v21 = (char)(v20 >>> 5 | v20 << 11);
                            v17[v18] = (char)((char)((char)((char)(v21 << 3 | v21 >>> 13) + v18) ^ 30470) - v18);
                            var33_4[7] = var34_5 = (long)((int)var33_4[7] + 1);
                        }
                        v16 = new String((char[])var32_3[19]);
                    }
                    hd.oO00O0OO0ooO = new SecretKeySpec(v15, v16);
                    ** break;
                }
                var23_8 = 2100813878;
            }
        }
        var32_3[22] = Cipher.getInstance(v0);
        var30_15 = 1612627747;
        ((Cipher)var32_3[22]).init(2, (Key)((SecretKey)hd.oO00O0OO0ooO), new IvParameterSpec((byte[])var32_3[14]));
        var32_3[21] = ((Cipher)var32_3[22]).doFinal((byte[])var32_3[4]);
        var31_16 = -706966470;
        hd.0oOOoOo0O00O[var0] = new String((byte[])var32_3[21], StandardCharsets.UTF_8);
        return hd.0oOOoOo0O00O[var0];
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void 0OOOoo00o0() {
        int n2 = -929654379;
        if (n2 != n2) {
            throw new TypeNotPresentException();
        }
        ooo00oo0Ooo0 = new int[0xA7DB ^ 0xA64B];
        hd.ooo00oo0Ooo0[0xEA22 ^ 0xEA80] = 0xEA87 ^ 0xEA80;
        hd.ooo00oo0Ooo0[0x9289 ^ 0x92D9] = 0x9298 ^ 0x92D9;
        int n3 = 1163864678;
        block99: while (true) {
            switch (n3) {
                case -1119435462: {
                    hd.ooo00oo0Ooo0[0xF0AD ^ 0xF001] = 0xF038 ^ 0xF001;
                    hd.ooo00oo0Ooo0[0x8C62 ^ 0x8D27] = 0x8D34 ^ 0x8D27;
                    hd.ooo00oo0Ooo0[0xD96C ^ 0xD9E2] = 0xD9F3 ^ 0xD9E2;
                    n3 = 661054275;
                    continue block99;
                }
                case 661054275: {
                    hd.ooo00oo0Ooo0[0xA37B ^ 0xA3BE] = 0xA3B7 ^ 0xA3BE;
                    hd.ooo00oo0Ooo0[0x104B5 ^ 0x10534] = 0x10534 ^ 0x10534;
                    hd.ooo00oo0Ooo0[0xACB8 ^ 0xAC4B] = 0xAC50 ^ 0xAC4B;
                    hd.ooo00oo0Ooo0[0xCECE ^ 0xCFFD] = 0xFFFF3060 ^ 0xCFFD;
                    hd.ooo00oo0Ooo0[0xEA25 ^ 0xEB2A] = 0xEB5C ^ 0xEB2A;
                    hd.ooo00oo0Ooo0[0x257C ^ 0x2557] = 0xFFF0AAA8 ^ 0x2557;
                    hd.ooo00oo0Ooo0[0xE089 ^ 0xE076] = 0x4F207484 ^ 0xE076;
                    hd.ooo00oo0Ooo0[0xB9E ^ 0xB19] = 0xB19 ^ 0xB19;
                    hd.ooo00oo0Ooo0[0x6F5F ^ 0x6F12] = 0x914C74BF ^ 0x6F12;
                    n3 = 507491703;
                    continue block99;
                }
                case 507491703: {
                    hd.ooo00oo0Ooo0[0xF107 ^ 0xF1B4] = 0x5555A4E0 ^ 0xF1B4;
                    hd.ooo00oo0Ooo0[0xF250 ^ 0xF236] = 0xFFFF0D8F ^ 0xF236;
                    hd.ooo00oo0Ooo0[0x81C3 ^ 0x817C] = 0x817D ^ 0x817C;
                    hd.ooo00oo0Ooo0[0xA473 ^ 0xA487] = 0xA4F2 ^ 0xA487;
                    hd.ooo00oo0Ooo0[0xFEE ^ 0xF08] = 0xFFFFF09D ^ 0xF08;
                    hd.ooo00oo0Ooo0[0x4E76 ^ 0x4E1B] = 0xFFFFB1E4 ^ 0x4E1B;
                    n3 = -371441597;
                    continue block99;
                }
                case -371441597: {
                    hd.ooo00oo0Ooo0[0xD0EE ^ 0xD09E] = 0xFFFF2F61 ^ 0xD09E;
                    hd.ooo00oo0Ooo0[0xF26E ^ 0xF356] = 0xF35F ^ 0xF356;
                    hd.ooo00oo0Ooo0[0xE5FA ^ 0xE4FF] = 0xE4FF ^ 0xE4FF;
                    n3 = 1342997291;
                    continue block99;
                }
                case 1342997291: {
                    hd.ooo00oo0Ooo0[0xF521 ^ 0xF5DC] = 0xF5D9 ^ 0xF5DC;
                    hd.ooo00oo0Ooo0[0x105B9 ^ 0x10574] = 0x1057B ^ 0x10574;
                    n3 = -1114884501;
                    continue block99;
                }
                case -1114884501: {
                    hd.ooo00oo0Ooo0[0xE06A ^ 0xE100] = 0xE11D ^ 0xE100;
                    hd.ooo00oo0Ooo0[0x10310 ^ 0x10332] = 0x10333 ^ 0x10332;
                    hd.ooo00oo0Ooo0[0x10F2 ^ 0x1085] = 0x108C ^ 0x1085;
                    n3 = -1636969276;
                    continue block99;
                }
                case -1636969276: {
                    hd.ooo00oo0Ooo0[0xE65F ^ 0xE66E] = 0xE673 ^ 0xE66E;
                    hd.ooo00oo0Ooo0[0x7600 ^ 0x7688] = 0xFFFF891B ^ 0x7688;
                    hd.ooo00oo0Ooo0[0x8E14 ^ 0x8F3C] = 0xFFFF70EF ^ 0x8F3C;
                    hd.ooo00oo0Ooo0[0x4A15 ^ 0x4AB8] = 0x4AAD ^ 0x4AB8;
                    hd.ooo00oo0Ooo0[0x3A01 ^ 0x3AF3] = 0x3AF6 ^ 0x3AF3;
                    hd.ooo00oo0Ooo0[0xCEB5 ^ 0xCE5A] = 0xCE5A ^ 0xCE5A;
                    n3 = -83840608;
                    continue block99;
                }
                case -83840608: {
                    hd.ooo00oo0Ooo0[0x594 ^ 0x4D2] = 0x4DF ^ 0x4D2;
                    n3 = 2061316083;
                    continue block99;
                }
                case 2061316083: {
                    hd.ooo00oo0Ooo0[0xE5F9 ^ 0xE4A5] = 0xE4B0 ^ 0xE4A5;
                    hd.ooo00oo0Ooo0[0xDD50 ^ 0xDC3D] = 0xDC5A ^ 0xDC3D;
                    hd.ooo00oo0Ooo0[0x5872 ^ 0x5919] = 0x591A ^ 0x5919;
                    hd.ooo00oo0Ooo0[0x100EB ^ 0x10074] = 0x97B52599 ^ 0x10074;
                    hd.ooo00oo0Ooo0[0xB692 ^ 0xB7F5] = 0xFFFF4802 ^ 0xB7F5;
                    n3 = 2052498167;
                    continue block99;
                }
                case 2052498167: {
                    hd.ooo00oo0Ooo0[0x960C ^ 0x9690] = 0xC0FC9951 ^ 0x9690;
                    hd.ooo00oo0Ooo0[0xE0DF ^ 0xE1CD] = 0xE1B7 ^ 0xE1CD;
                    hd.ooo00oo0Ooo0[0xCB13 ^ 0xCB04] = 0xCB4D ^ 0xCB04;
                    n3 = 713150280;
                    continue block99;
                }
                case 713150280: {
                    hd.ooo00oo0Ooo0[0x36A2 ^ 0x3698] = 0x3689 ^ 0x3698;
                    hd.ooo00oo0Ooo0[0xAE1F ^ 0xAE27] = 0xFFFF51D8 ^ 0xAE27;
                    hd.ooo00oo0Ooo0[0xD4F ^ 0xD48] = 0xD49 ^ 0xD48;
                    hd.ooo00oo0Ooo0[0x1ABD ^ 0x1BB4] = 0xB08D26E6 ^ 0x1BB4;
                    hd.ooo00oo0Ooo0[0xC8DC ^ 0xC849] = 0xD343D31E ^ 0xC849;
                    hd.ooo00oo0Ooo0[0xFA92 ^ 0xFA46] = 0x40A584F3 ^ 0xFA46;
                    n3 = -746367402;
                    continue block99;
                }
                case -746367402: {
                    hd.ooo00oo0Ooo0[0x524B ^ 0x531D] = 0x5308 ^ 0x531D;
                    n3 = -938465375;
                    continue block99;
                }
                case -938465375: {
                    hd.ooo00oo0Ooo0[0x4FAC ^ 0x4F21] = 0xFFFFB096 ^ 0x4F21;
                    hd.ooo00oo0Ooo0[0xA5C4 ^ 0xA532] = 0xA532 ^ 0xA532;
                    n3 = -1313025049;
                    continue block99;
                }
                case -1313025049: {
                    hd.ooo00oo0Ooo0[0x9F6F ^ 0x9F33] = 0x1020DFB2 ^ 0x9F33;
                    n3 = -980232057;
                    continue block99;
                }
                case -980232057: {
                    hd.ooo00oo0Ooo0[0x85AE ^ 0x84D2] = 0x84C9 ^ 0x84D2;
                    hd.ooo00oo0Ooo0[0x965F ^ 0x961B] = 0x9604 ^ 0x961B;
                    n3 = 527222032;
                    continue block99;
                }
                case 527222032: {
                    hd.ooo00oo0Ooo0[0x1EAA ^ 0x1EB1] = 0xFFFFE106 ^ 0x1EB1;
                    hd.ooo00oo0Ooo0[0xDD1B ^ 0xDC9F] = 0xDC96 ^ 0xDC9F;
                    hd.ooo00oo0Ooo0[0xE43B ^ 0xE4C3] = 0xE4FC ^ 0xE4C3;
                    hd.ooo00oo0Ooo0[0x8689 ^ 0x87A5] = 0xFFFF5DBF ^ 0x87A5;
                    hd.ooo00oo0Ooo0[0xF403 ^ 0xF528] = 0xFFFF0AA5 ^ 0xF528;
                    hd.ooo00oo0Ooo0[0x45E5 ^ 0x45AE] = 0xFFFFBA47 ^ 0x45AE;
                    hd.ooo00oo0Ooo0[0x52CF ^ 0x5398] = 0xFFFFAC09 ^ 0x5398;
                    n3 = -310614606;
                    continue block99;
                }
                case -310614606: {
                    hd.ooo00oo0Ooo0[0x8507 ^ 0x8512] = 0xFFFF7AE9 ^ 0x8512;
                    hd.ooo00oo0Ooo0[0x604C ^ 0x60DD] = 0xFFFF9F56 ^ 0x60DD;
                    hd.ooo00oo0Ooo0[0xC6CD ^ 0xC7DC] = 0xFFFF3823 ^ 0xC7DC;
                    hd.ooo00oo0Ooo0[0x5FE0 ^ 0x5FA3] = 0x5FA2 ^ 0x5FA3;
                    hd.ooo00oo0Ooo0[0xC9C5 ^ 0xC910] = 0x37110 ^ 0xC910;
                    hd.ooo00oo0Ooo0[0x284F ^ 0x2821] = 0xFFFFD7CF ^ 0x2821;
                    n3 = 1183825482;
                    continue block99;
                }
                case 1183825482: {
                    hd.ooo00oo0Ooo0[0x638B ^ 0x638A] = 0xFFFF9C43 ^ 0x638A;
                    hd.ooo00oo0Ooo0[0x9566 ^ 0x95BA] = 0xFFFF6A75 ^ 0x95BA;
                    hd.ooo00oo0Ooo0[0x3371 ^ 0x3350] = 0x334F ^ 0x3350;
                    n3 = -1663296092;
                    continue block99;
                }
                case -1663296092: {
                    hd.ooo00oo0Ooo0[0xB109 ^ 0xB1C8] = 0xB1DF ^ 0xB1C8;
                    hd.ooo00oo0Ooo0[0xA742 ^ 0xA7C4] = 0xFFFF583B ^ 0xA7C4;
                    hd.ooo00oo0Ooo0[0xCEDB ^ 0xCEC1] = 0xEECE ^ 0xCEC1;
                    hd.ooo00oo0Ooo0[0x733 ^ 0x7F7] = 0x7E0 ^ 0x7F7;
                    hd.ooo00oo0Ooo0[0x9424 ^ 0x9462] = 0x9479 ^ 0x9462;
                    n3 = -1104456568;
                    continue block99;
                }
                case -1104456568: {
                    hd.ooo00oo0Ooo0[0x86A0 ^ 0x8639] = 0xFFFF79BD ^ 0x8639;
                    n3 = 1382983401;
                    continue block99;
                }
                case 1382983401: {
                    hd.ooo00oo0Ooo0[0xCFA8 ^ 0xCFF2] = 0xCFD3 ^ 0xCFF2;
                    n3 = -778669850;
                    continue block99;
                }
                case -778669850: {
                    hd.ooo00oo0Ooo0[0x1C12 ^ 0x1D94] = 0xFFFFE26B ^ 0x1D94;
                    hd.ooo00oo0Ooo0[0x9696 ^ 0x97C8] = 0x97E1 ^ 0x97C8;
                    hd.ooo00oo0Ooo0[0xAD39 ^ 0xAC4B] = 0xAC4A ^ 0xAC4B;
                    n3 = 958300742;
                    continue block99;
                }
                case 958300742: {
                    hd.ooo00oo0Ooo0[0x44FC ^ 0x4437] = 0x4452 ^ 0x4437;
                    n3 = 1257933126;
                    continue block99;
                }
                case 1257933126: {
                    hd.ooo00oo0Ooo0[0xA6D ^ 0xB3E] = 0xB27 ^ 0xB3E;
                    hd.ooo00oo0Ooo0[0xB071 ^ 0xB03B] = 0xB06A ^ 0xB03B;
                    hd.ooo00oo0Ooo0[0x9053 ^ 0x9034] = 0xFFFF6F9F ^ 0x9034;
                    hd.ooo00oo0Ooo0[0x3103 ^ 0x3067] = 0x307E ^ 0x3067;
                    hd.ooo00oo0Ooo0[0x4872 ^ 0x49F5] = 0x4E9C ^ 0x49F5;
                    n3 = -157780073;
                    continue block99;
                }
                case -157780073: {
                    hd.ooo00oo0Ooo0[0x21A4 ^ 0x20EA] = 0xFFFC20EA ^ 0x20EA;
                    hd.ooo00oo0Ooo0[0x3CE9 ^ 0x3D6B] = 0x3D6D ^ 0x3D6B;
                    n3 = 1153332418;
                    continue block99;
                }
                case 1153332418: {
                    hd.ooo00oo0Ooo0[0xAF37 ^ 0xAFAF] = 0xE5E00880 ^ 0xAFAF;
                    hd.ooo00oo0Ooo0[0x9247 ^ 0x92E3] = 0x92A7 ^ 0x92E3;
                    hd.ooo00oo0Ooo0[0xF9F5 ^ 0xF9C2] = 0xFFFD863C ^ 0xF9C2;
                    hd.ooo00oo0Ooo0[0xB2F3 ^ 0xB38E] = 0xFFFF4C71 ^ 0xB38E;
                    n3 = -119031281;
                    continue block99;
                }
                case -119031281: {
                    hd.ooo00oo0Ooo0[0x4D62 ^ 0x4C22] = 0x4C3D ^ 0x4C22;
                    hd.ooo00oo0Ooo0[0x9439 ^ 0x942A] = 0x943F ^ 0x942A;
                    hd.ooo00oo0Ooo0[0x76B9 ^ 0x7618] = 0x7601 ^ 0x7618;
                    hd.ooo00oo0Ooo0[0x3FA4 ^ 0x3F5F] = 0xFFFFC0EA ^ 0x3F5F;
                    hd.ooo00oo0Ooo0[0x3989 ^ 0x38B6] = 0x38B7 ^ 0x38B6;
                    hd.ooo00oo0Ooo0[0x254B ^ 0x255B] = 0x6EB3C108 ^ 0x255B;
                    n3 = 1240997332;
                    continue block99;
                }
                case 1240997332: {
                    hd.ooo00oo0Ooo0[0xA5A3 ^ 0xA54F] = 0xA526 ^ 0xA54F;
                    hd.ooo00oo0Ooo0[0xCE12 ^ 0xCED8] = 0xCEDB ^ 0xCED8;
                    hd.ooo00oo0Ooo0[0xFAA4 ^ 0xFAFC] = 0xFAE6 ^ 0xFAFC;
                    hd.ooo00oo0Ooo0[0xE125 ^ 0xE158] = 0xFFFF1EA7 ^ 0xE158;
                    n3 = -1764535223;
                    continue block99;
                }
                case -1764535223: {
                    hd.ooo00oo0Ooo0[0x22B ^ 0x22F] = 0x218 ^ 0x22F;
                    n3 = -17808813;
                    continue block99;
                }
                case -17808813: {
                    hd.ooo00oo0Ooo0[0x63D6 ^ 0x62D6] = 0x62E1 ^ 0x62D6;
                    hd.ooo00oo0Ooo0[0x619D ^ 0x61E8] = 0x286BABF3 ^ 0x61E8;
                    n3 = 1486011580;
                    continue block99;
                }
                case 1486011580: {
                    hd.ooo00oo0Ooo0[0x10648 ^ 0x10675] = 0xFFFEF98A ^ 0x10675;
                    hd.ooo00oo0Ooo0[0x430A ^ 0x424E] = 0xFFEBDDB1 ^ 0x424E;
                    n3 = 367852902;
                    continue block99;
                }
                case 367852902: {
                    hd.ooo00oo0Ooo0[0xC981 ^ 0xC98E] = 0xC99B ^ 0xC98E;
                    hd.ooo00oo0Ooo0[0x2802 ^ 0x2988] = 0x434A ^ 0x2988;
                    hd.ooo00oo0Ooo0[0xC5C7 ^ 0xC4FD] = 0xC48C ^ 0xC4FD;
                    hd.ooo00oo0Ooo0[0xA18B ^ 0xA1B0] = 0xA1BF ^ 0xA1B0;
                    hd.ooo00oo0Ooo0[0xEB80 ^ 0xEB01] = 0xFFFF14E9 ^ 0xEB01;
                    hd.ooo00oo0Ooo0[0xF967 ^ 0xF992] = 0xFFFF0645 ^ 0xF992;
                    hd.ooo00oo0Ooo0[0x8366 ^ 0x8271] = 0xFFFF7D8E ^ 0x8271;
                    hd.ooo00oo0Ooo0[0x10D97 ^ 0x10CEE] = 0xFFFEF311 ^ 0x10CEE;
                    n3 = -1317935385;
                    continue block99;
                }
                case -1317935385: {
                    hd.ooo00oo0Ooo0[0x8226 ^ 0x835E] = 0xFFFF7CA1 ^ 0x835E;
                    hd.ooo00oo0Ooo0[0xA003 ^ 0xA0CD] = 0xFFFF5F69 ^ 0xA0CD;
                    hd.ooo00oo0Ooo0[0xA988 ^ 0xA808] = 0xA808 ^ 0xA808;
                    hd.ooo00oo0Ooo0[0x106DE ^ 0x10644] = 0xFFFEF9F1 ^ 0x10644;
                    n3 = 1310886424;
                    continue block99;
                }
                case 1310886424: {
                    hd.ooo00oo0Ooo0[0x530C ^ 0x5240] = 0x524F ^ 0x5240;
                    hd.ooo00oo0Ooo0[0x9C60 ^ 0x9D6E] = 0xFFFF6281 ^ 0x9D6E;
                    hd.ooo00oo0Ooo0[0xEC54 ^ 0xEC5F] = 0xEC5E ^ 0xEC5F;
                    hd.ooo00oo0Ooo0[0x828C ^ 0x839F] = 0x83E6 ^ 0x839F;
                    hd.ooo00oo0Ooo0[0xFD40 ^ 0xFD4D] = 0xAFF02B2 ^ 0xFD4D;
                    hd.ooo00oo0Ooo0[0xA2C9 ^ 0xA22C] = 0x9800A205 ^ 0xA22C;
                    hd.ooo00oo0Ooo0[0xBD9B ^ 0xBD52] = 0xBD4F ^ 0xBD52;
                    hd.ooo00oo0Ooo0[0xAD58 ^ 0xAC46] = 0xAC5B ^ 0xAC46;
                    n3 = 1077514633;
                    continue block99;
                }
                case 1077514633: {
                    hd.ooo00oo0Ooo0[0x75E ^ 0x7CA] = 0x171E4 ^ 0x7CA;
                    hd.ooo00oo0Ooo0[0x77D0 ^ 0x7799] = 0x77CC ^ 0x7799;
                    hd.ooo00oo0Ooo0[0xB594 ^ 0xB521] = 0xFFFF4AA4 ^ 0xB521;
                    n3 = 1328914766;
                    continue block99;
                }
                case 1328914766: {
                    hd.ooo00oo0Ooo0[0x31D ^ 0x32D] = 0x32E ^ 0x32D;
                    hd.ooo00oo0Ooo0[0xCA60 ^ 0xCA59] = 0xFFFF35A6 ^ 0xCA59;
                    hd.ooo00oo0Ooo0[0x2FA1 ^ 0x2EBE] = 0x7FFFD15D ^ 0x2EBE;
                    n3 = -16713978;
                    continue block99;
                }
                case -16713978: {
                    hd.ooo00oo0Ooo0[0x270D ^ 0x27B0] = 0x27B0 ^ 0x27B0;
                    hd.ooo00oo0Ooo0[0x6BF8 ^ 0x6B80] = 0x6B97 ^ 0x6B80;
                    hd.ooo00oo0Ooo0[0x9DA9 ^ 0x9D0A] = 0x9D13 ^ 0x9D0A;
                    n3 = 1766037898;
                    continue block99;
                }
                case 1766037898: {
                    hd.ooo00oo0Ooo0[0x7CBC ^ 0x7C21] = 0x7C21 ^ 0x7C21;
                    hd.ooo00oo0Ooo0[0xBDD3 ^ 0xBDA1] = 0x7A6FF04B ^ 0xBDA1;
                    n3 = 1104999607;
                    continue block99;
                }
                case 1104999607: {
                    hd.ooo00oo0Ooo0[0x1ED9 ^ 0x1E97] = 0x1E9E ^ 0x1E97;
                    hd.ooo00oo0Ooo0[0x5460 ^ 0x557C] = 0xFFFFAAD5 ^ 0x557C;
                    hd.ooo00oo0Ooo0[0xE5F1 ^ 0xE5EC] = 0xE58F ^ 0xE5EC;
                    hd.ooo00oo0Ooo0[0x2D52 ^ 0x2DA8] = 0x2DE3 ^ 0x2DA8;
                    hd.ooo00oo0Ooo0[0xD271 ^ 0xD26F] = 0x1949D45 ^ 0xD26F;
                    n3 = -95765942;
                    continue block99;
                }
                case -95765942: {
                    hd.ooo00oo0Ooo0[0xC8B ^ 0xC08] = 0xC33 ^ 0xC08;
                    hd.ooo00oo0Ooo0[0xCBC2 ^ 0xCB5C] = 0xC4EC8599 ^ 0xCB5C;
                    n3 = -51313791;
                    continue block99;
                }
                case -51313791: {
                    hd.ooo00oo0Ooo0[0xA5A3 ^ 0xA54A] = 0xA551 ^ 0xA54A;
                    n3 = 440188425;
                    continue block99;
                }
                case 440188425: {
                    hd.ooo00oo0Ooo0[0x599F ^ 0x5926] = 0x5925 ^ 0x5926;
                    hd.ooo00oo0Ooo0[0xCEC0 ^ 0xCE60] = 0xCE60 ^ 0xCE60;
                    n3 = 1593761833;
                    continue block99;
                }
                case 1593761833: {
                    hd.ooo00oo0Ooo0[0xB125 ^ 0xB01E] = 0xFFFF4FE1 ^ 0xB01E;
                    hd.ooo00oo0Ooo0[0xB1DC ^ 0xB132] = 0xFFFF4EED ^ 0xB132;
                    hd.ooo00oo0Ooo0[0xE0B1 ^ 0xE1BC] = 0xDB19BF33 ^ 0xE1BC;
                    n3 = 155390102;
                    continue block99;
                }
                case 155390102: {
                    hd.ooo00oo0Ooo0[0xFAC3 ^ 0xFBAB] = 0xFFFF047A ^ 0xFBAB;
                    hd.ooo00oo0Ooo0[0x685 ^ 0x68F] = 0x690 ^ 0x68F;
                    n3 = -1543932073;
                    continue block99;
                }
                case -1543932073: {
                    hd.ooo00oo0Ooo0[0x9A3C ^ 0x9A5C] = 0x9A39 ^ 0x9A5C;
                    hd.ooo00oo0Ooo0[0x9F3 ^ 0x945] = 0xFFFFF692 ^ 0x945;
                    hd.ooo00oo0Ooo0[0x749A ^ 0x747A] = 0xFF9E746B ^ 0x747A;
                    n3 = 128023407;
                    continue block99;
                }
                case 128023407: {
                    hd.ooo00oo0Ooo0[0xE1C9 ^ 0xE0A7] = 0xE0B0 ^ 0xE0A7;
                    hd.ooo00oo0Ooo0[0x25D2 ^ 0x248B] = 0x248A ^ 0x248B;
                    hd.ooo00oo0Ooo0[0xD60 ^ 0xD5C] = 0xD5E ^ 0xD5C;
                    hd.ooo00oo0Ooo0[0x27F6 ^ 0x27D0] = 0xFFFFD85D ^ 0x27D0;
                    hd.ooo00oo0Ooo0[0xF691 ^ 0xF7A4] = 0xF7B7 ^ 0xF7A4;
                    hd.ooo00oo0Ooo0[0xEDA8 ^ 0xED3F] = 0x286B2724 ^ 0xED3F;
                    n3 = 2008265312;
                    continue block99;
                }
                case 2008265312: {
                    hd.ooo00oo0Ooo0[0x6DCE ^ 0x6CFF] = 0x6CF6 ^ 0x6CFF;
                    n3 = -675207343;
                    continue block99;
                }
                case -675207343: {
                    hd.ooo00oo0Ooo0[0xA864 ^ 0xA817] = 0xA852 ^ 0xA817;
                    hd.ooo00oo0Ooo0[0x88A1 ^ 0x88FF] = 0x88FC ^ 0x88FF;
                    hd.ooo00oo0Ooo0[0xA620 ^ 0xA7AC] = 0xA7AD ^ 0xA7AC;
                    hd.ooo00oo0Ooo0[0xFA5B ^ 0xFAEF] = 0xFFFF0510 ^ 0xFAEF;
                    hd.ooo00oo0Ooo0[0x7264 ^ 0x7342] = 0x7324 ^ 0x7342;
                    hd.ooo00oo0Ooo0[0xA8C5 ^ 0xA875] = 0xA878 ^ 0xA875;
                    hd.ooo00oo0Ooo0[0xAD7F ^ 0xAC2B] = 0xAC2C ^ 0xAC2B;
                    hd.ooo00oo0Ooo0[0xFF0 ^ 0xF7B] = 0x168F57 ^ 0xF7B;
                    hd.ooo00oo0Ooo0[0x38FF ^ 0x3993] = 0x3BA6BD3A ^ 0x3993;
                    hd.ooo00oo0Ooo0[0xFFF ^ 0xF83] = 0xFFFFF07C ^ 0xF83;
                    hd.ooo00oo0Ooo0[0x4960 ^ 0x486C] = 0xFFFFB0CD ^ 0x486C;
                    hd.ooo00oo0Ooo0[0x9BE4 ^ 0x9B3D] = 0xB1A16EB7 ^ 0x9B3D;
                    hd.ooo00oo0Ooo0[0xDEB5 ^ 0xDEEE] = 0xFFEFC67D ^ 0xDEEE;
                    hd.ooo00oo0Ooo0[0xFB0B ^ 0xFA7F] = 0xFA54 ^ 0xFA7F;
                    n3 = -957349442;
                    continue block99;
                }
                case -957349442: {
                    hd.ooo00oo0Ooo0[0x28B6 ^ 0x28E4] = 0x9E0D73A1 ^ 0x28E4;
                    hd.ooo00oo0Ooo0[0x39D ^ 0x2CD] = 0x2C0 ^ 0x2CD;
                    hd.ooo00oo0Ooo0[0x9134 ^ 0x9174] = 0x916F ^ 0x9174;
                    hd.ooo00oo0Ooo0[0x5FC5 ^ 0x5E82] = 0xFFFFA151 ^ 0x5E82;
                    hd.ooo00oo0Ooo0[0x798A ^ 0x7957] = 0x7945 ^ 0x7957;
                    n3 = -358146777;
                    continue block99;
                }
                case -358146777: {
                    hd.ooo00oo0Ooo0[0xA191 ^ 0xA0D0] = 0xA0E9 ^ 0xA0D0;
                    hd.ooo00oo0Ooo0[0x78F8 ^ 0x78D2] = 0x3D70DB05 ^ 0x78D2;
                    hd.ooo00oo0Ooo0[0xA26 ^ 0xA77] = 0x89D896BE ^ 0xA77;
                    hd.ooo00oo0Ooo0[0x761F ^ 0x7689] = 0xFFFF8976 ^ 0x7689;
                    n3 = -726708286;
                    continue block99;
                }
                case -726708286: {
                    hd.ooo00oo0Ooo0[0xE76A ^ 0xE609] = 0xE61C ^ 0xE609;
                    hd.ooo00oo0Ooo0[0x1E0B ^ 0x1E62] = 0xF11116D ^ 0x1E62;
                    hd.ooo00oo0Ooo0[0x5BD0 ^ 0x5BF4] = 0x5BE3 ^ 0x5BF4;
                    hd.ooo00oo0Ooo0[0x257F ^ 0x2467] = 0x244A ^ 0x2467;
                    n3 = 504891825;
                    continue block99;
                }
                case 504891825: {
                    hd.ooo00oo0Ooo0[0xD80C ^ 0xD90F] = 0xD91E ^ 0xD90F;
                    hd.ooo00oo0Ooo0[0x2CCB ^ 0x2C96] = 0x45D158CB ^ 0x2C96;
                    hd.ooo00oo0Ooo0[0x80BC ^ 0x81E9] = 0x81E2 ^ 0x81E9;
                    hd.ooo00oo0Ooo0[0xBAF2 ^ 0xBBA8] = 0xBBB7 ^ 0xBBA8;
                    hd.ooo00oo0Ooo0[0x7E4F ^ 0x7E60] = 0x7E0B ^ 0x7E60;
                    hd.ooo00oo0Ooo0[0x88F7 ^ 0x886C] = 0x885D ^ 0x886C;
                    hd.ooo00oo0Ooo0[0x9C96 ^ 0x9C75] = 0x9C7A ^ 0x9C75;
                    n3 = -1575462891;
                    continue block99;
                }
                case -1575462891: {
                    hd.ooo00oo0Ooo0[0xA43A ^ 0xA408] = 0x16C1C964 ^ 0xA408;
                    hd.ooo00oo0Ooo0[0xD42F ^ 0xD4F4] = 0x83CD9A67 ^ 0xD4F4;
                    hd.ooo00oo0Ooo0[0x5598 ^ 0x559A] = 0x5591 ^ 0x559A;
                    hd.ooo00oo0Ooo0[0x63E4 ^ 0x63DA] = 0xFFFF9C45 ^ 0x63DA;
                    n3 = 606884998;
                    continue block99;
                }
                case 606884998: {
                    hd.ooo00oo0Ooo0[0x1650 ^ 0x162F] = 0xFFFFE9D0 ^ 0x162F;
                    hd.ooo00oo0Ooo0[0x466F ^ 0x4642] = 0x4649 ^ 0x4642;
                    hd.ooo00oo0Ooo0[0xFEAA ^ 0xFE23] = 0xFE32 ^ 0xFE23;
                    hd.ooo00oo0Ooo0[0x731E ^ 0x7293] = 0x7293 ^ 0x7293;
                    hd.ooo00oo0Ooo0[0x162D ^ 0x16CC] = 0x16DD ^ 0x16CC;
                    hd.ooo00oo0Ooo0[0xAE2 ^ 0xA9C] = 0xFFFFF563 ^ 0xA9C;
                    hd.ooo00oo0Ooo0[0x5250 ^ 0x534B] = 0x535E ^ 0x534B;
                    hd.ooo00oo0Ooo0[0xD07B ^ 0xD08B] = 0xFFFF2F74 ^ 0xD08B;
                    n3 = -1601810222;
                    continue block99;
                }
                case -1601810222: {
                    hd.ooo00oo0Ooo0[0x2E5A ^ 0x2F02] = 0xFFFFD0FD ^ 0x2F02;
                    hd.ooo00oo0Ooo0[0x2592 ^ 0x24F2] = 0xFFFFDB0D ^ 0x24F2;
                    hd.ooo00oo0Ooo0[0x71A3 ^ 0x70F2] = 0x762D ^ 0x70F2;
                    hd.ooo00oo0Ooo0[0x3C7C ^ 0x3CBE] = 0x3CBD ^ 0x3CBE;
                    n3 = 251309542;
                    continue block99;
                }
                case 251309542: {
                    hd.ooo00oo0Ooo0[0x10AA6 ^ 0x10A90] = 0xFFFEF56F ^ 0x10A90;
                    hd.ooo00oo0Ooo0[0xA632 ^ 0xA62A] = 0xA639 ^ 0xA62A;
                    n3 = -1219615180;
                    continue block99;
                }
                case -1219615180: {
                    hd.ooo00oo0Ooo0[0xD803 ^ 0xD841] = 0x1000D89F ^ 0xD841;
                    n3 = 2082532559;
                    continue block99;
                }
                case 2082532559: {
                    hd.ooo00oo0Ooo0[0x9F62 ^ 0x9FD8] = 0x9FC5 ^ 0x9FD8;
                    hd.ooo00oo0Ooo0[0x2D0 ^ 0x267] = 0x5B05B23C ^ 0x267;
                    hd.ooo00oo0Ooo0[0x3B67 ^ 0x3B53] = 0x3B5A ^ 0x3B53;
                    hd.ooo00oo0Ooo0[0x76C5 ^ 0x76BE] = 0xFFFF8941 ^ 0x76BE;
                    hd.ooo00oo0Ooo0[0xEB33 ^ 0xEBA1] = 0xFFFF142C ^ 0xEBA1;
                    n3 = -736280966;
                    continue block99;
                }
                case -736280966: {
                    hd.ooo00oo0Ooo0[0xA5D3 ^ 0xA561] = 0xFFFF5A9E ^ 0xA561;
                    hd.ooo00oo0Ooo0[0x53FE ^ 0x5358] = 0x5319 ^ 0x5358;
                    n3 = 1931621726;
                    continue block99;
                }
                case 1931621726: {
                    hd.ooo00oo0Ooo0[0xDEE4 ^ 0xDFCD] = 0xDFD2 ^ 0xDFCD;
                    return;
                }
                default: {
                    hd.ooo00oo0Ooo0[0xB3C6 ^ 0xB381] = 0xB384 ^ 0xB381;
                    hd.ooo00oo0Ooo0[0x25BA ^ 0x2497] = 0x3F2B1C12 ^ 0x2497;
                    n3 = 896646237;
                    continue block99;
                }
                case 896646237: {
                    hd.ooo00oo0Ooo0[0x45E9 ^ 0x45BC] = 0x45B3 ^ 0x45BC;
                    n3 = 831453724;
                    continue block99;
                }
                case 831453724: {
                    hd.ooo00oo0Ooo0[0x57F8 ^ 0x57F4] = 0x5F02F455 ^ 0x57F4;
                    hd.ooo00oo0Ooo0[0xB1B3 ^ 0xB131] = 0xB112 ^ 0xB131;
                    n3 = -1525024850;
                    continue block99;
                }
                case -1525024850: {
                    hd.ooo00oo0Ooo0[0xBB ^ 0x135] = 0xFFFF8FCA ^ 0x135;
                    n3 = -1462542873;
                    continue block99;
                }
                case -1462542873: {
                    hd.ooo00oo0Ooo0[0x6685 ^ 0x6652] = 0x6659 ^ 0x6652;
                    hd.ooo00oo0Ooo0[0xD42C ^ 0xD46D] = 0xFFFF2B92 ^ 0xD46D;
                    hd.ooo00oo0Ooo0[0xA1ED ^ 0xA1EE] = 0xA1FB ^ 0xA1EE;
                    n3 = -1357413932;
                    continue block99;
                }
                case -1357413932: {
                    hd.ooo00oo0Ooo0[0xB23 ^ 0xA41] = 0xA4A ^ 0xA41;
                    hd.ooo00oo0Ooo0[0x978B ^ 0x96FC] = 0x96FC ^ 0x96FC;
                    hd.ooo00oo0Ooo0[0x9AB3 ^ 0x9AFC] = 0xFFFF653F ^ 0x9AFC;
                    n3 = 1365756287;
                    continue block99;
                }
                case 1365756287: {
                    hd.ooo00oo0Ooo0[0x97EF ^ 0x96B0] = 0x96E1 ^ 0x96B0;
                    hd.ooo00oo0Ooo0[0x98ED ^ 0x99A7] = 0xFFFF667A ^ 0x99A7;
                    hd.ooo00oo0Ooo0[0xD6DB ^ 0xD6B4] = 0xD691 ^ 0xD6B4;
                    n3 = -1015881141;
                    continue block99;
                }
                case -1015881141: {
                    hd.ooo00oo0Ooo0[0x3A65 ^ 0x3A29] = 0x2AED ^ 0x3A29;
                    hd.ooo00oo0Ooo0[0x776A ^ 0x77C5] = 0xFFFF883A ^ 0x77C5;
                    hd.ooo00oo0Ooo0[0x2606 ^ 0x2650] = 0xFFFFD9F5 ^ 0x2650;
                    n3 = 295893323;
                    continue block99;
                }
                case 295893323: {
                    hd.ooo00oo0Ooo0[0x8E6A ^ 0x8E09] = 0xFFFF71F6 ^ 0x8E09;
                    hd.ooo00oo0Ooo0[0x18F0 ^ 0x18F6] = 0x18E9 ^ 0x18F6;
                    hd.ooo00oo0Ooo0[0xD0EF ^ 0xD06B] = 0xD064 ^ 0xD06B;
                    hd.ooo00oo0Ooo0[0xF60B ^ 0xF703] = 0xF708 ^ 0xF703;
                    hd.ooo00oo0Ooo0[0xFF3B ^ 0xFFBE] = 0xFFAF ^ 0xFFBE;
                    hd.ooo00oo0Ooo0[0x8E54 ^ 0x8EAD] = 0xFFFF7152 ^ 0x8EAD;
                    n3 = 1231964213;
                    continue block99;
                }
                case 1231964213: {
                    hd.ooo00oo0Ooo0[0x3267 ^ 0x32B8] = 0xFFFFCD03 ^ 0x32B8;
                    hd.ooo00oo0Ooo0[0xB190 ^ 0xB094] = 0x492422DD ^ 0xB094;
                    hd.ooo00oo0Ooo0[0x8789 ^ 0x86AC] = 0xFFFF7903 ^ 0x86AC;
                    hd.ooo00oo0Ooo0[0xEB10 ^ 0xEA09] = 0xA56A40A3 ^ 0xEA09;
                    hd.ooo00oo0Ooo0[0xE9F4 ^ 0xE9FD] = 0x8000E849 ^ 0xE9FD;
                    hd.ooo00oo0Ooo0[0x61AC ^ 0x6104] = 0x611F ^ 0x6104;
                    n3 = 770829068;
                    continue block99;
                }
                case 770829068: {
                    hd.ooo00oo0Ooo0[0xE9BF ^ 0xE8AF] = 0xE8D8 ^ 0xE8AF;
                    hd.ooo00oo0Ooo0[0x8ECE ^ 0x8FFE] = 0x317F735E ^ 0x8FFE;
                    hd.ooo00oo0Ooo0[0x17FB ^ 0x1793] = 0xEB2FC920 ^ 0x1793;
                    n3 = 1205924731;
                    continue block99;
                }
                case 1205924731: {
                    hd.ooo00oo0Ooo0[0xDC88 ^ 0xDD8A] = 0xDD9B ^ 0xDD8A;
                    hd.ooo00oo0Ooo0[0x1A0D ^ 0x1A2D] = 0x1A76 ^ 0x1A2D;
                    hd.ooo00oo0Ooo0[0x1EE ^ 0xF4] = 0xFF ^ 0xF4;
                    n3 = 2068479196;
                    continue block99;
                }
                case 2068479196: {
                    hd.ooo00oo0Ooo0[0x27E1 ^ 0x27F7] = 0x1C7BE ^ 0x27F7;
                    hd.ooo00oo0Ooo0[0x5B3B ^ 0x5B9C] = 0x5B99 ^ 0x5B9C;
                    hd.ooo00oo0Ooo0[0x10B73 ^ 0x10A5C] = 0xFFFEF5C9 ^ 0x10A5C;
                    hd.ooo00oo0Ooo0[0xCC1A ^ 0xCD3E] = 0xCD1D ^ 0xCD3E;
                    hd.ooo00oo0Ooo0[0xDB75 ^ 0xDA3D] = 0xFFFF25AC ^ 0xDA3D;
                    hd.ooo00oo0Ooo0[0xE7E7 ^ 0xE7E2] = 0xFFFF180D ^ 0xE7E2;
                    hd.ooo00oo0Ooo0[0x7815 ^ 0x797C] = 0x795B ^ 0x797C;
                    hd.ooo00oo0Ooo0[0xCF26 ^ 0xCF47] = 0xFFFF3094 ^ 0xCF47;
                    hd.ooo00oo0Ooo0[0x93DA ^ 0x92DD] = 0x92C8 ^ 0x92DD;
                    n3 = 104498747;
                    continue block99;
                }
                case 104498747: {
                    hd.ooo00oo0Ooo0[0x2803 ^ 0x2962] = 0x2962 ^ 0x2962;
                    hd.ooo00oo0Ooo0[0x43EE ^ 0x42CE] = 0x42D5 ^ 0x42CE;
                    hd.ooo00oo0Ooo0[0x38E6 ^ 0x38F4] = 0xFF1FC70B ^ 0x38F4;
                    hd.ooo00oo0Ooo0[0x105FF ^ 0x105CA] = 0x105E7 ^ 0x105CA;
                    hd.ooo00oo0Ooo0[0x5BE6 ^ 0x5B3E] = 0x5B49 ^ 0x5B3E;
                    hd.ooo00oo0Ooo0[0xF7E8 ^ 0xF692] = 0xF572 ^ 0xF692;
                    hd.ooo00oo0Ooo0[0x85D2 ^ 0x8541] = 0xFFFF7ABE ^ 0x8541;
                    n3 = 1017278352;
                    continue block99;
                }
                case 1017278352: {
                    hd.ooo00oo0Ooo0[0xE6B1 ^ 0xE600] = 0xE613 ^ 0xE600;
                    hd.ooo00oo0Ooo0[0xC527 ^ 0xC59B] = 0xC5DC ^ 0xC59B;
                    hd.ooo00oo0Ooo0[0xC65B ^ 0xC76D] = 0x586F72EA ^ 0xC76D;
                    hd.ooo00oo0Ooo0[0x6D5B ^ 0x6C3E] = 0x6C39 ^ 0x6C3E;
                    n3 = -1288123415;
                    continue block99;
                }
                case -1288123415: {
                    hd.ooo00oo0Ooo0[0x3BE7 ^ 0x3B77] = 0x5B058B2C ^ 0x3B77;
                    hd.ooo00oo0Ooo0[0x158E ^ 0x15EB] = 0x8D8D9823 ^ 0x15EB;
                    hd.ooo00oo0Ooo0[0xEC0B ^ 0xECC7] = 0xECD6 ^ 0xECC7;
                    hd.ooo00oo0Ooo0[0x67CC ^ 0x66EE] = 0x66F7 ^ 0x66EE;
                    hd.ooo00oo0Ooo0[0x6167 ^ 0x61DC] = 0x61A9 ^ 0x61DC;
                    hd.ooo00oo0Ooo0[0x10826 ^ 0x109AF] = 0xFFFEF650 ^ 0x109AF;
                    hd.ooo00oo0Ooo0[0xE565 ^ 0xE5C0] = 0xFFFF1A3B ^ 0xE5C0;
                    hd.ooo00oo0Ooo0[0x27EA ^ 0x26E0] = 0x2699 ^ 0x26E0;
                    hd.ooo00oo0Ooo0[0x39D0 ^ 0x3938] = 0x393D ^ 0x3938;
                    hd.ooo00oo0Ooo0[0x183A ^ 0x18DE] = 0x18CF ^ 0x18DE;
                    hd.ooo00oo0Ooo0[0xA1A1 ^ 0xA0FA] = 0xA0F1 ^ 0xA0FA;
                    n3 = -699005997;
                    continue block99;
                }
                case -699005997: {
                    hd.ooo00oo0Ooo0[0x5EF3 ^ 0x5E29] = 0xFFFFA1D6 ^ 0x5E29;
                    n3 = -2145729789;
                    continue block99;
                }
                case -2145729789: {
                    hd.ooo00oo0Ooo0[0x802D ^ 0x8079] = 0x8010 ^ 0x8079;
                    hd.ooo00oo0Ooo0[0xDFFF ^ 0xDE8E] = 0xDE8A ^ 0xDE8E;
                    n3 = 1524562252;
                    continue block99;
                }
                case 1524562252: {
                    hd.ooo00oo0Ooo0[0x1870 ^ 0x19F3] = 0x19F9 ^ 0x19F3;
                    hd.ooo00oo0Ooo0[0xF980 ^ 0xF92B] = 0xFFFF06E8 ^ 0xF92B;
                    hd.ooo00oo0Ooo0[0xD0F8 ^ 0xD1D6] = 0xD1E1 ^ 0xD1D6;
                    n3 = -1000421204;
                    continue block99;
                }
                case -1000421204: {
                    hd.ooo00oo0Ooo0[0xE8BA ^ 0xE879] = 0xE864 ^ 0xE879;
                    hd.ooo00oo0Ooo0[0xC793 ^ 0xC743] = 0xC710 ^ 0xC743;
                    hd.ooo00oo0Ooo0[0x163C ^ 0x16F3] = 0x16FA ^ 0x16F3;
                    hd.ooo00oo0Ooo0[0x1E50 ^ 0x1E7E] = 0x5B05AE25 ^ 0x1E7E;
                    hd.ooo00oo0Ooo0[0x3A2B ^ 0x3A03] = 0x8C75F42A ^ 0x3A03;
                    hd.ooo00oo0Ooo0[0x9CCD ^ 0x9C41] = 0xFFFF63DA ^ 0x9C41;
                    hd.ooo00oo0Ooo0[0x3778 ^ 0x3793] = 0xFFFFCE07 ^ 0x3793;
                    n3 = 905923174;
                    continue block99;
                }
                case 905923174: {
                    hd.ooo00oo0Ooo0[0xAD53 ^ 0xAD5B] = 0xFFFF52A4 ^ 0xAD5B;
                    hd.ooo00oo0Ooo0[0xBBAF ^ 0xBB17] = 0x5C644E37 ^ 0xBB17;
                    hd.ooo00oo0Ooo0[0x955B ^ 0x952A] = 0xFFFF6AED ^ 0x952A;
                    hd.ooo00oo0Ooo0[0xA5C9 ^ 0xA51F] = 0xA50A ^ 0xA51F;
                    hd.ooo00oo0Ooo0[0x6649 ^ 0x6702] = 0x6723 ^ 0x6702;
                    hd.ooo00oo0Ooo0[0xB7DE ^ 0xB7F7] = 0xFFFF4878 ^ 0xB7F7;
                    hd.ooo00oo0Ooo0[0x4157 ^ 0x41A9] = 0x41B2 ^ 0x41A9;
                    hd.ooo00oo0Ooo0[0x7D3C ^ 0x7D92] = 0x7D99 ^ 0x7D92;
                    hd.ooo00oo0Ooo0[0x89B4 ^ 0x891D] = 0x432D54F ^ 0x891D;
                    hd.ooo00oo0Ooo0[0xECB0 ^ 0xEC41] = 0xF5F2336C ^ 0xEC41;
                    hd.ooo00oo0Ooo0[0xFFAB ^ 0xFE8A] = 0xFE8F ^ 0xFE8A;
                    hd.ooo00oo0Ooo0[0x4656 ^ 0x470B] = 0x4773 ^ 0x470B;
                    hd.ooo00oo0Ooo0[0xB7A2 ^ 0xB762] = 0xB76B ^ 0xB762;
                    hd.ooo00oo0Ooo0[0xBEB3 ^ 0xBEAA] = 0xBEA7 ^ 0xBEAA;
                    hd.ooo00oo0Ooo0[0x23AA ^ 0x2356] = 0x8D288F15 ^ 0x2356;
                    hd.ooo00oo0Ooo0[0xC573 ^ 0xC524] = 0xFFFF3A91 ^ 0xC524;
                    hd.ooo00oo0Ooo0[0x9369 ^ 0x93A1] = 0x93AA ^ 0x93A1;
                    hd.ooo00oo0Ooo0[0x2925 ^ 0x2856] = 0x82FA2381 ^ 0x2856;
                    hd.ooo00oo0Ooo0[0x4477 ^ 0x449D] = 0xFFFFBB70 ^ 0x449D;
                    hd.ooo00oo0Ooo0[0xBBC5 ^ 0xBB45] = 0xC1F0C75A ^ 0xBB45;
                    n3 = 1623583352;
                    continue block99;
                }
                case 1623583352: {
                    hd.ooo00oo0Ooo0[0x14F1 ^ 0x14D6] = 0xFFFFEB7D ^ 0x14D6;
                    n3 = 1340950892;
                    continue block99;
                }
                case 1340950892: {
                    hd.ooo00oo0Ooo0[0x37CF ^ 0x3647] = 0xFFFFC9B8 ^ 0x3647;
                    hd.ooo00oo0Ooo0[0x5ECF ^ 0x5E28] = 0x5E6B ^ 0x5E28;
                    hd.ooo00oo0Ooo0[0x92A1 ^ 0x92CD] = 0xFFFF6D22 ^ 0x92CD;
                    hd.ooo00oo0Ooo0[0xA6D5 ^ 0xA6F0] = 0xA6E9 ^ 0xA6F0;
                    hd.ooo00oo0Ooo0[0xDA8 ^ 0xCDD] = 0xCF0 ^ 0xCDD;
                    hd.ooo00oo0Ooo0[0xD9A3 ^ 0xD8EE] = 0xD8FF ^ 0xD8EE;
                    n3 = -1768231928;
                    continue block99;
                }
                case -1768231928: {
                    hd.ooo00oo0Ooo0[0xDD13 ^ 0xDC5A] = 0xFFFF23A7 ^ 0xDC5A;
                    hd.ooo00oo0Ooo0[0x13A8 ^ 0x13E0] = 0xC0C0D322 ^ 0x13E0;
                    n3 = 352340106;
                    continue block99;
                }
                case 352340106: {
                    hd.ooo00oo0Ooo0[0x87E3 ^ 0x8788] = 0x8799 ^ 0x8788;
                    hd.ooo00oo0Ooo0[0x7BE2 ^ 0x7BEC] = 0x7BE7 ^ 0x7BEC;
                    n3 = -2104666631;
                    continue block99;
                }
                case -2104666631: {
                    hd.ooo00oo0Ooo0[0xB003 ^ 0xB17D] = 0xB17D ^ 0xB17D;
                    hd.ooo00oo0Ooo0[0xAC14 ^ 0xAD91] = 0xAD96 ^ 0xAD91;
                    hd.ooo00oo0Ooo0[0x36FA ^ 0x363C] = 0x194363C ^ 0x363C;
                    hd.ooo00oo0Ooo0[0x1091B ^ 0x10806] = 0x10214887 ^ 0x10806;
                    hd.ooo00oo0Ooo0[0xC5CC ^ 0xC5A8] = 0xC59D ^ 0xC5A8;
                    hd.ooo00oo0Ooo0[0x10230 ^ 0x1022C] = 0x2B2F41F7 ^ 0x1022C;
                    hd.ooo00oo0Ooo0[0x301D ^ 0x3124] = 0x3133 ^ 0x3124;
                    hd.ooo00oo0Ooo0[0xD511 ^ 0xD45E] = 0xD44D ^ 0xD45E;
                    hd.ooo00oo0Ooo0[0x835D ^ 0x83D2] = 0x83DD ^ 0x83D2;
                    hd.ooo00oo0Ooo0[0xD1E0 ^ 0xD131] = 0xFFFF2ECE ^ 0xD131;
                    n3 = 471843655;
                    continue block99;
                }
                case 471843655: {
                    hd.ooo00oo0Ooo0[0xC75 ^ 0xD13] = 0x5CC0E060 ^ 0xD13;
                    hd.ooo00oo0Ooo0[0x4C1C ^ 0x4C68] = 0x4C4D ^ 0x4C68;
                    hd.ooo00oo0Ooo0[0xA600 ^ 0xA70B] = 0xFFFF58E8 ^ 0xA70B;
                    hd.ooo00oo0Ooo0[0x524A ^ 0x5213] = 0x521E ^ 0x5213;
                    hd.ooo00oo0Ooo0[0xFE69 ^ 0xFF3B] = 0xFF04 ^ 0xFF3B;
                    hd.ooo00oo0Ooo0[0xF368 ^ 0xF33B] = 0xF37A ^ 0xF33B;
                    n3 = -313073873;
                    continue block99;
                }
                case -313073873: {
                    hd.ooo00oo0Ooo0[0x5C72 ^ 0x5C6D] = 0xFFFFA3AA ^ 0x5C6D;
                    hd.ooo00oo0Ooo0[0x63A1 ^ 0x62A0] = 0xFFFF9D5F ^ 0x62A0;
                    n3 = 1360822128;
                    continue block99;
                }
                case 1360822128: {
                    hd.ooo00oo0Ooo0[0x5DAE ^ 0x5DD7] = 0x5DC2 ^ 0x5DD7;
                    n3 = 1210213780;
                    continue block99;
                }
                case 1210213780: {
                    hd.ooo00oo0Ooo0[0x6FC9 ^ 0x6F24] = 0x73ECC2C7 ^ 0x6F24;
                    hd.ooo00oo0Ooo0[0x7789 ^ 0x7757] = 0xFFFF88FE ^ 0x7757;
                    n3 = -2054359807;
                    continue block99;
                }
                case -2054359807: {
                    hd.ooo00oo0Ooo0[0x446 ^ 0x553] = 0x542 ^ 0x553;
                    hd.ooo00oo0Ooo0[0x2BE9 ^ 0x2A92] = 0x2A97 ^ 0x2A92;
                    hd.ooo00oo0Ooo0[0x77C ^ 0x706] = 0x70D ^ 0x706;
                    hd.ooo00oo0Ooo0[0x3873 ^ 0x3947] = 0x394A ^ 0x3947;
                    n3 = -458883021;
                    continue block99;
                }
                case -458883021: {
                    hd.ooo00oo0Ooo0[0xC7B2 ^ 0xC698] = 0xC699 ^ 0xC698;
                    hd.ooo00oo0Ooo0[0x1D3D ^ 0x1CB2] = 0x1CB5 ^ 0x1CB2;
                    hd.ooo00oo0Ooo0[0x2171 ^ 0x2171] = 0x99B9B813 ^ 0x2171;
                    hd.ooo00oo0Ooo0[0xAA89 ^ 0xAAE3] = 0xAAEC ^ 0xAAE3;
                    hd.ooo00oo0Ooo0[0x13BB ^ 0x134C] = 0x130B ^ 0x134C;
                    hd.ooo00oo0Ooo0[0x8D85 ^ 0x8CF3] = 0x5B053CA8 ^ 0x8CF3;
                    hd.ooo00oo0Ooo0[0x4D95 ^ 0x4DA6] = 0x4DB1 ^ 0x4DA6;
                    hd.ooo00oo0Ooo0[0x3BED ^ 0x3BA8] = 0xFFFFC439 ^ 0x3BA8;
                    hd.ooo00oo0Ooo0[0x5374 ^ 0x53FE] = 0x53F1 ^ 0x53FE;
                    hd.ooo00oo0Ooo0[0xC370 ^ 0xC3B7] = 0xC3A2 ^ 0xC3B7;
                    hd.ooo00oo0Ooo0[0x3CB3 ^ 0x3C19] = 0xFFFFC3E6 ^ 0x3C19;
                    n3 = -1198650447;
                    continue block99;
                }
                case -1198650447: {
                    hd.ooo00oo0Ooo0[0x6009 ^ 0x611F] = 0x6132 ^ 0x611F;
                    hd.ooo00oo0Ooo0[0x107DA ^ 0x107F9] = 0x8591B61E ^ 0x107F9;
                    hd.ooo00oo0Ooo0[0xA3C2 ^ 0xA3A0] = 0xA3BB ^ 0xA3A0;
                    hd.ooo00oo0Ooo0[0xB93B ^ 0xB94D] = 0xB94D ^ 0xB94D;
                    hd.ooo00oo0Ooo0[0x5D37 ^ 0x5D1B] = 0x5D0E ^ 0x5D1B;
                    hd.ooo00oo0Ooo0[0xEA3F ^ 0xEB02] = 0xFB82D5DC ^ 0xEB02;
                    hd.ooo00oo0Ooo0[0x987D ^ 0x98AE] = 0x98BB ^ 0x98AE;
                    hd.ooo00oo0Ooo0[0xB357 ^ 0xB228] = 0xB228 ^ 0xB228;
                    hd.ooo00oo0Ooo0[0xDE99 ^ 0xDE8D] = 0xDE86 ^ 0xDE8D;
                    n3 = -249603926;
                    continue block99;
                }
                case -249603926: {
                    hd.ooo00oo0Ooo0[0xE89A ^ 0xE848] = 0xFFFF17C0 ^ 0xE848;
                    hd.ooo00oo0Ooo0[0x2AE6 ^ 0x2BC1] = 0xFFFFD43E ^ 0x2BC1;
                    n3 = -776819561;
                    continue block99;
                }
                case -776819561: {
                    hd.ooo00oo0Ooo0[0x9991 ^ 0x992F] = 0x9930 ^ 0x992F;
                    hd.ooo00oo0Ooo0[0x33C8 ^ 0x32F4] = 0x3295 ^ 0x32F4;
                    n3 = -1347832025;
                    continue block99;
                }
                case -1347832025: {
                    hd.ooo00oo0Ooo0[0x2C88 ^ 0x2DCA] = 0x2DCB ^ 0x2DCA;
                    hd.ooo00oo0Ooo0[0xD289 ^ 0xD3E6] = 0xD3EF ^ 0xD3E6;
                    hd.ooo00oo0Ooo0[0xDC5E ^ 0xDC01] = 0xDC1C ^ 0xDC01;
                    n3 = 1417418334;
                    continue block99;
                }
                case 1417418334: {
                    hd.ooo00oo0Ooo0[0x1BCD ^ 0x1A8E] = 0x1A91 ^ 0x1A8E;
                    hd.ooo00oo0Ooo0[0x6B77 ^ 0x6A40] = 0xACF2F4E3 ^ 0x6A40;
                    hd.ooo00oo0Ooo0[0x6E7B ^ 0x6F0B] = 0x781927BA ^ 0x6F0B;
                    hd.ooo00oo0Ooo0[0xF74D ^ 0xF673] = 0xFFFF098C ^ 0xF673;
                    hd.ooo00oo0Ooo0[0x8946 ^ 0x8874] = 0x8863 ^ 0x8874;
                    hd.ooo00oo0Ooo0[0xB4E6 ^ 0xB404] = 0x1A1FECD5 ^ 0xB404;
                    hd.ooo00oo0Ooo0[0x3C84 ^ 0x3D0F] = 0x3D00 ^ 0x3D0F;
                    n3 = 1019857808;
                    continue block99;
                }
                case 1019857808: 
            }
            hd.ooo00oo0Ooo0[0xF81D ^ 0xF91B] = 0x97B4DCF6 ^ 0xF91B;
            hd.ooo00oo0Ooo0[0xE9B9 ^ 0xE8AD] = 0xE8A2 ^ 0xE8AD;
            hd.ooo00oo0Ooo0[0x92C1 ^ 0x93E2] = 0x93E5 ^ 0x93E2;
            hd.ooo00oo0Ooo0[0xD1C9 ^ 0xD1F6] = 0xD1F3 ^ 0xD1F6;
            hd.ooo00oo0Ooo0[0x96A9 ^ 0x96B8] = 0xFFFF6979 ^ 0x96B8;
            n3 = -1119435462;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var27 = -1722772898;
        if (var27 != var27) {
            hd.o0o000o0O0o0 = var27 = 259524797;
        }
        if ((var27 = 1186627002) != var27) {
            91 + 95;
        }
        var22_3 = new Object[22];
        var23_4 = new long[22];
        hd.0OOOoo00o0();
        hd.O0OoOO0OOOOO = new String[hd.ooo00oo0Ooo0[369]];
        hd.0oOOoOo0O00O = new String[hd.ooo00oo0Ooo0[370]];
        hd.0OOOoo00o0 = new Object[(hd.ooo00oo0Ooo0[371] * hd.ooo00oo0Ooo0[372] ^ hd.ooo00oo0Ooo0[373]) * hd.ooo00oo0Ooo0[374]];
        var23_4[12] = var24_5 = 4793782615319299359L;
        v0 = var23_4[12];
        v1 = hd.ooo00oo0Ooo0[378];
        var23_4[12] = var24_5 = v0 ^ ((long)(hd.ooo00oo0Ooo0[375] ^ hd.ooo00oo0Ooo0[376] ^ hd.ooo00oo0Ooo0[377]) ^ v0) & -1L >>> -((v1 >>> hd.ooo00oo0Ooo0[379] | v1 << hd.ooo00oo0Ooo0[380]) ^ hd.ooo00oo0Ooo0[381]);
        v2 = hd.0oOOoOo0O00O[hd.ooo00oo0Ooo0[382]];
        if (v2 == null) {
            var19_1 = -1787409320;
            v3 = hd.ooo00oo0Ooo0[383];
            v4 = hd.O0OoOO0OOOOO[hd.ooo00oo0Ooo0[384]];
            if (v4 == null) {
                var22_3[16] = "\ue4c7\ue493\ue4b6\ue479\ue485\ue4c1\ue479\ue4bc\ue48b\ue468\ue49d\ue477\ue456\ue4a0\ue464\ue468\ue484\ue466\ue492\ue482\ue435\ue429\ue3e8\ue476\ue424\ue474\ue412\ue3df\ue476\ue41a\ue478\ue415\ue3be\ue485\ue416\ue410\ue3fc\ue3e4\ue3e4\ue42a\ue41f\ue421\ue413\ue418\ue3d6\ue419\ue41f\ue3fc\ue3ee\ue3de\ue333\ue412\ue408\ue3f8\ue3f7\ue40a\ue32a\ue312\ue3db\ue3eb\ue3ea\ue3e9\ue31f\ue3e7\ue2bf\ue2aa\ue27e\ue281\ue2a0\ue294\ue293\ue2bd\ue28d\ue28a\ue26d\ue295\ue26c\ue29e\ue324\ue27d\ue29b\ue340\ue28d\ue266\ue279\ue261\ue2e8\ue277\ue285\ue2e6\ue27f\ue26a\ue329\ue272\ue31d\ue31b\ue28b\ue320\ue336\ue2c5\ue2c5\ue27f\ue2d7\ue30a\ue2f7\ue2df\ue2f9\ue151\ue2fe\ue303\ue2e2\ue2f7\ue2ee\ue2e7\ue2fc\ue2df\ue12b\ue309\ue30e\ue2e9\ue2ea\ue11e\ue113\ue2f5\ue2e5\ue300\ue2e4\ue2e1\ue2a4\ue2c3\ue2a6\ue272\ue298\ue295\ue2be\ue277\ue283\ue284\ue27f\ue265\ue276\ue27e\ue296\ue266\ue269\ue245\ue25a\ue246\ue279\ue21a\ue28e\ue227\ue26e\ue279\ue1e8\ue283\ue1e9\ue27a\ue27b\ue217\ue1c6\ue1be\ue238\ue1f0\ue219\ue1c3\ue221\ue21b\ue1e4\ue202\ue1f6\ue1fa\ue1e3\ue1fa\ue1ec\udf43\ue1ed\udf37\ue20d\ue1bf\ue202\ue206\ue1e1\udf23\ue208\udf12\ue1fb\udf26\ue1eb\ue1f5\udf26\udf22\udeaa\ude9a\udeba\udeb6\udea1\udec1\ude77\ude79\udea1\ude9d\ude98\udf58\udea3\udf24\udf46\ude7c\udf3c\ude61\udef4\ude5f\udf1a\ude5d\udf13\udee4\udf0e\ude88\udf35\ude6a\udf08\udedb\udf09\udf18\udf38\udf18\udf1b\udf26\udf15\udf08\udf1f\udf20\udf1b\udefe\udf02\udefe\udf1a\udefb\udee8\udea6\udecd\udec7\udebe\udee6\udee2\udee1\udf0d\udef7\udf2c\udf1c\udefe\udefc\udee5\udee3\udef2\udf28".toCharArray();
                var23_4[1] = var24_5 = (long)hd.ooo00oo0Ooo0[385];
                while ((int)var23_4[1] < ((char[])var22_3[16]).length) {
                    v5 = (char[])var22_3[16];
                    v6 = (int)var23_4[1];
                    v7 = v5[v6];
                    v8 = (char)(v7 << hd.ooo00oo0Ooo0[386] | v7 >>> hd.ooo00oo0Ooo0[387]);
                    v9 = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(v8 << hd.ooo00oo0Ooo0[388] | v8 >>> hd.ooo00oo0Ooo0[389])) ^ hd.ooo00oo0Ooo0[390]))) + v6) ^ v6) + v6) - hd.ooo00oo0Ooo0[391]) ^ hd.ooo00oo0Ooo0[392]) ^ v6) ^ hd.ooo00oo0Ooo0[393]) - hd.ooo00oo0Ooo0[394]);
                    v5[v6] = (char)(v9 >>> hd.ooo00oo0Ooo0[395] | v9 << hd.ooo00oo0Ooo0[396]);
                    var23_4[1] = var24_5 = (long)((int)var23_4[1] + 1);
                }
                v4 = hd.O0OoOO0OOOOO[hd.ooo00oo0Ooo0[397]] = new String((char[])var22_3[16]);
            }
            v2 = hd.o0Oo000O0oO(v3, v4);
        }
        var22_3[18] = v2.toCharArray();
        v10 = hd.ooo00oo0Ooo0[398];
        var23_4[6] = var24_5 = 2057259096338445814L;
        v11 = var23_4[6];
        v12 = 2082471873 - -61;
        var23_4[6] = var24_5 = v11 ^ ((long)(~((v10 >>> hd.ooo00oo0Ooo0[399] | v10 << 25) + 55)) ^ v11) & -1L >>> -(v12 >>> 21 | v12 << 11) * 1594008481;
        var23_4[20] = var24_5 = -8844477543610388610L;
        v13 = var23_4[20];
        var23_4[20] = var24_5 = v13 ^ ((long)(-17407 * 0x3B13B13B * -991146299 + -103) ^ v13) & -1L >>> (~(40370176 >>> 19 | 40370176 << 13) ^ 107) - -71;
        if (true) ** GOTO lbl57
        block6: while (true) {
            v14 = 150700650 ^ -85;
            if ((int)(var23_4[7] >>> (v14 >>> 1 | v14 << 31) * -57) < (int)(var23_4[12] >>> (28672 >>> 11 | 28672 << 21) - -123 + -105)) {
                ((char[])var22_3[13])[(int)(var23_4[7] >>> (-152320 + -105) * 0x75075075 * -128207979 + 97)] = ((char[])var22_3[18])[(int)var23_4[20] + (int)(var23_4[7] >>> 13938 * 2083697005 - 89 + -17)];
                var23_4[7] = var24_5 = var23_4[7] + 0x100000000L;
                continue;
            }
            v15 = var23_4[12];
            var23_4[12] = var24_5 = v15 ^ (v15 ^ v15 + (long)(--1768515947 * 51 - -39 - 119)) & -1L >>> (-(~-1717986918) - -5) * 5;
            hd.0OOOoo00o0[(int)var23_4[12]] = new String((char[])var22_3[13]);
            v16 = var23_4[20];
            var23_4[20] = var24_5 = v16 ^ ((long)((int)var23_4[20] + (int)(var23_4[12] >>> -30 + -25 - -87)) ^ v16) & -1L >>> ~(~(-2103657451 * 49 + 27));
lbl57:
            // 2 sources

            var20_2 = -377369280;
            block7: while (true) {
                switch (var20_2) {
                    default: {
                        if ((int)var23_4[20] >= (int)var23_4[6]) return;
                        v17 = var23_4[20];
                        v18 = (-62721 >>> 9 | -62721 << 23) + 123;
                        var23_4[20] = var24_5 = v17 ^ (v17 ^ v17 + (long)(v18 << 1 | v18 >>> 31)) & -1L >>> -147 - -103 - 49 - -125;
                        v19 = var23_4[20];
                        var23_4[20] = var24_5 = v19 ^ ((long)((char[])var22_3[18])[(int)var23_4[20]] << -(~31) ^ v19) & -1L << ~(-(-26 + 59));
                        var20_2 = -1490582979;
                        continue block7;
                    }
                    case -1490582979: {
                        v20 = var23_4[20];
                        v21 = -6356992 * -1594008481;
                        var23_4[20] = var24_5 = v20 ^ (v20 ^ v20 + (long)((-1897774152 >>> 13 | -1897774152 << 19) * 43 * 11 + -65)) & -1L >>> (v21 << 21 | v21 >>> 11);
                        v22 = var23_4[6];
                        var23_4[6] = var24_5 = v22 ^ ((long)((char[])var22_3[18])[(int)var23_4[20]] << -(~137) + -105 - 1 ^ v22) & -1L << -1928352664 * 49 + 17 + 39;
                        v23 = 253899 + 53;
                        v24 = -2147483615 >>> 1 | -2147483615 << 31;
                        v25 = var23_4[12];
                        v26 = 2048 << 7 | 2048 >>> 25;
                        var23_4[12] = var24_5 = v25 ^ ((long)((int)(var23_4[20] >>> -(11 - 43)) << -(v23 >>> 13 | v23 << 19) - -47 | (int)(var23_4[6] >>> (v24 >>> 25 | v24 << 7) * 128207979)) << ~(-(-1000197863 * 73)) ^ v25) & -1L << (v26 << 19 | v26 >>> 13);
                        var22_3[13] = new char[(int)(var23_4[12] >>> ~(-324 - -69 + 95) - 127)];
                        var23_4[7] = var24_5 = -7628533658380305598L;
                        v27 = var23_4[7];
                        v28 = (-469761931 - 117) * 630453915;
                        var23_4[7] = var24_5 = v27 ^ ((long)(-((-61 ^ -61) * 37)) << (58835083 ^ 107) * -73 ^ v27) & -1L << (v28 >>> 21 | v28 << 11) * -1431655765;
                        continue block6;
                    }
                    case 1782788374: 
                }
                break;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public hd() {
        aki aki2;
        int n2 = 286028854;
        if (n2 != n2) {
            throw null;
        }
        int n3 = ooo00oo0Ooo0[0] - ooo00oo0Ooo0[1];
        this.qs = new akq((String)0OOOoo00o0[(n3 << ooo00oo0Ooo0[2] | n3 >>> ooo00oo0Ooo0[3]) * ooo00oo0Ooo0[4]], this, (Number)Double.longBitsToDouble(0xC9F4F637B07F6B60L ^ 0x89D4F637B07F6B60L), (Number)1.0, (Number)Double.longBitsToDouble(0x869F280F29AC226CL ^ 0xC6B1280F29AC226CL), (Number)Double.longBitsToDouble(0x7608C6E3E62F2141L ^ 0x49B15F7A7FB6B8DBL));
        int n4 = ooo00oo0Ooo0[5];
        this.qt = new akq((String)0OOOoo00o0[(n4 << ooo00oo0Ooo0[6] | n4 >>> ooo00oo0Ooo0[7]) ^ ooo00oo0Ooo0[8]], this, (Number)Double.longBitsToDouble(0xBF6A8BB081F04966L ^ 0xFF728BB081F04966L), (Number)1.0, (Number)Double.longBitsToDouble(0xEC2537736FEE045AL ^ 0xAC0D37736FEE045AL), (Number)Double.longBitsToDouble(0xABABA330278839D1L ^ 0x94123AA9BE11A04BL));
        int n5 = ooo00oo0Ooo0[9];
        this.qu = new akq((String)0OOOoo00o0[(n5 >>> ooo00oo0Ooo0[10] | n5 << ooo00oo0Ooo0[11]) * ooo00oo0Ooo0[12]], this, (Number)Double.longBitsToDouble(0x7CD2FF1E574CAC4FL ^ 0x3CDAFF1E574CAC4FL), (Number)1.0, (Number)Double.longBitsToDouble(0x97C170673B751AABL ^ 0xD7E570673B751AABL), (Number)Double.longBitsToDouble(0xF5016AE58179A041L ^ 0xCAB8F37C18E039DBL));
        int n6 = ooo00oo0Ooo0[13];
        this.qv = new akq((String)0OOOoo00o0[-((n6 << ooo00oo0Ooo0[14] | n6 >>> ooo00oo0Ooo0[15]) * ooo00oo0Ooo0[16]) - ooo00oo0Ooo0[17]], this, (Number)Double.longBitsToDouble(0x6BA232CC214FAD76L ^ 0x2BB632CC214FAD76L), (Number)0.0, (Number)Double.longBitsToDouble(0x52E51D46471D4399L ^ 0x12BC1D46471D4399L), (Number)1.0);
        int n7 = ooo00oo0Ooo0[18];
        this.qw = new akq((String)0OOOoo00o0[-(n7 >>> ooo00oo0Ooo0[19] | n7 << ooo00oo0Ooo0[20]) - ooo00oo0Ooo0[21]], this, (Number)Double.longBitsToDouble(0x5B8CC2B68C5D76CDL ^ 0x1BEA42B68C5D76CDL), (Number)Double.longBitsToDouble(0xFC8EF3187DC1696BL ^ 0xBCB0F3187DC1696BL), (Number)Double.longBitsToDouble(0xC54A1CEC34D0B466L ^ 0x853C9CEC34D0B466L), (Number)1.0);
        String string = o0Oo000O0oO;
        if (string == null) {
            int n8 = ooo00oo0Ooo0[22] ^ ooo00oo0Ooo0[23];
            string = o0Oo000O0oO = (String)0OOOoo00o0[n8 << ooo00oo0Ooo0[24] | n8 >>> ooo00oo0Ooo0[25]] + (String)0OOOoo00o0[-(ooo00oo0Ooo0[26] + ooo00oo0Ooo0[27]) * ooo00oo0Ooo0[28] + ooo00oo0Ooo0[29]];
        }
        int n9 = ooo00oo0Ooo0[30] * ooo00oo0Ooo0[31] * ooo00oo0Ooo0[32];
        this.qx = new aki(string, (gi)this, (Boolean)((n9 << ooo00oo0Ooo0[33] | n9 >>> ooo00oo0Ooo0[34]) != 0));
        this.qy = new aki((String)0OOOoo00o0[(ooo00oo0Ooo0[35] + ooo00oo0Ooo0[36] + ooo00oo0Ooo0[37]) * ooo00oo0Ooo0[38] - ooo00oo0Ooo0[39]], (gi)this, (Boolean)(ooo00oo0Ooo0[40] * ooo00oo0Ooo0[41] * ooo00oo0Ooo0[42]));
        int n10 = ooo00oo0Ooo0[43];
        int n11 = (n10 << ooo00oo0Ooo0[44] | n10 >>> ooo00oo0Ooo0[45]) * ooo00oo0Ooo0[46] ^ ooo00oo0Ooo0[47];
        int n12 = ooo00oo0Ooo0[50];
        this.qz = new aki((String)0OOOoo00o0[n11 >>> ooo00oo0Ooo0[48] | n11 << ooo00oo0Ooo0[49]], (gi)this, (Boolean)(((n12 << ooo00oo0Ooo0[51] | n12 >>> ooo00oo0Ooo0[52]) * ooo00oo0Ooo0[53] ^ ooo00oo0Ooo0[54]) != 0));
        int n13 = -(ooo00oo0Ooo0[55] ^ ooo00oo0Ooo0[56]) ^ ooo00oo0Ooo0[57];
        aki2((String)0OOOoo00o0[n13 << ooo00oo0Ooo0[58] | n13 >>> ooo00oo0Ooo0[59]], (gi)this, (Boolean)((-ooo00oo0Ooo0[60] ^ ooo00oo0Ooo0[61]) != 0));
        this.qA = aki2;
        int n14 = ooo00oo0Ooo0[62];
        int n15 = ooo00oo0Ooo0[66];
        int n16 = (n15 >>> ooo00oo0Ooo0[67] | n15 << ooo00oo0Ooo0[68]) + ooo00oo0Ooo0[69];
        this.qB = new aki((String)0OOOoo00o0[(n14 >>> ooo00oo0Ooo0[63] | n14 << ooo00oo0Ooo0[64]) ^ ooo00oo0Ooo0[65]], (gi)this, (Boolean)((n16 >>> ooo00oo0Ooo0[70] | n16 << ooo00oo0Ooo0[71]) != 0));
        this.qC = new aki((String)0OOOoo00o0[-(ooo00oo0Ooo0[72] * ooo00oo0Ooo0[73] - ooo00oo0Ooo0[74]) ^ ooo00oo0Ooo0[75]], (gi)this, (Boolean)(((ooo00oo0Ooo0[76] * ooo00oo0Ooo0[77] ^ ooo00oo0Ooo0[78]) + ooo00oo0Ooo0[79] ^ ooo00oo0Ooo0[80]) != 0));
        this.qD = new aki((String)0OOOoo00o0[ooo00oo0Ooo0[81] * ooo00oo0Ooo0[82] * ooo00oo0Ooo0[83] ^ ooo00oo0Ooo0[84]], (gi)this, (Boolean)((ooo00oo0Ooo0[85] + ooo00oo0Ooo0[86] ^ ooo00oo0Ooo0[87]) != 0));
        int n17 = ooo00oo0Ooo0[91] * ooo00oo0Ooo0[92] * ooo00oo0Ooo0[93];
        this.qE = new aki((String)0OOOoo00o0[ooo00oo0Ooo0[88] + ooo00oo0Ooo0[89] - ooo00oo0Ooo0[90]], (gi)this, (Boolean)((n17 >>> ooo00oo0Ooo0[94] | n17 << ooo00oo0Ooo0[95]) + ooo00oo0Ooo0[96]));
        this.qF = new aki((String)0OOOoo00o0[(ooo00oo0Ooo0[97] ^ ooo00oo0Ooo0[98] ^ ooo00oo0Ooo0[99]) - ooo00oo0Ooo0[100]], (gi)this, (Boolean)((ooo00oo0Ooo0[101] ^ ooo00oo0Ooo0[102]) * ooo00oo0Ooo0[103] * ooo00oo0Ooo0[104]));
        int n18 = ooo00oo0Ooo0[105];
        this.qG = new aki((String)0OOOoo00o0[(n18 << ooo00oo0Ooo0[106] | n18 >>> ooo00oo0Ooo0[107]) * ooo00oo0Ooo0[108] ^ ooo00oo0Ooo0[109]], (gi)this, (Boolean)((-(ooo00oo0Ooo0[110] - ooo00oo0Ooo0[111]) ^ ooo00oo0Ooo0[112]) - ooo00oo0Ooo0[113]));
        this.qI = (ooo00oo0Ooo0[114] * ooo00oo0Ooo0[115] - ooo00oo0Ooo0[116]) * ooo00oo0Ooo0[117];
        this.qK = this::b;
    }
}

