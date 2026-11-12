/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.render;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelRenderer$AmbientOcclusionFace;
import net.minecraft.client.renderer.RegionRenderCacheBuilder;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.BreakingFour;
import net.minecraft.src.a;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.optifine.d;
import net.optifine.model.c;

public class g {
    private IBlockState cnK;
    private b jI;
    private int bfA = -1;
    private int aTI = -1;
    private int etQ = -1;
    private int etR = -1;
    private final float[] etS = new float[ao.dwD.length * 2];
    private final BitSet etT = new BitSet(3);
    private final BlockModelRenderer$AmbientOcclusionFace etU = new BlockModelRenderer$AmbientOcclusionFace();
    private d etV = null;
    private boolean[] etW = null;
    private boolean[] etX = null;
    private boolean[] etY = null;
    private ao[] etZ = null;
    private final List<BakedQuad> eua = new ArrayList<BakedQuad>();
    private final List<BakedQuad> eub = new ArrayList<BakedQuad>();
    private final BakedQuad[] euc = new BakedQuad[1];
    private final BakedQuad[] eud = new BakedQuad[2];
    private final BakedQuad[] eue = new BakedQuad[3];
    private final BakedQuad[] euf = new BakedQuad[4];
    private RegionRenderCacheBuilder bSs = null;
    private final c[] eug = new c[av.values().length];
    private boolean euh = false;
    private static final int eui = -1;
    private static final int euj = 0;
    private static final int euk = 1;

    public g(IBlockState iBlockState, b b2) {
        this.cnK = iBlockState;
        this.jI = b2;
    }

    public void c(IBlockState iBlockState, b b2) {
        if (this.cnK != iBlockState || this.jI != b2) {
            this.cnK = iBlockState;
            this.jI = b2;
            this.bfA = -1;
            this.aTI = -1;
            this.etQ = -1;
            this.etR = -1;
            this.etT.clear();
        }
    }

    public int zW() {
        if (this.bfA < 0) {
            if (this.cnK instanceof BlockStateBase) {
                BlockStateBase blockStateBase = (BlockStateBase)this.cnK;
                this.bfA = blockStateBase.zW();
            } else {
                this.bfA = Block.i(this.cnK.df());
            }
        }
        return this.bfA;
    }

    public int yc() {
        if (this.aTI < 0) {
            if (this.cnK instanceof BlockStateBase) {
                BlockStateBase blockStateBase = (BlockStateBase)this.cnK;
                this.aTI = blockStateBase.yc();
            } else {
                this.aTI = this.cnK.df().c(this.cnK);
            }
        }
        return this.aTI;
    }

    public float[] aDV() {
        return this.etS;
    }

    public BitSet aDW() {
        return this.etT;
    }

    public BlockModelRenderer$AmbientOcclusionFace aDX() {
        return this.etU;
    }

    public boolean R(List list) {
        if (this.etQ == -1 && list.size() > 0) {
            this.etQ = list.get(0) instanceof BreakingFour ? 1 : 0;
        }
        return this.etQ == 1;
    }

    public boolean e(BakedQuad bakedQuad) {
        if (this.etQ < 0) {
            this.etQ = bakedQuad instanceof BreakingFour ? 1 : 0;
        }
        return this.etQ == 1;
    }

    public boolean aDY() {
        return this.etQ == 1;
    }

    public IBlockState yU() {
        return this.cnK;
    }

    public d aDZ() {
        if (this.etV == null) {
            this.etV = new d(0, 0, 0);
        }
        return this.etV;
    }

    public boolean[] aEa() {
        if (this.etW == null) {
            this.etW = new boolean[4];
        }
        return this.etW;
    }

    public boolean[] aEb() {
        if (this.etX == null) {
            this.etX = new boolean[4];
        }
        return this.etX;
    }

    public boolean[] aEc() {
        if (this.etY == null) {
            this.etY = new boolean[4];
        }
        return this.etY;
    }

    public ao[] aEd() {
        if (this.etZ == null) {
            this.etZ = new ao[4];
        }
        return this.etZ;
    }

    public ao[] a(ao ao2, ao ao3, ao ao4, ao ao5) {
        ao[] aoArray = this.aEd();
        aoArray[0] = ao2;
        aoArray[1] = ao3;
        aoArray[2] = ao4;
        aoArray[3] = ao5;
        return aoArray;
    }

    public boolean aEe() {
        if (this.etR == -1) {
            this.etR = a.anu() && this.cnK.df() instanceof BlockLeaves ? 1 : 0;
        }
        return this.etR == 1;
    }

    public List<BakedQuad> aEf() {
        return this.eua;
    }

    public BakedQuad[] f(BakedQuad bakedQuad) {
        this.euc[0] = bakedQuad;
        return this.euc;
    }

    public BakedQuad[] a(BakedQuad bakedQuad, BakedQuad bakedQuad2) {
        this.eud[0] = bakedQuad;
        this.eud[1] = bakedQuad2;
        return this.eud;
    }

    public BakedQuad[] a(BakedQuad bakedQuad, BakedQuad bakedQuad2, BakedQuad bakedQuad3) {
        this.eue[0] = bakedQuad;
        this.eue[1] = bakedQuad2;
        this.eue[2] = bakedQuad3;
        return this.eue;
    }

    public BakedQuad[] a(BakedQuad bakedQuad, BakedQuad bakedQuad2, BakedQuad bakedQuad3, BakedQuad bakedQuad4) {
        this.euf[0] = bakedQuad;
        this.euf[1] = bakedQuad2;
        this.euf[2] = bakedQuad3;
        this.euf[3] = bakedQuad4;
        return this.euf;
    }

    public List<BakedQuad> a(BakedQuad[] bakedQuadArray) {
        this.eub.clear();
        if (bakedQuadArray != null) {
            this.eub.addAll(Arrays.asList(bakedQuadArray));
        }
        return this.eub;
    }

    public RegionRenderCacheBuilder MG() {
        return this.bSs;
    }

    public void a(RegionRenderCacheBuilder regionRenderCacheBuilder) {
        this.bSs = regionRenderCacheBuilder;
    }

    public c k(av av2) {
        c c2 = this.eug[av2.ordinal()];
        if (c2 == null) {
            this.eug[av2.ordinal()] = c2 = new c();
        }
        return c2;
    }

    public boolean aEg() {
        return this.euh;
    }

    public void cP(boolean bl2) {
        this.euh = bl2;
    }
}

