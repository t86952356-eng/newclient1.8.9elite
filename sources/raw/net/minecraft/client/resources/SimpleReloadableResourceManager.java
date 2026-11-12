/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.resources;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.resources.FallbackResourceManager;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.SimpleReloadableResourceManager$1;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.util.cm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleReloadableResourceManager
implements IReloadableResourceManager {
    private static final Logger cdQ = LogManager.getLogger();
    private static final Joiner cdR = Joiner.on((String)", ");
    private final Map<String, FallbackResourceManager> cdS = Maps.newHashMap();
    private final List<IResourceManagerReloadListener> cdT = Lists.newArrayList();
    private final Set<String> cdU = Sets.newLinkedHashSet();
    private final IMetadataSerializer cdV;

    public SimpleReloadableResourceManager(IMetadataSerializer iMetadataSerializer) {
        this.cdV = iMetadataSerializer;
    }

    public void b(IResourcePack iResourcePack) {
        for (String string : iResourcePack.Ph()) {
            this.cdU.add(string);
            FallbackResourceManager fallbackResourceManager = this.cdS.get(string);
            if (fallbackResourceManager == null) {
                fallbackResourceManager = new FallbackResourceManager(this.cdV);
                this.cdS.put(string, fallbackResourceManager);
            }
            fallbackResourceManager.a(iResourcePack);
        }
    }

    @Override
    public Set<String> Ph() {
        return this.cdU;
    }

    @Override
    public IResource v(cm cm2) {
        IResourceManager iResourceManager = this.cdS.get(cm2.atB());
        if (iResourceManager != null) {
            return iResourceManager.v(cm2);
        }
        throw new FileNotFoundException(cm2.toString());
    }

    @Override
    public List<IResource> w(cm cm2) {
        IResourceManager iResourceManager = this.cdS.get(cm2.atB());
        if (iResourceManager != null) {
            return iResourceManager.w(cm2);
        }
        throw new FileNotFoundException(cm2.toString());
    }

    private void PT() {
        this.cdS.clear();
        this.cdU.clear();
    }

    @Override
    public void v(List<IResourcePack> list) {
        this.PT();
        cdQ.info("Reloading ResourceManager: " + cdR.join(Iterables.transform(list, (Function)new SimpleReloadableResourceManager$1(this))));
        for (IResourcePack iResourcePack : list) {
            this.b(iResourcePack);
        }
        this.PU();
    }

    @Override
    public void a(IResourceManagerReloadListener iResourceManagerReloadListener) {
        this.cdT.add(iResourceManagerReloadListener);
        iResourceManagerReloadListener.a(this);
    }

    private void PU() {
        for (IResourceManagerReloadListener iResourceManagerReloadListener : this.cdT) {
            iResourceManagerReloadListener.a(this);
        }
    }
}

