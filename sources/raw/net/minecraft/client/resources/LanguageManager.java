/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.resources;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.Language;
import net.minecraft.client.resources.Locale;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.client.resources.data.LanguageMetadataSection;
import net.minecraft.util.cs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LanguageManager
implements IResourceManagerReloadListener {
    private static final Logger ccY = LogManager.getLogger();
    private final IMetadataSerializer ccZ;
    private String cda;
    protected static final Locale cdb = new Locale();
    private final Map<String, Language> cdc = Maps.newHashMap();

    public LanguageManager(IMetadataSerializer iMetadataSerializer, String string) {
        this.ccZ = iMetadataSerializer;
        this.cda = string;
        I18n.a(cdb);
    }

    public void w(List<IResourcePack> list) {
        this.cdc.clear();
        for (IResourcePack iResourcePack : list) {
            try {
                LanguageMetadataSection languageMetadataSection = (LanguageMetadataSection)iResourcePack.a(this.ccZ, "language");
                if (languageMetadataSection == null) continue;
                for (Language language : languageMetadataSection.Qe()) {
                    if (this.cdc.containsKey(language.Pn())) continue;
                    this.cdc.put(language.Pn(), language);
                }
            }
            catch (RuntimeException runtimeException) {
                ccY.warn("Unable to parse metadata section of resourcepack: " + iResourcePack.Pf(), (Throwable)runtimeException);
            }
            catch (IOException iOException) {
                ccY.warn("Unable to parse metadata section of resourcepack: " + iResourcePack.Pf(), (Throwable)iOException);
            }
        }
    }

    @Override
    public void a(IResourceManager iResourceManager) {
        ArrayList arrayList = Lists.newArrayList((Object[])new String[]{"en_US"});
        if (!"en_US".equals(this.cda)) {
            arrayList.add(this.cda);
        }
        cdb.a(iResourceManager, arrayList);
        cs.s(LanguageManager.cdb.cdf);
    }

    public boolean Pp() {
        return cdb.Ay();
    }

    public boolean Pq() {
        return this.Pr() != null && this.Pr().Po();
    }

    public void b(Language language) {
        this.cda = language.Pn();
    }

    public Language Pr() {
        return this.cdc.containsKey(this.cda) ? this.cdc.get(this.cda) : this.cdc.get("en_US");
    }

    public SortedSet<Language> Ps() {
        return Sets.newTreeSet(this.cdc.values());
    }
}

