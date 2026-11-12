/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector4d
 */
package rise.module.impl.render;

import hackclient.rise.akn;
import hackclient.rise.cj;
import javax.vecmath.Vector4d;
import net.minecraft.client.gui.f;
import net.minecraft.entity.c;
import rip.vantage.commons.util.time.a;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.Render2DEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.render.targetinfo.BMSMode;
import rise.module.impl.render.targetinfo.CompactMode;
import rise.module.impl.render.targetinfo.CreidaModernMode;
import rise.module.impl.render.targetinfo.ExhibitionMode;
import rise.module.impl.render.targetinfo.GodlyMode;
import rise.module.impl.render.targetinfo.ModernMode;
import rise.module.impl.render.targetinfo.NovolineMode;
import rise.module.impl.render.targetinfo.WurstMode;
import rise.util.math.Vector2d;
import rise.value.BooleanValue;
import rise.value.ModeValue;

@ModuleInfo(aliases={"module.render.targetinfo.name"}, description="module.render.targetinfo.description", category=Category.RENDER)
public final class TargetInfo
extends Module {
    private final ModeValue aqv = new ModeValue("Mode", this).a(new Mode[]{new BMSMode("BMS", this)}).a(new Mode[]{new CompactMode("Compact", this)}).a(new Mode[]{new ModernMode("Modern", this)}).a(new Mode[]{new NovolineMode("Novoline", this)}).a(new Mode[]{new GodlyMode("Godly", this)}).a(new Mode[]{new CreidaModernMode("Creida Modern", this)}).a(new Mode[]{new ExhibitionMode("Exhibition", this)}).a(new Mode[]{new WurstMode("Wurst", this)}).co("Modern");
    public final akn aqw = new akn("Position", (Module)this, new Vector2d(200.0, 200.0));
    public final BooleanValue aqx = new BooleanValue("Follow Player", (Module)this, (Boolean)false);
    public Vector2d aqy = new Vector2d(0.0, 0.0);
    public c by;
    public double amy;
    public boolean aqz;
    public a rG = new a();
    @EventLink
    public final Listener<PreMotionEvent> aqA = preMotionEvent -> {
        if (TargetInfo.aER.bgR instanceof f) {
            this.rG.aX();
            this.by = TargetInfo.aER.bgK;
        }
        if (this.by == null) {
            this.aqz = false;
            return;
        }
        this.amy = TargetInfo.aER.bgK.T(this.by);
        this.aqz = TargetInfo.aER.bgF.dCS.contains(this.by);
    };
    @EventLink
    public final Listener<AttackEvent> aqB = attackEvent -> {
        if (attackEvent.dc() instanceof net.minecraft.client.entity.a) {
            this.by = attackEvent.dc();
            this.rG.aX();
        }
    };
    @EventLink
    public final Listener<Render2DEvent> aqC = render2DEvent -> {
        if (this.by == null) {
            return;
        }
        if (((Boolean)this.aqx.wD()).booleanValue() && this.by != TargetInfo.aER.bgK) {
            Vector4d vector4d = cj.e(this.by);
            if (vector4d == null) {
                return;
            }
            this.aqy.x = vector4d.z;
            this.aqy.y = vector4d.w - (vector4d.w - vector4d.y) / 2.0 - this.aqw.aHP.y / 2.0;
        } else {
            this.aqy = this.aqw.aqy;
        }
    };
}

