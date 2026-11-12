/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.chunk.storage;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.block.Block;
import net.minecraft.entity.c;
import net.minecraft.entity.n;
import net.minecraft.nbt.v;
import net.minecraft.tileentity.d;
import net.minecraft.util.cm;
import net.minecraft.world.b;
import net.minecraft.world.chunk.i;
import net.minecraft.world.chunk.storage.g;
import net.minecraft.world.chunk.storage.h;
import net.minecraft.world.chunk.storage.l;
import net.minecraft.world.s;
import net.minecraft.world.storage.e;
import net.minecraft.world.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a
implements h,
e {
    private static final Logger dJm = LogManager.getLogger();
    private final Map<b, net.minecraft.nbt.n> dJn = new ConcurrentHashMap<b, net.minecraft.nbt.n>();
    private final Set<b> dJo = Collections.newSetFromMap(new ConcurrentHashMap());
    private final File dJp;
    private boolean dJq = false;

    public a(File file) {
        this.dJp = file;
    }

    @Override
    public net.minecraft.world.chunk.a b(w w2, int n2, int n3) {
        b b2 = new b(n2, n3);
        net.minecraft.nbt.n n4 = this.dJn.get(b2);
        if (n4 == null) {
            DataInputStream dataInputStream = l.b(this.dJp, n2, n3);
            if (dataInputStream == null) {
                return null;
            }
            n4 = net.minecraft.nbt.a.a(dataInputStream);
        }
        return this.a(w2, n2, n3, n4);
    }

    protected net.minecraft.world.chunk.a a(w w2, int n2, int n3, net.minecraft.nbt.n n4) {
        if (!n4.C("Level", 10)) {
            dJm.error("Chunk file at " + n2 + "," + n3 + " is missing level data, skipping");
            return null;
        }
        net.minecraft.nbt.n n5 = n4.eN("Level");
        if (!n5.C("Sections", 9)) {
            dJm.error("Chunk file at " + n2 + "," + n3 + " is missing block data, skipping");
            return null;
        }
        net.minecraft.world.chunk.a a2 = this.a(w2, n5);
        if (!a2.aT(n2, n3)) {
            dJm.error("Chunk file at " + n2 + "," + n3 + " is in the wrong location; relocating. (Expected " + n2 + ", " + n3 + ", got " + a2.dIK + ", " + a2.dIL + ")");
            n5.B("xPos", n2);
            n5.B("zPos", n3);
            a2 = this.a(w2, n5);
        }
        return a2;
    }

    @Override
    public void a(w w2, net.minecraft.world.chunk.a a2) {
        w2.avC();
        try {
            net.minecraft.nbt.n n2 = new net.minecraft.nbt.n();
            net.minecraft.nbt.n n3 = new net.minecraft.nbt.n();
            n2.b("Level", n3);
            this.a(a2, w2, n3);
            this.a(a2.axC(), n2);
        }
        catch (Exception exception) {
            dJm.error("Failed to save chunk", (Throwable)exception);
        }
    }

    protected void a(b b2, net.minecraft.nbt.n n2) {
        if (!this.dJo.contains(b2)) {
            this.dJn.put(b2, n2);
        }
        net.minecraft.world.storage.n.azI().a(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean axR() {
        boolean bl2;
        if (this.dJn.isEmpty()) {
            if (this.dJq) {
                dJm.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", new Object[]{this.dJp.getName()});
            }
            return false;
        }
        b b2 = this.dJn.keySet().iterator().next();
        try {
            this.dJo.add(b2);
            net.minecraft.nbt.n n2 = this.dJn.remove(b2);
            if (n2 != null) {
                try {
                    this.b(b2, n2);
                }
                catch (Exception exception) {
                    dJm.error("Failed to save chunk", (Throwable)exception);
                }
            }
            bl2 = true;
        }
        finally {
            this.dJo.remove(b2);
        }
        return bl2;
    }

    private void b(b b2, net.minecraft.nbt.n n2) {
        DataOutputStream dataOutputStream = l.c(this.dJp, b2.dBK, b2.dBL);
        net.minecraft.nbt.a.a(n2, (DataOutput)dataOutputStream);
        dataOutputStream.close();
    }

    @Override
    public void b(w w2, net.minecraft.world.chunk.a a2) {
    }

    @Override
    public void axS() {
    }

    @Override
    public void Hj() {
        try {
            this.dJq = true;
            while (true) {
                if (this.axR()) continue;
            }
        }
        catch (Throwable throwable) {
            this.dJq = false;
            throw throwable;
        }
    }

    private void a(net.minecraft.world.chunk.a a2, w w2, net.minecraft.nbt.n n2) {
        Object object;
        Object object2;
        Object object3;
        net.minecraft.nbt.n n3;
        n2.a("V", (byte)1);
        n2.B("xPos", a2.dIK);
        n2.B("zPos", a2.dIL);
        n2.d("LastUpdate", w2.getTotalWorldTime());
        n2.a("HeightMap", a2.axI());
        n2.o("TerrainPopulated", a2.axL());
        n2.o("LightPopulated", a2.axM());
        n2.d("InhabitedTime", a2.axO());
        g[] gArray = a2.axw();
        v v2 = new v();
        boolean bl2 = !w2.dDl.awf();
        for (g object4 : gArray) {
            if (object4 == null) continue;
            n3 = new net.minecraft.nbt.n();
            n3.a("Y", (byte)(object4.axX() >> 4 & 0xFF));
            object3 = new byte[object4.axZ().length];
            object2 = new i();
            object = null;
            for (int i2 = 0; i2 < object4.axZ().length; ++i2) {
                char c2 = object4.axZ()[i2];
                int n4 = i2 & 0xF;
                int n5 = i2 >> 8 & 0xF;
                int n6 = i2 >> 4 & 0xF;
                if (c2 >> 12 != 0) {
                    if (object == null) {
                        object = new i();
                    }
                    ((i)object).u(n4, n5, n6, c2 >> 12);
                }
                object3[i2] = (byte)(c2 >> 4 & 0xFF);
                ((i)object2).u(n4, n5, n6, c2 & 0xF);
            }
            n3.a("Blocks", (byte[])object3);
            n3.a("Data", ((i)object2).axQ());
            if (object != null) {
                n3.a("Add", ((i)object).axQ());
            }
            n3.a("BlockLight", object4.aya().axQ());
            if (bl2) {
                n3.a("SkyLight", object4.ayb().axQ());
            } else {
                n3.a("SkyLight", new byte[object4.aya().axQ().length]);
            }
            v2.a(n3);
        }
        n2.b("Sections", v2);
        n2.a("Biomes", a2.axD());
        a2.cD(false);
        v v3 = new v();
        for (int i3 = 0; i3 < a2.axK().length; ++i3) {
            for (c c3 : a2.axK()[i3]) {
                if (!c3.k(n3 = new net.minecraft.nbt.n())) continue;
                a2.cD(true);
                v3.a(n3);
            }
        }
        n2.b("Entities", v3);
        v v4 = new v();
        for (d d2 : a2.axJ().values()) {
            n3 = new net.minecraft.nbt.n();
            d2.b(n3);
            v4.a(n3);
        }
        n2.b("TileEntities", v4);
        List<s> list = w2.a(a2, false);
        if (list != null) {
            long l2 = w2.getTotalWorldTime();
            object3 = new v();
            object2 = list.iterator();
            while (object2.hasNext()) {
                object = (s)object2.next();
                net.minecraft.nbt.n n7 = new net.minecraft.nbt.n();
                cm cm2 = (cm)Block.aRV.y(((s)object).df());
                n7.R("i", cm2 == null ? "" : cm2.toString());
                n7.B("x", ((s)object).dCC.wt());
                n7.B("y", ((s)object).dCC.wu());
                n7.B("z", ((s)object).dCC.wx());
                n7.B("t", (int)(((s)object).dCD - l2));
                n7.B("p", ((s)object).hH);
                ((v)object3).a(n7);
            }
            n2.b("TileTicks", (net.minecraft.nbt.g)object3);
        }
    }

    private net.minecraft.world.chunk.a a(w w2, net.minecraft.nbt.n n2) {
        v v2;
        v v3;
        v v4;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        int n3 = n2.eG("xPos");
        int n4 = n2.eG("zPos");
        net.minecraft.world.chunk.a a2 = new net.minecraft.world.chunk.a(w2, n3, n4);
        a2.n(n2.eM("HeightMap"));
        a2.cA(n2.eO("TerrainPopulated"));
        a2.cB(n2.eO("LightPopulated"));
        a2.N(n2.eH("InhabitedTime"));
        v v5 = n2.D("Sections", 10);
        int n5 = 16;
        g[] gArray = new g[16];
        boolean bl2 = !w2.dDl.awf();
        for (int i2 = 0; i2 < v5.aeS(); ++i2) {
            net.minecraft.nbt.n n6 = v5.gi(i2);
            byte by2 = n6.eE("Y");
            object4 = new g(by2 << 4, bl2);
            object3 = n6.eL("Blocks");
            object2 = new i(n6.eL("Data"));
            object = n6.C("Add", 7) ? new i(n6.eL("Add")) : null;
            char[] cArray = new char[((byte[])object3).length];
            for (int i3 = 0; i3 < cArray.length; ++i3) {
                int n7 = i3 & 0xF;
                int n8 = i3 >> 8 & 0xF;
                int n9 = i3 >> 4 & 0xF;
                int n10 = object != null ? ((i)object).T(n7, n8, n9) : 0;
                cArray[i3] = (char)(n10 << 12 | (object3[i3] & 0xFF) << 4 | ((i)object2).T(n7, n8, n9));
            }
            ((g)object4).a(cArray);
            ((g)object4).a(new i(n6.eL("BlockLight")));
            if (bl2) {
                ((g)object4).b(new i(n6.eL("SkyLight")));
            }
            ((g)object4).axY();
            gArray[by2] = object4;
        }
        a2.a(gArray);
        if (n2.C("Biomes", 7)) {
            a2.m(n2.eL("Biomes"));
        }
        if ((v4 = n2.D("Entities", 10)) != null) {
            for (int i4 = 0; i4 < v4.aeS(); ++i4) {
                net.minecraft.nbt.n n11 = v4.gi(i4);
                object4 = n.a(n11, w2);
                a2.cD(true);
                if (object4 == null) continue;
                a2.aE((c)object4);
                object3 = object4;
                object2 = n11;
                while (((net.minecraft.nbt.n)object2).C("Riding", 10)) {
                    object = n.a(((net.minecraft.nbt.n)object2).eN("Riding"), w2);
                    if (object != null) {
                        a2.aE((c)object);
                        ((c)object3).D((c)object);
                    }
                    object3 = object;
                    object2 = ((net.minecraft.nbt.n)object2).eN("Riding");
                }
            }
        }
        if ((v3 = n2.D("TileEntities", 10)) != null) {
            for (int i5 = 0; i5 < v3.aeS(); ++i5) {
                object4 = v3.gi(i5);
                object3 = d.D((net.minecraft.nbt.n)object4);
                if (object3 == null) continue;
                a2.a((d)object3);
            }
        }
        if (n2.C("TileTicks", 9) && (v2 = n2.D("TileTicks", 10)) != null) {
            for (int i6 = 0; i6 < v2.aeS(); ++i6) {
                object3 = v2.gi(i6);
                object2 = ((net.minecraft.nbt.n)object3).C("i", 8) ? Block.cq(((net.minecraft.nbt.n)object3).eK("i")) : Block.aK(((net.minecraft.nbt.n)object3).eG("i"));
                w2.b(new net.minecraft.util.b(((net.minecraft.nbt.n)object3).eG("x"), ((net.minecraft.nbt.n)object3).eG("y"), ((net.minecraft.nbt.n)object3).eG("z")), (Block)object2, ((net.minecraft.nbt.n)object3).eG("t"), ((net.minecraft.nbt.n)object3).eG("p"));
            }
        }
        return a2;
    }
}

