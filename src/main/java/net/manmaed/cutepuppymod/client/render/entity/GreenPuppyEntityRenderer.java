package net.manmaed.cutepuppymod.client.render.entity;

import net.manmaed.cutepuppymod.client.model.ModelRedPuppy;
import net.manmaed.cutepuppymod.entity.EntityGreenPuppy;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

/**
 * Created by manmaed on 06/08/2019.
 */
public class GreenPuppyEntityRenderer extends MobEntityRenderer<EntityGreenPuppy, ModelRedPuppy<EntityGreenPuppy>> {
    public GreenPuppyEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ModelRedPuppy<>(), 0.25F);
    }

    private static final Identifier skin = new Identifier(Reference.MOD_ID, "textures/entity/greenpuppy.png");
    @Override
    protected Identifier getTexture(EntityGreenPuppy entityGreenPuppy) {
        return skin;
    }
}
