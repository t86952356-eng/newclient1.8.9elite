/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.realms;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.realms.l;
import net.minecraft.util.be;
import net.minecraft.world.storage.j;

public class c {
    private final net.minecraft.world.storage.c dir;

    public c(net.minecraft.world.storage.c c2) {
        this.dir = c2;
    }

    public String getName() {
        return this.dir.getName();
    }

    public boolean fc(String string) {
        return this.dir.gN(string);
    }

    public boolean a(String string, be be2) {
        return this.dir.b(string, be2);
    }

    public boolean fd(String string) {
        return this.dir.gG(string);
    }

    public boolean fe(String string) {
        return this.dir.gL(string);
    }

    public boolean ff(String string) {
        return this.dir.gM(string);
    }

    public boolean fg(String string) {
        return this.dir.gF(string);
    }

    public void S(String string, String string2) {
        this.dir.Z(string, string2);
    }

    public void ajL() {
        this.dir.axV();
    }

    public List<l> ajM() {
        ArrayList arrayList = Lists.newArrayList();
        for (j j2 : this.dir.axT()) {
            arrayList.add(new l(j2));
        }
        return arrayList;
    }
}

