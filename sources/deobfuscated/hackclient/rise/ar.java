/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aee;
import hackclient.rise.afj;
import hackclient.rise.afk;
import hackclient.rise.agm;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akn;
import hackclient.rise.am;
import hackclient.rise.at;
import hackclient.rise.av;
import hackclient.rise.ds;
import hackclient.rise.du;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Optional;
import net.minecraft.client.gui.cz;
import net.minecraft.client.gui.f;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render2DEvent;
import rise.module.Module;
import rise.util.math.Vector2d;
import rise.value.Value;

public class ar
extends am {
    private static akn bR = null;
    private static Vector2d bS;
    private static final ArrayList<Module> bT;
    private static final afj bU;
    public static final a bV;
    public static final a bW;
    public static ArrayList<av> bX;
    public static av bY;
    @EventLink(cH=-2)
    public final Listener<Render2DEvent> bZ = render2DEvent -> {
        try {
            cz cz2 = ar.aER.jY;
            int n2 = cz2.getScaledWidth();
            int n3 = cz2.getScaledHeight();
            boolean bl2 = ar.aER.bgR instanceof f;
            if (!bl2) {
                bR = null;
            } else {
                bV.aX();
            }
            bU.a(afk.aGW);
            bU.h(300L);
            bU.Q(bl2 ? 100.0 : 0.0);
            if (bU.sV() <= 0.0 && bV.T(0L)) {
                bR = null;
            }
            bT.clear();
            Client.a.g().ef().stream().filter(module -> module.isEnabled() && module.getValues().stream().anyMatch(value -> value instanceof akn)).forEach(bT::add);
            if (bR != null) {
                Optional<Value> optional;
                Vector2d vector2d = aee.sk();
                double d2 = vector2d.x + ar.bS.x;
                double d3 = vector2d.y + ar.bS.y;
                ar.bR.atP = new Vector2d(d2, d3);
                bX.clear();
                double d4 = Client.a.k().rP().qt();
                bX.add(new av((float)n2 / 2.0f, 5.0, at.ce, true, true, true));
                bX.add(new av((float)n3 / 2.0f, 5.0, at.cd, true, true, true));
                bX.add(new av((double)n3 - d4, 5.0, at.cd, false, false, true));
                bX.add(new av(d4, 5.0, at.cd, false, true, false));
                bX.add(new av((double)n2 - d4, 5.0, at.ce, false, false, true));
                bX.add(new av(d4, 5.0, at.ce, false, true, false));
                for (Module module2 : bT) {
                    optional = module2.getValues().stream().filter(value -> value instanceof akn).findFirst();
                    akn akn2 = (akn)optional.get();
                    if (akn2 == bR) continue;
                    bX.add(new av(akn2.aqy.x + akn2.aHP.x + d4, 5.0, at.ce, false, true, false));
                    bX.add(new av(akn2.aqy.x - d4, 5.0, at.ce, false, false, true));
                    bX.add(new av(akn2.aqy.y, 5.0, at.cd, false, false, true));
                    bX.add(new av(akn2.aqy.y + akn2.aHP.y, 5.0, at.cd, false, true, false));
                }
                bY = null;
                optional = ais.d(Color.WHITE, 60);
                block7: for (av av2 : bX) {
                    switch (av2.cm) {
                        case cd: {
                            double d5;
                            double d6;
                            double d7 = Double.MAX_VALUE;
                            for (d6 = -ar.bR.aHP.y; d6 <= 0.0; d6 += ar.bR.aHP.y / 2.0) {
                                if (d6 == -ar.bR.aHP.y / 2.0 && !av2.cn || d6 == -ar.bR.aHP.y && !av2.cp || d6 == 0.0 && !av2.co || !((d5 = Math.abs(ar.bR.atP.y - (av2.ck + d6))) < av2.cl) || !(d5 < d7)) continue;
                                d7 = d5;
                                ar.bR.atP.y = av2.ck + d6;
                                bY = av2;
                                ait.d(0.0, ar.bY.ck, cz2.getScaledWidth(), 0.5, (Color)((Object)optional));
                            }
                            continue block7;
                        }
                        case ce: {
                            double d5;
                            double d6;
                            double d8 = Double.MAX_VALUE;
                            for (d6 = -ar.bR.aHP.x; d6 <= 0.0; d6 += ar.bR.aHP.x / 2.0) {
                                if (d6 == -ar.bR.aHP.x / 2.0 && !av2.cn || d6 == -ar.bR.aHP.x && !av2.cp || d6 == 0.0 && !av2.co || !((d5 = Math.abs(ar.bR.atP.x - (av2.ck + d6))) < av2.cl) || !(d5 < d8)) continue;
                                d8 = d5;
                                ar.bR.atP.x = av2.ck + d6;
                                bY = av2;
                                ait.d(ar.bY.ck, 0.0, 0.5, cz2.getScaledHeight(), (Color)((Object)optional));
                            }
                            break;
                        }
                    }
                }
            }
            for (Module module3 : bT) {
                Optional<Value> optional = module3.getValues().stream().filter(value -> value instanceof akn).findFirst();
                akn akn3 = (akn)optional.get();
                float f2 = Client.a.k().rP().qt();
                akn3.aqy.x = Math.max((double)f2, akn3.aqy.x);
                akn3.aqy.x = Math.min((double)n2 - akn3.aHP.x - (double)f2, akn3.aqy.x);
                akn3.aqy.y = Math.max((double)f2, akn3.aqy.y);
                akn3.aqy.y = Math.min((double)n3 - akn3.aHP.y - (double)f2, akn3.aqy.y);
                akn3.atP.x = Math.max((double)f2, akn3.atP.x);
                akn3.atP.x = Math.min((double)n2 - akn3.aHP.x - (double)f2, akn3.atP.x);
                akn3.atP.y = Math.max((double)f2, akn3.atP.y);
                akn3.atP.y = Math.min((double)n3 - akn3.aHP.y - (double)f2, akn3.atP.y);
                akn3.aqy = new Vector2d(Math.min((double)n2 - akn3.aHP.x - (double)f2, akn3.atP.x), Math.min((double)n3 - akn3.aHP.y - (double)f2, akn3.atP.y));
            }
            bW.aX();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("exception");
        }
    };
    @EventLink
    public final Listener<ds> ca = ds2 -> {
        if (ds2.cN() != 0) {
            return;
        }
        if (ar.aER.bgR instanceof f) {
            for (Module module : bT) {
                for (Value<?> value : module.getValues()) {
                    if (!(value instanceof akn)) continue;
                    akn akn2 = (akn)value;
                    Vector2d vector2d = akn2.aqy;
                    Vector2d vector2d2 = akn2.aHP;
                    float f2 = ds2.cL();
                    float f3 = ds2.cM();
                    if (akn2.aRO || !agm.a(vector2d, vector2d2, (double)f2, (double)f3)) continue;
                    bR = akn2;
                    bS = new Vector2d(vector2d.x - (double)f2, vector2d.y - (double)f3);
                }
            }
        }
    };
    @EventLink
    public final Listener<du> cb = du2 -> {
        bR = null;
    };

    static {
        bT = new ArrayList();
        bU = new afj(afk.aGW, 600L);
        bV = new a();
        bW = new a();
        bX = new ArrayList();
    }
}

