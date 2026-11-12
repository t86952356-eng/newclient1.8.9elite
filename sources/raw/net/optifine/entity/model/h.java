/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import java.util.ArrayList;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.optifine.entity.model.g;

public abstract class h {
    private final Class egm;
    private final String egn;
    private final float ego;
    private String[] aliases;

    public h(Class clazz, String string, float f2) {
        this.egm = clazz;
        this.egn = string;
        this.ego = f2;
    }

    public h(Class clazz, String string, float f2, String[] stringArray) {
        this.egm = clazz;
        this.egn = string;
        this.ego = f2;
        this.aliases = stringArray;
    }

    public Class Np() {
        return this.egm;
    }

    public String getName() {
        return this.egn;
    }

    public String[] getAliases() {
        return this.aliases;
    }

    public float aCg() {
        return this.ego;
    }

    public abstract d aCn();

    public abstract ag a(d var1, String var2);

    public abstract String[] aCo();

    public abstract g a(d var1, float var2);

    public ag[] b(d d2) {
        String[] stringArray = this.aCo();
        ArrayList<ag> arrayList = new ArrayList<ag>();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string = stringArray[i2];
            ag ag2 = this.a(d2, string);
            if (ag2 == null) continue;
            arrayList.add(ag2);
        }
        ag[] agArray = arrayList.toArray(new ag[arrayList.size()]);
        return agArray;
    }
}

