package net.manmaed.cutepuppymod.client.render.entity;

import net.manmaed.cutepuppymod.client.model.ModelRedPuppy;
import net.manmaed.cutepuppymod.entity.EntityGreenPuppy;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

/**
 * Created by manmaed on 21/06/2019.
 */
public class GreenPuppyRenderer extends MobEntityRenderer<EntityGreenPuppy, ModelRedPuppy<EntityGreenPuppy>> {

    public GreenPuppyRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ModelRedPuppy<>(), 1);
        //super(entityRenderDispatcher_1, new CreeperEntityModel<>(), 1);
    }

    @Override
    protected Identifier getTexture(EntityGreenPuppy entityGreenPuppy) {
        return new Identifier(Reference.MOD_ID + ";textures/entity/greenpuppy.png");
    }
}
