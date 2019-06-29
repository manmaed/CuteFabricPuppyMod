package net.manmaed.cutepuppymod.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.libs.LogHelper;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Created by manmaed on 20/06/2019.
 */
public class CPMBlocks {

    public static Block endercoreblock; //Neds own class
    public static Block bluecoreblock;
    public static Block greencoreblock;
    public static Block purplecoreblock;
    public static Block redcoreblock;
    public static Block yellowcoreblock;
    public static Block herobrinecoreblock;
    public static Block stevecoreblock;
    public static Block thecoreblock; // Needs Own Class

    public static void RegisterBlocks() {
        LogHelper.info("Hello Form Blocks Regestery!");
        bluecoreblock = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0F).resistance(5.0F).breakByTool(FabricToolTags.PICKAXES, 2).build());
        greencoreblock = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0F).resistance(5.0F).breakByTool(FabricToolTags.PICKAXES, 2).build());
        purplecoreblock = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0F).resistance(5.0F).breakByTool(FabricToolTags.PICKAXES, 2).build());
        redcoreblock = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0F).resistance(5.0F).breakByTool(FabricToolTags.PICKAXES, 2).build());
        yellowcoreblock = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0F).resistance(5.0F).breakByTool(FabricToolTags.PICKAXES, 2).build());
        herobrinecoreblock = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0F).resistance(5.0F).breakByTool(FabricToolTags.PICKAXES, 2).build());
        stevecoreblock = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0F).resistance(5.0F).breakByTool(FabricToolTags.PICKAXES, 2).build());
        endercoreblock = new EnderCoreBlock(FabricBlockSettings.of(Material.STONE).hardness(3.0F).resistance(5.0F).breakByTool(FabricToolTags.PICKAXES, 2).build());
        thecoreblock = new TheCoreBlock(FabricBlockSettings.of(Material.STONE).hardness(3.0F).resistance(5.0F).breakByTool(FabricToolTags.PICKAXES, 2).build());

        makeBlocks("bluecoreblock", bluecoreblock);
        makeBlocks("greencoreblock", greencoreblock);
        makeBlocks("purplecoreblock", purplecoreblock);
        makeBlocks("redcoreblock", redcoreblock);
        makeBlocks("yellowcoreblock", yellowcoreblock);
        makeBlocks("herobrinecoreblock", herobrinecoreblock);
        makeBlocks("stevecoreblock", stevecoreblock);
        makeBlocks("endercoreblock", endercoreblock);
        makeBlocks("thecoreblock", thecoreblock);
    }

    public static void makeBlocks(String blockName, Block block){
        Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, blockName), block);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, blockName), new BlockItem(block, new Item.Settings().group(CutePuppyMod.ITEM_GROUP)));
    }
}
