package com.code.tama.triggerapi.boti.packets;

import com.code.tama.triggerapi.boti.packets.C2S.PortalChunkRequestPacketC2S;
import com.code.tama.triggerapi.boti.packets.S2C.PortalChunkDataPacketS2C;
import com.code.tama.triggerapi.boti.packets.S2C.PortalSyncPacketS2C;
import com.code.tama.triggerapi.universal.UniversalCommon;
import com.code.tama.tts.server.networking.Networking;
import net.minecraftforge.network.NetworkDirection;

import java.util.Optional;

public class BOTIPackets {
    public static void registerPackets() {
        UniversalCommon.Networking.registerMsg(PortalSyncPacketS2C.class);

        UniversalCommon.Networking.registerMsg(PortalChunkRequestPacketC2S.class);

        UniversalCommon.Networking.registerMsg(PortalChunkDataPacketS2C.class);
    }
}
