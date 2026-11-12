/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.multiplayer;

import net.minecraft.client.multiplayer.g;
import net.minecraft.nbt.n;

public class f {
    public String fc;
    public String bDH;
    public String bDI;
    public String bDJ;
    public long bDK;
    public int bDL = 47;
    public String bDM = "1.8.9";
    public boolean bDN;
    public String bDO;
    private g bDP = g.bDU;
    private String bDQ;
    private boolean bDR;

    public f(String string, String string2, boolean bl2) {
        this.fc = string;
        this.bDH = string2;
        this.bDR = bl2;
    }

    public n HD() {
        n n2 = new n();
        n2.R("name", this.fc);
        n2.R("ip", this.bDH);
        if (this.bDQ != null) {
            n2.R("icon", this.bDQ);
        }
        if (this.bDP == g.bDS) {
            n2.o("acceptTextures", true);
        } else if (this.bDP == g.bDT) {
            n2.o("acceptTextures", false);
        }
        return n2;
    }

    public g HE() {
        return this.bDP;
    }

    public void a(g g2) {
        this.bDP = g2;
    }

    public static f c(n n2) {
        f f2 = new f(n2.eK("name"), n2.eK("ip"), false);
        if (n2.C("icon", 8)) {
            f2.dc(n2.eK("icon"));
        }
        if (n2.C("acceptTextures", 1)) {
            if (n2.eO("acceptTextures")) {
                f2.a(g.bDS);
            } else {
                f2.a(g.bDT);
            }
        } else {
            f2.a(g.bDU);
        }
        return f2;
    }

    public String HF() {
        return this.bDQ;
    }

    public void dc(String string) {
        this.bDQ = string;
    }

    public boolean HG() {
        return this.bDR;
    }

    public void d(f f2) {
        this.bDH = f2.bDH;
        this.fc = f2.fc;
        this.a(f2.HE());
        this.bDQ = f2.bDQ;
        this.bDR = f2.bDR;
    }
}

