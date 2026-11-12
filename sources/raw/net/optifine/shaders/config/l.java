/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

public class l {
    private final String eGQ;
    private final String eGR;

    public l(String string, String string2) {
        this.eGQ = string;
        this.eGR = string2;
    }

    public String getName() {
        return this.eGQ;
    }

    public String SN() {
        return this.eGR;
    }

    public String aHV() {
        return "#define " + this.eGQ + " " + this.eGR;
    }

    public String toString() {
        return this.aHV();
    }
}

