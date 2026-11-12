/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.tileentity;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.BlockJukebox$TileEntityJukebox;
import net.minecraft.block.state.IBlockState;
import net.minecraft.crash.i;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.ab;
import net.minecraft.tileentity.ad;
import net.minecraft.tileentity.ae;
import net.minecraft.tileentity.ag;
import net.minecraft.tileentity.aj;
import net.minecraft.tileentity.e;
import net.minecraft.tileentity.f;
import net.minecraft.tileentity.g;
import net.minecraft.tileentity.h;
import net.minecraft.tileentity.j;
import net.minecraft.tileentity.l;
import net.minecraft.tileentity.m;
import net.minecraft.tileentity.o;
import net.minecraft.tileentity.q;
import net.minecraft.tileentity.r;
import net.minecraft.tileentity.s;
import net.minecraft.tileentity.t;
import net.minecraft.tileentity.u;
import net.minecraft.tileentity.v;
import net.minecraft.tileentity.w;
import net.minecraft.tileentity.x;
import net.minecraft.tileentity.y;
import net.minecraft.tileentity.z;
import net.minecraft.util.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class d {
    private static final Logger drb = LogManager.getLogger();
    private static final Map<String, Class<? extends d>> drc = Maps.newHashMap();
    private static final Map<Class<? extends d>, String> drd = Maps.newHashMap();
    protected net.minecraft.world.w baU;
    protected b aZf = b.dtN;
    protected boolean dre;
    private int drf = -1;
    protected Block aUy;

    private static void a(Class<? extends d> clazz, String string) {
        if (drc.containsKey(string)) {
            throw new IllegalArgumentException("Duplicate id: " + string);
        }
        drc.put(string, clazz);
        drd.put(clazz, string);
    }

    public net.minecraft.world.w de() {
        return this.baU;
    }

    public void n(net.minecraft.world.w w2) {
        this.baU = w2;
    }

    public boolean apO() {
        return this.baU != null;
    }

    public void a(n n2) {
        this.aZf = new b(n2.eG("x"), n2.eG("y"), n2.eG("z"));
    }

    public void b(n n2) {
        String string = drd.get(this.getClass());
        if (string == null) {
            throw new RuntimeException(String.valueOf(this.getClass()) + " is missing a mapping! This is a bug!");
        }
        n2.R("id", string);
        n2.B("x", this.aZf.wt());
        n2.B("y", this.aZf.wu());
        n2.B("z", this.aZf.wx());
    }

    public static d D(n n2) {
        d d2 = null;
        try {
            Class<? extends d> clazz = drc.get(n2.eK("id"));
            if (clazz != null) {
                d2 = clazz.newInstance();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (d2 != null) {
            d2.a(n2);
        } else {
            drb.warn("Skipping BlockEntity with id " + n2.eK("id"));
        }
        return d2;
    }

    public int zg() {
        if (this.drf == -1) {
            IBlockState iBlockState = this.baU.L(this.aZf);
            this.drf = iBlockState.df().c(iBlockState);
        }
        return this.drf;
    }

    public void Lw() {
        if (this.baU != null) {
            IBlockState iBlockState = this.baU.L(this.aZf);
            this.drf = iBlockState.df().c(iBlockState);
            this.baU.b(this.aZf, this);
            if (this.ahl() != Blocks.cLc) {
                this.baU.f(this.aZf, this.ahl());
            }
        }
    }

    public double M(double d2, double d3, double d4) {
        double d5 = (double)this.aZf.wt() + 0.5 - d2;
        double d6 = (double)this.aZf.wu() + 0.5 - d3;
        double d7 = (double)this.aZf.wx() + 0.5 - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double apP() {
        return 2048.0;
    }

    public b Ab() {
        return this.aZf;
    }

    public Block ahl() {
        if (this.aUy == null) {
            this.aUy = this.baU.L(this.aZf).df();
        }
        return this.aUy;
    }

    public net.minecraft.network.aj apQ() {
        return null;
    }

    public boolean apR() {
        return this.dre;
    }

    public void apS() {
        this.dre = true;
    }

    public void apT() {
        this.dre = false;
    }

    public boolean aC(int n2, int n3) {
        return false;
    }

    public void apU() {
        this.aUy = null;
        this.drf = -1;
    }

    public void b(i i2) {
        i2.a("Name", new e(this));
        if (this.baU != null) {
            i.a(i2, this.aZf, this.ahl(), this.zg());
            i2.a("Actual block type", new f(this));
            i2.a("Actual block data value", new g(this));
        }
    }

    public void ap(b b2) {
        this.aZf = b2;
    }

    public boolean apV() {
        return false;
    }

    static {
        d.a(y.class, "Furnace");
        d.a(m.class, "Chest");
        d.a(w.class, "EnderChest");
        d.a(BlockJukebox$TileEntityJukebox.class, "RecordPlayer");
        d.a(s.class, "Trap");
        d.a(t.class, "Dropper");
        d.a(ag.class, "Sign");
        d.a(ab.class, "MobSpawner");
        d.a(ad.class, "Music");
        d.a(ae.class, "Piston");
        d.a(l.class, "Cauldron");
        d.a(u.class, "EnchantTable");
        d.a(v.class, "Airportal");
        d.a(o.class, "Control");
        d.a(j.class, "Beacon");
        d.a(aj.class, "Skull");
        d.a(r.class, "DLDetector");
        d.a(z.class, "Hopper");
        d.a(q.class, "Comparator");
        d.a(x.class, "FlowerPot");
        d.a(h.class, "Banner");
    }
}

