/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.client.gui;

import com.google.common.base.Predicate;
import java.net.IDN;
import net.minecraft.client.gui.bq;

class br
implements Predicate<String> {
    br(bq bq2) {
    }

    public boolean cP(String string) {
        if (string.length() == 0) {
            return true;
        }
        String[] stringArray = string.split(":");
        if (stringArray.length == 0) {
            return true;
        }
        try {
            String string2 = IDN.toASCII(stringArray[0]);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.cP((String)object);
    }
}

