package com.roxxane.chocky_tweaks.mixins;

import lykrast.meetyourfight.misc.BossMusic;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BossMusic.class)
abstract class BossMusicMixin extends AbstractTickableSoundInstance {
    private BossMusicMixin(SoundEvent p_235076_, SoundSource p_235077_, RandomSource p_235078_) {
        super(p_235076_, p_235077_, p_235078_);
    }

    @Shadow public abstract void tick();

    @Inject(method = "tick", at = @At("HEAD"))
    void tickInject(CallbackInfo ci) {
        stop();
    }
}
