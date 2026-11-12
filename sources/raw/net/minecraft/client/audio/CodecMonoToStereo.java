/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundBuffer
 *  paulscode.sound.codecs.CodecJOrbis
 */
package net.minecraft.client.audio;

import javax.sound.sampled.AudioFormat;
import paulscode.sound.SoundBuffer;
import paulscode.sound.codecs.CodecJOrbis;

public class CodecMonoToStereo
extends CodecJOrbis {
    private static final String bhZ = System.getProperty("os.name").toLowerCase();
    private static final boolean bia = bhZ.contains("mac") || bhZ.contains("darwin");
    private AudioFormat bib = null;

    public SoundBuffer read() {
        SoundBuffer soundBuffer = super.read();
        if (soundBuffer == null || !bia) {
            return soundBuffer;
        }
        AudioFormat audioFormat = super.getAudioFormat();
        if (audioFormat != null && audioFormat.getChannels() == 1) {
            return this.a(soundBuffer, audioFormat);
        }
        return soundBuffer;
    }

    public SoundBuffer readAll() {
        SoundBuffer soundBuffer = super.readAll();
        if (soundBuffer == null || !bia) {
            return soundBuffer;
        }
        AudioFormat audioFormat = super.getAudioFormat();
        if (audioFormat != null && audioFormat.getChannels() == 1) {
            return this.a(soundBuffer, audioFormat);
        }
        return soundBuffer;
    }

    public AudioFormat getAudioFormat() {
        return this.bib != null ? this.bib : super.getAudioFormat();
    }

    private SoundBuffer a(SoundBuffer soundBuffer, AudioFormat audioFormat) {
        AudioFormat audioFormat2;
        byte[] byArray = soundBuffer.audioData;
        int n2 = audioFormat.getSampleSizeInBits() / 8;
        byte[] byArray2 = new byte[byArray.length * 2];
        int n3 = 0;
        for (int i2 = 0; i2 < byArray.length; i2 += n2) {
            int n4;
            for (n4 = 0; n4 < n2 && i2 + n4 < byArray.length; ++n4) {
                byArray2[n3++] = byArray[i2 + n4];
            }
            for (n4 = 0; n4 < n2 && i2 + n4 < byArray.length; ++n4) {
                byArray2[n3++] = byArray[i2 + n4];
            }
        }
        this.bib = audioFormat2 = new AudioFormat(audioFormat.getEncoding(), audioFormat.getSampleRate(), audioFormat.getSampleSizeInBits(), 2, audioFormat.getFrameSize() * 2, audioFormat.getFrameRate(), audioFormat.isBigEndian());
        return new SoundBuffer(byArray2, audioFormat2);
    }

    public void reverseByteOrder(boolean bl2) {
        super.reverseByteOrder(bl2);
    }
}

