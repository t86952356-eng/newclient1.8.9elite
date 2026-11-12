/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.bm;
import hackclient.rise.dh;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.ek;
import hackclient.rise.es;
import hackclient.rise.fh;
import hackclient.rise.md;
import hackclient.rise.vc;
import net.minecraft.block.BlockBarrier;
import net.minecraft.block.BlockGlass;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.c;
import rip.vantage.commons.util.time.a;

public class ps
extends akg<md> {
    private boolean OD;
    private final a OE = new a();
    private final vc OF = null;
    @dm
    public final dk<ej> OG = ej2 -> {
        if (this.OD && !this.OE.T(4000L)) {
            bm.blink();
        }
    };
    @dm
    public final dk<es> OH = es2 -> {
        if (this.OD && bm.enabled && es2.df() instanceof BlockGlass) {
            es2.cF();
        }
        if (this.OD && bm.enabled && es2.df() instanceof BlockBarrier) {
            es2.cF();
        }
    };
    @dm
    public final dk<fh> OI = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof c) {
            String string;
            c c2 = (c)aj2;
            switch (string = c2.DM().arq()) {
                case "Cages opened! FIGHT!": 
                case "\u00a7r\u00a7r\u00a7r                               \u00a7r\u00a7f\u00a7lSkyWars Duel\u00a7r": 
                case "\u00a7r\u00a7eCages opened! \u00a7r\u00a7cFIGHT!\u00a7r": {
                    this.OD = false;
                    break;
                }
                case "The game starts in 3 seconds!": 
                case "\u00a7r\u00a7e\u00a7r\u00a7eThe game starts in \u00a7r\u00a7a\u00a7r\u00a7c3\u00a7r\u00a7e seconds!\u00a7r\u00a7e\u00a7r": 
                case "\u00a7r\u00a7eCages open in: \u00a7r\u00a7c3 \u00a7r\u00a7eseconds!\u00a7r": {
                    this.OD = true;
                    this.OE.aX();
                    break;
                }
                case "The games begin in 3 seconds!": {
                    this.OD = true;
                    this.OE.aX();
                }
            }
        }
    };
    @dm
    public final dk<ek> OJ = dh::cF;

    public ps(String string, md md2) {
        super(string, md2);
    }
}

