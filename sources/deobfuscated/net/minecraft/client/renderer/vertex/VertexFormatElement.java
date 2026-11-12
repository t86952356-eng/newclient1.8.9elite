/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.vertex;

import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType;
import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VertexFormatElement {
    private static final Logger cce = LogManager.getLogger();
    private final VertexFormatElement$EnumType ccf;
    private final VertexFormatElement$EnumUsage ccg;
    private final int cch;
    private final int cci;

    public VertexFormatElement(int n2, VertexFormatElement$EnumType vertexFormatElement$EnumType, VertexFormatElement$EnumUsage vertexFormatElement$EnumUsage, int n3) {
        if (!this.a(n2, vertexFormatElement$EnumUsage)) {
            cce.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
            this.ccg = VertexFormatElement$EnumUsage.ccx;
        } else {
            this.ccg = vertexFormatElement$EnumUsage;
        }
        this.ccf = vertexFormatElement$EnumType;
        this.cch = n2;
        this.cci = n3;
    }

    private final boolean a(int n2, VertexFormatElement$EnumUsage vertexFormatElement$EnumUsage) {
        return n2 == 0 || vertexFormatElement$EnumUsage == VertexFormatElement$EnumUsage.ccx;
    }

    public final VertexFormatElement$EnumType OV() {
        return this.ccf;
    }

    public final VertexFormatElement$EnumUsage OW() {
        return this.ccg;
    }

    public final int OX() {
        return this.cci;
    }

    public final int OY() {
        return this.cch;
    }

    public String toString() {
        return this.cci + "," + this.ccg.getDisplayName() + "," + this.ccf.getDisplayName();
    }

    public final int OZ() {
        return this.ccf.getSize() * this.cci;
    }

    public final boolean Pa() {
        return this.ccg == VertexFormatElement$EnumUsage.ccu;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            VertexFormatElement vertexFormatElement = (VertexFormatElement)object;
            return this.cci == vertexFormatElement.cci && this.cch == vertexFormatElement.cch && this.ccf == vertexFormatElement.ccf && this.ccg == vertexFormatElement.ccg;
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.ccf.hashCode();
        n2 = 31 * n2 + this.ccg.hashCode();
        n2 = 31 * n2 + this.cch;
        n2 = 31 * n2 + this.cci;
        return n2;
    }
}

