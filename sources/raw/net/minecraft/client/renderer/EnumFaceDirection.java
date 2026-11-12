/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.client.renderer.EnumFaceDirection$Constants;
import net.minecraft.client.renderer.EnumFaceDirection$VertexInformation;
import net.minecraft.util.ao;

public final class EnumFaceDirection
extends Enum<EnumFaceDirection> {
    public static final /* enum */ EnumFaceDirection bKg = new EnumFaceDirection(new EnumFaceDirection$VertexInformation[]{new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKu, EnumFaceDirection$Constants.bKt, EnumFaceDirection$Constants.bKp), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKu, EnumFaceDirection$Constants.bKt, EnumFaceDirection$Constants.bKs), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKr, EnumFaceDirection$Constants.bKt, EnumFaceDirection$Constants.bKs), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKr, EnumFaceDirection$Constants.bKt, EnumFaceDirection$Constants.bKp)});
    public static final /* enum */ EnumFaceDirection bKh = new EnumFaceDirection(new EnumFaceDirection$VertexInformation[]{new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKu, EnumFaceDirection$Constants.bKq, EnumFaceDirection$Constants.bKs), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKu, EnumFaceDirection$Constants.bKq, EnumFaceDirection$Constants.bKp), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKr, EnumFaceDirection$Constants.bKq, EnumFaceDirection$Constants.bKp), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKr, EnumFaceDirection$Constants.bKq, EnumFaceDirection$Constants.bKs)});
    public static final /* enum */ EnumFaceDirection bKi = new EnumFaceDirection(new EnumFaceDirection$VertexInformation[]{new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKr, EnumFaceDirection$Constants.bKq, EnumFaceDirection$Constants.bKs), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKr, EnumFaceDirection$Constants.bKt, EnumFaceDirection$Constants.bKs), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKu, EnumFaceDirection$Constants.bKt, EnumFaceDirection$Constants.bKs), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKu, EnumFaceDirection$Constants.bKq, EnumFaceDirection$Constants.bKs)});
    public static final /* enum */ EnumFaceDirection bKj = new EnumFaceDirection(new EnumFaceDirection$VertexInformation[]{new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKu, EnumFaceDirection$Constants.bKq, EnumFaceDirection$Constants.bKp), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKu, EnumFaceDirection$Constants.bKt, EnumFaceDirection$Constants.bKp), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKr, EnumFaceDirection$Constants.bKt, EnumFaceDirection$Constants.bKp), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKr, EnumFaceDirection$Constants.bKq, EnumFaceDirection$Constants.bKp)});
    public static final /* enum */ EnumFaceDirection bKk = new EnumFaceDirection(new EnumFaceDirection$VertexInformation[]{new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKu, EnumFaceDirection$Constants.bKq, EnumFaceDirection$Constants.bKs), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKu, EnumFaceDirection$Constants.bKt, EnumFaceDirection$Constants.bKs), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKu, EnumFaceDirection$Constants.bKt, EnumFaceDirection$Constants.bKp), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKu, EnumFaceDirection$Constants.bKq, EnumFaceDirection$Constants.bKp)});
    public static final /* enum */ EnumFaceDirection bKl = new EnumFaceDirection(new EnumFaceDirection$VertexInformation[]{new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKr, EnumFaceDirection$Constants.bKq, EnumFaceDirection$Constants.bKp), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKr, EnumFaceDirection$Constants.bKt, EnumFaceDirection$Constants.bKp), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKr, EnumFaceDirection$Constants.bKt, EnumFaceDirection$Constants.bKs), new EnumFaceDirection$VertexInformation(EnumFaceDirection$Constants.bKr, EnumFaceDirection$Constants.bKq, EnumFaceDirection$Constants.bKs)});
    private static final EnumFaceDirection[] bKm;
    private final EnumFaceDirection$VertexInformation[] bKn;
    private static final /* synthetic */ EnumFaceDirection[] bKo;

    public static EnumFaceDirection[] values() {
        return (EnumFaceDirection[])bKo.clone();
    }

    public static EnumFaceDirection valueOf(String string) {
        return Enum.valueOf(EnumFaceDirection.class, string);
    }

    public static EnumFaceDirection h(ao ao2) {
        return bKm[ao2.OY()];
    }

    private EnumFaceDirection(EnumFaceDirection$VertexInformation[] enumFaceDirection$VertexInformationArray) {
        this.bKn = enumFaceDirection$VertexInformationArray;
    }

    public EnumFaceDirection$VertexInformation cB(int n2) {
        return this.bKn[n2];
    }

    private static /* synthetic */ EnumFaceDirection[] Jv() {
        return new EnumFaceDirection[]{bKg, bKh, bKi, bKj, bKk, bKl};
    }

    static {
        bKo = EnumFaceDirection.Jv();
        bKm = new EnumFaceDirection[6];
        EnumFaceDirection.bKm[EnumFaceDirection$Constants.bKt] = bKg;
        EnumFaceDirection.bKm[EnumFaceDirection$Constants.bKq] = bKh;
        EnumFaceDirection.bKm[EnumFaceDirection$Constants.bKs] = bKi;
        EnumFaceDirection.bKm[EnumFaceDirection$Constants.bKp] = bKj;
        EnumFaceDirection.bKm[EnumFaceDirection$Constants.bKu] = bKk;
        EnumFaceDirection.bKm[EnumFaceDirection$Constants.bKr] = bKl;
    }
}

