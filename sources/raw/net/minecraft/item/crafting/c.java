/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.item.crafting;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.b;
import net.minecraft.item.bd;
import net.minecraft.item.co;
import net.minecraft.item.d;

public class c {
    private static final c cXs = new c();
    private final Map<co, co> cXt = Maps.newHashMap();
    private final Map<co, Float> cXu = Maps.newHashMap();

    public static c aeA() {
        return cXs;
    }

    private c() {
        this.a(Blocks.cLr, new co(Items.cPn), 0.7f);
        this.a(Blocks.cLq, new co(Items.cPo), 1.0f);
        this.a(Blocks.cMi, new co(Items.cPm), 1.0f);
        this.a(Blocks.cLo, new co(Blocks.cLy), 0.1f);
        this.a(Items.cQp, new co(Items.cQq), 0.35f);
        this.a(Items.cRm, new co(Items.cRn), 0.35f);
        this.a(Items.cRo, new co(Items.cRp), 0.35f);
        this.a(Items.cRs, new co(Items.cRt), 0.35f);
        this.a(Items.cRq, new co(Items.cRr), 0.35f);
        this.a(Blocks.cLg, new co(Blocks.cLd), 0.1f);
        this.a(new co(Blocks.cNh, 1, BlockStoneBrick.bbL), new co(Blocks.cNh, 1, BlockStoneBrick.bbN), 0.1f);
        this.a(Items.cQM, new co(Items.cQL), 0.3f);
        this.a(Blocks.cMN, new co(Blocks.cOB), 0.35f);
        this.a(Blocks.cMM, new co(Items.cRa, 1, b.cUP.ado()), 0.2f);
        this.a(Blocks.cLt, new co(Items.cPl, 1, 1), 0.15f);
        this.a(Blocks.cLu, new co(Items.cPl, 1, 1), 0.15f);
        this.a(Blocks.cNR, new co(Items.cRS), 1.0f);
        this.a(Items.cRW, new co(Items.cRX), 0.35f);
        this.a(Blocks.cMX, new co(Items.cSj), 0.1f);
        this.a(new co(Blocks.cLx, 1, 1), new co(Blocks.cLx, 1, 0), 0.15f);
        for (bd bd2 : bd.values()) {
            if (!bd2.adT()) continue;
            this.a(new co(Items.cQY, 1, bd2.yc()), new co(Items.cQZ, 1, bd2.yc()), 0.35f);
        }
        this.a(Blocks.cLs, new co(Items.cPl), 0.1f);
        this.a(Blocks.cME, new co(Items.cQG), 0.7f);
        this.a(Blocks.cLz, new co(Items.cRa, 1, b.cUN.ado()), 0.2f);
        this.a(Blocks.cOq, new co(Items.cSk), 0.2f);
    }

    public void a(Block block, co co2, float f2) {
        this.a(d.I(block), co2, f2);
    }

    public void a(d d2, co co2, float f2) {
        this.a(new co(d2, 1, Short.MAX_VALUE), co2, f2);
    }

    public void a(co co2, co co3, float f2) {
        this.cXt.put(co2, co3);
        this.cXu.put(co3, Float.valueOf(f2));
    }

    public co aM(co co2) {
        for (Map.Entry<co, co> entry : this.cXt.entrySet()) {
            if (!this.f(co2, entry.getKey())) continue;
            return entry.getValue();
        }
        return null;
    }

    private boolean f(co co2, co co3) {
        return co3.bP() == co2.bP() && (co3.yc() == Short.MAX_VALUE || co3.yc() == co2.yc());
    }

    public Map<co, co> aeB() {
        return this.cXt;
    }

    public float aN(co co2) {
        for (Map.Entry<co, Float> entry : this.cXu.entrySet()) {
            if (!this.f(co2, entry.getKey())) continue;
            return entry.getValue().floatValue();
        }
        return 0.0f;
    }
}

