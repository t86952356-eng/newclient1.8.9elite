/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.aea;
import hackclient.rise.ahd;
import hackclient.rise.ahe;
import hackclient.rise.ahg;
import hackclient.rise.akg;
import hackclient.rise.akh;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.ey;
import hackclient.rise.gl;
import hackclient.rise.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Generated;

public abstract class gi
implements aea,
ahd,
ahe,
p {
    private String[] aliases;
    private final List<akh<?>> values = new ArrayList();
    private gl moduleInfo;
    private boolean enabled;
    private int key;

    public gi() {
        if (!this.getClass().isAnnotationPresent(gl.class)) {
            throw new RuntimeException("ModuleInfo annotation not found on " + this.getClass().getSimpleName());
        }
        this.moduleInfo = this.getClass().getAnnotation(gl.class);
        this.aliases = (String[])Arrays.stream(this.moduleInfo.aliases()).map(ahg::cf).toArray(String[]::new);
        this.key = this.getModuleInfo().keyBind();
    }

    public gi(gl gl2) {
        this.moduleInfo = gl2;
        this.aliases = this.moduleInfo.aliases();
        this.key = this.getModuleInfo().keyBind();
    }

    @Override
    public String getName() {
        return this.aliases[0];
    }

    @Override
    public void onKey() {
        this.toggle();
    }

    @Override
    public int getKey() {
        return this.key;
    }

    @Override
    public void toggle() {
        this.setEnabled(!this.enabled);
    }

    public void setEnabled(boolean bl2) {
        if (this.enabled == bl2 || !this.moduleInfo.allowDisable() && !bl2) {
            return;
        }
        this.enabled = bl2;
        a.a.e().d(new ey(this));
        if (bl2) {
            this.superEnable();
        } else {
            this.superDisable();
        }
    }

    public final void superEnable() {
        a.a.e().b(this);
        this.values.stream().filter(akh2 -> akh2 instanceof akp).forEach(akh2 -> ((akg)((akp)akh2).wD()).a());
        this.values.stream().filter(akh2 -> akh2 instanceof aki).forEach(akh2 -> {
            aki aki2 = (aki)akh2;
            if (aki2.wJ() != null && ((Boolean)aki2.wD()).booleanValue()) {
                aki2.wJ().a();
            }
        });
        this.onEnable();
    }

    public final void superDisable() {
        a.a.e().c(this);
        this.values.stream().filter(akh2 -> akh2 instanceof akp).forEach(akh2 -> ((akg)((akp)akh2).wD()).unregister());
        this.values.stream().filter(akh2 -> akh2 instanceof aki).forEach(akh2 -> {
            aki aki2 = (aki)akh2;
            if (aki2.wJ() != null) {
                aki2.wJ().unregister();
            }
        });
        this.onDisable();
    }

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }

    public List<akh<?>> getAllValues() {
        ArrayList arrayList = new ArrayList();
        this.values.forEach(akh2 -> {
            List<akh<?>> list = akh2.wz();
            arrayList.add((akh<?>)akh2);
            if (list != null) {
                arrayList.addAll(list);
            }
        });
        return arrayList;
    }

    @Override
    @Generated
    public String[] getAliases() {
        return this.aliases;
    }

    @Generated
    public List<akh<?>> getValues() {
        return this.values;
    }

    @Generated
    public gl getModuleInfo() {
        return this.moduleInfo;
    }

    @Generated
    public boolean isEnabled() {
        return this.enabled;
    }

    @Generated
    public void setAliases(String[] stringArray) {
        this.aliases = stringArray;
    }

    @Generated
    public void setModuleInfo(gl gl2) {
        this.moduleInfo = gl2;
    }

    @Override
    @Generated
    public void setKey(int n2) {
        this.key = n2;
    }
}

