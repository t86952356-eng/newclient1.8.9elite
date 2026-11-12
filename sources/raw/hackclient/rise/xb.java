/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.akq;
import hackclient.rise.dh;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.es;
import hackclient.rise.fi;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import lombok.Generated;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.m;
import net.minecraft.network.play.client.n;

@gl(aliases={"module.render.freecam.name"}, description="module.render.freecam.description", category=gj.RENDER)
public final class xb
extends gi {
    private final akq aob = new akq("Speed", this, (Number)1, (Number)0.1, (Number)9.5, (Number)0.1);
    private akd Ft;
    private akd aoc;
    private akb ka;
    private boolean bh;
    @dm
    public final dk<es> aod = dh::cF;
    @dm
    public final dk<fi> aoe = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof m || aj2 instanceof e || aj2 instanceof c || aj2 instanceof n || aj2 instanceof k || aj2 instanceof i || aj2 instanceof i) {
            fi2.cF();
        }
    };
    @dm
    public final dk<eo> aof = eo2 -> {
        float f2 = ((Number)this.aob.wD()).floatValue();
        eo2.setSpeed(f2);
    };
    @dm
    public final dk<ei> aog = ei2 -> {
        float f2 = ((Number)this.aob.wD()).floatValue();
        xb.aER.bgK.ue = 0.0 + (xb.aER.aIY.chq.Re() ? (double)f2 : 0.0) - (xb.aER.aIY.chr.Re() ? (double)f2 : 0.0);
    };
    @dm
    public final dk<dz> aoh = dz2 -> dz2.setSneak(false);

    @Override
    public void onEnable() {
        this.Ft = new akd(xb.aER.bgK.gW, xb.aER.bgK.gX, xb.aER.bgK.gY);
        this.aoc = new akd(xb.aER.bgK.ud, xb.aER.bgK.ue, xb.aER.bgK.uf);
        this.ka = new akb(xb.aER.bgK.pl, xb.aER.bgK.pm);
        this.bh = xb.aER.aIY.chs.Re();
    }

    @Override
    public void onDisable() {
        xb.aER.bgK.setPosition(this.Ft.getX(), this.Ft.getY(), this.Ft.getZ());
        xb.aER.bgK.pl = this.ka.getX();
        xb.aER.bgK.pm = this.ka.getY();
        xb.aER.bgK.ud = this.aoc.getX();
        xb.aER.bgK.ue = this.aoc.getY();
        xb.aER.bgK.uf = this.aoc.getZ();
        xb.aER.aIY.chs.ay(this.bh);
    }

    @Generated
    public akq jV() {
        return this.aob;
    }

    @Generated
    public akd lF() {
        return this.Ft;
    }

    @Generated
    public akd lG() {
        return this.aoc;
    }

    @Generated
    public akb dy() {
        return this.ka;
    }

    @Generated
    public boolean isSprinting() {
        return this.bh;
    }

    @Generated
    public dk<es> lH() {
        return this.aod;
    }

    @Generated
    public dk<fi> lI() {
        return this.aoe;
    }

    @Generated
    public dk<eo> lJ() {
        return this.aof;
    }

    @Generated
    public dk<ei> lb() {
        return this.aog;
    }

    @Generated
    public dk<dz> lK() {
        return this.aoh;
    }
}

