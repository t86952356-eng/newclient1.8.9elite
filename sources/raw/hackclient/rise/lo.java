/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eh;
import hackclient.rise.ei;
import hackclient.rise.fd;
import hackclient.rise.fh;
import hackclient.rise.lw;
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
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class lo
extends akg<lw> {
    public /* synthetic */ boolean Eo;
    @dm
    public /* synthetic */ dk<fh> Gg;
    private static /* synthetic */ int[] ooo00oo0Ooo0;
    public /* synthetic */ boolean Ga;
    public static /* synthetic */ Object[] 0OOOoo00o0;
    @dm
    public /* synthetic */ dk<fd> Gh;
    public static /* synthetic */ String[] 0oOOoOo0O00O;
    public static /* synthetic */ Object[] Oo0o00000O00;
    public /* synthetic */ akq Gc;
    public static /* synthetic */ Object oO00O0OO0ooO;
    public /* synthetic */ aki Gb;
    @dm
    public /* synthetic */ dk<ei> Gf;
    @dm
    public /* synthetic */ dk<eh> Ge;
    public static /* synthetic */ String o0Oo000O0oO;
    public static /* synthetic */ String[] O0OoOO0OOOOO;
    public /* synthetic */ akq Gd;
    private static /* synthetic */ int o0o000o0O0o0;
    private static /* synthetic */ boolean oOo00Oo0OOo0;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) {
        block37: {
            block36: {
                block38: {
                    var34_2 = -4697413;
                    if (var34_2 != var34_2) {
                        var34_2 = -1053309415;
                    }
                    if ((var34_2 = -1802456030) != var34_2) {
                        throw null;
                    }
                    var34_2 = -1605918991;
                    if (var34_2 != var34_2) {
                        var34_2 = -1916876944;
                    }
                    if ((var34_2 = -59380306) != var34_2) {
                    }
                    var29_5 = new Object[27];
                    var30_6 = new long[27];
                    v0 = lo.Oo0o00000O00;
                    if (lo.Oo0o00000O00 == null) {
                        var22_3 = -1342344807;
                        v1 = new Object[lo.ooo00oo0Ooo0[186]];
                        lo.Oo0o00000O00 = v1;
                        v0 = v1;
                        var29_5[24] = new byte[lo.ooo00oo0Ooo0[188] ^ lo.ooo00oo0Ooo0[189]];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[190] ^ lo.ooo00oo0Ooo0[191]] = lo.ooo00oo0Ooo0[192] ^ lo.ooo00oo0Ooo0[193];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[194] ^ lo.ooo00oo0Ooo0[195]] = lo.ooo00oo0Ooo0[196] ^ lo.ooo00oo0Ooo0[197];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[198] ^ lo.ooo00oo0Ooo0[199]] = lo.ooo00oo0Ooo0[200] ^ lo.ooo00oo0Ooo0[201];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[202] ^ lo.ooo00oo0Ooo0[203]] = lo.ooo00oo0Ooo0[204] ^ lo.ooo00oo0Ooo0[205];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[206] ^ lo.ooo00oo0Ooo0[207]] = lo.ooo00oo0Ooo0[208] ^ lo.ooo00oo0Ooo0[209];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[210] ^ lo.ooo00oo0Ooo0[211]] = lo.ooo00oo0Ooo0[212] ^ lo.ooo00oo0Ooo0[213];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[214] ^ lo.ooo00oo0Ooo0[215]] = lo.ooo00oo0Ooo0[216] ^ lo.ooo00oo0Ooo0[217];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[218] ^ lo.ooo00oo0Ooo0[219]] = lo.ooo00oo0Ooo0[220] ^ lo.ooo00oo0Ooo0[221];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[222] ^ lo.ooo00oo0Ooo0[223]] = lo.ooo00oo0Ooo0[224] ^ lo.ooo00oo0Ooo0[225];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[226] ^ lo.ooo00oo0Ooo0[227]] = lo.ooo00oo0Ooo0[228] ^ lo.ooo00oo0Ooo0[229];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[230] ^ lo.ooo00oo0Ooo0[231]] = lo.ooo00oo0Ooo0[232] ^ lo.ooo00oo0Ooo0[233];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[234] ^ lo.ooo00oo0Ooo0[235]] = lo.ooo00oo0Ooo0[236] ^ lo.ooo00oo0Ooo0[237];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[238] ^ lo.ooo00oo0Ooo0[239]] = lo.ooo00oo0Ooo0[240] ^ lo.ooo00oo0Ooo0[241];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[242] ^ lo.ooo00oo0Ooo0[243]] = lo.ooo00oo0Ooo0[244] ^ lo.ooo00oo0Ooo0[245];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[246] ^ lo.ooo00oo0Ooo0[247]] = lo.ooo00oo0Ooo0[248] ^ lo.ooo00oo0Ooo0[249];
                        ((byte[])var29_5[24])[lo.ooo00oo0Ooo0[250] ^ lo.ooo00oo0Ooo0[251]] = lo.ooo00oo0Ooo0[252] ^ lo.ooo00oo0Ooo0[253];
                        v1[lo.ooo00oo0Ooo0[187]] = (byte[])var29_5[24];
                    }
                    var29_5[11] = (byte[])v0[lo.ooo00oo0Ooo0[254]];
                    if (lo.oO00O0OO0ooO != null) break block37;
                    var29_5[18] = new byte[lo.ooo00oo0Ooo0[255] ^ lo.ooo00oo0Ooo0[256]];
                    ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[257] ^ lo.ooo00oo0Ooo0[258]] = lo.ooo00oo0Ooo0[259] ^ lo.ooo00oo0Ooo0[260];
                    ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[261] ^ lo.ooo00oo0Ooo0[262]] = lo.ooo00oo0Ooo0[263] ^ lo.ooo00oo0Ooo0[264];
                    ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[265] ^ lo.ooo00oo0Ooo0[266]] = lo.ooo00oo0Ooo0[267] ^ lo.ooo00oo0Ooo0[268];
                    ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[269] ^ lo.ooo00oo0Ooo0[270]] = lo.ooo00oo0Ooo0[271] ^ lo.ooo00oo0Ooo0[272];
                    var23_4 = -1334987932;
                    break block38;
                    while (true) {
                        v2 = new String((char[])var29_5[6]);
                        while (true) {
                            break block36;
                            break;
                        }
                        break;
                    }
                    while (true) {
                        v3 = new String((char[])var29_5[6]);
lbl52:
                        // 2 sources

                        while (true) {
                            lo.oO00O0OO0ooO = new SecretKeySpec(v4, v3);
                            break block37;
                            break;
                        }
                        break;
                    }
