/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package net.minecraft.world.gen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.world.gen.g;
import net.minecraft.world.gen.i;

public class h {
    static final Gson dNn = new GsonBuilder().registerTypeAdapter(h.class, (Object)new i()).create();
    public float dLN = 684.412f;
    public float dLO = 684.412f;
    public float dLP = 512.0f;
    public float dLQ = 512.0f;
    public float dLR = 200.0f;
    public float dLS = 200.0f;
    public float dLT = 0.5f;
    public float dLU = 80.0f;
    public float dLV = 160.0f;
    public float dLW = 80.0f;
    public float dLX = 8.5f;
    public float dLY = 12.0f;
    public float dLZ = 1.0f;
    public float dNo = 0.0f;
    public float dMb = 1.0f;
    public float dMc = 0.0f;
    public int dMd = 63;
    public boolean dMe = true;
    public boolean dMf = true;
    public int dMg = 8;
    public boolean dMh = true;
    public boolean dMi = true;
    public boolean dMj = true;
    public boolean dMk = true;
    public boolean dMl = true;
    public boolean dMm = true;
    public boolean dMn = true;
    public int dMo = 4;
    public boolean dMp = true;
    public int dMq = 80;
    public boolean dMr = false;
    public int dMs = -1;
    public int dMt = 4;
    public int dMu = 4;
    public int dMv = 33;
    public int dMw = 10;
    public int dMx = 0;
    public int dMy = 256;
    public int dMz = 33;
    public int dMA = 8;
    public int dMB = 0;
    public int dMC = 256;
    public int dMD = 33;
    public int dME = 10;
    public int dMF = 0;
    public int dMG = 80;
    public int dMH = 33;
    public int dMI = 10;
    public int dMJ = 0;
    public int dMK = 80;
    public int dML = 33;
    public int dMM = 10;
    public int dMN = 0;
    public int dMO = 80;
    public int dMP = 17;
    public int dMQ = 20;
    public int dMR = 0;
    public int dMS = 128;
    public int dMT = 9;
    public int dMU = 20;
    public int dMV = 0;
    public int dMW = 64;
    public int dMX = 9;
    public int dMY = 2;
    public int dMZ = 0;
    public int dNa = 32;
    public int dNb = 8;
    public int dNc = 8;
    public int dNd = 0;
    public int dNe = 16;
    public int dNf = 8;
    public int dNg = 1;
    public int dNh = 0;
    public int dNi = 16;
    public int dNj = 7;
    public int dNk = 1;
    public int dNl = 16;
    public int dNm = 16;

    public static h gI(String string) {
        if (string.length() == 0) {
            return new h();
        }
        try {
            return (h)dNn.fromJson(string, h.class);
        }
        catch (Exception exception) {
            return new h();
        }
    }

    public String toString() {
        return dNn.toJson((Object)this);
    }

    public h() {
        this.ayh();
    }

