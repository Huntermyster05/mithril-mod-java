package net.huntersteward.mithrilmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.huntersteward.mithrilmod.MithrilMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block MITHRIL_ORE = registerBlock("mithril_ore",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MithrilMod.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MithrilMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MithrilMod.LOGGER.info("Registering Mod Blocks for " + MithrilMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.MITHRIL_BLOCK);
fabricItemGroupEntries.add(ModBlocks.MITHRIL_ORE);
        });
    }
}
