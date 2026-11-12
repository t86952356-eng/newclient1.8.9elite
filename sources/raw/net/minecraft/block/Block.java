/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import hackclient.rise.a;
import hackclient.rise.es;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block$1;
import net.minecraft.block.Block$2;
import net.minecraft.block.Block$3;
import net.minecraft.block.Block$4;
import net.minecraft.block.Block$EnumOffsetType;
import net.minecraft.block.Block$SoundType;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.BlockBanner$BlockBannerHanging;
import net.minecraft.block.BlockBanner$BlockBannerStanding;
import net.minecraft.block.BlockBarrier;
import net.minecraft.block.BlockBeacon;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockBookshelf;
import net.minecraft.block.BlockBrewingStand;
import net.minecraft.block.BlockButtonStone;
import net.minecraft.block.BlockButtonWood;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockCake;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockCarrot;
import net.minecraft.block.BlockCauldron;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockClay;
import net.minecraft.block.BlockCocoa;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockCommandBlock;
import net.minecraft.block.BlockCompressedPowered;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockDaylightDetector;
import net.minecraft.block.BlockDeadBush;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockDoubleStoneSlab;
import net.minecraft.block.BlockDoubleStoneSlabNew;
import net.minecraft.block.BlockDoubleWoodSlab;
import net.minecraft.block.BlockDragonEgg;
import net.minecraft.block.BlockDropper;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.BlockEnchantmentTable;
import net.minecraft.block.BlockEndPortal;
import net.minecraft.block.BlockEndPortalFrame;
import net.minecraft.block.BlockEnderChest;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockGravel;
import net.minecraft.block.BlockHalfStoneSlab;
import net.minecraft.block.BlockHalfStoneSlabNew;
import net.minecraft.block.BlockHalfWoodSlab;
import net.minecraft.block.BlockHardenedClay;
import net.minecraft.block.BlockHay;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockHugeMushroom;
import net.minecraft.block.BlockIce;
import net.minecraft.block.BlockJukebox;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockLilyPad;
import net.minecraft.block.BlockMelon;
import net.minecraft.block.BlockMobSpawner;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.BlockMycelium;
import net.minecraft.block.BlockNetherBrick;
import net.minecraft.block.BlockNetherWart;
import net.minecraft.block.BlockNetherrack;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockNote;
import net.minecraft.block.BlockObsidian;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockOre;
import net.minecraft.block.BlockPackedIce;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.block.BlockPistonMoving;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.BlockPotato;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.BlockPressurePlate$Sensitivity;
import net.minecraft.block.BlockPressurePlateWeighted;
import net.minecraft.block.BlockPrismarine;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.BlockQuartz$EnumType;
import net.minecraft.block.BlockRail;
import net.minecraft.block.BlockRailDetector;
import net.minecraft.block.BlockRailPowered;
import net.minecraft.block.BlockRedFlower;
import net.minecraft.block.BlockRedSandstone;
import net.minecraft.block.BlockRedSandstone$EnumType;
import net.minecraft.block.BlockRedstoneComparator;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.BlockRedstoneRepeater;
import net.minecraft.block.BlockRedstoneTorch;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockSandStone$EnumType;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockSeaLantern;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlime;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockSnowBlock;
import net.minecraft.block.BlockSoulSand;
import net.minecraft.block.BlockSponge;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockStandingSign;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.BlockStem;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockStoneBrick$EnumType;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.BlockTripWire;
import net.minecraft.block.BlockTripWireHook;
import net.minecraft.block.BlockVine;
import net.minecraft.block.BlockWall;
import net.minecraft.block.BlockWallSign;
import net.minecraft.block.BlockWeb;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.BlockYellowFlower;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.d;
import net.minecraft.enchantment.l;
import net.minecraft.entity.c;
import net.minecraft.entity.item.i;
import net.minecraft.entity.item.w;
import net.minecraft.entity.r;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.stats.n;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cg;
import net.minecraft.util.cj;
import net.minecraft.util.cm;
import net.minecraft.util.cr;
import net.minecraft.util.da;
import net.minecraft.world.h;

public class Block {
    private static final cm aRU = new cm("air");
    public static final cj<cm, Block> aRV = new cj(aRU);
    public static final cg<IBlockState> aRW = new cg();
    private net.minecraft.creativetab.a aRX;
    public static final Block$SoundType aRY = new Block$SoundType("stone", 1.0f, 1.0f);
    public static final Block$SoundType aRZ = new Block$SoundType("wood", 1.0f, 1.0f);
    public static final Block$SoundType aSa = new Block$SoundType("gravel", 1.0f, 1.0f);
    public static final Block$SoundType aSb = new Block$SoundType("grass", 1.0f, 1.0f);
    public static final Block$SoundType aSc = new Block$SoundType("stone", 1.0f, 1.0f);
    public static final Block$SoundType aSd = new Block$SoundType("stone", 1.0f, 1.5f);
    public static final Block$SoundType aSe = new Block$1("stone", 1.0f, 1.0f);
    public static final Block$SoundType aSf = new Block$SoundType("cloth", 1.0f, 1.0f);
    public static final Block$SoundType aSg = new Block$SoundType("sand", 1.0f, 1.0f);
    public static final Block$SoundType aSh = new Block$SoundType("snow", 1.0f, 1.0f);
    public static final Block$SoundType aSi = new Block$2("ladder", 1.0f, 1.0f);
    public static final Block$SoundType aSj = new Block$3("anvil", 0.3f, 1.0f);
    public static final Block$SoundType aSk = new Block$4("slime", 1.0f, 1.0f);
    protected boolean aSl;
    protected int aSm;
    protected boolean aSn;
    protected int aSo;
    protected boolean aSp;
    protected float aSq;
    protected float aSr;
    protected boolean aSs = true;
    protected boolean aSt;
    protected boolean aSu;
    protected double aSv;
    protected double aSw;
    protected double aSx;
    protected double aSy;
    protected double aSz;
    protected double aSA;
    public Block$SoundType aSB = aRY;
    public float aSC = 1.0f;
    protected final Material aSD;
    protected final MapColor aSE;
    public float aSF = 0.6f;
    protected final BlockState aSG;
    private IBlockState aSH;
    private String aSI;

    public static int i(Block block) {
        return aRV.z(block);
    }

    public static int a(IBlockState iBlockState) {
        Block block = iBlockState.df();
        return Block.i(block) + (block.c(iBlockState) << 12);
    }

    public static Block aK(int n2) {
        return aRV.hT(n2);
    }

    public static IBlockState aL(int n2) {
        int n3 = n2 & 0xFFF;
        int n4 = n2 >> 12 & 0xF;
        return Block.aK(n3).aM(n4);
    }

