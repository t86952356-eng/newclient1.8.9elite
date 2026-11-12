/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahm;
import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fa;
import hackclient.rise.fh;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ax
extends am {
    @dm
    public /* synthetic */ dk<fa> cv;
    public static /* synthetic */ String o0Oo000O0oO;
    public static /* synthetic */ String cs;
    public static /* synthetic */ String[] O0OoOO0OOOOO;
    private static /* synthetic */ int[] ooo00oo0Ooo0;
    @dm
    public /* synthetic */ dk<ei> ct;
    @dm
    public /* synthetic */ dk<fh> cu;
    public static /* synthetic */ boolean cr;
    public static /* synthetic */ Object[] 0OOOoo00o0;
    public static /* synthetic */ String[] 0oOOoOo0O00O;
    public /* synthetic */ Pattern cq;
    public static /* synthetic */ Object oO00O0OO0ooO;
    public static /* synthetic */ Object[] Oo0o00000O00;
    private static /* synthetic */ int o0o000o0O0o0;
    private static /* synthetic */ boolean oOo00Oo0OOo0;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2;
        int n2 = -839012436;
        if (n2 != n2) {
            int cfr_ignored_0 = 41 + 68;
        }
        if ((n2 = 854173869) != n2) {
            throw null;
        }
        Object[] objectArray = new Object[21];
        long[] lArray = new long[21];
        int n3 = -2109304916;
        ax.0OOOoo00o0();
        O0OoOO0OOOOO = new String[ooo00oo0Ooo0[25]];
        0oOOoOo0O00O = new String[ooo00oo0Ooo0[26]];
        int n4 = ooo00oo0Ooo0[27];
        0OOOoo00o0 = new Object[(n4 << ooo00oo0Ooo0[28] | n4 >>> ooo00oo0Ooo0[29]) + ooo00oo0Ooo0[30] + ooo00oo0Ooo0[31] + ooo00oo0Ooo0[32]];
        lArray[13] = l2 = -181515890108747956L;
        long l3 = lArray[13];
        int n5 = ooo00oo0Ooo0[36] + ooo00oo0Ooo0[37];
        lArray[13] = l2 = l3 ^ ((long)(ooo00oo0Ooo0[33] * ooo00oo0Ooo0[34] ^ ooo00oo0Ooo0[35]) ^ l3) & -1L >>> (n5 >>> ooo00oo0Ooo0[38] | n5 << ooo00oo0Ooo0[39]);
        String string = 0oOOoOo0O00O[ooo00oo0Ooo0[40]];
        if (string == null) {
            int n6 = ooo00oo0Ooo0[41];
            String string2 = O0OoOO0OOOOO[ooo00oo0Ooo0[42]];
            if (string2 == null) {
                objectArray[6] = "\uee5f\u09cf\ufcbd\uf80e\u59ab\u5dec\uce49\u7b2a\u2e87\u2cc8\uaaa5\uac26\u1c83\u0d14\u1c21\u0cc2\ufb4e\u09e0\uec20\ufc1f\u5d3a\uca29\ucb7c\ucfcb\u3c6a\u3f19\u3cec\uad27\u1ace\u0ced\u2000\u0ccf\ufbb1\uec02\ufc53\ufb14\u5b35\ucc06\uca77\uccc8\u3c89\u53fa\u3ceb\u7bbc\u19dd\u0a5e\u09cf\uf991\uf840\u0b62\ued4e\uec1d\u5d08\uca07\udc76\ucd75\u3a3c\u2d0b\u3c1a\u7989\u1c80\u0b3f\u0a0e\u7aed".toCharArray();
                lArray[1] = l2 = (long)ooo00oo0Ooo0[43];
                while ((int)lArray[1] < ((char[])objectArray[6]).length) {
                    char[] cArray = (char[])objectArray[6];
                    int n7 = (int)lArray[1];
                    char c2 = (char)((char)(-cArray[n7]) ^ n7);
                    char c3 = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(c2 >>> ooo00oo0Ooo0[44] | c2 << ooo00oo0Ooo0[45]) - ooo00oo0Ooo0[46]) + n7) ^ n7) ^ ooo00oo0Ooo0[47]) ^ ooo00oo0Ooo0[48]))) ^ n7) + n7);
                    char c4 = -((char)((char)(c3 << ooo00oo0Ooo0[49] | c3 >>> ooo00oo0Ooo0[50]) ^ n7));
                    cArray[n7] = (char)((char)((char)((char)((char)(c4 >>> ooo00oo0Ooo0[51] | c4 << ooo00oo0Ooo0[52]) - ooo00oo0Ooo0[53]) ^ ooo00oo0Ooo0[54]) ^ n7) - ooo00oo0Ooo0[55]);
                    lArray[1] = l2 = (long)((int)lArray[1] + 1);
                }
                string2 = ax.O0OoOO0OOOOO[ax.ooo00oo0Ooo0[56]] = new String((char[])objectArray[6]);
            }
            string = ax.o0Oo000O0oO(n6, string2);
        }
        objectArray[4] = string.toCharArray();
        lArray[10] = l2 = 1525448981265529176L;
        long l4 = lArray[10];
        lArray[10] = l2 = l4 ^ ((long)(ooo00oo0Ooo0[57] * ooo00oo0Ooo0[58] ^ ooo00oo0Ooo0[59]) ^ l4) & -1L >>> ((ooo00oo0Ooo0[60] - ooo00oo0Ooo0[61]) * ooo00oo0Ooo0[62] ^ ooo00oo0Ooo0[63]) + ooo00oo0Ooo0[64];
        long l5 = lArray[13];
        int n8 = ooo00oo0Ooo0[65];
        int n9 = n8 << ooo00oo0Ooo0[66] | n8 >>> ooo00oo0Ooo0[67];
        int n10 = n9 << ooo00oo0Ooo0[68] | n9 >>> ooo00oo0Ooo0[69];
        lArray[13] = l2 = l5 ^ (0L ^ l5) & -1L << (n10 << ooo00oo0Ooo0[70] | n10 >>> ooo00oo0Ooo0[71]);
        while ((int)(lArray[13] >>> (ooo00oo0Ooo0[72] * ooo00oo0Ooo0[73] ^ ooo00oo0Ooo0[74]) * ooo00oo0Ooo0[75] - ooo00oo0Ooo0[76]) < (int)lArray[10]) {
            lArray[13] = l2 = lArray[13] + 0x100000000L;
            long l6 = lArray[10];
            int n11 = (ooo00oo0Ooo0[84] - ooo00oo0Ooo0[85]) * ooo00oo0Ooo0[86] * ooo00oo0Ooo0[87];
            lArray[10] = l2 = l6 ^ ((long)((char[])objectArray[4])[(int)(lArray[13] >>> (ooo00oo0Ooo0[77] ^ ooo00oo0Ooo0[78]) * ooo00oo0Ooo0[79])] << (ooo00oo0Ooo0[80] ^ ooo00oo0Ooo0[81]) * ooo00oo0Ooo0[82] * ooo00oo0Ooo0[83] ^ l6) & -1L << (n11 << ooo00oo0Ooo0[88] | n11 >>> ooo00oo0Ooo0[89]);
            int n12 = (ooo00oo0Ooo0[90] + ooo00oo0Ooo0[91]) * ooo00oo0Ooo0[92];
            lArray[13] = l2 = lArray[13] + 0x100000000L;
            lArray[18] = l2 = 5029183872561992057L;
            int n13 = ooo00oo0Ooo0[96] * ooo00oo0Ooo0[97] * ooo00oo0Ooo0[98];
            long l7 = lArray[18];
            int n14 = ooo00oo0Ooo0[101] * ooo00oo0Ooo0[102];
            lArray[18] = l2 = l7 ^ ((long)((char[])objectArray[4])[(int)(lArray[13] >>> ((n12 << ooo00oo0Ooo0[93] | n12 >>> ooo00oo0Ooo0[94]) ^ ooo00oo0Ooo0[95]))] << (n13 >>> ooo00oo0Ooo0[99] | n13 << ooo00oo0Ooo0[100]) ^ l7) & -1L << (n14 << ooo00oo0Ooo0[103] | n14 >>> ooo00oo0Ooo0[104]) + ooo00oo0Ooo0[105] + ooo00oo0Ooo0[106];
            int n15 = ooo00oo0Ooo0[114];
            lArray[16] = l2 = -3702769964025896298L;
            long l8 = lArray[16];
            int n16 = ooo00oo0Ooo0[120];
            int n17 = (n16 << ooo00oo0Ooo0[121] | n16 >>> ooo00oo0Ooo0[122]) * ooo00oo0Ooo0[123];
            lArray[16] = l2 = l8 ^ ((long)((int)(lArray[10] >>> (-(ooo00oo0Ooo0[107] * ooo00oo0Ooo0[108]) ^ ooo00oo0Ooo0[109])) << (-ooo00oo0Ooo0[110] * ooo00oo0Ooo0[111] ^ ooo00oo0Ooo0[112]) + ooo00oo0Ooo0[113] | (int)(lArray[18] >>> (n15 << ooo00oo0Ooo0[115] | n15 >>> ooo00oo0Ooo0[116]) * ooo00oo0Ooo0[117] * ooo00oo0Ooo0[118] + ooo00oo0Ooo0[119])) ^ l8) & -1L >>> (n17 >>> ooo00oo0Ooo0[124] | n17 << ooo00oo0Ooo0[125]);
            objectArray[14] = new char[(int)lArray[16]];
            int n18 = 695395587;
            block1 : switch (n18) {
                default: {
                    long l9 = lArray[16];
                    int n19 = ooo00oo0Ooo0[126];
                    int n20 = n19 >>> ooo00oo0Ooo0[127] | n19 << ooo00oo0Ooo0[128];
                    lArray[16] = l2 = l9 ^ (0L ^ l9) & -1L << (n20 << ooo00oo0Ooo0[129] | n20 >>> ooo00oo0Ooo0[130]) + ooo00oo0Ooo0[131];
                    while (true) {
                        int n21 = ooo00oo0Ooo0[132];
                        int n22 = n21 >>> ooo00oo0Ooo0[133] | n21 << ooo00oo0Ooo0[134];
                        int n23 = n22 << ooo00oo0Ooo0[135] | n22 >>> ooo00oo0Ooo0[136];
                        if ((int)(lArray[16] >>> (n23 << ooo00oo0Ooo0[137] | n23 >>> ooo00oo0Ooo0[138]) * ooo00oo0Ooo0[139]) >= (int)lArray[16]) break block1;
                        int n24 = -ooo00oo0Ooo0[140];
                        ((char[])objectArray[14])[(int)(lArray[16] >>> (n24 << ax.ooo00oo0Ooo0[141] | n24 >>> ax.ooo00oo0Ooo0[142]))] = ((char[])objectArray[4])[(int)(lArray[13] >>> (-(ooo00oo0Ooo0[143] ^ ooo00oo0Ooo0[144]) ^ ooo00oo0Ooo0[145])) + (int)(lArray[16] >>> (ooo00oo0Ooo0[146] * ooo00oo0Ooo0[147] ^ ooo00oo0Ooo0[148] ^ ooo00oo0Ooo0[149]) * ooo00oo0Ooo0[150])];
                        lArray[16] = l2 = lArray[16] + 0x100000000L;
                    }
                }
                case -635637543: 
            }
            long l10 = lArray[13];
            int n25 = ooo00oo0Ooo0[151] * ooo00oo0Ooo0[152];
            int n26 = -(ooo00oo0Ooo0[155] * ooo00oo0Ooo0[156]);
            lArray[13] = l2 = l10 ^ (l10 ^ l10 + (long)(-(n25 >>> ooo00oo0Ooo0[153] | n25 << ooo00oo0Ooo0[154]))) & -1L >>> (n26 << ooo00oo0Ooo0[157] | n26 >>> ooo00oo0Ooo0[158]);
            ax.0OOOoo00o0[(int)lArray[13]] = new String((char[])objectArray[14]);
            int n27 = ooo00oo0Ooo0[162] * ooo00oo0Ooo0[163] * ooo00oo0Ooo0[164];
            long l11 = lArray[13];
            int n28 = ooo00oo0Ooo0[168] * ooo00oo0Ooo0[169] * ooo00oo0Ooo0[170];
            lArray[13] = l2 = l11 ^ ((long)((int)(lArray[13] >>> ooo00oo0Ooo0[159] + ooo00oo0Ooo0[160] - ooo00oo0Ooo0[161]) + (int)lArray[16]) << (n27 << ooo00oo0Ooo0[165] | n27 >>> ooo00oo0Ooo0[166]) * ooo00oo0Ooo0[167] ^ l11) & -1L << (n28 << ooo00oo0Ooo0[171] | n28 >>> ooo00oo0Ooo0[172]) * ooo00oo0Ooo0[173];
        }
        return;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) {
        block39: {
            block38: {
                block40: {
                    var36_2 = 1689585027;
                    if (var36_2 != var36_2) {
                        var36_2 = 1733296068;
                    }
                    if ((var36_2 = -1364460678) != var36_2) {
                        throw new ClassCastException();
                    }
                    var36_2 = 491345690;
                    if (var36_2 != var36_2) {
                        47 + 77;
                    }
                    if ((var36_2 = 1706226639) != var36_2) {
                    }
                    var31_6 = new Object[29];
                    var32_3 = new long[29];
                    var22_4 = -1076137824;
                    v0 = ax.Oo0o00000O00;
                    if (ax.Oo0o00000O00 == null) {
                        v1 = new Object[ax.ooo00oo0Ooo0[174]];
                        ax.Oo0o00000O00 = v1;
                        v0 = v1;
                        var31_6[9] = new byte[ax.ooo00oo0Ooo0[176] ^ ax.ooo00oo0Ooo0[177]];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[178] ^ ax.ooo00oo0Ooo0[179]] = ax.ooo00oo0Ooo0[180] ^ ax.ooo00oo0Ooo0[181];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[182] ^ ax.ooo00oo0Ooo0[183]] = ax.ooo00oo0Ooo0[184] ^ ax.ooo00oo0Ooo0[185];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[186] ^ ax.ooo00oo0Ooo0[187]] = ax.ooo00oo0Ooo0[188] ^ ax.ooo00oo0Ooo0[189];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[190] ^ ax.ooo00oo0Ooo0[191]] = ax.ooo00oo0Ooo0[192] ^ ax.ooo00oo0Ooo0[193];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[194] ^ ax.ooo00oo0Ooo0[195]] = ax.ooo00oo0Ooo0[196] ^ ax.ooo00oo0Ooo0[197];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[198] ^ ax.ooo00oo0Ooo0[199]] = ax.ooo00oo0Ooo0[200] ^ ax.ooo00oo0Ooo0[201];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[202] ^ ax.ooo00oo0Ooo0[203]] = ax.ooo00oo0Ooo0[204] ^ ax.ooo00oo0Ooo0[205];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[206] ^ ax.ooo00oo0Ooo0[207]] = ax.ooo00oo0Ooo0[208] ^ ax.ooo00oo0Ooo0[209];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[210] ^ ax.ooo00oo0Ooo0[211]] = ax.ooo00oo0Ooo0[212] ^ ax.ooo00oo0Ooo0[213];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[214] ^ ax.ooo00oo0Ooo0[215]] = ax.ooo00oo0Ooo0[216] ^ ax.ooo00oo0Ooo0[217];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[218] ^ ax.ooo00oo0Ooo0[219]] = ax.ooo00oo0Ooo0[220] ^ ax.ooo00oo0Ooo0[221];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[222] ^ ax.ooo00oo0Ooo0[223]] = ax.ooo00oo0Ooo0[224] ^ ax.ooo00oo0Ooo0[225];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[226] ^ ax.ooo00oo0Ooo0[227]] = ax.ooo00oo0Ooo0[228] ^ ax.ooo00oo0Ooo0[229];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[230] ^ ax.ooo00oo0Ooo0[231]] = ax.ooo00oo0Ooo0[232] ^ ax.ooo00oo0Ooo0[233];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[234] ^ ax.ooo00oo0Ooo0[235]] = ax.ooo00oo0Ooo0[236] ^ ax.ooo00oo0Ooo0[237];
                        ((byte[])var31_6[9])[ax.ooo00oo0Ooo0[238] ^ ax.ooo00oo0Ooo0[239]] = ax.ooo00oo0Ooo0[240] ^ ax.ooo00oo0Ooo0[241];
                        v1[ax.ooo00oo0Ooo0[175]] = (byte[])var31_6[9];
                    }
                    var31_6[6] = (byte[])v0[ax.ooo00oo0Ooo0[242]];
                    if (ax.oO00O0OO0ooO != null) ** GOTO lbl54
                    var31_6[13] = new byte[ax.ooo00oo0Ooo0[243] ^ ax.ooo00oo0Ooo0[244]];
                    ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[245] ^ ax.ooo00oo0Ooo0[246]] = ax.ooo00oo0Ooo0[247] ^ ax.ooo00oo0Ooo0[248];
                    ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[249] ^ ax.ooo00oo0Ooo0[250]] = ax.ooo00oo0Ooo0[251] ^ ax.ooo00oo0Ooo0[252];
                    var24_5 = 1813458679;
                    break block40;
                    while (true) {
                        v2 = ax.O0OoOO0OOOOO[ax.ooo00oo0Ooo0[384]] = new String((char[])var31_6[20]);
                        while (true) {
                            break block38;
                            break;
                        }
                        break;
                    }
                    while (true) {
                        v3 = new String((char[])var31_6[20]);
lbl52:
                        // 2 sources

                        while (true) {
                            ax.oO00O0OO0ooO = new SecretKeySpec(v4, v3);
lbl54:
                            // 2 sources

                            var31_6[27] = Base64.getDecoder().decode(var1_1);
                            var31_6[23] = Arrays.copyOfRange((byte[])var31_6[27], 0, 16);
                            var31_6[5] = Arrays.copyOfRange((byte[])var31_6[27], 16, ((byte[])var31_6[27]).length);
                            v5 = ax.O0OoOO0OOOOO[3];
                            if (v5 == null) {
                                var28_12 = 1154608119;
                                var31_6[20] = "\u7b91\u3b91\u5bac\u1bae\u5b91\u8b91\u5b91\u1bae\u2b90\udb90\u5b91\u5bac\u3bae\u2b90\u7b93\u6b93\u6b93\ufb92\ucb92\u9b93".toCharArray();
                                var32_3[1] = var33_8 = (long)0;
lbl62:
                                // 2 sources

                                while (true) {
                                    var29_13 = (int)var32_3[1] < ((char[])var31_6[20]).length ? -789416077 : 1785471714;
                                    break block39;
                                    break;
                                }
                            }
lbl65:
                            // 3 sources

                            while (true) {
                                var31_6[3] = Cipher.getInstance(v5);
                                var30_14 = -616434794;
                                ((Cipher)var31_6[3]).init(2, (Key)((SecretKey)ax.oO00O0OO0ooO), new IvParameterSpec((byte[])var31_6[23]));
                                var31_6[10] = ((Cipher)var31_6[3]).doFinal((byte[])var31_6[5]);
                                ax.0oOOoOo0O00O[var0] = new String((byte[])var31_6[10], StandardCharsets.UTF_8);
                                return ax.0oOOoOo0O00O[var0];
                            }
                            break;
                        }
                        break;
                    }
                }
                block26: while (true) {
                    switch (var24_5) {
                        case 58214349: {
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[333] ^ ax.ooo00oo0Ooo0[334]] = ax.ooo00oo0Ooo0[335] ^ ax.ooo00oo0Ooo0[336];
                            var24_5 = 41480519;
                            continue block26;
                        }
                        case 41480519: {
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[337] ^ ax.ooo00oo0Ooo0[338]] = ax.ooo00oo0Ooo0[339] ^ ax.ooo00oo0Ooo0[340];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[341] ^ ax.ooo00oo0Ooo0[342]] = ax.ooo00oo0Ooo0[343] ^ ax.ooo00oo0Ooo0[344];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[345] ^ ax.ooo00oo0Ooo0[346]] = ax.ooo00oo0Ooo0[347] ^ ax.ooo00oo0Ooo0[348];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[349] ^ ax.ooo00oo0Ooo0[350]] = ax.ooo00oo0Ooo0[351] ^ ax.ooo00oo0Ooo0[352];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[353] ^ ax.ooo00oo0Ooo0[354]] = ax.ooo00oo0Ooo0[355] ^ ax.ooo00oo0Ooo0[356];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[357] ^ ax.ooo00oo0Ooo0[358]] = ax.ooo00oo0Ooo0[359] ^ ax.ooo00oo0Ooo0[360];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[361] ^ ax.ooo00oo0Ooo0[362]] = ax.ooo00oo0Ooo0[363] ^ ax.ooo00oo0Ooo0[364];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[365] ^ ax.ooo00oo0Ooo0[366]] = ax.ooo00oo0Ooo0[367] ^ ax.ooo00oo0Ooo0[368];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[369] ^ ax.ooo00oo0Ooo0[370]] = ax.ooo00oo0Ooo0[371] ^ ax.ooo00oo0Ooo0[372];
                            var31_6[21] = new byte[((byte[])var31_6[6]).length + ((byte[])var31_6[13]).length];
                            System.arraycopy((byte[])var31_6[6], ax.ooo00oo0Ooo0[373], (byte[])var31_6[21], ax.ooo00oo0Ooo0[374], ((byte[])var31_6[6]).length);
                            System.arraycopy((byte[])var31_6[13], ax.ooo00oo0Ooo0[375], (byte[])var31_6[21], ((byte[])var31_6[6]).length, ((byte[])var31_6[13]).length);
                            var25_7 = 65194295;
                            break block26;
                        }
                        default: {
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[253] ^ ax.ooo00oo0Ooo0[254]] = ax.ooo00oo0Ooo0[255] ^ ax.ooo00oo0Ooo0[256];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[257] ^ ax.ooo00oo0Ooo0[258]] = ax.ooo00oo0Ooo0[259] ^ ax.ooo00oo0Ooo0[260];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[261] ^ ax.ooo00oo0Ooo0[262]] = ax.ooo00oo0Ooo0[263] ^ ax.ooo00oo0Ooo0[264];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[265] ^ ax.ooo00oo0Ooo0[266]] = ax.ooo00oo0Ooo0[267] ^ ax.ooo00oo0Ooo0[268];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[269] ^ ax.ooo00oo0Ooo0[270]] = ax.ooo00oo0Ooo0[271] ^ ax.ooo00oo0Ooo0[272];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[273] ^ ax.ooo00oo0Ooo0[274]] = ax.ooo00oo0Ooo0[275] ^ ax.ooo00oo0Ooo0[276];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[277] ^ ax.ooo00oo0Ooo0[278]] = ax.ooo00oo0Ooo0[279] ^ ax.ooo00oo0Ooo0[280];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[281] ^ ax.ooo00oo0Ooo0[282]] = ax.ooo00oo0Ooo0[283] ^ ax.ooo00oo0Ooo0[284];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[285] ^ ax.ooo00oo0Ooo0[286]] = ax.ooo00oo0Ooo0[287] ^ ax.ooo00oo0Ooo0[288];
                            var24_5 = 1682670907;
                            continue block26;
                        }
                        case 1682670907: {
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[289] ^ ax.ooo00oo0Ooo0[290]] = ax.ooo00oo0Ooo0[291] ^ ax.ooo00oo0Ooo0[292];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[293] ^ ax.ooo00oo0Ooo0[294]] = ax.ooo00oo0Ooo0[295] ^ ax.ooo00oo0Ooo0[296];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[297] ^ ax.ooo00oo0Ooo0[298]] = ax.ooo00oo0Ooo0[299] ^ ax.ooo00oo0Ooo0[300];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[301] ^ ax.ooo00oo0Ooo0[302]] = ax.ooo00oo0Ooo0[303] ^ ax.ooo00oo0Ooo0[304];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[305] ^ ax.ooo00oo0Ooo0[306]] = ax.ooo00oo0Ooo0[307] ^ ax.ooo00oo0Ooo0[308];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[309] ^ ax.ooo00oo0Ooo0[310]] = ax.ooo00oo0Ooo0[311] ^ ax.ooo00oo0Ooo0[312];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[313] ^ ax.ooo00oo0Ooo0[314]] = ax.ooo00oo0Ooo0[315] ^ ax.ooo00oo0Ooo0[316];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[317] ^ ax.ooo00oo0Ooo0[318]] = ax.ooo00oo0Ooo0[319] ^ ax.ooo00oo0Ooo0[320];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[321] ^ ax.ooo00oo0Ooo0[322]] = ax.ooo00oo0Ooo0[323] ^ ax.ooo00oo0Ooo0[324];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[325] ^ ax.ooo00oo0Ooo0[326]] = ax.ooo00oo0Ooo0[327] ^ ax.ooo00oo0Ooo0[328];
                            ((byte[])var31_6[13])[ax.ooo00oo0Ooo0[329] ^ ax.ooo00oo0Ooo0[330]] = ax.ooo00oo0Ooo0[331] ^ ax.ooo00oo0Ooo0[332];
                            var24_5 = 58214349;
                            continue block26;
                        }
                    }
                    break;
                }
                block27: while (true) {
                    switch (var25_7) {
                        default: {
                            if ((v2 = ax.O0OoOO0OOOOO[ax.ooo00oo0Ooo0[376]]) != null) ** continue;
                            var25_7 = 309681495;
                            continue block27;
                        }
                        case 309681495: 
                    }
                    break;
                }
                var31_6[20] = "\u5713\u6511\u5c0f\u630d\u610b\u7509\u5007\u3e05\u3303\u3f01\u5eff\u39fd\u45fb\u43f9\u53f7\u5ef5\u65f3\u75f1".toCharArray();
                var32_3[1] = var33_8 = (long)ax.ooo00oo0Ooo0[377];
                while (true) {
                    if ((int)var32_3[1] >= ((char[])var31_6[20]).length) ** continue;
                    var26_9 = 1580022664;
                    v6 = (char[])var31_6[20];
                    v7 = (int)var32_3[1];
                    v8 = (char)((char)((char)((char)((char)((char)(v6[v7] + ax.ooo00oo0Ooo0[378]) ^ ax.ooo00oo0Ooo0[379]) - v7) + ax.ooo00oo0Ooo0[380]) + ax.ooo00oo0Ooo0[381]) - v7);
                    v6[v7] = (char)((char)((char)(v8 >>> ax.ooo00oo0Ooo0[382] | v8 << ax.ooo00oo0Ooo0[383]) + v7) - v7);
                    var32_3[1] = var33_8 = (long)((int)var32_3[1] + 1);
                }
            }
            var31_6[25] = SecretKeyFactory.getInstance(v2);
            var31_6[17] = new byte[ax.ooo00oo0Ooo0[385]];
            ((byte[])var31_6[17])[ax.ooo00oo0Ooo0[386]] = ax.ooo00oo0Ooo0[387];
            var27_10 = -1871664032;
            block29: while (true) {
                switch (var27_10) {
                    default: {
                        ((byte[])var31_6[17])[ax.ooo00oo0Ooo0[388]] = ax.ooo00oo0Ooo0[389];
                        ((byte[])var31_6[17])[ax.ooo00oo0Ooo0[390]] = ax.ooo00oo0Ooo0[391];
                        ((byte[])var31_6[17])[ax.ooo00oo0Ooo0[392]] = ax.ooo00oo0Ooo0[393];
                        var27_10 = 1616516772;
                        continue block29;
                    }
                    case 1616516772: {
                        ((byte[])var31_6[17])[ax.ooo00oo0Ooo0[394]] = ax.ooo00oo0Ooo0[395];
                        ((byte[])var31_6[17])[ax.ooo00oo0Ooo0[396]] = ax.ooo00oo0Ooo0[397];
                        ((byte[])var31_6[17])[ax.ooo00oo0Ooo0[398]] = ax.ooo00oo0Ooo0[399];
                        ((byte[])var31_6[17])[13] = 42;
                        ((byte[])var31_6[17])[15] = 83;
                        ((byte[])var31_6[17])[8] = -8;
                        ((byte[])var31_6[17])[0] = 111;
                        ((byte[])var31_6[17])[11] = 56;
                        ((byte[])var31_6[17])[10] = -103;
                        var27_10 = -11116590;
                        continue block29;
                    }
                    case -11116590: 
                }
                break;
            }
            ((byte[])var31_6[17])[4] = -83;
            ((byte[])var31_6[17])[6] = 104;
            ((byte[])var31_6[17])[5] = -51;
            var7_11 = new PBEKeySpec(new String((byte[])var31_6[21], StandardCharsets.UTF_8).toCharArray(), (byte[])var31_6[17], 17, 256);
            var31_6[22] = ((SecretKeyFactory)var31_6[25]).generateSecret(var7_11).getEncoded();
            v4 = (byte[])var31_6[22];
            ** while ((v3 = ax.O0OoOO0OOOOO[2]) != null)
