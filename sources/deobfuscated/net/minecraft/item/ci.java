/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.item;

import com.mojang.authlib.GameProfile;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.a;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.aa;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.aj;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.cr;
import net.minecraft.world.w;

public class ci
extends d {
    private static final String[] cWU = new String[]{"skeleton", "wither", "zombie", "char", "creeper"};

    public ci() {
        this.d(a.cpy);
        this.fW(0);
        this.bM(true);
    }

    @Override
    public boolean a(co co2, net.minecraft.entity.player.a a2, w w2, b b2, ao ao2, float f2, float f3, float f4) {
        if (ao2 == ao.dwq) {
            return false;
        }
        IBlockState iBlockState = w2.L(b2);
        Block block = iBlockState.df();
        boolean bl2 = block.a(w2, b2);
        if (!bl2) {
            if (!w2.L(b2).df().xb().zw()) {
                return false;
            }
            b2 = b2.x(ao2);
        }
        if (!a2.a(b2, ao2, co2)) {
            return false;
        }
        if (!Blocks.cOg.d(w2, b2)) {
            return false;
        }
        if (!w2.dDw) {
            net.minecraft.tileentity.d d2;
            w2.a(b2, Blocks.cOg.xM().a(BlockSkull.baI, ao2), 3);
            int n2 = 0;
            if (ao2 == ao.dwr) {
                n2 = bt.aF((double)(a2.pl * 16.0f / 360.0f) + 0.5) & 0xF;
            }
            if ((d2 = w2.K(b2)) instanceof aj) {
                aj aj2 = (aj)d2;
                if (co2.yc() == 3) {
                    GameProfile gameProfile = null;
                    if (co2.aej()) {
                        n n3 = co2.aek();
                        if (n3.C("SkullOwner", 10)) {
                            gameProfile = aa.x(n3.eN("SkullOwner"));
                        } else if (n3.C("SkullOwner", 8) && n3.eK("SkullOwner").length() > 0) {
                            gameProfile = new GameProfile(null, n3.eK("SkullOwner"));
                        }
                    }
                    aj2.s(gameProfile);
                } else {
                    aj2.ho(co2.yc());
                }
                aj2.hp(n2);
                Blocks.cOg.a(w2, b2, aj2);
            }
            --co2.cWZ;
        }
        return true;
    }

    @Override
    public void b(d d2, a a2, List<co> list) {
        for (int i2 = 0; i2 < cWU.length; ++i2) {
            list.add(new co(d2, 1, i2));
        }
    }

    @Override
    public int fV(int n2) {
        return n2;
    }

    @Override
    public String ao(co co2) {
        int n2 = co2.yc();
        if (n2 < 0 || n2 >= cWU.length) {
            n2 = 0;
        }
        return super.xB() + "." + cWU[n2];
    }

    @Override
    public String at(co co2) {
        if (co2.yc() == 3 && co2.aej()) {
            n n2;
            if (co2.aek().C("SkullOwner", 8)) {
                return cr.c("item.skull.player.name", co2.aek().eK("SkullOwner"));
            }
            if (co2.aek().C("SkullOwner", 10) && (n2 = co2.aek().eN("SkullOwner")).C("Name", 8)) {
                return cr.c("item.skull.player.name", n2.eK("Name"));
            }
        }
        return super.at(co2);
    }

    @Override
    public boolean q(n n2) {
        super.q(n2);
        if (n2.C("SkullOwner", 8) && n2.eK("SkullOwner").length() > 0) {
            GameProfile gameProfile = new GameProfile(null, n2.eK("SkullOwner"));
            gameProfile = aj.t(gameProfile);
            n2.b("SkullOwner", aa.a(new n(), gameProfile));
            return true;
        }
        return false;
    }
}

