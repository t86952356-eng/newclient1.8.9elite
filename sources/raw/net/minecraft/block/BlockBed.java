/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package net.minecraft.block;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed$EnumPartType;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.t;
import net.minecraft.world.biome.j;
import net.minecraft.world.l;
import net.minecraft.world.w;

public class BlockBed
extends BlockDirectional {
    public static final PropertyEnum<BlockBed$EnumPartType> aTc = PropertyEnum.c("part", BlockBed$EnumPartType.class);
    public static final PropertyBool aTd = PropertyBool.cs("occupied");

    public BlockBed() {
        super(Material.beB);
        this.h(this.aSG.zS().a(aTc, BlockBed$EnumPartType.aTf).a(aTd, false));
        this.xY();
    }

    @Override
    public void a(w w2, c c2) {
        if (ViaLoadingBase.getInstance().getTargetVersion().olderThan(ProtocolVersion.v1_12)) {
            return;
        }
        if (c2.isSneaking()) {
            super.a(w2, c2);
        } else if (c2.ue < 0.0) {
            c2.ue *= (double)-0.66f;
        }
    }

    @Override
    public boolean a(w w2, b b2, IBlockState iBlockState, a a2, ao ao2, float f2, float f3, float f4) {
        if (w2.dDw) {
            return true;
        }
        if (iBlockState.b(aTc) != BlockBed$EnumPartType.aTe && (iBlockState = w2.L(b2 = b2.x(iBlockState.b(aTB)))).df() != this) {
            return true;
        }
        if (w2.dDl.avX() && w2.aF(b2) != j.dGn) {
            Object object;
            if (iBlockState.b(aTd).booleanValue()) {
                object = this.n(w2, b2);
                if (object != null) {
                    a2.b(new t("tile.bed.occupied", new Object[0]));
                    return true;
                }
                iBlockState = iBlockState.a(aTd, false);
                w2.a(b2, iBlockState, 4);
            }
            if ((object = a2.aj(b2)) == net.minecraft.entity.player.d.cIO) {
                iBlockState = iBlockState.a(aTd, true);
                w2.a(b2, iBlockState, 4);
                return true;
            }
            if (object == net.minecraft.entity.player.d.cIQ) {
                a2.b(new t("tile.bed.noSleep", new Object[0]));
            } else if (object == net.minecraft.entity.player.d.cIT) {
                a2.b(new t("tile.bed.notSafe", new Object[0]));
            }
            return true;
        }
        w2.aL(b2);
        b b3 = b2.x(iBlockState.b(aTB).asC());
        if (w2.L(b3).df() == this) {
            w2.aL(b3);
        }
        w2.a(null, (double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, 5.0f, true, true);
        return true;
    }

    private a n(w w2, b b2) {
        for (a a2 : w2.dCY) {
            if (!a2.Wg() || !a2.cIl.equals(b2)) continue;
            return a2;
        }
        return null;
    }

    @Override
    public boolean xf() {
        return false;
    }

    @Override
    public boolean xk() {
        return false;
    }

    @Override
    public void c(l l2, b b2) {
        this.xY();
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, Block block) {
        ao ao2 = iBlockState.b(aTB);
        if (iBlockState.b(aTc) == BlockBed$EnumPartType.aTe) {
            if (w2.L(b2.x(ao2.asC())).df() != this) {
                w2.aL(b2);
            }
        } else if (w2.L(b2.x(ao2)).df() != this) {
            w2.aL(b2);
            if (!w2.dDw) {
                this.a(w2, b2, iBlockState, 0);
            }
        }
    }

    @Override
    public d a(IBlockState iBlockState, Random random, int n2) {
        return iBlockState.b(aTc) == BlockBed$EnumPartType.aTe ? null : Items.cRe;
    }

    private void xY() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5625f, 1.0f);
    }

    public static b b(w w2, b b2, int n2) {
        ao ao2 = w2.L(b2).b(aTB);
        int n3 = b2.wt();
        int n4 = b2.wu();
        int n5 = b2.wx();
        for (int i2 = 0; i2 <= 1; ++i2) {
            int n6 = n3 - ao2.asH() * i2 - 1;
            int n7 = n5 - ao2.asJ() * i2 - 1;
            int n8 = n6 + 2;
            int n9 = n7 + 2;
            for (int i3 = n6; i3 <= n8; ++i3) {
                for (int i4 = n7; i4 <= n9; ++i4) {
                    b b3 = new b(i3, n4, i4);
                    if (!BlockBed.o(w2, b3)) continue;
                    if (n2 <= 0) {
                        return b3;
                    }
                    --n2;
                }
            }
        }
        return null;
    }

    protected static boolean o(w w2, b b2) {
        return w.v(w2, b2.aqY()) && !w2.L(b2).df().xb().zw() && !w2.L(b2.aqX()).df().xb().zw();
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        if (iBlockState.b(aTc) == BlockBed$EnumPartType.aTf) {
            super.a(w2, b2, iBlockState, f2, 0);
        }
    }

    @Override
    public int xE() {
        return 1;
    }

    @Override
    public av xo() {
        return av.dxX;
    }

    @Override
    public d e(w w2, b b2) {
        return Items.cRe;
    }

    @Override
    public void a(w w2, b b2, IBlockState iBlockState, a a2) {
        b b3;
        if (a2.cIt.cJM && iBlockState.b(aTc) == BlockBed$EnumPartType.aTe && w2.L(b3 = b2.x(iBlockState.b(aTB).asC())).df() == this) {
            w2.aL(b3);
        }
    }

    @Override
    public IBlockState aM(int n2) {
        ao ao2 = ao.hz(n2);
        return (n2 & 8) > 0 ? this.xM().a(aTc, BlockBed$EnumPartType.aTe).a(aTB, ao2).a(aTd, (n2 & 4) > 0) : this.xM().a(aTc, BlockBed$EnumPartType.aTf).a(aTB, ao2);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, l l2, b b2) {
        IBlockState iBlockState2;
        if (iBlockState.b(aTc) == BlockBed$EnumPartType.aTf && (iBlockState2 = l2.L(b2.x(iBlockState.b(aTB)))).df() == this) {
            iBlockState = iBlockState.a(aTd, iBlockState2.b(aTd));
        }
        return iBlockState;
    }

    @Override
    public int c(IBlockState iBlockState) {
        int n2 = 0;
        n2 |= iBlockState.b(aTB).asA();
        if (iBlockState.b(aTc) == BlockBed$EnumPartType.aTe) {
            n2 |= 8;
            if (iBlockState.b(aTd).booleanValue()) {
                n2 |= 4;
            }
        }
        return n2;
    }

    @Override
    protected BlockState xK() {
        return new BlockState(this, aTB, aTc, aTd);
    }
}

