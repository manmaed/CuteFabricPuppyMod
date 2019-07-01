package net.manmaed.cutepuppymod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.manmaed.cutepuppymod.block.CPMBlocks;
import net.manmaed.cutepuppymod.entity.CPMEntitys;
import net.manmaed.cutepuppymod.item.CPMItems;
import net.manmaed.cutepuppymod.libs.LogHelper;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

/**
 * Created by manmaed on 16/06/2019.
 */
public class CutePuppyMod implements ModInitializer {

    public static boolean christmas = false;
    public static boolean halloween = false;
    public static boolean bday = false;


    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(Reference.MOD_ID, "itemgroup")).icon(() -> new ItemStack(CPMItems.iconfortab)).build();
    @Override
    public void onInitialize() {
        //Do Things Here right?
        LogHelper.info("hello form CPM-Fabric!");
        CPMItems.RegisterItems();
        CPMBlocks.RegisterBlocks();
        CPMEntitys.RegisterEntitys();
        //CPMEntitys.clientEntitystuff();
    }
}
