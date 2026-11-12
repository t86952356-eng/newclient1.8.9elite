/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.af;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderRabbit;
import net.minecraft.entity.passive.l;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class aq
extends h {
    private static Map<String, Integer> egp = null;

    public aq() {
        super(l.class, "rabbit", 0.3f);
    }

    @Override
    public d aCn() {
        return new af();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof af)) {
            return null;
        }
        af af2 = (af)d2;
        Map<String, Integer> map = aq.aCp();
        if (map.containsKey(string)) {
            int n2 = map.get(string);
            return (ag)net.optifine.reflect.g.a((Object)af2, net.optifine.reflect.g.erZ, n2);
        }
        return null;
    }

    @Override
    public String[] aCo() {
        return new String[]{"left_foot", "right_foot", "left_thigh", "right_thigh", "body", "left_arm", "right_arm", "head", "right_ear", "left_ear", "tail", "nose"};
    }

    private static Map<String, Integer> aCp() {
        if (egp != null) {
            return egp;
        }
        egp = new HashMap<String, Integer>();
        egp.put("left_foot", 0);
        egp.put("right_foot", 1);
        egp.put("left_thigh", 2);
        egp.put("right_thigh", 3);
        egp.put("body", 4);
        egp.put("left_arm", 5);
        egp.put("right_arm", 6);
        egp.put("head", 7);
        egp.put("right_ear", 8);
        egp.put("left_ear", 9);
        egp.put("tail", 10);
        egp.put("nose", 11);
        return egp;
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderRabbit renderRabbit = new RenderRabbit(renderManager, d2, f2);
        return renderRabbit;
    }
}

