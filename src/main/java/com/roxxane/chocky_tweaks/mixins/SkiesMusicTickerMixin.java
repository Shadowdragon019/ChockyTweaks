package com.roxxane.chocky_tweaks.mixins;

import com.legacy.blue_skies.client.audio.SkiesMusicTicker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SkiesMusicTicker.class)
abstract class SkiesMusicTickerMixin {
    /**
     * @author Roxxane
     * @reason Nuke Blue Skies music
     */
    @Overwrite
    public void tick() {}
}