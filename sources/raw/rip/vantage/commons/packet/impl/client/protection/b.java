/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.batik.swing.JSVGCanvas
 */
package rip.vantage.commons.packet.impl.client.protection;

import java.awt.geom.Dimension2D;
import org.apache.batik.swing.JSVGCanvas;

public class b {
    private final String ePC;

    public b(String string) {
        this.ePC = string;
    }

    public Dimension2D aJH() {
        if (this.ePC == null) {
            return null;
        }
        JSVGCanvas jSVGCanvas = new JSVGCanvas();
        jSVGCanvas.loadSVGDocument(this.ePC);
        return jSVGCanvas.getSVGDocumentSize();
    }

    public String toString() {
        Dimension2D dimension2D = this.aJH();
        return "[" + dimension2D.getWidth() + ", " + dimension2D.getHeight() + "]";
    }
}

