/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api;

import com.alan.clients.script.api.API;
import com.alan.clients.script.api.wrapper.impl.ScriptEntity;
import com.alan.clients.script.api.wrapper.impl.ScriptItemStack;
import com.alan.clients.script.api.wrapper.impl.packet.ScriptPacket;
import com.alan.clients.script.api.wrapper.impl.vector.ScriptVector3d;
import hackclient.rise.a;
import hackclient.rise.ahn;
import hackclient.rise.bu;
import net.minecraft.client.d;
import net.minecraft.entity.player.i;
import net.minecraft.network.play.client.aa;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.l;
import net.minecraft.network.play.client.m;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;
import net.minecraft.network.play.client.p;
import net.minecraft.network.play.client.q;
import net.minecraft.network.play.client.s;
import net.minecraft.network.play.client.u;
import net.minecraft.network.play.client.w;
import net.minecraft.network.play.client.x;
import net.minecraft.network.play.client.y;
import net.minecraft.network.play.client.z;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.da;

public class PacketAPI
extends API {
    public void receivePacket(ScriptPacket<?> scriptPacket) {
        if (scriptPacket != null && scriptPacket.getWrapped() != null) {
            ahn.q(scriptPacket.getWrapped());
        }
    }

    public void sendBlockPlacement(int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        b b2 = new b(n2, n3, n4);
        a.a.h().b(bu.class);
        ahn.m(new k(b2, n5, bu.bO(), f2, f3, f4));
    }

    public void sendKeepAlive(int n2) {
        ahn.m(new net.minecraft.network.play.client.a(n2));
    }

    public void sendMessage(String string) {
        ahn.m(new net.minecraft.network.play.client.b(string));
    }

    public void sendUseEntity(ScriptEntity scriptEntity, String string) {
        this.sendUseEntity(scriptEntity.getEntityId(), string);
    }

    public void sendUseEntity(int n2, String string) {
        ahn.m(new c(d.AZ().bgF.cn(n2), net.minecraft.network.play.client.d.valueOf(string)));
    }

    public void sendUseEntity(int n2, ScriptVector3d scriptVector3d) {
        ahn.m(new c(d.AZ().bgF.cn(n2), new da(scriptVector3d.getX(), scriptVector3d.getY(), scriptVector3d.getZ())));
    }

    public void sendUseEntity(ScriptEntity scriptEntity, ScriptVector3d scriptVector3d) {
        this.sendUseEntity(scriptEntity.getEntityId(), scriptVector3d);
    }

    public void sendPosition(boolean bl2) {
        ahn.m(new e(bl2));
    }

    public void sendPosition(double d2, double d3, double d4, boolean bl2) {
        ahn.m(new f(d2, d3, d4, bl2));
    }

    public void sendPosition(double d2, double d3, double d4, float f2, float f3, boolean bl2) {
        ahn.m(new h(d2, d3, d4, f2, f3, bl2));
    }

    public void sendDigging(String string, ScriptVector3d scriptVector3d, String string2) {
        ahn.m(new net.minecraft.network.play.client.i(j.valueOf(string), new b(scriptVector3d.getX(), scriptVector3d.getY(), scriptVector3d.getZ()), ao.valueOf(string2)));
    }

    public void sendPlacement() {
        a.a.h().b(bu.class);
        ahn.m(new k(bu.bO()));
    }

    public void sendPlacement(ScriptVector3d scriptVector3d, int n2, float f2, float f3, float f4) {
        b b2 = new b(scriptVector3d.getX(), scriptVector3d.getY(), scriptVector3d.getZ());
        a.a.h().b(bu.class);
        ahn.m(new k(b2, n2, bu.bO(), f2, f3, f4));
    }

    public void sendPlacement(ScriptVector3d scriptVector3d, int n2, ScriptItemStack scriptItemStack, float f2, float f3, float f4) {
        ahn.m(new k(new b(scriptVector3d.getX(), scriptVector3d.getY(), scriptVector3d.getZ()), n2, scriptItemStack.getWrapped(), f2, f3, f4));
    }

    public void sendChangeItem(int n2) {
        ahn.m(new l(n2));
    }

    public void sendAnimation(int n2, String string) {
        ahn.m(new m());
    }

    public void sendEntityAction(int n2, String string) {
        ahn.m(new n(d.AZ().bgF.cn(n2), o.valueOf(string)));
    }

    public void sendInput(float f2, float f3, boolean bl2, boolean bl3) {
        ahn.m(new p(f2, f3, bl2, bl3));
    }

    public void sendCloseWindow(int n2) {
        ahn.m(new q(n2));
    }

    public void sendCloseWindow() {
        ahn.m(new q(d.AZ().bgK.cHY.cSL));
    }

    public void sendEnchantItem(int n2, int n3) {
        ahn.m(new u(n2, n3));
    }

    public void sendEnchantItem(int n2) {
        ahn.m(new u(d.AZ().bgK.cHY.cSL, n2));
    }

    public void sendTransaction(int n2, short s2, boolean bl2) {
        ahn.m(new s(n2, s2, bl2));
    }

    public void sendAbilities() {
        ahn.m(new w(d.AZ().bgK.cIt));
    }

    public void sendAbilities(boolean bl2, boolean bl3, boolean bl4) {
        i i2 = new i();
        i2.cJK = bl2;
        i2.cJL = bl3;
        i2.cJM = bl4;
        ahn.m(new w(i2));
    }

    public void sendTabComplete(String string) {
        ahn.m(new x(string));
    }

    public void sendTabComplete(String string, ScriptVector3d scriptVector3d) {
        ahn.m(new x(string, new b(scriptVector3d.getX(), scriptVector3d.getY(), scriptVector3d.getZ())));
    }

    public void sendStatus(String string) {
        ahn.m(new z(aa.valueOf(string)));
    }

    public void sendSettings() {
        ahn.m(new y());
    }
}

