/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.vertex;

import java.lang.reflect.Field;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType;
import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage;
import net.minecraft.src.a;
import net.optifine.reflect.h;
import net.optifine.reflect.j;
import net.optifine.shaders.aa;

public class DefaultVertexFormats {
    public static VertexFormat cbv = new VertexFormat();
    public static VertexFormat cbw = new VertexFormat();
    private static final VertexFormat cbx = cbv;
    private static final VertexFormat cby = cbw;
    public static h cbz = new h("net.minecraftforge.client.model.Attributes");
    public static j cbA = new j(cbz, "DEFAULT_BAKED_FORMAT");
    private static final VertexFormat cbB = aa.c((VertexFormat)DefaultVertexFormats.a(cbA));
    public static final VertexFormat cbC = new VertexFormat();
    public static final VertexFormat cbD = new VertexFormat();
    public static final VertexFormat cbE = new VertexFormat();
    public static final VertexFormat cbF = new VertexFormat();
    public static final VertexFormat cbG = new VertexFormat();
    public static final VertexFormat cbH = new VertexFormat();
    public static final VertexFormat cbI = new VertexFormat();
    public static final VertexFormat cbJ = new VertexFormat();
    public static final VertexFormat cbK = new VertexFormat();
    public static final VertexFormat cbL = new VertexFormat();
    public static final VertexFormatElement cbM = new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccu, 3);
    public static final VertexFormatElement cbN = new VertexFormatElement(0, VertexFormatElement$EnumType.cck, VertexFormatElement$EnumUsage.ccw, 4);
    public static final VertexFormatElement cbO = new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccx, 2);
    public static final VertexFormatElement cbP = new VertexFormatElement(1, VertexFormatElement$EnumType.ccn, VertexFormatElement$EnumUsage.ccx, 2);
    public static final VertexFormatElement cbQ = new VertexFormatElement(0, VertexFormatElement$EnumType.ccl, VertexFormatElement$EnumUsage.ccv, 3);
    public static final VertexFormatElement cbR = new VertexFormatElement(0, VertexFormatElement$EnumType.ccl, VertexFormatElement$EnumUsage.ccA, 1);

    public static void OH() {
        if (a.aoG()) {
            cbv = aa.aEU();
            cbw = aa.aEV();
            if (cbA.aDA()) {
                aa.b((VertexFormat)cbA.wD());
            }
        } else {
            cbv = cbx;
            cbw = cby;
            if (cbA.aDA()) {
                aa.a(cbB, (VertexFormat)cbA.wD());
            }
        }
    }

    public static Object a(j j2) {
        try {
            Field field = j2.aDE();
            if (field == null) {
                return null;
            }
            Object object = field.get(null);
            return object;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    static {
        cbv.a(cbM);
        cbv.a(cbN);
        cbv.a(cbO);
        cbv.a(cbP);
        cbw.a(cbM);
        cbw.a(cbN);
        cbw.a(cbO);
        cbw.a(cbQ);
        cbw.a(cbR);
        cbC.a(cbM);
        cbC.a(cbO);
        cbC.a(cbQ);
        cbC.a(cbR);
        cbD.a(cbM);
        cbD.a(cbO);
        cbD.a(cbN);
        cbD.a(cbP);
        cbE.a(cbM);
        cbF.a(cbM);
        cbF.a(cbN);
        cbG.a(cbM);
        cbG.a(cbO);
        cbH.a(cbM);
        cbH.a(cbQ);
        cbH.a(cbR);
        cbI.a(cbM);
        cbI.a(cbO);
        cbI.a(cbN);
        cbJ.a(cbM);
        cbJ.a(cbO);
        cbJ.a(cbQ);
        cbJ.a(cbR);
        cbK.a(cbM);
        cbK.a(cbO);
        cbK.a(cbP);
        cbK.a(cbN);
        cbL.a(cbM);
        cbL.a(cbO);
        cbL.a(cbN);
        cbL.a(cbQ);
        cbL.a(cbR);
    }
}

