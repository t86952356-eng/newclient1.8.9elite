/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aa;
import hackclient.rise.ab;
import hackclient.rise.ac;
import hackclient.rise.ad;
import hackclient.rise.ae;
import hackclient.rise.af;
import hackclient.rise.afl;
import hackclient.rise.afm;
import hackclient.rise.ag;
import hackclient.rise.ah;
import hackclient.rise.ai;
import hackclient.rise.aj;
import hackclient.rise.ak;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dq;
import hackclient.rise.s;
import hackclient.rise.u;
import hackclient.rise.v;
import hackclient.rise.w;
import hackclient.rise.x;
import hackclient.rise.y;
import hackclient.rise.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lombok.Generated;

public final class t {
    private final List<s> bp = new ArrayList<s>();
    @dm
    public final dk<dq> bq = dq2 -> {
        u u2 = this.a(dq2.getMessage(), true);
        if (u2 != u.br) {
            dq2.cF();
        }
    };

    public void init() {
        this.a(new v());
        this.a(new ab());
        this.a(new w());
        this.a(new x());
        this.a(new y());
        this.a(new z());
        this.a(new aa());
        this.a(new ac());
        this.a(new aj());
        this.a(new ad());
        this.a(new ae());
        this.a(new af());
        this.a(new ah());
        this.a(new ak());
        this.a(new ag());
        this.a(new ai());
        a.a.e().b(this);
    }

    public void a(s s2) {
        this.bp.add(s2);
    }

    public <T extends s> T b(String string) {
        return (T)((s)this.bp.stream().filter(s2 -> Arrays.stream(s2.getExpressions()).anyMatch(string2 -> string2.equalsIgnoreCase(string))).findAny().orElse(null));
    }

    public u c(String string) {
        return this.a(string, true);
    }

    public u a(String string, boolean bl2) {
        boolean bl3;
        if (string == null) {
            return u.br;
        }
        String string2 = string.trim();
        if (string2.isEmpty()) {
            return u.br;
        }
        boolean bl4 = string2.startsWith(".");
        boolean bl5 = bl3 = !bl2 && string2.startsWith("/");
        if (bl4) {
            string2 = string2.substring(1);
        } else if (bl3) {
            string2 = string2.substring(1);
        } else if (bl2) {
            return u.br;
        }
        if (string2.isEmpty()) {
            afl.b("command.unknown", new Object[0]);
            return u.bt;
        }
        String[] stringArray = string2.trim().split("\\s+");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicReference<Object> atomicReference = new AtomicReference<Object>(null);
        try {
            this.bp.stream().filter(s2 -> Arrays.stream(s2.getExpressions()).anyMatch(string -> string.equalsIgnoreCase(stringArray[0]))).forEach(s2 -> {
                atomicBoolean.set(true);
                atomicReference.set(s2);
                s2.execute(stringArray);
            });
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (!atomicBoolean.get()) {
            afl.b("command.unknown", new Object[0]);
            return u.bt;
        }
        try {
            afm.sY().a((s)atomicReference.get(), stringArray);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return u.bs;
    }

    @Generated
    public List<s> aQ() {
        return this.bp;
    }
}

