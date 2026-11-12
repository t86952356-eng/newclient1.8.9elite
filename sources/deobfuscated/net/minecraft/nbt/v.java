/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.nbt;

import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.List;
import net.minecraft.nbt.g;
import net.minecraft.nbt.j;
import net.minecraft.nbt.n;
import net.minecraft.nbt.q;
import net.minecraft.nbt.r;
import net.minecraft.nbt.s;
import net.minecraft.nbt.u;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class v
extends g {
    private static final Logger cYy = LogManager.getLogger();
    private List<g> cYz = Lists.newArrayList();
    private byte cYA = 0;

    @Override
    void a(DataOutput dataOutput) {
        this.cYA = !this.cYz.isEmpty() ? this.cYz.get(0).aeF() : (byte)0;
        dataOutput.writeByte(this.cYA);
        dataOutput.writeInt(this.cYz.size());
        for (int i2 = 0; i2 < this.cYz.size(); ++i2) {
            this.cYz.get(i2).a(dataOutput);
        }
    }

    @Override
    void b(DataInput dataInput, int n2, j j2) {
        j2.v(296L);
        if (n2 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.cYA = dataInput.readByte();
        int n3 = dataInput.readInt();
        if (this.cYA == 0 && n3 > 0) {
            throw new RuntimeException("Missing type on ListTag");
        }
        j2.v(32L * (long)n3);
        this.cYz = Lists.newArrayListWithCapacity((int)n3);
        for (int i2 = 0; i2 < n3; ++i2) {
            g g2 = g.b(this.cYA);
            g2.b(dataInput, n2 + 1, j2);
            this.cYz.add(g2);
        }
    }

    @Override
    public byte aeF() {
        return 9;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i2 = 0; i2 < this.cYz.size(); ++i2) {
            if (i2 != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(i2).append(':').append(this.cYz.get(i2));
        }
        return stringBuilder.append(']').toString();
    }

    public void a(g g2) {
        if (g2.aeF() == 0) {
            cYy.warn("Invalid TagEnd added to ListTag");
        } else {
            if (this.cYA == 0) {
                this.cYA = g2.aeF();
            } else if (this.cYA != g2.aeF()) {
                cYy.warn("Adding mismatching tag types to tag list");
                return;
            }
            this.cYz.add(g2);
        }
    }

    public void a(int n2, g g2) {
        if (g2.aeF() == 0) {
            cYy.warn("Invalid TagEnd added to ListTag");
        } else if (n2 >= 0 && n2 < this.cYz.size()) {
            if (this.cYA == 0) {
                this.cYA = g2.aeF();
            } else if (this.cYA != g2.aeF()) {
                cYy.warn("Adding mismatching tag types to tag list");
                return;
            }
            this.cYz.set(n2, g2);
        } else {
            cYy.warn("index out of bounds to set tag in tag list");
        }
    }

    public g gh(int n2) {
        return this.cYz.remove(n2);
    }

    @Override
    public boolean aeH() {
        return this.cYz.isEmpty();
    }

    public n gi(int n2) {
        if (n2 >= 0 && n2 < this.cYz.size()) {
            g g2 = this.cYz.get(n2);
            return g2.aeF() == 10 ? (n)g2 : new n();
        }
        return new n();
    }

    public int[] gj(int n2) {
        if (n2 >= 0 && n2 < this.cYz.size()) {
            g g2 = this.cYz.get(n2);
            return g2.aeF() == 11 ? ((u)g2).aeR() : new int[]{};
        }
        return new int[0];
    }

    public double gk(int n2) {
        if (n2 >= 0 && n2 < this.cYz.size()) {
            g g2 = this.cYz.get(n2);
            return g2.aeF() == 6 ? ((q)g2).aeN() : 0.0;
        }
        return 0.0;
    }

    public float gl(int n2) {
        if (n2 >= 0 && n2 < this.cYz.size()) {
            g g2 = this.cYz.get(n2);
            return g2.aeF() == 5 ? ((s)g2).aeO() : 0.0f;
        }
        return 0.0f;
    }

    public String gm(int n2) {
        if (n2 >= 0 && n2 < this.cYz.size()) {
            g g2 = this.cYz.get(n2);
            return g2.aeF() == 8 ? g2.aeI() : g2.toString();
        }
        return "";
    }

    public g gn(int n2) {
        return n2 >= 0 && n2 < this.cYz.size() ? this.cYz.get(n2) : new r();
    }

    public int aeS() {
        return this.cYz.size();
    }

    @Override
    public g aeG() {
        v v2 = new v();
        v2.cYA = this.cYA;
        for (g g2 : this.cYz) {
            g g3 = g2.aeG();
            v2.cYz.add(g3);
        }
        return v2;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            v v2 = (v)object;
            if (this.cYA == v2.cYA) {
                return this.cYz.equals(v2.cYz);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.cYz.hashCode();
    }

    public int aeT() {
        return this.cYA;
    }
}

