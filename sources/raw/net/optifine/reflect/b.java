/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.reflect;

import java.lang.reflect.Field;
import net.optifine.reflect.f;

public class b
implements f {
    private final Field enc;

    public b(Field field) {
        this.enc = field;
    }

    @Override
    public Field aDx() {
        return this.enc;
    }
}

