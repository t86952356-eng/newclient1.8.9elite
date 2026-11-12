/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.bt;
import org.apache.commons.lang3.Validate;

public class at
implements aj<a> {
    private String soundName;
    private int dcO;
    private int dcP = Integer.MAX_VALUE;
    private int dcQ;
    private float volume;
    private int ddP;

    public at() {
    }

    public at(String string, double d2, double d3, double d4, float f2, float f3) {
        Validate.notNull((Object)string, (String)"name", (Object[])new Object[0]);
        this.soundName = string;
        this.dcO = (int)(d2 * 8.0);
        this.dcP = (int)(d3 * 8.0);
        this.dcQ = (int)(d4 * 8.0);
        this.volume = f2;
        this.ddP = (int)(f3 * 63.0f);
        f3 = bt.I(f3, 0.0f, 255.0f);
    }

    @Override
    public void a(ak ak2) {
        this.soundName = ak2.gs(256);
        this.dcO = ak2.readInt();
        this.dcP = ak2.readInt();
        this.dcQ = ak2.readInt();
        this.volume = ak2.readFloat();
        this.ddP = ak2.readUnsignedByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(this.soundName);
        ak2.writeInt(this.dcO);
        ak2.writeInt(this.dcP);
        ak2.writeInt(this.dcQ);
        ak2.writeFloat(this.volume);
        ak2.writeByte(this.ddP);
    }

    public String getSoundName() {
        return this.soundName;
    }

    public double getX() {
        return (float)this.dcO / 8.0f;
    }

    public double getY() {
        return (float)this.dcP / 8.0f;
    }

    public double getZ() {
        return (float)this.dcQ / 8.0f;
    }

    public float getVolume() {
        return this.volume;
    }

    public float getPitch() {
        return (float)this.ddP / 63.0f;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }
}

