package com.newmaa.othtech.utils;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMetadataKey;
import gregtech.api.recipe.metadata.IRecipeMetadataStorage;
import gregtech.api.recipe.metadata.RecipeMetadataStorage;
import gregtech.api.util.GTRecipe;

public class RecipeBuilder {

    public static RecipeBuilder builder() {
        return new RecipeBuilder();
    }

    private ItemStack[] inputItems = new ItemStack[0];
    private ItemStack[] outputItems = new ItemStack[0];
    private FluidStack[] inputFluids = new FluidStack[0];
    private FluidStack[] outputFluids = new FluidStack[0];
    private int[] outputChance;
    private int eut = 0;
    private int duration = 0;
    private int specialValue = 0;
    protected boolean skip = false;
    protected boolean valid = true;
    protected IRecipeMetadataStorage metadataStorage;

    public RecipeBuilder() {}

    public RecipeBuilder itemInputs(ItemStack... inputItems) {
        if (inputItems != null && inputItems.length > 0) {
            this.inputItems = inputItems;
        }
        return this;
    }

    public RecipeBuilder itemOutputs(ItemStack... outputItems) {
        if (outputItems != null && outputItems.length > 0) {
            this.outputItems = outputItems;
        }
        return this;
    }

    public RecipeBuilder fluidInputs(FluidStack... inputFluids) {
        if (inputFluids != null && inputFluids.length > 0) {
            this.inputFluids = inputFluids;
        }
        return this;
    }

    public RecipeBuilder fluidOutputs(FluidStack... outputFluids) {
        if (outputFluids != null && outputFluids.length > 0) {
            this.outputFluids = outputFluids;
        }
        return this;
    }

    public RecipeBuilder outputChances(int... outputChance) {
        this.outputChance = outputChance;
        return this;
    }

    public RecipeBuilder eut(int eut) {
        this.eut = eut;
        return this;
    }

    public RecipeBuilder eut(long eut) {
        this.eut = (int) eut;
        return this;
    }

    public RecipeBuilder duration(int duration) {
        this.duration = duration;
        return this;
    }

    public RecipeBuilder specialValue(int specialValue) {
        this.specialValue = specialValue;
        return this;
    }

    public RecipeBuilder noOptimize() {
        return this;
    }

    public <T> RecipeBuilder metadata(RecipeMetadataKey<T> key, T value) {
        if (skip) return this;
        if (metadataStorage == null) {
            metadataStorage = new RecipeMetadataStorage();
        }
        metadataStorage.store(key, value);
        return this;
    }

    public RecipeBuilder addTo(RecipeMap<?> recipeMap) {
        GTRecipe tempRecipe = new GTRecipe(
            false,
            inputItems,
            outputItems,
            null,
            outputChance,
            inputFluids,
            outputFluids,
            duration,
            eut,
            specialValue);

        tempRecipe.mInputs = inputItems.clone();
        tempRecipe.mOutputs = outputItems.clone();

        recipeMap.add(tempRecipe);
        return this;
    }

}
