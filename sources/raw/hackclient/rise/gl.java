/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.gj;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface gl {
    public String[] aliases();

    public String description();

    public gj category();

    public int keyBind() default 0;

    public boolean autoEnabled() default false;

    public boolean allowDisable() default true;
}

