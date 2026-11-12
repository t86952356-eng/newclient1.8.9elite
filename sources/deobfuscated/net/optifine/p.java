/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.av;
import net.optifine.config.a;
import net.optifine.config.j;
import net.optifine.shaders.b;
import net.optifine.util.af;
import net.optifine.util.ah;

public class p {
    private static av[] dXQ = null;
    public static boolean dj = false;

    public static av H(IBlockState iBlockState) {
        if (dXQ == null) {
            return null;
        }
        if (iBlockState.df().xk()) {
            return null;
        }
        if (!(iBlockState instanceof BlockStateBase)) {
            return null;
        }
        BlockStateBase blockStateBase = (BlockStateBase)iBlockState;
        int n2 = blockStateBase.zW();
        return n2 > 0 && n2 < dXQ.length ? dXQ[n2] : null;
    }

    public static void jA() {
        af af2;
        dXQ = null;
        dj = false;
        ArrayList<av> arrayList = new ArrayList<av>();
        String string = "optifine/block.properties";
        Properties properties = ah.at("optifine/block.properties", "CustomBlockLayers");
        if (properties != null) {
            p.a("optifine/block.properties", properties, arrayList);
        }
        if (net.minecraft.src.a.aoG() && (af2 = b.aEo()) != null) {
            String string2 = "shaders/block.properties";
            p.a("shaders/block.properties", af2, arrayList);
        }
        if (!arrayList.isEmpty()) {
            dXQ = arrayList.toArray(new av[arrayList.size()]);
            dj = true;
        }
    }

    private static void a(String string, Properties properties, List<av> list) {
        net.minecraft.src.a.fN("CustomBlockLayers: " + string);
        p.a("solid", av.dxV, properties, list);
        p.a("cutout", av.dxX, properties, list);
        p.a("cutout_mipped", av.dxW, properties, list);
        p.a("translucent", av.dxY, properties, list);
    }

    private static void a(String string, av av2, Properties properties, List<av> list) {
        a a2;
        j[] jArray;
        String string2 = "layer." + string;
        String string3 = properties.getProperty(string2);
        if (string3 != null && (jArray = (a2 = new a("CustomBlockLayers")).hJ(string3)) != null) {
            for (int i2 = 0; i2 < jArray.length; ++i2) {
                j j2 = jArray[i2];
                int n2 = j2.zW();
                if (n2 <= 0) continue;
                while (list.size() < n2 + 1) {
                    list.add(null);
                }
                if (list.get(n2) != null) {
                    net.minecraft.src.a.warn("CustomBlockLayers: Block layer is already set, block: " + n2 + ", layer: " + string);
                }
                list.set(n2, av2);
            }
        }
    }

    public static boolean bd() {
        return dj;
    }
}

