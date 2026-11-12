/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FileUtils
 */
package net.minecraft.client.renderer;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.util.concurrent.atomic.AtomicInteger;
import javax.imageio.ImageIO;
import net.minecraft.client.d;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ThreadDownloadImageData$1;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.http.j;
import net.optifine.http.k;
import net.optifine.shaders.ak;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadDownloadImageData
extends SimpleTexture {
    private static final Logger bPw = LogManager.getLogger();
    private static final AtomicInteger bPx = new AtomicInteger(0);
    private final File bPy;
    private final String bPz;
    private final IImageBuffer bPA;
    private BufferedImage bPB;
    private Thread bPC;
    private boolean bPD;
    public Boolean bPE = null;
    public boolean bPF = false;

    public ThreadDownloadImageData(File file, String string, cm cm2, IImageBuffer iImageBuffer) {
        super(cm2);
        this.bPy = file;
        this.bPz = string;
        this.bPA = iImageBuffer;
    }

    private void Lk() {
        if (!this.bPD && this.bPB != null) {
            this.bPD = true;
            if (this.bYt != null) {
                this.NJ();
            }
            if (a.aoG()) {
                ak.a(super.Ll(), this.bPB, false, false, a.Br(), this.bYt, this.NK());
            } else {
                TextureUtil.a(super.Ll(), this.bPB);
            }
        }
    }

    @Override
    public int Ll() {
        this.Lk();
        return super.Ll();
    }

    public void e(BufferedImage bufferedImage) {
        this.bPB = bufferedImage;
        if (this.bPA != null) {
            this.bPA.Ki();
        }
        this.bPE = this.bPB != null;
    }

    @Override
    public void b(IResourceManager iResourceManager) {
        if (this.bPB == null && this.bYt != null) {
            super.b(iResourceManager);
        }
        if (this.bPC == null) {
            if (this.bPy != null && this.bPy.isFile()) {
                bPw.debug("Loading http texture from local cache ({})", new Object[]{this.bPy});
                try {
                    this.bPB = ImageIO.read(this.bPy);
                    if (this.bPA != null) {
                        this.e(this.bPA.d(this.bPB));
                    }
                    this.Lp();
                }
                catch (IOException iOException) {
                    bPw.error("Couldn't load skin " + String.valueOf(this.bPy), (Throwable)iOException);
                    this.Lm();
                }
            } else {
                this.Lm();
            }
        }
    }

    protected void Lm() {
        this.bPC = new ThreadDownloadImageData$1(this, "Texture Downloader #" + bPx.incrementAndGet());
        this.bPC.setDaemon(true);
        this.bPC.start();
    }

    private boolean Ln() {
        if (!this.bPF) {
            return false;
        }
        Proxy proxy = d.AZ().Bp();
        return (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) && this.bPz.startsWith("http://");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Lo() {
        try {
            BufferedImage bufferedImage;
            j j2 = net.optifine.http.d.a(this.bPz, d.AZ().Bp());
            k k2 = net.optifine.http.d.a(j2);
            if (k2.aDe() / 100 != 2) {
                return;
            }
            byte[] byArray = k2.aDc();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            if (this.bPy != null) {
                FileUtils.copyInputStreamToFile((InputStream)byteArrayInputStream, (File)this.bPy);
                bufferedImage = ImageIO.read(this.bPy);
            } else {
                bufferedImage = TextureUtil.d(byteArrayInputStream);
            }
            if (this.bPA != null) {
                bufferedImage = this.bPA.d(bufferedImage);
            }
            this.e(bufferedImage);
        }
        catch (Exception exception) {
            bPw.error("Couldn't download http texture: " + exception.getClass().getName() + ": " + exception.getMessage());
            return;
        }
        finally {
            this.Lp();
        }
    }

    private void Lp() {
        this.bPE = this.bPB != null;
        if (this.bPA instanceof net.optifine.player.a) {
            net.optifine.player.a a2 = (net.optifine.player.a)this.bPA;
            a2.hu();
        }
    }

    public IImageBuffer Lq() {
        return this.bPA;
    }
}

