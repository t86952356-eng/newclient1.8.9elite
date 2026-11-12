/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package rise.module.impl.player;

import hackclient.rise.afl;
import hackclient.rise.aks;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;
import org.lwjgl.input.Keyboard;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.TickEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.other.proximityvoicechat.name"}, description="module.other.proximityvoicechat.description", category=Category.PLAYER)
public class ModuleOtherProximityvoicechatName
extends Module {
    private final BooleanValue VN = new BooleanValue("Listen to yourself", (Module)this, (Boolean)false);
    private final NumberValue VO = new NumberValue("Sample Rate", this, (Number)16000, (Number)8000, (Number)192000, (Number)4000);
    private final NumberValue VP = new NumberValue("Sample Size in bits", this, (Number)16, (Number)8, (Number)32, (Number)1);
    public final ModeValue VQ = new ModeValue("Channel (dont)", this).a(new Mode[]{new aks("Mono")}).a(new Mode[]{new aks("Stereo")}).a(new Mode[]{new aks("Quadraphonic")}).a(new Mode[]{new aks("Surround Sound")}).co("Mono");
    private Thread VR;
    private SourceDataLine VS;
    private TargetDataLine VT;
    private boolean VU = false;
    private int VV = 0;
    @EventLink
    public final Listener<TickEvent> VW = tickEvent -> {
        if (Keyboard.isKeyDown((int)45)) {
            if (!this.VU) {
                this.VU = true;
                this.VV = 0;
                this.hQ();
                afl.b("Start Talking", new Object[0]);
            } else {
                afl.b("Talking", new Object[0]);
                ++this.VV;
            }
        } else if (this.VU) {
            afl.b("Stop talking", new Object[0]);
            this.VU = false;
            this.disable();
        }
    };

    private void hQ() {
        if (this.VR != null) {
            this.VR.interrupt();
            this.VT.stop();
            this.VT.close();
            this.VS.stop();
            this.VS.close();
        }
        this.VR = new Thread(() -> {
            try {
                AudioFormat audioFormat = this.getAudioFormat();
                DataLine.Info info = new DataLine.Info(TargetDataLine.class, audioFormat);
                this.VT = (TargetDataLine)AudioSystem.getLine(info);
                this.VT.open(audioFormat);
                this.VT.start();
                DataLine.Info info2 = new DataLine.Info(SourceDataLine.class, audioFormat);
                this.VS = (SourceDataLine)AudioSystem.getLine(info2);
                this.VS.open(audioFormat);
                this.VS.start();
                byte[] byArray = new byte[4096];
                while (true) {
                    int n2 = this.VT.read(byArray, 0, byArray.length);
                    if (!((Boolean)this.VN.wD()).booleanValue()) continue;
                    this.VS.write(byArray, 0, n2);
                }
            }
            catch (LineUnavailableException lineUnavailableException) {
                lineUnavailableException.printStackTrace();
                return;
            }
        });
        this.VR.start();
    }

    private void disable() {
        if (this.VR != null) {
            this.VR.interrupt();
        }
        if (this.VT != null) {
            this.VT.stop();
            this.VT.close();
        }
        if (this.VS != null) {
            this.VS.stop();
            this.VS.close();
        }
    }

    @Override
    public void onDisable() {
        this.disable();
    }

    private AudioFormat getAudioFormat() { /* RISE-PORT STUB: original CFR body unrestored (GOTO/orphan); feature impact documented in PORTING_NOTES.md */
        return null;
    }
}

