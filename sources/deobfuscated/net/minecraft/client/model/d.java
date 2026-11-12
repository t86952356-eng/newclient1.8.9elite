/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.model;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.ay;
import net.minecraft.entity.c;
import net.minecraft.entity.r;

public abstract class d {
    public float km;
    public boolean byo;
    public boolean byp = true;
    public List<ag> byq = Lists.newArrayList();
    private final Map<String, ay> byr = Maps.newHashMap();
    public int bys = 64;
    public int byt = 32;

    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7, c c2) {
    }

    public void a(r r2, float f2, float f3, float f4) {
    }

    public ag b(Random random) {
        return this.byq.get(random.nextInt(this.byq.size()));
    }

    protected void f(String string, int n2, int n3) {
        this.byr.put(string, new ay(n2, n3));
    }

    public ay cV(String string) {
        return this.byr.get(string);
    }

    public static void a(ag ag2, ag ag3) {
        ag3.bBF = ag2.bBF;
        ag3.bBG = ag2.bBG;
        ag3.bBH = ag2.bBH;
        ag3.bBC = ag2.bBC;
        ag3.bBD = ag2.bBD;
        ag3.bBE = ag2.bBE;
    }

    public void a(d d2) {
        this.km = d2.km;
        this.byo = d2.byo;
        this.byp = d2.byp;
    }
}

