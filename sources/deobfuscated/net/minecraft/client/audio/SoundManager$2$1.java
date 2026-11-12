/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundManager$2;

class SoundManager$2$1
extends URLConnection {
    final /* synthetic */ SoundManager$2 bjL;

    SoundManager$2$1(SoundManager$2 var1_1, URL uRL) {
        this.bjL = var1_1;
        super(uRL);
    }

    @Override
    public void connect() {
    }

    @Override
    public InputStream getInputStream() {
        return Minecraft.getMinecraft().Br().v(this.bjL.bjK).getInputStream();
    }
}

