/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
package net.minecraft.util;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import rip.vantage.commons.util.time.a;

public class cb {
    public int dzp;
    public int dzq;
    public final a dzr = new a();

    public void ats() {
        Mouse.setGrabbed((boolean)true);
        this.dzp = 0;
        this.dzq = 0;
    }

    public void att() {
        Mouse.setCursorPosition((int)(Display.getWidth() / 2), (int)(Display.getHeight() / 2));
        Mouse.setGrabbed((boolean)false);
    }

    public void atu() {
        this.dzp = Mouse.getDX();
        this.dzq = Mouse.getDY();
    }
}

