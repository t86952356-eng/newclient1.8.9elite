/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

public final class aep
extends Enum<aep> {
    public static final /* enum */ aep aFz = new aep("Cracked");
    public static final /* enum */ aep aFA = new aep("Microsoft");
    public static final /* enum */ aep aFB = new aep("Rave");
    private final String name;
    private static final /* synthetic */ aep[] aFD;

    public static aep[] values() {
        return (aep[])aFD.clone();
    }

    public static aep valueOf(String string) {
        return Enum.valueOf(aep.class, string);
    }

    private aep(String string2) {
        this.name = string2;
    }

    public static aep bi(String string) {
        for (aep aep2 : aep.values()) {
            if (!aep2.getName().equalsIgnoreCase(string)) continue;
            return aep2;
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    private static /* synthetic */ aep[] sA() {
        return new aep[]{aFz, aFA, aFB};
    }

    static {
        aFD = aep.sA();
    }
}

