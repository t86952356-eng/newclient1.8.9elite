/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FileUtils
 */
package net.minecraft.client.renderer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import net.minecraft.client.d;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.src.a;
import org.apache.commons.io.FileUtils;

class ThreadDownloadImageData$1
extends Thread {
    final /* synthetic */ ThreadDownloadImageData bPG;

    ThreadDownloadImageData$1(ThreadDownloadImageData threadDownloadImageData, String string) {
        this.bPG = threadDownloadImageData;
        super(string);
    }

    @Override
    public void run() {
        HttpURLConnection httpURLConnection = null;
        ThreadDownloadImageData.bPw.debug("Downloading http texture from {} to {}", new Object[]{this.bPG.bPz, this.bPG.bPy});
        if (this.bPG.Ln()) {
            this.bPG.Lo();
        } else {
            try {
                BufferedImage bufferedImage;
                httpURLConnection = (HttpURLConnection)new URL(this.bPG.bPz).openConnection(d.AZ().Bp());
                httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() / 100 != 2) {
                    if (httpURLConnection.getErrorStream() != null) {
                        a.i(httpURLConnection.getErrorStream());
                    }
                    return;
                }
                if (this.bPG.bPy != null) {
                    FileUtils.copyInputStreamToFile((InputStream)httpURLConnection.getInputStream(), (File)this.bPG.bPy);
                    bufferedImage = ImageIO.read(this.bPG.bPy);
                } else {
                    bufferedImage = TextureUtil.d(httpURLConnection.getInputStream());
                }
                if (this.bPG.bPA != null) {
                    bufferedImage = this.bPG.bPA.d(bufferedImage);
                }
                this.bPG.e(bufferedImage);
            }
            catch (Exception exception) {
                ThreadDownloadImageData.bPw.error("Couldn't download http texture: " + exception.getClass().getName() + ": " + exception.getMessage());
                return;
            }
            finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                this.bPG.Lp();
            }
        }
    }
}

