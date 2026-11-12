/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package net.minecraft.client.renderer.block.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.block.model.BlockFaceUV;
import net.minecraft.client.renderer.block.model.BlockFaceUV$Deserializer;
import net.minecraft.client.renderer.block.model.BlockPart;
import net.minecraft.client.renderer.block.model.BlockPart$Deserializer;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.client.renderer.block.model.BlockPartFace$Deserializer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$Deserializer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.client.renderer.block.model.ItemTransformVec3f;
import net.minecraft.client.renderer.block.model.ItemTransformVec3f$Deserializer;
import net.minecraft.client.renderer.block.model.ModelBlock$Bookkeep;
import net.minecraft.client.renderer.block.model.ModelBlock$Deserializer;
import net.minecraft.client.renderer.block.model.ModelBlock$LoopException;
import net.minecraft.util.cm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModelBlock {
    private static final Logger bRN = LogManager.getLogger();
    static final Gson bRO = new GsonBuilder().registerTypeAdapter(ModelBlock.class, (Object)new ModelBlock$Deserializer()).registerTypeAdapter(BlockPart.class, (Object)new BlockPart$Deserializer()).registerTypeAdapter(BlockPartFace.class, (Object)new BlockPartFace$Deserializer()).registerTypeAdapter(BlockFaceUV.class, (Object)new BlockFaceUV$Deserializer()).registerTypeAdapter(ItemTransformVec3f.class, (Object)new ItemTransformVec3f$Deserializer()).registerTypeAdapter(ItemCameraTransforms.class, (Object)new ItemCameraTransforms$Deserializer()).create();
    private final List<BlockPart> bRP;
    private final boolean bRQ;
    private final boolean bRR;
    private final ItemCameraTransforms bRS;
    public String gK = "";
    protected final Map<String, String> bRT;
    protected ModelBlock bRU;
    protected cm bRV;

    public static ModelBlock a(Reader reader) {
        return (ModelBlock)bRO.fromJson(reader, ModelBlock.class);
    }

    public static ModelBlock dh(String string) {
        return ModelBlock.a(new StringReader(string));
    }

    protected ModelBlock(List<BlockPart> list, Map<String, String> map, boolean bl2, boolean bl3, ItemCameraTransforms itemCameraTransforms) {
        this(null, list, map, bl2, bl3, itemCameraTransforms);
    }

    protected ModelBlock(cm cm2, Map<String, String> map, boolean bl2, boolean bl3, ItemCameraTransforms itemCameraTransforms) {
        this(cm2, Collections.emptyList(), map, bl2, bl3, itemCameraTransforms);
    }

    private ModelBlock(cm cm2, List<BlockPart> list, Map<String, String> map, boolean bl2, boolean bl3, ItemCameraTransforms itemCameraTransforms) {
        this.bRP = list;
        this.bRR = bl2;
        this.bRQ = bl3;
        this.bRT = map;
        this.bRV = cm2;
        this.bRS = itemCameraTransforms;
    }

    public List<BlockPart> Mp() {
        return this.Mq() ? this.bRU.Mp() : this.bRP;
    }

    private boolean Mq() {
        return this.bRU != null;
    }

    public boolean Mr() {
        return this.Mq() ? this.bRU.Mr() : this.bRR;
    }

    public boolean Ms() {
        return this.bRQ;
    }

    public boolean Mt() {
        return this.bRV == null || this.bRU != null && this.bRU.Mt();
    }

    public void e(Map<cm, ModelBlock> map) {
        if (this.bRV != null) {
            this.bRU = map.get(this.bRV);
        }
    }

    public boolean di(String string) {
        return !"missingno".equals(this.dj(string));
    }

    public String dj(String object) {
        if (!this.dk((String)object)) {
            object = "#" + (String)object;
        }
        return this.a((String)object, new ModelBlock$Bookkeep(this));
    }

    private String a(String string, ModelBlock$Bookkeep modelBlock$Bookkeep) {
        if (this.dk(string)) {
            if (this == modelBlock$Bookkeep.bRX) {
                bRN.warn("Unable to resolve texture due to upward reference: " + string + " in " + this.gK);
                return "missingno";
            }
            String string2 = this.bRT.get(string.substring(1));
            if (string2 == null && this.Mq()) {
                string2 = this.bRU.a(string, modelBlock$Bookkeep);
            }
            modelBlock$Bookkeep.bRX = this;
            if (string2 != null && this.dk(string2)) {
                string2 = modelBlock$Bookkeep.bRW.a(string2, modelBlock$Bookkeep);
            }
            return string2 != null && !this.dk(string2) ? string2 : "missingno";
        }
        return string;
    }

    private boolean dk(String string) {
        return string.charAt(0) == '#';
    }

    public cm Mu() {
        return this.bRV;
    }

    public ModelBlock Mv() {
        return this.Mq() ? this.bRU.Mv() : this;
    }

    public ItemCameraTransforms Mw() {
        ItemTransformVec3f itemTransformVec3f = this.d(ItemCameraTransforms$TransformType.bRm);
        ItemTransformVec3f itemTransformVec3f2 = this.d(ItemCameraTransforms$TransformType.bRn);
        ItemTransformVec3f itemTransformVec3f3 = this.d(ItemCameraTransforms$TransformType.bRo);
        ItemTransformVec3f itemTransformVec3f4 = this.d(ItemCameraTransforms$TransformType.bRp);
        ItemTransformVec3f itemTransformVec3f5 = this.d(ItemCameraTransforms$TransformType.bRq);
        ItemTransformVec3f itemTransformVec3f6 = this.d(ItemCameraTransforms$TransformType.bRr);
        return new ItemCameraTransforms(itemTransformVec3f, itemTransformVec3f2, itemTransformVec3f3, itemTransformVec3f4, itemTransformVec3f5, itemTransformVec3f6);
    }

    private ItemTransformVec3f d(ItemCameraTransforms$TransformType itemCameraTransforms$TransformType) {
        return this.bRU != null && !this.bRS.c(itemCameraTransforms$TransformType) ? this.bRU.d(itemCameraTransforms$TransformType) : this.bRS.b(itemCameraTransforms$TransformType);
    }

    public static void f(Map<cm, ModelBlock> map) {
        for (ModelBlock modelBlock : map.values()) {
            try {
                ModelBlock modelBlock2 = modelBlock.bRU;
                ModelBlock modelBlock3 = modelBlock2.bRU;
                while (modelBlock2 != modelBlock3) {
                    modelBlock2 = modelBlock2.bRU;
                    modelBlock3 = modelBlock3.bRU.bRU;
                }
                throw new ModelBlock$LoopException();
            }
            catch (NullPointerException nullPointerException) {
            }
        }
    }
}

