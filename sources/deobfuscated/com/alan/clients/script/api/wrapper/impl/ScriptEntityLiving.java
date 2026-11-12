/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl;

import com.alan.clients.script.api.wrapper.impl.ScriptEntity;
import com.alan.clients.script.api.wrapper.impl.ScriptItemStack;
import net.minecraft.entity.c;
import net.minecraft.entity.monster.aa;
import net.minecraft.entity.p;
import net.minecraft.entity.passive.b;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;

public class ScriptEntityLiving
extends ScriptEntity {
    public r wrappedLiving;

    public ScriptEntityLiving(r r2) {
        super(r2);
        this.wrappedLiving = r2;
    }

    private static ScriptEntityLiving tryInstantiate(c c2) {
        if (c2 instanceof p) {
            return new ScriptEntityLiving((p)c2);
        }
        return null;
    }

    public boolean isAnimal() {
        return this.wrappedLiving instanceof b;
    }

    public boolean isMob() {
        return this.wrappedLiving instanceof aa;
    }

    public boolean isPlayer() {
        return this.wrappedLiving instanceof a;
    }

    public float getHealth() {
        return this.wrappedLiving.getHealth();
    }

    public float getMaxHealth() {
        return this.wrappedLiving.getMaxHealth();
    }

    public int getHurtTime() {
        return this.wrappedLiving.cus;
    }

    public int getMaxHurtTime() {
        return this.wrappedLiving.cut;
    }

    public int getLastHurtTime() {
        return this.wrappedLiving.zf;
    }

    public ScriptItemStack getHeldItemStack() {
        return new ScriptItemStack(this.wrappedLiving.Vk());
    }

    @Override
    public boolean isDead() {
        return this.wrappedLiving.csb;
    }
}

