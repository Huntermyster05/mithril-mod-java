package net.huntersteward.mithrilmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.huntersteward.mithrilmod.MithrilMod;
import net.huntersteward.mithrilmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MITHRIL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MithrilMod.MOD_ID, "mithril"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MITHRIL_ORB))
                    .displayName(Text.translatable("itemgroup.mithrilmod.mithril"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MITHRIL_ORB);
                        entries.add(ModBlocks.MITHRIL_BLOCK);
                        entries.add(ModBlocks.MITHRIL_ORE);
                        entries.add(ModBlocks.MITHRIL_DEEPSLATE_ORE);

                        entries.add(ModItems.MITHRIL_SWORD);
                        entries.add(ModItems.MITHRIL_PICKAXE);
                        entries.add(ModItems.MITHRIL_SHOVEL);
                        entries.add(ModItems.MITHRIL_AXE);
                        entries.add(ModItems.MITHRIL_HOE);

                        entries.add(ModItems.MITHRIL_HELMET);
                        entries.add(ModItems.MITHRIL_CHESTPLATE);
                        entries.add(ModItems.MITHRIL_LEGGINGS);
                        entries.add(ModItems.MITHRIL_BOOTS);



                    }).build());

    public static void registerItemGroups() {
        MithrilMod.LOGGER.info("Registering Item Groups for " + MithrilMod.MOD_ID);
    }
}