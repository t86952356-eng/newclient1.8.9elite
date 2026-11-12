/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.init;

import java.io.PrintStream;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockFire;
import net.minecraft.init.Blocks;
import net.minecraft.init.Bootstrap$1;
import net.minecraft.init.Bootstrap$10;
import net.minecraft.init.Bootstrap$11;
import net.minecraft.init.Bootstrap$12;
import net.minecraft.init.Bootstrap$13;
import net.minecraft.init.Bootstrap$14;
import net.minecraft.init.Bootstrap$15;
import net.minecraft.init.Bootstrap$16;
import net.minecraft.init.Bootstrap$2;
import net.minecraft.init.Bootstrap$3;
import net.minecraft.init.Bootstrap$4;
import net.minecraft.init.Bootstrap$5;
import net.minecraft.init.Bootstrap$6;
import net.minecraft.init.Bootstrap$7;
import net.minecraft.init.Bootstrap$8;
import net.minecraft.init.Bootstrap$9;
import net.minecraft.init.Items;
import net.minecraft.item.d;
import net.minecraft.stats.n;
import net.minecraft.util.bp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bootstrap {
    private static final PrintStream cOS = System.out;
    private static boolean cOT = false;
    private static final Logger cOU = LogManager.getLogger();

    public static boolean qE() {
        return cOT;
    }

    static void acZ() {
        BlockDispenser.aTP.b(Items.cPk, new Bootstrap$1());
        BlockDispenser.aTP.b(Items.cQT, new Bootstrap$2());
        BlockDispenser.aTP.b(Items.cQH, new Bootstrap$3());
        BlockDispenser.aTP.b(Items.cRO, new Bootstrap$4());
        BlockDispenser.aTP.b(Items.cRD, new Bootstrap$5());
        BlockDispenser.aTP.b(Items.cRN, new Bootstrap$6());
        BlockDispenser.aTP.b(Items.cSf, new Bootstrap$7());
        BlockDispenser.aTP.b(Items.cRP, new Bootstrap$8());
        BlockDispenser.aTP.b(Items.cQI, new Bootstrap$9());
        Bootstrap$10 bootstrap$10 = new Bootstrap$10();
        BlockDispenser.aTP.b(Items.cQC, bootstrap$10);
        BlockDispenser.aTP.b(Items.cQB, bootstrap$10);
        BlockDispenser.aTP.b(Items.cQA, new Bootstrap$11());
        BlockDispenser.aTP.b(Items.cPh, new Bootstrap$12());
        BlockDispenser.aTP.b(Items.cRa, new Bootstrap$13());
        BlockDispenser.aTP.b(d.I(Blocks.cLY), new Bootstrap$14());
        BlockDispenser.aTP.b(Items.cSb, new Bootstrap$15());
        BlockDispenser.aTP.b(d.I(Blocks.cMW), new Bootstrap$16());
    }

    public static void a() {
        if (!cOT) {
            cOT = true;
            if (cOU.isDebugEnabled()) {
                Bootstrap.ada();
            }
            Block.xO();
            BlockFire.init();
            d.Nu();
            n.init();
            Bootstrap.acZ();
        }
    }

    private static void ada() {
        System.setErr(new bp("STDERR", System.err));
        System.setOut(new bp("STDOUT", cOS));
    }

    public static void ep(String string) {
        cOS.println(string);
    }
}

