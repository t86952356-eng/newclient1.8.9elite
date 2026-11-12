/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.lwjgl.opengl.GL11
 */
package hackclient.rise;

import hackclient.rise.ais;
import hackclient.rise.ait;
import java.awt.Color;
import java.util.ArrayList;
import lombok.Generated;
import org.lwjgl.opengl.GL11;
import rise.util.math.Vector2f;

public class ack {
    private ArrayList<float[]> azP;
    private Vector2f ayt;
    private Color anq;

    public void qN() {
        GL11.glPushMatrix();
        for (int i2 = 1; i2 <= 5; ++i2) {
            GL11.glLineWidth((float)i2);
            ait.rJ();
            ait.e(ais.d(this.anq, (int)((double)(this.anq.getAlpha() / i2) / 1.2)));
            GL11.glBegin((int)3);
            for (float[] object : this.azP) {
                GL11.glVertex2d((double)(this.ayt.getX() + object[0]), (double)(this.ayt.getY() + object[1]));
            }
            GL11.glEnd();
            ait.stop();
        }
        double d2 = 5.5;
        for (float[] fArray : this.azP) {
            ait.c((double)(this.ayt.getX() + fArray[0]) - d2 / 2.0, (double)(this.ayt.getY() + fArray[1]) - d2 / 2.0, d2, d2, d2 / 2.0, this.anq);
        }
        GL11.glPopMatrix();
    }

    public void qo() {
        GL11.glPushMatrix();
        double d2 = 5.5;
        for (float[] fArray : this.azP) {
            ait.c((double)(this.ayt.getX() + fArray[0]) - d2 / 2.0, (double)(this.ayt.getY() + fArray[1]) - d2 / 2.0, d2, d2, d2 / 2.0, this.anq);
        }
        GL11.glPopMatrix();
    }

    @Generated
    public void d(ArrayList<float[]> arrayList) {
        this.azP = arrayList;
    }

    @Generated
    public void i(Vector2f vector2f) {
        this.ayt = vector2f;
    }

    @Generated
    public void b(Color color) {
        this.anq = color;
    }

    @Generated
    public ArrayList<float[]> qO() {
        return this.azP;
    }

    @Generated
    public Vector2f pm() {
        return this.ayt;
    }

    @Generated
    public Color nM() {
        return this.anq;
    }

    @Generated
    public ack(ArrayList<float[]> arrayList, Vector2f vector2f, Color color) {
        this.azP = arrayList;
        this.ayt = vector2f;
        this.anq = color;
    }
}

