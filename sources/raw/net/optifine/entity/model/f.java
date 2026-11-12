/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.optifine.entity.model.anim.d;

public class f {
    private final String egi;
    private final boolean egj;
    private final ag egk;
    private final d egl;

    public f(String string, boolean bl2, ag ag2, d d2) {
        this.egi = string;
        this.egj = bl2;
        this.egk = ag2;
        this.egl = d2;
    }

    public ag aCj() {
        return this.egk;
    }

    public String aCk() {
        return this.egi;
    }

    public boolean aCl() {
        return this.egj;
    }

    public d aCm() {
        return this.egl;
    }
}

