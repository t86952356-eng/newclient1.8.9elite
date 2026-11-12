/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aee;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.sw;
import java.awt.Color;
import java.util.ArrayList;
import rise.ui.clickgui.value.ValueComponent;
import rise.util.math.Vector2d;
import rise.value.Value;

public class abt
extends ValueComponent {
    private final ArrayList<Vector2d> azP = new ArrayList();
    private Vector2d Za = null;

    public abt(Value<?> value) {
        super(value);
        this.azP.clear();
        for (int i2 = 0; i2 <= 250; i2 += 10) {
            this.azP.add(new Vector2d(i2, 45.0));
        }
    }

    @Override
    public void a(Vector2d vector2d, int n2, int n3, float f2) {
        this.aqy = vector2d;
        this.aqy.setX(this.aqy.getX() + 2.5);
        if (this.Za != null) {
            this.Za.setY((double)n3 - vector2d.getY());
            this.Za.setX(Math.min(Math.max(0.0, this.Za.getX()), this.jy * 5.0));
            this.Za.setY(Math.min(Math.max(0.0, this.Za.getY()), this.jy - 7.0));
        }
        this.cj();
        this.jy = 100.0;
    }

    private void cj() {
        Color color = ais.d(this.rP().rQ(), this.qj());
        Color color2 = ais.d(this.rP().rR(), this.qj());
        this.azP.forEach(vector2d -> ait.c(this.aqy.getX() + vector2d.getX(), this.aqy.getY() + vector2d.getY(), 2.5, color));
        for (float f2 = 0.0f; f2 <= 1.0f; f2 += 0.1f) {
            ArrayList<Vector2d> arrayList = new ArrayList<Vector2d>(this.azP);
            ArrayList<Vector2d> arrayList2 = new ArrayList<Vector2d>();
            ArrayList<Vector2d> arrayList3 = new ArrayList<Vector2d>();
            while (arrayList.size() > 1) {
                int n2 = 0;
                while ((double)n2 < Math.ceil((float)(arrayList.size() - 1) / 2.0f)) {
                    this.a(arrayList, arrayList2, arrayList3, f2, n2);
                    n2 += 2;
                }
                n2 = arrayList.size() - 2;
                while ((double)n2 >= Math.ceil((float)(arrayList.size() - 1) / 2.0f)) {
                    this.a(arrayList, arrayList2, arrayList3, f2, n2);
                    n2 -= 2;
                }
                arrayList.addAll(arrayList3);
                arrayList3.clear();
                arrayList.removeAll(arrayList2);
                arrayList2.clear();
            }
            ait.c(arrayList.get(0).getX() + this.aqy.getX(), arrayList.get(0).getY() + this.aqy.getY(), 1.5, ais.d(color2, Math.min(200, color2.getAlpha())));
        }
    }

    private void a(ArrayList<Vector2d> arrayList, ArrayList<Vector2d> arrayList2, ArrayList<Vector2d> arrayList3, float f2, int n2) {
        Vector2d vector2d = arrayList.get(n2);
        Vector2d vector2d2 = arrayList.get(n2 + 1);
        arrayList2.add(vector2d);
        arrayList2.add(vector2d2);
        arrayList3.add(new Vector2d(vector2d.getX() + (vector2d2.getX() - vector2d.getX()) * (double)f2, vector2d.getY() + (vector2d2.getY() - vector2d.getY()) * (double)f2));
    }

    @Override
    public boolean e(int n2, int n3, int n4) {
        if (this.aqy == null) {
            return false;
        }
        if (!aee.e(this.aqy.getX(), this.aqy.getY(), 400.0, this.jy)) {
            return false;
        }
        ArrayList<Vector2d> arrayList = new ArrayList<Vector2d>(this.azP);
        arrayList.sort((vector2d, vector2d2) -> (int)(sw.aaa.a(vector2d.getX() + this.aqy.getX() - (double)n2, vector2d.getY() + this.aqy.getY() - (double)n3) - sw.aaa.a(vector2d2.getX() + this.aqy.getX() - (double)n2, vector2d2.getY() + this.aqy.getY() - (double)n3)));
        this.Za = (Vector2d)arrayList.stream().findFirst().get();
        return true;
    }

    @Override
    public void pP() {
        this.Za = null;
    }

    @Override
    public void ci() {
        this.cj();
    }

    @Override
    public void b(char c2, int n2) {
        if (this.aqy == null) {
            return;
        }
    }
}

