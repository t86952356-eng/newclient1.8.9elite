/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.player;

import hackclient.rise.ady;
import hackclient.rise.afl;
import hackclient.rise.ahd;
import hackclient.rise.ahj;
import hackclient.rise.ait;
import hackclient.rise.akn;
import hackclient.rise.cf;
import hackclient.rise.gg;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.bl;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;
import net.minecraft.util.an;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.Render2DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.util.math.Vector2d;
import rise.value.BooleanValue;

@ModuleInfo(aliases={"module.other.debugger.name"}, category=Category.PLAYER, description="module.other.debugger.description")
public final class Debugger
extends Module
implements ahd {
    private final BooleanValue UD = new BooleanValue("Transactions", (Module)this, (Boolean)true);
    private final BooleanValue UE = new BooleanValue("Keep Alive", (Module)this, (Boolean)true);
    private final BooleanValue UF = new BooleanValue("Teleport", (Module)this, (Boolean)true);
    private final BooleanValue UG = new BooleanValue("Velocity", (Module)this, (Boolean)true);
    private final BooleanValue UH = new BooleanValue("Abilities", (Module)this, (Boolean)true);
    private final BooleanValue UI = new BooleanValue("Display All", (Module)this, (Boolean)true);
    private final BooleanValue UJ = new BooleanValue("Blacklist", (Module)this, (Boolean)true, () -> (Boolean)this.UI.wD() == false);
    private final BooleanValue UK = new BooleanValue("Time Since Move", (Module)this, (Boolean)true, () -> (Boolean)this.UI.wD() == false);
    private final BooleanValue UL = new BooleanValue("Dev Panel", (Module)this, (Boolean)false);
    private final BooleanValue UM = new BooleanValue("Event Calls", (Module)this, (Boolean)false);
    private final akn UN = new akn("", (Module)this, new Vector2d(200.0, 200.0), true);
    private final DateTimeFormatter UO = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private final ArrayList<String> UP = new ArrayList();
    public static HashMap<String, Integer> UQ = new HashMap();
    private long UR;
    private boolean US;
    private a bN = new a();
    @EventLink
    public final Listener<PacketSendEvent> UT = packetSendEvent -> {};
    @EventLink
    public final Listener<PacketReceiveEvent> UU = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (((Boolean)this.UD.wD()).booleanValue() && aj2 instanceof bc) {
            bc bc2 = (bc)aj2;
            afl.b(String.valueOf((Object)an.dvX) + " Transaction " + String.valueOf((Object)an.dwh) + " (ID: %s)   (WindowID: %s)", bc2.actionNumber, bc2.windowId);
        } else if (((Boolean)this.UE.wD()).booleanValue() && aj2 instanceof net.minecraft.network.play.server.a) {
            net.minecraft.network.play.server.a a2 = (net.minecraft.network.play.server.a)aj2;
            afl.b(String.valueOf((Object)an.dvV) + " Keep Alive " + String.valueOf((Object)an.dwh) + " (ID: %s)", a2.agl());
        } else if (((Boolean)this.UF.wD()).booleanValue() && aj2 instanceof i) {
            i i2 = (i)aj2;
            afl.b(String.valueOf((Object)an.dvU) + " Server Teleport " + String.valueOf((Object)an.dwh) + " (Position: %s)", ahj.a(i2.x, 3) + " " + ahj.a(i2.y, 3) + " " + ahj.a(i2.z, 3));
        } else if (((Boolean)this.UG.wD()).booleanValue() && aj2 instanceof t) {
            t t2 = (t)aj2;
            if (t2.getEntityID() == Debugger.aER.bgK.getEntityId()) {
                afl.b(String.valueOf((Object)an.dvY) + " Velocity " + String.valueOf((Object)an.dwh) + " (DeltaX: %s) (DeltaY: %s)  (DeltaZ: %s) ", (double)t2.dcR / 8000.0, (double)t2.dcS / 8000.0, (double)t2.dcT / 8000.0);
            }
        } else if (((Boolean)this.UG.wD()).booleanValue() && aj2 instanceof ar) {
            ar ar2 = (ar)aj2;
            afl.b(String.valueOf((Object)an.dvY) + " Explosion (Velocity) " + String.valueOf((Object)an.dwh) + " (DeltaX: %s) (DeltaY: %s)  (DeltaZ: %s) ", Float.valueOf(ar2.ahm()), Float.valueOf(ar2.ahn()), Float.valueOf(ar2.aho()));
        } else if (((Boolean)this.UH.wD()).booleanValue() && aj2 instanceof bl) {
            bl bl2 = (bl)aj2;
            afl.b(String.valueOf((Object)an.dvZ) + " Abilities " + bl2.getFlySpeed() + " " + bl2.isAllowFlying() + " " + bl2.isFlying(), new Object[0]);
        }
    };
    @EventLink
    public final Listener<Render2DEvent> UV = render2DEvent -> {
        if (((Boolean)this.UL.wD()).booleanValue()) {
            double d2 = 10.0;
            this.UN.aHP = new Vector2d(180.0, 207.0);
            this.b(gg.kV, 1).c(() -> {
                double d2 = this.UN.aqy.x;
                double d3 = this.UN.aqy.y;
                double d4 = this.UN.aHP.x;
                double d5 = this.UN.aHP.y;
                double d6 = this.rP().pB();
                this.rP();
                ait.c(d2, d3, d4, d5, d6, ady.sa());
            });
            this.b(gg.kU).c(() -> ait.c(this.UN.aqy.x, this.UN.aqy.y, this.UN.aHP.x, this.UN.aHP.y, this.rP().pB(), Color.BLACK));
            this.b(gg.kT).c(() -> ait.c(this.UN.aqy.x, this.UN.aqy.y, this.UN.aHP.x, this.UN.aHP.y, this.rP().pB(), this.rP().rU()));
            this.b(gg.kV, 1).c(() -> {
                Debugger.aER.fontRendererObj.b(Client.b + " 6 INDEV " + this.UO.format(LocalDateTime.now()), this.UN.aqy.x + d2, this.UN.aqy.y + d2, new Color(255, 255, 0).getRGB());
                Debugger.aER.fontRendererObj.b("FPS: " + Minecraft.BI() + " [target " + aER.AG() + "]", this.UN.aqy.x + d2, this.UN.aqy.y + d2 * 2.0, new Color(255, 255, 0).getRGB());
                Debugger.aER.fontRendererObj.a("Debugger", this.UN.aqy.x + d2, this.UN.aqy.y + d2 * 4.0, this.rP().rQ().hashCode());
                Debugger.aER.fontRendererObj.a("Hidden due to not in dev mode", this.UN.aqy.x + d2, this.UN.aqy.y + d2 * 5.0, Color.WHITE.hashCode());
                Debugger.aER.fontRendererObj.a("Hidden due to not in dev mode", this.UN.aqy.x + d2, this.UN.aqy.y + d2 * 6.0, Color.WHITE.hashCode());
                Debugger.aER.fontRendererObj.a("ESPs Amount: " + cf.hc.size(), this.UN.aqy.x + d2, this.UN.aqy.y + d2 * 8.0, Color.WHITE.hashCode());
                Debugger.aER.fontRendererObj.a("Performance", this.UN.aqy.x + d2, this.UN.aqy.y + d2 * 9.0, this.rP().rQ().hashCode());
                Debugger.aER.fontRendererObj.a("ThreadLag: " + this.UR, this.UN.aqy.x + d2, this.UN.aqy.y + d2 * 16.0, Color.WHITE.hashCode());
                Debugger.aER.fontRendererObj.a("Other", this.UN.aqy.x + d2, this.UN.aqy.y + d2 * 18.0, this.rP().rQ().hashCode());
                Debugger.aER.fontRendererObj.a("Timer: " + Debugger.aER.bgC.dAp, this.UN.aqy.x + d2, this.UN.aqy.y + d2 * 19.0, Color.WHITE.hashCode());
            });
        }
    };
    @EventLink
    public final Listener<PreMotionEvent> UW = preMotionEvent -> {
        if (this.US) {
            return;
        }
        long l2 = System.currentTimeMillis();
        this.US = true;
        boolean bl2 = Debugger.aER.bgK.aRg % 100 == 0 && (Boolean)this.UM.wD() != false;
        aNC.execute(() -> {
            this.UR = System.currentTimeMillis() - l2;
            this.US = false;
            if (bl2) {
                afl.b("Displaying Calls: ", new Object[0]);
                for (String string : UQ.keySet()) {
                    afl.b(string + ": " + String.valueOf(UQ.get(string)), new Object[0]);
                }
                UQ.clear();
            }
        });
    };

    @Override
    public void onEnable() {
        this.UP.clear();
    }
}

