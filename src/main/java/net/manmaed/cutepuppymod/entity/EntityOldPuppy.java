package net.manmaed.cutepuppymod.entity;

import net.minecraft.world.World;

public class EntityOldPuppy
{
	public EntityOldPuppy(World par1World)
	{
       /* super(par1World);
        this.setSize(0.5F, 0.5F);
        this.tasks.addTask(0, new EntityAISwimming(this));
        //this.tasks.addTask(0, new );
        this.tasks.addTask(1, new EntityAIPanic(this, 1.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.WHEAT_SEEDS, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
	}

   *//* @Override
    public int getMaxSpawnedInChunk() {
        return 2;
    }*//*

	
	public boolean isAIEnable()
	{
		return true;
	}
	
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.35D);
    }
    
    public EntityPuppy spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityPuppy(this.world);
    }

    protected SoundEvent getAmbientSound()
    {

        return this.rand.nextInt(3) == 0 ? SoundEvents.ENTITY_WOLF_AMBIENT : SoundEvents.ENTITY_WOLF_PANT;
    }
    *//**
     * Returns the sound this mob makes when it is hurt.
     *//*
    protected SoundEvent getHurtSound()
    {

        return SoundEvents.ENTITY_WOLF_HURT;
    }

    *//**
     * Returns the sound this mob makes on death.
     *//*
    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_WOLF_DEATH;
    }
    
    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return this.spawnBabyAnimal(par1EntityAgeable);
    }

    protected void dropFewItems(boolean par1, int par2)
    {
        if(this.rand.nextInt(8) == 0)
        {
            this.dropItem(CPMItems.greencore, 1);
        }
    }

    @Override
    public PassiveEntity createChild(PassiveEntity passiveEntity) {
        return null;*/
    }
}
