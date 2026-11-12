/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.agp;
import hackclient.rise.agx;
import hackclient.rise.aha;
import hackclient.rise.ahb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class agz {
    private final agx aKC = agx.uB();
    private static final int aKD = 9;
    private static final int aKE = 64;
    private boolean aKF;
    private String aKG = "";
    private List<String> aKH = Collections.emptyList();
    private List<String> aKI = Collections.emptyList();
    private int aKJ = 0;
    private int aBA = 0;
    private int aKK = aha.uP();

    public int uC() {
        this.uJ();
        return this.aBA;
    }

    public boolean ur() {
        this.uJ();
        return this.aKF;
    }

    public String uD() {
        this.uJ();
        return this.aKG;
    }

    public List<String> uE() {
        this.uJ();
        return this.aKH;
    }

    public int uF() {
        this.uJ();
        return this.aKI == null ? 0 : this.aKI.size();
    }

    public int uG() {
        this.uJ();
        if (!this.aKF) {
            return 0;
        }
        if (this.aKJ <= 0) {
            return 0;
        }
        return this.aKJ / 9;
    }

    public int uH() {
        this.uJ();
        int n2 = this.uF();
        if (n2 <= 0) {
            return 0;
        }
        return (n2 + 9 - 1) / 9;
    }

    public String uI() {
        this.uJ();
        int n2 = this.uF();
        if (n2 <= 9) {
            return "";
        }
        int n3 = this.uG() + 1;
        int n4 = this.uH();
        return " (" + n3 + "/" + n4 + ")";
    }

    public void aX() {
        this.aKF = false;
        this.aKG = "";
        this.aKH = Collections.emptyList();
        this.aKI = Collections.emptyList();
        this.aKJ = 0;
        this.aBA = 0;
    }

    private void uJ() {
        int n2 = aha.uP();
        if (n2 != this.aKK) {
            this.aX();
            this.aKK = n2;
        }
    }

    public boolean a(agp agp2, char c2, int n2) {
        if (agp2 == null) {
            return false;
        }
        this.uJ();
        if (this.aKF) {
            if ((n2 == 201 || n2 == 26) && this.uN()) {
                return true;
            }
            if ((n2 == 209 || n2 == 27) && this.uO()) {
                return true;
            }
        }
        if (this.aKF) {
            if (n2 == 15) {
                if (this.aKH != null && !this.aKH.isEmpty()) {
                    this.aBA = (this.aBA + 1) % this.aKH.size();
                }
                return true;
            }
            if (n2 == 200) {
                if (this.uF() > 9) {
                    this.uN();
                    return true;
                }
                if (this.aKH != null && !this.aKH.isEmpty()) {
                    this.aBA = (this.aBA - 1 + this.aKH.size()) % this.aKH.size();
                }
                return true;
            }
            if (n2 == 208) {
                if (this.uF() > 9) {
                    this.uO();
                    return true;
                }
                if (this.aKH != null && !this.aKH.isEmpty()) {
                    this.aBA = (this.aBA + 1) % this.aKH.size();
                }
                return true;
            }
            if (n2 == 203) {
                if (this.aKH != null && !this.aKH.isEmpty()) {
                    this.aBA = (this.aBA - 1 + this.aKH.size()) % this.aKH.size();
                }
                return true;
            }
            if (n2 == 205) {
                if (this.aKH != null && !this.aKH.isEmpty()) {
                    this.aBA = (this.aBA + 1) % this.aKH.size();
                }
                return true;
            }
        }
        if (n2 == 1) {
            if (this.aKF) {
                this.aX();
                return true;
            }
            return false;
        }
        if (this.aKF && n2 >= 2 && n2 <= 10) {
            int n3 = n2 - 2;
            if (n3 < this.aKH.size()) {
                this.a(agp2, this.aKJ + n3);
            }
            return true;
        }
        if (n2 == 14) {
            if (!this.aKF) {
                return false;
            }
            if (!this.aKG.isEmpty()) {
                this.aKG = this.aKG.substring(0, this.aKG.length() - 1);
                if (this.aKG.isEmpty()) {
                    this.aX();
                } else {
                    this.uL();
                }
            } else {
                this.aX();
            }
            return true;
        }
        if (n2 == 57 || n2 == 28) {
            if (!this.aKF) {
                return false;
            }
            if (!this.aKH.isEmpty()) {
                this.a(agp2, this.aKJ + this.aBA);
            } else {
                agp2.bW(this.aKG);
                this.aX();
            }
            return true;
        }
        if (agz.n(c2)) {
            char c3 = Character.toLowerCase(c2);
            this.uK();
            this.aKG = this.aKG + c3;
            this.uL();
            return true;
        }
        if (this.aKF && c2 != '\u0000' && !Character.isISOControl(c2)) {
            if (!this.aKH.isEmpty()) {
                this.a(agp2, this.aKJ + this.aBA);
            } else if (!this.aKG.isEmpty()) {
                agp2.bW(this.aKG);
                this.aX();
            }
            return false;
        }
        return false;
    }

    private void uK() {
        if (!this.aKF) {
            this.aKF = true;
            this.aKG = "";
            this.aKH = Collections.emptyList();
            this.aKI = Collections.emptyList();
            this.aKJ = 0;
            this.aBA = 0;
        }
    }

    private void uL() {
        if (!this.aKF) {
            return;
        }
        String string = this.aKG.toLowerCase(Locale.ROOT);
        ArrayList<String> arrayList = new ArrayList<String>(this.aKC.s(string, 64));
        this.aKI = arrayList;
        this.aKJ = 0;
        this.aKH = this.uM();
        this.aBA = 0;
    }

    private List<String> uM() {
        int n2;
        if (this.aKI == null || this.aKI.isEmpty()) {
            return Collections.emptyList();
        }
        int n3 = Math.max(0, Math.min(this.aKJ, this.aKI.size() - 1));
        if (n3 >= (n2 = Math.min(this.aKI.size(), n3 + 9))) {
            return Collections.emptyList();
        }
        return this.aKI.subList(n3, n2);
    }

    private boolean uN() {
        if (!this.aKF) {
            return false;
        }
        int n2 = this.uF();
        if (n2 <= 9) {
            return false;
        }
        int n3 = Math.max(0, this.aKJ - 9);
        if (n3 == this.aKJ) {
            return false;
        }
        this.aKJ = n3;
        this.aKH = this.uM();
        this.aBA = Math.min(this.aBA, Math.max(0, this.aKH.size() - 1));
        return true;
    }

    private boolean uO() {
        if (!this.aKF) {
            return false;
        }
        int n2 = this.uF();
        if (n2 <= 9) {
            return false;
        }
        int n3 = Math.max(0, (n2 - 1) / 9 * 9);
        int n4 = Math.min(n3, this.aKJ + 9);
        if (n4 == this.aKJ) {
            return false;
        }
        this.aKJ = n4;
        this.aKH = this.uM();
        this.aBA = Math.min(this.aBA, Math.max(0, this.aKH.size() - 1));
        return true;
    }

    private void a(agp agp2, int n2) {
        if (!this.aKF) {
            return;
        }
        if (this.aKI == null || this.aKI.isEmpty()) {
            return;
        }
        int n3 = Math.max(0, Math.min(n2, this.aKI.size() - 1));
        String string = this.aKI.get(n3);
        String string2 = this.aKG == null ? "" : this.aKG.toLowerCase(Locale.ROOT);
        agp2.bW(string);
        if (!string2.isEmpty() && string != null && !string.isEmpty()) {
            ahb.uR().D(string2, string);
        }
        this.aX();
    }

    private static boolean n(char c2) {
        return c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z';
    }
}

