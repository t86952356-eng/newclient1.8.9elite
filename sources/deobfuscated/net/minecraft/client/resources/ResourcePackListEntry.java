/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.aj;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.cb;
import net.minecraft.client.gui.cu;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.ResourcePackListEntry$1;
import net.minecraft.util.ba;
import net.minecraft.util.cm;
import net.minecraft.util.t;

public abstract class ResourcePackListEntry
implements aj {
    private static final cm cdj = new cm("textures/gui/resource_packs.png");
    private static final ba cdk = new t("resourcePack.incompatible", new Object[0]);
    private static final ba cdl = new t("resourcePack.incompatible.old", new Object[0]);
    private static final ba cdm = new t("resourcePack.incompatible.new", new Object[0]);
    protected final Minecraft cdn;
    protected final cb cdo;

    public ResourcePackListEntry(cb cb2) {
        this.cdo = cb2;
        this.cdn = Minecraft.getMinecraft();
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        int n9;
        int n10 = this.Pv();
        if (n10 != 1) {
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            b.drawRect(n3 - 1, n4 - 1, n3 + n5 - 9, n4 + n6 + 1, -8978432);
        }
        this.Py();
        GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
        b.drawModalRectWithCustomSizedTexture(n3, n4, 0.0f, 0.0f, 32.0f, 32.0f, 32.0f, 32.0f);
        Object object = this.Px();
        String string = this.Pw();
        if ((this.cdn.aIY.cgO || bl2) && this.Pz()) {
            this.cdn.Bq().a(cdj);
            b.drawRect(n3, n4, n3 + 32, n4 + 32, -1601138544);
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            n9 = n7 - n3;
            int n11 = n8 - n4;
            if (n10 < 1) {
                object = cdk.getFormattedText();
                string = cdl.getFormattedText();
            } else if (n10 > 1) {
                object = cdk.getFormattedText();
                string = cdm.getFormattedText();
            }
            if (this.PA()) {
                if (n9 < 32) {
                    b.drawModalRectWithCustomSizedTexture(n3, n4, 0.0f, 32.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                } else {
                    b.drawModalRectWithCustomSizedTexture(n3, n4, 0.0f, 0.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                }
            } else {
                if (this.PB()) {
                    if (n9 < 16) {
                        b.drawModalRectWithCustomSizedTexture(n3, n4, 32.0f, 32.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                    } else {
                        b.drawModalRectWithCustomSizedTexture(n3, n4, 32.0f, 0.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                    }
                }
                if (this.PC()) {
                    if (n9 < 32 && n9 > 16 && n11 < 16) {
                        b.drawModalRectWithCustomSizedTexture(n3, n4, 96.0f, 32.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                    } else {
                        b.drawModalRectWithCustomSizedTexture(n3, n4, 96.0f, 0.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                    }
                }
                if (this.PD()) {
                    if (n9 < 32 && n9 > 16 && n11 > 16) {
                        b.drawModalRectWithCustomSizedTexture(n3, n4, 64.0f, 32.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                    } else {
                        b.drawModalRectWithCustomSizedTexture(n3, n4, 64.0f, 0.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                    }
                }
            }
        }
        if ((n9 = this.cdn.fontRendererObj.bQ((String)object)) > 157) {
            object = this.cdn.fontRendererObj.k((String)object, 157 - this.cdn.fontRendererObj.bQ("...")) + "...";
        }
        this.cdn.fontRendererObj.b((String)object, n3 + 32 + 2, n4 + 1, 0xFFFFFF);
        List<String> list = this.cdn.fontRendererObj.m(string, 157);
        for (int i2 = 0; i2 < 2 && i2 < list.size(); ++i2) {
            this.cdn.fontRendererObj.b(list.get(i2), n3 + 32 + 2, n4 + 12 + 10 * i2, 0x808080);
        }
    }

    protected abstract int Pv();

    protected abstract String Pw();

    protected abstract String Px();

    protected abstract void Py();

    protected boolean Pz() {
        return true;
    }

    protected boolean PA() {
        return !this.cdo.a(this);
    }

    protected boolean PB() {
        return this.cdo.a(this);
    }

    protected boolean PC() {
        List<ResourcePackListEntry> list = this.cdo.b(this);
        int n2 = list.indexOf(this);
        return n2 > 0 && list.get(n2 - 1).Pz();
    }

    protected boolean PD() {
        List<ResourcePackListEntry> list = this.cdo.b(this);
        int n2 = list.indexOf(this);
        return n2 >= 0 && n2 < list.size() - 1 && list.get(n2 + 1).Pz();
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.Pz() && n6 <= 32) {
            if (this.PA()) {
                this.cdo.FN();
                int n8 = this.Pv();
                if (n8 != 1) {
                    String string = I18n.a("resourcePack.incompatible.confirm.title", new Object[0]);
                    String string2 = I18n.a("resourcePack.incompatible.confirm." + (n8 > 1 ? "new" : "old"), new Object[0]);
                    this.cdn.a(new cu(new ResourcePackListEntry$1(this), string, string2, 0));
                } else {
                    this.cdo.b(this).remove(this);
                    this.cdo.FM().add(0, this);
                }
                return true;
            }
            if (n6 < 16 && this.PB()) {
                this.cdo.b(this).remove(this);
                this.cdo.FL().add(0, this);
                this.cdo.FN();
                return true;
            }
            if (n6 > 16 && n7 < 16 && this.PC()) {
                List<ResourcePackListEntry> list = this.cdo.b(this);
                int n9 = list.indexOf(this);
                list.remove(this);
                list.add(n9 - 1, this);
                this.cdo.FN();
                return true;
            }
            if (n6 > 16 && n7 > 16 && this.PD()) {
                List<ResourcePackListEntry> list = this.cdo.b(this);
                int n10 = list.indexOf(this);
                list.remove(this);
                list.add(n10 + 1, this);
                this.cdo.FN();
                return true;
            }
        }
        return false;
    }

    @Override
    public void o(int n2, int n3, int n4) {
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }
}

