package net.manmaed.cutepuppymod.item;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

/**
 * Created by manmaed on 19/06/2019.
 */
public class EmptySyringe extends Item {
    public EmptySyringe(Settings item$Settings_1) {
        super(item$Settings_1);
    }

    @Override
    public TypedActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand hand) {
        if(!worldIn.isClient) {
            ItemStack itemStack = playerIn.getStackInHand(hand);
            itemStack.decrement(1);
            playerIn.inventory.insertStack(new ItemStack(CPMItems.fullsyringe));
            playerIn.damage(DamageSource.GENERIC, 2.0F);
        }
        return super.use(worldIn, playerIn, hand);
    }
}
