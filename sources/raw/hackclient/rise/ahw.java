/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahs;
import hackclient.rise.ahu;
import hackclient.rise.ahv;
import hackclient.rise.aik;
import java.util.Arrays;
import java.util.function.Function;
import net.minecraft.block.material.Material;
import net.minecraft.util.cw;

public final class ahw
extends Enum<ahw> {
    public static final /* enum */ ahw aOs = new ahw(cw2 -> {
        ahv ahv2 = (ahv)((ahu)cw2.wi()).get(((ahu)cw2.wi()).size() - 1);
        return aik.a(ahv2).xb() == Material.beo;
    });
    public static final /* enum */ ahw aOt = new ahw(cw2 -> {
        ahv ahv2 = (ahv)((ahu)cw2.wi()).get(((ahu)cw2.wi()).size() - 1);
        return aik.a(ahv2.D(0, -1, 0)).xb() != Material.beo || aik.a(ahv2.D(0, -2, 0)).xb() != Material.beo;
    });
    final Function<cw<ahu, ahs>, Boolean> aOu;
    private static final /* synthetic */ ahw[] aOv;

    public static ahw[] values() {
        return (ahw[])aOv.clone();
    }

    public static ahw valueOf(String string) {
        return Enum.valueOf(ahw.class, string);
    }

    private ahw(Function<cw<ahu, ahs>, Boolean> function) {
        this.aOu = function;
    }

    public static boolean a(ahu ahu2, ahs ahs2, ahw ... ahwArray) {
        return Arrays.stream(ahwArray).allMatch(ahw2 -> ahw2.aOu.apply(new cw<ahu, ahs>(ahu2, ahs2)));
    }

    private static /* synthetic */ ahw[] ve() {
        return new ahw[]{aOs, aOt};
    }

    static {
        aOv = ahw.ve();
    }
}