    public static Block f(net.minecraft.item.d d2) {
        return d2 instanceof af ? ((af)d2).df() : null;
    }

    public static Block cq(String string) {
        cm cm2 = new cm(string);
        if (aRV.containsKey(cm2)) {
            return aRV.w(cm2);
        }
        try {
            return aRV.hT(Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public boolean isFullBlock() {
        return this.aSl;
    }

    public int wX() {
        return this.aSm;
    }

    public boolean wY() {
        return this.aSn;
    }

    public int wZ() {
        return this.aSo;
    }

    public boolean xa() {
        return this.aSp;
    }

    public Material xb() {
        return this.aSD;
    }

    public MapColor b(IBlockState iBlockState) {
        return this.aSE;
    }

    public IBlockState aM(int n2) {
        return this.xM();
    }

    public int c(IBlockState iBlockState) {
        if (iBlockState != null && !iBlockState.zU().isEmpty()) {
            throw new IllegalArgumentException("Don't know how to convert " + String.valueOf(iBlockState) + " back into data...");
        }
        return 0;
    }

    public IBlockState a(IBlockState iBlockState, net.minecraft.world.l l2, b b2) {
        return iBlockState;
    }

    public Block(Material material, MapColor mapColor) {
        this.aSD = material;
        this.aSE = mapColor;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.aSl = this.xk();
        this.aSm = this.xk() ? 255 : 0;
        this.aSn = !material.zx();
        this.aSG = this.xK();
        this.h(this.aSG.zS());
    }

    protected Block(Material material) {
        this(material, material.zK());
    }

    protected Block a(Block$SoundType block$SoundType) {
        this.aSB = block$SoundType;
        return this;
    }

    protected Block aN(int n2) {
        this.aSm = n2;
        return this;
    }

    protected Block J(float f2) {
        this.aSo = (int)(15.0f * f2);
        return this;
    }

    protected Block K(float f2) {
        this.aSr = f2 * 3.0f;
        return this;
    }

    public boolean xc() {
        return this.aSD.zy() && this.xf();
    }

    public boolean xd() {
        return this.aSD.isOpaque() && this.xf() && !this.xw();
    }

    public boolean xe() {
        return this.aSD.zy() && this.xf();
    }

    public boolean xf() {
        return true;
    }

    public boolean a(net.minecraft.world.l l2, b b2) {
        return !this.aSD.zy();
    }

    public int xg() {
        return 3;
    }

    public boolean a(net.minecraft.world.w w2, b b2) {
        return false;
    }

    protected Block L(float f2) {
        this.aSq = f2;
        if (this.aSr < f2 * 5.0f) {
            this.aSr = f2 * 5.0f;
        }
        return this;
    }

    protected Block xh() {
        this.L(-1.0f);
        return this;
    }

    public float b(net.minecraft.world.w w2, b b2) {
        return this.aSq;
    }

    protected Block O(boolean bl2) {
        this.aSt = bl2;
        return this;
    }

    public boolean xi() {
        return this.aSt;
    }

    public boolean xj() {
        return this.aSu;
    }

    public final void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.aSv = f2;
        this.aSw = f3;
        this.aSx = f4;
        this.aSy = f5;
        this.aSz = f6;
        this.aSA = f7;
    }

    public int b(net.minecraft.world.l l2, b b2) {
        Block block = l2.L(b2).df();
        int n2 = l2.b(b2, block.wZ());
        if (n2 == 0 && block instanceof BlockSlab) {
            b2 = b2.aqY();
            block = l2.L(b2).df();
            return l2.b(b2, block.wZ());
        }
        return n2;
    }

    public boolean a(net.minecraft.world.l l2, b b2, ao ao2) {
        return ao2 == ao.dwq && this.aSw > 0.0 || ao2 == ao.dwr && this.aSz < 1.0 || ao2 == ao.dws && this.aSx > 0.0 || ao2 == ao.dwt && this.aSA < 1.0 || ao2 == ao.dwu && this.aSv > 0.0 || ao2 == ao.dwv && this.aSy < 1.0 || !l2.L(b2).df().xk();
    }

    public boolean b(net.minecraft.world.l l2, b b2, ao ao2) {
        return l2.L(b2).df().xb().zw();
    }

    public net.minecraft.util.a c(net.minecraft.world.w w2, b b2) {
        return new net.minecraft.util.a((double)b2.wt() + this.aSv, (double)b2.wu() + this.aSw, (double)b2.wx() + this.aSx, (double)b2.wt() + this.aSy, (double)b2.wu() + this.aSz, (double)b2.wx() + this.aSA);
    }

    public void a(net.minecraft.world.w w2, b b2, IBlockState iBlockState, net.minecraft.util.a a2, List<net.minecraft.util.a> list, c c2) {
        net.minecraft.util.a a3 = this.a(w2, b2, iBlockState);
        if (c2 == d.AZ().bgK) {
            es es2 = new es(w2, this, b2, a3, a2);
            a.a.e().d(es2);
            if (es2.isCancelled()) {
                return;
            }
            if (es2.dh() != null && es2.di().q(es2.dh())) {
                list.add(es2.dh());
            }
        } else if (a3 != null && a2.q(a3)) {
            list.add(a3);
        }
    }

    public net.minecraft.util.a a(net.minecraft.world.w w2, b b2, IBlockState iBlockState) {
        return new net.minecraft.util.a((double)b2.wt() + this.aSv, (double)b2.wu() + this.aSw, (double)b2.wx() + this.aSx, (double)b2.wt() + this.aSy, (double)b2.wu() + this.aSz, (double)b2.wx() + this.aSA);
    }

    public boolean xk() {
        return true;
    }

    public boolean a(IBlockState iBlockState, boolean bl2) {
        return this.xl();
    }

    public boolean xl() {
        return true;
    }

    public void a(net.minecraft.world.w w2, b b2, IBlockState iBlockState, Random random) {
        this.b(w2, b2, iBlockState, random);
    }

    public void b(net.minecraft.world.w w2, b b2, IBlockState iBlockState, Random random) {
    }

    public void c(net.minecraft.world.w w2, b b2, IBlockState iBlockState, Random random) {
    }

    public void b(net.minecraft.world.w w2, b b2, IBlockState iBlockState) {
    }

    public void a(net.minecraft.world.w w2, b b2, IBlockState iBlockState, Block block) {
    }

    public int c(net.minecraft.world.w w2) {
        return 10;
    }

    public void c(net.minecraft.world.w w2, b b2, IBlockState iBlockState) {
    }

    public void d(net.minecraft.world.w w2, b b2, IBlockState iBlockState) {
    }

    public int a(Random random) {
        return 1;
    }

    public net.minecraft.item.d a(IBlockState iBlockState, Random random, int n2) {
        return net.minecraft.item.d.I(this);
    }

    public float h(net.minecraft.entity.player.a a2) {
        float f2 = this.xn();
        return f2 < 0.0f ? 0.0f : (!a2.F(this) ? a2.E(this) / f2 / 100.0f : a2.E(this) / f2 / 30.0f);
    }

    public float xn() {
        return this.aSq;
    }

    public float a(net.minecraft.entity.player.a a2, net.minecraft.world.w w2, b b2) {
        float f2 = this.b(w2, b2);
        return f2 < 0.0f ? 0.0f : (!a2.F(this) ? a2.E(this) / f2 / 100.0f : a2.E(this) / f2 / 30.0f);
    }

    public final void a(net.minecraft.world.w w2, b b2, IBlockState iBlockState, int n2) {
        this.a(w2, b2, iBlockState, 1.0f, n2);
    }

    public void a(net.minecraft.world.w w2, b b2, IBlockState iBlockState, float f2, int n2) {
        if (!w2.dDw) {
            int n3 = this.a(n2, w2.dDk);
            for (int i2 = 0; i2 < n3; ++i2) {
                net.minecraft.item.d d2;
                if (!(w2.dDk.nextFloat() <= f2) || (d2 = this.a(iBlockState, w2.dDk, n2)) == null) continue;
                Block.a(w2, b2, new co(d2, 1, this.d(iBlockState)));
            }
        }
    }

    public static void a(net.minecraft.world.w w2, b b2, co co2) {
        if (!w2.dDw && w2.Si().gw("doTileDrops")) {
            float f2 = 0.5f;
            double d2 = (double)(w2.dDk.nextFloat() * 0.5f) + 0.25;
            double d3 = (double)(w2.dDk.nextFloat() * 0.5f) + 0.25;
            double d4 = (double)(w2.dDk.nextFloat() * 0.5f) + 0.25;
            i i2 = new i(w2, (double)b2.wt() + d2, (double)b2.wu() + d3, (double)b2.wx() + d4, co2);
            i2.Yn();
            w2.G(i2);
        }
    }

    protected void a(net.minecraft.world.w w2, b b2, int n2) {
        if (!w2.dDw) {
            while (n2 > 0) {
                int n3 = w.fl(n2);
                n2 -= n3;
                w2.G(new w(w2, (double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, n3));
            }
        }
    }

    public int d(IBlockState iBlockState) {
        return 0;
    }

    public float A(c c2) {
        return this.aSr / 5.0f;
    }

    public ce a(net.minecraft.world.w w2, b b2, da da2, da da3) {
        this.c((net.minecraft.world.l)w2, b2);
        da2 = da2.al(-b2.wt(), -b2.wu(), -b2.wx());
        da3 = da3.al(-b2.wt(), -b2.wu(), -b2.wx());
        da da4 = da2.a(da3, this.aSv);
        da da5 = da2.a(da3, this.aSy);
        da da6 = da2.b(da3, this.aSw);
        da da7 = da2.b(da3, this.aSz);
        da da8 = da2.c(da3, this.aSx);
        da da9 = da2.c(da3, this.aSA);
        if (!this.i(da4)) {
            da4 = null;
        }
        if (!this.i(da5)) {
            da5 = null;
        }
        if (!this.j(da6)) {
            da6 = null;
        }
        if (!this.j(da7)) {
            da7 = null;
        }
        if (!this.k(da8)) {
            da8 = null;
        }
        if (!this.k(da9)) {
            da9 = null;
        }
        da da10 = null;
        if (da4 != null && (da10 == null || da2.y(da4) < da2.y(da10))) {
            da10 = da4;
        }
        if (da5 != null && (da10 == null || da2.y(da5) < da2.y(da10))) {
            da10 = da5;
        }
        if (da6 != null && (da10 == null || da2.y(da6) < da2.y(da10))) {
            da10 = da6;
        }
        if (da7 != null && (da10 == null || da2.y(da7) < da2.y(da10))) {
            da10 = da7;
        }
        if (da8 != null && (da10 == null || da2.y(da8) < da2.y(da10))) {
            da10 = da8;
        }
        if (da9 != null && (da10 == null || da2.y(da9) < da2.y(da10))) {
            da10 = da9;
        }
        if (da10 == null) {
            return null;
        }
        ao ao2 = null;
        if (da10 == da4) {
            ao2 = ao.dwu;
        }
        if (da10 == da5) {
            ao2 = ao.dwv;
        }
        if (da10 == da6) {
            ao2 = ao.dwq;
        }
        if (da10 == da7) {
            ao2 = ao.dwr;
        }
        if (da10 == da8) {
            ao2 = ao.dws;
        }
        if (da10 == da9) {
            ao2 = ao.dwt;
        }
        return new ce(da10.al(b2.wt(), b2.wu(), b2.wx()), ao2, b2);
    }

    private boolean i(da da2) {
        return da2 != null && da2.dAH >= this.aSw && da2.dAH <= this.aSz && da2.dAI >= this.aSx && da2.dAI <= this.aSA;
    }

    private boolean j(da da2) {
        return da2 != null && da2.dAG >= this.aSv && da2.dAG <= this.aSy && da2.dAI >= this.aSx && da2.dAI <= this.aSA;
    }

    private boolean k(da da2) {
        return da2 != null && da2.dAG >= this.aSv && da2.dAG <= this.aSy && da2.dAH >= this.aSw && da2.dAH <= this.aSz;
    }

    public void a(net.minecraft.world.w w2, b b2, h h2) {
    }

    public av xo() {
        return av.dxV;
    }

    public boolean a(net.minecraft.world.w w2, b b2, ao ao2, co co2) {
        return this.a(w2, b2, ao2);
    }

    public boolean a(net.minecraft.world.w w2, b b2, ao ao2) {
        return this.d(w2, b2);
    }

    public boolean d(net.minecraft.world.w w2, b b2) {
        return w2.L((b)b2).df().aSD.zE();
    }

    public boolean a(net.minecraft.world.w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2, ao ao2, float f2, float f3, float f4) {
        return false;
    }

    public void a(net.minecraft.world.w w2, b b2, c c2) {
    }

    public IBlockState a(net.minecraft.world.w w2, b b2, ao ao2, float f2, float f3, float f4, int n2, r r2) {
        return this.aM(n2);
    }

    public void a(net.minecraft.world.w w2, b b2, net.minecraft.entity.player.a a2) {
    }

    public da a(net.minecraft.world.w w2, b b2, c c2, da da2) {
        return da2;
    }

    public void c(net.minecraft.world.l l2, b b2) {
    }

    public final double xp() {
        return this.aSv;
    }

    public final double xq() {
        return this.aSy;
    }

    public final double xr() {
        return this.aSw;
    }

    public final double xs() {
        return this.aSz;
    }

    public final double xt() {
        return this.aSx;
    }

    public final double xu() {
        return this.aSA;
    }

    public int xv() {
        return 0xFFFFFF;
    }

    public int e(IBlockState iBlockState) {
        return 0xFFFFFF;
    }

    public int a(net.minecraft.world.l l2, b b2, int n2) {
        return 0xFFFFFF;
    }

    public final int d(net.minecraft.world.l l2, b b2) {
        return this.a(l2, b2, 0);
    }

    public int a(net.minecraft.world.l l2, b b2, IBlockState iBlockState, ao ao2) {
        return 0;
    }

    public boolean xw() {
        return false;
    }

    public void a(net.minecraft.world.w w2, b b2, IBlockState iBlockState, c c2) {
    }

    public int b(net.minecraft.world.l l2, b b2, IBlockState iBlockState, ao ao2) {
        return 0;
    }

    public void xx() {
    }

    public void a(net.minecraft.world.w w2, net.minecraft.entity.player.a a2, b b2, IBlockState iBlockState, net.minecraft.tileentity.d d2) {
        a2.a(n.dqC[Block.i(this)]);
        a2.bs(0.025f);
        if (this.xy() && l.L(a2)) {
            co co2 = this.f(iBlockState);
            if (co2 != null) {
                Block.a(w2, b2, co2);
            }
        } else {
            int n2 = l.M(a2);
            this.a(w2, b2, iBlockState, n2);
        }
    }

    protected boolean xy() {
        return this.xf() && !this.aSu;
    }

    protected co f(IBlockState iBlockState) {
        int n2 = 0;
        net.minecraft.item.d d2 = net.minecraft.item.d.I(this);
        if (d2 != null && d2.ads()) {
            n2 = this.c(iBlockState);
        }
        return new co(d2, 1, n2);
    }

    public int a(int n2, Random random) {
        return this.a(random);
    }

    public void a(net.minecraft.world.w w2, b b2, IBlockState iBlockState, r r2, co co2) {
    }

    public boolean xz() {
        return !this.aSD.zw() && !this.aSD.zv();
    }

    public Block cr(String string) {
        this.aSI = string;
        return this;
    }

    public String xA() {
        return cr.gm(this.xB() + ".name");
    }

    public String xB() {
        return "tile." + this.aSI;
    }

    public boolean a(net.minecraft.world.w w2, b b2, IBlockState iBlockState, int n2, int n3) {
        return false;
    }

    public boolean xC() {
        return this.aSs;
    }

    protected Block xD() {
        this.aSs = false;
        return this;
    }

    public int xE() {
        return this.aSD.zG();
    }

    public float xF() {
        return this.xc() ? 0.2f : 1.0f;
    }

    public void a(net.minecraft.world.w w2, b b2, c c2, float f2) {
        c2.q(f2, 1.0f);
    }

    public void a(net.minecraft.world.w w2, c c2) {
        c2.ue = 0.0;
    }

    public net.minecraft.item.d e(net.minecraft.world.w w2, b b2) {
        return net.minecraft.item.d.I(this);
    }

    public int f(net.minecraft.world.w w2, b b2) {
        return this.d(w2.L(b2));
    }

    public void a(net.minecraft.item.d d2, net.minecraft.creativetab.a a2, List<co> list) {
        list.add(new co(d2, 1, 0));
    }

    public net.minecraft.creativetab.a xG() {
        return this.aRX;
    }

    public Block a(net.minecraft.creativetab.a a2) {
        this.aRX = a2;
        return this;
    }

    public void a(net.minecraft.world.w w2, b b2, IBlockState iBlockState, net.minecraft.entity.player.a a2) {
    }

    public void g(net.minecraft.world.w w2, b b2) {
    }

    public boolean xH() {
        return false;
    }

    public boolean xI() {
        return true;
    }

    public boolean a(h h2) {
        return true;
    }

    public boolean j(Block block) {
        return this == block;
    }

    public static boolean c(Block block, Block block2) {
        return block != null && block2 != null && (block == block2 || block.j(block2));
    }

    public boolean xJ() {
        return false;
    }

    public int h(net.minecraft.world.w w2, b b2) {
        return 0;
    }

    public IBlockState g(IBlockState iBlockState) {
        return iBlockState;
    }

    protected BlockState xK() {
        return new BlockState(this, new IProperty[0]);
    }

    public BlockState xL() {
        return this.aSG;
    }

    protected final void h(IBlockState iBlockState) {
        this.aSH = iBlockState;
    }

    public final IBlockState xM() {
        return this.aSH;
    }

    public Block$EnumOffsetType xN() {
        return Block$EnumOffsetType.aSJ;
    }

    public String toString() {
        return "Block{" + String.valueOf(aRV.y(this)) + "}";
    }

    public static void xO() {
        int n2;
        Block.a(0, aRU, new BlockAir().cr("air"));
        Block.a(1, "stone", new BlockStone().L(1.5f).K(10.0f).a(aSc).cr("stone"));
        Block.a(2, "grass", new BlockGrass().L(0.6f).a(aSb).cr("grass"));
        Block.a(3, "dirt", new BlockDirt().L(0.5f).a(aSa).cr("dirt"));
        Block block = new Block(Material.bes).L(2.0f).K(10.0f).a(aSc).cr("stonebrick").a(net.minecraft.creativetab.a.cpx);
        Block.a(4, "cobblestone", block);
        Block block2 = new BlockPlanks().L(2.0f).K(5.0f).a(aRZ).cr("wood");
        Block.a(5, "planks", block2);
        Block.a(6, "sapling", new BlockSapling().L(0.0f).a(aSb).cr("sapling"));
        Block.a(7, "bedrock", new Block(Material.bes).xh().K(6000000.0f).a(aSc).cr("bedrock").xD().a(net.minecraft.creativetab.a.cpx));
        Block.a(8, "flowing_water", new BlockDynamicLiquid(Material.bev).L(100.0f).aN(3).cr("water").xD());
        Block.a(9, "water", new BlockStaticLiquid(Material.bev).L(100.0f).aN(3).cr("water").xD());
        Block.a(10, "flowing_lava", new BlockDynamicLiquid(Material.bew).L(100.0f).J(1.0f).cr("lava").xD());
        Block.a(11, "lava", new BlockStaticLiquid(Material.bew).L(100.0f).J(1.0f).cr("lava").xD());
        Block.a(12, "sand", new BlockSand().L(0.5f).a(aSg).cr("sand"));
        Block.a(13, "gravel", new BlockGravel().L(0.6f).a(aSa).cr("gravel"));
        Block.a(14, "gold_ore", new BlockOre().L(3.0f).K(5.0f).a(aSc).cr("oreGold"));
        Block.a(15, "iron_ore", new BlockOre().L(3.0f).K(5.0f).a(aSc).cr("oreIron"));
        Block.a(16, "coal_ore", new BlockOre().L(3.0f).K(5.0f).a(aSc).cr("oreCoal"));
        Block.a(17, "log", new BlockOldLog().cr("log"));
        Block.a(18, "leaves", new BlockOldLeaf().cr("leaves"));
        Block.a(19, "sponge", new BlockSponge().L(0.6f).a(aSb).cr("sponge"));
        Block.a(20, "glass", new BlockGlass(Material.beG, false).L(0.3f).a(aSe).cr("glass"));
        Block.a(21, "lapis_ore", new BlockOre().L(3.0f).K(5.0f).a(aSc).cr("oreLapis"));
        Block.a(22, "lapis_block", new Block(Material.bet, MapColor.bei).L(3.0f).K(5.0f).a(aSc).cr("blockLapis").a(net.minecraft.creativetab.a.cpx));
        Block.a(23, "dispenser", new BlockDispenser().L(3.5f).a(aSc).cr("dispenser"));
        Block block3 = new BlockSandStone().a(aSc).L(0.8f).cr("sandStone");
        Block.a(24, "sandstone", block3);
        Block.a(25, "noteblock", new BlockNote().L(0.8f).cr("musicBlock"));
        Block.a(26, "bed", new BlockBed().a(aRZ).L(0.2f).cr("bed").xD());
        Block.a(27, "golden_rail", new BlockRailPowered().L(0.7f).a(aSd).cr("goldenRail"));
        Block.a(28, "detector_rail", new BlockRailDetector().L(0.7f).a(aSd).cr("detectorRail"));
        Block.a(29, "sticky_piston", new BlockPistonBase(true).cr("pistonStickyBase"));
        Block.a(30, "web", new BlockWeb().aN(1).L(4.0f).cr("web"));
        Block.a(31, "tallgrass", new BlockTallGrass().L(0.0f).a(aSb).cr("tallgrass"));
        Block.a(32, "deadbush", new BlockDeadBush().L(0.0f).a(aSb).cr("deadbush"));
        Block.a(33, "piston", new BlockPistonBase(false).cr("pistonBase"));
        Block.a(34, "piston_head", new BlockPistonExtension().cr("pistonBase"));
        Block.a(35, "wool", new BlockColored(Material.beB).L(0.8f).a(aSf).cr("cloth"));
        Block.a(36, "piston_extension", (Block)new BlockPistonMoving());
        Block.a(37, "yellow_flower", new BlockYellowFlower().L(0.0f).a(aSb).cr("flower1"));
        Block.a(38, "red_flower", new BlockRedFlower().L(0.0f).a(aSb).cr("flower2"));
        Block block4 = new BlockMushroom().L(0.0f).a(aSb).J(0.125f).cr("mushroom");
        Block.a(39, "brown_mushroom", block4);
        Block block5 = new BlockMushroom().L(0.0f).a(aSb).cr("mushroom");
        Block.a(40, "red_mushroom", block5);
        Block.a(41, "gold_block", new Block(Material.bet, MapColor.beg).L(3.0f).K(10.0f).a(aSd).cr("blockGold").a(net.minecraft.creativetab.a.cpx));
        Block.a(42, "iron_block", new Block(Material.bet, MapColor.bdI).L(5.0f).K(10.0f).a(aSd).cr("blockIron").a(net.minecraft.creativetab.a.cpx));
        Block.a(43, "double_stone_slab", new BlockDoubleStoneSlab().L(2.0f).K(10.0f).a(aSc).cr("stoneSlab"));
        Block.a(44, "stone_slab", new BlockHalfStoneSlab().L(2.0f).K(10.0f).a(aSc).cr("stoneSlab"));
        Block block6 = new Block(Material.bes, MapColor.bee).L(2.0f).K(10.0f).a(aSc).cr("brick").a(net.minecraft.creativetab.a.cpx);
        Block.a(45, "brick_block", block6);
        Block.a(46, "tnt", new BlockTNT().L(0.0f).a(aSb).cr("tnt"));
        Block.a(47, "bookshelf", new BlockBookshelf().L(1.5f).a(aRZ).cr("bookshelf"));
        Block.a(48, "mossy_cobblestone", new Block(Material.bes).L(2.0f).K(10.0f).a(aSc).cr("stoneMoss").a(net.minecraft.creativetab.a.cpx));
        Block.a(49, "obsidian", new BlockObsidian().L(50.0f).K(2000.0f).a(aSc).cr("obsidian"));
        Block.a(50, "torch", new BlockTorch().L(0.0f).J(0.9375f).a(aRZ).cr("torch"));
        Block.a(51, "fire", new BlockFire().L(0.0f).J(1.0f).a(aSf).cr("fire").xD());
        Block.a(52, "mob_spawner", new BlockMobSpawner().L(5.0f).a(aSd).cr("mobSpawner").xD());
        Block.a(53, "oak_stairs", new BlockStairs(block2.xM().a(BlockPlanks.aXI, BlockPlanks$EnumType.aXJ)).cr("stairsWood"));
        Block.a(54, "chest", new BlockChest(0).L(2.5f).a(aRZ).cr("chest"));
        Block.a(55, "redstone_wire", new BlockRedstoneWire().L(0.0f).a(aRY).cr("redstoneDust").xD());
        Block.a(56, "diamond_ore", new BlockOre().L(3.0f).K(5.0f).a(aSc).cr("oreDiamond"));
        Block.a(57, "diamond_block", new Block(Material.bet, MapColor.beh).L(5.0f).K(10.0f).a(aSd).cr("blockDiamond").a(net.minecraft.creativetab.a.cpx));
        Block.a(58, "crafting_table", new BlockWorkbench().L(2.5f).a(aRZ).cr("workbench"));
        Block.a(59, "wheat", new BlockCrops().cr("crops"));
        Block block7 = new BlockFarmland().L(0.6f).a(aSa).cr("farmland");
        Block.a(60, "farmland", block7);
        Block.a(61, "furnace", new BlockFurnace(false).L(3.5f).a(aSc).cr("furnace").a(net.minecraft.creativetab.a.cpy));
        Block.a(62, "lit_furnace", new BlockFurnace(true).L(3.5f).a(aSc).J(0.875f).cr("furnace"));
        Block.a(63, "standing_sign", new BlockStandingSign().L(1.0f).a(aRZ).cr("sign").xD());
        Block.a(64, "wooden_door", new BlockDoor(Material.ber).L(3.0f).a(aRZ).cr("doorOak").xD());
        Block.a(65, "ladder", new BlockLadder().L(0.4f).a(aSi).cr("ladder"));
        Block.a(66, "rail", new BlockRail().L(0.7f).a(aSd).cr("rail"));
        Block.a(67, "stone_stairs", new BlockStairs(block.xM()).cr("stairsStone"));
        Block.a(68, "wall_sign", new BlockWallSign().L(1.0f).a(aRZ).cr("sign").xD());
        Block.a(69, "lever", new BlockLever().L(0.5f).a(aRZ).cr("lever"));
        Block.a(70, "stone_pressure_plate", new BlockPressurePlate(Material.bes, BlockPressurePlate$Sensitivity.aYh).L(0.5f).a(aSc).cr("pressurePlateStone"));
        Block.a(71, "iron_door", new BlockDoor(Material.bet).L(5.0f).a(aSd).cr("doorIron").xD());
        Block.a(72, "wooden_pressure_plate", new BlockPressurePlate(Material.ber, BlockPressurePlate$Sensitivity.aYg).L(0.5f).a(aRZ).cr("pressurePlateWood"));
        Block.a(73, "redstone_ore", new BlockRedstoneOre(false).L(3.0f).K(5.0f).a(aSc).cr("oreRedstone").a(net.minecraft.creativetab.a.cpx));
        Block.a(74, "lit_redstone_ore", new BlockRedstoneOre(true).J(0.625f).L(3.0f).K(5.0f).a(aSc).cr("oreRedstone"));
        Block.a(75, "unlit_redstone_torch", new BlockRedstoneTorch(false).L(0.0f).a(aRZ).cr("notGate"));
        Block.a(76, "redstone_torch", new BlockRedstoneTorch(true).L(0.0f).J(0.5f).a(aRZ).cr("notGate").a(net.minecraft.creativetab.a.cpz));
        Block.a(77, "stone_button", new BlockButtonStone().L(0.5f).a(aSc).cr("button"));
        Block.a(78, "snow_layer", new BlockSnow().L(0.1f).a(aSh).cr("snow").aN(0));
        Block.a(79, "ice", new BlockIce().L(0.5f).aN(3).a(aSe).cr("ice"));
        Block.a(80, "snow", new BlockSnowBlock().L(0.2f).a(aSh).cr("snow"));
        Block.a(81, "cactus", new BlockCactus().L(0.4f).a(aSf).cr("cactus"));
        Block.a(82, "clay", new BlockClay().L(0.6f).a(aSa).cr("clay"));
        Block.a(83, "reeds", new BlockReed().L(0.0f).a(aSb).cr("reeds").xD());
        Block.a(84, "jukebox", new BlockJukebox().L(2.0f).K(10.0f).a(aSc).cr("jukebox"));
        Block.a(85, "fence", new BlockFence(Material.ber, BlockPlanks$EnumType.aXJ.yB()).L(2.0f).K(5.0f).a(aRZ).cr("fence"));
        Block block8 = new BlockPumpkin().L(1.0f).a(aRZ).cr("pumpkin");
        Block.a(86, "pumpkin", block8);
        Block.a(87, "netherrack", new BlockNetherrack().L(0.4f).a(aSc).cr("hellrock"));
        Block.a(88, "soul_sand", new BlockSoulSand().L(0.5f).a(aSg).cr("hellsand"));
        Block.a(89, "glowstone", new BlockGlowstone(Material.beG).L(0.3f).a(aSe).J(1.0f).cr("lightgem"));
        Block.a(90, "portal", new BlockPortal().L(-1.0f).a(aSe).J(0.75f).cr("portal"));
        Block.a(91, "lit_pumpkin", new BlockPumpkin().L(1.0f).a(aRZ).J(1.0f).cr("litpumpkin"));
        Block.a(92, "cake", new BlockCake().L(0.5f).a(aSf).cr("cake").xD());
        Block.a(93, "unpowered_repeater", new BlockRedstoneRepeater(false).L(0.0f).a(aRZ).cr("diode").xD());
        Block.a(94, "powered_repeater", new BlockRedstoneRepeater(true).L(0.0f).a(aRZ).cr("diode").xD());
        Block.a(95, "stained_glass", new BlockStainedGlass(Material.beG).L(0.3f).a(aSe).cr("stainedGlass"));
        Block.a(96, "trapdoor", new BlockTrapDoor(Material.ber).L(3.0f).a(aRZ).cr("trapdoor").xD());
        Block.a(97, "monster_egg", new BlockSilverfish().L(0.75f).cr("monsterStoneEgg"));
        Block block9 = new BlockStoneBrick().L(1.5f).K(10.0f).a(aSc).cr("stonebricksmooth");
        Block.a(98, "stonebrick", block9);
        Block.a(99, "brown_mushroom_block", new BlockHugeMushroom(Material.ber, MapColor.bdM, block4).L(0.2f).a(aRZ).cr("mushroom"));
        Block.a(100, "red_mushroom_block", new BlockHugeMushroom(Material.ber, MapColor.bee, block5).L(0.2f).a(aRZ).cr("mushroom"));
        Block.a(101, "iron_bars", new BlockPane(Material.bet, true).L(5.0f).K(10.0f).a(aSd).cr("fenceIron"));
        Block.a(102, "glass_pane", new BlockPane(Material.beG, false).L(0.3f).a(aSe).cr("thinGlass"));
        Block block10 = new BlockMelon().L(1.0f).a(aRZ).cr("melon");
        Block.a(103, "melon_block", block10);
        Block.a(104, "pumpkin_stem", new BlockStem(block8).L(0.0f).a(aRZ).cr("pumpkinStem"));
        Block.a(105, "melon_stem", new BlockStem(block10).L(0.0f).a(aRZ).cr("pumpkinStem"));
        Block.a(106, "vine", new BlockVine().L(0.2f).a(aSb).cr("vine"));
        Block.a(107, "fence_gate", new BlockFenceGate(BlockPlanks$EnumType.aXJ).L(2.0f).K(5.0f).a(aRZ).cr("fenceGate"));
        Block.a(108, "brick_stairs", new BlockStairs(block6.xM()).cr("stairsBrick"));
        Block.a(109, "stone_brick_stairs", new BlockStairs(block9.xM().a(BlockStoneBrick.bbK, BlockStoneBrick$EnumType.bbP)).cr("stairsStoneBrickSmooth"));
        Block.a(110, "mycelium", new BlockMycelium().L(0.6f).a(aSb).cr("mycel"));
        Block.a(111, "waterlily", new BlockLilyPad().L(0.0f).a(aSb).cr("waterlily"));
        Block block11 = new BlockNetherBrick().L(2.0f).K(10.0f).a(aSc).cr("netherBrick").a(net.minecraft.creativetab.a.cpx);
        Block.a(112, "nether_brick", block11);
        Block.a(113, "nether_brick_fence", new BlockFence(Material.bes, MapColor.bel).L(2.0f).K(10.0f).a(aSc).cr("netherFence"));
        Block.a(114, "nether_brick_stairs", new BlockStairs(block11.xM()).cr("stairsNetherBrick"));
        Block.a(115, "nether_wart", new BlockNetherWart().cr("netherStalk"));
        Block.a(116, "enchanting_table", new BlockEnchantmentTable().L(5.0f).K(2000.0f).cr("enchantmentTable"));
        Block.a(117, "brewing_stand", new BlockBrewingStand().L(0.5f).J(0.125f).cr("brewingStand"));
        Block.a(118, "cauldron", new BlockCauldron().L(2.0f).cr("cauldron"));
        Block.a(119, "end_portal", new BlockEndPortal(Material.beS).L(-1.0f).K(6000000.0f));
        Block.a(120, "end_portal_frame", new BlockEndPortalFrame().a(aSe).J(0.125f).L(-1.0f).cr("endPortalFrame").K(6000000.0f).a(net.minecraft.creativetab.a.cpy));
        Block.a(121, "end_stone", new Block(Material.bes, MapColor.bdE).L(3.0f).K(15.0f).a(aSc).cr("whiteStone").a(net.minecraft.creativetab.a.cpx));
        Block.a(122, "dragon_egg", new BlockDragonEgg().L(3.0f).K(15.0f).a(aSc).J(0.125f).cr("dragonEgg"));
        Block.a(123, "redstone_lamp", new BlockRedstoneLight(false).L(0.3f).a(aSe).cr("redstoneLight").a(net.minecraft.creativetab.a.cpz));
        Block.a(124, "lit_redstone_lamp", new BlockRedstoneLight(true).L(0.3f).a(aSe).cr("redstoneLight"));
        Block.a(125, "double_wooden_slab", new BlockDoubleWoodSlab().L(2.0f).K(5.0f).a(aRZ).cr("woodSlab"));
        Block.a(126, "wooden_slab", new BlockHalfWoodSlab().L(2.0f).K(5.0f).a(aRZ).cr("woodSlab"));
        Block.a(127, "cocoa", new BlockCocoa().L(0.2f).K(5.0f).a(aRZ).cr("cocoa"));
        Block.a(128, "sandstone_stairs", new BlockStairs(block3.xM().a(BlockSandStone.bak, BlockSandStone$EnumType.ban)).cr("stairsSandStone"));
        Block.a(129, "emerald_ore", new BlockOre().L(3.0f).K(5.0f).a(aSc).cr("oreEmerald"));
        Block.a(130, "ender_chest", new BlockEnderChest().L(22.5f).K(1000.0f).a(aSc).cr("enderChest").J(0.5f));
        Block.a(131, "tripwire_hook", new BlockTripWireHook().cr("tripWireSource"));
        Block.a(132, "tripwire", new BlockTripWire().cr("tripWire"));
        Block.a(133, "emerald_block", new Block(Material.bet, MapColor.bej).L(5.0f).K(10.0f).a(aSd).cr("blockEmerald").a(net.minecraft.creativetab.a.cpx));
        Block.a(134, "spruce_stairs", new BlockStairs(block2.xM().a(BlockPlanks.aXI, BlockPlanks$EnumType.aXK)).cr("stairsWoodSpruce"));
        Block.a(135, "birch_stairs", new BlockStairs(block2.xM().a(BlockPlanks.aXI, BlockPlanks$EnumType.aXL)).cr("stairsWoodBirch"));
        Block.a(136, "jungle_stairs", new BlockStairs(block2.xM().a(BlockPlanks.aXI, BlockPlanks$EnumType.aXM)).cr("stairsWoodJungle"));
        Block.a(137, "command_block", new BlockCommandBlock().xh().K(6000000.0f).cr("commandBlock"));
        Block.a(138, "beacon", new BlockBeacon().cr("beacon").J(1.0f));
        Block.a(139, "cobblestone_wall", new BlockWall(block).cr("cobbleWall"));
        Block.a(140, "flower_pot", new BlockFlowerPot().L(0.0f).a(aRY).cr("flowerPot"));
        Block.a(141, "carrots", new BlockCarrot().cr("carrots"));
        Block.a(142, "potatoes", new BlockPotato().cr("potatoes"));
        Block.a(143, "wooden_button", new BlockButtonWood().L(0.5f).a(aRZ).cr("button"));
        Block.a(144, "skull", new BlockSkull().L(1.0f).a(aSc).cr("skull"));
        Block.a(145, "anvil", new BlockAnvil().L(5.0f).a(aSj).K(2000.0f).cr("anvil"));
        Block.a(146, "trapped_chest", new BlockChest(1).L(2.5f).a(aRZ).cr("chestTrap"));
        Block.a(147, "light_weighted_pressure_plate", new BlockPressurePlateWeighted(Material.bet, 15, MapColor.beg).L(0.5f).a(aRZ).cr("weightedPlate_light"));
        Block.a(148, "heavy_weighted_pressure_plate", new BlockPressurePlateWeighted(Material.bet, 150).L(0.5f).a(aRZ).cr("weightedPlate_heavy"));
        Block.a(149, "unpowered_comparator", new BlockRedstoneComparator(false).L(0.0f).a(aRZ).cr("comparator").xD());
        Block.a(150, "powered_comparator", new BlockRedstoneComparator(true).L(0.0f).J(0.625f).a(aRZ).cr("comparator").xD());
        Block.a(151, "daylight_detector", (Block)new BlockDaylightDetector(false));
        Block.a(152, "redstone_block", new BlockCompressedPowered(Material.bet, MapColor.bdG).L(5.0f).K(10.0f).a(aSd).cr("blockRedstone").a(net.minecraft.creativetab.a.cpz));
        Block.a(153, "quartz_ore", new BlockOre(MapColor.bel).L(3.0f).K(5.0f).a(aSc).cr("netherquartz"));
        Block.a(154, "hopper", new BlockHopper().L(3.0f).K(8.0f).a(aSd).cr("hopper"));
        Block block12 = new BlockQuartz().a(aSc).L(0.8f).cr("quartzBlock");
        Block.a(155, "quartz_block", block12);
        Block.a(156, "quartz_stairs", new BlockStairs(block12.xM().a(BlockQuartz.aYC, BlockQuartz$EnumType.aYE)).cr("stairsQuartz"));
        Block.a(157, "activator_rail", new BlockRailPowered().L(0.7f).a(aSd).cr("activatorRail"));
        Block.a(158, "dropper", new BlockDropper().L(3.5f).a(aSc).cr("dropper"));
        Block.a(159, "stained_hardened_clay", new BlockColored(Material.bes).L(1.25f).K(7.0f).a(aSc).cr("clayHardenedStained"));
        Block.a(160, "stained_glass_pane", new BlockStainedGlassPane().L(0.3f).a(aSe).cr("thinStainedGlass"));
        Block.a(161, "leaves2", new BlockNewLeaf().cr("leaves"));
        Block.a(162, "log2", new BlockNewLog().cr("log"));
        Block.a(163, "acacia_stairs", new BlockStairs(block2.xM().a(BlockPlanks.aXI, BlockPlanks$EnumType.aXN)).cr("stairsWoodAcacia"));
        Block.a(164, "dark_oak_stairs", new BlockStairs(block2.xM().a(BlockPlanks.aXI, BlockPlanks$EnumType.aXO)).cr("stairsWoodDarkOak"));
        Block.a(165, "slime", new BlockSlime().cr("slime").a(aSk));
        Block.a(166, "barrier", new BlockBarrier().cr("barrier"));
        Block.a(167, "iron_trapdoor", new BlockTrapDoor(Material.bet).L(5.0f).a(aSd).cr("ironTrapdoor").xD());
        Block.a(168, "prismarine", new BlockPrismarine().L(1.5f).K(10.0f).a(aSc).cr("prismarine"));
        Block.a(169, "sea_lantern", new BlockSeaLantern(Material.beG).L(0.3f).a(aSe).J(1.0f).cr("seaLantern"));
        Block.a(170, "hay_block", new BlockHay().L(0.5f).a(aSb).cr("hayBlock").a(net.minecraft.creativetab.a.cpx));
        Block.a(171, "carpet", new BlockCarpet().L(0.1f).a(aSf).cr("woolCarpet").aN(0));
        Block.a(172, "hardened_clay", new BlockHardenedClay().L(1.25f).K(7.0f).a(aSc).cr("clayHardened"));
        Block.a(173, "coal_block", new Block(Material.bes, MapColor.bef).L(5.0f).K(10.0f).a(aSc).cr("blockCoal").a(net.minecraft.creativetab.a.cpx));
        Block.a(174, "packed_ice", new BlockPackedIce().L(0.5f).a(aSe).cr("icePacked"));
        Block.a(175, "double_plant", (Block)new BlockDoublePlant());
        Block.a(176, "standing_banner", new BlockBanner$BlockBannerStanding().L(1.0f).a(aRZ).cr("banner").xD());
        Block.a(177, "wall_banner", new BlockBanner$BlockBannerHanging().L(1.0f).a(aRZ).cr("banner").xD());
        Block.a(178, "daylight_detector_inverted", (Block)new BlockDaylightDetector(true));
        Block block13 = new BlockRedSandstone().a(aSc).L(0.8f).cr("redSandStone");
        Block.a(179, "red_sandstone", block13);
        Block.a(180, "red_sandstone_stairs", new BlockStairs(block13.xM().a(BlockRedSandstone.aZq, BlockRedSandstone$EnumType.aZt)).cr("stairsRedSandStone"));
        Block.a(181, "double_stone_slab2", new BlockDoubleStoneSlabNew().L(2.0f).K(10.0f).a(aSc).cr("stoneSlab2"));
        Block.a(182, "stone_slab2", new BlockHalfStoneSlabNew().L(2.0f).K(10.0f).a(aSc).cr("stoneSlab2"));
        Block.a(183, "spruce_fence_gate", new BlockFenceGate(BlockPlanks$EnumType.aXK).L(2.0f).K(5.0f).a(aRZ).cr("spruceFenceGate"));
        Block.a(184, "birch_fence_gate", new BlockFenceGate(BlockPlanks$EnumType.aXL).L(2.0f).K(5.0f).a(aRZ).cr("birchFenceGate"));
        Block.a(185, "jungle_fence_gate", new BlockFenceGate(BlockPlanks$EnumType.aXM).L(2.0f).K(5.0f).a(aRZ).cr("jungleFenceGate"));
        Block.a(186, "dark_oak_fence_gate", new BlockFenceGate(BlockPlanks$EnumType.aXO).L(2.0f).K(5.0f).a(aRZ).cr("darkOakFenceGate"));
        Block.a(187, "acacia_fence_gate", new BlockFenceGate(BlockPlanks$EnumType.aXN).L(2.0f).K(5.0f).a(aRZ).cr("acaciaFenceGate"));
        Block.a(188, "spruce_fence", new BlockFence(Material.ber, BlockPlanks$EnumType.aXK.yB()).L(2.0f).K(5.0f).a(aRZ).cr("spruceFence"));
        Block.a(189, "birch_fence", new BlockFence(Material.ber, BlockPlanks$EnumType.aXL.yB()).L(2.0f).K(5.0f).a(aRZ).cr("birchFence"));
        Block.a(190, "jungle_fence", new BlockFence(Material.ber, BlockPlanks$EnumType.aXM.yB()).L(2.0f).K(5.0f).a(aRZ).cr("jungleFence"));
        Block.a(191, "dark_oak_fence", new BlockFence(Material.ber, BlockPlanks$EnumType.aXO.yB()).L(2.0f).K(5.0f).a(aRZ).cr("darkOakFence"));
        Block.a(192, "acacia_fence", new BlockFence(Material.ber, BlockPlanks$EnumType.aXN.yB()).L(2.0f).K(5.0f).a(aRZ).cr("acaciaFence"));
        Block.a(193, "spruce_door", new BlockDoor(Material.ber).L(3.0f).a(aRZ).cr("doorSpruce").xD());
        Block.a(194, "birch_door", new BlockDoor(Material.ber).L(3.0f).a(aRZ).cr("doorBirch").xD());
        Block.a(195, "jungle_door", new BlockDoor(Material.ber).L(3.0f).a(aRZ).cr("doorJungle").xD());
        Block.a(196, "acacia_door", new BlockDoor(Material.ber).L(3.0f).a(aRZ).cr("doorAcacia").xD());
        Block.a(197, "dark_oak_door", new BlockDoor(Material.ber).L(3.0f).a(aRZ).cr("doorDarkOak").xD());
        aRV.atx();
        for (Block block14 : aRV) {
            boolean bl2;
            if (block14.aSD == Material.beo) {
                block14.aSp = false;
                continue;
            }
            boolean bl3 = false;
            boolean bl4 = block14 instanceof BlockStairs;
            n2 = block14 instanceof BlockSlab;
            boolean bl5 = block14 == block7;
            boolean bl6 = block14.aSn;
            boolean bl7 = bl2 = block14.aSm == 0;
            if (bl4 || n2 != 0 || bl5 || bl6 || bl2) {
                bl3 = true;
            }
            block14.aSp = bl3;
        }
        for (Block block14 : aRV) {
            for (IBlockState iBlockState : block14.xL().zQ()) {
                n2 = aRV.z(block14) << 4 | block14.c(iBlockState);
                aRW.a(iBlockState, n2);
            }
        }
    }

    private static void a(int n2, cm cm2, Block block) {
        aRV.a(n2, cm2, block);
    }

    private static void a(int n2, String string, Block block) {
        Block.a(n2, new cm(string), block);
    }
}

