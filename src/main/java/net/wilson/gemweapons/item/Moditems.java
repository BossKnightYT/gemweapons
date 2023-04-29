package net.wilson.gemweapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wilson.gemweapons.GemWeapons;

public class Moditems {

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));
    public static final Item PINK_AURA = registerItem("pink_aura",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));
    public static final Item WEAPON = registerItem("weapon",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY).fireproof()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(GemWeapons.MOD_ID, name), item);
    }

    public static void registerModitems() {
        GemWeapons.LOGGER.debug("Registering Mod items for " + GemWeapons.MOD_ID);
    }
}
