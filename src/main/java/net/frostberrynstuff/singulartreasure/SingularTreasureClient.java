package net.frostberrynstuff.singulartreasure;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.frostberrynstuff.singulartreasure.client.DevilFruitHudOverlay;
import net.frostberrynstuff.singulartreasure.networking.ModPackets;

public class SingularTreasureClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModPackets.registerS2CPackets();

        HudRenderCallback.EVENT.register(new DevilFruitHudOverlay());
    }
}
