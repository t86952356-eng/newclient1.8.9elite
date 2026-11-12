/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import java.awt.Color;
import lombok.Generated;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.impl.render.ClickGUI;
import rise.module.impl.render.Interface;
import rise.util.math.Vector2d;

public final class zf {
    public Module cg;
    public Vector2d aqy = new Vector2d(5000.0, 0.0);
    public Vector2d atP = new Vector2d(5000.0, 0.0);
    public float atQ;
    public String tag = "";
    public float atS = 0.0f;
    public float atT;
    public Color anq = Color.WHITE;
    public String atU = "";
    public boolean atV = false;
    public String displayName = "";
    public String atX = "";
    public boolean atY;

    public float nG() {
        return this.atS + this.atT;
    }

    public zf(Module module) {
        this.cg = module;
    }

    public boolean a(Interface interface_) {
        if (this.dl() instanceof ClickGUI) {
            return false;
        }
        if (!this.dl().getModuleInfo().allowDisable()) {
            return false;
        }
        switch (((Mode)interface_.lV().wD()).getName()) {
            case "All": {
                return true;
            }
            case "Exclude render": {
                return !this.dl().getModuleInfo().category().equals((Object)Category.lh);
            }
            case "Only bound": {
                return this.dl().getKey() != 0;
            }
        }
        return true;
    }

    @Generated
    public Module dl() {
        return this.cg;
    }

    @Generated
    public Vector2d nH() {
        return this.aqy;
    }

    @Generated
    public Vector2d nI() {
        return this.atP;
    }

    @Generated
    public float nJ() {
        return this.atQ;
    }

    @Generated
    public String getTag() {
        return this.tag;
    }

    @Generated
    public float nK() {
        return this.atS;
    }

    @Generated
    public float nL() {
        return this.atT;
    }

    @Generated
    public Color nM() {
        return this.anq;
    }

    @Generated
    public String nN() {
        return this.atU;
    }

    @Generated
    public boolean nO() {
        return this.atV;
    }

    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    @Generated
    public String nP() {
        return this.atX;
    }

    @Generated
    public boolean nQ() {
        return this.atY;
    }

    @Generated
    public void k(Module module) {
        this.cg = module;
    }

    @Generated
    public void h(Vector2d vector2d) {
        this.aqy = vector2d;
    }

    @Generated
    public void i(Vector2d vector2d) {
        this.atP = vector2d;
    }

    @Generated
    public void s(float f2) {
        this.atQ = f2;
    }

    @Generated
    public void an(String string) {
        this.tag = string;
    }

    @Generated
    public void t(float f2) {
        this.atS = f2;
    }

    @Generated
    public void u(float f2) {
        this.atT = f2;
    }

    @Generated
    public void b(Color color) {
        this.anq = color;
    }

    @Generated
    public void ao(String string) {
        this.atU = string;
    }

    @Generated
    public void x(boolean bl2) {
        this.atV = bl2;
    }

    @Generated
    public void ap(String string) {
        this.displayName = string;
    }

    @Generated
    public void aq(String string) {
        this.atX = string;
    }

    @Generated
    public void y(boolean bl2) {
        this.atY = bl2;
    }
}

