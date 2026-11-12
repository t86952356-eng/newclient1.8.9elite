/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.aa;
import net.minecraft.init.Blocks;
import net.minecraft.util.be;
import net.minecraft.util.db;
import net.minecraft.world.b;
import net.minecraft.world.chunk.a;
import net.minecraft.world.chunk.f;
import net.minecraft.world.gen.feature.l;
import net.minecraft.world.gen.feature.v;
import net.minecraft.world.gen.j;
import net.minecraft.world.gen.k;
import net.minecraft.world.gen.structure.bb;
import net.minecraft.world.gen.structure.h;
import net.minecraft.world.gen.structure.m;
import net.minecraft.world.gen.structure.o;
import net.minecraft.world.gen.structure.u;
import net.minecraft.world.w;

public class c
implements net.minecraft.world.chunk.h {
    private final w dKx;
    private final Random dKy;
    private final IBlockState[] dKz = new IBlockState[256];
    private final j dKA;
    private final List<o> dKB = Lists.newArrayList();
    private final boolean dKC;
    private final boolean dKD;
    private v dKE;
    private v dKF;

    public c(w w2, long l2, boolean bl2, String string) {
        this.dKx = w2;
        this.dKy = new Random(l2);
        this.dKA = j.gJ(string);
        if (bl2) {
            Map<String, Map<String, String>> map = this.dKA.ayk();
            if (map.containsKey("village")) {
                Map<String, String> map2 = map.get("village");
                if (!map2.containsKey("size")) {
                    map2.put("size", "1");
                }
                this.dKB.add(new u(map2));
            }
            if (map.containsKey("biome_1")) {
                this.dKB.add(new net.minecraft.world.gen.structure.k(map.get("biome_1")));
            }
            if (map.containsKey("mineshaft")) {
                this.dKB.add(new h(map.get("mineshaft")));
            }
            if (map.containsKey("stronghold")) {
                this.dKB.add(new m(map.get("stronghold")));
            }
            if (map.containsKey("oceanmonument")) {
                this.dKB.add(new bb(map.get("oceanmonument")));
            }
        }
        if (this.dKA.ayk().containsKey("lake")) {
            this.dKE = new v(Blocks.cLl);
        }
        if (this.dKA.ayk().containsKey("lava_lake")) {
            this.dKF = new v(Blocks.cLn);
        }
        this.dKD = this.dKA.ayk().containsKey("dungeon");
        int n2 = 0;
        int n3 = 0;
        boolean bl3 = true;
        for (k k2 : this.dKA.ayl()) {
            for (int i2 = k2.ays(); i2 < k2.ays() + k2.ayo(); ++i2) {
                IBlockState iBlockState = k2.ayp();
                if (iBlockState.df() == Blocks.cLc) continue;
                bl3 = false;
                this.dKz[i2] = iBlockState;
            }
            if (k2.ayp().df() == Blocks.cLc) {
                n3 += k2.ayo();
                continue;
            }
            n2 += k2.ayo() + n3;
            n3 = 0;
        }
        w2.id(n2);
        this.dKC = !bl3 && this.dKA.ayk().containsKey("decoration");
    }

    @Override
    public a H(int n2, int n3) {
        int n4;
        f f2 = new f();
        for (int i2 = 0; i2 < this.dKz.length; ++i2) {
            IBlockState object2 = this.dKz[i2];
            if (object2 == null) continue;
            for (int i3 = 0; i3 < 16; ++i3) {
                for (n4 = 0; n4 < 16; ++n4) {
                    f2.a(i3, i2, n4, object2);
                }
            }
        }
        for (net.minecraft.world.gen.m m2 : this.dKB) {
            m2.a(this, this.dKx, n2, n3, f2);
        }
        a a2 = new a(this.dKx, f2, n2, n3);
        net.minecraft.world.biome.j[] jArray = this.dKx.avp().b(null, n2 * 16, n3 * 16, 16, 16);
        byte[] byArray = a2.axD();
        for (n4 = 0; n4 < byArray.length; ++n4) {
            byArray[n4] = (byte)jArray[n4].dHo;
        }
        a2.axy();
        return a2;
    }

    @Override
    public boolean E(int n2, int n3) {
        return true;
    }

    @Override
    public void a(net.minecraft.world.chunk.h h2, int n2, int n3) {
        int n4 = n2 * 16;
        int n5 = n3 * 16;
        net.minecraft.util.b b2 = new net.minecraft.util.b(n4, 0, n5);
        net.minecraft.world.biome.j j2 = this.dKx.aF(new net.minecraft.util.b(n4 + 16, 0, n5 + 16));
        boolean bl2 = false;
        this.dKy.setSeed(this.dKx.avD());
        long l2 = this.dKy.nextLong() / 2L * 2L + 1L;
        long l3 = this.dKy.nextLong() / 2L * 2L + 1L;
        this.dKy.setSeed((long)n2 * l2 + (long)n3 * l3 ^ this.dKx.avD());
        b b3 = new b(n2, n3);
        Object object = this.dKB.iterator();
        while (object.hasNext()) {
            o o2 = object.next();
            boolean bl3 = o2.a(this.dKx, this.dKy, b3);
            if (!(o2 instanceof u)) continue;
            bl2 |= bl3;
        }
        if (this.dKE != null && !bl2 && this.dKy.nextInt(4) == 0) {
            this.dKE.b(this.dKx, this.dKy, b2.C(this.dKy.nextInt(16) + 8, this.dKy.nextInt(256), this.dKy.nextInt(16) + 8));
        }
        if (!(this.dKF == null || bl2 || this.dKy.nextInt(8) != 0 || ((db)(object = b2.C(this.dKy.nextInt(16) + 8, this.dKy.nextInt(this.dKy.nextInt(248) + 8), this.dKy.nextInt(16) + 8))).wu() >= this.dKx.avB() && this.dKy.nextInt(10) != 0)) {
            this.dKF.b(this.dKx, this.dKy, (net.minecraft.util.b)object);
        }
        if (this.dKD) {
            for (int i2 = 0; i2 < 8; ++i2) {
                new l().b(this.dKx, this.dKy, b2.C(this.dKy.nextInt(16) + 8, this.dKy.nextInt(256), this.dKy.nextInt(16) + 8));
            }
        }
        if (this.dKC) {
            j2.a(this.dKx, this.dKy, b2);
        }
    }

    @Override
    public boolean a(net.minecraft.world.chunk.h h2, a a2, int n2, int n3) {
        return false;
    }

    @Override
    public boolean a(boolean bl2, be be2) {
        return true;
    }

    @Override
    public void Hj() {
    }

    @Override
    public boolean Hk() {
        return false;
    }

    @Override
    public boolean Hl() {
        return true;
    }

    @Override
    public String Hm() {
        return "FlatLevelSource";
    }

    @Override
    public List<net.minecraft.world.biome.m> a(aa aa2, net.minecraft.util.b b2) {
        net.minecraft.world.biome.j j2 = this.dKx.aF(b2);
        return j2.a(aa2);
    }

    @Override
    public net.minecraft.util.b a(w w2, String string, net.minecraft.util.b b2) {
        if ("Stronghold".equals(string)) {
            for (o o2 : this.dKB) {
                if (!(o2 instanceof m)) continue;
                return o2.am(w2, b2);
            }
        }
        return null;
    }

    @Override
    public int Hn() {
        return 0;
    }

    @Override
    public void a(a a2, int n2, int n3) {
        for (o o2 : this.dKB) {
            o2.a(this, this.dKx, n2, n3, null);
        }
    }

    @Override
    public a H(net.minecraft.util.b b2) {
        return this.H(b2.wt() >> 4, b2.wx() >> 4);
    }
}

