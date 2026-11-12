/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystem
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.Source
 */
package net.minecraft.client.audio;

import net.minecraft.client.audio.SoundManager;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

class SoundManager$SoundSystemStarterThread
extends SoundSystem {
    private SoundManager$SoundSystemStarterThread(SoundManager soundManager) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean playing(String string) {
        Object object = SoundSystemConfig.THREAD_SYNC;
        synchronized (object) {
            if (this.soundLibrary == null) {
                return false;
            }
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl7 : MonitorExitStatement: MONITOREXIT : var2_2
            Source source = (Source)this.soundLibrary.getSources().get(string);
            return source != null && (source.playing() || source.paused() || source.preLoad);
        }
    }
}

