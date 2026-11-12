/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.realms;

import java.lang.reflect.Constructor;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.ca;
import net.minecraft.realms.n;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class d
extends n {
    private static final Logger dis = LogManager.getLogger();
    private bp dit;

    public void b(bp bp2) {
        this.dit = bp2;
        try {
            Class<?> clazz = Class.forName("com.mojang.realmsclient.RealmsMainScreen");
            Constructor<?> constructor = clazz.getDeclaredConstructor(n.class);
            constructor.setAccessible(true);
            Object obj = constructor.newInstance(this);
            net.minecraft.client.d.AZ().a(((n)obj).getProxy());
        }
        catch (Exception exception) {
            dis.error("Realms module missing", (Throwable)exception);
        }
    }

    public ca c(bp bp2) {
        try {
            this.dit = bp2;
            Class<?> clazz = Class.forName("com.mojang.realmsclient.gui.screens.RealmsNotificationsScreen");
            Constructor<?> constructor = clazz.getDeclaredConstructor(n.class);
            constructor.setAccessible(true);
            Object obj = constructor.newInstance(this);
            return ((n)obj).getProxy();
        }
        catch (Exception exception) {
            dis.error("Realms module missing", (Throwable)exception);
            return null;
        }
    }

    @Override
    public void init() {
        net.minecraft.client.d.AZ().a(this.dit);
    }
}

