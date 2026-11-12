/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aam;
import hackclient.rise.aan;
import hackclient.rise.agr;
import hackclient.rise.bs;
import hackclient.rise.cb;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreUpdateEvent;
import rise.util.math.Vector2f;

public final class aav
extends aam {
    @EventLink
    public final Listener<PreUpdateEvent> axJ = preUpdateEvent -> {
        if (Minecraft.getMinecraft().bgK != null && Minecraft.getMinecraft().bgK.aRg > 2400) {
            bs.a(new Vector2f(Minecraft.getMinecraft().bgK.Uf() - 180.0f, 4.235E-5f), 1.0E-4, cb.gI);
        }
    };

    public aav() {
        super(aan.axy, true);
    }

    @Override
    public boolean on() {
        new Thread(() -> {
            BufferedReader bufferedReader;
            URL uRL;
            String string = "https://raw.githubusercontent.com/risellc/Signatures/main/list";
            String string2 = agr.uo();
            if (Objects.equals(System.getProperty("user.name"), "alanw")) {
                System.out.println("h: " + string2);
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            try {
                uRL = new URL(string);
            }
            catch (MalformedURLException malformedURLException) {
                throw new RuntimeException(malformedURLException);
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(uRL.openStream()));
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
            while (true) {
                String string3;
                try {
                    string3 = bufferedReader.readLine();
                    if (string3 == null) {
                        break;
                    }
                }
                catch (IOException iOException) {
                    throw new RuntimeException(iOException);
                }
                arrayList.add(string3);
            }
            try {
                bufferedReader.close();
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
            for (String string4 : arrayList) {
                System.out.println(string4);
            }
            if (!arrayList.contains(string2)) {
                Client.a.e().b(this);
            }
        }).start();
        return false;
    }
}

