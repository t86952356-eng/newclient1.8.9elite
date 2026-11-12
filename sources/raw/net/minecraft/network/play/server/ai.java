/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import java.util.Collection;
import net.minecraft.entity.ai.attributes.a;
import net.minecraft.network.play.server.ah;

public class ai {
    private final String ddk;
    private final double ddl;
    private final Collection<a> ddm;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public ai(ah ah2, String string, double d2, Collection collection) {
        this.ddk = string;
        this.ddl = d2;
        this.ddm = collection;
    }

    public String ahc() {
        return this.ddk;
    }

    public double ahd() {
        return this.ddl;
    }

    public Collection<a> ahe() {
        return this.ddm;
    }
}

