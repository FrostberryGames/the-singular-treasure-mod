package net.frostberrynstuff.singulartreasure.networking;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.frostberrynstuff.singulartreasure.SingularTreasure;
import net.frostberrynstuff.singulartreasure.networking.packet.AteDevilFruitC2SPacket;
import net.frostberrynstuff.singulartreasure.networking.packet.DevilFruitSyncDataS2CPacket;
import net.frostberrynstuff.singulartreasure.networking.packet.ExampleC2SPacket;
import net.frostberrynstuff.singulartreasure.networking.packet.RemovedDevilFruitC2SPacket;
import net.minecraft.util.Identifier;

public class ModPackets {
    public static final Identifier EXAMPLE_ID = new Identifier(SingularTreasure.MOD_ID, "example");
    public static final Identifier ATE_DEVIL_FRUIT_ID = new Identifier(SingularTreasure.MOD_ID, "ate_devil_fruit");
    public static final Identifier REMOVED_DEVIL_FRUIT_ID = new Identifier(SingularTreasure.MOD_ID, "remove_devil_fruit");
    public static final Identifier DF_SYNC_ID = new Identifier(SingularTreasure.MOD_ID, "df_sync");

    public static void registerC2SPackets()
    {
        ServerPlayNetworking.registerGlobalReceiver(EXAMPLE_ID, ExampleC2SPacket::recieve);
        ServerPlayNetworking.registerGlobalReceiver(ATE_DEVIL_FRUIT_ID, AteDevilFruitC2SPacket::recieve);
        ServerPlayNetworking.registerGlobalReceiver(REMOVED_DEVIL_FRUIT_ID, RemovedDevilFruitC2SPacket::recieve);
    }

    public static void registerS2CPackets()
    {
        ClientPlayNetworking.registerGlobalReceiver(DF_SYNC_ID, DevilFruitSyncDataS2CPacket::receive);
    }
}
