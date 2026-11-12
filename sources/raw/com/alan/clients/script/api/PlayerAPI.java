/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api;

import com.alan.clients.script.api.wrapper.impl.ScriptEntity;
import com.alan.clients.script.api.wrapper.impl.ScriptEntityLiving;
import com.alan.clients.script.api.wrapper.impl.ScriptInventory;
import com.alan.clients.script.api.wrapper.impl.ScriptItemStack;
import com.alan.clients.script.api.wrapper.impl.vector.ScriptVector2f;
import com.alan.clients.script.api.wrapper.impl.vector.ScriptVector3d;
import hackclient.rise.a;
import hackclient.rise.abf;
import hackclient.rise.aei;
import hackclient.rise.aic;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.bk;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fe;
import net.minecraft.client.d;
import net.minecraft.client.gui.f;
import net.minecraft.client.gui.inventory.h;
import net.minecraft.client.gui.inventory.q;
import net.minecraft.item.af;
import net.minecraft.item.bg;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.item.cq;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.da;

public class PlayerAPI
extends ScriptEntityLiving {
    @dm
    public final dk<fe> onTick = fe2 -> {
        if (this.wrapped == null || this.wrapped != PlayerAPI.MC.bgK) {
            this.wrappedLiving = PlayerAPI.MC.bgK;
            this.wrapped = this.wrappedLiving;
        }
    };

    public PlayerAPI() {
        super(PlayerAPI.MC.bgK);
        a.a.e().b(this);
    }

    public String getName() {
        return MC.Bl().bX();
    }

    public String getPlayerID() {
        return MC.Bl().getPlayerID();
    }

    public boolean isOnGround() {
        return PlayerAPI.MC.bgK.aO;
    }

    public boolean isMoving() {
        return aii.isMoving();
    }

    public void jump() {
        PlayerAPI.MC.bgK.jump();
    }

    public void strafe() {
        aii.strafe();
    }

    public void strafe(double d2) {
        aii.strafe(d2);
    }

    public float getForward() {
        return PlayerAPI.MC.bgK.cuW;
    }

    public float getStrafe() {
        return PlayerAPI.MC.bgK.cuV;
    }

    public double getSpeed() {
        return aii.speed();
    }

    public void stop() {
        aii.stop();
    }

    public void setPosition(double d2, double d3, double d4) {
        PlayerAPI.MC.bgK.setPosition(d2, d3, d4);
    }

    public void setPosition(ScriptVector3d scriptVector3d) {
        this.setPosition(scriptVector3d.getX(), scriptVector3d.getY(), scriptVector3d.getZ());
    }

    public void setMotion(double d2, double d3, double d4) {
        PlayerAPI.MC.bgK.ud = d2;
        PlayerAPI.MC.bgK.ue = d3;
        PlayerAPI.MC.bgK.uf = d4;
    }

    public int getUseItemProgress() {
        return PlayerAPI.MC.bgK.abH();
    }

    @Override
    public void setMotionY(double d2) {
        PlayerAPI.MC.bgK.ue = d2;
    }

    @Override
    public void setMotionX(double d2) {
        PlayerAPI.MC.bgK.ud = d2;
    }

    @Override
    public void setMotionZ(double d2) {
        PlayerAPI.MC.bgK.uf = d2;
    }

    @Override
    public void setMotion(ScriptVector3d scriptVector3d) {
        this.setMotion(scriptVector3d.getX(), scriptVector3d.getY(), scriptVector3d.getZ());
    }

    public void leftClick() {
        MC.AN();
    }

    public void rightClick() {
        MC.AO();
    }

    public void attackEntity(ScriptEntityLiving scriptEntityLiving) {
        PlayerAPI.MC.bgu.a(PlayerAPI.MC.bgK, PlayerAPI.MC.bgF.cn(scriptEntityLiving.getEntityId()));
    }

    public void swingItem() {
        PlayerAPI.MC.bgK.swingItem();
    }

    public void message(String string) {
        if (PlayerAPI.MC.bgK != null && PlayerAPI.MC.bgF != null) {
            PlayerAPI.MC.bgK.sendChatMessage(string);
        }
    }

    public void setRotation(ScriptVector2f scriptVector2f, double d2, boolean bl2) {
        bs.a(new akb(scriptVector2f.getX(), scriptVector2f.getY()), d2, bl2 ? cb.gH : cb.gG);
    }

    public void setRotation(float f2, float f3) {
        bs.a(new akb(f2, f3), 10.0, cb.gH);
    }

    public void setHeldItem(int n2, boolean bl2) {
        a.a.h().b(bu.class);
        bu.setSlot(n2);
    }

    public double[] getLerpedPosition() {
        return new double[]{PlayerAPI.MC.bgK.csh + (PlayerAPI.MC.bgK.gW - PlayerAPI.MC.bgK.csh) * (double)PlayerAPI.MC.bgC.bWY, PlayerAPI.MC.bgK.csi + (PlayerAPI.MC.bgK.gX - PlayerAPI.MC.bgK.csi) * (double)PlayerAPI.MC.bgC.bWY, PlayerAPI.MC.bgK.csj + (PlayerAPI.MC.bgK.gY - PlayerAPI.MC.bgK.csj) * (double)PlayerAPI.MC.bgC.bWY};
    }

    public void setSlot(int n2) {
        PlayerAPI.MC.bgK.cHV.cJE = n2;
    }

    public void setHeldItem(int n2) {
        a.a.h().b(bu.class);
        bu.setSlot(n2);
    }

    @Override
    public ScriptItemStack getHeldItemStack() {
        a.a.h().b(bu.class);
        return new ScriptItemStack(bu.bO());
    }

    public ScriptItemStack getClientHeldItemStack() {
        return new ScriptItemStack(PlayerAPI.MC.bgK.Vk());
    }

    public int getClientHeldItemSlot() {
        return PlayerAPI.MC.bgK.cHV.cJE;
    }

    public void itemDamage() {
        hackclient.rise.bg.damage(true);
    }

    public void damage(boolean bl2, float f2) {
        if (!bl2) {
            bk.a(f2);
        } else {
            aic.ab(0.5);
        }
    }

    @Override
    public int getHurtTime() {
        return PlayerAPI.MC.bgK.cus;
    }

    public void damage(boolean bl2) {
        this.damage(bl2, 1.0f);
    }

    public void fakeDamage() {
        aik.fakeDamage();
    }

    public boolean isUsingItem() {
        return d.AZ().bgK.isUsingItem();
    }

    public boolean isHoldingSword() {
        co co2 = d.AZ().bgK.Vk();
        return co2 != null && co2.bP() instanceof cp;
    }

    public boolean isHoldingTool() {
        co co2 = d.AZ().bgK.Vk();
        return co2 != null && co2.bP() instanceof cq;
    }

    public boolean isHoldingBlock() {
        co co2 = d.AZ().bgK.Vk();
        return co2 != null && co2.bP() instanceof af;
    }

    public boolean isHoldingFood() {
        co co2 = d.AZ().bgK.Vk();
        return co2 != null && co2.bP() instanceof bg;
    }

    public ScriptVector2f calculateRotations(ScriptVector3d scriptVector3d) {
        akb akb2 = aix.d(new akd(scriptVector3d.getX(), scriptVector3d.getY(), scriptVector3d.getZ()));
        return new ScriptVector2f(akb2.x, akb2.y);
    }

    public ScriptVector2f calculateRotations(ScriptEntity scriptEntity) {
        ScriptVector3d scriptVector3d = scriptEntity.getPosition();
        scriptVector3d.add(new ScriptVector3d(0.0, 1.8, 0.0));
        return this.calculateRotations(scriptVector3d);
    }

    public boolean mouseOverEntity(ScriptEntity scriptEntity, int n2) {
        ce ce2 = aei.c(bs.fk, n2);
        if (ce2 == null || ce2.dzu != cf.dzz) {
            return false;
        }
        return ce2.dzw != null && ce2.dzw.getEntityId() == scriptEntity.getEntityId();
    }

    public ScriptInventory getInventory() {
        return new ScriptInventory(PlayerAPI.MC.bgK.cHV);
    }

    public double getBPS() {
        return PlayerAPI.MC.bgK.getDistance(PlayerAPI.MC.bgK.csh, PlayerAPI.MC.bgK.gX, PlayerAPI.MC.bgK.csj) * 20.0;
    }

    public void setSprinting(boolean bl2) {
        PlayerAPI.MC.bgK.setSprinting(bl2);
    }

    public void setClientRotation(float f2, float f3) {
        PlayerAPI.MC.bgK.pl = f2;
        PlayerAPI.MC.bgK.pm = f3;
    }

    public float getFallDistance() {
        return PlayerAPI.MC.bgK.csf;
    }

    public float getHunger() {
        return PlayerAPI.MC.bgK.abY().getFoodLevel();
    }

    public float getAbsorption() {
        return PlayerAPI.MC.bgK.Wi();
    }

    public int getFacing() {
        return PlayerAPI.MC.bgK.Uq().OY();
    }

    public float getEyeHeight() {
        return PlayerAPI.MC.bgK.getEyeHeight();
    }

    public boolean isInWater() {
        return PlayerAPI.MC.bgK.isInWater();
    }

    public boolean isInLava() {
        return PlayerAPI.MC.bgK.isInLava();
    }

    public void setSneaking(boolean bl2) {
        PlayerAPI.MC.bgK.setSneaking(bl2);
    }

    public boolean isInWeb() {
        return PlayerAPI.MC.bgK.crZ;
    }

    public boolean isOnLadder() {
        return PlayerAPI.MC.bgK.isOnLadder();
    }

    public boolean isCollided() {
        return PlayerAPI.MC.bgK.crX;
    }

    public boolean isCollidedHorizontally() {
        return PlayerAPI.MC.bgK.crR;
    }

    public boolean isCollidedVertically() {
        return PlayerAPI.MC.bgK.crW;
    }

    public boolean isPotionActive(int n2) {
        return PlayerAPI.MC.bgK.isPotionActive(n2);
    }

    public void placeBlock(ScriptItemStack scriptItemStack, ScriptVector3d scriptVector3d, int n2, ScriptVector3d scriptVector3d2) {
        PlayerAPI.MC.bgu.a(PlayerAPI.MC.bgK, PlayerAPI.MC.bgF, scriptItemStack.getWrapped(), new b(scriptVector3d.getX(), scriptVector3d.getY(), scriptVector3d.getZ()), ao.hy(n2), new da(scriptVector3d2.getX(), scriptVector3d2.getY(), scriptVector3d2.getZ()));
    }

    public String getGUI() {
        if (PlayerAPI.MC.bgR == null) {
            return "none";
        }
        if (PlayerAPI.MC.bgR instanceof h) {
            return "chest";
        }
        if (PlayerAPI.MC.bgR instanceof abf) {
            return "clickgui";
        }
        if (PlayerAPI.MC.bgR instanceof f) {
            return "chat";
        }
        if (PlayerAPI.MC.bgR instanceof q) {
            return "inventory";
        }
        return "undefined";
    }

    public int getTicksSinceVelocity() {
        return PlayerAPI.MC.bgK.ae;
    }

    public int getTicksSinceTeleport() {
        return PlayerAPI.MC.bgK.Zz;
    }
}

