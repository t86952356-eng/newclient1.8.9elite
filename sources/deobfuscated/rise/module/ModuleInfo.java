/*
 * Decompiled with CFR 0.152.
 */
package rise.module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import rise.module.Category;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface ModuleInfo {
    public String[] aliases();

    public String description();

    public Category category();

    public int keyBind() default 0;

    public boolean autoEnabled() default false;

    public boolean allowDisable() default true;
}

