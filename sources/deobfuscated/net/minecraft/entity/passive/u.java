/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.entity.passive;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.entity.ab;
import net.minecraft.entity.ai.aa;
import net.minecraft.entity.ai.ao;
import net.minecraft.entity.ai.au;
import net.minecraft.entity.ai.az;
import net.minecraft.entity.ai.bd;
import net.minecraft.entity.ai.be;
import net.minecraft.entity.ai.l;
import net.minecraft.entity.ai.t;
import net.minecraft.entity.ai.z;
import net.minecraft.entity.aj;
import net.minecraft.entity.h;
import net.minecraft.entity.item.i;
import net.minecraft.entity.passive.b;
import net.minecraft.entity.passive.v;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.af;
import net.minecraft.item.co;
import net.minecraft.item.crafting.a;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.pathfinding.f;
import net.minecraft.util.bt;
import net.minecraft.world.e;
import net.minecraft.world.w;

public class u
extends b {
    private final af cGV = new af(new v(this), 2, 1);
    private static final Map<net.minecraft.item.b, float[]> cGW = Maps.newEnumMap(net.minecraft.item.b.class);
    private int cGX;
    private final l cGY = new l(this);

    public static float[] a(net.minecraft.item.b b2) {
        return cGW.get(b2);
    }

    public u(w w2) {
        super(w2);
        this.o(0.9f, 1.3f);
        ((f)this.UU()).bQ(true);
        this.ctS.a(0, new au(this));
        this.ctS.a(1, new ao(this, 1.25));
        this.ctS.a(2, new aa(this, 1.0));
        this.ctS.a(3, new az(this, 1.1, Items.cPS, false));
        this.ctS.a(4, new t(this, 1.1));
        this.ctS.a(5, this.cGY);
        this.ctS.a(6, new bd(this, 1.0));
        this.ctS.a(7, new be(this, net.minecraft.entity.player.a.class, 6.0f));
        this.ctS.a(8, new z(this));
        this.cGV.g(0, new co(Items.cRa, 1, 0));
        this.cGV.g(1, new co(Items.cRa, 1, 0));
    }

    @Override
    protected void Vf() {
        this.cGX = this.cGY.WM();
        super.Vf();
    }

    @Override
    public void Dn() {
        if (this.baU.dDw) {
            this.cGX = Math.max(0, this.cGX - 1);
        }
        super.Dn();
    }

    @Override
    protected void UQ() {
        super.UQ();
        this.a(aj.cwm).ap(8.0);
        this.a(aj.cwp).ap(0.23f);
    }

    @Override
    protected void IA() {
        super.IA();
        this.csD.a(16, new Byte(0));
    }

    @Override
    protected void a(boolean bl2, int n2) {
        if (!this.abj()) {
            this.a(new co(d.I(Blocks.cLN), 1, this.abi().yc()), 0.0f);
        }
        int n3 = this.ta.nextInt(2) + 1 + this.ta.nextInt(1 + n2);
        for (int i2 = 0; i2 < n3; ++i2) {
            if (this.isBurning()) {
                this.d(Items.cRr, 1);
                continue;
            }
            this.d(Items.cRq, 1);
        }
    }

    @Override
    protected d Vc() {
        return d.I(Blocks.cLN);
    }

    @Override
    public void a(byte by2) {
        if (by2 == 10) {
            this.cGX = 40;
        } else {
            super.a(by2);
        }
    }

    public float bo(float f2) {
        return this.cGX <= 0 ? 0.0f : (this.cGX >= 4 && this.cGX <= 36 ? 1.0f : (this.cGX < 4 ? ((float)this.cGX - f2) / 4.0f : -((float)(this.cGX - 40) - f2) / 4.0f));
    }

    public float bp(float f2) {
        if (this.cGX > 4 && this.cGX <= 36) {
            float f3 = ((float)(this.cGX - 4) - f2) / 32.0f;
            return 0.62831855f + 0.2199115f * bt.bx(f3 * 28.7f);
        }
        return this.cGX > 0 ? 0.62831855f : this.pm / 57.295776f;
    }

    @Override
    public boolean q(net.minecraft.entity.player.a a2) {
        co co2 = a2.cHV.acE();
        if (co2 != null && co2.bP() == Items.cRi && !this.abj() && !this.Uz()) {
            if (!this.baU.dDw) {
                this.bB(true);
                int n2 = 1 + this.ta.nextInt(3);
                for (int i2 = 0; i2 < n2; ++i2) {
                    i i3 = this.a(new co(d.I(Blocks.cLN), 1, this.abi().yc()), 1.0f);
                    i3.ue += (double)(this.ta.nextFloat() * 0.05f);
                    i3.ud += (double)((this.ta.nextFloat() - this.ta.nextFloat()) * 0.1f);
                    i3.uf += (double)((this.ta.nextFloat() - this.ta.nextFloat()) * 0.1f);
                }
            }
            co2.b(1, (r)a2);
            this.a("mob.sheep.shear", 1.0f, 1.0f);
        }
        return super.q(a2);
    }

    @Override
    public void d(n n2) {
        super.d(n2);
        n2.o("Sheared", this.abj());
        n2.a("Color", (byte)this.abi().yc());
    }

    @Override
    public void e(n n2) {
        super.e(n2);
        this.bB(n2.eO("Sheared"));
        this.b(net.minecraft.item.b.fS(n2.eE("Color")));
    }

    @Override
    protected String Vb() {
        return "mob.sheep.say";
    }

    @Override
    protected String VN() {
        return "mob.sheep.say";
    }

    @Override
    protected String VO() {
        return "mob.sheep.say";
    }

    @Override
    protected void a(net.minecraft.util.b b2, Block block) {
        this.a("mob.sheep.step", 0.15f, 1.0f);
    }

    public net.minecraft.item.b abi() {
        return net.minecraft.item.b.fS(this.csD.el(16) & 0xF);
    }

    public void b(net.minecraft.item.b b2) {
        byte by2 = this.csD.el(16);
        this.csD.b(16, (byte)(by2 & 0xF0 | b2.yc() & 0xF));
    }

    public boolean abj() {
        return (this.csD.el(16) & 0x10) != 0;
    }

    public void bB(boolean bl2) {
        byte by2 = this.csD.el(16);
        if (bl2) {
            this.csD.b(16, (byte)(by2 | 0x10));
        } else {
            this.csD.b(16, (byte)(by2 & 0xFFFFFFEF));
        }
    }

    public static net.minecraft.item.b d(Random random) {
        int n2 = random.nextInt(100);
        return n2 < 5 ? net.minecraft.item.b.cUR : (n2 < 10 ? net.minecraft.item.b.cUJ : (n2 < 15 ? net.minecraft.item.b.cUK : (n2 < 18 ? net.minecraft.item.b.cUO : (random.nextInt(500) == 0 ? net.minecraft.item.b.cUI : net.minecraft.item.b.cUC))));
    }

    public u h(h h2) {
        u u2 = (u)h2;
        u u3 = new u(this.baU);
        u3.b(this.a(this, u2));
        return u3;
    }

    @Override
    public void UX() {
        this.bB(false);
        if (this.Uz()) {
            this.eB(60);
        }
    }

    @Override
    public ab a(e e2, ab ab2) {
        ab2 = super.a(e2, ab2);
        this.b(u.d(this.baU.dDk));
        return ab2;
    }

    private net.minecraft.item.b a(b b2, b b3) {
        int n2 = ((u)b2).abi().ado();
        int n3 = ((u)b3).abi().ado();
        this.cGV.fi(0).gf(n2);
        this.cGV.fi(1).gf(n3);
        co co2 = a.aey().a(this.cGV, b2.baU);
        int n4 = co2 != null && co2.bP() == Items.cRa ? co2.yc() : (this.baU.dDk.nextBoolean() ? n2 : n3);
        return net.minecraft.item.b.fR(n4);
    }

    @Override
    public float getEyeHeight() {
        return 0.95f * this.height;
    }

    @Override
    public /* synthetic */ h a(h h2) {
        return this.h(h2);
    }

    static {
        cGW.put(net.minecraft.item.b.cUC, new float[]{1.0f, 1.0f, 1.0f});
        cGW.put(net.minecraft.item.b.cUD, new float[]{0.85f, 0.5f, 0.2f});
        cGW.put(net.minecraft.item.b.cUE, new float[]{0.7f, 0.3f, 0.85f});
        cGW.put(net.minecraft.item.b.cUF, new float[]{0.4f, 0.6f, 0.85f});
        cGW.put(net.minecraft.item.b.cUG, new float[]{0.9f, 0.9f, 0.2f});
        cGW.put(net.minecraft.item.b.cUH, new float[]{0.5f, 0.8f, 0.1f});
        cGW.put(net.minecraft.item.b.cUI, new float[]{0.95f, 0.5f, 0.65f});
        cGW.put(net.minecraft.item.b.cUJ, new float[]{0.3f, 0.3f, 0.3f});
        cGW.put(net.minecraft.item.b.cUK, new float[]{0.6f, 0.6f, 0.6f});
        cGW.put(net.minecraft.item.b.cUL, new float[]{0.3f, 0.5f, 0.6f});
        cGW.put(net.minecraft.item.b.cUM, new float[]{0.5f, 0.25f, 0.7f});
        cGW.put(net.minecraft.item.b.cUN, new float[]{0.2f, 0.3f, 0.7f});
        cGW.put(net.minecraft.item.b.cUO, new float[]{0.4f, 0.3f, 0.2f});
        cGW.put(net.minecraft.item.b.cUP, new float[]{0.4f, 0.5f, 0.2f});
        cGW.put(net.minecraft.item.b.cUQ, new float[]{0.6f, 0.2f, 0.2f});
        cGW.put(net.minecraft.item.b.cUR, new float[]{0.1f, 0.1f, 0.1f});
    }
}

