/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.agf;
import hackclient.rise.agi;
import hackclient.rise.agj;
import hackclient.rise.agk;
import hackclient.rise.gd;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Supplier;
import lombok.Generated;
import net.minecraft.client.Minecraft;

public final class gb
extends Enum<gb> {
    public static final /* enum */ gb ks = new gb("product_sans_%s", "ttf");
    public static final /* enum */ gb kt = new gb("Minecraft", () -> Minecraft.getMinecraft().fontRendererObj);
    public static final /* enum */ gb ku = new gb("Icon-1", "ttf");
    public static final /* enum */ gb kv = new gb("Icon-3", "ttf");
    public static final /* enum */ gb kw = new gb("", "ttf");
    Supplier<agf> kx;
    agf ky;
    String name;
    final String kz;
    private final HashMap<Integer, agi> kA = new HashMap();
    private static final /* synthetic */ gb[] kB;

    public static gb[] values() {
        return (gb[])kB.clone();
    }

    public static gb valueOf(String string) {
        return Enum.valueOf(gb.class, string);
    }

    private gb(String string2, String string3) {
        this.name = string2;
        this.kz = string3;
    }

    private gb(String string2, Supplier<agf> supplier) {
        this.name = string2;
        this.kz = "";
        this.ky = supplier.get();
        this.kx = supplier;
    }

    public agf o(int n2) {
        return this.a(n2, gd.kD);
    }

    public agf dM() {
        if (this.kx == null) {
            throw new Exception("Please specify a size, this doesn't have a predefined font");
        }
        return this.a(0, gd.kD);
    }

    public agf a(int n2, gd gd2) {
        if (this.kx != null) {
            if (this.ky == null) {
                this.ky = this.kx.get();
            }
            return this.ky;
        }
        int n3 = Integer.parseInt("" + n2 + gd2.dR());
        if (!this.kA.containsKey(n3)) {
            Font font = null;
            Object object = "unknown";
            if (this.name.contains(":")) {
                object = this.name;
                font = agj.q((String)object, n2);
            } else {
                for (String object2 : gd2.getAliases()) {
                    object = "rise/font/" + String.format(this.name, object2) + "." + this.kz;
                    font = agj.p((String)object, n2);
                    if (font != null) break;
                }
            }
            if (font != null) {
                agi agi2 = new agi(font, true, true, false);
                if (this == ks) {
                    Font font2;
                    Font font3;
                    Font font32;
                    Font font4 = gb.b(n2, gd2);
                    if (font4 != null) {
                        agi2.a(new agk(font4, true, true));
                    }
                    if ((font32 = agj.p("rise/font/product_sans_medium.ttf", n2)) != null) {
                        agi2.b(new agk(font32, true, true));
                    }
                    if ((font3 = gb.c(n2, gd2)) != null) {
                        agi2.c(new agk(font3, true, true));
                    }
                    if ((font2 = gb.d(n2, gd2)) != null) {
                        agi2.d(new agk(font2, true, true));
                    }
                }
                this.kA.put(n3, agi2);
            } else {
                throw new Exception("Unknown Font " + (String)object);
            }
        }
        return this.kA.get(n3);
    }

    private static Font b(int n2, gd gd2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    private static Font c(int n2, gd gd2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    private static Font d(int n2, gd gd2) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    public static ArrayList<String> dN() {
        ArrayList<String> arrayList = new ArrayList<String>();
        gb.a(arrayList, "/System/Library/Fonts");
        gb.a(arrayList, "/Library/Fonts");
        gb.a(arrayList, System.getProperty("user.home") + "/Library/Fonts");
        gb.a(arrayList, "C:\\Windows\\Fonts");
        gb.a(arrayList, System.getProperty("user.home") + "\\AppData\\Local\\Microsoft\\Windows\\Fonts");
        gb.a(arrayList, "/usr/share/fonts");
        gb.a(arrayList, "/usr/local/share/fonts");
        gb.a(arrayList, System.getProperty("user.home") + "/.fonts");
        gb.a(arrayList, System.getProperty("user.home") + "/.local/share/fonts");
        return arrayList;
    }

    private static void a(ArrayList<String> arrayList, String string) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    @Generated
    public void setName(String string) { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        
    }

    @Generated
    public String getName() { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return "";
    }

    @Generated
    public HashMap<Integer, agi> dO() {
        return this.kA;
    }

    private static /* synthetic */ gb[] dQ() { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }

    static { /* RISE-PORT STUB: initializer unrestored */ }
}

