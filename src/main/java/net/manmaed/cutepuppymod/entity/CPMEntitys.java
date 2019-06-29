package net.manmaed.cutepuppymod.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.EntityRendererRegistry;
import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.manmaed.cutepuppymod.client.render.entity.GreenPuppyRenderer;
import net.manmaed.cutepuppymod.libs.LogHelper;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.entity.EntityCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Created by manmaed on 21/06/2019.
 */
public class CPMEntitys {

    public static void RegisterEntitys() {
        LogHelper.info("Hello Form Entitys Regestery!");
        /*
        EntityHelper.registerEntity(ResourceLocationHelper.getResourceLocation("greenpuppy"), EntityPuppy.class, "GreenPuppy", id++, 0x3cff00, 0x3cff00);
		EntityHelper.registerEntity(ResourceLocationHelper.getResourceLocation("redpuppy"), EntityRedPuppy.class, "RedPuppy", id++, 0xffb2b2, 0xf80000);
		EntityHelper.registerEntity(ResourceLocationHelper.getResourceLocation("bluepuppy"), EntityBluePuppy.class, "BluePuppy", id++, 0x00ffff, 0x3cafaf);
		EntityHelper.registerEntity(ResourceLocationHelper.getResourceLocation("purplepuppy"), EntityPurplePuppy.class, "PurplePuppy", id++, 0x713cfb, 0x4600ff);
		EntityHelper.registerEntity(ResourceLocationHelper.getResourceLocation("yellowpuppy"), EntityYellowPuppy.class, "YellowPuppy", id++, 0xfcff00, 0x000000);
		//Custom
		//EntityHelper.registerEntity(EntityHazardPuppy.class, "HazardPuppy");
		EntityHelper.registerEntity(ResourceLocationHelper.getResourceLocation("sixpuppy"), EntitySixPuppy.class, "SixPuppy", id++, 0x935a33, 0x633b22);
		EntityHelper.registerEntity(ResourceLocationHelper.getResourceLocation("stevepuppy"), EntityStevePuppy.class, "StevePuppy", id++, 0x004192, 0x220092);
		EntityHelper.registerEntity(ResourceLocationHelper.getResourceLocation("herobrinepuppy"), EntityHerobrinePuppy.class, "HerobrinePuppy", id++, 0xFFFFFF, 0xd4d4d4);
        EntityHelper.registerEntity(ResourceLocationHelper.getResourceLocation("enderpuppy"), EntityEnderPuppy.class, "EnderPuppy", id++, 0x151515, 0x000000);
		EntityHelper.registerEntity(ResourceLocationHelper.getResourceLocation("enderbosspuppy"), EntityEnderBossPuppy.class, "EnderBossPuppy", id++, 0x151515, 0x000000);
		EntityHelper.registerEntity(ResourceLocationHelper.getResourceLocation("thebosspuppy"), EntityTheBossPuppy.class, "TheBossPuppy", id++, 0x151515, 0x000000);
         */
        makeEntitys("greenpuppy", EntityCategory.AMBIENT);

    }

    public static void makeEntitys(String entityName, EntityCategory entityCategory){
        Registry.register(Registry.ENTITY_TYPE, new Identifier(Reference.MOD_ID, entityName), FabricEntityTypeBuilder.create(entityCategory).build());
    }

    @Environment(EnvType.CLIENT)
    public static void clientEntitystuff() {
        EntityRendererRegistry.INSTANCE.register(EntityGreenPuppy.class, (entityRenderDispatcher, context) -> new GreenPuppyRenderer(entityRenderDispatcher));
    }
}
/*
    public static final EntityType<CookieCreeperEntity> COOKIE_CREEPER =
        Registry.register(Registry.ENTITY_TYPE, new Identifier("wiki-entity", "cookie-creeper"), FabricEntityTypeBuilder.create(EntityCategory.AMBIENT, CookieCreeperEntity::new).size(1, 2).build()

        EntityRendererRegistry.INSTANCE.register(CookieCreeperEntity.class, (entityRenderDispatcher, context) -> new CookieCreeperRenderer(entityRenderDispatcher));
        );
 */