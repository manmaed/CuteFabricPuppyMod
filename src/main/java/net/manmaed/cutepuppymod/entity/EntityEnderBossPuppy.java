package net.manmaed.cutepuppymod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

/**
 * Created by manmaed on 30/06/2019.
 */
public class EntityEnderBossPuppy extends MobEntity {
    private final ServerBossBar bossBar;

    protected EntityEnderBossPuppy(EntityType<? extends MobEntity> entityType_1, World world_1) {
        super(entityType_1, world_1);
        this.bossBar = (ServerBossBar)(new ServerBossBar(this.getDisplayName(), BossBar.Color.PURPLE, BossBar.Style.PROGRESS)).setDarkenSky(false);
        this.setHealth(this.getMaxBreath());
    }
}
