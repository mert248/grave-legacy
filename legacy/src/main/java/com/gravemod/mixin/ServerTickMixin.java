package com.gravemod.mixin;

import com.gravemod.GraveMod;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(MinecraftServer.class)
public class ServerTickMixin {

    @ModifyConstant(
        method = "runServer",
        constant = @Constant(longValue = 50L)
    )
    private long grave$modifyTickTime(long original) {
        MinecraftServer server = (MinecraftServer) (Object) this;
        return server.isSingleplayer() ? GraveMod.TARGET_MSPT : original;
    }
}
