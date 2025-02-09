package com.newmaa.othtech.recipe;

import static com.newmaa.othtech.Utils.Utils.setStackSize;
import static com.newmaa.othtech.common.recipemap.Recipemaps.NQF;
import static com.newmaa.othtech.common.recipemap.Recipemaps.NaquadahFuelFakeRecipes;
import static goodgenerator.main.GGConfigLoader.NaquadahFuelTime;
import static goodgenerator.main.GGConfigLoader.NaquadahFuelVoltage;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import com.newmaa.othtech.Utils.RecipeBuilder;

import bartworks.system.material.WerkstoffLoader;
import goodgenerator.items.GGMaterial;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.MaterialsUEVplus;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.TierEU;
import gregtech.api.util.GTModHandler;
import gregtech.api.util.GTOreDictUnificator;
import gtPlusPlus.core.material.MaterialsElements;

public class recipesNaquadah implements IRecipePool {

    public void loadRecipes() {
        RecipeBuilder.builder()
            .fluidOutputs(FluidRegistry.getFluidStack("naquadah based liquid fuel mkv", 4000))
            .fluidInputs(
                FluidRegistry.getFluidStack("heavy naquadah fuel", 512000),
                FluidRegistry.getFluidStack("light naquadah fuel", 640000),
                FluidRegistry.getFluidStack("heavyradox", 1000),
                Materials.Praseodymium.getFluid(294912))
            .itemInputs(
                setStackSize(GGMaterial.plutoniumOxideUraniumMixture.get(OrePrefixes.dust, 1), 12800),
                setStackSize(GGMaterial.graphiteUraniumMixture.get(OrePrefixes.dust, 1), 102400),
                setStackSize(GGMaterial.extremelyUnstableNaquadah.get(OrePrefixes.dust, 1), 3424),
                setStackSize(GGMaterial.atomicSeparationCatalyst.get(OrePrefixes.dust, 1), 128),
                setStackSize(WerkstoffLoader.Tiberium.get(OrePrefixes.dust, 1), 17280),
                setStackSize(GGMaterial.orundum.get(OrePrefixes.dust, 1), 1024),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, Materials.DraconiumAwakened, 1), 2048),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, Materials.Infinity, 1), 32),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, Materials.NetherStar, 1), 2048))
            .eut(TierEU.RECIPE_UMV)
            .duration(150 * 20)
            .noOptimize()
            .addTo(NQF);
        RecipeBuilder.builder()
            .fluidOutputs(FluidRegistry.getFluidStack("naquadah based liquid fuel mkv", 6000))
            .fluidInputs(
                FluidRegistry.getFluidStack("heavy naquadah fuel", 128000),
                FluidRegistry.getFluidStack("light naquadah fuel", 160000),
                FluidRegistry.getFluidStack("molten.mellion", 1152),
                FluidRegistry.getFluidStack("molten.creon", 1152),
                FluidRegistry.getFluidStack("molten.hypogen", 3840))
            .itemInputs(
                setStackSize(GTModHandler.getModItem("bartworks", "gt.bwMetaGenerateddust", 1, 10009), 12800),
                setStackSize(GTModHandler.getModItem("bartworks", "gt.bwMetaGenerateddust", 1, 10024), 1712),
                setStackSize(GTModHandler.getModItem("bartworks", "gt.bwMetaGenerateddust", 1, 10022), 192),
                setStackSize(GTModHandler.getModItem("bartworks", "gt.bwMetaGenerateddust", 1, 10023), 1024),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, Materials.DraconiumAwakened, 1), 1024),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, MaterialsUEVplus.TranscendentMetal, 1), 64),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, Materials.Bedrockium, 1), 1024),
                setStackSize(GTModHandler.getModItem("bartworks", "gt.bwMetaGenerateddust", 1, 10001), 25600),
                setStackSize(GTModHandler.getModItem("miscutils", "itemDustChromaticGlass", 1), 1440))
            .eut(TierEU.RECIPE_UMV)
            .duration(100 * 20)
            .noOptimize()
            .addTo(NQF);
        RecipeBuilder.builder()
            .fluidOutputs(FluidRegistry.getFluidStack("naquadah based liquid fuel mkvi", 4500))
            .fluidInputs(
                FluidRegistry.getFluidStack("heavy naquadah fuel", 128000),
                FluidRegistry.getFluidStack("light naquadah fuel", 160000),
                FluidRegistry.getFluidStack("molten.mellion", 1152),
                FluidRegistry.getFluidStack("molten.creon", 1152),
                GGMaterial.shirabon.getMolten(1440))
            .itemInputs(
                setStackSize(GGMaterial.plutoniumOxideUraniumMixture.get(OrePrefixes.dust, 1), 12800),
                setStackSize(GGMaterial.graphiteUraniumMixture.get(OrePrefixes.dust, 1), 25600),
                setStackSize(GGMaterial.extremelyUnstableNaquadah.get(OrePrefixes.dust, 1), 1712),
                setStackSize(GGMaterial.atomicSeparationCatalyst.get(OrePrefixes.dust, 1), 192),
                setStackSize(GGMaterial.orundum.get(OrePrefixes.dust, 1), 1024),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, Materials.DraconiumAwakened, 1), 1024),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, MaterialsUEVplus.TranscendentMetal, 1), 64),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, Materials.Bedrockium, 1), 1024),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, Materials.Tritanium, 1), 32 * 3),
                setStackSize(MaterialsElements.STANDALONE.ASTRAL_TITANIUM.getDust(1), 192),
                setStackSize(MaterialsElements.STANDALONE.CHRONOMATIC_GLASS.getDust(1), 1440))
            .eut(TierEU.RECIPE_UXV)
            .duration(150 * 20)
            .noOptimize()
            .addTo(NQF);
        RecipeBuilder.builder()
            .fluidOutputs(FluidRegistry.getFluidStack("naquadah based liquid fuel mkvi", 7500))
            .fluidInputs(
                FluidRegistry.getFluidStack("heavy naquadah fuel", 128000),
                FluidRegistry.getFluidStack("light naquadah fuel", 160000),
                FluidRegistry.getFluidStack("rawstarmatter", 400),
                GGMaterial.shirabon.getMolten(1440))
            .itemInputs(
                setStackSize(GGMaterial.plutoniumOxideUraniumMixture.get(OrePrefixes.dust, 1), 12800),
                setStackSize(GGMaterial.graphiteUraniumMixture.get(OrePrefixes.dust, 1), 25600),
                setStackSize(GGMaterial.extremelyUnstableNaquadah.get(OrePrefixes.dust, 1), 1712),
                setStackSize(GGMaterial.atomicSeparationCatalyst.get(OrePrefixes.dust, 1), 192),
                setStackSize(GGMaterial.orundum.get(OrePrefixes.dust, 1), 1024),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, Materials.DraconiumAwakened, 1), 1024),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, MaterialsUEVplus.TranscendentMetal, 1), 64),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, Materials.Bedrockium, 1), 1024),
                setStackSize(GTOreDictUnificator.get(OrePrefixes.dust, Materials.Tritanium, 1), 48 * 3),
                setStackSize(MaterialsElements.STANDALONE.CELESTIAL_TUNGSTEN.getDust(1), 192),
                setStackSize(MaterialsElements.STANDALONE.CHRONOMATIC_GLASS.getDust(1), 1440))
            .eut(TierEU.RECIPE_UXV)
            .duration(100 * 20)
            .noOptimize()
            .addTo(NQF);
        // FuelsFakeRecipes
        FluidStack[] inputs = new FluidStack[] { GGMaterial.uraniumBasedLiquidFuelExcited.getFluidOrGas(1),
            GGMaterial.thoriumBasedLiquidFuelExcited.getFluidOrGas(1),
            GGMaterial.plutoniumBasedLiquidFuelExcited.getFluidOrGas(1),
            GGMaterial.naquadahBasedFuelMkI.getFluidOrGas(1), GGMaterial.naquadahBasedFuelMkII.getFluidOrGas(1),
            GGMaterial.naquadahBasedFuelMkIII.getFluidOrGas(1), GGMaterial.naquadahBasedFuelMkIV.getFluidOrGas(1),
            GGMaterial.naquadahBasedFuelMkV.getFluidOrGas(1), GGMaterial.naquadahBasedFuelMkVI.getFluidOrGas(1) };

        FluidStack[] outputs = new FluidStack[] { GGMaterial.uraniumBasedLiquidFuelDepleted.getFluidOrGas(1),
            GGMaterial.thoriumBasedLiquidFuelDepleted.getFluidOrGas(1),
            GGMaterial.plutoniumBasedLiquidFuelDepleted.getFluidOrGas(1),
            GGMaterial.naquadahBasedFuelMkIDepleted.getFluidOrGas(1),
            GGMaterial.naquadahBasedFuelMkIIDepleted.getFluidOrGas(1),
            GGMaterial.naquadahBasedFuelMkIIIDepleted.getFluidOrGas(1),
            GGMaterial.naquadahBasedFuelMkIVDepleted.getFluidOrGas(1),
            GGMaterial.naquadahBasedFuelMkVDepleted.getFluidOrGas(1),
            GGMaterial.naquadahBasedFuelMkVIDepleted.getFluidOrGas(1) };
        for (int i = 0; i < 9; i++) {
            GTValues.RA.stdBuilder()
                .fluidInputs(inputs[i])
                .fluidOutputs(outputs[i])
                .duration(NaquadahFuelTime[i])
                .eut(0)
                .specialValue(NaquadahFuelVoltage[i])
                .addTo(NaquadahFuelFakeRecipes);

        }
    }
}
