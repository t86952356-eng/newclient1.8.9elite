/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package rise.module;

import hackclient.rise.ahd;
import hackclient.rise.ahe;
import hackclient.rise.ahg;
import hackclient.rise.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Generated;
import rise.Client;
import rise.event.impl.ModuleToggleEvent;
import rise.module.Mode;
import rise.module.ModuleInfo;
import rise.util.InstanceAccess;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.Value;

public abstract class Module
implements InstanceAccess,
ahd,
ahe,
p {
    private String[] aliases;
    private final List<Value<?>> values = new ArrayList();
    private ModuleInfo moduleInfo;
    private boolean enabled;
    private int key;

    public Module() {
        if (!this.getClass().isAnnotationPresent(ModuleInfo.class)) {
            throw new RuntimeException("ModuleInfo annotation not found on " + this.getClass().getSimpleName());
        }
        this.moduleInfo = this.getClass().getAnnotation(ModuleInfo.class);
        this.aliases = (String[])Arrays.stream(this.moduleInfo.aliases()).map(ahg::cf).toArray(String[]::new);
        this.key = this.getModuleInfo().keyBind();
    }

    public Module(ModuleInfo moduleInfo) {
        this.moduleInfo = moduleInfo;
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
        Client.a.e().d(new ModuleToggleEvent(this));
        if (bl2) {
            this.superEnable();
        } else {
            this.superDisable();
        }
    }

    public final void superEnable() {
        Client.a.e().b(this);
        this.values.stream().filter(value -> value instanceof ModeValue).forEach(value -> ((Mode)((ModeValue)value).wD()).a());
        this.values.stream().filter(value -> value instanceof BooleanValue).forEach(value -> {
            BooleanValue booleanValue = (BooleanValue)value;
            if (booleanValue.wJ() != null && ((Boolean)booleanValue.wD()).booleanValue()) {
                booleanValue.wJ().a();
            }
        });
        this.onEnable();
    }

    public final void superDisable() {
        Client.a.e().c(this);
        this.values.stream().filter(value -> value instanceof ModeValue).forEach(value -> ((Mode)((ModeValue)value).wD()).unregister());
        this.values.stream().filter(value -> value instanceof BooleanValue).forEach(value -> {
            BooleanValue booleanValue = (BooleanValue)value;
            if (booleanValue.wJ() != null) {
                booleanValue.wJ().unregister();
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

    public List<Value<?>> getAllValues() {
        ArrayList arrayList = new ArrayList();
        this.values.forEach(value -> {
            List<Value<?>> list = value.wz();
            arrayList.add((Value<?>)value);
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
    public List<Value<?>> getValues() {
        return this.values;
    }

    @Generated
    public ModuleInfo getModuleInfo() {
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
    public void setModuleInfo(ModuleInfo moduleInfo) {
        this.moduleInfo = moduleInfo;
    }

    @Override
    @Generated
    public void setKey(int n2) {
        this.key = n2;
    }
}