lbl55:
                    // 1 sources

                    block23: while (true) {
                        var28_12 = 210436984;
                        if (true) ** GOTO lbl60
                        block24: while (true) {
                            var28_12 = 1986266444;
lbl60:
                            // 2 sources

                            switch (var28_12) {
                                default: {
                                    if ((int)var30_6[10] >= ((char[])var29_5[6]).length) continue block24;
                                    v5 = (char[])var29_5[6];
                                    v6 = (int)var30_6[10];
                                    v7 = -((char)((char)(~((char)((char)((char)((char)((char)(v5[v6] + 39500) - v6) - 22067) - 31505) - v6))) ^ v6));
                                    v8 = (char)((char)(v7 >>> 4 | v7 << 12) - 18295);
                                    v9 = (char)(v8 << 15 | v8 >>> 1);
                                    v5[v6] = (char)(v9 << 8 | v9 >>> 8);
                                    var30_6[10] = var31_8 = (long)((int)var30_6[10] + 1);
                                    continue block23;
                                }
                                case 2044233014: {
                                    continue block24;
                                }
                                case 1986266444: 
                            }
                            break;
                        }
                        v10 = new String((char[])var29_5[6]);
                        while (true) {
                            var29_5[26] = Cipher.getInstance(v10);
                            ((Cipher)var29_5[26]).init(2, (Key)((SecretKey)lo.oO00O0OO0ooO), new IvParameterSpec((byte[])var29_5[12]));
                            var29_5[19] = ((Cipher)var29_5[26]).doFinal((byte[])var29_5[14]);
                            lo.0oOOoOo0O00O[var0] = new String((byte[])var29_5[19], StandardCharsets.UTF_8);
                            return lo.0oOOoOo0O00O[var0];
                        }
                        break;
                    }
                }
                block26: while (true) {
                    switch (var23_4) {
                        case 1884452914: {
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[289] ^ lo.ooo00oo0Ooo0[290]] = lo.ooo00oo0Ooo0[291] ^ lo.ooo00oo0Ooo0[292];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[293] ^ lo.ooo00oo0Ooo0[294]] = lo.ooo00oo0Ooo0[295] ^ lo.ooo00oo0Ooo0[296];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[297] ^ lo.ooo00oo0Ooo0[298]] = lo.ooo00oo0Ooo0[299] ^ lo.ooo00oo0Ooo0[300];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[301] ^ lo.ooo00oo0Ooo0[302]] = lo.ooo00oo0Ooo0[303] ^ lo.ooo00oo0Ooo0[304];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[305] ^ lo.ooo00oo0Ooo0[306]] = lo.ooo00oo0Ooo0[307] ^ lo.ooo00oo0Ooo0[308];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[309] ^ lo.ooo00oo0Ooo0[310]] = lo.ooo00oo0Ooo0[311] ^ lo.ooo00oo0Ooo0[312];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[313] ^ lo.ooo00oo0Ooo0[314]] = lo.ooo00oo0Ooo0[315] ^ lo.ooo00oo0Ooo0[316];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[317] ^ lo.ooo00oo0Ooo0[318]] = lo.ooo00oo0Ooo0[319] ^ lo.ooo00oo0Ooo0[320];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[321] ^ lo.ooo00oo0Ooo0[322]] = lo.ooo00oo0Ooo0[323] ^ lo.ooo00oo0Ooo0[324];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[325] ^ lo.ooo00oo0Ooo0[326]] = lo.ooo00oo0Ooo0[327] ^ lo.ooo00oo0Ooo0[328];
                            var23_4 = -1544620987;
                            continue block26;
                        }
                        case -1544620987: {
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[329] ^ lo.ooo00oo0Ooo0[330]] = lo.ooo00oo0Ooo0[331] ^ lo.ooo00oo0Ooo0[332];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[333] ^ lo.ooo00oo0Ooo0[334]] = lo.ooo00oo0Ooo0[335] ^ lo.ooo00oo0Ooo0[336];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[337] ^ lo.ooo00oo0Ooo0[338]] = lo.ooo00oo0Ooo0[339] ^ lo.ooo00oo0Ooo0[340];
                            var23_4 = -1098406104;
                            continue block26;
                        }
                        case -1098406104: {
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[341] ^ lo.ooo00oo0Ooo0[342]] = lo.ooo00oo0Ooo0[343] ^ lo.ooo00oo0Ooo0[344];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[345] ^ lo.ooo00oo0Ooo0[346]] = lo.ooo00oo0Ooo0[347] ^ lo.ooo00oo0Ooo0[348];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[349] ^ lo.ooo00oo0Ooo0[350]] = lo.ooo00oo0Ooo0[351] ^ lo.ooo00oo0Ooo0[352];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[353] ^ lo.ooo00oo0Ooo0[354]] = lo.ooo00oo0Ooo0[355] ^ lo.ooo00oo0Ooo0[356];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[357] ^ lo.ooo00oo0Ooo0[358]] = lo.ooo00oo0Ooo0[359] ^ lo.ooo00oo0Ooo0[360];
                            var23_4 = -615892862;
                            continue block26;
                        }
                        case -615892862: {
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[361] ^ lo.ooo00oo0Ooo0[362]] = lo.ooo00oo0Ooo0[363] ^ lo.ooo00oo0Ooo0[364];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[365] ^ lo.ooo00oo0Ooo0[366]] = lo.ooo00oo0Ooo0[367] ^ lo.ooo00oo0Ooo0[368];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[369] ^ lo.ooo00oo0Ooo0[370]] = lo.ooo00oo0Ooo0[371] ^ lo.ooo00oo0Ooo0[372];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[373] ^ lo.ooo00oo0Ooo0[374]] = lo.ooo00oo0Ooo0[375] ^ lo.ooo00oo0Ooo0[376];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[377] ^ lo.ooo00oo0Ooo0[378]] = lo.ooo00oo0Ooo0[379] ^ lo.ooo00oo0Ooo0[380];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[381] ^ lo.ooo00oo0Ooo0[382]] = lo.ooo00oo0Ooo0[383] ^ lo.ooo00oo0Ooo0[384];
                            var29_5[20] = new byte[((byte[])var29_5[11]).length + ((byte[])var29_5[18]).length];
                            System.arraycopy((byte[])var29_5[11], lo.ooo00oo0Ooo0[385], (byte[])var29_5[20], lo.ooo00oo0Ooo0[386], ((byte[])var29_5[11]).length);
                            var24_7 = 566599207;
                            System.arraycopy((byte[])var29_5[18], lo.ooo00oo0Ooo0[387], (byte[])var29_5[20], ((byte[])var29_5[11]).length, ((byte[])var29_5[18]).length);
                            if ((v2 = lo.O0OoOO0OOOOO[lo.ooo00oo0Ooo0[388]]) != null) ** continue;
                            var29_5[6] = "\u0526\u0500\u0574\u0578\u0502\u0458\u0524\u052a\u05ce\u05c4\u0502\u053a\u052c\u052a\u050c\u0578\u0524\u0446".toCharArray();
                            var30_6[10] = var31_8 = (long)lo.ooo00oo0Ooo0[389];
                            while (true) {
                                if ((int)var30_6[10] >= ((char[])var29_5[6]).length) ** continue;
                                v11 = (char[])var29_5[6];
                                v12 = (int)var30_6[10];
                                v13 = -((char)(v11[v12] ^ lo.ooo00oo0Ooo0[390]));
                                v14 = (char)(v13 << lo.ooo00oo0Ooo0[391] | v13 >>> lo.ooo00oo0Ooo0[392]);
                                v11[v12] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(v14 >>> lo.ooo00oo0Ooo0[393] | v14 << lo.ooo00oo0Ooo0[394]) - lo.ooo00oo0Ooo0[395]) - v12))) - v12) ^ v12) ^ lo.ooo00oo0Ooo0[396]) ^ lo.ooo00oo0Ooo0[397]) ^ lo.ooo00oo0Ooo0[398]) ^ lo.ooo00oo0Ooo0[399]);
                                var30_6[10] = var31_8 = (long)((int)var30_6[10] + 1);
                            }
                        }
                        default: {
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[273] ^ lo.ooo00oo0Ooo0[274]] = lo.ooo00oo0Ooo0[275] ^ lo.ooo00oo0Ooo0[276];
                            ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[277] ^ lo.ooo00oo0Ooo0[278]] = lo.ooo00oo0Ooo0[279] ^ lo.ooo00oo0Ooo0[280];
                            var23_4 = 1910211458;
                            continue block26;
                        }
                        case 1910211458: 
                    }
                    ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[281] ^ lo.ooo00oo0Ooo0[282]] = lo.ooo00oo0Ooo0[283] ^ lo.ooo00oo0Ooo0[284];
                    ((byte[])var29_5[18])[lo.ooo00oo0Ooo0[285] ^ lo.ooo00oo0Ooo0[286]] = lo.ooo00oo0Ooo0[287] ^ lo.ooo00oo0Ooo0[288];
                    var23_4 = 1884452914;
                }
            }
            var29_5[8] = SecretKeyFactory.getInstance(v2);
            var29_5[25] = new byte[16];
            ((byte[])var29_5[25])[10] = -58;
            ((byte[])var29_5[25])[7] = -65;
            ((byte[])var29_5[25])[13] = 112;
            ((byte[])var29_5[25])[6] = 9;
            ((byte[])var29_5[25])[11] = 62;
            ((byte[])var29_5[25])[12] = 27;
            var25_9 = 703405841;
            block28: while (true) {
                switch (var25_9) {
                    default: {
                        ((byte[])var29_5[25])[3] = -119;
                        ((byte[])var29_5[25])[5] = -72;
                        ((byte[])var29_5[25])[0] = 21;
                        ((byte[])var29_5[25])[15] = 89;
                        var25_9 = 1974561983;
                        continue block28;
                    }
                    case 1974561983: 
                }
                break;
            }
            ((byte[])var29_5[25])[8] = 14;
            ((byte[])var29_5[25])[4] = -103;
            ((byte[])var29_5[25])[1] = 61;
            ((byte[])var29_5[25])[2] = 57;
            ((byte[])var29_5[25])[14] = 107;
            ((byte[])var29_5[25])[9] = 25;
            var7_10 = new PBEKeySpec(new String((byte[])var29_5[20], StandardCharsets.UTF_8).toCharArray(), (byte[])var29_5[25], 14, 256);
            var29_5[1] = ((SecretKeyFactory)var29_5[8]).generateSecret(var7_10).getEncoded();
            v4 = (byte[])var29_5[1];
            ** while ((v3 = lo.O0OoOO0OOOOO[2]) != null)
