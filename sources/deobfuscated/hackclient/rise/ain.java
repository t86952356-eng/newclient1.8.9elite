/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import java.util.Arrays;
import java.util.List;
import lombok.Generated;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEndPortalFrame;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.BlockVine;
import net.minecraft.block.BlockWeb;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.a;
import net.minecraft.enchantment.l;
import net.minecraft.init.Blocks;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.d;
import net.minecraft.util.b;
import net.minecraft.world.w;
import rise.util.InstanceAccess;

public final class ain
implements InstanceAccess {
    public static final List<Block> aPW = Arrays.asList(Blocks.cNE, Blocks.cMg, Blocks.cNS, Blocks.cOi, Blocks.cOh, Blocks.cLo, Blocks.cLI, Blocks.cMc, Blocks.cMk, Blocks.cMn, Blocks.cNz, Blocks.cLB, Blocks.cMB, Blocks.cMD, Blocks.cLD, Blocks.cOv, Blocks.cLY, Blocks.cOM, Blocks.cONN, Blocks.cMH, Blocks.cMW);
    public static final List<Block> aPX = Arrays.asList(Blocks.cNE, Blocks.cMg, Blocks.cNS, Blocks.cOi, Blocks.cOh, Blocks.cMk, Blocks.cMn, Blocks.cLB, Blocks.cMC, Blocks.cMq, Blocks.cLD, Blocks.cOv);

    public static int vM() {
        for (int i2 = 36; i2 < 45; ++i2) {
            Block block;
            boolean bl2;
            co co2 = ain.aER.bgK.cHX.fM(i2).ls();
            if (co2 == null) continue;
            boolean bl3 = co2.bP() instanceof af && (co2.cXa > 5 || co2.cWZ > 20);
            boolean bl4 = bl2 = co2.aen() && co2.getDisplayName().contains("Black Hole");
            if (!bl3 || !(co2.bP() instanceof af ? (block = ((af)co2.bP()).df()).isFullBlock() || block instanceof BlockGlass || block instanceof BlockStainedGlass || block instanceof BlockTNT || block instanceof BlockEndPortalFrame : bl2)) continue;
            return i2 - 36;
        }
        return -1;
    }

    public static int vN() {
        int n2 = -1;
        float f2 = -1.0f;
        int n3 = -1;
        for (int i2 = 0; i2 < 9; ++i2) {
            co co2 = ain.aER.bgK.cHV.fi(i2);
            if (co2 == null || !(co2.bP() instanceof cp)) continue;
            cp cp2 = (cp)co2.bP();
            int n4 = l.d(a.cqg.cqw, co2);
            float f3 = cp2.adI() + (float)n4 * 1.25f;
            int n5 = cp2.adt();
            if (f2 < f3) {
                f2 = f3;
                n2 = n5;
                n3 = i2;
            }
            if (f3 != f2 || n5 <= n2) continue;
            n2 = n5;
            n3 = i2;
        }
        return n3;
    }

    public static int e(d d2) {
        for (int i2 = 0; i2 < 9; ++i2) {
            co co2 = ain.aER.bgK.cHV.fi(i2);
            if (!(co2 == null ? d2 == null : co2.bP() == d2)) continue;
            return i2;
        }
        return -1;
    }

    public static int h(Block block) {
        for (int i2 = 0; i2 < 9; ++i2) {
            co co2 = ain.aER.bgK.cHV.fi(i2);
            if (!(co2 == null ? block == null : co2.bP() instanceof af && ((af)co2.bP()).df() == block)) continue;
            return i2;
        }
        return -1;
    }

    public static int v(b b2) {
        float f2 = 1.0f;
        int n2 = -1;
        IBlockState iBlockState = ain.aER.bgF.L(b2);
        for (int i2 = 0; i2 < 9; ++i2) {
            float f3;
            co co2 = ain.aER.bgK.cHV.fi(i2);
            if (co2 == null || !((f3 = co2.G(iBlockState.df())) > f2)) continue;
            f2 = f3;
            n2 = i2;
        }
        return n2;
    }

    public static co az(int n2) {
        return n2 < 9 && n2 >= 0 ? ain.aER.bgK.cHV.cJC[n2] : null;
    }

    public static float a(Block block, int n2) {
        float f2 = 1.0f;
        if (ain.aER.bgK.cHV.cJC[n2] != null) {
            f2 *= ain.aER.bgK.cHV.cJC[n2].G(block);
        }
        return f2;
    }

    public static float a(net.minecraft.entity.player.a a2, w w2, b b2, int n2) {
        Block block = ain.aER.bgF.L(b2).df();
        float f2 = block.b(w2, b2);
        return f2 < 0.0f ? 0.0f : (!ain.b(block, n2) ? ain.c(block, n2) / f2 / 100.0f : ain.c(block, n2) / f2 / 30.0f);
    }

    public static boolean b(Block block, int n2) {
        if (block.xb().zF()) {
            return true;
        }
        co co2 = ain.aER.bgK.cHV.fi(n2);
        return co2 != null && co2.F(block);
    }

    public static float a(w w2, Block block, b b2, int n2, d d2, boolean bl2) {
        float f2;
        int n3 = 1;
        boolean bl3 = false;
        if (d2 == null) {
            n3 = 1;
            bl3 = true;
        }
        if (!bl3) {
            int n4 = d.p(d2);
            if (n4 == 269 || n4 == 270 || n4 == 271) {
                n3 = 2;
            }
            if (n4 == 273 || n4 == 274 || n4 == 275) {
                n3 = 4;
            }
            if (n4 == 256 || n4 == 257 || n4 == 258) {
                n3 = 6;
            }
            if (n4 == 277 || n4 == 278 || n4 == 279) {
                n3 = 8;
            }
            if (n4 == 284 || n4 == 285 || n4 == 286) {
                n3 = 12;
            }
            if ((n4 == 267 || n4 == 268 || n4 == 272 || n4 == 276 || n4 == 283) && block instanceof BlockWeb) {
                n3 = 1;
            }
            if (n4 == 359 && block instanceof BlockVine) {
                n3 = 1;
            } else if (n4 == 359 && (block instanceof BlockWeb || block instanceof BlockLeaves)) {
                n3 = 15;
            } else if (n4 == 359 && (double)block.b(Minecraft.getMinecraft().bgF, b2) == 0.8) {
                n3 = 5;
            }
            if (!ain.b(block, n2)) {
                n3 = 1;
            } else if (l.K(Minecraft.getMinecraft().bgK) != 0) {
                n3 += l.K(Minecraft.getMinecraft().bgK) ^ 3;
            }
        }
        if (Minecraft.getMinecraft().bgK.a(net.minecraft.potion.a.dgy)) {
            n3 = (int)((double)n3 * (0.2 * (double)Minecraft.getMinecraft().bgK.b(net.minecraft.potion.a.dgy).ajf() + 1.0));
        }
        if (Minecraft.getMinecraft().bgK.a(net.minecraft.potion.a.dgz)) {
            switch (Minecraft.getMinecraft().bgK.b(net.minecraft.potion.a.dgz).ajf()) {
                case 0: {
                    f2 = 0.3f;
                    break;
                }
                case 1: {
                    f2 = 0.09f;
                    break;
                }
                case 2: {
                    f2 = 0.0027f;
                    break;
                }
                default: {
                    f2 = 8.1E-4f;
                }
            }
            n3 = (int)((float)n3 * f2);
        }
        if (Minecraft.getMinecraft().bgK.c(Material.bev) && !l.Q(Minecraft.getMinecraft().bgK)) {
            n3 = (int)((float)n3 / 5.0f);
        }
        if (!bl2) {
            n3 = (int)((float)n3 / 5.0f);
        }
        f2 = (float)n3 / block.b(w2, b2);
        f2 = ain.b(block, n2) ? (f2 /= 30.0f) : (f2 /= 100.0f);
        if (f2 > 1.0f) {
            return 0.0f;
        }
        int n5 = (int)Math.ceil(1.0f / f2);
        return n5;
    }

    public static float c(Block block, int n2) {
        float f2 = ain.a(block, n2);
        if (f2 > 1.0f) {
            int n3 = l.K(ain.aER.bgK);
            co co2 = ain.az(n2);
            if (n3 > 0 && co2 != null) {
                f2 += (float)(n3 * n3 + 1);
            }
        }
        if (ain.aER.bgK.a(net.minecraft.potion.a.dgy)) {
            f2 *= 1.0f + (float)(ain.aER.bgK.b(net.minecraft.potion.a.dgy).ajf() + 1) * 0.2f;
        }
        if (ain.aER.bgK.a(net.minecraft.potion.a.dgz)) {
            f2 *= (switch (ain.aER.bgK.b(net.minecraft.potion.a.dgz).ajf()) {
                case 0 -> 0.3f;
                case 1 -> 0.09f;
                case 2 -> 0.0027f;
                default -> 8.1E-4f;
            });
        }
        if (ain.aER.bgK.c(Material.bev) && !l.Q(ain.aER.bgK)) {
            f2 /= 5.0f;
        }
        if (!ain.aER.bgK.aO) {
            f2 /= 5.0f;
        }
        return f2;
    }

    @Generated
    private ain() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

