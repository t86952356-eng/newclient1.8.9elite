/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.realms;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import net.minecraft.realms.x;

public class w {
    private VertexFormat djk;

    public w(VertexFormat vertexFormat) {
        this.djk = vertexFormat;
    }

    public w a(VertexFormat vertexFormat) {
        this.djk = vertexFormat;
        return this;
    }

    public VertexFormat LB() {
        return this.djk;
    }

    public void clear() {
        this.djk.clear();
    }

    public int gQ(int n2) {
        return this.djk.dR(n2);
    }

    public int OU() {
        return this.djk.OU();
    }

    public boolean OP() {
        return this.djk.OP();
    }

    public boolean gR(int n2) {
        return this.djk.dQ(n2);
    }

    public x gS(int n2) {
        return new x(this.djk.dS(n2));
    }

    public w a(x x2) {
        return this.a(this.djk.a(x2.akd()));
    }

    public int OQ() {
        return this.djk.OQ();
    }

    public List<x> Mp() {
        ArrayList<x> arrayList = new ArrayList<x>();
        for (VertexFormatElement vertexFormatElement : this.djk.Mp()) {
            arrayList.add(new x(vertexFormatElement));
        }
        return arrayList;
    }

    public boolean ON() {
        return this.djk.ON();
    }

    public int akb() {
        return this.djk.OT();
    }

    public int gT(int n2) {
        return this.djk.dT(n2);
    }

    public int OO() {
        return this.djk.OO();
    }

    public int akc() {
        return this.djk.OS();
    }

    public boolean equals(Object object) {
        return this.djk.equals(object);
    }

    public int hashCode() {
        return this.djk.hashCode();
    }

    public String toString() {
        return this.djk.toString();
    }
}

