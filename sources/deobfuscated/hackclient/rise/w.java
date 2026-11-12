/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.s;

public final class w
extends s {
    public w() {
        super("command.clip.description", "clip", "vclip", "hclip");
    }

    @Override
    public void execute(String[] stringArray) {
        if (stringArray.length <= 1 || stringArray[1].isEmpty()) {
            this.error(".clip <up/down/forward/back/left/right> <amount>");
            return;
        }
        block5 : switch (stringArray[0].toLowerCase()) {
            case "vclip": {
                double d2 = Double.parseDouble(stringArray[1]);
                w.aER.bgK.setPosition(w.aER.bgK.gW, w.aER.bgK.gX + d2, w.aER.bgK.gY);
                afl.b("Clipped you " + (d2 > 0.0 ? "up" : "down") + " " + Math.abs(d2) + " blocks.", new Object[0]);
                break;
            }
            case "hclip": {
                double d3 = Double.parseDouble(stringArray[1]);
                double d4 = Math.toRadians(w.aER.bgK.pl);
                double d5 = Math.sin(d4) * d3;
                double d6 = Math.cos(d4) * d3;
                w.aER.bgK.setPosition(w.aER.bgK.gW - d5, w.aER.bgK.gX, w.aER.bgK.gY + d6);
                afl.b("Clipped you " + (d3 > 0.0 ? "forward" : "back") + " " + Math.abs(d3) + " blocks.", new Object[0]);
                break;
            }
            case "clip": {
                if (stringArray.length <= 2 || stringArray[2].isEmpty()) {
                    this.error();
                    return;
                }
                switch (stringArray[1]) {
                    case "upward": 
                    case "upwards": 
                    case "up": {
                        double d7 = Double.parseDouble(stringArray[2]);
                        w.aER.bgK.setPosition(w.aER.bgK.gW, w.aER.bgK.gX + d7, w.aER.bgK.gY);
                        afl.b("Clipped you up " + d7 + " blocks.", new Object[0]);
                        break block5;
                    }
                    case "downward": 
                    case "downwards": 
                    case "down": {
                        double d8 = Double.parseDouble(stringArray[2]);
                        w.aER.bgK.setPosition(w.aER.bgK.gW, w.aER.bgK.gX - d8, w.aER.bgK.gY);
                        afl.b("Clipped you down " + d8 + " blocks.", new Object[0]);
                        break block5;
                    }
                    case "forwards": 
                    case "forward": {
                        double d9 = Double.parseDouble(stringArray[2]);
                        double d10 = Math.toRadians(w.aER.bgK.pl);
                        double d11 = Math.sin(d10) * d9;
                        double d12 = Math.cos(d10) * d9;
                        w.aER.bgK.setPosition(w.aER.bgK.gW - d11, w.aER.bgK.gX, w.aER.bgK.gY + d12);
                        afl.b("Clipped you forward " + d9 + " blocks.", new Object[0]);
                        break block5;
                    }
                    case "backwards": 
                    case "backward": 
                    case "back": {
                        double d13 = Double.parseDouble(stringArray[2]);
                        double d14 = Math.toRadians(w.aER.bgK.pl);
                        double d15 = Math.sin(d14) * d13;
                        double d16 = Math.cos(d14) * d13;
                        w.aER.bgK.setPosition(w.aER.bgK.gW + d15, w.aER.bgK.gX, w.aER.bgK.gY - d16);
                        afl.b("Clipped you back " + d13 + " blocks.", new Object[0]);
                        break block5;
                    }
                    case "left": {
                        double d17 = Double.parseDouble(stringArray[2]);
                        double d18 = Math.toRadians(w.aER.bgK.pl - 90.0f);
                        double d19 = Math.sin(d18) * d17;
                        double d20 = Math.cos(d18) * d17;
                        w.aER.bgK.setPosition(w.aER.bgK.gW - d19, w.aER.bgK.gX, w.aER.bgK.gY + d20);
                        afl.b("Clipped you left " + d17 + " blocks.", new Object[0]);
                        break block5;
                    }
                    case "right": {
                        double d21 = Double.parseDouble(stringArray[2]);
                        double d22 = Math.toRadians(w.aER.bgK.pl + 90.0f);
                        double d23 = Math.sin(d22) * d21;
                        double d24 = Math.cos(d22) * d21;
                        w.aER.bgK.setPosition(w.aER.bgK.gW - d23, w.aER.bgK.gX, w.aER.bgK.gY + d24);
                        afl.b("Clipped you right " + d21 + " blocks.", new Object[0]);
                        break block5;
                    }
                }
                this.error();
                break;
            }
            default: {
                this.error();
            }
        }
    }
}

