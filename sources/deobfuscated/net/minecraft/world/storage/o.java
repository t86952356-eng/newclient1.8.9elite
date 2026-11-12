/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import net.minecraft.nbt.n;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import net.minecraft.world.an;
import net.minecraft.world.ao;
import net.minecraft.world.ap;
import net.minecraft.world.f;
import net.minecraft.world.i;
import net.minecraft.world.storage.p;
import net.minecraft.world.storage.q;
import net.minecraft.world.storage.r;
import net.minecraft.world.storage.s;
import net.minecraft.world.storage.t;
import net.minecraft.world.storage.u;
import net.minecraft.world.storage.v;
import net.minecraft.world.storage.w;
import net.minecraft.world.storage.x;

public class o {
    public static final f dTT = f.dBT;
    private long dTU;
    private ap dDL = ap.dED;
    private String dTV = "";
    private int dTW;
    private int dTX;
    private int dTY;
    private long dTZ;
    private long worldTime;
    private long dTA;
    private long dTB;
    private n dUa;
    private int csP;
    private String dUb;
    private int dUc;
    private int dUd;
    private boolean dUe;
    private int dUf;
    private boolean dUg;
    private int dUh;
    private ao dEq;
    private boolean dEr;
    private boolean dTE;
    private boolean dUi;
    private boolean Mq;
    private f chN;
    private boolean difficultyLocked;
    private double dUj = 0.0;
    private double dUk = 0.0;
    private double dUl = 6.0E7;
    private long dUm = 0L;
    private double dUn = 0.0;
    private double dUo = 5.0;
    private double dUp = 0.2;
    private int dUq = 5;
    private int dUr = 15;
    private i dUs = new i();

    protected o() {
    }

    public o(n n2) {
        this.dTU = n2.eH("RandomSeed");
        if (n2.C("generatorName", 8)) {
            String string = n2.eK("generatorName");
            this.dDL = ap.gD(string);
            if (this.dDL == null) {
                this.dDL = ap.dED;
            } else if (this.dDL.awO()) {
                int n3 = 0;
                if (n2.C("generatorVersion", 99)) {
                    n3 = n2.eG("generatorVersion");
                }
                this.dDL = this.dDL.ij(n3);
            }
            if (n2.C("generatorOptions", 8)) {
                this.dTV = n2.eK("generatorOptions");
            }
        }
        this.dEq = ao.ii(n2.eG("GameType"));
        this.dEr = n2.C("MapFeatures", 99) ? n2.eO("MapFeatures") : true;
        this.dTW = n2.eG("SpawnX");
        this.dTX = n2.eG("SpawnY");
        this.dTY = n2.eG("SpawnZ");
        this.dTZ = n2.eH("Time");
        this.worldTime = n2.C("DayTime", 99) ? n2.eH("DayTime") : this.dTZ;
        this.dTA = n2.eH("LastPlayed");
        this.dTB = n2.eH("SizeOnDisk");
        this.dUb = n2.eK("LevelName");
        this.dUc = n2.eG("version");
        this.dUd = n2.eG("clearWeatherTime");
        this.dUf = n2.eG("rainTime");
        this.dUe = n2.eO("raining");
        this.dUh = n2.eG("thunderTime");
        this.dUg = n2.eO("thundering");
        this.dTE = n2.eO("hardcore");
        this.Mq = n2.C("initialized", 99) ? n2.eO("initialized") : true;
        if (n2.C("allowCommands", 99)) {
            this.dUi = n2.eO("allowCommands");
        } else {
            boolean bl2 = this.dUi = this.dEq == ao.dEy;
        }
        if (n2.C("Player", 10)) {
            this.dUa = n2.eN("Player");
            this.csP = this.dUa.eG("Dimension");
        }
        if (n2.C("GameRules", 10)) {
            this.dUs.a(n2.eN("GameRules"));
        }
        if (n2.C("Difficulty", 99)) {
            this.chN = f.ib(n2.eE("Difficulty"));
        }
        if (n2.C("DifficultyLocked", 1)) {
            this.difficultyLocked = n2.eO("DifficultyLocked");
        }
        if (n2.C("BorderCenterX", 99)) {
            this.dUj = n2.eJ("BorderCenterX");
        }
        if (n2.C("BorderCenterZ", 99)) {
            this.dUk = n2.eJ("BorderCenterZ");
        }
        if (n2.C("BorderSize", 99)) {
            this.dUl = n2.eJ("BorderSize");
        }
        if (n2.C("BorderSizeLerpTime", 99)) {
            this.dUm = n2.eH("BorderSizeLerpTime");
        }
        if (n2.C("BorderSizeLerpTarget", 99)) {
            this.dUn = n2.eJ("BorderSizeLerpTarget");
        }
        if (n2.C("BorderSafeZone", 99)) {
            this.dUo = n2.eJ("BorderSafeZone");
        }
        if (n2.C("BorderDamagePerBlock", 99)) {
            this.dUp = n2.eJ("BorderDamagePerBlock");
        }
        if (n2.C("BorderWarningBlocks", 99)) {
            this.dUq = n2.eG("BorderWarningBlocks");
        }
        if (n2.C("BorderWarningTime", 99)) {
            this.dUr = n2.eG("BorderWarningTime");
        }
    }

