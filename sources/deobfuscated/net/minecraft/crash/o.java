/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.crash;

class o {
    private final String cpu;
    private final String cpv;

    public o(String string, Object object) {
        this.cpu = string;
        if (object == null) {
            this.cpv = "~~NULL~~";
        } else if (object instanceof Throwable) {
            Throwable throwable = (Throwable)object;
            this.cpv = "~~ERROR~~ " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage();
        } else {
            this.cpv = object.toString();
        }
    }

    public String SM() {
        return this.cpu;
    }

    public String SN() {
        return this.cpv;
    }
}

