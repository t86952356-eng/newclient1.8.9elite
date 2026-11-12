/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  lombok.Generated
 *  org.apache.commons.lang3.StringUtils
 */
package hackclient.rise;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import hackclient.rise.a;
import hackclient.rise.aea;
import hackclient.rise.aeg;
import hackclient.rise.aeh;
import hackclient.rise.aim;
import hackclient.rise.bi;
import java.lang.invoke.LambdaMetafactory;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.security.Key;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import lombok.Generated;
import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.f;
import net.minecraft.client.network.r;
import net.minecraft.init.Blocks;
import net.minecraft.scoreboard.d;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.h;
import net.minecraft.scoreboard.i;
import net.minecraft.util.an;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import org.apache.commons.lang3.StringUtils;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Exception performing whole class analysis ignored.
 */
public class ahm
implements aea {
    public static /* synthetic */ String aPB;
    public static /* synthetic */ String oo000o00Oo00;
    public static /* synthetic */ boolean aPH;
    private static /* synthetic */ int[] oOoO0OoOOOoO;
    public static /* synthetic */ Object[] o0O000O0O0O0;
    public static /* synthetic */ boolean aPM;
    public static /* synthetic */ String aPC;
    public static /* synthetic */ Map<String, aim> aPF;
    public static /* synthetic */ long aPD;
    public static /* synthetic */ String o0000000O000;
    public static /* synthetic */ String 0OOOoo00o0;
    public static /* synthetic */ int aPJ;
    public static /* synthetic */ String ooo00oo0Ooo0;
    public static /* synthetic */ Object[] ooO00oO0OoO0;
    public static /* synthetic */ long aPE;
    public static /* synthetic */ int aPO;
    public static /* synthetic */ String o0Oo000O0oO;
    public static /* synthetic */ Map<String, Boolean> aPT;
    public static /* synthetic */ String aPI;
    public static /* synthetic */ int aPG;
    public static /* synthetic */ Pattern aPA;
    public static /* synthetic */ Pattern aPw;
    public static /* synthetic */ int aPL;
    public static /* synthetic */ r aPU;
    public static /* synthetic */ Object aPN;
    public static /* synthetic */ String[] oooO0ooOOooO;
    public static /* synthetic */ Pattern aPz;
    public static /* synthetic */ String[] o0oO00oOO0oO;
    public static /* synthetic */ String o0o000o0O0o0;
    public static /* synthetic */ String Oo0o00000O00;
    public static /* synthetic */ Object aPQ;
    public static /* synthetic */ String oO00O0OO0ooO;
    public static /* synthetic */ Pattern aPx;
    public static /* synthetic */ String O0OoOO0OOOOO;
    public static /* synthetic */ Pattern aPy;
    public static /* synthetic */ Object aPK;
    public static /* synthetic */ Object oOO00OO0OOO0;
    public static /* synthetic */ int aPR;
    public static /* synthetic */ boolean aPS;
    public static /* synthetic */ String oO000O00OO00;
    public static /* synthetic */ String oOo00Oo0OOo0;
    public static /* synthetic */ String aPP;
    public static /* synthetic */ String 0oOOoOo0O00O;
    private static /* synthetic */ int oo0O0o0OOo0O;
    private static /* synthetic */ boolean o00O000OO00O;

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ boolean i(int n2, int n3) {
        boolean bl2;
        block18: {
            int n4 = -525058843;
            if (n4 != n4) {
                oo0O0o0OOo0O = n4 = 1103337428;
            }
            if ((n4 = -1968772834) != n4) {
                throw null;
            }
            int n5 = -933248071;
            block7: while (true) {
                switch (n5) {
                    default: {
                        if (ahm.c(n2, ~(-24 + 23), n3) != Blocks.cLj) break block18;
                    }
                    case -934181525: {
                        n5 = -2065998673;
                        continue block7;
                    }
                    case -2065998673: {
                        if (ahm.c(n2, ~-72 - -1 ^ 0x49, n3) == Blocks.cLf) {
                            int n6 = -335544323 >>> 3 | -335544323 << 29;
                            if (ahm.c(n2, -(n6 << 9 | n6 >>> 23) * 128207979, n3) == Blocks.cLf) {
                                n5 = 951282669;
                                continue block7;
                            }
                        }
                        break block18;
                    }
                    case 951282669: {
                        int n7 = ~-97;
                        if (ahm.c(n2, n7 >>> 5 | n7 << 27, n3) == Blocks.cLe) {
                            n5 = -1702819890;
                            continue block7;
                        }
                        break block18;
                    }
                    case -1702819890: {
                        int n9 = ~-1543503871;
                        n9 = (n9 << 5 | n9 >>> 27) - -53;
                        if (ahm.c(n2, n9 << 3 | n9 >>> 29, n3) == Blocks.cLc) {
                            break block7;
                        }
                        break block18;
                    }
                    case -1627158579: 
                }
                break;
            }
            if (ahm.c(n2, ~(-904203634 * -95 * 1643291835), n3) == Blocks.cLc) {
                bl2 = -949413824 * -95 + -63;
                return bl2;
            }
        }
        int n10 = 0 * -1875962727 * 266059921;
        bl2 = n10 >>> 5 | n10 << 27;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ boolean d(d d2) {
        int n2;
        int n3 = -294372184;
        if (n3 != n3) {
            oo0O0o0OOo0O = n3 = -2064505985;
        }
        if (d2.getPlayerName() != null) {
            int n4 = 841606233;
            block3: while (true) {
                switch (n4) {
                    default: {
                        n4 = -1163870211;
                        continue block3;
                    }
                    case -1163870211: 
                }
                break;
            }
            if (!d2.getPlayerName().startsWith((String)ooO00oO0OoO0[(187320 * -654471207 - 59) * 373475417 ^ 0xFFFFFFAD])) {
                int n5 = 0x80002A ^ 0xFFFFFFBF ^ 0xFFFFFF95;
                n2 = n5 << 9 | n5 >>> 23;
                return n2 != 0;
            }
        }
        int n6 = -(-0x60000009);
        n2 = (n6 >>> 29 | n6 << 3) ^ 0x4B;
        return n2 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ String aC(String string) {
        String string2;
        long l2;
        int n2 = -863341834;
        if (n2 != n2) {
            throw null;
        }
        long[] lArray = new long[5];
        String string3 = StringUtils.trimToEmpty((String)string);
        lArray[2] = l2 = -9137314067392619403L;
        int n3 = oOoO0OoOOOoO[340];
        int n4 = (n3 >>> oOoO0OoOOOoO[341] | n3 << oOoO0OoOOOoO[342]) * oOoO0OoOOOoO[343];
        long l3 = lArray[2];
        int n5 = -(-(oOoO0OoOOOoO[346] * oOoO0OoOOOoO[347]));
        lArray[2] = l2 = l3 ^ ((long)string3.indexOf(-oOoO0OoOOOoO[336] * oOoO0OoOOOoO[337] * oOoO0OoOOOoO[338] * oOoO0OoOOOoO[339]) << (n4 >>> oOoO0OoOOOoO[344] | n4 << oOoO0OoOOOoO[345]) ^ l3) & -1L << (n5 >>> oOoO0OoOOOoO[348] | n5 << oOoO0OoOOOoO[349]);
        int n6 = oOoO0OoOOOoO[350];
        if ((int)(lArray[2] >>> ((n6 >>> oOoO0OoOOOoO[351] | n6 << oOoO0OoOOOoO[352]) ^ oOoO0OoOOOoO[353] ^ oOoO0OoOOOoO[354])) >= 0) {
            int n7 = oOoO0OoOOOoO[358];
            string2 = string3.substring((-oOoO0OoOOOoO[355] ^ oOoO0OoOOOoO[356]) + oOoO0OoOOOoO[357], (int)(lArray[2] >>> (n7 >>> oOoO0OoOOOoO[359] | n7 << oOoO0OoOOOoO[360]) - oOoO0OoOOOoO[361] + oOoO0OoOOOoO[362]));
            return string2;
        }
        int n8 = 796529059;
        string2 = string3;
        return string2;
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ boolean a(g var0) {
        block23: {
            var8_1 = 1234441491;
            if (var8_1 != var8_1) {
                68 + 53;
            }
            if ((var8_1 = -1865145048) == var8_1) break block23;
            48 & 1;
            break block23;
lbl9:
            // 1 sources

            return (boolean)(~(82 - 83));
            while (true) {
                var6_3[4] = var0.SD().b(var0).iterator();
                block13: while (true) {
                    block21: {
                        block22: {
                            block24: {
                                block20: {
                                    if (!((Iterator)var6_3[4]).hasNext()) break block24;
                                    var4_4 = -1613660796;
                                    break block22;
lbl17:
                                    // 2 sources

                                    while (true) {
                                        var6_3[1] = (d)((Iterator)var6_3[4]).next();
                                        if ((d)var6_3[1] == null || ((d)var6_3[1]).getPlayerName() == null || ((d)var6_3[1]).getPlayerName().startsWith((String)ahm.ooO00oO0OoO0[-(-(-86 ^ -119))])) break block20;
                                        var5_5 = -676479454;
                                        break block21;
                                        break;
                                    }
lbl22:
                                    // 1 sources

                                    return (boolean)(~(~(-5382 * -587345955 - -47)));
                                }
                                var5_5 = -1649396288;
                                break block21;
                            }
                            var4_4 = -1140713917;
                            break block22;
lbl30:
                            // 1 sources

                            while (true) {
                                var4_4 = -581829904;
                                break block22;
                                break;
                            }
lbl33:
                            // 1 sources

                            return (boolean)((-3005 ^ -95) * -587345955 ^ 79 ^ 85);
                        }
                        switch (var4_4) {
                            default: {
                                ** GOTO lbl17
                            }
                            case -937163505: {
                                ** continue;
                            }
                            case -1140713917: {
                                ** continue;
                            }
                            ** case -581829904:
lbl44:
                            // 1 sources

                            ** continue;
                        }
                    }
                    switch (var5_5) {
                        default: {
                            ** continue;
                        }
                        ** case -1649396288:
lbl50:
                        // 1 sources

                        continue block13;
                    }
                    break;
                }
                break;
            }
        }
        var6_3 = new Object[5];
        var3_2 = -723395977;
        block18: while (true) {
            switch (var3_2) {
                default: {
                    if (var0 != null) ** continue;
                    var3_2 = 645148588;
                    continue block18;
                }
                case 645148588: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static /* bridge */ strictfp /* synthetic */ void a(HttpsURLConnection var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [1 : 237->276)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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
    }

    /*
     * Exception decompiling
     */
    public static /* bridge */ strictfp /* synthetic */ String c(String var0, String var1_1, String var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [25[CATCHBLOCK], 26[CATCHBLOCK], 3[TRYBLOCK], 13[TRYBLOCK], 15[TRYBLOCK]], but top level block is 17[TRYBLOCK]
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
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* bridge */ strictfp /* synthetic */ f d(String string, int n2, int n3) {
        int n4 = 588114537;
        if (n4 != n4) {
            int cfr_ignored_0 = 0x3C & 1;
        }
        Object[] objectArray = new Object[6];
        long[] lArray = new long[6];
        try {
            long l2;
            lArray[5] = l2 = 2089553636530710999L;
            long l3 = lArray[5];
            int n5 = 261930 + 91 + 123;
            lArray[5] = l2 = l3 ^ ((long)n2 << (0x7F ^ 0x3D) - -9 - 43 ^ l3) & -1L << (n5 >>> 13 | n5 << 19);
            objectArray[4] = string;
            objectArray[0] = (String)objectArray[4] + (String)ooO00oO0OoO0[((-2145048234 << 23 | -2145048234 >>> 9) ^ 0x39) * -69 * 89] + (int)(lArray[5] >>> ~(0xFFFFFF82 ^ 0x5D));
            int n6 = 0 >>> 15 | 0 << 17;
            f f2 = new f((String)objectArray[0], (String)objectArray[0], (n6 << 29 | n6 >>> 3) != 0);
            aPU.a(f2, n3);
            return f2;
        }
        catch (Exception objectArray[0]) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ boolean c(d d2) {
        int n2;
        int n3 = 1900077626;
        if (n3 != n3) {
        }
        if (d2.getPlayerName() != null && !d2.getPlayerName().startsWith((String)ooO00oO0OoO0[(601882619 << 11 | 601882619 >>> 21) * 1631000239 ^ 0xFFFFFF9F])) {
            int n4 = -(~8191);
            n2 = n4 >>> 13 | n4 << 19;
            return n2 != 0;
        }
        int n5 = ~-4353;
        int n6 = n5 << 27 | n5 >>> 5;
        n2 = (n6 << 29 | n6 >>> 3) + -17;
        return n2 != 0;
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ boolean vC() {
        block20: {
            block21: {
                var12 = 1629139169;
                if (var12 == var12) break block21;
                ahm.oo0O0o0OOo0O = var12 = 628278338;
                break block21;
lbl5:
                // 1 sources

                return (boolean)((v0 << ahm.oOoO0OoOOOoO[92] | v0 >>> ahm.oOoO0OoOOOoO[93]) - ahm.oOoO0OoOOOoO[94] ^ ahm.oOoO0OoOOOoO[95]);
lbl7:
                // 1 sources

                block9: while (true) {
                    block19: {
                        block22: {
                            var5_1 = -772607941;
                            break block22;
lbl10:
                            // 1 sources

                            while (true) {
                                var8_3[5] = var9_4 = 25307284275376491L;
                                v1 = var8_3[5];
                                var8_3[5] = var9_4 = v1 ^ ((long)(ahm.aER.bgK.aRg / (ahm.oOoO0OoOOOoO[96] * ahm.oOoO0OoOOOoO[97] * ahm.oOoO0OoOOOoO[98] - ahm.oOoO0OoOOOoO[99])) ^ v1) & -1L >>> -ahm.oOoO0OoOOOoO[100] * ahm.oOoO0OoOOOoO[101] * ahm.oOoO0OoOOOoO[102] + ahm.oOoO0OoOOOoO[103];
                                var7_2[3] = StringUtils.trimToEmpty((String)bi.dx);
                                v2 = ahm.oOoO0OoOOOoO[104] - ahm.oOoO0OoOOOoO[105];
                                v3 = var8_3[5];
                                v4 = ahm.oOoO0OoOOOoO[110] + ahm.oOoO0OoOOOoO[111];
                                var8_3[5] = var9_4 = v3 ^ ((long)bi.dy << ((v2 << ahm.oOoO0OoOOOoO[106] | v2 >>> ahm.oOoO0OoOOOoO[107]) + ahm.oOoO0OoOOOoO[108] ^ ahm.oOoO0OoOOOoO[109]) ^ v3) & -1L << (v4 >>> ahm.oOoO0OoOOOoO[112] | v4 << ahm.oOoO0OoOOOoO[113]);
                                if (ahm.aPK != ahm.aER.bgF) ** GOTO lbl31
                                var6_5 = -2041069613;
                                break block19;
                                break;
                            }
lbl22:
                            // 1 sources

                            while (true) {
                                if (ahm.aPG != (int)var8_3[5]) ** GOTO lbl31
                                var6_5 = 21681008;
                                break block19;
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                v5 = ahm.oOoO0OoOOOoO[114];
                                v6 = (v5 << ahm.oOoO0OoOOOoO[115] | v5 >>> ahm.oOoO0OoOOOoO[116]) ^ ahm.oOoO0OoOOOoO[117];
                                if (ahm.aPJ == (int)(var8_3[5] >>> (v6 << ahm.oOoO0OoOOOoO[118] | v6 >>> ahm.oOoO0OoOOOoO[119])) && StringUtils.equals((CharSequence)ahm.aPI, (CharSequence)((String)var7_2[3]))) {
                                    return ahm.aPH;
                                }
lbl31:
                                // 4 sources

                                var6_5 = -2001226811;
                                break block19;
                                break;
                            }
lbl33:
                            // 1 sources

                            while (true) {
                                ahm.aPH = ahm.vD();
                                ahm.aPG = (int)var8_3[5];
                                ahm.aPI = (String)var7_2[3];
                                var6_5 = -184002853;
                                break block19;
                                break;
                            }
lbl39:
                            // 1 sources

                            while (true) {
                                ahm.aPJ = (int)(var8_3[5] >>> (ahm.oOoO0OoOOOoO[120] ^ ahm.oOoO0OoOOOoO[121]) * ahm.oOoO0OoOOOoO[122] + ahm.oOoO0OoOOOoO[123]);
                                ahm.aPK = ahm.aER.bgF;
                                return ahm.aPH;
                            }
                        }
lbl44:
                        // 2 sources

                        while (true) {
                            switch (var5_1) {
                                case -772607941: {
                                    ** continue;
                                }
                                default: {
                                    continue block9;
                                }
                            }
                            break;
                        }
                    }
                    switch (var6_5) {
                        default: {
                            ** continue;
                        }
                        case 21681008: {
                            ** continue;
                        }
                        case -2001226811: {
                            ** continue;
                        }
                        ** case -184002853:
lbl59:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
lbl60:
                // 2 sources

                while (true) {
                    var7_2 = new Object[7];
                    var8_3 = new long[7];
                    if (ahm.aER != null) {
                        var5_1 = 227120231;
                        ** continue;
                    }
                    break block20;
                    break;
                }
                ** while (ahm.aER.bgK != null && ahm.aER.bgF != null)
lbl68:
                // 1 sources

                break block20;
            }
            if ((var12 = 718812810) == var12 || -1169209439 == 0) ** GOTO lbl60
            ** while (true)
        }
        v0 = ahm.oOoO0OoOOOoO[90] * ahm.oOoO0OoOOOoO[91];
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ String ci(String string) {
        int n2 = -480362718;
        if (n2 != n2) {
            n2 = 298584643;
        }
        if ((n2 = 794201970) != n2) {
            n2 = -36742981;
        }
        Object[] objectArray = new Object[5];
        objectArray[0] = aPx.matcher(string);
        if (((Matcher)objectArray[0]).matches()) {
            int n3 = oOoO0OoOOOoO[388];
            objectArray[1] = ((Matcher)objectArray[0]).group(-(n3 << oOoO0OoOOOoO[389] | n3 >>> oOoO0OoOOOoO[390]));
            StringBuilder stringBuilder = new StringBuilder();
            String string2 = Oo0o00000O00;
            String string3 = string2;
            if (string2 != null) return ahm.c(string, stringBuilder.append(string3).append((Object)((String)objectArray[1])).toString(), (String)ooO00oO0OoO0[(0xFFFFFF87 ^ 0xFFFFFFDD) - 35]);
            int n4 = oOoO0OoOOOoO[391];
            int n5 = oOoO0OoOOOoO[397];
            int n6 = ~(n5 << oOoO0OoOOOoO[398] | n5 >>> oOoO0OoOOOoO[399]);
            string3 = Oo0o00000O00 = (String)ooO00oO0OoO0[((n4 >>> oOoO0OoOOOoO[392] | n4 << oOoO0OoOOOoO[393]) ^ oOoO0OoOOOoO[394] ^ oOoO0OoOOOoO[395]) * oOoO0OoOOOoO[396]] + (String)ooO00oO0OoO0[-(n6 >>> 3 | n6 << 29)];
            return ahm.c(string, stringBuilder.append(string3).append((Object)((String)objectArray[1])).toString(), (String)ooO00oO0OoO0[(0xFFFFFF87 ^ 0xFFFFFFDD) - 35]);
        }
        objectArray[2] = aPy.matcher(string);
        int n7 = ((Matcher)objectArray[2]).matches() ? 724648865 : -385923383;
        switch (n7) {
            default: {
                objectArray[3] = ((Matcher)objectArray[2]).group(~(-3 - -1));
                StringBuilder stringBuilder = new StringBuilder();
                String string4 = oO00O0OO0ooO;
                String string5 = string4;
                if (string4 != null) return ahm.c(string, stringBuilder.append(string5).append((Object)((String)objectArray[3])).toString(), (String)ooO00oO0OoO0[-(-150 + 111)]);
                int n8 = 105984 * -373475417;
                string5 = oO00O0OO0ooO = (String)ooO00oO0OoO0[n8 << 23 | n8 >>> 9] + (String)ooO00oO0OoO0[-(-138547332) * -31];
                return ahm.c(string, stringBuilder.append(string5).append((Object)((String)objectArray[3])).toString(), (String)ooO00oO0OoO0[-(-150 + 111)]);
            }
            case -385923383: 
        }
        return null;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var28 = -678268025;
        if (var28 != var28) {
            58 + 76;
        }
        if ((var28 = 799327005) != var28) {
            throw new SQLIntegrityConstraintViolationException();
        }
        var28 = 1344313039;
        if (var28 != var28) {
            62 & 1;
        }
        if ((var28 = -1909299700) != var28) {
        }
        if ((var28 = 216751653) != var28) {
            throw null;
        }
        var23_5 = new Object[23];
        var24_6 = new long[23];
        ahm.0OOOoo00o0();
        ahm.o0oO00oOO0oO = new String[4];
        ahm.oooO0ooOOooO = new String[1];
        ahm.ooO00oO0OoO0 = new Object[~(-101 ^ 93)];
        var19_1 = -1182731055;
        var24_6[5] = var25_7 = 2202226829050509676L;
        v0 = var24_6[5];
        var24_6[5] = var25_7 = v0 ^ ((long)(~(1926714301 * 107)) << ~(-63 ^ -17) + 79 ^ v0) & -1L << ~(1467900216 * -79) + -39;
        v1 = ahm.oooO0ooOOooO[0];
        if (v1 == null) {
            v2 = ahm.o0oO00oOO0oO[0];
            if (v2 == null) {
                var23_5[7] = "\u2ca3\u2722\u2461\u2960\u30df\u229e\u235d\u22dc\u2c5b\u295a\u2359\u3158\u2fd7\u3096\u31d5\u2f14\u23d3\u2492\u3311\u2a50\u34cf\u298e\u2c0d\u244c\u2fcb\u248a\u2c89\u2308\u2807\u2f46\u3245\u2a44\u22c3\u3142\u2841\u3100\u2a3f\u323e\u28fd\u29fc\u2afb\u327a\u2cb9\u2338\u3377\u2276\u2475\u2cb4\u22f3\u30b2\u3271\u28f0\u2b2f\u29ae\u24ad\u34ec\u34ab\u2a2a\u2b69\u3328\u3367\u2d26\u31a5\u33a4\u27e3\u24e2\u27a1\u2320\u2c5f\u249e\u2d1d\u2a1c\u281b\u2a5a\u2f19\u2ad8\u27d7\u3196\u2bd5\u3494\u3493\u3212\u31d1\u2390\u344f\u23ce\u238d\u2d0c\u27cb\u328a\u2789\u2cc8\u3187\u2706\u2945\u2ac4\u3183\u2b02\u32c1\u3180\u23bf\u29fe\u24bd\u33fc\u327b\u26ba\u31f9\u24b8\u2cb7\u34b6\u2975\u3434\u3333\u2fb2\u2fb1\u2c30\u2eaf\u26ee\u302d\u232c\u2feb\u29aa\u29e9\u30e8\u2ae7\u2f66\u2aa5\u2fe4\u22e3\u28e2\u30e1\u2b60\u311f\u2c1e\u289d\u2c9c\u279b\u2b1a\u2359\u2718\u2f17\u26d6\u31d5\u3314\u2353\u2452\u33d1\u33d0\u2a0f\u328e\u324d\u2c0c\u2b0b\u278a\u2989\u2848\u2287\u2bc6\u2a05\u2844\u2ac3\u2202\u2b41\u2b00\u273f\u2b3e\u2bfd\u243c\u243b\u28fa\u2fb9\u2778\u2ff7\u2cb6\u3475\u2ef4\u2973\u2b72\u2af1\u2430\u30af\u336e\u28ed\u342c\u34ab\u32ea\u3329\u2968\u28a7\u3226\u33e5\u3364\u2ca3\u28e2\u3221\u3160\u32df\u235e\u275d\u299c\u2a1b\u2eda\u31d9\u2298\u2857\u20d6\u3055\u30d4\u2c93\u31d2\u2951\u2f10\u2c0f\u300e\u21cd\u268c\u30cb\u334a\u2789\u31c8\u2987\u2986\u2385\u32c4\u3083\u2c02\u2fc1\u2e80\u29bf\u2bbe\u323d\u273c\u22fb\u29fa\u31b9\u31f8\u31f7\u2876\u26f5\u3474\u23b3\u2672\u21b1\u3230\u242f\u332e\u33ed\u2c6c\u342b\u28aa\u2ee9\u20a8\u28a7\u3266\u3325\u3064\u2e23\u3362\u2621\u2be0\u2a1f\u309e\u321d\u27dc\u2b5b\u235a\u31d9\u2c18\u2257\u2bd6\u2695\u2414\u3253\u3012\u2191\u2b10\u334f\u2c0e\u208d\u2ecc\u2c4b\u21ca\u2349\u2c48\u3007\u28c6\u2e85\u22c4\u33c3\u29c2\u3101\u2ac0\u263f\u26fe\u2ffd\u327c\u217b\u337a\u2bb9\u3378\u2837\u31f6\u2835\u21b4\u33f3\u2e32\u28b1\u2a30\u28ef\u2aee\u2bed\u21ac\u29eb\u32aa\u22e9\u3428\u2e67\u2de6\u2ba5\u23e4\u33a3\u3262\u2f61\u28a0\u2a1f\u279e\u265d\u315c\u325b\u339a\u2399\u26d8\u3217\u2b96\u2195\u28d4\u23d3\u32d2\u2e11\u2e10\u238f\u268e\u290d\u214c\u334b\u2f4a\u2649\u2308\u2bc7\u29c6\u2a05\u27c4\u2dc3\u2802\u2301\u2900\u297f\u213e\u2dbd\u27bc\u32bb\u313a\u2ff9\u2db8\u2237\u26f6\u21b5\u2134\u2773\u3272\u32b1\u3070\u32af\u2fae\u2ded\u31ac\u2fab\u29ea\u2869\u26a8\u2f67\u2ae6\u2ee5\u29a4\u2f63\u2362\u2ea1\u2020\u321f\u2d9e\u21dd\u2e1c\u291b\u321a\u2ad9\u22d8\u26d7\u2156\u2195\u2f54\u3053\u2b52\u3311\u2190\u2d8f\u22ce\u228d\u270c\u2ecb\u230a\u2e49\u2e08\u3147\u3346\u3005\u2bc4\u2f03\u2382\u2701\u3200\u2ebf\u257e\u273d\u28bc\u25fb\u2afa\u2ef9\u25b8\u2777\u2776\u21b5\u26b4\u21f3\u2ef2\u2371\u3230\u26af\u302e\u2aed\u2fec\u22eb\u29ea\u3269\u25a8\u28a7\u2de6\u30e5\u25a4\u3023\u2322\u2821\u3060\u26df\u305e\u215d\u27dc\u2edb\u269a\u20d9\u2718\u3017\u2256\u2e95\u2594\u2553\u26d2\u32d1\u21d0\u298f\u310e\u28cd\u324c\u284b\u228a\u3209\u2b88\u2a47\u2206\u2e05\u2784\u3103\u2b82\u2781\u2800\u30bf\u277e\u31bd\u303c\u21bb\u30ba\u2d79\u32b8\u2f37\u25f6\u22f5\u2b34\u2fb3\u30f2\u28b1\u2570\u2b6f\u2f6e\u22ad\u22ac\u1fab\u30ea\u3369\u21a8\u21a7\u2126\u21a5\u3364\u22e3\u3162\u28a1\u25a0\u215f\u215e\u2d1d\u2e9c\u229b\u255a\u2e99\u3158\u2f57\u26d6\u2d55\u29d4\u2a13\u2992\u2a91\u3210\u284f\u280e\u28cd\u32cc\u278b\u324a\u3309\u2508\u3147\u2fc6\u2a05\u2904\u2883\u26c2\u3101\u2e40\u2aff\u27be\u32bd\u253c\u213b\u2e3a\u26f9\u2678\u32f7\u27b6\u2575\u2ff4\u2cf3\u2e72\u22f1\u27f0\u262f\u222e\u31ed\u216c\u292b\u1f6a\u26e9\u2da8\u2fe7\u3026\u2e25\u3264\u2d63\u2d62\u2121\u3120\u305f\u2b1e\u225d\u2e1c\u315b\u229a\u2219\u29d8\u2ed7\u2116\u2295\u32d4\u31d3\u2952\u3011\u3050\u208f\u22ce\u300d\u224c\u2b0b\u2d0a\u2fc9\u2748\u3007\u1f46\u24c5\u1f44\u2643\u2fc2\u2601\u2280\u31ff\u25be\u25bd\u30bc\u297b\u203a\u2279\u2178\u2037\u2e36\u32f5\u2df4\u2073\u3232\u21b1\u2270\u266f\u262e\u306d\u2a2c\u2ceb\u2daa\u2fe9\u2a28\u2f67\u2666\u1f25\u21a4\u2823\u24a2\u2821\u32a0\u295f\u27de\u285d\u201c\u295b\u2a9a\u3059\u2958\u3157\u1f16\u3115\u2614\u21d3\u3192\u31d1\u2610\u2f8f\u2f8e\u270d\u278c\u290b\u250a\u29c9\u3208\u2647\u3246\u2545\u2cc4\u2943\u2882\u2041\u3000\u2fbf\u20be\u20bd\u323c\u267b\u327a\u28b9\u31b8\u3237\u31f6\u3275\u21b4\u2833\u2132\u2ab1\u28f0\u212f\u312e\u20ed\u276c\u28eb\u2dea\u2969\u2628\u3127\u2126\u2e25\u27a4\u3123\u2462\u30a1\u2720\u279f\u2f5e\u2cdd\u2e5c\u275b\u2f1a\u26d9\u2698\u2957\u2e56\u2215\u30d4\u2c93\u2992\u2611\u2050\u2c8f\u2d4e\u1fcd\u2d8c\u2ecb\u218a\u3189\u2c48\u2cc7\u2606\u2f85\u2244\u2883\u3042\u2481\u3140\u2cff\u303e\u1ffd\u287c\u2fbb\u327a\u3239\u20b8\u31b7\u2636\u30b5\u1eb4\u2e73\u3072\u2db1\u2c30\u25ef\u2fae\u2c6d\u246c\u306b\u31ea\u2a69\u24e8\u2727\u2226\u2725\u26e4\u25a3\u2e22\u2c21\u2420\u321f\u299e\u265d\u309c\u24db\u251a\u2f19\u2c18\u2cd7\u2896\u3155\u2e94\u28d3\u3212\u1e91\u2510\u298f\u284e\u314d\u284c\u298b\u2a4a\u3149\u27c8\u1f87\u2786\u2d05\u2904\u2083\u29c2\u2c81\u28c0\u27ff\u28fe\u323d\u303c\u1e7b\u25ba\u2679\u2778\u2977\u28b6\u27f5\u2034\u1ff3\u2a32\u2e31\u30f0\u2e6f\u266e\u2fed\u2f2c\u2e2b\u2a2a\u24a9\u2468\u2827\u2c66\u2525\u2f64\u2123\u3162\u29a1\u2de0\u315f\u205e\u2cdd\u299c\u251b\u28da\u2899\u1e58\u3217\u2496\u30d5\u1e54\u1f93\u2952\u3111\u2790\u1f4f\u1fce\u2c8d\u2fcc\u2f4b\u210a\u3009\u2908\u28c7\u3006\u20c5\u2784\u2ec3\u2682\u2981\u2c80\u1fff\u2d3e\u307d\u253c\u2efb\u1f3a\u1ff9\u2638\u2e77\u24b6\u27f5\u2434\u2873\u27b2\u2e71\u31b0\u25ef\u23ae\u282d\u31ac\u2ceb\u2cea\u2ba9\u2468\u25a7\u2026\u2965\u2764\u2563\u2ce2\u23a1\u31a0\u23df\u311e\u251d\u29dc\u2d1b\u241a\u2559\u2b98\u2817\u2c16\u2895\u2154\u2693\u2f52\u2451\u2750\u314f\u2e4e\u290d\u2e0c\u2d4b\u29ca\u2149\u3108\u31c7\u2486\u3185\u3044\u2483\u2142\u2c41\u2e40\u2c7f\u2ebe\u2d7d\u267c\u2b7b\u237a\u28b9\u2d38\u24b7\u24f6\u1df5\u27b4\u26b3\u3172\u2031\u31b0\u27ef\u246e\u2c6d\u306c\u25eb\u2dea\u2be9\u1fa8\u2767\u25e6\u1fa5\u28e4\u3163\u2562\u24a1\u2ea0\u279f\u251e\u2c1d\u259c\u2ddb\u209a\u2f19\u2e98\u2bd7\u2156\u2b55\u2894\u1fd3\u2352\u2cd1\u3010\u23cf\u260e\u1fcd\u304c\u204b\u278a\u2c09\u2788\u2fc7\u24c6\u28c5\u24c4\u2c83\u1dc2\u3141\u24c0\u24ff\u297e\u233d\u297c\u30fb\u1efa\u1ef9\u2bb8\u20b7\u1f76\u24b5\u1db4\u2e73\u2932\u2671\u1ff0\u1eef\u23ee\u1dad\u302c\u20ab\u24ea\u2f69\u2fa8\u2c27\u1ee6\u1f25\u2ea4\u2563\u23a2\u2c61\u2f20\u275f\u255e\u1e9d\u2d9c\u2c9b\u309a\u1ed9\u3018\u1e97\u1e96\u3115\u2f94\u30d3\u2692\u2351\u2e50\u258f\u1d8e\u1f8d\u2c8c\u264b\u1d8a\u23c9\u2f88\u25c7\u2006\u1fc5\u23c4\u2683\u2c02\u30c1\u2500\u1f7f\u2f3e\u2cbd\u2d7c\u2dbb\u303a\u2b39\u1fb8\u1ef7\u2d36\u2075\u2fb4\u2c33\u2d32\u2f71\u2cf0\u2c6f\u302e\u1f6d\u236c\u22eb\u1f6a\u1e69\u2828\u2367\u2026\u2ce5\u2464\u2c23\u2ea2\u2d61\u2da0\u1fdf\u24de\u24dd\u285c\u259b\u245a\u2819\u2bd8\u2c97\u30d6\u2dd5\u2854\u2f93\u2c52\u2311\u2d90\u200f\u304e\u208d\u1d4c\u268b\u300a\u2749\u2748\u2bc7\u2386\u2005\u2004\u2403\u30c2\u24c1\u26c0\u24bf\u22be\u2fbd\u2dfc\u2c7b\u2cba\u2079\u2c38\u2837\u2036\u2e75\u2434\u2ff3\u2cb2\u2df1\u2d70\u232f\u2c2e\u266d\u25ac\u1eeb\u272a\u2069\u22a8\u2067\u24a6\u23a5\u30a4\u25a3\u2822\u23a1\u2620\u235f\u2d9e\u1e9d\u28dc\u305b\u2b1a\u28d9\u2b58\u2b57\u2e56\u2695\u2814\u1fd3\u2452\u2891\u2c10\u22cf\u264e\u228d\u260c\u24cb\u2eca\u2ec9\u2d48\u22c7\u26c6\u1e85\u2604\u2cc3\u2d02\u2f41\u26c0\u28bf\u24be\u23fd\u27fc\u2f3b\u253a\u2f79\u2af8\u2cb7\u1df6\u2fb5\u2a74\u1fb3\u2e72\u1df1\u2ab0\u24af\u23ee\u1f2d\u2cac\u206b\u226a\u2269\u2c28\u2e27\u2526\u1f25\u2ba4\u2ca3\u26e2\u2721\u2ae0\u1edf\u229e\u301d\u22dc\u231b\u265a\u2319\u2e58\u2e57\u1f16\u2855\u2254\u1cd3\u2712\u25d1\u3090\u284f\u2c8e\u268d\u2ecc\u238b\u2aca\u2509\u2408\u2547\u2fc6\u2345\u3084\u26c3\u2582\u1f41\u2340\u263f\u263e\u233d\u1ebc\u2fbb\u2eba\u1cb9\u2e38\u2bf7\u2bf6\u23b5\u25b4\u2c73\u24b2\u2f31\u2330\u1e6f\u232e\u2a6d\u286c\u1dab\u2d2a\u2d29\u1e68\u2f27\u2626\u2e65\u2ae4".toCharArray();
                var24_6[3] = var25_7 = (long)0;
                while ((int)var24_6[3] < ((char[])var23_5[7]).length) {
                    v3 = (char[])var23_5[7];
                    v4 = (int)var24_6[3];
                    v5 = (char)(v3[v4] + v4);
                    v3[v4] = (char)((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)(~((char)(v5 >>> 6 | v5 << 10))) - 41284))))) - 17106) + v4))) + v4) + 36751);
                    var24_6[3] = var25_7 = (long)((int)var24_6[3] + 1);
                }
                v2 = new String((char[])var23_5[7]);
            }
            v1 = ahm.o0Oo000O0oO(0, v2);
        }
        var23_5[14] = v1.toCharArray();
        var24_6[11] = var25_7 = 346945020840993711L;
        v6 = var24_6[11];
        v7 = 260046781 - -115 ^ -49;
        var24_6[11] = var25_7 = v6 ^ ((long)(~(--1840700403) * -7) << ~(-(15 + 127 + -109)) ^ v6) & -1L << -(v7 << 9 | v7 >>> 23);
        var20_2 = -1327707424;
        if (true) ** GOTO lbl50
        block15: while (true) {
            ahm.aPE = 30000L;
            var20_2 = -359368455;
lbl50:
            // 2 sources

            block16: while (true) {
                switch (var20_2) {
                    case -359368455: {
                        ahm.aPD = 300000L;
                        v8 = ahm.O0OoOO0OOOOO;
                        if (v8 == null) {
                            v8 = ahm.aPC = (String)ahm.ooO00oO0OoO0[(-268435455 << 5 | -268435455 >>> 27) ^ 39] + (String)ahm.ooO00oO0OoO0[-113 - -127];
                        }
                        if ((v9 = ahm.ooo00oo0Ooo0) == null) {
                            v9 = ahm.aPB = (String)ahm.ooO00oO0OoO0[-(-55 - -15)] + (String)ahm.ooO00oO0OoO0[-(0x4B4B4B48 * 17 + 41) - -31];
                        }
                        if ((v10 = ahm.o0o000o0O0o0) == null) {
                            v11 = ~(0x7FFFFF77 + 119);
                            v12 = ~1840701659;
                            v10 = (String)ahm.ooO00oO0OoO0[(v11 << 3 | v11 >>> 29) + -89] + (String)ahm.ooO00oO0OoO0[(v12 >>> 9 | v12 << 23) * -7];
                        }
                        ahm.aPw = Pattern.compile(v10, ((141982407 ^ -115) * -121 ^ -7) + 3);
                        v13 = ahm.oOo00Oo0OOo0;
                        if (v13 == null) {
                            v13 = (String)ahm.ooO00oO0OoO0[(0x33333347 ^ 117) * -5] + (String)ahm.ooO00oO0OoO0[~(~(101 + -17) + 83)];
                        }
                        ahm.aPx = Pattern.compile(v13, -(~212 + 83) * -1057222719);
                        v14 = ahm.oo000o00Oo00;
                        if (v14 == null) {
                            v14 = (String)ahm.ooO00oO0OoO0[-942797699 * 41] + (String)ahm.ooO00oO0OoO0[353010967 * 73 * 0x3F03F03F];
                        }
                        ahm.aPy = Pattern.compile(v14, 92 - 59 + -15 + -37 + 21);
                        var20_2 = 735518970;
                        continue block16;
                    }
                    case 735518970: {
                        v15 = ahm.o0000000O000;
                        if (v15 == null) {
                            v16 = 253755503 ^ 111;
                            v15 = (String)ahm.ooO00oO0OoO0[(-1672003424 * 41 ^ -57 ^ -93) * -77] + (String)ahm.ooO00oO0OoO0[(v16 >>> 21 | v16 << 11) ^ 95];
                        }
                        ahm.aPz = Pattern.compile(v15);
                        v17 = ahm.oO000O00OO00;
                        if (v17 == null) {
                            v17 = (String)ahm.ooO00oO0OoO0[(780140544 >>> 23 | 780140544 << 9) * -1108378657] + (String)ahm.ooO00oO0OoO0[~(-((1022611368 - 107) * 21))];
                        }
                        ahm.aPA = Pattern.compile(v17);
                        ahm.aPF = new ConcurrentHashMap<String, aim>();
                        v18 = ~(~-21 - 37);
                        ahm.aPG = v18 >>> 5 | v18 << 27;
                        ahm.aPI = "";
                        ahm.aPJ = (16384 >>> 15 | 16384 << 17) * 1643291835;
                        ahm.aPL = (-2147483501 + -61 ^ -39) - -113;
                        ahm.aPO = -(-(262144 >>> 19 | 262144 << 13)) * -19;
                        ahm.aPP = "";
                        ahm.aPR = (~(2147483577 ^ 123) ^ 61) * 2014922929;
                        var20_2 = -1436884101;
                        continue block16;
                    }
                    case -1436884101: {
                        ahm.aPT = new HashMap<String, Boolean>();
                        var20_2 = 758029886;
                        continue block16;
                    }
                    case 758029886: {
                        ahm.aPU = new r();
                        return;
                    }
                    default: {
                        v19 = var24_6[5];
                        v20 = ~-68124673;
                        var24_6[5] = var25_7 = v19 ^ (0L ^ v19) & -1L >>> ~((v20 << 17 | v20 >>> 15) * 0x41041041);
                    }
                    case -1883796912: {
                        break;
                    }
                    case -51252891: {
                        if ((int)var24_6[5] >= (int)(var24_6[11] >>> (158 + -51 ^ 75))) continue block15;
                        var20_2 = -1062352059;
                        continue block16;
                    }
                    case -1062352059: {
                        v21 = var24_6[5];
                        var24_6[5] = var25_7 = v21 ^ (v21 ^ v21 + (long)(73 + -41 ^ 33)) & -1L >>> -((337101611 >>> 21 | 337101611 << 11) * -101 * 483939977);
                        var24_6[20] = var25_7 = -8823747171614361991L;
                        v22 = var24_6[20];
                        var24_6[20] = var25_7 = v22 ^ ((long)((char[])var23_5[14])[(int)var24_6[5]] << ((-395277406 << 15 | -395277406 >>> 17) + 9 ^ 33) * 11 ^ v22) & -1L << -69 + 73 - -45 + -17;
                        v23 = var24_6[5];
                        v24 = 0x40000000 * 11 * 91;
                        var24_6[5] = var25_7 = v23 ^ (v23 ^ v23 + (long)(~(-2113396606 * 63))) & -1L >>> (v24 << 7 | v24 >>> 25);
                        v25 = var24_6[20];
                        var24_6[20] = var25_7 = v25 ^ ((long)((char[])var23_5[14])[(int)var24_6[5]] ^ v25) & -1L >>> (-64 + 93 ^ 57 ^ 119) - 51;
                        var21_3 = -931887349;
                        var24_6[16] = var25_7 = -1901180913812315794L;
                        v26 = var24_6[16];
                        v27 = 0x40000000 >>> 11 | 0x40000000 << 21;
                        v28 = v27 >>> 13 | v27 << 19;
                        var24_6[16] = var25_7 = v26 ^ ((long)((int)(var24_6[20] >>> --135 - 103) << ((-289910296 >>> 27 | -289910296 << 5) ^ 109) * -25 | (int)var24_6[20]) << (32 - 115 ^ -115) ^ v26) & -1L << (v28 >>> 1 | v28 << 31);
                        var23_5[6] = new char[(int)(var24_6[16] >>> (~-1431655766 - -11) * 3)];
                        v29 = var24_6[16];
                        var24_6[16] = var25_7 = v29 ^ (0L ^ v29) & -1L >>> -(-(477218592 * 9));
                        break block15;
                    }
                }
lbl133:
                // 2 sources

                while (true) {
                    var20_2 = -51252891;
                    continue block16;
                    break;
                }
                break;
            }
            break;
        }
        block18: while (true) {
            v30 = -(-6617198 ^ -109);
            if ((int)var24_6[16] >= (int)(var24_6[16] >>> (v30 >>> 11 | v30 << 21) * -2083697005)) break;
            ((char[])var23_5[6])[(int)var24_6[16]] = ((char[])var23_5[14])[(int)var24_6[5] + (int)var24_6[16]];
            var22_4 = 232128187;
            switch (var22_4) {
                default: {
                    v31 = var24_6[16];
                    var24_6[16] = var25_7 = v31 ^ (v31 ^ v31 + (long)((-132120577 >>> 21 | -132120577 << 11) - -65)) & -1L >>> -(((47840 >>> 5 | 47840 << 27) - -73) * -438261969);
                    continue block18;
                }
                case -1216535201: 
            }
            break;
        }
        var24_6[5] = var25_7 = var24_6[5] + 0x100000000L;
        ahm.ooO00oO0OoO0[(int)(var24_6[5] >>> (-640 - -89 ^ -71) * 678152731 * 1)] = new String((char[])var23_5[6]);
        v32 = var24_6[5];
        v33 = (-2147483621 ^ 67) - 15;
        var24_6[5] = var25_7 = v32 ^ ((long)((int)var24_6[5] + (int)(var24_6[16] >>> ~(-45 - -55 ^ -43))) ^ v32) & -1L >>> (v33 >>> 31 | v33 << 1) + -115;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ String ck(String string) {
        int n2 = 847030085;
        if (n2 != n2) {
        }
        Object[] objectArray = new Object[3];
        objectArray[2] = StringUtils.trimToEmpty((String)string).toLowerCase(Locale.ROOT);
        if (((String)objectArray[2]).isEmpty()) {
            return "";
        }
        int n3 = 1286483979;
        objectArray[0] = Normalizer.normalize((String)objectArray[2], Normalizer.Form.NFD).replaceAll((String)ooO00oO0OoO0[155 - 67 + -71], "");
        return ((String)objectArray[0]).replaceAll((String)ooO00oO0OoO0[615 * 1047552999 + 67], (String)ooO00oO0OoO0[~(~(-(~1)))]);
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ boolean b(d var0) {
        block7: {
            var3_1 = -1803373082;
            if (var3_1 == var3_1) break block7;
            break block7;
lbl6:
            // 1 sources

            while (true) {
                block8: {
                    if (var0.getPlayerName().startsWith((String)ahm.ooO00oO0OoO0[(v0 >>> 21 | v0 << 11) ^ 39])) break block8;
                    var1_2 = 1339402279;
                    ** GOTO lbl21
lbl10:
                    // 1 sources

                    while (true) {
                        v1 = -2048976427 * 109 ^ -79;
                        v2 = v1 >>> 17 | v1 << 15;
                        ** GOTO lbl20
                        break;
                    }
                }
lbl15:
                // 2 sources

                while (true) {
                    block9: {
                        var1_2 = 1856255924;
                        break block9;
lbl18:
                        // 1 sources

                        while (true) {
                            v2 = ~(-1 >>> 9 | -1 << 23) * 119 * -1056139499;
lbl20:
                            // 2 sources

                            return (boolean)v2;
                        }
                    }
                    switch (var1_2) {
                        default: {
                            ** continue;
                        }
                        ** case 1856255924:
lbl26:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
                break;
            }
        }
        ** while (var0.getPlayerName() == null)
lbl29:
        // 1 sources

        v0 = 0xB000000 >>> 1 | 0xB000000 << 31;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ boolean cj(String var0) {
        block22: {
            var16_1 = 1386432445;
            if (var16_1 == var16_1) break block22;
            throw new UnsupportedClassVersionError();
lbl4:
            // 1 sources

            return (boolean)(v0 >>> 11 | v0 << 21);
            while (true) {
                block20: {
                    block19: {
                        block21: {
                            var10_4 = -242683655;
                            break block19;
lbl9:
                            // 1 sources

                            while (true) {
                                var10_4 = 105324643;
                                break block19;
                                break;
                            }
lbl12:
                            // 1 sources

                            while (true) {
                                var14_3[6] = ((g)var14_3[4]).SD().b((g)var14_3[4]);
                                var3_5 = ((Collection)var14_3[6]).stream().filter((Predicate<d>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, d(net.minecraft.scoreboard.d ), (Lnet/minecraft/scoreboard/d;)Z)()).collect(Collectors.toList());
                                if (var3_5.size() > ((-1701779519 * -53 ^ -15) + 101) * -1631000239) {
                                    v1 = Lists.newArrayList((Iterable)Iterables.skip(var3_5, (int)(var3_5.size() - (-75 ^ 83 ^ -23))));
                                } else {
                                    var11_6 = 803426500;
                                    v1 = var3_5;
                                }
                                var4_7 = v1;
                                var14_3[0] = var4_7.iterator();
lbl22:
                                // 2 sources

                                while (((Iterator)var14_3[0]).hasNext()) {
                                    var12_8 = -1646194076;
                                    break block20;
                                }
                                break block21;
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var14_3[1] = (d)((Iterator)var14_3[0]).next();
                                var14_3[9] = ((g)var14_3[4]).SD().fs(((d)var14_3[1]).getPlayerName());
                                var13_9 = 1038814820;
                                var14_3[11] = an.ge(h.a((h)var14_3[9], ((d)var14_3[1]).getPlayerName()));
                                if (!StringUtils.containsIgnoreCase((CharSequence)((String)var14_3[11]), (CharSequence)var0)) ** GOTO lbl22
                                v2 = 1246930170 - -47;
                                return (v2 << 19 | v2 >>> 13) * 31 * -1171354717;
                            }
                        }
                        var12_8 = 1820688702;
                        break block20;
lbl37:
                        // 1 sources

                        return (boolean)(-96 ^ -83 ^ 13);
                    }
                    switch (var10_4) {
                        default: {
                            ** continue;
                        }
                        ** case 105324643:
lbl44:
                        // 1 sources

                        ** continue;
                    }
                }
                switch (var12_8) {
                    default: {
                        ** continue;
                    }
                    ** case 1820688702:
lbl50:
                    // 1 sources

                    ** continue;
                }
                break;
            }
lbl51:
            // 2 sources

            while (true) {
                var14_3 = new Object[13];
                var9_2 = 1592001254;
                var14_3[4] = ahm.vL();
                if ((g)var14_3[4] != null) ** continue;
                v0 = -0;
                ** continue;
                break;
            }
        }
        var16_1 = -52343992;
        if (var16_1 == var16_1) ** GOTO lbl51
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ boolean a(Pattern var0) {
        var8_1 = -1684863230;
        if (var8_1 != var8_1) {
        }
        if ((var8_1 = 1180133119) != var8_1) {
            throw null;
        }
        var8_1 = 1343702120;
        if (var8_1 != var8_1) {
        }
        var6_3 = new Object[5];
        if (var0 != null) ** break;
        var3_2 = 115126503;
        switch (var3_2) {
            default: {
                return (boolean)(ahm.oOoO0OoOOOoO[363] * ahm.oOoO0OoOOOoO[364] ^ ahm.oOoO0OoOOOoO[365] ^ ahm.oOoO0OoOOOoO[366]);
            }
            case 1574687469: 
        }
        var6_3[2] = ahm.aC(StringUtils.trimToEmpty((String)bi.dx).toLowerCase(Locale.ENGLISH));
        if (((String)var6_3[2]).isEmpty()) {
            v0 = ahm.oOoO0OoOOOoO[367];
            v1 = v0 >>> ahm.oOoO0OoOOOoO[368] | v0 << ahm.oOoO0OoOOOoO[369];
            v2 = v1 << ahm.oOoO0OoOOOoO[370] | v1 >>> ahm.oOoO0OoOOOoO[371];
            return (boolean)(v2 >>> ahm.oOoO0OoOOOoO[372] | v2 << ahm.oOoO0OoOOOoO[373]);
lbl23:
            // 2 sources

            while (true) {
                var6_3[3] = ahm.ci((String)var6_3[2]);
                if ((String)var6_3[3] != null && !((String)var6_3[3]).isEmpty() && var0.matcher((String)var6_3[3]).find()) {
                    v3 = ahm.oOoO0OoOOOoO[378] + ahm.oOoO0OoOOOoO[379] + ahm.oOoO0OoOOOoO[380];
                    v4 = -(v3 >>> ahm.oOoO0OoOOOoO[381] | v3 << ahm.oOoO0OoOOOoO[382]);
                    return (boolean)v4;
                }
                var5_5 = 1855136816;
                v5 = ahm.oOoO0OoOOOoO[383];
                v6 = v5 << ahm.oOoO0OoOOOoO[384] | v5 >>> ahm.oOoO0OoOOOoO[385];
                v4 = v6 >>> ahm.oOoO0OoOOOoO[386] | v6 << ahm.oOoO0OoOOOoO[387];
                return (boolean)v4;
            }
        }
        var4_4 = -1438859518;
        block10: while (true) {
            switch (var4_4) {
                default: {
                    if (!var0.matcher((String)var6_3[2]).find()) ** GOTO lbl23
                    var4_4 = -1136592269;
                    continue block10;
                }
                case -1136592269: {
                    return (boolean)(-(ahm.oOoO0OoOOOoO[374] * ahm.oOoO0OoOOOoO[375] * ahm.oOoO0OoOOOoO[376] + ahm.oOoO0OoOOOoO[377]));
                }
                case 1773346739: {
                    return (boolean)(-(ahm.oOoO0OoOOOoO[374] * ahm.oOoO0OoOOOoO[375] * ahm.oOoO0OoOOOoO[376] + ahm.oOoO0OoOOOoO[377]));
                }
                case 1415389300: 
            }
            break;
        }
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ boolean vD() {
        block23: {
            block26: {
                block24: {
                    var2 = 1773939931;
                    if (var2 == var2 || 857202364 == 0) break block24;
                    break block24;
lbl4:
                    // 1 sources

                    return (v0 >>> ahm.oOoO0OoOOOoO[139] | v0 << ahm.oOoO0OoOOOoO[140]) * ahm.oOoO0OoOOOoO[141];
lbl6:
                    // 1 sources

                    block10: while (true) {
                        block22: {
                            block25: {
                                block21: {
                                    if (ahm.vH()) {
                                        return ahm.oOoO0OoOOOoO[142] * ahm.oOoO0OoOOOoO[143] + ahm.oOoO0OoOOOoO[144];
                                    }
                                    if (ahm.oi()) {
                                        return ahm.oOoO0OoOOOoO[145] * ahm.oOoO0OoOOOoO[146] * ahm.oOoO0OoOOOoO[147] + ahm.oOoO0OoOOOoO[148];
                                    }
lbl11:
                                    // 3 sources

                                    while (true) {
                                        if (ahm.vE()) break block21;
                                        var0_1 = 1547311447;
                                        break block22;
                                        break;
                                    }
lbl15:
                                    // 2 sources

                                    while (true) {
                                        v1 = ahm.oOoO0OoOOOoO[149];
                                        v2 = -(v1 >>> ahm.oOoO0OoOOOoO[150] | v1 << ahm.oOoO0OoOOOoO[151]);
                                        return (v2 << ahm.oOoO0OoOOOoO[152] | v2 >>> ahm.oOoO0OoOOOoO[153]) * ahm.oOoO0OoOOOoO[154];
                                    }
                                }
                                if (!ahm.vF() || !ahm.vB()) break block25;
                                v3 = ahm.oOoO0OoOOOoO[155] * ahm.oOoO0OoOOOoO[156] - ahm.oOoO0OoOOOoO[157] ^ ahm.oOoO0OoOOOoO[158] ^ ahm.oOoO0OoOOOoO[159];
                                ** GOTO lbl29
                            }
                            var0_1 = 662640308;
                            break block22;
lbl26:
                            // 1 sources

                            while (true) {
                                v4 = -(ahm.oOoO0OoOOOoO[160] ^ ahm.oOoO0OoOOOoO[161]);
                                v3 = (v4 >>> ahm.oOoO0OoOOOoO[162] | v4 << ahm.oOoO0OoOOOoO[163]) ^ ahm.oOoO0OoOOOoO[164];
lbl29:
                                // 2 sources

                                return (boolean)v3;
                            }
                        }
lbl31:
                        // 2 sources

                        block14: while (true) {
                            switch (var0_1) {
                                case 529922719: {
                                    ** continue;
                                }
                                case 1547311447: {
                                    ** GOTO lbl15
                                }
                                case 5633553: {
                                    ** continue;
                                }
                                case 662640308: {
                                    ** continue;
                                }
lbl41:
                                // 2 sources

                                while (a.a.s().od()) {
                                    ** GOTO lbl52
                                }
                                ** GOTO lbl53
lbl44:
                                // 2 sources

                                while (true) {
                                    var2 = -1259825301;
                                    if (var2 != var2) {
                                        85 & 1;
                                    }
                                    if ((var2 = -770236510) == var2) ** GOTO lbl41
                                    ahm.oo0O0o0OOo0O = var2 = 523763352;
                                    ** GOTO lbl41
                                    break;
                                }
lbl52:
                                // 1 sources

                                return -ahm.oOoO0OoOOOoO[124] - ahm.oOoO0OoOOOoO[125];
lbl53:
                                // 1 sources

                                if (ahm.aER == null) break block10;
                                var0_1 = 1578582429;
                                continue block14;
                                default: {
                                    var0_1 = 1175521659;
                                    continue block14;
                                }
                                case 1175521659: {
                                    if (ahm.aER.bgK == null) break block10;
                                }
                                case -1699395515: {
                                    if (ahm.aER.bgF != null && !ahm.aER.Bf()) break block23;
                                    break block10;
                                }
lbl64:
                                // 2 sources

                                while (true) {
                                    var2 = 900306395;
                                    if (var2 == var2) ** GOTO lbl44
                                    ahm.oo0O0o0OOo0O = var2 = 1728929282;
                                    ** continue;
                                    break;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break block26;
                }
                if ((var2 = -2119775184) == var2) ** GOTO lbl64
                var2 = -1864869504;
                ** while (true)
            }
            v5 = ahm.oOoO0OoOOOoO[126] * ahm.oOoO0OoOOOoO[127] * ahm.oOoO0OoOOOoO[128];
            return (v5 >>> ahm.oOoO0OoOOOoO[129] | v5 << ahm.oOoO0OoOOOoO[130]) * ahm.oOoO0OoOOOoO[131];
        }
        var0_1 = -1030789305;
        ** while (true)
        {
            ** case -1030789305:
        }
lbl81:
        // 1 sources

        v6 = ((ahm.oOoO0OoOOOoO[132] ^ ahm.oOoO0OoOOOoO[133]) + ahm.oOoO0OoOOOoO[134]) * ahm.oOoO0OoOOOoO[135];
        ** while (!StringUtils.containsIgnoreCase((CharSequence)bi.dx, (CharSequence)((String)ahm.ooO00oO0OoO0[v6 >>> ahm.oOoO0OoOOOoO[136] | v6 << ahm.oOoO0OoOOOoO[137]])))
lbl83:
        // 1 sources

        v0 = ahm.oOoO0OoOOOoO[138];
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Generated
    ahm() {
        UnsupportedOperationException unsupportedOperationException;
        int n2 = 1684005735;
        if (n2 != n2) {
        }
        String string = 0oOOoOo0O00O;
        if (string == null) {
            string = 0oOOoOo0O00O = (String)ooO00oO0OoO0[1974697608 * -87 ^ 0xFFFFFFE9] + (String)ooO00oO0OoO0[(0xFFFFFFBE ^ 0xFFFFFFE9 ^ 0x35 ^ 3) + -79];
        }
        unsupportedOperationException(string);
        throw unsupportedOperationException;
    }

    public static /* bridge */ strictfp /* synthetic */ Block c(int n2, int n3, int n4) {
        block0: {
            int n5 = -295298769;
            if (n5 == n5) break block0;
            n5 = 698736193;
        }
        return ahm.aER.bgF.L(new b(n2, n3, n4)).df();
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ boolean ch(String var0) {
        block16: {
            block17: {
                var11_1 = 563346838;
                if (var11_1 == var11_1 || -2132511918 == 0) break block17;
                break block17;
lbl4:
                // 1 sources

                return (boolean)(ahm.oOoO0OoOOOoO[66] - ahm.oOoO0OoOOOoO[67] ^ ahm.oOoO0OoOOOoO[68]);
lbl6:
                // 1 sources

                block8: while (true) {
                    block14: {
                        block15: {
                            block13: {
                                block18: {
                                    if (!ahm.aPT.containsKey(var0)) break block18;
                                    var4_2 = -808783667;
                                    break block14;
lbl10:
                                    // 1 sources

                                    return ahm.aPT.get(var0);
                                }
lbl13:
                                // 2 sources

                                while (true) {
                                    if (ahm.aER.Bf() || !StringUtils.containsIgnoreCase((CharSequence)bi.dx, (CharSequence)var0)) break block13;
                                    var4_2 = 1996116715;
                                    break block14;
                                    break;
                                }
lbl17:
                                // 2 sources

                                while (true) {
                                    v0 = ahm.oOoO0OoOOOoO[69];
                                    v1 = -((v0 << ahm.oOoO0OoOOOoO[70] | v0 >>> ahm.oOoO0OoOOOoO[71]) + ahm.oOoO0OoOOOoO[72]) * ahm.oOoO0OoOOOoO[73];
                                    break block15;
                                    break;
                                }
                            }
                            v1 = ahm.oOoO0OoOOOoO[74] * ahm.oOoO0OoOOOoO[75] - ahm.oOoO0OoOOOoO[76];
                        }
                        var7_3[2] = var8_4 = 5170717188913254331L;
                        v2 = var7_3[2];
                        v3 = ahm.oOoO0OoOOOoO[80] * ahm.oOoO0OoOOOoO[81];
                        var7_3[2] = var8_4 = v2 ^ ((long)v1 << ahm.oOoO0OoOOOoO[77] - ahm.oOoO0OoOOOoO[78] + ahm.oOoO0OoOOOoO[79] ^ v2) & -1L << (v3 >>> ahm.oOoO0OoOOOoO[82] | v3 << ahm.oOoO0OoOOOoO[83]);
                        var5_5 = -204008630;
                        ahm.aPT.put(var0, (boolean)(var7_3[2] >>> -(-ahm.oOoO0OoOOOoO[84])));
                        v4 = -ahm.oOoO0OoOOOoO[85];
                        v5 = v4 >>> ahm.oOoO0OoOOOoO[86] | v4 << ahm.oOoO0OoOOOoO[87];
                        return (boolean)((int)(var7_3[2] >>> (v5 << ahm.oOoO0OoOOOoO[88] | v5 >>> ahm.oOoO0OoOOOoO[89])));
                    }
                    switch (var4_2) {
                        default: {
                            continue block8;
                        }
                        case -808783667: {
                            ** continue;
                        }
                        case -1079162366: {
                            ** continue;
                        }
                        case 1996116715: {
                            ** GOTO lbl17
                        }
                        ** case 1339430937:
lbl45:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
lbl46:
                // 1 sources

                while (true) {
                    break block16;
                    break;
                }
            }
            ** while ((var11_1 = -533579676) == var11_1)
lbl50:
            // 1 sources

            throw null;
        }
        var7_3 = new long[5];
        if (a.a.s().od()) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void 0OOOoo00o0() {
        int n2 = -542913429;
        if (n2 != n2) {
            throw new EmptyStackException();
        }
        int n3 = -1137308549;
        block81: while (true) {
            switch (n3) {
                case 1277884290: {
                    ahm.oOoO0OoOOOoO[0x34AA ^ 0x34A6] = 0xDCFDFB7B ^ 0x34A6;
                    ahm.oOoO0OoOOOoO[0x60DF ^ 0x6097] = 0xFFFF9F7A ^ 0x6097;
                    ahm.oOoO0OoOOOoO[0xAEFB ^ 0xAF90] = 0xE7D3A2A ^ 0xAF90;
                    n3 = 35729405;
                    continue block81;
                }
                case 35729405: {
                    ahm.oOoO0OoOOOoO[0x10938 ^ 0x10903] = 0xFFFEF6C4 ^ 0x10903;
                    ahm.oOoO0OoOOOoO[0x3C52 ^ 0x3D2F] = 0x3D3E ^ 0x3D2F;
                    ahm.oOoO0OoOOOoO[0x9F70 ^ 0x9F9D] = 0x9F9E ^ 0x9F9D;
                    ahm.oOoO0OoOOOoO[0x97E9 ^ 0x977C] = 0x977C ^ 0x977C;
                    ahm.oOoO0OoOOOoO[0x4E9C ^ 0x4E86] = 0x4E9F ^ 0x4E86;
                    ahm.oOoO0OoOOOoO[0x1D4 ^ 0x154] = 0x131 ^ 0x154;
                    ahm.oOoO0OoOOOoO[0x783A ^ 0x78A9] = 0xFFFF8758 ^ 0x78A9;
                    ahm.oOoO0OoOOOoO[0x632E ^ 0x627E] = 0x7C7A7998 ^ 0x627E;
                    ahm.oOoO0OoOOOoO[0x36DA ^ 0x37C4] = 0x37D7 ^ 0x37C4;
                    ahm.oOoO0OoOOOoO[0x10CF3 ^ 0x10DD8] = 0xFFFEF209 ^ 0x10DD8;
                    ahm.oOoO0OoOOOoO[0xDF85 ^ 0xDF6C] = 0xDF7D ^ 0xDF6C;
                    ahm.oOoO0OoOOOoO[0x1480 ^ 0x14B1] = 0xFFFFEB4E ^ 0x14B1;
                    ahm.oOoO0OoOOOoO[0xF5A4 ^ 0xF51B] = 0xF51E ^ 0xF51B;
                    n3 = 1018876735;
                    continue block81;
                }
                case 1018876735: {
                    ahm.oOoO0OoOOOoO[0x1CF7 ^ 0x1C9F] = 0x20001C85 ^ 0x1C9F;
                    n3 = 1112662816;
                    continue block81;
                }
                case 1112662816: {
                    ahm.oOoO0OoOOOoO[0xA817 ^ 0xA998] = 0xA991 ^ 0xA998;
                    ahm.oOoO0OoOOOoO[0x4916 ^ 0x495B] = 0xFFFFB6A7 ^ 0x495B;
                    ahm.oOoO0OoOOOoO[0x7951 ^ 0x7820] = 0x783F ^ 0x7820;
                    ahm.oOoO0OoOOOoO[0xE603 ^ 0xE68E] = 0xE6B9 ^ 0xE68E;
                    ahm.oOoO0OoOOOoO[0xEF39 ^ 0xEEBE] = 0xBCAEBE ^ 0xEEBE;
                    ahm.oOoO0OoOOOoO[0xD3CD ^ 0xD323] = 0xFFFF2CDC ^ 0xD323;
                    ahm.oOoO0OoOOOoO[0x27A4 ^ 0x27C0] = 0xA92E9851 ^ 0x27C0;
                    ahm.oOoO0OoOOOoO[0xEBD1 ^ 0xEB33] = 0xC71C9AF4 ^ 0xEB33;
                    n3 = -1453881067;
                    continue block81;
                }
                case -1453881067: {
                    ahm.oOoO0OoOOOoO[0xC95E ^ 0xC824] = 0xC837 ^ 0xC824;
                    ahm.oOoO0OoOOOoO[0x1044 ^ 0x1125] = 0xFFFFEEDA ^ 0x1125;
                    ahm.oOoO0OoOOOoO[0x38CC ^ 0x3987] = 0x3982 ^ 0x3987;
                    ahm.oOoO0OoOOOoO[0xC040 ^ 0xC136] = 0xFFFE4DDE ^ 0xC136;
                    n3 = -1052704430;
                    continue block81;
                }
                case -1052704430: {
                    ahm.oOoO0OoOOOoO[0x9AF3 ^ 0x9BB4] = 0x9BAD ^ 0x9BB4;
                    ahm.oOoO0OoOOOoO[0x6B2 ^ 0x7E5] = 0x8AF8A86E ^ 0x7E5;
                    ahm.oOoO0OoOOOoO[0x52B7 ^ 0x525D] = 0xFFFFADA2 ^ 0x525D;
                    ahm.oOoO0OoOOOoO[0x293F ^ 0x2857] = 0x284A ^ 0x2857;
                    ahm.oOoO0OoOOOoO[0xCE5A ^ 0xCE44] = 0xCE41 ^ 0xCE44;
                    ahm.oOoO0OoOOOoO[0xFC18 ^ 0xFD77] = 0xFD77 ^ 0xFD77;
                    n3 = 185802234;
                    continue block81;
                }
                case 185802234: {
                    ahm.oOoO0OoOOOoO[0xD1DD ^ 0xD1E3] = 0xFFFF2E02 ^ 0xD1E3;
                    ahm.oOoO0OoOOOoO[0x4283 ^ 0x43BC] = 0x59725D69 ^ 0x43BC;
                    ahm.oOoO0OoOOOoO[0x100CF ^ 0x10005] = 0xFFFEFFC4 ^ 0x10005;
                    ahm.oOoO0OoOOOoO[0xD893 ^ 0xD873] = 0xD874 ^ 0xD873;
                    n3 = 2147353030;
                    continue block81;
                }
                case 2147353030: {
                    ahm.oOoO0OoOOOoO[0x6D20 ^ 0x6DB9] = 0x6DB8 ^ 0x6DB9;
                    ahm.oOoO0OoOOOoO[0xDF49 ^ 0xDF3C] = 0xFFFF20C3 ^ 0xDF3C;
                    ahm.oOoO0OoOOOoO[0xEBA6 ^ 0xEBCA] = 0xEBFB ^ 0xEBCA;
                    ahm.oOoO0OoOOOoO[0xDD86 ^ 0xDC08] = 0xDC1F ^ 0xDC08;
                    ahm.oOoO0OoOOOoO[0x4E85 ^ 0x4ED9] = 0x4EC2 ^ 0x4ED9;
                    ahm.oOoO0OoOOOoO[0x7B2F ^ 0x7BA5] = 0x7BA5 ^ 0x7BA5;
                    ahm.oOoO0OoOOOoO[0xD2CA ^ 0xD277] = 0xD26C ^ 0xD277;
                    n3 = -1841132405;
                    continue block81;
                }
                case -1841132405: {
                    ahm.oOoO0OoOOOoO[0x8C5E ^ 0x8C2A] = 0x8C27 ^ 0x8C2A;
                    ahm.oOoO0OoOOOoO[0x49F5 ^ 0x49C7] = 0xFDFFB65A ^ 0x49C7;
                    ahm.oOoO0OoOOOoO[0xA0BE ^ 0xA1DC] = 0xFFFF5E23 ^ 0xA1DC;
                    ahm.oOoO0OoOOOoO[0xA223 ^ 0xA25E] = 0xA25D ^ 0xA25E;
                    ahm.oOoO0OoOOOoO[0x27F4 ^ 0x26F2] = 0x56BE4F3B ^ 0x26F2;
                    ahm.oOoO0OoOOOoO[0x5F01 ^ 0x5F47] = 0x5F40 ^ 0x5F47;
                    n3 = 637868371;
                    continue block81;
                }
                case 637868371: {
                    ahm.oOoO0OoOOOoO[0xFF83 ^ 0xFEFB] = 0x2B1D5A9A ^ 0xFEFB;
                    ahm.oOoO0OoOOOoO[0xF215 ^ 0xF320] = 0xFFFF0CD3 ^ 0xF320;
                    n3 = -292635626;
                    continue block81;
                }
                case -292635626: {
                    ahm.oOoO0OoOOOoO[0x3F6F ^ 0x3FB4] = 0x303D ^ 0x3FB4;
                    ahm.oOoO0OoOOOoO[0x6282 ^ 0x621E] = 0xBA2EE9BD ^ 0x621E;
                    ahm.oOoO0OoOOOoO[0x7D4B ^ 0x7C57] = 0xFFFFB728 ^ 0x7C57;
                    ahm.oOoO0OoOOOoO[0x9ACE ^ 0x9BF8] = 0x2FA0257B ^ 0x9BF8;
                    ahm.oOoO0OoOOOoO[0xA616 ^ 0xA6DF] = 0xA688 ^ 0xA6DF;
                    ahm.oOoO0OoOOOoO[0x6307 ^ 0x6243] = 0x6006276 ^ 0x6243;
                    ahm.oOoO0OoOOOoO[0x35AF ^ 0x35ED] = 0x35FD ^ 0x35ED;
                    ahm.oOoO0OoOOOoO[0x5CD7 ^ 0x5CA7] = 0x5CBC ^ 0x5CA7;
                    ahm.oOoO0OoOOOoO[0x1DFB ^ 0x1DC1] = 0x1DD6 ^ 0x1DC1;
                    ahm.oOoO0OoOOOoO[0x5C10 ^ 0x5C30] = 0x5055935 ^ 0x5C30;
                    n3 = 383668028;
                    continue block81;
                }
                case 383668028: {
                    ahm.oOoO0OoOOOoO[0x108F2 ^ 0x108DC] = 0xFFFEF723 ^ 0x108DC;
                    ahm.oOoO0OoOOOoO[0x969C ^ 0x9785] = 0x97CE ^ 0x9785;
                    ahm.oOoO0OoOOOoO[0xE8B2 ^ 0xE8E1] = 0xE8FC ^ 0xE8E1;
                    ahm.oOoO0OoOOOoO[0x21D8 ^ 0x215D] = 0x2140 ^ 0x215D;
                    ahm.oOoO0OoOOOoO[0xF124 ^ 0xF1B0] = 0xFFFF0E3B ^ 0xF1B0;
                    ahm.oOoO0OoOOOoO[0xC15E ^ 0xC167] = 0xC16E ^ 0xC167;
                    ahm.oOoO0OoOOOoO[0x8079 ^ 0x8033] = 0xFFFF78E8 ^ 0x8033;
                    n3 = 1771883707;
                    continue block81;
                }
                case 1771883707: {
                    ahm.oOoO0OoOOOoO[0xDF4 ^ 0xCD5] = 0xCD2 ^ 0xCD5;
                    ahm.oOoO0OoOOOoO[0x302F ^ 0x311E] = 0x3117 ^ 0x311E;
                    ahm.oOoO0OoOOOoO[0x4B77 ^ 0x4BB3] = 0x3331B45A ^ 0x4BB3;
                    ahm.oOoO0OoOOOoO[0x4724 ^ 0x464E] = 0xFFFFB9AF ^ 0x464E;
                    ahm.oOoO0OoOOOoO[0x224A ^ 0x2253] = 0x2216 ^ 0x2253;
                    ahm.oOoO0OoOOOoO[0x101F2 ^ 0x10077] = 0x10066 ^ 0x10077;
                    ahm.oOoO0OoOOOoO[0x4C61 ^ 0x4C3A] = 0x61375A95 ^ 0x4C3A;
                    ahm.oOoO0OoOOOoO[0x128 ^ 0x65] = 0x50 ^ 0x65;
                    ahm.oOoO0OoOOOoO[0x6898 ^ 0x683A] = 0x6821 ^ 0x683A;
                    ahm.oOoO0OoOOOoO[0xA54B ^ 0xA505] = 0xA506 ^ 0xA505;
                    n3 = 676830454;
                    continue block81;
                }
                case 676830454: {
                    ahm.oOoO0OoOOOoO[0x3705 ^ 0x3793] = 0x3784 ^ 0x3793;
                    n3 = -2139159022;
                    continue block81;
                }
                case -2139159022: {
                    ahm.oOoO0OoOOOoO[0xB18A ^ 0xB1D4] = 0xFFFF4E5B ^ 0xB1D4;
                    ahm.oOoO0OoOOOoO[0x6A20 ^ 0x6B5F] = 0x6B5F ^ 0x6B5F;
                    ahm.oOoO0OoOOOoO[0x33C4 ^ 0x32DE] = 0x2B2E7105 ^ 0x32DE;
                    n3 = 1312830039;
                    continue block81;
                }
                case 1312830039: {
                    ahm.oOoO0OoOOOoO[0x5B80 ^ 0x5BB4] = 0x5BA7 ^ 0x5BB4;
                    ahm.oOoO0OoOOOoO[0x60A ^ 0x671] = 0xFFFFF9DE ^ 0x671;
                    ahm.oOoO0OoOOOoO[0x45CD ^ 0x44DF] = 0xFFFFBB20 ^ 0x44DF;
                    ahm.oOoO0OoOOOoO[0xA873 ^ 0xA8C3] = 0xFFFF5718 ^ 0xA8C3;
                    ahm.oOoO0OoOOOoO[0x9D01 ^ 0x9C22] = 0x9C2D ^ 0x9C22;
                    ahm.oOoO0OoOOOoO[0x4A21 ^ 0x4A99] = 0xAAAAE032 ^ 0x4A99;
                    n3 = -1278234901;
                    continue block81;
                }
                case -1278234901: {
                    ahm.oOoO0OoOOOoO[0x5F13 ^ 0x5FA8] = 0x5FB7 ^ 0x5FA8;
                    ahm.oOoO0OoOOOoO[0xA874 ^ 0xA819] = 0xFFFF57D0 ^ 0xA819;
                    ahm.oOoO0OoOOOoO[0x8895 ^ 0x8830] = 0x8853 ^ 0x8830;
                    ahm.oOoO0OoOOOoO[0x4BC ^ 0x5D1] = 0xFFFFFA2E ^ 0x5D1;
                    ahm.oOoO0OoOOOoO[0xA3FD ^ 0xA28A] = 0xC28FFEA3 ^ 0xA28A;
                    ahm.oOoO0OoOOOoO[0x99E7 ^ 0x993B] = 0xFFFF66B2 ^ 0x993B;
                    ahm.oOoO0OoOOOoO[0x3636 ^ 0x372B] = 0xFFFFC8D4 ^ 0x372B;
                    ahm.oOoO0OoOOOoO[0xA104 ^ 0xA1C8] = 0xFFFF5E37 ^ 0xA1C8;
                    ahm.oOoO0OoOOOoO[0x7020 ^ 0x7122] = 0xFFFF8ED1 ^ 0x7122;
                    ahm.oOoO0OoOOOoO[0x69A5 ^ 0x6897] = 0x6894 ^ 0x6897;
                    n3 = 2033424427;
                    continue block81;
                }
                case 2033424427: {
                    ahm.oOoO0OoOOOoO[0xEF1B ^ 0xEFCC] = 0x10043A31 ^ 0xEFCC;
                    ahm.oOoO0OoOOOoO[0xA6A0 ^ 0xA678] = 0xA635 ^ 0xA678;
                    n3 = -1629713756;
                    continue block81;
                }
                case -1629713756: {
                    ahm.oOoO0OoOOOoO[0x3BD3 ^ 0x3ABD] = 0x3AC0 ^ 0x3ABD;
                    ahm.oOoO0OoOOOoO[0x30BC ^ 0x3134] = 0x3139 ^ 0x3134;
                    ahm.oOoO0OoOOOoO[0xB679 ^ 0xB610] = 0xB633 ^ 0xB610;
                    ahm.oOoO0OoOOOoO[0x14C3 ^ 0x15E7] = 0x15E2 ^ 0x15E7;
                    ahm.oOoO0OoOOOoO[0x954A ^ 0x95C9] = 0xC30CA50A ^ 0x95C9;
                    ahm.oOoO0OoOOOoO[0xC5C3 ^ 0xC5C2] = 0xFFFF3A23 ^ 0xC5C2;
                    ahm.oOoO0OoOOOoO[0x6A74 ^ 0x6B40] = 0x5D970E8C ^ 0x6B40;
                    ahm.oOoO0OoOOOoO[0xB299 ^ 0xB3D3] = 0xFFFF726C ^ 0xB3D3;
                    ahm.oOoO0OoOOOoO[0x2E65 ^ 0x2E1F] = 0x2593D884 ^ 0x2E1F;
                    ahm.oOoO0OoOOOoO[0x5403 ^ 0x542B] = 0xFFFFABBE ^ 0x542B;
                    ahm.oOoO0OoOOOoO[0xC2A5 ^ 0xC32C] = 0xC33F ^ 0xC32C;
                    ahm.oOoO0OoOOOoO[0x857 ^ 0x8B1] = 0xFFFFF71A ^ 0x8B1;
                    ahm.oOoO0OoOOOoO[0x6C45 ^ 0x6D22] = 0x6D21 ^ 0x6D22;
                    ahm.oOoO0OoOOOoO[0x724 ^ 0x702] = 0x71B ^ 0x702;
                    ahm.oOoO0OoOOOoO[0x448C ^ 0x459F] = 0xC631C9B2 ^ 0x459F;
                    ahm.oOoO0OoOOOoO[0x8502 ^ 0x844E] = 0x8455 ^ 0x844E;
                    ahm.oOoO0OoOOOoO[0x6D12 ^ 0x6D46] = 0x6D66 ^ 0x6D46;
                    ahm.oOoO0OoOOOoO[0x4938 ^ 0x4814] = 0x4E004814 ^ 0x4814;
                    ahm.oOoO0OoOOOoO[0xD247 ^ 0xD306] = 0xFFFF2CF7 ^ 0xD306;
                    n3 = 969807703;
                    continue block81;
                }
                case 969807703: {
                    ahm.oOoO0OoOOOoO[0x5D95 ^ 0x5D9D] = 0x23026DBE ^ 0x5D9D;
                    n3 = 754091300;
                    continue block81;
                }
                case 754091300: {
                    ahm.oOoO0OoOOOoO[0xED5D ^ 0xED78] = 0x9400ED79 ^ 0xED78;
                    n3 = 697399569;
                    continue block81;
                }
                case 697399569: {
                    ahm.oOoO0OoOOOoO[0xBDD7 ^ 0xBCD8] = 0xBC85 ^ 0xBCD8;
                    ahm.oOoO0OoOOOoO[0x4349 ^ 0x435F] = 0xFFFFBCD6 ^ 0x435F;
                    ahm.oOoO0OoOOOoO[0xBF41 ^ 0xBE6F] = 0xBE70 ^ 0xBE6F;
                    ahm.oOoO0OoOOOoO[0x1E58 ^ 0x1F05] = 0x1F00 ^ 0x1F05;
                    ahm.oOoO0OoOOOoO[0x64FD ^ 0x64EC] = 0xFFFF9B03 ^ 0x64EC;
                    n3 = 93898077;
                    continue block81;
                }
                case 93898077: {
                    ahm.oOoO0OoOOOoO[0x4CEE ^ 0x4CD2] = 0xFFFFB31B ^ 0x4CD2;
                    n3 = -1374313901;
                    continue block81;
                }
                case -1374313901: {
                    ahm.oOoO0OoOOOoO[0x90E9 ^ 0x90E6] = 0x90D5 ^ 0x90E6;
                    n3 = -1087913771;
                    continue block81;
                }
                case -1087913771: {
                    ahm.oOoO0OoOOOoO[0x2F35 ^ 0x2F5A] = 0xFFFFD087 ^ 0x2F5A;
                    ahm.oOoO0OoOOOoO[0x9401 ^ 0x9543] = 0x955E ^ 0x9543;
                    ahm.oOoO0OoOOOoO[0xDC2B ^ 0xDC3B] = 0x200DC67 ^ 0xDC3B;
                    ahm.oOoO0OoOOOoO[0x5763 ^ 0x5646] = 0x565D ^ 0x5646;
                    ahm.oOoO0OoOOOoO[0x3A7F ^ 0x3ADB] = 0x3AC0 ^ 0x3ADB;
                    ahm.oOoO0OoOOOoO[0x3F58 ^ 0x3F74] = 0xFFFFC18B ^ 0x3F74;
                    ahm.oOoO0OoOOOoO[0x9061 ^ 0x9016] = 0x9017 ^ 0x9016;
                    ahm.oOoO0OoOOOoO[0xFF0 ^ 0xFC7] = 0xFD8 ^ 0xFC7;
                    ahm.oOoO0OoOOOoO[0x3566 ^ 0x3438] = 0x3538 ^ 0x3438;
                    ahm.oOoO0OoOOOoO[0xEF69 ^ 0xEF51] = 0xDFE8FDA0 ^ 0xEF51;
                    ahm.oOoO0OoOOOoO[0x5E1C ^ 0x5F4F] = 0x677D1980 ^ 0x5F4F;
                    ahm.oOoO0OoOOOoO[0x72AC ^ 0x732F] = 0x7334 ^ 0x732F;
                    ahm.oOoO0OoOOOoO[0x5D3D ^ 0x5D39] = 0xFFFFA2FA ^ 0x5D39;
                    ahm.oOoO0OoOOOoO[0x5C9 ^ 0x596] = 0x589 ^ 0x596;
                    ahm.oOoO0OoOOOoO[0x2272 ^ 0x2224] = 0x222D ^ 0x2224;
                    ahm.oOoO0OoOOOoO[0x4BEA ^ 0x4A91] = 0x4A88 ^ 0x4A91;
                    n3 = -164582276;
                    continue block81;
                }
                case -164582276: {
                    ahm.oOoO0OoOOOoO[0x8EFD ^ 0x8E8F] = 0xFFF77170 ^ 0x8E8F;
                    n3 = -2126461019;
                    continue block81;
                }
                case -2126461019: {
                    ahm.oOoO0OoOOOoO[0x4A2D ^ 0x4A4D] = 0xB5CC4492 ^ 0x4A4D;
                    ahm.oOoO0OoOOOoO[0xCC39 ^ 0xCC88] = 0x2D021CA5 ^ 0xCC88;
                    ahm.oOoO0OoOOOoO[0x20BB ^ 0x20DD] = 0x20AE ^ 0x20DD;
                    ahm.oOoO0OoOOOoO[0x3C21 ^ 0x3D68] = 0xFFFFC2C7 ^ 0x3D68;
                    ahm.oOoO0OoOOOoO[0x458A ^ 0x4548] = 0x455B ^ 0x4548;
                    ahm.oOoO0OoOOOoO[0x5B01 ^ 0x5B23] = 0x5B30 ^ 0x5B23;
                    ahm.oOoO0OoOOOoO[0x3176 ^ 0x30F7] = 0x30F8 ^ 0x30F7;
                    ahm.oOoO0OoOOOoO[0x98B2 ^ 0x9893] = 0x98FC ^ 0x9893;
                    n3 = -961028092;
                    continue block81;
                }
                case -961028092: {
                    ahm.oOoO0OoOOOoO[0x227 ^ 0x242] = 0xC0D4C539 ^ 0x242;
                    ahm.oOoO0OoOOOoO[0x108B8 ^ 0x109BD] = 0x109CA ^ 0x109BD;
                    n3 = -1491853389;
                    continue block81;
                }
                case -1491853389: {
                    ahm.oOoO0OoOOOoO[0xBDF3 ^ 0xBD22] = 0xFFFF42ED ^ 0xBD22;
                    ahm.oOoO0OoOOOoO[0xE59 ^ 0xECB] = 0xFAFAF430 ^ 0xECB;
                    ahm.oOoO0OoOOOoO[0xFE9D ^ 0xFEB9] = 0xFEB6 ^ 0xFEB9;
                    n3 = -1435691873;
                    continue block81;
                }
                case -1435691873: {
                    ahm.oOoO0OoOOOoO[0x81F4 ^ 0x8182] = 0x819D ^ 0x8182;
                    ahm.oOoO0OoOOOoO[0xB3EB ^ 0xB2A8] = 0xB2AB ^ 0xB2A8;
                    ahm.oOoO0OoOOOoO[0x4D0 ^ 0x435] = 0x160430 ^ 0x435;
                    ahm.oOoO0OoOOOoO[0xDD8E ^ 0xDD10] = 0xDD17 ^ 0xDD10;
                    ahm.oOoO0OoOOOoO[0xB631 ^ 0xB6FC] = 0x1144B6FC ^ 0xB6FC;
                    ahm.oOoO0OoOOOoO[0x227C ^ 0x22A6] = 0x22F9 ^ 0x22A6;
                    ahm.oOoO0OoOOOoO[0x2B52 ^ 0x2A62] = 0x2A75 ^ 0x2A62;
                    ahm.oOoO0OoOOOoO[0x3709 ^ 0x37FF] = 0x37E6 ^ 0x37FF;
                    n3 = 1598142384;
                    continue block81;
                }
                case 1598142384: {
                    ahm.oOoO0OoOOOoO[0x6AAF ^ 0x6BA4] = 0x6BAF ^ 0x6BA4;
                    ahm.oOoO0OoOOOoO[0x796B ^ 0x7865] = 0xFFFF87FE ^ 0x7865;
                    ahm.oOoO0OoOOOoO[0x5E96 ^ 0x5EA5] = 0xFFFFA138 ^ 0x5EA5;
                    n3 = -1055028791;
                    continue block81;
                }
                case -1055028791: {
                    ahm.oOoO0OoOOOoO[0x9C55 ^ 0x9D2C] = 0xFFFF62FB ^ 0x9D2C;
                    ahm.oOoO0OoOOOoO[0xD1FF ^ 0xD13F] = 0xFFFDAEC0 ^ 0xD13F;
                    ahm.oOoO0OoOOOoO[0x1E3B ^ 0x1F7D] = 0x1F7A ^ 0x1F7D;
                    n3 = 69277131;
                    continue block81;
                }
                case 69277131: {
                    ahm.oOoO0OoOOOoO[0xE0A2 ^ 0xE19A] = 0xE10E ^ 0xE19A;
                    ahm.oOoO0OoOOOoO[0xD88 ^ 0xD09] = 0xD1E ^ 0xD09;
                    ahm.oOoO0OoOOOoO[0x2D3C ^ 0x2D36] = 0x23079 ^ 0x2D36;
                    ahm.oOoO0OoOOOoO[0x10801 ^ 0x10909] = 0x10904 ^ 0x10909;
                    n3 = -374209318;
                    continue block81;
                }
                case -374209318: {
                    ahm.oOoO0OoOOOoO[0xDF7C ^ 0xDE67] = 0xFFFF2198 ^ 0xDE67;
                    n3 = -1289968973;
                    continue block81;
                }
                case -1289968973: {
                    ahm.oOoO0OoOOOoO[0x2614 ^ 0x26A6] = 0x7547 ^ 0x26A6;
                    n3 = -1604156155;
                    continue block81;
                }
                case -1604156155: {
                    ahm.oOoO0OoOOOoO[0xDC4C ^ 0xDCCA] = 0xFFFF2317 ^ 0xDCCA;
                    n3 = -420886225;
                    continue block81;
                }
                case -420886225: {
                    ahm.oOoO0OoOOOoO[0xF066 ^ 0xF027] = 0xF020 ^ 0xF027;
                    ahm.oOoO0OoOOOoO[0xEF39 ^ 0xEF8D] = 0xEF94 ^ 0xEF8D;
                    ahm.oOoO0OoOOOoO[0xA552 ^ 0xA57F] = 0xFFFF5A80 ^ 0xA57F;
                    ahm.oOoO0OoOOOoO[0x4C5E ^ 0x4C0B] = 0xFFFFB20B ^ 0x4C0B;
                    ahm.oOoO0OoOOOoO[0xC6AA ^ 0xC6EF] = 0x1400C6EF ^ 0xC6EF;
                    ahm.oOoO0OoOOOoO[0x9049 ^ 0x902E] = 0xFFFF6FDF ^ 0x902E;
                    ahm.oOoO0OoOOOoO[0x823A ^ 0x833E] = 0x93B40349 ^ 0x833E;
                    ahm.oOoO0OoOOOoO[0xB9EA ^ 0xB9FD] = 0x286B73E6 ^ 0xB9FD;
                    ahm.oOoO0OoOOOoO[0x994F ^ 0x9800] = 0xFFFF67FF ^ 0x9800;
                    n3 = -1113019347;
                    continue block81;
                }
                case -1113019347: {
                    ahm.oOoO0OoOOOoO[0xA795 ^ 0xA617] = 0xA612 ^ 0xA617;
                    ahm.oOoO0OoOOOoO[0xA1A8 ^ 0xA1BB] = 0xA1BC ^ 0xA1BB;
                    ahm.oOoO0OoOOOoO[0xA9AA ^ 0xA8FF] = 0xA8F6 ^ 0xA8FF;
                    ahm.oOoO0OoOOOoO[0xC57C ^ 0xC5BD] = 0xC5B0 ^ 0xC5BD;
                    ahm.oOoO0OoOOOoO[0x90AA ^ 0x909C] = 0x909D ^ 0x909C;
                    n3 = -1591914371;
                    continue block81;
                }
                case -1591914371: {
                    ahm.oOoO0OoOOOoO[0x10BB9 ^ 0x10AAE] = 0x10AB3 ^ 0x10AAE;
                    ahm.oOoO0OoOOOoO[0x723F ^ 0x7218] = 0x721F ^ 0x7218;
                    n3 = -27291470;
                    continue block81;
                }
                case -27291470: {
                    ahm.oOoO0OoOOOoO[0xF32E ^ 0xF325] = 0xFFFF0C8A ^ 0xF325;
                    ahm.oOoO0OoOOOoO[0x60AD ^ 0x6045] = 0x604A ^ 0x6045;
                    ahm.oOoO0OoOOOoO[0xD9FE ^ 0xD920] = 0xD933 ^ 0xD920;
                    n3 = 1668739793;
                    continue block81;
                }
                case 1668739793: {
                    ahm.oOoO0OoOOOoO[0xAA8D ^ 0xAADC] = 0x4104BA9D ^ 0xAADC;
                    ahm.oOoO0OoOOOoO[0xE87F ^ 0xE957] = 0xE946 ^ 0xE957;
                    n3 = -733522138;
                    continue block81;
                }
                case -733522138: {
                    ahm.oOoO0OoOOOoO[0x9271 ^ 0x9232] = 0x921D ^ 0x9232;
                    ahm.oOoO0OoOOOoO[0x8747 ^ 0x879A] = 0x8797 ^ 0x879A;
                    ahm.oOoO0OoOOOoO[0x497B ^ 0x4878] = 0xFFFFB7C3 ^ 0x4878;
                    ahm.oOoO0OoOOOoO[0x10CEE ^ 0x10DE2] = 0xFFFEF21D ^ 0x10DE2;
                    n3 = 1451769038;
                    continue block81;
                }
                case 1451769038: {
                    ahm.oOoO0OoOOOoO[0xD6FC ^ 0xD778] = 0xFFFF2887 ^ 0xD778;
                    n3 = -1612589420;
                    continue block81;
                }
                case -1612589420: {
                    ahm.oOoO0OoOOOoO[0x3A4B ^ 0x3B5D] = 0x3B42 ^ 0x3B5D;
                    ahm.oOoO0OoOOOoO[0x6465 ^ 0x644E] = 0xFFFF9BBB ^ 0x644E;
                    ahm.oOoO0OoOOOoO[0xDAB8 ^ 0xDB91] = 0xFFFF246E ^ 0xDB91;
                    n3 = 1066031823;
                    continue block81;
                }
                case 1066031823: {
                    ahm.oOoO0OoOOOoO[0x10919 ^ 0x10986] = 0xFFFEF679 ^ 0x10986;
                    ahm.oOoO0OoOOOoO[0x6A7E ^ 0x6A3E] = 0x6A37 ^ 0x6A3E;
                    n3 = -1123703579;
                    continue block81;
                }
                case -1123703579: {
                    ahm.oOoO0OoOOOoO[0x1037F ^ 0x10311] = 0x10335 ^ 0x10311;
                    ahm.oOoO0OoOOOoO[0xD248 ^ 0xD2E2] = 0xD2FD ^ 0xD2E2;
                    ahm.oOoO0OoOOOoO[0xA960 ^ 0xA99E] = 0xFFFF5675 ^ 0xA99E;
                    ahm.oOoO0OoOOOoO[0xA8B9 ^ 0xA800] = 0xA800 ^ 0xA800;
                    ahm.oOoO0OoOOOoO[0xCF38 ^ 0xCFE7] = 0xCFFE ^ 0xCFE7;
                    ahm.oOoO0OoOOOoO[0xC041 ^ 0xC154] = 0xC11B ^ 0xC154;
                    ahm.oOoO0OoOOOoO[0xD2F6 ^ 0xD3C5] = 0xD3D8 ^ 0xD3C5;
                    ahm.oOoO0OoOOOoO[0x2E6C ^ 0x2F35] = 0x2F24 ^ 0x2F35;
                    n3 = -249232877;
                    continue block81;
                }
                case -249232877: {
                    ahm.oOoO0OoOOOoO[0xFD53 ^ 0xFD80] = 0xFD99 ^ 0xFD80;
                    ahm.oOoO0OoOOOoO[0x49AF ^ 0x497A] = 0x4975 ^ 0x497A;
                    ahm.oOoO0OoOOOoO[0x7E09 ^ 0x7E11] = 0x6E54 ^ 0x7E11;
                    ahm.oOoO0OoOOOoO[0xD9AC ^ 0xD92B] = 0xD912 ^ 0xD92B;
                    n3 = -766247200;
                    continue block81;
                }
                case -766247200: {
                    ahm.oOoO0OoOOOoO[0x7084 ^ 0x704C] = 0x705D ^ 0x704C;
                    ahm.oOoO0OoOOOoO[0xA78 ^ 0xA34] = 0xA2B ^ 0xA34;
                    ahm.oOoO0OoOOOoO[0xE55 ^ 0xF55] = 0xFFFFF0AA ^ 0xF55;
                    n3 = 2060624205;
                    continue block81;
                }
                case 2060624205: {
                    ahm.oOoO0OoOOOoO[0xDA20 ^ 0xDB1B] = 0xDB0C ^ 0xDB1B;
                    ahm.oOoO0OoOOOoO[0x716D ^ 0x714E] = 0xFFFF8EC3 ^ 0x714E;
                    n3 = 568107937;
                    continue block81;
                }
                case 568107937: {
                    ahm.oOoO0OoOOOoO[0xCD3D ^ 0xCC22] = 0xCC2F ^ 0xCC22;
                    ahm.oOoO0OoOOOoO[0x2BAE ^ 0x2ABA] = 0xFFFFD545 ^ 0x2ABA;
                    n3 = -4916411;
                    continue block81;
                }
                case -4916411: {
                    ahm.oOoO0OoOOOoO[0x66EE ^ 0x67FF] = 0x67EE ^ 0x67FF;
                    ahm.oOoO0OoOOOoO[0x5842 ^ 0x5821] = 0xFFFFA7D6 ^ 0x5821;
                    ahm.oOoO0OoOOOoO[0x77B2 ^ 0x774F] = 0xF3CF4BBD ^ 0x774F;
                    ahm.oOoO0OoOOOoO[0x59E7 ^ 0x59FC] = 0x59FB ^ 0x59FC;
                    ahm.oOoO0OoOOOoO[0xC8A4 ^ 0xC851] = 0xC856 ^ 0xC851;
                    ahm.oOoO0OoOOOoO[0xA475 ^ 0xA409] = 0xFFFF5BF4 ^ 0xA409;
                    ahm.oOoO0OoOOOoO[0xC5FC ^ 0xC554] = 0xFFFF3AAB ^ 0xC554;
                    ahm.oOoO0OoOOOoO[0xC0A6 ^ 0xC1D6] = 0xC1D7 ^ 0xC1D6;
                    ahm.oOoO0OoOOOoO[0x3ED7 ^ 0x3FD0] = 0x3FC3 ^ 0x3FD0;
                    ahm.oOoO0OoOOOoO[0x2E6F ^ 0x2EC3] = 0xFFFFF7AA ^ 0x2EC3;
                    ahm.oOoO0OoOOOoO[0xDC69 ^ 0xDCC6] = 0x7C8ABD97 ^ 0xDCC6;
                    ahm.oOoO0OoOOOoO[0x90EF ^ 0x9078] = 0x9071 ^ 0x9078;
                    ahm.oOoO0OoOOOoO[0x10A36 ^ 0x10AC1] = 0x10AD0 ^ 0x10AC1;
                    ahm.oOoO0OoOOOoO[0x5D6C ^ 0x5D69] = 0xFDB9DF8 ^ 0x5D69;
                    ahm.oOoO0OoOOOoO[0xC2E6 ^ 0xC2B1] = 0xC2A6 ^ 0xC2B1;
                    ahm.oOoO0OoOOOoO[0xDE2D ^ 0xDFA0] = 0x1FA0 ^ 0xDFA0;
                    n3 = 1743860573;
                    continue block81;
                }
                case 1743860573: {
                    ahm.oOoO0OoOOOoO[0x77E2 ^ 0x7758] = 0x7759 ^ 0x7758;
                    ahm.oOoO0OoOOOoO[0x176D ^ 0x160B] = 0x177B ^ 0x160B;
                    ahm.oOoO0OoOOOoO[0x10E48 ^ 0x10E07] = 0x10E20 ^ 0x10E07;
                    ahm.oOoO0OoOOOoO[0xD8A5 ^ 0xD9F3] = 0xD9E4 ^ 0xD9F3;
                    ahm.oOoO0OoOOOoO[0x8CCF ^ 0x8CFA] = 0x8CF7 ^ 0x8CFA;
                    ahm.oOoO0OoOOOoO[0x47B6 ^ 0x468B] = 0x4688 ^ 0x468B;
                    ahm.oOoO0OoOOOoO[0x3FBF ^ 0x3F4D] = 0x3F4D ^ 0x3F4D;
                    n3 = -1314269600;
                    continue block81;
                }
                case -1314269600: {
                    ahm.oOoO0OoOOOoO[0xD391 ^ 0xD3BB] = 0x5C06BAC ^ 0xD3BB;
                    ahm.oOoO0OoOOOoO[0x9C0C ^ 0x9C23] = 0x9C3E ^ 0x9C23;
                    ahm.oOoO0OoOOOoO[0x39BE ^ 0x38F6] = 0x38D1 ^ 0x38F6;
                    ahm.oOoO0OoOOOoO[0xF4FB ^ 0xF57B] = 0xF56A ^ 0xF57B;
                    ahm.oOoO0OoOOOoO[0xD2F9 ^ 0xD2F0] = 0xD2CB ^ 0xD2F0;
                    ahm.oOoO0OoOOOoO[0x1349 ^ 0x13B3] = 0x13B4 ^ 0x13B3;
                    n3 = 640892060;
                    continue block81;
                }
                case 640892060: {
                    ahm.oOoO0OoOOOoO[0x81E2 ^ 0x80DC] = 0x80C1 ^ 0x80DC;
                    ahm.oOoO0OoOOOoO[0xA452 ^ 0xA4AA] = 0xA4A5 ^ 0xA4AA;
                    n3 = 1506877863;
                    continue block81;
                }
                case 1506877863: {
                    ahm.oOoO0OoOOOoO[0x654C ^ 0x659E] = 0x40659E ^ 0x659E;
                    n3 = -882671482;
                    continue block81;
                }
                case -882671482: {
                    ahm.oOoO0OoOOOoO[0xFFF8 ^ 0xFF51] = 0xFFFF0DE3 ^ 0xFF51;
                    ahm.oOoO0OoOOOoO[0x39D2 ^ 0x38B2] = 0x38AF ^ 0x38B2;
                    ahm.oOoO0OoOOOoO[0xCC92 ^ 0xCC59] = 0xFFFF33F2 ^ 0xCC59;
                    n3 = 389806535;
                    continue block81;
                }
                case 389806535: {
                    ahm.oOoO0OoOOOoO[0xC09 ^ 0xC92] = 0xFFFFF224 ^ 0xC92;
                    ahm.oOoO0OoOOOoO[0x10817 ^ 0x1094C] = 0x1096D ^ 0x1094C;
                    ahm.oOoO0OoOOOoO[0x98FF ^ 0x981E] = 0x3D534D20 ^ 0x981E;
                    ahm.oOoO0OoOOOoO[0xF71C ^ 0xF66F] = 0xF668 ^ 0xF66F;
                    ahm.oOoO0OoOOOoO[0xC235 ^ 0xC2E5] = 0x303C1E6 ^ 0xC2E5;
                    ahm.oOoO0OoOOOoO[0x8534 ^ 0x85BF] = 0x85A4 ^ 0x85BF;
                    ahm.oOoO0OoOOOoO[0x3A86 ^ 0x3A93] = 0xFFFFC51A ^ 0x3A93;
                    ahm.oOoO0OoOOOoO[0x29F ^ 0x283] = 0x415C9AEF ^ 0x283;
                    ahm.oOoO0OoOOOoO[0x3922 ^ 0x3921] = 0xFFFFC882 ^ 0x3921;
                    ahm.oOoO0OoOOOoO[0x2C4B ^ 0x2C4D] = 0xFFFFDFF1 ^ 0x2C4D;
                    ahm.oOoO0OoOOOoO[0x482F ^ 0x48DE] = 0x48BF ^ 0x48DE;
                    ahm.oOoO0OoOOOoO[0x3EF7 ^ 0x3EFA] = 0x6EB3DAA9 ^ 0x3EFA;
                    ahm.oOoO0OoOOOoO[0xCB56 ^ 0xCB3D] = 0xCB20 ^ 0xCB3D;
                    ahm.oOoO0OoOOOoO[0xD4E9 ^ 0xD580] = 0xFFFF2A6F ^ 0xD580;
                    ahm.oOoO0OoOOOoO[0x4CBF ^ 0x4CEF] = 0xFFFF8DEF ^ 0x4CEF;
                    ahm.oOoO0OoOOOoO[0x105CE ^ 0x10537] = 0x1052E ^ 0x10537;
                    ahm.oOoO0OoOOOoO[0x9BD9 ^ 0x9B36] = 0x151D9CDD ^ 0x9B36;
                    n3 = -240634034;
                    continue block81;
                }
                case -240634034: {
                    ahm.oOoO0OoOOOoO[0x7DE9 ^ 0x7D15] = 0x7D5A ^ 0x7D15;
                    ahm.oOoO0OoOOOoO[0xA2 ^ 0x1AB] = 0x386001AA ^ 0x1AB;
                    ahm.oOoO0OoOOOoO[0x7F28 ^ 0x7F56] = 0x7F56 ^ 0x7F56;
                    ahm.oOoO0OoOOOoO[0x8FF3 ^ 0x8FB4] = 0x8FAD ^ 0x8FB4;
                    ahm.oOoO0OoOOOoO[0xCBAA ^ 0xCA80] = 0xCAF1 ^ 0xCA80;
                    n3 = 1661551595;
                    continue block81;
                }
                case 1661551595: {
                    ahm.oOoO0OoOOOoO[0x938D ^ 0x92F1] = 0xFFFF6D22 ^ 0x92F1;
                    ahm.oOoO0OoOOOoO[0xBF21 ^ 0xBFD2] = 0xF85B0C47 ^ 0xBFD2;
                    ahm.oOoO0OoOOOoO[0x26E7 ^ 0x2649] = 0x263A ^ 0x2649;
                    ahm.oOoO0OoOOOoO[0x79D3 ^ 0x78BF] = 0x788A ^ 0x78BF;
                    ahm.oOoO0OoOOOoO[0x6D9E ^ 0x6D3F] = 0xFFFF92C0 ^ 0x6D3F;
                    n3 = -1702765461;
                    continue block81;
                }
                case -1702765461: {
                    ahm.oOoO0OoOOOoO[0x92EB ^ 0x9248] = 0x924D ^ 0x9248;
                    ahm.oOoO0OoOOOoO[0x95D6 ^ 0x9571] = 0xFFFF6A8E ^ 0x9571;
                    ahm.oOoO0OoOOOoO[0x3976 ^ 0x3995] = 0xFFFFC630 ^ 0x3995;
                    ahm.oOoO0OoOOOoO[0x10D5 ^ 0x108D] = 0x1088 ^ 0x108D;
                    ahm.oOoO0OoOOOoO[0xFB94 ^ 0xFB5A] = 0xFB55 ^ 0xFB5A;
                    ahm.oOoO0OoOOOoO[0x3610 ^ 0x364A] = 0xFFFCE99B ^ 0x364A;
                    ahm.oOoO0OoOOOoO[0x515F ^ 0x5055] = 0x5040 ^ 0x5055;
                    ahm.oOoO0OoOOOoO[0xE2D8 ^ 0xE242] = 0xFFFF1DE3 ^ 0xE242;
                    n3 = 114780872;
                    continue block81;
                }
                case 114780872: {
                    ahm.oOoO0OoOOOoO[0x2776 ^ 0x2622] = 0x60002626 ^ 0x2622;
                    n3 = 398534426;
                    continue block81;
                }
                case 398534426: {
                    ahm.oOoO0OoOOOoO[0xF562 ^ 0xF455] = 0xF408 ^ 0xF455;
                    ahm.oOoO0OoOOOoO[0x1F47 ^ 0x1F03] = 0xFFFFE0E2 ^ 0x1F03;
                    ahm.oOoO0OoOOOoO[0x2FDB ^ 0x2F6C] = 0x2F6D ^ 0x2F6C;
                    n3 = -155924357;
                    continue block81;
                }
                case -155924357: {
                    ahm.oOoO0OoOOOoO[0x8044 ^ 0x802E] = 0x802D ^ 0x802E;
                    ahm.oOoO0OoOOOoO[0xA734 ^ 0xA747] = 0xA754 ^ 0xA747;
                    ahm.oOoO0OoOOOoO[0x36DD ^ 0x37FB] = 0x37E0 ^ 0x37FB;
                    ahm.oOoO0OoOOOoO[0x616F ^ 0x6110] = 0x7A42D7B ^ 0x6110;
                    ahm.oOoO0OoOOOoO[0xF62F ^ 0xF715] = 0xF73C ^ 0xF715;
                    ahm.oOoO0OoOOOoO[0x9B84 ^ 0x9B29] = 0x5C0233E ^ 0x9B29;
                    ahm.oOoO0OoOOOoO[0xAC8 ^ 0xAA9] = 0xAEC ^ 0xAA9;
                    n3 = 674471577;
                    continue block81;
                }
                case 674471577: {
                    ahm.oOoO0OoOOOoO[0xAED9 ^ 0xAF55] = 0x98821664 ^ 0xAF55;
                    ahm.oOoO0OoOOOoO[0x1010E ^ 0x1017F] = 0x1017A ^ 0x1017F;
                    n3 = 1887500915;
                    continue block81;
                }
                case 1887500915: {
                    ahm.oOoO0OoOOOoO[0xE75B ^ 0xE7D4] = 0xFFFF1821 ^ 0xE7D4;
                    ahm.oOoO0OoOOOoO[0xCA4A ^ 0xCB73] = 0xFFFF34E6 ^ 0xCB73;
                    ahm.oOoO0OoOOOoO[0xCE2D ^ 0xCEE2] = 0xCEF3 ^ 0xCEE2;
                    ahm.oOoO0OoOOOoO[0x36CE ^ 0x37BA] = 0x37A3 ^ 0x37BA;
                    ahm.oOoO0OoOOOoO[0xCC98 ^ 0xCC4C] = 0xCC4B ^ 0xCC4C;
                    ahm.oOoO0OoOOOoO[0x10189 ^ 0x1010B] = 0x10102 ^ 0x1010B;
                    ahm.oOoO0OoOOOoO[0x4771 ^ 0x4741] = 0x4742 ^ 0x4741;
                    ahm.oOoO0OoOOOoO[0xC01B ^ 0xC141] = 0x3E0F42A0 ^ 0xC141;
                    ahm.oOoO0OoOOOoO[0x1033D ^ 0x103C6] = 0x10396 ^ 0x103C6;
                    ahm.oOoO0OoOOOoO[0xB7DA ^ 0xB6F5] = 0xB6B6 ^ 0xB6F5;
                    ahm.oOoO0OoOOOoO[0x74B7 ^ 0x74EE] = 0x74F5 ^ 0x74EE;
                    ahm.oOoO0OoOOOoO[0x7200 ^ 0x720E] = 0xFFFF8DAE ^ 0x720E;
                    n3 = 1332177206;
                    continue block81;
                }
                case 1332177206: {
                    ahm.oOoO0OoOOOoO[0x97D5 ^ 0x9773] = 0x9710 ^ 0x9773;
                    ahm.oOoO0OoOOOoO[0x8256 ^ 0x8328] = 0x8327 ^ 0x8328;
                    n3 = -1710464840;
                    continue block81;
                }
                case -1710464840: {
                    ahm.oOoO0OoOOOoO[0xB323 ^ 0xB22E] = 0x9A9D9428 ^ 0xB22E;
                    ahm.oOoO0OoOOOoO[0x78A6 ^ 0x79FE] = 0x79F1 ^ 0x79FE;
                    ahm.oOoO0OoOOOoO[0x21A0 ^ 0x210B] = 0xD916A620 ^ 0x210B;
                    ahm.oOoO0OoOOOoO[0x113C ^ 0x1024] = 0xA3D7197B ^ 0x1024;
                    ahm.oOoO0OoOOOoO[0xC79D ^ 0xC6D8] = 0x73EC6B3B ^ 0xC6D8;
                    ahm.oOoO0OoOOOoO[0x9200 ^ 0x92E7] = 0x92B6 ^ 0x92E7;
                    ahm.oOoO0OoOOOoO[0x67E0 ^ 0x6685] = 0x66F8 ^ 0x6685;
                    ahm.oOoO0OoOOOoO[0xFFAE ^ 0xFF5E] = 0xBA2E74FD ^ 0xFF5E;
                    ahm.oOoO0OoOOOoO[0x708D ^ 0x71D1] = 0x71CA ^ 0x71D1;
                    ahm.oOoO0OoOOOoO[0xFD50 ^ 0xFDE5] = 0xFDE2 ^ 0xFDE5;
                    ahm.oOoO0OoOOOoO[0xECF4 ^ 0xEDA5] = 0x505E8A0 ^ 0xEDA5;
                    ahm.oOoO0OoOOOoO[0xA745 ^ 0xA73C] = 0xFFFF58D7 ^ 0xA73C;
                    n3 = -1389316234;
                    continue block81;
                }
                case -1389316234: {
                    ahm.oOoO0OoOOOoO[0x31AE ^ 0x3191] = 0x3186 ^ 0x3191;
                    ahm.oOoO0OoOOOoO[0xD7CC ^ 0xD76C] = 0xD7FF2893 ^ 0xD76C;
                    ahm.oOoO0OoOOOoO[0x7713 ^ 0x779A] = 0x7799 ^ 0x779A;
                    ahm.oOoO0OoOOOoO[0x1C48 ^ 0x1D2C] = 0xFFFFE295 ^ 0x1D2C;
                    ahm.oOoO0OoOOOoO[0xC913 ^ 0xC95A] = 0x38E34763 ^ 0xC95A;
                    ahm.oOoO0OoOOOoO[0xB78C ^ 0xB78B] = 0xB798 ^ 0xB78B;
                    ahm.oOoO0OoOOOoO[0x49BC ^ 0x4981] = 0x79E ^ 0x4981;
                    ahm.oOoO0OoOOOoO[0xCAEC ^ 0xCA8E] = 0x1A1F925F ^ 0xCA8E;
                    ahm.oOoO0OoOOOoO[0xE7A2 ^ 0xE629] = 0xFFFF19D6 ^ 0xE629;
                    ahm.oOoO0OoOOOoO[0x11EF ^ 0x1163] = 0x1166 ^ 0x1163;
                    n3 = -1413355798;
                    continue block81;
                }
                case -1413355798: {
                    ahm.oOoO0OoOOOoO[0x1EFF ^ 0x1ED6] = 0x1025 ^ 0x1ED6;
                    n3 = -743431058;
                    continue block81;
                }
                case -743431058: {
                    ahm.oOoO0OoOOOoO[0xF9F3 ^ 0xF90C] = 0xF92B ^ 0xF90C;
                    ahm.oOoO0OoOOOoO[0xE253 ^ 0xE296] = 0xFFFF1D7F ^ 0xE296;
                    ahm.oOoO0OoOOOoO[0x9592 ^ 0x94BF] = 0x94BE ^ 0x94BF;
                    ahm.oOoO0OoOOOoO[0xB2A5 ^ 0xB263] = 0xB26C ^ 0xB263;
                    ahm.oOoO0OoOOOoO[0x431D ^ 0x423D] = 0x4224 ^ 0x423D;
                    ahm.oOoO0OoOOOoO[0x110 ^ 0x96] = 0x99 ^ 0x96;
                    n3 = 548619490;
                    continue block81;
                }
                case 548619490: {
                    ahm.oOoO0OoOOOoO[0xAC23 ^ 0xADA9] = 0xAD94 ^ 0xADA9;
                    ahm.oOoO0OoOOOoO[0x9B80 ^ 0x9B18] = 0x9B07 ^ 0x9B18;
                    ahm.oOoO0OoOOOoO[0xFD3B ^ 0xFC1C] = 0xFC19 ^ 0xFC1C;
                    ahm.oOoO0OoOOOoO[0xE57F ^ 0xE431] = 0xE416 ^ 0xE431;
                    n3 = 159707627;
                    continue block81;
                }
                case 159707627: {
                    ahm.oOoO0OoOOOoO[0x506A ^ 0x50EE] = 0xB823BEDF ^ 0x50EE;
                    n3 = -392420937;
                    continue block81;
                }
                case -392420937: {
                    ahm.oOoO0OoOOOoO[0x32EA ^ 0x32B8] = 0x32BB ^ 0x32B8;
                    ahm.oOoO0OoOOOoO[0x7B03 ^ 0x7BBF] = 0x7BBA ^ 0x7BBF;
                    n3 = 793951140;
                    continue block81;
                }
                case 793951140: {
                    ahm.oOoO0OoOOOoO[0x8403 ^ 0x84EF] = 0xFFFF7B1A ^ 0x84EF;
                    ahm.oOoO0OoOOOoO[0xF5A3 ^ 0xF53E] = 0xFFFF0AD7 ^ 0xF53E;
                    n3 = 1994834261;
                    continue block81;
                }
                case 1994834261: {
                    ahm.oOoO0OoOOOoO[0xCCCA ^ 0xCC0D] = 0xCC02 ^ 0xCC0D;
                    ahm.oOoO0OoOOOoO[0xAE9B ^ 0xAE2D] = 0xAE32 ^ 0xAE2D;
                    ahm.oOoO0OoOOOoO[0x3743 ^ 0x37FD] = 0x37E6 ^ 0x37FD;
                    ahm.oOoO0OoOOOoO[0x9FF ^ 0x9E2] = 0x9F9 ^ 0x9E2;
                    ahm.oOoO0OoOOOoO[0x5DEE ^ 0x5CD2] = 0xFFFFA3D2 ^ 0x5CD2;
                    ahm.oOoO0OoOOOoO[0x87B3 ^ 0x8700] = 0xFFFF78E1 ^ 0x8700;
                    ahm.oOoO0OoOOOoO[0x6510 ^ 0x65D3] = 0xC30C5510 ^ 0x65D3;
                    ahm.oOoO0OoOOOoO[0xC402 ^ 0xC402] = 0xFFFF3BA6 ^ 0xC402;
                    n3 = -1244949552;
                    continue block81;
                }
                case -1244949552: {
                    ahm.oOoO0OoOOOoO[0x10CC4 ^ 0x10D9B] = 0x10D98 ^ 0x10D9B;
                    ahm.oOoO0OoOOOoO[0x104E5 ^ 0x104AE] = 0x5F7423A3 ^ 0x104AE;
                    n3 = -1645367928;
                    continue block81;
                }
                case -1645367928: {
                    ahm.oOoO0OoOOOoO[0x2715 ^ 0x2614] = 0x9467C44A ^ 0x2614;
                    ahm.oOoO0OoOOOoO[0x8354 ^ 0x8356] = 0x836B ^ 0x8356;
                    ahm.oOoO0OoOOOoO[0x9D47 ^ 0x9D91] = 0x9D80 ^ 0x9D91;
                    ahm.oOoO0OoOOOoO[0xB743 ^ 0xB7D3] = 0xB7D2 ^ 0xB7D3;
                    ahm.oOoO0OoOOOoO[0x1094B ^ 0x10954] = 0x1097B ^ 0x10954;
                    ahm.oOoO0OoOOOoO[0x9898 ^ 0x988A] = 0x98E7 ^ 0x988A;
                    n3 = 406485804;
                    continue block81;
                }
                case 406485804: {
                    ahm.oOoO0OoOOOoO[0x120 ^ 0x1F9] = 0x1CE ^ 0x1F9;
                    ahm.oOoO0OoOOOoO[0x7D32 ^ 0x7DD9] = 0x5D173815 ^ 0x7DD9;
                    ahm.oOoO0OoOOOoO[0xA8BF ^ 0xA8AB] = 0xA8B2 ^ 0xA8AB;
                    ahm.oOoO0OoOOOoO[0xDD5F ^ 0xDC2A] = 0xDC2D ^ 0xDC2A;
                    ahm.oOoO0OoOOOoO[0xA99E ^ 0xA916] = 0xA90B ^ 0xA916;
                    ahm.oOoO0OoOOOoO[0xF640 ^ 0xF712] = 0xFFFF0881 ^ 0xF712;
                    return;
                }
                default: {
                    oOoO0OoOOOoO = new int[0xF13B ^ 0xF0AB];
                    ahm.oOoO0OoOOOoO[0xB440 ^ 0xB438] = 0x8430 ^ 0xB438;
                    ahm.oOoO0OoOOOoO[0x2DF7 ^ 0x2D66] = 0xCCCCE659 ^ 0x2D66;
                    ahm.oOoO0OoOOOoO[0x6A87 ^ 0x6B97] = 0x6B98 ^ 0x6B97;
                    n3 = -81432672;
                    continue block81;
                }
                case -81432672: 
            }
            ahm.oOoO0OoOOOoO[0xEBB6 ^ 0xEB38] = 0xBA2E609B ^ 0xEB38;
            ahm.oOoO0OoOOOoO[0x478C ^ 0x4768] = 0xFFFFB893 ^ 0x4768;
            ahm.oOoO0OoOOOoO[0x104DA ^ 0x105B9] = 0xFFFEFA7F ^ 0x105B9;
            ahm.oOoO0OoOOOoO[0xCFF3 ^ 0xCEB3] = 0xFFFF311E ^ 0xCEB3;
            ahm.oOoO0OoOOOoO[0x31CB ^ 0x30E9] = 0x30B0 ^ 0x30E9;
            ahm.oOoO0OoOOOoO[0xB3A6 ^ 0xB352] = 0x800082BC ^ 0xB352;
            ahm.oOoO0OoOOOoO[0x8808 ^ 0x8855] = 0x8850 ^ 0x8855;
            ahm.oOoO0OoOOOoO[0x879B ^ 0x86E9] = 0x86F0 ^ 0x86E9;
            n3 = 1277884290;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ Path vI() {
        int n2 = 1539949677;
        if (n2 != n2) {
            int cfr_ignored_0 = 66 + 56;
        }
        if ((n2 = -550923695) != n2) {
            oo0O0o0OOo0O = n2 = 1015251006;
        }
        Object[] objectArray = new Object[5];
        int n3 = -1828800515;
        objectArray[4] = aeg.sl();
        if ((aeh)((Object)objectArray[4]) == aeh.aEX) {
            int n4 = 2147482013 * 630453915;
            objectArray[3] = System.getenv((String)ooO00oO0OoO0[n4 >>> 31 | n4 << 1]);
            if (!StringUtils.isBlank((CharSequence)((String)objectArray[3]))) {
                String[] stringArray = new String[648615412 * 75 * 95];
                int n5 = ~(~(0 << 23 | 0 >>> 9));
                int n6 = ~(-1212417 << 19 | -1212417 >>> 13);
                int n7 = n6 >>> 17 | n6 << 15;
                stringArray[n5 >>> 1 | n5 << 31] = (String)ooO00oO0OoO0[n7 >>> 17 | n7 << 15];
                int n8 = 1375724466 * -41;
                int n9 = --1073741829;
                stringArray[(n8 << 21 | n8 >>> 11) * 113] = (String)ooO00oO0OoO0[n9 >>> 29 | n9 << 3];
                int n10 = -1280230530 + -107;
                int n11 = -(-168);
                stringArray[(n10 << 5 | n10 >>> 27) * -13] = (String)ooO00oO0OoO0[n11 >>> 3 | n11 << 29];
                stringArray[-(-(27 - -25 + -49))] = (String)ooO00oO0OoO0[~(-4400 + -83) * 724452315];
                return Paths.get((String)objectArray[3], stringArray);
            }
            return null;
        }
        if ((aeh)((Object)objectArray[4]) != aeh.aEV && (aeh)((Object)objectArray[4]) != aeh.aEY) {
            int n12 = -2011006884;
            if ((aeh)((Object)objectArray[4]) != aeh.aEW) return null;
        }
        int n13 = --1862419453 * 113 + 19;
        int n14 = 0 << 13 | 0 >>> 19;
        int n15 = n14 << 11 | n14 >>> 21;
        return Paths.get((String)ooO00oO0OoO0[n13 << 27 | n13 >>> 5], new String[-(n15 >>> 23 | n15 << 9)]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ boolean a(Pattern[] patternArray) {
        int n2;
        int n3 = -439061418;
        if (n3 != n3) {
        }
        int n4 = 418338000;
        switch (n4) {
            default: {
                if (ahm.b(patternArray) != null) break;
                n2 = oOoO0OoOOOoO[33] + oOoO0OoOOOoO[34] + oOoO0OoOOOoO[35] - oOoO0OoOOOoO[36];
                return n2 != 0;
            }
            case -1307744557: 
        }
        int n5 = oOoO0OoOOOoO[28];
        n2 = (n5 << oOoO0OoOOOoO[29] | n5 >>> oOoO0OoOOOoO[30]) * oOoO0OoOOOoO[31] * oOoO0OoOOOoO[32];
        return n2 != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static /* bridge */ strictfp /* synthetic */ boolean vH() {
        block16: {
            block17: {
                block15: {
                    block13: {
                        block14: {
                            var4 = -629667315;
                            if (var4 == var4) break block17;
                            61 + 14;
                            break block17;
lbl6:
                            // 1 sources

                            return (boolean)(v0 << 3 | v0 >>> 29);
lbl8:
                            // 2 sources

                            while (true) {
                                var2_1 = new Object[2];
                                var2_1[1] = ahm.vI();
                                if ((Path)var2_1[1] == null) ** GOTO lbl17
                                if (!Files.exists((Path)var2_1[1], new LinkOption[(-939524095 << 5 | -939524095 >>> 27) - 57])) ** GOTO lbl17
                                if (Files.isReadable((Path)var2_1[1])) break block13;
lbl17:
                                // 3 sources

                                v1 = ~(~0);
                                break block14;
                                break;
                            }
lbl19:
                            // 2 sources

                            while (true) {
                                var4 = -256919657;
                                if (var4 == var4) ** GOTO lbl8
                                var4 = -993842849;
                                ** continue;
                                break;
                            }
                        }
                        return v1;
                    }
                    try {
                        var2_1[0] = new String(Files.readAllBytes((Path)var2_1[1])).toLowerCase(Locale.ENGLISH);
                        v2 = --5120;
                        if (((String)var2_1[0]).contains((String)ahm.ooO00oO0OoO0[v2 >>> 9 | v2 << 23])) ** GOTO lbl44
                    }
                    catch (Exception var2_1[1]) {
                        v0 = ~(155 - 101 ^ -55);
                        ** continue;
                    }
                    if (((String)var2_1[0]).contains((String)ahm.ooO00oO0OoO0[(-4784129 >>> 11 | -4784129 << 21) * 349184333])) ** GOTO lbl44
                    v3 = 106496 >>> 15 | 106496 << 17;
                    if (((String)var2_1[0]).contains((String)ahm.ooO00oO0OoO0[v3 >>> 29 | v3 << 3])) ** GOTO lbl44
                    v4 = -(-1073741349 >>> 3 | -1073741349 << 29);
                    if (((String)var2_1[0]).contains((String)ahm.ooO00oO0OoO0[(v4 >>> 27 | v4 << 5) * 0x23023023])) ** GOTO lbl44
                    if (!((String)var2_1[0]).contains((String)ahm.ooO00oO0OoO0[~-104755300 * -123 + -61])) break block15;
lbl44:
                    // 5 sources

                    v5 = (0xF000000 >>> 21 | 0xF000000 << 11) + -119;
                    break block16;
                }
                v5 = -0 * 0x5050505;
                break block16;
            }
            if ((var4 = -861059604) == var4) ** GOTO lbl19
            ** while (true)
        }
        return (boolean)v5;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ boolean vK() {
        ArrayList arrayList;
        int n2 = 1484471807;
        if (n2 != n2) {
        }
        if ((n2 = -2111367138) != n2) {
            n2 = -2042017797;
        }
        if ((n2 = 406373344) != n2) {
            throw null;
        }
        Object[] objectArray = new Object[12];
        objectArray[4] = ahm.vL();
        int n3 = (g)objectArray[4] == null ? -1614757313 : 1149079637;
        switch (n3) {
            default: {
                int n4 = -194656 * -1631000239;
                return (n4 << 27 | n4 >>> 5) + -77 != 0;
            }
            case 1149079637: 
        }
        objectArray[10] = ((g)objectArray[4]).SD().b((g)objectArray[4]);
        ArrayList arrayList2 = ((Collection)objectArray[10]).stream().filter(ahm::b).collect(Collectors.toList());
        int n5 = 0x1E045 ^ 0x45;
        if (arrayList2.size() > (n5 >>> 13 | n5 << 19)) {
            arrayList = Lists.newArrayList((Iterable)Iterables.skip(arrayList2, (int)(arrayList2.size() - (97 - 45 + -37))));
        } else {
            int n6 = 2055286189;
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = arrayList;
        int n7 = 1299893175;
        StringBuilder stringBuilder = new StringBuilder();
        objectArray[2] = arrayList3.iterator();
        while (((Iterator)objectArray[2]).hasNext()) {
            objectArray[3] = (d)((Iterator)objectArray[2]).next();
            objectArray[1] = ((g)objectArray[4]).SD().fs(((d)objectArray[3]).getPlayerName());
            objectArray[6] = an.ge(h.a((h)objectArray[1], ((d)objectArray[3]).getPlayerName()));
            if ((String)objectArray[6] == null || ((String)objectArray[6]).isEmpty()) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append(-(-4063233 << 15 | -4063233 >>> 17));
            }
            stringBuilder.append((String)objectArray[6]);
        }
        return aPA.matcher(stringBuilder).find();
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ g vL() {
        block32: {
            block30: {
                block28: {
                    block29: {
                        var16 = 1872074035;
                        if (var16 == var16) break block30;
                        32 & 1;
                        break block30;
lbl6:
                        // 1 sources

                        while (true) {
                            v0 = var12_5[6];
                            var12_5[6] = var13_6 = v0 ^ ((long)((an)var11_4[7]).asv() << ~(-2401) * -1775253149 ^ v0) & -1L << -(~(57 - 73) - 47);
                            v1 = --126896761;
                            if ((int)(var12_5[6] >>> (v1 << 5 | v1 >>> 27) * -55) > (135299588 >>> 15 | 135299588 << 17) * -723362913 * -127 * 1) {
                                var9_7 = -1297075271;
                                v2 = ~(-1666710882 ^ 67);
                                var2_2 = ((i)var11_4[5]).gY((v2 << 19 | v2 >>> 13) * -67 + (int)(var12_5[6] >>> ~(~(-531757841 ^ -49)) * 105));
                            }
lbl14:
                            // 5 sources

                            while (true) {
                                block26: {
                                    block27: {
                                        block31: {
                                            block25: {
                                                var10_8 = 49483234;
                                                break block26;
lbl17:
                                                // 1 sources

                                                while (true) {
                                                    if (ahm.a(var2_2)) {
                                                        return var2_2;
                                                    }
lbl20:
                                                    // 3 sources

                                                    while (true) {
                                                        if (!ahm.a(var1_1)) break block25;
                                                        var10_8 = 2026774247;
                                                        break block26;
                                                        break;
                                                    }
                                                    break;
                                                }
lbl24:
                                                // 1 sources

                                                while (true) {
                                                    var10_8 = 380302567;
                                                    break block26;
                                                    break;
                                                }
lbl27:
                                                // 1 sources

                                                return var1_1;
                                            }
                                            if (var2_2 == null) break block31;
                                            var10_8 = -1116757822;
                                            break block26;
lbl33:
                                            // 1 sources

                                            while (true) {
                                                v3 = var2_2;
                                                break block27;
                                                break;
                                            }
                                        }
                                        v3 = var1_1;
                                    }
                                    return v3;
                                }
                                switch (var10_8) {
                                    default: {
                                        ** continue;
                                    }
                                    case 430871321: {
                                        ** continue;
                                    }
                                    case 2026774247: {
                                        ** continue;
                                    }
                                    case 380302567: {
                                        ** continue;
                                    }
                                    ** case -1116757822:
lbl51:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                            break;
                        }
lbl52:
                        // 2 sources

                        while (true) {
                            var11_4 = new Object[11];
                            var12_5 = new long[11];
                            if (ahm.aER == null || ahm.aER.bgF == null) break block28;
                            break block29;
                            break;
                        }
lbl57:
                        // 2 sources

                        while (true) {
                            var16 = -239886555;
                            if (var16 == var16 || 1068022532 == 0) {
                                // empty if block
                            }
                            if ((var16 = -1961206433) == var16) ** GOTO lbl52
                            ** continue;
                            break;
                        }
                    }
                    if (ahm.aER.bgK != null) ** GOTO lbl73
                }
                var8_3 = -578228967;
                block20: while (true) {
                    switch (var8_3) {
                        default: {
                            return null;
                        }
lbl73:
                        // 2 sources

                        case 1455189261: {
                            var8_3 = -744821087;
                            continue block20;
                        }
                        case -744821087: 
                    }
                    break;
                }
                break block32;
            }
            if ((var16 = -1878524305) == var16 || 1805826405 == 0) ** GOTO lbl57
            ** while (true)
        }
        var11_4[5] = ahm.aER.bgF.SD();
        if ((i)var11_4[5] == null) {
            return null;
        }
        var1_1 = ((i)var11_4[5]).gY(-(-(-97 ^ -9) ^ 103));
        var2_2 = null;
        var11_4[1] = ((i)var11_4[5]).fs(ahm.aER.bgK.xU());
        if ((h)var11_4[1] == null) ** GOTO lbl14
        var11_4[7] = ((h)var11_4[1]).akz();
        if ((an)var11_4[7] != null) ** break;
        ** while (true)
        var12_5[6] = var13_6 = -9033455507409032537L;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ boolean vB() {
        block7: {
            int n2;
            long[] lArray;
            block8: {
                long l2;
                int n3 = -2051536178;
                if (n3 != n3) {
                    oo0O0o0OOo0O = n3 = 789205271;
                }
                if ((n3 = 1786573766) != n3) {
                    int cfr_ignored_0 = 0x13 & 1;
                }
                if ((n3 = 1101984355) != n3) {
                }
                lArray = new long[5];
                if (aER == null) return -(-oOoO0OoOOOoO[0]) - oOoO0OoOOOoO[1] + oOoO0OoOOOoO[2];
                if (ahm.aER.bgF == null) return -(-oOoO0OoOOOoO[0]) - oOoO0OoOOOoO[1] + oOoO0OoOOOoO[2];
                if (ahm.aER.bgK == null) break block7;
                lArray[1] = l2 = -8210460060232684605L;
                long l3 = lArray[1];
                lArray[1] = l2 = l3 ^ ((long)((int)(ahm.aER.bgF.getTotalWorldTime() / 5L)) << -(oOoO0OoOOOoO[3] - oOoO0OoOOOoO[4]) * oOoO0OoOOOoO[5] ^ l3) & -1L << (-oOoO0OoOOOoO[6] ^ oOoO0OoOOOoO[7]) * oOoO0OoOOOoO[8] + oOoO0OoOOOoO[9];
                int n4 = aPN == ahm.aER.bgF && aPL == (int)(lArray[1] >>> (oOoO0OoOOOoO[10] ^ oOoO0OoOOOoO[11]) * oOoO0OoOOOoO[12] * oOoO0OoOOOoO[13]) ? -372505321 : -367747494;
                switch (n4) {
                    default: {
                        return aPM;
                    }
                    case -367747494: {
                        if (!ahm.vK() && !ahm.cj((String)ooO00oO0OoO0[-oOoO0OoOOOoO[14] - oOoO0OoOOOoO[15]])) break;
                        int n5 = oOoO0OoOOOoO[16] - oOoO0OoOOOoO[17] - oOoO0OoOOOoO[18];
                        n2 = n5 << oOoO0OoOOOoO[19] | n5 >>> oOoO0OoOOOoO[20];
                        break block8;
                    }
                    case -730014289: 
                }
                n2 = (oOoO0OoOOOoO[21] - oOoO0OoOOOoO[22]) * oOoO0OoOOOoO[23];
            }
            aPM = n2;
            int n6 = oOoO0OoOOOoO[24] - oOoO0OoOOOoO[25];
            aPL = (int)(lArray[1] >>> (n6 << oOoO0OoOOOoO[26] | n6 >>> oOoO0OoOOOoO[27]));
            aPN = ahm.aER.bgF;
            return aPM;
        }
        return -(-oOoO0OoOOOoO[0]) - oOoO0OoOOOoO[1] + oOoO0OoOOOoO[2] != 0;
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) {
        block46: {
            block52: {
                block50: {
                    block48: {
                        block49: {
                            block47: {
                                block51: {
                                    block45: {
                                        var34_2 = 441001171;
                                        if (var34_2 == var34_2) break block51;
                                        var34_2 = 9;
                                        break block51;
lbl6:
                                        // 1 sources

                                        while (true) {
                                            v0 = -((char)((char)(~((char)(-((char)((char)((char)((char)(~((char)((char)(v1[v2] - v2) + v2))) - v2) + 45572) + v2))))) + v2));
                                            v3 = (char)((char)((char)(-((char)(v0 << 3 | v0 >>> 13))) ^ 33898) + 37275);
                                            v1[v2] = (char)(v3 >>> 7 | v3 << 9);
                                            var30_6[3] = var31_7 = (long)((int)var30_6[3] + 1);
lbl11:
                                            // 2 sources

                                            while ((int)var30_6[3] >= ((char[])var29_5[16]).length) {
                                                v4 = new String((char[])var29_5[16]);
                                                break block45;
                                            }
                                            break block46;
                                            break;
                                        }
lbl15:
                                        // 2 sources

                                        while ((var34_2 = 720386189) != var34_2) {
                                            4 + 75;
                                            break block47;
                                        }
                                        break block47;
                                    }
lbl21:
                                    // 2 sources

                                    while (true) {
                                        var29_5[19] = SecretKeyFactory.getInstance(v4);
                                        var29_5[8] = new byte[16];
                                        ((byte[])var29_5[8])[14] = 87;
                                        ((byte[])var29_5[8])[2] = 35;
                                        var25_8 = -1031528603;
                                        break block48;
lbl28:
                                        // 1 sources

                                        while (true) {
                                            ((byte[])var29_5[8])[9] = -7;
                                            ((byte[])var29_5[8])[3] = -90;
                                            ((byte[])var29_5[8])[15] = 35;
                                            var25_8 = -584972503;
                                            break block48;
                                            break;
                                        }
lbl34:
                                        // 1 sources

                                        while (true) {
                                            ((byte[])var29_5[8])[1] = 40;
                                            var25_8 = 1993029213;
                                            break block48;
                                            break;
                                        }
lbl38:
                                        // 1 sources

                                        while (true) {
                                            ((byte[])var29_5[8])[10] = 48;
                                            ((byte[])var29_5[8])[13] = -123;
                                            var25_8 = -5660288;
                                            break block48;
                                            break;
                                        }
lbl43:
                                        // 1 sources

                                        while (true) {
                                            ((byte[])var29_5[8])[7] = -44;
                                            ((byte[])var29_5[8])[4] = -34;
                                            ((byte[])var29_5[8])[6] = -29;
                                            ((byte[])var29_5[8])[8] = -64;
                                            var25_8 = 1649018433;
                                            break block48;
                                            break;
                                        }
lbl50:
                                        // 1 sources

                                        while (true) {
                                            ((byte[])var29_5[8])[12] = 106;
                                            ((byte[])var29_5[8])[5] = 97;
                                            var25_8 = 771906778;
                                            break block48;
                                            break;
                                        }
lbl55:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                if ((var34_2 = 1629784925) == var34_2) ** GOTO lbl15
                                53 & 1;
                                ** GOTO lbl15
                                ((byte[])var29_5[8])[0] = -116;
                                ((byte[])var29_5[8])[11] = -61;
                                var7_9 = new PBEKeySpec(new String((byte[])var29_5[0], StandardCharsets.UTF_8).toCharArray(), (byte[])var29_5[8], 16, 256);
                                var29_5[1] = ((SecretKeyFactory)var29_5[19]).generateSecret(var7_9).getEncoded();
                                v5 = (byte[])var29_5[1];
                                v6 = ahm.o0oO00oOO0oO[2];
                                if (v6 == null) {
                                    var29_5[16] = "\u8fd3\u5154\u19d4".toCharArray();
                                    var30_6[3] = var31_7 = (long)0;
                                    while ((int)var30_6[3] < ((char[])var29_5[16]).length) {
                                        v7 = (char[])var29_5[16];
                                        v8 = (int)var30_6[3];
                                        v9 = (char)(v7[v8] ^ 32352);
                                        v10 = (char)(v9 >>> 4 | v9 << 12);
                                        v11 = (char)(v10 << 13 | v10 >>> 3);
                                        v12 = (char)(v11 << 11 | v11 >>> 5);
                                        v13 = (char)((char)(~((char)((char)((char)(v12 << 14 | v12 >>> 2) - v8) - v8))) ^ v8);
                                        v14 = (char)(v13 >>> 8 | v13 << 8);
                                        v7[v8] = (char)((char)((char)(v14 << 15 | v14 >>> 1) + 26661) - v8);
                                        var30_6[3] = var31_7 = (long)((int)var30_6[3] + 1);
                                    }
                                    v6 = new String((char[])var29_5[16]);
                                }
                                ahm.oOO00OO0OOO0 = new SecretKeySpec(v5, v6);
lbl85:
                                // 2 sources

                                while (true) {
                                    var29_5[5] = Base64.getDecoder().decode(var1_1);
                                    var29_5[14] = Arrays.copyOfRange((byte[])var29_5[5], 0, 16);
                                    var29_5[4] = Arrays.copyOfRange((byte[])var29_5[5], 16, ((byte[])var29_5[5]).length);
                                    v15 = ahm.o0oO00oOO0oO[3];
                                    if (v15 != null) break block49;
                                    var27_10 = 537083998;
                                    var29_5[16] = "\uc47a\u446e\uc448\u4398\uc38f\uc3ef\uc3ce\u4716\u4705\u4767\uc754\u46aa\uc6fa\uc6ec\uc6e3\uc641\u4617\u467c\u4659\u45bc".toCharArray();
                                    var30_6[3] = var31_7 = (long)0;
lbl94:
                                    // 2 sources

                                    while (true) {
                                        if ((int)var30_6[3] < ((char[])var29_5[16]).length) {
                                            v16 = (char[])var29_5[16];
                                            v17 = (int)var30_6[3];
                                            v18 = -((char)((char)(~v16[v17]) - 62586));
                                            v19 = (char)((char)((char)(v18 >>> 5 | v18 << 11) ^ 9805) - v17);
                                            v16[v17] = (char)((char)((char)((char)((char)((char)(-((char)(~((char)(v19 >>> 10 | v19 << 6))))) ^ 7646) + 196) - v17) ^ v17) ^ v17);
                                            var28_11 = 1387562572;
                                            break block50;
lbl103:
                                            // 1 sources

                                            while (true) {
                                                var30_6[3] = var31_7 = (long)((int)var30_6[3] + 1);
                                                var28_11 = 863774632;
                                                break block50;
                                                break;
                                            }
                                        }
                                        var28_11 = 87413191;
                                        break block50;
                                        break;
                                    }
lbl109:
                                    // 1 sources

                                    while (true) {
                                        v15 = new String((char[])var29_5[16]);
                                        break block49;
                                        break;
                                    }
                                    break;
                                }
                            }
                            if ((var34_2 = -1297475632) != var34_2) {
                                var34_2 = 1865665357;
                            }
                            break block52;
                        }
                        var29_5[2] = Cipher.getInstance(v15);
                        ((Cipher)var29_5[2]).init(2, (Key)((SecretKey)ahm.oOO00OO0OOO0), new IvParameterSpec((byte[])var29_5[14]));
                        var29_5[6] = ((Cipher)var29_5[2]).doFinal((byte[])var29_5[4]);
                        ahm.oooO0ooOOooO[var0] = new String((byte[])var29_5[6], StandardCharsets.UTF_8);
                        return ahm.oooO0ooOOooO[var0];
                    }
                    switch (var25_8) {
                        default: {
                            ** continue;
                        }
                        case -584972503: {
                            ** continue;
                        }
                        case 1993029213: {
                            ** continue;
                        }
                        case -5660288: {
                            ** continue;
                        }
                        case 1649018433: {
                            ** continue;
                        }
                        ** case 771906778:
lbl135:
                        // 1 sources

                        ** continue;
                    }
                }
                switch (var28_11) {
                    default: {
                        ** continue;
                    }
                    case 863774632: {
                        ** continue;
                    }
                    ** case 87413191:
lbl143:
                    // 1 sources

                    ** continue;
                }
            }
            var29_5 = new Object[27];
            var30_6 = new long[27];
            v20 = ahm.o0O000O0O0O0;
            if (ahm.o0O000O0O0O0 == null) {
                v21 = new Object[1];
                ahm.o0O000O0O0O0 = v21;
                v20 = v21;
                var29_5[24] = new byte[61805 ^ 61821];
                ((byte[])var29_5[24])[5184 ^ 5187] = -5230 ^ 5187;
                ((byte[])var29_5[24])[28241 ^ 28245] = 28198 ^ 28245;
                ((byte[])var29_5[24])[65548 ^ 65546] = -65584 ^ 65546;
                ((byte[])var29_5[24])[57218 ^ 57224] = 57272 ^ 57224;
                ((byte[])var29_5[24])[66211 ^ 66221] = -66178 ^ 66221;
                ((byte[])var29_5[24])[29020 ^ 29013] = -28949 ^ 29013;
                ((byte[])var29_5[24])[56206 ^ 56194] = -56201 ^ 56194;
                ((byte[])var29_5[24])[66145 ^ 66148] = -66101 ^ 66148;
                ((byte[])var29_5[24])[23814 ^ 23809] = 23894 ^ 23809;
                ((byte[])var29_5[24])[43409 ^ 43417] = -43491 ^ 43417;
                ((byte[])var29_5[24])[39970 ^ 39977] = -39940 ^ 39977;
                ((byte[])var29_5[24])[34152 ^ 34149] = -34153 ^ 34149;
                ((byte[])var29_5[24])[61726 ^ 61726] = 61789 ^ 61726;
                ((byte[])var29_5[24])[23389 ^ 23388] = 23405 ^ 23388;
                ((byte[])var29_5[24])[24957 ^ 24959] = -24881 ^ 24959;
                ((byte[])var29_5[24])[55498 ^ 55493] = -55453 ^ 55493;
                v21[0] = (byte[])var29_5[24];
            }
            var29_5[22] = (byte[])v20[0];
            ** while (ahm.oOO00OO0OOO0 != null)
lbl172:
            // 1 sources

            var29_5[9] = new byte[6221 ^ 6253];
            ((byte[])var29_5[9])[56437 ^ 56428] = -56414 ^ 56428;
            ((byte[])var29_5[9])[6040 ^ 6045] = 6124 ^ 6045;
            ((byte[])var29_5[9])[10030 ^ 10017] = -9995 ^ 10017;
            ((byte[])var29_5[9])[49462 ^ 49461] = 49535 ^ 49461;
            ((byte[])var29_5[9])[36589 ^ 36607] = -36485 ^ 36607;
            ((byte[])var29_5[9])[62565 ^ 62569] = -62563 ^ 62569;
            var22_3 = -562093384;
            block39: while (true) {
                switch (var22_3) {
                    default: {
                        ((byte[])var29_5[9])[35991 ^ 35990] = 35990 ^ 35990;
                        ((byte[])var29_5[9])[56898 ^ 56920] = 56896 ^ 56920;
                        ((byte[])var29_5[9])[23714 ^ 23718] = 23738 ^ 23718;
                        ((byte[])var29_5[9])[8604 ^ 8594] = -8621 ^ 8594;
                        var22_3 = 1716455204;
                        continue block39;
                    }
                    case 1716455204: {
                        ((byte[])var29_5[9])[17944 ^ 17927] = 17931 ^ 17927;
                        ((byte[])var29_5[9])[18159 ^ 18170] = 18093 ^ 18170;
                        ((byte[])var29_5[9])[7633 ^ 7629] = -7609 ^ 7629;
                        ((byte[])var29_5[9])[52003 ^ 52020] = -51981 ^ 52020;
                        var22_3 = -721368501;
                        continue block39;
                    }
                    case -721368501: {
                        ((byte[])var29_5[9])[28356 ^ 28367] = 28322 ^ 28367;
                        var22_3 = -1435637994;
                        continue block39;
                    }
                    case -1435637994: {
                        ((byte[])var29_5[9])[63483 ^ 63475] = -63463 ^ 63475;
                        ((byte[])var29_5[9])[7523 ^ 7530] = 7535 ^ 7530;
                        var22_3 = -1105665081;
                        continue block39;
                    }
                    case -1105665081: {
                        ((byte[])var29_5[9])[37652 ^ 37641] = 37639 ^ 37641;
                        ((byte[])var29_5[9])[19417 ^ 19401] = 19334 ^ 19401;
                        ((byte[])var29_5[9])[57095 ^ 57089] = -57202 ^ 57089;
                        var22_3 = -846534947;
                        continue block39;
                    }
                    case -846534947: {
                        ((byte[])var29_5[9])[55683 ^ 55689] = -55750 ^ 55689;
                        ((byte[])var29_5[9])[46922 ^ 46942] = 46917 ^ 46942;
                        ((byte[])var29_5[9])[60201 ^ 60201] = 60209 ^ 60201;
                        ((byte[])var29_5[9])[47782 ^ 47805] = -47777 ^ 47805;
                        ((byte[])var29_5[9])[59863 ^ 59844] = 59892 ^ 59844;
                        ((byte[])var29_5[9])[25196 ^ 25204] = -25130 ^ 25204;
                        var22_3 = -1610499454;
                        continue block39;
                    }
                    case -1610499454: {
                        ((byte[])var29_5[9])[44777 ^ 44779] = 44775 ^ 44779;
                        var22_3 = -1948833138;
                        continue block39;
                    }
                    case -1948833138: 
                }
                break;
            }
            ((byte[])var29_5[9])[54195 ^ 54196] = 54207 ^ 54196;
            ((byte[])var29_5[9])[4896 ^ 4913] = 4910 ^ 4913;
            ((byte[])var29_5[9])[59131 ^ 59109] = 59088 ^ 59109;
            ((byte[])var29_5[9])[54781 ^ 54763] = 54701 ^ 54763;
            ((byte[])var29_5[9])[4698 ^ 4695] = 4688 ^ 4695;
            var29_5[0] = new byte[((byte[])var29_5[22]).length + ((byte[])var29_5[9]).length];
            var23_4 = 59303724;
            block40: while (true) {
                switch (var23_4) {
                    default: {
                        System.arraycopy((byte[])var29_5[22], 0, (byte[])var29_5[0], 0, ((byte[])var29_5[22]).length);
                        var23_4 = 646537734;
                        continue block40;
                    }
                    case 646537734: 
                }
                break;
            }
            System.arraycopy((byte[])var29_5[9], 0, (byte[])var29_5[0], ((byte[])var29_5[22]).length, ((byte[])var29_5[9]).length);
            ** while ((v4 = ahm.o0oO00oOO0oO[1]) != null)
lbl241:
            // 1 sources

            var29_5[16] = "\uefc0\uf0a1\uef12\uef83\uef64\uf1a5\uee56\ued37\uec88\ued49\uef4a\uedfb\ueebc\uee9d\uef9e\uef4f\uf0c0\uf1c1".toCharArray();
            var30_6[3] = var31_7 = (long)0;
            ** GOTO lbl11
        }
        v1 = (char[])var29_5[16];
        v2 = (int)var30_6[3];
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ String vJ() {
        block27: {
            block31: {
                block30: {
                    block26: {
                        block29: {
                            block25: {
                                var21 = -1046231905;
                                if (var21 == var21) break block27;
                                var21 = -735232112;
                                break block27;
lbl5:
                                // 1 sources

                                return ahm.aPP;
lbl7:
                                // 1 sources

                                while (true) {
                                    block28: {
                                        var16_1[10] = ahm.vL();
                                        var14_5 = 1947236081;
                                        if ((g)var16_1[10] == null) {
                                            ahm.aPQ = ahm.aER.bgF;
                                            ahm.aPO = (int)(var17_2[3] >>> (0x3F3F3F3E * 85 ^ -79 ^ 7));
                                            ahm.aPP = "";
                                            return "";
                                        }
                                        var16_1[9] = ((g)var16_1[10]).SD().b((g)var16_1[10]);
                                        var3_6 = ((Collection)var16_1[9]).stream().filter((Predicate<d>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, c(net.minecraft.scoreboard.d ), (Lnet/minecraft/scoreboard/d;)Z)()).collect(Collectors.toList());
                                        if (var3_6.size() <= -0x62762766 * 13 - -61) break block28;
                                        v0 = Lists.newArrayList((Iterable)Iterables.skip(var3_6, (int)(var3_6.size() - (-75 + 89 - -1))));
                                        ** GOTO lbl25
                                    }
lbl21:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl23:
                                    // 1 sources

                                    while (true) {
                                        v0 = var3_6;
lbl25:
                                        // 2 sources

                                        var4_8 = v0;
                                        var5_9 = new StringBuilder();
                                        var16_1[15] = var4_8.iterator();
                                        while (((Iterator)var16_1[15]).hasNext()) {
                                            var16_1[6] = (d)((Iterator)var16_1[15]).next();
                                            var16_1[14] = ((g)var16_1[10]).SD().fs(((d)var16_1[6]).getPlayerName());
                                            var16_1[5] = an.ge(h.a((h)var16_1[14], ((d)var16_1[6]).getPlayerName()));
                                            if ((String)var16_1[5] == null || ((String)var16_1[5]).isEmpty()) continue;
                                            if (var5_9.length() > 0) {
                                                var5_9.append(-(-1742885235 - 45) * 69);
                                            }
                                            var5_9.append((String)var16_1[5]);
                                        }
                                        ahm.aPQ = ahm.aER.bgF;
                                        ahm.aPO = (int)(var17_2[3] >>> (~(-1941 + 95) + -85) * 1483715975);
                                        ahm.aPP = ahm.ck(var5_9.toString());
                                        return ahm.aPP;
                                    }
                                    var15_7 = 1422955188;
                                    switch (var15_7) {
                                        default: {
                                            ** continue;
                                        }
                                        ** case 1422955188:
lbl48:
                                        // 1 sources

                                        ** continue;
                                    }
                                    break;
                                }
                                while (true) {
                                    break block25;
                                    break;
                                }
lbl51:
                                // 2 sources

                                while (true) {
                                    if ((var21 = 249189189) == var21) ** continue;
                                    throw null;
                                }
                            }
                            var16_1 = new Object[16];
                            var17_2 = new long[16];
                            if (ahm.aER == null) break block26;
                            var12_4 = 1927085900;
                            block15: while (true) {
                                switch (var12_4) {
                                    default: {
                                        var12_4 = 5410704;
                                        continue block15;
                                    }
                                    case 5410704: {
                                        if (ahm.aER.bgF != null) {
                                            var12_4 = -433742636;
                                            continue block15;
                                        }
                                        break block26;
                                    }
                                    case -433742636: {
                                        break block15;
                                    }
                                }
                                break;
                            }
                            break block29;
lbl72:
                            // 2 sources

                            while (true) {
                                var21 = -353015000;
                                if (var21 == var21) ** GOTO lbl51
                                76 & 1;
                                ** continue;
                                break;
                            }
                        }
                        if (ahm.aER.bgK != null) break block30;
                    }
                    return "";
                }
                var17_2[3] = var18_3 = 1107988489315159975L;
                v1 = ~-65537;
                v2 = var17_2[3];
                break block31;
lbl87:
                // 1 sources

                while (true) {
                    var21 = -838287822;
                    if (var21 == var21) ** GOTO lbl72
                    54 + 42;
                    ** continue;
                    break;
                }
            }
            var17_2[3] = var18_3 = v2 ^ ((long)((int)(ahm.aER.bgF.getTotalWorldTime() / 5L)) << (v1 >>> 11 | v1 << 21) ^ v2) & -1L << (-29229057 >>> 17 | -29229057 << 15) * 0x49249249;
            ** while (ahm.aPQ != ahm.aER.bgF || ahm.aPO != (int)(var17_2[3] >>> (-((-678152628 + -101) * 57) ^ -79)))
lbl96:
            // 1 sources

            ** while (true)
        }
        ** while ((var21 = -1013339213) == var21)
lbl99:
        // 1 sources

        throw null;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ boolean oi() {
        block26: {
            block25: {
                var20 = -638286771;
                if (var20 != var20) {
                    92 & 1;
                }
                if ((var20 = -246609264) != var20) {
                    throw null;
                }
                var20 = -912594685;
                if (var20 != var20) {
                    var20 = 43;
                }
                if ((var20 = -1261370083) == var20) break block26;
                54 + 23;
                break block26;
                while (true) {
                    var13_4 = 185889645;
                    break block25;
                    break;
                }
lbl18:
                // 1 sources

                block14: while (true) {
                    if ((int)var16_1[14] <= ~(321 * -1431655765 + 7) - -117) {
                        v0 = var16_1[10];
                        var16_1[10] = var17_2 = v0 ^ (-8589934592L ^ v0) & -1L << ~(~32);
                    } else {
                        v1 = -5463392 * -1455319497;
                        ahm.aPS = (int)(var16_1[14] >>> -(102 - 109) + 25) >= ((v1 << 27 | v1 >>> 5) - 115) * 2014922929 ? 373475418 * -115 ^ -109 : -54 + 3 - -51;
                        ahm.aPR = (int)var16_1[0];
                        return ahm.aPS;
                    }
lbl27:
                    // 3 sources

                    while (true) {
                        var14_5 = -1468420027;
                        if (true) ** GOTO lbl35
                        break;
                    }
lbl30:
                    // 3 sources

                    while (true) {
                        var16_1[10] = var17_2 = var16_1[10] + 0x100000000L;
                        ** GOTO lbl27
                        break;
                    }
                    block17: while (true) {
                        var14_5 = -641210539;
lbl35:
                        // 2 sources

                        switch (var14_5) {
                            default: {
                                continue block14;
                            }
                            case -699773322: {
                                ** continue;
                            }
                            case -1468420027: {
                                v2 = ~(-262145);
                                if ((int)(var16_1[10] >>> -(-1036716261 * -29 * 0x49249249 - -39)) > (v2 << 15 | v2 >>> 17)) continue block17;
                                if (!ahm.i((int)var16_1[10] + (int)var16_1[14], (int)(var16_1[0] >>> ((186310656 << 19 | 186310656 >>> 13) + 9) * -1631000239 * -954437177) + (int)(var16_1[10] >>> -(-32)))) ** GOTO lbl30
                                var16_1[14] = var17_2 = var16_1[14] + 0x100000000L;
                                ** GOTO lbl30
                            }
                            case 1925146820: {
                                ** continue;
                            }
                            case -641210539: 
                        }
                        break;
                    }
                    v3 = var16_1[14];
                    var16_1[14] = var17_2 = v3 ^ (v3 ^ v3 + (long)(-(1191041351 * -119))) & -1L >>> --32;
                    continue;
                    break;
                }
            }
lbl53:
            // 2 sources

            block18: while (true) {
                switch (var13_4) {
                    default: {
                        if (ahm.aPR != (int)var16_1[0]) ** continue;
                        return ahm.aPS;
                    }
                    case 185889645: {
                        var13_4 = -1551485382;
                        continue block18;
                    }
                    case -1551485382: 
                }
                v4 = -((34304 << 23 | 34304 >>> 9) ^ 67);
                var16_1[14] = var17_2 = -6182736414317315362L;
                v5 = 285 ^ 29;
                v6 = var16_1[14];
                var16_1[14] = var17_2 = v6 ^ ((long)(v4 >>> 5 | v4 << 27) << (v5 << 29 | v5 >>> 3) ^ v6) & -1L << (~-66 ^ 97);
                var16_1[10] = var17_2 = -2365591397947670853L;
                v7 = var16_1[10];
                v8 = 36475 - 123;
                var16_1[10] = var17_2 = v7 ^ ((long)bt.aF(ahm.aER.bgK.gW) ^ v7) & -1L >>> (v8 << 23 | v8 >>> 9) + -39;
                v9 = -2031604 - 13;
                v10 = (v9 >>> 15 | v9 << 17) - -67;
                v11 = var16_1[0];
                v12 = -495616 * -1455319497;
                var16_1[0] = var17_2 = v11 ^ ((long)bt.aF(ahm.aER.bgK.gY) << (v10 << 3 | v10 >>> 29) ^ v11) & -1L << (v12 >>> 7 | v12 << 25);
                v13 = var16_1[14];
                v14 = (2097676287 << 13 | 2097676287 >>> 19) + 95;
                var16_1[14] = var17_2 = v13 ^ (-2L ^ v13) & -1L >>> (v14 >>> 11 | v14 << 21) + 35;
                ** continue;
                break;
            }
        }
        var16_1 = new long[15];
        var12_3 = -638998856;
        block19: while (true) {
            switch (var12_3) {
                default: {
                    if (ahm.aER != null && ahm.aER.bgK != null && ahm.aER.bgF != null) break block19;
                    var12_3 = 364845702;
                    continue block19;
                }
                case 364845702: {
                    v15 = -0;
                    v16 = v15 << 17 | v15 >>> 15;
                    return (boolean)(v16 >>> 19 | v16 << 13);
                }
            }
            break;
        }
        var16_1[0] = var17_2 = -5470928572507950286L;
        v17 = var16_1[0];
        var16_1[0] = var17_2 = v17 ^ ((long)((int)ahm.aER.bgF.getTotalWorldTime()) ^ v17) & -1L >>> (-3969 >>> 7 | -3969 << 25) * -1;
        var13_4 = -461639198;
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static /* bridge */ strictfp /* synthetic */ boolean vE() {
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
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ boolean vG() {
        int n2;
        int n3 = -763873868;
        if (n3 != n3) {
            throw null;
        }
        n3 = 436438021;
        if (n3 != n3) {
        }
        Object[] objectArray = new Object[3];
        int n4 = aER == null || ahm.aER.bgK == null ? -1802187219 : 748344924;
        switch (n4) {
            default: {
                return ~(0x11111111 * 15) != 0;
            }
            case 748344924: 
        }
        objectArray[2] = ahm.aER.bgK.Dw();
        if (!StringUtils.isBlank((CharSequence)((String)objectArray[2]))) {
            int n5 = -1172272922;
            if (aPz.matcher((String)objectArray[2]).matches()) {
                n2 = -(-128207979 * 67);
                return n2 != 0;
            }
        }
        int n6 = 330381371 * 13;
        n2 = (n6 >>> 7 | n6 << 25) ^ 0xFFFFFFB5;
        return n2 != 0;
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ boolean vF() {
        block7: {
            var4 = 67769125;
            if (var4 != var4) {
                var4 = 39;
                break block7;
lbl6:
                // 1 sources

                while (true) {
                    v0 = (294175843 * 73 + -59) * -50529027;
lbl8:
                    // 2 sources

                    return (boolean)v0;
                }
            }
        }
        var2_2 = new Object[2];
        var2_2[1] = ahm.aER.bgK.Dw();
        if (!StringUtils.isBlank((CharSequence)((String)var2_2[1])) && !ahm.aPz.matcher((String)var2_2[1]).matches()) ** GOTO lbl-1000
        v1 = 16384 >>> 21 | 16384 << 11;
        v0 = ((v1 >>> 25 | v1 << 7) ^ -21) + 23;
        ** while (true)
        {
            switch (var1_1) lbl-1000:
            // 2 sources

            {
                default: {
                    var1_1 = -951746529;
                    continue block5;
                }
                case -951746529: 
            }
        }
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static /* bridge */ strictfp /* synthetic */ String b(Pattern[] var0) {
        block24: {
            block25: {
                block26: {
                    var19_1 = -1926318529;
                    if (var19_1 == var19_1) break block26;
                    51 & 1;
                    break block26;
lbl6:
                    // 2 sources

                    return null;
lbl8:
                    // 1 sources

                    while (true) {
                        block23: {
                            block27: {
                                block22: {
                                    break block27;
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var14_2[5] = var0;
                                        var15_3[7] = var16_5 = 2694086067827304548L;
                                        v0 = -ahm.oOoO0OoOOOoO[37];
                                        v1 = var15_3[7];
                                        var15_3[7] = var16_5 = v1 ^ ((long)((Pattern[])var14_2[5]).length << ((v0 >>> ahm.oOoO0OoOOOoO[38] | v0 << ahm.oOoO0OoOOOoO[39]) ^ ahm.oOoO0OoOOOoO[40]) ^ v1) & -1L << (ahm.oOoO0OoOOOoO[41] * ahm.oOoO0OoOOOoO[42] ^ ahm.oOoO0OoOOOoO[43]);
                                        var11_6 = 1745385628;
                                        v2 = var15_3[7];
                                        v3 = ahm.oOoO0OoOOOoO[44] ^ ahm.oOoO0OoOOOoO[45] ^ ahm.oOoO0OoOOOoO[46];
                                        var15_3[7] = var16_5 = v2 ^ (0L ^ v2) & -1L >>> ((v3 << ahm.oOoO0OoOOOoO[47] | v3 >>> ahm.oOoO0OoOOOoO[48]) ^ ahm.oOoO0OoOOOoO[49]);
lbl20:
                                        // 2 sources

                                        while (true) {
                                            v4 = ahm.oOoO0OoOOOoO[50] ^ ahm.oOoO0OoOOOoO[51];
                                            v5 = v4 >>> ahm.oOoO0OoOOOoO[52] | v4 << ahm.oOoO0OoOOOoO[53];
                                            if ((int)var15_3[7] >= (int)(var15_3[7] >>> (v5 >>> ahm.oOoO0OoOOOoO[54] | v5 << ahm.oOoO0OoOOOoO[55]))) break block22;
                                            var5_7 = ((Pattern[])var14_2[5])[(int)var15_3[7]];
                                            if (var5_7 == null) ** GOTO lbl36
                                            var12_8 = -515571678;
                                            break block23;
                                            break;
                                        }
                                        break;
                                    }
lbl28:
                                    // 1 sources

                                    while (true) {
                                        var12_8 = 546643549;
                                        break block23;
                                        break;
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        var14_2[8] = var5_7.matcher((String)var14_2[4]);
                                        if (((Matcher)var14_2[8]).find()) {
                                            var13_9 = -1954828434;
                                            return ((Matcher)var14_2[8]).group();
                                        }
lbl36:
                                        // 4 sources

                                        while (true) {
                                            var12_8 = -685486793;
                                            break block23;
                                            break;
                                        }
                                        break;
                                    }
lbl39:
                                    // 1 sources

                                    while (true) {
                                        v6 = var15_3[7];
                                        v7 = ahm.oOoO0OoOOOoO[56];
                                        v8 = ahm.oOoO0OoOOOoO[61] + ahm.oOoO0OoOOOoO[62];
                                        var15_3[7] = var16_5 = v6 ^ (v6 ^ v6 + (long)((v7 << ahm.oOoO0OoOOOoO[57] | v7 >>> ahm.oOoO0OoOOOoO[58]) * ahm.oOoO0OoOOOoO[59] * ahm.oOoO0OoOOOoO[60])) & -1L >>> ((v8 << ahm.oOoO0OoOOOoO[63] | v8 >>> ahm.oOoO0OoOOOoO[64]) ^ ahm.oOoO0OoOOOoO[65]);
                                        ** continue;
                                        break;
                                    }
                                }
                                return null;
                            }
                            var10_4 = -738108337;
                            switch (var10_4) {
                                default: {
                                    ** GOTO lbl6
                                }
                                ** case -738108337:
lbl53:
                                // 1 sources

                                ** continue;
                            }
                        }
                        switch (var12_8) {
                            default: {
                                ** continue;
                            }
                            case -515571678: {
                                ** continue;
                            }
                            case 546643549: {
                                ** continue;
                            }
                            ** case -685486793:
lbl63:
                            // 1 sources

                            ** continue;
                        }
                        break;
                    }
lbl64:
                    // 2 sources

                    while (true) {
                        var14_2 = new Object[13];
                        var15_3 = new long[13];
                        if (var0 != null && var0.length != 0) break block24;
                        break block25;
                        break;
                    }
lbl69:
                    // 1 sources

                    while (true) {
                        var19_1 = 779909058;
                        if (var19_1 == var19_1) ** GOTO lbl64
                        40 & 1;
                        ** continue;
                        break;
                    }
                }
                ** while ((var19_1 = -1225827094) == var19_1)
lbl77:
                // 1 sources

                throw new RemoteException();
            }
            var9_10 = -1132648622;
            return null;
        }
        var14_2[4] = ahm.vJ();
        ** while (!((String)var14_2[4]).isEmpty())
lbl84:
        // 1 sources

        ** while (true)
    }
}

