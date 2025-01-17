package io.github.merchantpug.toomanyorigins.registry;

import io.github.merchantpug.toomanyorigins.effect.ChargedStatusEffect;
import io.github.merchantpug.toomanyorigins.effect.EndFireStatusEffect;
import io.github.merchantpug.toomanyorigins.effect.SoulShieldStatusEffect;
import io.github.merchantpug.toomanyorigins.effect.ZombifyingStatusEffect;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.InstantStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import io.github.merchantpug.toomanyorigins.TooManyOrigins;

public class TMOEffects {
    public static final StatusEffect CHARGED = new ChargedStatusEffect().addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "c12451f1-b2a4-47aa-88ef-3f11b1b21e5e", 0.20000000298023224D, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);;
    public static final InstantStatusEffect END_FIRE = new EndFireStatusEffect();
    public static final StatusEffect SOUL_SHIELD = new SoulShieldStatusEffect();
    public static final StatusEffect ZOMBIFYING = new ZombifyingStatusEffect();

    public static void register() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier(TooManyOrigins.MODID, "charged"), CHARGED);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(TooManyOrigins.MODID, "end_fire"), END_FIRE);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(TooManyOrigins.MODID, "soul_shield"), SOUL_SHIELD);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(TooManyOrigins.MODID, "zombifying"), ZOMBIFYING);
    }
}
