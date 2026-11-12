/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.b;
import net.minecraft.util.da;

public class ar
implements aj<a> {
    public double gW;
    public double gX;
    public double gY;
    private float ddF;
    private List<b> ddG;
    private float ddH;
    private float ddI;
    private float ddJ;

    public ar() {
    }

    public ar(double d2, double d3, double d4, float f2, List<b> list, da da2) {
        this.gW = d2;
        this.gX = d3;
        this.gY = d4;
        this.ddF = f2;
        this.ddG = Lists.newArrayList(list);
        if (da2 != null) {
            this.ddH = (float)da2.dAG;
            this.ddI = (float)da2.dAH;
            this.ddJ = (float)da2.dAI;
        }
    }

    @Override
    public void a(ak ak2) {
        this.gW = ak2.readFloat();
        this.gX = ak2.readFloat();
        this.gY = ak2.readFloat();
        this.ddF = ak2.readFloat();
        int n2 = ak2.readInt();
        this.ddG = Lists.newArrayListWithCapacity((int)n2);
        int n3 = (int)this.gW;
        int n4 = (int)this.gX;
        int n5 = (int)this.gY;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n6 = ak2.readByte() + n3;
            int n7 = ak2.readByte() + n4;
            int n8 = ak2.readByte() + n5;
            this.ddG.add(new b(n6, n7, n8));
        }
        this.ddH = ak2.readFloat();
        this.ddI = ak2.readFloat();
        this.ddJ = ak2.readFloat();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeFloat((float)this.gW);
        ak2.writeFloat((float)this.gX);
        ak2.writeFloat((float)this.gY);
        ak2.writeFloat(this.ddF);
        ak2.writeInt(this.ddG.size());
        int n2 = (int)this.gW;
        int n3 = (int)this.gX;
        int n4 = (int)this.gY;
        for (b b2 : this.ddG) {
            int n5 = b2.wt() - n2;
            int n6 = b2.wu() - n3;
            int n7 = b2.wx() - n4;
            ak2.writeByte(n5);
            ak2.writeByte(n6);
            ak2.writeByte(n7);
        }
        ak2.writeFloat(this.ddH);
        ak2.writeFloat(this.ddI);
        ak2.writeFloat(this.ddJ);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public float ahm() {
        return this.ddH;
    }

    public float ahn() {
        return this.ddI;
    }

    public float aho() {
        return this.ddJ;
    }

    public double getX() {
        return this.gW;
    }

    public double getY() {
        return this.gX;
    }

    public double getZ() {
        return this.gY;
    }

    public float getStrength() {
        return this.ddF;
    }

    public List<b> ahp() {
        return this.ddG;
    }
}

