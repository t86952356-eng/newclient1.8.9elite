/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockMycelium;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.cm;
import net.minecraft.world.l;
import net.optifine.model.b;
import net.optifine.util.af;

public class a {
    private static boolean dUC = true;
    private static boolean dUD = true;
    private static boolean dUE = true;
    private static boolean dUF = true;
    private static boolean dUG = true;
    private static boolean dUH = true;
    private static boolean dUI = false;
    private static TextureAtlasSprite dUJ = null;
    private static TextureAtlasSprite dUK = null;
    private static TextureAtlasSprite dUL = null;
    private static TextureAtlasSprite dUM = null;
    private static TextureAtlasSprite dUN = null;
    private static boolean dUO = false;
    private static IBakedModel dUP = null;
    private static IBakedModel dUQ = null;
    private static IBakedModel dUR = null;
    private static IBakedModel dUS = null;
    private static boolean dUT = false;
    private static final String dUU = "blocks/grass_top";
    private static final String dUV = "blocks/grass_side";
    private static final String dUW = "blocks/mycelium_top";
    private static final String dUX = "blocks/dirt_podzol_top";
    private static final String dUY = "blocks/snow";

    public static void b(TextureMap textureMap) {
        dUO = false;
        dUT = false;
        a.c(textureMap);
    }

    public static void jA() {
        if (dUO) {
            dUP = b.b(dUJ, 0);
            if (dUI) {
                IBakedModel iBakedModel = b.b(dUK, -1);
                dUP = b.a(iBakedModel, dUP);
            }
            dUQ = b.b(dUL, -1);
            dUR = b.b(dUM, 0);
            dUS = b.b(dUN, -1);
            dUT = true;
        }
    }

    private static void c(TextureMap textureMap) {
        dUC = true;
        dUD = true;
        dUE = true;
        dUF = true;
        dUG = true;
        dUH = true;
        dUJ = textureMap.n(new cm(dUU));
        dUK = textureMap.n(new cm(dUV));
        dUL = textureMap.n(new cm(dUW));
        dUM = textureMap.n(new cm(dUX));
        dUN = textureMap.n(new cm(dUY));
        dUO = true;
        String string = "optifine/bettergrass.properties";
        try {
            cm cm2 = new cm("optifine/bettergrass.properties");
            if (!net.minecraft.src.a.F(cm2)) {
                return;
            }
            InputStream inputStream = net.minecraft.src.a.u(cm2);
            if (inputStream == null) {
                return;
            }
            boolean bl2 = net.minecraft.src.a.G(cm2);
            if (bl2) {
                net.minecraft.src.a.fN("BetterGrass: Parsing default configuration optifine/bettergrass.properties");
            } else {
                net.minecraft.src.a.fN("BetterGrass: Parsing configuration optifine/bettergrass.properties");
            }
            af af2 = new af();
            af2.load(inputStream);
            dUC = a.a(af2, "grass", true);
            dUD = a.a(af2, "mycelium", true);
            dUE = a.a(af2, "podzol", true);
            dUF = a.a(af2, "grass.snow", true);
            dUG = a.a(af2, "mycelium.snow", true);
            dUH = a.a(af2, "podzol.snow", true);
            dUI = a.a(af2, "grass.multilayer", false);
            dUJ = a.a(af2, "texture.grass", dUU, textureMap);
            dUK = a.a(af2, "texture.grass_side", dUV, textureMap);
            dUL = a.a(af2, "texture.mycelium", dUW, textureMap);
            dUM = a.a(af2, "texture.podzol", dUX, textureMap);
            dUN = a.a(af2, "texture.snow", dUY, textureMap);
        }
        catch (IOException iOException) {
            net.minecraft.src.a.warn("Error reading: optifine/bettergrass.properties, " + iOException.getClass().getName() + ": " + iOException.getMessage());
        }
    }

