/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.client.resources.model;

import net.minecraft.util.cm;
import org.apache.commons.lang3.StringUtils;

public class ModelResourceLocation
extends cm {
    private final String cfr;

    protected ModelResourceLocation(int n2, String ... stringArray) {
        super(0, stringArray[0], stringArray[1]);
        this.cfr = StringUtils.isEmpty((CharSequence)stringArray[2]) ? "normal" : stringArray[2].toLowerCase();
    }

    public ModelResourceLocation(String string) {
        this(0, ModelResourceLocation.dA(string));
    }

    public ModelResourceLocation(cm cm2, String string) {
        this(cm2.toString(), string);
    }

    public ModelResourceLocation(String string, String string2) {
        this(0, ModelResourceLocation.dA(string + "#" + (string2 == null ? "normal" : string2)));
    }

    protected static String[] dA(String string) {
        String[] stringArray = new String[]{null, string, null};
        int n2 = string.indexOf(35);
        String string2 = string;
        if (n2 >= 0) {
            stringArray[2] = string.substring(n2 + 1);
            if (n2 > 1) {
                string2 = string.substring(0, n2);
            }
        }
        System.arraycopy(cm.gk(string2), 0, stringArray, 0, 2);
        return stringArray;
    }

    public String ts() {
        return this.cfr;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof ModelResourceLocation && super.equals(object)) {
            ModelResourceLocation modelResourceLocation = (ModelResourceLocation)object;
            return this.cfr.equals(modelResourceLocation.cfr);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.cfr.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "#" + this.cfr;
    }
}

