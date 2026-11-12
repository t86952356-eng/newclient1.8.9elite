/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.renderer.vertex;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VertexFormat {
    private static final Logger cbW = LogManager.getLogger();
    private final List<VertexFormatElement> cbX = Lists.newArrayList();
    private final List<Integer> cbY = Lists.newArrayList();
    private int cbZ = 0;
    private int cca = -1;
    private final List<Integer> ccb = Lists.newArrayList();
    private int ccc = -1;

    public VertexFormat(VertexFormat vertexFormat) {
        this();
        for (int i2 = 0; i2 < vertexFormat.OU(); ++i2) {
            this.a(vertexFormat.dS(i2));
        }
        this.cbZ = vertexFormat.OT();
    }

    public VertexFormat() {
    }

    public void clear() {
        this.cbX.clear();
        this.cbY.clear();
        this.cca = -1;
        this.ccb.clear();
        this.ccc = -1;
        this.cbZ = 0;
    }

    public VertexFormat a(VertexFormatElement vertexFormatElement) {
        if (vertexFormatElement.Pa() && this.OR()) {
            cbW.warn("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.");
            return this;
        }
        this.cbX.add(vertexFormatElement);
        this.cbY.add(this.cbZ);
        switch (vertexFormatElement.OW()) {
            case ccv: {
                this.ccc = this.cbZ;
                break;
            }
            case ccw: {
                this.cca = this.cbZ;
                break;
            }
            case ccx: {
                this.ccb.add(vertexFormatElement.OY(), this.cbZ);
            }
        }
        this.cbZ += vertexFormatElement.OZ();
        return this;
    }

    public boolean ON() {
        return this.ccc >= 0;
    }

    public int OO() {
        return this.ccc;
    }

    public boolean OP() {
        return this.cca >= 0;
    }

    public int OQ() {
        return this.cca;
    }

    public boolean dQ(int n2) {
        return this.ccb.size() - 1 >= n2;
    }

    public int dR(int n2) {
        return this.ccb.get(n2);
    }

    public String toString() {
        String string = "format: " + this.cbX.size() + " elements: ";
        for (int i2 = 0; i2 < this.cbX.size(); ++i2) {
            string = string + this.cbX.get(i2).toString();
            if (i2 == this.cbX.size() - 1) continue;
            string = string + " ";
        }
        return string;
    }

    private boolean OR() {
        int n2 = this.cbX.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            VertexFormatElement vertexFormatElement = this.cbX.get(i2);
            if (!vertexFormatElement.Pa()) continue;
            return true;
        }
        return false;
    }

    public int OS() {
        return this.OT() / 4;
    }

    public int OT() {
        return this.cbZ;
    }

    public List<VertexFormatElement> Mp() {
        return this.cbX;
    }

    public int OU() {
        return this.cbX.size();
    }

    public VertexFormatElement dS(int n2) {
        return this.cbX.get(n2);
    }

    public int dT(int n2) {
        return this.cbY.get(n2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            VertexFormat vertexFormat = (VertexFormat)object;
            return this.cbZ == vertexFormat.cbZ && this.cbX.equals(vertexFormat.cbX) && this.cbY.equals(vertexFormat.cbY);
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.cbX.hashCode();
        n2 = 31 * n2 + this.cbY.hashCode();
        n2 = 31 * n2 + this.cbZ;
        return n2;
    }
}

