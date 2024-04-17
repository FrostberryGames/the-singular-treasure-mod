package net.frostberrynstuff.singulartreasure.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.frostberrynstuff.singulartreasure.SingularTreasure;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SINGULAR_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(SingularTreasure.MOD_ID, "singulartreasure"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.singular"))
                    .icon(() -> new ItemStack(ModItems.SEAPRISMSTONE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SEAPRISMSTONE);
                        entries.add(ModItems.SEAPRISMINGOT);

                    }).build());

    public static void registerItemGroups() {
        SingularTreasure.LOGGER.info("Registering Item Groups for" + SingularTreasure.MOD_ID);
    }
}
