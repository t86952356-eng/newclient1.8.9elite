/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import net.minecraft.client.network.a;
import net.minecraft.client.network.c;

public class d
extends Thread {
    private final c bEy;
    private final InetAddress bEz;
    private final MulticastSocket bEA;

    public d(c c2) {
        super("LanServerDetector #" + a.bEr.incrementAndGet());
        this.bEy = c2;
        this.setDaemon(true);
        this.bEA = new MulticastSocket(4445);
        this.bEz = InetAddress.getByName("224.0.2.60");
        this.bEA.setSoTimeout(5000);
        this.bEA.joinGroup(this.bEz);
    }

    @Override
    public void run() {
        byte[] byArray = new byte[1024];
        while (!this.isInterrupted()) {
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
            try {
                this.bEA.receive(datagramPacket);
            }
            catch (SocketTimeoutException socketTimeoutException) {
                continue;
            }
            catch (IOException iOException) {
                a.bEs.error("Couldn't ping server", (Throwable)iOException);
                break;
            }
            String string = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
            a.bEs.debug(String.valueOf(datagramPacket.getAddress()) + ": " + string);
            this.bEy.a(string, datagramPacket.getAddress());
        }
        try {
            this.bEA.leaveGroup(this.bEz);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.bEA.close();
    }
}

