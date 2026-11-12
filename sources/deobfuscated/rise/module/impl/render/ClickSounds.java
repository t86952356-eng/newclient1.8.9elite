/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.RandomUtils
 */
package rise.module.impl.render;

import hackclient.rise.aju;
import hackclient.rise.aks;
import org.apache.commons.lang3.RandomUtils;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.ClickEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.value.ModeValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.other.clicksounds.name"}, description="module.other.clicksounds.description", category=Category.RENDER)
public final class ClickSounds
extends Module {
    private final ModeValue Uo = new ModeValue("Sound", this).a(new Mode[]{new aks("Standard")}).a(new Mode[]{new aks("Double")}).a(new Mode[]{new aks("Alan")}).co("Standard");
    private final NumberValue Up = new NumberValue("Volume", this, (Number)0.5, (Number)0.1, (Number)2, (Number)0.1);
    private final NumberValue Uq = new NumberValue("Variation", this, (Number)5, (Number)0, (Number)100, (Number)1);
    @EventLink
    public final Listener<ClickEvent> Ur = clickEvent -> {
        String string = "rise.click.standard";
        switch (((Mode)this.Uo.wD()).getName()) {
            case "Double": {
                string = "rise.click.double";
                break;
            }
            case "Alan": {
                string = "rise.click.alan";
            }
        }
        aju.a(string, ((Number)this.Up.wD()).floatValue(), RandomUtils.nextFloat((float)1.0f, (float)(1.0f + ((Number)this.Uq.wD()).floatValue() / 100.0f)));
    };
}

