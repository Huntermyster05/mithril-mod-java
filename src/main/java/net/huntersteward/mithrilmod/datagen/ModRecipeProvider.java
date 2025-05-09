package net.huntersteward.mithrilmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.huntersteward.mithrilmod.block.ModBlocks;
import net.huntersteward.mithrilmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MITHRIL_ORB, RecipeCategory.DECORATIONS, ModBlocks.MITHRIL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MITHRIL_SWORD)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.MITHRIL_ORB)
                .criterion(hasItem(ModItems.MITHRIL_ORB), conditionsFromItem(ModItems.MITHRIL_ORB))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MITHRIL_PICKAXE)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.MITHRIL_ORB)
                .criterion(hasItem(ModItems.MITHRIL_ORB), conditionsFromItem(ModItems.MITHRIL_ORB))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MITHRIL_AXE)
                .pattern(" RR")
                .pattern(" SR")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.MITHRIL_ORB)
                .criterion(hasItem(ModItems.MITHRIL_ORB), conditionsFromItem(ModItems.MITHRIL_ORB))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MITHRIL_SHOVEL)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.MITHRIL_ORB)
                .criterion(hasItem(ModItems.MITHRIL_ORB), conditionsFromItem(ModItems.MITHRIL_ORB))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MITHRIL_HOE)
                .pattern(" RR")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.MITHRIL_ORB)
                .criterion(hasItem(ModItems.MITHRIL_ORB), conditionsFromItem(ModItems.MITHRIL_ORB))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MITHRIL_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .pattern("   ")
                .input('R', ModItems.MITHRIL_ORB)
                .criterion(hasItem(ModItems.MITHRIL_ORB), conditionsFromItem(ModItems.MITHRIL_ORB))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MITHRIL_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.MITHRIL_ORB)
                .criterion(hasItem(ModItems.MITHRIL_ORB), conditionsFromItem(ModItems.MITHRIL_ORB))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MITHRIL_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.MITHRIL_ORB)
                .criterion(hasItem(ModItems.MITHRIL_ORB), conditionsFromItem(ModItems.MITHRIL_ORB))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MITHRIL_BOOTS)
                .pattern("   ")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.MITHRIL_ORB)
                .criterion(hasItem(ModItems.MITHRIL_ORB), conditionsFromItem(ModItems.MITHRIL_ORB))
                .offerTo(exporter);

    }
}
