/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface e {
    public String R();

    public String S();

    public String description();

    public boolean T() default false;
}

