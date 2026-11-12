/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.s;
import rip.vantage.commons.packet.impl.client.community.h;
import rip.vantage.network.core.a;

public class aj
extends s {
    public aj() {
        super("command.title.description", "title");
    }

    @Override
    public void execute(String[] stringArray) {
        if (stringArray.length != 7) {
            this.error(".title <message> <fadeInTime> <displayTime> <fadeOutTime> <color> <group/user>");
        } else {
            a.aKQ().aKZ().sendMessage(new h(stringArray[1], Integer.parseInt(stringArray[2]), Integer.parseInt(stringArray[3]), Integer.parseInt(stringArray[4]), stringArray[5], stringArray[6]).aJz());
        }
    }
}

