package net.manmaed.cutepuppymod.entity;

import net.manmaed.cutepuppymod.item.CPMItems;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

/**
 * Created by manmaed on 21/06/2019.
 */
public class EntityGreenPuppy extends AnimalEntity {
    public EntityGreenPuppy(World world) {
        super(CPMEntitys.greenpuppy, world);
        this.targetSelector.add(0, new SwimGoal(this));
        this.targetSelector.add(1, new EscapeDangerGoal(this, 1.0D));
        this.targetSelector.add(2, new AnimalMateGoal(this, 1.25D));
        this.targetSelector.add(3, new TemptGoal(this, 1.25D, Ingredient.ofItems(new ItemConvertible[]{Items.WHEAT_SEEDS}), false));
        this.targetSelector.add(4, new FollowParentGoal(this, 1.25D));
        this.targetSelector.add(5, new WanderAroundFarGoal(this, 1.0D));
        this.targetSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.targetSelector.add(7, new LookAroundGoal(this));
    }

    protected void initAttributes()
    {
        super.initAttributes();
        this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(5.0D);
        this.getAttributeInstance(EntityAttributes.MOVEMENT_SPEED).setBaseValue(0.35D);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return this.random.nextInt(3) == 0 ? SoundEvents.ENTITY_WOLF_AMBIENT : SoundEvents.ENTITY_WOLF_PANT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource_1) {
        return SoundEvents.ENTITY_WOLF_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_WOLF_DEATH;
    }

    @Override
    protected void dropLoot(DamageSource damageSource_1, boolean boolean_1) {
        this.dropItem(new ItemConvertible() {
            @Override
            public Item asItem() {
                return CPMItems.greencore;
            }
        }, 1);
    }

    @Override
    public PassiveEntity createChild(PassiveEntity passiveEntity) {
        return null;
    }
}
