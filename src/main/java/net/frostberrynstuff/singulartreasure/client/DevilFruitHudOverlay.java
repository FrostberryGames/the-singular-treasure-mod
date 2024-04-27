package net.frostberrynstuff.singulartreasure.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.frostberrynstuff.singulartreasure.SingularTreasure;
import net.frostberrynstuff.singulartreasure.util.IEntityDataSaver;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Colors;
import net.minecraft.util.Identifier;

public class DevilFruitHudOverlay implements HudRenderCallback {
    private static Identifier DEVILFRUIT_ICON = new Identifier(SingularTreasure.MOD_ID, "textures/item/gomu_gomu_no_mi.png");
    private static String df_name = "Hello!";
    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        int x = 0;
        int y = 0;

        int width = 0;
        int height = 0;

        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null)
        {
            width = client.getWindow().getScaledWidth();
            height = client.getWindow().getScaledHeight();

            x = width;
            y = height;
        }

        RenderSystem.setShader(GameRenderer::getPositionTexProgram);

        drawContext.setShaderColor(1.0f, 1.0f, 1.0f, 0.8f);
        drawContext.drawTexture(DEVILFRUIT_ICON, x - 18, y - 18, -90, 0.0f, 0.0f, 16, 16, 16, 16);
        drawContext.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
    }
}