    public o(an an2, String string) {
        this.c(an2);
        this.dUb = string;
        this.chN = dTT;
        this.Mq = false;
    }

    public void c(an an2) {
        this.dTU = an2.avD();
        this.dEq = an2.If();
        this.dEr = an2.awB();
        this.dTE = an2.awA();
        this.dDL = an2.awC();
        this.dTV = an2.aln();
        this.dUi = an2.awD();
    }

    public o(o o2) {
        this.dTU = o2.dTU;
        this.dDL = o2.dDL;
        this.dTV = o2.dTV;
        this.dEq = o2.dEq;
        this.dEr = o2.dEr;
        this.dTW = o2.dTW;
        this.dTX = o2.dTX;
        this.dTY = o2.dTY;
        this.dTZ = o2.dTZ;
        this.worldTime = o2.worldTime;
        this.dTA = o2.dTA;
        this.dTB = o2.dTB;
        this.dUa = o2.dUa;
        this.csP = o2.csP;
        this.dUb = o2.dUb;
        this.dUc = o2.dUc;
        this.dUf = o2.dUf;
        this.dUe = o2.dUe;
        this.dUh = o2.dUh;
        this.dUg = o2.dUg;
        this.dTE = o2.dTE;
        this.dUi = o2.dUi;
        this.Mq = o2.Mq;
        this.dUs = o2.dUs;
        this.chN = o2.chN;
        this.difficultyLocked = o2.difficultyLocked;
        this.dUj = o2.dUj;
        this.dUk = o2.dUk;
        this.dUl = o2.dUl;
        this.dUm = o2.dUm;
        this.dUn = o2.dUn;
        this.dUo = o2.dUo;
        this.dUp = o2.dUp;
        this.dUr = o2.dUr;
        this.dUq = o2.dUq;
    }

    public n Uv() {
        n n2 = new n();
        this.a(n2, this.dUa);
        return n2;
    }

    public n P(n n2) {
        n n3 = new n();
        this.a(n3, n2);
        return n3;
    }

    private void a(n n2, n n3) {
        n2.d("RandomSeed", this.dTU);
        n2.R("generatorName", this.dDL.awI());
        n2.B("generatorVersion", this.dDL.awL());
        n2.R("generatorOptions", this.dTV);
        n2.B("GameType", this.dEq.awE());
        n2.o("MapFeatures", this.dEr);
        n2.B("SpawnX", this.dTW);
        n2.B("SpawnY", this.dTX);
        n2.B("SpawnZ", this.dTY);
        n2.d("Time", this.dTZ);
        n2.d("DayTime", this.worldTime);
        n2.d("SizeOnDisk", this.dTB);
        n2.d("LastPlayed", MinecraftServer.alN());
        n2.R("LevelName", this.dUb);
        n2.B("version", this.dUc);
        n2.B("clearWeatherTime", this.dUd);
        n2.B("rainTime", this.dUf);
        n2.o("raining", this.dUe);
        n2.B("thunderTime", this.dUh);
        n2.o("thundering", this.dUg);
        n2.o("hardcore", this.dTE);
        n2.o("allowCommands", this.dUi);
        n2.o("initialized", this.Mq);
        n2.b("BorderCenterX", this.dUj);
        n2.b("BorderCenterZ", this.dUk);
        n2.b("BorderSize", this.dUl);
        n2.d("BorderSizeLerpTime", this.dUm);
        n2.b("BorderSafeZone", this.dUo);
        n2.b("BorderDamagePerBlock", this.dUp);
        n2.b("BorderSizeLerpTarget", this.dUn);
        n2.b("BorderWarningBlocks", this.dUq);
        n2.b("BorderWarningTime", this.dUr);
        if (this.chN != null) {
            n2.a("Difficulty", (byte)this.chN.auZ());
        }
        n2.o("DifficultyLocked", this.difficultyLocked);
        n2.b("GameRules", this.dUs.avh());
        if (n3 != null) {
            n2.b("Player", n3);
        }
    }

