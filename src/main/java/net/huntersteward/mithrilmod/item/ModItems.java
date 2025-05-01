package net.huntersteward.mithrilmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.huntersteward.mithrilmod.MithrilMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MITHRIL_ORB = registerItem("mithril_orb", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MithrilMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MithrilMod.LOGGER.info("Registering Mod Items for " + MithrilMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MITHRIL_ORB);
        });
    }
}
