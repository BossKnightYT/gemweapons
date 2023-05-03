package net.wilson.gemweapons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wilson.gemweapons.GemWeapons;
import net.wilson.gemweapons.item.ModItemGroup;


public class ModBlocks {
    public static final Block WARP_PAD = registerBlock("warp_pad",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool()), ModItemGroup.RUBY);

    private  static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return  Registry.register(Registry.BLOCK, new Identifier(GemWeapons.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(GemWeapons.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        GemWeapons.LOGGER.debug("Bringing in the world " + GemWeapons.MOD_ID);
    }
}
