/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.ft;
import hackclient.rise.jm;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.entity.player.a;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.b;
import net.minecraft.network.play.server.br;

public class kt
extends akg<jm> {
    private final aki Af = new aki("Show Invisible Staff", (akg<?>)this, (Boolean)true);
    private final Set<String> Ag = new HashSet<String>();
    @dm
    public final dk<fh> Ah = fh2 -> {
        br br2;
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof br && (kt.y((String)((Object)(aj2 = (br2 = (br)aj2).ahW()))) || br2.ahX().equals("\u00a76\u00a7lSPEC \u00a76"))) {
            Collection<String> collection = br2.ahZ();
            String string = kt.a(collection);
            this.Ag.addAll(collection);
            if (br2.getAction() == 3) {
                afl.b("\u00a7cStaff Added: " + string, new Object[0]);
            } else {
                afl.b("\u00a7cStaff Joined: " + string + " \u00a77(Team: " + (String)((Object)aj2) + ")", new Object[0]);
            }
            if (((jm)this.wy()).gD()) {
                ahn.m(new b("/hub"));
            }
        }
    };
    @dm
    public final dk<ft> Ai = ft2 -> {
        if (!((Boolean)this.Af.wD()).booleanValue() || this.Ag.isEmpty()) {
            return;
        }
        for (a a2 : kt.aER.bgF.dCY) {
            if (a2 == null || a2.Ie() == null || !this.Ag.contains(a2.Ie().getName()) || !a2.isInvisible() && !a2.CZ()) continue;
            a2.ak(false);
        }
    };

    public kt(String string, jm jm2) {
        super(string, jm2);
    }

    @Override
    public void onEnable() {
        this.Ag.clear();
    }

    @Override
    public void onDisable() {
        this.Ag.clear();
    }

    private static String a(Collection<String> collection) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            stringBuilder.append(string);
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }

    public static boolean y(String string) {
        String string2;
        if (string.matches("spec\\d{2}")) {
            return true;
        }
        if (string.equals("a9990")) {
            return true;
        }
        if (string.startsWith("000pre")) {
            return true;
        }
        if (string.startsWith("a008-")) {
            return true;
        }
        if (string.contains("\u00a7") && (string2 = string.split("\u00a7")[0]).endsWith("00")) {
            return true;
        }
        return kt.z(string) && string.endsWith("01");
    }

    private static boolean z(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(string);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }
}

