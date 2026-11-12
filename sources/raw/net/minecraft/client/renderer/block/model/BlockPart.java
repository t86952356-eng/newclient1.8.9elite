/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
package net.minecraft.client.renderer.block.model;

import java.util.Map;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.client.renderer.block.model.BlockPartRotation;
import net.minecraft.util.ao;
import org.lwjgl.util.vector.Vector3f;

public class BlockPart {
    public final Vector3f bQA;
    public final Vector3f bQB;
    public final Map<ao, BlockPartFace> bQC;
    public final BlockPartRotation bQD;
    public final boolean bQE;

    public BlockPart(Vector3f vector3f, Vector3f vector3f2, Map<ao, BlockPartFace> map, BlockPartRotation blockPartRotation, boolean bl2) {
        this.bQA = vector3f;
        this.bQB = vector3f2;
        this.bQC = map;
        this.bQD = blockPartRotation;
        this.bQE = bl2;
        this.Md();
    }

    private void Md() {
        for (Map.Entry<ao, BlockPartFace> entry : this.bQC.entrySet()) {
            float[] fArray = this.j(entry.getKey());
            entry.getValue().bQK.b(fArray);
        }
    }

    private float[] j(ao ao2) {
        return switch (ao2) {
            case ao.dwq, ao.dwr -> new float[]{this.bQA.x, this.bQA.z, this.bQB.x, this.bQB.z};
            case ao.dws, ao.dwt -> new float[]{this.bQA.x, 16.0f - this.bQB.y, this.bQB.x, 16.0f - this.bQA.y};
            case ao.dwu, ao.dwv -> new float[]{this.bQA.z, 16.0f - this.bQB.y, this.bQB.z, 16.0f - this.bQA.y};
            default -> throw new NullPointerException();
        };
    }
}

