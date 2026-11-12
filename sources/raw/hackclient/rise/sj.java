/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package hackclient.rise;

import com.google.gson.Gson;
import hackclient.rise.ady;
import hackclient.rise.afl;
import hackclient.rise.afu;
import hackclient.rise.agg;
import hackclient.rise.ait;
import hackclient.rise.aiu;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akn;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.akr;
import hackclient.rise.aks;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fe;
import hackclient.rise.fs;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gk;
import hackclient.rise.gl;
import hackclient.rise.sk;
import hackclient.rise.sl;
import hackclient.rise.sm;
import hackclient.rise.sn;
import hackclient.rise.so;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.invoke.LambdaMetafactory;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.ToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import net.minecraft.client.d;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.event.a;
import net.minecraft.event.b;
import net.minecraft.util.s;
import net.minecraft.util.v;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@gk
@gl(aliases={"module.other.spotify.name"}, description="module.other.spotify.description", category=gj.RENDER)
public class sj
extends gi {
    private final akp Wg = new akp("Music Service", this).a(new akg[]{new aks("Cider")}).a(new akg[]{new aks("Spotify")}).co("Cider");
    public final akn Wh = new akn("Position", (gi)this, new aka(200.0, 200.0));
    private final akq Wi = new akq("Refresh Ticks", this, (Number)10, (Number)1, (Number)20, (Number)1);
    private final aki Wj = new aki("Debug", (gi)this, (Boolean)false);
    private final aki Wk = new aki("Show Lyrics (Spotify)", (gi)this, (Boolean)true);
    private final akq Wl = new akq("Lyric Lines", this, (Number)1, (Number)1, (Number)12, (Number)1);
    private final akp Wm = new akp("Lyrics Provider", this).a(new akg[]{new aks("LRCLIB")}).a(new akg[]{new aks("TTML (Apple-style)")}).a(new akg[]{new aks("Enhanced LRC (word-timed)")}).a(new akg[]{new aks("Custom")}).co("LRCLIB");
    private final akr Wn = new akr("Lyrics Endpoint URL", (gi)this, "", () -> !"Spotify".equals(((akg)this.Wg.wD()).getName()) || "LRCLIB".equals(((akg)this.Wm.wD()).getName()));
    private final akr Wo = new akr("Lyrics Endpoint Header", (gi)this, "", () -> !"Spotify".equals(((akg)this.Wg.wD()).getName()) || "LRCLIB".equals(((akg)this.Wm.wD()).getName()));
    private final aki Wp = new aki("Karaoke Fill", (gi)this, (Boolean)true);
    private final akq Wq = new akq("Karaoke Speed (x)", this, (Number)1.25, (Number)0.25, (Number)3.0, (Number)0.05);
    public String Wr = "";
    public String Ws = "Loading...";
    public String Wt = "Loading...";
    public String Wu;
    public String Wv = "1:43";
    public String Ww = "2:56";
    public String Wx;
    private String Wy = "";
    public int Wz = 1;
    public int WA = 1;
    public int hV = 0;
    public int WB = -1;
    public gb WC = gb.ks;
    public static boolean WD = false;
    public final File WE = new File(afu.aIj, "data");
    private static final String WF = "spotify.json";
    private float WG = 0.0f;
    private final float WH = 105.0f;
    private boolean WI = false;
    private boolean WJ = false;
    private volatile boolean WK = false;
    private volatile boolean WL = false;
    private volatile List<sm> WM = new ArrayList<sm>();
    private volatile List<String> WN = new ArrayList<String>();
    private int WO = -1;
    private long WP = System.currentTimeMillis();
    private int WQ = -1;
    private long WR = 0L;
    private long WS = 0L;
    private static final int WT = 260;
    private static final int WU = 120;
    private static final int WV = 0;
    private static final int WW = 11;
    private static final int WX = 13;
    private static final int WY = 14;
    private float WZ = 0.0f;
    private float Xa = 0.0f;
    private long Xb = System.currentTimeMillis();
    private static final float Xc = 20.0f;
    private static final int Xd = 0;
    private float Xe;
    private float Xf;
    private float Xg;
    private boolean Xh = true;
    private static final float Xi = 25.0f;
    private static final float Xj = 6.5f;
    private long Xk = -1L;
    private float Xl = 0.0f;
    private static final int Xm = 520;
    private volatile boolean Xn = false;
    private Thread Xo;
    private volatile boolean Xp = false;
    private volatile String Xq = "";
    private volatile String Xr = "";
    private volatile long Xs = 0L;
    private volatile long Xt = 0L;
    private final d Xu = d.AZ();
    private static final int Xv = 4000;
    private static final int Xw = 6000;
    private static final String Xx = "RiseClient/SpotifyModule";
    private volatile String Xy = "";
    private volatile boolean Xz = false;
    private volatile BufferedImage XA = null;
    private volatile String XB = "";
    private volatile long XC = -1L;
    private volatile long XD = 0L;
    private volatile long XE = 0L;
    private volatile int XF = 0;
    private static final long XG = 1500L;
    private static final int XH = 3;
    private volatile long XI = -1L;
    private volatile long XJ = -1L;
    private volatile String XK = "";
    private float XL = 0.0f;
    private int XM = -1;
    private long XN = System.currentTimeMillis();
    private int XO = 0;
    private static final int XP = 600;
    private static final float XQ = 2.0f;
    private static final float XR = 6.0f;
    private static final int XS = 260;
    private static final float XT = 8.0f;
    private long XU = 0L;
    private float XV = 0.0f;
    @dm
    public final dk<fs> XW = fs2 -> {
        int n2;
        boolean bl2;
        if (((Boolean)this.Wj.wD()).booleanValue()) {
            afl.b("Song: " + this.Ws, new Object[0]);
        }
        int n3 = this.ii();
        int n4 = 0;
        if (this.WL && this.WO >= 0 && this.WO < this.WM.size()) {
            n4 = this.WM.get((int)this.WO).Yi ? 60 : 90;
        }
        int n5 = n3 + n4;
        this.B(n5);
        this.Wv = String.format("%d:%02d", n3 / 1000 / 60, n3 / 1000 % 60);
        this.Ww = String.format("%d:%02d", this.Wz / 1000 / 60, this.Wz / 1000 % 60);
        boolean bl3 = (Boolean)this.Wk.wD() != false && this.WK;
        boolean bl4 = bl2 = bl3 && this.WO < 0;
        float f2 = bl4 ? 18.0f : 18.0f;
        double d2 = this.Wh.aHP.getX() - 25.0;
        if (bl3 && this.WO >= 0 && d2 > 0.0) {
            int n6 = 17;
            float f3 = 1.0f;
            List<String> list = this.a(this.A(this.WO), d2, n6, f3);
            n2 = Math.max(0, list.size() - 1);
        } else {
            n2 = 0;
        }
        float f4 = bl4 ? 56.0f : 65.0f;
        int n7 = Math.max(2, ((Number)this.Wl.wD()).intValue());
        float f5 = this.hU();
        int n8 = 0;
        if (bl3) {
            int n9 = this.ic();
            int n10 = n7 + n2;
            n8 = Math.min(Math.max(1, n9), n10);
        }
        float f6 = bl3 ? 14.0f + f5 * (float)n8 + f2 : 0.0f;
        float f7 = f4 + f6;
        long l2 = System.currentTimeMillis();
        if (this.Xh) {
            this.Xe = this.Xf = f7;
            this.Xh = false;
        }
        if (Math.abs(f7 - this.Xe) > 0.5f) {
            this.Xe = f7;
            this.Xk = l2;
            this.Xl = this.a((int)(Math.abs(this.Xe - this.Xf) * 0.25f), 6, 22);
        }
        float f8 = (float)(l2 - this.Xb) / 1000.0f;
        this.Xb = l2;
        float f9 = 25.0f * (this.Xe - this.Xf) - 6.5f * this.Xg;
        this.Xg += f9 * f8;
        this.Xf += this.Xg * f8;
        this.Wh.n(new aka(180.0, this.Xf));
        double d3 = this.Wh.aqy.getX() + 65.0;
        Color color = this.rP().rU();
        this.b(gg.kU).c(() -> ait.c(this.Wh.aqy.getX(), this.Wh.aqy.getY(), this.Wh.aHP.getX(), this.Wh.aHP.getY(), 10.0, Color.BLACK));
        this.b(gg.kT).c(() -> {
            ait.a(this.Wh.aqy.getX(), this.Wh.aqy.getY(), this.Wh.aHP.getX(), this.Wh.aHP.getY(), 11.0, color, color, false);
            ait.a(d3, this.Wh.aqy.getY() + 45.0, (double)n3 * 100.0 / (double)Math.max(1, this.Wz), 6.0, 3.0, this.rP().rQ(), this.rP().rR(), true);
        });
        this.b(gg.kV).c(() -> {
            float f3;
            float f4 = 10.0f;
            if (this.Xk > 0L && (f3 = (float)(l2 - this.Xk) / 520.0f) < 1.0f) {
                f4 += (1.0f - this.k(f3)) * 2.0f;
            }
            double d3 = this.Wh.aqy.getX();
            double d4 = this.Wh.aqy.getY();
            double d5 = this.Wh.aHP.getX();
            double d6 = this.Wh.aHP.getY();
            double d7 = f4;
            this.rP();
            Color color = ady.sa();
            this.rP();
            ait.a(d3, d4, d5, d6, d7, color, ady.sa(), false);
            f3 = this.d(this.Ws, 20);
            float f5 = this.d(this.Wt, 16);
            this.WI = f3 > 105.0f;
            boolean bl4 = this.WJ = f5 > 105.0f;
            if (this.WI || this.WJ) {
                this.WG += 0.1f;
                float f6 = Math.max(f3, f5);
                if (this.WG > f6) {
                    this.WG = -100.0f;
                }
            } else {
                this.WG = 0.0f;
            }
            this.a(this.Ws, d3, this.Wh.aqy.getY() + 15.0, 20, this.WI);
            this.a(this.Wt, d3, this.Wh.aqy.getY() + 30.0, 16, this.WJ);
            this.ie();
            if (this.WB == -1 && this.Wu != null && !this.Wu.isEmpty()) {
                this.a(this.Wu, this.XD);
            }
            if (this.WB != -1) {
                ait.a(this.WB, (float)this.Wh.aqy.getX() + 12.5f, (float)(this.Wh.aqy.getY() + 10.0), 42.5f, 42.5f, Color.WHITE);
            }
            double d8 = this.Wh.aqy.getY() + 45.0;
            double d9 = this.Wh.aHP.getX() - 75.0;
            this.rP();
            ait.c(d3, d8, d9, 6.0, 3.0, ady.sa());
            ait.a(d3, this.Wh.aqy.getY() + 45.0, (double)n3 * (this.Wh.aHP.getX() - 75.0) / (double)Math.max(1, this.Wz), 6.0, 3.0, this.rP().j(new aka(d3, 0.0)), this.rP().j(new aka(d3 + this.Wh.aHP.getX() - 150.0, 0.0)), false);
            double d10 = d3 + this.Wh.aHP.getX() - 75.0;
            double d11 = this.d(this.Ww, 13);
            this.a(this.Wv + " / ", d10 - d11, this.Wh.aqy.getY() + 38.5, 13, new Color(255, 255, 255, 128).getRGB());
            this.a(this.Ww, d10, this.Wh.aqy.getY() + 38.5, 13, new Color(255, 255, 255, 48).getRGB());
            if (bl3) {
                float f7;
                double d12 = this.Wh.aqy.getX() + 12.5;
                double d13 = this.Wh.aqy.getX() + this.Wh.aHP.getX() - 12.5;
                double d14 = d13 - d12;
                double d15 = this.Wh.aqy.getY() + 10.0 + 42.5;
                double d16 = this.Wh.aqy.getY() + 45.0 + 6.0;
                double d17 = Math.max(d15, d16) + (double)(bl4 ? 8.0f : 12.0f);
                float f8 = 1.0f;
                if (this.Xk > 0L && (f7 = (float)(l2 - this.Xk) / 520.0f) < 1.0f) {
                    f8 = this.k(Math.max(0.0f, Math.min(1.0f, f7)));
                }
                int n4 = (int)(128.0f * f8);
                this.a("Lyrics", (float)d12, (double)((float)d17), 12, new Color(255, 255, 255, n4).getRGB());
                int n5 = this.ic();
                int n6 = Math.max(2, ((Number)this.Wl.wD()).intValue());
                int n7 = Math.max(0, n5 - n6);
                int n8 = Math.max(0, (n6 - 1) / 2);
                int n9 = this.WO >= 0 ? this.a(this.WO - n8, 0, n7) : 0;
                this.WZ = n9;
                float f9 = Math.min(1.0f, f8 * 20.0f);
                this.Xa += (this.WZ - this.Xa) * f9;
                int n10 = Math.max(0, Math.min(Math.max(0, n5 - 1), (int)Math.floor(this.Xa)));
                float f10 = this.Xa - (float)n10;
                float f11 = (float)(d17 + (double)(bl4 ? 12.0f : 12.0f));
                float f12 = this.hU();
                int n11 = n6 + n2;
                double d18 = d12;
                double d19 = f11 - 2.0f;
                double d20 = d14;
                double d21 = f12 * (float)n11 + 2.0f + 4.0f + (bl4 ? 3.0f : 5.0f);
                aiu.hQ();
                ait.g(d18, d19, d20, d21);
                float f13 = f11 - f10 * f12;
                int n12 = n6 + 2;
                float f14 = this.ij();
                for (int i2 = n10; i2 < n5 && n12 > 0; ++i2) {
                    boolean bl5 = this.WO >= 0 && i2 == this.WO;
                    boolean bl6 = this.WQ >= 0 && i2 == this.WQ;
                    int n13 = bl5 ? 14 : 13;
                    int n14 = bl5 ? 17 : 16;
                    float f15 = n13;
                    int n15 = 160;
                    float f16 = 0.0f;
                    if (bl5) {
                        f15 = 13.0f + (float)(n14 - 13) * f14;
                        n15 = (int)(180.0f + 75.0f * f14);
                        f16 = (1.0f - f14) * 2.0f;
                    } else if (bl6) {
                        f15 = 14.0f + -1.0f * f14;
                        n15 = (int)(255.0f - 95.0f * f14);
                        f16 = f14 * 2.0f;
                    }
                    n15 = this.a((int)((float)n15 * f8), 0, 255);
                    String string = this.A(i2);
                    int n16 = Math.max(11, Math.round(f15));
                    float f17 = f15 / (float)Math.max(1, n16);
                    List<String> list = this.a(string, d14, n16, f17);
                    if (bl5) {
                        float f18;
                        String string22;
                        float f19 = 0.0f;
                        for (String string22 : list) {
                            f19 += this.a(string22, n16, f17);
                        }
                        string22 = this.WL && i2 < this.WM.size() ? this.w(i2) : null;
                        float f20 = (Boolean)this.Wp.wD() != false && string22 != null ? this.a((sm)((Object)string22), i2, n3, n16, f17, f19) : 0.0f;
                        float f21 = f18 = this.a(i2, f20, f19, n3);
                        for (String string3 : list) {
                            float f22 = this.a(string3, n16, f17);
                            float f23 = this.b(string3, n16, f17);
                            int n17 = new Color(255, 255, 255, Math.max(100, (int)(140.0f * Math.max(f14, 0.6f)))).getRGB();
                            this.a(string3, (float)d12, f13 + f16, n16, f17, n17);
                            float f24 = Math.max(0.0f, Math.min(f21, f22));
                            if (f24 > 0.0f) {
                                var76_68 = new Color(255, 255, 255, 255).getRGB();
                                ait.g(d12, f13 + f16 - 2.0f, f24, f23 + 4.0f);
                                this.a(string3, (float)d12, f13 + f16, n16, f17, var76_68);
                                ait.g(d18, d19, d20, d21);
                            } else if (!((Boolean)this.Wp.wD()).booleanValue()) {
                                var76_68 = new Color(255, 255, 255, 255).getRGB();
                                this.a(string3, (float)d12, f13 + f16, n16, f17, var76_68);
                            }
                            f21 -= f22;
                            f13 += f23 + 2.0f;
                        }
                        --n12;
                    } else {
                        for (String string4 : list) {
                            float f25 = this.b(string4, n16, f17);
                            this.a(string4, (float)d12, f13 + f16, n16, f17, new Color(255, 255, 255, n15).getRGB());
                            f13 += f25 + 2.0f;
                        }
                        --n12;
                    }
                    if ((double)f13 > d19 + d21) break;
                }
                aiu.disable();
            }
            if (!((akg)this.Wg.wD()).getName().equals("Spotify") || this.Wr != null && !this.Wr.isEmpty() || !this.Xp) {
                // empty if block
            }
        });
    };
    @dm
    public final dk<fe> XX = fe2 -> ++this.hV;

    private File hT() {
        return new File(this.WE, WF);
    }

    private Map<String, String> aS() {
        File file = this.hT();
        Map<String, String> map = new HashMap<String, String>();
        if (file.exists()) {
            try (FileReader fileReader = new FileReader(file);){
                map = (Map)new Gson().fromJson((Reader)fileReader, Map.class);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        return map;
    }

    private float hU() {
        float f2 = this.e("Ay", 13) + 3.0f;
        float f3 = this.e("Ay", 17) + 0.0f;
        return Math.max(f2, f3);
    }

    private void hV() {
        long l2;
        File file = this.hT();
        long l3 = l2 = file.exists() ? file.lastModified() : 0L;
        if (l2 != this.Xs) {
            boolean bl2;
            this.Xs = l2;
            String string = this.Xq;
            String string2 = this.Xr;
            Map<String, String> map = this.aS();
            this.Xq = String.valueOf(map.getOrDefault("client_id", ""));
            this.Xr = String.valueOf(map.getOrDefault("client_secret", ""));
            boolean bl3 = bl2 = !Objects.equals(string, this.Xq) || !Objects.equals(string2, this.Xr);
            if (bl2) {
                afl.b("Spotify credentials updated. Re-auth will be requested.", new Object[0]);
                this.Wr = "";
            }
        }
    }

    private boolean hW() {
        return this.Xq != null && !this.Xq.isEmpty() && this.Xr != null && !this.Xr.isEmpty();
    }

    private void hX() {
        boolean bl2;
        if (!"Spotify".equals(((akg)this.Wg.wD()).getName())) {
            return;
        }
        if (this.Xp) {
            return;
        }
        boolean bl3 = bl2 = this.Wr == null || this.Wr.isEmpty() || this.Xt > 0L;
        if (bl2 && this.hW()) {
            this.ih();
            this.Xt = 0L;
        }
    }

    private float hY() {
        return this.e("Ay", 13) + 2.0f;
    }

    private boolean C(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        for (int i2 = 0; i2 < string.length(); i2 += Character.charCount(string.codePointAt(i2))) {
            Character.UnicodeScript unicodeScript;
            int n2 = string.codePointAt(i2);
            if (n2 <= 127 || (unicodeScript = Character.UnicodeScript.of(n2)) == Character.UnicodeScript.HAN || unicodeScript == Character.UnicodeScript.CYRILLIC || unicodeScript == Character.UnicodeScript.HIRAGANA || unicodeScript == Character.UnicodeScript.KATAKANA || unicodeScript == Character.UnicodeScript.HANGUL || unicodeScript == Character.UnicodeScript.LATIN || unicodeScript == Character.UnicodeScript.COMMON || unicodeScript == Character.UnicodeScript.INHERITED) continue;
            return true;
        }
        return false;
    }

    private float v(int n2) {
        return (float)n2 / 9.0f;
    }

    private float d(String string, int n2) {
        if (this.C(string)) {
            agg agg2 = this.Xu.fontRendererObj;
            return (float)agg2.bQ(string) * this.v(n2);
        }
        return gb.ks.a(n2, gd.kH).bQ(string);
    }

    private float e(String string, int n2) {
        if (this.C(string)) {
            agg agg2 = this.Xu.fontRendererObj;
            return (float)agg.aIF * this.v(n2);
        }
        return gb.ks.a(n2, gd.kH).tF();
    }

    private void a(String string, float f2, double d2, int n2, int n3) {
        if (this.C(string)) {
            agg agg2 = this.Xu.fontRendererObj;
            GlStateManager.JV();
            GlStateManager.j(f2, (float)d2, 0.0f);
            float f3 = this.v(n2 - 2);
            GlStateManager.i(f3, f3, 1.0f);
            agg2.b(string, 0.0, 0.0, n3, true);
            GlStateManager.JW();
        } else {
            gb.ks.a(n2, gd.kH).a(string, f2, (float)d2, n3);
        }
    }

    private void a(String string, double d2, double d3, int n2, int n3) {
        float f2 = this.d(string, n2);
        this.a(string, (float)(d2 - (double)f2), d3, n2, n3);
    }

    private void a(String string, double d2, double d3, int n2, boolean bl2) {
        float f2 = this.e(string, n2);
        if (bl2) {
            aiu.hQ();
            ait.g(this.Wh.aqy.getX() + 65.0, d3 - 2.0, 105.0, f2 + 2.0f);
            this.a(string, (float)(d2 - (double)this.WG), d3, n2, new Color(255, 255, 255, n2 == 20 ? 255 : 128).getRGB());
            aiu.disable();
        } else {
            this.a(string, (float)d2, d3, n2, new Color(255, 255, 255, n2 == 20 ? 255 : 128).getRGB());
        }
    }

    private float f(String string, int n2) {
        return this.d(string, n2);
    }

    private float g(String string, int n2) {
        return this.e(string, n2);
    }

    private float a(String string, int n2, float f2) {
        return this.f(string, n2) * f2;
    }

    private float b(String string, int n2, float f2) {
        return this.g(string, n2) * f2;
    }

    private List<String> a(String string, double d2, int n2, float f2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray = string.split(" ");
        String string2 = "";
        for (String string3 : stringArray) {
            String string4;
            String string5 = string4 = string2.isEmpty() ? string3 : string2 + " " + string3;
            if ((double)this.a(string4, n2, f2) <= d2) {
                string2 = string4;
                continue;
            }
            if (!string2.isEmpty()) {
                arrayList.add(string2);
            }
            string2 = string3;
        }
        if (!string2.isEmpty()) {
            arrayList.add(string2);
        }
        return arrayList;
    }

    private void a(String string, float f2, float f3, int n2, float f4, int n3) {
        if (this.C(string)) {
            agg agg2 = this.Xu.fontRendererObj;
            GlStateManager.JV();
            GlStateManager.j(f2, f3, 0.0f);
            float f5 = this.v(n2) * f4 / 1.5f;
            GlStateManager.i(f5, f5, 1.0f);
            agg2.b(string, 0.0, 0.0, n3, true);
            GlStateManager.JW();
        } else {
            GlStateManager.JV();
            GlStateManager.j(f2, f3, 0.0f);
            GlStateManager.i(f4, f4, 1.0f);
            gb.ks.a(n2, gd.kH).a(string, 0.0, 0.0, n3);
            GlStateManager.JW();
        }
    }

    private float a(int n2, int n3) {
        int n4;
        if (!this.WL || n2 < 0 || n2 >= this.WM.size()) {
            return -1.0f;
        }
        int n5 = this.WM.get((int)n2).Yf;
        int n6 = n4 = n2 + 1 < this.WM.size() ? this.WM.get((int)(n2 + 1)).Yf : this.Wz;
        if (n4 <= n5) {
            return 1.0f;
        }
        float f2 = (float)(n3 - n5) / (float)(n4 - n5);
        if (f2 < 0.0f) {
            return 0.0f;
        }
        if (f2 > 1.0f) {
            return 1.0f;
        }
        return f2;
    }

    private sm w(int n2) {
        if (!this.WL || n2 < 0 || n2 >= this.WM.size()) {
            return null;
        }
        sm sm2 = this.WM.get(n2);
        if (sm2.Yh == null || sm2.Yh.isEmpty()) {
            int n3 = n2 + 1 < this.WM.size() ? this.WM.get((int)(n2 + 1)).Yf : this.Wz;
            sm2.Yh = this.a(sm2.Yg, sm2.Yf, n3);
        }
        return sm2;
    }

    private float a(sm sm2, int n2, int n3, int n4, float f2, float f3) {
        if (sm2 == null) {
            return 0.0f;
        }
        if (sm2.Yh == null || sm2.Yh.isEmpty()) {
            return f3 * this.a(n2, n3);
        }
        float f4 = 0.0f;
        for (int i2 = 0; i2 < sm2.Yh.size(); ++i2) {
            so so2 = sm2.Yh.get(i2);
            float f5 = this.a(so2.Yl, n4, f2);
            if (n3 >= so2.Yn) {
                f4 += f5;
                continue;
            }
            if (n3 <= so2.Ym) break;
            int n5 = Math.max(1, so2.Yn - so2.Ym);
            float f6 = (float)(n3 - so2.Ym) / (float)n5;
            f4 += f5 * Math.max(0.0f, Math.min(1.0f, f6));
            break;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > f3) {
            f4 = f3;
        }
        return f4;
    }

    private float a(int n2, float f2, float f3, int n3) {
        long l2 = System.currentTimeMillis();
        if (n2 != this.XM) {
            this.XM = n2;
            this.XL = 0.0f;
            this.XN = l2;
            this.XO = n3;
            this.XU = l2 + 260L;
            this.XV = f2;
            return this.a(f2, 0.0f, f3);
        }
        if (n3 + 600 < this.XO) {
            this.XL = this.a(f2, 0.0f, f3);
            this.XN = l2;
            this.XO = n3;
            this.XU = l2 + 260L;
            this.XV = f2;
            return this.XL;
        }
        float f4 = Math.max(0.0f, (float)(l2 - this.XN) / 1000.0f);
        this.XN = l2;
        if (f2 - this.XV > 6.0f) {
            this.XU = l2 + 260L;
        }
        this.XV = f2;
        float f5 = this.a(n2, f3) * ((Number)this.Wq.wD()).floatValue();
        if (l2 < this.XU) {
            f5 *= 8.0f;
        }
        if (f2 > this.XL) {
            float f6 = f5 * f4;
            this.XL = f2 - this.XL >= f3 * 0.25f ? f2 : (f2 - this.XL <= 2.0f ? f2 : Math.min(f2, this.XL + Math.max(0.75f, f6)));
        }
        this.XL = this.a(this.XL, 0.0f, f3);
        this.XO = n3;
        return this.XL;
    }

    private float a(int n2, float f2) {
        int n3 = this.x(n2);
        int n4 = this.y(n2);
        int n5 = Math.max(60, n4 - n3);
        return f2 * 1000.0f / (float)n5;
    }

    private int x(int n2) {
        if (this.WL && n2 >= 0 && n2 < this.WM.size()) {
            return this.WM.get((int)n2).Yf;
        }
        int n3 = Math.max(1, this.WN.size());
        double d2 = (double)n2 / (double)n3;
        return (int)Math.round((double)this.Wz * d2);
    }

    private int y(int n2) {
        if (this.WL) {
            if (n2 + 1 < this.WM.size()) {
                return this.WM.get((int)(n2 + 1)).Yf;
            }
            return this.Wz;
        }
        int n3 = Math.max(1, this.WN.size());
        double d2 = (double)(n2 + 1) / (double)n3;
        return (int)Math.round((double)this.Wz * d2);
    }

    private float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f4, f2));
    }

    public void hZ() {
        try {
            long l2 = System.nanoTime();
            URL uRL = new URL("http://localhost:10767/api/v1/playback/now-playing");
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("User-Agent", Xx);
            httpURLConnection.setConnectTimeout(4000);
            httpURLConnection.setReadTimeout(6000);
            try (Scanner scanner = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A");){
                JSONObject jSONObject = new JSONObject(scanner.hasNext() ? scanner.next() : "");
                if (jSONObject.getString("status").equals("ok")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("info");
                    this.Ws = jSONObject2.getString("name");
                    this.Wt = jSONObject2.getString("artistName");
                    this.Wz = jSONObject2.getInt("durationInMillis");
                    this.Wu = jSONObject2.getJSONObject("artwork").getString("url").replace("{w}x{h}", "600x600");
                    this.WA = (int)((double)this.Wz - jSONObject2.getDouble("remainingTime") * 1000.0);
                    long l3 = (System.nanoTime() - l2) / 1000000L;
                    long l4 = Math.min(150L, Math.max(0L, l3 / 2L));
                    this.WP = System.currentTimeMillis() - l4;
                }
            }
        }
        catch (SocketException socketException) {
            if (((Boolean)this.Wj.wD()).booleanValue()) {
                afl.c("Cider connection issue: " + socketException.getMessage(), new Object[0]);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void ia() {
        block20: {
            try {
                long l2 = System.nanoTime();
                URL uRL = new URL("https://api.spotify.com/v1/me/player?market=US");
                HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.addRequestProperty("Authorization", "Bearer " + this.Wr);
                httpURLConnection.setRequestProperty("User-Agent", Xx);
                httpURLConnection.setConnectTimeout(4000);
                httpURLConnection.setReadTimeout(6000);
                int n2 = httpURLConnection.getResponseCode();
                long l3 = System.currentTimeMillis();
                long l4 = (System.nanoTime() - l2) / 1000000L;
                if (n2 == 200) {
                    this.XF = 0;
                    this.XE = l3;
                    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));){
                        JSONObject jSONObject = new JSONObject(bufferedReader.lines().reduce("", String::concat));
                        if (jSONObject.has("item")) {
                            boolean bl2;
                            JSONObject jSONObject2 = jSONObject.getJSONObject("item");
                            this.Ws = jSONObject2.getString("name");
                            this.Wt = jSONObject2.getJSONArray("artists").toList().stream().map(object -> ((Map)object).get("name").toString()).reduce((string, string2) -> string + ", " + string2).orElse("");
                            this.Wu = jSONObject2.getJSONObject("album").getJSONArray("images").getJSONObject(0).getString("url");
                            this.Wz = jSONObject2.getInt("duration_ms");
                            this.WA = jSONObject.getInt("progress_ms");
                            long l5 = jSONObject.optLong("timestamp", l3);
                            long l6 = Math.max(0L, l3 - l5);
                            long l7 = Math.max(0L, l4 / 2L);
                            long l8 = Math.min(300L, Math.max(l7, l6 / 2L));
                            this.WP = l3 - l8;
                            String string3 = jSONObject2.optString("id", "");
                            boolean bl3 = !string3.equals(this.Wy);
                            boolean bl4 = !this.WK || this.ic() == 0;
                            boolean bl5 = bl2 = this.WB == -1 && this.Wu != null && !this.Wu.isEmpty();
                            if (bl3) {
                                this.Wy = string3;
                                long l9 = ++this.XD;
                                this.d(l9);
                                this.XI = l9;
                                this.a(this.Ws, this.Wt, this.Wy, l9);
                                if (this.Wu != null && !this.Wu.isEmpty()) {
                                    this.XJ = l9;
                                    this.XK = this.Wu;
                                    this.a(this.Wu, l9);
                                }
                            } else {
                                long l10 = this.XD;
                                if (bl4 && this.XI != l10) {
                                    this.XI = l10;
                                    this.a(this.Ws, this.Wt, this.Wy, l10);
                                }
                                if (bl2 && (this.XJ != l10 || !Objects.equals(this.XK, this.Wu))) {
                                    this.XJ = l10;
                                    this.XK = this.Wu;
                                    this.a(this.Wu, l10);
                                }
                            }
                        }
                        break block20;
                    }
                }
                if (n2 == 204) {
                    boolean bl6;
                    ++this.XF;
                    long l11 = this.XE == 0L ? Long.MAX_VALUE : l3 - this.XE;
                    boolean bl7 = bl6 = l11 >= 1500L && this.XF >= 3;
                    if (bl6) {
                        this.Ws = "No data";
                        this.Wt = "No data";
                        this.Wu = "";
                        this.Wz = 999;
                        this.WA = 999;
                        this.WK = false;
                        this.WM = new ArrayList<sm>();
                        this.WN = new ArrayList<String>();
                        this.Wy = "";
                        long l12 = ++this.XD;
                        this.d(l12);
                    }
                } else if (n2 == 401) {
                    this.Xt = System.currentTimeMillis();
                    this.Wr = "";
                }
            }
            catch (SocketException socketException) {
                if (((Boolean)this.Wj.wD()).booleanValue()) {
                    afl.c("Spotify connection issue: " + socketException.getMessage(), new Object[0]);
                }
            }
            catch (Exception exception) {
                if (!((Boolean)this.Wj.wD()).booleanValue()) break block20;
                exception.printStackTrace();
            }
        }
    }

    private void a(String string, String string2, String string3, long l2) {
        this.WK = false;
        this.WM = new ArrayList<sm>();
        this.WN = new ArrayList<String>();
        this.WL = false;
        this.WO = -1;
        this.WQ = -1;
        new Thread(() -> this.b(string, string2, string3, l2), "LyricsFetch-" + l2).start();
    }

    private void b(String string, String string2, String string3, long l2) {
        block12: {
            try {
                Object object;
                boolean bl2;
                String string4;
                if (l2 != this.XD) {
                    return;
                }
                String string5 = string4 = string2.contains(",") ? string2.split(",")[0].trim() : string2.trim();
                if (!"LRCLIB".equals(((akg)this.Wm.wD()).getName()) && (bl2 = this.a(string, string2, string4, string3, l2))) {
                    return;
                }
                Object object2 = this.a(string, string4, this.Wz);
                if (object2 == null && (object = this.b(string, string4, this.Wz)) != null) {
                    object2 = !object.optString("syncedLyrics", "").isEmpty() || !object.optString("plainLyrics", "").isEmpty() ? object : this.a(object.optString("trackName", string), object.optString("artistName", string4), this.Wz);
                }
                if (object2 != null) {
                    List<sm> list;
                    object = object2.optString("syncedLyrics", "");
                    String string6 = object2.optString("plainLyrics", "");
                    if (!((String)object).isEmpty() && !(list = this.N((String)object)).isEmpty()) {
                        if (l2 != this.XD) {
                            return;
                        }
                        this.WM = list;
                        this.WL = true;
                        this.WK = true;
                        this.WO = this.ib();
                        return;
                    }
                    if (!string6.isEmpty()) {
                        if (l2 != this.XD) {
                            return;
                        }
                        this.WN = Arrays.asList(string6.split("\\r?\\n"));
                        this.WL = false;
                        this.WK = !this.WN.isEmpty();
                        this.WO = this.ib();
                    }
                } else if (((Boolean)this.Wj.wD()).booleanValue()) {
                    afl.c("LRCLIB: no lyrics for " + string + " - " + string4, new Object[0]);
                }
            }
            catch (Throwable throwable) {
                if (!((Boolean)this.Wj.wD()).booleanValue()) break block12;
                afl.c("Lyrics fetch error: " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage(), new Object[0]);
            }
        }
    }

    private boolean a(String string, String string2, String string3, String string4, long l2) {
        try {
            String string5;
            String string6 = ((akg)this.Wm.wD()).getName();
            String string7 = (String)this.Wn.wD();
            if (string7 == null || string7.trim().isEmpty()) {
                return false;
            }
            String string8 = this.a(string7, string, string3, string2, string4);
            String string9 = this.h(string8, string5 = (String)this.Wo.wD());
            if (string9 == null) {
                return false;
            }
            if (l2 != this.XD) {
                return true;
            }
            String string10 = string9.trim();
            if (string10.startsWith("{")) {
                List<sm> list;
                Object object;
                JSONObject jSONObject = new JSONObject(string10);
                String string11 = jSONObject.optString("syncedLyrics", "");
                String string12 = jSONObject.optString("plainLyrics", "");
                if (!string11.isEmpty() && !(object = this.g(string6, string11)).isEmpty()) {
                    if (l2 != this.XD) {
                        return true;
                    }
                    this.WM = object;
                    this.WL = true;
                    this.WK = true;
                    this.WO = this.ib();
                    return true;
                }
                if (!string12.isEmpty()) {
                    if (l2 != this.XD) {
                        return true;
                    }
                    this.WN = Arrays.asList(string12.split("\\r?\\n"));
                    this.WL = false;
                    this.WK = !this.WN.isEmpty();
                    this.WO = this.ib();
                    return this.WK;
                }
                object = jSONObject.optString("lyrics", "");
                if (!((String)object).isEmpty() && !(list = this.g(string6, (String)object)).isEmpty()) {
                    if (l2 != this.XD) {
                        return true;
                    }
                    this.WM = list;
                    this.WL = true;
                    this.WK = true;
                    this.WO = this.ib();
                    return true;
                }
                return false;
            }
            List<sm> list = this.g(string6, string10);
            if (!list.isEmpty()) {
                if (l2 != this.XD) {
                    return true;
                }
                this.WM = list;
                this.WL = true;
                this.WK = true;
                this.WO = this.ib();
                return true;
            }
            return false;
        }
        catch (Throwable throwable) {
            if (((Boolean)this.Wj.wD()).booleanValue()) {
                afl.c("Lyrics endpoint provider error: " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage(), new Object[0]);
            }
            return false;
        }
    }

    private List<sm> g(String string, String string2) {
        if (string2 == null) {
            return new ArrayList<sm>();
        }
        String string3 = string2.trim();
        if (string3.isEmpty()) {
            return new ArrayList<sm>();
        }
        if ("Custom".equals(string)) {
            return this.D(string3);
        }
        if ("TTML (Apple-style)".equals(string)) {
            if (!this.E(string3)) {
                return new ArrayList<sm>();
            }
            return this.F(string3);
        }
        if ("Enhanced LRC (word-timed)".equals(string)) {
            return this.N(string3);
        }
        return this.D(string3);
    }

    private String a(String string, String string2, String string3, String string4, String string5) {
        String string6 = string2 == null ? "" : string2;
        String string7 = string3 == null ? "" : string3;
        String string8 = string4 == null ? "" : string4;
        String string9 = string5 == null ? "" : string5;
        return string.replace("{title}", URLEncoder.encode(string6, "UTF-8")).replace("{artist}", URLEncoder.encode(string7, "UTF-8")).replace("{artists}", URLEncoder.encode(string8, "UTF-8")).replace("{spotifyId}", URLEncoder.encode(string9, "UTF-8"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private String h(String string, String string2) {
        String string3;
        InputStream inputStream;
        Object object;
        HttpURLConnection httpURLConnection;
        block31: {
            String string4;
            CharSequence charSequence;
            block29: {
                block30: {
                    int n2;
                    int n3;
                    String string5;
                    httpURLConnection = null;
                    httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setRequestProperty("User-Agent", Xx);
                    httpURLConnection.setConnectTimeout(4000);
                    httpURLConnection.setReadTimeout(6000);
                    if (string2 != null && !(string5 = string2.trim()).isEmpty() && (n3 = string5.indexOf(58)) > 0 && n3 + 1 < string5.length()) {
                        object = string5.substring(0, n3).trim();
                        charSequence = string5.substring(n3 + 1).trim();
                        if (!((String)object).isEmpty() && !((String)charSequence).isEmpty()) {
                            httpURLConnection.setRequestProperty((String)object, (String)charSequence);
                        }
                    }
                    InputStream inputStream2 = inputStream = (n2 = httpURLConnection.getResponseCode()) >= 200 && n2 < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    if (inputStream != null) break block29;
                    object = null;
                    if (httpURLConnection == null) break block30;
                    try {
                        httpURLConnection.disconnect();
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                return object;
            }
            object = new BufferedReader(new InputStreamReader(inputStream));
            charSequence = new StringBuilder();
            while ((string4 = ((BufferedReader)object).readLine()) != null) {
                ((StringBuilder)charSequence).append(string4).append('\n');
            }
            string3 = ((StringBuilder)charSequence).toString();
            ((BufferedReader)object).close();
            if (httpURLConnection == null) break block31;
            try {
                httpURLConnection.disconnect();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return string3;
        {
            catch (Throwable throwable) {
                try {
                    try {
                        try {
                            ((BufferedReader)object).close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                        throw throwable;
                    }
                    catch (SocketException socketException) {
                        if (((Boolean)this.Wj.wD()).booleanValue()) {
                            afl.c("Custom lyrics connection issue: " + socketException.getMessage(), new Object[0]);
                        }
                        inputStream = null;
                        return inputStream;
                    }
                    catch (Throwable throwable3) {
                        block32: {
                            if (((Boolean)this.Wj.wD()).booleanValue()) {
                                afl.c("Custom lyrics HTTP error: " + throwable3.getClass().getSimpleName() + ": " + throwable3.getMessage(), new Object[0]);
                            }
                            inputStream = null;
                            if (httpURLConnection == null) break block32;
                            try {
                                httpURLConnection.disconnect();
                            }
                            catch (Throwable throwable4) {
                                // empty catch block
                            }
                        }
                        return inputStream;
                    }
                }
                finally {
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        }
                        catch (Throwable throwable5) {}
                    }
                }
            }
        }
    }

    private List<sm> D(String string) {
        if (string == null) {
            return new ArrayList<sm>();
        }
        String string2 = string.trim();
        if (string2.isEmpty()) {
            return new ArrayList<sm>();
        }
        if (this.E(string2)) {
            return this.F(string2);
        }
        return this.N(string2);
    }

    private boolean E(String string) {
        String string2 = string.trim();
        return string2.startsWith("<") && (string2.contains("<tt") || string2.contains("http://www.w3.org/ns/ttml"));
    }

    private List<sm> F(String string) {
        Object object;
        ArrayList<sm> arrayList = new ArrayList<sm>();
        if (string == null) {
            return arrayList;
        }
        Pattern pattern = Pattern.compile("(?is)<p\\b([^>]*)>(.*?)</p>");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            Object object2;
            String string2;
            String string3 = matcher.group(1);
            object = matcher.group(2);
            Integer n2 = this.I(this.i(string3, "begin"));
            Integer n3 = this.I(this.i(string3, "end"));
            if (n2 == null) continue;
            ArrayList<so> arrayList2 = new ArrayList<so>();
            boolean bl2 = false;
            Pattern pattern2 = Pattern.compile("(?is)<span\\b([^>]*)>(.*?)</span>");
            Matcher matcher2 = pattern2.matcher((CharSequence)object);
            StringBuilder stringBuilder = new StringBuilder();
            while (matcher2.find()) {
                char c2;
                string2 = matcher2.group(1);
                String string4 = matcher2.group(2);
                object2 = this.G(this.H(string4));
                Integer n4 = this.I(this.i(string2, "begin"));
                Integer n5 = this.I(this.i(string2, "end"));
                if (object2 == null) {
                    object2 = "";
                }
                if (!(stringBuilder.length() <= 0 || Character.isWhitespace(c2 = stringBuilder.charAt(stringBuilder.length() - 1)) || ((String)object2).isEmpty() || Character.isWhitespace(((String)object2).charAt(0)))) {
                    stringBuilder.append(' ');
                }
                stringBuilder.append((String)object2);
                if (n4 == null) continue;
                bl2 = true;
                so so2 = new so((String)(((String)object2).isEmpty() ? "" : object2), n4);
                so2.Yn = n5 != null ? n5 : n4;
                arrayList2.add(so2);
            }
            string2 = stringBuilder.length() > 0 ? stringBuilder.toString().trim() : this.G(this.H((String)object)).trim();
            if (bl2 && !arrayList2.isEmpty()) {
                for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
                    object2 = (so)arrayList2.get(i2);
                    if (i2 + 1 < arrayList2.size()) {
                        ((so)object2).Yn = Math.max(((so)object2).Ym, Math.min(((so)object2).Yn, ((so)arrayList2.get((int)(i2 + 1))).Ym));
                        if (((so)object2).Yn != ((so)object2).Ym) continue;
                        ((so)object2).Yn = ((so)arrayList2.get((int)(i2 + 1))).Ym;
                        continue;
                    }
                    if (n3 == null) continue;
                    ((so)object2).Yn = Math.max(((so)object2).Ym, n3);
                }
            }
            arrayList.add(new sm(n2, string2, arrayList2, bl2));
        }
        arrayList.sort(Comparator.comparingInt(sm2 -> sm2.Yf));
        for (int i3 = 0; i3 < arrayList.size(); ++i3) {
            int n6;
            object = (sm)arrayList.get(i3);
            int n7 = n6 = i3 + 1 < arrayList.size() ? ((sm)arrayList.get((int)(i3 + 1))).Yf : this.Wz;
            if (((sm)object).Yh != null && !((sm)object).Yh.isEmpty()) continue;
            ((sm)object).Yh = this.a(((sm)object).Yg, ((sm)object).Yf, n6);
        }
        return arrayList;
    }

    private String i(String string, String string2) {
        if (string == null) {
            return null;
        }
        Pattern pattern = Pattern.compile("(?i)\\b" + Pattern.quote(string2) + "\\s*=\\s*\"([^\"]+)\"");
        Matcher matcher = pattern.matcher(string);
        return matcher.find() ? matcher.group(1) : null;
    }

    private String G(String string) {
        if (string == null) {
            return "";
        }
        return string.replaceAll("(?is)<[^>]+>", "");
    }

    private String H(String string) {
        if (string == null) {
            return "";
        }
        return string.replace("&amp;", "&").replace("&lt;", "<").replace("&gt;", ">").replace("&quot;", "\"").replace("&apos;", "'");
    }

    private Integer I(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string.trim();
        if (string2.isEmpty()) {
            return null;
        }
        try {
            double d2;
            if (string2.endsWith("s")) {
                double d3 = Double.parseDouble(string2.substring(0, string2.length() - 1));
                return (int)Math.round(d3 * 1000.0);
            }
            String[] stringArray = string2.split(":");
            if (stringArray.length == 3) {
                int n2 = Integer.parseInt(stringArray[0]);
                int n3 = Integer.parseInt(stringArray[1]);
                d2 = Double.parseDouble(stringArray[2]) + (double)n3 * 60.0 + (double)n2 * 3600.0;
            } else if (stringArray.length == 2) {
                int n4 = Integer.parseInt(stringArray[0]);
                d2 = Double.parseDouble(stringArray[1]) + (double)n4 * 60.0;
            } else {
                d2 = Double.parseDouble(stringArray[0]);
            }
            return (int)Math.round(d2 * 1000.0);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private JSONObject a(String string, String string2, int n2) {
        for (String string3 : this.J(string)) {
            try {
                JSONObject jSONObject;
                String string4 = "https://lrclib.net/api/get?track_name=" + URLEncoder.encode(string3, "UTF-8") + "&artist_name=" + URLEncoder.encode(string2, "UTF-8");
                if (n2 > 0) {
                    string4 = string4 + "&duration=" + Math.max(1, Math.round((float)n2 / 1000.0f));
                }
                if (!this.a(jSONObject = this.L(string4))) continue;
                return jSONObject;
            }
            catch (Exception exception) {
                if (!((Boolean)this.Wj.wD()).booleanValue()) continue;
                afl.c("LRCLIB exact lookup failed: " + exception.getClass().getSimpleName(), new Object[0]);
            }
        }
        return null;
    }

    private JSONObject b(String string, String string2, int n2) {
        JSONObject jSONObject = null;
        double d2 = Double.MAX_VALUE;
        for (String string3 : this.j(string, string2)) {
            try {
                JSONArray jSONArray = this.M(string3);
                if (jSONArray == null) continue;
                for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                    double d3;
                    JSONObject jSONObject2 = jSONArray.optJSONObject(i2);
                    if (!this.a(jSONObject2) || !((d3 = this.a(jSONObject2, string, string2, n2)) < d2)) continue;
                    d2 = d3;
                    jSONObject = jSONObject2;
                }
            }
            catch (Exception exception) {
                if (!((Boolean)this.Wj.wD()).booleanValue()) continue;
                afl.c("LRCLIB search failed: " + exception.getClass().getSimpleName(), new Object[0]);
            }
        }
        if (((Boolean)this.Wj.wD()).booleanValue() && jSONObject != null) {
            afl.c("LRCLIB matched: " + jSONObject.optString("trackName", "?") + " - " + jSONObject.optString("artistName", "?") + " score=" + (double)Math.round(d2 * 100.0) / 100.0, new Object[0]);
        }
        return jSONObject;
    }

    private List<String> j(String string, String string2) {
        ArrayList<String> arrayList;
        block3: {
            arrayList = new ArrayList<String>();
            try {
                for (String string3 : this.J(string)) {
                    arrayList.add("https://lrclib.net/api/search?track_name=" + URLEncoder.encode(string3, "UTF-8") + "&artist_name=" + URLEncoder.encode(string2, "UTF-8"));
                }
                arrayList.add("https://lrclib.net/api/search?q=" + URLEncoder.encode((string == null ? "" : string) + " " + (string2 == null ? "" : string2), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                if (!((Boolean)this.Wj.wD()).booleanValue()) break block3;
                afl.c("LRCLIB URL encoding failed: " + unsupportedEncodingException.getMessage(), new Object[0]);
            }
        }
        return arrayList;
    }

    private List<String> J(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string2 = string == null ? "" : string.trim();
        this.a(arrayList, string2);
        String string3 = string2.replaceAll("(?i)\\s*-\\s*(remaster(?:ed)?|\\d{4}\\s*remaster(?:ed)?|radio edit|single version|album version|explicit|clean|mono|stereo|live|sped up|slowed|nightcore).*$", "").replaceAll("(?i)\\s*\\((?:[^)]*(remaster|remastered|radio edit|single version|album version|explicit|clean|mono|stereo|live|sped up|slowed|nightcore|feat\\.?|ft\\.)[^)]*)\\)", "").replaceAll("(?i)\\s*\\[(?:[^]]*(remaster|remastered|radio edit|single version|album version|explicit|clean|mono|stereo|live|sped up|slowed|nightcore|feat\\.?|ft\\.)[^]]*)]", "").trim();
        this.a(arrayList, string3);
        return arrayList;
    }

    private void a(List<String> list, String string) {
        if (string == null) {
            return;
        }
        String string2 = string.trim();
        if (string2.isEmpty()) {
            return;
        }
        for (String string3 : list) {
            if (!string3.equalsIgnoreCase(string2)) continue;
            return;
        }
        list.add(string2);
    }

    private boolean a(JSONObject jSONObject) {
        return jSONObject != null && (!jSONObject.optString("syncedLyrics", "").isEmpty() || !jSONObject.optString("plainLyrics", "").isEmpty());
    }

    private double a(JSONObject jSONObject, String string, String string2, int n2) {
        double d2 = 0.0;
        String string3 = this.K(string);
        String string4 = this.K(string2);
        String string5 = this.K(jSONObject.optString("trackName", jSONObject.optString("name", "")));
        String string6 = this.K(jSONObject.optString("artistName", ""));
        if (!string5.equals(string3)) {
            d2 += string5.contains(string3) || string3.contains(string5) ? 6.0 : 20.0;
        }
        if (!string6.equals(string4)) {
            d2 += string6.contains(string4) || string4.contains(string6) ? 4.0 : 12.0;
        }
        if (n2 > 0 && jSONObject.has("duration")) {
            double d3 = (double)n2 / 1000.0;
            d2 += Math.min(30.0, Math.abs(jSONObject.optDouble("duration", d3) - d3) * 0.35);
        }
        if (!jSONObject.optString("syncedLyrics", "").isEmpty()) {
            d2 -= 2.0;
        }
        return d2;
    }

    private String K(String string) {
        if (string == null) {
            return "";
        }
        return string.toLowerCase(Locale.ROOT).replaceAll("&", "and").replaceAll("(?i)\\b(feat|ft)\\.?\\b.*", "").replaceAll("[\\p{Punct}]", " ").replaceAll("\\s+", " ").trim();
    }

    private JSONObject L(String string3) {
        HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(string3).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-Agent", Xx);
        httpURLConnection.setConnectTimeout(4000);
        httpURLConnection.setReadTimeout(6000);
        int n2 = httpURLConnection.getResponseCode();
        if (n2 != 200) {
            if (((Boolean)this.Wj.wD()).booleanValue()) {
                afl.c("LRCLIB object HTTP " + n2, new Object[0]);
            }
            return null;
        }
        try {
            JSONObject jSONObject;
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));){
                String string4 = bufferedReader.lines().reduce("", (string, string2) -> string + string2);
                jSONObject = new JSONObject(string4);
            }
            return jSONObject;
        }
        finally {
            httpURLConnection.disconnect();
        }
    }

    private JSONArray M(String string3) {
        HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(string3).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-Agent", Xx);
        httpURLConnection.setConnectTimeout(4000);
        httpURLConnection.setReadTimeout(6000);
        int n2 = httpURLConnection.getResponseCode();
        if (n2 != 200) {
            if (((Boolean)this.Wj.wD()).booleanValue()) {
                afl.c("LRCLIB search HTTP " + n2, new Object[0]);
            }
            return null;
        }
        try {
            JSONArray jSONArray;
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));){
                String string4 = bufferedReader.lines().reduce("", (string, string2) -> string + string2);
                jSONArray = new JSONArray(string4);
            }
            return jSONArray;
        }
        finally {
            httpURLConnection.disconnect();
        }
    }

    /*
     * Unable to fully structure code
     */
    private List<sm> N(String var1_1) {
        var2_2 = new ArrayList<sm>();
        var3_3 = new BufferedReader(new StringReader(var1_1));
        var5_4 = Pattern.compile("\\[(\\d{1,2}):(\\d{1,2})(?:\\.(\\d{1,3}))?]");
lbl4:
        // 3 sources

        try {
            while ((var4_5 = var3_3.readLine()) != null) {
                block10: {
                    var6_6 = var5_4.matcher(var4_5);
                    var7_9 = var4_5.replaceAll("\\[[^\\]]+]", "");
                    var8_10 = new ArrayList<Integer>();
                    while (var6_6.find()) {
                        var9_12 = this.i(var6_6.group(1), 0);
                        var10_13 = this.i(var6_6.group(2), 0);
                        var11_15 = 0;
                        if (var6_6.group(3) != null) {
                            var12_18 = var6_6.group(3);
                            var11_15 = var12_18.length() == 2 ? this.i(var12_18, 0) * 10 : this.i(var12_18, 0);
                        }
                        var12_17 = var9_12 * 60000 + var10_13 * 1000 + var11_15;
                        var8_10.add(var12_17);
                    }
                    if (var8_10.isEmpty()) continue;
                    v0 = var9_12 = var7_9.contains("<") != false && var7_9.contains(">") != false ? 1 : 0;
                    if (var9_12 == 0) break block10;
                    var10_14 = this.h(var7_9.trim(), (Integer)var8_10.get(0));
                    var11_16 = var8_10.iterator();
                    while (var11_16.hasNext()) {
                        var12_17 = (Integer)var11_16.next();
                        var13_19 = new sm(var12_17, var10_14.Yj, this.f(var10_14.Yk), true);
                        var2_2.add(var13_19);
                        afl.c("Enhanced line parsed: [" + var12_17 + "ms] \"" + var13_19.Yg + "\" | words=" + var13_19.Yh.size(), new Object[0]);
                    }
                    ** GOTO lbl4
                }
                var10_14 = var7_9.trim();
                var11_16 = var8_10.iterator();
                while (var11_16.hasNext()) {
                    var12_17 = (Integer)var11_16.next();
                    var13_19 = new sm(var12_17, (String)var10_14, new ArrayList<so>(), false);
                    var2_2.add(var13_19);
                }
                ** GOTO lbl4
            }
        }
        catch (IOException var6_7) {
            // empty catch block
        }
        for (var6_8 = 0; var6_8 < var2_2.size(); ++var6_8) {
            var7_9 = (sm)var2_2.get(var6_8);
            v1 = var8_11 = var6_8 + 1 < var2_2.size() ? ((sm)var2_2.get((int)(var6_8 + 1))).Yf : this.Wz;
            if (!var7_9.Yh.isEmpty()) {
                for (var9_12 = 0; var9_12 < var7_9.Yh.size(); ++var9_12) {
                    var7_9.Yh.get((int)var9_12).Yn = var9_12 + 1 < var7_9.Yh.size() ? var7_9.Yh.get((int)(var9_12 + 1)).Ym : var8_11;
                }
                continue;
            }
            var7_9.Yh = this.a(var7_9.Yg, var7_9.Yf, var8_11);
        }
        var2_2.sort(Comparator.comparingInt((ToIntFunction<sm>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)I, a(hackclient.rise.sm ), (Lhackclient/rise/sm;)I)()));
        return var2_2;
    }

    private sn h(String string, int n2) {
        ArrayList<so> arrayList = new ArrayList<so>();
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = 0;
        int n4 = n2;
        boolean bl2 = false;
        StringBuilder stringBuilder2 = new StringBuilder();
        while (n3 < string.length()) {
            int n5;
            char c2 = string.charAt(n3);
            if (c2 == '<' && (n5 = string.indexOf(62, n3)) > n3) {
                Integer n6;
                String string2;
                if (stringBuilder2.length() > 0) {
                    string2 = stringBuilder2.toString();
                    arrayList.add(new so(string2, n4));
                    stringBuilder.append(string2);
                    stringBuilder2.setLength(0);
                }
                if ((n6 = this.O(string2 = string.substring(n3 + 1, n5))) != null) {
                    n4 = n6;
                    bl2 = true;
                }
                n3 = n5 + 1;
                continue;
            }
            stringBuilder2.append(c2);
            ++n3;
        }
        if (stringBuilder2.length() > 0) {
            String string3 = stringBuilder2.toString();
            arrayList.add(new so(string3, n4));
            stringBuilder.append(string3);
        }
        arrayList.removeIf(so2 -> so2.Yl == null || so2.Yl.isEmpty());
        if (!bl2) {
            arrayList.clear();
        }
        return new sn(stringBuilder.toString(), arrayList);
    }

    private List<so> f(List<so> list) {
        ArrayList<so> arrayList = new ArrayList<so>();
        for (so so2 : list) {
            arrayList.add(new so(so2.Yl, so2.Ym));
        }
        return arrayList;
    }

    private Integer O(String string) {
        try {
            String[] stringArray = string.split(":");
            if (stringArray.length != 2) {
                return null;
            }
            int n2 = Integer.parseInt(stringArray[0]);
            String[] stringArray2 = stringArray[1].split("\\.");
            int n3 = Integer.parseInt(stringArray2[0]);
            int n4 = 0;
            if (stringArray2.length > 1) {
                String string2 = stringArray2[1];
                n4 = string2.length() == 2 ? Integer.parseInt(string2) * 10 : Integer.parseInt(string2);
            }
            return n2 * 60000 + n3 * 1000 + n4;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private List<so> a(String string, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        Object object;
        int n9;
        int n10;
        int n11;
        ArrayList<so> arrayList = new ArrayList<so>();
        if (string == null) {
            return arrayList;
        }
        int n12 = Math.max(0, n3 - n2);
        if (n12 == 0) {
            so so2 = new so(string, n2);
            so2.Yn = n2;
            arrayList.add(so2);
            return arrayList;
        }
        ArrayList<String> arrayList2 = new ArrayList<String>();
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        Object object2 = new StringBuilder();
        int n13 = -1;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            int n14;
            boolean bl2;
            n11 = string.charAt(i2);
            n10 = Character.isWhitespace((char)n11);
            boolean bl3 = bl2 = n10 == 0 && (Character.isLetterOrDigit((char)n11) || n11 == 39 || n11 == 8217);
            int n15 = n10 != 0 ? 0 : (n14 = bl2 ? 1 : 2);
            if (n14 != n13 && n13 != -1) {
                arrayList2.add(((StringBuilder)object2).toString());
                arrayList3.add(n13);
                ((StringBuilder)object2).setLength(0);
            }
            ((StringBuilder)object2).append((char)n11);
            n13 = n14;
        }
        if (((StringBuilder)object2).length() > 0) {
            arrayList2.add(((StringBuilder)object2).toString());
            arrayList3.add(n13);
        }
        if (arrayList2.isEmpty()) {
            object2 = new so(string, n2);
            ((so)object2).Yn = n3;
            arrayList.add((so)object2);
            return arrayList;
        }
        int n16 = -1;
        for (n13 = arrayList2.size() - 1; n13 >= 0; --n13) {
            if ((Integer)arrayList3.get(n13) != 1) continue;
            n16 = n13;
            break;
        }
        if (n16 < 0) {
            so so3 = new so(string, n2);
            so3.Yn = n3;
            arrayList.add(so3);
            return arrayList;
        }
        ArrayList<String> arrayList4 = new ArrayList<String>();
        ArrayList<Integer> arrayList5 = new ArrayList<Integer>();
        for (n11 = 0; n11 < n16; ++n11) {
            arrayList4.add((String)arrayList2.get(n11));
            arrayList5.add((Integer)arrayList3.get(n11));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (n10 = n16; n10 < arrayList2.size(); ++n10) {
            stringBuilder.append((String)arrayList2.get(n10));
        }
        arrayList4.add(stringBuilder.toString());
        arrayList5.add(1);
        n10 = arrayList4.size();
        double[] dArray = new double[n10];
        double d2 = 0.0;
        for (int i3 = 0; i3 < n10; ++i3) {
            double d3;
            String string2 = (String)arrayList4.get(i3);
            n9 = (Integer)arrayList5.get(i3);
            if (n9 == 1) {
                object = string2.replaceAll("[^\\p{L}\\p{M}\\p{Nd}'\u2019]+", "");
                n8 = this.P((String)object);
                double d4 = 0.0;
                for (n7 = 0; n7 < string2.length(); ++n7) {
                    n6 = string2.charAt(n7);
                    if (Character.isWhitespace((char)n6)) continue;
                    n5 = Character.isUpperCase((char)n6);
                    d4 += 1.0 + (n5 != 0 ? 0.1 : 0.0);
                }
                d3 = Math.max(1.0, 0.6 * (double)Math.max(1, n8) + 0.4 * Math.max(1.0, d4));
                if (((String)object).matches(".*([aAeEiIoOuUyY])\\1{2,}.*")) {
                    d3 += 0.6;
                }
                if (((String)object).length() >= 3 && ((String)object).equals(((String)object).toUpperCase())) {
                    d3 += 0.5;
                }
            } else {
                d3 = n9 == 2 ? this.Q(string2) : Math.max(0.12, 0.1 * (double)string2.length());
            }
            if (i3 == n10 - 1) {
                d3 *= 1.45;
            }
            dArray[i3] = d3;
            d2 += d3;
        }
        if (d2 <= 0.0) {
            Arrays.fill(dArray, 1.0);
            d2 = n10;
        }
        int[] nArray = new int[n10];
        for (n4 = 0; n4 < n10; ++n4) {
            n9 = (Integer)arrayList5.get(n4);
            nArray[n4] = n9 == 1 ? 45 : (n9 == 2 ? 60 : Math.min(40, 10 * Math.max(1, ((String)arrayList4.get(n4)).length())));
        }
        n4 = Math.min(Math.max(100, (int)Math.round(0.22 * (double)n12)), n12);
        nArray[n10 - 1] = Math.max(nArray[n10 - 1], n4);
        double[] dArray2 = new double[n10];
        for (int i4 = 0; i4 < n10; ++i4) {
            dArray2[i4] = (double)n12 * (dArray[i4] / d2);
        }
        int[] nArray2 = new int[n10];
        int n17 = 0;
        object = new double[n10];
        for (n8 = 0; n8 < n10; ++n8) {
            int n18 = (int)Math.floor(dArray2[n8]);
            if (n18 < nArray[n8]) {
                n18 = nArray[n8];
            }
            nArray2[n8] = n18;
            n17 += n18;
            object[n8] = dArray2[n8] - Math.floor(dArray2[n8]);
        }
        if (n17 > n12) {
            n8 = n17 - n12;
            Integer[] integerArray = new Integer[n10];
            for (int i5 = 0; i5 < n10; ++i5) {
                integerArray[i5] = i5;
            }
            Arrays.sort(integerArray, new sk(this, n10, nArray2, nArray, arrayList5));
            Integer[] integerArray2 = integerArray;
            n7 = integerArray2.length;
            for (n6 = 0; n6 < n7; ++n6) {
                n5 = integerArray2[n6];
                while (n8 > 0 && nArray2[n5] > nArray[n5]) {
                    int n19 = n5;
                    nArray2[n19] = nArray2[n19] - 1;
                    --n8;
                }
                if (n8 != 0) {
                    continue;
                }
                break;
            }
        } else if (n17 < n12) {
            int n20;
            n8 = n12 - n17;
            Integer[] integerArray = new Integer[n10];
            for (n20 = 0; n20 < n10; ++n20) {
                integerArray[n20] = n20;
            }
            Arrays.sort(integerArray, new sl(this, n10, (double[])object, arrayList5));
            n20 = 0;
            while (n8-- > 0) {
                int n21 = integerArray[n20 % n10];
                nArray2[n21] = nArray2[n21] + 1;
                ++n20;
            }
        }
        n8 = 0;
        int[] nArray3 = nArray2;
        int n22 = nArray3.length;
        for (n7 = 0; n7 < n22; ++n7) {
            n6 = nArray3[n7];
            n8 += n6;
        }
        if (n8 != n12) {
            int n23 = n10 - 1;
            nArray2[n23] = nArray2[n23] + (n12 - n8);
        }
        int n24 = n2;
        for (n22 = 0; n22 < n10; ++n22) {
            n7 = n24;
            n6 = n22 == n10 - 1 ? n3 : Math.min(n3, n7 + Math.max(1, nArray2[n22]));
            so so4 = new so((String)arrayList4.get(n22), n7);
            so4.Yn = n6;
            arrayList.add(so4);
            n24 = n6;
        }
        return arrayList;
    }

    private int P(String string) {
        int n2;
        if (string == null) {
            return 1;
        }
        String string2 = string.toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z]", "");
        if (string2.isEmpty()) {
            return 1;
        }
        String string3 = string2.replaceAll("(?i)[^aeiouy]+", " ").trim();
        int n3 = n2 = string3.isEmpty() ? 0 : string3.split("\\s+").length;
        if (string2.endsWith("e") && n2 > 1) {
            --n2;
        }
        return Math.max(1, n2);
    }

    private double Q(String string) {
        String string2 = string;
        int n2 = string2.length();
        if (string2.matches("\\.+")) {
            return 0.9 + 0.15 * (double)(n2 - 1);
        }
        if (string2.matches("[!?]+")) {
            return 0.8 + 0.1 * (double)(n2 - 1);
        }
        if (string2.matches("[,;:]+")) {
            return 0.55 + 0.08 * (double)(n2 - 1);
        }
        if (string2.matches("[\u2014\u2013-]+")) {
            return 0.55 + 0.05 * (double)(n2 - 1);
        }
        if (string2.matches("[()\\[\\]\"\u201c\u201d]+")) {
            return 0.35;
        }
        return 0.3;
    }

    private int i(String string, int n2) {
        try {
            return Integer.parseInt(string);
        }
        catch (Exception exception) {
            return n2;
        }
    }

    private int z(int n2) {
        if (!this.WK) {
            return -1;
        }
        if (this.WL && !this.WM.isEmpty()) {
            if (n2 < this.WM.get((int)0).Yf + 0) {
                return -1;
            }
            int n3 = 0;
            int n4 = this.WM.size() - 1;
            int n5 = -1;
            while (n3 <= n4) {
                int n6 = n3 + n4 >>> 1;
                if (this.WM.get((int)n6).Yf <= n2) {
                    n5 = n6;
                    n3 = n6 + 1;
                    continue;
                }
                n4 = n6 - 1;
            }
            return n5;
        }
        if (!this.WL && !this.WN.isEmpty() && this.Wz > 0) {
            int n7 = (int)Math.floor((double)n2 / (double)this.Wz * (double)this.WN.size());
            return Math.max(0, Math.min(this.WN.size() - 1, n7));
        }
        return -1;
    }

    private int ib() {
        return this.z(this.WA);
    }

    private int ic() {
        return this.WL ? this.WM.size() : this.WN.size();
    }

    private String A(int n2) {
        if (this.WL) {
            if (n2 < 0 || n2 >= this.WM.size()) {
                return "";
            }
            return this.WM.get((int)n2).Yg;
        }
        if (n2 < 0 || n2 >= this.WN.size()) {
            return "";
        }
        return this.WN.get(n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String R(String string) {
        Map<String, String> map = this.aS();
        String string2 = map.get("client_id");
        String string3 = map.get("client_secret");
        if (string2 == null) {
            string2 = "";
        }
        if (string3 == null) {
            string3 = "";
        }
        try {
            String string4;
            URL uRL = new URL("https://accounts.spotify.com/api/token");
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("User-Agent", Xx);
            httpURLConnection.setRequestProperty("Authorization", "Basic " + Base64.getEncoder().encodeToString((string2 + ":" + string3).getBytes()));
            httpURLConnection.setConnectTimeout(4000);
            httpURLConnection.setReadTimeout(6000);
            try (Closeable closeable = httpURLConnection.getOutputStream();){
                ((OutputStream)closeable).write(("grant_type=authorization_code&code=" + string + "&redirect_uri=http://127.0.0.1:8888/callback").getBytes());
            }
            closeable = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            try {
                String string5;
                String string6 = ((BufferedReader)closeable).lines().reduce("", String::concat);
                string4 = this.Wr = (string5 = string6.split("\"access_token\":\"")[1].split("\"")[0]);
            }
            catch (Throwable throwable) {
                try {
                    try {
                        ((BufferedReader)closeable).close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                    throw throwable;
                }
                catch (SocketException socketException) {
                    if (((Boolean)this.Wj.wD()).booleanValue()) {
                        afl.c("Spotify token connection issue: " + socketException.getMessage(), new Object[0]);
                    }
                    httpURLConnection = null;
                    return httpURLConnection;
                }
                catch (Exception exception) {
                    if (((Boolean)this.Wj.wD()).booleanValue()) {
                        exception.printStackTrace();
                    }
                    httpURLConnection = null;
                    return httpURLConnection;
                }
            }
            ((BufferedReader)closeable).close();
            return string4;
        }
        finally {
            this.Xp = false;
        }
    }

    private void startServer() {
        block35: {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.setReuseAddress(true);
            serverSocket.bind(new InetSocketAddress(InetAddress.getByName("127.0.0.1"), 8888));
            serverSocket.setSoTimeout(500);
            ServerSocket serverSocket2 = serverSocket;
            block28: while (true) {
                while (this.Xp) {
                    Socket socket = null;
                    try {
                        socket = serverSocket2.accept();
                    }
                    catch (SocketTimeoutException socketTimeoutException) {
                        continue;
                    }
                    try {
                        Socket socket2 = socket;
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
                            try {
                                String string;
                                block34: {
                                    String string2;
                                    socket2.setSoTimeout(6000);
                                    string = null;
                                    while ((string2 = bufferedReader.readLine()) != null && !string2.isEmpty()) {
                                        if (!string2.startsWith("GET") || !string2.contains("code=")) continue;
                                        string = string2.split("code=")[1].split(" ")[0];
                                        break;
                                    }
                                    try (OutputStream outputStream = socket2.getOutputStream();){
                                        String string3 = "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\nContent-Length: 107\r\n\r\n<html><body><h2>Authorization successful!</h2><p>You can now re-enable the Music Player module.</p></body></html>";
                                        outputStream.write(string3.getBytes());
                                    }
                                    catch (SocketException socketException) {
                                        if (!((Boolean)this.Wj.wD()).booleanValue()) break block34;
                                        afl.c("Auth callback connection issue: " + socketException.getMessage(), new Object[0]);
                                    }
                                }
                                if (string == null) continue block28;
                                this.R(string);
                                break block35;
                            }
                            finally {
                                bufferedReader.close();
                                continue block28;
                            }
                        }
                        finally {
                            if (socket2 != null) {
                                socket2.close();
                            }
                            continue block28;
                        }
                    }
                    catch (SocketException socketException) {
                        if (!((Boolean)this.Wj.wD()).booleanValue()) continue;
                        afl.c("Auth callback connection issue: " + socketException.getMessage(), new Object[0]);
                    }
                    catch (Throwable throwable) {
                        if (!((Boolean)this.Wj.wD()).booleanValue()) continue;
                        throwable.printStackTrace();
                    }
                }
                break block35;
                {
                    continue block28;
                    break;
                }
                break;
            }
            finally {
                if (serverSocket2 != null) {
                    serverSocket2.close();
                }
            }
        }
    }

    public int S(String string) {
        try {
            BufferedImage bufferedImage = this.T(string);
            if (bufferedImage == null) {
                return -1;
            }
            return TextureUtil.a(TextureUtil.OC(), bufferedImage, true, false);
        }
        catch (Exception exception) {
            return -1;
        }
    }

    private BufferedImage T(String string) {
        BufferedImage bufferedImage;
        block9: {
            URLConnection uRLConnection = new URL(string).openConnection();
            uRLConnection.setRequestProperty("User-Agent", Xx);
            uRLConnection.setConnectTimeout(4000);
            uRLConnection.setReadTimeout(6000);
            InputStream inputStream = uRLConnection.getInputStream();
            try {
                bufferedImage = ImageIO.read(inputStream);
                if (inputStream == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    if (((Boolean)this.Wj.wD()).booleanValue()) {
                        afl.c("Artwork fetch issue: " + throwable3.getClass().getSimpleName() + ": " + throwable3.getMessage(), new Object[0]);
                    }
                    return null;
                }
            }
            inputStream.close();
        }
        return bufferedImage;
    }

    private void a(String string, long l2) {
        if (string == null || string.isEmpty()) {
            return;
        }
        if (l2 != this.XD) {
            return;
        }
        if (this.Xz && Objects.equals(string, this.Xy)) {
            return;
        }
        if (this.XA != null && Objects.equals(string, this.XB) && this.XC == l2) {
            return;
        }
        this.Xy = string;
        this.Xz = true;
        new Thread(() -> {
            try {
                BufferedImage bufferedImage = this.T(string);
                if (bufferedImage != null && l2 == this.XD) {
                    this.XB = string;
                    this.XC = l2;
                    this.XA = bufferedImage;
                }
            }
            finally {
                this.Xz = false;
            }
        }, "SpotifyArtworkFetch-" + l2).start();
    }

    private void ie() {
        BufferedImage bufferedImage = this.XA;
        if (bufferedImage == null) {
            return;
        }
        if (this.XC != this.XD || this.Wu == null || this.Wu.isEmpty() || !Objects.equals(this.Wu, this.XB)) {
            this.XA = null;
            this.XB = "";
            this.XC = -1L;
            return;
        }
        try {
            this.WB = TextureUtil.a(TextureUtil.OC(), bufferedImage, true, false);
        }
        catch (Throwable throwable) {
            if (((Boolean)this.Wj.wD()).booleanValue()) {
                afl.c("Artwork upload issue: " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage(), new Object[0]);
            }
        }
        finally {
            this.XA = null;
            this.XB = "";
            this.XC = -1L;
        }
    }

    private void d(long l2) {
        this.WB = -1;
        this.XA = null;
        this.XB = "";
        this.XC = -1L;
        this.XI = -1L;
        this.XJ = -1L;
        this.XK = "";
    }

    private void if() {
        if (this.Xn) {
            return;
        }
        this.Xn = true;
        this.Xo = new Thread(() -> {
            while (this.Xn) {
                try {
                    this.hV();
                    this.hX();
                    String string = ((akg)this.Wg.wD()).getName();
                    if ("Cider".equals(string)) {
                        this.hZ();
                    } else if (this.Wr != null && !this.Wr.isEmpty()) {
                        this.ia();
                    }
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                long l2 = Math.max(25L, (long)((Number)this.Wi.wD()).intValue() * 50L);
                try {
                    Thread.sleep(l2);
                }
                catch (InterruptedException interruptedException) {
                    break;
                }
            }
        }, "SpotifyPoller");
        this.Xo.setDaemon(true);
        this.Xo.start();
    }

    private void ig() {
        this.Xn = false;
        if (this.Xo != null) {
            try {
                this.Xo.interrupt();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            this.Xo = null;
        }
    }

    public void ih() {
        if (this.Xp) {
            return;
        }
        this.Xp = true;
        new Thread(() -> {
            try {
                this.startServer();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                this.Xp = false;
            }
        }, "SpotifyAuthServer").start();
        try {
            this.hV();
            if (!this.hW()) {
                afl.b("Spotify client ID/secret missing. Use .spotify (clientid) / .spotify (clientsecret). Redirect URI: http://127.0.0.1:8888/callback", new Object[0]);
            }
            Desktop.getDesktop().browse(new URI("https://accounts.spotify.com/authorize?response_type=code&client_id=" + URLEncoder.encode(this.Xq, "UTF-8") + "&redirect_uri=" + URLEncoder.encode("http://127.0.0.1:8888/callback", "UTF-8") + "&scope=" + URLEncoder.encode("user-read-playback-state", "UTF-8")));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.Xp = false;
        }
    }

    @Override
    public void onEnable() {
        afl.b("do .spotify (clientid) for the client ID and .spotify (clientsecret) for the client secret and use http://127.0.0.1:8888/callback instead of localhost", new Object[0]);
        String string = "Tutorial:";
        s s2 = new s(string + " ");
        s s3 = new s("https://youtu.be/-wbsOmDxBqk");
        v v2 = new v().a(new a(b.cKI, "https://youtu.be/-wbsOmDxBqk")).i(true).b(this.rP().rX());
        s3.a(v2);
        s2.n(s3);
        this.Xu.bgK.a(s2);
        this.hV();
        String string2 = ((akg)this.Wg.wD()).getName();
        if ("Spotify".equals(string2)) {
            if (!this.hW()) {
                afl.b("Spotify: Missing client credentials. Set them before connecting.", new Object[0]);
            } else if (this.Wr.isEmpty()) {
                this.ih();
            }
        }
        if ("Cider".equals(string2)) {
            this.hZ();
        } else if (!this.Wr.isEmpty()) {
            this.ia();
        }
        this.Wx = this.Ws;
        this.WB = -1;
        this.ie();
        if (this.Wu != null && !this.Wu.isEmpty()) {
            this.a(this.Wu, this.XD);
        }
        this.if();
    }

    @Override
    public void onDisable() {
        this.ig();
    }

    private int ii() {
        long l2 = System.currentTimeMillis() - this.WP;
        int n2 = this.WA + (int)l2;
        if (n2 < 0) {
            n2 = 0;
        }
        if (this.Wz > 0 && n2 > this.Wz) {
            n2 = this.Wz;
        }
        return n2;
    }

    private float k(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        float f3 = 1.0f - f2;
        return 1.0f - f3 * f3 * f3;
    }

    private float ij() {
        float f2 = (float)(System.currentTimeMillis() - this.WR) / 260.0f;
        return this.k(Math.min(1.0f, Math.max(0.0f, f2)));
    }

    private void B(int n2) {
        int n3;
        if (!this.WK) {
            return;
        }
        int n4 = this.z(n2);
        if (n4 < 0 && this.WO >= 0 && this.WL && !this.WM.isEmpty() && n2 >= (n3 = this.WM.get((int)0).Yf + 0)) {
            return;
        }
        if (this.WO >= 0 && n4 >= 0 && n4 < this.WO && System.currentTimeMillis() - this.WS < 120L) {
            return;
        }
        if (n4 != this.WO) {
            long l2 = System.currentTimeMillis();
            boolean bl2 = this.WO < 0 || n4 > this.WO;
            this.WQ = this.WO;
            this.WO = n4;
            this.WR = bl2 ? l2 + 0L : l2;
            this.WS = l2;
            this.XM = -1;
            this.XL = 0.0f;
            this.XU = l2 + 260L;
        }
    }

    private int a(int n2, int n3, int n4) {
        return Math.max(n3, Math.min(n4, n2));
    }

    private static /* synthetic */ int a(sm sm2) {
        return sm2.Yf;
    }
}

