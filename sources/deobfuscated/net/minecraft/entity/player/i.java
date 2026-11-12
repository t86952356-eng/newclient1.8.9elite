/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.player;

import net.minecraft.nbt.n;

public class i {
    public boolean cJJ;
    public boolean cJK;
    public boolean cJL;
    public boolean cJM;
    public boolean cJN = true;
    private float flySpeed = 0.05f;
    private float walkSpeed = 0.1f;

    public void o(n n2) {
        n n3 = new n();
        n3.o("invulnerable", this.cJJ);
        n3.o("flying", this.cJK);
        n3.o("mayfly", this.cJL);
        n3.o("instabuild", this.cJM);
        n3.o("mayBuild", this.cJN);
        n3.a("flySpeed", this.flySpeed);
        n3.a("walkSpeed", this.walkSpeed);
        n2.b("abilities", n3);
    }

    public void p(n n2) {
        if (n2.C("abilities", 10)) {
            n n3 = n2.eN("abilities");
            this.cJJ = n3.eO("invulnerable");
            this.cJK = n3.eO("flying");
            this.cJL = n3.eO("mayfly");
            this.cJM = n3.eO("instabuild");
            if (n3.C("flySpeed", 99)) {
                this.flySpeed = n3.eI("flySpeed");
                this.walkSpeed = n3.eI("walkSpeed");
            }
            if (n3.C("mayBuild", 1)) {
                this.cJN = n3.eO("mayBuild");
            }
        }
    }

    public float getFlySpeed() {
        return this.flySpeed;
    }

    public void bt(float f2) {
        this.flySpeed = f2;
    }

    public float getWalkSpeed() {
        return this.walkSpeed;
    }

    public void bu(float f2) {
        this.walkSpeed = f2;
    }
}

