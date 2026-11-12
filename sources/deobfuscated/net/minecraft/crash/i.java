/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.crash;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.crash.a;
import net.minecraft.crash.j;
import net.minecraft.crash.k;
import net.minecraft.crash.l;
import net.minecraft.crash.m;
import net.minecraft.crash.n;
import net.minecraft.crash.o;
import net.minecraft.util.b;

public class i {
    private final a cpk;
    private final String cpl;
    private final List<o> cpm = Lists.newArrayList();
    private StackTraceElement[] cpn = new StackTraceElement[0];

    public i(a a2, String string) {
        this.cpk = a2;
        this.cpl = string;
    }

    public static String K(double d2, double d3, double d4) {
        return String.format("%.2f,%.2f,%.2f - %s", d2, d3, d4, i.Z(new b(d2, d3, d4)));
    }

    public static String Z(b b2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10 = b2.wt();
        int n11 = b2.wu();
        int n12 = b2.wx();
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(String.format("World: (%d,%d,%d)", n10, n11, n12));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding world loc)");
        }
        stringBuilder.append(", ");
        try {
            int n13 = n10 >> 4;
            n9 = n12 >> 4;
            n8 = n10 & 0xF;
            n7 = n11 >> 4;
            n6 = n12 & 0xF;
            n5 = n13 << 4;
            n4 = n9 << 4;
            n3 = (n13 + 1 << 4) - 1;
            n2 = (n9 + 1 << 4) - 1;
            stringBuilder.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", n8, n7, n6, n13, n9, n5, n4, n3, n2));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding chunk loc)");
        }
        stringBuilder.append(", ");
        try {
            int n14 = n10 >> 9;
            n9 = n12 >> 9;
            n8 = n14 << 5;
            n7 = n9 << 5;
            n6 = (n14 + 1 << 5) - 1;
            n5 = (n9 + 1 << 5) - 1;
            n4 = n14 << 9;
            n3 = n9 << 9;
            n2 = (n14 + 1 << 9) - 1;
            int n15 = (n9 + 1 << 9) - 1;
            stringBuilder.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", n14, n9, n8, n7, n6, n5, n4, n3, n2, n15));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding world loc)");
        }
        return stringBuilder.toString();
    }

    public void a(String string, Callable<String> callable) {
        try {
            this.b(string, callable.call());
        }
        catch (Throwable throwable) {
            this.a(string, throwable);
        }
    }

    public void b(String string, Object object) {
        this.cpm.add(new o(string, object));
    }

    public void a(String string, Throwable throwable) {
        this.b(string, throwable);
    }

    public int ef(int n2) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        if (stackTraceElementArray.length <= 0) {
            return 0;
        }
        this.cpn = new StackTraceElement[stackTraceElementArray.length - 3 - n2];
        System.arraycopy(stackTraceElementArray, 3 + n2, this.cpn, 0, this.cpn.length);
        return this.cpn.length;
    }

    public boolean a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (this.cpn.length == 0 || stackTraceElement == null) {
            return false;
        }
        StackTraceElement stackTraceElement3 = this.cpn[0];
        try {
            if (stackTraceElement3 == null || stackTraceElement == null) {
                return false;
            }
            if (!i.O(stackTraceElement3.getClassName(), stackTraceElement.getClassName())) {
                return false;
            }
            if (!i.O(stackTraceElement3.getFileName(), stackTraceElement.getFileName())) {
                return false;
            }
            if (!i.O(stackTraceElement3.getMethodName(), stackTraceElement.getMethodName())) {
                return false;
            }
            if (stackTraceElement2 == null != this.cpn.length > 1) {
                return false;
            }
            if (stackTraceElement2 != null && !stackTraceElement2.equals(this.cpn[1])) {
                return false;
            }
            this.cpn[0] = stackTraceElement;
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private static boolean O(String string, String string2) {
        if (string == null && string2 == null) {
            return true;
        }
        if (string == null || string2 == null) {
            return false;
        }
        return string.equals(string2);
    }

    public void eg(int n2) {
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[this.cpn.length - n2];
        System.arraycopy(this.cpn, 0, stackTraceElementArray, 0, stackTraceElementArray.length);
        this.cpn = stackTraceElementArray;
    }

    public void b(StringBuilder stringBuilder) {
        stringBuilder.append("-- ").append(this.cpl).append(" --\n");
        stringBuilder.append("Details:");
        for (o o2 : this.cpm) {
            stringBuilder.append("\n\t");
            stringBuilder.append(o2.SM());
            stringBuilder.append(": ");
            stringBuilder.append(o2.SN());
        }
        if (this.cpn != null && this.cpn.length > 0) {
            stringBuilder.append("\nStacktrace:");
            for (StackTraceElement stackTraceElement : this.cpn) {
                stringBuilder.append("\n\tat ");
                stringBuilder.append(stackTraceElement.toString());
            }
        }
    }

    public StackTraceElement[] SL() {
        return this.cpn;
    }

    public static void a(i i2, b b2, Block block, int n2) {
        int n3 = Block.i(block);
        i2.a("Block type", new j(n3, block));
        i2.a("Block data value", new k(n2));
        i2.a("Block location", new l(b2));
    }

    public static void a(i i2, b b2, IBlockState iBlockState) {
        i2.a("Block", new m(iBlockState));
        i2.a("Block location", new n(b2));
    }
}

