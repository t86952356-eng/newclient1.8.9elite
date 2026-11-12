/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahl;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;

public class ahk {
    public static void a(ahl ahl2, String string, String string2) {
        try {
            SystemTray systemTray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
            TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
            trayIcon.setImageAutoSize(true);
            trayIcon.setToolTip("System tray icon demo");
            systemTray.add(trayIcon);
            trayIcon.displayMessage(string, string2, ahl2.uX());
        }
        catch (AWTException aWTException) {
            aWTException.printStackTrace();
        }
    }
}

