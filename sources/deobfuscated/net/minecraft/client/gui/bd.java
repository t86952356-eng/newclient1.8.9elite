/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ae;
import net.minecraft.client.gui.aj;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cq;

public class bd
implements aj {
    private final Minecraft bqD = Minecraft.getMinecraft();
    private final b bqE;
    private final b bqF;
    private b bqG;

    public bd(b b2, b b3) {
        this.bqE = b2;
        this.bqF = b3;
    }

    public b Fp() {
        return this.bqE;
    }

    public b Fq() {
        return this.bqF;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        this.a(this.bqE, n4, n7, n8, false);
        this.a(this.bqF, n4, n7, n8, false);
    }

    private void a(b b2, int n2, int n3, int n4, boolean bl2) {
        if (b2 != null) {
            if (b2 instanceof c) {
                this.a((c)b2, n2, n3, n4, bl2);
            } else if (b2 instanceof cq) {
                this.a((cq)b2, n2, bl2);
            } else if (b2 instanceof ae) {
                this.a((ae)b2, n2, n3, n4, bl2);
            }
        }
    }

    private void a(c c2, int n2, int n3, int n4, boolean bl2) {
        c2.yPosition = n2;
        if (!bl2) {
            c2.drawButton(this.bqD, n3, n4);
        }
    }

    private void a(cq cq2, int n2, boolean bl2) {
        cq2.yPosition = n2;
        if (!bl2) {
            cq2.Gf();
        }
    }

    private void a(ae ae2, int n2, int n3, int n4, boolean bl2) {
        ae2.bom = n2;
        if (!bl2) {
            ae2.a(this.bqD, n3, n4);
        }
    }

    @Override
    public void o(int n2, int n3, int n4) {
        this.a(this.bqE, n4, 0, 0, true);
        this.a(this.bqF, n4, 0, 0, true);
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        boolean bl2 = this.a(this.bqE, n3, n4, n5);
        boolean bl3 = this.a(this.bqF, n3, n4, n5);
        return bl2 || bl3;
    }

    private boolean a(b b2, int n2, int n3, int n4) {
        if (b2 == null) {
            return false;
        }
        if (b2 instanceof c) {
            return this.a((c)b2, n2, n3, n4);
        }
        if (b2 instanceof cq) {
            this.a((cq)b2, n2, n3, n4);
        }
        return false;
    }

    private boolean a(c c2, int n2, int n3, int n4) {
        boolean bl2 = c2.mousePressed(this.bqD, n2, n3);
        if (bl2) {
            this.bqG = c2;
        }
        return bl2;
    }

    private void a(cq cq2, int n2, int n3, int n4) {
        cq2.mouseClicked(n2, n3, n4);
        if (cq2.Gj()) {
            this.bqG = cq2;
        }
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.b(this.bqE, n3, n4, n5);
        this.b(this.bqF, n3, n4, n5);
    }

    private void b(b b2, int n2, int n3, int n4) {
        if (b2 != null && b2 instanceof c) {
            this.b((c)b2, n2, n3, n4);
        }
    }

    private void b(c c2, int n2, int n3, int n4) {
        c2.mouseReleased(n2, n3);
    }
}

