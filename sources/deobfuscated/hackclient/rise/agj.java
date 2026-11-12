/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.cm;
import rise.util.InstanceAccess;

public class agj {
    private static final IResourceManager aJE = InstanceAccess.aER.Br();

    public static Font p(String string, int n2) {
        try {
            return Font.createFont(0, aJE.v(new cm(string)).getInputStream()).deriveFont((float)n2);
        }
        catch (FontFormatException | IOException exception) {
            return null;
        }
    }

    public static Font q(String string, int n2) {
        try {
            return Font.createFont(0, new File(string)).deriveFont((float)n2);
        }
        catch (FontFormatException | IOException exception) {
            return null;
        }
    }
}

