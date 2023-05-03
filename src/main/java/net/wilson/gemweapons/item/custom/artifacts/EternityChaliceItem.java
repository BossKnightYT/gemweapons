package net.wilson.gemweapons.item.custom.artifacts;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EternityChaliceItem extends Item {

    private static final int COOLDOWN_TICKS = 3000; // 2 and a half minute cooldown

    public EternityChaliceItem(Settings settings) {
        super(settings.maxCount(1));
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.gemweapons.eternity_chalice").formatted(Formatting.GREEN));
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient && user.getItemCooldownManager().isCoolingDown(this)) {
            user.sendMessage((Text) new TranslatableTextContent("item.recall_item.cooldown", COOLDOWN_TICKS / 20), true);
            return TypedActionResult.fail(user.getStackInHand(hand));
        }

        user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 1));
        user.getItemCooldownManager().set(this, COOLDOWN_TICKS);

        return TypedActionResult.success(user.getStackInHand(hand));
    }

    public boolean useOnEntity(ItemStack stack, PlayerEntity user, Entity entity, Hand hand) {
        return use(user.world, user, hand) == TypedActionResult.success(user.getStackInHand(hand));
    }
}