    public long avD() {
        return this.dTU;
    }

    public int azn() {
        return this.dTW;
    }

    public int azo() {
        return this.dTX;
    }

    public int azp() {
        return this.dTY;
    }

    public long azq() {
        return this.dTZ;
    }

    public long getWorldTime() {
        return this.worldTime;
    }

    public long ajY() {
        return this.dTB;
    }

    public n azr() {
        return this.dUa;
    }

    public void iM(int n2) {
        this.dTW = n2;
    }

    public void iN(int n2) {
        this.dTX = n2;
    }

    public void iO(int n2) {
        this.dTY = n2;
    }

    public void P(long l2) {
        this.dTZ = l2;
    }

    public void o(long l2) {
        this.worldTime = l2;
    }

    public void bx(b b2) {
        this.dTW = b2.wt();
        this.dTX = b2.wu();
        this.dTY = b2.wx();
    }

    public String aln() {
        return this.dUb;
    }

    public void fC(String string) {
        this.dUb = string;
    }

    public int axU() {
        return this.dUc;
    }

    public void iP(int n2) {
        this.dUc = n2;
    }

    public long azs() {
        return this.dTA;
    }

    public int azL() {
        return this.dUd;
    }

    public void iS(int n2) {
        this.dUd = n2;
    }

    public boolean avJ() {
        return this.dUg;
    }

    public void cF(boolean bl2) {
        this.dUg = bl2;
    }

    public int azt() {
        return this.dUh;
    }

    public void iQ(int n2) {
        this.dUh = n2;
    }

    public boolean avK() {
        return this.dUe;
    }

    public void cG(boolean bl2) {
        this.dUe = bl2;
    }

    public int azu() {
        return this.dUf;
    }

    public void iR(int n2) {
        this.dUf = n2;
    }

    public ao If() {
        return this.dEq;
    }

    public boolean awB() {
        return this.dEr;
    }

    public void cK(boolean bl2) {
        this.dEr = bl2;
    }

    public void a(ao ao2) {
        this.dEq = ao2;
    }

    public boolean azv() {
        return this.dTE;
    }

    public void cL(boolean bl2) {
        this.dTE = bl2;
    }

    public ap awC() {
        return this.dDL;
    }

    public void a(ap ap2) {
        this.dDL = ap2;
    }

    public String azM() {
        return this.dTV;
    }

    public boolean awD() {
        return this.dUi;
    }

    public void cH(boolean bl2) {
        this.dUi = bl2;
    }

    public boolean oy() {
        return this.Mq;
    }

    public void cI(boolean bl2) {
        this.Mq = bl2;
    }

    public i azw() {
        return this.dUs;
    }

    public double azN() {
        return this.dUj;
    }

    public double azO() {
        return this.dUk;
    }

    public double azP() {
        return this.dUl;
    }

    public void aR(double d2) {
        this.dUl = d2;
    }

    public long azQ() {
        return this.dUm;
    }

    public void Q(long l2) {
        this.dUm = l2;
    }

    public double azR() {
        return this.dUn;
    }

    public void aS(double d2) {
        this.dUn = d2;
    }

    public void aT(double d2) {
        this.dUk = d2;
    }

    public void aU(double d2) {
        this.dUj = d2;
    }

    public double azS() {
        return this.dUo;
    }

    public void aV(double d2) {
        this.dUo = d2;
    }

    public double azT() {
        return this.dUp;
    }

    public void aW(double d2) {
        this.dUp = d2;
    }

    public int azU() {
        return this.dUq;
    }

    public int azV() {
        return this.dUr;
    }

    public void iT(int n2) {
        this.dUq = n2;
    }

    public void iU(int n2) {
        this.dUr = n2;
    }

    public f agm() {
        return this.chN;
    }

    public void c(f f2) {
        this.chN = f2;
    }

    public boolean isDifficultyLocked() {
        return this.difficultyLocked;
    }

    public void cJ(boolean bl2) {
        this.difficultyLocked = bl2;
    }

    public void c(net.minecraft.crash.i i2) {
        i2.a("Level seed", new p(this));
        i2.a("Level generator", new q(this));
        i2.a("Level generator options", new r(this));
        i2.a("Level spawn location", new s(this));
        i2.a("Level time", new t(this));
        i2.a("Level dimension", new u(this));
        i2.a("Level storage version", new v(this));
        i2.a("Level weather", new w(this));
        i2.a("Level game mode", new x(this));
    }
}

