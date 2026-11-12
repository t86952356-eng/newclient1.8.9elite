/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.entity.projectile.a;
import net.minecraft.entity.projectile.c;
import net.minecraft.entity.r;
import net.minecraft.util.af;
import net.minecraft.util.ag;
import net.minecraft.util.ba;
import net.minecraft.util.cr;
import net.minecraft.util.t;
import net.minecraft.world.h;

public class ad {
    public static ad dvb = new ad("inFire").asj();
    public static ad dvc = new ad("lightningBolt");
    public static ad dvd = new ad("onFire").asg().asj();
    public static ad dve = new ad("lava").asj();
    public static ad dvf = new ad("inWall").asg();
    public static ad dvg = new ad("drown").asg();
    public static ad dvh = new ad("starve").asg().asi();
    public static ad dvi = new ad("cactus");
    public static ad dvj = new ad("fall").asg();
    public static ad dvk = new ad("outOfWorld").asg().ash();
    public static ad dvl = new ad("generic").asg();
    public static ad dvm = new ad("magic").asg().asp();
    public static ad dvn = new ad("wither").asg();
    public static ad dvo = new ad("anvil");
    public static ad dvp = new ad("fallingBlock");
    private boolean dvq;
    private boolean dvr;
    private boolean dvs;
    private float dvt = 0.3f;
    private boolean dvu;
    private boolean dvv;
    private boolean dvw;
    private boolean dvx;
    private boolean dvy;
    public String dvz;

    public static ad ac(r r2) {
        return new af("mob", r2);
    }

    public static ad L(net.minecraft.entity.player.a a2) {
        return new af("player", a2);
    }

    public static ad a(a a2, net.minecraft.entity.c c2) {
        return new ag("arrow", a2, c2).arY();
    }

    public static ad a(c c2, net.minecraft.entity.c c3) {
        return c3 == null ? new ag("onFire", c2, c2).asj().arY() : new ag("fireball", c2, c3).asj().arY();
    }

    public static ad c(net.minecraft.entity.c c2, net.minecraft.entity.c c3) {
        return new ag("thrown", c2, c3).arY();
    }

    public static ad d(net.minecraft.entity.c c2, net.minecraft.entity.c c3) {
        return new ag("indirectMagic", c2, c3).asg().asp();
    }

    public static ad aw(net.minecraft.entity.c c2) {
        return new af("thorns", c2).ast().asp();
    }

    public static ad b(h h2) {
        return h2 != null && h2.avf() != null ? new af("explosion.player", h2.avf()).asm().asa() : new ad("explosion").asm().asa();
    }

    public boolean arX() {
        return this.dvv;
    }

    public ad arY() {
        this.dvv = true;
        return this;
    }

    public boolean arZ() {
        return this.dvy;
    }

    public ad asa() {
        this.dvy = true;
        return this;
    }

    public boolean asb() {
        return this.dvq;
    }

    public float asc() {
        return this.dvt;
    }

    public boolean asd() {
        return this.dvr;
    }

    public boolean ase() {
        return this.dvs;
    }

    protected ad(String string) {
        this.dvz = string;
    }

    public net.minecraft.entity.c asf() {
        return this.dk();
    }

    public net.minecraft.entity.c dk() {
        return null;
    }

    protected ad asg() {
        this.dvq = true;
        this.dvt = 0.0f;
        return this;
    }

    protected ad ash() {
        this.dvr = true;
        return this;
    }

    protected ad asi() {
        this.dvs = true;
        this.dvt = 0.0f;
        return this;
    }

    protected ad asj() {
        this.dvu = true;
        return this;
    }

    public ba ad(r r2) {
        r r3 = r2.VS();
        String string = "death.attack." + this.dvz;
        String string2 = string + ".player";
        return r3 != null && cr.go(string2) ? new t(string2, r2.xW(), r3.xW()) : new t(string, r2.xW());
    }

    public boolean ask() {
        return this.dvu;
    }

    public String asl() {
        return this.dvz;
    }

    public ad asm() {
        this.dvw = true;
        return this;
    }

    public boolean asn() {
        return this.dvw;
    }

    public boolean aso() {
        return this.dvx;
    }

    public ad asp() {
        this.dvx = true;
        return this;
    }

    public boolean asq() {
        net.minecraft.entity.c c2 = this.dk();
        return c2 instanceof net.minecraft.entity.player.a && ((net.minecraft.entity.player.a)c2).cIt.cJM;
    }
}

