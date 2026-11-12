/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.chunk.storage;

import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import net.minecraft.util.b;
import net.minecraft.util.g;
import net.minecraft.world.biome.aj;
import net.minecraft.world.biome.j;
import net.minecraft.world.chunk.i;
import net.minecraft.world.chunk.storage.f;

public class e {
    public static f M(n n2) {
        int n3 = n2.eG("xPos");
        int n4 = n2.eG("zPos");
        f f2 = new f(n3, n4);
        f2.dJy = n2.eL("Blocks");
        f2.dJx = new net.minecraft.world.chunk.storage.i(n2.eL("Data"), 7);
        f2.dJw = new net.minecraft.world.chunk.storage.i(n2.eL("SkyLight"), 7);
        f2.dJv = new net.minecraft.world.chunk.storage.i(n2.eL("BlockLight"), 7);
        f2.dJu = n2.eL("HeightMap");
        f2.dJt = n2.eO("TerrainPopulated");
        f2.dJz = n2.D("Entities", 10);
        f2.dJA = n2.D("TileEntities", 10);
        f2.dJB = n2.D("TileTicks", 10);
        try {
            f2.dJs = n2.eH("LastUpdate");
        }
        catch (ClassCastException classCastException) {
            f2.dJs = n2.eG("LastUpdate");
        }
        return f2;
    }

    public static void a(f f2, n n2, aj aj2) {
        int n3;
        n2.B("xPos", f2.dJC);
        n2.B("zPos", f2.dJD);
        n2.d("LastUpdate", f2.dJs);
        int[] nArray = new int[f2.dJu.length];
        for (int i2 = 0; i2 < f2.dJu.length; ++i2) {
            nArray[i2] = f2.dJu[i2];
        }
        n2.a("HeightMap", nArray);
        n2.o("TerrainPopulated", f2.dJt);
        v v2 = new v();
        for (int i3 = 0; i3 < 8; ++i3) {
            int n4;
            boolean bl2 = true;
            for (n3 = 0; n3 < 16 && bl2; ++n3) {
                block3: for (int i4 = 0; i4 < 16 && bl2; ++i4) {
                    for (int i5 = 0; i5 < 16; ++i5) {
                        int n5 = n3 << 11 | i5 << 7 | i4 + (i3 << 4);
                        n4 = f2.dJy[n5];
                        if (n4 == 0) continue;
                        bl2 = false;
                        continue block3;
                    }
                }
            }
            if (bl2) continue;
            byte[] byArray = new byte[4096];
            i i6 = new i();
            i i7 = new i();
            i i8 = new i();
            for (n4 = 0; n4 < 16; ++n4) {
                for (int i9 = 0; i9 < 16; ++i9) {
                    for (int i10 = 0; i10 < 16; ++i10) {
                        int n6 = n4 << 11 | i10 << 7 | i9 + (i3 << 4);
                        byte by2 = f2.dJy[n6];
                        byArray[i9 << 8 | i10 << 4 | n4] = (byte)(by2 & 0xFF);
                        i6.u(n4, i9, i10, f2.dJx.T(n4, i9 + (i3 << 4), i10));
                        i7.u(n4, i9, i10, f2.dJw.T(n4, i9 + (i3 << 4), i10));
                        i8.u(n4, i9, i10, f2.dJv.T(n4, i9 + (i3 << 4), i10));
                    }
                }
            }
            n n7 = new n();
            n7.a("Y", (byte)(i3 & 0xFF));
            n7.a("Blocks", byArray);
            n7.a("Data", i6.axQ());
            n7.a("SkyLight", i7.axQ());
            n7.a("BlockLight", i8.axQ());
            v2.a(n7);
        }
        n2.b("Sections", v2);
        byte[] byArray = new byte[256];
        g g2 = new g();
        for (n3 = 0; n3 < 16; ++n3) {
            for (int i11 = 0; i11 < 16; ++i11) {
                g2.E(f2.dJC << 4 | n3, 0, f2.dJD << 4 | i11);
                byArray[i11 << 4 | n3] = (byte)(aj2.b((b)g2, (j)j.dGT).dHo & 0xFF);
            }
        }
        n2.a("Biomes", byArray);
        n2.b("Entities", f2.dJz);
        n2.b("TileEntities", f2.dJA);
        if (f2.dJB != null) {
            n2.b("TileTicks", f2.dJB);
        }
    }
}

