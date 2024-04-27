package net.frostberrynstuff.singulartreasure.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.frostberrynstuff.singulartreasure.SingularTreasure;
import net.frostberrynstuff.singulartreasure.util.DevilFruitData;
import net.frostberrynstuff.singulartreasure.util.IEntityDataSaver;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;

public class AteDevilFruitC2SPacket {
    public static void recieve(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender)
    {
        // Everything happens server side ONLY!!!
        player.getServerWorld().playSound(null, player.getBlockPos(), SoundEvents.ITEM_HONEY_BOTTLE_DRINK, SoundCategory.PLAYERS, 0.5f, player.getServerWorld().random.nextFloat() * 0.1F + 0.9F);

        DevilFruitData.changeDevilFruit((IEntityDataSaver) player, "gomu_gomu_no_mi");
        player.sendMessage(Text.literal("DevilFruitHasDebug: " + ((IEntityDataSaver) player).getPersistentData().getString("devil_fruit_name")));
        SingularTreasure.LOGGER.info(String.valueOf(((IEntityDataSaver) player).getPersistentData().getString("devil_fruit_name")));
    }
}
