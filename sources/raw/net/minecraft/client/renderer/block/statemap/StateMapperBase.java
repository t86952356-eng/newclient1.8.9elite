/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer.block.statemap;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.client.resources.model.ModelResourceLocation;

public abstract class StateMapperBase
implements IStateMapper {
    protected Map<IBlockState, ModelResourceLocation> bSn = Maps.newLinkedHashMap();

    public String g(Map<IProperty, Comparable> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<IProperty, Comparable> entry : map.entrySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(",");
            }
            IProperty iProperty = entry.getKey();
            Comparable comparable = entry.getValue();
            stringBuilder.append(iProperty.getName());
            stringBuilder.append("=");
            stringBuilder.append(iProperty.a(comparable));
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append("normal");
        }
        return stringBuilder.toString();
    }

    @Override
    public Map<IBlockState, ModelResourceLocation> B(Block block) {
        for (IBlockState iBlockState : block.xL().zQ()) {
            this.bSn.put(iBlockState, this.C(iBlockState));
        }
        return this.bSn;
    }

    protected abstract ModelResourceLocation C(IBlockState var1);
}

