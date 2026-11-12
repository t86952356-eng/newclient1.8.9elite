/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import java.awt.TrayIcon;
import lombok.Generated;

public final class ahl
extends Enum<ahl> {
    public static final /* enum */ ahl aNT = new ahl(TrayIcon.MessageType.NONE);
    public static final /* enum */ ahl aNU = new ahl(TrayIcon.MessageType.WARNING);
    public static final /* enum */ ahl aNV = new ahl(TrayIcon.MessageType.INFO);
    public static final /* enum */ ahl aNW = new ahl(TrayIcon.MessageType.ERROR);
    private final TrayIcon.MessageType aNX;
    private static final /* synthetic */ ahl[] aNY;

    public static ahl[] values() {
        return (ahl[])aNY.clone();
    }

    public static ahl valueOf(String string) {
        return Enum.valueOf(ahl.class, string);
    }

    @Generated
    private ahl(TrayIcon.MessageType messageType) {
        this.aNX = messageType;
    }

    @Generated
    public TrayIcon.MessageType uX() {
        return this.aNX;
    }

    private static /* synthetic */ ahl[] uY() {
        return new ahl[]{aNT, aNU, aNV, aNW};
    }

    static {
        aNY = ahl.uY();
    }
}

