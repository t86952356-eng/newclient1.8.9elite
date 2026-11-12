/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import net.minecraft.command.a;
import net.minecraft.command.ae;
import net.minecraft.command.af;
import net.minecraft.command.ag;
import net.minecraft.command.ah;
import net.minecraft.command.ai;
import net.minecraft.command.ak;
import net.minecraft.command.al;
import net.minecraft.command.am;
import net.minecraft.command.an;
import net.minecraft.command.ao;
import net.minecraft.command.ap;
import net.minecraft.command.aq;
import net.minecraft.command.ar;
import net.minecraft.command.at;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.c;
import net.minecraft.command.d;
import net.minecraft.command.e;
import net.minecraft.command.g;
import net.minecraft.command.o;
import net.minecraft.command.q;
import net.minecraft.command.r;
import net.minecraft.command.s;
import net.minecraft.command.server.aa;
import net.minecraft.command.server.ab;
import net.minecraft.command.server.ac;
import net.minecraft.command.server.ad;
import net.minecraft.command.server.h;
import net.minecraft.command.server.i;
import net.minecraft.command.server.j;
import net.minecraft.command.server.k;
import net.minecraft.command.server.l;
import net.minecraft.command.server.m;
import net.minecraft.command.server.n;
import net.minecraft.command.server.p;
import net.minecraft.command.server.x;
import net.minecraft.command.t;
import net.minecraft.command.u;
import net.minecraft.command.v;
import net.minecraft.command.w;
import net.minecraft.command.y;
import net.minecraft.command.z;
import net.minecraft.server.MinecraftServer;

public class bm
extends u
implements at {
    public bm() {
        this.b(new al());
        this.b(new r());
        this.b(new net.minecraft.command.j());
        this.b(new net.minecraft.command.i());
        this.b(new w());
        this.b(new an());
        this.b(new ap());
        this.b(new ar());
        this.b(new aa());
        this.b(new t());
        this.b(new net.minecraft.command.aa());
        this.b(new ak());
        this.b(new net.minecraft.command.k());
        this.b(new net.minecraft.command.l());
        this.b(new y());
        this.b(new j());
        this.b(new ah());
        this.b(new v());
        this.b(new net.minecraft.command.h());
        this.b(new m());
        this.b(new h());
        this.b(new ag());
        this.b(new x());
        this.b(new s());
        this.b(new d());
        this.b(new ab());
        this.b(new ai());
        this.b(new z());
        this.b(new net.minecraft.command.server.v());
        this.b(new o());
        this.b(new ao());
        this.b(new net.minecraft.command.server.a());
        this.b(new net.minecraft.command.server.z());
        this.b(new net.minecraft.command.server.w());
        this.b(new q());
        this.b(new e());
        this.b(new g());
        this.b(new c());
        this.b(new ac());
        this.b(new n());
        this.b(new aq());
        this.b(new am());
        this.b(new net.minecraft.command.m());
        if (MinecraftServer.afs().alt()) {
            this.b(new net.minecraft.command.server.o());
            this.b(new i());
            this.b(new net.minecraft.command.server.y());
            this.b(new net.minecraft.command.server.s());
            this.b(new net.minecraft.command.server.t());
            this.b(new net.minecraft.command.server.u());
            this.b(new net.minecraft.command.server.c());
            this.b(new p());
            this.b(new net.minecraft.command.server.d());
            this.b(new k());
            this.b(new net.minecraft.command.server.q());
            this.b(new ae());
            this.b(new l());
            this.b(new ad());
            this.b(new af());
        } else {
            this.b(new net.minecraft.command.server.r());
        }
        a.a(this);
    }

    @Override
    public void a(aw aw2, au au2, int n2, String string, Object ... objectArray) {
        boolean bl2 = true;
        MinecraftServer minecraftServer = MinecraftServer.afs();
        if (!aw2.Sg()) {
            bl2 = false;
        }
        net.minecraft.util.t t2 = new net.minecraft.util.t("chat.type.admin", aw2.xU(), new net.minecraft.util.t(string, objectArray));
        t2.arp().b(net.minecraft.util.an.dvS);
        t2.arp().g(true);
        if (bl2) {
            for (net.minecraft.entity.player.a a2 : minecraftServer.alE().amB()) {
                boolean bl3;
                if (a2 == aw2 || !minecraftServer.alE().k(a2.Ie()) || !au2.a(aw2)) continue;
                boolean bl4 = aw2 instanceof MinecraftServer && MinecraftServer.afs().akT();
                boolean bl5 = bl3 = aw2 instanceof net.minecraft.network.rcon.a && MinecraftServer.afs().akS();
                if (!bl4 && !bl3 && (aw2 instanceof net.minecraft.network.rcon.a || aw2 instanceof MinecraftServer)) continue;
                a2.a(t2);
            }
        }
        if (aw2 != minecraftServer && minecraftServer.dkG[0].Si().gw("logAdminCommands")) {
            minecraftServer.a(t2);
        }
        boolean bl6 = minecraftServer.dkG[0].Si().gw("sendCommandFeedback");
        if (aw2 instanceof net.minecraft.command.server.e) {
            bl6 = ((net.minecraft.command.server.e)aw2).SB();
        }
        if ((n2 & 1) != 1 && bl6 || aw2 instanceof MinecraftServer) {
            aw2.a(new net.minecraft.util.t(string, objectArray));
        }
    }
}

