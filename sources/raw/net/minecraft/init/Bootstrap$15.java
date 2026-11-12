/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.init;

import com.mojang.authlib.GameProfile;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockSkull;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.nbt.aa;
import net.minecraft.nbt.n;
import net.minecraft.tileentity.aj;
import net.minecraft.tileentity.d;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.ct;
import net.minecraft.world.w;

class Bootstrap$15
extends a {
    private boolean cOZ = true;

    Bootstrap$15() {
    }

    @Override
    protected co b(e e2, co co2) {
        w w2 = e2.de();
        ao ao2 = BlockDispenser.aQ(e2.zg());
        b b2 = e2.dg().x(ao2);
        BlockSkull blockSkull = Blocks.cOg;
        if (w2.aG(b2) && blockSkull.b(w2, b2, co2)) {
            if (!w2.dDw) {
                w2.a(b2, blockSkull.xM().a(BlockSkull.baI, ao.dwr), 3);
                d d2 = w2.K(b2);
                if (d2 instanceof aj) {
                    if (co2.yc() == 3) {
                        GameProfile gameProfile = null;
                        if (co2.aej()) {
                            String string;
                            n n2 = co2.aek();
                            if (n2.C("SkullOwner", 10)) {
                                gameProfile = aa.x(n2.eN("SkullOwner"));
                            } else if (n2.C("SkullOwner", 8) && !ct.cU(string = n2.eK("SkullOwner"))) {
                                gameProfile = new GameProfile(null, string);
                            }
                        }
                        ((aj)d2).s(gameProfile);
                    } else {
                        ((aj)d2).ho(co2.yc());
                    }
                    ((aj)d2).hp(ao2.asC().asA() * 4);
                    Blocks.cOg.a(w2, b2, (aj)d2);
                }
                --co2.cWZ;
            }
        } else {
            this.cOZ = false;
        }
        return co2;
    }

    @Override
    protected void b(e e2) {
        if (this.cOZ) {
            e2.de().e(1000, e2.dg(), 0);
        } else {
            e2.de().e(1001, e2.dg(), 0);
        }
    }
}

