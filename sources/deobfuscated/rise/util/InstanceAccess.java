/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package rise.util;

import com.google.gson.Gson;
import hackclient.rise.ady;
import hackclient.rise.am;
import hackclient.rise.ge;
import hackclient.rise.gf;
import hackclient.rise.gg;
import net.minecraft.client.Minecraft;
import rise.Client;
import rise.module.Module;
import rise.ui.clickgui.ModernClickGui;

public interface InstanceAccess {
    public static final Minecraft aER = Minecraft.getMinecraft();

    default public Client sd() {
        return Client.a;
    }

    default public gf u() {
        return this.sd().u();
    }

    default public ModernClickGui v() {
        return this.sd().v();
    }

    default public ge b(gg gg2) {
        return this.u().a(gg2);
    }

    default public ge b(gg gg2, int n2) {
        return this.u().a(gg2, n2);
    }

    default public <T extends am> T d(Class<T> clazz) {
        return this.sd().h().b(clazz);
    }

    default public ady rP() {
        return this.sd().k().rP();
    }

    default public <T extends Module> T e(Class<T> clazz) {
        return this.sd().g().c(clazz);
    }

    default public Gson A() {
        return this.sd().A();
    }

    default public Minecraft se() {
        return Minecraft.getMinecraft();
    }
}

