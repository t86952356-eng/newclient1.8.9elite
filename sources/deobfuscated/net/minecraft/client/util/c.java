/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.client.util;

import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class c {
    private String cnD = null;
    private final List<String> cnE = Lists.newArrayList();

    private c() {
    }

    private void dL(String string) {
        this.cnE.add(0, string);
    }

    public String RR() {
        return StringUtils.join(this.cnE, (String)"->");
    }

    public String toString() {
        return this.cnD != null ? (!this.cnE.isEmpty() ? this.cnD + " " + this.RR() : this.cnD) : (!this.cnE.isEmpty() ? "(Unknown file) " + this.RR() : "(Unknown file)");
    }
}

