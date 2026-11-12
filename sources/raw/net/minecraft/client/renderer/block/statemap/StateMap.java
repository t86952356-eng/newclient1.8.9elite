/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer.block.statemap;

import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.cm;

public class StateMap
extends StateMapperBase {
    private final IProperty<?> bSj;
    private final String bSk;
    private final List<IProperty<?>> bSl;

    private StateMap(IProperty<?> iProperty, String string, List<IProperty<?>> list) {
        this.bSj = iProperty;
        this.bSk = string;
        this.bSl = list;
    }

    @Override
    protected ModelResourceLocation C(IBlockState iBlockState) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap(iBlockState.zV());
        Object object = this.bSj == null ? ((cm)Block.aRV.y(iBlockState.df())).toString() : this.bSj.a((Comparable)linkedHashMap.remove(this.bSj));
        if (this.bSk != null) {
            object = (String)object + this.bSk;
        }
        for (IProperty<?> iProperty : this.bSl) {
            linkedHashMap.remove(iProperty);
        }
        return new ModelResourceLocation((String)object, this.g(linkedHashMap));
    }
}

