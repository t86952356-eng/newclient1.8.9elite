/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public class cm {
    protected final String dzK;
    protected final String dzL;

    public cm(int n2, String ... stringArray) {
        this.dzK = StringUtils.isEmpty((CharSequence)stringArray[0]) ? "minecraft" : stringArray[0].toLowerCase();
        this.dzL = stringArray[1];
        Validate.notNull((Object)this.dzL);
    }

    public cm(String string) {
        this(0, cm.gk(string));
    }

    public cm(String string, String string2) {
        this(0, string, string2);
    }

    protected static String[] gk(String string) {
        String[] stringArray = new String[]{null, string};
        int n2 = string.indexOf(58);
        if (n2 >= 0) {
            stringArray[1] = string.substring(n2 + 1);
            if (n2 > 1) {
                stringArray[0] = string.substring(0, n2);
            }
        }
        return stringArray;
    }

    public String atA() {
        return this.dzL;
    }

    public String atB() {
        return this.dzK;
    }

    public String toString() {
        return this.dzK + ":" + this.dzL;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cm)) {
            return false;
        }
        cm cm2 = (cm)object;
        return this.dzK.equals(cm2.dzK) && this.dzL.equals(cm2.dzL);
    }

    public int hashCode() {
        return 31 * this.dzK.hashCode() + this.dzL.hashCode();
    }
}

