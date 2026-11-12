/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

public class m {
    private int[] eMQ = null;
    private int position = 0;
    private int eMR = 0;

    public m(int n2) {
        this.eMQ = new int[n2];
    }

    public void kv(int n2) {
        this.eMQ[this.position] = n2;
        ++this.position;
        if (this.eMR < this.position) {
            this.eMR = this.position;
        }
    }

    public void bY(int n2, int n3) {
        this.eMQ[n2] = n3;
        if (this.eMR < n2) {
            this.eMR = n2;
        }
    }

    public void kw(int n2) {
        this.position = n2;
    }

    public void t(int[] nArray) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    public int kx(int n2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return 0;
    }

    public int[] aJe() { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    public void clear() { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    public int aJf() { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return 0;
    }

    public int getPosition() { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return 0;
    }
}

