package net.manmaed.cutepuppymod.libs;

import net.minecraft.util.Identifier;

/**
 * Created by manmaed on 30/06/2019.
 */
public class PuppyTextures {

    private static final Identifier MODEL_SHEET_LOCATION = new Identifier(Reference.MOD_ID + "textures/entity/");
    private static final Identifier EVENT = new Identifier( MODEL_SHEET_LOCATION + "events/");
    private static final Identifier XMAS = new Identifier(EVENT + "christmas/");
    private static final Identifier BDAY = new Identifier(EVENT + "birthday/");
    private static final Identifier HALLOWEEN = new Identifier(EVENT + "halloween/");

    // Model textures
    public static final Identifier MODEL_GREEN_PUPPY = new Identifier(MODEL_SHEET_LOCATION + "GreenPuppy.png");
    /*public static final ResourceLocation MODEL_RED_PUPPY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "RedPuppy.png");
    public static final ResourceLocation MODEL_BLUE_PUPPY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "BluePuppy.png");
    public static final ResourceLocation MODEL_SIX_PUPPY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "SixPuppy.png");
    public static final ResourceLocation MODEL_STEVE_PUPPY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "StevePuppy.png");
    public static final ResourceLocation MODEL_PURPLE_PUPPY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "PurplePuppy.png");
    public static final ResourceLocation MODEL_HEROBRINE_PUPPY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "HerobrinePuppy.png");
    public static final ResourceLocation MODEL_YELLOW_PUPPY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "YellowPuppy.png");
    public static final ResourceLocation MODEL_ENDER_PUPPY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "EnderPuppy.png");*/
    public static final Identifier MODEL_BOSS_PUPPY = new Identifier(MODEL_SHEET_LOCATION + "bosspuppy.png");


    //evemt textures

    //
   /* public static final ResourceLocation MODEL_PUPPY_HOLDER = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION  + "PuppyHolder.png");
    public static final ResourceLocation MODEL_BANHAMMER = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION  + "SixPuppy.png");

    //christmas
    public static final ResourceLocation MODEL_GREEN_PUPPY_XMAS = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + XMAS  + "GreenPuppy.png");
    public static final ResourceLocation MODEL_RED_PUPPY_XMAS = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + XMAS  + "RedPuppy.png");
    public static final ResourceLocation MODEL_BLUE_PUPPY_XMAS = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + XMAS  + "BluePuppy.png");
    public static final ResourceLocation MODEL_SIX_PUPPY_XMAS = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + XMAS  + "SixPuppy.png");
    public static final ResourceLocation MODEL_STEVE_PUPPY_XMAS = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + XMAS  + "StevePuppy.png");
    public static final ResourceLocation MODEL_PURPLE_PUPPY_XMAS = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + XMAS  + "PurplePuppy.png");
    public static final ResourceLocation MODEL_HEROBRINE_PUPPY_XMAS = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + XMAS  + "HerobrinePuppy.png");
    public static final ResourceLocation MODEL_YELLOW_PUPPY_XMAS = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + XMAS  + "YellowPuppy.png");
    public static final ResourceLocation MODEL_ENDER_PUPPY_XMAS = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + XMAS  + "EnderPuppy.png");

    //Halloween
    public static final ResourceLocation MODEL_GREEN_PUPPY_HALLOWEEN = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + HALLOWEEN  + "GreenPuppy.png");
    public static final ResourceLocation MODEL_RED_PUPPY_HALLOWEEN = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + HALLOWEEN  + "RedPuppy.png");
    public static final ResourceLocation MODEL_BLUE_PUPPY_HALLOWEEN = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + HALLOWEEN  + "BluePuppy.png");
    //public static final ResourceLocation MODEL_SIX_PUPPY_HALLOWEEN = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + HALLOWEEN  + "SixPuppy.png");
    public static final ResourceLocation MODEL_STEVE_PUPPY_HALLOWEEN = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + HALLOWEEN  + "StevePuppy.png");
    public static final ResourceLocation MODEL_PURPLE_PUPPY_HALLOWEEN = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + HALLOWEEN  + "PurplePuppy.png");
    public static final ResourceLocation MODEL_HEROBRINE_PUPPY_HALLOWEEN = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + HALLOWEEN  + "HerobrinePuppy.png");
    public static final ResourceLocation MODEL_YELLOW_PUPPY_HALLOWEEN = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + HALLOWEEN  + "YellowPuppy.png");
    public static final ResourceLocation MODEL_ENDER_PUPPY_HALLOWEEN = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + HALLOWEEN  + "EnderPuppy.png");

    //Birthday
    public static final ResourceLocation MODEL_GREEN_PUPPY_BDAY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + BDAY  + "GreenPuppy.png");
    public static final ResourceLocation MODEL_RED_PUPPY_BDAY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + BDAY  + "RedPuppy.png");
    public static final ResourceLocation MODEL_BLUE_PUPPY_BDAY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + BDAY  + "BluePuppy.png");
    //public static final ResourceLocation MODEL_SIX_PUPPY_BDAY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + BDAY  + "SixPuppy.png");
    public static final ResourceLocation MODEL_STEVE_PUPPY_BDAY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + BDAY  + "StevePuppy.png");
    public static final ResourceLocation MODEL_PURPLE_PUPPY_BDAY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + BDAY  + "PurplePuppy.png");
    public static final ResourceLocation MODEL_HEROBRINE_PUPPY_BDAY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + BDAY  + "HerobrinePuppy.png");
    public static final ResourceLocation MODEL_YELLOW_PUPPY_BDAY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + BDAY  + "YellowPuppy.png");
    public static final ResourceLocation MODEL_ENDER_PUPPY_BDAY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION_EVENT + BDAY  + "EnderPuppy.png");*/

}