lbl171:
            // 1 sources

            var31_6[20] = "\u95f6\u75fe\u5612".toCharArray();
            var32_3[1] = var33_8 = (long)0;
            while (true) {
                if ((int)var32_3[1] >= ((char[])var31_6[20]).length) ** continue;
                v9 = (char[])var31_6[20];
                v10 = (int)var32_3[1];
                v11 = ~((char)((char)((char)(~((char)(~v9[v10]))) + 51244) ^ 2398));
                v12 = (char)((char)((char)((char)((char)((char)(-((char)((char)(v11 << 3 | v11 >>> 13) - v10))) - 32292) ^ 36615) - 52842) ^ 40421) ^ 61759);
                v9[v10] = (char)((char)(v12 << 12 | v12 >>> 4) ^ 18632);
                var32_3[1] = var33_8 = (long)((int)var32_3[1] + 1);
            }
        }
        block31: while (true) {
            switch (var29_13) {
                default: {
                    v13 = (char[])var31_6[20];
                    v14 = (int)var32_3[1];
                    v15 = (char)((char)((char)(-((char)(v13[v14] - 21632))) + 23487) ^ 10803);
                    v16 = (char)((char)((char)(~((char)(v15 >>> 15 | v15 << 1))) + 52972) + 36413);
                    v17 = (char)((char)(v16 >>> 3 | v16 << 13) - 49148);
                    v18 = (char)(v17 >>> 1 | v17 << 15);
                    v13[v14] = (char)(v18 >>> 9 | v18 << 7);
                    var29_13 = -1289271255;
                    continue block31;
                }
                case -1289271255: {
                    var32_3[1] = var33_8 = (long)((int)var32_3[1] + 1);
                    ** continue;
                }
                case 1785471714: 
            }
            break;
        }
        v5 = new String((char[])var31_6[20]);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public ax() {
        int n2 = -2062943171;
        if (n2 != n2) {
            int cfr_ignored_0 = 31 + 85;
        }
        String string = o0Oo000O0oO;
        if (string == null) {
            int n3 = (ooo00oo0Ooo0[0] + ooo00oo0Ooo0[1]) * ooo00oo0Ooo0[2];
            string = o0Oo000O0oO = (String)0OOOoo00o0[n3 >>> ooo00oo0Ooo0[3] | n3 << ooo00oo0Ooo0[4]] + (String)0OOOoo00o0[ooo00oo0Ooo0[5] * ooo00oo0Ooo0[6] ^ ooo00oo0Ooo0[7]];
        }
        this.cq = Pattern.compile(string);
        this.ct = ei2 -> {
            int n2 = -2096984957;
            if (n2 != n2) {
                throw new SQLSyntaxErrorException();
            }
            int n3 = -175608449;
            if (cr) return;
            int n4 = -(ooo00oo0Ooo0[21] ^ ooo00oo0Ooo0[22]);
            if (ax.aER.bgK.aRg != -(n4 >>> ooo00oo0Ooo0[23] | n4 << ooo00oo0Ooo0[24]) || ahm.vC()) {
                // empty if block
            }
        };
        int n4 = -102942967;
        block3: while (true) {
            switch (n4) {
                default: {
                    this.cu = this::b;
                    this.cv = fa2 -> {
                        int n2 = 1041523620;
                        if (n2 != n2) {
                            throw null;
                        }
                        int n3 = ooo00oo0Ooo0[8] - ooo00oo0Ooo0[9] ^ ooo00oo0Ooo0[10];
                        cr = (n3 << ooo00oo0Ooo0[11] | n3 >>> ooo00oo0Ooo0[12]) - ooo00oo0Ooo0[13];
                        int n4 = -1354067225;
                        cs = null;
                    };
                    n4 = -1071597304;
                    continue block3;
                }
                case -1071597304: 
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void 0OOOoo00o0() {
        int n2 = -309502038;
        if (n2 != n2) {
        }
        ooo00oo0Ooo0 = new int[0xA098 ^ 0xA108];
        ax.ooo00oo0Ooo0[0x2472 ^ 0x240E] = 0x2417 ^ 0x240E;
        ax.ooo00oo0Ooo0[0x20C5 ^ 0x2043] = 0x2050 ^ 0x2043;
        ax.ooo00oo0Ooo0[0x82E5 ^ 0x82C2] = 0x82DB ^ 0x82C2;
        ax.ooo00oo0Ooo0[0x81F7 ^ 0x80B0] = 0xFC73 ^ 0x80B0;
        ax.ooo00oo0Ooo0[0xEFB1 ^ 0xEF7C] = 0xAF66 ^ 0xEF7C;
        ax.ooo00oo0Ooo0[0x363 ^ 0x302] = 0xFFFFFCCD ^ 0x302;
        ax.ooo00oo0Ooo0[0x4BC ^ 0x5A2] = 0xAA42 ^ 0x5A2;
        ax.ooo00oo0Ooo0[0xBC20 ^ 0xBC51] = 0xFFFF43A8 ^ 0xBC51;
        ax.ooo00oo0Ooo0[0x5626 ^ 0x5661] = 0x5664 ^ 0x5661;
        ax.ooo00oo0Ooo0[0x9D20 ^ 0x9CA5] = 0xFFFF636B ^ 0x9CA5;
        ax.ooo00oo0Ooo0[0x10AA ^ 0x11B1] = 0xFFFF2D2E ^ 0x11B1;
        ax.ooo00oo0Ooo0[0x5BD7 ^ 0x5B8D] = 0xA3A431 ^ 0x5B8D;
        ax.ooo00oo0Ooo0[0xC62 ^ 0xD17] = 0xD17 ^ 0xD17;
        ax.ooo00oo0Ooo0[0x7A09 ^ 0x7A7B] = 0x7B3B2C86 ^ 0x7A7B;
        ax.ooo00oo0Ooo0[0x38F7 ^ 0x38D4] = 0xFFFFC70F ^ 0x38D4;
        ax.ooo00oo0Ooo0[0x3407 ^ 0x34DB] = 0x1A8D ^ 0x34DB;
        ax.ooo00oo0Ooo0[0x1F46 ^ 0x1F7B] = 0xFFFFE0DA ^ 0x1F7B;
        ax.ooo00oo0Ooo0[0xA161 ^ 0xA119] = 0xA139 ^ 0xA119;
        ax.ooo00oo0Ooo0[0xEA11 ^ 0xEA09] = 0xEA16 ^ 0xEA09;
        ax.ooo00oo0Ooo0[0x109D ^ 0x1091] = 0x108E ^ 0x1091;
        int n3 = -216646567;
        block83: while (true) {
            switch (n3) {
                case -355004252: {
                    ax.ooo00oo0Ooo0[0xEDFD ^ 0xED26] = 0xC30F ^ 0xED26;
                    ax.ooo00oo0Ooo0[0x7B72 ^ 0x7A31] = 0xADE8 ^ 0x7A31;
                    ax.ooo00oo0Ooo0[0xC3E7 ^ 0xC264] = 0xFFFF3DEA ^ 0xC264;
                    n3 = -1191647648;
                    continue block83;
                }
                case -1191647648: {
                    ax.ooo00oo0Ooo0[0xCE0A ^ 0xCF0F] = 0x48CD ^ 0xCF0F;
                    n3 = -1071923278;
                    continue block83;
                }
                case -1071923278: {
                    ax.ooo00oo0Ooo0[0x3E8A ^ 0x3FE7] = 0x8FDC ^ 0x3FE7;
                    n3 = 994828346;
                    continue block83;
                }
                case 994828346: {
                    ax.ooo00oo0Ooo0[0xE0FB ^ 0xE1D6] = 0x1E586 ^ 0xE1D6;
                    ax.ooo00oo0Ooo0[0x8700 ^ 0x8752] = 0x877B ^ 0x8752;
                    ax.ooo00oo0Ooo0[0x1CA4 ^ 0x1C82] = 0x1C85 ^ 0x1C82;
                    ax.ooo00oo0Ooo0[0xFCED ^ 0xFC87] = 0xFFFF0362 ^ 0xFC87;
                    ax.ooo00oo0Ooo0[0x2760 ^ 0x2630] = 0xDB25 ^ 0x2630;
                    ax.ooo00oo0Ooo0[0xAD65 ^ 0xADEF] = 0xADF4 ^ 0xADEF;
                    ax.ooo00oo0Ooo0[0xCF36 ^ 0xCF00] = 0x7B66 ^ 0xCF00;
                    n3 = 1256325826;
                    continue block83;
                }
                case 1256325826: {
                    ax.ooo00oo0Ooo0[0xB7FE ^ 0xB7C1] = 0xFFFF483E ^ 0xB7C1;
                    ax.ooo00oo0Ooo0[0x42E6 ^ 0x42A3] = 0x42A0 ^ 0x42A3;
                    ax.ooo00oo0Ooo0[0x9FF ^ 0x9F1] = 0x9B2 ^ 0x9F1;
                    ax.ooo00oo0Ooo0[0x4476 ^ 0x444A] = 0x23026B8F ^ 0x444A;
                    ax.ooo00oo0Ooo0[0x4306 ^ 0x43E0] = 0xE37D ^ 0x43E0;
                    ax.ooo00oo0Ooo0[0x3585 ^ 0x3534] = 0x612B ^ 0x3534;
                    ax.ooo00oo0Ooo0[0x8E00 ^ 0x8E6E] = 0xFFFF720A ^ 0x8E6E;
                    ax.ooo00oo0Ooo0[0xBD0B ^ 0xBDB9] = 0xFFC7 ^ 0xBDB9;
                    ax.ooo00oo0Ooo0[0xEFD8 ^ 0xEF50] = 0xEF43 ^ 0xEF50;
                    n3 = -1906939908;
                    continue block83;
                }
                case -1906939908: {
                    ax.ooo00oo0Ooo0[0x4B9B ^ 0x4A13] = 0x4A1D ^ 0x4A13;
                    ax.ooo00oo0Ooo0[0x7F36 ^ 0x7E42] = 0x5ACF ^ 0x7E42;
                    ax.ooo00oo0Ooo0[0xBF34 ^ 0xBF52] = 0xBF27 ^ 0xBF52;
                    n3 = 869084262;
                    continue block83;
                }
                case 869084262: {
                    ax.ooo00oo0Ooo0[0xEFD0 ^ 0xEF6B] = 0x8B01 ^ 0xEF6B;
                    ax.ooo00oo0Ooo0[0x2068 ^ 0x203E] = 0x2D02F013 ^ 0x203E;
                    ax.ooo00oo0Ooo0[0x3182 ^ 0x3160] = 0x2389 ^ 0x3160;
                    ax.ooo00oo0Ooo0[0xE367 ^ 0xE379] = 0xE378 ^ 0xE379;
                    ax.ooo00oo0Ooo0[0xCB5A ^ 0xCBF8] = 0x8D9E6971 ^ 0xCBF8;
                    ax.ooo00oo0Ooo0[0xFDFC ^ 0xFC93] = 0xFFFFB313 ^ 0xFC93;
                    ax.ooo00oo0Ooo0[0x66EE ^ 0x67ED] = 0xF97B ^ 0x67ED;
                    ax.ooo00oo0Ooo0[0x649D ^ 0x6499] = 0x648C ^ 0x6499;
                    ax.ooo00oo0Ooo0[0x525C ^ 0x53D8] = 0x53DB ^ 0x53D8;
                    ax.ooo00oo0Ooo0[0xA1C7 ^ 0xA136] = 0x1A99F ^ 0xA136;
                    ax.ooo00oo0Ooo0[0xCD65 ^ 0xCC5F] = 0xEA08 ^ 0xCC5F;
                    ax.ooo00oo0Ooo0[0x1368 ^ 0x139E] = 9 ^ 0x139E;
                    ax.ooo00oo0Ooo0[0x8542 ^ 0x8451] = 0x49CC ^ 0x8451;
                    ax.ooo00oo0Ooo0[0xE6F1 ^ 0xE6BD] = 0xE682 ^ 0xE6BD;
                    ax.ooo00oo0Ooo0[0x12CF ^ 0x13C4] = 0xFFFF2413 ^ 0x13C4;
                    ax.ooo00oo0Ooo0[0xF463 ^ 0xF479] = 0xF478 ^ 0xF479;
                    ax.ooo00oo0Ooo0[0xAA5E ^ 0xAB07] = 0x620C ^ 0xAB07;
                    ax.ooo00oo0Ooo0[0xCECC ^ 0xCE14] = 0xFFFFC6E2 ^ 0xCE14;
                    ax.ooo00oo0Ooo0[0x9930 ^ 0x99DC] = 0xFFFF3F87 ^ 0x99DC;
                    ax.ooo00oo0Ooo0[0xA90E ^ 0xA86C] = 0x737F ^ 0xA86C;
                    n3 = 1463412748;
                    continue block83;
                }
                case 1463412748: {
                    ax.ooo00oo0Ooo0[0x7D30 ^ 0x7C3D] = 0x3041 ^ 0x7C3D;
                    ax.ooo00oo0Ooo0[0x6830 ^ 0x695E] = 0xD97A ^ 0x695E;
                    ax.ooo00oo0Ooo0[0xB338 ^ 0xB371] = 0xA4FAFCD4 ^ 0xB371;
                    n3 = 346628009;
                    continue block83;
                }
                case 346628009: {
                    ax.ooo00oo0Ooo0[0xD010 ^ 0xD155] = 0xAD90 ^ 0xD155;
                    ax.ooo00oo0Ooo0[0x1067E ^ 0x10625] = 0x10648 ^ 0x10625;
                    ax.ooo00oo0Ooo0[0xC8F3 ^ 0xC8D9] = 0xC8D9 ^ 0xC8D9;
                    ax.ooo00oo0Ooo0[0x2422 ^ 0x2413] = 0x241D ^ 0x2413;
                    ax.ooo00oo0Ooo0[0xFDB3 ^ 0xFDB5] = 0x69066DDC ^ 0xFDB5;
                    ax.ooo00oo0Ooo0[0x4A0F ^ 0x4ADA] = 0x16C1 ^ 0x4ADA;
                    n3 = -1874814306;
                    continue block83;
                }
                case -1874814306: {
                    ax.ooo00oo0Ooo0[0x23B3 ^ 0x2322] = 0xFFFFDCDD ^ 0x2322;
                    ax.ooo00oo0Ooo0[0xDBD9 ^ 0xDBBB] = 0xFFFF247A ^ 0xDBBB;
                    ax.ooo00oo0Ooo0[0x10483 ^ 0x1048B] = 0x7FFEFB05 ^ 0x1048B;
                    ax.ooo00oo0Ooo0[0xCD5A ^ 0xCC6B] = 0xF2A0 ^ 0xCC6B;
                    ax.ooo00oo0Ooo0[0x172B ^ 0x1610] = 0x3067 ^ 0x1610;
                    ax.ooo00oo0Ooo0[0x4E0C ^ 0x4E99] = 0xFFFFB16C ^ 0x4E99;
                    ax.ooo00oo0Ooo0[0xB388 ^ 0xB388] = 0xB3C3 ^ 0xB388;
                    ax.ooo00oo0Ooo0[0xDA85 ^ 0xDAC3] = 0xDAD8 ^ 0xDAC3;
                    n3 = -28088642;
                    continue block83;
                }
                case -28088642: {
                    ax.ooo00oo0Ooo0[0xA1DF ^ 0xA1D2] = 0xA1AF ^ 0xA1D2;
                    n3 = -1700793309;
                    continue block83;
                }
                case -1700793309: {
                    ax.ooo00oo0Ooo0[0xA2E3 ^ 0xA2EA] = 0xFFFF5D27 ^ 0xA2EA;
                    ax.ooo00oo0Ooo0[0x591D ^ 0x59FE] = 0x4B1C ^ 0x59FE;
                    ax.ooo00oo0Ooo0[0xEFFA ^ 0xEF4A] = 0xBB45 ^ 0xEF4A;
                    ax.ooo00oo0Ooo0[0x9EAA ^ 0x9E51] = 0x9C7D ^ 0x9E51;
                    n3 = 1923800114;
                    continue block83;
                }
                case 1923800114: {
                    ax.ooo00oo0Ooo0[0xD0C3 ^ 0xD051] = 0xEBF7C8C7 ^ 0xD051;
                    n3 = -1959077471;
                    continue block83;
                }
                case -1959077471: {
                    ax.ooo00oo0Ooo0[0x6599 ^ 0x64E1] = 0x64E0 ^ 0x64E1;
                    n3 = 1495085191;
                    continue block83;
                }
                case 1495085191: {
                    ax.ooo00oo0Ooo0[0xE6F ^ 0xF24] = 0xFFFF1E09 ^ 0xF24;
                    ax.ooo00oo0Ooo0[0x5DE2 ^ 0x5DE8] = 0xFFFFA217 ^ 0x5DE8;
                    ax.ooo00oo0Ooo0[0xD6C6 ^ 0xD62C] = 0x8F97 ^ 0xD62C;
                    ax.ooo00oo0Ooo0[0xA9BB ^ 0xA8CD] = 0xA8CD ^ 0xA8CD;
                    ax.ooo00oo0Ooo0[0xB56A ^ 0xB541] = 0xB541 ^ 0xB541;
                    ax.ooo00oo0Ooo0[0x94E8 ^ 0x95AA] = 0x425F ^ 0x95AA;
                    ax.ooo00oo0Ooo0[0xC72E ^ 0xC7FF] = 0x512A ^ 0xC7FF;
                    n3 = -1101488048;
                    continue block83;
                }
                case -1101488048: {
                    ax.ooo00oo0Ooo0[0xB262 ^ 0xB3EE] = 0xB3EC ^ 0xB3EE;
                    ax.ooo00oo0Ooo0[0x7308 ^ 0x7282] = 0x7285 ^ 0x7282;
                    ax.ooo00oo0Ooo0[0x1E54 ^ 0x1E22] = 0xFFFFE1BB ^ 0x1E22;
                    ax.ooo00oo0Ooo0[0x652C ^ 0x64AD] = 0x64BD ^ 0x64AD;
                    n3 = 387444552;
                    continue block83;
                }
                case 387444552: {
                    ax.ooo00oo0Ooo0[0x48F2 ^ 0x48DA] = 0x48DA ^ 0x48DA;
                    n3 = -732754288;
                    continue block83;
                }
                case -732754288: {
                    ax.ooo00oo0Ooo0[0x9529 ^ 0x9591] = 0xFFFFC8D5 ^ 0x9591;
                    ax.ooo00oo0Ooo0[0xC5D4 ^ 0xC5DB] = 0xC5D0 ^ 0xC5DB;
                    n3 = 1576992642;
                    continue block83;
                }
                case 1576992642: {
                    ax.ooo00oo0Ooo0[0x8E2A ^ 0x8E8F] = 0x8E92 ^ 0x8E8F;
                    ax.ooo00oo0Ooo0[0xEA8F ^ 0xEA46] = 0x2F3E ^ 0xEA46;
                    n3 = -210712131;
                    continue block83;
                }
                case -210712131: {
                    ax.ooo00oo0Ooo0[0xCA0B ^ 0xCAF5] = 0x8D2F ^ 0xCAF5;
                    ax.ooo00oo0Ooo0[0x9E3B ^ 0x9E46] = 0x9E41 ^ 0x9E46;
                    ax.ooo00oo0Ooo0[0x4A0B ^ 0x4A70] = 0x4A51 ^ 0x4A70;
                    ax.ooo00oo0Ooo0[0xAD33 ^ 0xAC1C] = 0x1A82D ^ 0xAC1C;
                    ax.ooo00oo0Ooo0[0xF8CD ^ 0xF8F9] = 0xF8F1 ^ 0xF8F9;
                    ax.ooo00oo0Ooo0[0xB60F ^ 0xB75A] = 0xE2ED ^ 0xB75A;
                    ax.ooo00oo0Ooo0[0xA50E ^ 0xA470] = 0xA478 ^ 0xA470;
                    ax.ooo00oo0Ooo0[0xCC81 ^ 0xCC65] = 0xFFFF2159 ^ 0xCC65;
                    ax.ooo00oo0Ooo0[0xFAA2 ^ 0xFA56] = 0x112F ^ 0xFA56;
                    ax.ooo00oo0Ooo0[0x8E0A ^ 0x8F5C] = 0xDAEC ^ 0x8F5C;
                    ax.ooo00oo0Ooo0[0xCE80 ^ 0xCEEB] = 0xFFFF36FC ^ 0xCEEB;
                    ax.ooo00oo0Ooo0[0x10DA7 ^ 0x10CEE] = 0x1E219 ^ 0x10CEE;
                    return;
                }
                default: {
                    ax.ooo00oo0Ooo0[0x1E9B ^ 0x1E31] = 0x55554B64 ^ 0x1E31;
                    n3 = -1498884188;
                    continue block83;
                }
                case -1498884188: {
                    ax.ooo00oo0Ooo0[0x104C1 ^ 0x104EF] = 0x1A851 ^ 0x104EF;
                    ax.ooo00oo0Ooo0[0xD369 ^ 0xD3E2] = 0xD395 ^ 0xD3E2;
                    ax.ooo00oo0Ooo0[0x4FD1 ^ 0x4EE6] = 0xFFFF7450 ^ 0x4EE6;
                    ax.ooo00oo0Ooo0[0x337F ^ 0x32F0] = 0xFFFFCD41 ^ 0x32F0;
                    ax.ooo00oo0Ooo0[0x2D13 ^ 0x2C11] = 0xB2B0 ^ 0x2C11;
                    n3 = 2029159292;
                    continue block83;
                }
                case 2029159292: {
                    ax.ooo00oo0Ooo0[0x3EF ^ 0x2E8] = 0x853D ^ 0x2E8;
                    ax.ooo00oo0Ooo0[0x72F3 ^ 0x721D] = 0x17AB6 ^ 0x721D;
                    ax.ooo00oo0Ooo0[0x778 ^ 0x73C] = 0x721 ^ 0x73C;
                    n3 = -1166565785;
                    continue block83;
                }
                case -1166565785: {
                    ax.ooo00oo0Ooo0[0xBE1 ^ 0xBF3] = 0xFFFFF446 ^ 0xBF3;
                    ax.ooo00oo0Ooo0[0x59B5 ^ 0x5955] = 0xFFFFF719 ^ 0x5955;
                    ax.ooo00oo0Ooo0[0x6094 ^ 0x60AF] = 0xFFFF9F50 ^ 0x60AF;
                    n3 = -162136919;
                    continue block83;
                }
                case -162136919: {
                    ax.ooo00oo0Ooo0[0x5244 ^ 0x534C] = 0xD48F ^ 0x534C;
                    ax.ooo00oo0Ooo0[0xF397 ^ 0xF2EE] = 0xF2EE ^ 0xF2EE;
                    ax.ooo00oo0Ooo0[0xF2FF ^ 0xF374] = 0xF305 ^ 0xF374;
                    ax.ooo00oo0Ooo0[0x32D6 ^ 0x3214] = 0xA35F ^ 0x3214;
                    n3 = -989397066;
                    continue block83;
                }
                case -989397066: {
                    ax.ooo00oo0Ooo0[0x5351 ^ 0x539F] = 0xC54B ^ 0x539F;
                    ax.ooo00oo0Ooo0[0x7A14 ^ 0x7B66] = 0x5FEB ^ 0x7B66;
                    ax.ooo00oo0Ooo0[0x963C ^ 0x96E1] = 0xB8C8 ^ 0x96E1;
                    ax.ooo00oo0Ooo0[0x100B9 ^ 0x10021] = 0x33323312 ^ 0x10021;
                    ax.ooo00oo0Ooo0[0xA99D ^ 0xA982] = 0xA985 ^ 0xA982;
                    ax.ooo00oo0Ooo0[0x7E75 ^ 0x7E35] = 0xFFFF8198 ^ 0x7E35;
                    ax.ooo00oo0Ooo0[0xB537 ^ 0xB548] = 0xB551 ^ 0xB548;
                    ax.ooo00oo0Ooo0[0x9838 ^ 0x992F] = 0xFFFF28B3 ^ 0x992F;
                    ax.ooo00oo0Ooo0[0x525C ^ 0x52A5] = 0x5085 ^ 0x52A5;
                    n3 = -22385328;
                    continue block83;
                }
                case -22385328: {
                    ax.ooo00oo0Ooo0[0x46B1 ^ 0x4787] = 0x82E6 ^ 0x4787;
                    n3 = -1370345976;
                    continue block83;
                }
                case -1370345976: {
                    ax.ooo00oo0Ooo0[0x3129 ^ 0x31B3] = 0x31AE ^ 0x31B3;
                    ax.ooo00oo0Ooo0[0xA407 ^ 0xA559] = 0x867D ^ 0xA559;
                    ax.ooo00oo0Ooo0[0xE2DE ^ 0xE282] = 0x3E708165 ^ 0xE282;
                    ax.ooo00oo0Ooo0[0x1043B ^ 0x104E2] = 0x1F399 ^ 0x104E2;
                    ax.ooo00oo0Ooo0[0x48B0 ^ 0x482B] = 0x4000482B ^ 0x482B;
                    ax.ooo00oo0Ooo0[0x106CB ^ 0x10791] = 0x1CE8A ^ 0x10791;
                    ax.ooo00oo0Ooo0[0xC4FB ^ 0xC4EB] = 0xFFFF3B58 ^ 0xC4EB;
                    n3 = -688841938;
                    continue block83;
                }
                case -688841938: {
                    ax.ooo00oo0Ooo0[0xC178 ^ 0xC16C] = 0xC16F ^ 0xC16C;
                    ax.ooo00oo0Ooo0[0x1070A ^ 0x10728] = 0xFFFEF8FF ^ 0x10728;
                    ax.ooo00oo0Ooo0[0x787D ^ 0x7979] = 0xE7D8 ^ 0x7979;
                    n3 = 1063905453;
                    continue block83;
                }
                case 1063905453: {
                    ax.ooo00oo0Ooo0[0x7433 ^ 0x749E] = 0x9EC89DCF ^ 0x749E;
                    ax.ooo00oo0Ooo0[0x3160 ^ 0x3070] = 0x7C0E ^ 0x3070;
                    ax.ooo00oo0Ooo0[0xAC80 ^ 0xAC48] = 0x691D ^ 0xAC48;
                    ax.ooo00oo0Ooo0[0xFE09 ^ 0xFE85] = 0xFFFF0145 ^ 0xFE85;
                    ax.ooo00oo0Ooo0[0xAC5A ^ 0xACEC] = 0xE7F ^ 0xACEC;
                    ax.ooo00oo0Ooo0[0x4DC0 ^ 0x4D5C] = 0xFFFFB2EB ^ 0x4D5C;
                    ax.ooo00oo0Ooo0[0x9568 ^ 0x95BA] = 0xC9A2 ^ 0x95BA;
                    ax.ooo00oo0Ooo0[0x1242 ^ 0x12AF] = 0x4B18 ^ 0x12AF;
                    ax.ooo00oo0Ooo0[0x760B ^ 0x769F] = 0xFFFF8954 ^ 0x769F;
                    ax.ooo00oo0Ooo0[0x35A8 ^ 0x34CF] = 0xFFFF8493 ^ 0x34CF;
                    n3 = -1138573561;
                    continue block83;
                }
                case -1138573561: {
                    ax.ooo00oo0Ooo0[0x4E7D ^ 0x4F02] = 0x4F0A ^ 0x4F02;
                    ax.ooo00oo0Ooo0[0xBBED ^ 0xBB6E] = 0xFFFF44BD ^ 0xBB6E;
                    ax.ooo00oo0Ooo0[0x2034 ^ 0x2076] = 0x206F ^ 0x2076;
                    ax.ooo00oo0Ooo0[0xF461 ^ 0xF558] = 0xD309 ^ 0xF558;
                    ax.ooo00oo0Ooo0[0x4F90 ^ 0x4F53] = 0xDE18 ^ 0x4F53;
                    n3 = -968428890;
                    continue block83;
                }
                case -968428890: {
                    ax.ooo00oo0Ooo0[0x18A0 ^ 0x185F] = 0x5FED ^ 0x185F;
                    ax.ooo00oo0Ooo0[0x14A3 ^ 0x15FE] = 0x36C3 ^ 0x15FE;
                    ax.ooo00oo0Ooo0[0xA672 ^ 0xA61E] = 0x97B483F3 ^ 0xA61E;
                    ax.ooo00oo0Ooo0[0x1038A ^ 0x102C7] = 0x1FFC9 ^ 0x102C7;
                    ax.ooo00oo0Ooo0[0x6864 ^ 0x683D] = 0x6834 ^ 0x683D;
                    n3 = -2097280325;
                    continue block83;
                }
                case -2097280325: {
                    ax.ooo00oo0Ooo0[0xE729 ^ 0xE79C] = 0xA5EC ^ 0xE79C;
                    ax.ooo00oo0Ooo0[0xC68E ^ 0xC68B] = 0xC82B ^ 0xC68B;
                    ax.ooo00oo0Ooo0[0x10F9E ^ 0x10F19] = 0x10F14 ^ 0x10F19;
                    n3 = -433807046;
                    continue block83;
                }
                case -433807046: {
                    ax.ooo00oo0Ooo0[0x1C73 ^ 0x1CC0] = 0x5EB0 ^ 0x1CC0;
                    n3 = -1862453011;
                    continue block83;
                }
                case -1862453011: {
                    ax.ooo00oo0Ooo0[0xB281 ^ 0xB3AB] = 0x5112 ^ 0xB3AB;
                    ax.ooo00oo0Ooo0[0x2662 ^ 0x273A] = 0x728A ^ 0x273A;
                    ax.ooo00oo0Ooo0[0x7223 ^ 0x7339] = 0xB013 ^ 0x7339;
                    ax.ooo00oo0Ooo0[0x4E7A ^ 0x4F1F] = 0xCD ^ 0x4F1F;
                    n3 = 606397354;
                    continue block83;
                }
                case 606397354: {
                    ax.ooo00oo0Ooo0[0x6A2A ^ 0x6AC3] = 0xCA57 ^ 0x6AC3;
                    n3 = 1467332056;
                    continue block83;
                }
                case 1467332056: {
                    ax.ooo00oo0Ooo0[0x758E ^ 0x75C0] = 0xFFFF8A3F ^ 0x75C0;
                    ax.ooo00oo0Ooo0[0xBD30 ^ 0xBC26] = 0xF27C ^ 0xBC26;
                    ax.ooo00oo0Ooo0[0xD815 ^ 0xD8A9] = 0xFFFF430B ^ 0xD8A9;
                    ax.ooo00oo0Ooo0[0xE56D ^ 0xE5ED] = 0xE5EA ^ 0xE5ED;
                    ax.ooo00oo0Ooo0[0x6806 ^ 0x68D5] = 0x34CE ^ 0x68D5;
                    ax.ooo00oo0Ooo0[0x1ABE ^ 0x1A84] = 0xFFFFE54F ^ 0x1A84;
                    n3 = -1841008903;
                    continue block83;
                }
                case -1841008903: {
                    ax.ooo00oo0Ooo0[0x8DD0 ^ 0x8D88] = 0x8D9F ^ 0x8D88;
                    n3 = -72017858;
                    continue block83;
                }
                case -72017858: {
                    ax.ooo00oo0Ooo0[0xA15E ^ 0xA167] = 0xDE30EC2E ^ 0xA167;
                    ax.ooo00oo0Ooo0[0xD1CD ^ 0xD149] = 0x6FD080E ^ 0xD149;
                    ax.ooo00oo0Ooo0[0x283A ^ 0x290E] = 0x17C9 ^ 0x290E;
                    n3 = 1537692999;
                    continue block83;
                }
                case 1537692999: {
                    ax.ooo00oo0Ooo0[0x87BA ^ 0x86CA] = 0x36EE ^ 0x86CA;
                    ax.ooo00oo0Ooo0[0x9467 ^ 0x956D] = 0x5D4E ^ 0x956D;
                    ax.ooo00oo0Ooo0[0xC1A7 ^ 0xC092] = 0x5E9 ^ 0xC092;
                    n3 = 1613804286;
                    continue block83;
                }
                case 1613804286: {
                    ax.ooo00oo0Ooo0[0x8687 ^ 0x86D2] = 0x86D9 ^ 0x86D2;
                    ax.ooo00oo0Ooo0[0xF3B5 ^ 0xF3E6] = 0x5C04BF1 ^ 0xF3E6;
                    n3 = -1785404151;
                    continue block83;
                }
                case -1785404151: {
                    ax.ooo00oo0Ooo0[0x9A76 ^ 0x9A59] = 0xD2AD ^ 0x9A59;
                    ax.ooo00oo0Ooo0[0x653A ^ 0x6594] = 0x6595 ^ 0x6594;
                    n3 = 415144376;
                    continue block83;
                }
                case 415144376: {
                    ax.ooo00oo0Ooo0[0xD9EE ^ 0xD9B9] = 0xD9D4 ^ 0xD9B9;
                    ax.ooo00oo0Ooo0[0x5A6F ^ 0x5A6D] = 0xFFFFA59A ^ 0x5A6D;
                    ax.ooo00oo0Ooo0[0x403B ^ 0x410B] = 0x1455E ^ 0x410B;
                    ax.ooo00oo0Ooo0[0x856E ^ 0x846F] = 0x1AC0 ^ 0x846F;
                    n3 = 993271239;
                    continue block83;
                }
                case 993271239: {
                    ax.ooo00oo0Ooo0[0x2B54 ^ 0x2A3D] = 0x653E ^ 0x2A3D;
                    ax.ooo00oo0Ooo0[0x7601 ^ 0x76DF] = 0x277F ^ 0x76DF;
                    n3 = 1137928232;
                    continue block83;
                }
                case 1137928232: {
                    ax.ooo00oo0Ooo0[0xD282 ^ 0xD265] = 0x72F1 ^ 0xD265;
                    ax.ooo00oo0Ooo0[0xB3E8 ^ 0xB2AC] = 0x6559 ^ 0xB2AC;
                    ax.ooo00oo0Ooo0[0x4923 ^ 0x48AD] = 0x48A1 ^ 0x48AD;
                    ax.ooo00oo0Ooo0[0x47D3 ^ 0x47FF] = 0x47F5 ^ 0x47FF;
                    ax.ooo00oo0Ooo0[0xE494 ^ 0xE432] = 0xE431 ^ 0xE432;
                    ax.ooo00oo0Ooo0[0xF0A3 ^ 0xF0EB] = 0xB6DB9EEF ^ 0xF0EB;
                    ax.ooo00oo0Ooo0[0x66B ^ 0x66C] = 0xFFFFF9CD ^ 0x66C;
                    ax.ooo00oo0Ooo0[0x79CB ^ 0x79D6] = 0x79CB ^ 0x79D6;
                    ax.ooo00oo0Ooo0[0x771E ^ 0x776B] = 0xFAFA8D90 ^ 0x776B;
                    ax.ooo00oo0Ooo0[0x3C3D ^ 0x3D1E] = 0x31CF ^ 0x3D1E;
                    ax.ooo00oo0Ooo0[0x9F9C ^ 0x9FB1] = 0x9FB7 ^ 0x9FB1;
                    ax.ooo00oo0Ooo0[0xDEEB ^ 0xDFE7] = 0x17C4 ^ 0xDFE7;
                    ax.ooo00oo0Ooo0[0x2EAB ^ 0x2E36] = 0x2E31 ^ 0x2E36;
                    n3 = -174379889;
                    continue block83;
                }
                case -174379889: {
                    ax.ooo00oo0Ooo0[0x1AB7 ^ 0x1AE8] = 0xFFFFE517 ^ 0x1AE8;
                    ax.ooo00oo0Ooo0[0x664E ^ 0x6694] = 0x48B5 ^ 0x6694;
                    ax.ooo00oo0Ooo0[0x1AA6 ^ 0x1BA0] = 0x9C63 ^ 0x1BA0;
                    ax.ooo00oo0Ooo0[0x94C7 ^ 0x95E0] = 0x7A9A ^ 0x95E0;
                    n3 = 865990408;
                    continue block83;
                }
                case 865990408: {
                    ax.ooo00oo0Ooo0[0xF2 ^ 0xD7] = 0xDC ^ 0xD7;
                    n3 = 881480853;
                    continue block83;
                }
                case 881480853: {
                    ax.ooo00oo0Ooo0[0xBF57 ^ 0xBF7E] = 0xBF7E ^ 0xBF7E;
                    n3 = -1811220695;
                    continue block83;
                }
                case -1811220695: {
                    ax.ooo00oo0Ooo0[0x69D5 ^ 0x6928] = 0x2EF1 ^ 0x6928;
                    n3 = 589076543;
                    continue block83;
                }
                case 589076543: {
                    ax.ooo00oo0Ooo0[0xAA43 ^ 0xAB5F] = 0x6875 ^ 0xAB5F;
                    ax.ooo00oo0Ooo0[0x24B3 ^ 0x24D4] = 0x24DF ^ 0x24D4;
                    ax.ooo00oo0Ooo0[0xC996 ^ 0xC9D5] = 0xC9D2 ^ 0xC9D5;
                    ax.ooo00oo0Ooo0[0x8F96 ^ 0x8EE1] = 0x8EE1 ^ 0x8EE1;
                    n3 = -1279343908;
                    continue block83;
                }
                case -1279343908: {
                    ax.ooo00oo0Ooo0[0x6732 ^ 0x6658] = 0x2947 ^ 0x6658;
                    ax.ooo00oo0Ooo0[0x9B00 ^ 0x9A7A] = 0x7AF1 ^ 0x9A7A;
                    ax.ooo00oo0Ooo0[0x6E34 ^ 0x6E37] = 0x6E3C ^ 0x6E37;
                    ax.ooo00oo0Ooo0[0xE488 ^ 0xE460] = 0xFFFFBB5F ^ 0xE460;
                    ax.ooo00oo0Ooo0[0xDF9E ^ 0xDEF5] = 0x9197 ^ 0xDEF5;
                    ax.ooo00oo0Ooo0[0x10683 ^ 0x10705] = 0x10704 ^ 0x10705;
                    ax.ooo00oo0Ooo0[0xC351 ^ 0xC274] = 0x2D4D ^ 0xC274;
                    ax.ooo00oo0Ooo0[0x832E ^ 0x8275] = 0x4B44 ^ 0x8275;
                    ax.ooo00oo0Ooo0[0xB212 ^ 0xB2E1] = 0x59B8 ^ 0xB2E1;
                    ax.ooo00oo0Ooo0[0x6AD4 ^ 0x6A60] = 0xFFFFD78B ^ 0x6A60;
                    ax.ooo00oo0Ooo0[0x25B8 ^ 0x24F2] = 0xCA1D ^ 0x24F2;
                    n3 = 98238518;
                    continue block83;
                }
                case 98238518: {
                    ax.ooo00oo0Ooo0[0xCF01 ^ 0xCF6C] = 0xFFFF30F9 ^ 0xCF6C;
                    ax.ooo00oo0Ooo0[0xEF66 ^ 0xEFB1] = 0x18CA ^ 0xEFB1;
                    ax.ooo00oo0Ooo0[0x3FA9 ^ 0x3FB2] = 0x7FFFC04D ^ 0x3FB2;
                    ax.ooo00oo0Ooo0[0x5341 ^ 0x524E] = 0xFFFFE1EA ^ 0x524E;
                    ax.ooo00oo0Ooo0[0x2989 ^ 0x29BB] = 0x29B9 ^ 0x29BB;
                    ax.ooo00oo0Ooo0[0x10396 ^ 0x102F5] = 0x1D9AB ^ 0x102F5;
                    ax.ooo00oo0Ooo0[0xB10F ^ 0xB1B1] = 0xB6B0 ^ 0xB1B1;
                    ax.ooo00oo0Ooo0[0xB3AC ^ 0xB2B5] = 0x7181 ^ 0xB2B5;
                    ax.ooo00oo0Ooo0[0xCDB6 ^ 0xCD96] = 0xFFFF3269 ^ 0xCD96;
                    ax.ooo00oo0Ooo0[0x7D3 ^ 0x705] = 0xF073 ^ 0x705;
                    ax.ooo00oo0Ooo0[0x1FD1 ^ 0x1F8C] = 0x1F9F ^ 0x1F8C;
                    ax.ooo00oo0Ooo0[0x7DFB ^ 0x7D82] = 0x7D9B ^ 0x7D82;
                    ax.ooo00oo0Ooo0[0x7154 ^ 0x7025] = 0x54BD ^ 0x7025;
                    ax.ooo00oo0Ooo0[0x41D0 ^ 0x41B3] = 0x41B6 ^ 0x41B3;
                    ax.ooo00oo0Ooo0[0x92CA ^ 0x9261] = 0x927E ^ 0x9261;
                    ax.ooo00oo0Ooo0[0x30F3 ^ 0x31E2] = 0xFC73 ^ 0x31E2;
                    ax.ooo00oo0Ooo0[0x7AE3 ^ 0x7A62] = 0x7A63 ^ 0x7A62;
                    ax.ooo00oo0Ooo0[0xC313 ^ 0xC22D] = 0x7313 ^ 0xC22D;
                    ax.ooo00oo0Ooo0[0x9B7E ^ 0x9B67] = 0x9B63 ^ 0x9B67;
                    ax.ooo00oo0Ooo0[0x7825 ^ 0x7964] = 0xAE9E ^ 0x7964;
                    ax.ooo00oo0Ooo0[0x9328 ^ 0x92AA] = 0x92A3 ^ 0x92AA;
                    ax.ooo00oo0Ooo0[0x2B87 ^ 0x2AFA] = 0xA335 ^ 0x2AFA;
                    ax.ooo00oo0Ooo0[0xC8DC ^ 0xC9B4] = 0x8675 ^ 0xC9B4;
                    n3 = -388561912;
                    continue block83;
                }
                case -388561912: {
                    ax.ooo00oo0Ooo0[0xF4CA ^ 0xF58C] = 0x895D ^ 0xF58C;
                    n3 = 156151234;
                    continue block83;
                }
                case 156151234: {
                    ax.ooo00oo0Ooo0[0xDCF5 ^ 0xDC5D] = 0x77D4B7F0 ^ 0xDC5D;
                    ax.ooo00oo0Ooo0[0x10112 ^ 0x10142] = 0xA25668B5 ^ 0x10142;
                    ax.ooo00oo0Ooo0[0xF120 ^ 0xF189] = 0xFFFF0E58 ^ 0xF189;
                    ax.ooo00oo0Ooo0[0x10949 ^ 0x109EE] = 0x109C1 ^ 0x109EE;
                    ax.ooo00oo0Ooo0[0xA647 ^ 0xA77B] = 0x812C ^ 0xA77B;
                    ax.ooo00oo0Ooo0[0xB26A ^ 0xB298] = 0xB298 ^ 0xB298;
                    ax.ooo00oo0Ooo0[0x395C ^ 0x39E1] = 0x5D8B ^ 0x39E1;
                    ax.ooo00oo0Ooo0[0x24BA ^ 0x2484] = 0xFFFFDB0F ^ 0x2484;
                    ax.ooo00oo0Ooo0[0x458F ^ 0x4593] = 0x4590 ^ 0x4593;
                    ax.ooo00oo0Ooo0[0x62A1 ^ 0x639C] = 0xD2BF ^ 0x639C;
                    ax.ooo00oo0Ooo0[0x2A84 ^ 0x2A1D] = 0x2A1E ^ 0x2A1D;
                    ax.ooo00oo0Ooo0[0x1070B ^ 0x10784] = 0xFFFEF85A ^ 0x10784;
                    ax.ooo00oo0Ooo0[0xE914 ^ 0xE89D] = 0xFFFF1748 ^ 0xE89D;
                    ax.ooo00oo0Ooo0[0xE647 ^ 0xE6D1] = 0x2D0236FC ^ 0xE6D1;
                    ax.ooo00oo0Ooo0[0xEC67 ^ 0xEC5F] = 0xEC5F ^ 0xEC5F;
                    n3 = 1656848280;
                    continue block83;
                }
                case 1656848280: {
                    ax.ooo00oo0Ooo0[0x6EF9 ^ 0x6ECA] = 0x6EC2 ^ 0x6ECA;
                    ax.ooo00oo0Ooo0[0x461B ^ 0x477A] = 0x9C69 ^ 0x477A;
                    ax.ooo00oo0Ooo0[0xF1D9 ^ 0xF1CE] = 0xF1CF ^ 0xF1CE;
                    ax.ooo00oo0Ooo0[0x478F ^ 0x4720] = 0x4720 ^ 0x4720;
                    n3 = -866917323;
                    continue block83;
                }
                case -866917323: {
                    ax.ooo00oo0Ooo0[0xAEB9 ^ 0xAF9F] = 0x40AD ^ 0xAF9F;
                    n3 = 1602885071;
                    continue block83;
                }
                case 1602885071: {
                    ax.ooo00oo0Ooo0[0x4AE5 ^ 0x4BEB] = 0x795 ^ 0x4BEB;
                    n3 = 210310108;
                    continue block83;
                }
                case 210310108: {
                    ax.ooo00oo0Ooo0[0x455 ^ 0x548] = 0xAAA2 ^ 0x548;
                    ax.ooo00oo0Ooo0[0x502D ^ 0x5044] = 0x504D ^ 0x5044;
                    n3 = -1370903734;
                    continue block83;
                }
                case -1370903734: {
                    ax.ooo00oo0Ooo0[0xF9FC ^ 0xF936] = 0xB926 ^ 0xF936;
                    n3 = -2103834167;
                    continue block83;
                }
                case -2103834167: {
                    ax.ooo00oo0Ooo0[0xC5E4 ^ 0xC57B] = 0xC527 ^ 0xC57B;
                    n3 = 1233318517;
                    continue block83;
                }
                case 1233318517: {
                    ax.ooo00oo0Ooo0[0x929D ^ 0x92A8] = 0x273F ^ 0x92A8;
                    ax.ooo00oo0Ooo0[0xEBCE ^ 0xEA49] = 0xEA4A ^ 0xEA49;
                    ax.ooo00oo0Ooo0[0x3A7E ^ 0x3B05] = 0xFFFFC4FA ^ 0x3B05;
                    ax.ooo00oo0Ooo0[0xE826 ^ 0xE906] = 0x46E6 ^ 0xE906;
                    n3 = -920599871;
                    continue block83;
                }
                case -920599871: {
                    ax.ooo00oo0Ooo0[0x1CC7 ^ 0x1DE3] = 0x115E ^ 0x1DE3;
                    ax.ooo00oo0Ooo0[0x10CA ^ 0x11E8] = 0x1D55 ^ 0x11E8;
                    ax.ooo00oo0Ooo0[0xC683 ^ 0xC7DF] = 0xEC4 ^ 0xC7DF;
                    ax.ooo00oo0Ooo0[0x9DF8 ^ 0x9C98] = 0xBFBC ^ 0x9C98;
                    ax.ooo00oo0Ooo0[0x5F16 ^ 0x5F21] = 0xA563 ^ 0x5F21;
                    n3 = -2109546704;
                    continue block83;
                }
                case -2109546704: {
                    ax.ooo00oo0Ooo0[0xC850 ^ 0xC9D0] = 0xC9D1 ^ 0xC9D0;
                    n3 = -192541579;
                    continue block83;
                }
                case -192541579: {
                    ax.ooo00oo0Ooo0[0x9FCC ^ 0x9F5C] = 0xFFFF60A3 ^ 0x9F5C;
                    ax.ooo00oo0Ooo0[0x4383 ^ 0x42AD] = 0x146F8 ^ 0x42AD;
                    ax.ooo00oo0Ooo0[0xF87E ^ 0xF82A] = 0x2A46B821 ^ 0xF82A;
                    ax.ooo00oo0Ooo0[0x35E1 ^ 0x35C0] = 0xF9C1BA5D ^ 0x35C0;
                    n3 = -1889087973;
                    continue block83;
                }
                case -1889087973: {
                    ax.ooo00oo0Ooo0[0xE062 ^ 0xE006] = 0xE01D ^ 0xE006;
                    ax.ooo00oo0Ooo0[0xD699 ^ 0xD678] = 0x87DE ^ 0xD678;
                    ax.ooo00oo0Ooo0[0xB983 ^ 0xB9DD] = 0xB9D0 ^ 0xB9DD;
                    ax.ooo00oo0Ooo0[0x4889 ^ 0x499B] = 0x8403 ^ 0x499B;
                    ax.ooo00oo0Ooo0[0xE408 ^ 0xE4C3] = 0xA4D9 ^ 0xE4C3;
                    ax.ooo00oo0Ooo0[0xBA18 ^ 0xBB74] = 0xF46B ^ 0xBB74;
                    n3 = 375699395;
                    continue block83;
                }
                case 375699395: {
                    ax.ooo00oo0Ooo0[0x129B ^ 0x13D4] = 0xEE91 ^ 0x13D4;
                    ax.ooo00oo0Ooo0[0x4EC8 ^ 0x4E4D] = 0x4E40 ^ 0x4E4D;
                    ax.ooo00oo0Ooo0[0x677 ^ 0x6CD] = 0x62A3 ^ 0x6CD;
                    ax.ooo00oo0Ooo0[0x81CF ^ 0x8141] = 0x8140 ^ 0x8141;
                    ax.ooo00oo0Ooo0[0x5DFE ^ 0x5CC6] = 0x99A7 ^ 0x5CC6;
                    ax.ooo00oo0Ooo0[0x3076 ^ 0x3086] = 0xFFFEC7D3 ^ 0x3086;
                    ax.ooo00oo0Ooo0[0x7DC9 ^ 0x7D70] = 0xDFEC ^ 0x7D70;
                    ax.ooo00oo0Ooo0[0x4FB0 ^ 0x4EA5] = 0xE9 ^ 0x4EA5;
                    ax.ooo00oo0Ooo0[0x5731 ^ 0x57F7] = 0x9288 ^ 0x57F7;
                    ax.ooo00oo0Ooo0[0x3AE3 ^ 0x3BC8] = 0xD908 ^ 0x3BC8;
                    ax.ooo00oo0Ooo0[0xDB46 ^ 0xDB07] = 0x10DB07 ^ 0xDB07;
                    ax.ooo00oo0Ooo0[0xA3A3 ^ 0xA3E9] = 0xFFFF5C16 ^ 0xA3E9;
                    ax.ooo00oo0Ooo0[0xD2B3 ^ 0xD244] = 0xFFFF3E62 ^ 0xD244;
                    ax.ooo00oo0Ooo0[0x467 ^ 0x558] = 0xB43F ^ 0x558;
                    ax.ooo00oo0Ooo0[0xE178 ^ 0xE050] = 0xF62 ^ 0xE050;
                    ax.ooo00oo0Ooo0[0x731F ^ 0x725F] = 0xC361 ^ 0x725F;
                    ax.ooo00oo0Ooo0[0x4A0E ^ 0x4A8C] = 0x4A93 ^ 0x4A8C;
                    ax.ooo00oo0Ooo0[0x599D ^ 0x594D] = 0xCF8C ^ 0x594D;
                    ax.ooo00oo0Ooo0[0x58A3 ^ 0x5814] = 0xFA88 ^ 0x5814;
                    ax.ooo00oo0Ooo0[0x6ACC ^ 0x6B82] = 0x9697 ^ 0x6B82;
                    ax.ooo00oo0Ooo0[0x998B ^ 0x99E3] = 0x99F6 ^ 0x99E3;
                    ax.ooo00oo0Ooo0[0x6720 ^ 0x67EC] = 0xFFFFD80D ^ 0x67EC;
                    ax.ooo00oo0Ooo0[0xC640 ^ 0xC717] = 0x92E7 ^ 0xC717;
                    ax.ooo00oo0Ooo0[0x5FB1 ^ 0x5F70] = 0x5874 ^ 0x5F70;
                    ax.ooo00oo0Ooo0[0x7537 ^ 0x7549] = 0x4D007549 ^ 0x7549;
                    ax.ooo00oo0Ooo0[0x3059 ^ 0x3039] = 0xE58B8C39 ^ 0x3039;
                    ax.ooo00oo0Ooo0[0xE67A ^ 0xE62B] = 0xE63C ^ 0xE62B;
                    ax.ooo00oo0Ooo0[0x6104 ^ 0x6037] = 0x5EDA ^ 0x6037;
                    ax.ooo00oo0Ooo0[0x76D6 ^ 0x76AC] = 0x76AB ^ 0x76AC;
                    ax.ooo00oo0Ooo0[0x1B8B ^ 0x1BFB] = 0xFFFFE418 ^ 0x1BFB;
                    ax.ooo00oo0Ooo0[0x6E4D ^ 0x6E89] = 0xFFFF0029 ^ 0x6E89;
                    ax.ooo00oo0Ooo0[0x9DBD ^ 0x9D52] = 0x195FB ^ 0x9D52;
                    ax.ooo00oo0Ooo0[0x8F3D ^ 0x8F82] = 0x8886 ^ 0x8F82;
                    ax.ooo00oo0Ooo0[0x1FBD ^ 0x1F34] = 0x1F31 ^ 0x1F34;
                    n3 = -1792574877;
                    continue block83;
                }
                case -1792574877: {
                    ax.ooo00oo0Ooo0[0xF754 ^ 0xF745] = 0xDFFF08F0 ^ 0xF745;
                    ax.ooo00oo0Ooo0[0xF71C ^ 0xF7D9] = 0x6692 ^ 0xF7D9;
                    n3 = -374779791;
                    continue block83;
                }
                case -374779791: {
                    ax.ooo00oo0Ooo0[0xC08B ^ 0xC080] = 0xC081 ^ 0xC080;
                    ax.ooo00oo0Ooo0[0x270 ^ 0x263] = 0x27E ^ 0x263;
                    ax.ooo00oo0Ooo0[0xBC39 ^ 0xBCAA] = 0xFFFF4327 ^ 0xBCAA;
                    ax.ooo00oo0Ooo0[0x20E5 ^ 0x2044] = 0x2035 ^ 0x2044;
                    n3 = 1387441852;
                    continue block83;
                }
                case 1387441852: {
                    ax.ooo00oo0Ooo0[0x7920 ^ 0x79CB] = 0x207C ^ 0x79CB;
                    n3 = 290795438;
                    continue block83;
                }
                case 290795438: {
                    ax.ooo00oo0Ooo0[0x61C2 ^ 0x613A] = 0x72AD ^ 0x613A;
                    ax.ooo00oo0Ooo0[0xBBFE ^ 0xBAAC] = 0xD280 ^ 0xBAAC;
                    ax.ooo00oo0Ooo0[0xDA88 ^ 0xDBDC] = 0xB3F0 ^ 0xDBDC;
                    ax.ooo00oo0Ooo0[0x7E08 ^ 0x7F1C] = 0xB284 ^ 0x7F1C;
                    n3 = 1819070008;
                    continue block83;
                }
                case 1819070008: {
                    ax.ooo00oo0Ooo0[0x94DA ^ 0x947E] = 0xEB2F4ACD ^ 0x947E;
                    ax.ooo00oo0Ooo0[0xB4EB ^ 0xB49C] = 0xFFFF4B09 ^ 0xB49C;
                    ax.ooo00oo0Ooo0[0x8312 ^ 0x835D] = 0x3CF34C60 ^ 0x835D;
                    ax.ooo00oo0Ooo0[0x4AF5 ^ 0x4A59] = 0x4A58 ^ 0x4A59;
                    ax.ooo00oo0Ooo0[0xE41E ^ 0xE532] = 0x78B ^ 0xE532;
                    ax.ooo00oo0Ooo0[0xC379 ^ 0xC349] = 0x9830 ^ 0xC349;
                    ax.ooo00oo0Ooo0[0x96B1 ^ 0x9654] = 0x84B6 ^ 0x9654;
                    ax.ooo00oo0Ooo0[0xE1ED ^ 0xE188] = 0x2540E188 ^ 0xE188;
                    n3 = -1086855461;
                    continue block83;
                }
                case -1086855461: {
                    ax.ooo00oo0Ooo0[0x4EC ^ 0x561] = 0xFFFFFA88 ^ 0x561;
                    n3 = 861098569;
                    continue block83;
                }
                case 861098569: {
                    ax.ooo00oo0Ooo0[0x6755 ^ 0x6781] = 0x3BCC ^ 0x6781;
                    ax.ooo00oo0Ooo0[0xC0A6 ^ 0xC1D5] = 0xE540 ^ 0xC1D5;
                    ax.ooo00oo0Ooo0[0x82EC ^ 0x8298] = 0x828D ^ 0x8298;
                    n3 = -1115996034;
                    continue block83;
                }
                case -1115996034: {
                    ax.ooo00oo0Ooo0[0xE0A1 ^ 0xE1C7] = 0xAE06 ^ 0xE1C7;
                    ax.ooo00oo0Ooo0[0xC6FE ^ 0xC7F7] = 0xFDC ^ 0xC7F7;
                    ax.ooo00oo0Ooo0[0xB904 ^ 0xB993] = 0xB996 ^ 0xB993;
                    n3 = -1366351801;
                    continue block83;
                }
                case -1366351801: {
                    ax.ooo00oo0Ooo0[0xE73A ^ 0xE65E] = 0x3D4D ^ 0xE65E;
                    n3 = -702170007;
                    continue block83;
                }
                case -702170007: {
                    ax.ooo00oo0Ooo0[0x845B ^ 0x8508] = 0xED7A ^ 0x8508;
                    ax.ooo00oo0Ooo0[0x464F ^ 0x466B] = 0x499E ^ 0x466B;
                    ax.ooo00oo0Ooo0[0xF9D1 ^ 0xF899] = 0x8448 ^ 0xF899;
                    ax.ooo00oo0Ooo0[0x3AA6 ^ 0x3A69] = 0xACBC ^ 0x3A69;
                    ax.ooo00oo0Ooo0[0x98E6 ^ 0x99FE] = 0xD7A4 ^ 0x99FE;
                    n3 = -1035714070;
                    continue block83;
                }
                case -1035714070: {
                    ax.ooo00oo0Ooo0[0xE08 ^ 0xEC8] = 0xFFFFF656 ^ 0xEC8;
                    n3 = 1973250157;
                    continue block83;
                }
                case 1973250157: {
                    ax.ooo00oo0Ooo0[0x4D4E ^ 0x4D58] = 0xFFFFB2A7 ^ 0x4D58;
                    ax.ooo00oo0Ooo0[0x474B ^ 0x4679] = 0x78BE ^ 0x4679;
                    ax.ooo00oo0Ooo0[0xE173 ^ 0xE03F] = 0xED0 ^ 0xE03F;
                    ax.ooo00oo0Ooo0[0x10E10 ^ 0x10E5D] = 0xFFFEF302 ^ 0x10E5D;
                    ax.ooo00oo0Ooo0[0x8AF4 ^ 0x8A33] = 0x4F4B ^ 0x8A33;
                    ax.ooo00oo0Ooo0[0xB2C0 ^ 0xB2B3] = 0xB2B8 ^ 0xB2B3;
                    n3 = 534311016;
                    continue block83;
                }
                case 534311016: {
                    ax.ooo00oo0Ooo0[0x98BB ^ 0x99BB] = 0xDE61 ^ 0x99BB;
                    ax.ooo00oo0Ooo0[0xBDB5 ^ 0xBD2B] = 0xBD32 ^ 0xBD2B;
                    ax.ooo00oo0Ooo0[0x1088F ^ 0x10850] = 0x159F6 ^ 0x10850;
                    ax.ooo00oo0Ooo0[0x26BF ^ 0x26D0] = 0xC0D4E1AB ^ 0x26D0;
                    ax.ooo00oo0Ooo0[0xA2F4 ^ 0xA2F5] = 0xFFFF5D40 ^ 0xA2F5;
                    ax.ooo00oo0Ooo0[0xC367 ^ 0xC238] = 0xE126 ^ 0xC238;
                    n3 = 1248096778;
                    continue block83;
                }
                case 1248096778: {
                    ax.ooo00oo0Ooo0[0x46F5 ^ 0x4600] = 0x559A ^ 0x4600;
                    ax.ooo00oo0Ooo0[0xE374 ^ 0xE25D] = 0xE0 ^ 0xE25D;
                    n3 = -1007366053;
                    continue block83;
                }
                case -1007366053: {
                    ax.ooo00oo0Ooo0[0x82D0 ^ 0x83CF] = 0xFFFFD3F1 ^ 0x83CF;
                    ax.ooo00oo0Ooo0[0x878C ^ 0x872C] = 0x8719 ^ 0x872C;
                    ax.ooo00oo0Ooo0[0xBBAF ^ 0xBB53] = 0xB964 ^ 0xBB53;
                    ax.ooo00oo0Ooo0[0xD5A3 ^ 0xD559] = 0xD76E ^ 0xD559;
                    ax.ooo00oo0Ooo0[0xD8C6 ^ 0xD9BA] = 0x246A ^ 0xD9BA;
                    n3 = -1186251471;
                    continue block83;
                }
                case -1186251471: 
            }
            ax.ooo00oo0Ooo0[0x83E ^ 0x82B] = 0xFFFFF7D7 ^ 0x82B;
            ax.ooo00oo0Ooo0[0x17C1 ^ 0x174C] = 0x1753 ^ 0x174C;
            ax.ooo00oo0Ooo0[0x6F01 ^ 0x6E20] = 0x628F ^ 0x6E20;
            ax.ooo00oo0Ooo0[0x7700 ^ 0x77A3] = 0x4F72B596 ^ 0x77A3;
            ax.ooo00oo0Ooo0[0x34B ^ 0x21A] = 0x6A27 ^ 0x21A;
            ax.ooo00oo0Ooo0[0xC321 ^ 0xC36A] = 0xFFFF3CB7 ^ 0xC36A;
            n3 = -355004252;
        }
    }
}

