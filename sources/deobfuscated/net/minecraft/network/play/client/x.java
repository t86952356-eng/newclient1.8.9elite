/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;
import org.apache.commons.lang3.StringUtils;

public class x
implements aj<b> {
    private String message;
    private net.minecraft.util.b dbJ;

    public x() {
    }

    public x(String string) {
        this(string, null);
    }

    public x(String string, net.minecraft.util.b b2) {
        this.message = string;
        this.dbJ = b2;
    }

    @Override
    public void a(ak ak2) {
        this.message = ak2.gs(Short.MAX_VALUE);
        boolean bl2 = ak2.readBoolean();
        if (bl2) {
            this.dbJ = ak2.afu();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(StringUtils.substring((String)this.message, (int)0, (int)Short.MAX_VALUE));
        boolean bl2 = this.dbJ != null;
        ak2.writeBoolean(bl2);
        if (bl2) {
            ak2.ak(this.dbJ);
        }
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    public String getMessage() {
        return this.message;
    }

    public net.minecraft.util.b agf() {
        return this.dbJ;
    }
}

