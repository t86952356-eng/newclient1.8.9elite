/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import java.io.InputStream;
import net.optifine.shaders.m;

public class ab
implements m {
    @Override
    public void close() {
    }

    @Override
    public InputStream iz(String string) {
        return ab.class.getResourceAsStream(string);
    }

    @Override
    public String getName() {
        return "(internal)";
    }

    @Override
    public boolean iA(String string) {
        return false;
    }
}

