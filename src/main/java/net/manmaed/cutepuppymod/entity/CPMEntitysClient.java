package net.manmaed.cutepuppymod.entity;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.EntityRendererRegistry;
import net.manmaed.cutepuppymod.client.render.entity.GreenPuppyRenderer;

/**
 * Created by manmaed on 21/06/2019.
 */
public class CPMEntitysClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(EntityGreenPuppy.class, (entityRenderDispatcher, context) -> new GreenPuppyRenderer(entityRenderDispatcher));
    }
}
