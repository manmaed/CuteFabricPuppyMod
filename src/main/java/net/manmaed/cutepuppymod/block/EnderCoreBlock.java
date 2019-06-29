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
public class EnderCoreBlock extends Block {
    public EnderCoreBlock(Settings block$Settings_1) {
        super(block$Settings_1);
    }

    @Override
    public boolean activate(BlockState blockState, World worldIn, BlockPos blockPos, PlayerEntity playerIn, Hand hand, BlockHitResult blockHitResult) {
        if(!worldIn.isClient()) {
            ItemStack itemStack = playerIn.getStackInHand(hand);
            if(itemStack.getItem() == CPMItems.endercore) {
                itemStack.decrement(1);
                worldIn.breakBlock(blockPos, true);
                LogHelper.info("Spawn Entity Here");
               /* EntityEnderBossPuppy enderBossPuppy = new EntityEnderBossPuppy(worldIn);
                enderBossPuppy.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), 10, 10);
                worldIn.spawnEntity(new EntityLightningBolt(worldIn, pos.getX(), pos.getY(), pos.getZ(), false));
                worldIn.spawnEntity(enderBossPuppy);*/
                return true;
            }
        }
        return false;
    }
}
