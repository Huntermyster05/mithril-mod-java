package net.huntersteward.mithrilmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.huntersteward.mithrilmod.block.ModBlocks;
import net.huntersteward.mithrilmod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MITHRIL_BLOCK)
                .add(ModBlocks.MITHRIL_ORE)
                .add(ModBlocks.MITHRIL_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MITHRIL_BLOCK)
                .add(ModBlocks.MITHRIL_ORE)
                .add(ModBlocks.MITHRIL_DEEPSLATE_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_MITHRIL_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
    }
}
