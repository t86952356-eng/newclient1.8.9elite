/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.websocket.ClientEndpointConfig$Configurator
 */
package rip.vantage.network.handler;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.websocket.ClientEndpointConfig;

public class a
extends ClientEndpointConfig.Configurator {
    public void beforeRequest(Map<String, List<String>> map) {
        map.put("gdfg", Collections.singletonList("fdsgh"));
    }
}

