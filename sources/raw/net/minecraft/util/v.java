/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.event.a;
import net.minecraft.event.c;
import net.minecraft.util.an;
import net.minecraft.util.w;

public class v {
    private v duu;
    private an duv;
    private Boolean duw;
    private Boolean dux;
    private Boolean duy;
    private Boolean duz;
    private Boolean duA;
    private a duB;
    private c duC;
    private String duD;
    private static final v duE = new w();

    public an arv() {
        return this.duv == null ? this.arF().arv() : this.duv;
    }

    public boolean arw() {
        return this.duw == null ? this.arF().arw() : this.duw.booleanValue();
    }

    public boolean arx() {
        return this.dux == null ? this.arF().arx() : this.dux.booleanValue();
    }

    public boolean ary() {
        return this.duz == null ? this.arF().ary() : this.duz.booleanValue();
    }

    public boolean arz() {
        return this.duy == null ? this.arF().arz() : this.duy.booleanValue();
    }

    public boolean arA() {
        return this.duA == null ? this.arF().arA() : this.duA.booleanValue();
    }

    public boolean isEmpty() {
        return this.duw == null && this.dux == null && this.duz == null && this.duy == null && this.duA == null && this.duv == null && this.duB == null && this.duC == null;
    }

    public a arB() {
        return this.duB == null ? this.arF().arB() : this.duB;
    }

    public c arC() {
        return this.duC == null ? this.arF().arC() : this.duC;
    }

    public String arD() {
        return this.duD == null ? this.arF().arD() : this.duD;
    }

    public v b(an an2) {
        this.duv = an2;
        return this;
    }

    public v f(Boolean bl2) {
        this.duw = bl2;
        return this;
    }

    public v g(Boolean bl2) {
        this.dux = bl2;
        return this;
    }

    public v h(Boolean bl2) {
        this.duz = bl2;
        return this;
    }

    public v i(Boolean bl2) {
        this.duy = bl2;
        return this;
    }

    public v j(Boolean bl2) {
        this.duA = bl2;
        return this;
    }

    public v a(a a2) {
        this.duB = a2;
        return this;
    }

    public v a(c c2) {
        this.duC = c2;
        return this;
    }

    public v gc(String string) {
        this.duD = string;
        return this;
    }

    public v b(v v2) {
        this.duu = v2;
        return this;
    }

    public String arE() {
        if (this.isEmpty()) {
            return this.duu != null ? this.duu.arE() : "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.arv() != null) {
            stringBuilder.append((Object)this.arv());
        }
        if (this.arw()) {
            stringBuilder.append((Object)an.dwd);
        }
        if (this.arx()) {
            stringBuilder.append((Object)an.dwg);
        }
        if (this.arz()) {
            stringBuilder.append((Object)an.dwf);
        }
        if (this.arA()) {
            stringBuilder.append((Object)an.dwc);
        }
        if (this.ary()) {
            stringBuilder.append((Object)an.dwe);
        }
        return stringBuilder.toString();
    }

    private v arF() {
        return this.duu == null ? duE : this.duu;
    }

    public String toString() {
        return "Style{hasParent=" + (this.duu != null) + ", color=" + String.valueOf((Object)this.duv) + ", bold=" + this.duw + ", italic=" + this.dux + ", underlined=" + this.duy + ", obfuscated=" + this.duA + ", clickEvent=" + String.valueOf(this.arB()) + ", hoverEvent=" + String.valueOf(this.arC()) + ", insertion=" + this.arD() + "}";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof v)) {
            return false;
        }
        v v2 = (v)object;
        if (this.arw() != v2.arw() || this.arv() != v2.arv() || this.arx() != v2.arx() || this.arA() != v2.arA() || this.ary() != v2.ary() || this.arz() != v2.arz() || (this.arB() == null ? v2.arB() != null : !this.arB().equals(v2.arB())) || (this.arC() == null ? v2.arC() != null : !this.arC().equals(v2.arC())) || !(this.arD() != null ? this.arD().equals(v2.arD()) : v2.arD() == null)) {
            boolean bl2 = false;
            return bl2;
        }
        boolean bl3 = true;
        return bl3;
    }

    public int hashCode() {
        int n2 = this.duv.hashCode();
        n2 = 31 * n2 + this.duw.hashCode();
        n2 = 31 * n2 + this.dux.hashCode();
        n2 = 31 * n2 + this.duy.hashCode();
        n2 = 31 * n2 + this.duz.hashCode();
        n2 = 31 * n2 + this.duA.hashCode();
        n2 = 31 * n2 + this.duB.hashCode();
        n2 = 31 * n2 + this.duC.hashCode();
        n2 = 31 * n2 + this.duD.hashCode();
        return n2;
    }

    public v arG() {
        v v2 = new v();
        v2.duw = this.duw;
        v2.dux = this.dux;
        v2.duz = this.duz;
        v2.duy = this.duy;
        v2.duA = this.duA;
        v2.duv = this.duv;
        v2.duB = this.duB;
        v2.duC = this.duC;
        v2.duu = this.duu;
        v2.duD = this.duD;
        return v2;
    }

    public v arH() {
        v v2 = new v();
        v2.f(this.arw());
        v2.g(this.arx());
        v2.h(this.ary());
        v2.i(this.arz());
        v2.j(this.arA());
        v2.b(this.arv());
        v2.a(this.arB());
        v2.a(this.arC());
        v2.gc(this.arD());
        return v2;
    }
}

