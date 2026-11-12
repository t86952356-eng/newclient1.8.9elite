/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api;

import com.alan.clients.script.api.API;
import hackclient.rise.afl;
import java.util.Arrays;
import javax.script.ScriptException;
import net.minecraft.network.play.a;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.ac;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.g;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.l;
import net.minecraft.network.play.client.m;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.p;
import net.minecraft.network.play.client.q;
import net.minecraft.network.play.client.r;
import net.minecraft.network.play.client.s;
import net.minecraft.network.play.client.t;
import net.minecraft.network.play.client.u;
import net.minecraft.network.play.client.v;
import net.minecraft.network.play.client.w;
import net.minecraft.network.play.client.x;
import net.minecraft.network.play.client.y;
import net.minecraft.network.play.client.z;
import net.minecraft.network.play.server.aa;
import net.minecraft.network.play.server.ab;
import net.minecraft.network.play.server.ad;
import net.minecraft.network.play.server.ae;
import net.minecraft.network.play.server.af;
import net.minecraft.network.play.server.ag;
import net.minecraft.network.play.server.ah;
import net.minecraft.network.play.server.aj;
import net.minecraft.network.play.server.al;
import net.minecraft.network.play.server.an;
import net.minecraft.network.play.server.ao;
import net.minecraft.network.play.server.ap;
import net.minecraft.network.play.server.aq;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.as;
import net.minecraft.network.play.server.at;
import net.minecraft.network.play.server.au;
import net.minecraft.network.play.server.av;
import net.minecraft.network.play.server.aw;
import net.minecraft.network.play.server.ax;
import net.minecraft.network.play.server.ay;
import net.minecraft.network.play.server.az;
import net.minecraft.network.play.server.ba;
import net.minecraft.network.play.server.bb;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.bd;
import net.minecraft.network.play.server.be;
import net.minecraft.network.play.server.bf;
import net.minecraft.network.play.server.bg;
import net.minecraft.network.play.server.bh;
import net.minecraft.network.play.server.bi;
import net.minecraft.network.play.server.bl;
import net.minecraft.network.play.server.bm;
import net.minecraft.network.play.server.bn;
import net.minecraft.network.play.server.bo;
import net.minecraft.network.play.server.bq;
import net.minecraft.network.play.server.br;
import net.minecraft.network.play.server.bs;
import net.minecraft.network.play.server.bt;
import net.minecraft.network.play.server.bu;
import net.minecraft.network.play.server.bv;
import net.minecraft.network.play.server.bx;
import net.minecraft.network.play.server.by;
import net.minecraft.network.play.server.ca;
import net.minecraft.network.play.server.cc;
import net.minecraft.network.play.server.cd;
import net.minecraft.network.play.server.ce;
import net.minecraft.network.play.server.cf;
import net.minecraft.network.play.server.d;
import net.minecraft.network.play.server.o;

public class NetworkAPI
extends API {
    public static final Class<net.minecraft.network.aj<b>>[] serverbound = new Class[]{net.minecraft.network.play.client.a.class, net.minecraft.network.play.client.b.class, c.class, e.class, f.class, g.class, h.class, i.class, k.class, l.class, m.class, n.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, x.class, y.class, z.class, net.minecraft.network.play.client.ab.class, ac.class, net.minecraft.network.play.client.ad.class};
    public static final Class<net.minecraft.network.aj<a>>[] clientbound = new Class[]{net.minecraft.network.play.server.a.class, net.minecraft.network.play.server.b.class, net.minecraft.network.play.server.c.class, d.class, net.minecraft.network.play.server.e.class, net.minecraft.network.play.server.f.class, net.minecraft.network.play.server.g.class, net.minecraft.network.play.server.h.class, net.minecraft.network.play.server.i.class, net.minecraft.network.play.server.k.class, net.minecraft.network.play.server.l.class, net.minecraft.network.play.server.m.class, net.minecraft.network.play.server.n.class, o.class, net.minecraft.network.play.server.p.class, net.minecraft.network.play.server.q.class, net.minecraft.network.play.server.r.class, net.minecraft.network.play.server.s.class, net.minecraft.network.play.server.t.class, net.minecraft.network.play.server.u.class, net.minecraft.network.play.server.v.class, net.minecraft.network.play.server.z.class, aa.class, ab.class, net.minecraft.network.play.server.ac.class, ad.class, ae.class, af.class, ag.class, ah.class, aj.class, al.class, an.class, ao.class, ap.class, aq.class, ar.class, as.class, at.class, au.class, av.class, aw.class, ax.class, ay.class, az.class, ba.class, bb.class, bc.class, bd.class, be.class, bf.class, bg.class, bh.class, bi.class, bl.class, bm.class, bn.class, bo.class, bq.class, br.class, bs.class, bt.class, bu.class, bv.class, bx.class, by.class, ca.class, cc.class, cd.class, ce.class, cf.class};

    private static net.minecraft.network.aj<?> instantiatePacket(net.minecraft.network.f f2, int n2, Object ... objectArray) {
        net.minecraft.network.aj aj2 = null;
        try {
            if (f2 == net.minecraft.network.f.cYR) {
                aj2 = (net.minecraft.network.aj)Arrays.stream(clientbound[n2].getConstructors()).filter(constructor -> constructor.getParameterCount() == objectArray.length).findFirst().get().newInstance(objectArray);
            } else if (f2 == net.minecraft.network.f.cYQ) {
                aj2 = (net.minecraft.network.aj)Arrays.stream(serverbound[n2].getConstructors()).filter(constructor -> constructor.getParameterCount() == objectArray.length).findFirst().get().newInstance(objectArray);
            }
        }
        catch (Exception exception) {
            afl.b("Failed to instantiate packet!", new Object[0]);
            throw new ScriptException(exception);
        }
        return aj2;
    }

    public void sendPacket(int n2, Object ... objectArray) {
        net.minecraft.network.aj<?> aj2 = NetworkAPI.instantiatePacket(net.minecraft.network.f.cYQ, n2, objectArray);
        MC.AU().u(aj2);
    }

    public void receivePacket(int n2, Object ... objectArray) {
        net.minecraft.network.aj<?> aj2 = NetworkAPI.instantiatePacket(net.minecraft.network.f.cYR, n2, objectArray);
        MC.AU().w(aj2);
    }

    public boolean isSingleplayer() {
        return MC.isSingleplayer();
    }

    public boolean isMultiplayer() {
        return !MC.isSingleplayer() && MC.Be() != null;
    }

    public String getServerIP() {
        return MC.Be() != null ? NetworkAPI.MC.Be().bDH : null;
    }

    public String getServerName() {
        return MC.Be() != null ? NetworkAPI.MC.Be().fc : null;
    }

    public String getServerMOTD() {
        return MC.Be() != null ? NetworkAPI.MC.Be().bDJ : null;
    }
}

