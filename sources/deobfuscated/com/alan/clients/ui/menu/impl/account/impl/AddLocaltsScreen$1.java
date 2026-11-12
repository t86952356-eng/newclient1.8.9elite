/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.ui.menu.impl.account.impl;

import com.alan.clients.ui.menu.impl.account.impl.AddLocaltsScreen;
import hackclient.rise.aez;
import java.util.Comparator;

class AddLocaltsScreen$1
implements Comparator<aez> {
    AddLocaltsScreen$1() {
    }

    @Override
    public int compare(aez aez2, aez aez3) {
        int n2 = AddLocaltsScreen.productPriority(aez2) - AddLocaltsScreen.productPriority(aez3);
        return n2 != 0 ? n2 : aez2.aGo.compareToIgnoreCase(aez3.aGo);
    }
}

