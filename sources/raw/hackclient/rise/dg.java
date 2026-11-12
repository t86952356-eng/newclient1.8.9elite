/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aea;
import hackclient.rise.aih;
import hackclient.rise.aik;
import java.util.List;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.n;
import net.minecraft.nbt.q;
import net.minecraft.nbt.v;

public final class dg
extends net.minecraft.creativetab.a
implements aea {
    public dg() {
        super(12, "rise");
    }

    @Override
    public void c(List<co> list) {
        co co2 = new co(Items.cSn);
        n n2 = new n();
        v v2 = new v();
        v2.a(new q(dg.aER.bgK.gW));
        v2.a(new q(dg.aER.bgK.gX));
        v2.a(new q(dg.aER.bgK.gY));
        n2.o("Invisible", true);
        n2.o("NoGravity", true);
        n2.o("CustomNameVisible", true);
        n2.R("CustomName", "Rise Client");
        n2.b("Pos", v2);
        n2.b("pose", v2);
        co2.a("EntityTag", n2);
        co2.ey("\u00a7rHologram");
        list.add(co2);
        co co3 = new co(Items.cSn);
        n n3 = new n();
        v v3 = new v();
        v3.a(new q(dg.aER.bgK.gW));
        v3.a(new q(dg.aER.bgK.gX));
        v3.a(new q(dg.aER.bgK.gY));
        n3.o("Invisible", true);
        n3.o("NoGravity", true);
        n3.o("CustomNameVisible", true);
        n3.R("CustomName", "\"Rise Client\"");
        n3.b("Pos", v3);
        co3.a("EntityTag", n3);
        co3.ey("\u00a7rHologram (Via Version)");
        list.add(co3);
        list.add(aih.F("Suspicious", "https://education.minecraft.net/wp-content/uploads/server.jpg"));
        list.add(aih.F("Hentai", "https://education.minecraft.net/wp-content/uploads/cock.png"));
        co co4 = aih.cg("anvil 1 100");
        co4.ey("\u00a7rSpawn Imposter");
        list.add(co4);
        co co5 = aih.cg("potion 1 16385 {CustomPotionEffects:[{Id:6,Amplifier:125,Duration:1000000}]}");
        co5.ey("\u00a7rSplash Potion of Instant Death");
        list.add(co5);
        list.add(aih.cg("dragon_egg"));
        list.add(aih.cg("barrier"));
        list.add(aih.cg("command_block"));
        list.add(aih.cg("command_block_minecart"));
        co co6 = aih.cg("stone_slab 1 2");
        co6.ey("\u00a7rAlpha Slab");
        list.add(co6);
        co co7 = aih.cg("leaves 1 4");
        co7.ey("\u00a7rAlpha Leaves");
        list.add(co7);
        list.add(aih.cg("tallgrass 1 0"));
        co co8 = aih.cg("potion 1 16385 {CustomPotionEffects:[{Id:15,Amplifier:2,Duration:1000000},{Id:2,Amplifier:2,Duration:1000000},{Id:9,Amplifier:2,Duration:1000000},{Id:19,Amplifier:2,Duration:1000000},{Id:20,Amplifier:2,Duration:1000000},{Id:18,Amplifier:2,Duration:1000000},{Id:17,Amplifier:2,Duration:1000000},{Id:14,Amplifier:2,Duration:1000000},{Id:4,Amplifier:2,Duration:1000000}]}");
        co8.ey("\u00a7rSplash Potion of Annoyance");
        list.add(co8);
        co co9 = aih.cg("potion 1 16385 {CustomPotionEffects:[{Id:14,Duration:1000000,ShowParticles:0b}]}");
        co9.ey("\u00a7rSplash Potion of Infinite Invisibility");
        list.add(co9);
        co co10 = aih.cg("diamond_sword 1 0 {ench:[{id:19,lvl:32767},{id:20,lvl:32767},{id:18,lvl:32767},{id:16,lvl:32767},{id:17,lvl:32767}],Unbreakable:1}");
        co10.ey("\u00a7r\u00a7b\u00a7lGod Sword");
        list.add(co10);
        co co11 = aih.cg("bow 1 0 {ench:[{id:48,lvl:32767},{id:49,lvl:32767},{id:50,lvl:32767},{id:51,lvl:32767},{id:19,lvl:32767}],Unbreakable:1}");
        co11.ey("\u00a7r\u00a7b\u00a7lGod Bow");
        list.add(co11);
        co co12 = aih.cg("diamond_helmet 1 0 {ench:[{id:0,lvl:32767},{id:6,lvl:32767},{id:3,lvl:32767},{id:1,lvl:32767},{id:7,lvl:32767},{id:4,lvl:32767}],Unbreakable:1}");
        co12.ey("\u00a7r\u00a7b\u00a7lGod Helmet");
        list.add(co12);
        co co13 = aih.cg("diamond_chestplate 1 0  {ench:[{id:0,lvl:32767},{id:3,lvl:32767},{id:1,lvl:32767},{id:7,lvl:32767}],Unbreakable:1}");
        co13.ey("\u00a7r\u00a7b\u00a7lGod Chestplate");
        list.add(co13);
        co co14 = aih.cg("diamond_leggings 1 0  {ench:[{id:0,lvl:32767},{id:3,lvl:32767},{id:1,lvl:32767},{id:7,lvl:32767}],Unbreakable:1}");
        co14.ey("\u00a7r\u00a7b\u00a7lGod Leggings");
        list.add(co14);
        co co15 = aih.cg("diamond_boots 1 0  {ench:[{id:0,lvl:32767},{id:8,lvl:32767},{id:3,lvl:32767},{id:1,lvl:32767},{id:7,lvl:32767}],Unbreakable:1}");
        co15.ey("\u00a7r\u00a7b\u00a7lGod Boots");
        list.add(co15);
        co co16 = aih.cg("sign 1 0 {BlockEntityTag:{Text1:\"{\\\"text\\\":\\\"Right click me for an easter egg!\\\",\\\"clickEvent\\\":{\\\"action\\\":\\\"run_command\\\",\\\"value\\\":\\\"/op " + aik.R() + "\\\"}}\"}}");
        co16.ey("\u00a7rOP Sign");
        list.add(co16);
        co co17 = aih.cg("written_book 1 0 {pages:[\"{\\\"text\\\":\\\"Click me for an Easter Egg!\\\",\\\"clickEvent\\\":{\\\"action\\\":\\\"run_command\\\",\\\"value\\\":\\\"/op " + aik.R() + "\\\"}}\"],title:\"Easter Egg\",author:" + aik.R() + "}");
        list.add(co17);
    }

    @Override
    public String cD() {
        return a.b;
    }

    @Override
    public d cE() {
        return Items.cPm;
    }
}

