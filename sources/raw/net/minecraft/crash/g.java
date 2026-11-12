/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.crash;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;
import java.util.concurrent.Callable;
import net.minecraft.crash.a;

class g
implements Callable<String> {
    g(a a2) {
    }

    public String HV() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List<String> list = runtimeMXBean.getInputArguments();
        int n2 = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : list) {
            if (!string.startsWith("-X")) continue;
            if (n2++ > 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(string);
        }
        return String.format("%d total; %s", n2, stringBuilder.toString());
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

