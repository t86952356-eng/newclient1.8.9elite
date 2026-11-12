/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material$1;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.block.material.MaterialLogic;
import net.minecraft.block.material.MaterialPortal;
import net.minecraft.block.material.MaterialTransparent;

public class Material {
    public static final Material beo = new MaterialTransparent(MapColor.bdC);
    public static final Material bep = new Material(MapColor.bdD);
    public static final Material beq = new Material(MapColor.bdM);
    public static final Material ber = new Material(MapColor.bdP).zB();
    public static final Material bes = new Material(MapColor.bdN).zA();
    public static final Material bet = new Material(MapColor.bdI).zA();
    public static final Material beu = new Material(MapColor.bdI).zA().zI();
    public static final Material bev = new MaterialLiquid(MapColor.bdO).zH();
    public static final Material bew = new MaterialLiquid(MapColor.bdG).zH();
    public static final Material bex = new Material(MapColor.bdJ).zB().zz().zH();
    public static final Material bey = new MaterialLogic(MapColor.bdJ).zH();
    public static final Material bez = new MaterialLogic(MapColor.bdJ).zB().zH().zD();
    public static final Material beA = new Material(MapColor.bdU);
    public static final Material beB = new Material(MapColor.bdF).zB();
    public static final Material beC = new MaterialTransparent(MapColor.bdC).zH();
    public static final Material beD = new Material(MapColor.bdE);
    public static final Material beE = new MaterialLogic(MapColor.bdC).zH();
    public static final Material beF = new MaterialLogic(MapColor.bdF).zB();
    public static final Material beG = new Material(MapColor.bdC).zz().zJ();
    public static final Material beH = new Material(MapColor.bdC).zJ();
    public static final Material beI = new Material(MapColor.bdG).zB().zz();
    public static final Material beJ = new Material(MapColor.bdJ).zH();
    public static final Material beK = new Material(MapColor.bdH).zz().zJ();
    public static final Material beL = new Material(MapColor.bdH).zJ();
    public static final Material beM = new MaterialLogic(MapColor.bdK).zD().zz().zA().zH();
    public static final Material beN = new Material(MapColor.bdK).zA();
    public static final Material beO = new Material(MapColor.bdJ).zz().zH();
    public static final Material beP = new Material(MapColor.bdL);
    public static final Material beQ = new Material(MapColor.bdJ).zH();
    public static final Material beR = new Material(MapColor.bdJ).zH();
    public static final Material beS = new MaterialPortal(MapColor.bdC).zI();
    public static final Material beT = new Material(MapColor.bdC).zH();
    public static final Material beU = new Material$1(MapColor.bdF).zA().zH();
    public static final Material beV = new Material(MapColor.bdN).zI();
    public static final Material beW = new Material(MapColor.bdC).zA().zI();
    private boolean beX;
    private boolean beY;
    private boolean beZ;
    private final MapColor bfa;
    private boolean bfb = true;
    private int bfc;
    private boolean bfd;

    public Material(MapColor mapColor) {
        this.bfa = mapColor;
    }

    public boolean zv() {
        return false;
    }

    public boolean zw() {
        return true;
    }

    public boolean zx() {
        return true;
    }

    public boolean zy() {
        return true;
    }

    private Material zz() {
        this.beZ = true;
        return this;
    }

    protected Material zA() {
        this.bfb = false;
        return this;
    }

    protected Material zB() {
        this.beX = true;
        return this;
    }

    public boolean zC() {
        return this.beX;
    }

    public Material zD() {
        this.beY = true;
        return this;
    }

    public boolean zE() {
        return this.beY;
    }

    public boolean isOpaque() {
        return !this.beZ && this.zy();
    }

    public boolean zF() {
        return this.bfb;
    }

    public int zG() {
        return this.bfc;
    }

    protected Material zH() {
        this.bfc = 1;
        return this;
    }

    protected Material zI() {
        this.bfc = 2;
        return this;
    }

    protected Material zJ() {
        this.bfd = true;
        return this;
    }

    public MapColor zK() {
        return this.bfa;
    }
}

