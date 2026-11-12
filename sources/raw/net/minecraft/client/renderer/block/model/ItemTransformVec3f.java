/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.ReadableVector3f
 *  org.lwjgl.util.vector.Vector3f
 */
package net.minecraft.client.renderer.block.model;

import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;

public class ItemTransformVec3f {
    public static final ItemTransformVec3f bRG = new ItemTransformVec3f(new Vector3f(), new Vector3f(), new Vector3f(1.0f, 1.0f, 1.0f));
    public final Vector3f bRH;
    public final Vector3f bRI;
    public final Vector3f bRJ;

    public ItemTransformVec3f(Vector3f vector3f, Vector3f vector3f2, Vector3f vector3f3) {
        this.bRH = new Vector3f((ReadableVector3f)vector3f);
        this.bRI = new Vector3f((ReadableVector3f)vector3f2);
        this.bRJ = new Vector3f((ReadableVector3f)vector3f3);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        ItemTransformVec3f itemTransformVec3f = (ItemTransformVec3f)object;
        return this.bRH.equals((Object)itemTransformVec3f.bRH) && this.bRJ.equals((Object)itemTransformVec3f.bRJ) && this.bRI.equals((Object)itemTransformVec3f.bRI);
    }

    public int hashCode() {
        int n2 = this.bRH.hashCode();
        n2 = 31 * n2 + this.bRI.hashCode();
        n2 = 31 * n2 + this.bRJ.hashCode();
        return n2;
    }
}

