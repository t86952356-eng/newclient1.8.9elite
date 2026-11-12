/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector4f
 */
package net.optifine.shaders.config;

import net.minecraft.src.a;
import net.optifine.util.aj;
import org.lwjgl.util.vector.Vector4f;

public class k {
    private final int eGE;
    private final String name;
    private final String eGG;
    private final String eGH;
    public static final int eGI = 1;
    public static final int eGJ = 2;
    public static final int eGK = 3;
    public static final int eGL = 4;
    public static final int eGM = 5;
    public static final int eGN = 6;
    public static final int eGO = 7;
    public static final int eGP = 8;

    public k(int n2, String string, String string2, String string3) {
        this.eGE = n2;
        this.name = string;
        this.eGG = string2;
        this.eGH = string3;
    }

    public int agG() {
        return this.eGE;
    }

    public String getName() {
        return this.name;
    }

    public String SN() {
        return this.eGG;
    }

    public boolean aHJ() {
        return this.eGE == 1;
    }

    public boolean jf(String string) {
        return this.aHJ() && string.equals(this.name);
    }

    public boolean aHK() {
        return this.eGE == 2;
    }

    public boolean jg(String string) {
        return this.aHK() && string.equals(this.name);
    }

    public boolean aHL() {
        return this.eGE == 6;
    }

    public boolean aHM() {
        return this.eGE == 3;
    }

    public boolean aHN() {
        return this.eGE == 4;
    }

    public boolean aHO() {
        return this.eGE == 5;
    }

    public boolean aHP() {
        return this.eGE == 7;
    }

    public boolean aHQ() {
        return this.eGE == 8;
    }

    public boolean jh(String string) {
        return this.aHL() && string.equals(this.name);
    }

    public boolean am(String string, String string2) {
        return this.jh(string) && string2.equals(this.eGG);
    }

    public boolean ji(String string) {
        return this.aHM() && string.equals(this.name);
    }

    public boolean jj(String string) {
        return this.aHM() && this.name.endsWith(string);
    }

    public boolean jk(String string) {
        return this.aHN() && string.equals(this.name);
    }

    public boolean jl(String string) {
        return this.aHO() && string.equals(this.name);
    }

    public boolean jm(String string) {
        return this.aHP() && string.equals(this.name);
    }

    public boolean jn(String string) {
        return this.aHO() && this.name.endsWith(string);
    }

    public boolean r(String string, boolean bl2) {
        return this.jn(string) && this.aHU() == bl2;
    }

    public boolean an(String string, String string2) {
        return this.jl(string) || this.jl(string2);
    }

    public boolean g(String string, String string2, String string3) {
        return this.jl(string) || this.jl(string2) || this.jl(string3);
    }

    public boolean s(String string, boolean bl2) {
        return this.jl(string) && this.aHU() == bl2;
    }

    public boolean b(String string, String string2, boolean bl2) {
        return this.an(string, string2) && this.aHU() == bl2;
    }

    public boolean a(String string, String string2, String string3, boolean bl2) {
        return this.g(string, string2, string3) && this.aHU() == bl2;
    }

    public boolean jo(String string) {
        return this.aHQ() && this.name.endsWith(string);
    }

    public int aHR() {
        try {
            return Integer.parseInt(this.eGG);
        }
        catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("Invalid integer: " + this.eGG + ", line: " + this.eGH);
        }
    }

    public float aHS() {
        try {
            return Float.parseFloat(this.eGG);
        }
        catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("Invalid float: " + this.eGG + ", line: " + this.eGH);
        }
    }

    public Vector4f aHT() {
        if (this.eGG == null) {
            return null;
        }
        String string = this.eGG.trim();
        string = aj.ax(string, "vec4");
        String[] stringArray = a.V(string = aj.aB(string, " ()"), ", ");
        if (stringArray.length != 4) {
            return null;
        }
        float[] fArray = new float[4];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2 = stringArray[i2];
            float f2 = a.b(string2 = aj.e(string2, new String[]{"F", "f"}), Float.MAX_VALUE);
            if (f2 == Float.MAX_VALUE) {
                return null;
            }
            fArray[i2] = f2;
        }
        return new Vector4f(fArray[0], fArray[1], fArray[2], fArray[3]);
    }

    public boolean aHU() {
        String string = this.eGG.toLowerCase();
        if (!string.equals("true") && !string.equals("false")) {
            throw new RuntimeException("Invalid boolean: " + this.eGG + ", line: " + this.eGH);
        }
        return Boolean.valueOf(this.eGG);
    }
}

