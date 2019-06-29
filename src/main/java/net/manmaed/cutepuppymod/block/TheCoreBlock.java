package net.manmaed.cutepuppymod.block;

import net.manmaed.cutepuppymod.item.CPMItems;
import net.manmaed.cutepuppymod.libs.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by manmaed on 20/06/2019.
 */
public class TheCoreBlock extends Block {
    public TheCoreBlock(Settings block$Settings_1) {
        super(block$Settings_1);
    }

    @Override
    public boolean activate(BlockState blockState, World worldIn, BlockPos blockPos, PlayerEntity playerIn, Hand hand, BlockHitResult blockHitResult) {
        if(!worldIn.isClient()) {
            ItemStack itemStack = playerIn.getStackInHand(hand);
            if(itemStack.getItem() == CPMItems.fullsyringe) {
                itemStack.decrement(1);
                worldIn.breakBlock(blockPos, true);
                LogHelper.info("Spawn Entity Here");
               /* EntityTheBossPuppy bossPuppy = new EntityTheBossPuppy(worldIn);
                bossPuppy.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), 10, 10);
                worldIn.spawnEntity(new EntityLightningBolt(worldIn, pos.getX(), pos.getY(), pos.getZ(), false));
                worldIn.spawnEntity(bossPuppy);
                for (PlayerEntity player : worldIn.getEntities(PlayerEntity.class, bossPuppy.getEntityBoundingBox().grow(50.0D)))
                {
                    CriteriaTriggers.SUMMONED_ENTITY.trigger(player, bossPuppy);
                }*/
                return true;
            }
        }
        return false;
    }
}
