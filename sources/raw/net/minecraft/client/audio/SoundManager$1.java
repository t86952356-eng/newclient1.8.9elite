/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystemLogger
 */
package net.minecraft.client.audio;

import net.minecraft.client.audio.SoundManager;
import paulscode.sound.SoundSystemLogger;

class SoundManager$1
extends SoundSystemLogger {
    SoundManager$1(SoundManager soundManager) {
    }

    public void message(String string, int n2) {
        if (!string.isEmpty()) {
            SoundManager.bjy.info(string);
        }
    }

    public void importantMessage(String string, int n2) {
        if (!string.isEmpty()) {
            SoundManager.bjy.warn(string);
        }
    }

    public void errorMessage(String string, String string2, int n2) {
        if (!string2.isEmpty()) {
            SoundManager.bjy.error("Error in class '" + string + "'");
            SoundManager.bjy.error(string2);
        }
    }
}

