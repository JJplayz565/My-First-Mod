package jjplayz565.mod1;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class CustomSounds {
    private CustomSounds(){

    }

    
    public static final SoundEvent ITEM_BALL_SQUEAK = registerSound("ball_squeak");

    private static SoundEvent registerSound(String id){
        SoundEvent sound = SoundEvent.of(new Identifier("mod1", id));
        return Registry.register(Registries.SOUND_EVENT, new Identifier("mod1", id), sound);
    }

    public static void initialize(){
        
    }
}
