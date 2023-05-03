package net.wilson.gemweapons.item.custom.artifacts;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class FireItem extends Item {
    public FireItem(Item.Settings settings) {
        super(settings.maxCount(16));

    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.gemweapons.fire_salt").formatted(Formatting.RED));
        super.appendTooltip(stack, world, tooltip, context);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
        if (!world.isClient) {
            SnowballEntity snowballEntity = new SnowballEntity(world, user);
            snowballEntity.setItem(itemStack);
            snowballEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0f, 1.5f, 1.0f);
            world.spawnEntity(snowballEntity);
    }
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }
        return TypedActionResult.success(itemStack, world.isClient());
    }

    public static class SnowballEntity extends net.minecraft.entity.projectile.thrown.SnowballEntity {
        public SnowballEntity(EntityType<? extends SnowballEntity> entityType, World world) {
            super(entityType, world);
        }

        public SnowballEntity(World world, LivingEntity owner) {
            super(world, owner);
        }

        public SnowballEntity(World world, double x, double y, double z) {
            super(world, x, y, z);
        }

        @Override
        protected void onCollision(HitResult hitResult) {
            super.onCollision(hitResult);
            if (!this.world.isClient) {
                if (hitResult.getType() == HitResult.Type.ENTITY) {
                    Entity entity = ((EntityHitResult)hitResult).getEntity();
                    entity.setFireTicks(120); // Set entity on fire for 6 second
                    if (entity instanceof LivingEntity) {
                        entity.damage(DamageSource.thrownProjectile(this, this.getOwner()), 1f);
                    }
                    // Spawn flame particles
                    for (int i = 0; i < 15; ++i) {
                        this.world.addParticle(ParticleTypes.FLAME, entity.getX(), entity.getY(), entity.getZ(), 1.0D, 1.0D, 1.0D);
                    }

                }
                this.world.playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.NEUTRAL, 0.5f, 2.6f + (this.world.random.nextFloat() - this.world.random.nextFloat()) * 0.8f);
                this.remove();
            }
        }

        private void remove() {
        }
    }

    private final Identifier heldTexture = new Identifier("gemweapons", "textures/item/fire_salt.png");
    private final Identifier thrownTexture = new Identifier("gemweapons", "textures/item/fire_salt_thrown.png");
}
