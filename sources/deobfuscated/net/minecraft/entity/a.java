/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.commons.lang3.ObjectUtils
 */
package net.minecraft.entity;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import net.minecraft.crash.i;
import net.minecraft.entity.b;
import net.minecraft.entity.c;
import net.minecraft.item.co;
import net.minecraft.network.ak;
import net.minecraft.util.cl;
import net.minecraft.util.cn;
import net.minecraft.world.biome.j;
import org.apache.commons.lang3.ObjectUtils;

public class a {
    private final c cri;
    private boolean crj = true;
    private static final Map<Class<?>, Integer> crk = Maps.newHashMap();
    private final Map<Integer, b> crl = Maps.newHashMap();
    private boolean crm;
    private final ReadWriteLock crn = new ReentrantReadWriteLock();
    public j cro = j.dGg;
    public net.minecraft.util.b crp = net.minecraft.util.b.dtN;

    public a(c c2) {
        this.cri = c2;
    }

    public <T> void a(int n2, T t2) {
        Integer n3 = crk.get(t2.getClass());
        if (n3 == null) {
            throw new IllegalArgumentException("Unknown data type: " + String.valueOf(t2.getClass()));
        }
        if (n2 > 31) {
            throw new IllegalArgumentException("Data value id is too big with " + n2 + "! (Max is 31)");
        }
        if (this.crl.containsKey(n2)) {
            throw new IllegalArgumentException("Duplicate id value for " + n2 + "!");
        }
        b b2 = new b(n3, n2, t2);
        this.crn.writeLock().lock();
        this.crl.put(n2, b2);
        this.crn.writeLock().unlock();
        this.crj = false;
    }

    public void am(int n2, int n3) {
        b b2 = new b(n3, n2, null);
        this.crn.writeLock().lock();
        this.crl.put(n2, b2);
        this.crn.writeLock().unlock();
        this.crj = false;
    }

    public byte el(int n2) {
        return (Byte)this.er(n2).Tm();
    }

    public short em(int n2) {
        return (Short)this.er(n2).Tm();
    }

    public int en(int n2) {
        return (Integer)this.er(n2).Tm();
    }

    public float eo(int n2) {
        return ((Float)this.er(n2).Tm()).floatValue();
    }

    public String ep(int n2) {
        return (String)this.er(n2).Tm();
    }

    public co eq(int n2) {
        return (co)this.er(n2).Tm();
    }

    private b er(int n2) {
        b b2;
        this.crn.readLock().lock();
        try {
            b2 = this.crl.get(n2);
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Getting synched entity data");
            i i2 = a2.dY("Synched entity data");
            i2.b("Data ID", n2);
            throw new cl(a2);
        }
        this.crn.readLock().unlock();
        return b2;
    }

    public cn es(int n2) {
        return (cn)this.er(n2).Tm();
    }

    public <T> void b(int n2, T t2) {
        b b2 = this.er(n2);
        if (ObjectUtils.notEqual(t2, (Object)b2.Tm())) {
            b2.q(t2);
            this.cri.eA(n2);
            b2.aC(true);
            this.crm = true;
        }
    }

    public void et(int n2) {
        this.er((int)n2).crt = true;
        this.crm = true;
    }

    public boolean Tg() {
        return this.crm;
    }

    public static void a(List<b> list, ak ak2) {
        if (list != null) {
            for (b b2 : list) {
                a.a(ak2, b2);
            }
        }
        ak2.writeByte(127);
    }

    public List<b> Th() {
        ArrayList arrayList = null;
        if (this.crm) {
            this.crn.readLock().lock();
            for (b b2 : this.crl.values()) {
                if (!b2.Tn()) continue;
                b2.aC(false);
                if (arrayList == null) {
                    arrayList = Lists.newArrayList();
                }
                arrayList.add(b2);
            }
            this.crn.readLock().unlock();
        }
        this.crm = false;
        return arrayList;
    }

