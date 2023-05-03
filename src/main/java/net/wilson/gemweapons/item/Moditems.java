package net.wilson.gemweapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wilson.gemweapons.GemWeapons;
import net.wilson.gemweapons.item.custom.amethyst.AmethBattleaxeItem;
import net.wilson.gemweapons.item.custom.artifacts.EternityChaliceItem;
import net.wilson.gemweapons.item.custom.artifacts.FireItem;
import net.wilson.gemweapons.item.custom.artifacts.TimeThingItem;
import net.wilson.gemweapons.item.custom.craftables.DesItem;
import net.wilson.gemweapons.item.custom.craftables.RejuvItem;
import net.wilson.gemweapons.item.custom.craftingitems.BlueAuraItem;
import net.wilson.gemweapons.item.custom.craftingitems.PinkAuraItem;
import net.wilson.gemweapons.item.custom.craftingitems.WhiteAuraItem;
import net.wilson.gemweapons.item.custom.craftingitems.YellowAuraItem;

public class Moditems {

    //GEM ITEMS

//Ruby Gem
    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));

    //CRAFTING MATERIALS

//Pink Aura
    public static final Item PINK_AURA = registerItem("pink_aura",
            new PinkAuraItem(new FabricItemSettings().group(ModItemGroup.RUBY)));
//Yellow Aura
    public static final Item YELLOW_AURA = registerItem("yellow_aura",
            new YellowAuraItem(
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//Blue Aura
   public static final Item BLUE_AURA = registerItem("blue_aura",
            new BlueAuraItem(new FabricItemSettings().group(ModItemGroup.RUBY)));
//White Aura
    public static final Item WHITE_AURA = registerItem("white_aura",
           new WhiteAuraItem(new FabricItemSettings().group(ModItemGroup.RUBY)));
//Pink Gem Shards
    public static final Item P_GEMSHARDS = registerItem("p_gemshards",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));
//Glued pink gem shards
    public static final Item GLUED_P_GEMSHARDS = registerItem("glued_p_gemshards",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));
//Glued Yellow Gem Shards
    public static final Item GLUED_Y_GEMSHARDS = registerItem("glued_y_gemshards",
           new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));
//Yellow Gem Shards
    public static final Item Y_GEMSHARDS = registerItem("y_gemshards",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));

    //CRAFTABLE ITEMS

//Rejuvenator
    public static final Item REJUVENATOR = registerItem("rejuvenator",
            new RejuvItem(ToolMaterials.NETHERITE, 7,-3.2f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//Destabalizer
    public static final Item DESTABALIZER = registerItem("destabalizer",
            new DesItem(ToolMaterials.IRON, 9, -3.2f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));

    //RUBY WEAPONS

//Ruby Knife
    public static final Item RUBY_KNIFE = registerItem("ruby_knife",
            new SwordItem(ToolMaterials.IRON, 3, -1f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//Ruby Axe
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ToolMaterials.IRON, 8, -2.5f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//Ruby Gauntlet
    public static final Item RUBY_GAUNTLET = registerItem("ruby_gauntlet",
            new SwordItem(ToolMaterials.IRON, 4, -2.2f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//Ruby Shield
//    public static final Item RUBY_SHIELD = registerItem("ruby_shield",
//            new FabricShieldItem(
//                   new FabricItemSettings().group(ModItemGroup.RUBY)));

    //AMETHYST WEAPONS

//Amethyst Sword
public static final Item AMETHYST_SWORD = registerItem("amethyst_sword",
        new SwordItem(ToolMaterials.IRON, 6, -2.5f,
                new FabricItemSettings().group(ModItemGroup.RUBY)));
//Amethyst Whip
    public static final Item AMETHYST_WHIP = registerItem("amethyst_whip",
            new SwordItem(ToolMaterials.IRON, 5, -2.2f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//Amethyst Battleaxe
public static final Item AMETHYST_BATTLEAXE = registerItem("amethyst_battleaxe",
        new AmethBattleaxeItem(ToolMaterials.IRON, 9, -3.21f,
                new FabricItemSettings().group(ModItemGroup.RUBY)));
//Amethyst Shield
//    public static final Item AMETHYST_SHIELD = registerItem("amethyst_shield",
//            new FabricShieldItem(
//                    new FabricItemSettings().group(ModItemGroup.RUBY)));

    //PEARL WEAPONS

//Pearl Rapier
    public static final Item PEARL_RAPIER = registerItem("pearl_rapier",
            new SwordItem(ToolMaterials.IRON, 6, -2.5f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//Pearl Blade
    public static final Item PEARL_BLADE = registerItem("pearl_blade",
            new SwordItem(ToolMaterials.IRON, 5, -2.2f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//Pearl Spear
        public static final Item PEARL_SPEAR = registerItem("pearl_spear",
            new SwordItem(ToolMaterials.IRON, 9, -3.21f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//Pearl Ribbon Wand
    public static final Item PEARL_RIBBON_WAND = registerItem("pearl_ribbon_wand",
            new SwordItem(ToolMaterials.IRON, 9, -3.21f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));

    //ARTIFACTS

//Fire Salt
public static final Item FIRE_SALT = registerItem("fire_salt",
            new FireItem(
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//HourGlass
public static final Item THE_HOURGLASS = registerItem("the_hourglass",
            new TimeThingItem(
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//Eternity Chalice
public static final Item ETERNITY_CHALICE = registerItem("eternity_chalice",
            new EternityChaliceItem(
                    new FabricItemSettings().group(ModItemGroup.RUBY)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(GemWeapons.MOD_ID, name), item);
    }

    public static void registerModitems() {
        GemWeapons.LOGGER.debug("Registering Mod items for " + GemWeapons.MOD_ID);
    }
}
