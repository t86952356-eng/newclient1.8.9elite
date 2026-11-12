/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aix;
import hackclient.rise.akd;
import hackclient.rise.su;
import hackclient.rise.sv;
import hackclient.rise.sw;
import hackclient.rise.sy;
import java.util.Optional;
import java.util.function.Supplier;
import net.minecraft.util.bt;

public final class sx
extends Enum<sx> {
    public static final /* enum */ sx aae = new sx(() -> su.ZW.jw().getId());
    public static final /* enum */ sx aaf = new sx(() -> su.ZW.jw().in());
    public static final /* enum */ sx aag = new sx(() -> su.ZW.jw().io());
    public static final /* enum */ sx aah = new sx(() -> su.ZW.jw().ip());
    public static final /* enum */ sx aai = new sx(() -> su.ZW.jw().iq());
    public static final /* enum */ sx aaj = new sx(() -> su.ZW.jw().ir());
    public static final /* enum */ sx aak = new sx(() -> su.ZX.jw().in());
    public static final /* enum */ sx aal = new sx(() -> su.ZX.jw().io());
    public static final /* enum */ sx aam = new sx(() -> su.ZX.jw().ip());
    public static final /* enum */ sx aan = new sx(() -> su.ZX.jw().iq());
    public static final /* enum */ sx aao = new sx(() -> su.ZX.jw().ir());
    public static final /* enum */ sx aap = new sx(() -> sw.ZZ.a(su.ZW.jw().in(), su.ZX.jw().in()));
    public static final /* enum */ sx aaq = new sx(() -> sw.ZZ.a(su.ZW.jw().io(), su.ZX.jw().io()));
    public static final /* enum */ sx aar = new sx(() -> sw.ZZ.a(su.ZW.jw().ip(), su.ZX.jw().ip()));
    public static final /* enum */ sx aas = new sx(() -> aix.c(new akd(su.ZW.jw().in(), 0.0, su.ZW.jw().ip()), new akd(su.ZX.jw().in(), 0.0, su.ZX.jw().ip())).getX());
    public static final /* enum */ sx aat = new sx(() -> aix.c(new akd(su.ZW.jw().in(), su.ZW.jw().io(), su.ZW.jw().ip()), new akd(su.ZX.jw().in(), su.ZX.jw().io(), su.ZX.jw().ip())).getY());
    public static final /* enum */ sx aau = new sx(() -> su.ZW.jw().in() - su.ZW.get(1).in());
    public static final /* enum */ sx aav = new sx(() -> su.ZW.jw().io() - su.ZW.get(1).io());
    public static final /* enum */ sx aaw = new sx(() -> su.ZW.jw().ip() - su.ZW.get(1).ip());
    public static final /* enum */ sx aax = new sx(() -> sw.aab.a(su.ZW.jw().iq(), su.ZW.get(1).iq()));
    public static final /* enum */ sx aay = new sx(() -> sw.ZZ.a(su.ZW.jw().ir(), su.ZW.get(1).ir()));
    public static final /* enum */ sx aaz = new sx(() -> sw.aab.a(su.ZW.jw().iq(), aas.iu()));
    public static final /* enum */ sx aaA = new sx(() -> aaz.t(true));
    public static final /* enum */ sx aaB = new sx(() -> sw.ZZ.a(su.ZW.jw().ir(), aat.iu()));
    public static final /* enum */ sx aaC = new sx(() -> aaB.t(true));
    public static final /* enum */ sx aaD = new sx(() -> sw.aaa.a(su.ZX.jw().in() - su.ZW.jw().in(), su.ZX.jw().ip() - su.ZW.jw().ip()));
    public static final /* enum */ sx aaE = new sx(() -> sw.ZZ.a(su.ZX.jw().io(), su.ZW.jw().io()));
    public static final /* enum */ sx aaF = new sx(() -> aaD.iu() - sw.aaa.a(su.ZX.jw().in() - su.ZW.get(1).in(), su.ZX.jw().ip() - su.ZW.get(1).ip()));
    public static final /* enum */ sx aaG = new sx(() -> aaF.t(true));
    public static final /* enum */ sx aaH = new sx(() -> sw.ZZ.a(sw.ZZ.a(su.ZX.jw().io(), su.ZW.get(1).io()), aaE.iu()));
    public static final /* enum */ sx aaI = new sx(() -> aaH.t(true));
    public static final /* enum */ sx aaJ = new sx(() -> bt.aJ(Math.toDegrees(Math.atan2(aaz.iu(), aaB.iu()))));
    public static final /* enum */ sx aaK = new sx(() -> sw.aab.a(aas.iu(), aas.C(1)));
    public static final /* enum */ sx aaL = new sx(() -> sw.ZZ.a(aat.iu(), aat.C(1)));
    public static final /* enum */ sx aaM = new sx(() -> sw.aaa.a(sw.ZZ.a(su.ZW.jw().in(), su.ZW.get(1).in()), sw.ZZ.a(su.ZW.jw().ip(), su.ZW.get(1).ip())));
    public static final /* enum */ sx aaN = new sx(() -> bt.bN((float)(360.0 - Math.atan2(aau.iu(), aaw.iu()) * 57.29577951308232 - 180.0)) + 180.0f);
    public static final /* enum */ sx aaO = new sx(() -> Math.min(Math.abs(sw.aab.a(su.ZW.jw().iq(), aaN.iu() - 90.0)), Math.abs(sw.aab.a(su.ZW.jw().iq(), aaN.iu() + 90.0))) / 90.0 * 100.0);
    public static final /* enum */ sx aaP = new sx(() -> aaM.iu() * aaO.iu() / 100.0 * (double)(Math.abs(sw.aab.a(su.ZW.jw().iq(), aaN.iu())) > 90.0 ? -1 : 1));
    public static final /* enum */ sx aaQ = new sx(() -> aaM.iu() * (1.0 - aaO.iu() / 100.0) * (double)(Math.abs(sw.aab.a(su.ZW.jw().iq() + 90.0, aaN.iu())) > 90.0 ? -1 : 1));
    public static final /* enum */ sx aaR = new sx(() -> aaP.t(true));
    public static final /* enum */ sx aaS = new sx(() -> aaQ.t(true));
    public static final /* enum */ sx aaT = new sx(() -> sw.aab.a(new Double[]{aas.iu(), aix.c(new akd(su.ZW.get(1).in(), su.ZW.get(1).io(), su.ZW.get(1).ip()), new akd(su.ZX.jw().in(), su.ZX.jw().io(), su.ZX.jw().ip())).getX()}));
    public static final /* enum */ sx aaU = new sx(() -> aaT.t(true));
    public static final /* enum */ sx aaV = new sx(() -> sw.ZZ.a(new Double[]{aat.iu(), aix.c(new akd(su.ZW.get(1).in(), su.ZW.get(1).io(), su.ZW.get(1).ip()), new akd(su.ZX.jw().in(), su.ZX.jw().io(), su.ZX.jw().ip())).getY()}));
    public static final /* enum */ sx aaW = new sx(() -> aaV.t(true) * -1.0);
    public static final /* enum */ sx aaX = new sx(() -> sw.aaa.a(aax.iu(), aay.iu()));
    public static final /* enum */ sx aaY = new sx(() -> sw.aaa.a(aaz.iu(), aaB.iu()));
    public static final /* enum */ sx aaZ = new sx(() -> sw.ZZ.a(aaY.iu(), aaY.C(1)));
    public static final /* enum */ sx aba = new sx(() -> sw.ZZ.a(aaY.iu(), sw.aaa.a(sw.aab.a(new Double[]{su.ZW.get(1).iq(), aix.c(new akd(su.ZW.get(1).in(), 0.0, su.ZW.get(1).ip()), new akd(su.ZX.jw().in(), 0.0, su.ZX.jw().ip())).getX()}), sw.ZZ.a(new Double[]{su.ZW.get(1).ir(), aix.c(new akd(su.ZW.get(1).in(), su.ZW.get(1).io(), su.ZW.get(1).ip()), new akd(su.ZX.jw().in(), su.ZX.jw().io(), su.ZX.jw().ip())).getY()}))));
    public static final /* enum */ sx abb = new sx(() -> aba.t(true) * -1.0);
    public static final /* enum */ sx abc = new sx(() -> (double)(su.ZW.jw().is() ? 1 : 0));
    public static final /* enum */ sx abd = new sx(() -> {
        Optional<sv> optional = su.ZW.stream().filter(sv2 -> sv2.is()).findFirst();
        return (double)optional.map(sv2 -> su.ZW.size() - su.ZW.indexOf(sv2) - 1).orElse(su.ZW.si());
    });
    private final Supplier<Double> abe;
    private static final /* synthetic */ sx[] abf;

    public static sx[] values() {
        return (sx[])abf.clone();
    }

    public static sx valueOf(String string) {
        return Enum.valueOf(sx.class, string);
    }

    private sx(Supplier<Double> supplier) {
        this.abe = supplier;
    }

    public Double iu() {
        return this.abe.get();
    }

    public Double C(int n2) {
        return this.d(n2, false);
    }

    public Double t(boolean bl2) {
        return this.d(0, bl2);
    }

    public Double d(int n2, boolean bl2) {
        sy<sv> sy2 = su.ZW.jx();
        sy<sv> sy3 = su.ZX.jx();
        if (bl2) {
            su.ZW = sy3;
            su.ZX = sy2;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            su.ZW.removeLast();
            su.ZX.removeLast();
        }
        Double d2 = this.abe.get();
        su.ZW = sy2;
        su.ZX = sy3;
        return d2;
    }

    private static /* synthetic */ sx[] jv() {
        return new sx[]{aae, aaf, aag, aah, aai, aaj, aak, aal, aam, aan, aao, aap, aaq, aar, aas, aat, aau, aav, aaw, aax, aay, aaz, aaA, aaB, aaC, aaD, aaE, aaF, aaG, aaH, aaI, aaJ, aaK, aaL, aaM, aaN, aaO, aaP, aaQ, aaR, aaS, aaT, aaU, aaV, aaW, aaX, aaY, aaZ, aba, abb, abc, abd};
    }

    static {
        abf = sx.jv();
    }
}

