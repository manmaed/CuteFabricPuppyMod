package net.manmaed.cutepuppymod.client.render.entity;

import net.manmaed.cutepuppymod.client.model.ModelRedPuppy;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

/**
 * Created by manmaed on 12/07/2019.
 */
public class TestRenderer extends LivingEntityRenderer {


    public TestRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ModelRedPuppy(), 0.5F);
    }

    @Override
    protected Identifier getTexture(Entity entity) {
        //return null;
        return new Identifier(Reference.MOD_ID + "textures/entity/greenpuppy.png");
    }
}
