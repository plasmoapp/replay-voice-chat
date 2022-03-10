package de.maxhenkel.replayvoicechat.net;

import de.maxhenkel.replayvoicechat.ReplayVoicechat;
import net.minecraft.resources.ResourceLocation;

import java.util.UUID;

public class EntitySoundPacket extends AbstractSoundPacket<EntitySoundPacket> {

    public static ResourceLocation ID = new ResourceLocation(ReplayVoicechat.MOD_ID, "entity_sound");

    public EntitySoundPacket(UUID id, short[] rawAudio) {
        super(id, rawAudio);
    }

    @Override
    public ResourceLocation getIdentifier() {
        return ID;
    }

}
