/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.multiplayer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class i
extends Thread {
    private static final AtomicInteger bEa = new AtomicInteger(0);
    private static final Logger bEb = LogManager.getLogger();
    private final String bEc;
    private final DatagramSocket bEd;
    private boolean bEe = true;
    private final String bEf;

    public i(String string, String string2) {
        super("LanServerPinger #" + bEa.incrementAndGet());
        this.bEc = string;
        this.bEf = string2;
        this.setDaemon(true);
        this.bEd = new DatagramSocket();
    }

    @Override
    public void run() {
        String string = i.K(this.bEc, this.bEf);
        byte[] byArray = string.getBytes();
        while (!this.isInterrupted() && this.bEe) {
            try {
                InetAddress inetAddress = InetAddress.getByName("224.0.2.60");
                DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length, inetAddress, 4445);
                this.bEd.send(datagramPacket);
            }
            catch (IOException iOException) {
                bEb.warn("LanServerPinger: " + iOException.getMessage());
                break;
            }
            try {
                i.sleep(1500L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    @Override
    public void interrupt() {
        super.interrupt();
        this.bEe = false;
    }

    public static String K(String string, String string2) {
        return "[MOTD]" + string + "[/MOTD][AD]" + string2 + "[/AD]";
    }

    public static String dd(String string) {
        int n2 = string.indexOf("[MOTD]");
        if (n2 < 0) {
            return "missing no";
        }
        int n3 = string.indexOf("[/MOTD]", n2 + "[MOTD]".length());
        return n3 < n2 ? "missing no" : string.substring(n2 + "[MOTD]".length(), n3);
    }

    public static String de(String string) {
        int n2 = string.indexOf("[/MOTD]");
        if (n2 < 0) {
            return null;
        }
        int n3 = string.indexOf("[/MOTD]", n2 + "[/MOTD]".length());
        if (n3 >= 0) {
            return null;
        }
        int n4 = string.indexOf("[AD]", n2 + "[/MOTD]".length());
        if (n4 < 0) {
            return null;
        }
        int n5 = string.indexOf("[/AD]", n4 + "[AD]".length());
        return n5 < n4 ? null : string.substring(n4 + "[AD]".length(), n5);
    }
}