    private static TextureAtlasSprite a(Properties properties, String string, String string2, TextureMap textureMap) {
        cm cm2;
        String string3 = properties.getProperty(string);
        if (string3 == null) {
            string3 = string2;
        }
        if (!net.minecraft.src.a.F(cm2 = new cm("textures/" + string3 + ".png"))) {
            net.minecraft.src.a.warn("BetterGrass texture not found: " + String.valueOf(cm2));
            string3 = string2;
        }
        cm cm3 = new cm(string3);
        TextureAtlasSprite textureAtlasSprite = textureMap.n(cm3);
        return textureAtlasSprite;
    }

    public static List a(l l2, IBlockState iBlockState, net.minecraft.util.b b2, ao ao2, List list) {
        if (ao2 != ao.dwr && ao2 != ao.dwq) {
            if (!dUT) {
                return list;
            }
            Block block = iBlockState.df();
            return block instanceof BlockMycelium ? a.b(l2, iBlockState, b2, ao2, list) : (block instanceof BlockDirt ? a.c(l2, iBlockState, b2, ao2, list) : (block instanceof BlockGrass ? a.d(l2, iBlockState, b2, ao2, list) : list));
        }
        return list;
    }

    private static List b(l l2, IBlockState iBlockState, net.minecraft.util.b b2, ao ao2, List list) {
        boolean bl2;
        Block block = l2.L(b2.aqX()).df();
        boolean bl3 = bl2 = block == Blocks.cML || block == Blocks.cMJ;
        if (net.minecraft.src.a.anT()) {
            if (bl2) {
                if (dUG && a.a(b2, ao2, l2) == Blocks.cMJ) {
                    return dUS.p(ao2);
                }
            } else if (dUD && a.a(b2.aqY(), ao2, l2) == Blocks.cNy) {
                return dUQ.p(ao2);
            }
        } else if (bl2) {
            if (dUG) {
                return dUS.p(ao2);
            }
        } else if (dUD) {
            return dUQ.p(ao2);
        }
        return list;
    }

    private static List c(l l2, IBlockState iBlockState, net.minecraft.util.b b2, ao ao2, List list) {
        boolean bl2;
        Block block = a.a(b2, ao.dwr, l2);
        if (iBlockState.b(BlockDirt.aTC) != BlockDirt$DirtType.aTG) {
            return list;
        }
        boolean bl3 = bl2 = block == Blocks.cML || block == Blocks.cMJ;
        if (net.minecraft.src.a.anT()) {
            net.minecraft.util.b b3;
            IBlockState iBlockState2;
            if (bl2) {
                if (dUH && a.a(b2, ao2, l2) == Blocks.cMJ) {
                    return dUS.p(ao2);
                }
            } else if (dUE && (iBlockState2 = l2.L(b3 = b2.aqY().x(ao2))).df() == Blocks.cLf && iBlockState2.b(BlockDirt.aTC) == BlockDirt$DirtType.aTG) {
                return dUR.p(ao2);
            }
        } else if (bl2) {
            if (dUH) {
                return dUS.p(ao2);
            }
        } else if (dUE) {
            return dUR.p(ao2);
        }
        return list;
    }

    private static List d(l l2, IBlockState iBlockState, net.minecraft.util.b b2, ao ao2, List list) {
        boolean bl2;
        Block block = l2.L(b2.aqX()).df();
        boolean bl3 = bl2 = block == Blocks.cML || block == Blocks.cMJ;
        if (net.minecraft.src.a.anT()) {
            if (bl2) {
                if (dUF && a.a(b2, ao2, l2) == Blocks.cMJ) {
                    return dUS.p(ao2);
                }
            } else if (dUC && a.a(b2.aqY(), ao2, l2) == Blocks.cLe) {
                return dUP.p(ao2);
            }
        } else if (bl2) {
            if (dUF) {
                return dUS.p(ao2);
            }
        } else if (dUC) {
            return dUP.p(ao2);
        }
        return list;
    }

    private static Block a(net.minecraft.util.b b2, ao ao2, l l2) {
        net.minecraft.util.b b3 = b2.x(ao2);
        Block block = l2.L(b3).df();
        return block;
    }

    private static boolean a(Properties properties, String string, boolean bl2) {
        String string2 = properties.getProperty(string);
        return string2 == null ? bl2 : Boolean.parseBoolean(string2);
    }
}

