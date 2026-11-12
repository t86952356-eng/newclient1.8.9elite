/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.network.handler;

import hackclient.rise.ady;
import hackclient.rise.ahd;
import hackclient.rise.ahg;
import hackclient.rise.ajx;
import hackclient.rise.akj;
import hackclient.rise.akl;
import hackclient.rise.akn;
import hackclient.rise.ako;
import hackclient.rise.akr;
import hackclient.rise.er;
import java.awt.Color;
import java.util.HashMap;
import java.util.regex.Pattern;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.h;
import net.minecraft.network.r;
import net.minecraft.util.cp;
import rip.vantage.commons.packet.impl.server.community.d;
import rip.vantage.commons.packet.impl.server.community.e;
import rip.vantage.commons.packet.impl.server.protection.f;
import rip.vantage.commons.packet.impl.server.protection.g;
import rip.vantage.network.core.a;
import rip.vantage.network.handler.c;
import rip.vantage.security.l;
import rise.Client;
import rise.module.Mode;
import rise.module.Module;
import rise.module.impl.render.ClickGUI;
import rise.util.InstanceAccess;
import rise.util.Language;
import rise.util.math.Vector2d;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;
import rise.value.Value;

public final class b
implements rip.vantage.commons.handler.api.c {
    private final rip.vantage.commons.util.time.a eSm = new rip.vantage.commons.util.time.a();

    @Override
    public void a(rip.vantage.commons.packet.impl.server.protection.b b2) {
        long l2;
        String string;
        String string2 = b2.aKw();
        if (string2 != null && !string2.isEmpty() && !l.aL(string = ajx.wl(), string2)) {
            System.out.println("EC57");
            rip.vantage.util.a.a(b2, Boolean.TYPE, (Object)false);
            rip.vantage.util.a.kR(string);
        }
        if (!l.V(l2 = l.a(b2, b2.aKx(), b2.aKz(), b2.aKA(), b2.aKB()))) {
            System.out.println("EC74");
            rip.vantage.util.a.kF(1);
            rip.vantage.util.a.kG(1);
            throw new SecurityException("EC74");
        }
        Client.a.e().d(new er(b2));
        this.eSm.aX();
        h h2 = InstanceAccess.aER.AU();
        if (h2 != null) {
            r r2 = h2.dr();
            String string3 = r2.afb().toString().split(":")[0];
            int n2 = Integer.parseInt(r2.afb().toString().split(":")[1]);
            a.aKQ().aKZ().sendMessage(new rip.vantage.commons.packet.impl.client.protection.d(string3, n2, InstanceAccess.aER.Bl().bX()).aJz());
        }
    }

    @Override
    public void a(f f2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.protection.e e2) {
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.protection.a a2) {
        Minecraft.getMinecraft().bgO = new cp(a2.bX(), a2.sx(), a2.sy(), "microsoft");
        Client.a.e().d(new er(a2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.management.a a2) {
        Minecraft.getMinecraft().bha.bnS = -50L;
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.community.b b2) {
        Client.a.e().d(new er(b2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.community.c c2) {
        Client.a.e().d(new er(c2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.protection.c c2) {
        Client.a.e().d(new er(c2));
    }

    @Override
    public void a(d d2) {
        Client.a.e().d(new er(d2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.community.a a2) {
        Client.a.e().d(new er(a2));
    }

    @Override
    public void a(e e2) {
        Client.a.e().d(new er(e2));
    }

    public void a(rip.vantage.commons.packet.impl.server.general.a a2) {
        c.eSp.aX();
        this.eSm.aX();
    }

    @Override
    public void a(g g2) {
        long l2;
        byte[] byArray = g2.aJU();
        if (byArray == null || byArray.length != 32) {
            System.out.println("EC151");
            rip.vantage.util.a.kF(1);
            rip.vantage.util.a.kG(1);
            throw new SecurityException("EC151");
        }
        long l3 = g2.ns();
        if (l3 > 0L && (l2 = Math.abs(System.currentTimeMillis() - l3)) > 60000L) {
            System.out.println("EC152");
        }
        if (!l.aMI()) {
            System.out.println("EC40 - ProofOfWork integrity failed");
            rip.vantage.util.a.kF(1);
            rip.vantage.util.a.kG(1);
            throw new SecurityException("EC40");
        }
        a.aKQ().n(byArray);
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.monitoring.a a2) {
        Client.a.e().d(new er(a2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.monitoring.h h2) {
        Client.a.e().d(new er(h2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.monitoring.b b2) {
        Client.a.e().d(new er(b2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.monitoring.d d2) {
        Client.a.e().d(new er(d2));
    }

    @Override
    public void b(rip.vantage.commons.packet.impl.server.monitoring.e e2) {
        Client.a.e().d(new er(e2));
    }

    @Override
    public void b(rip.vantage.commons.packet.impl.server.monitoring.f f2) {
        Client.a.e().d(new er(f2));
    }

    @Override
    public void b(rip.vantage.commons.packet.impl.server.monitoring.c c2) {
        Client.a.e().d(new er(c2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.monitoring.g g2) {
        Client.a.e().d(new er(g2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.protection.h h2) {
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.protection.d d2) {
        Client.a.e().d(new er(d2));
    }

    private static /* synthetic */ void q(String[] stringArray) {
        Client.a.k().a(ady.valueOf(stringArray[1]));
    }
}

