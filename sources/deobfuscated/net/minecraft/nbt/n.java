/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.nbt;

import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import net.minecraft.crash.a;
import net.minecraft.crash.i;
import net.minecraft.nbt.g;
import net.minecraft.nbt.h;
import net.minecraft.nbt.j;
import net.minecraft.nbt.l;
import net.minecraft.nbt.m;
import net.minecraft.nbt.o;
import net.minecraft.nbt.p;
import net.minecraft.nbt.q;
import net.minecraft.nbt.s;
import net.minecraft.nbt.t;
import net.minecraft.nbt.u;
import net.minecraft.nbt.v;
import net.minecraft.nbt.w;
import net.minecraft.nbt.y;
import net.minecraft.nbt.z;
import net.minecraft.util.cl;

public class n
extends g {
    private final Map<String, g> cYq = Maps.newHashMap();

    @Override
    void a(DataOutput dataOutput) {
        for (String string : this.cYq.keySet()) {
            g g2 = this.cYq.get(string);
            n.a(string, g2, dataOutput);
        }
        dataOutput.writeByte(0);
    }

    @Override
    void b(DataInput dataInput, int n2, j j2) {
        byte by2;
        j2.v(384L);
        if (n2 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.cYq.clear();
        while ((by2 = n.b(dataInput, j2)) != 0) {
            String string = n.c(dataInput, j2);
            j2.v(224 + 16 * string.length());
            g g2 = n.a(by2, string, dataInput, n2 + 1, j2);
            if (this.cYq.put(string, g2) == null) continue;
            j2.v(288L);
        }
    }

    public Set<String> aeQ() {
        return this.cYq.keySet();
    }

    @Override
    public byte aeF() {
        return 10;
    }

    public void b(String string, g g2) {
        this.cYq.put(string, g2);
    }

    public void a(String string, byte by2) {
        this.cYq.put(string, new l(by2));
    }

    public void a(String string, short s2) {
        this.cYq.put(string, new y(s2));
    }

    public void B(String string, int n2) {
        this.cYq.put(string, new t(n2));
    }

    public void d(String string, long l2) {
        this.cYq.put(string, new w(l2));
    }

    public void a(String string, float f2) {
        this.cYq.put(string, new s(f2));
    }

    public void b(String string, double d2) {
        this.cYq.put(string, new q(d2));
    }

    public void R(String string, String string2) {
        this.cYq.put(string, new z(string2));
    }

    public void a(String string, byte[] byArray) {
        this.cYq.put(string, new m(byArray));
    }

    public void a(String string, int[] nArray) {
        this.cYq.put(string, new u(nArray));
    }

    public void o(String string, boolean bl2) {
        this.a(string, (byte)(bl2 ? 1 : 0));
    }

    public g eB(String string) {
        return this.cYq.get(string);
    }

    public byte eC(String string) {
        g g2 = this.cYq.get(string);
        return g2 != null ? g2.aeF() : (byte)0;
    }

    public boolean eD(String string) {
        return this.cYq.containsKey(string);
    }

    public boolean C(String string, int n2) {
        byte by2 = this.eC(string);
        if (by2 == n2) {
            return true;
        }
        if (n2 != 99) {
            if (by2 > 0) {
                // empty if block
            }
            return false;
        }
        return by2 == 1 || by2 == 2 || by2 == 3 || by2 == 4 || by2 == 5 || by2 == 6;
    }

    public byte eE(String string) {
        try {
            return !this.C(string, 99) ? (byte)0 : ((h)this.cYq.get(string)).aeM();
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
    }

    public short eF(String string) {
        try {
            return !this.C(string, 99) ? (short)0 : ((h)this.cYq.get(string)).aeL();
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
    }

    public int eG(String string) {
        try {
            return !this.C(string, 99) ? 0 : ((h)this.cYq.get(string)).aeK();
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
    }

    public long eH(String string) {
        try {
            return !this.C(string, 99) ? 0L : ((h)this.cYq.get(string)).aeJ();
        }
        catch (ClassCastException classCastException) {
            return 0L;
        }
    }

    public float eI(String string) {
        try {
            return !this.C(string, 99) ? 0.0f : ((h)this.cYq.get(string)).aeO();
        }
        catch (ClassCastException classCastException) {
            return 0.0f;
        }
    }

    public double eJ(String string) {
        try {
            return !this.C(string, 99) ? 0.0 : ((h)this.cYq.get(string)).aeN();
        }
        catch (ClassCastException classCastException) {
            return 0.0;
        }
    }

    public String eK(String string) {
        try {
            return !this.C(string, 8) ? "" : this.cYq.get(string).aeI();
        }
        catch (ClassCastException classCastException) {
            return "";
        }
    }

    public byte[] eL(String string) {
        try {
            return !this.C(string, 7) ? new byte[]{} : ((m)this.cYq.get(string)).aeP();
        }
        catch (ClassCastException classCastException) {
            throw new cl(this.a(string, 7, classCastException));
        }
    }

    public int[] eM(String string) {
        try {
            return !this.C(string, 11) ? new int[]{} : ((u)this.cYq.get(string)).aeR();
        }
        catch (ClassCastException classCastException) {
            throw new cl(this.a(string, 11, classCastException));
        }
    }

    public n eN(String string) {
        try {
            return !this.C(string, 10) ? new n() : (n)this.cYq.get(string);
        }
        catch (ClassCastException classCastException) {
            throw new cl(this.a(string, 10, classCastException));
        }
    }

    public v D(String string, int n2) {
        try {
            if (this.eC(string) != 9) {
                return new v();
            }
            v v2 = (v)this.cYq.get(string);
            return v2.aeS() > 0 && v2.aeT() != n2 ? new v() : v2;
        }
        catch (ClassCastException classCastException) {
            throw new cl(this.a(string, 9, classCastException));
        }
    }

    public boolean eO(String string) {
        return this.eE(string) != 0;
    }

    public void eP(String string) {
        this.cYq.remove(string);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Map.Entry<String, g> entry : this.cYq.entrySet()) {
            if (stringBuilder.length() != 1) {
                stringBuilder.append(',');
            }
            stringBuilder.append(entry.getKey()).append(':').append(entry.getValue());
        }
        return stringBuilder.append('}').toString();
    }

    @Override
    public boolean aeH() {
        return this.cYq.isEmpty();
    }

    private a a(String string, int n2, ClassCastException classCastException) {
        a a2 = a.a(classCastException, "Reading NBT data");
        i i2 = a2.y("Corrupt NBT tag", 1);
        i2.a("Tag type found", new o(this, string));
        i2.a("Tag type expected", new p(this, n2));
        i2.b("Tag name", string);
        return a2;
    }

    @Override
    public g aeG() {
        n n2 = new n();
        for (String string : this.cYq.keySet()) {
            n2.b(string, this.cYq.get(string).aeG());
        }
        return n2;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            n n2 = (n)object;
            return this.cYq.entrySet().equals(n2.cYq.entrySet());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.cYq.hashCode();
    }

    private static void a(String string, g g2, DataOutput dataOutput) {
        dataOutput.writeByte(g2.aeF());
        if (g2.aeF() != 0) {
            dataOutput.writeUTF(string);
            g2.a(dataOutput);
        }
    }

    private static byte b(DataInput dataInput, j j2) {
        return dataInput.readByte();
    }

    private static String c(DataInput dataInput, j j2) {
        return dataInput.readUTF();
    }

    static g a(byte by2, String string, DataInput dataInput, int n2, j j2) {
        g g2 = g.b(by2);
        try {
            g2.b(dataInput, n2, j2);
            return g2;
        }
        catch (IOException iOException) {
            a a2 = a.a(iOException, "Loading NBT data");
            i i2 = a2.dY("NBT Tag");
            i2.b("Tag name", string);
            i2.b("Tag type", by2);
            throw new cl(a2);
        }
    }

    public void w(n n2) {
        for (String string : n2.cYq.keySet()) {
            g g2 = n2.cYq.get(string);
            if (g2.aeF() == 10) {
                if (this.C(string, 10)) {
                    n n3 = this.eN(string);
                    n3.w((n)g2);
                    continue;
                }
                this.b(string, g2.aeG());
                continue;
            }
            this.b(string, g2.aeG());
        }
    }
}

