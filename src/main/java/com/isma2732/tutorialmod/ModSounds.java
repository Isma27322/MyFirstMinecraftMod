package com.isma2732.tutorialmod;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.level.gameevent.GameEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    // The register for the sound events themselves
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(Registries.SOUND_EVENT, tutorialmod.MODID);

    // The NEW register for the jukebox song data
    public static final DeferredRegister<JukeboxSong> JUKEBOX_SONGS =
            DeferredRegister.create(Registries.JUKEBOX_SONG, tutorialmod.MODID);


    // 1. We register the SoundEvent like before
    public static final DeferredHolder<SoundEvent, SoundEvent> AINT_THAT_SOME_SOUND_EVENT =
            SOUND_EVENTS.register("music_disk.aint_that_some",
                    () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(tutorialmod.MODID, "music_disk.aint_that_some")));

    // 2. We create the JukeboxSong with the CORRECT 4 arguments
    public static final DeferredHolder<JukeboxSong, JukeboxSong> AINT_THAT_SOME_JUKEBOX_SONG =
            JUKEBOX_SONGS.register("aint_that_some", () -> new JukeboxSong(
                    AINT_THAT_SOME_SOUND_EVENT,
                    Component.translatable("item.tutorialmod.music_disk_aint_that_some.desc"),
                    158.0f, // Length of the song in SECONDS
                    15      // Comparator output
                    // The 5th argument has been removed
            ));
}