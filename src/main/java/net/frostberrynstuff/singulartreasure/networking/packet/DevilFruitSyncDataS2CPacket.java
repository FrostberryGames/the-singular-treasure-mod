package net.frostberrynstuff.singulartreasure.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.frostberrynstuff.singulartreasure.util.IEntityDataSaver;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;

public class DevilFruitSyncDataS2CPacket {
    public static void receive(MinecraftClient client, ClientPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender)
    {
        ((IEntityDataSaver) client.player).getPersistentData().putBoolean("has_devil_fruit", buf.readBoolean());
        ((IEntityDataSaver) client.player).getPersistentData().putString("devil_fruit_name", buf.readString());
    }
}
