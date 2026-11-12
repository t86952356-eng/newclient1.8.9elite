/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.yh;
import hackclient.rise.yi;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.a;
import net.minecraft.client.gui.ar;
import net.minecraft.client.gui.cr;
import net.minecraft.util.ba;
import rise.Client;
import rise.module.impl.render.Chat;
import rise.module.impl.render.UnlimitedChat;

public class yo
extends ar {
    private Chat asO;

    public yo(Minecraft minecraft) {
        super(minecraft);
    }

    @Override
    public void a(ba ba2, int n2, int n3, boolean bl2) {
        int n4;
        Object object;
        if (this.asO == null) {
            this.asO = Client.a.g().c(Chat.class);
        }
        System.out.println("[ChatImage] RiseGuiNewChat#setChatLine text=" + ba2.arq());
        if (n2 != 0) {
            this.bF(n2);
        }
        int n5 = (int)(this.asO.mR().aHP.x - 19.0);
        List<ba> list = cr.a(ba2, n5, this.bpW.fontRendererObj, false, false);
        boolean bl3 = this.EV();
        List<Object> list2 = Collections.emptyList();
        if (((Boolean)this.asO.mP().wD()).booleanValue()) {
            String string = ba2.arq();
            object = this.asO.mQ();
            list2 = ((yi)object).Y(string);
            System.out.println("[ChatImage] detected urls=" + String.valueOf(list2));
            for (String string2 : list2) {
                ((yi)object).b(new yh(string2, n3, n2));
            }
        }
        for (int i2 = 0; i2 < list.size(); ++i2) {
            object = list.get(i2);
            if (bl3 && this.bqa > 0) {
                this.bqb = true;
                this.scroll(1);
            }
            boolean bl4 = !list2.isEmpty() && i2 == list.size() - 1;
            this.bpZ.addFirst(new a(n3, (ba)object, n2, ba2, bl4));
        }
        UnlimitedChat unlimitedChat = Client.a.g().c(UnlimitedChat.class);
        int n6 = n4 = unlimitedChat == null || !unlimitedChat.isEnabled() ? 200 : 10000;
        while (this.bpZ.size() > n4) {
            this.bpZ.removeLast();
        }
        if (!bl2) {
            this.bpY.addFirst(new a(n3, ba2, n2));
            while (this.bpY.size() > n4) {
                this.bpY.removeLast();
            }
        }
    }
}

