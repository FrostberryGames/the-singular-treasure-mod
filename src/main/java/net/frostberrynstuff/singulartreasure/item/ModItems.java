package net.frostberrynstuff.singulartreasure.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.frostberrynstuff.singulartreasure.SingularTreasure;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SEAPRISMSTONE = registerItem("sea_prism_stone", new Item(new FabricItemSettings()));

    private static void addItemsToItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(SEAPRISMSTONE);
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(SingularTreasure.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        SingularTreasure.LOGGER.info("Registering Mod Items For The Singular Treasure");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToItemGroup);
    }
}
