/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.alan.clients.ui.menu.impl.account.impl;

import com.alan.clients.ui.menu.impl.account.AccountManagerScreen;
import com.alan.clients.ui.menu.impl.account.impl.AddLocaltsScreen$1;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import hackclient.rise.adi;
import hackclient.rise.adk;
import hackclient.rise.adp;
import hackclient.rise.aea;
import hackclient.rise.aee;
import hackclient.rise.aeu;
import hackclient.rise.aev;
import hackclient.rise.aew;
import hackclient.rise.aex;
import hackclient.rise.aey;
import hackclient.rise.aez;
import hackclient.rise.afa;
import hackclient.rise.afb;
import hackclient.rise.afd;
import hackclient.rise.afe;
import hackclient.rise.aff;
import hackclient.rise.afg;
import hackclient.rise.afh;
import hackclient.rise.afj;
import hackclient.rise.agf;
import hackclient.rise.ago;
import hackclient.rise.agp;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.aiy;
import hackclient.rise.ajc;
import hackclient.rise.aka;
import hackclient.rise.gb;
import hackclient.rise.gd;
import hackclient.rise.gg;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.cz;
import net.minecraft.util.cm;
import rip.vantage.commons.packet.impl.client.community.e;
import rip.vantage.network.core.a;

public class AddLocaltsScreen
extends bp
implements adi,
aea {
    private static final String API_KEY_SETTINGS_URL = "https://localts.store/user/settings";
    private static final agf TITLE_FONT = gb.ks.a(36, gd.kH);
    private static final agf INFO_FONT = gb.ks.a(16, gd.kG);
    private static final agf LABEL_FONT = gb.ks.a(14, gd.kH);
    private static final agf TOOLTIP_FONT = gb.ks.a(12, gd.kG);
    private static final agf QUANTITY_FONT = gb.ks.a(18, gd.kG);
    private static final float CENTER_REF_HEIGHT = gb.ks.a(24, gd.kH).tF();
    private static final int PRODUCT_INDEX_NONE = -1;
    private static final int PRODUCTS_PER_PAGE = 4;
    private final adk[] menuButtons = new adk[4];
    private static volatile List<aez> products = Collections.emptyList();
    private static volatile int selectedProductIndex = -1;
    private static final Set<String> BUNDLED_PRODUCT_IMAGES = new HashSet<String>(Arrays.asList("6900ec1c8f13c00afab7c381", "6900ed898f13c00afab7c382", "6900eeb78f13c00afab7c383", "6900ef8e8f13c00afab7c384", "6900f0468f13c00afab7c385", "6900f0dd8f13c00afab7c386", "6900f1688f13c00afab7c387", "6900f29e8f13c00afab7c389", "6900f3538f13c00afab7c38a", "6904936dfa5bca3b23dfbc57", "69049723fa5bca3b23dfbc5b", "6904978cfa5bca3b23dfbc5c", "690497fdfa5bca3b23dfbc5d", "6936f0f50012d41ae47d5599", "69396133cf14434b3961e722", "6947421b5ed4b81132777692", "694768565ed4b811327781af", "6a245da8e2ec8410af11582c", "6a245e1fe2ec8410af11582d", "6a245f29e2ec8410af11582e", "6a246a3c62352652aae20bc6"));
    private static agp apiKeyBox;
    private static agp quantityBox;
    private static bp reference;
    private afj animation;
    private static volatile String statusMessage;
    private static volatile Color statusColor;
    private static volatile boolean isPurchasing;
    private static volatile String localtsUsername;
    private static volatile int localtsCredits;
    private static boolean productModalOpen;
    private static int productPage;
    private static final Runnable API_KEY_BOX_RUNNABLE;
    private static final Runnable QUANTITY_BOX_RUNNABLE;
    private static final Runnable CANCEL_RUNNABLE;
    private static final Runnable OPEN_LATEST_ORDER_RUNNABLE;
    private static final Runnable CYCLE_PRODUCT_RUNNABLE;
    private static final Runnable CHECK_STATUS_RUNNABLE;
    private static final Runnable CHECK_STOCK_RUNNABLE;
    private static final Runnable PURCHASE_RUNNABLE;
    private static final Runnable BACKGROUND_RUNNABLE;

    private static float centeredTextY(double d2, double d3, agf agf2) {
        return (float)(d2 + d3 / 2.0 - 4.0 * (double)agf2.tF() / (double)CENTER_REF_HEIGHT);
    }

    private static void purchase(String string, aez aez2, int n2) {
        isPurchasing = true;
        try {
            AddLocaltsScreen.purchaseAndDeliver(string, aez2, n2);
        }
        finally {
            isPurchasing = false;
            AddLocaltsScreen.refreshAccountSummary(string, false);
        }
    }

    private static void purchaseAndDeliver(String string, aez aez2, int n2) {
        int n3 = n2;
        afg afg2 = null;
        JsonArray jsonArray = new JsonArray();
        for (int i2 = 0; i2 < 2 && n3 > 0; ++i2) {
            afg afg3;
            int n4 = n3;
            statusMessage = (i2 == 0 ? "Purchasing " : "Reordering ") + n4 + "x " + aez2.aGo + "...";
            statusColor = Color.YELLOW;
            afb afb2 = aew.c(string, aez2.aGn, n4);
            if (!afb2.aGx) {
                statusMessage = "Purchase failed: " + afb2.aGz;
                statusColor = Color.RED;
                return;
            }
            statusMessage = "Order " + afb2.aGy + " is being packaged...";
            aex aex2 = AddLocaltsScreen.waitForPackage(string, afb2.aGy);
            if (!aex2.aGa) {
                statusMessage = "Order created, but could not be retrieved: " + aex2.aGf;
                statusColor = Color.YELLOW;
                return;
            }
            if (!"PACKAGED".equalsIgnoreCase(aex2.aGc)) {
                statusMessage = "Order " + afb2.aGy + " is " + aex2.aGc + ". Check Localts orders shortly.";
                statusColor = Color.YELLOW;
                return;
            }
            afg afg4 = afg3 = afg2 == null ? aff.a(aex2) : aff.a(aex2, afg2.aGL);
            if (afg3 == null) {
                statusMessage = "Order packaged, but saving it locally failed";
                statusColor = Color.YELLOW;
                return;
            }
            if (afg2 == null) {
                afg2 = afg3;
            }
            AddLocaltsScreen.addDeliveredItems(aex2.aGe, jsonArray);
            if (afg3.aGM > 0) {
                AddLocaltsScreen.sendLocaltsDeliveryPacket(aez2, afb2.aGy, n4, i2 > 0);
            }
            if ((n3 -= afg3.aGM) <= 0) {
                AddLocaltsScreen.openDelivery(afg2, jsonArray);
                return;
            }
            if (i2 != 0) continue;
            statusMessage = "Order " + afb2.aGy + " delivered " + afg3.aGM + " of " + n2 + ". Reordering " + n3 + " missing item(s)...";
            statusColor = Color.YELLOW;
        }
        AddLocaltsScreen.openDelivery(afg2, jsonArray);
        statusMessage = "Only " + jsonArray.size() + " of " + n2 + " item(s) were delivered. No further replacement was purchased.";
        statusColor = Color.RED;
    }

    private static void addDeliveredItems(JsonArray jsonArray, JsonArray jsonArray2) {
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject;
            if (!jsonElement.isJsonObject() || !(jsonObject = jsonElement.getAsJsonObject()).has("content") || jsonObject.get("content").isJsonNull() || jsonObject.get("content").getAsString().trim().isEmpty()) continue;
            jsonArray2.add((JsonElement)jsonObject);
        }
    }

    private static void sendLocaltsDeliveryPacket(aez aez2, String string, int n2, boolean bl2) {
        try {
            a a2 = a.aKQ();
            if (a2.aKZ() == null || a2.bX() == null || a2.bX().trim().isEmpty()) {
                return;
            }
            long l2 = (long)aez2.aGr * (long)n2;
            int n3 = l2 > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)Math.max(0L, l2);
            a2.aKZ().sendMessage(new e(a2.bX(), aez2.aGo, n3, n2, string, bl2).aJz());
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static aex waitForPackage(String string, String string2) {
        aex aex2 = aew.z(string, string2);
        for (int i2 = 0; i2 < 60 && aex2.aGa && !"PACKAGED".equalsIgnoreCase(aex2.aGc); ++i2) {
            try {
                Thread.sleep(2000L);
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                break;
            }
            aex2 = aew.z(string, string2);
        }
        return aex2;
    }

    private static void saveAndOpenOrder(aex aex2) {
        afg afg2 = aff.a(aex2);
        if (afg2 == null) {
            statusMessage = "Order packaged, but saving it locally failed";
            statusColor = Color.YELLOW;
            return;
        }
        JsonArray jsonArray = new JsonArray();
        AddLocaltsScreen.addDeliveredItems(aex2.aGe, jsonArray);
        AddLocaltsScreen.openDelivery(afg2, jsonArray);
    }

    private static void openDelivery(afg afg2, JsonArray jsonArray) {
        if (afg2 == null) {
            return;
        }
        aev aev2 = aeu.a(jsonArray);
        String string = aev2.aFU;
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(afg2.aGL);
            }
            if (!aev2.sH()) {
                statusMessage = "Order saved, but automatic login failed. Opened delivery folder.";
                statusColor = Color.YELLOW;
            } else {
                statusMessage = "Logged in as " + string + " | added " + aev2.aFV + " account(s) to the alt manager";
                statusColor = Color.GREEN;
            }
        }
        catch (Exception exception) {
            statusMessage = !aev2.sH() ? "Order saved, but automatic login failed: " + afg2.aGL.getAbsolutePath() : "Logged in as " + string + " | added " + aev2.aFV + " account(s). Order saved: " + afg2.aGL.getAbsolutePath();
            statusColor = !aev2.sH() ? Color.YELLOW : Color.GREEN;
        }
    }

    private static String currentApiKey() {
        String string = apiKeyBox == null ? "" : AddLocaltsScreen.apiKeyBox.Yg.trim();
        return string.isEmpty() ? afe.sK().trim() : string;
    }

    private static void refreshProducts(boolean bl2) {
        String string = AddLocaltsScreen.currentApiKey();
        if (string.isEmpty()) {
            products = Collections.emptyList();
            selectedProductIndex = -1;
            productPage = 0;
            if (bl2) {
                statusMessage = "Enter your Localts API key to load products";
                statusColor = Color.YELLOW;
            }
            return;
        }
        afa afa2 = aew.bu(string);
        if (!afa2.aGu) {
            if (bl2) {
                statusMessage = afa2.aGw;
                statusColor = Color.RED;
            }
            return;
        }
        ArrayList<aez> arrayList = new ArrayList<aez>();
        for (aez aez2 : afa2.aGv) {
            if (aez2.aGs <= 0 || !AddLocaltsScreen.isNfa(aez2) && !AddLocaltsScreen.isCookie(aez2)) continue;
            arrayList.add(aez2);
        }
        Collections.sort(arrayList, new AddLocaltsScreen$1());
        products = arrayList;
        String string2 = afe.sL();
        selectedProductIndex = -1;
        for (int i2 = 0; i2 < products.size(); ++i2) {
            if (!AddLocaltsScreen.products.get((int)i2).aGn.equals(string2)) continue;
            selectedProductIndex = i2;
            break;
        }
        if (!products.isEmpty() && selectedProductIndex == -1) {
            selectedProductIndex = 0;
        }
        int n2 = productPage = selectedProductIndex < 0 ? 0 : selectedProductIndex / 4;
        if (bl2) {
            statusMessage = products.isEmpty() ? "No in-stock NFA or Cookie products are currently available" : "Loaded " + products.size() + " in-stock NFA/Cookie product(s)";
            statusColor = products.isEmpty() ? Color.YELLOW : Color.GREEN;
        }
    }

    private static aez selectedProduct() {
        return selectedProductIndex >= 0 && selectedProductIndex < products.size() ? products.get(selectedProductIndex) : null;
    }

    private static void refreshAccountSummary(String string, boolean bl2) {
        afd afd2 = aew.bv(string);
        if (afd2.aGD) {
            localtsUsername = afd2.aGE;
            localtsCredits = afd2.aGF;
            if (bl2) {
                statusMessage = "Localts: " + afd2.aGE + " | Credits: " + afd2.aGF;
                statusColor = Color.GREEN;
            }
        } else if (bl2) {
            statusMessage = afd2.aGG;
            statusColor = Color.RED;
        }
    }

    private static int productPriority(aez aez2) {
        if (AddLocaltsScreen.isCookie(aez2)) {
            return 0;
        }
        if (AddLocaltsScreen.isNfa(aez2)) {
            return 1;
        }
        return 2;
    }

    private static boolean isNfa(aez aez2) {
        String string = (aez2.aGo + " " + aez2.aGp + " " + aez2.aGq).toLowerCase();
        return string.contains("nfa") || string.contains("non-full") || string.contains("refresh token");
    }

    private static boolean isCookie(aez aez2) {
        return (aez2.aGo + " " + aez2.aGp + " " + aez2.aGq).toLowerCase().contains("cookie");
    }

    public AddLocaltsScreen() {
        reference = this;
        afe.init();
    }

    @Override
    public void drawScreen(int n2, int n3, float f2) {
        aiy.aQy.a(ajc.aQF, f2, null);
        this.b(gg.kU).c(BACKGROUND_RUNNABLE);
        this.b(gg.kV).c(() -> {
            this.drawStorefront(n2, n3);
            apiKeyBox.pZ();
        });
        for (adk adk2 : this.menuButtons) {
            adk2.c(n2, n3, f2);
        }
        if (productModalOpen) {
            this.b(gg.kV).c(() -> this.drawProductModal(n2, n3));
        }
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        if (n4 == 0 && this.isHelpHovered(n2, n3)) {
            AddLocaltsScreen.openApiDocs();
            return;
        }
        if (productModalOpen) {
            this.handleModalClick(n2, n3, n4);
            return;
        }
        apiKeyBox.d(n2, n3, n4);
        if (this.isPrimaryClick(n4) && this.selectProductAt(n2, n3)) {
            return;
        }
        if (this.isPrimaryClick(n4) && aee.a(this.panelX() + 12, this.cardsY() + 230, 30.0, 18.0, n2, n3)) {
            productPage = Math.max(0, productPage - 1);
            return;
        }
        if (this.isPrimaryClick(n4) && aee.a(this.panelX() + this.panelWidth() - 42, this.cardsY() + 230, 30.0, 18.0, n2, n3)) {
            productPage = Math.min(this.maxProductPage(), productPage + 1);
            return;
        }
        for (adk adk2 : this.menuButtons) {
            if (!aee.a(adk2.getX(), adk2.getY(), adk2.pc(), adk2.da(), n2, n3)) continue;
            adk2.rC();
            break;
        }
    }

    @Override
    protected void keyTyped(char c2, int n2) {
        if (n2 == 1) {
            this.closeWithEscape();
            return;
        }
        if (apiKeyBox.ud()) {
            apiKeyBox.b(c2, n2);
        } else if (productModalOpen && quantityBox.ud()) {
            quantityBox.b(c2, n2);
        }
    }

    private void closeWithEscape() {
        productModalOpen = false;
        quantityBox.I(false);
        apiKeyBox.I(false);
        aER.a(new AccountManagerScreen(reference));
    }

    @Override
    public void initGui() {
        String string = afe.sK();
        apiKeyBox = new agp(new aka(this.width / 2, this.panelY() + 91), gb.ks.a(16, gd.kG), Color.WHITE, ago.aJT, string.isEmpty() ? "API Key" : string, 330.0f);
        if (!string.isEmpty()) {
            apiKeyBox.bX(string);
        }
        quantityBox = new agp(new aka(this.width / 2, this.height / 2), QUANTITY_FONT, Color.WHITE, ago.aJT, "1", 42.0f);
        quantityBox.bX("1");
        float f2 = (float)(this.panelWidth() - 42) / 4.0f;
        float f3 = this.cardsY() + 278;
        this.menuButtons[0] = new adp(this.panelX() + 12, f3, f2, 22.0, CHECK_STATUS_RUNNABLE, "Balance");
        this.menuButtons[1] = new adp((float)(this.panelX() + 18) + f2, f3, f2, 22.0, CHECK_STOCK_RUNNABLE, "Refresh");
        this.menuButtons[2] = new adp((float)(this.panelX() + 24) + f2 * 2.0f, f3, f2, 22.0, OPEN_LATEST_ORDER_RUNNABLE, "Open Latest");
        this.menuButtons[3] = new adp((float)(this.panelX() + 30) + f2 * 3.0f, f3, f2, 22.0, CANCEL_RUNNABLE, "Close");
        statusMessage = "Loading Localts products...";
        statusColor = Color.WHITE;
        isPurchasing = false;
        productModalOpen = false;
        productPage = 0;
        new Thread(() -> AddLocaltsScreen.refreshProducts(true), "Localts product load thread").start();
        if (!string.isEmpty()) {
            new Thread(() -> AddLocaltsScreen.refreshAccountSummary(string, false), "Localts account load thread").start();
        }
    }

    private boolean isHelpHovered(int n2, int n3) {
        return aee.a(this.apiHelpX() - 12.0f, this.apiHelpY() - 12.0f, 24.0, 24.0, n2, n3);
    }

    private float apiHelpX() {
        return (float)this.width / 2.0f + (float)LABEL_FONT.bQ("Localts API Key") / 2.0f + 12.0f;
    }

    private float apiHelpY() {
        return (float)(this.panelY() + 70) + LABEL_FONT.tF() / 2.0f;
    }

    private boolean isPrimaryClick(int n2) {
        return n2 == 0 || n2 == 1;
    }

    private int panelWidth() {
        return Math.min(700, Math.max(440, this.width - 32));
    }

    private int panelHeight() {
        return Math.min(450, Math.max(425, this.height - 38));
    }

    private int panelX() {
        return this.width / 2 - this.panelWidth() / 2;
    }

    private int panelY() {
        return this.height / 2 - this.panelHeight() / 2;
    }

    private int cardsY() {
        return this.panelY() + 128;
    }

    private int cardWidth() {
        return (this.panelWidth() - 34) / 4;
    }

    private int maxProductPage() {
        return Math.max(0, (products.size() - 1) / 4);
    }

    private int cardsOnPage() {
        return Math.max(0, Math.min(4, products.size() - productPage * 4));
    }

    private int cardX(int n2) {
        int n3 = this.cardsOnPage();
        int n4 = n3 * this.cardWidth() + Math.max(0, n3 - 1) * 2;
        int n5 = this.panelX() + (this.panelWidth() - n4) / 2;
        return n5 + n2 * (this.cardWidth() + 2);
    }

    private void drawStorefront(int n2, int n3) {
        int n4;
        int n5 = this.panelX();
        int n6 = this.panelY();
        int n7 = this.panelWidth();
        int n8 = this.panelHeight();
        ait.c((double)n5, (double)n6, (double)n7, (double)n8, 12.0, new Color(19, 23, 34, 242));
        ait.c((double)(n5 + 1), (double)(n6 + 1), (double)(n7 - 2), 112.0, 11.0, new Color(36, 43, 63, 245));
        TITLE_FONT.a("Localts Marketplace", (double)(n5 + 18), (double)(n6 + 16), Color.WHITE.getRGB());
        INFO_FONT.a("Choose an account type, view its preview, then buy inside Rise.", (double)(n5 + 19), (double)(n6 + 49), new Color(176, 187, 212).getRGB());
        if (localtsUsername.isEmpty()) {
            INFO_FONT.d("5% off in Rise", n5 + n7 - 18, n6 + 18, new Color(118, 221, 178).getRGB());
            TOOLTIP_FONT.d("In stock: NFA \u2022 Cookies", n5 + n7 - 18, n6 + 38, new Color(176, 187, 212).getRGB());
        } else {
            LABEL_FONT.d(localtsUsername, n5 + n7 - 18, n6 + 15, Color.WHITE.getRGB());
            INFO_FONT.d((String)(localtsCredits < 0 ? "Checking credits..." : localtsCredits + " credits"), n5 + n7 - 18, n6 + 36, new Color(118, 221, 178).getRGB());
            TOOLTIP_FONT.d("5% off in Rise", n5 + n7 - 18, n6 + 53, new Color(176, 187, 212).getRGB());
        }
        LABEL_FONT.c("Localts API Key", this.width / 2, n6 + 70, new Color(176, 187, 212).getRGB());
        ait.c((double)(this.width / 2 - 176), (double)(n6 + 84), 352.0, 22.0, 7.0, new Color(9, 12, 20, 150));
        apiKeyBox.h(new aka(this.width / 2, AddLocaltsScreen.centeredTextY(n6 + 84, 22.0, INFO_FONT)));
        float f2 = this.apiHelpX();
        float f3 = this.apiHelpY();
        ait.c((double)f2, (double)f3, 7.0, this.isHelpHovered(n2, n3) ? new Color(109, 160, 255) : new Color(92, 107, 141));
        TOOLTIP_FONT.c("?", f2, AddLocaltsScreen.centeredTextY(f3, 0.0, TOOLTIP_FONT), Color.WHITE.getRGB());
        if (products.isEmpty()) {
            INFO_FONT.c("Loading Localts products...", this.width / 2, this.cardsY() + 85, new Color(176, 187, 212).getRGB());
        } else {
            int n9;
            for (n4 = 0; n4 < 4 && (n9 = productPage * 4 + n4) < products.size(); ++n4) {
                this.drawProductCard(products.get(n9), n9, n4, n2, n3);
            }
        }
        n4 = this.cardsY() + 230;
        float f4 = AddLocaltsScreen.centeredTextY(n4, 18.0, INFO_FONT);
        ait.c((double)(n5 + 12), (double)n4, 30.0, 18.0, 6.0, new Color(49, 58, 84, 225));
        INFO_FONT.c("\u2039", n5 + 27, f4, Color.WHITE.getRGB());
        ait.c((double)(n5 + n7 - 42), (double)n4, 30.0, 18.0, 6.0, new Color(49, 58, 84, 225));
        INFO_FONT.c("\u203a", n5 + n7 - 27, f4, Color.WHITE.getRGB());
        INFO_FONT.c(productPage + 1 + " / " + (this.maxProductPage() + 1), this.width / 2, f4, new Color(176, 187, 212).getRGB());
        INFO_FONT.c(statusMessage, this.width / 2, this.cardsY() + 256, statusColor.getRGB());
        if (this.isHelpHovered(n2, n3)) {
            float f5 = 198.0f;
            float f6 = Math.max((float)(n5 + 12), Math.min(this.apiHelpX() - f5 / 2.0f, (float)(n5 + n7 - 12) - f5));
            float f7 = n6 + 109;
            ait.c((double)f6, (double)f7, (double)f5, 32.0, 6.0, new Color(9, 12, 20, 250));
            TOOLTIP_FONT.c("Opens Localts Settings to", f6 + f5 / 2.0f, f7 + 7.0f, Color.WHITE.getRGB());
            TOOLTIP_FONT.c("create or manage your API key", f6 + f5 / 2.0f, f7 + 19.0f, new Color(176, 187, 212).getRGB());
        }
    }

    private void drawProductCard(aez aez2, int n2, int n3, int n4, int n5) {
        int n6 = this.cardX(n3);
        int n7 = this.cardsY();
        boolean bl2 = n2 == selectedProductIndex;
        boolean bl3 = aee.a(n6, n7, this.cardWidth(), 220.0, n4, n5);
        Color color = bl2 ? new Color(50, 76, 111, 245) : (bl3 ? new Color(44, 52, 77, 245) : new Color(31, 37, 55, 245));
        ait.c((double)n6, (double)n7, (double)this.cardWidth(), 220.0, 9.0, color);
        int n8 = Math.min(this.cardWidth() - 10, 108);
        int n9 = n6 + this.cardWidth() / 2 - n8 / 2;
        ait.c((double)n9, (double)(n7 + 5), (double)n8, (double)n8, 6.0, new Color(13, 16, 27, 230));
        cm cm2 = this.productImage(aez2);
        if (cm2 != null) {
            ait.a(cm2, (float)n9, (float)(n7 + 5), (float)n8, (float)n8, Color.WHITE);
        } else {
            INFO_FONT.c(this.productTag(aez2), n6 + this.cardWidth() / 2, n7 + 47, new Color(145, 164, 210).getRGB());
        }
        LABEL_FONT.a(AddLocaltsScreen.shorten(aez2.aGo, 22), (double)(n6 + 8), (double)(n7 + 122), Color.WHITE.getRGB());
        TOOLTIP_FONT.a(AddLocaltsScreen.shorten(aez2.aGp.isEmpty() ? aez2.aGq : aez2.aGp, 34), (double)(n6 + 8), (double)(n7 + 139), new Color(175, 185, 208).getRGB());
        this.drawTag(n6 + 8, n7 + 158, this.productTag(aez2), this.productTagColor(aez2));
        INFO_FONT.a(aez2.aGr + " credits", (double)(n6 + 8), (double)(n7 + 186), new Color(118, 221, 178).getRGB());
        INFO_FONT.d(aez2.aGs + " stock", n6 + this.cardWidth() - 8, n7 + 186, aez2.aGs > 0 ? new Color(176, 187, 212).getRGB() : new Color(235, 125, 125).getRGB());
        TOOLTIP_FONT.c("Click to view", n6 + this.cardWidth() / 2, n7 + 204, new Color(175, 185, 208).getRGB());
    }

    private void drawTag(float f2, float f3, String string, Color color) {
        float f4 = TOOLTIP_FONT.bQ(string) + 20;
        ait.c((double)f2, (double)f3, (double)f4, 15.0, 7.0, ais.d(color, 55));
        TOOLTIP_FONT.a(string, f2 + 10.0f, AddLocaltsScreen.centeredTextY(f3, 15.0, TOOLTIP_FONT), color.getRGB());
    }

    private String productTag(aez aez2) {
        return AddLocaltsScreen.isCookie(aez2) ? "COOKIE" : (AddLocaltsScreen.isNfa(aez2) ? "NFA" : "MINECRAFT");
    }

    private Color productTagColor(aez aez2) {
        return AddLocaltsScreen.isCookie(aez2) ? new Color(244, 184, 94) : (AddLocaltsScreen.isNfa(aez2) ? new Color(132, 166, 255) : new Color(154, 225, 175));
    }

    private cm productImage(aez aez2) {
        return BUNDLED_PRODUCT_IMAGES.contains(aez2.aGn) ? new cm("rise/images/localts_products/" + aez2.aGn + ".png") : null;
    }

    private boolean selectProductAt(int n2, int n3) {
        int n4;
        for (int i2 = 0; i2 < 4 && (n4 = productPage * 4 + i2) < products.size(); ++i2) {
            int n5 = this.cardX(i2);
            if (!aee.a(n5, this.cardsY(), this.cardWidth(), 220.0, n2, n3)) continue;
            selectedProductIndex = n4;
            afe.bx(AddLocaltsScreen.products.get((int)n4).aGn);
            productModalOpen = true;
            apiKeyBox.I(false);
            quantityBox.I(false);
            return true;
        }
        return false;
    }

    private void drawProductModal(int n2, int n3) {
        aez aez2 = AddLocaltsScreen.selectedProduct();
        if (aez2 == null) {
            return;
        }
        ait.d(0.0, 0.0, this.width, this.height, new Color(0, 0, 0, 150));
        int n4 = Math.min(570, this.width - 30);
        int n5 = Math.min(350, this.height - 30);
        int n6 = this.width / 2 - n4 / 2;
        int n7 = this.height / 2 - n5 / 2;
        ait.c((double)n6, (double)n7, (double)n4, (double)n5, 12.0, new Color(28, 34, 50, 252));
        ait.c((double)(n6 + 14), (double)(n7 + 14), 166.0, 166.0, 8.0, new Color(13, 16, 27, 235));
        cm cm2 = this.productImage(aez2);
        if (cm2 != null) {
            ait.a(cm2, (float)(n6 + 14), (float)(n7 + 14), 166.0f, 166.0f, Color.WHITE);
        } else {
            INFO_FONT.c(this.productTag(aez2), n6 + 97, n7 + 83, new Color(145, 164, 210).getRGB());
        }
        TITLE_FONT.a(AddLocaltsScreen.shorten(aez2.aGo, 28), (double)(n6 + 198), (double)(n7 + 21), Color.WHITE.getRGB());
        this.drawTag(n6 + 200, n7 + 63, this.productTag(aez2), this.productTagColor(aez2));
        INFO_FONT.a(aez2.aGs + " in stock  \u2022  Instant delivery", (double)(n6 + 198), (double)(n7 + 92), aez2.aGs > 0 ? new Color(118, 221, 178).getRGB() : new Color(235, 125, 125).getRGB());
        this.drawWrapped(aez2.aGp.isEmpty() ? "Delivered automatically by Localts after purchase." : aez2.aGp, n6 + 198, n7 + 120, n4 - 218, 4, new Color(185, 195, 216).getRGB());
        ait.c((double)(n6 + 14), (double)(n7 + 199), (double)(n4 - 28), 1.0, 0.0, new Color(67, 78, 108, 180));
        int n8 = n6 + n4 / 2 - 54;
        int n9 = n7 + 213;
        LABEL_FONT.d("Quantity", n8 - 16, AddLocaltsScreen.centeredTextY(n9, 25.0, LABEL_FONT), new Color(176, 187, 212).getRGB());
        ait.c((double)(n8 + 31), (double)n9, 54.0, 25.0, 6.0, new Color(13, 16, 27, 220));
        quantityBox.h(new aka(n8 + 58, AddLocaltsScreen.centeredTextY(n9, 25.0, QUANTITY_FONT)));
        quantityBox.pZ();
        ait.c((double)(n8 + 90), (double)n9, 26.0, 25.0, 6.0, new Color(49, 58, 84, 225));
        INFO_FONT.c("+", n8 + 103, AddLocaltsScreen.centeredTextY(n9, 25.0, INFO_FONT), Color.WHITE.getRGB());
        ait.c((double)n8, (double)n9, 26.0, 25.0, 6.0, new Color(49, 58, 84, 225));
        INFO_FONT.c("\u2212", n8 + 13, AddLocaltsScreen.centeredTextY(n9, 25.0, INFO_FONT), Color.WHITE.getRGB());
        INFO_FONT.c("Total: " + this.purchaseTotal(aez2) + " credits", n6 + n4 / 2, n7 + 251, new Color(118, 221, 178).getRGB());
        ait.c((double)(n6 + 14), (double)(n7 + n5 - 54), (double)(n4 - 28), 36.0, 7.0, aez2.aGs > 0 ? new Color(62, 120, 98) : new Color(77, 59, 68));
        INFO_FONT.c((String)(aez2.aGs > 0 ? "Purchase " + this.purchaseTotal(aez2) + " credits" : "Out of stock"), this.width / 2, AddLocaltsScreen.centeredTextY(n7 + n5 - 54, 36.0, INFO_FONT), Color.WHITE.getRGB());
        INFO_FONT.c("\u00d7", n6 + n4 - 22, AddLocaltsScreen.centeredTextY(n7 + 8, 28.0, INFO_FONT), Color.WHITE.getRGB());
        TOOLTIP_FONT.c("Click outside or \u00d7 to close", n6 + n4 / 2, n7 + n5 - 74, new Color(146, 159, 190).getRGB());
    }

    private void handleModalClick(int n2, int n3, int n4) {
        aez aez2;
        int n5 = Math.min(570, this.width - 30);
        int n6 = Math.min(350, this.height - 30);
        int n7 = this.width / 2 - n5 / 2;
        int n8 = this.height / 2 - n6 / 2;
        if (!this.isPrimaryClick(n4)) {
            return;
        }
        if (!aee.a(n7, n8, n5, n6, n2, n3) || aee.a(n7 + n5 - 36, n8 + 8, 28.0, 28.0, n2, n3)) {
            productModalOpen = false;
            quantityBox.I(false);
            return;
        }
        int n9 = n7 + n5 / 2 - 54;
        if (aee.a(n9, n8 + 213, 26.0, 25.0, n2, n3)) {
            this.setQuantity(Math.max(1, this.quantity() - 1));
        }
        if (aee.a(n9 + 90, n8 + 213, 26.0, 25.0, n2, n3)) {
            this.setQuantity(this.quantity() + 1);
        }
        quantityBox.d(n2, n3, n4);
        if (aee.a(n7 + 14, n8 + n6 - 54, n5 - 28, 36.0, n2, n3) && (aez2 = AddLocaltsScreen.selectedProduct()) != null && aez2.aGs > 0) {
            productModalOpen = false;
            quantityBox.I(false);
            PURCHASE_RUNNABLE.run();
        }
    }

    private int quantity() {
        try {
            return Math.max(1, Integer.parseInt(AddLocaltsScreen.quantityBox.Yg.trim()));
        }
        catch (Exception exception) {
            return 1;
        }
    }

    private void setQuantity(int n2) {
        quantityBox.bX(String.valueOf(n2));
        quantityBox.ar(AddLocaltsScreen.quantityBox.Yg.length());
    }

    private int purchaseTotal(aez aez2) {
        long l2 = (long)aez2.aGr * (long)this.quantity();
        return l2 > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l2;
    }

    private void drawWrapped(String string, float f2, float f3, float f4, int n2, int n3) {
        String[] stringArray = string.replace('\n', ' ').split("\\s+");
        String string2 = "";
        int n4 = 0;
        for (String string3 : stringArray) {
            String string4;
            String string5 = string4 = string2.isEmpty() ? string3 : string2 + " " + string3;
            if ((float)INFO_FONT.bQ(string4) > f4 && !string2.isEmpty()) {
                INFO_FONT.a(string2, f2, f3 + (float)(n4 * 15), n3);
                string2 = string3;
                if (++n4 < n2) continue;
                return;
            }
            string2 = string4;
        }
        if (!string2.isEmpty() && n4 < n2) {
            INFO_FONT.a(string2, f2, f3 + (float)(n4 * 15), n3);
        }
    }

    private static void openApiDocs() {
        afh.A("api_settings", API_KEY_SETTINGS_URL);
        try {
            if (!Desktop.isDesktopSupported() || !Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                throw new IOException("Browser opening is unavailable");
            }
            Desktop.getDesktop().browse(new URI(API_KEY_SETTINGS_URL));
            statusMessage = "Opened Localts API-key settings in your browser";
            statusColor = Color.GREEN;
        }
        catch (Exception exception) {
            statusMessage = "Could not open Localts settings: https://localts.store/user/settings";
            statusColor = Color.YELLOW;
        }
    }

    private static String shorten(String string, int n2) {
        return string.length() <= n2 ? string : string.substring(0, n2 - 3) + "...";
    }

    static {
        statusMessage = "Loading Localts products...";
        statusColor = Color.WHITE;
        localtsUsername = "";
        localtsCredits = -1;
        API_KEY_BOX_RUNNABLE = () -> {
            apiKeyBox.I(true);
            quantityBox.I(false);
        };
        QUANTITY_BOX_RUNNABLE = () -> {
            quantityBox.I(true);
            apiKeyBox.I(false);
        };
        CANCEL_RUNNABLE = () -> aER.a(new AccountManagerScreen(reference));
        OPEN_LATEST_ORDER_RUNNABLE = () -> new Thread(() -> {
            String string = AddLocaltsScreen.apiKeyBox.Yg.trim();
            if (string.isEmpty()) {
                statusMessage = "Enter your Localts API key first";
                statusColor = Color.RED;
                return;
            }
            statusMessage = "Looking for your latest packaged Localts order...";
            statusColor = Color.YELLOW;
            aey aey2 = aew.b(string, 0, 25);
            if (!aey2.aGg) {
                statusMessage = aey2.aGm;
                statusColor = Color.RED;
                return;
            }
            for (JsonElement jsonElement : aey2.aGh) {
                JsonObject jsonObject;
                if (!jsonElement.isJsonObject() || !(jsonObject = jsonElement.getAsJsonObject()).has("id") || jsonObject.get("id").isJsonNull()) continue;
                aex aex2 = aew.z(string, jsonObject.get("id").getAsString());
                if (!aex2.aGa || !"PACKAGED".equalsIgnoreCase(aex2.aGc)) continue;
                AddLocaltsScreen.saveAndOpenOrder(aex2);
                return;
            }
            statusMessage = "No packaged Localts order is ready yet";
            statusColor = Color.YELLOW;
        }, "Localts latest order thread").start();
        CYCLE_PRODUCT_RUNNABLE = () -> {
            if (products.isEmpty()) {
                AddLocaltsScreen.refreshProducts(true);
                return;
            }
            selectedProductIndex = (selectedProductIndex + 1) % products.size();
            afe.bx(AddLocaltsScreen.selectedProduct().aGn);
        };
        CHECK_STATUS_RUNNABLE = () -> new Thread(() -> {
            String string = AddLocaltsScreen.apiKeyBox.Yg.trim();
            if (string.isEmpty()) {
                statusMessage = "Enter your Localts API key first";
                statusColor = Color.RED;
                return;
            }
            AddLocaltsScreen.refreshAccountSummary(string, true);
            afe.bw(string);
            if (products.isEmpty()) {
                AddLocaltsScreen.refreshProducts(false);
            }
        }, "Localts status check thread").start();
        CHECK_STOCK_RUNNABLE = () -> new Thread(() -> {
            statusMessage = "Refreshing Localts products...";
            statusColor = Color.YELLOW;
            AddLocaltsScreen.refreshProducts(true);
            aez aez2 = AddLocaltsScreen.selectedProduct();
            if (aez2 == null) {
                return;
            }
            statusMessage = aez2.aGo + " | Stock: " + aez2.aGs + " | " + aez2.aGr + " credits each";
            statusColor = aez2.aGs > 0 ? Color.GREEN : Color.RED;
        }, "Localts stock check thread").start();
        PURCHASE_RUNNABLE = () -> {
            int n2;
            String string = AddLocaltsScreen.apiKeyBox.Yg.trim();
            if (string.isEmpty()) {
                statusMessage = "Enter your Localts API key first";
                statusColor = Color.RED;
                return;
            }
            try {
                n2 = Integer.parseInt(AddLocaltsScreen.quantityBox.Yg.trim());
                if (n2 < 1) {
                    throw new NumberFormatException();
                }
            }
            catch (NumberFormatException numberFormatException) {
                statusMessage = "Quantity must be a positive number";
                statusColor = Color.RED;
                return;
            }
            aez aez2 = AddLocaltsScreen.selectedProduct();
            if (aez2 == null) {
                statusMessage = "Products are still loading; try again shortly";
                statusColor = Color.YELLOW;
                return;
            }
            if (isPurchasing) {
                statusMessage = "A Localts purchase is already in progress";
                statusColor = Color.YELLOW;
                return;
            }
            afe.bw(string);
            new Thread(() -> AddLocaltsScreen.purchase(string, aez2, n2), "Localts purchase thread").start();
        };
        BACKGROUND_RUNNABLE = () -> {
            cz cz2 = new cz(aER);
            ait.d(0.0, 0.0, cz2.getScaledWidth(), cz2.getScaledHeight(), Color.BLACK);
        };
    }
}

