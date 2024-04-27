package net.frostberrynstuff.singulartreasure.item.custom.devilfruits;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.frostberrynstuff.singulartreasure.networking.ModPackets;
import net.frostberrynstuff.singulartreasure.util.IEntityDataSaver;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class GomuItem extends Item {
    public GomuItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

        if (!world.isClient())
        {
            if (user instanceof ServerPlayerEntity)
            {
                if (((IEntityDataSaver) user).getPersistentData().getBoolean("has_devil_fruit") == false)
                {
                    ClientPlayNetworking.send(ModPackets.ATE_DEVIL_FRUIT_ID, PacketByteBufs.create());
                    user.sendMessage(Text.literal("You ate the Gomu Gomu no Mi"));
                } else {
                    ClientPlayNetworking.send(ModPackets.REMOVED_DEVIL_FRUIT_ID, PacketByteBufs.create());
                    user.sendMessage(Text.literal("You spit out the Gomu Gomu no Mi"));
                }
            }
        }

        return super.finishUsing(stack, world, user);
    }
}
