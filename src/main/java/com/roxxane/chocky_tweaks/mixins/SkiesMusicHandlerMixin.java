package com.roxxane.chocky_tweaks.mixins;

import com.legacy.blue_skies.client.audio.SkiesMusicHandler;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SkiesMusicHandler.class)
abstract class SkiesMusicHandlerMixin {
    /**
     * @author Roxxane
     * @reason Stop music overriding
     */
    @SubscribeEvent
    @Overwrite(remap = false)
    public static void onMusicControl(PlaySoundEvent event) {}
}