    public void ayh() {
        this.dLN = 684.412f;
        this.dLO = 684.412f;
        this.dLP = 512.0f;
        this.dLQ = 512.0f;
        this.dLR = 200.0f;
        this.dLS = 200.0f;
        this.dLT = 0.5f;
        this.dLU = 80.0f;
        this.dLV = 160.0f;
        this.dLW = 80.0f;
        this.dLX = 8.5f;
        this.dLY = 12.0f;
        this.dLZ = 1.0f;
        this.dNo = 0.0f;
        this.dMb = 1.0f;
        this.dMc = 0.0f;
        this.dMd = 63;
        this.dMe = true;
        this.dMf = true;
        this.dMg = 8;
        this.dMh = true;
        this.dMi = true;
        this.dMj = true;
        this.dMk = true;
        this.dMl = true;
        this.dMm = true;
        this.dMn = true;
        this.dMo = 4;
        this.dMp = true;
        this.dMq = 80;
        this.dMr = false;
        this.dMs = -1;
        this.dMt = 4;
        this.dMu = 4;
        this.dMv = 33;
        this.dMw = 10;
        this.dMx = 0;
        this.dMy = 256;
        this.dMz = 33;
        this.dMA = 8;
        this.dMB = 0;
        this.dMC = 256;
        this.dMD = 33;
        this.dME = 10;
        this.dMF = 0;
        this.dMG = 80;
        this.dMH = 33;
        this.dMI = 10;
        this.dMJ = 0;
        this.dMK = 80;
        this.dML = 33;
        this.dMM = 10;
        this.dMN = 0;
        this.dMO = 80;
        this.dMP = 17;
        this.dMQ = 20;
        this.dMR = 0;
        this.dMS = 128;
        this.dMT = 9;
        this.dMU = 20;
        this.dMV = 0;
        this.dMW = 64;
        this.dMX = 9;
        this.dMY = 2;
        this.dMZ = 0;
        this.dNa = 32;
        this.dNb = 8;
        this.dNc = 8;
        this.dNd = 0;
        this.dNe = 16;
        this.dNf = 8;
        this.dNg = 1;
        this.dNh = 0;
        this.dNi = 16;
        this.dNj = 7;
        this.dNk = 1;
        this.dNl = 16;
        this.dNm = 16;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            h h2 = (h)object;
            return this.dMM == h2.dMM && this.dMO == h2.dMO && this.dMN == h2.dMN && this.dML == h2.dML && Float.compare(h2.dLX, this.dLX) == 0 && Float.compare(h2.dNo, this.dNo) == 0 && Float.compare(h2.dLZ, this.dLZ) == 0 && Float.compare(h2.dMc, this.dMc) == 0 && Float.compare(h2.dMb, this.dMb) == 0 && this.dMt == h2.dMt && this.dMQ == h2.dMQ && this.dMS == h2.dMS && this.dMR == h2.dMR && this.dMP == h2.dMP && Float.compare(h2.dLN, this.dLN) == 0 && Float.compare(h2.dLT, this.dLT) == 0 && Float.compare(h2.dLR, this.dLR) == 0 && Float.compare(h2.dLS, this.dLS) == 0 && this.dNg == h2.dNg && this.dNi == h2.dNi && this.dNh == h2.dNh && this.dNf == h2.dNf && this.dMI == h2.dMI && this.dMK == h2.dMK && this.dMJ == h2.dMJ && this.dMH == h2.dMH && this.dMw == h2.dMw && this.dMy == h2.dMy && this.dMx == h2.dMx && this.dMv == h2.dMv && this.dMg == h2.dMg && this.dMs == h2.dMs && this.dMY == h2.dMY && this.dNa == h2.dNa && this.dMZ == h2.dMZ && this.dMX == h2.dMX && this.dME == h2.dME && this.dMG == h2.dMG && this.dMF == h2.dMF && this.dMD == h2.dMD && this.dMA == h2.dMA && this.dMC == h2.dMC && this.dMB == h2.dMB && this.dMz == h2.dMz && Float.compare(h2.dLO, this.dLO) == 0 && this.dMU == h2.dMU && this.dMW == h2.dMW && this.dMV == h2.dMV && this.dMT == h2.dMT && this.dNl == h2.dNl && this.dNk == h2.dNk && this.dNj == h2.dNj && this.dNm == h2.dNm && this.dMq == h2.dMq && Float.compare(h2.dLQ, this.dLQ) == 0 && Float.compare(h2.dLU, this.dLU) == 0 && Float.compare(h2.dLV, this.dLV) == 0 && Float.compare(h2.dLW, this.dLW) == 0 && this.dNc == h2.dNc && this.dNe == h2.dNe && this.dNd == h2.dNd && this.dNb == h2.dNb && this.dMu == h2.dMu && this.dMd == h2.dMd && Float.compare(h2.dLY, this.dLY) == 0 && Float.compare(h2.dLP, this.dLP) == 0 && this.dMe == h2.dMe && this.dMf == h2.dMf && this.dMp == h2.dMp && this.dMr == h2.dMr && this.dMj == h2.dMj && this.dMm == h2.dMm && this.dMh == h2.dMh && this.dMk == h2.dMk && this.dMl == h2.dMl && this.dMi == h2.dMi && this.dMn == h2.dMn && this.dMo == h2.dMo;
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.dLN != 0.0f ? Float.floatToIntBits(this.dLN) : 0;
        n2 = 31 * n2 + (this.dLO != 0.0f ? Float.floatToIntBits(this.dLO) : 0);
        n2 = 31 * n2 + (this.dLP != 0.0f ? Float.floatToIntBits(this.dLP) : 0);
        n2 = 31 * n2 + (this.dLQ != 0.0f ? Float.floatToIntBits(this.dLQ) : 0);
        n2 = 31 * n2 + (this.dLR != 0.0f ? Float.floatToIntBits(this.dLR) : 0);
        n2 = 31 * n2 + (this.dLS != 0.0f ? Float.floatToIntBits(this.dLS) : 0);
        n2 = 31 * n2 + (this.dLT != 0.0f ? Float.floatToIntBits(this.dLT) : 0);
        n2 = 31 * n2 + (this.dLU != 0.0f ? Float.floatToIntBits(this.dLU) : 0);
        n2 = 31 * n2 + (this.dLV != 0.0f ? Float.floatToIntBits(this.dLV) : 0);
        n2 = 31 * n2 + (this.dLW != 0.0f ? Float.floatToIntBits(this.dLW) : 0);
        n2 = 31 * n2 + (this.dLX != 0.0f ? Float.floatToIntBits(this.dLX) : 0);
        n2 = 31 * n2 + (this.dLY != 0.0f ? Float.floatToIntBits(this.dLY) : 0);
        n2 = 31 * n2 + (this.dLZ != 0.0f ? Float.floatToIntBits(this.dLZ) : 0);
        n2 = 31 * n2 + (this.dNo != 0.0f ? Float.floatToIntBits(this.dNo) : 0);
        n2 = 31 * n2 + (this.dMb != 0.0f ? Float.floatToIntBits(this.dMb) : 0);
        n2 = 31 * n2 + (this.dMc != 0.0f ? Float.floatToIntBits(this.dMc) : 0);
        n2 = 31 * n2 + this.dMd;
        n2 = 31 * n2 + (this.dMe ? 1 : 0);
        n2 = 31 * n2 + (this.dMf ? 1 : 0);
        n2 = 31 * n2 + this.dMg;
        n2 = 31 * n2 + (this.dMh ? 1 : 0);
        n2 = 31 * n2 + (this.dMi ? 1 : 0);
        n2 = 31 * n2 + (this.dMj ? 1 : 0);
        n2 = 31 * n2 + (this.dMk ? 1 : 0);
        n2 = 31 * n2 + (this.dMl ? 1 : 0);
        n2 = 31 * n2 + (this.dMm ? 1 : 0);
        n2 = 31 * n2 + (this.dMn ? 1 : 0);
        n2 = 31 * n2 + this.dMo;
        n2 = 31 * n2 + (this.dMp ? 1 : 0);
        n2 = 31 * n2 + this.dMq;
        n2 = 31 * n2 + (this.dMr ? 1 : 0);
        n2 = 31 * n2 + this.dMs;
        n2 = 31 * n2 + this.dMt;
        n2 = 31 * n2 + this.dMu;
        n2 = 31 * n2 + this.dMv;
        n2 = 31 * n2 + this.dMw;
        n2 = 31 * n2 + this.dMx;
        n2 = 31 * n2 + this.dMy;
        n2 = 31 * n2 + this.dMz;
        n2 = 31 * n2 + this.dMA;
        n2 = 31 * n2 + this.dMB;
        n2 = 31 * n2 + this.dMC;
        n2 = 31 * n2 + this.dMD;
        n2 = 31 * n2 + this.dME;
        n2 = 31 * n2 + this.dMF;
        n2 = 31 * n2 + this.dMG;
        n2 = 31 * n2 + this.dMH;
        n2 = 31 * n2 + this.dMI;
        n2 = 31 * n2 + this.dMJ;
        n2 = 31 * n2 + this.dMK;
        n2 = 31 * n2 + this.dML;
        n2 = 31 * n2 + this.dMM;
        n2 = 31 * n2 + this.dMN;
        n2 = 31 * n2 + this.dMO;
        n2 = 31 * n2 + this.dMP;
        n2 = 31 * n2 + this.dMQ;
        n2 = 31 * n2 + this.dMR;
        n2 = 31 * n2 + this.dMS;
        n2 = 31 * n2 + this.dMT;
        n2 = 31 * n2 + this.dMU;
        n2 = 31 * n2 + this.dMV;
        n2 = 31 * n2 + this.dMW;
        n2 = 31 * n2 + this.dMX;
        n2 = 31 * n2 + this.dMY;
        n2 = 31 * n2 + this.dMZ;
        n2 = 31 * n2 + this.dNa;
        n2 = 31 * n2 + this.dNb;
        n2 = 31 * n2 + this.dNc;
        n2 = 31 * n2 + this.dNd;
        n2 = 31 * n2 + this.dNe;
        n2 = 31 * n2 + this.dNf;
        n2 = 31 * n2 + this.dNg;
        n2 = 31 * n2 + this.dNh;
        n2 = 31 * n2 + this.dNi;
        n2 = 31 * n2 + this.dNj;
        n2 = 31 * n2 + this.dNk;
        n2 = 31 * n2 + this.dNl;
        n2 = 31 * n2 + this.dNm;
        return n2;
    }

    public g ayi() {
        return new g(this);
    }
}

