/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.t;
import net.minecraft.client.renderer.entity.RenderGuardian;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.r;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class ab
extends h {
    public ab() {
        super(r.class, "guardian", 0.5f);
    }

    @Override
    public d aCn() {
        return new t();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof t)) {
            return null;
        }
        t t2 = (t)d2;
        if (string.equals("body")) {
            return (ag)net.optifine.reflect.g.a(t2, net.optifine.reflect.g.erL);
        }
        if (string.equals("eye")) {
            return (ag)net.optifine.reflect.g.a(t2, net.optifine.reflect.g.erM);
        }
        String string2 = "spine";
        if (string.startsWith("spine")) {
            ag[] agArray = (ag[])net.optifine.reflect.g.a(t2, net.optifine.reflect.g.erN);
            if (agArray == null) {
                return null;
            }
            String string3 = string.substring("spine".length());
            int n2 = a.x(string3, -1);
            return --n2 >= 0 && n2 < agArray.length ? agArray[n2] : null;
        }
        String string4 = "tail";
        if (string.startsWith("tail")) {
            ag[] agArray = (ag[])net.optifine.reflect.g.a(t2, net.optifine.reflect.g.erO);
            if (agArray == null) {
                return null;
            }
            String string5 = string.substring("tail".length());
            int n3 = a.x(string5, -1);
            return --n3 >= 0 && n3 < agArray.length ? agArray[n3] : null;
        }
        return null;
    }

    @Override
    public String[] aCo() {
        return new String[]{"body", "eye", "spine1", "spine2", "spine3", "spine4", "spine5", "spine6", "spine7", "spine8", "spine9", "spine10", "spine11", "spine12", "tail1", "tail2", "tail3"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderGuardian renderGuardian = new RenderGuardian(renderManager);
        renderGuardian.bWL = d2;
        renderGuardian.bUm = f2;
        return renderGuardian;
    }
}

