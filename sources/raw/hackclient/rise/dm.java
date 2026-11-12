/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface dm {
    public byte cH() default 2;
}

