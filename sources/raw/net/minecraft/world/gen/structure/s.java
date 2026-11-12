/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import net.minecraft.nbt.n;
import net.minecraft.world.ah;

public class s
extends ah {
    private n dfN = new n();

    public s(String string) {
        super(string);
    }

    @Override
    public void a(n n2) {
        this.dfN = n2.eN("Features");
    }

    @Override
    public void b(n n2) {
        n2.b("Features", this.dfN);
    }

    public void a(n n2, int n3, int n4) {
        this.dfN.b(s.bm(n3, n4), n2);
    }

    public static String bm(int n2, int n3) {
        return "[" + n2 + "," + n3 + "]";
    }

    public n aek() {
        return this.dfN;
    }
}

