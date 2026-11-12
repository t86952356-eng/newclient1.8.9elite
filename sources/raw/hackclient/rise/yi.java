/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.yh;
import hackclient.rise.yj;
import hackclient.rise.yk;
import hackclient.rise.yl;
import hackclient.rise.ym;
import hackclient.rise.yn;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.imageio.metadata.IIOMetadata;
import net.minecraft.client.d;
import net.minecraft.client.renderer.texture.TextureUtil;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class yi {
    private static final byte[] asb = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] asc = new byte[]{-1, -40, -1};
    private static final byte[] asd = new byte[]{71, 73, 70, 56, 55, 97};
    private static final byte[] ase = new byte[]{71, 73, 70, 56, 57, 97};
    private static final long asf = 15000L;
    private static volatile boolean asg = false;
    private static final Pattern ash = Pattern.compile("(https?://[^\\s<>\\\"']+)", 2);
    private static final Pattern asi = Pattern.compile("(?is)<meta\\b[^>]*>");
    private static final Pattern asj = Pattern.compile("(?is)\\bcontent\\s*=\\s*[\"']([^\"']+)[\"']");
    private static final String[] ask = new String[]{".png", ".jpg", ".jpeg", ".gif", ".webp", ".bmp"};
    private static final String[] asl = new String[]{".mp4", ".webm", ".mov"};
    private static final int asm = 3;
    private static final int asn = 8;
    private static final int aso = 0xA00000;
    private static final int asp = 200;
    private static final int asq = 4096;
    private static final String[] asr = new String[]{"discord.com", "discordapp.com", "media.discordapp.net", "cdn.discordapp.com", "imgur.com", "i.imgur.com", "giphy.com", "media.giphy.com", "media0.giphy.com", "media1.giphy.com", "media2.giphy.com", "media3.giphy.com", "media4.giphy.com", "tenor.com", "media.tenor.com", "tenor.googleapis.com", "imgflip.com", "i.imgflip.com", "reddit.com", "i.redd.it", "preview.redd.it", "styles.redditmedia.com", "external-preview.redd.it", "twimg.com", "x.com", "gyazo.com", "i.gyazo.com", "scdn.co", "prnt.sc", "prntscr.com", "imgbox.com", "th.imgbox.com", "freeimagehost.com", "servimg.com", "tinypic.com", "tinypic.org", "streamable.com", "cloudinary.com", "res.cloudinary.com", "imgbb.com", "i.ibb.co", "postimages.org", "i.postimg.cc", "imagebb.com", "i.ibb.co", "swapzd.com", "lhosti.com", "ifunny.co", "pifunny.com", "meme-kingdom.com", "lomdei.com"};
    private final Map<String, yh> ass = new ConcurrentHashMap<String, yh>();
    private final Set<String> ast = ConcurrentHashMap.newKeySet();
    private final ExecutorService asu = Executors.newFixedThreadPool(3);
    private static final ExecutorService asv = Executors.newCachedThreadPool(runnable -> {
        Thread thread = new Thread(runnable, "ChatImage-Decode");
        thread.setDaemon(true);
        thread.setPriority(1);
        return thread;
    });
    private final d asw = d.AZ();

    private static synchronized void nz() {
        if (!asg) {
            asg = true;
            System.out.println("[ChatImage] Security sandbox initialized (format validation + timeout protection)");
        }
    }

    private static boolean a(byte[] byArray, yn yn2, String string, yk yk2) {
        yi.nz();
        yl[] ylArray = new yl[1];
        Exception[] exceptionArray = new Exception[1];
        Callable<yl> callable = () -> {
            if (yn2 == yn.asJ) {
                yj yj2 = yi.h(byArray);
                if (yj2 != null) {
                    return new yl(yj2.asx, yj2.asy, yj2.asx.length);
                }
                return null;
            }
            BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(byArray));
            if (bufferedImage != null) {
                return new yl(new BufferedImage[]{bufferedImage}, new int[]{100}, 1);
            }
            return null;
        };
        Future<yl> future = asv.submit(callable);
        try {
            yl yl2 = future.get(15000L, TimeUnit.MILLISECONDS);
            if (yl2 == null) {
                return false;
            }
            yk2.asx = yl2.asA;
            yk2.asy = yl2.asB;
            yk2.asz = yl2.asC;
            return true;
        }
        catch (TimeoutException timeoutException) {
            future.cancel(true);
            System.out.println("[ChatImage] decode timed out for: " + string);
            return false;
        }
        catch (Exception exception) {
            System.out.println("[ChatImage] decode threw: " + exception.getClass().getSimpleName() + ": " + exception.getMessage());
            return false;
        }
    }

    private static yn b(byte[] byArray) {
        if (byArray == null || byArray.length < 8) {
            return yn.asM;
        }
        if (yi.a(byArray, asb)) {
            return yn.asH;
        }
        if (yi.a(byArray, asc)) {
            return yn.asI;
        }
        if (yi.a(byArray, asd) || yi.a(byArray, ase)) {
            return yn.asJ;
        }
        if (byArray.length >= 12 && byArray[0] == 82 && byArray[1] == 73 && byArray[2] == 70 && byArray[3] == 70 && byArray[8] == 87 && byArray[9] == 69 && byArray[10] == 66 && byArray[11] == 80) {
            return yn.asL;
        }
        if (byArray[0] == 66 && byArray[1] == 77) {
            return yn.asK;
        }
        return yn.asM;
    }

    private static boolean a(byte[] byArray, byte[] byArray2) {
        if (byArray.length < byArray2.length) {
            return false;
        }
        for (int i2 = 0; i2 < byArray2.length; ++i2) {
            if (byArray[i2] == byArray2[i2]) continue;
            return false;
        }
        return true;
    }

    private static boolean a(byte[] byArray, yn yn2) {
        switch (yn2.ordinal()) {
            case 0: {
                return yi.c(byArray);
            }
            case 1: {
                return yi.d(byArray);
            }
            case 2: {
                return yi.e(byArray);
            }
            case 4: {
                return yi.f(byArray);
            }
            case 3: {
                return yi.g(byArray);
            }
        }
        return false;
    }

    private static boolean c(byte[] byArray) {
        int n2;
        if (byArray.length < 29) {
            return false;
        }
        if (byArray[12] != 73 || byArray[13] != 72 || byArray[14] != 68 || byArray[15] != 82) {
            return false;
        }
        int n3 = (byArray[16] & 0xFF) << 24 | (byArray[17] & 0xFF) << 16 | (byArray[18] & 0xFF) << 8 | byArray[19] & 0xFF;
        int n4 = (byArray[20] & 0xFF) << 24 | (byArray[21] & 0xFF) << 16 | (byArray[22] & 0xFF) << 8 | byArray[23] & 0xFF;
        if (n3 <= 0 || n4 <= 0 || n3 > 4096 || n4 > 4096) {
            return false;
        }
        int n5 = byArray[25] & 0xFF;
        if (n5 == 3 || n5 == 4) {
            return false;
        }
        boolean bl2 = false;
        boolean bl3 = false;
        int n6 = 8;
        while (n6 + 12 <= byArray.length && n6 + 12 + (n2 = (byArray[n6] & 0xFF) << 24 | (byArray[n6 + 1] & 0xFF) << 16 | (byArray[n6 + 2] & 0xFF) << 8 | byArray[n6 + 3] & 0xFF) <= byArray.length) {
            String string = new String(byArray, n6 + 4, 4, StandardCharsets.US_ASCII);
            if ("IDAT".equals(string)) {
                bl2 = true;
            }
            if ("IEND".equals(string)) {
                bl3 = true;
                break;
            }
            int n7 = n6 + 12 + n2;
            if (n7 < n6) break;
            n6 = n7;
        }
        return bl2 && bl3;
    }

    private static boolean d(byte[] byArray) {
        if (byArray.length < 2 || byArray[0] != -1 || byArray[1] != -40) {
            return false;
        }
        boolean bl2 = false;
        int n2 = 2;
        while (n2 < byArray.length - 1) {
            int n3;
            int n4;
            if (byArray[n2] != -1) {
                ++n2;
                continue;
            }
            byte by2 = byArray[n2 + 1];
            if (by2 == -1) {
                ++n2;
                continue;
            }
            if (by2 == -64 || by2 == -63 || by2 == -62) {
                if (n2 + 9 > byArray.length) {
                    return false;
                }
                bl2 = true;
                n4 = (byArray[n2 + 5] & 0xFF) << 8 | byArray[n2 + 6] & 0xFF;
                n3 = (byArray[n2 + 7] & 0xFF) << 8 | byArray[n2 + 8] & 0xFF;
                if (n3 > 0 && n4 > 0 && n3 <= 4096 && n4 <= 4096) break;
                return false;
            }
            if (by2 == -38 || n2 + 3 > byArray.length || (n3 = n2 + 2 + (n4 = (byArray[n2 + 2] & 0xFF) << 8 | byArray[n2 + 3] & 0xFF)) < n2 || n3 > byArray.length) break;
            n2 = n3;
        }
        return bl2;
    }

    private static boolean e(byte[] byArray) {
        int n2;
        if (byArray.length < 14) {
            return false;
        }
        String string = new String(byArray, 0, 6, StandardCharsets.US_ASCII);
        if (!string.startsWith("GIF8")) {
            return false;
        }
        int n3 = byArray[6] & 0xFF | (byArray[7] & 0xFF) << 8;
        int n4 = byArray[8] & 0xFF | (byArray[9] & 0xFF) << 8;
        if (n3 <= 0 || n4 <= 0 || n3 > 4096 || n4 > 4096) {
            return false;
        }
        int n5 = 0;
        int n6 = 13;
        int n7 = byArray[10] & 0xFF;
        if ((n7 & 0x80) != 0) {
            n2 = 3 * (1 << (n7 & 7) + 1);
            if (n6 + n2 < n6 || n6 + n2 > byArray.length) {
                return false;
            }
            n6 += n2;
        }
        block0: while (n6 < byArray.length - 1 && n5 <= 200) {
            int n8;
            n2 = byArray[n6] & 0xFF;
            if (n2 == 33) {
                if (n6 + 1 >= byArray.length) break;
                n6 += 2;
                while (n6 < byArray.length) {
                    n8 = byArray[n6] & 0xFF;
                    if (n8 == 0) {
                        ++n6;
                        continue block0;
                    }
                    if ((n6 += 1 + n8) <= byArray.length) continue;
                    continue block0;
                }
                continue;
            }
            if (n2 == 44) {
                ++n5;
                if ((n6 += 10) < byArray.length) {
                    ++n6;
                }
                while (n6 < byArray.length) {
                    n8 = byArray[n6] & 0xFF;
                    if (n8 == 0) {
                        ++n6;
                        continue block0;
                    }
                    if ((n6 += 1 + n8) <= byArray.length) continue;
                    continue block0;
                }
                continue;
            }
            if (n2 == 59) break;
            ++n6;
        }
        return n5 > 0 && n5 <= 200;
    }

    private static boolean f(byte[] byArray) {
        if (byArray.length < 30) {
            return false;
        }
        if (byArray[0] != 82 || byArray[1] != 73 || byArray[2] != 70 || byArray[3] != 70) {
            return false;
        }
        if (byArray[8] != 87 || byArray[9] != 69 || byArray[10] != 66 || byArray[11] != 80) {
            return false;
        }
        int n2 = 12;
        boolean bl2 = false;
        int n3 = 0;
        int n4 = 0;
        while (n2 + 8 <= byArray.length) {
            int n5 = byArray[n2 + 4] & 0xFF | (byArray[n2 + 5] & 0xFF) << 8 | (byArray[n2 + 6] & 0xFF) << 16 | (byArray[n2 + 7] & 0xFF) << 24;
            String string = new String(byArray, n2, 4, StandardCharsets.US_ASCII);
            if ("VP8 ".equals(string) && n2 + 14 <= byArray.length) {
                bl2 = true;
                n3 = byArray[n2 + 10] & 0xFF | (byArray[n2 + 11] & 0xFF) << 8;
                n4 = byArray[n2 + 12] & 0xFF | (byArray[n2 + 13] & 0xFF) << 8;
            } else if ("VP8L".equals(string) && n2 + 14 <= byArray.length) {
                bl2 = true;
                int n6 = byArray[n2 + 8] & 0xFF | (byArray[n2 + 9] & 0xFF) << 8;
                if (n6 == 47) {
                    n3 = byArray[n2 + 10] & 0xFF | (byArray[n2 + 11] & 0xFF) << 8;
                    n4 = byArray[n2 + 12] & 0xFF | (byArray[n2 + 13] & 0xFF) << 8;
                    n3 = (n3 & 0x3FFF) + 1;
                    n4 = (n4 & 0x3FFF) + 1;
                }
            } else if ("VP8X".equals(string) && n2 + 18 <= byArray.length) {
                bl2 = true;
                n3 = (byArray[n2 + 12] & 0xFF | (byArray[n2 + 13] & 0xFF) << 8 | (byArray[n2 + 14] & 0xFF) << 16) + 1;
                n4 = (byArray[n2 + 15] & 0xFF | (byArray[n2 + 16] & 0xFF) << 8 | (byArray[n2 + 17] & 0xFF) << 16) + 1;
            }
            n2 += 8 + n5;
            if (n5 % 2 == 0) continue;
            ++n2;
        }
        if (!bl2) {
            return false;
        }
        return n3 > 0 && n4 > 0 && n3 <= 4096 && n4 <= 4096;
    }

    private static boolean g(byte[] byArray) {
        int n2;
        int n3;
        if (byArray.length < 54 || byArray[0] != 66 || byArray[1] != 77) {
            return false;
        }
        int n4 = byArray[14] & 0xFF | (byArray[15] & 0xFF) << 8 | (byArray[16] & 0xFF) << 16 | (byArray[17] & 0xFF) << 24;
        if (n4 == 12) {
            n3 = byArray[18] & 0xFF | (byArray[19] & 0xFF) << 8;
            n2 = byArray[20] & 0xFF | (byArray[21] & 0xFF) << 8;
        } else {
            n3 = byArray[18] & 0xFF | (byArray[19] & 0xFF) << 8 | (byArray[20] & 0xFF) << 16 | (byArray[21] & 0xFF) << 24;
            n2 = Math.abs(byArray[22] & 0xFF | (byArray[23] & 0xFF) << 8 | (byArray[24] & 0xFF) << 16 | (byArray[25] & 0xFF) << 24);
        }
        return n3 > 0 && n2 > 0 && n3 <= 4096 && n2 <= 4096;
    }

    /*
     * Exception decompiling
     */
    private static yj h(byte[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[FORLOOP]], but top level block is 6[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static int i(byte[] byArray) {
        int n2;
        int n3 = 0;
        int n4 = 13;
        int n5 = byArray[10] & 0xFF;
        if ((n5 & 0x80) != 0) {
            n2 = 3 * (1 << (n5 & 7) + 1);
            if (n4 + n2 < n4 || n4 + n2 > byArray.length) {
                return 0;
            }
            n4 += n2;
        }
        block0: while (n4 < byArray.length - 1 && n3 <= 200) {
            int n6;
            n2 = byArray[n4] & 0xFF;
            if (n2 == 33) {
                if (n4 + 1 >= byArray.length) break;
                n4 += 2;
                while (n4 < byArray.length) {
                    n6 = byArray[n4] & 0xFF;
                    if (n6 == 0) {
                        ++n4;
                        continue block0;
                    }
                    if ((n4 += 1 + n6) <= byArray.length) continue;
                    continue block0;
                }
                continue;
            }
            if (n2 == 44) {
                ++n3;
                if ((n4 += 10) < byArray.length) {
                    ++n4;
                }
                while (n4 < byArray.length) {
                    n6 = byArray[n4] & 0xFF;
                    if (n6 == 0) {
                        ++n4;
                        continue block0;
                    }
                    if ((n4 += 1 + n6) <= byArray.length) continue;
                    continue block0;
                }
                continue;
            }
            if (n2 == 59) break;
            ++n4;
        }
        return n3;
    }

    public List<String> Y(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Matcher matcher = ash.matcher(string);
        while (matcher.find()) {
            String string2 = this.ae(matcher.group(1));
            if (string2 == null || !this.af(string2)) continue;
            arrayList.add(string2);
        }
        return arrayList;
    }

    public boolean Z(String string) {
        return !this.Y(string).isEmpty();
    }

    public String aa(String string) {
        List<String> list = this.Y(string);
        return list.isEmpty() ? null : list.get(0);
    }

    public void b(yh yh2) {
        String string = yh2.np();
        this.ass.putIfAbsent(string, yh2);
        if (!this.aj(string)) {
            System.out.println("[ChatImage] blocked unsafe url " + string);
            this.ac(string);
            return;
        }
        if (this.ast.add(string)) {
            System.out.println("[ChatImage] queued " + string);
            this.asu.submit(() -> this.a(string, string, 0, new LinkedHashSet<String>()));
        }
    }

    /*
     * Exception decompiling
     */
    private void a(String var1_1, String var2_2, int var3_3, Set<String> var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 8[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private ym ab(String string) {
        IOException iOException = null;
        for (Proxy proxy : this.nA()) {
            ym ym2;
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            HttpURLConnection httpURLConnection;
            block24: {
                int n2;
                int n3;
                block23: {
                    httpURLConnection = null;
                    httpURLConnection = (HttpURLConnection)new URL(string).openConnection(proxy);
                    httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.connect();
                    n3 = httpURLConnection.getResponseCode();
                    if (n3 / 100 == 2) break block23;
                    if (httpURLConnection == null) continue;
                    httpURLConnection.disconnect();
                    continue;
                }
                inputStream = httpURLConnection.getInputStream();
                byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] byArray = new byte[8192];
                while ((n2 = inputStream.read(byArray)) != -1) {
                    if (byteArrayOutputStream.size() > 0xA00000) {
                        throw new IOException("File too large");
                    }
                    byteArrayOutputStream.write(byArray, 0, n2);
                }
                if (byteArrayOutputStream.size() > 0xA00000) {
                    throw new IOException("File too large");
                }
                ym2 = new ym(byteArrayOutputStream.toByteArray(), httpURLConnection.getURL().toString(), httpURLConnection.getContentType(), n3);
                byteArrayOutputStream.close();
                if (inputStream == null) break block24;
                inputStream.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return ym2;
            {
                catch (Throwable throwable) {
                    try {
                        try {
                            try {
                                try {
                                    byteArrayOutputStream.close();
                                }
                                catch (Throwable throwable2) {
                                    throwable.addSuppressed(throwable2);
                                }
                                throw throwable;
                            }
                            catch (Throwable throwable3) {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    }
                                    catch (Throwable throwable4) {
                                        throwable3.addSuppressed(throwable4);
                                    }
                                }
                                throw throwable3;
                            }
                        }
                        catch (IOException iOException2) {
                            iOException = iOException2;
                            if (httpURLConnection == null) continue;
                            httpURLConnection.disconnect();
                        }
                    }
                    catch (Throwable throwable5) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw throwable5;
                    }
                }
            }
        }
        if (iOException != null) {
            throw iOException;
        }
        return null;
    }

    private boolean a(String string, ym ym2) {
        byte[] byArray = ym2.asD;
        yn yn2 = yi.b(byArray);
        if (yn2 == yn.asM) {
            System.out.println("[ChatImage] unknown format, no magic bytes match");
            return false;
        }
        if (!yi.a(byArray, yn2)) {
            System.out.println("[ChatImage] structure validation failed: " + String.valueOf((Object)yn2));
            return false;
        }
        System.out.println("[ChatImage] format=" + String.valueOf((Object)yn2) + " validated, decoding with timeout...");
        yk yk2 = new yk();
        if (!yi.a(byArray, yn2, string, yk2)) {
            return false;
        }
        for (int i2 = 0; i2 < yk2.asz; ++i2) {
            if (yi.c(yk2.asx[i2])) continue;
            System.out.println("[ChatImage] post-decode dimension check failed");
            return false;
        }
        yh yh2 = this.ass.get(string);
        if (yh2 != null) {
            if (yk2.asz == 1) {
                yh2.b(yk2.asx[0]);
            } else {
                yh2.a(yk2.asx, yk2.asy);
            }
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(yh yh2) {
        if (yh2 == null || !yh2.nv()) {
            return;
        }
        yh yh3 = yh2;
        synchronized (yh3) {
            if (!yh2.nv()) {
                return;
            }
            BufferedImage[] bufferedImageArray = yh2.nw();
            if (bufferedImageArray == null || bufferedImageArray.length == 0) {
                return;
            }
            int[] nArray = new int[bufferedImageArray.length];
            for (int i2 = 0; i2 < bufferedImageArray.length; ++i2) {
                nArray[i2] = TextureUtil.a(TextureUtil.OC(), bufferedImageArray[i2], true, true);
            }
            yh2.a(nArray);
            System.out.println("[ChatImage] uploaded " + nArray.length + " texture(s) for " + yh2.np());
        }
    }

    private void ac(String string) {
        yh yh2 = this.ass.get(string);
        if (yh2 != null) {
            yh2.nx();
        }
        System.out.println("[ChatImage] marked failed " + string);
    }

    public yh ad(String string) {
        return this.ass.get(string);
    }

    private String ae(String string) {
        char c2;
        if (string == null || string.isEmpty()) {
            return null;
        }
        String string2 = string.trim();
        while (!(string2.isEmpty() || (c2 = string2.charAt(string2.length() - 1)) != ')' && c2 != ']' && c2 != '}' && c2 != ',' && c2 != '.' && c2 != '!' && c2 != '?')) {
            string2 = string2.substring(0, string2.length() - 1);
        }
        return string2.isEmpty() ? null : string2;
    }

    private boolean af(String string) {
        try {
            URI uRI = URI.create(string);
            String string2 = uRI.getScheme() == null ? "" : uRI.getScheme().toLowerCase();
            return "http".equals(string2) || "https".equals(string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    private List<String> ag(String string) {
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
        linkedHashSet.add(string);
        try {
            URI uRI = URI.create(string);
            String string2 = uRI.getHost() == null ? "" : uRI.getHost().toLowerCase();
            String string3 = uRI.getPath();
            if ((string2.endsWith("discordapp.com") || string2.endsWith("discord.com")) && string3 != null && string3.contains("/attachments/")) {
                linkedHashSet.add("https://media.discordapp.net" + string3);
                linkedHashSet.add("https://cdn.discordapp.com" + string3);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        return new ArrayList<String>(linkedHashSet);
    }

    private List<String> n(String string, String string2) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        try {
            boolean bl2;
            URI uRI = URI.create(string);
            String string3 = uRI.getHost() == null ? "" : uRI.getHost().toLowerCase();
            String string4 = uRI.getPath();
            String string5 = this.ah(uRI.getRawQuery());
            boolean bl3 = string2 != null && string2.toLowerCase().contains("image/webp");
            boolean bl4 = bl2 = string3.endsWith("discordapp.net") && string4 != null && string4.contains("/attachments/");
            if (bl3 && bl2) {
                linkedHashSet.add(this.a("https://cdn.discordapp.com", string4, string5));
                linkedHashSet.add(this.a("https://media.discordapp.net", string4, string5));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        return new ArrayList<String>(linkedHashSet);
    }

    private String ah(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String string2 : string.split("&")) {
            String string3;
            if (string2 == null || string2.isEmpty()) continue;
            int n2 = string2.indexOf(61);
            String string4 = string3 = n2 >= 0 ? string2.substring(0, n2) : string2;
            if ("format".equalsIgnoreCase(string3) || "quality".equalsIgnoreCase(string3) || "width".equalsIgnoreCase(string3) || "height".equalsIgnoreCase(string3)) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append('&');
            }
            stringBuilder.append(string2);
        }
        return stringBuilder.length() == 0 ? null : stringBuilder.toString();
    }

    private String a(String string, String string2, String string3) {
        if (string3 == null || string3.isEmpty()) {
            return string + string2;
        }
        return string + string2 + "?" + string3;
    }

    private List<Proxy> nA() {
        ArrayList<Proxy> arrayList = new ArrayList<Proxy>(1);
        Proxy proxy = this.asw.Bp();
        if (proxy != null) {
            arrayList.add(proxy);
        } else {
            arrayList.add(Proxy.NO_PROXY);
        }
        return arrayList;
    }

    public void hu() {
        for (yh yh2 : this.ass.values()) {
            for (int n2 : yh2.nu()) {
                if (n2 < 0) continue;
                TextureUtil.cO(n2);
            }
        }
        this.ass.clear();
        this.asu.shutdown();
        asv.shutdown();
    }

    private boolean a(ym ym2) {
        if (ym2.asF != null && ym2.asF.toLowerCase().contains("html")) {
            return true;
        }
        String string = new String(ym2.asD, 0, Math.min(ym2.asD.length, 256), StandardCharsets.UTF_8).toLowerCase();
        return string.contains("<html") || string.contains("<meta");
    }

    private List<String> b(ym ym2) {
        URI uRI;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        String string = new String(ym2.asD, StandardCharsets.UTF_8);
        try {
            uRI = URI.create(ym2.asE);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return new ArrayList<String>(linkedHashSet);
        }
        Matcher matcher = asi.matcher(string);
        while (matcher.find()) {
            Matcher matcher2;
            String string2 = matcher.group();
            String string3 = string2.toLowerCase();
            if (!string3.contains("og:image") && !string3.contains("twitter:image") && !string3.contains("og:video") && !string3.contains("twitter:player:stream") && !string3.contains("twitter:image:src") || !(matcher2 = asj.matcher(string2)).find()) continue;
            this.a(linkedHashSet, uRI, matcher2.group(1));
            if (linkedHashSet.size() < 8) continue;
            break;
        }
        return new ArrayList<String>(linkedHashSet);
    }

    private void a(Set<String> set, URI uRI, String string) {
        String string2 = this.ae(string);
        if (string2 == null) {
            return;
        }
        try {
            String string3 = uRI.resolve(string2).toString();
            if (this.ai(string3) && this.aj(string3)) {
                set.add(string3);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
    }

    private boolean ai(String string) {
        try {
            URI uRI = URI.create(string);
            String string2 = uRI.getPath() == null ? "" : uRI.getPath().toLowerCase();
            String string3 = uRI.getHost() == null ? "" : uRI.getHost().toLowerCase();
            for (String string4 : ask) {
                if (!string2.endsWith(string4)) continue;
                return true;
            }
            for (String string4 : asl) {
                if (!string2.endsWith(string4)) continue;
                return true;
            }
            return (string3.endsWith("discordapp.com") || string3.endsWith("discord.com") || string3.endsWith("discordapp.net")) && string2.contains("/attachments/");
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    private static int a(IIOMetadata iIOMetadata) {
        if (iIOMetadata == null) {
            return 100;
        }
        try {
            Node node;
            Node node2 = iIOMetadata.getAsTree("javax_imageio_gif_image_1.0");
            Node node3 = yi.a(node2, "GraphicControlExtension");
            if (node3 == null) {
                return 100;
            }
            NamedNodeMap namedNodeMap = node3.getAttributes();
            Node node4 = node = namedNodeMap == null ? null : namedNodeMap.getNamedItem("delayTime");
            if (node == null) {
                return 100;
            }
            int n2 = Integer.parseInt(node.getNodeValue());
            return Math.max(n2 * 10, 20);
        }
        catch (Exception exception) {
            return 100;
        }
    }

    private static Node a(Node node, String string) {
        if (node == null) {
            return null;
        }
        if (string.equals(node.getNodeName())) {
            return node;
        }
        for (Node node2 = node.getFirstChild(); node2 != null; node2 = node2.getNextSibling()) {
            Node node3 = yi.a(node2, string);
            if (node3 == null) continue;
            return node3;
        }
        return null;
    }

    private boolean aj(String string) {
        try {
            String string2;
            String string3;
            URI uRI = URI.create(string);
            String string4 = string3 = uRI.getScheme() == null ? "" : uRI.getScheme().toLowerCase();
            if (!"http".equals(string3) && !"https".equals(string3)) {
                return false;
            }
            String string5 = string2 = uRI.getHost() == null ? "" : uRI.getHost().toLowerCase();
            if (!yi.ak(string2)) {
                System.out.println("[ChatImage] domain not in allowlist: " + string2);
                return false;
            }
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private static boolean ak(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        for (String string2 : asr) {
            if (!string.equals(string2) && !string.endsWith("." + string2)) continue;
            return true;
        }
        return false;
    }

    private static boolean c(BufferedImage bufferedImage) {
        return bufferedImage.getWidth() > 0 && bufferedImage.getHeight() > 0 && bufferedImage.getWidth() <= 4096 && bufferedImage.getHeight() <= 4096;
    }
}

