/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import net.minecraft.client.audio.SoundManager$2$1;
import net.minecraft.util.cm;

class SoundManager$2
extends URLStreamHandler {
    final /* synthetic */ cm bjK;

    SoundManager$2(cm cm2) {
        this.bjK = cm2;
    }

    @Override
    protected URLConnection openConnection(URL uRL) {
        return new SoundManager$2$1(this, uRL);
    }
}

