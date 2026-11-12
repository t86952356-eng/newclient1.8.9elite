/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.RandomUtils
 */
package hackclient.rise;

import hackclient.rise.aju;
import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dr;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import org.apache.commons.lang3.RandomUtils;

@gl(aliases={"module.other.clicksounds.name"}, description="module.other.clicksounds.description", category=gj.RENDER)
public final class rs
extends gi {
    private final akp Uo = new akp("Sound", this).a(new akg[]{new aks("Standard")}).a(new akg[]{new aks("Double")}).a(new akg[]{new aks("Alan")}).co("Standard");
    private final akq Up = new akq("Volume", this, (Number)0.5, (Number)0.1, (Number)2, (Number)0.1);
    private final akq Uq = new akq("Variation", this, (Number)5, (Number)0, (Number)100, (Number)1);
    @dm
    public final dk<dr> Ur = dr2 -> {
        String string = "rise.click.standard";
        switch (((akg)this.Uo.wD()).getName()) {
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

