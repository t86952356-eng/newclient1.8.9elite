/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
package net.optifine.shaders.config;

import java.util.Properties;
import net.minecraft.src.a;
import org.apache.commons.lang3.ArrayUtils;

public class f {
    private final int[] eGr = null;
    private int eGs = 0;
    private String eGt = null;
    private String[] eGu = null;
    private String eGv = null;
    private String[] eGw = null;
    private int deN = 0;

    public f(String string, String[] stringArray, String string2, String[] stringArray2, int n2) {
        this.eGt = string;
        this.eGu = stringArray;
        this.eGv = string2;
        this.eGw = stringArray2;
        this.eGs = n2;
        if (stringArray.length != stringArray2.length) {
            throw new IllegalArgumentException("Property and user values have different lengths: " + stringArray.length + " != " + stringArray2.length);
        }
        if (n2 < 0 || n2 >= stringArray.length) {
            throw new IllegalArgumentException("Invalid default value: " + n2);
        }
        this.deN = n2;
    }

    public boolean je(String string) {
        if (string == null) {
            this.deN = this.eGs;
            return false;
        }
        this.deN = ArrayUtils.indexOf((Object[])this.eGu, (Object)string);
        if (this.deN >= 0 && this.deN < this.eGu.length) {
            return true;
        }
        this.deN = this.eGs;
        return false;
    }

    public void aHs() {
        ++this.deN;
        if (this.deN < 0 || this.deN >= this.eGu.length) {
            this.deN = 0;
        }
    }

    public void km(int n2) {
        this.deN = n2;
        if (this.deN < 0 || this.deN >= this.eGu.length) {
            this.deN = this.eGs;
        }
    }

    public int aHt() {
        return this.deN;
    }

    public String aHu() {
        return this.eGw[this.deN];
    }

    public String aHv() {
        return this.eGu[this.deN];
    }

    public String aHw() {
        return this.eGv;
    }

    public String aHx() {
        return this.eGt;
    }

    public void aHy() {
        this.deN = this.eGs;
    }

    public boolean c(Properties properties) {
        this.aHy();
        if (properties == null) {
            return false;
        }
        String string = properties.getProperty(this.eGt);
        return string != null && this.je(string);
    }

    public void d(Properties properties) {
        if (properties != null) {
            properties.setProperty(this.aHx(), this.aHv());
        }
    }

    public String toString() {
        return this.eGt + "=" + this.aHv() + " [" + a.c(this.eGu) + "], value: " + this.deN;
    }
}

