/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aam;
import hackclient.rise.aan;
import java.lang.reflect.Method;

public final class aaq
extends aam {
    private static final String[] axG = new String[]{"sun.instrument.InstrumentationImpl", "java.lang.instrument.Instrumentation", "java.lang.instrument.ClassDefinition", "java.lang.instrument.ClassFileTransformer", "java.lang.instrument.IllegalClassFormatException", "java.lang.instrument.UnmodifiableClassException"};
    private final Method axH = ClassLoader.class.getDeclaredMethod("findLoadedClass0", String.class);

    public aaq() {
        super(aan.axz, true);
    }

    @Override
    public boolean on() {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        for (String string : axG) {
            Object object = this.axH.invoke((Object)classLoader, string);
            if (object == null) continue;
            a.a.f().os();
            return true;
        }
        return false;
    }
}

