/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abo;
import hackclient.rise.aee;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akh;
import hackclient.rise.sw;
import java.awt.Color;
import java.util.ArrayList;

public class abt
extends abo {
    private final ArrayList<aka> azP = new ArrayList();
    private aka Za = null;

    public abt(akh<?> akh2) {
        super(akh2);
        this.azP.clear();
        for (int i2 = 0; i2 <= 250; i2 += 10) {
            this.azP.add(new aka(i2, 45.0));
        }
    }

    @Override
    public void a(aka aka2, int n2, int n3, float f2) {
        this.aqy = aka2;
        this.aqy.setX(this.aqy.getX() + 2.5);
        if (this.Za != null) {
            this.Za.setY((double)n3 - aka2.getY());
            this.Za.setX(Math.min(Math.max(0.0, this.Za.getX()), this.jy * 5.0));
            this.Za.setY(Math.min(Math.max(0.0, this.Za.getY()), this.jy - 7.0));
        }
        this.cj();
        this.jy = 100.0;
    }

    private void cj() {
        Color color = ais.d(this.rP().rQ(), this.qj());
        Color color2 = ais.d(this.rP().rR(), this.qj());
        this.azP.forEach(aka2 -> ait.c(this.aqy.getX() + aka2.getX(), this.aqy.getY() + aka2.getY(), 2.5, color));
        for (float f2 = 0.0f; f2 <= 1.0f; f2 += 0.1f) {
            ArrayList<aka> arrayList = new ArrayList<aka>(this.azP);
            ArrayList<aka> arrayList2 = new ArrayList<aka>();
            ArrayList<aka> arrayList3 = new ArrayList<aka>();
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

    private void a(ArrayList<aka> arrayList, ArrayList<aka> arrayList2, ArrayList<aka> arrayList3, float f2, int n2) {
        aka aka2 = arrayList.get(n2);
        aka aka3 = arrayList.get(n2 + 1);
        arrayList2.add(aka2);
        arrayList2.add(aka3);
        arrayList3.add(new aka(aka2.getX() + (aka3.getX() - aka2.getX()) * (double)f2, aka2.getY() + (aka3.getY() - aka2.getY()) * (double)f2));
    }

    @Override
    public boolean e(int n2, int n3, int n4) {
        if (this.aqy == null) {
            return false;
        }
        if (!aee.e(this.aqy.getX(), this.aqy.getY(), 400.0, this.jy)) {
            return false;
        }
        ArrayList<aka> arrayList = new ArrayList<aka>(this.azP);
        arrayList.sort((aka2, aka3) -> (int)(sw.aaa.a(aka2.getX() + this.aqy.getX() - (double)n2, aka2.getY() + this.aqy.getY() - (double)n3) - sw.aaa.a(aka3.getX() + this.aqy.getX() - (double)n2, aka3.getY() + this.aqy.getY() - (double)n3)));
        this.Za = (aka)arrayList.stream().findFirst().get();
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

