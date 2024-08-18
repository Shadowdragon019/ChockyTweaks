package com.roxxane.chocky_tweaks.mixins;

import com.legacy.blue_skies.client.audio.SkiesMusicTicker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SkiesMusicTicker.class)
public class SkiesMusicTickerMixin {
    /**
     * @author Roxxane
     * @reason Stop ambient biome music from playing
     */
    @Overwrite(remap = false)
    public void playMusic(SkiesMusicTicker.TrackType requestedMusicType) {}

}
