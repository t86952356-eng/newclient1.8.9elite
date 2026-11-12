/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package net.minecraft.crash;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import net.minecraft.crash.b;
import net.minecraft.crash.c;
import net.minecraft.crash.d;
import net.minecraft.crash.e;
import net.minecraft.crash.f;
import net.minecraft.crash.g;
import net.minecraft.crash.h;
import net.minecraft.crash.i;
import net.minecraft.util.cl;
import net.optifine.n;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a {
    private static final Logger cpb = LogManager.getLogger();
    private final String description;
    private final Throwable cpd;
    private final i cpe = new i(this, "System Details");
    private final List<i> cpf = Lists.newArrayList();
    private File cpg;
    private boolean cph = true;
    private StackTraceElement[] cpi = new StackTraceElement[0];
    private boolean cpj = false;

    public a(String string, Throwable throwable) {
        this.description = string;
        this.cpd = throwable;
        this.SF();
    }

    private void SF() {
        this.cpe.a("Minecraft Version", new b(this));
        this.cpe.a("Operating System", new c(this));
        this.cpe.a("Java Version", new d(this));
        this.cpe.a("Java VM Version", new e(this));
        this.cpe.a("Memory", new f(this));
        this.cpe.a("JVM Flags", new g(this));
        this.cpe.a("IntCache", new h(this));
        if (net.optifine.reflect.g.enY.aDA()) {
            Object object = net.optifine.reflect.g.g(net.optifine.reflect.g.eoc, new Object[0]);
            net.optifine.reflect.g.f(object, net.optifine.reflect.g.enY, this, this.cpe);
        }
    }

    public String getDescription() {
        return this.description;
    }

    public Throwable SG() {
        return this.cpd;
    }

    public void a(StringBuilder stringBuilder) {
        if ((this.cpi == null || this.cpi.length <= 0) && this.cpf.size() > 0) {
            this.cpi = (StackTraceElement[])ArrayUtils.subarray((Object[])this.cpf.get(0).SL(), (int)0, (int)1);
        }
        if (this.cpi != null && this.cpi.length > 0) {
            stringBuilder.append("-- Head --\n");
            stringBuilder.append("Stacktrace:\n");
            for (StackTraceElement stackTraceElement : this.cpi) {
                stringBuilder.append("\t").append("at ").append(stackTraceElement.toString());
                stringBuilder.append("\n");
            }
            stringBuilder.append("\n");
        }
        for (i i2 : this.cpf) {
            i2.b(stringBuilder);
            stringBuilder.append("\n\n");
        }
        this.cpe.b(stringBuilder);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String SH() {
        StringWriter stringWriter = null;
        PrintWriter printWriter = null;
        Throwable throwable = this.cpd;
        if (throwable.getMessage() == null) {
            if (throwable instanceof NullPointerException) {
                throwable = new NullPointerException(this.description);
            } else if (throwable instanceof StackOverflowError) {
                throwable = new StackOverflowError(this.description);
            } else if (throwable instanceof OutOfMemoryError) {
                throwable = new OutOfMemoryError(this.description);
            }
            throwable.setStackTrace(this.cpd.getStackTrace());
        }
        String string = throwable.toString();
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            throwable.printStackTrace(printWriter);
            string = stringWriter.toString();
        }
        catch (Throwable throwable2) {
            IOUtils.closeQuietly((Writer)stringWriter);
            IOUtils.closeQuietly(printWriter);
            throw throwable2;
        }
        IOUtils.closeQuietly((Writer)stringWriter);
        IOUtils.closeQuietly((Writer)printWriter);
        return string;
    }

    public String SI() {
        if (!this.cpj) {
            this.cpj = true;
            n.a(this, this.cpe);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Crash Report ----\n");
        net.optifine.reflect.g.g(net.optifine.reflect.g.enk, stringBuilder);
        net.optifine.reflect.g.g(net.optifine.reflect.g.eno, stringBuilder);
        stringBuilder.append("// ");
        stringBuilder.append(a.SK());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time: ");
        stringBuilder.append(new SimpleDateFormat().format(new Date()));
        stringBuilder.append("\n");
        stringBuilder.append("Description: ");
        stringBuilder.append(this.description);
        stringBuilder.append("\n\n");
        stringBuilder.append(this.SH());
        stringBuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
        for (int i2 = 0; i2 < 87; ++i2) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n\n");
        this.a(stringBuilder);
        return stringBuilder.toString();
    }

    public File sZ() {
        return this.cpg;
    }

    public boolean g(File file) {
        if (this.cpg != null) {
            return false;
        }
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(this.SI());
            fileWriter.close();
            this.cpg = file;
            return true;
        }
        catch (Throwable throwable) {
            cpb.error("Could not save crash report to " + String.valueOf(file), throwable);
            return false;
        }
    }

    public i SJ() {
        return this.cpe;
    }

    public i dY(String string) {
        return this.y(string, 1);
    }

    public i y(String string, int n2) {
        i i2 = new i(this, string);
        if (this.cph) {
            int n3 = i2.ef(n2);
            StackTraceElement[] stackTraceElementArray = this.cpd.getStackTrace();
            StackTraceElement stackTraceElement = null;
            StackTraceElement stackTraceElement2 = null;
            int n4 = stackTraceElementArray.length - n3;
            if (stackTraceElementArray != null && 0 <= n4 && n4 < stackTraceElementArray.length) {
                stackTraceElement = stackTraceElementArray[n4];
                if (stackTraceElementArray.length + 1 - n3 < stackTraceElementArray.length) {
                    stackTraceElement2 = stackTraceElementArray[stackTraceElementArray.length + 1 - n3];
                }
            }
            this.cph = i2.a(stackTraceElement, stackTraceElement2);
            if (n3 > 0 && !this.cpf.isEmpty()) {
                i i3 = this.cpf.get(this.cpf.size() - 1);
                i3.eg(n3);
            } else if (stackTraceElementArray != null && stackTraceElementArray.length >= n3 && 0 <= n4 && n4 < stackTraceElementArray.length) {
                this.cpi = new StackTraceElement[n4];
                System.arraycopy(stackTraceElementArray, 0, this.cpi, 0, this.cpi.length);
            } else {
                this.cph = false;
            }
        }
        this.cpf.add(i2);
        return i2;
    }

    private static String SK() {
        String[] stringArray = new String[]{"Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine."};
        try {
            return stringArray[(int)(System.nanoTime() % (long)stringArray.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    public static a a(Throwable throwable, String string) {
        a a2 = throwable instanceof cl ? ((cl)throwable).atz() : new a(string, throwable);
        return a2;
    }
}

