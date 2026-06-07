package com.gravemod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GraveMod implements ModInitializer {
    public static final String MOD_ID = "gravemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final long TARGET_MSPT = 250L;

    @Override
    public void onInitialize() {
        LOGGER.info("[Grave.] Loaded. 4 TPS active in singleplayer.");
    }
}
