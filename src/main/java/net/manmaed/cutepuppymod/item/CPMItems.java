package net.manmaed.cutepuppymod.item;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.libs.LogHelper;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Created by manmaed on 16/06/2019.
 */
public class CPMItems {

    public static Item iconfortab;
    public static ToolMaterial banhammermeterial;

    //The Cores!!!!!!!!!!!!
    public static Item redcore;
    public static Item bluecore;
    public static Item greencore;
    public static Item purplecore;
    public static Item yellowcore;
    public static Item endercore;
    public static Item stevecore;
    public static Item herobrinecore;

    //ToDO: Swords

    public static Item bluesword;
    public static Item purplesword;
    public static Item redsword;
    public static Item yellowsword;
    public static Item greensword;
    public static Item banhammer;

    //Other Things
    public static Item emptysyringe;
    public static Item fullsyringe;

    public static void RegisterItems() {
        LogHelper.info("Hello Form Items Regestery!");

        iconfortab = new Item(new Item.Settings());
        banhammermeterial = new ToolMaterial() {
            @Override
            public int getDurability() {
                return 3000;
            }

            @Override
            public float getMiningSpeed() {
                return 0;
            }

            @Override
            public float getAttackDamage() {
                return 20;
            }

            @Override
            public int getMiningLevel() {
                return 3;
            }
            @Override
            public int getEnchantability() {
                return 0;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return null;
            }
        };

        banhammer = new BanHammer(banhammermeterial, 20, 1, new Item.Settings().group(CutePuppyMod.ITEM_GROUP));

        //iconfortab = new ItemTab(new Item.Settings());

        redcore = new Item(new Item.Settings().group(CutePuppyMod.ITEM_GROUP));
        bluecore = new Item(new Item.Settings().group(CutePuppyMod.ITEM_GROUP));
        greencore = new Item(new Item.Settings().group(CutePuppyMod.ITEM_GROUP));
        purplecore = new Item(new Item.Settings().group(CutePuppyMod.ITEM_GROUP));
        yellowcore = new Item(new Item.Settings().group(CutePuppyMod.ITEM_GROUP));
        endercore = new Item(new Item.Settings().group(CutePuppyMod.ITEM_GROUP));
        stevecore = new Item(new Item.Settings().group(CutePuppyMod.ITEM_GROUP));
        herobrinecore = new Item(new Item.Settings().group(CutePuppyMod.ITEM_GROUP));

        //ToDo: Swords

        //Other Things
        emptysyringe = new EmptySyringe(new Item.Settings().group(CutePuppyMod.ITEM_GROUP));
        fullsyringe = new Item(new Item.Settings().group(CutePuppyMod.ITEM_GROUP).maxCount(1));





        //Registy
        makeItems("iconfortab", iconfortab);
        makeItems("banhammer", banhammer);
        makeItems("redpuppycore", redcore);
        makeItems("bluepuppycore", bluecore);
        makeItems("greenpuppycore", greencore);
        makeItems("purplepuppycore", purplecore);
        makeItems("yellowpuppycore", yellowcore);
        makeItems("endercore", endercore);
        makeItems("stevepuppycore", stevecore);
        makeItems("herobrinepuppycore", herobrinecore);
        makeItems("emptysyringe", emptysyringe);
        makeItems("fullsyringe", fullsyringe);

    }

    public static void makeItems(String itemName, Item item){
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, itemName), item);
    }
}
