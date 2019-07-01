package net.manmaed.cutepuppymod.client.render.entity;

import net.manmaed.cutepuppymod.client.model.ModelRedPuppy;
import net.manmaed.cutepuppymod.entity.EntityEnderBossPuppy;
import net.manmaed.cutepuppymod.libs.PuppyTextures;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

/**
 * Created by manmaed on 30/06/2019.
 */
public class EnderBossPuppyRenderer extends MobEntityRenderer<EntityEnderBossPuppy, ModelRedPuppy<EntityEnderBossPuppy>> {
    public EnderBossPuppyRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ModelRedPuppy<>(), 1);
    }

    @Override
    protected Identifier getTexture(EntityEnderBossPuppy entity) {
        return PuppyTextures.MODEL_BOSS_PUPPY;
    }
}
