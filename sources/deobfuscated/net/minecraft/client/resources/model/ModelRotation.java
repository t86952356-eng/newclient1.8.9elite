/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  com.google.common.collect.Maps
 *  javax.vecmath.Matrix4f
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector3f
 */
package net.minecraft.client.resources.model;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.vecmath.Matrix4f;
import net.minecraft.util.ao;
import net.minecraft.util.ap;
import net.minecraft.util.bt;
import net.minecraftforge.client.model.a;
import net.minecraftforge.client.model.b;
import net.minecraftforge.client.model.d;
import net.minecraftforge.client.model.e;
import net.optifine.reflect.g;
import org.lwjgl.util.vector.Vector3f;

public final class ModelRotation
extends Enum<ModelRotation>
implements b,
d {
    public static final /* enum */ ModelRotation cfs = new ModelRotation(0, 0);
    public static final /* enum */ ModelRotation cft = new ModelRotation(0, 90);
    public static final /* enum */ ModelRotation cfu = new ModelRotation(0, 180);
    public static final /* enum */ ModelRotation cfv = new ModelRotation(0, 270);
    public static final /* enum */ ModelRotation cfw = new ModelRotation(90, 0);
    public static final /* enum */ ModelRotation cfx = new ModelRotation(90, 90);
    public static final /* enum */ ModelRotation cfy = new ModelRotation(90, 180);
    public static final /* enum */ ModelRotation cfz = new ModelRotation(90, 270);
    public static final /* enum */ ModelRotation cfA = new ModelRotation(180, 0);
    public static final /* enum */ ModelRotation cfB = new ModelRotation(180, 90);
    public static final /* enum */ ModelRotation cfC = new ModelRotation(180, 180);
    public static final /* enum */ ModelRotation cfD = new ModelRotation(180, 270);
    public static final /* enum */ ModelRotation cfE = new ModelRotation(270, 0);
    public static final /* enum */ ModelRotation cfF = new ModelRotation(270, 90);
    public static final /* enum */ ModelRotation cfG = new ModelRotation(270, 180);
    public static final /* enum */ ModelRotation cfH = new ModelRotation(270, 270);
    private static final Map<Integer, ModelRotation> cfI;
    private final int cfJ;
    private final org.lwjgl.util.vector.Matrix4f cfK;
    private final int cfL;
    private final int cfM;
    private static final /* synthetic */ ModelRotation[] cfN;

    public static ModelRotation[] values() {
        return (ModelRotation[])cfN.clone();
    }

    public static ModelRotation valueOf(String string) {
        return Enum.valueOf(ModelRotation.class, string);
    }

    private static int af(int n2, int n3) {
        return n2 * 360 + n3;
    }

    private ModelRotation(int n3, int n4) {
        this.cfJ = ModelRotation.af(n3, n4);
        this.cfK = new org.lwjgl.util.vector.Matrix4f();
        org.lwjgl.util.vector.Matrix4f matrix4f = new org.lwjgl.util.vector.Matrix4f();
        matrix4f.setIdentity();
        org.lwjgl.util.vector.Matrix4f.rotate((float)((float)(-n3) * ((float)Math.PI / 180)), (Vector3f)new Vector3f(1.0f, 0.0f, 0.0f), (org.lwjgl.util.vector.Matrix4f)matrix4f, (org.lwjgl.util.vector.Matrix4f)matrix4f);
        this.cfL = bt.hN(n3 / 90);
        org.lwjgl.util.vector.Matrix4f matrix4f2 = new org.lwjgl.util.vector.Matrix4f();
        matrix4f2.setIdentity();
        org.lwjgl.util.vector.Matrix4f.rotate((float)((float)(-n4) * ((float)Math.PI / 180)), (Vector3f)new Vector3f(0.0f, 1.0f, 0.0f), (org.lwjgl.util.vector.Matrix4f)matrix4f2, (org.lwjgl.util.vector.Matrix4f)matrix4f2);
        this.cfM = bt.hN(n4 / 90);
        org.lwjgl.util.vector.Matrix4f.mul((org.lwjgl.util.vector.Matrix4f)matrix4f2, (org.lwjgl.util.vector.Matrix4f)matrix4f, (org.lwjgl.util.vector.Matrix4f)this.cfK);
    }

    public org.lwjgl.util.vector.Matrix4f QC() {
        return this.cfK;
    }

    public ao q(ao ao2) {
        int n2;
        ao ao3 = ao2;
        for (n2 = 0; n2 < this.cfL; ++n2) {
            ao3 = ao3.c(ap.dwH);
        }
        if (ao3.asL() != ap.dwI) {
            for (n2 = 0; n2 < this.cfM; ++n2) {
                ao3 = ao3.c(ap.dwI);
            }
        }
        return ao3;
    }

    public int b(ao ao2, int n2) {
        int n3 = n2;
        if (ao2.asL() == ap.dwH) {
            n3 = (n2 + this.cfL) % 4;
        }
        ao ao3 = ao2;
        for (int i2 = 0; i2 < this.cfL; ++i2) {
            ao3 = ao3.c(ap.dwH);
        }
        if (ao3.asL() == ap.dwI) {
            n3 = (n3 + this.cfM) % 4;
        }
        return n3;
    }

    public static ModelRotation ag(int n2, int n3) {
        return cfI.get(ModelRotation.af(bt.aG(n2, 360), bt.aG(n3, 360)));
    }

    @Override
    public Optional<e> a(Optional<? extends a> optional) {
        return (Optional)g.g(g.eoU, this.QD(), optional);
    }

    @Override
    public Matrix4f QD() {
        return g.epd.aDA() ? (Matrix4f)g.g(g.epd, this) : new Matrix4f();
    }

    @Override
    public ao r(ao ao2) {
        return this.q(ao2);
    }

    @Override
    public int c(ao ao2, int n2) {
        return this.b(ao2, n2);
    }

    private static /* synthetic */ ModelRotation[] QE() {
        return new ModelRotation[]{cfs, cft, cfu, cfv, cfw, cfx, cfy, cfz, cfA, cfB, cfC, cfD, cfE, cfF, cfG, cfH};
    }

    static {
        cfN = ModelRotation.QE();
        cfI = Maps.newHashMap();
        for (ModelRotation modelRotation : ModelRotation.values()) {
            cfI.put(modelRotation.cfJ, modelRotation);
        }
    }
}

