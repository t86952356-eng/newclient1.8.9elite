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
    public void a(f f2) {
        ahd.aNC.execute(() -> {
            void var5_14;
            void var5_12;
            HashMap<String, Module> hashMap = new HashMap<String, Module>();
            for (Module stringArray : Client.a.g().ef()) {
                stringArray.setEnabled(false);
                String string = stringArray.getModuleInfo().aliases()[0];
                hashMap.put(string, stringArray);
                for (Language language : Language.values()) {
                    String string2 = ahg.a(string, language);
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
                for (Value<?> value : stringArray.getAllValues()) {
                    value.m(value.wH());
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
                        Module module = (Module)hashMap.get(var7_24);
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
                                for (Value<?> value : module.getAllValues()) {
                                    Value value2;
                                    ++n3;
                                    String string6 = value.getName() + " in " + (String)(value.wF() != null ? (value.wF() instanceof Module ? ((Module)value.wF()).getModuleInfo().aliases()[0] + " Module" : ((Mode)value.wF()).getName() + " Mode") : "Unknown");
                                    if (string4.contains("*")) {
                                        string6 = value.getName() + "*" + n3;
                                    }
                                    if (!string6.equalsIgnoreCase(string4)) continue;
                                    if (value instanceof ModeValue) {
                                        value2 = (ModeValue)value;
                                        ((ModeValue)value2).cp(string.split("_" + Pattern.quote(string5) + "_")[1]);
                                        continue;
                                    }
                                    if (value instanceof BooleanValue) {
                                        value2 = (BooleanValue)value;
                                        ((BooleanValue)value2).c(Boolean.parseBoolean(string.split("_" + Pattern.quote(string5) + "_")[1]));
                                        continue;
                                    }
                                    if (value instanceof akr) {
                                        value2 = (akr)value;
                                        if (!string.contains("_" + Pattern.quote(string5) + "_")) continue;
                                        value2.n(string.split("_" + Pattern.quote(string5) + "_")[1].replaceAll("<percentsign>", "%"));
                                        continue;
                                    }
                                    if (value instanceof NumberValue) {
                                        value2 = (NumberValue)value;
                                        value2.n(Double.parseDouble(string.split("_" + Pattern.quote(string5) + "_")[1]));
                                        continue;
                                    }
                                    if (value instanceof akj) {
                                        value2 = (akj)value;
                                        double d2 = Double.parseDouble(string.split("_" + Pattern.quote(string5) + "_")[1]);
                                        switch (string5) {
                                            case "first": {
                                                value2.n(d2);
                                                break;
                                            }
                                            case "second": {
                                                ((akj)value2).a(d2);
                                            }
                                        }
                                        continue;
                                    }
                                    if (value instanceof akl) {
                                        value2 = (akl)value;
                                        Color color = (Color)value2.wD();
                                        int n4 = Integer.parseInt(string.split("_" + Pattern.quote(string5) + "_")[1]);
                                        switch (string5) {
                                            case "red": {
                                                value2.n(new Color(n4, color.getGreen(), color.getBlue(), color.getAlpha()));
                                                break;
                                            }
                                            case "green": {
                                                value2.n(new Color(color.getRed(), n4, color.getBlue(), color.getAlpha()));
                                                break;
                                            }
                                            case "blue": {
                                                value2.n(new Color(color.getRed(), color.getGreen(), n4, color.getAlpha()));
                                                break;
                                            }
                                            case "alpha": {
                                                value2.n(new Color(color.getRed(), color.getGreen(), color.getBlue(), n4));
                                            }
                                        }
                                        continue;
                                    }
                                    if (value instanceof akn) {
                                        value2 = (akn)value;
                                        double d3 = Double.parseDouble(string.split("_" + Pattern.quote(string5) + "_")[1]);
                                        switch (string5) {
                                            case "positionX": {
                                                ((akn)value2).h(new Vector2d(d3, ((akn)value2).aqy.y));
                                                ((akn)value2).i(new Vector2d(d3, ((akn)value2).atP.y));
                                                break;
                                            }
                                            case "positionY": {
                                                ((akn)value2).h(new Vector2d(((akn)value2).aqy.x, d3));
                                                ((akn)value2).i(new Vector2d(((akn)value2).atP.x, d3));
                                                break;
                                            }
                                            case "scaleX": {
                                                ((akn)value2).n(new Vector2d(d3, ((akn)value2).aHP.y));
                                                break;
                                            }
                                            case "scaleY": {
                                                ((akn)value2).n(new Vector2d(((akn)value2).aHP.x, d3));
                                            }
                                        }
                                        continue;
                                    }
                                    if (!(value instanceof ako)) continue;
                                    value2 = (ako)value;
                                    for (Object t2 : ((ako)value2).wU()) {
                                        if (!t2.toString().equalsIgnoreCase(string.split("_" + Pattern.quote(string5) + "_")[1])) continue;
                                        value2.m(t2);
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
                    Module module = (Module)hashMap.get(string7);
                    switch (string8 = string.split("_")[1].split("_")[0]) {
                        case "e1": {
                            if (module instanceof ClickGUI) break;
                            module.setEnabled(Boolean.parseBoolean(string.split("_e1_")[1]));
                            break;
                        }
                        case "kc": {
                            module.setKey(Integer.parseInt(string.split("_kc_")[1]));
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

