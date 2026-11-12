/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.resources;

import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.minecraft.client.resources.FallbackResourceManager$InputStreamLeakedResourceLogger;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.SimpleResource;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.util.cm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FallbackResourceManager
implements IResourceManager {
    private static final Logger ccJ = LogManager.getLogger();
    protected final List<IResourcePack> ccK = Lists.newArrayList();
    private final IMetadataSerializer ccL;

    public FallbackResourceManager(IMetadataSerializer iMetadataSerializer) {
        this.ccL = iMetadataSerializer;
    }

    public void a(IResourcePack iResourcePack) {
        this.ccK.add(iResourcePack);
    }

    @Override
    public Set<String> Ph() {
        return null;
    }

    @Override
    public IResource v(cm cm2) {
        IResourcePack iResourcePack = null;
        cm cm3 = FallbackResourceManager.x(cm2);
        for (int i2 = this.ccK.size() - 1; i2 >= 0; --i2) {
            IResourcePack iResourcePack2 = this.ccK.get(i2);
            if (iResourcePack == null && iResourcePack2.s(cm3)) {
                iResourcePack = iResourcePack2;
            }
            if (!iResourcePack2.s(cm2)) continue;
            InputStream inputStream = null;
            if (iResourcePack != null) {
                inputStream = this.a(cm3, iResourcePack);
            }
            return new SimpleResource(iResourcePack2.Pf(), cm2, this.a(cm2, iResourcePack2), inputStream, this.ccL);
        }
        throw new FileNotFoundException(cm2.toString());
    }

    protected InputStream a(cm cm2, IResourcePack iResourcePack) {
        InputStream inputStream = iResourcePack.r(cm2);
        return ccJ.isDebugEnabled() ? new FallbackResourceManager$InputStreamLeakedResourceLogger(inputStream, cm2, iResourcePack.Pf()) : inputStream;
    }

    @Override
    public List<IResource> w(cm cm2) {
        ArrayList arrayList = Lists.newArrayList();
        cm cm3 = FallbackResourceManager.x(cm2);
        for (IResourcePack iResourcePack : this.ccK) {
            if (!iResourcePack.s(cm2)) continue;
            InputStream inputStream = iResourcePack.s(cm3) ? this.a(cm3, iResourcePack) : null;
            arrayList.add(new SimpleResource(iResourcePack.Pf(), cm2, this.a(cm2, iResourcePack), inputStream, this.ccL));
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException(cm2.toString());
        }
        return arrayList;
    }

    static cm x(cm cm2) {
        return new cm(cm2.atB(), cm2.atA() + ".mcmeta");
    }
}

