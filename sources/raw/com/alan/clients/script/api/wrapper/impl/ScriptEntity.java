/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl;

import com.alan.clients.script.api.wrapper.ScriptWrapper;
import com.alan.clients.script.api.wrapper.impl.vector.ScriptVector2f;
import com.alan.clients.script.api.wrapper.impl.vector.ScriptVector3d;
import net.minecraft.entity.c;
import net.minecraft.entity.player.a;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

public class ScriptEntity
extends ScriptWrapper<c> {
    public ScriptEntity(c c2) {
        super(c2);
    }

    static ScriptEntity getById(int n2) {
        c c2 = ScriptEntity.MC.bgF.cn(n2);
        return ScriptEntity.tryInstantiate(c2);
    }

    static ScriptEntity getByName(String string) {
        a a2 = ScriptEntity.MC.bgF.gz(string);
        return ScriptEntity.tryInstantiate(a2);
    }

    private static ScriptEntity tryInstantiate(c c2) {
        return new ScriptEntity(c2);
    }

    public boolean isLiving() {
        return this.wrapped instanceof r;
    }

    public void setYaw(float f2) {
        ((c)this.wrapped).pl = f2;
    }

    public void setPitch(float f2) {
        ((c)this.wrapped).pm = f2;
    }

    public ScriptVector3d getPosition() {
        return new ScriptVector3d(((c)this.wrapped).gW, ((c)this.wrapped).gX, ((c)this.wrapped).gY);
    }

    public ScriptVector3d getLastPosition() {
        return new ScriptVector3d(((c)this.wrapped).csh, ((c)this.wrapped).csi, ((c)this.wrapped).csj);
    }

    public ScriptVector3d getMotion() {
        return new ScriptVector3d(((c)this.wrapped).ud, ((c)this.wrapped).ue, ((c)this.wrapped).uf);
    }

    public void setMotion(ScriptVector3d scriptVector3d) {
        ((c)this.wrapped).ud = scriptVector3d.getX();
        ((c)this.wrapped).ue = scriptVector3d.getY();
        ((c)this.wrapped).uf = scriptVector3d.getZ();
    }

    public void setMotionX(double d2) {
        ((c)this.wrapped).ud = d2;
    }

    public void setMotionY(double d2) {
        ((c)this.wrapped).ue = d2;
    }

    public void setMotionZ(double d2) {
        ((c)this.wrapped).uf = d2;
    }

    public int getAirTicks() {
        return ((c)this.wrapped).tR;
    }

    public int getGroundTicks() {
        return ((c)this.wrapped).crx;
    }

    public boolean isSprinting() {
        return ((c)this.wrapped).isSprinting();
    }

    public boolean isSneaking() {
        return ((c)this.wrapped).isSneaking();
    }

    public boolean isInvisible() {
        return ((c)this.wrapped).isInvisible();
    }

    public boolean isDead() {
        return ((c)this.wrapped).csb;
    }

    public boolean isRiding() {
        return ((c)this.wrapped).isRiding();
    }

    public boolean isEating() {
        return ((c)this.wrapped).isEating();
    }

    public boolean isBurning() {
        return ((c)this.wrapped).isBurning();
    }

    public ScriptVector2f getRotation() {
        return new ScriptVector2f(((c)this.wrapped).pl, ((c)this.wrapped).pm);
    }

    public ScriptVector2f getLastRotation() {
        return new ScriptVector2f(((c)this.wrapped).crM, ((c)this.wrapped).crO);
    }

    public int getTicksExisted() {
        return ((c)this.wrapped).aRg;
    }

    public int getEntityId() {
        return ((c)this.wrapped).getEntityId();
    }

    public String getDisplayName() {
        return ((c)this.wrapped).xW().arj();
    }

    public float getDistanceToEntity(ScriptEntity scriptEntity) {
        float f2 = (float)(((c)this.wrapped).gW - scriptEntity.getPosition().getX());
        float f3 = (float)(((c)this.wrapped).gX - scriptEntity.getPosition().getY());
        float f4 = (float)(((c)this.wrapped).gY - scriptEntity.getPosition().getZ());
        return bt.bK(f2 * f2 + f3 * f3 + f4 * f4);
    }

    public double getDistance(double d2, double d3, double d4) {
        double d5 = ((c)this.wrapped).gW - d2;
        double d6 = ((c)this.wrapped).gX - d3;
        double d7 = ((c)this.wrapped).gY - d4;
        return bt.aD(d5 * d5 + d6 * d6 + d7 * d7);
    }
}

