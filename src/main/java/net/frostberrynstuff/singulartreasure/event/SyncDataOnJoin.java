package net.frostberrynstuff.singulartreasure.event;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.frostberrynstuff.singulartreasure.networking.ModPackets;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.text.Text;

public class SyncDataOnJoin implements ClientPlayConnectionEvents.Join{
    @Override
    public void onPlayReady(ClientPlayNetworkHandler handler, PacketSender sender, MinecraftClient client) {
        ClientPlayNetworking.send(ModPackets.DF_SYNC_ID, PacketByteBufs.create());
        client.player.sendMessage(Text.literal("Client Synced!"));
    }
}