lbl174:
            // 1 sources

            var29_5[6] = "\u3b46\ufb45\u5b4c".toCharArray();
            var30_6[10] = var31_8 = (long)0;
            while (true) {
                if ((int)var30_6[10] >= ((char[])var29_5[6]).length) ** continue;
                v15 = (char[])var29_5[6];
                v16 = (int)var30_6[10];
                v17 = (char)((char)((char)((char)((char)((char)((char)((char)(-v15[v16]) ^ 64300) + 50903) + 40195) - 662) - v16) - 50238) - 63271);
                v15[v16] = (char)((char)((char)((char)((char)((char)((char)(v17 << 4 | v17 >>> 12) - v16) + v16) - 32528) - 11139) - 7822) ^ 36476);
                var30_6[10] = var31_8 = (long)((int)var30_6[10] + 1);
            }
        }
        var29_5[22] = Base64.getDecoder().decode(var1_1);
        var29_5[12] = Arrays.copyOfRange((byte[])var29_5[22], 0, 16);
        var29_5[14] = Arrays.copyOfRange((byte[])var29_5[22], 16, ((byte[])var29_5[22]).length);
        var27_11 = -1558665035;
        block30: while (true) {
            switch (var27_11) {
                default: {
                    if ((v10 = lo.O0OoOO0OOOOO[3]) != null) ** continue;
                    var27_11 = -1644764002;
                    continue block30;
                }
                case -1644764002: 
            }
            break;
        }
        var29_5[6] = "\uce73\u4e77\u0e7b\u8e78\u0e7f\uee80\u0e81\u8e84\uae7d\u0e7f\u0e7d\u0e84\u4e86\uae82\uce75\u2e76\u2e97\uce7b\u6e7f\u8e81".toCharArray();
        var30_6[10] = var31_8 = (long)0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void 0OOOoo00o0() {
        int n2 = 846175762;
        if (n2 != n2) {
            throw new ArrayStoreException();
        }
        int n3 = 921015997;
        block87: while (true) {
            switch (n3) {
                case -969591935: {
                    lo.ooo00oo0Ooo0[0xB1CD ^ 0xB184] = 0xB1ED ^ 0xB184;
                    lo.ooo00oo0Ooo0[0xB338 ^ 0xB259] = 0x42C3 ^ 0xB259;
                    lo.ooo00oo0Ooo0[0xBE4D ^ 0xBF68] = 0x500 ^ 0xBF68;
                    n3 = -498158482;
                    continue block87;
                }
                case -498158482: {
                    lo.ooo00oo0Ooo0[0x8E89 ^ 0x8E06] = 0xFFFF71A9 ^ 0x8E06;
                    lo.ooo00oo0Ooo0[0xEBC7 ^ 0xEAAC] = 0xFFFF76E3 ^ 0xEAAC;
                    lo.ooo00oo0Ooo0[0xCE0B ^ 0xCF43] = 0xC8B ^ 0xCF43;
                    n3 = -877229292;
                    continue block87;
                }
                case -877229292: {
                    lo.ooo00oo0Ooo0[0xF18A ^ 0xF00E] = 0xF00F ^ 0xF00E;
                    lo.ooo00oo0Ooo0[0x998B ^ 0x9970] = 0x38E9 ^ 0x9970;
                    lo.ooo00oo0Ooo0[0xABE2 ^ 0xAAAB] = 0x2DB5 ^ 0xAAAB;
                    lo.ooo00oo0Ooo0[0xB4B7 ^ 0xB478] = 0xF961 ^ 0xB478;
                    lo.ooo00oo0Ooo0[0x1E45 ^ 0x1EA1] = 0xC3BF ^ 0x1EA1;
                    lo.ooo00oo0Ooo0[0xE1EC ^ 0xE166] = 0xF0CA24D9 ^ 0xE166;
                    lo.ooo00oo0Ooo0[0x9556 ^ 0x9510] = 0x954D ^ 0x9510;
                    lo.ooo00oo0Ooo0[0x6AAD ^ 0x6A3F] = 0xD8F2959C ^ 0x6A3F;
                    lo.ooo00oo0Ooo0[0x7B7F ^ 0x7B12] = 0xFFFF84ED ^ 0x7B12;
                    lo.ooo00oo0Ooo0[0x3C0F ^ 0x3D62] = 0xF036 ^ 0x3D62;
                    lo.ooo00oo0Ooo0[0xB89C ^ 0xB9CB] = 0xFF7A ^ 0xB9CB;
                    lo.ooo00oo0Ooo0[0xDDEC ^ 0xDD73] = 0xDD64 ^ 0xDD73;
                    lo.ooo00oo0Ooo0[0x6457 ^ 0x654A] = 0x265D ^ 0x654A;
                    lo.ooo00oo0Ooo0[0x10F56 ^ 0x10F07] = 0x10F06 ^ 0x10F07;
                    lo.ooo00oo0Ooo0[0x10D79 ^ 0x10D8A] = 0x1371D ^ 0x10D8A;
                    n3 = -962575631;
                    continue block87;
                }
                case -962575631: {
                    lo.ooo00oo0Ooo0[0x17A7 ^ 0x17E8] = 0x17E8 ^ 0x17E8;
                    lo.ooo00oo0Ooo0[0xFE26 ^ 0xFE88] = 0xFE83 ^ 0xFE88;
                    lo.ooo00oo0Ooo0[0xD0C4 ^ 0xD0C1] = 0xD0A6 ^ 0xD0C1;
                    lo.ooo00oo0Ooo0[0xDA13 ^ 0xDA3B] = 0x70DA3B ^ 0xDA3B;
                    lo.ooo00oo0Ooo0[0xF907 ^ 0xF952] = 0xF95F ^ 0xF952;
                    n3 = 1013165108;
                    continue block87;
                }
                case 1013165108: {
                    lo.ooo00oo0Ooo0[0xAC5C ^ 0xACEC] = 0xFFFF5369 ^ 0xACEC;
                    n3 = -1059704349;
                    continue block87;
                }
                case -1059704349: {
                    lo.ooo00oo0Ooo0[0x4ECA ^ 0x4E2F] = 0x9340 ^ 0x4E2F;
                    lo.ooo00oo0Ooo0[0x2952 ^ 0x29F8] = 0xFFFFD607 ^ 0x29F8;
                    n3 = -881592832;
                    continue block87;
                }
                case -881592832: {
                    lo.ooo00oo0Ooo0[0xA50C ^ 0xA44F] = 0x4F1 ^ 0xA44F;
                    lo.ooo00oo0Ooo0[0xD149 ^ 0xD030] = 0x1137 ^ 0xD030;
                    lo.ooo00oo0Ooo0[0xCA46 ^ 0xCA1C] = 0xCA19 ^ 0xCA1C;
                    lo.ooo00oo0Ooo0[0xAA11 ^ 0xAB37] = 0x1156 ^ 0xAB37;
                    lo.ooo00oo0Ooo0[0x7F48 ^ 0x7FC9] = 0x7FCC ^ 0x7FC9;
                    n3 = 1930755865;
                    continue block87;
                }
                case 1930755865: {
                    lo.ooo00oo0Ooo0[0x27D0 ^ 0x275C] = 0xFFFFD897 ^ 0x275C;
                    lo.ooo00oo0Ooo0[0xA329 ^ 0xA358] = 0xFFFF5CFB ^ 0xA358;
                    lo.ooo00oo0Ooo0[0xC04C ^ 0xC01C] = 0xFFFF3FE3 ^ 0xC01C;
                    lo.ooo00oo0Ooo0[0x3164 ^ 0x313F] = 0x310C ^ 0x313F;
                    lo.ooo00oo0Ooo0[0x99ED ^ 0x990E] = 0x4461 ^ 0x990E;
                    lo.ooo00oo0Ooo0[0x1555 ^ 0x150C] = 0xFFFFEAAB ^ 0x150C;
                    lo.ooo00oo0Ooo0[0xBC36 ^ 0xBCCA] = 0xFFFFE2F4 ^ 0xBCCA;
                    lo.ooo00oo0Ooo0[0x4FFD ^ 0x4F3C] = 0x14922 ^ 0x4F3C;
                    lo.ooo00oo0Ooo0[0xDA5B ^ 0xDABB] = 0xEB6F ^ 0xDABB;
                    lo.ooo00oo0Ooo0[0x4670 ^ 0x4604] = 0xB0AD5403 ^ 0x4604;
                    n3 = -571634617;
                    continue block87;
                }
                case -571634617: {
                    lo.ooo00oo0Ooo0[0xD010 ^ 0xD057] = 0xFFFF2F31 ^ 0xD057;
                    n3 = -532814740;
                    continue block87;
                }
                case -532814740: {
                    lo.ooo00oo0Ooo0[0xF5F7 ^ 0xF561] = 0xF56A ^ 0xF561;
                    lo.ooo00oo0Ooo0[0x2022 ^ 0x214E] = 0x42CB ^ 0x214E;
                    lo.ooo00oo0Ooo0[0x6A3E ^ 0x6B3A] = 0xEAD ^ 0x6B3A;
                    lo.ooo00oo0Ooo0[0x952F ^ 0x9518] = 0x9501 ^ 0x9518;
                    n3 = -1763902640;
                    continue block87;
                }
                case -1763902640: {
                    lo.ooo00oo0Ooo0[0x34F0 ^ 0x3573] = 0x3573 ^ 0x3573;
                    lo.ooo00oo0Ooo0[0x545F ^ 0x54C3] = 0x54D2 ^ 0x54C3;
                    lo.ooo00oo0Ooo0[0x10DC7 ^ 0x10D31] = 0x3A5 ^ 0x10D31;
                    lo.ooo00oo0Ooo0[0x934C ^ 0x9355] = 0x9346 ^ 0x9355;
                    lo.ooo00oo0Ooo0[0xA21A ^ 0xA37F] = 0x3C37 ^ 0xA37F;
                    lo.ooo00oo0Ooo0[0x7E02 ^ 0x7EAA] = 0x7EB7 ^ 0x7EAA;
                    n3 = -737847579;
                    continue block87;
                }
                case -737847579: {
                    lo.ooo00oo0Ooo0[0x2CA8 ^ 0x2C70] = 0xFFFF637E ^ 0x2C70;
                    lo.ooo00oo0Ooo0[0x255E ^ 0x247A] = 0xD16A ^ 0x247A;
                    lo.ooo00oo0Ooo0[0x7CE1 ^ 0x7C19] = 0x17298 ^ 0x7C19;
                    lo.ooo00oo0Ooo0[0x30AC ^ 0x301B] = 0x3005 ^ 0x301B;
                    n3 = 124533509;
                    continue block87;
                }
                case 124533509: {
                    lo.ooo00oo0Ooo0[0xD5ED ^ 0xD5B5] = 0xD5B5 ^ 0xD5B5;
                    lo.ooo00oo0Ooo0[0x174A ^ 0x1742] = 0x1731 ^ 0x1742;
                    lo.ooo00oo0Ooo0[0x1091F ^ 0x10814] = 0x1DD98 ^ 0x10814;
                    n3 = -783756731;
                    continue block87;
                }
                case -783756731: {
                    lo.ooo00oo0Ooo0[0xCA50 ^ 0xCAED] = 0x789D ^ 0xCAED;
                    n3 = 1637583064;
                    continue block87;
                }
                case 1637583064: {
                    lo.ooo00oo0Ooo0[0xF9EB ^ 0xF948] = 0xF95B ^ 0xF948;
                    lo.ooo00oo0Ooo0[0x6569 ^ 0x6440] = 0xABD6 ^ 0x6440;
                    lo.ooo00oo0Ooo0[0x5BC2 ^ 0x5BFD] = 0x5BEC ^ 0x5BFD;
                    lo.ooo00oo0Ooo0[0xB142 ^ 0xB0CA] = 0xB0C6 ^ 0xB0CA;
                    n3 = 1211890421;
                    continue block87;
                }
                case 1211890421: {
                    lo.ooo00oo0Ooo0[0xDA7F ^ 0xDA3E] = 0xDA3E ^ 0xDA3E;
                    lo.ooo00oo0Ooo0[0x5A36 ^ 0x5B64] = 0x5667 ^ 0x5B64;
                    lo.ooo00oo0Ooo0[0x5313 ^ 0x536C] = 0x5379 ^ 0x536C;
                    lo.ooo00oo0Ooo0[0xDECB ^ 0xDFD0] = 0x1DB55 ^ 0xDFD0;
                    lo.ooo00oo0Ooo0[0x42A6 ^ 0x43F7] = 0x4EED ^ 0x43F7;
                    n3 = -417237581;
                    continue block87;
                }
                case -417237581: {
                    lo.ooo00oo0Ooo0[0x37E8 ^ 0x36A3] = 0xB1DB ^ 0x36A3;
                    lo.ooo00oo0Ooo0[0xC684 ^ 0xC7AA] = 0x1653 ^ 0xC7AA;
                    lo.ooo00oo0Ooo0[0x9044 ^ 0x9017] = 0x7E2A ^ 0x9017;
                    lo.ooo00oo0Ooo0[0x7175 ^ 0x7066] = 0x17ACB ^ 0x7066;
                    lo.ooo00oo0Ooo0[0x10398 ^ 0x10345] = 0x1E691 ^ 0x10345;
                    lo.ooo00oo0Ooo0[0xE30C ^ 0xE34E] = 0xE353 ^ 0xE34E;
                    lo.ooo00oo0Ooo0[0x2BA ^ 0x3BB] = 0x6624 ^ 0x3BB;
                    lo.ooo00oo0Ooo0[0x102D6 ^ 0x103AD] = 0x1C287 ^ 0x103AD;
                    n3 = -436581010;
                    continue block87;
                }
                case -436581010: {
                    lo.ooo00oo0Ooo0[0x299C ^ 0x291C] = 0x2907 ^ 0x291C;
                    lo.ooo00oo0Ooo0[0x1F78 ^ 0x1F44] = 0xD26556EF ^ 0x1F44;
                    lo.ooo00oo0Ooo0[0x7951 ^ 0x78DA] = 0x51B1 ^ 0x78DA;
                    n3 = -1525475634;
                    continue block87;
                }
                case -1525475634: {
                    lo.ooo00oo0Ooo0[0x9EE9 ^ 0x9FD3] = 0x19941 ^ 0x9FD3;
                    n3 = -1611156189;
                    continue block87;
                }
                case -1611156189: {
                    lo.ooo00oo0Ooo0[0x8266 ^ 0x82BA] = 0x676E ^ 0x82BA;
                    lo.ooo00oo0Ooo0[0x9722 ^ 0x963D] = 0xD52F ^ 0x963D;
                    lo.ooo00oo0Ooo0[0x4F94 ^ 0x4F1A] = 0x4E4B ^ 0x4F1A;
                    lo.ooo00oo0Ooo0[0x6F08 ^ 0x6FF8] = 0xFFFF8884 ^ 0x6FF8;
                    n3 = -1665506281;
                    continue block87;
                }
                case -1665506281: {
                    lo.ooo00oo0Ooo0[0xBE49 ^ 0xBE32] = 0xBE61 ^ 0xBE32;
                    lo.ooo00oo0Ooo0[0xDCCB ^ 0xDCAC] = 0xDCB7 ^ 0xDCAC;
                    lo.ooo00oo0Ooo0[0x10631 ^ 0x107B4] = 0x107B4 ^ 0x107B4;
                    n3 = 2132444814;
                    continue block87;
                }
                case 2132444814: {
                    lo.ooo00oo0Ooo0[0x375D ^ 0x37B1] = 0xFFFF44DD ^ 0x37B1;
                    n3 = 500913450;
                    continue block87;
                }
                case 500913450: {
                    lo.ooo00oo0Ooo0[0x2D4B ^ 0x2C01] = 0xAB11 ^ 0x2C01;
                    lo.ooo00oo0Ooo0[0xC49 ^ 0xCEE] = 0x7FC ^ 0xCEE;
                    lo.ooo00oo0Ooo0[0x3C8E ^ 0x3C69] = 0xAAA7 ^ 0x3C69;
                    lo.ooo00oo0Ooo0[0x3932 ^ 0x3988] = 0x3989 ^ 0x3988;
                    lo.ooo00oo0Ooo0[0xB7F ^ 0xA5E] = 0xFF4D ^ 0xA5E;
                    lo.ooo00oo0Ooo0[0x7C94 ^ 0x7CDF] = 0xFFFF830E ^ 0x7CDF;
                    lo.ooo00oo0Ooo0[0xFD64 ^ 0xFDC0] = 0xFDCD ^ 0xFDC0;
                    lo.ooo00oo0Ooo0[0x5D49 ^ 0x5DC4] = 0xE327F4B3 ^ 0x5DC4;
                    lo.ooo00oo0Ooo0[0x11C ^ 0x10D] = 0xFFFFFEF2 ^ 0x10D;
                    lo.ooo00oo0Ooo0[0x6054 ^ 0x617C] = 0xDB1D ^ 0x617C;
                    lo.ooo00oo0Ooo0[0x397F ^ 0x382F] = 0xB181 ^ 0x382F;
                    lo.ooo00oo0Ooo0[0x4A27 ^ 0x4A3F] = 0x1005A3E ^ 0x4A3F;
                    lo.ooo00oo0Ooo0[0x3356 ^ 0x331B] = 0x331B ^ 0x331B;
                    lo.ooo00oo0Ooo0[0x93F4 ^ 0x937F] = 0x931A ^ 0x937F;
                    lo.ooo00oo0Ooo0[0x10BAD ^ 0x10B72] = 0x13AFC ^ 0x10B72;
                    n3 = -1497315872;
                    continue block87;
                }
                case -1497315872: {
                    lo.ooo00oo0Ooo0[0xC28B ^ 0xC21E] = 0xC20B ^ 0xC21E;
                    lo.ooo00oo0Ooo0[0x54E1 ^ 0x5592] = 0x7BF3 ^ 0x5592;
                    lo.ooo00oo0Ooo0[0x4EC ^ 0x426] = 0x10A69 ^ 0x426;
                    lo.ooo00oo0Ooo0[0xB996 ^ 0xB915] = 0xFFFF4CE8 ^ 0xB915;
                    lo.ooo00oo0Ooo0[0x840B ^ 0x8573] = 0x82D ^ 0x8573;
                    n3 = -1740861698;
                    continue block87;
                }
                case -1740861698: {
                    lo.ooo00oo0Ooo0[0xFE66 ^ 0xFECF] = 0x303FDCC ^ 0xFECF;
                    lo.ooo00oo0Ooo0[0x95A0 ^ 0x94C3] = 0x6479 ^ 0x94C3;
                    lo.ooo00oo0Ooo0[0x87CA ^ 0x8767] = 0x8768 ^ 0x8767;
                    lo.ooo00oo0Ooo0[0x70F6 ^ 0x70A9] = 0xFFFF8F0A ^ 0x70A9;
                    lo.ooo00oo0Ooo0[0xAC50 ^ 0xAC82] = 0xF3C2 ^ 0xAC82;
                    lo.ooo00oo0Ooo0[0x61FB ^ 0x613B] = 0x16762 ^ 0x613B;
                    lo.ooo00oo0Ooo0[0x1551 ^ 0x15A0] = 0xD58 ^ 0x15A0;
                    lo.ooo00oo0Ooo0[0xFD2 ^ 0xF1A] = 0xFFFFDC20 ^ 0xF1A;
                    lo.ooo00oo0Ooo0[0x8417 ^ 0x8453] = 0x8456 ^ 0x8453;
                    lo.ooo00oo0Ooo0[0x43E6 ^ 0x4363] = 0x78190BD2 ^ 0x4363;
                    lo.ooo00oo0Ooo0[0xA5D ^ 0xA93] = 0x478A ^ 0xA93;
                    lo.ooo00oo0Ooo0[0xC55B ^ 0xC531] = 0x1C508 ^ 0xC531;
                    lo.ooo00oo0Ooo0[0x7613 ^ 0x779A] = 0x779F ^ 0x779A;
                    lo.ooo00oo0Ooo0[0x31C3 ^ 0x31A8] = 0xFFFFCE51 ^ 0x31A8;
                    n3 = 1320399525;
                    continue block87;
                }
                case 1320399525: {
                    lo.ooo00oo0Ooo0[0x5D54 ^ 0x5DEC] = 0x5DF3 ^ 0x5DEC;
                    n3 = 1711669491;
                    continue block87;
                }
                case 1711669491: {
                    lo.ooo00oo0Ooo0[0x9139 ^ 0x9027] = 0xD32F ^ 0x9027;
                    n3 = 158032826;
                    continue block87;
                }
                case 158032826: {
                    lo.ooo00oo0Ooo0[0xAF79 ^ 0xAF01] = 0xAF10 ^ 0xAF01;
                    lo.ooo00oo0Ooo0[0x25DB ^ 0x2577] = 0x2566 ^ 0x2577;
                    lo.ooo00oo0Ooo0[0x528D ^ 0x5226] = 0x12BB0313 ^ 0x5226;
                    lo.ooo00oo0Ooo0[0xDF99 ^ 0xDEA7] = 0x9D01 ^ 0xDEA7;
                    lo.ooo00oo0Ooo0[0xF721 ^ 0xF7F7] = 0x4743 ^ 0xF7F7;
                    n3 = -931131651;
                    continue block87;
                }
                case -931131651: {
                    lo.ooo00oo0Ooo0[0x64D3 ^ 0x65A3] = 0xA8F1 ^ 0x65A3;
                    lo.ooo00oo0Ooo0[0xC081 ^ 0xC081] = 0x2F938284 ^ 0xC081;
                    lo.ooo00oo0Ooo0[0x4B9 ^ 0x49A] = 0x493 ^ 0x49A;
                    lo.ooo00oo0Ooo0[0xA60E ^ 0xA6F4] = 0x765 ^ 0xA6F4;
                    lo.ooo00oo0Ooo0[0x173A ^ 0x1758] = 0xC1F06B47 ^ 0x1758;
                    n3 = -1429623904;
                    continue block87;
                }
                case -1429623904: {
                    lo.ooo00oo0Ooo0[0x10DF4 ^ 0x10C80] = 0x122C7 ^ 0x10C80;
                    lo.ooo00oo0Ooo0[0xD750 ^ 0xD6D0] = 0x61F8 ^ 0xD6D0;
                    n3 = 1903963524;
                    continue block87;
                }
                case 1903963524: {
                    lo.ooo00oo0Ooo0[0x108D1 ^ 0x108F6] = 0x108A3 ^ 0x108F6;
                    lo.ooo00oo0Ooo0[0xC4A7 ^ 0xC452] = 0xFEC5 ^ 0xC452;
                    lo.ooo00oo0Ooo0[0x4DEC ^ 0x4CDF] = 0xFFFFBD67 ^ 0x4CDF;
                    lo.ooo00oo0Ooo0[0x9D57 ^ 0x9D43] = 0x9D5C ^ 0x9D43;
                    n3 = -675694250;
                    continue block87;
                }
                case -675694250: {
                    lo.ooo00oo0Ooo0[0xF850 ^ 0xF8C8] = 0xFFFF075F ^ 0xF8C8;
                    lo.ooo00oo0Ooo0[0x9D2 ^ 0x9D6] = 0x9C5 ^ 0x9D6;
                    n3 = -1933173730;
                    continue block87;
                }
                case -1933173730: {
                    lo.ooo00oo0Ooo0[0x4950 ^ 0x483E] = 0x856C ^ 0x483E;
                    n3 = -1074694080;
                    continue block87;
                }
                case -1074694080: {
                    lo.ooo00oo0Ooo0[0x349F ^ 0x34FE] = 0x34FF ^ 0x34FE;
                    lo.ooo00oo0Ooo0[0xAE8F ^ 0xAE43] = 0x1A014 ^ 0xAE43;
                    lo.ooo00oo0Ooo0[0x8978 ^ 0x88FA] = 0x88FA ^ 0x88FA;
                    n3 = -605674042;
                    continue block87;
                }
                case -605674042: {
                    lo.ooo00oo0Ooo0[0xA66B ^ 0xA7ED] = 0x76AA ^ 0xA7ED;
                    lo.ooo00oo0Ooo0[0x2D22 ^ 0x2D61] = 0x2D62 ^ 0x2D61;
                    lo.ooo00oo0Ooo0[0xF7 ^ 0x8E] = 0x2BDE ^ 0x8E;
                    lo.ooo00oo0Ooo0[0xB076 ^ 0xB144] = 0xBF5D ^ 0xB144;
                    lo.ooo00oo0Ooo0[0xEF23 ^ 0xEF92] = 0xFFFF106D ^ 0xEF92;
                    lo.ooo00oo0Ooo0[0x8CD7 ^ 0x8DD2] = 0x188D2 ^ 0x8DD2;
                    lo.ooo00oo0Ooo0[0x3453 ^ 0x342D] = 0x3426 ^ 0x342D;
                    lo.ooo00oo0Ooo0[0x7B16 ^ 0x7BF8] = 0x6304 ^ 0x7BF8;
                    lo.ooo00oo0Ooo0[0xEE49 ^ 0xEE99] = 0xFFFF5C07 ^ 0xEE99;
                    lo.ooo00oo0Ooo0[0xD266 ^ 0xD33B] = 0x8B07 ^ 0xD33B;
                    lo.ooo00oo0Ooo0[0x95BA ^ 0x95D6] = 0xFFFF6A69 ^ 0x95D6;
                    lo.ooo00oo0Ooo0[0x1180 ^ 0x10C4] = 0xB06E ^ 0x10C4;
                    lo.ooo00oo0Ooo0[0xF7C6 ^ 0xF6B3] = 0x7BF1 ^ 0xF6B3;
                    lo.ooo00oo0Ooo0[0xB344 ^ 0xB32A] = 0xB33F ^ 0xB32A;
                    n3 = 1954495313;
                    continue block87;
                }
                case 1954495313: {
                    lo.ooo00oo0Ooo0[0x25CC ^ 0x2598] = 0x259B ^ 0x2598;
                    lo.ooo00oo0Ooo0[0xACB7 ^ 0xAC09] = 0x1AA1C ^ 0xAC09;
                    n3 = 929470101;
                    continue block87;
                }
                case 929470101: {
                    lo.ooo00oo0Ooo0[0xD292 ^ 0xD201] = 0xFFFF2DA2 ^ 0xD201;
                    lo.ooo00oo0Ooo0[0x35F9 ^ 0x35D5] = 0x200359A ^ 0x35D5;
                    lo.ooo00oo0Ooo0[0xCD94 ^ 0xCCE2] = 0x41BC ^ 0xCCE2;
                    lo.ooo00oo0Ooo0[0x106AC ^ 0x107CB] = 0x198AD ^ 0x107CB;
                    lo.ooo00oo0Ooo0[0x7281 ^ 0x7234] = 0x7221 ^ 0x7234;
                    lo.ooo00oo0Ooo0[0xD186 ^ 0xD09F] = 0x1D436 ^ 0xD09F;
                    lo.ooo00oo0Ooo0[0x44B ^ 0x4A1] = 0x8856 ^ 0x4A1;
                    n3 = 1880758572;
                    continue block87;
                }
                case 1880758572: {
                    lo.ooo00oo0Ooo0[0x7D35 ^ 0x7CBB] = 0xB9D3 ^ 0x7CBB;
                    lo.ooo00oo0Ooo0[0xFCED ^ 0xFCF1] = 0xFCF6 ^ 0xFCF1;
                    lo.ooo00oo0Ooo0[0x9292 ^ 0x93F0] = 0x6367 ^ 0x93F0;
                    lo.ooo00oo0Ooo0[0xCD2A ^ 0xCDED] = 0xE177 ^ 0xCDED;
                    lo.ooo00oo0Ooo0[0x9F32 ^ 0x9FA8] = 0x109FC3 ^ 0x9FA8;
                    lo.ooo00oo0Ooo0[0x6478 ^ 0x647A] = 0xFFFF9BD9 ^ 0x647A;
                    lo.ooo00oo0Ooo0[0xF068 ^ 0xF048] = 0xFFFF0FB7 ^ 0xF048;
                    n3 = 1497550121;
                    continue block87;
                }
                case 1497550121: {
                    lo.ooo00oo0Ooo0[0x7709 ^ 0x7779] = 0x2C0C779 ^ 0x7779;
                    n3 = 299927183;
                    continue block87;
                }
                case 299927183: {
                    lo.ooo00oo0Ooo0[0x71CC ^ 0x70DB] = 0x121A ^ 0x70DB;
                    lo.ooo00oo0Ooo0[0x82C7 ^ 0x8381] = 0x4049 ^ 0x8381;
                    lo.ooo00oo0Ooo0[0x1D5D ^ 0x1DA9] = 0xFFFFD8A3 ^ 0x1DA9;
                    lo.ooo00oo0Ooo0[0x8470 ^ 0x8510] = 0xDD2B ^ 0x8510;
                    lo.ooo00oo0Ooo0[0x77F5 ^ 0x76C1] = 0x78D8 ^ 0x76C1;
                    lo.ooo00oo0Ooo0[0x77BF ^ 0x76FD] = 0xD657 ^ 0x76FD;
                    lo.ooo00oo0Ooo0[0x54AE ^ 0x55EE] = 0x1648 ^ 0x55EE;
                    lo.ooo00oo0Ooo0[0x40B2 ^ 0x400D] = 0x14613 ^ 0x400D;
                    lo.ooo00oo0Ooo0[0xD469 ^ 0xD573] = 0x1D1DA ^ 0xD573;
                    lo.ooo00oo0Ooo0[0x82B7 ^ 0x8226] = 0x823B ^ 0x8226;
                    lo.ooo00oo0Ooo0[0xFF75 ^ 0xFE3B] = 0x7795 ^ 0xFE3B;
                    lo.ooo00oo0Ooo0[0xA158 ^ 0xA16D] = 0xFFFF5112 ^ 0xA16D;
                    n3 = -1353713618;
                    continue block87;
                }
                case -1353713618: {
                    lo.ooo00oo0Ooo0[0xB97A ^ 0xB9AE] = 0xE6A4 ^ 0xB9AE;
                    lo.ooo00oo0Ooo0[0xA4E8 ^ 0xA4BA] = 0xA4B5 ^ 0xA4BA;
                    lo.ooo00oo0Ooo0[0x56DD ^ 0x57CF] = 0x15D00 ^ 0x57CF;
                    lo.ooo00oo0Ooo0[0x1A64 ^ 0x1AC4] = 0x1ACD ^ 0x1AC4;
                    lo.ooo00oo0Ooo0[0xAC6A ^ 0xAC54] = 0xAC5B ^ 0xAC54;
                    lo.ooo00oo0Ooo0[0x260 ^ 0x34B] = 0xCCDA ^ 0x34B;
                    n3 = -850702943;
                    continue block87;
                }
                case -850702943: {
                    lo.ooo00oo0Ooo0[0xE15A ^ 0xE002] = 0xA6DB ^ 0xE002;
                    lo.ooo00oo0Ooo0[0x8622 ^ 0x866C] = 0x866C ^ 0x866C;
                    lo.ooo00oo0Ooo0[0x90AF ^ 0x9046] = 0x688 ^ 0x9046;
                    n3 = 356923338;
                    continue block87;
                }
                case 356923338: {
                    lo.ooo00oo0Ooo0[0x2D7B ^ 0x2C5B] = 0x6F53 ^ 0x2C5B;
                    n3 = 980897356;
                    continue block87;
                }
                case 980897356: {
                    lo.ooo00oo0Ooo0[0x8820 ^ 0x88A8] = 0x88FB ^ 0x88A8;
                    lo.ooo00oo0Ooo0[0x10FD6 ^ 0x10E59] = 0x158FD ^ 0x10E59;
                    lo.ooo00oo0Ooo0[0x33F8 ^ 0x3329] = 0x7E30 ^ 0x3329;
                    lo.ooo00oo0Ooo0[0x49C9 ^ 0x4954] = 0x495B ^ 0x4954;
                    lo.ooo00oo0Ooo0[0xE081 ^ 0xE069] = 0xFFFF897F ^ 0xE069;
                    lo.ooo00oo0Ooo0[0x1C86 ^ 0x1DEE] = 0x82B5 ^ 0x1DEE;
                    n3 = -1069503540;
                    continue block87;
                }
                case -1069503540: {
                    lo.ooo00oo0Ooo0[0xD6D4 ^ 0xD6C7] = 0xFFFF2938 ^ 0xD6C7;
                    lo.ooo00oo0Ooo0[0x3440 ^ 0x350C] = 0xB21C ^ 0x350C;
                    lo.ooo00oo0Ooo0[0xE3F1 ^ 0xE2B0] = 0x420D ^ 0xE2B0;
                    lo.ooo00oo0Ooo0[0x94F3 ^ 0x9426] = 0xCB6F ^ 0x9426;
                    lo.ooo00oo0Ooo0[0xADDD ^ 0xADAE] = 0xADB7 ^ 0xADAE;
                    lo.ooo00oo0Ooo0[0x10270 ^ 0x10325] = 0x145E8 ^ 0x10325;
                    lo.ooo00oo0Ooo0[0x10A57 ^ 0x10AE3] = 0x10A82 ^ 0x10AE3;
                    lo.ooo00oo0Ooo0[0x1EEE ^ 0x1EA4] = 0xFFFFE115 ^ 0x1EA4;
                    lo.ooo00oo0Ooo0[0x1903 ^ 0x192C] = 0x192B ^ 0x192C;
                    n3 = 2051928773;
                    continue block87;
                }
                case 2051928773: {
                    lo.ooo00oo0Ooo0[0x8E61 ^ 0x8EC4] = 0xFFFF7151 ^ 0x8EC4;
                    lo.ooo00oo0Ooo0[0x1176 ^ 0x111F] = 0x115C ^ 0x111F;
                    lo.ooo00oo0Ooo0[0x84AE ^ 0x85BA] = 0x18F75 ^ 0x85BA;
                    lo.ooo00oo0Ooo0[0xB3DF ^ 0xB2B5] = 0xD130 ^ 0xB2B5;
                    n3 = -1247901813;
                    continue block87;
                }
                case -1247901813: {
                    lo.ooo00oo0Ooo0[0x8349 ^ 0x8344] = 0x83C0 ^ 0x8344;
                    lo.ooo00oo0Ooo0[0xEC53 ^ 0xECD4] = 0xFFFF132B ^ 0xECD4;
                    n3 = -1884917054;
                    continue block87;
                }
                case -1884917054: {
                    lo.ooo00oo0Ooo0[0x8D1C ^ 0x8DA7] = 0x8DA7 ^ 0x8DA7;
                    lo.ooo00oo0Ooo0[0x16DE ^ 0x1667] = 0x167A ^ 0x1667;
                    lo.ooo00oo0Ooo0[0x68B ^ 0x612] = 0x61B ^ 0x612;
                    n3 = 152549425;
                    continue block87;
                }
                case 152549425: {
                    lo.ooo00oo0Ooo0[0xD28D ^ 0xD240] = 0x1DC02 ^ 0xD240;
                    lo.ooo00oo0Ooo0[0x4FE ^ 0x4F0] = 0x4EF ^ 0x4F0;
                    lo.ooo00oo0Ooo0[0x54B5 ^ 0x55A0] = 0x370E ^ 0x55A0;
                    n3 = -1620845505;
                    continue block87;
                }
                case -1620845505: {
                    lo.ooo00oo0Ooo0[0x33CC ^ 0x332D] = 0x2A3 ^ 0x332D;
                    lo.ooo00oo0Ooo0[0xA43B ^ 0xA533] = 0x1A028 ^ 0xA533;
                    lo.ooo00oo0Ooo0[0xEF4C ^ 0xEE01] = 0x67AB ^ 0xEE01;
                    lo.ooo00oo0Ooo0[0x6A14 ^ 0x6B9E] = 0x6B95 ^ 0x6B9E;
                    lo.ooo00oo0Ooo0[0x71D2 ^ 0x71E6] = 0xFFFF8E19 ^ 0x71E6;
                    lo.ooo00oo0Ooo0[0x16F7 ^ 0x1641] = 0x164A ^ 0x1641;
                    lo.ooo00oo0Ooo0[0x67A7 ^ 0x67C3] = 0x45D1139E ^ 0x67C3;
                    lo.ooo00oo0Ooo0[0x391F ^ 0x39CC] = 0x6685 ^ 0x39CC;
                    lo.ooo00oo0Ooo0[0x32A9 ^ 0x33DE] = 0xBEA6 ^ 0x33DE;
                    n3 = 683127320;
                    continue block87;
                }
                case 683127320: {
                    lo.ooo00oo0Ooo0[0x9639 ^ 0x96DB] = 0x4BBB ^ 0x96DB;
                    lo.ooo00oo0Ooo0[0x89E3 ^ 0x8983] = 0x899C ^ 0x8983;
                    lo.ooo00oo0Ooo0[0xA0F3 ^ 0xA0EE] = 0xA0F7 ^ 0xA0EE;
                    lo.ooo00oo0Ooo0[0x18DA ^ 0x19CA] = 0x8622 ^ 0x19CA;
                    lo.ooo00oo0Ooo0[0xF791 ^ 0xF70A] = 0xFFFF089F ^ 0xF70A;
                    lo.ooo00oo0Ooo0[0x1E2B ^ 0x1E0F] = 0x1E1A ^ 0x1E0F;
                    n3 = -1081909041;
                    continue block87;
                }
                case -1081909041: {
                    lo.ooo00oo0Ooo0[0x8356 ^ 0x820D] = 0xFFFF601C ^ 0x820D;
                    lo.ooo00oo0Ooo0[0x4EB5 ^ 0x4E4A] = 0x1DC2 ^ 0x4E4A;
                    lo.ooo00oo0Ooo0[0x4074 ^ 0x404D] = 0xFFFFBFAC ^ 0x404D;
                    lo.ooo00oo0Ooo0[0x2B28 ^ 0x2A21] = 0xFF9D ^ 0x2A21;
                    lo.ooo00oo0Ooo0[0xAC0 ^ 0xAFB] = 0xAFA ^ 0xAFB;
                    n3 = -1881464434;
                    continue block87;
                }
                case -1881464434: {
                    lo.ooo00oo0Ooo0[0x57FA ^ 0x5721] = 0xB2F5 ^ 0x5721;
                    lo.ooo00oo0Ooo0[0xEC0F ^ 0xED82] = 0xFFFF127D ^ 0xED82;
                    n3 = -380057346;
                    continue block87;
                }
                case -380057346: {
                    lo.ooo00oo0Ooo0[0x1E6A ^ 0x1F25] = 0xFFFF693F ^ 0x1F25;
                    n3 = 11897943;
                    continue block87;
                }
                case 11897943: {
                    lo.ooo00oo0Ooo0[0x775C ^ 0x7734] = 0x7717 ^ 0x7734;
                    n3 = 290244388;
                    continue block87;
                }
                case 290244388: {
                    lo.ooo00oo0Ooo0[0xB5F8 ^ 0xB4F5] = 0x2B17 ^ 0xB4F5;
                    lo.ooo00oo0Ooo0[0xB0ED ^ 0xB1DC] = 0xBFC0 ^ 0xB1DC;
                    lo.ooo00oo0Ooo0[0x49E9 ^ 0x49CF] = 0x49B6 ^ 0x49CF;
                    lo.ooo00oo0Ooo0[0xF5D5 ^ 0xF492] = 0xFFFFC89B ^ 0xF492;
                    lo.ooo00oo0Ooo0[0x1032E ^ 0x1022E] = 0x15186 ^ 0x1022E;
                    lo.ooo00oo0Ooo0[0x882E ^ 0x8924] = 0x5C93 ^ 0x8924;
                    lo.ooo00oo0Ooo0[0xF6BD ^ 0xF6B1] = 0xF68C ^ 0xF6B1;
                    lo.ooo00oo0Ooo0[0xA4F1 ^ 0xA4B1] = 0xA4F8 ^ 0xA4B1;
                    lo.ooo00oo0Ooo0[0xE14D ^ 0xE017] = 0xFD86 ^ 0xE017;
                    lo.ooo00oo0Ooo0[0x9D55 ^ 0x9D8B] = 0xAC02 ^ 0x9D8B;
                    lo.ooo00oo0Ooo0[0x5284 ^ 0x53BD] = 0x1553D ^ 0x53BD;
                    n3 = -949811562;
                    continue block87;
                }
                case -949811562: {
                    lo.ooo00oo0Ooo0[0x5F9F ^ 0x5E87] = 0x3C2B ^ 0x5E87;
                    lo.ooo00oo0Ooo0[0x354A ^ 0x342E] = 0xC4B9 ^ 0x342E;
                    n3 = -392346883;
                    continue block87;
                }
                case -392346883: {
                    lo.ooo00oo0Ooo0[0x2759 ^ 0x2742] = 0xFFFFD89D ^ 0x2742;
                    lo.ooo00oo0Ooo0[0x6FF2 ^ 0x6FAE] = 0x6FAF ^ 0x6FAE;
                    lo.ooo00oo0Ooo0[0x1052C ^ 0x10526] = 0xFFFEFA85 ^ 0x10526;
                    lo.ooo00oo0Ooo0[0xBE8F ^ 0xBFF2] = 0x8CB ^ 0xBFF2;
                    lo.ooo00oo0Ooo0[0xDA4F ^ 0xDA8A] = 0xAADF ^ 0xDA8A;
                    lo.ooo00oo0Ooo0[0x10D84 ^ 0x10CD2] = 0x14A0B ^ 0x10CD2;
                    lo.ooo00oo0Ooo0[0x6D88 ^ 0x6D27] = 0x6D32 ^ 0x6D27;
                    lo.ooo00oo0Ooo0[0x656F ^ 0x6469] = 0x16172 ^ 0x6469;
                    lo.ooo00oo0Ooo0[0x260A ^ 0x2688] = 0x26D7 ^ 0x2688;
                    lo.ooo00oo0Ooo0[0x10F1C ^ 0x10E10] = 0x1DBA7 ^ 0x10E10;
                    n3 = 114386869;
                    continue block87;
                }
                case 114386869: {
                    lo.ooo00oo0Ooo0[0xE0CB ^ 0xE0EA] = 0xE0EA ^ 0xE0EA;
                    n3 = 683946961;
                    continue block87;
                }
                case 683946961: {
                    lo.ooo00oo0Ooo0[0xF497 ^ 0xF465] = 0xCEF0 ^ 0xF465;
                    lo.ooo00oo0Ooo0[0x2EEB ^ 0x2E32] = 0x9E87 ^ 0x2E32;
                    lo.ooo00oo0Ooo0[0x8BA0 ^ 0x8A87] = 0x30AA ^ 0x8A87;
                    lo.ooo00oo0Ooo0[0xC1CA ^ 0xC0DB] = 0x1CA0A ^ 0xC0DB;
                    lo.ooo00oo0Ooo0[0xB20C ^ 0xB303] = 0xFFFFD30F ^ 0xB303;
                    lo.ooo00oo0Ooo0[0x5CF1 ^ 0x5C57] = 0xFFFFA3A8 ^ 0x5C57;
                    lo.ooo00oo0Ooo0[0xF80A ^ 0xF80B] = 0xF81C ^ 0xF80B;
                    lo.ooo00oo0Ooo0[0x5D2D ^ 0x5DE6] = 0x153A4 ^ 0x5DE6;
                    lo.ooo00oo0Ooo0[0xF463 ^ 0xF44A] = 0xF445 ^ 0xF44A;
                    n3 = 343366168;
                    continue block87;
                }
                case 343366168: {
                    lo.ooo00oo0Ooo0[0x8844 ^ 0x8967] = 0x7C2D ^ 0x8967;
                    lo.ooo00oo0Ooo0[0x8000 ^ 0x8056] = 0xF93D ^ 0x8056;
                    n3 = 214760290;
                    continue block87;
                }
                case 214760290: {
                    lo.ooo00oo0Ooo0[0x7A3A ^ 0x7A98] = 0xFC578567 ^ 0x7A98;
                    n3 = -351538062;
                    continue block87;
                }
                case -351538062: {
                    lo.ooo00oo0Ooo0[0xF3A4 ^ 0xF2C2] = 0x6D99 ^ 0xF2C2;
                    lo.ooo00oo0Ooo0[0x10097 ^ 0x10071] = 0x196B5 ^ 0x10071;
                    lo.ooo00oo0Ooo0[0x6DE0 ^ 0x6DE6] = 0xFFFF9261 ^ 0x6DE6;
                    lo.ooo00oo0Ooo0[0xFC75 ^ 0xFD40] = 0x8584 ^ 0xFD40;
                    lo.ooo00oo0Ooo0[0xA237 ^ 0xA23C] = 0xFFFF5DC3 ^ 0xA23C;
                    lo.ooo00oo0Ooo0[0xEB04 ^ 0xEB71] = 0xFFFF148E ^ 0xEB71;
                    lo.ooo00oo0Ooo0[0x2875 ^ 0x2942] = 0xFFFFAE78 ^ 0x2942;
                    n3 = -180885678;
                    continue block87;
                }
                case -180885678: {
                    lo.ooo00oo0Ooo0[0x496E ^ 0x4843] = 0x99A2 ^ 0x4843;
                    n3 = 732110642;
                    continue block87;
                }
                case 732110642: {
                    lo.ooo00oo0Ooo0[0xE9E5 ^ 0xE9CF] = 0xE9DE ^ 0xE9CF;
                    lo.ooo00oo0Ooo0[0x136E ^ 0x134B] = 0xFFFFEC97 ^ 0x134B;
                    lo.ooo00oo0Ooo0[0x994D ^ 0x9876] = 0xFFFE6118 ^ 0x9876;
                    lo.ooo00oo0Ooo0[0x9760 ^ 0x97F0] = 0x97F3 ^ 0x97F0;
                    lo.ooo00oo0Ooo0[0x494B ^ 0x487D] = 0x30A3 ^ 0x487D;
                    lo.ooo00oo0Ooo0[0xEB4A ^ 0xEB8C] = 0xC718 ^ 0xEB8C;
                    n3 = 772966801;
                    continue block87;
                }
                case 772966801: {
                    lo.ooo00oo0Ooo0[0x76B3 ^ 0x764A] = 0x178DD ^ 0x764A;
                    lo.ooo00oo0Ooo0[0x5647 ^ 0x577F] = 0x2FA1 ^ 0x577F;
                    n3 = -2145285333;
                    continue block87;
                }
                case -2145285333: {
                    lo.ooo00oo0Ooo0[0xD4C3 ^ 0xD4A0] = 0xFFFF2B3D ^ 0xD4A0;
                    n3 = 1814599477;
                    continue block87;
                }
                case 1814599477: {
                    lo.ooo00oo0Ooo0[0x7DD5 ^ 0x7DD6] = 0xFFFF8259 ^ 0x7DD6;
                    lo.ooo00oo0Ooo0[0x467A ^ 0x4675] = 0x4674 ^ 0x4675;
                    lo.ooo00oo0Ooo0[0x4B2C ^ 0x4B69] = 0x4B72 ^ 0x4B69;
                    lo.ooo00oo0Ooo0[0x479F ^ 0x47BD] = 0x47AA ^ 0x47BD;
                    lo.ooo00oo0Ooo0[0x5C01 ^ 0x5D06] = 0xFFFEA7B7 ^ 0x5D06;
                    lo.ooo00oo0Ooo0[0xBD3C ^ 0xBC60] = 0xA1F1 ^ 0xBC60;
                    lo.ooo00oo0Ooo0[0xDB48 ^ 0xDB3F] = 0xFFFF2486 ^ 0xDB3F;
                    lo.ooo00oo0Ooo0[0x106A1 ^ 0x10612] = 0xFFFEF9B7 ^ 0x10612;
                    lo.ooo00oo0Ooo0[0x7F37 ^ 0x7E1B] = 0xB19D ^ 0x7E1B;
                    lo.ooo00oo0Ooo0[0x8AA4 ^ 0x8A5A] = 0x8A5A ^ 0x8A5A;
                    lo.ooo00oo0Ooo0[0x133A ^ 0x132F] = 0x132E ^ 0x132F;
                    lo.ooo00oo0Ooo0[0x10C2A ^ 0x10C35] = 0x10C22 ^ 0x10C35;
                    lo.ooo00oo0Ooo0[0xFC95 ^ 0xFCA4] = 0xCCCC3069 ^ 0xFCA4;
                    lo.ooo00oo0Ooo0[0xCF74 ^ 0xCE06] = 0xE041 ^ 0xCE06;
                    n3 = 2056938140;
                    continue block87;
                }
                case 2056938140: {
                    lo.ooo00oo0Ooo0[0xA5C4 ^ 0xA5C3] = 0xA5B1 ^ 0xA5C3;
                    lo.ooo00oo0Ooo0[0xEEC7 ^ 0xEF98] = 0xFFFF4860 ^ 0xEF98;
                    lo.ooo00oo0Ooo0[0x4D30 ^ 0x4D06] = 0xFFFFB2F9 ^ 0x4D06;
                    lo.ooo00oo0Ooo0[0xB4A3 ^ 0xB493] = 0xF5FF4B68 ^ 0xB493;
                    n3 = -422149248;
                    continue block87;
                }
                case -422149248: {
                    lo.ooo00oo0Ooo0[0x3F25 ^ 0x3EA2] = 0x3EA6 ^ 0x3EA2;
                    lo.ooo00oo0Ooo0[0x4C3C ^ 0x4D55] = 0x2EDF ^ 0x4D55;
                    lo.ooo00oo0Ooo0[0x6B73 ^ 0x6B58] = 0xFFFF9491 ^ 0x6B58;
                    n3 = -102690988;
                    continue block87;
                }
                case -102690988: {
                    lo.ooo00oo0Ooo0[0x191 ^ 0x9F] = 0x9F77 ^ 0x9F;
                    lo.ooo00oo0Ooo0[0x2528 ^ 0x2576] = 0xFFFFDAD5 ^ 0x2576;
                    lo.ooo00oo0Ooo0[0x9B11 ^ 0x9B63] = 0x9B64 ^ 0x9B63;
                    lo.ooo00oo0Ooo0[0xD361 ^ 0xD263] = 0xB7F4 ^ 0xD263;
                    lo.ooo00oo0Ooo0[0x4D0A ^ 0x4C09] = 0xFFFFD609 ^ 0x4C09;
                    lo.ooo00oo0Ooo0[0x3EFC ^ 0x3E78] = 0xFFFFC1A5 ^ 0x3E78;
                    lo.ooo00oo0Ooo0[0xFA64 ^ 0xFA56] = 0xFA51 ^ 0xFA56;
                    n3 = -589420090;
                    continue block87;
                }
                case -589420090: {
                    lo.ooo00oo0Ooo0[0x5A ^ 0x124] = 0xB60C ^ 0x124;
                    lo.ooo00oo0Ooo0[0x618A ^ 0x60FB] = 0x4EBD ^ 0x60FB;
                    lo.ooo00oo0Ooo0[0x941D ^ 0x9472] = 0x9479 ^ 0x9472;
                    lo.ooo00oo0Ooo0[0x4B52 ^ 0x4B45] = 0xFFFFB49C ^ 0x4B45;
                    lo.ooo00oo0Ooo0[0x3C0B ^ 0x3C77] = 0xFFFFC38A ^ 0x3C77;
                    lo.ooo00oo0Ooo0[0xE70 ^ 0xE2D] = 0xFFFFF1D2 ^ 0xE2D;
                    lo.ooo00oo0Ooo0[0xE17D ^ 0xE147] = 0xE143 ^ 0xE147;
                    lo.ooo00oo0Ooo0[0x118F ^ 0x10B3] = 0x11621 ^ 0x10B3;
                    lo.ooo00oo0Ooo0[0x1CAF ^ 0x1C31] = 0xFFFADC31 ^ 0x1C31;
                    n3 = 1548216959;
                    continue block87;
                }
                case 1548216959: {
                    lo.ooo00oo0Ooo0[0x3F2 ^ 0x305] = 0x10D92 ^ 0x305;
                    n3 = 68632061;
                    continue block87;
                }
                case 68632061: {
                    lo.ooo00oo0Ooo0[0xA73B ^ 0xA7FF] = 0xFFFF2829 ^ 0xA7FF;
                    n3 = 519015310;
                    continue block87;
                }
                case 519015310: {
                    lo.ooo00oo0Ooo0[0x28F3 ^ 0x28DE] = 0x2891 ^ 0x28DE;
                    lo.ooo00oo0Ooo0[0xD82C ^ 0xD8E5] = 0xF47F ^ 0xD8E5;
                    n3 = -384968242;
                    continue block87;
                }
                case -384968242: {
                    lo.ooo00oo0Ooo0[0x2E42 ^ 0x2E4B] = 0x2E2C ^ 0x2E4B;
                    lo.ooo00oo0Ooo0[0xA524 ^ 0xA5D9] = 0x440 ^ 0xA5D9;
                    lo.ooo00oo0Ooo0[0x6F67 ^ 0x6E1D] = 0xAF0F ^ 0x6E1D;
                    n3 = 1587053807;
                    continue block87;
                }
                case 1587053807: {
                    lo.ooo00oo0Ooo0[0xF23C ^ 0xF28E] = 0xA3A00D2B ^ 0xF28E;
                    lo.ooo00oo0Ooo0[0xCC99 ^ 0xCC43] = 0x299B ^ 0xCC43;
                    lo.ooo00oo0Ooo0[0x645F ^ 0x6523] = 0xA431 ^ 0x6523;
                    lo.ooo00oo0Ooo0[0x3AB ^ 0x2EE] = 0xC130 ^ 0x2EE;
                    lo.ooo00oo0Ooo0[0x64E0 ^ 0x64D8] = 0x64DF ^ 0x64D8;
                    lo.ooo00oo0Ooo0[0x541 ^ 0x582] = 0x75D7 ^ 0x582;
                    n3 = 24050806;
                    continue block87;
                }
                case 24050806: {
                    lo.ooo00oo0Ooo0[0x5B79 ^ 0x5B1F] = 0x5B34 ^ 0x5B1F;
                    lo.ooo00oo0Ooo0[0xA7B4 ^ 0xA776] = 0xD726 ^ 0xA776;
                    lo.ooo00oo0Ooo0[0xA626 ^ 0xA650] = 0xFFFF59AF ^ 0xA650;
                    lo.ooo00oo0Ooo0[0xF56C ^ 0xF413] = 0x4350 ^ 0xF413;
                    lo.ooo00oo0Ooo0[0xCD8D ^ 0xCD93] = 0xCD9F ^ 0xCD93;
                    lo.ooo00oo0Ooo0[0x5CC4 ^ 0x5DE6] = 0xA8F6 ^ 0x5DE6;
                    lo.ooo00oo0Ooo0[0xE0AB ^ 0xE0E7] = 0xE0E7 ^ 0xE0E7;
                    n3 = -544259734;
                    continue block87;
                }
                case -544259734: {
                    lo.ooo00oo0Ooo0[0xECF6 ^ 0xEC8C] = 0x40A59239 ^ 0xEC8C;
                    lo.ooo00oo0Ooo0[0xDB9E ^ 0xDB0A] = 0xFFFF24CF ^ 0xDB0A;
                    lo.ooo00oo0Ooo0[0xADFA ^ 0xAD7C] = 0x20447A0E ^ 0xAD7C;
                    lo.ooo00oo0Ooo0[0x5BA2 ^ 0x5B9F] = 0x45D12FC2 ^ 0x5B9F;
                    lo.ooo00oo0Ooo0[0xA2E5 ^ 0xA364] = 0xA364 ^ 0xA364;
                    n3 = -942421799;
                    continue block87;
                }
                case -942421799: {
                    lo.ooo00oo0Ooo0[0xF53C ^ 0xF559] = 0xFFFF0AA0 ^ 0xF559;
                    lo.ooo00oo0Ooo0[0xA809 ^ 0xA827] = 0xA83E ^ 0xA827;
                    lo.ooo00oo0Ooo0[0x4CEF ^ 0x4CFF] = 0x4CBC ^ 0x4CFF;
                    lo.ooo00oo0Ooo0[0x549F ^ 0x54E2] = 0x3E5CE2 ^ 0x54E2;
                    n3 = 290920219;
                    continue block87;
                }
                case 290920219: {
                    lo.ooo00oo0Ooo0[0xFB5C ^ 0xFB46] = 0xFB4B ^ 0xFB46;
                    lo.ooo00oo0Ooo0[0x720B ^ 0x7334] = 0xFFFFCF7D ^ 0x7334;
                    lo.ooo00oo0Ooo0[0x9E00 ^ 0x9E57] = 0xEA ^ 0x9E57;
                    n3 = -1690464556;
                    continue block87;
                }
                case -1690464556: {
                    lo.ooo00oo0Ooo0[0x95F0 ^ 0x951D] = 0x19EC ^ 0x951D;
                    return;
                }
                default: {
                    ooo00oo0Ooo0 = new int[0x1C07 ^ 0x1D97];
                    lo.ooo00oo0Ooo0[0xDB64 ^ 0xDA78] = 0x1DED1 ^ 0xDA78;
                    lo.ooo00oo0Ooo0[0x890C ^ 0x8880] = 0xFFFF777F ^ 0x8880;
                    lo.ooo00oo0Ooo0[0xB3C3 ^ 0xB2D5] = 0xD079 ^ 0xB2D5;
                    lo.ooo00oo0Ooo0[0x88F3 ^ 0x89A7] = 0x84A4 ^ 0x89A7;
                    lo.ooo00oo0Ooo0[0x20C5 ^ 0x208D] = 0x20DC ^ 0x208D;
                    lo.ooo00oo0Ooo0[0x5EF1 ^ 0x5EE3] = 0xFFFFA11C ^ 0x5EE3;
                    lo.ooo00oo0Ooo0[0x582D ^ 0x5942] = 0xFFFF6BCD ^ 0x5942;
                    lo.ooo00oo0Ooo0[0x77AB ^ 0x769B] = 0xA762 ^ 0x769B;
                    lo.ooo00oo0Ooo0[0xE307 ^ 0xE390] = 0x1C712419 ^ 0xE390;
                    lo.ooo00oo0Ooo0[0xCEAC ^ 0xCF83] = 0x1E33 ^ 0xCF83;
                    lo.ooo00oo0Ooo0[0xEE9E ^ 0xEFB4] = 0x2032 ^ 0xEFB4;
                    lo.ooo00oo0Ooo0[0x5FC5 ^ 0x5E9C] = 0x4310 ^ 0x5E9C;
                    lo.ooo00oo0Ooo0[0x8F64 ^ 0x8FD8] = 0x3DB8 ^ 0x8FD8;
                    lo.ooo00oo0Ooo0[0x5C31 ^ 0x5C27] = 0xFFFFA396 ^ 0x5C27;
                    n3 = -1606002748;
                    continue block87;
                }
                case -1606002748: {
                    lo.ooo00oo0Ooo0[0xD0C4 ^ 0xD065] = 0x3CF31F58 ^ 0xD065;
                    n3 = 37297653;
                    continue block87;
                }
                case 37297653: {
                    lo.ooo00oo0Ooo0[0xFFB7 ^ 0xFF58] = 0xE7A0 ^ 0xFF58;
                    n3 = 1902812275;
                    continue block87;
                }
                case 1902812275: 
            }
            lo.ooo00oo0Ooo0[0xA16 ^ 0xA9F] = 0xAE8 ^ 0xA9F;
            lo.ooo00oo0Ooo0[0x369 ^ 0x35A] = 0x343 ^ 0x35A;
            lo.ooo00oo0Ooo0[0xE691 ^ 0xE7AC] = 0xA406 ^ 0xE7AC;
            lo.ooo00oo0Ooo0[0x85CD ^ 0x849E] = 0xFFFF7656 ^ 0x849E;
            lo.ooo00oo0Ooo0[0xE2FA ^ 0xE22D] = 0x5298 ^ 0xE22D;
            lo.ooo00oo0Ooo0[0x2A61 ^ 0x2B3F] = 0x7304 ^ 0x2B3F;
            lo.ooo00oo0Ooo0[0x4D7B ^ 0x4D90] = 0xC161 ^ 0x4D90;
            n3 = -969591935;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public lo(String string, lw lw2) {
        aki aki2;
        int n2 = 938508349;
        if (n2 != n2) {
        }
        super(string, lw2);
        String string2 = o0Oo000O0oO;
        if (string2 == null) {
            string2 = o0Oo000O0oO = (String)0OOOoo00o0[(ooo00oo0Ooo0[0] - ooo00oo0Ooo0[1] ^ ooo00oo0Ooo0[2]) * ooo00oo0Ooo0[3]] + (String)0OOOoo00o0[ooo00oo0Ooo0[4] + ooo00oo0Ooo0[5] + ooo00oo0Ooo0[6]];
        }
        aki2(string2, (akg<?>)this, (Boolean)(-(ooo00oo0Ooo0[7] - ooo00oo0Ooo0[8])));
        this.Gb = aki2;
        int n3 = ooo00oo0Ooo0[13];
        this.Gc = new akq((String)0OOOoo00o0[-((ooo00oo0Ooo0[9] ^ ooo00oo0Ooo0[10] ^ ooo00oo0Ooo0[11]) - ooo00oo0Ooo0[12])], this, (Number)Double.longBitsToDouble(0xC8B32780A8F0AD34L ^ 0xF762BE19316934AEL), (Number)((n3 << ooo00oo0Ooo0[14] | n3 >>> ooo00oo0Ooo0[15]) - ooo00oo0Ooo0[16] ^ ooo00oo0Ooo0[17]), (Number)Double.longBitsToDouble(0xCFC08C2435AB628BL ^ 0xF014F6C5720576F0L), (Number)Double.longBitsToDouble(0x973B14E7727257FBL ^ 0xA86B76AAA083FE07L));
        int n4 = ooo00oo0Ooo0[18] ^ ooo00oo0Ooo0[19];
        int n5 = -ooo00oo0Ooo0[24];
        int n6 = (n5 >>> ooo00oo0Ooo0[25] | n5 << ooo00oo0Ooo0[26]) ^ ooo00oo0Ooo0[27];
        this.Gd = new akq((String)0OOOoo00o0[(n4 << ooo00oo0Ooo0[20] | n4 >>> ooo00oo0Ooo0[21]) * ooo00oo0Ooo0[22] * ooo00oo0Ooo0[23]], this, (Number)(n6 << ooo00oo0Ooo0[28] | n6 >>> ooo00oo0Ooo0[29]), (Number)Double.longBitsToDouble(0xC76DF7A6253F1D73L ^ 0xF8D46E3FBCA684E9L), (Number)(ooo00oo0Ooo0[30] - ooo00oo0Ooo0[31] ^ ooo00oo0Ooo0[32]), (Number)Double.longBitsToDouble(0x84D4E2EA495D920CL ^ 0xBB6D7B73D0C40B96L));
        this.Ge = var1_1 -> {
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
        this.Gf = ei2 -> {
            int n2 = 1934765836;
            if (n2 != n2) {
                throw null;
            }
            int n3 = 1006032077;
            if (!this.Eo) return;
            ei2.cF();
        };
        this.Gg = fh2 -> {
            int n2 = 561503781;
            if (n2 != n2) {
                int cfr_ignored_0 = 7 & 1;
            }
            Object[] objectArray = new Object[3];
            objectArray[0] = fh2.dq();
            if (!((aj)objectArray[0] instanceof t)) return;
            objectArray[2] = (t)((aj)objectArray[0]);
            int n3 = -81156676;
            while (true) {
                switch (n3) {
                    case -1993041654: {
                        fh2.cF();
                        int n4 = ooo00oo0Ooo0[40];
                        this.Ga = (n4 << ooo00oo0Ooo0[41] | n4 >>> ooo00oo0Ooo0[42]) + ooo00oo0Ooo0[43];
                        return;
                    }
                    default: {
                        if (((t)objectArray[2]).getEntityID() != lo.aER.bgK.getEntityId()) return;
                        break;
                    }
                    case -1845383171: 
                }
                this.Eo = ooo00oo0Ooo0[37] + ooo00oo0Ooo0[38] ^ ooo00oo0Ooo0[39];
                n3 = -1993041654;
            }
        };
        this.Gh = fd2 -> {};
    }

    /*
     * Exception decompiling
     */
    static {
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
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

