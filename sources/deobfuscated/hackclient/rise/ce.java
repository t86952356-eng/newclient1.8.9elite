/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.bf;
import hackclient.rise.by;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.cm;

public class ce
extends am {
    public static HashMap<String, String[]> hb = new HashMap();

    public static void cg() {
        for (Map.Entry<String, by> entry : bf.dc.entrySet()) {
            by by2 = entry.getValue();
            if (!by2.bT() || by2.bZ() == null) continue;
            by2.j(by2.cb() + 1);
            if (by2.cb() < by2.bZ().length) continue;
            by2.j(0);
        }
    }

    public static void ch() {
        if (!hb.isEmpty()) {
            for (Map.Entry<String, String[]> entry : hb.entrySet()) {
                String string = entry.getKey();
                String[] stringArray = entry.getValue();
                by by2 = bf.dc.get(string);
                cm[] cmArray = new cm[stringArray.length];
                if (by2.ca()) continue;
                by2.e(true);
                for (int i2 = 0; i2 < stringArray.length; ++i2) {
                    int n2 = i2;
                    String string2 = stringArray[i2];
                    cm cm2 = new cm("capes/" + string + "/" + n2);
                    TextureManager textureManager = Minecraft.getMinecraft().Bq();
                    Thread thread = new Thread(() -> {
                        try {
                            Thread.sleep(100L);
                            ThreadDownloadImageData threadDownloadImageData = new ThreadDownloadImageData(null, string2, null, null);
                            textureManager.a(cm2, threadDownloadImageData);
                            cmArray[n2] = cm2;
                        }
                        catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                    });
                    thread.start();
                }
                by2.a(cmArray);
                hb.remove(string);
            }
        }
    }
}

