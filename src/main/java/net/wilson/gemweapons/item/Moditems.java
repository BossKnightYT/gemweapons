package net.wilson.gemweapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wilson.gemweapons.GemWeapons;
import net.wilson.gemweapons.item.custom.AmethBattleaxeItem;
import net.wilson.gemweapons.item.custom.AuraItem;
import net.wilson.gemweapons.item.custom.DesItem;
import net.wilson.gemweapons.item.custom.RejuvItem;

public class Moditems {
//Ruby Gem
    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));
//Pink Aura
    public static final Item PINK_AURA = registerItem("pink_aura",
            new AuraItem(new FabricItemSettings().group(ModItemGroup.RUBY)));
//Yellow Aura
    public static final Item YELLOW_AURA = registerItem("yellow_aura",
            new AuraItem(
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//Blue Aura
   public static final Item BLUE_AURA = registerItem("blue_aura",
            new AuraItem(new FabricItemSettings().group(ModItemGroup.RUBY)));
//White Aura
    public static final Item WHITE_AURA = registerItem("white_aura",
           new AuraItem(new FabricItemSettings().group(ModItemGroup.RUBY)));
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
//amethyst battleaxe
    public static final Item AMETHYST_BATTLEAXE = registerItem("amethyst_battleaxe",
            new AmethBattleaxeItem(ToolMaterials.IRON, 9, -3.21f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//Rejuvenator
    public static final Item REJUVENATOR = registerItem("rejuvenator",
            new RejuvItem(ToolMaterials.NETHERITE, 7,-3.2f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));
//Destabalizer
    public static final Item DESTABALIZER = registerItem("destabalizer",
            new DesItem(ToolMaterials.IRON, 9, -3.2f,
                    new FabricItemSettings().group(ModItemGroup.RUBY)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(GemWeapons.MOD_ID, name), item);
    }

    public static void registerModitems() {
        GemWeapons.LOGGER.debug("Registering Mod items for " + GemWeapons.MOD_ID);
    }
}
