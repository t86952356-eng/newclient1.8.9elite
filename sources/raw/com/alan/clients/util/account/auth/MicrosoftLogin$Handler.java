/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.http.NameValuePair
 *  org.apache.http.client.utils.URLEncodedUtils
 */
package com.alan.clients.util.account.auth;

import com.alan.clients.util.account.auth.MicrosoftLogin;
import com.alan.clients.util.account.auth.a;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import hackclient.rise.akf;
import java.io.OutputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

class MicrosoftLogin$Handler
implements HttpHandler {
    private MicrosoftLogin$Handler() {
    }

    @Override
    public void handle(HttpExchange httpExchange) {
        if (httpExchange.getRequestMethod().equals("GET")) {
            List list = URLEncodedUtils.parse((URI)httpExchange.getRequestURI(), (String)StandardCharsets.UTF_8.name());
            boolean bl2 = false;
            for (NameValuePair nameValuePair : list) {
                if (!nameValuePair.getName().equals("code")) continue;
                this.bk(nameValuePair.getValue());
                bl2 = true;
                break;
            }
            if (!bl2) {
                this.a(httpExchange, "Cannot authenticate.");
            } else {
                this.a(httpExchange, "<html>You may now close this page, if you didn't specify an account then clear your cookies to select an individual one.</html>");
            }
        }
        MicrosoftLogin.stopServer();
    }

    private void bk(String string) {
        String string2 = akf.a("https://login.live.com/oauth20_token.srf", "client_id=ba89e6e0-8490-4a26-8746-f389a0d3ccc7&code=" + string + "&client_secret=REDACTED_MICROSOFT_CLIENT_SECRET&grant_type=authorization_code&redirect_uri=http://localhost:8247", false);
        a a2 = (a)MicrosoftLogin.gson.fromJson(string2, a.class);
        if (a2 == null) {
            MicrosoftLogin.callback.accept(null);
        } else {
            MicrosoftLogin.callback.accept(a2.aFG);
        }
    }

    private void a(HttpExchange httpExchange, String string) {
        OutputStream outputStream = httpExchange.getResponseBody();
        httpExchange.getResponseHeaders().add("Content-Type", "text/html; charset=utf-8");
        httpExchange.sendResponseHeaders(200, string.length());
        outputStream.write(string.getBytes(StandardCharsets.UTF_8));
        outputStream.flush();
        outputStream.close();
    }
}

