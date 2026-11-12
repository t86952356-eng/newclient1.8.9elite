/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.client.resources.model;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.BlockPart;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.client.renderer.block.model.FaceBakery;
import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variant;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variants;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.model.BuiltInModel;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelBakery$1;
import net.minecraft.client.resources.model.ModelBakery$2;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.client.resources.model.ModelRotation;
import net.minecraft.client.resources.model.SimpleBakedModel$Builder;
import net.minecraft.client.resources.model.WeightedBakedModel$Builder;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.util.ao;
import net.minecraft.util.bf;
import net.minecraft.util.ck;
import net.minecraft.util.cm;
import net.minecraftforge.client.model.d;
import net.minecraftforge.client.model.e;
import net.minecraftforge.fml.common.registry.a;
import net.optifine.ae;
import net.optifine.reflect.g;
import net.optifine.util.aj;
import net.optifine.util.ak;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModelBakery {
    private static final Set<cm> ceP = Sets.newHashSet((Object[])new cm[]{new cm("blocks/water_flow"), new cm("blocks/water_still"), new cm("blocks/lava_flow"), new cm("blocks/lava_still"), new cm("blocks/destroy_stage_0"), new cm("blocks/destroy_stage_1"), new cm("blocks/destroy_stage_2"), new cm("blocks/destroy_stage_3"), new cm("blocks/destroy_stage_4"), new cm("blocks/destroy_stage_5"), new cm("blocks/destroy_stage_6"), new cm("blocks/destroy_stage_7"), new cm("blocks/destroy_stage_8"), new cm("blocks/destroy_stage_9"), new cm("items/empty_armor_slot_helmet"), new cm("items/empty_armor_slot_chestplate"), new cm("items/empty_armor_slot_leggings"), new cm("items/empty_armor_slot_boots")});
    private static final Logger ceQ = LogManager.getLogger();
    protected static final ModelResourceLocation ceR = new ModelResourceLocation("builtin/missing", "missing");
    private static final Map<String, String> ceS = Maps.newHashMap();
    private static final Joiner ceT = Joiner.on((String)" -> ");
    private final IResourceManager ceU;
    private final Map<cm, TextureAtlasSprite> ceV = Maps.newHashMap();
    private final Map<cm, ModelBlock> ceW = Maps.newLinkedHashMap();
    private final Map<ModelResourceLocation, ModelBlockDefinition$Variants> ceX = Maps.newLinkedHashMap();
    private final TextureMap ceY;
    private final BlockModelShapes ceZ;
    private final FaceBakery cfa = new FaceBakery();
    private final ItemModelGenerator cfb = new ItemModelGenerator();
    private final ck<ModelResourceLocation, IBakedModel> cfc = new ck();
    private static final ModelBlock cfd = ModelBlock.dh("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
    private static final ModelBlock cfe = ModelBlock.dh("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
    private static final ModelBlock cff = ModelBlock.dh("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
    private static final ModelBlock cfg = ModelBlock.dh("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
    private final Map<String, cm> cfh = Maps.newLinkedHashMap();
    private final Map<cm, ModelBlockDefinition> cfi = Maps.newHashMap();
    private final Map<net.minecraft.item.d, List<String>> cfj = Maps.newIdentityHashMap();
    private static final Map<a<net.minecraft.item.d>, Set<String>> cfk = Maps.newHashMap();

    public ModelBakery(IResourceManager iResourceManager, TextureMap textureMap, BlockModelShapes blockModelShapes) {
        this.ceU = iResourceManager;
        this.ceY = textureMap;
        this.ceZ = blockModelShapes;
    }

    public bf<ModelResourceLocation, IBakedModel> Qo() {
        this.Qp();
        this.Qv();
        this.Qx();
        this.Qz();
        this.Qt();
        return this.cfc;
    }

    private void Qp() {
        this.b(this.ceZ.IU().MB().values());
        this.ceX.put(ceR, new ModelBlockDefinition$Variants(ceR.ts(), Lists.newArrayList((Object[])new ModelBlockDefinition$Variant[]{new ModelBlockDefinition$Variant(new cm(ceR.atA()), ModelRotation.cfs, false, 1)})));
        cm cm2 = new cm("item_frame");
        ModelBlockDefinition modelBlockDefinition = this.y(cm2);
        this.a(modelBlockDefinition, new ModelResourceLocation(cm2, "normal"));
        this.a(modelBlockDefinition, new ModelResourceLocation(cm2, "map"));
        this.Qq();
        this.Qr();
    }

    private void b(Collection<ModelResourceLocation> collection) {
        for (ModelResourceLocation modelResourceLocation : collection) {
            try {
                ModelBlockDefinition modelBlockDefinition = this.y(modelResourceLocation);
                try {
                    this.a(modelBlockDefinition, modelResourceLocation);
                }
                catch (Exception exception) {
                    ceQ.warn("Unable to load variant: " + modelResourceLocation.ts() + " from " + String.valueOf(modelResourceLocation), (Throwable)exception);
                }
            }
            catch (Exception exception) {
                ceQ.warn("Unable to load definition " + String.valueOf(modelResourceLocation), (Throwable)exception);
            }
        }
    }

    private void a(ModelBlockDefinition modelBlockDefinition, ModelResourceLocation modelResourceLocation) {
        this.ceX.put(modelResourceLocation, modelBlockDefinition.dl(modelResourceLocation.ts()));
    }

    private ModelBlockDefinition y(cm cm2) {
        cm cm3 = this.z(cm2);
        ModelBlockDefinition modelBlockDefinition = this.cfi.get(cm3);
        if (modelBlockDefinition == null) {
            ArrayList arrayList = Lists.newArrayList();
            try {
                for (IResource iResource : this.ceU.w(cm3)) {
                    InputStream inputStream = null;
                    try {
                        inputStream = iResource.getInputStream();
                        ModelBlockDefinition modelBlockDefinition2 = ModelBlockDefinition.b(new InputStreamReader(inputStream, Charsets.UTF_8));
                        arrayList.add(modelBlockDefinition2);
                    }
                    catch (Exception exception) {
                        throw new RuntimeException("Encountered an exception when loading model definition of '" + String.valueOf(cm2) + "' from: '" + String.valueOf(iResource.Pk()) + "' in resourcepack: '" + iResource.Pm() + "'", exception);
                    }
                    finally {
                        IOUtils.closeQuietly((InputStream)inputStream);
                    }
                }
            }
            catch (IOException iOException) {
                throw new RuntimeException("Encountered an exception when loading model definition of model " + String.valueOf(cm3), iOException);
            }
            modelBlockDefinition = new ModelBlockDefinition(arrayList);
            this.cfi.put(cm3, modelBlockDefinition);
        }
        return modelBlockDefinition;
    }

    private cm z(cm cm2) {
        return new cm(cm2.atB(), "blockstates/" + cm2.atA() + ".json");
    }

    private void Qq() {
        for (ModelResourceLocation modelResourceLocation : this.ceX.keySet()) {
            for (ModelBlockDefinition$Variant modelBlockDefinition$Variant : this.ceX.get(modelResourceLocation).MA()) {
                cm cm2 = modelBlockDefinition$Variant.Mx();
                if (this.ceW.get(cm2) != null) continue;
                try {
                    ModelBlock modelBlock = this.A(cm2);
                    this.ceW.put(cm2, modelBlock);
                }
                catch (Exception exception) {
                    ceQ.warn("Unable to load block model: '" + String.valueOf(cm2) + "' for variant: '" + String.valueOf(modelResourceLocation) + "'", (Throwable)exception);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private ModelBlock A(cm cm2) {
        Reader reader;
        Object object;
        Object object2;
        String string = cm2.atA();
        if ("builtin/generated".equals(string)) {
            return cfd;
        }
        if ("builtin/compass".equals(string)) {
            return cfe;
        }
        if ("builtin/clock".equals(string)) {
            return cff;
        }
        if ("builtin/entity".equals(string)) {
            return cfg;
        }
        if (string.startsWith("builtin/")) {
            object2 = string.substring("builtin/".length());
            object = ceS.get(object2);
            if (object == null) {
                throw new FileNotFoundException(cm2.toString());
            }
            reader = new StringReader((String)object);
        } else {
            cm2 = this.B(cm2);
            object2 = this.ceU.v(cm2);
            reader = new InputStreamReader(object2.getInputStream(), Charsets.UTF_8);
        }
        try {
            object = ModelBlock.a(reader);
            ((ModelBlock)object).gK = cm2.toString();
            object2 = object;
            String string2 = ak.kf(cm2.atA());
            ModelBakery.a((ModelBlock)object, string2);
        }
        finally {
            reader.close();
        }
        return object2;
    }

    private cm B(cm cm2) {
        cm cm3 = cm2;
        String string = cm2.atA();
        if (!string.startsWith("mcpatcher") && !string.startsWith("optifine")) {
            return new cm(cm2.atB(), "models/" + cm2.atA() + ".json");
        }
        if (!string.endsWith(".json")) {
            cm3 = new cm(cm2.atB(), string + ".json");
        }
        return cm3;
    }

    private void Qr() {
        this.Qs();
        for (net.minecraft.item.d d2 : net.minecraft.item.d.cVi) {
            for (String string : this.h(d2)) {
                cm cm2 = this.dz(string);
                this.cfh.put(string, cm2);
                if (this.ceW.get(cm2) != null) continue;
                try {
                    ModelBlock modelBlock = this.A(cm2);
                    this.ceW.put(cm2, modelBlock);
                }
                catch (Exception exception) {
                    ceQ.warn("Unable to load item model: '" + String.valueOf(cm2) + "' for item: '" + String.valueOf(net.minecraft.item.d.cVi.y(d2)) + "'", (Throwable)exception);
                }
            }
        }
    }

    public void a(String string, cm cm2, cm cm3) {
        this.cfh.put(string, cm2);
        if (this.ceW.get(cm2) == null) {
            try {
                ModelBlock modelBlock = this.A(cm2);
                this.ceW.put(cm2, modelBlock);
            }
            catch (Exception exception) {
                ceQ.warn("Unable to load item model: '{}' for item: '{}'", new Object[]{cm2, cm3});
                ceQ.warn(exception.getClass().getName() + ": " + exception.getMessage());
            }
        }
    }

    private void Qs() {
        this.cfj.clear();
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLd), Lists.newArrayList((Object[])new String[]{"stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLf), Lists.newArrayList((Object[])new String[]{"dirt", "coarse_dirt", "podzol"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLh), Lists.newArrayList((Object[])new String[]{"oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLi), Lists.newArrayList((Object[])new String[]{"oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLo), Lists.newArrayList((Object[])new String[]{"sand", "red_sand"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLt), Lists.newArrayList((Object[])new String[]{"oak_log", "spruce_log", "birch_log", "jungle_log"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLv), Lists.newArrayList((Object[])new String[]{"oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLx), Lists.newArrayList((Object[])new String[]{"sponge", "sponge_wet"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLC), Lists.newArrayList((Object[])new String[]{"sandstone", "chiseled_sandstone", "smooth_sandstone"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cOO), Lists.newArrayList((Object[])new String[]{"red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLJ), Lists.newArrayList((Object[])new String[]{"dead_bush", "tall_grass", "fern"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLK), Lists.newArrayList((Object[])new String[]{"dead_bush"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLN), Lists.newArrayList((Object[])new String[]{"black_wool", "red_wool", "green_wool", "brown_wool", "blue_wool", "purple_wool", "cyan_wool", "silver_wool", "gray_wool", "pink_wool", "lime_wool", "yellow_wool", "light_blue_wool", "magenta_wool", "orange_wool", "white_wool"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLP), Lists.newArrayList((Object[])new String[]{"dandelion"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLQ), Lists.newArrayList((Object[])new String[]{"poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLW), Lists.newArrayList((Object[])new String[]{"stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cOR), Lists.newArrayList((Object[])new String[]{"red_sandstone_slab"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cOI), Lists.newArrayList((Object[])new String[]{"black_stained_glass", "red_stained_glass", "green_stained_glass", "brown_stained_glass", "blue_stained_glass", "purple_stained_glass", "cyan_stained_glass", "silver_stained_glass", "gray_stained_glass", "pink_stained_glass", "lime_stained_glass", "yellow_stained_glass", "light_blue_stained_glass", "magenta_stained_glass", "orange_stained_glass", "white_stained_glass"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cNg), Lists.newArrayList((Object[])new String[]{"stone_monster_egg", "cobblestone_monster_egg", "stone_brick_monster_egg", "mossy_brick_monster_egg", "cracked_brick_monster_egg", "chiseled_brick_monster_egg"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cNh), Lists.newArrayList((Object[])new String[]{"stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cNO), Lists.newArrayList((Object[])new String[]{"oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cOb), Lists.newArrayList((Object[])new String[]{"cobblestone_wall", "mossy_cobblestone_wall"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cOh), Lists.newArrayList((Object[])new String[]{"anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cOs), Lists.newArrayList((Object[])new String[]{"quartz_block", "chiseled_quartz_block", "quartz_column"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cOw), Lists.newArrayList((Object[])new String[]{"black_stained_hardened_clay", "red_stained_hardened_clay", "green_stained_hardened_clay", "brown_stained_hardened_clay", "blue_stained_hardened_clay", "purple_stained_hardened_clay", "cyan_stained_hardened_clay", "silver_stained_hardened_clay", "gray_stained_hardened_clay", "pink_stained_hardened_clay", "lime_stained_hardened_clay", "yellow_stained_hardened_clay", "light_blue_stained_hardened_clay", "magenta_stained_hardened_clay", "orange_stained_hardened_clay", "white_stained_hardened_clay"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cOJ), Lists.newArrayList((Object[])new String[]{"black_stained_glass_pane", "red_stained_glass_pane", "green_stained_glass_pane", "brown_stained_glass_pane", "blue_stained_glass_pane", "purple_stained_glass_pane", "cyan_stained_glass_pane", "silver_stained_glass_pane", "gray_stained_glass_pane", "pink_stained_glass_pane", "lime_stained_glass_pane", "yellow_stained_glass_pane", "light_blue_stained_glass_pane", "magenta_stained_glass_pane", "orange_stained_glass_pane", "white_stained_glass_pane"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLw), Lists.newArrayList((Object[])new String[]{"acacia_leaves", "dark_oak_leaves"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cLu), Lists.newArrayList((Object[])new String[]{"acacia_log", "dark_oak_log"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cOK), Lists.newArrayList((Object[])new String[]{"prismarine", "prismarine_bricks", "dark_prismarine"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cOA), Lists.newArrayList((Object[])new String[]{"black_carpet", "red_carpet", "green_carpet", "brown_carpet", "blue_carpet", "purple_carpet", "cyan_carpet", "silver_carpet", "gray_carpet", "pink_carpet", "lime_carpet", "yellow_carpet", "light_blue_carpet", "magenta_carpet", "orange_carpet", "white_carpet"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cOH), Lists.newArrayList((Object[])new String[]{"sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia"}));
        this.cfj.put(Items.cPj, Lists.newArrayList((Object[])new String[]{"bow", "bow_pulling_0", "bow_pulling_1", "bow_pulling_2"}));
        this.cfj.put(Items.cPl, Lists.newArrayList((Object[])new String[]{"coal", "charcoal"}));
        this.cfj.put(Items.cQV, Lists.newArrayList((Object[])new String[]{"fishing_rod", "fishing_rod_cast"}));
        this.cfj.put(Items.cQY, Lists.newArrayList((Object[])new String[]{"cod", "salmon", "clownfish", "pufferfish"}));
        this.cfj.put(Items.cQZ, Lists.newArrayList((Object[])new String[]{"cooked_cod", "cooked_salmon"}));
        this.cfj.put(Items.cRa, Lists.newArrayList((Object[])new String[]{"dye_black", "dye_red", "dye_green", "dye_brown", "dye_blue", "dye_purple", "dye_cyan", "dye_silver", "dye_gray", "dye_pink", "dye_lime", "dye_yellow", "dye_light_blue", "dye_magenta", "dye_orange", "dye_white"}));
        this.cfj.put(Items.cRD, Lists.newArrayList((Object[])new String[]{"bottle_drinkable", "bottle_splash"}));
        this.cfj.put(Items.cSb, Lists.newArrayList((Object[])new String[]{"skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cNq), Lists.newArrayList((Object[])new String[]{"oak_fence_gate"}));
        this.cfj.put(net.minecraft.item.d.I(Blocks.cMQ), Lists.newArrayList((Object[])new String[]{"oak_fence"}));
        this.cfj.put(Items.cQu, Lists.newArrayList((Object[])new String[]{"oak_door"}));
        for (Map.Entry<a<net.minecraft.item.d>, Set<String>> entry : cfk.entrySet()) {
            this.cfj.put(entry.getKey().jw(), Lists.newArrayList(entry.getValue().iterator()));
        }
        ae.jA();
        ae.a(this);
    }

    private List<String> h(net.minecraft.item.d d2) {
        List<String> list = this.cfj.get(d2);
        if (list == null) {
            list = Collections.singletonList(net.minecraft.item.d.cVi.y(d2).toString());
        }
        return list;
    }

    private cm dz(String string) {
        cm cm2 = new cm(string);
        if (g.eoT.aDA()) {
            cm2 = new cm(string.replaceAll("#.*", ""));
        }
        return new cm(cm2.atB(), "item/" + cm2.atA());
    }

    private void Qt() {
        Object object;
        Object object2;
        for (ModelResourceLocation object3 : this.ceX.keySet()) {
            object2 = new WeightedBakedModel$Builder();
            int modelResourceLocation = 0;
            object = this.ceX.get(object3).MA().iterator();
            while (object.hasNext()) {
                ModelBlockDefinition$Variant modelBlockDefinition$Variant = object.next();
                ModelBlock modelBlock = this.ceW.get(modelBlockDefinition$Variant.Mx());
                if (modelBlock != null && modelBlock.Mt()) {
                    ++modelResourceLocation;
                    ((WeightedBakedModel$Builder)object2).b(this.a(modelBlock, modelBlockDefinition$Variant.My(), modelBlockDefinition$Variant.Mz()), modelBlockDefinition$Variant.Cl());
                    continue;
                }
                ceQ.warn("Missing model for: " + String.valueOf(object3));
            }
            if (modelResourceLocation == 0) {
                ceQ.warn("No weighted models for: " + String.valueOf(object3));
                continue;
            }
            if (modelResourceLocation == 1) {
                this.cfc.b(object3, ((WeightedBakedModel$Builder)object2).QH());
                continue;
            }
            this.cfc.b(object3, ((WeightedBakedModel$Builder)object2).QG());
        }
        for (Map.Entry entry : this.cfh.entrySet()) {
            object2 = (cm)entry.getValue();
            ModelResourceLocation modelResourceLocation = new ModelResourceLocation((String)entry.getKey(), "inventory");
            if (g.eqx.aDA()) {
                modelResourceLocation = (ModelResourceLocation)g.g(g.eqx, entry.getKey());
            }
            if ((object = this.ceW.get(object2)) != null && ((ModelBlock)object).Mt()) {
                if (this.c((ModelBlock)object)) {
                    this.cfc.b(modelResourceLocation, new BuiltInModel(((ModelBlock)object).Mw()));
                    continue;
                }
                this.cfc.b(modelResourceLocation, this.a((ModelBlock)object, ModelRotation.cfs, false));
                continue;
            }
            ceQ.warn("Missing model for: " + String.valueOf(object2));
        }
    }

    private Set<cm> Qu() {
        HashSet hashSet = Sets.newHashSet();
        ArrayList arrayList = Lists.newArrayList(this.ceX.keySet());
        Collections.sort(arrayList, new ModelBakery$1(this));
        for (ModelResourceLocation modelResourceLocation : arrayList) {
            ModelBlockDefinition$Variants modelBlockDefinition$Variants = this.ceX.get(modelResourceLocation);
            for (ModelBlockDefinition$Variant modelBlockDefinition$Variant : modelBlockDefinition$Variants.MA()) {
                ModelBlock modelBlock = this.ceW.get(modelBlockDefinition$Variant.Mx());
                if (modelBlock == null) {
                    ceQ.warn("Missing model for: " + String.valueOf(modelResourceLocation));
                    continue;
                }
                hashSet.addAll(this.a(modelBlock));
            }
        }
        hashSet.addAll(ceP);
        return hashSet;
    }

    public IBakedModel a(ModelBlock modelBlock, ModelRotation modelRotation, boolean bl2) {
        return this.a(modelBlock, (d)modelRotation, bl2);
    }

    protected IBakedModel a(ModelBlock modelBlock, d d2, boolean bl2) {
        TextureAtlasSprite textureAtlasSprite = this.ceV.get(new cm(modelBlock.dj("particle")));
        SimpleBakedModel$Builder simpleBakedModel$Builder = new SimpleBakedModel$Builder(modelBlock).i(textureAtlasSprite);
        for (BlockPart blockPart : modelBlock.Mp()) {
            for (ao ao2 : blockPart.bQC.keySet()) {
                BlockPartFace blockPartFace = blockPart.bQC.get(ao2);
                TextureAtlasSprite textureAtlasSprite2 = this.ceV.get(new cm(modelBlock.dj(blockPartFace.bQJ)));
                boolean bl3 = true;
                if (g.eoT.aDA()) {
                    bl3 = e.a(d2.QD());
                }
                if (blockPartFace.bQH != null && bl3) {
                    simpleBakedModel$Builder.a(d2.r(blockPartFace.bQH), this.a(blockPart, blockPartFace, textureAtlasSprite2, ao2, d2, bl2));
                    continue;
                }
                simpleBakedModel$Builder.a(this.a(blockPart, blockPartFace, textureAtlasSprite2, ao2, d2, bl2));
            }
        }
        return simpleBakedModel$Builder.QF();
    }

    private BakedQuad a(BlockPart blockPart, BlockPartFace blockPartFace, TextureAtlasSprite textureAtlasSprite, ao ao2, ModelRotation modelRotation, boolean bl2) {
        return g.eoT.aDA() ? this.a(blockPart, blockPartFace, textureAtlasSprite, ao2, modelRotation, bl2) : this.cfa.a(blockPart.bQA, blockPart.bQB, blockPartFace, textureAtlasSprite, ao2, modelRotation, blockPart.bQD, bl2, blockPart.bQE);
    }

    protected BakedQuad a(BlockPart blockPart, BlockPartFace blockPartFace, TextureAtlasSprite textureAtlasSprite, ao ao2, d d2, boolean bl2) {
        return this.cfa.a(blockPart.bQA, blockPart.bQB, blockPartFace, textureAtlasSprite, ao2, d2, blockPart.bQD, bl2, blockPart.bQE);
    }

    private void Qv() {
        this.Qw();
        for (ModelBlock modelBlock : this.ceW.values()) {
            modelBlock.e(this.ceW);
        }
        ModelBlock.f(this.ceW);
    }

    private void Qw() {
        cm cm2;
        ArrayDeque arrayDeque = Queues.newArrayDeque();
        HashSet hashSet = Sets.newHashSet();
        for (cm object : this.ceW.keySet()) {
            hashSet.add(object);
            cm2 = this.ceW.get(object).Mu();
            if (cm2 == null) continue;
            arrayDeque.add(cm2);
        }
        while (!arrayDeque.isEmpty()) {
            cm cm3 = (cm)arrayDeque.pop();
            try {
                if (this.ceW.get(cm3) != null) continue;
                ModelBlock modelBlock = this.A(cm3);
                this.ceW.put(cm3, modelBlock);
                cm2 = modelBlock.Mu();
                if (cm2 != null && !hashSet.contains(cm2)) {
                    arrayDeque.add(cm2);
                }
            }
            catch (Exception exception) {
                ceQ.warn("In parent chain: " + ceT.join(this.C(cm3)) + "; unable to load model: '" + String.valueOf(cm3) + "'");
            }
            hashSet.add(cm3);
        }
    }

    private List<cm> C(cm cm2) {
        ArrayList arrayList = Lists.newArrayList((Object[])new cm[]{cm2});
        cm cm3 = cm2;
        while ((cm3 = this.D(cm3)) != null) {
            arrayList.add(0, cm3);
        }
        return arrayList;
    }

    private cm D(cm cm2) {
        for (Map.Entry<cm, ModelBlock> entry : this.ceW.entrySet()) {
            ModelBlock modelBlock = entry.getValue();
            if (modelBlock == null || !cm2.equals(modelBlock.Mu())) continue;
            return entry.getKey();
        }
        return null;
    }

    private Set<cm> a(ModelBlock modelBlock) {
        HashSet hashSet = Sets.newHashSet();
        for (BlockPart blockPart : modelBlock.Mp()) {
            for (BlockPartFace blockPartFace : blockPart.bQC.values()) {
                cm cm2 = new cm(modelBlock.dj(blockPartFace.bQJ));
                hashSet.add(cm2);
            }
        }
        hashSet.add(new cm(modelBlock.dj("particle")));
        return hashSet;
    }

    private void Qx() {
        Set<cm> set = this.Qu();
        set.addAll(this.Qy());
        set.remove(TextureMap.bZD);
        ModelBakery$2 modelBakery$2 = new ModelBakery$2(this, set);
        this.ceY.a(this.ceU, modelBakery$2);
        this.ceV.put(new cm("missingno"), this.ceY.Ou());
    }

    private Set<cm> Qy() {
        HashSet hashSet = Sets.newHashSet();
        for (cm cm2 : this.cfh.values()) {
            ModelBlock modelBlock = this.ceW.get(cm2);
            if (modelBlock == null) continue;
            hashSet.add(new cm(modelBlock.dj("particle")));
            if (this.b(modelBlock)) {
                for (String string : ItemModelGenerator.bRt) {
                    cm cm3 = new cm(modelBlock.dj(string));
                    if (modelBlock.Mv() == cfe && !TextureMap.bZD.equals(cm3)) {
                        TextureAtlasSprite.dp(cm3.toString());
                    } else if (modelBlock.Mv() == cff && !TextureMap.bZD.equals(cm3)) {
                        TextureAtlasSprite.do(cm3.toString());
                    }
                    hashSet.add(cm3);
                }
                continue;
            }
            if (this.c(modelBlock)) continue;
            for (BlockPart blockPart : modelBlock.Mp()) {
                for (BlockPartFace blockPartFace : blockPart.bQC.values()) {
                    cm cm4 = new cm(modelBlock.dj(blockPartFace.bQJ));
                    hashSet.add(cm4);
                }
            }
        }
        return hashSet;
    }

    private boolean b(ModelBlock modelBlock) {
        if (modelBlock == null) {
            return false;
        }
        ModelBlock modelBlock2 = modelBlock.Mv();
        return modelBlock2 == cfd || modelBlock2 == cfe || modelBlock2 == cff;
    }

    private boolean c(ModelBlock modelBlock) {
        if (modelBlock == null) {
            return false;
        }
        ModelBlock modelBlock2 = modelBlock.Mv();
        return modelBlock2 == cfg;
    }

    private void Qz() {
        for (cm object : this.cfh.values()) {
            ModelBlock modelBlock = this.ceW.get(object);
            if (this.b(modelBlock)) {
                ModelBlock modelBlock2 = this.d(modelBlock);
                if (modelBlock2 != null) {
                    modelBlock2.gK = object.toString();
                }
                this.ceW.put(object, modelBlock2);
                continue;
            }
            if (!this.c(modelBlock)) continue;
            this.ceW.put(object, modelBlock);
        }
        for (TextureAtlasSprite textureAtlasSprite : this.ceV.values()) {
            if (textureAtlasSprite.Oh()) continue;
            textureAtlasSprite.Og();
        }
    }

    private ModelBlock d(ModelBlock modelBlock) {
        return this.cfb.a(this.ceY, modelBlock);
    }

    public ModelBlock E(cm cm2) {
        ModelBlock modelBlock = this.ceW.get(cm2);
        return modelBlock;
    }

    public static void a(ModelBlock modelBlock, String string) {
        Map map;
        cm cm2 = ModelBakery.b(modelBlock.Mu(), string);
        if (cm2 != modelBlock.Mu()) {
            g.a((Object)modelBlock, g.erx, (Object)cm2);
        }
        if ((map = (Map)g.a(modelBlock, g.ery)) != null) {
            for (Map.Entry entry : map.entrySet()) {
                String string2 = (String)entry.getValue();
                String string3 = ModelBakery.M(string2, string);
                if (string3 == string2) continue;
                entry.setValue(string3);
            }
        }
    }

    public static cm b(cm cm2, String string) {
        if (cm2 != null && string != null) {
            if (!cm2.atB().equals("minecraft")) {
                return cm2;
            }
            String string2 = cm2.atA();
            String string3 = ModelBakery.M(string2, string);
            if (string3 != string2) {
                cm2 = new cm(cm2.atB(), string3);
            }
            return cm2;
        }
        return cm2;
    }

    private static String M(String string, String string2) {
        string = ak.M(string, string2);
        string = aj.ay(string, ".json");
        string = aj.ay(string, ".png");
        return string;
    }

    @Deprecated
    public static void a(net.minecraft.item.d d2, String ... stringArray) {
        a a2 = (a)g.a(d2, g.eps);
        if (cfk.containsKey(a2)) {
            cfk.get(a2).addAll(Lists.newArrayList((Object[])stringArray));
        } else {
            cfk.put(a2, Sets.newHashSet((Object[])stringArray));
        }
    }

    public static <T extends cm> void a(net.minecraft.item.d d2, T ... TArray) {
        a a2 = (a)g.a(d2, g.eps);
        if (!cfk.containsKey(a2)) {
            cfk.put(a2, Sets.newHashSet());
        }
        for (T t2 : TArray) {
            cfk.get(a2).add(((cm)t2).toString());
        }
    }

    static {
        ceS.put("missing", "{ \"textures\": {   \"particle\": \"missingno\",   \"missingno\": \"missingno\"}, \"elements\": [ {     \"from\": [ 0, 0, 0 ],     \"to\": [ 16, 16, 16 ],     \"faces\": {         \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"down\", \"texture\": \"#missingno\" },         \"up\":    { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"up\", \"texture\": \"#missingno\" },         \"north\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"north\", \"texture\": \"#missingno\" },         \"south\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"south\", \"texture\": \"#missingno\" },         \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"west\", \"texture\": \"#missingno\" },         \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"east\", \"texture\": \"#missingno\" }    }}]}");
        ModelBakery.cfd.gK = "generation marker";
        ModelBakery.cfe.gK = "compass generation marker";
        ModelBakery.cff.gK = "class generation marker";
        ModelBakery.cfg.gK = "block entity marker";
    }
}

