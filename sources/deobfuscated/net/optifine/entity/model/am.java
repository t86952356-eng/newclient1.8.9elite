/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ab;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderOcelot;
import net.minecraft.entity.passive.j;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class am
extends h {
    private static Map<String, Integer> egp = null;

    public am() {
        super(j.class, "ocelot", 0.4f);
    }

    @Override
    public d aCn() {
        return new ab();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof ab)) {
            return null;
        }
        ab ab2 = (ab)d2;
        Map<String, Integer> map = am.aCp();
        if (map.containsKey(string)) {
            int n2 = map.get(string);
            return (ag)net.optifine.reflect.g.a((Object)ab2, net.optifine.reflect.g.erX, n2);
        }
        return null;
    }

    @Override
    public String[] aCo() {
        return new String[]{"back_left_leg", "back_right_leg", "front_left_leg", "front_right_leg", "tail", "tail2", "head", "body"};
    }

    private static Map<String, Integer> aCp() {
        if (egp != null) {
            return egp;
        }
        egp = new HashMap<String, Integer>();
        egp.put("back_left_leg", 0);
        egp.put("back_right_leg", 1);
        egp.put("front_left_leg", 2);
        egp.put("front_right_leg", 3);
        egp.put("tail", 4);
        egp.put("tail2", 5);
        egp.put("head", 6);
        egp.put("body", 7);
        return egp;
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderOcelot renderOcelot = new RenderOcelot(renderManager, d2, f2);
        return renderOcelot;
    }
}

