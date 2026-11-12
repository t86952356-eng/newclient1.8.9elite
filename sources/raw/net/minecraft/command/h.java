/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import net.minecraft.command.a;
import net.minecraft.command.au;
import net.minecraft.command.aw;
import net.minecraft.command.bo;
import net.minecraft.command.n;
import net.minecraft.profiler.e;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h
extends a {
    private static final Logger cnM = LogManager.getLogger();
    private long cnN;
    private int cnO;

    @Override
    public String RX() {
        return "debug";
    }

    @Override
    public int RS() {
        return 3;
    }

    @Override
    public String c(aw aw2) {
        return "commands.debug.usage";
    }

    @Override
    public void a(aw aw2, String[] stringArray) {
        if (stringArray.length < 1) {
            throw new bo("commands.debug.usage", new Object[0]);
        }
        if (stringArray[0].equals("start")) {
            if (stringArray.length != 1) {
                throw new bo("commands.debug.usage", new Object[0]);
            }
            h.a(aw2, (au)this, "commands.debug.start", new Object[0]);
            MinecraftServer.afs().alJ();
            this.cnN = MinecraftServer.alN();
            this.cnO = MinecraftServer.afs().alI();
        } else {
            if (!stringArray[0].equals("stop")) {
                throw new bo("commands.debug.usage", new Object[0]);
            }
            if (stringArray.length != 1) {
                throw new bo("commands.debug.usage", new Object[0]);
            }
            if (!MinecraftServer.afs().dkB.dhU) {
                throw new n("commands.debug.notStarted", new Object[0]);
            }
            long l2 = MinecraftServer.alN();
            int n2 = MinecraftServer.afs().alI();
            long l3 = l2 - this.cnN;
            int n3 = n2 - this.cnO;
            this.a(l3, n3);
            MinecraftServer.afs().dkB.dhU = false;
            h.a(aw2, (au)this, "commands.debug.stop", Float.valueOf((float)l3 / 1000.0f), n3);
        }
    }

    private void a(long l2, int n2) {
        File file = new File(MinecraftServer.afs().fy("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
        file.getParentFile().mkdirs();
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(this.b(l2, n2));
            fileWriter.close();
        }
        catch (Throwable throwable) {
            cnM.error("Could not save profiler results to " + String.valueOf(file), throwable);
        }
    }

    private String b(long l2, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Profiler Results ----\n");
        stringBuilder.append("// ");
        stringBuilder.append(h.RZ());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time span: ").append(l2).append(" ms\n");
        stringBuilder.append("Tick span: ").append(n2).append(" ticks\n");
        stringBuilder.append("// This is approximately ").append(String.format("%.2f", Float.valueOf((float)n2 / ((float)l2 / 1000.0f)))).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
        stringBuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
        this.a(0, "root", stringBuilder);
        stringBuilder.append("--- END PROFILE DUMP ---\n\n");
        return stringBuilder.toString();
    }

    private void a(int n2, String string, StringBuilder stringBuilder) {
        List<e> list = MinecraftServer.afs().dkB.eZ(string);
        if (list != null && list.size() >= 3) {
            for (int i2 = 1; i2 < list.size(); ++i2) {
                e e2 = list.get(i2);
                stringBuilder.append(String.format("[%02d] ", n2));
                for (int i3 = 0; i3 < n2; ++i3) {
                    stringBuilder.append(" ");
                }
                stringBuilder.append(e2.dil).append(" - ").append(String.format("%.2f", e2.dij)).append("%/").append(String.format("%.2f", e2.dik)).append("%\n");
                if (e2.dil.equals("unspecified")) continue;
                try {
                    this.a(n2 + 1, string + "." + e2.dil, stringBuilder);
                    continue;
                }
                catch (Exception exception) {
                    stringBuilder.append("[[ EXCEPTION ").append(exception).append(" ]]");
                }
            }
        }
    }

    private static String RZ() {
        String[] stringArray = new String[]{"Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server."};
        try {
            return stringArray[(int)(System.nanoTime() % (long)stringArray.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    @Override
    public List<String> a(aw aw2, String[] stringArray, b b2) {
        return stringArray.length == 1 ? h.a(stringArray, "start", "stop") : null;
    }
}

