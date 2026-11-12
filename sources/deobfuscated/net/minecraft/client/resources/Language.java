/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

public class Language
implements Comparable<Language> {
    private final String ccU;
    private final String ccV;
    private final String ccW;
    private final boolean ccX;

    public Language(String string, String string2, String string3, boolean bl2) {
        this.ccU = string;
        this.ccV = string2;
        this.ccW = string3;
        this.ccX = bl2;
    }

    public String Pn() {
        return this.ccU;
    }

    public boolean Po() {
        return this.ccX;
    }

    public String toString() {
        return String.format("%s (%s)", this.ccW, this.ccV);
    }

    public boolean equals(Object object) {
        return this == object || object instanceof Language && this.ccU.equals(((Language)object).ccU);
    }

    public int hashCode() {
        return this.ccU.hashCode();
    }

    public int a(Language language) {
        return this.ccU.compareTo(language.ccU);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((Language)object);
    }
}

