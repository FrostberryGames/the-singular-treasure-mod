package net.frostberrynstuff.singulartreasure.util;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.frostberrynstuff.singulartreasure.networking.ModPackets;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;

public class DevilFruitData {
    public static String changeDevilFruit(IEntityDataSaver player, String name)
    {
        NbtCompound nbt = player.getPersistentData();

        nbt.putString("devil_fruit_name", name);

        syncDF(name, (ServerPlayerEntity) player);

        return name;
    }

    public static void syncDF(String dfname, ServerPlayerEntity player)
    {
        PacketByteBuf buffer = PacketByteBufs.create();
        buffer.writeString(dfname);
        ServerPlayNetworking.send(player, ModPackets.DF_SYNC_ID, buffer);
    }
}
