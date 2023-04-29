package net.wilson.gemweapons.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.wilson.gemweapons.GemWeapons;

public class ModItemGroup {
    public static final ItemGroup RUBY = FabricItemGroupBuilder.build(
            new Identifier(GemWeapons.MOD_ID, "ruby"),()-> new ItemStack(Moditems.RUBY));
}
