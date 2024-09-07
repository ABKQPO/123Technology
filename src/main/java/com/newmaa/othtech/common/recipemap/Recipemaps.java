package com.newmaa.othtech.common.recipemap;

import com.newmaa.othtech.common.recipemap.recipeMapFrontends.OTH_GeneralFrontend;

import gregtech.api.enums.ItemList;
import gregtech.api.gui.modularui.GT_UITextures;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBuilder;
import gregtech.api.util.GT_ModHandler;

public class Recipemaps {

    public static final RecipeMap<OTH_RecipeMapBackend> MegaIsaForge = RecipeMapBuilder
        .of("otht.recipe.MegaIsaForge", OTH_RecipeMapBackend::new)
        .maxIO(16, 16, 16, 16)
        .progressBar(GT_UITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .frontend(OTH_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(ItemList.Electric_Motor_MAX.get(1))
                .setMaxRecipesPerPage(1))
        .disableOptimize()
        .build();
    public static final RecipeMap<OTH_RecipeMapBackend> QFTMega = RecipeMapBuilder
        .of("otht.recipe.GT_TE_MegaQFTFake", OTH_RecipeMapBackend::new)
        .maxIO(8, 8, 8, 8)
        .progressBar(GT_UITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .frontend(OTH_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(ItemList.Field_Generator_MAX.get(1))
                .setMaxRecipesPerPage(2))
        .disableOptimize()
        .build();
    public static final RecipeMap<OTH_RecipeMapBackend> Cannon = RecipeMapBuilder
        .of("otht.recipe.EVACannon", OTH_RecipeMapBackend::new)
        .maxIO(1, 1, 0, 0)
        .progressBar(GT_UITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .frontend(OTH_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(GT_ModHandler.getModItem("123Technology", "dustIrOsSm", 1))
                .setMaxRecipesPerPage(2))
        .disableOptimize()
        .build();

}
