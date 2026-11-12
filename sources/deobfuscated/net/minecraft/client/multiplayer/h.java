/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.multiplayer;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.aq;
import net.minecraft.client.multiplayer.f;
import net.minecraft.nbt.a;
import net.minecraft.nbt.n;
import net.minecraft.nbt.v;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import rise.Client;

public class h {
    private static final Logger bDX = LogManager.getLogger();
    private final Minecraft bDY;
    private final List<f> bDZ = Lists.newArrayList();

    public h(Minecraft minecraft) {
        this.bDY = minecraft;
        this.HJ();
    }

    public void HJ() {
        try {
            this.bDZ.clear();
            n n2 = a.h(new File(String.valueOf(this.bDY.bhf) + (String)(aq.bpU ? "/" + Client.b : ""), "servers.dat"));
            if (n2 == null) {
                return;
            }
            v v2 = n2.D("servers", 10);
            for (int i2 = 0; i2 < v2.aeS(); ++i2) {
                this.bDZ.add(f.c(v2.gi(i2)));
            }
        }
        catch (Exception exception) {
            bDX.error("Couldn't load server list", (Throwable)exception);
        }
    }

    public void HK() {
        try {
            v v2 = new v();
            for (f f2 : this.bDZ) {
                v2.a(f2.HD());
            }
            n n2 = new n();
            n2.b("servers", v2);
            a.a(n2, new File(String.valueOf(this.bDY.bhf) + (String)(aq.bpU ? "/" + Client.b : ""), "servers.dat"));
        }
        catch (Exception exception) {
            bDX.error("Couldn't save server list", (Throwable)exception);
        }
    }

    public f cl(int n2) {
        return this.bDZ.get(n2);
    }

    public void cm(int n2) {
        this.bDZ.remove(n2);
    }

    public void e(f f2) {
        this.bDZ.add(f2);
    }

    public void HL() {
        this.bDZ.clear();
    }

    public int HM() {
        return this.bDZ.size();
    }

    public void J(int n2, int n3) {
        f f2 = this.cl(n2);
        this.bDZ.set(n2, this.cl(n3));
        this.bDZ.set(n3, f2);
        this.HK();
    }

    public void a(int n2, f f2) {
        this.bDZ.set(n2, f2);
    }

    public static void f(f f2) {
        h h2 = new h(Minecraft.getMinecraft());
        h2.HJ();
        for (int i2 = 0; i2 < h2.HM(); ++i2) {
            f f3 = h2.cl(i2);
            if (!f3.fc.equals(f2.fc) || !f3.bDH.equals(f2.bDH)) continue;
            h2.a(i2, f2);
            break;
        }
        h2.HK();
    }
}

