/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.DisplayMode
 */
package net.optifine.util;

import java.util.Comparator;
import org.lwjgl.opengl.DisplayMode;

public class j
implements Comparator {
    public int compare(Object object, Object object2) {
        DisplayMode displayMode = (DisplayMode)object;
        DisplayMode displayMode2 = (DisplayMode)object2;
        return displayMode.getWidth() != displayMode2.getWidth() ? displayMode.getWidth() - displayMode2.getWidth() : (displayMode.getHeight() != displayMode2.getHeight() ? displayMode.getHeight() - displayMode2.getHeight() : (displayMode.getBitsPerPixel() != displayMode2.getBitsPerPixel() ? displayMode.getBitsPerPixel() - displayMode2.getBitsPerPixel() : (displayMode.getFrequency() != displayMode2.getFrequency() ? displayMode.getFrequency() - displayMode2.getFrequency() : 0)));
    }
}

