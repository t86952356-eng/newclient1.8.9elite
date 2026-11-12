/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.network.handler;

import hackclient.rise.a;
import hackclient.rise.ady;
import hackclient.rise.aea;
import hackclient.rise.ahd;
import hackclient.rise.ahf;
import hackclient.rise.ahg;
import hackclient.rise.ajx;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.akl;
import hackclient.rise.akn;
import hackclient.rise.ako;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.akr;
import hackclient.rise.er;
import hackclient.rise.gi;
import hackclient.rise.wy;
import java.awt.Color;
import java.util.HashMap;
import java.util.regex.Pattern;
import net.minecraft.client.network.h;
import net.minecraft.network.r;
import net.minecraft.util.cp;
import rip.vantage.commons.packet.impl.server.community.d;
import rip.vantage.commons.packet.impl.server.community.e;
import rip.vantage.commons.packet.impl.server.protection.f;
import rip.vantage.commons.packet.impl.server.protection.g;
import rip.vantage.network.handler.c;
import rip.vantage.security.l;

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
        a.a.e().d(new er(b2));
        this.eSm.aX();
        h h2 = aea.aER.AU();
        if (h2 != null) {
            r r2 = h2.dr();
            String string3 = r2.afb().toString().split(":")[0];
            int n2 = Integer.parseInt(r2.afb().toString().split(":")[1]);
            rip.vantage.network.core.a.aKQ().aKZ().sendMessage(new rip.vantage.commons.packet.impl.client.protection.d(string3, n2, aea.aER.Bl().bX()).aJz());
        }
    }

    @Override
    public void a(f f2) {
        ahd.aNC.execute(() -> {
            void var5_14;
            void var5_12;
            HashMap<String, gi> hashMap = new HashMap<String, gi>();
            for (gi stringArray : a.a.g().ef()) {
                stringArray.setEnabled(false);
                String string = stringArray.getModuleInfo().aliases()[0];
                hashMap.put(string, stringArray);
                for (ahf ahf2 : ahf.values()) {
                    String string2 = ahg.a(string, ahf2);
                    if (string2 == null || string2.isEmpty() || string2.equals(string)) continue;
                    hashMap.putIfAbsent(string2, stringArray);
                }
                String[] stringArray2 = rip.vantage.util.a.n(stringArray);
                if (stringArray2 != null) {
                    for (String string3 : stringArray2) {
                        if (string3 == null || string3.isEmpty()) continue;
                        hashMap.putIfAbsent(string3, stringArray);
                    }
                }
                for (akh<?> akh2 : stringArray.getAllValues()) {
                    akh2.m(akh2.wH());
                }
            }
            boolean bl2 = false;
            String[] stringArray = f2.aJL().split("\n");
            int n2 = stringArray.length;
            boolean bl3 = false;
            while (var5_12 < n2) {
                String string = stringArray[var5_12];
                if (!bl2) {
                    var7_24 = string.split("th_");
                    if (((String[])var7_24).length > 1) {
                        rip.vantage.util.a.a(() -> b.q((String[])var7_24));
                    }
                    bl2 = true;
                } else {
                    var7_24 = string.split("_")[0].trim();
                    if (hashMap.containsKey(var7_24)) {
                        String string4;
                        gi gi2 = (gi)hashMap.get(var7_24);
                        switch (string4 = string.split("_")[1].split("_")[0]) {
                            case "e1": {
                                break;
                            }
                            case "kc": {
                                break;
                            }
                            default: {
                                String string5 = string.split("_" + Pattern.quote(string4) + "_")[1].split("_")[0];
                                int n3 = 0;
                                for (akh<?> akh3 : gi2.getAllValues()) {
                                    akh akh4;
                                    ++n3;
                                    String string6 = akh3.getName() + " in " + (String)(akh3.wF() != null ? (akh3.wF() instanceof gi ? ((gi)akh3.wF()).getModuleInfo().aliases()[0] + " Module" : ((akg)akh3.wF()).getName() + " Mode") : "Unknown");
                                    if (string4.contains("*")) {
                                        string6 = akh3.getName() + "*" + n3;
                                    }
                                    if (!string6.equalsIgnoreCase(string4)) continue;
                                    if (akh3 instanceof akp) {
                                        akh4 = (akp)akh3;
                                        ((akp)akh4).cp(string.split("_" + Pattern.quote(string5) + "_")[1]);
                                        continue;
                                    }
                                    if (akh3 instanceof aki) {
                                        akh4 = (aki)akh3;
                                        ((aki)akh4).c(Boolean.parseBoolean(string.split("_" + Pattern.quote(string5) + "_")[1]));
                                        continue;
                                    }
                                    if (akh3 instanceof akr) {
                                        akh4 = (akr)akh3;
                                        if (!string.contains("_" + Pattern.quote(string5) + "_")) continue;
                                        akh4.n(string.split("_" + Pattern.quote(string5) + "_")[1].replaceAll("<percentsign>", "%"));
                                        continue;
                                    }
                                    if (akh3 instanceof akq) {
                                        akh4 = (akq)akh3;
                                        akh4.n(Double.parseDouble(string.split("_" + Pattern.quote(string5) + "_")[1]));
                                        continue;
                                    }
                                    if (akh3 instanceof akj) {
                                        akh4 = (akj)akh3;
                                        double d2 = Double.parseDouble(string.split("_" + Pattern.quote(string5) + "_")[1]);
                                        switch (string5) {
                                            case "first": {
                                                akh4.n(d2);
                                                break;
                                            }
                                            case "second": {
                                                ((akj)akh4).a(d2);
                                            }
                                        }
                                        continue;
                                    }
                                    if (akh3 instanceof akl) {
                                        akh4 = (akl)akh3;
                                        Color color = (Color)akh4.wD();
                                        int n4 = Integer.parseInt(string.split("_" + Pattern.quote(string5) + "_")[1]);
                                        switch (string5) {
                                            case "red": {
                                                akh4.n(new Color(n4, color.getGreen(), color.getBlue(), color.getAlpha()));
                                                break;
                                            }
                                            case "green": {
                                                akh4.n(new Color(color.getRed(), n4, color.getBlue(), color.getAlpha()));
                                                break;
                                            }
                                            case "blue": {
                                                akh4.n(new Color(color.getRed(), color.getGreen(), n4, color.getAlpha()));
                                                break;
                                            }
                                            case "alpha": {
                                                akh4.n(new Color(color.getRed(), color.getGreen(), color.getBlue(), n4));
                                            }
                                        }
                                        continue;
                                    }
                                    if (akh3 instanceof akn) {
                                        akh4 = (akn)akh3;
                                        double d3 = Double.parseDouble(string.split("_" + Pattern.quote(string5) + "_")[1]);
                                        switch (string5) {
                                            case "positionX": {
                                                ((akn)akh4).h(new aka(d3, ((akn)akh4).aqy.y));
                                                ((akn)akh4).i(new aka(d3, ((akn)akh4).atP.y));
                                                break;
                                            }
                                            case "positionY": {
                                                ((akn)akh4).h(new aka(((akn)akh4).aqy.x, d3));
                                                ((akn)akh4).i(new aka(((akn)akh4).atP.x, d3));
                                                break;
                                            }
                                            case "scaleX": {
                                                ((akn)akh4).n(new aka(d3, ((akn)akh4).aHP.y));
                                                break;
                                            }
                                            case "scaleY": {
                                                ((akn)akh4).n(new aka(((akn)akh4).aHP.x, d3));
                                            }
                                        }
                                        continue;
                                    }
                                    if (!(akh3 instanceof ako)) continue;
                                    akh4 = (ako)akh3;
                                    for (Object t2 : ((ako)akh4).wU()) {
                                        if (!t2.toString().equalsIgnoreCase(string.split("_" + Pattern.quote(string5) + "_")[1])) continue;
                                        akh4.m(t2);
                                    }
                                }
                            }
                        }
                    }
                }
                ++var5_12;
            }
            String[] stringArray3 = f2.aJL().split("\n");
            n2 = stringArray3.length;
            boolean bl4 = false;
            while (var5_14 < n2) {
                String string = stringArray3[var5_14];
                String string7 = string.split("_")[0];
                if (hashMap.containsKey(string7)) {
                    String string8;
                    gi gi3 = (gi)hashMap.get(string7);
                    switch (string8 = string.split("_")[1].split("_")[0]) {
                        case "e1": {
                            if (gi3 instanceof wy) break;
                            gi3.setEnabled(Boolean.parseBoolean(string.split("_e1_")[1]));
                            break;
                        }
                        case "kc": {
                            gi3.setKey(Integer.parseInt(string.split("_kc_")[1]));
                        }
                    }
                }
                ++var5_14;
            }
        });
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.protection.e e2) {
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.protection.a a2) {
        net.minecraft.client.d.AZ().bgO = new cp(a2.bX(), a2.sx(), a2.sy(), "microsoft");
        a.a.e().d(new er(a2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.management.a a2) {
        net.minecraft.client.d.AZ().bha.bnS = -50L;
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.community.b b2) {
        a.a.e().d(new er(b2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.community.c c2) {
        a.a.e().d(new er(c2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.protection.c c2) {
        a.a.e().d(new er(c2));
    }

    @Override
    public void a(d d2) {
        a.a.e().d(new er(d2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.community.a a2) {
        a.a.e().d(new er(a2));
    }

    @Override
    public void a(e e2) {
        a.a.e().d(new er(e2));
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
        rip.vantage.network.core.a.aKQ().n(byArray);
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.monitoring.a a2) {
        a.a.e().d(new er(a2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.monitoring.h h2) {
        a.a.e().d(new er(h2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.monitoring.b b2) {
        a.a.e().d(new er(b2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.monitoring.d d2) {
        a.a.e().d(new er(d2));
    }

    @Override
    public void b(rip.vantage.commons.packet.impl.server.monitoring.e e2) {
        a.a.e().d(new er(e2));
    }

    @Override
    public void b(rip.vantage.commons.packet.impl.server.monitoring.f f2) {
        a.a.e().d(new er(f2));
    }

    @Override
    public void b(rip.vantage.commons.packet.impl.server.monitoring.c c2) {
        a.a.e().d(new er(c2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.monitoring.g g2) {
        a.a.e().d(new er(g2));
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.protection.h h2) {
    }

    @Override
    public void a(rip.vantage.commons.packet.impl.server.protection.d d2) {
        a.a.e().d(new er(d2));
    }

    private static /* synthetic */ void q(String[] stringArray) {
        a.a.k().a(ady.valueOf(stringArray[1]));
    }
}

