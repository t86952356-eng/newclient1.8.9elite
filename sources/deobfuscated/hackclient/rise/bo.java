/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package hackclient.rise;

import com.mojang.authlib.GameProfile;
import hackclient.rise.am;
import hackclient.rise.er;
import hackclient.rise.fg;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.item.co;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.TickEvent;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Exception performing whole class analysis ignored.
 */
public class bo
extends am {
    public /* synthetic */ int fb;
    public /* synthetic */ List<byte[]> eB;
    public static /* synthetic */ String[] oOo00Oo0OOo0;
    public /* synthetic */ boolean eJ;
    public /* synthetic */ byte eS;
    public static /* synthetic */ String q0oOOoOo0O00O;
    public /* synthetic */ boolean eW;
    public /* synthetic */ Map<UUID, GameProfile> eD;
    public /* synthetic */ int fd;
    public /* synthetic */ Object ey;
    public /* synthetic */ int eN;
    public /* synthetic */ Method ez;
    public /* synthetic */ Set<UUID> eC;
    public static /* synthetic */ Object[] O0OoOO0OOOOO;
    public /* synthetic */ int eX;
    public static /* synthetic */ UUID ev;
    public /* synthetic */ DataOutputStream ff;
    public /* synthetic */ int eP;
    public static /* synthetic */ String oO00O0OO0ooO;
    public static /* synthetic */ String[] oo000o00Oo00;
    public /* synthetic */ boolean eL;
    public /* synthetic */ int eE;
    public /* synthetic */ ByteArrayOutputStream fe;
    public static /* synthetic */ int ew;
    public static /* synthetic */ Object o0o000o0O0o0;
    public /* synthetic */ Object ex;
    public /* synthetic */ boolean eY;
    public /* synthetic */ co[] eU;
    public /* synthetic */ byte eR;
    public static /* synthetic */ Object[] ooo00oo0Ooo0;
    public /* synthetic */ boolean eH;
    public /* synthetic */ String eZ;
    public static /* synthetic */ String o0Oo000O0oO;
    public /* synthetic */ String fc;
    public /* synthetic */ int eO;
    @EventLink
    public /* synthetic */ Listener<er> fg;
    public /* synthetic */ long fa;
    @EventLink
    public /* synthetic */ Listener<TickEvent> fh;
    public /* synthetic */ long eI;
    public static /* synthetic */ String q0OOOoo00o0;
    private static /* synthetic */ int[] o0000000O000;
    public static /* synthetic */ String Oo0o00000O00;
    @EventLink
    public /* synthetic */ Listener<fg> fi;
    public /* synthetic */ boolean eK;
    public /* synthetic */ Field eA;
    public /* synthetic */ co eV;
    public /* synthetic */ byte eQ;
    public volatile /* synthetic */ boolean eF;
    public /* synthetic */ boolean eG;
    public /* synthetic */ byte eT;
    public /* synthetic */ boolean eM;
    private static /* synthetic */ int oO000O00OO00;
    private static /* synthetic */ boolean ooO00oO0OoO0;

    /*
     * Enabled aggressive block sorting
     */
    public bo() {
        Object object;
        int n2 = -1631565039;
        if (n2 != n2) {
        }
        object();
        this.ex = object;
        this.ey = new Object();
        this.eB = new ArrayList<byte[]>();
        this.eC = new HashSet<UUID>();
        int n3 = 1804911579;
        block3: while (true) {
            switch (n3) {
                default: {
                    this.eD = new HashMap<UUID, GameProfile>();
                    n3 = 2071604348;
                    continue block3;
                }
                case 2071604348: 
            }
            break;
        }
        this.eU = new co[o0000000O000[0] ^ o0000000O000[1] ^ o0000000O000[2]];
        this.fd = o0000000O000[3] - o0000000O000[4] + o0000000O000[5];
        this.fg = this::b;
        this.fh = this::a;
        this.fi = fg2 -> {
            int n2 = 1551666149;
            if (n2 != n2) {
            }
            this.bA();
            int n3 = 967109333;
            boolean bl2 = true;
            block4: while (true) {
                if (!bl2 || (bl2 = false) || !true) {
                    n3 = 2097224303;
                }
                switch (n3) {
                    case 2097224303: {
                        return;
                    }
                    default: {
                        this.bF();
                        if (!this.eF) continue block4;
                        break;
                    }
                    case -161557266: 
                }
                this.eM = 1827065453 * 9 * 35 - 31;
                this.eY = -(35 + -35) * 117;
                Arrays.fill(this.eU, null);
                this.eV = null;
                int n4 = 0x63 ^ 0x63;
                this.eW = n4 << 13 | n4 >>> 19;
                int n5 = -0 * 51;
                int n6 = n5 >>> 21 | n5 << 11;
                this.eX = n6 >>> 25 | n6 << 7;
            }
        };
    }

    /*
     * Exception decompiling
     */
    public static /* bridge */ strictfp /* synthetic */ String o0Oo000O0oO(int var0, String var1_1) {
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        long l2;
        int n2 = 2036726879;
        if (n2 != n2) {
            n2 = 1;
        }
        if ((n2 = -1738556220) != n2) {
            n2 = 50428954;
        }
        if ((n2 = -993222031) != n2) {
            throw null;
        }
        Object[] objectArray = new Object[21];
        long[] lArray = new long[21];
        bo.q0OOOoo00o0();
        oo000o00Oo00 = new String[4];
        oOo00Oo0OOo0 = new String[1];
        int n3 = 2981888 << 25 | 2981888 >>> 7;
        int n4 = n3 << 21 | n3 >>> 11;
        O0OoOO0OOOOO = new Object[(n4 >>> 29 | n4 << 3) - 53];
        int n5 = (0 >>> 17 | 0 << 15) * 13 * -1022611261;
        lArray[11] = l2 = -2867905830681604246L;
        int n6 = 388 * 1594008481;
        long l3 = lArray[11];
        lArray[11] = l2 = l3 ^ ((long)(n5 >>> 15 | n5 << 17) << (n6 >>> 29 | n6 << 3) ^ l3) & -1L << -(0x7FFFFFF0 >>> 31 | 0x7FFFFFF0 << 1);
        String string = oOo00Oo0OOo0[0];
        if (string == null) {
            String string2 = oo000o00Oo00[0];
            if (string2 == null) {
                objectArray[19] = "\ua58a\ua42a\ua3ca\ua30a\u8aea\ua5ea\u8e8a\u878a\u8eea\u8dea\u8f8a\ua40a\u8a0a\ua5aa\u892a\u8a6a\ua7aa\ua14a\ua0ea\u8b0a\ua74a\ua22a\ua34a\u8a8a\ua1aa\ua88a\ua98a\u8a6a\ua9aa\ua7ea\u8e4a\u8bea\ua8ca\ua78a\u8d6a\ua96a\ua6ea\ua3ca\ua78a\uab4a\uab6a\u8e0a\ua4aa\ua40a\ua7ea\ua48a\ua52a\ua8ea\uaa0a\uaaaa\ua76a\ua64a\ua70a\uaa6a\ua62a\ua6ea\ua20a\ua90a\uadaa\ua70a\ua3ca\ua76a\uacca\ua82a\ua7aa\uad0a\uaa2a\ua6ca\ua52a\uadca\uaa2a\ua84a\ua5ca\ua9ea\ua8aa\uae6a\ua98a\uabca\ua60a\ua4ca\ua9ca\ua9ca\ua5ea\uac6a\uac2a\ua7ea\ua78a\ua94a\uad8a\ua32a\ua8aa\ua22a\ua50a\uadca\ua92a\ua52a\uacaa\ua9aa\uadaa\ua86a\ua98a\uaa8a\ua44a\ua7ea\uadea\ua7aa\ua40a\ua48a\ua60a\ua9ea\ua56a\uafca\ua52a\ua94a\uaaca\uaa0a\ua66a\uaaca\uab6a\ua9aa\uac8a\ua7aa\u834a\u830a\ua64a\ua9ea\ua96a\u852a\uabaa\u830a\uaa8a\u858a\uae8a\ua76a\u842a\uaaca\uaaca\uaeea\uab4a\ua80a\u848a\ua86a\ua98a\uafaa\u862a\u85aa\uafea\ua92a\u814a\u878a\u862a\uad4a\u864a\u83aa\u848a\uad0a\uac2a\uab4a\uacea\u898a\uae8a\u8a8a\uae4a\u8a0a\uad8a\u870a\uae4a\uaf2a\u86ea\u84aa\u8b2a\u8baa\u888a\u89ca\u898a\u8a4a\u856a\u80ca\u89ca\u862a\u89ea\u8b4a\u81aa\u86ca\u836a\u8c0a\u894a\u8dea\u824a\u876a\u8dca\u886a\u89ca\u894a\u884a\u880a\u854a\u878a\u85ea\u8daa\u83aa\u89ea\u8a4a\u89ca\u854a\u8b8a\u880a\u88ea\u852a\u8a2a\u880a\u86aa\u8baa\u868a\u856a\u8b4a\u86ea\u86ca\u8bea\u8d0a\u8cea\u8c2a\u8a0a\u834a\u878a\u8daa\u858a\u8aaa\u8b0a\u8e2a\u864a\u8b0a\u8b8a\u896a\u8a2a\u870a\u876a\ua12a\u888a\u876a\u8bca\u906a\u850a\ua24a\u89ca\u87ca\u8b4a\u886a\u8b6a\u8bca\u892a\ua4ca\u8d0a\u882a\ua44a\u8b8a\u898a\u89ca\u8e6a\u89ca\u894a\u87ca\u8b2a\u8a0a\u8b4a\u898a\u886a\ua46a\u89ca\ua5ea\u8baa\u902a\u8a0a\u906a\ua66a\ua80a\ua68a\u8baa\ua7aa\ua1aa\u8d4a\u89ea\u8d2a\ua9ea\u8cca\ua92a\ua82a\ua38a\u8e6a\u8dca\u8d4a\ua3aa\ua3ea\u8daa\ua94a\uab4a\ua88a\u8e0a\uab0a\ua4ea\ua7aa\ua9ca\u8f6a\ua12a\ua9aa\ua74a\ua9aa\u906a\ua20a\uaa6a\uab0a\ua20a\ua6ea\ua98a\ua84a\ua3aa\ua80a\ua3ea\uadaa\ua7ea\uaa6a\uaa2a\ua4ea\uad2a\ua60a\ua7aa\ua7aa\ua38a\uaa0a\uabaa\ua48a\ua4aa\ua5ca\uab4a\ua54a\ua16a\ua7ca\ua78a\uabea\uaa4a\uab0a\uab2a\ua84a\ua80a\ua92a\ua88a\ua82a\uab0a\uad2a\uae0a\ua8aa\uac0a\ua82a\ua9ca\uaa0a\uac2a\uaaea\ua7aa\uae8a\uab6a\uaeca\uadea\ua72a\uafea\ua4ca\uaf6a\uabaa\ua4ca\uabea\ua9aa\ua9ca\ua5ca\ua96a\uaaca\ua60a\u034b\ua60a\ua8aa\uadaa\ua9ca\ua94a\u03eb\u03eb\u040b\uad2a\uad0a\ua9ca\u064b\uaeea\u05ab\uaf2a\u03cb\uaaea\uab2a\uaa0a\u04ab\uafea\u05eb\ub04a\u05eb\uabaa\u018b\u052b\uabea\ua9ca\u064b\u07eb\uabca\u07ab\uacaa\uab6a\u038b\uadea\uac4a\uacea\u038b\uadea\u0aab\u094b\u040b\u096b\u054b\u078b\u082b\uaf2a\u0aeb\u072b\uafca\u048b\u082b\u04eb\u050b\u0a4b\u0a8b\u0c4b\u058b\u020b\u0c0b\u032b\u02cb\u0b8b\u0d8b\u0dab\u096b\u09ab\u0beb\u0a2b\u07eb\u036b\u0a2b\u0c4b\u05ab\u052b\u07cb\u06eb\u0eab\u054b\u07eb\u07abK\u05ab\u058b\u05eb\u090b\u078b\u010b\u052b\u052b\u06eb\u01eb\u072b\u06cb\u072b\u0a0b\u0b4b\u060b\u036b\u08eb\u032b\u0d8b\u098b\u034b\u0dab\u036b\u0eab\u0a6b\u096b\u044b\u088b\u070b\u0b6b\u060b\u0b2b\u05eb\u084b\u054b\u050b\u0c2b\u0b2b\u058b\u080b\u0c6b\u094b\u07eb\u248b\u0a2b\u21eb\u09cb\u0cab\u0c8b\u080b\u0dcb\u0e6b\u07eb\u0ceb\u26cb\u258b\u0acb\u244b\u098b\u0b6b\u242b\u240b\u276b\u084b\u0b6b\u100b\u270b\u24ab\u27ab\u214b\u0aab\u220b\u09ab\u262b\u0aeb\u284b\u21cb\u22eb\u0dab\u0c0b\u266b\u274b\u278b\u272b\u254b\u0e6b\u23cb\u0e6b\u272b\u29cb\u298b\u2b6b\u288b\u29cb\u240b\u260b\u24ab\u254b\u258b\u27eb\u256b\u298b\u2a0b\u26eb\u266b\u21ab\u2a8b\u2b8b\u2d4b\u26eb\u2b4b\u2bab\u278b\u296b\u28cb\u280b\u238b\u236b\u2ecb\u2e4b\u2ecb\u292b\u2f2b\u2b8b\u29eb\u296b\u248b\u2b4b\u27ab\u2c0b\u2b4b\u24cb\u21ab\u260b\u25eb\u284b\u296b\u21eb\u244b\u2b8b\u28ab\u28ab\u2a6b\u2d2b\u2e0b\u2e2b\u28cb\u2dab\u2d2b\u25ab\u2aeb\u27cb\u27eb\u2f2b\u25ab\u282b\u2f8b\u284b\u25eb\u272b\u2bcb\u2b2b\u306b\u28cb\u25ab\u24eb\u266b\u304b\u2beb\u2b4b\u26cb\u02eb\u022b\u27eb\u29eb\u28cb\u03ab\u036b\u2dab\u278b\u2c2b\u27cb\u286b\u060b\u2d8b\u060b\u044b\u292b\u296b\u28ab\u05cb\u05cb\u2a2b\u2b8b\u04eb\u054b\u298b\u28eb\u2beb\u2aab\u018b\u078b\u058b\u020b\u08ab\u07eb\u084b\u094b\u098b\u2b6b\u2beb\u2ccb\u08cb\u092b\u086b\u0aeb\u2d4b\u094b\u2dab\u05ab\u09ab\u04cb\u068b".toCharArray();
                lArray[18] = l2 = (long)0;
                while ((int)lArray[18] < ((char[])objectArray[19]).length) {
                    char[] cArray = (char[])objectArray[19];
                    int n7 = (int)lArray[18];
                    char c2 = cArray[n7];
                    cArray[n7] = ~((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(c2 << 11 | c2 >>> 5) + 39529) - 32324) - 25910) - 30048) - 54258) - 52434) - n7) ^ 0x64A5) ^ 0x7DC3) - n7))) + 39618) - 42168))) + 2372));
                    lArray[18] = l2 = (long)((int)lArray[18] + 1);
                }
                string2 = new String((char[])objectArray[19]);
            }
            string = bo.o0Oo000O0oO(0, string2);
        }
        objectArray[14] = string.toCharArray();
        int n8 = (-637535278 * 1926714301 ^ 0x2B) + -33;
        lArray[3] = l2 = -1816275228004713844L;
        long l4 = lArray[3];
        lArray[3] = l2 = l4 ^ ((long)(n8 << 9 | n8 >>> 23) ^ l4) & -1L >>> ~(~(0x40000000 >>> 25 | 0x40000000 << 7));
        int n9 = 1541787543 * -39;
        lArray[4] = l2 = -6124478789358183489L;
        long l5 = lArray[4];
        lArray[4] = l2 = l5 ^ ((long)((n9 >>> 11 | n9 << 21) + 85) ^ l5) & -1L >>> ~(0x76 ^ 0xFFFFFFA9);
        boolean bl2 = true;
        while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                if ((int)(lArray[3] >>> (-30 - -123 ^ 0x7D)) < (int)(lArray[2] >>> 0x1E1E1E1E * 17 + -31 - -65)) {
                    int n10 = (0x52000000 << 11 | 0x52000000 >>> 21) * -1047552999;
                    int n11 = -79624228 - -35;
                    ((char[])objectArray[5])[(int)(lArray[3] >>> (n10 << 1 | n10 >>> 31))] = ((char[])objectArray[14])[(int)lArray[4] + (int)(lArray[3] >>> (n11 >>> 11 | n11 << 21) * 0x5B05B05B * 1749801491)];
                    lArray[3] = l2 = lArray[3] + 0x100000000L;
                    continue;
                }
                lArray[11] = l2 = lArray[11] + 0x100000000L;
                bo.O0OoOO0OOOOO[(int)(lArray[11] >>> (0x2C ^ 0xFFFFFFC5) + 55)] = new String((char[])objectArray[5]);
                int n12 = --67108864;
                long l6 = lArray[4];
                int n13 = ~(1342 - 63) * 0x33333333;
                lArray[4] = l2 = l6 ^ ((long)((int)lArray[4] + (int)(lArray[2] >>> (n12 >>> 21 | n12 << 11))) ^ l6) & -1L >>> (n13 << 29 | n13 >>> 3);
            }
            if ((int)lArray[4] >= (int)lArray[3]) break;
            long l7 = lArray[4];
            int n14 = 0xFFFFBFD7 ^ 0xFFFFFFD7;
            int n15 = n14 >>> 1 | n14 << 31;
            lArray[4] = l2 = l7 ^ (l7 ^ l7 + (long)(n15 << 19 | n15 >>> 13)) & -1L >>> (-36 + -89 ^ 0xFFFFFFA3);
            long l8 = lArray[11];
            lArray[11] = l2 = l8 ^ ((long)((char[])objectArray[14])[(int)lArray[4]] ^ l8) & -1L >>> -(0x17 ^ 0xFFFFFFF7);
            long l9 = lArray[4];
            int n16 = 7864288 * -941362695;
            lArray[4] = l2 = l9 ^ (l9 ^ l9 + (long)((n16 << 13 | n16 >>> 19) * -73)) & -1L >>> -67 + 99;
            long l10 = lArray[4];
            lArray[4] = l2 = l10 ^ ((long)((char[])objectArray[14])[(int)lArray[4]] << ~(-148) + -115 ^ l10) & -1L << ((-236640 * -1875962727 - -55) * -619094385 ^ 0x39);
            int n17 = (1010579538 - -43) * -17 - -77;
            lArray[2] = l2 = -2640619846529396771L;
            long l11 = lArray[2];
            lArray[2] = l2 = l11 ^ ((long)((int)lArray[11] << (0x6DB6DB45 ^ 0xFFFFFFD5) * -7 | (int)(lArray[4] >>> (n17 >>> 9 | n17 << 23))) << -((0xFFFFFFC4 ^ 0x1B) + 1) ^ l11) & -1L << -1894405407 * -119 * 125 + -37;
            int n18 = 4 >>> 1 | 4 << 31;
            int n19 = n18 >>> 5 | n18 << 27;
            objectArray[5] = new char[(int)(lArray[2] >>> (n19 << 9 | n19 >>> 23))];
            int n20 = -777992936;
            long l12 = lArray[3];
            int n21 = ~(-169473 >>> 21 | -169473 << 11) * 99;
            lArray[3] = l2 = l12 ^ (0L ^ l12) & -1L << (n21 << 17 | n21 >>> 15);
        }
        ew = -262236 + 17 ^ 0xFFFFFFB5;
        String string3 = q0oOOoOo0O00O;
        if (string3 == null) {
            string3 = q0oOOoOo0O00O = (String)O0OoOO0OOOOO[(1972264473 * -55 + 93) * 121] + (String)O0OoOO0OOOOO[-(~(~-90 - 59))];
        }
        ev = UUID.fromString(string3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static /* bridge */ strictfp /* synthetic */ String h(String string) {
        int n2 = -1698042332;
        if (n2 != n2) {
            throw new IllegalThreadStateException();
        }
        int n3 = -1381056470;
        if (string == null) {
            return "";
        }
        int n4 = 0x40000000 >>> 25 | 0x40000000 << 7;
        int n5 = --1441901 - 109;
        int n6 = 1476395032 << 15 | 1476395032 >>> 17;
        int n7 = -(432 * -1749801491);
        return string.replace((String)O0OoOO0OOOOO[n4 >>> 3 | n4 << 29], (String)O0OoOO0OOOOO[n5 >>> 17 | n5 << 15]).replace((String)O0OoOO0OOOOO[(n6 << 23 | n6 >>> 9) * 678152731 * -1047552999], (String)O0OoOO0OOOOO[n7 >>> 1 | n7 << 31]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void q0OOOoo00o0() {
        int n2 = 317848908;
        if (n2 != n2) {
            throw null;
        }
        o0000000O000 = new int[0x789B ^ 0x790B];
        bo.o0000000O000[0x41C5 ^ 0x4188] = 0xFFFFBE77 ^ 0x4188;
        bo.o0000000O000[0x5B07 ^ 0x5B04] = 0xFFFFA459 ^ 0x5B04;
        bo.o0000000O000[0xCD8C ^ 0xCD31] = 0xFFFF32E2 ^ 0xCD31;
        int n3 = 1626490286;
        block73: while (true) {
            switch (n3) {
                case 1697576853: {
                    bo.o0000000O000[0x6700 ^ 0x6711] = 0x670E ^ 0x6711;
                    n3 = -1825029260;
                    continue block73;
                }
                case -1825029260: {
                    bo.o0000000O000[0x5C70 ^ 0x5C65] = 0xFFFFA3AC ^ 0x5C65;
                    n3 = -1225990006;
                    continue block73;
                }
                case -1225990006: {
                    bo.o0000000O000[0xCC56 ^ 0xCCB2] = 0xFFFF334D ^ 0xCCB2;
                    bo.o0000000O000[0x6C43 ^ 0x6CDC] = 0xFFFF9323 ^ 0x6CDC;
                    bo.o0000000O000[0x738A ^ 0x720B] = 0xE5E0D524 ^ 0x720B;
                    n3 = -1433282315;
                    continue block73;
                }
                case -1433282315: {
                    bo.o0000000O000[0x1038D ^ 0x102A0] = 0xFFFEFD61 ^ 0x102A0;
                    bo.o0000000O000[0xF782 ^ 0xF6BD] = 0xF6B8 ^ 0xF6BD;
                    bo.o0000000O000[0x21A7 ^ 0x21FB] = 0x689A0059 ^ 0x21FB;
                    bo.o0000000O000[0x20FA ^ 0x2042] = 0x2041 ^ 0x2042;
                    bo.o0000000O000[0xF885 ^ 0xF9F3] = 0xF9B3 ^ 0xF9F3;
                    bo.o0000000O000[0x6F68 ^ 0x6E77] = 0xFFFF91F2 ^ 0x6E77;
                    bo.o0000000O000[0xF16A ^ 0xF173] = 0xF17C ^ 0xF173;
                    bo.o0000000O000[0x105C2 ^ 0x104F5] = 0xFFFEFB0A ^ 0x104F5;
                    bo.o0000000O000[0xB2DA ^ 0xB259] = 0x4000B209 ^ 0xB259;
                    bo.o0000000O000[0x234 ^ 0x35B] = 0xFFFFFCA4 ^ 0x35B;
                    bo.o0000000O000[0xA2E2 ^ 0xA2AB] = 0xA2AC ^ 0xA2AB;
                    n3 = 576085888;
                    continue block73;
                }
                case 576085888: {
                    bo.o0000000O000[0x1C79 ^ 0x1C0C] = 0x1C15 ^ 0x1C0C;
                    bo.o0000000O000[0x1642 ^ 0x177E] = 0x1775 ^ 0x177E;
                    bo.o0000000O000[0x6CFD ^ 0x6DA8] = 0x6DB9 ^ 0x6DA8;
                    bo.o0000000O000[0x6E66 ^ 0x6E90] = 0x3F039EAF ^ 0x6E90;
                    bo.o0000000O000[0xF1C2 ^ 0xF130] = 0xF12B ^ 0xF130;
                    bo.o0000000O000[0xC0E8 ^ 0xC083] = 0xFFFF3F42 ^ 0xC083;
                    bo.o0000000O000[0xF891 ^ 0xF8A1] = 0xFFFF075E ^ 0xF8A1;
                    n3 = -1002464209;
                    continue block73;
                }
                case -1002464209: {
                    bo.o0000000O000[0xC205 ^ 0xC223] = 0xC226 ^ 0xC223;
                    bo.o0000000O000[0x1236 ^ 0x1379] = 0x1378 ^ 0x1379;
                    n3 = -2039973481;
                    continue block73;
                }
                case -2039973481: {
                    bo.o0000000O000[0xC2E ^ 0xC68] = 0xC1D ^ 0xC68;
                    bo.o0000000O000[0xE5EF ^ 0xE5C4] = 0xE5C9 ^ 0xE5C4;
                    bo.o0000000O000[0x6DD2 ^ 0x6C94] = 0x6CB5 ^ 0x6C94;
                    bo.o0000000O000[0x16C9 ^ 0x166F] = 0x1618 ^ 0x166F;
                    bo.o0000000O000[0x5124 ^ 0x5105] = 0x4BFFAEFA ^ 0x5105;
                    bo.o0000000O000[0x6B60 ^ 0x6A7C] = 0xFFFF95B9 ^ 0x6A7C;
                    bo.o0000000O000[0xF04 ^ 0xF0F] = 0xFFFFF0D2 ^ 0xF0F;
                    bo.o0000000O000[0x4CB5 ^ 0x4CEA] = 0xFFFFB349 ^ 0x4CEA;
                    bo.o0000000O000[0x7F59 ^ 0x7E7B] = 0x747E ^ 0x7E7B;
                    bo.o0000000O000[0x33B8 ^ 0x339A] = 0x339D ^ 0x339A;
                    bo.o0000000O000[0x8E97 ^ 0x8F15] = 0x8D60 ^ 0x8F15;
                    n3 = -1615035063;
                    continue block73;
                }
                case -1615035063: {
                    bo.o0000000O000[0x349B ^ 0x3592] = 0xFFFFCA51 ^ 0x3592;
                    bo.o0000000O000[0x3D2D ^ 0x3D3B] = 0x3D5C ^ 0x3D3B;
                    bo.o0000000O000[0xD989 ^ 0xD8D6] = 0xD8F1 ^ 0xD8D6;
                    bo.o0000000O000[0xCFA1 ^ 0xCEE0] = 0x61F26A5B ^ 0xCEE0;
                    bo.o0000000O000[0x75EC ^ 0x7520] = 0x7529 ^ 0x7520;
                    bo.o0000000O000[0xF18 ^ 0xF91] = 0xFD4 ^ 0xF91;
                    bo.o0000000O000[0xEA1A ^ 0xEB2E] = 0xEB23 ^ 0xEB2E;
                    n3 = -2014532666;
                    continue block73;
                }
                case -2014532666: {
                    bo.o0000000O000[0x56B1 ^ 0x5664] = 0x566D ^ 0x5664;
                    bo.o0000000O000[0x5E3 ^ 0x593] = 0x59E ^ 0x593;
                    n3 = 370328323;
                    continue block73;
                }
                case 370328323: {
                    bo.o0000000O000[0xCCA8 ^ 0xCCBC] = 0x7A480D7 ^ 0xCCBC;
                    bo.o0000000O000[0x37D0 ^ 0x3752] = 0x374B ^ 0x3752;
                    bo.o0000000O000[0x7D9B ^ 0x7CD5] = 0xFFFF832A ^ 0x7CD5;
                    bo.o0000000O000[0x97BC ^ 0x97D1] = 0xFFFF6864 ^ 0x97D1;
                    bo.o0000000O000[0x2CE7 ^ 0x2C28] = 0x2C3D ^ 0x2C28;
                    bo.o0000000O000[0x18EB ^ 0x199A] = 0x2B81987 ^ 0x199A;
                    bo.o0000000O000[0x3617 ^ 0x36CF] = 0x36F6 ^ 0x36CF;
                    bo.o0000000O000[0x8563 ^ 0x8416] = 0x8441 ^ 0x8416;
                    bo.o0000000O000[0xB6DC ^ 0xB75C] = 0xB74B ^ 0xB75C;
                    bo.o0000000O000[0xE1BE ^ 0xE186] = 0xFFFF1E18 ^ 0xE186;
                    n3 = 671149954;
                    continue block73;
                }
                case 671149954: {
                    bo.o0000000O000[0x109E5 ^ 0x1090B] = 0xCBFEF6D0 ^ 0x1090B;
                    bo.o0000000O000[0x9DF3 ^ 0x9CED] = 0x1020DC6C ^ 0x9CED;
                    bo.o0000000O000[0x4531 ^ 0x45A5] = 0xBEFBAA1A ^ 0x45A5;
                    bo.o0000000O000[0x7FE ^ 0x78A] = 0x78D ^ 0x78A;
                    bo.o0000000O000[0xE3D1 ^ 0xE2DA] = 0xE2CB ^ 0xE2DA;
                    n3 = -687108362;
                    continue block73;
                }
                case -687108362: {
                    bo.o0000000O000[0x668A ^ 0x6684] = 0xD4D1DAA1 ^ 0x6684;
                    bo.o0000000O000[0xADAA ^ 0xACA2] = 0xAC87 ^ 0xACA2;
                    bo.o0000000O000[0x7C53 ^ 0x7C36] = 0x7C25 ^ 0x7C36;
                    bo.o0000000O000[0xB861 ^ 0xB913] = 0xFFFF46F0 ^ 0xB913;
                    bo.o0000000O000[0xBA82 ^ 0xBA9C] = 0xBAD7 ^ 0xBA9C;
                    bo.o0000000O000[0xC2E8 ^ 0xC3EF] = 0xC0D40494 ^ 0xC3EF;
                    n3 = 816017131;
                    continue block73;
                }
                case 816017131: {
                    bo.o0000000O000[0xB342 ^ 0xB3F9] = 0xB3DE ^ 0xB3F9;
                    bo.o0000000O000[0x8747 ^ 0x8785] = 0xFFFF787A ^ 0x8785;
                    bo.o0000000O000[0xFB80 ^ 0xFBAF] = 0xFFFF0458 ^ 0xFBAF;
                    n3 = -311032548;
                    continue block73;
                }
                case -311032548: {
                    bo.o0000000O000[0x34B4 ^ 0x342D] = 0x3424 ^ 0x342D;
                    bo.o0000000O000[0x464A ^ 0x474B] = 0x4742 ^ 0x474B;
                    bo.o0000000O000[0xA84A ^ 0xA928] = 0xA939 ^ 0xA928;
                    bo.o0000000O000[0xE88D ^ 0xE8AA] = 0xFFFF1729 ^ 0xE8AA;
                    bo.o0000000O000[0x29A4 ^ 0x2942] = 0x2945 ^ 0x2942;
                    n3 = -1325265245;
                    continue block73;
                }
                case -1325265245: {
                    bo.o0000000O000[0x3D90 ^ 0x3DD7] = 0xFFFFC228 ^ 0x3DD7;
                    n3 = -1824808336;
                    continue block73;
                }
                case -1824808336: {
                    bo.o0000000O000[0x9174 ^ 0x9159] = 0xFFFF6EA6 ^ 0x9159;
                    bo.o0000000O000[0xF0E0 ^ 0xF042] = 0xF049 ^ 0xF042;
                    bo.o0000000O000[0x50CD ^ 0x50F9] = 0x50E2 ^ 0x50F9;
                    bo.o0000000O000[0x805E ^ 0x808A] = 0x8093 ^ 0x808A;
                    bo.o0000000O000[0x5274 ^ 0x5333] = 0xFFFFACCC ^ 0x5333;
                    bo.o0000000O000[0x5049 ^ 0x507A] = 0xFFFFAF85 ^ 0x507A;
                    n3 = -410718413;
                    continue block73;
                }
                case -410718413: {
                    bo.o0000000O000[0x10245 ^ 0x10296] = 0x10291 ^ 0x10296;
                    bo.o0000000O000[0xAF35 ^ 0xAFA9] = 0xAFA8 ^ 0xAFA9;
                    return;
                }
                default: {
                    bo.o0000000O000[0x9633 ^ 0x9637] = 0xFFFF69E4 ^ 0x9637;
                    bo.o0000000O000[0xAF3E ^ 0xAF51] = 0xAF42 ^ 0xAF51;
                    bo.o0000000O000[0x9C3D ^ 0x9CC1] = 0xFFFF6378 ^ 0x9CC1;
                    n3 = -560766251;
                    continue block73;
                }
                case -560766251: {
                    bo.o0000000O000[0xD6CD ^ 0xD74B] = 0xFFFF28C6 ^ 0xD74B;
                    bo.o0000000O000[0x7439 ^ 0x75B3] = 0x75B6 ^ 0x75B3;
                    bo.o0000000O000[0x2AA0 ^ 0x2BDB] = 0xFFFFD424 ^ 0x2BDB;
                    bo.o0000000O000[0xA0B1 ^ 0xA183] = 0xA190 ^ 0xA183;
                    bo.o0000000O000[0xCE01 ^ 0xCF03] = 0xFFFF30A6 ^ 0xCF03;
                    bo.o0000000O000[0x708E ^ 0x71BE] = 0x71A7 ^ 0x71BE;
                    bo.o0000000O000[0x5A0F ^ 0x5AAE] = 0x5AAE ^ 0x5AAE;
                    bo.o0000000O000[0xAEF ^ 0xB66] = 0xFFFFF487 ^ 0xB66;
                    bo.o0000000O000[0x7B37 ^ 0x7AB3] = 0xFFFF8568 ^ 0x7AB3;
                    bo.o0000000O000[0x1F77 ^ 0x1F0F] = 0x1CD84986 ^ 0x1F0F;
                    n3 = -906677109;
                    continue block73;
                }
                case -906677109: {
                    bo.o0000000O000[0xEE20 ^ 0xEE37] = 0x3CEE37 ^ 0xEE37;
                    bo.o0000000O000[0x857F ^ 0x859D] = 0x85D0 ^ 0x859D;
                    bo.o0000000O000[0xE894 ^ 0xE8BC] = 0xFFCF1737 ^ 0xE8BC;
                    bo.o0000000O000[0x90D6 ^ 0x90F6] = 0x908B ^ 0x90F6;
                    bo.o0000000O000[0x8E4C ^ 0x8ED9] = 0x8EAA ^ 0x8ED9;
                    bo.o0000000O000[0xAEB3 ^ 0xAE85] = 0xAE85 ^ 0xAE85;
                    n3 = -676566230;
                    continue block73;
                }
                case -676566230: {
                    bo.o0000000O000[0x7033 ^ 0x710E] = 0x711B ^ 0x710E;
                    bo.o0000000O000[0xF393 ^ 0xF318] = 0x6EB3174B ^ 0xF318;
                    bo.o0000000O000[0x84A3 ^ 0x845E] = 0x847B ^ 0x845E;
                    bo.o0000000O000[0x1DCD ^ 0x1DB7] = 0xFFFFE252 ^ 0x1DB7;
                    bo.o0000000O000[0xD2B7 ^ 0xD213] = 0x5C06A04 ^ 0xD213;
                    bo.o0000000O000[0x9AF1 ^ 0x9A34] = 0xFFFF65EB ^ 0x9A34;
                    bo.o0000000O000[0xF144 ^ 0xF18A] = 0xF181 ^ 0xF18A;
                    bo.o0000000O000[0x16F4 ^ 0x1798] = 0x1789 ^ 0x1798;
                    n3 = -414019125;
                    continue block73;
                }
                case -414019125: {
                    bo.o0000000O000[0x10AB0 ^ 0x10AD9] = 0x10AD8 ^ 0x10AD9;
                    bo.o0000000O000[0x3391 ^ 0x32E6] = 0xFFFFDB6F ^ 0x32E6;
                    bo.o0000000O000[0x302F ^ 0x305D] = 0xFFFFCFF6 ^ 0x305D;
                    bo.o0000000O000[0x76B5 ^ 0x77EB] = 0xA7903D92 ^ 0x77EB;
                    n3 = 1979413528;
                    continue block73;
                }
                case 1979413528: {
                    bo.o0000000O000[0x10891 ^ 0x108E2] = 0x8C125AFF ^ 0x108E2;
                    bo.o0000000O000[0xD955 ^ 0xD935] = 0xD904 ^ 0xD935;
                    n3 = -1470050254;
                    continue block73;
                }
                case -1470050254: {
                    bo.o0000000O000[0x38A7 ^ 0x38E3] = 0x38AE ^ 0x38E3;
                    bo.o0000000O000[0x9ED8 ^ 0x9F57] = 0xDB19C1D8 ^ 0x9F57;
                    n3 = -1564067408;
                    continue block73;
                }
                case -1564067408: {
                    bo.o0000000O000[0x10407 ^ 0x10423] = 0x2D03D40E ^ 0x10423;
                    n3 = 1252867538;
                    continue block73;
                }
                case 1252867538: {
                    bo.o0000000O000[0xB408 ^ 0xB44A] = 0xFFFF4BB5 ^ 0xB44A;
                    bo.o0000000O000[0xE0EA ^ 0xE190] = 0xFFFF1E7B ^ 0xE190;
                    bo.o0000000O000[0xAD83 ^ 0xAD19] = 0xAD0E ^ 0xAD19;
                    bo.o0000000O000[0xDACE ^ 0xDA62] = 0xDA7D ^ 0xDA62;
                    n3 = -1578470311;
                    continue block73;
                }
                case -1578470311: {
                    bo.o0000000O000[0x741E ^ 0x7401] = 0x743E ^ 0x7401;
                    bo.o0000000O000[0xE9DC ^ 0xE958] = 0xFFFF16E9 ^ 0xE958;
                    bo.o0000000O000[0x3502 ^ 0x3599] = 0x3586 ^ 0x3599;
                    bo.o0000000O000[0xE650 ^ 0xE734] = 0xE74F ^ 0xE734;
                    bo.o0000000O000[0x7D94 ^ 0x7D93] = 0xFFFF826C ^ 0x7D93;
                    bo.o0000000O000[0xE8D0 ^ 0xE833] = 0xFFFF17CC ^ 0xE833;
                    bo.o0000000O000[0x5076 ^ 0x5118] = 0x5158 ^ 0x5118;
                    bo.o0000000O000[0x38EE ^ 0x39A4] = 0x39A5 ^ 0x39A4;
                    n3 = 1222624830;
                    continue block73;
                }
                case 1222624830: {
                    bo.o0000000O000[0x7BF6 ^ 0x7ADD] = 0xF3CF4628 ^ 0x7ADD;
                    bo.o0000000O000[0x3D54 ^ 0x3DD8] = 0x3DFD ^ 0x3DD8;
                    bo.o0000000O000[0x5292 ^ 0x523C] = 0x526B ^ 0x523C;
                    bo.o0000000O000[0xFEEB ^ 0xFFF1] = 0xFF8A ^ 0xFFF1;
                    bo.o0000000O000[0xAA5D ^ 0xAB0B] = 0xAB04 ^ 0xAB0B;
                    bo.o0000000O000[0xBB3C ^ 0xBB8B] = 0xBB96 ^ 0xBB8B;
                    bo.o0000000O000[0xE5C4 ^ 0xE5B2] = 0xFFFF128B ^ 0xE5B2;
                    bo.o0000000O000[0xADA8 ^ 0xAD02] = 0xAD4B ^ 0xAD02;
                    bo.o0000000O000[0x5F0A ^ 0x5F24] = 0xFFFFA0D3 ^ 0x5F24;
                    bo.o0000000O000[0xD315 ^ 0xD3F4] = 0xFFFF2C15 ^ 0xD3F4;
                    n3 = 1820442958;
                    continue block73;
                }
                case 1820442958: {
                    bo.o0000000O000[0x9EC2 ^ 0x9E7D] = 0x9E6C ^ 0x9E7D;
                    n3 = 2140053113;
                    continue block73;
                }
                case 2140053113: {
                    bo.o0000000O000[0x6A06 ^ 0x6B7A] = 0x6B34 ^ 0x6B7A;
                    bo.o0000000O000[0x2647 ^ 0x26E0] = 0xFFFFD91F ^ 0x26E0;
                    n3 = 805089481;
                    continue block73;
                }
                case 805089481: {
                    bo.o0000000O000[0xB3DF ^ 0xB3E4] = 0xB3E1 ^ 0xB3E4;
                    n3 = 390239914;
                    continue block73;
                }
                case 390239914: {
                    bo.o0000000O000[0x80FB ^ 0x8000] = 0x4530EEFA ^ 0x8000;
                    bo.o0000000O000[0xDA72 ^ 0xDB0A] = 0x781993BB ^ 0xDB0A;
                    bo.o0000000O000[0xE3BE ^ 0xE3B3] = 0xFDC9 ^ 0xE3B3;
                    bo.o0000000O000[0x293C ^ 0x285A] = 0x284D ^ 0x285A;
                    bo.o0000000O000[0xC71A ^ 0xC663] = 0xC62E ^ 0xC663;
                    bo.o0000000O000[0xBECE ^ 0xBE8D] = 0xFFFF4128 ^ 0xBE8D;
                    bo.o0000000O000[0xF8AB ^ 0xF894] = 0xFFFF0760 ^ 0xF894;
                    bo.o0000000O000[0x30CF ^ 0x300C] = 0xFFFFCFA3 ^ 0x300C;
                    bo.o0000000O000[0xD22E ^ 0xD346] = 0xD34B ^ 0xD346;
                    bo.o0000000O000[0x4E64 ^ 0x4E06] = 0x4E06 ^ 0x4E06;
                    bo.o0000000O000[0x2CB1 ^ 0x2C30] = 0x2C37 ^ 0x2C30;
                    bo.o0000000O000[0xDAD4 ^ 0xDB96] = 0xFFFF242F ^ 0xDB96;
                    n3 = -2056730404;
                    continue block73;
                }
                case -2056730404: {
                    bo.o0000000O000[0x7D60 ^ 0x7C3C] = 0x7C2B ^ 0x7C3C;
                    bo.o0000000O000[0xAC31 ^ 0xAC22] = 0x4A723EF ^ 0xAC22;
                    bo.o0000000O000[0x917C ^ 0x91F9] = 0x91FA ^ 0x91F9;
                    bo.o0000000O000[0xD7A9 ^ 0xD6AF] = 0xFFFF0E49 ^ 0xD6AF;
                    bo.o0000000O000[0xDFA0 ^ 0xDE8A] = 0xDE95 ^ 0xDE8A;
                    bo.o0000000O000[0x347C ^ 0x3559] = 0x3560 ^ 0x3559;
                    bo.o0000000O000[0x57DB ^ 0x576A] = 0xFFFFA8E5 ^ 0x576A;
                    bo.o0000000O000[0xADEC ^ 0xADE6] = 0xFFFF5243 ^ 0xADE6;
                    bo.o0000000O000[0x714F ^ 0x700C] = 0x700D ^ 0x700C;
                    bo.o0000000O000[0x6CDA ^ 0x6C4A] = 0xF0F09CBB ^ 0x6C4A;
                    n3 = 569355083;
                    continue block73;
                }
                case 569355083: {
                    bo.o0000000O000[0x43D4 ^ 0x4320] = 0x4B15 ^ 0x4320;
                    bo.o0000000O000[0x10B47 ^ 0x10B75] = 0xFFFEF48A ^ 0x10B75;
                    bo.o0000000O000[0x5583 ^ 0x5551] = 0x5546 ^ 0x5551;
                    bo.o0000000O000[0x3D35 ^ 0x3C52] = 0x3C5B ^ 0x3C52;
                    bo.o0000000O000[0xE04C ^ 0xE015] = 0xFFFF1FEA ^ 0xE015;
                    bo.o0000000O000[0xCACA ^ 0xCA91] = 0xCA8E ^ 0xCA91;
                    n3 = -592344777;
                    continue block73;
                }
                case -592344777: {
                    bo.o0000000O000[0x71DE ^ 0x71A9] = 0xFFFF8E70 ^ 0x71A9;
                    bo.o0000000O000[0xBC86 ^ 0xBDC3] = 0xFFFF4204 ^ 0xBDC3;
                    n3 = -644903740;
                    continue block73;
                }
                case -644903740: {
                    bo.o0000000O000[0x2621 ^ 0x27AF] = 0x27A2 ^ 0x27AF;
                    n3 = -315802920;
                    continue block73;
                }
                case -315802920: {
                    bo.o0000000O000[0x892A ^ 0x8871] = 0xFFE1F78E ^ 0x8871;
                    bo.o0000000O000[0xA0FB ^ 0xA076] = 0xFFFF5F89 ^ 0xA076;
                    bo.o0000000O000[0xA04E ^ 0xA11F] = 0x3B131024 ^ 0xA11F;
                    bo.o0000000O000[0x8AF ^ 0x8B4] = 0x8CD ^ 0x8B4;
                    bo.o0000000O000[0x41B2 ^ 0x4124] = 0xFFFFBEC1 ^ 0x4124;
                    bo.o0000000O000[0xC6A8 ^ 0xC6F6] = 0xC6E3 ^ 0xC6F6;
                    n3 = 11133238;
                    continue block73;
                }
                case 11133238: {
                    bo.o0000000O000[0x5286 ^ 0x538B] = 0x539E ^ 0x538B;
                    bo.o0000000O000[0xAA9F ^ 0xAB88] = 0xABBD ^ 0xAB88;
                    bo.o0000000O000[0x5415 ^ 0x54A5] = 0xFFFFAB5A ^ 0x54A5;
                    n3 = -296483070;
                    continue block73;
                }
                case -296483070: {
                    bo.o0000000O000[0x60FB ^ 0x6188] = 0x6185 ^ 0x6188;
                    n3 = 1423354576;
                    continue block73;
                }
                case 1423354576: {
                    bo.o0000000O000[0x2A3B ^ 0x2A33] = 0xEA0E8AF1 ^ 0x2A33;
                    bo.o0000000O000[0x2643 ^ 0x2778] = 0xFFFFD8C9 ^ 0x2778;
                    bo.o0000000O000[0x606F ^ 0x616F] = 0x6178 ^ 0x616F;
                    bo.o0000000O000[0xB05D ^ 0xB130] = 0xB13F ^ 0xB130;
                    bo.o0000000O000[0x4C56 ^ 0x4D04] = 0xDB6FB2FB ^ 0x4D04;
                    bo.o0000000O000[0x88DB ^ 0x8801] = 0x8810 ^ 0x8801;
                    bo.o0000000O000[0x5B8C ^ 0x5B96] = 0xFFFFA469 ^ 0x5B96;
                    n3 = -631644316;
                    continue block73;
                }
                case -631644316: {
                    bo.o0000000O000[0xDBE3 ^ 0xDBAB] = 0xA00DBAB ^ 0xDBAB;
                    bo.o0000000O000[0xE8A4 ^ 0xE869] = 0xE87E ^ 0xE869;
                    bo.o0000000O000[0xAC49 ^ 0xAC07] = 0xFFFF53D4 ^ 0xAC07;
                    bo.o0000000O000[0x9487 ^ 0x94D4] = 0x87E6239B ^ 0x94D4;
                    bo.o0000000O000[0xA844 ^ 0xA8CE] = 0xFFFF5731 ^ 0xA8CE;
                    bo.o0000000O000[0x3DF5 ^ 0x3D99] = 0xFFFC3DD3 ^ 0x3D99;
                    bo.o0000000O000[0xA381 ^ 0xA333] = 0xA426 ^ 0xA333;
                    bo.o0000000O000[0xDB9B ^ 0xDBE6] = 0x4104CBA7 ^ 0xDBE6;
                    bo.o0000000O000[0x10CBA ^ 0x10DE3] = 0x10DE4 ^ 0x10DE3;
                    bo.o0000000O000[0x63C0 ^ 0x6369] = 0x6366 ^ 0x6369;
                    n3 = -160862883;
                    continue block73;
                }
                case -160862883: {
                    bo.o0000000O000[0xAD7 ^ 0xA30] = 0xFFFFF58F ^ 0xA30;
                    n3 = -1898558281;
                    continue block73;
                }
                case -1898558281: {
                    bo.o0000000O000[0xC832 ^ 0xC81B] = 0xFFFF3790 ^ 0xC81B;
                    bo.o0000000O000[0x187D ^ 0x1945] = 0x1914 ^ 0x1945;
                    bo.o0000000O000[0x91B6 ^ 0x91E6] = 0xFFFF6E49 ^ 0x91E6;
                    bo.o0000000O000[0x29BB ^ 0x29A3] = 0x29B2 ^ 0x29A3;
                    bo.o0000000O000[0x9444 ^ 0x9547] = 0xFFFF6AB5 ^ 0x9547;
                    bo.o0000000O000[0xB9EF ^ 0xB891] = 0xB8DC ^ 0xB891;
                    bo.o0000000O000[0xEDE4 ^ 0xECBE] = 0xECA7 ^ 0xECBE;
                    n3 = 1191394133;
                    continue block73;
                }
                case 1191394133: {
                    bo.o0000000O000[0x6540 ^ 0x652E] = 0xFFFF9AD1 ^ 0x652E;
                    bo.o0000000O000[0x8A43 ^ 0x8A0F] = 0x8A23 ^ 0x8A0F;
                    bo.o0000000O000[0x38C4 ^ 0x3833] = 0x380F ^ 0x3833;
                    bo.o0000000O000[0xE6B3 ^ 0xE6B6] = 0xE6C3 ^ 0xE6B6;
                    n3 = -1322997717;
                    continue block73;
                }
                case -1322997717: {
                    bo.o0000000O000[0x10C4E ^ 0x10CDD] = 0xFFFED1D3 ^ 0x10CDD;
                    bo.o0000000O000[0x9FDE ^ 0x9E86] = 0xFFFF617F ^ 0x9E86;
                    n3 = 676771751;
                    continue block73;
                }
                case 676771751: {
                    bo.o0000000O000[0x2F20 ^ 0x2F22] = 0xFFFFD0DD ^ 0x2F22;
                    bo.o0000000O000[0xF07C ^ 0xF0F4] = 0xFFFF0F4E ^ 0xF0F4;
                    n3 = 1713828493;
                    continue block73;
                }
                case 1713828493: {
                    bo.o0000000O000[0x2EBC ^ 0x2FD5] = 0x2FC6 ^ 0x2FD5;
                    bo.o0000000O000[0xE11E ^ 0xE036] = 0xA9417601 ^ 0xE036;
                    bo.o0000000O000[0x3FB2 ^ 0x3F47] = 0xFFFFC0AC ^ 0x3F47;
                    bo.o0000000O000[0x1594 ^ 0x149E] = 0x8000149E ^ 0x149E;
                    bo.o0000000O000[0x94FA ^ 0x9431] = 0x9431 ^ 0x9431;
                    bo.o0000000O000[0xB79E ^ 0xB72D] = 0x6EB3537E ^ 0xB72D;
                    n3 = 115745493;
                    continue block73;
                }
                case 115745493: {
                    bo.o0000000O000[0x9FDD ^ 0x9F72] = 0xFFFF60FF ^ 0x9F72;
                    bo.o0000000O000[0x3B5C ^ 0x3B83] = 0xFFFFC40A ^ 0x3B83;
                    bo.o0000000O000[0xBC44 ^ 0xBD51] = 0xBD48 ^ 0xBD51;
                    n3 = -1733577203;
                    continue block73;
                }
                case -1733577203: {
                    bo.o0000000O000[0x36AF ^ 0x372A] = 0x37B2 ^ 0x372A;
                    n3 = 1405148177;
                    continue block73;
                }
                case 1405148177: {
                    bo.o0000000O000[0x6ADD ^ 0x6BBD] = 0x8887E335 ^ 0x6BBD;
                    bo.o0000000O000[0x2BFB ^ 0x2AF5] = 0x2AFE ^ 0x2AF5;
                    n3 = 1206763401;
                    continue block73;
                }
                case 1206763401: {
                    bo.o0000000O000[0x2FFF ^ 0x2EDC] = 0x5B059E87 ^ 0x2EDC;
                    bo.o0000000O000[0xAF58 ^ 0xAF8F] = 0xFFFF5050 ^ 0xAF8F;
                    n3 = -1342847337;
                    continue block73;
                }
                case -1342847337: {
                    bo.o0000000O000[0x3957 ^ 0x39FF] = 0x39EE ^ 0x39FF;
                    bo.o0000000O000[0x9CEB ^ 0x9D81] = 0xFFEF627E ^ 0x9D81;
                    bo.o0000000O000[0x9D6F ^ 0x9C4F] = 0x9C54 ^ 0x9C4F;
                    bo.o0000000O000[0x80D9 ^ 0x8008] = 0x8001 ^ 0x8008;
                    bo.o0000000O000[0xBE83 ^ 0xBE4A] = 0xFFFF418D ^ 0xBE4A;
                    bo.o0000000O000[0x3518 ^ 0x358F] = 0x35C0 ^ 0x358F;
                    bo.o0000000O000[0x7E5 ^ 0x7D0] = 0x7D5 ^ 0x7D0;
                    bo.o0000000O000[0x3FD7 ^ 0x3FAC] = 0x3FAF ^ 0x3FAC;
                    bo.o0000000O000[0x8534 ^ 0x85DB] = 0x85DA ^ 0x85DB;
                    n3 = 811918632;
                    continue block73;
                }
                case 811918632: {
                    bo.o0000000O000[0x9D02 ^ 0x9C13] = 0xFFFF63EC ^ 0x9C13;
                    bo.o0000000O000[0x96D0 ^ 0x979B] = 0xFFFF6856 ^ 0x979B;
                    bo.o0000000O000[0xA2E5 ^ 0xA3C9] = 0x69D09554 ^ 0xA3C9;
                    bo.o0000000O000[0x9AAE ^ 0x9ABE] = 0x9ABF ^ 0x9ABE;
                    bo.o0000000O000[0x857D ^ 0x850C] = 0x3D559 ^ 0x850C;
                    bo.o0000000O000[0x82CC ^ 0x8344] = 0x80A5 ^ 0x8344;
                    bo.o0000000O000[0x69 ^ 0x172] = 0xFFFFFEA7 ^ 0x172;
                    bo.o0000000O000[0xEC62 ^ 0xED72] = 0xED07 ^ 0xED72;
                    bo.o0000000O000[0xA997 ^ 0xA957] = 0xBA47 ^ 0xA957;
                    bo.o0000000O000[0x496D ^ 0x4912] = 0x4961 ^ 0x4912;
                    bo.o0000000O000[0xD1DF ^ 0xD0F8] = 0xFFFF2F71 ^ 0xD0F8;
                    bo.o0000000O000[0x316D ^ 0x303E] = 0xFFFFCFC1 ^ 0x303E;
                    bo.o0000000O000[0x2B45 ^ 0x2A63] = 0x2D9A ^ 0x2A63;
                    bo.o0000000O000[0x2899 ^ 0x2844] = 0xFFFFD7B1 ^ 0x2844;
                    bo.o0000000O000[0x1031E ^ 0x103E4] = 0xFFFEFC21 ^ 0x103E4;
                    bo.o0000000O000[0x80F3 ^ 0x803B] = 0xFFFF7F92 ^ 0x803B;
                    bo.o0000000O000[0x13DD ^ 0x13CF] = 0xFFFFEC30 ^ 0x13CF;
                    bo.o0000000O000[0xBAA6 ^ 0xBBBF] = 0xBBD6 ^ 0xBBBF;
                    n3 = -1230112331;
                    continue block73;
                }
                case -1230112331: {
                    bo.o0000000O000[0xB12E ^ 0xB1F5] = 0xB1FA ^ 0xB1F5;
                    bo.o0000000O000[0x93FB ^ 0x931B] = 0x9352 ^ 0x931B;
                    bo.o0000000O000[0xB29D ^ 0xB2D8] = 0xFFFF4D01 ^ 0xB2D8;
                    bo.o0000000O000[0x3253 ^ 0x33D8] = 0x33C3 ^ 0x33D8;
                    n3 = 1701153575;
                    continue block73;
                }
                case 1701153575: {
                    bo.o0000000O000[0xE2C8 ^ 0xE34B] = 0xF0FEC44 ^ 0xE34B;
                    bo.o0000000O000[0x5385 ^ 0x53FC] = 0x53E4 ^ 0x53FC;
                    bo.o0000000O000[0xE054 ^ 0xE129] = 0xFFFF1ED6 ^ 0xE129;
                    n3 = -522041637;
                    continue block73;
                }
                case -522041637: {
                    bo.o0000000O000[0x76E0 ^ 0x76E6] = 0xFFFF8919 ^ 0x76E6;
                    n3 = -2053483906;
                    continue block73;
                }
                case -2053483906: {
                    bo.o0000000O000[0xBE73 ^ 0xBF40] = 0xBF53 ^ 0xBF40;
                    bo.o0000000O000[0x27F4 ^ 0x2718] = 0x2745 ^ 0x2718;
                    bo.o0000000O000[0x6C35 ^ 0x6C10] = 0xFFFF908A ^ 0x6C10;
                    bo.o0000000O000[0xE717 ^ 0xE7E6] = 0xFFFF1851 ^ 0xE7E6;
                    bo.o0000000O000[0x4886 ^ 0x4850] = 0x4848 ^ 0x4850;
                    bo.o0000000O000[0x10342 ^ 0x103D3] = 0x103C0 ^ 0x103D3;
                    bo.o0000000O000[0x48EC ^ 0x488D] = 0x26E93058 ^ 0x488D;
                    n3 = -1907342712;
                    continue block73;
                }
                case -1907342712: {
                    bo.o0000000O000[0x6451 ^ 0x64E5] = 0x64D4 ^ 0x64E5;
                    bo.o0000000O000[0x106F ^ 0x1159] = 0xFFFFEED8 ^ 0x1159;
                    bo.o0000000O000[0xA810 ^ 0xA85B] = 0xFFFF57A0 ^ 0xA85B;
                    bo.o0000000O000[0x5DC1 ^ 0x5D62] = 0x5D77 ^ 0x5D62;
                    bo.o0000000O000[0x5659 ^ 0x56D9] = 0xFFFFA926 ^ 0x56D9;
                    bo.o0000000O000[0x1721 ^ 0x1774] = 0xC30C27B7 ^ 0x1774;
                    n3 = 451420977;
                    continue block73;
                }
                case 451420977: {
                    bo.o0000000O000[0xFD41 ^ 0xFDEA] = 0x8000FDCC ^ 0xFDEA;
                    n3 = 176554892;
                    continue block73;
                }
                case 176554892: {
                    bo.o0000000O000[0xE04D ^ 0xE0A5] = 0xFFFF1F5A ^ 0xE0A5;
                    bo.o0000000O000[0xDE3A ^ 0xDEC9] = 0xDECC ^ 0xDEC9;
                    bo.o0000000O000[0x9389 ^ 0x93EE] = 0x93CC ^ 0x93EE;
                    bo.o0000000O000[0x7BCE ^ 0x7A9A] = 0x7A9D ^ 0x7A9A;
                    bo.o0000000O000[0x1D17 ^ 0x1D57] = 0xFFFFE2DA ^ 0x1D57;
                    bo.o0000000O000[0x2760 ^ 0x2799] = 0xFFFFD866 ^ 0x2799;
                    bo.o0000000O000[0xA471 ^ 0xA505] = 0xA516 ^ 0xA505;
                    bo.o0000000O000[0x2209 ^ 0x223E] = 0x78196A8F ^ 0x223E;
                    bo.o0000000O000[0xD459 ^ 0xD529] = 0xFFFF2AC8 ^ 0xD529;
                    bo.o0000000O000[0x9761 ^ 0x97D8] = 0x97A7 ^ 0x97D8;
                    bo.o0000000O000[0x98DA ^ 0x98B9] = 0xFFFF671A ^ 0x98B9;
                    bo.o0000000O000[0xF9A9 ^ 0xF92F] = 0xF932 ^ 0xF92F;
                    bo.o0000000O000[0xFF4B ^ 0xFF23] = 0xFF3C ^ 0xFF23;
                    bo.o0000000O000[0x10587 ^ 0x104CF] = 0x104DB ^ 0x104CF;
                    bo.o0000000O000[0x9658 ^ 0x96EE] = 0x98822FDF ^ 0x96EE;
                    bo.o0000000O000[0x6620 ^ 0x66B8] = 0x66B8 ^ 0x66B8;
                    bo.o0000000O000[0xE79A ^ 0xE7FC] = 0xE7EB ^ 0xE7FC;
                    bo.o0000000O000[0x4780 ^ 0x47FE] = 0x478C ^ 0x47FE;
                    bo.o0000000O000[0x1081E ^ 0x108DF] = 0xC10D9FCA ^ 0x108DF;
                    bo.o0000000O000[0x700A ^ 0x7187] = 0x7194 ^ 0x7187;
                    n3 = 536625389;
                    continue block73;
                }
                case 536625389: {
                    bo.o0000000O000[0xDD58 ^ 0xDD51] = 0xFFFF22E2 ^ 0xDD51;
                    bo.o0000000O000[0x1695 ^ 0x17F6] = 0xFFFFE843 ^ 0x17F6;
                    n3 = 162100466;
                    continue block73;
                }
                case 162100466: {
                    bo.o0000000O000[0x3EB3 ^ 0x3EE2] = 0xFFFFC11B ^ 0x3EE2;
                    bo.o0000000O000[0x5419 ^ 0x547D] = 0x5470 ^ 0x547D;
                    bo.o0000000O000[0x2DF7 ^ 0x2D57] = 0x1A1F7586 ^ 0x2D57;
                    bo.o0000000O000[0xE9AB ^ 0xE906] = 0xE907 ^ 0xE906;
                    bo.o0000000O000[0x99A5 ^ 0x98B3] = 0xFFFF674C ^ 0x98B3;
                    bo.o0000000O000[0x15BA ^ 0x1484] = 0x149F ^ 0x1484;
                    bo.o0000000O000[0x7AE7 ^ 0x7A5D] = 0x7A04 ^ 0x7A5D;
                    bo.o0000000O000[0x7E0D ^ 0x7F37] = 0xFFFF80D2 ^ 0x7F37;
                    bo.o0000000O000[0x49A8 ^ 0x4943] = 0x20449E3E ^ 0x4943;
                    bo.o0000000O000[0xF290 ^ 0xF29F] = 0xFFFF0D3C ^ 0xF29F;
                    bo.o0000000O000[0xF196 ^ 0xF17B] = 0xF10C ^ 0xF17B;
                    bo.o0000000O000[0xD8A ^ 0xD96] = 0xB4E816DD ^ 0xD96;
                    bo.o0000000O000[0x108D7 ^ 0x10859] = 0xFFFEF78C ^ 0x10859;
                    bo.o0000000O000[0x33A4 ^ 0x32C5] = 0x32CA ^ 0x32C5;
                    n3 = -1416279517;
                    continue block73;
                }
                case -1416279517: {
                    bo.o0000000O000[0x2583 ^ 0x249B] = 0xFFFFDB7A ^ 0x249B;
                    bo.o0000000O000[0x7AC0 ^ 0x7A3E] = 0x7A3F ^ 0x7A3E;
                    bo.o0000000O000[0x3BFF ^ 0x3A94] = 0xFFFFC56B ^ 0x3A94;
                    bo.o0000000O000[0xB161 ^ 0xB136] = 0xB133 ^ 0xB136;
                    bo.o0000000O000[0xE76A ^ 0xE7AE] = 0xFFFF1E8C ^ 0xE7AE;
                    bo.o0000000O000[0x2075 ^ 0x215B] = 0xFFC7DEA4 ^ 0x215B;
                    bo.o0000000O000[0xA20C ^ 0xA311] = 0x1D23FD02 ^ 0xA311;
                    bo.o0000000O000[0x24F8 ^ 0x24A0] = 0x24BB ^ 0x24A0;
                    bo.o0000000O000[0xE28A ^ 0xE272] = 0xFFFF1D8D ^ 0xE272;
                    bo.o0000000O000[0x10545 ^ 0x1050A] = 0xFFFEFABD ^ 0x1050A;
                    bo.o0000000O000[0x43AC ^ 0x42C9] = 0x80042C9 ^ 0x42C9;
                    n3 = 1194442484;
                    continue block73;
                }
                case 1194442484: {
                    bo.o0000000O000[0xF04B ^ 0xF0A2] = 0xF0BD ^ 0xF0A2;
                    bo.o0000000O000[0x746C ^ 0x7451] = 0xFFFF8BAE ^ 0x7451;
                    bo.o0000000O000[0x407B ^ 0x413F] = 0x4107 ^ 0x413F;
                    bo.o0000000O000[0x4AB ^ 0x52C] = 0x529 ^ 0x52C;
                    bo.o0000000O000[0xB119 ^ 0xB184] = 0xB1EA ^ 0xB184;
                    bo.o0000000O000[0x9BA2 ^ 0x9AB0] = 0x9AC9 ^ 0x9AB0;
                    bo.o0000000O000[0xB35C ^ 0xB201] = 0xB208 ^ 0xB201;
                    bo.o0000000O000[0xCB14 ^ 0xCB46] = 0xC0F3 ^ 0xCB46;
                    bo.o0000000O000[0x8211 ^ 0x8315] = 0xFFFF7CE6 ^ 0x8315;
                    bo.o0000000O000[0x9AE0 ^ 0x9A0A] = 0x9A0B ^ 0x9A0A;
                    n3 = 690571507;
                    continue block73;
                }
                case 690571507: {
                    bo.o0000000O000[0xBF89 ^ 0xBFB0] = 0xFFFF404F ^ 0xBFB0;
                    n3 = -1768560326;
                    continue block73;
                }
                case -1768560326: {
                    bo.o0000000O000[0xA166 ^ 0xA053] = 0xFFFF5F5C ^ 0xA053;
                    bo.o0000000O000[0x192F ^ 0x19D0] = 0xFFFF922F ^ 0x19D0;
                    bo.o0000000O000[0x79DE ^ 0x79E0] = 0xFFFF861B ^ 0x79E0;
                    bo.o0000000O000[0x1AC2 ^ 0x1A7C] = 0x1A73 ^ 0x1A7C;
                    bo.o0000000O000[0xCE77 ^ 0xCE46] = 0xFFFF31BF ^ 0xCE46;
                    bo.o0000000O000[0x3911 ^ 0x386E] = 0xFFFFC7D6 ^ 0x386E;
                    bo.o0000000O000[0x2F81 ^ 0x2F5F] = 0xF57D9076 ^ 0x2F5F;
                    bo.o0000000O000[0xCDD0 ^ 0xCD91] = 0xFFFF3270 ^ 0xCD91;
                    n3 = -1339734868;
                    continue block73;
                }
                case -1339734868: {
                    bo.o0000000O000[0x844 ^ 0x8E1] = 0x248896 ^ 0x8E1;
                    bo.o0000000O000[0x1037D ^ 0x10357] = 0x10344 ^ 0x10357;
                    bo.o0000000O000[0x8562 ^ 0x85D7] = 0xFFFF4A5F ^ 0x85D7;
                    bo.o0000000O000[0xE4B8 ^ 0xE43F] = 0xFFFF1BC2 ^ 0xE43F;
                    bo.o0000000O000[0xEC0C ^ 0xED28] = 0xFFFF12D7 ^ 0xED28;
                    bo.o0000000O000[0x9F47 ^ 0x9E0E] = 0x9E11 ^ 0x9E0E;
                    bo.o0000000O000[0xBAEE ^ 0xBBDF] = 0xBBD2 ^ 0xBBDF;
                    bo.o0000000O000[0x25CF ^ 0x2599] = 0x258C ^ 0x2599;
                    bo.o0000000O000[0xC3DB ^ 0xC2E2] = 0xFFE0C2B6 ^ 0xC2E2;
                    bo.o0000000O000[0x1E01 ^ 0x1EC6] = 0xFFFFE143 ^ 0x1EC6;
                    bo.o0000000O000[0x6E47 ^ 0x6E2D] = 0x6E4E ^ 0x6E2D;
                    bo.o0000000O000[0x552B ^ 0x5536] = 0xFFFFAAC9 ^ 0x5536;
                    bo.o0000000O000[0x101DE ^ 0x1014C] = 0x10141 ^ 0x1014C;
                    bo.o0000000O000[0x6678 ^ 0x6757] = 0x6750 ^ 0x6757;
                    n3 = 1369452212;
                    continue block73;
                }
                case 1369452212: {
                    bo.o0000000O000[0xDA8A ^ 0xDADE] = 0xFFFF2505 ^ 0xDADE;
                    bo.o0000000O000[0x2881 ^ 0x290D] = 0x1848290D ^ 0x290D;
                    bo.o0000000O000[0x6E48 ^ 0x6F44] = 0x6F4B ^ 0x6F44;
                    bo.o0000000O000[0xC723 ^ 0xC72F] = 0xFFFF38D0 ^ 0xC72F;
                    n3 = -1440839482;
                    continue block73;
                }
                case -1440839482: {
                    bo.o0000000O000[0x6F56 ^ 0x6F6C] = 0x5F02CCCD ^ 0x6F6C;
                    bo.o0000000O000[0x35BD ^ 0x349C] = 0x3499 ^ 0x349C;
                    bo.o0000000O000[0x1DFE ^ 0x1CEA] = 0x1CED ^ 0x1CEA;
                    bo.o0000000O000[0xC64E ^ 0xC69E] = 0xC69E ^ 0xC69E;
                    bo.o0000000O000[0x10EE3 ^ 0x10EE2] = 0x10EDB ^ 0x10EE2;
                    bo.o0000000O000[0xA2F9 ^ 0xA3B9] = 0x8DFC ^ 0xA3B9;
                    bo.o0000000O000[0x8F8B ^ 0x8FA7] = 0xFFFF7050 ^ 0x8FA7;
                    bo.o0000000O000[0x7E1B ^ 0x7F08] = 0xFFFFAAF7 ^ 0x7F08;
                    bo.o0000000O000[0x1FE3 ^ 0x1FB9] = 0x1FB8 ^ 0x1FB9;
                    bo.o0000000O000[0x4347 ^ 0x438D] = 0xFFFFBC4A ^ 0x438D;
                    bo.o0000000O000[0x37E9 ^ 0x3766] = 0xFFFFC8B3 ^ 0x3766;
                    bo.o0000000O000[0xF708 ^ 0xF734] = 0xFFFF08CB ^ 0xF734;
                    bo.o0000000O000[0x246C ^ 0x2431] = 0x243A ^ 0x2431;
                    bo.o0000000O000[0x378A ^ 0x37A9] = 0x37B0 ^ 0x37A9;
                    bo.o0000000O000[0xE254 ^ 0xE2E8] = 0xE2C4 ^ 0xE2E8;
                    bo.o0000000O000[0x10999 ^ 0x108B0] = 0x108B1 ^ 0x108B0;
                    bo.o0000000O000[0xD5BE ^ 0xD55B] = 0xD542 ^ 0xD55B;
                    n3 = 300220918;
                    continue block73;
                }
                case 300220918: {
                    bo.o0000000O000[0xF598 ^ 0xF541] = 0xF541 ^ 0xF541;
                    n3 = 1417086489;
                    continue block73;
                }
                case 1417086489: {
                    bo.o0000000O000[0x10A96 ^ 0x10A4A] = 0xFFFEF5A1 ^ 0x10A4A;
                    n3 = -1197977077;
                    continue block73;
                }
                case -1197977077: 
            }
            bo.o0000000O000[0x10328 ^ 0x103D8] = 0x103C7 ^ 0x103D8;
            bo.o0000000O000[0x8097 ^ 0x8051] = 0x61F224EA ^ 0x8051;
            bo.o0000000O000[0x2F67 ^ 0x2FF9] = 0xFFFFD068 ^ 0x2FF9;
            bo.o0000000O000[0x4877 ^ 0x493B] = 0x4926 ^ 0x493B;
            bo.o0000000O000[0x4890 ^ 0x49DD] = 0x4AE3 ^ 0x49DD;
            bo.o0000000O000[0x935A ^ 0x9255] = 0x6F9662FB ^ 0x9255;
            bo.o0000000O000[0x7EBE ^ 0x7FEE] = 0x7FF1 ^ 0x7FEE;
            bo.o0000000O000[0x6105 ^ 0x614F] = 0x6156 ^ 0x614F;
            bo.o0000000O000[0xD62F ^ 0xD653] = 0xD2FDF980 ^ 0xD653;
            bo.o0000000O000[0x6508 ^ 0x6508] = 0xFFFF9ACB ^ 0x6508;
            bo.o0000000O000[0x4504 ^ 0x4401] = 0xFFFFBBFE ^ 0x4401;
            bo.o0000000O000[0x3DA0 ^ 0x3CF7] = 0x40003CF7 ^ 0x3CF7;
            n3 = 1697576853;
        }
    }
}