    public void c(ak ak2) {
        this.crn.readLock().lock();
        for (b b2 : this.crl.values()) {
            a.a(ak2, b2);
        }
        this.crn.readLock().unlock();
        ak2.writeByte(127);
    }

    public List<b> Ti() {
        ArrayList arrayList = null;
        this.crn.readLock().lock();
        for (b b2 : this.crl.values()) {
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            arrayList.add(b2);
        }
        this.crn.readLock().unlock();
        return arrayList;
    }

    private static void a(ak ak2, b b2) {
        int n2 = (b2.getObjectType() << 5 | b2.Tl() & 0x1F) & 0xFF;
        ak2.writeByte(n2);
        switch (b2.getObjectType()) {
            case 0: {
                ak2.writeByte(((Byte)b2.Tm()).byteValue());
                break;
            }
            case 1: {
                ak2.writeShort(((Short)b2.Tm()).shortValue());
                break;
            }
            case 2: {
                ak2.writeInt((Integer)b2.Tm());
                break;
            }
            case 3: {
                ak2.writeFloat(((Float)b2.Tm()).floatValue());
                break;
            }
            case 4: {
                ak2.eS((String)b2.Tm());
                break;
            }
            case 5: {
                co co2 = (co)b2.Tm();
                ak2.aO(co2);
                break;
            }
            case 6: {
                net.minecraft.util.b b3 = (net.minecraft.util.b)b2.Tm();
                ak2.writeInt(b3.wt());
                ak2.writeInt(b3.wu());
                ak2.writeInt(b3.wx());
                break;
            }
            case 7: {
                cn cn2 = (cn)b2.Tm();
                ak2.writeFloat(cn2.getX());
                ak2.writeFloat(cn2.getY());
                ak2.writeFloat(cn2.getZ());
            }
        }
    }

    public static List<b> d(ak ak2) {
        ArrayList arrayList = null;
        byte by2 = ak2.readByte();
        while (by2 != 127) {
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            int n2 = (by2 & 0xE0) >> 5;
            int n3 = by2 & 0x1F;
            b b2 = null;
            switch (n2) {
                case 0: {
                    b2 = new b(n2, n3, ak2.readByte());
                    break;
                }
                case 1: {
                    b2 = new b(n2, n3, ak2.readShort());
                    break;
                }
                case 2: {
                    b2 = new b(n2, n3, ak2.readInt());
                    break;
                }
                case 3: {
                    b2 = new b(n2, n3, Float.valueOf(ak2.readFloat()));
                    break;
                }
                case 4: {
                    b2 = new b(n2, n3, ak2.gs(Short.MAX_VALUE));
                    break;
                }
                case 5: {
                    b2 = new b(n2, n3, ak2.afA());
                    break;
                }
                case 6: {
                    int n4 = ak2.readInt();
                    int n5 = ak2.readInt();
                    int n6 = ak2.readInt();
                    b2 = new b(n2, n3, new net.minecraft.util.b(n4, n5, n6));
                    break;
                }
                case 7: {
                    float f2 = ak2.readFloat();
                    float f3 = ak2.readFloat();
                    float f4 = ak2.readFloat();
                    b2 = new b(n2, n3, new cn(f2, f3, f4));
                }
            }
            arrayList.add(b2);
            by2 = ak2.readByte();
        }
        return arrayList;
    }

    public void B(List<b> list) {
        this.crn.writeLock().lock();
        for (b b2 : list) {
            b b3 = this.crl.get(b2.Tl());
            if (b3 == null) continue;
            b3.q(b2.Tm());
            this.cri.eA(b2.Tl());
        }
        this.crn.writeLock().unlock();
        this.crm = true;
    }

    public boolean Tj() {
        return this.crj;
    }

    public void Tk() {
        this.crm = false;
    }

    static {
        crk.put(Byte.class, 0);
        crk.put(Short.class, 1);
        crk.put(Integer.class, 2);
        crk.put(Float.class, 3);
        crk.put(String.class, 4);
        crk.put(co.class, 5);
        crk.put(net.minecraft.util.b.class, 6);
        crk.put(cn.class, 7);
    }
}

