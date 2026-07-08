package icu.takeneko.nials;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(NIAModEntry.MODID)
public class NIAModEntry {
    public static final String MODID = "noimeautolanguageswitch";
    private static final Logger LOGGER = LogUtils.getLogger();

    public NIAModEntry(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }
}
