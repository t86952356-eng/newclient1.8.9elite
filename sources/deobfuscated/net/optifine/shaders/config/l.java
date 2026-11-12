/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders.config;

public class l {
    private final String name;
    private final String eGR;

    public l(String string, String string2) {
        this.name = string;
        this.eGR = string2;
    }

    public String getName() {
        return this.name;
    }

    public String SN() {
        return this.eGR;
    }

    public String aHV() {
        return "#define " + this.name + " " + this.eGR;
    }

    public String toString() {
        return this.aHV();
    }
}

