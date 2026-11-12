/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.u;
import net.minecraft.client.renderer.entity.RenderHorse;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.f;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class ae
extends h {
    private static Map<String, Integer> egp = null;

    public ae() {
        super(f.class, "horse", 0.75f);
    }

    protected ae(Class clazz, String string, float f2) {
        super(clazz, string, f2);
    }

    @Override
    public d aCn() {
        return new u();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof u)) {
            return null;
        }
        u u2 = (u)d2;
        Map<String, Integer> map = ae.aCp();
        if (map.containsKey(string)) {
            int n2 = map.get(string);
            return (ag)net.optifine.reflect.g.a((Object)u2, net.optifine.reflect.g.erQ, n2);
        }
        return null;
    }

    @Override
    public String[] aCo() {
        return new String[]{"head", "upper_mouth", "lower_mouth", "horse_left_ear", "horse_right_ear", "mule_left_ear", "mule_right_ear", "neck", "horse_face_ropes", "mane", "body", "tail_base", "tail_middle", "tail_tip", "back_left_leg", "back_left_shin", "back_left_hoof", "back_right_leg", "back_right_shin", "back_right_hoof", "front_left_leg", "front_left_shin", "front_left_hoof", "front_right_leg", "front_right_shin", "front_right_hoof", "mule_left_chest", "mule_right_chest", "horse_saddle_bottom", "horse_saddle_front", "horse_saddle_back", "horse_left_saddle_rope", "horse_left_saddle_metal", "horse_right_saddle_rope", "horse_right_saddle_metal", "horse_left_face_metal", "horse_right_face_metal", "horse_left_rein", "horse_right_rein"};
    }

    private static Map<String, Integer> aCp() {
        if (egp != null) {
            return egp;
        }
        egp = new HashMap<String, Integer>();
        egp.put("head", 0);
        egp.put("upper_mouth", 1);
        egp.put("lower_mouth", 2);
        egp.put("horse_left_ear", 3);
        egp.put("horse_right_ear", 4);
        egp.put("mule_left_ear", 5);
        egp.put("mule_right_ear", 6);
        egp.put("neck", 7);
        egp.put("horse_face_ropes", 8);
        egp.put("mane", 9);
        egp.put("body", 10);
        egp.put("tail_base", 11);
        egp.put("tail_middle", 12);
        egp.put("tail_tip", 13);
        egp.put("back_left_leg", 14);
        egp.put("back_left_shin", 15);
        egp.put("back_left_hoof", 16);
        egp.put("back_right_leg", 17);
        egp.put("back_right_shin", 18);
        egp.put("back_right_hoof", 19);
        egp.put("front_left_leg", 20);
        egp.put("front_left_shin", 21);
        egp.put("front_left_hoof", 22);
        egp.put("front_right_leg", 23);
        egp.put("front_right_shin", 24);
        egp.put("front_right_hoof", 25);
        egp.put("mule_left_chest", 26);
        egp.put("mule_right_chest", 27);
        egp.put("horse_saddle_bottom", 28);
        egp.put("horse_saddle_front", 29);
        egp.put("horse_saddle_back", 30);
        egp.put("horse_left_saddle_rope", 31);
        egp.put("horse_left_saddle_metal", 32);
        egp.put("horse_right_saddle_rope", 33);
        egp.put("horse_right_saddle_metal", 34);
        egp.put("horse_left_face_metal", 35);
        egp.put("horse_right_face_metal", 36);
        egp.put("horse_left_rein", 37);
        egp.put("horse_right_rein", 38);
        return egp;
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderHorse renderHorse = new RenderHorse(renderManager, (u)d2, f2);
        return renderHorse;
    }
}

